package com.p051p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Converter;
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
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, chatSendMessage.active) + CodedOutputByteBufferNano.m17277d(2, chatSendMessage.until);
            chatSendMessage.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatSendMessage parse(nc5 nc5Var) throws IOException {
            ChatSendMessage chatSendMessage = new ChatSendMessage();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    chatSendMessage.active = nc5Var.m162483g();
                } else {
                    if (iM162497u != 17) {
                        return chatSendMessage;
                    }
                    chatSendMessage.until = nc5Var.m162484h();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatSendMessage chatSendMessage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, chatSendMessage.active);
            codedOutputByteBufferNano.m17301C(2, chatSendMessage.until);
        }
    };
    public static JsonAdapter<ChatSendMessage> JSON_ADAPTER = new ObjectJsonAdapter<ChatSendMessage>() { // from class: com.p1.mobile.putong.core.data.ChatSendMessage.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatSendMessage.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatSendMessage chatSendMessage, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(Active.TYPE, chatSendMessage.active);
            jsonGenerator.writeFieldName("until");
            Converter.API_TIME.serialize(Double.valueOf(chatSendMessage.until), jsonGenerator, true);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatSendMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public ChatSendMessage mo225055clone() {
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
