package com.p000p1.mobile.putong.core.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ChatPartnerConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatpartnerconfig";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int messageLimit;

    @ProtobufIndex(index = 4)
    public int perday;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int popStyle;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int squareLimit;

    @NonNull
    @ProtobufIndex(index = 6)
    public String triggerTime;
    public static ProtobufAdapter<ChatPartnerConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatPartnerConfig>() { // from class: com.p1.mobile.putong.core.data.ChatPartnerConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatPartnerConfig chatPartnerConfig) {
            int iB = CodedOutputByteBufferNano.b(1, chatPartnerConfig.enable) + CodedOutputByteBufferNano.h(2, chatPartnerConfig.squareLimit) + CodedOutputByteBufferNano.h(3, chatPartnerConfig.messageLimit) + CodedOutputByteBufferNano.h(4, chatPartnerConfig.perday) + CodedOutputByteBufferNano.h(5, chatPartnerConfig.popStyle);
            String str = chatPartnerConfig.triggerTime;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(6, str);
            }
            ((MessageNano) chatPartnerConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatPartnerConfig m12105parse(nb5 nb5Var) throws IOException {
            ChatPartnerConfig chatPartnerConfig = new ChatPartnerConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (chatPartnerConfig.triggerTime != null) {
                        break;
                    }
                    chatPartnerConfig.triggerTime = "";
                    break;
                }
                if (iU == 8) {
                    chatPartnerConfig.enable = nb5Var.g();
                } else if (iU == 16) {
                    chatPartnerConfig.squareLimit = nb5Var.j();
                } else if (iU == 24) {
                    chatPartnerConfig.messageLimit = nb5Var.j();
                } else if (iU == 32) {
                    chatPartnerConfig.perday = nb5Var.j();
                } else if (iU == 40) {
                    chatPartnerConfig.popStyle = nb5Var.j();
                } else {
                    if (iU != 50) {
                        if (chatPartnerConfig.triggerTime != null) {
                            break;
                        }
                        chatPartnerConfig.triggerTime = "";
                        return chatPartnerConfig;
                    }
                    chatPartnerConfig.triggerTime = nb5Var.s();
                }
            }
            return chatPartnerConfig;
        }

        public void serialize(ChatPartnerConfig chatPartnerConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, chatPartnerConfig.enable);
            codedOutputByteBufferNano.G(2, chatPartnerConfig.squareLimit);
            codedOutputByteBufferNano.G(3, chatPartnerConfig.messageLimit);
            codedOutputByteBufferNano.G(4, chatPartnerConfig.perday);
            codedOutputByteBufferNano.G(5, chatPartnerConfig.popStyle);
            String str = chatPartnerConfig.triggerTime;
            if (str != null) {
                codedOutputByteBufferNano.R(6, str);
            }
        }
    };
    public static JsonAdapter<ChatPartnerConfig> JSON_ADAPTER = new ObjectJsonAdapter<ChatPartnerConfig>() { // from class: com.p1.mobile.putong.core.data.ChatPartnerConfig.2
        public Class getDataClass() {
            return ChatPartnerConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatPartnerConfig m12106newInstance() {
            return new ChatPartnerConfig();
        }

        public boolean parseField(ChatPartnerConfig chatPartnerConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "messageLimit":
                    chatPartnerConfig.messageLimit = jsonParser.getValueAsInt();
                    return true;
                case "enable":
                    chatPartnerConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "perday":
                    chatPartnerConfig.perday = jsonParser.getValueAsInt();
                    return true;
                case "triggerTime":
                    chatPartnerConfig.triggerTime = jsonParser.getValueAsString();
                    return true;
                case "squareLimit":
                    chatPartnerConfig.squareLimit = jsonParser.getValueAsInt();
                    return true;
                case "popStyle":
                    chatPartnerConfig.popStyle = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChatPartnerConfig chatPartnerConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "messageLimit":
                case "enable":
                case "perday":
                case "triggerTime":
                case "squareLimit":
                case "popStyle":
                    return true;
                default:
                    return super.parseFieldCheck(chatPartnerConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ChatPartnerConfig chatPartnerConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", chatPartnerConfig.enable);
            jsonGenerator.writeNumberField("squareLimit", chatPartnerConfig.squareLimit);
            jsonGenerator.writeNumberField("messageLimit", chatPartnerConfig.messageLimit);
            jsonGenerator.writeNumberField("perday", chatPartnerConfig.perday);
            jsonGenerator.writeNumberField("popStyle", chatPartnerConfig.popStyle);
            String str = chatPartnerConfig.triggerTime;
            if (str != null) {
                jsonGenerator.writeStringField("triggerTime", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatPartnerConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatPartnerConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatPartnerConfig new_() {
        ChatPartnerConfig chatPartnerConfig = new ChatPartnerConfig();
        chatPartnerConfig.nullCheck();
        return chatPartnerConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatPartnerConfig m12104clone() {
        ChatPartnerConfig chatPartnerConfig = new ChatPartnerConfig();
        chatPartnerConfig.enable = this.enable;
        chatPartnerConfig.squareLimit = this.squareLimit;
        chatPartnerConfig.messageLimit = this.messageLimit;
        chatPartnerConfig.perday = this.perday;
        chatPartnerConfig.popStyle = this.popStyle;
        chatPartnerConfig.triggerTime = this.triggerTime;
        return chatPartnerConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatPartnerConfig)) {
            return false;
        }
        ChatPartnerConfig chatPartnerConfig = (ChatPartnerConfig) obj;
        return this.enable == chatPartnerConfig.enable && this.squareLimit == chatPartnerConfig.squareLimit && this.messageLimit == chatPartnerConfig.messageLimit && this.perday == chatPartnerConfig.perday && this.popStyle == chatPartnerConfig.popStyle && ValueObject.util_equals(this.triggerTime, chatPartnerConfig.triggerTime);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((((((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.squareLimit) * 41) + this.messageLimit) * 41) + this.perday) * 41) + this.popStyle) * 41;
        String str = this.triggerTime;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public boolean isFromChatBack() {
        return TextUtils.equals(this.triggerTime, "chatBack");
    }

    public boolean isFromMessageTab() {
        return TextUtils.equals(this.triggerTime, "messageTab");
    }

    public void nullCheck() {
        if (this.triggerTime == null) {
            this.triggerTime = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
