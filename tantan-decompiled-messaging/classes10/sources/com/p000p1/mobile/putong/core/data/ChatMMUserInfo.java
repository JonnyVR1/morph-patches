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
public class ChatMMUserInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatmmuserinfo";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String otherUserId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String otherUserPicture;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String userPicture;
    public static ProtobufAdapter<ChatMMUserInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatMMUserInfo>() { // from class: com.p1.mobile.putong.core.data.ChatMMUserInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatMMUserInfo chatMMUserInfo) {
            String str = chatMMUserInfo.userId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = chatMMUserInfo.userPicture;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = chatMMUserInfo.otherUserId;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = chatMMUserInfo.otherUserPicture;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) chatMMUserInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatMMUserInfo m12089parse(nb5 nb5Var) throws IOException {
            ChatMMUserInfo chatMMUserInfo = new ChatMMUserInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (chatMMUserInfo.userId == null) {
                        chatMMUserInfo.userId = "";
                    }
                    if (chatMMUserInfo.userPicture == null) {
                        chatMMUserInfo.userPicture = "";
                    }
                    if (chatMMUserInfo.otherUserId == null) {
                        chatMMUserInfo.otherUserId = "";
                    }
                    if (chatMMUserInfo.otherUserPicture != null) {
                        break;
                    }
                    chatMMUserInfo.otherUserPicture = "";
                    break;
                }
                if (iU == 10) {
                    chatMMUserInfo.userId = nb5Var.s();
                } else if (iU == 18) {
                    chatMMUserInfo.userPicture = nb5Var.s();
                } else if (iU == 26) {
                    chatMMUserInfo.otherUserId = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (chatMMUserInfo.userId == null) {
                            chatMMUserInfo.userId = "";
                        }
                        if (chatMMUserInfo.userPicture == null) {
                            chatMMUserInfo.userPicture = "";
                        }
                        if (chatMMUserInfo.otherUserId == null) {
                            chatMMUserInfo.otherUserId = "";
                        }
                        if (chatMMUserInfo.otherUserPicture != null) {
                            break;
                        }
                        chatMMUserInfo.otherUserPicture = "";
                        return chatMMUserInfo;
                    }
                    chatMMUserInfo.otherUserPicture = nb5Var.s();
                }
            }
            return chatMMUserInfo;
        }

        public void serialize(ChatMMUserInfo chatMMUserInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = chatMMUserInfo.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = chatMMUserInfo.userPicture;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = chatMMUserInfo.otherUserId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = chatMMUserInfo.otherUserPicture;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<ChatMMUserInfo> JSON_ADAPTER = new ObjectJsonAdapter<ChatMMUserInfo>() { // from class: com.p1.mobile.putong.core.data.ChatMMUserInfo.2
        public Class getDataClass() {
            return ChatMMUserInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatMMUserInfo m12090newInstance() {
            return new ChatMMUserInfo();
        }

        public boolean parseField(ChatMMUserInfo chatMMUserInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherUserId":
                    chatMMUserInfo.otherUserId = jsonParser.getValueAsString();
                    return true;
                case "userPicture":
                    chatMMUserInfo.userPicture = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    chatMMUserInfo.userId = jsonParser.getValueAsString();
                    return true;
                case "otherUserPicture":
                    chatMMUserInfo.otherUserPicture = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChatMMUserInfo chatMMUserInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "otherUserId":
                case "userPicture":
                case "userId":
                case "otherUserPicture":
                    return true;
                default:
                    return super.parseFieldCheck(chatMMUserInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ChatMMUserInfo chatMMUserInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = chatMMUserInfo.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = chatMMUserInfo.userPicture;
            if (str2 != null) {
                jsonGenerator.writeStringField("userPicture", str2);
            }
            String str3 = chatMMUserInfo.otherUserId;
            if (str3 != null) {
                jsonGenerator.writeStringField("otherUserId", str3);
            }
            String str4 = chatMMUserInfo.otherUserPicture;
            if (str4 != null) {
                jsonGenerator.writeStringField("otherUserPicture", str4);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatMMUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatMMUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatMMUserInfo new_() {
        ChatMMUserInfo chatMMUserInfo = new ChatMMUserInfo();
        chatMMUserInfo.nullCheck();
        return chatMMUserInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatMMUserInfo m12088clone() {
        ChatMMUserInfo chatMMUserInfo = new ChatMMUserInfo();
        chatMMUserInfo.userId = this.userId;
        chatMMUserInfo.userPicture = this.userPicture;
        chatMMUserInfo.otherUserId = this.otherUserId;
        chatMMUserInfo.otherUserPicture = this.otherUserPicture;
        return chatMMUserInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatMMUserInfo)) {
            return false;
        }
        ChatMMUserInfo chatMMUserInfo = (ChatMMUserInfo) obj;
        return ValueObject.util_equals(this.userId, chatMMUserInfo.userId) && ValueObject.util_equals(this.userPicture, chatMMUserInfo.userPicture) && ValueObject.util_equals(this.otherUserId, chatMMUserInfo.otherUserId) && ValueObject.util_equals(this.otherUserPicture, chatMMUserInfo.otherUserPicture);
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userPicture;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.otherUserId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.otherUserPicture;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.userPicture == null) {
            this.userPicture = "";
        }
        if (this.otherUserId == null) {
            this.otherUserId = "";
        }
        if (this.otherUserPicture == null) {
            this.otherUserPicture = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
