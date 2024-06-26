package com.ssafy.happyhouse.mapper;

import com.ssafy.happyhouse.entity.member.Member;
import com.ssafy.happyhouse.global.token.JwtTokenDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Mapper
public interface MemberMapper {

    List<Member> findAll();

    Member findById(Long id);

    Member findByUsernameAndPassword(Map<String, String> map);

    List<Member> findExpertList();

    void join(Member member);

    void oauthJoin(Member member);

    void update(Map<String, Object> map);

    void delete(Long id);

    Optional<Member> findByUsername(String username);

    Optional<Member> findByEmail(String email);

    Member findMemberByRefreshToken(String refreshToken);

    void updateToken(Map<String, Object> map);

    void expireToken(Map<String, Object> map);
}

