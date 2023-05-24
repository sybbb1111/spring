package com.green.board7.fileupload;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/fileupload")
public class FileuploadController {
    private final Logger LOGGER;
    private FileuploadService service;

    @Autowired
    public FileuploadController(FileuploadService service){
        LOGGER = LoggerFactory.getLogger(FileuploadController.class);
        this.service = service;
    }

    @PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.MULTIPART_FORM_DATA_VALUE})
    public void fileupload(@RequestPart MultipartFile img){
        LOGGER.info("imgFileName" + img.getName());
    }
}
//언니 내가 좋아하는거 알지 언니 자리 키보드 뭔가 촥촥감겨