package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
public class ChatMMAndUserInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatmmanduserinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public ChatMM chatMM;

    @NonNull
    @ProtobufIndex(index = 2)
    public ChatMMUserInfo userInformation;
    public static ProtobufAdapter<ChatMMAndUserInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatMMAndUserInfo>() { // from class: com.p1.mobile.putong.core.data.ChatMMAndUserInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatMMAndUserInfo chatMMAndUserInfo) {
            ChatMM chatMM = chatMMAndUserInfo.chatMM;
            int iM17230l = chatMM != null ? CodedOutputByteBufferNano.m17230l(1, chatMM, ChatMM.PROTOBUF_ADAPTER) : 0;
            ChatMMUserInfo chatMMUserInfo = chatMMAndUserInfo.userInformation;
            if (chatMMUserInfo != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, chatMMUserInfo, ChatMMUserInfo.PROTOBUF_ADAPTER);
            }
            chatMMAndUserInfo.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatMMAndUserInfo parse(nb5 nb5Var) throws IOException {
            ChatMMAndUserInfo chatMMAndUserInfo = new ChatMMAndUserInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (chatMMAndUserInfo.chatMM == null) {
                        chatMMAndUserInfo.chatMM = ChatMM.new_();
                    }
                    if (chatMMAndUserInfo.userInformation != null) {
                        break;
                    }
                    chatMMAndUserInfo.userInformation = ChatMMUserInfo.new_();
                    break;
                }
                if (iM158752u == 10) {
                    chatMMAndUserInfo.chatMM = (ChatMM) nb5Var.m158743l(ChatMM.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (chatMMAndUserInfo.chatMM == null) {
                            chatMMAndUserInfo.chatMM = ChatMM.new_();
                        }
                        if (chatMMAndUserInfo.userInformation != null) {
                            break;
                        }
                        chatMMAndUserInfo.userInformation = ChatMMUserInfo.new_();
                        return chatMMAndUserInfo;
                    }
                    chatMMAndUserInfo.userInformation = (ChatMMUserInfo) nb5Var.m158743l(ChatMMUserInfo.PROTOBUF_ADAPTER);
                }
            }
            return chatMMAndUserInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatMMAndUserInfo chatMMAndUserInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ChatMM chatMM = chatMMAndUserInfo.chatMM;
            if (chatMM != null) {
                codedOutputByteBufferNano.m17254K(1, chatMM, ChatMM.PROTOBUF_ADAPTER);
            }
            ChatMMUserInfo chatMMUserInfo = chatMMAndUserInfo.userInformation;
            if (chatMMUserInfo != null) {
                codedOutputByteBufferNano.m17254K(2, chatMMUserInfo, ChatMMUserInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ChatMMAndUserInfo> JSON_ADAPTER = new ObjectJsonAdapter<ChatMMAndUserInfo>() { // from class: com.p1.mobile.putong.core.data.ChatMMAndUserInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatMMAndUserInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatMMAndUserInfo newInstance() {
            return new ChatMMAndUserInfo();
        }

        public boolean parseField(ChatMMAndUserInfo chatMMAndUserInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("chatMM")) {
                chatMMAndUserInfo.chatMM = ChatMM.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("userInformation")) {
                return false;
            }
            chatMMAndUserInfo.userInformation = ChatMMUserInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ChatMMAndUserInfo chatMMAndUserInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("chatMM") || str.equals("userInformation")) {
                return true;
            }
            return super.parseFieldCheck(chatMMAndUserInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatMMAndUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatMMAndUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatMMAndUserInfo new_() {
        ChatMMAndUserInfo chatMMAndUserInfo = new ChatMMAndUserInfo();
        chatMMAndUserInfo.nullCheck();
        return chatMMAndUserInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatMMAndUserInfo mo223809clone() {
        ChatMMAndUserInfo chatMMAndUserInfo = new ChatMMAndUserInfo();
        ChatMM chatMM = this.chatMM;
        if (chatMM != null) {
            chatMMAndUserInfo.chatMM = chatMM.mo223809clone();
        }
        ChatMMUserInfo chatMMUserInfo = this.userInformation;
        if (chatMMUserInfo != null) {
            chatMMAndUserInfo.userInformation = chatMMUserInfo.mo223809clone();
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
        ChatMM chatMM = this.chatMM;
        int iHashCode = (i2 + (chatMM != null ? chatMM.hashCode() : 0)) * 41;
        ChatMMUserInfo chatMMUserInfo = this.userInformation;
        int iHashCode2 = iHashCode + (chatMMUserInfo != null ? chatMMUserInfo.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.chatMM == null) {
            this.chatMM = ChatMM.new_();
        }
        if (this.userInformation == null) {
            this.userInformation = ChatMMUserInfo.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
