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
public class ChatPartnerText extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatpartnertext";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20369id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String value;
    public static ProtobufAdapter<ChatPartnerText> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatPartnerText>() { // from class: com.p1.mobile.putong.core.data.ChatPartnerText.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatPartnerText chatPartnerText) {
            String str = chatPartnerText.f20369id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = chatPartnerText.value;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            chatPartnerText.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatPartnerText parse(nb5 nb5Var) throws IOException {
            ChatPartnerText chatPartnerText = new ChatPartnerText();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (chatPartnerText.f20369id == null) {
                        chatPartnerText.f20369id = "";
                    }
                    if (chatPartnerText.value != null) {
                        break;
                    }
                    chatPartnerText.value = "";
                    break;
                }
                if (iM158752u == 10) {
                    chatPartnerText.f20369id = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (chatPartnerText.f20369id == null) {
                            chatPartnerText.f20369id = "";
                        }
                        if (chatPartnerText.value != null) {
                            break;
                        }
                        chatPartnerText.value = "";
                        return chatPartnerText;
                    }
                    chatPartnerText.value = nb5Var.m158750s();
                }
            }
            return chatPartnerText;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatPartnerText chatPartnerText, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = chatPartnerText.f20369id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = chatPartnerText.value;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<ChatPartnerText> JSON_ADAPTER = new ObjectJsonAdapter<ChatPartnerText>() { // from class: com.p1.mobile.putong.core.data.ChatPartnerText.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatPartnerText.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatPartnerText newInstance() {
            return new ChatPartnerText();
        }

        public boolean parseField(ChatPartnerText chatPartnerText, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                chatPartnerText.f20369id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("value")) {
                return false;
            }
            chatPartnerText.value = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(ChatPartnerText chatPartnerText, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("value")) {
                return true;
            }
            return super.parseFieldCheck(chatPartnerText, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatPartnerText chatPartnerText, JsonGenerator jsonGenerator) throws IOException {
            String str = chatPartnerText.f20369id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = chatPartnerText.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatPartnerText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatPartnerText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatPartnerText new_() {
        ChatPartnerText chatPartnerText = new ChatPartnerText();
        chatPartnerText.nullCheck();
        return chatPartnerText;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatPartnerText mo223809clone() {
        ChatPartnerText chatPartnerText = new ChatPartnerText();
        chatPartnerText.f20369id = this.f20369id;
        chatPartnerText.value = this.value;
        return chatPartnerText;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatPartnerText)) {
            return false;
        }
        ChatPartnerText chatPartnerText = (ChatPartnerText) obj;
        return ValueObject.util_equals(this.f20369id, chatPartnerText.f20369id) && ValueObject.util_equals(this.value, chatPartnerText.value);
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
        String str = this.f20369id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.value;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20369id == null) {
            this.f20369id = "";
        }
        if (this.value == null) {
            this.value = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
