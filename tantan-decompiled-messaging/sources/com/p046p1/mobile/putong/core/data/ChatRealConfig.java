package com.p046p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class ChatRealConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatrealconfig";

    @ProtobufIndex(index = 1)
    public boolean enable;
    public static ProtobufAdapter<ChatRealConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatRealConfig>() { // from class: com.p1.mobile.putong.core.data.ChatRealConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatRealConfig chatRealConfig) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, chatRealConfig.enable);
            chatRealConfig.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatRealConfig parse(nb5 nb5Var) throws IOException {
            ChatRealConfig chatRealConfig = new ChatRealConfig();
            while (nb5Var.m158752u() == 8) {
                chatRealConfig.enable = nb5Var.m158738g();
            }
            return chatRealConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatRealConfig chatRealConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, chatRealConfig.enable);
        }
    };
    public static JsonAdapter<ChatRealConfig> JSON_ADAPTER = new ObjectJsonAdapter<ChatRealConfig>() { // from class: com.p1.mobile.putong.core.data.ChatRealConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatRealConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatRealConfig newInstance() {
            return new ChatRealConfig();
        }

        public boolean parseField(ChatRealConfig chatRealConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("enable")) {
                return false;
            }
            chatRealConfig.enable = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(ChatRealConfig chatRealConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("enable")) {
                return true;
            }
            return super.parseFieldCheck(chatRealConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatRealConfig chatRealConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", chatRealConfig.enable);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatRealConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatRealConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatRealConfig new_() {
        ChatRealConfig chatRealConfig = new ChatRealConfig();
        chatRealConfig.nullCheck();
        return chatRealConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatRealConfig mo223809clone() {
        ChatRealConfig chatRealConfig = new ChatRealConfig();
        chatRealConfig.enable = this.enable;
        return chatRealConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ChatRealConfig) && this.enable == ((ChatRealConfig) obj).enable;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.enable ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
