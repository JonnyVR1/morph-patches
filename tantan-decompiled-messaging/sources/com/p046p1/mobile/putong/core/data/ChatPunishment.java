package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.SchemeKey;
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
public class ChatPunishment extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatpunishment";

    @NonNull
    @ProtobufIndex(index = 1)
    public ChatSendMessage sendMessage;

    @NonNull
    @ProtobufIndex(index = 2)
    public SendRedPacket sendRedPacket;
    public static ProtobufAdapter<ChatPunishment> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatPunishment>() { // from class: com.p1.mobile.putong.core.data.ChatPunishment.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatPunishment chatPunishment) {
            ChatSendMessage chatSendMessage = chatPunishment.sendMessage;
            int iM17230l = chatSendMessage != null ? CodedOutputByteBufferNano.m17230l(1, chatSendMessage, ChatSendMessage.PROTOBUF_ADAPTER) : 0;
            SendRedPacket sendRedPacket = chatPunishment.sendRedPacket;
            if (sendRedPacket != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, sendRedPacket, SendRedPacket.PROTOBUF_ADAPTER);
            }
            chatPunishment.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatPunishment parse(nb5 nb5Var) throws IOException {
            ChatPunishment chatPunishment = new ChatPunishment();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (chatPunishment.sendMessage == null) {
                        chatPunishment.sendMessage = ChatSendMessage.new_();
                    }
                    if (chatPunishment.sendRedPacket != null) {
                        break;
                    }
                    chatPunishment.sendRedPacket = SendRedPacket.new_();
                    break;
                }
                if (iM158752u == 10) {
                    chatPunishment.sendMessage = (ChatSendMessage) nb5Var.m158743l(ChatSendMessage.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (chatPunishment.sendMessage == null) {
                            chatPunishment.sendMessage = ChatSendMessage.new_();
                        }
                        if (chatPunishment.sendRedPacket != null) {
                            break;
                        }
                        chatPunishment.sendRedPacket = SendRedPacket.new_();
                        return chatPunishment;
                    }
                    chatPunishment.sendRedPacket = (SendRedPacket) nb5Var.m158743l(SendRedPacket.PROTOBUF_ADAPTER);
                }
            }
            return chatPunishment;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatPunishment chatPunishment, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ChatSendMessage chatSendMessage = chatPunishment.sendMessage;
            if (chatSendMessage != null) {
                codedOutputByteBufferNano.m17254K(1, chatSendMessage, ChatSendMessage.PROTOBUF_ADAPTER);
            }
            SendRedPacket sendRedPacket = chatPunishment.sendRedPacket;
            if (sendRedPacket != null) {
                codedOutputByteBufferNano.m17254K(2, sendRedPacket, SendRedPacket.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ChatPunishment> JSON_ADAPTER = new ObjectJsonAdapter<ChatPunishment>() { // from class: com.p1.mobile.putong.core.data.ChatPunishment.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatPunishment.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatPunishment newInstance() {
            return new ChatPunishment();
        }

        public boolean parseField(ChatPunishment chatPunishment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(SchemeKey.sendMessage)) {
                chatPunishment.sendMessage = ChatSendMessage.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("sendRedPacket")) {
                return false;
            }
            chatPunishment.sendRedPacket = SendRedPacket.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ChatPunishment chatPunishment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(SchemeKey.sendMessage) || str.equals("sendRedPacket")) {
                return true;
            }
            return super.parseFieldCheck(chatPunishment, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatPunishment chatPunishment, JsonGenerator jsonGenerator) throws IOException {
            if (chatPunishment.sendMessage != null) {
                jsonGenerator.writeFieldName(SchemeKey.sendMessage);
                ChatSendMessage.JSON_ADAPTER.serialize(chatPunishment.sendMessage, jsonGenerator, true);
            }
            if (chatPunishment.sendRedPacket != null) {
                jsonGenerator.writeFieldName("sendRedPacket");
                SendRedPacket.JSON_ADAPTER.serialize(chatPunishment.sendRedPacket, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatPunishment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatPunishment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatPunishment new_() {
        ChatPunishment chatPunishment = new ChatPunishment();
        chatPunishment.nullCheck();
        return chatPunishment;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatPunishment mo223809clone() {
        ChatPunishment chatPunishment = new ChatPunishment();
        ChatSendMessage chatSendMessage = this.sendMessage;
        if (chatSendMessage != null) {
            chatPunishment.sendMessage = chatSendMessage.mo223809clone();
        }
        SendRedPacket sendRedPacket = this.sendRedPacket;
        if (sendRedPacket != null) {
            chatPunishment.sendRedPacket = sendRedPacket.mo223809clone();
        }
        return chatPunishment;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatPunishment)) {
            return false;
        }
        ChatPunishment chatPunishment = (ChatPunishment) obj;
        return ValueObject.util_equals(this.sendMessage, chatPunishment.sendMessage) && ValueObject.util_equals(this.sendRedPacket, chatPunishment.sendRedPacket);
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
        int i2 = i * 41;
        ChatSendMessage chatSendMessage = this.sendMessage;
        int iHashCode = (i2 + (chatSendMessage != null ? chatSendMessage.hashCode() : 0)) * 41;
        SendRedPacket sendRedPacket = this.sendRedPacket;
        int iHashCode2 = iHashCode + (sendRedPacket != null ? sendRedPacket.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.sendMessage == null) {
            this.sendMessage = ChatSendMessage.new_();
        }
        if (this.sendRedPacket == null) {
            this.sendRedPacket = SendRedPacket.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
