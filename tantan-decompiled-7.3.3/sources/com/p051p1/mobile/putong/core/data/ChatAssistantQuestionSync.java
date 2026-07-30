package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class ChatAssistantQuestionSync extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatassistantquestionsync";

    @ProtobufIndex(index = 1)
    public boolean open;

    @ProtobufIndex(index = 2)
    public boolean setted;
    public static ProtobufAdapter<ChatAssistantQuestionSync> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatAssistantQuestionSync>() { // from class: com.p1.mobile.putong.core.data.ChatAssistantQuestionSync.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatAssistantQuestionSync chatAssistantQuestionSync) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, chatAssistantQuestionSync.open) + CodedOutputByteBufferNano.m17275b(2, chatAssistantQuestionSync.setted);
            chatAssistantQuestionSync.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatAssistantQuestionSync parse(nc5 nc5Var) throws IOException {
            ChatAssistantQuestionSync chatAssistantQuestionSync = new ChatAssistantQuestionSync();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    chatAssistantQuestionSync.open = nc5Var.m162483g();
                } else {
                    if (iM162497u != 16) {
                        return chatAssistantQuestionSync;
                    }
                    chatAssistantQuestionSync.setted = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatAssistantQuestionSync chatAssistantQuestionSync, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, chatAssistantQuestionSync.open);
            codedOutputByteBufferNano.m17299A(2, chatAssistantQuestionSync.setted);
        }
    };
    public static JsonAdapter<ChatAssistantQuestionSync> JSON_ADAPTER = new ObjectJsonAdapter<ChatAssistantQuestionSync>() { // from class: com.p1.mobile.putong.core.data.ChatAssistantQuestionSync.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatAssistantQuestionSync.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatAssistantQuestionSync newInstance() {
            return new ChatAssistantQuestionSync();
        }

        public boolean parseField(ChatAssistantQuestionSync chatAssistantQuestionSync, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("setted")) {
                chatAssistantQuestionSync.setted = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("open")) {
                return false;
            }
            chatAssistantQuestionSync.open = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(ChatAssistantQuestionSync chatAssistantQuestionSync, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("setted") || str.equals("open")) {
                return true;
            }
            return super.parseFieldCheck(chatAssistantQuestionSync, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatAssistantQuestionSync chatAssistantQuestionSync, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("open", chatAssistantQuestionSync.open);
            jsonGenerator.writeBooleanField("setted", chatAssistantQuestionSync.setted);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatAssistantQuestionSync) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatAssistantQuestionSync) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatAssistantQuestionSync new_() {
        ChatAssistantQuestionSync chatAssistantQuestionSync = new ChatAssistantQuestionSync();
        chatAssistantQuestionSync.nullCheck();
        return chatAssistantQuestionSync;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatAssistantQuestionSync mo225055clone() {
        ChatAssistantQuestionSync chatAssistantQuestionSync = new ChatAssistantQuestionSync();
        chatAssistantQuestionSync.open = this.open;
        chatAssistantQuestionSync.setted = this.setted;
        return chatAssistantQuestionSync;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatAssistantQuestionSync)) {
            return false;
        }
        ChatAssistantQuestionSync chatAssistantQuestionSync = (ChatAssistantQuestionSync) obj;
        return this.open == chatAssistantQuestionSync.open && this.setted == chatAssistantQuestionSync.setted;
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
        int i2 = (((i * 41) + (this.open ? 1231 : 1237)) * 41) + (this.setted ? 1231 : 1237);
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
