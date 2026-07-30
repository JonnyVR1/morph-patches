package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
public class ChatGiftInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatgiftinfo";

    @NonNull
    @ProtobufIndex(index = 3)
    public String extra;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21103id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String momentID;
    public static ProtobufAdapter<ChatGiftInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatGiftInfo>() { // from class: com.p1.mobile.putong.core.data.ChatGiftInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatGiftInfo chatGiftInfo) {
            String str = chatGiftInfo.f21103id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = chatGiftInfo.momentID;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = chatGiftInfo.extra;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            chatGiftInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatGiftInfo parse(nc5 nc5Var) throws IOException {
            ChatGiftInfo chatGiftInfo = new ChatGiftInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (chatGiftInfo.f21103id == null) {
                        chatGiftInfo.f21103id = "";
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
                if (iM162497u == 10) {
                    chatGiftInfo.f21103id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    chatGiftInfo.momentID = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (chatGiftInfo.f21103id == null) {
                            chatGiftInfo.f21103id = "";
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
                    chatGiftInfo.extra = nc5Var.m162495s();
                }
            }
            return chatGiftInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatGiftInfo chatGiftInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = chatGiftInfo.f21103id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = chatGiftInfo.momentID;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = chatGiftInfo.extra;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
        }
    };
    public static JsonAdapter<ChatGiftInfo> JSON_ADAPTER = new ObjectJsonAdapter<ChatGiftInfo>() { // from class: com.p1.mobile.putong.core.data.ChatGiftInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatGiftInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatGiftInfo newInstance() {
            return new ChatGiftInfo();
        }

        public boolean parseField(ChatGiftInfo chatGiftInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "momentID":
                    chatGiftInfo.momentID = jsonParser.getValueAsString();
                    return true;
                case "id":
                    chatGiftInfo.f21103id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatGiftInfo chatGiftInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = chatGiftInfo.f21103id;
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatGiftInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatGiftInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatGiftInfo new_() {
        ChatGiftInfo chatGiftInfo = new ChatGiftInfo();
        chatGiftInfo.nullCheck();
        return chatGiftInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatGiftInfo mo225055clone() {
        ChatGiftInfo chatGiftInfo = new ChatGiftInfo();
        chatGiftInfo.f21103id = this.f21103id;
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
        return ValueObject.util_equals(this.f21103id, chatGiftInfo.f21103id) && ValueObject.util_equals(this.momentID, chatGiftInfo.momentID) && ValueObject.util_equals(this.extra, chatGiftInfo.extra);
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
        String str = this.f21103id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.momentID;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.extra;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21103id == null) {
            this.f21103id = "";
        }
        if (this.momentID == null) {
            this.momentID = "";
        }
        if (this.extra == null) {
            this.extra = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
