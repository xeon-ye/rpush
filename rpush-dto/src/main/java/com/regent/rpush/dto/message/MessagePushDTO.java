package com.regent.rpush.dto.message;

import cn.hutool.json.JSONObject;
import com.regent.rpush.dto.BaseParam;
import com.regent.rpush.dto.enumration.MessagePlatformEnum;
import lombok.*;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 消息推送参数
 *
 * @author 钟宝林
 * @date 2021/2/8 18:30
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessagePushDTO extends BaseParam {
    private static final long serialVersionUID = 2732930320545780215L;

    /**
     * 消息内容
     */
    private String content;

    /**
     * 消息参数，键为需要发送的平台，值为对应平台需要的参数（不同平台可能会需要不同的参数，所以这里不表达具体类型，由不同的实现决定具体结构）
     */
    private Map<MessagePlatformEnum, JSONObject> platformParam = new LinkedHashMap<>();

}
