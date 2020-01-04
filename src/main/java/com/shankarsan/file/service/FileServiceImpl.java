package com.shankarsan.file.service;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.shankarsan.file.dto.FileUploadOutputDTO;

@Service
public class FileServiceImpl implements FileService {
	
	@Autowired private Environment environment;

	@Override
	public FileUploadOutputDTO uploadFile(MultipartFile multipartFile) {
		FileUploadOutputDTO fileUploadOutputDTO = null;
		String filePath, fileName;
		
		try {
			filePath = environment.getProperty("upload.location");
			fileName = multipartFile.getOriginalFilename();
			if(null != multipartFile && StringUtils.isNoneEmpty(filePath, fileName)) {
				Files.copy(multipartFile.getInputStream(), Paths.get(filePath + fileName), StandardCopyOption.REPLACE_EXISTING);
				fileUploadOutputDTO = new FileUploadOutputDTO("File uploaded successfully!");
			}
		} catch (Exception e) {
			e.printStackTrace();
			fileUploadOutputDTO = new FileUploadOutputDTO("Something went wrong!");
		} finally {
			System.gc();
		}
		return fileUploadOutputDTO;
	}

}
