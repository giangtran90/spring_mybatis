package com.hg.mybatis.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * ユーザー情報 検索用リクエストデータ
 */
@Data
public class UserSearchRequest implements Serializable {

  /**
	 * 
	 */
	private static final long serialVersionUID = 9007984703842294397L;
/**
   * ユーザーID
   */
  private Long id;
}