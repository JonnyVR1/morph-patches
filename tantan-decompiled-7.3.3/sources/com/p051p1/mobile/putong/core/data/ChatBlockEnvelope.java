package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Meta;
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
public class ChatBlockEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatblockenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public ChatBlockData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<ChatBlockEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatBlockEnvelope>() { // from class: com.p1.mobile.putong.core.data.ChatBlockEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatBlockEnvelope chatBlockEnvelope) {
            Meta meta = chatBlockEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            ChatBlockData chatBlockData = chatBlockEnvelope.data;
            if (chatBlockData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, chatBlockData, ChatBlockData.PROTOBUF_ADAPTER);
            }
            chatBlockEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatBlockEnvelope parse(nc5 nc5Var) throws IOException {
            ChatBlockEnvelope chatBlockEnvelope = new ChatBlockEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (chatBlockEnvelope.meta == null) {
                        chatBlockEnvelope.meta = Meta.new_();
                    }
                    if (chatBlockEnvelope.data != null) {
                        break;
                    }
                    chatBlockEnvelope.data = ChatBlockData.new_();
                    break;
                }
                if (iM162497u == 10) {
                    chatBlockEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (chatBlockEnvelope.meta == null) {
                            chatBlockEnvelope.meta = Meta.new_();
                        }
                        if (chatBlockEnvelope.data != null) {
                            break;
                        }
                        chatBlockEnvelope.data = ChatBlockData.new_();
                        return chatBlockEnvelope;
                    }
                    chatBlockEnvelope.data = (ChatBlockData) nc5Var.m162488l(ChatBlockData.PROTOBUF_ADAPTER);
                }
            }
            return chatBlockEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatBlockEnvelope chatBlockEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = chatBlockEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            ChatBlockData chatBlockData = chatBlockEnvelope.data;
            if (chatBlockData != null) {
                codedOutputByteBufferNano.m17309K(2, chatBlockData, ChatBlockData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ChatBlockEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<ChatBlockEnvelope>() { // from class: com.p1.mobile.putong.core.data.ChatBlockEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatBlockEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatBlockEnvelope newInstance() {
            return new ChatBlockEnvelope();
        }

        public boolean parseField(ChatBlockEnvelope chatBlockEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                chatBlockEnvelope.data = ChatBlockData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            chatBlockEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ChatBlockEnvelope chatBlockEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(chatBlockEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatBlockEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatBlockEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatBlockEnvelope new_() {
        ChatBlockEnvelope chatBlockEnvelope = new ChatBlockEnvelope();
        chatBlockEnvelope.nullCheck();
        return chatBlockEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatBlockEnvelope mo225055clone() {
        ChatBlockEnvelope chatBlockEnvelope = new ChatBlockEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            chatBlockEnvelope.meta = meta.mo225055clone();
        }
        ChatBlockData chatBlockData = this.data;
        if (chatBlockData != null) {
            chatBlockEnvelope.data = chatBlockData.mo225055clone();
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
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        ChatBlockData chatBlockData = this.data;
        int iHashCode2 = iHashCode + (chatBlockData != null ? chatBlockData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = ChatBlockData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
