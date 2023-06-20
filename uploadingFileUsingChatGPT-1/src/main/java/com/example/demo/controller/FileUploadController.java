package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.FileDto;

@Controller
public class FileUploadController {

	@GetMapping("/upload")
	public String showUploadPage() {
		return "upload";
	}

	@PostMapping("/check")
	public String checkData() {
		// Process the uploaded file and check the data
		// Add the data or validation results to the model and return "check" view
		return "check";
	}

	@PostMapping("/confirm")
	public String confirmUpload() {
		// Perform any necessary actions for successful file upload
		return "success";
	}
	
//    @GetMapping("/upload1")
//    public String showUploadPage(Model model) {
//        model.addAttribute("fileDto", new FileDto());
//        return "upload1";
//    }
//
//    @PostMapping("/check")
//    public String checkData(@ModelAttribute("fileDto") FileDto fileDto, Model model) {
//        // Process the uploaded file and check the data
//        // Add the data or validation results to the model and return "check" view
//        model.addAttribute("fileDto", fileDto);
//        return "check1";
//    }
//
//    @PostMapping("/confirm")
//    public String confirmUpload(@ModelAttribute("fileDto") FileDto fileDto) {
//        // Perform any necessary actions for successful file upload
//        // Access the file details using fileDto.getFileName() and fileDto.getFileId()
//        return "success1";
//    }
}
