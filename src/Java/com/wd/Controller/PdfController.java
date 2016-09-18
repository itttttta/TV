package com.wd.Controller;

import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.impl.LogKitLogger;
import org.omg.CORBA.portable.InputStream;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by wangda on 16/9/13.
 */
@Controller
public class PdfController {
    @RequestMapping(value = "/files/{file_name}", method = RequestMethod.GET)
    @ResponseBody
    public FileSystemResource getFile(@PathVariable("file_name") String fileName) {
        File file = new File("/Users/wangda/Downloads/Reader-master/Resources/Reader.pdf");
        return new FileSystemResource(file);
    }

}
