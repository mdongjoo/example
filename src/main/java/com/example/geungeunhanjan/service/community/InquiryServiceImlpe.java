package com.example.geungeunhanjan.service.community;

import com.example.geungeunhanjan.domain.dto.community.InquiryDTO;
import com.example.geungeunhanjan.mapper.community.InquiryMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InquiryServiceImlpe implements InquiryService {

    //주입
    private  final InquiryMapper inquiryMapper;

    public InquiryServiceImlpe(InquiryMapper inquiryMapper) {this.inquiryMapper = inquiryMapper;}



    // 문의 전부 다 뿌려주게 하기
    @Override
    public List<InquiryDTO> selectInquiryAll() {
        return inquiryMapper.selectInquiryAll();
    }

    // 각 id별 문의
    @Override
    public InquiryDTO selectInquiryDetail(Long inquiryId) {
        return inquiryMapper.selectInquiryDetail(inquiryId);
    }
}