package com.example.ShopDemo.Hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class FileController {
    @GetMapping("/upload-file")
    public String upload() {
        return "uploadFile";
    }

    @PostMapping("/upload-file")
    public String upload(@RequestParam(name = "file") MultipartFile file) {
        System.out.println(file.getOriginalFilename());
        return "uploadFile";
    }
//@RequestMapping(value = "download", method = RequestMethod.POST)
//    public String downloadFile(HttpServletRequest request, @RequestParam(name = "file") java.util.List<MultipartFile> files) {
////    download file tren may
//        for (MultipartFile file : files) {
//            try {
//                File newFile = new File("Downloads" + file.getOriginalFilename());
//                FileOutputStream fileOutputStream;
//                fileOutputStream = new FileOutputStream(newFile);
//                fileOutputStream.write(file.getBytes());
//                fileOutputStream.close();
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        request.setAttribute("file", files);
//        return "viewFile";
//
//    }
//
//    @RequestMapping(name = "/download-file", method = RequestMethod.GET)
//    public void download(HttpServletRequest request, HttpServletResponse response) {
//        String dataDirectory = "Downloads";
//        Path file = Paths.get(dataDirectory, "1.jpg");
//        if(Files.exists(file))
//        {
//            response.setContentType("image/jpg");
//            response.addHeader("Content-Disposition", "attachment; filename=anh.jpg");
//        }
//        try{
//            Files.copy(file, response.getOutputStream());
//        }
//        catch (IOException ex)
//        {
//            ex.printStackTrace();
//        }
//    }
}
