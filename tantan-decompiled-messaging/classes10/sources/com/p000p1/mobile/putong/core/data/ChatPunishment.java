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
public class ChatPunishment extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatpunishment";

    @NonNull
    @ProtobufIndex(index = 1)
    public ChatSendMessage sendMessage;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public SendRedPacket sendRedPacket;
    public static ProtobufAdapter<ChatPunishment> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatPunishment>() { // from class: com.p1.mobile.putong.core.data.ChatPunishment.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatPunishment chatPunishment) {
            ChatSendMessage chatSendMessage = chatPunishment.sendMessage;
            int iL = chatSendMessage != null ? CodedOutputByteBufferNano.l(1, chatSendMessage, ChatSendMessage.PROTOBUF_ADAPTER) : 0;
            SendRedPacket sendRedPacket = chatPunishment.sendRedPacket;
            if (sendRedPacket != null) {
                iL += CodedOutputByteBufferNano.l(2, sendRedPacket, SendRedPacket.PROTOBUF_ADAPTER);
            }
            ((MessageNano) chatPunishment).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatPunishment m12137parse(nb5 nb5Var) throws IOException {
            ChatPunishment chatPunishment = new ChatPunishment();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (chatPunishment.sendMessage == null) {
                        chatPunishment.sendMessage = ChatSendMessage.new_();
                    }
                    if (chatPunishment.sendRedPacket != null) {
                        break;
                    }
                    chatPunishment.sendRedPacket = SendRedPacket.new_();
                    break;
                }
                if (iU == 10) {
                    chatPunishment.sendMessage = (ChatSendMessage) nb5Var.l(ChatSendMessage.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (chatPunishment.sendMessage == null) {
                            chatPunishment.sendMessage = ChatSendMessage.new_();
                        }
                        if (chatPunishment.sendRedPacket != null) {
                            break;
                        }
                        chatPunishment.sendRedPacket = SendRedPacket.new_();
                        return chatPunishment;
                    }
                    chatPunishment.sendRedPacket = (SendRedPacket) nb5Var.l(SendRedPacket.PROTOBUF_ADAPTER);
                }
            }
            return chatPunishment;
        }

        public void serialize(ChatPunishment chatPunishment, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ChatSendMessage chatSendMessage = chatPunishment.sendMessage;
            if (chatSendMessage != null) {
                codedOutputByteBufferNano.K(1, chatSendMessage, ChatSendMessage.PROTOBUF_ADAPTER);
            }
            SendRedPacket sendRedPacket = chatPunishment.sendRedPacket;
            if (sendRedPacket != null) {
                codedOutputByteBufferNano.K(2, sendRedPacket, SendRedPacket.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ChatPunishment> JSON_ADAPTER = new ObjectJsonAdapter<ChatPunishment>() { // from class: com.p1.mobile.putong.core.data.ChatPunishment.2
        public Class getDataClass() {
            return ChatPunishment.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatPunishment m12138newInstance() {
            return new ChatPunishment();
        }

        public boolean parseField(ChatPunishment chatPunishment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("sendMessage")) {
                chatPunishment.sendMessage = (ChatSendMessage) ChatSendMessage.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("sendRedPacket")) {
                return false;
            }
            chatPunishment.sendRedPacket = (SendRedPacket) SendRedPacket.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ChatPunishment chatPunishment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("sendMessage") || str.equals("sendRedPacket")) {
                return true;
            }
            return super.parseFieldCheck(chatPunishment, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ChatPunishment chatPunishment, JsonGenerator jsonGenerator) throws IOException {
            if (chatPunishment.sendMessage != null) {
                jsonGenerator.writeFieldName("sendMessage");
                ChatSendMessage.JSON_ADAPTER.serialize(chatPunishment.sendMessage, jsonGenerator, true);
            }
            if (chatPunishment.sendRedPacket != null) {
                jsonGenerator.writeFieldName("sendRedPacket");
                SendRedPacket.JSON_ADAPTER.serialize(chatPunishment.sendRedPacket, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatPunishment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatPunishment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatPunishment new_() {
        ChatPunishment chatPunishment = new ChatPunishment();
        chatPunishment.nullCheck();
        return chatPunishment;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatPunishment m12136clone() {
        ChatPunishment chatPunishment = new ChatPunishment();
        ChatSendMessage chatSendMessage = this.sendMessage;
        if (chatSendMessage != null) {
            chatPunishment.sendMessage = chatSendMessage.m12152clone();
        }
        SendRedPacket sendRedPacket = this.sendRedPacket;
        if (sendRedPacket != null) {
            chatPunishment.sendRedPacket = sendRedPacket.m15584clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        ChatSendMessage chatSendMessage = this.sendMessage;
        int iHashCode = (i2 + (chatSendMessage != null ? chatSendMessage.hashCode() : 0)) * 41;
        SendRedPacket sendRedPacket = this.sendRedPacket;
        int iHashCode2 = iHashCode + (sendRedPacket != null ? sendRedPacket.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.sendMessage == null) {
            this.sendMessage = ChatSendMessage.new_();
        }
        if (this.sendRedPacket == null) {
            this.sendRedPacket = SendRedPacket.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
