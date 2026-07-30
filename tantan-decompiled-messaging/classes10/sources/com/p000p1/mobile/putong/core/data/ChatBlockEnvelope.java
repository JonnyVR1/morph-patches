package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Meta;
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
public class ChatBlockEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatblockenvelope";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public ChatBlockData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<ChatBlockEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatBlockEnvelope>() { // from class: com.p1.mobile.putong.core.data.ChatBlockEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatBlockEnvelope chatBlockEnvelope) {
            Meta meta = chatBlockEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            ChatBlockData chatBlockData = chatBlockEnvelope.data;
            if (chatBlockData != null) {
                iL += CodedOutputByteBufferNano.l(2, chatBlockData, ChatBlockData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) chatBlockEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatBlockEnvelope m11993parse(nb5 nb5Var) throws IOException {
            ChatBlockEnvelope chatBlockEnvelope = new ChatBlockEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (chatBlockEnvelope.meta == null) {
                        chatBlockEnvelope.meta = Meta.new_();
                    }
                    if (chatBlockEnvelope.data != null) {
                        break;
                    }
                    chatBlockEnvelope.data = ChatBlockData.new_();
                    break;
                }
                if (iU == 10) {
                    chatBlockEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (chatBlockEnvelope.meta == null) {
                            chatBlockEnvelope.meta = Meta.new_();
                        }
                        if (chatBlockEnvelope.data != null) {
                            break;
                        }
                        chatBlockEnvelope.data = ChatBlockData.new_();
                        return chatBlockEnvelope;
                    }
                    chatBlockEnvelope.data = (ChatBlockData) nb5Var.l(ChatBlockData.PROTOBUF_ADAPTER);
                }
            }
            return chatBlockEnvelope;
        }

        public void serialize(ChatBlockEnvelope chatBlockEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = chatBlockEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            ChatBlockData chatBlockData = chatBlockEnvelope.data;
            if (chatBlockData != null) {
                codedOutputByteBufferNano.K(2, chatBlockData, ChatBlockData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ChatBlockEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<ChatBlockEnvelope>() { // from class: com.p1.mobile.putong.core.data.ChatBlockEnvelope.2
        public Class getDataClass() {
            return ChatBlockEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatBlockEnvelope m11994newInstance() {
            return new ChatBlockEnvelope();
        }

        public boolean parseField(ChatBlockEnvelope chatBlockEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                chatBlockEnvelope.data = (ChatBlockData) ChatBlockData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            chatBlockEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ChatBlockEnvelope chatBlockEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(chatBlockEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ChatBlockEnvelope chatBlockEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (chatBlockEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(chatBlockEnvelope.meta, jsonGenerator, true);
            }
            if (chatBlockEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                ChatBlockData.JSON_ADAPTER.serialize(chatBlockEnvelope.data, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatBlockEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatBlockEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatBlockEnvelope new_() {
        ChatBlockEnvelope chatBlockEnvelope = new ChatBlockEnvelope();
        chatBlockEnvelope.nullCheck();
        return chatBlockEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatBlockEnvelope m11992clone() {
        ChatBlockEnvelope chatBlockEnvelope = new ChatBlockEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            chatBlockEnvelope.meta = meta.clone();
        }
        ChatBlockData chatBlockData = this.data;
        if (chatBlockData != null) {
            chatBlockEnvelope.data = chatBlockData.m11988clone();
        }
        return chatBlockEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatBlockEnvelope)) {
            return false;
        }
        ChatBlockEnvelope chatBlockEnvelope = (ChatBlockEnvelope) obj;
        return ValueObject.util_equals(this.meta, chatBlockEnvelope.meta) && ValueObject.util_equals(this.data, chatBlockEnvelope.data);
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
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        ChatBlockData chatBlockData = this.data;
        int iHashCode2 = iHashCode + (chatBlockData != null ? chatBlockData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = ChatBlockData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
