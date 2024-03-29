/*
 *      Copyright (c) 2018-2028, Chill Zhuang All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 *  Redistributions in binary form must reproduce the above copyright
 *  notice, this list of conditions and the following disclaimer in the
 *  documentation and/or other materials provided with the distribution.
 *  Neither the name of the dreamlu.net developer nor the names of its
 *  contributors may be used to endorse or promote products derived from
 *  this software without specific prior written permission.
 *  Author: Chill 庄骞 (smallchill@163.com)
 */
package com.cicada.openapi.isv.vo;

import com.cicada.openapi.isv.entity.IsvApp;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * isv和client关系表，原始设计中client是由用户创建的，开放平台中扩展为isv可以创建app，而app即client，app创建成功以后会在
该表中保存对应关系视图实体类
 *
 * @author BladeX
 * @since 2019-08-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "IsvAppVO对象", description = "isv和client关系表，原始设计中client是由用户创建的，开放平台中扩展为isv可以创建app，而app即client，app创建成功以后会在 该表中保存对应关系")
public class IsvAppVO extends IsvApp {
	private static final long serialVersionUID = 1L;

}
