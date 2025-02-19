package com.mobile_application.hireme.service;


import com.mobile_application.hireme.dto.requestDto.ActorRequestDto;
import com.mobile_application.hireme.dto.responsetDto.ActorResponseDto;
import com.mobile_application.hireme.entity.Actor;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ActorService {

    public void createNewActor(ActorRequestDto dto);

//    public ActorResponseDto getActor(String id);
//
//    public void updateActor(String id,ActorRequestDto dto);
//
//    public void deleteActor(String id);
//
//    public List<ActorResponseDto> getAllActors(String text, int page, int pageSize);

}
