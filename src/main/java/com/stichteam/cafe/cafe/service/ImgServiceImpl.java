package com.stichteam.cafe.cafe.service;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import java.util.ArrayList;

import org.springframework.stereotype.Service;
import com.stichteam.cafe.cafe.dto.ImgDTO;
import jakarta.transaction.Transactional;

@Transactional
@Service
public abstract class ImgServiceImpl implements ImgService {

    private final String IMAGE_DIR = "src/main/resources/static/images";

    @Override
    public List<ImgDTO> getAllImages() {
        File dir = new File(IMAGE_DIR);
        File[] files = dir.listFiles();
        List<ImgDTO> imageList = new ArrayList<>();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    try {
                        BufferedImage image = ImageIO.read(file); // 이미지 읽음 (옵션)

                        ImgDTO dto = new ImgDTO();
                        dto.setTitle(file.getName());
                        dto.setFilePath("/images/" + file.getName()); // 실제 정적 리소스 경로
                        
                        // 만약 width, height 사용하고 싶다면:
                        // dto.setWidth(image.getWidth());
                        // dto.setHeight(image.getHeight());

                        imageList.add(dto);

                    } catch (IOException e) {
                        e.printStackTrace(); // 로그 출력
                    }
                }
            }
     
		return imageList;
        }
		return null;
    }
	
}
