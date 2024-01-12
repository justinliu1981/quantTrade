package com.grace.quant.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Order {
    private Integer id;

    private String accountId;

    private String sid;

    private String scanName;

    private String clOrdId;

    private String orderId;

    private String symbol;

    private Integer orderType;

    private Integer orderBusiness;

    private Integer status;

    private Integer ordRejReason;

    private String ordRejReasonDetail;

    private Float price;

    private Integer volume;

    private Integer filedVolume;

    private Integer side;

    private Integer positionEffect;

    private Integer positionSrc;

    private Integer orderDuration;

    private Integer orderQualifier;

    private Float filedVwap;

    private Float filedAmount;

    private Date createdAt;

    private Date updatedAt;

    private Date sentAt;

    private Date recvAt;

}