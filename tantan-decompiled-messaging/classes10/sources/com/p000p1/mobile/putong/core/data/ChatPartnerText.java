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
public class ChatPartnerText extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatpartnertext";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f31id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String value;
    public static ProtobufAdapter<ChatPartnerText> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatPartnerText>() { // from class: com.p1.mobile.putong.core.data.ChatPartnerText.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatPartnerText chatPartnerText) {
            String str = chatPartnerText.f31id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = chatPartnerText.value;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) chatPartnerText).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatPartnerText m12113parse(nb5 nb5Var) throws IOException {
            ChatPartnerText chatPartnerText = new ChatPartnerText();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (chatPartnerText.f31id == null) {
                        chatPartnerText.f31id = "";
                    }
                    if (chatPartnerText.value != null) {
                        break;
                    }
                    chatPartnerText.value = "";
                    break;
                }
                if (iU == 10) {
                    chatPartnerText.f31id = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (chatPartnerText.f31id == null) {
                            chatPartnerText.f31id = "";
                        }
                        if (chatPartnerText.value != null) {
                            break;
                        }
                        chatPartnerText.value = "";
                        return chatPartnerText;
                    }
                    chatPartnerText.value = nb5Var.s();
                }
            }
            return chatPartnerText;
        }

        public void serialize(ChatPartnerText chatPartnerText, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = chatPartnerText.f31id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = chatPartnerText.value;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<ChatPartnerText> JSON_ADAPTER = new ObjectJsonAdapter<ChatPartnerText>() { // from class: com.p1.mobile.putong.core.data.ChatPartnerText.2
        public Class getDataClass() {
            return ChatPartnerText.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatPartnerText m12114newInstance() {
            return new ChatPartnerText();
        }

        public boolean parseField(ChatPartnerText chatPartnerText, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                chatPartnerText.f31id = jsonParser.getValueAsString();
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

        public void serializeFields(ChatPartnerText chatPartnerText, JsonGenerator jsonGenerator) throws IOException {
            String str = chatPartnerText.f31id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = chatPartnerText.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatPartnerText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatPartnerText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatPartnerText new_() {
        ChatPartnerText chatPartnerText = new ChatPartnerText();
        chatPartnerText.nullCheck();
        return chatPartnerText;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatPartnerText m12112clone() {
        ChatPartnerText chatPartnerText = new ChatPartnerText();
        chatPartnerText.f31id = this.f31id;
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
        return ValueObject.util_equals(this.f31id, chatPartnerText.f31id) && ValueObject.util_equals(this.value, chatPartnerText.value);
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
        String str = this.f31id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.value;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f31id == null) {
            this.f31id = "";
        }
        if (this.value == null) {
            this.value = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
