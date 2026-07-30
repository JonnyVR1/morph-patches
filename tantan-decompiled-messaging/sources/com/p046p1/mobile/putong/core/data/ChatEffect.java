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
public class ChatEffect extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chateffect";

    @NonNull
    @ProtobufIndex(index = 2)
    public String androidUrl;

    @ProtobufIndex(index = 1)
    public boolean open;
    public static ProtobufAdapter<ChatEffect> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatEffect>() { // from class: com.p1.mobile.putong.core.data.ChatEffect.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatEffect chatEffect) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, chatEffect.open);
            String str = chatEffect.androidUrl;
            if (str != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(2, str);
            }
            chatEffect.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatEffect parse(nb5 nb5Var) throws IOException {
            ChatEffect chatEffect = new ChatEffect();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (chatEffect.androidUrl != null) {
                        break;
                    }
                    chatEffect.androidUrl = "";
                    break;
                }
                if (iM158752u == 8) {
                    chatEffect.open = nb5Var.m158738g();
                } else {
                    if (iM158752u != 18) {
                        if (chatEffect.androidUrl != null) {
                            break;
                        }
                        chatEffect.androidUrl = "";
                        return chatEffect;
                    }
                    chatEffect.androidUrl = nb5Var.m158750s();
                }
            }
            return chatEffect;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatEffect chatEffect, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, chatEffect.open);
            String str = chatEffect.androidUrl;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
        }
    };
    public static JsonAdapter<ChatEffect> JSON_ADAPTER = new ObjectJsonAdapter<ChatEffect>() { // from class: com.p1.mobile.putong.core.data.ChatEffect.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatEffect.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatEffect newInstance() {
            return new ChatEffect();
        }

        public boolean parseField(ChatEffect chatEffect, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("open")) {
                chatEffect.open = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("androidUrl")) {
                return false;
            }
            chatEffect.androidUrl = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(ChatEffect chatEffect, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("open") || str.equals("androidUrl")) {
                return true;
            }
            return super.parseFieldCheck(chatEffect, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatEffect chatEffect, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("open", chatEffect.open);
            String str = chatEffect.androidUrl;
            if (str != null) {
                jsonGenerator.writeStringField("androidUrl", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatEffect) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatEffect) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatEffect new_() {
        ChatEffect chatEffect = new ChatEffect();
        chatEffect.nullCheck();
        return chatEffect;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatEffect mo223809clone() {
        ChatEffect chatEffect = new ChatEffect();
        chatEffect.open = this.open;
        chatEffect.androidUrl = this.androidUrl;
        return chatEffect;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatEffect)) {
            return false;
        }
        ChatEffect chatEffect = (ChatEffect) obj;
        return this.open == chatEffect.open && ValueObject.util_equals(this.androidUrl, chatEffect.androidUrl);
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
        int i2 = ((i * 41) + (this.open ? 1231 : 1237)) * 41;
        String str = this.androidUrl;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.androidUrl == null) {
            this.androidUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
