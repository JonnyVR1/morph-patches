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
public class ChatAssistantQuestionSync extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatassistantquestionsync";

    @ProtobufIndex(index = 1)
    public boolean open;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean setted;
    public static ProtobufAdapter<ChatAssistantQuestionSync> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatAssistantQuestionSync>() { // from class: com.p1.mobile.putong.core.data.ChatAssistantQuestionSync.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatAssistantQuestionSync chatAssistantQuestionSync) {
            int iB = CodedOutputByteBufferNano.b(1, chatAssistantQuestionSync.open) + CodedOutputByteBufferNano.b(2, chatAssistantQuestionSync.setted);
            ((MessageNano) chatAssistantQuestionSync).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatAssistantQuestionSync m11985parse(nb5 nb5Var) throws IOException {
            ChatAssistantQuestionSync chatAssistantQuestionSync = new ChatAssistantQuestionSync();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    chatAssistantQuestionSync.open = nb5Var.g();
                } else {
                    if (iU != 16) {
                        return chatAssistantQuestionSync;
                    }
                    chatAssistantQuestionSync.setted = nb5Var.g();
                }
            }
        }

        public void serialize(ChatAssistantQuestionSync chatAssistantQuestionSync, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, chatAssistantQuestionSync.open);
            codedOutputByteBufferNano.A(2, chatAssistantQuestionSync.setted);
        }
    };
    public static JsonAdapter<ChatAssistantQuestionSync> JSON_ADAPTER = new ObjectJsonAdapter<ChatAssistantQuestionSync>() { // from class: com.p1.mobile.putong.core.data.ChatAssistantQuestionSync.2
        public Class getDataClass() {
            return ChatAssistantQuestionSync.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatAssistantQuestionSync m11986newInstance() {
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

        public void serializeFields(ChatAssistantQuestionSync chatAssistantQuestionSync, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("open", chatAssistantQuestionSync.open);
            jsonGenerator.writeBooleanField("setted", chatAssistantQuestionSync.setted);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatAssistantQuestionSync) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatAssistantQuestionSync) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatAssistantQuestionSync new_() {
        ChatAssistantQuestionSync chatAssistantQuestionSync = new ChatAssistantQuestionSync();
        chatAssistantQuestionSync.nullCheck();
        return chatAssistantQuestionSync;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatAssistantQuestionSync m11984clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.open ? 1231 : 1237)) * 41) + (this.setted ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
