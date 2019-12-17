/**
 * 
 */
package com.shankarsan.file.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.shankarsan.file.dto.FileUploadOutputDTO;
import com.shankarsan.file.service.FileService;

/**
 * @author SHANKARSAN
 *
 */
@RestController
@CrossOrigin
@RequestMapping("/v1/")
public class FileController {
	
	@Autowired private FileService fileService;

	@PostMapping(value = "file", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public FileUploadOutputDTO uploadFile(@RequestParam("uploadfile") MultipartFile multipartFile) {
		return fileService.uploadFile(multipartFile); 
	}
}
