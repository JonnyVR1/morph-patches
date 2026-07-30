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
public class ChatEffect extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chateffect";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String androidUrl;

    @ProtobufIndex(index = 1)
    public boolean open;
    public static ProtobufAdapter<ChatEffect> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatEffect>() { // from class: com.p1.mobile.putong.core.data.ChatEffect.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatEffect chatEffect) {
            int iB = CodedOutputByteBufferNano.b(1, chatEffect.open);
            String str = chatEffect.androidUrl;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) chatEffect).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatEffect m11999parse(nb5 nb5Var) throws IOException {
            ChatEffect chatEffect = new ChatEffect();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (chatEffect.androidUrl != null) {
                        break;
                    }
                    chatEffect.androidUrl = "";
                    break;
                }
                if (iU == 8) {
                    chatEffect.open = nb5Var.g();
                } else {
                    if (iU != 18) {
                        if (chatEffect.androidUrl != null) {
                            break;
                        }
                        chatEffect.androidUrl = "";
                        return chatEffect;
                    }
                    chatEffect.androidUrl = nb5Var.s();
                }
            }
            return chatEffect;
        }

        public void serialize(ChatEffect chatEffect, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, chatEffect.open);
            String str = chatEffect.androidUrl;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<ChatEffect> JSON_ADAPTER = new ObjectJsonAdapter<ChatEffect>() { // from class: com.p1.mobile.putong.core.data.ChatEffect.2
        public Class getDataClass() {
            return ChatEffect.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatEffect m12000newInstance() {
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

        public void serializeFields(ChatEffect chatEffect, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("open", chatEffect.open);
            String str = chatEffect.androidUrl;
            if (str != null) {
                jsonGenerator.writeStringField("androidUrl", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatEffect) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatEffect) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatEffect new_() {
        ChatEffect chatEffect = new ChatEffect();
        chatEffect.nullCheck();
        return chatEffect;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatEffect m11998clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.open ? 1231 : 1237)) * 41;
        String str = this.androidUrl;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.androidUrl == null) {
            this.androidUrl = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
