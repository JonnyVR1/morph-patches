package com.p000p1.mobile.putong.core.data;

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
public class ChatRealConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatrealconfig";

    @ProtobufIndex(index = 1)
    public boolean enable;
    public static ProtobufAdapter<ChatRealConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatRealConfig>() { // from class: com.p1.mobile.putong.core.data.ChatRealConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatRealConfig chatRealConfig) {
            int iB = CodedOutputByteBufferNano.b(1, chatRealConfig.enable);
            ((MessageNano) chatRealConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatRealConfig m12141parse(nb5 nb5Var) throws IOException {
            ChatRealConfig chatRealConfig = new ChatRealConfig();
            while (nb5Var.u() == 8) {
                chatRealConfig.enable = nb5Var.g();
            }
            return chatRealConfig;
        }

        public void serialize(ChatRealConfig chatRealConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, chatRealConfig.enable);
        }
    };
    public static JsonAdapter<ChatRealConfig> JSON_ADAPTER = new ObjectJsonAdapter<ChatRealConfig>() { // from class: com.p1.mobile.putong.core.data.ChatRealConfig.2
        public Class getDataClass() {
            return ChatRealConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatRealConfig m12142newInstance() {
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

        public void serializeFields(ChatRealConfig chatRealConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", chatRealConfig.enable);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatRealConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatRealConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatRealConfig new_() {
        ChatRealConfig chatRealConfig = new ChatRealConfig();
        chatRealConfig.nullCheck();
        return chatRealConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatRealConfig m12140clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.enable ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
