/**
 * 
 */
package com.shankarsan.file.dto;

/**
 * @author SHANKARSAN
 *
 */
public class FileUploadOutputDTO {
	
	private String status;

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 */
	public FileUploadOutputDTO(String status) {
		super();
		this.status = status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
