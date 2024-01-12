package com.grace.quant.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Execution {
    private Integer id;

    private String accountId;

    private String sid;

    private String scanName;

    private String clOrdId;

    private String orderId;

    private String execId;

    private String symbol;

    private Integer orderBusiness;

    private Integer ordRejReason;

    private String ordRejReasonDetail;

    private Integer execType;

    private Float price;

    private Integer volume;

    private Integer side;

    private Integer positionEffect;

    private Float amount;

    private Date createdAt;

    private Date recvAt;

}