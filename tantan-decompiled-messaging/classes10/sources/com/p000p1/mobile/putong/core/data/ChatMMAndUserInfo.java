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
public class ChatMMAndUserInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatmmanduserinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public ChatMM chatMM;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public ChatMMUserInfo userInformation;
    public static ProtobufAdapter<ChatMMAndUserInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatMMAndUserInfo>() { // from class: com.p1.mobile.putong.core.data.ChatMMAndUserInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatMMAndUserInfo chatMMAndUserInfo) {
            ChatMM chatMM = chatMMAndUserInfo.chatMM;
            int iL = chatMM != null ? CodedOutputByteBufferNano.l(1, chatMM, ChatMM.PROTOBUF_ADAPTER) : 0;
            ChatMMUserInfo chatMMUserInfo = chatMMAndUserInfo.userInformation;
            if (chatMMUserInfo != null) {
                iL += CodedOutputByteBufferNano.l(2, chatMMUserInfo, ChatMMUserInfo.PROTOBUF_ADAPTER);
            }
            ((MessageNano) chatMMAndUserInfo).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatMMAndUserInfo m12077parse(nb5 nb5Var) throws IOException {
            ChatMMAndUserInfo chatMMAndUserInfo = new ChatMMAndUserInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (chatMMAndUserInfo.chatMM == null) {
                        chatMMAndUserInfo.chatMM = ChatMM.new_();
                    }
                    if (chatMMAndUserInfo.userInformation != null) {
                        break;
                    }
                    chatMMAndUserInfo.userInformation = ChatMMUserInfo.new_();
                    break;
                }
                if (iU == 10) {
                    chatMMAndUserInfo.chatMM = (ChatMM) nb5Var.l(ChatMM.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (chatMMAndUserInfo.chatMM == null) {
                            chatMMAndUserInfo.chatMM = ChatMM.new_();
                        }
                        if (chatMMAndUserInfo.userInformation != null) {
                            break;
                        }
                        chatMMAndUserInfo.userInformation = ChatMMUserInfo.new_();
                        return chatMMAndUserInfo;
                    }
                    chatMMAndUserInfo.userInformation = (ChatMMUserInfo) nb5Var.l(ChatMMUserInfo.PROTOBUF_ADAPTER);
                }
            }
            return chatMMAndUserInfo;
        }

        public void serialize(ChatMMAndUserInfo chatMMAndUserInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ChatMM chatMM = chatMMAndUserInfo.chatMM;
            if (chatMM != null) {
                codedOutputByteBufferNano.K(1, chatMM, ChatMM.PROTOBUF_ADAPTER);
            }
            ChatMMUserInfo chatMMUserInfo = chatMMAndUserInfo.userInformation;
            if (chatMMUserInfo != null) {
                codedOutputByteBufferNano.K(2, chatMMUserInfo, ChatMMUserInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ChatMMAndUserInfo> JSON_ADAPTER = new ObjectJsonAdapter<ChatMMAndUserInfo>() { // from class: com.p1.mobile.putong.core.data.ChatMMAndUserInfo.2
        public Class getDataClass() {
            return ChatMMAndUserInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatMMAndUserInfo m12078newInstance() {
            return new ChatMMAndUserInfo();
        }

        public boolean parseField(ChatMMAndUserInfo chatMMAndUserInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("chatMM")) {
                chatMMAndUserInfo.chatMM = (ChatMM) ChatMM.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("userInformation")) {
                return false;
            }
            chatMMAndUserInfo.userInformation = (ChatMMUserInfo) ChatMMUserInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ChatMMAndUserInfo chatMMAndUserInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("chatMM") || str.equals("userInformation")) {
                return true;
            }
            return super.parseFieldCheck(chatMMAndUserInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ChatMMAndUserInfo chatMMAndUserInfo, JsonGenerator jsonGenerator) throws IOException {
            if (chatMMAndUserInfo.chatMM != null) {
                jsonGenerator.writeFieldName("chatMM");
                ChatMM.JSON_ADAPTER.serialize(chatMMAndUserInfo.chatMM, jsonGenerator, true);
            }
            if (chatMMAndUserInfo.userInformation != null) {
                jsonGenerator.writeFieldName("userInformation");
                ChatMMUserInfo.JSON_ADAPTER.serialize(chatMMAndUserInfo.userInformation, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatMMAndUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatMMAndUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatMMAndUserInfo new_() {
        ChatMMAndUserInfo chatMMAndUserInfo = new ChatMMAndUserInfo();
        chatMMAndUserInfo.nullCheck();
        return chatMMAndUserInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatMMAndUserInfo m12076clone() {
        ChatMMAndUserInfo chatMMAndUserInfo = new ChatMMAndUserInfo();
        ChatMM chatMM = this.chatMM;
        if (chatMM != null) {
            chatMMAndUserInfo.chatMM = chatMM.m12072clone();
        }
        ChatMMUserInfo chatMMUserInfo = this.userInformation;
        if (chatMMUserInfo != null) {
            chatMMAndUserInfo.userInformation = chatMMUserInfo.m12088clone();
        }
        return chatMMAndUserInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatMMAndUserInfo)) {
            return false;
        }
        ChatMMAndUserInfo chatMMAndUserInfo = (ChatMMAndUserInfo) obj;
        return ValueObject.util_equals(this.chatMM, chatMMAndUserInfo.chatMM) && ValueObject.util_equals(this.userInformation, chatMMAndUserInfo.userInformation);
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
        ChatMM chatMM = this.chatMM;
        int iHashCode = (i2 + (chatMM != null ? chatMM.hashCode() : 0)) * 41;
        ChatMMUserInfo chatMMUserInfo = this.userInformation;
        int iHashCode2 = iHashCode + (chatMMUserInfo != null ? chatMMUserInfo.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.chatMM == null) {
            this.chatMM = ChatMM.new_();
        }
        if (this.userInformation == null) {
            this.userInformation = ChatMMUserInfo.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
