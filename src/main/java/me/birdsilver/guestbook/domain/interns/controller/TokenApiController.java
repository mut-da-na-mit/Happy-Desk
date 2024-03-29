package me.birdsilver.guestbook.domain.interns.controller;

import lombok.RequiredArgsConstructor;
import me.birdsilver.guestbook.domain.interns.dto.CreateAccessTokenRequest;
import me.birdsilver.guestbook.domain.interns.dto.CreateAccessTokenResponse;
import me.birdsilver.guestbook.domain.interns.service.MemberService;
import me.birdsilver.guestbook.domain.interns.service.TokenService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class TokenApiController {

    private final TokenService tokenService;
    private final MemberService memberService;

    @PostMapping("/api/token")
    public ResponseEntity<CreateAccessTokenResponse> createNewAccessToken(@RequestBody CreateAccessTokenRequest request) {
        String newAccessToken = tokenService.createNewAccessToken(request.getRefreshToken());

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new CreateAccessTokenResponse(newAccessToken));
    }

//    @PostMapping("/api/userInfo")
//    public ResponseEntity<User> getUserInfo(Principal principal) {
//
//            String email = principal.getName();
//            User user = memberService.findByEmail(email);
//
//        return ResponseEntity.status(HttpStatus.OK)
//                .body(user);
//    }
}
