package me.birdsilver.guestbook.domain.interns.dto;

import lombok.*;
import me.birdsilver.guestbook.domain.interns.entity.Intern;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberLoginResponseDto {

    private Long id;
    private String name;
    private String avatarUrl;

    public static MemberLoginResponseDto of(Intern intern) {
        return MemberLoginResponseDto.builder()
                .id(intern.getId())
                .name(intern.getName())
                .avatarUrl(intern.getAvatarUrl())
                .build();
    }
}
