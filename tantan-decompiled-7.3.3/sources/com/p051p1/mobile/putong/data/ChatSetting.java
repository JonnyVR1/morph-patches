package com.p051p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class ChatSetting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatsetting";

    @ProtobufIndex(index = 1)
    public boolean receiveBroadcast;
    public static ProtobufAdapter<ChatSetting> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatSetting>() { // from class: com.p1.mobile.putong.data.ChatSetting.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatSetting chatSetting) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, chatSetting.receiveBroadcast);
            chatSetting.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatSetting parse(nc5 nc5Var) throws IOException {
            ChatSetting chatSetting = new ChatSetting();
            while (nc5Var.m162497u() == 8) {
                chatSetting.receiveBroadcast = nc5Var.m162483g();
            }
            return chatSetting;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatSetting chatSetting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, chatSetting.receiveBroadcast);
        }
    };
    public static JsonAdapter<ChatSetting> JSON_ADAPTER = new ObjectJsonAdapter<ChatSetting>() { // from class: com.p1.mobile.putong.data.ChatSetting.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatSetting.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatSetting newInstance() {
            return new ChatSetting();
        }

        public boolean parseField(ChatSetting chatSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("receiveBroadcast")) {
                return false;
            }
            chatSetting.receiveBroadcast = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(ChatSetting chatSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("receiveBroadcast")) {
                return true;
            }
            return super.parseFieldCheck(chatSetting, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatSetting chatSetting, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("receiveBroadcast", chatSetting.receiveBroadcast);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatSetting new_() {
        ChatSetting chatSetting = new ChatSetting();
        chatSetting.nullCheck();
        return chatSetting;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatSetting mo225055clone() {
        ChatSetting chatSetting = new ChatSetting();
        chatSetting.receiveBroadcast = this.receiveBroadcast;
        return chatSetting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ChatSetting) && this.receiveBroadcast == ((ChatSetting) obj).receiveBroadcast;
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
        int i2 = (i * 41) + (this.receiveBroadcast ? 1231 : 1237);
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
