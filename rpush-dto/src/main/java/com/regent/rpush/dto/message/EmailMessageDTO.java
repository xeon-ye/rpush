package com.regent.rpush.dto.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 邮件消息
 *
 * @author 钟宝林
 * @date 2021/2/8 10:00
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailMessageDTO extends BaseMessage {
    private static final long serialVersionUID = 2692273549631779696L;

    private List<String> sendTo;


}
