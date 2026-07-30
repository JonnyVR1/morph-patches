package com.p000p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
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
public class ChatSendMessage extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatsendmessage";

    @ProtobufIndex(index = 1)
    public boolean active;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public double until;
    public static ProtobufAdapter<ChatSendMessage> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatSendMessage>() { // from class: com.p1.mobile.putong.core.data.ChatSendMessage.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatSendMessage chatSendMessage) {
            int iB = CodedOutputByteBufferNano.b(1, chatSendMessage.active) + CodedOutputByteBufferNano.d(2, chatSendMessage.until);
            ((MessageNano) chatSendMessage).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatSendMessage m12153parse(nb5 nb5Var) throws IOException {
            ChatSendMessage chatSendMessage = new ChatSendMessage();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    chatSendMessage.active = nb5Var.g();
                } else {
                    if (iU != 17) {
                        return chatSendMessage;
                    }
                    chatSendMessage.until = nb5Var.h();
                }
            }
        }

        public void serialize(ChatSendMessage chatSendMessage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, chatSendMessage.active);
            codedOutputByteBufferNano.C(2, chatSendMessage.until);
        }
    };
    public static JsonAdapter<ChatSendMessage> JSON_ADAPTER = new ObjectJsonAdapter<ChatSendMessage>() { // from class: com.p1.mobile.putong.core.data.ChatSendMessage.2
        public Class getDataClass() {
            return ChatSendMessage.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatSendMessage m12154newInstance() {
            return new ChatSendMessage();
        }

        public boolean parseField(ChatSendMessage chatSendMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Active.TYPE)) {
                chatSendMessage.active = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("until")) {
                return false;
            }
            chatSendMessage.until = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
            return true;
        }

        public boolean parseFieldCheck(ChatSendMessage chatSendMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Active.TYPE) || str.equals("until")) {
                return true;
            }
            return super.parseFieldCheck(chatSendMessage, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ChatSendMessage chatSendMessage, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(Active.TYPE, chatSendMessage.active);
            jsonGenerator.writeFieldName("until");
            Converter.API_TIME.serialize(Double.valueOf(chatSendMessage.until), jsonGenerator, true);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatSendMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatSendMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatSendMessage new_() {
        ChatSendMessage chatSendMessage = new ChatSendMessage();
        chatSendMessage.nullCheck();
        return chatSendMessage;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatSendMessage m12152clone() {
        ChatSendMessage chatSendMessage = new ChatSendMessage();
        chatSendMessage.active = this.active;
        chatSendMessage.until = this.until;
        return chatSendMessage;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatSendMessage)) {
            return false;
        }
        ChatSendMessage chatSendMessage = (ChatSendMessage) obj;
        return this.active == chatSendMessage.active && this.until == chatSendMessage.until;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.active ? 1231 : 1237);
        long jDoubleToLongBits = Double.doubleToLongBits(this.until);
        int i3 = (i2 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
