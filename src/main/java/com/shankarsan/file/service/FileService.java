/**
 * 
 */
package com.shankarsan.file.service;

import org.springframework.web.multipart.MultipartFile;

import com.shankarsan.file.dto.FileUploadOutputDTO;

/**
 * @author SHANKARSAN
 *
 */
public interface FileService {

	public FileUploadOutputDTO uploadFile(MultipartFile multipartFile);
}
