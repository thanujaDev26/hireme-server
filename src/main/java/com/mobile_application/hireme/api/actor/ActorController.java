package com.mobile_application.hireme.api.actor;


import com.mobile_application.hireme.dto.requestDto.ActorRequestDto;
import com.mobile_application.hireme.service.ActorService;
import com.mobile_application.hireme.utils.StandardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/actors")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ActorController {

    private final ActorService actorService;

    @PostMapping
    public ResponseEntity<StandardResponse> createActor(@RequestBody ActorRequestDto actorRequestDto) {
        actorService.createNewActor(actorRequestDto);

        return new ResponseEntity<>(
                new StandardResponse(201, "Successfully Created a Actor", actorRequestDto),
                HttpStatus.CREATED
        );
    }



}
