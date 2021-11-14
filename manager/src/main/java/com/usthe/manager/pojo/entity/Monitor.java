package com.usthe.manager.pojo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

import static io.swagger.annotations.ApiModelProperty.AccessMode.READ_ONLY;
import static io.swagger.annotations.ApiModelProperty.AccessMode.READ_WRITE;

/**
 * 监控实体
 * @author tomsun28
 * @date 2021/11/14 9:53
 */
@Entity
@Table(name = "monitor")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "监控实体")
public class Monitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "监控ID", example = "87584674384", accessMode = READ_ONLY, position = 0)
    private Long id;

    /**
     * 监控对应下发的任务ID
     */
    @ApiModelProperty(value = "任务ID", example = "43243543543", accessMode = READ_ONLY, position = 1)
    private Long jobId;

    /**
     * 监控的名称
     */
    @ApiModelProperty(value = "监控名称", example = "Api-bing.com", accessMode = READ_WRITE, position = 2)
    private String name;

    /**
     * 监控的类型:linux,mysql,jvm...
     */
    @ApiModelProperty(value = "监控类型", example = "api", accessMode = READ_WRITE, position = 3)
    private String app;

    /**
     * 监控的对端host:ipv4,ipv6,域名
     */
    @ApiModelProperty(value = "监控的对端host", example = "192.167.25.11", accessMode = READ_WRITE, position = 4)
    private String host;

    /**
     * 监控的采集间隔时间,单位秒
     */
    @ApiModelProperty(value = "监控的采集间隔时间,单位秒", example = "600", accessMode = READ_WRITE, position = 5)
    private Integer intervals;

    /**
     * 监控状态 0:未监控,1:可用,2:不可用,3:不可达,4:挂起
     */
    @ApiModelProperty(value = "监控状态 0:未监控,1:可用,2:不可用,3:不可达,4:挂起", example = "1", accessMode = READ_WRITE, position = 6)
    private byte status;

    /**
     * 监控备注描述
     */
    @ApiModelProperty(value = "监控备注描述", example = "对搜索网站bing的可用性监控", accessMode = READ_WRITE, position = 7)
    private String description;

    /**
     * 此条记录创建者
     */
    @ApiModelProperty(value = "此条记录创建者", example = "tom", accessMode = READ_ONLY, position = 8)
    private String creator;

    /**
     * 此条记录最新修改者
     */
    @ApiModelProperty(value = "此条记录最新修改者", example = "tom", accessMode = READ_ONLY, position = 9)
    private String modifier;

    /**
     * 记录创建时间
     */
    @ApiModelProperty(value = "记录创建时间(毫秒时间戳)", example = "1612198922000", accessMode = READ_ONLY, position = 10)
    private LocalDateTime gmtCreate;

    /**
     * 记录最新修改时间
     */
    @ApiModelProperty(value = "记录最新修改时间(毫秒时间戳)", example = "1612198444000", accessMode = READ_ONLY, position = 11)
    private LocalDateTime gmtUpdate;

}