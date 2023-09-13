package com.hg.mybatis.repository;

import org.apache.ibatis.annotations.Mapper;

import com.hg.mybatis.dto.UserSearchRequest;
import com.hg.mybatis.entity.User;

/**
 * ユーザー情報 Mapper
 */
@Mapper
public interface UserMapper {
	/**
	 * ユーザー情報検索
	 * 
	 * @param user 検索用リクエストデータ
	 * @return ユーザー情報
	 */
	User search(UserSearchRequest user);
}