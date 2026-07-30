package com.p000p1.mobile.putong.core.data;

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
public class ChatInviteToVerifyConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatinvitetoverifyconfig";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String functionStartTime;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int insertMessageLiming;
    public static ProtobufAdapter<ChatInviteToVerifyConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatInviteToVerifyConfig>() { // from class: com.p1.mobile.putong.core.data.ChatInviteToVerifyConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatInviteToVerifyConfig chatInviteToVerifyConfig) {
            int iB = CodedOutputByteBufferNano.b(1, chatInviteToVerifyConfig.enable) + CodedOutputByteBufferNano.h(2, chatInviteToVerifyConfig.insertMessageLiming);
            String str = chatInviteToVerifyConfig.functionStartTime;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(3, str);
            }
            ((MessageNano) chatInviteToVerifyConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatInviteToVerifyConfig m12069parse(nb5 nb5Var) throws IOException {
            ChatInviteToVerifyConfig chatInviteToVerifyConfig = new ChatInviteToVerifyConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (chatInviteToVerifyConfig.functionStartTime != null) {
                        break;
                    }
                    chatInviteToVerifyConfig.functionStartTime = "";
                    break;
                }
                if (iU == 8) {
                    chatInviteToVerifyConfig.enable = nb5Var.g();
                } else if (iU == 16) {
                    chatInviteToVerifyConfig.insertMessageLiming = nb5Var.j();
                } else {
                    if (iU != 26) {
                        if (chatInviteToVerifyConfig.functionStartTime != null) {
                            break;
                        }
                        chatInviteToVerifyConfig.functionStartTime = "";
                        return chatInviteToVerifyConfig;
                    }
                    chatInviteToVerifyConfig.functionStartTime = nb5Var.s();
                }
            }
            return chatInviteToVerifyConfig;
        }

        public void serialize(ChatInviteToVerifyConfig chatInviteToVerifyConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, chatInviteToVerifyConfig.enable);
            codedOutputByteBufferNano.G(2, chatInviteToVerifyConfig.insertMessageLiming);
            String str = chatInviteToVerifyConfig.functionStartTime;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
        }
    };
    public static JsonAdapter<ChatInviteToVerifyConfig> JSON_ADAPTER = new ObjectJsonAdapter<ChatInviteToVerifyConfig>() { // from class: com.p1.mobile.putong.core.data.ChatInviteToVerifyConfig.2
        public Class getDataClass() {
            return ChatInviteToVerifyConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatInviteToVerifyConfig m12070newInstance() {
            return new ChatInviteToVerifyConfig();
        }

        public boolean parseField(ChatInviteToVerifyConfig chatInviteToVerifyConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enable":
                    chatInviteToVerifyConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "functionStartTime":
                    chatInviteToVerifyConfig.functionStartTime = jsonParser.getValueAsString();
                    return true;
                case "insertMessageLiming":
                    chatInviteToVerifyConfig.insertMessageLiming = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChatInviteToVerifyConfig chatInviteToVerifyConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "enable":
                case "functionStartTime":
                case "insertMessageLiming":
                    return true;
                default:
                    return super.parseFieldCheck(chatInviteToVerifyConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ChatInviteToVerifyConfig chatInviteToVerifyConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", chatInviteToVerifyConfig.enable);
            jsonGenerator.writeNumberField("insertMessageLiming", chatInviteToVerifyConfig.insertMessageLiming);
            String str = chatInviteToVerifyConfig.functionStartTime;
            if (str != null) {
                jsonGenerator.writeStringField("functionStartTime", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatInviteToVerifyConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatInviteToVerifyConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatInviteToVerifyConfig new_() {
        ChatInviteToVerifyConfig chatInviteToVerifyConfig = new ChatInviteToVerifyConfig();
        chatInviteToVerifyConfig.nullCheck();
        return chatInviteToVerifyConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatInviteToVerifyConfig m12068clone() {
        ChatInviteToVerifyConfig chatInviteToVerifyConfig = new ChatInviteToVerifyConfig();
        chatInviteToVerifyConfig.enable = this.enable;
        chatInviteToVerifyConfig.insertMessageLiming = this.insertMessageLiming;
        chatInviteToVerifyConfig.functionStartTime = this.functionStartTime;
        return chatInviteToVerifyConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatInviteToVerifyConfig)) {
            return false;
        }
        ChatInviteToVerifyConfig chatInviteToVerifyConfig = (ChatInviteToVerifyConfig) obj;
        return this.enable == chatInviteToVerifyConfig.enable && this.insertMessageLiming == chatInviteToVerifyConfig.insertMessageLiming && ValueObject.util_equals(this.functionStartTime, chatInviteToVerifyConfig.functionStartTime);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.insertMessageLiming) * 41;
        String str = this.functionStartTime;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.functionStartTime == null) {
            this.functionStartTime = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
