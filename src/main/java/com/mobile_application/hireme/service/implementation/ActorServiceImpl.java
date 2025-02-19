package com.mobile_application.hireme.service.implementation;

import com.mobile_application.hireme.dto.requestDto.ActorRequestDto;
import com.mobile_application.hireme.entity.Actor;
import com.mobile_application.hireme.entity.User;
import com.mobile_application.hireme.repo.ActorRepo;
import com.mobile_application.hireme.repo.UserRepo;
import com.mobile_application.hireme.service.ActorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ActorServiceImpl implements ActorService {

    private final ActorRepo actorRepo;
    private final UserRepo userRepo;

    @Override
    public void createNewActor(ActorRequestDto requestDto) {

        User user = User.builder()
                .email(requestDto.getEmail())
                .password(requestDto.getPassword())
                .build();

        Actor actor = Actor.builder()
                .id(UUID.randomUUID().toString())
                .fname(requestDto.getFname())
                .lname(requestDto.getLname())
                .age(requestDto.getAge())
                .height(requestDto.getHeight())
                .weight(requestDto.getWeight())
                .gender(requestDto.getGender())
                .bio(requestDto.getBio())
                .tanColor(requestDto.getTanColor())
                .address(requestDto.getAddress())
                .phone(requestDto.getPhone())
                .user(user)
                .build();
        userRepo.save(user);
        actorRepo.save(actor);
    }


}
