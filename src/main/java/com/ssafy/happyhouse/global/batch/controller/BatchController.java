package com.ssafy.happyhouse.global.batch.controller;

import com.ssafy.happyhouse.global.batch.service.BatchService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class BatchController {


    private static final Logger log = LoggerFactory.getLogger(BatchController.class);
    private final BatchService batchService;

    // 매일 오전 7시에 실행
    @Scheduled(cron = "0 0 7 * * ?")
    public void getRelatedNews() throws Exception {
        batchService.crawlingNews();
        log.info("============================ 뉴스 크롤링 완료");
    }



}