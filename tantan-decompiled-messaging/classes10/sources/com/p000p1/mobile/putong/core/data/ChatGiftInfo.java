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
public class ChatGiftInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatgiftinfo";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String extra;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f23id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String momentID;
    public static ProtobufAdapter<ChatGiftInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatGiftInfo>() { // from class: com.p1.mobile.putong.core.data.ChatGiftInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatGiftInfo chatGiftInfo) {
            String str = chatGiftInfo.f23id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = chatGiftInfo.momentID;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = chatGiftInfo.extra;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) chatGiftInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatGiftInfo m12007parse(nb5 nb5Var) throws IOException {
            ChatGiftInfo chatGiftInfo = new ChatGiftInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (chatGiftInfo.f23id == null) {
                        chatGiftInfo.f23id = "";
                    }
                    if (chatGiftInfo.momentID == null) {
                        chatGiftInfo.momentID = "";
                    }
                    if (chatGiftInfo.extra != null) {
                        break;
                    }
                    chatGiftInfo.extra = "";
                    break;
                }
                if (iU == 10) {
                    chatGiftInfo.f23id = nb5Var.s();
                } else if (iU == 18) {
                    chatGiftInfo.momentID = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (chatGiftInfo.f23id == null) {
                            chatGiftInfo.f23id = "";
                        }
                        if (chatGiftInfo.momentID == null) {
                            chatGiftInfo.momentID = "";
                        }
                        if (chatGiftInfo.extra != null) {
                            break;
                        }
                        chatGiftInfo.extra = "";
                        return chatGiftInfo;
                    }
                    chatGiftInfo.extra = nb5Var.s();
                }
            }
            return chatGiftInfo;
        }

        public void serialize(ChatGiftInfo chatGiftInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = chatGiftInfo.f23id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = chatGiftInfo.momentID;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = chatGiftInfo.extra;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<ChatGiftInfo> JSON_ADAPTER = new ObjectJsonAdapter<ChatGiftInfo>() { // from class: com.p1.mobile.putong.core.data.ChatGiftInfo.2
        public Class getDataClass() {
            return ChatGiftInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatGiftInfo m12008newInstance() {
            return new ChatGiftInfo();
        }

        public boolean parseField(ChatGiftInfo chatGiftInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "momentID":
                    chatGiftInfo.momentID = jsonParser.getValueAsString();
                    return true;
                case "id":
                    chatGiftInfo.f23id = jsonParser.getValueAsString();
                    return false;
                case "extra":
                    chatGiftInfo.extra = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChatGiftInfo chatGiftInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "momentID":
                    return true;
                case "id":
                    return false;
                case "extra":
                    return true;
                default:
                    return super.parseFieldCheck(chatGiftInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ChatGiftInfo chatGiftInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = chatGiftInfo.f23id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = chatGiftInfo.momentID;
            if (str2 != null) {
                jsonGenerator.writeStringField("momentID", str2);
            }
            String str3 = chatGiftInfo.extra;
            if (str3 != null) {
                jsonGenerator.writeStringField("extra", str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatGiftInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatGiftInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatGiftInfo new_() {
        ChatGiftInfo chatGiftInfo = new ChatGiftInfo();
        chatGiftInfo.nullCheck();
        return chatGiftInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatGiftInfo m12006clone() {
        ChatGiftInfo chatGiftInfo = new ChatGiftInfo();
        chatGiftInfo.f23id = this.f23id;
        chatGiftInfo.momentID = this.momentID;
        chatGiftInfo.extra = this.extra;
        return chatGiftInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatGiftInfo)) {
            return false;
        }
        ChatGiftInfo chatGiftInfo = (ChatGiftInfo) obj;
        return ValueObject.util_equals(this.f23id, chatGiftInfo.f23id) && ValueObject.util_equals(this.momentID, chatGiftInfo.momentID) && ValueObject.util_equals(this.extra, chatGiftInfo.extra);
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
        String str = this.f23id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.momentID;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.extra;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f23id == null) {
            this.f23id = "";
        }
        if (this.momentID == null) {
            this.momentID = "";
        }
        if (this.extra == null) {
            this.extra = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
