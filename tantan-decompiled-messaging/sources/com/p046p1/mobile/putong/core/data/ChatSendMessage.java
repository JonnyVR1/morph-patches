package com.p046p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
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
public class ChatSendMessage extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatsendmessage";

    @ProtobufIndex(index = 1)
    public boolean active;

    @ProtobufIndex(index = 2)
    public double until;
    public static ProtobufAdapter<ChatSendMessage> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatSendMessage>() { // from class: com.p1.mobile.putong.core.data.ChatSendMessage.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatSendMessage chatSendMessage) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, chatSendMessage.active) + CodedOutputByteBufferNano.m17222d(2, chatSendMessage.until);
            chatSendMessage.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatSendMessage parse(nb5 nb5Var) throws IOException {
            ChatSendMessage chatSendMessage = new ChatSendMessage();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    chatSendMessage.active = nb5Var.m158738g();
                } else {
                    if (iM158752u != 17) {
                        return chatSendMessage;
                    }
                    chatSendMessage.until = nb5Var.m158739h();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatSendMessage chatSendMessage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, chatSendMessage.active);
            codedOutputByteBufferNano.m17246C(2, chatSendMessage.until);
        }
    };
    public static JsonAdapter<ChatSendMessage> JSON_ADAPTER = new ObjectJsonAdapter<ChatSendMessage>() { // from class: com.p1.mobile.putong.core.data.ChatSendMessage.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatSendMessage.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatSendMessage newInstance() {
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
            chatSendMessage.until = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
            return true;
        }

        public boolean parseFieldCheck(ChatSendMessage chatSendMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Active.TYPE) || str.equals("until")) {
                return true;
            }
            return super.parseFieldCheck(chatSendMessage, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatSendMessage chatSendMessage, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(Active.TYPE, chatSendMessage.active);
            jsonGenerator.writeFieldName("until");
            Converter.API_TIME.serialize(Double.valueOf(chatSendMessage.until), jsonGenerator, true);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatSendMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatSendMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatSendMessage new_() {
        ChatSendMessage chatSendMessage = new ChatSendMessage();
        chatSendMessage.nullCheck();
        return chatSendMessage;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatSendMessage mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.active ? 1231 : 1237);
        long jDoubleToLongBits = Double.doubleToLongBits(this.until);
        int i3 = (i2 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
