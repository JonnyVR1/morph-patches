package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.data.Pagination;
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
public class ChatNewMatchEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatnewmatchenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public ChatNewMatchData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;

    @NonNull
    @ProtobufIndex(index = 3)
    public NewMatchPaginationLinks pagination;
    public static ProtobufAdapter<ChatNewMatchEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatNewMatchEnvelope>() { // from class: com.p1.mobile.putong.core.data.ChatNewMatchEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatNewMatchEnvelope chatNewMatchEnvelope) {
            Meta meta = chatNewMatchEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            ChatNewMatchData chatNewMatchData = chatNewMatchEnvelope.data;
            if (chatNewMatchData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, chatNewMatchData, ChatNewMatchData.PROTOBUF_ADAPTER);
            }
            NewMatchPaginationLinks newMatchPaginationLinks = chatNewMatchEnvelope.pagination;
            if (newMatchPaginationLinks != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, newMatchPaginationLinks, NewMatchPaginationLinks.PROTOBUF_ADAPTER);
            }
            chatNewMatchEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatNewMatchEnvelope parse(nc5 nc5Var) throws IOException {
            ChatNewMatchEnvelope chatNewMatchEnvelope = new ChatNewMatchEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (chatNewMatchEnvelope.meta == null) {
                        chatNewMatchEnvelope.meta = Meta.new_();
                    }
                    if (chatNewMatchEnvelope.data == null) {
                        chatNewMatchEnvelope.data = ChatNewMatchData.new_();
                    }
                    if (chatNewMatchEnvelope.pagination != null) {
                        break;
                    }
                    chatNewMatchEnvelope.pagination = NewMatchPaginationLinks.new_();
                    break;
                }
                if (iM162497u == 10) {
                    chatNewMatchEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else if (iM162497u == 18) {
                    chatNewMatchEnvelope.data = (ChatNewMatchData) nc5Var.m162488l(ChatNewMatchData.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 26) {
                        if (chatNewMatchEnvelope.meta == null) {
                            chatNewMatchEnvelope.meta = Meta.new_();
                        }
                        if (chatNewMatchEnvelope.data == null) {
                            chatNewMatchEnvelope.data = ChatNewMatchData.new_();
                        }
                        if (chatNewMatchEnvelope.pagination != null) {
                            break;
                        }
                        chatNewMatchEnvelope.pagination = NewMatchPaginationLinks.new_();
                        return chatNewMatchEnvelope;
                    }
                    chatNewMatchEnvelope.pagination = (NewMatchPaginationLinks) nc5Var.m162488l(NewMatchPaginationLinks.PROTOBUF_ADAPTER);
                }
            }
            return chatNewMatchEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatNewMatchEnvelope chatNewMatchEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = chatNewMatchEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            ChatNewMatchData chatNewMatchData = chatNewMatchEnvelope.data;
            if (chatNewMatchData != null) {
                codedOutputByteBufferNano.m17309K(2, chatNewMatchData, ChatNewMatchData.PROTOBUF_ADAPTER);
            }
            NewMatchPaginationLinks newMatchPaginationLinks = chatNewMatchEnvelope.pagination;
            if (newMatchPaginationLinks != null) {
                codedOutputByteBufferNano.m17309K(3, newMatchPaginationLinks, NewMatchPaginationLinks.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ChatNewMatchEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<ChatNewMatchEnvelope>() { // from class: com.p1.mobile.putong.core.data.ChatNewMatchEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatNewMatchEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatNewMatchEnvelope newInstance() {
            return new ChatNewMatchEnvelope();
        }

        public boolean parseField(ChatNewMatchEnvelope chatNewMatchEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "data":
                    chatNewMatchEnvelope.data = ChatNewMatchData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "meta":
                    chatNewMatchEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "pagination":
                    chatNewMatchEnvelope.pagination = NewMatchPaginationLinks.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChatNewMatchEnvelope chatNewMatchEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "data":
                case "meta":
                case "pagination":
                    return true;
                default:
                    return super.parseFieldCheck(chatNewMatchEnvelope, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatNewMatchEnvelope chatNewMatchEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (chatNewMatchEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(chatNewMatchEnvelope.meta, jsonGenerator, true);
            }
            if (chatNewMatchEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                ChatNewMatchData.JSON_ADAPTER.serialize(chatNewMatchEnvelope.data, jsonGenerator, true);
            }
            if (chatNewMatchEnvelope.pagination != null) {
                jsonGenerator.writeFieldName(Pagination.TYPE);
                NewMatchPaginationLinks.JSON_ADAPTER.serialize(chatNewMatchEnvelope.pagination, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatNewMatchEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatNewMatchEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatNewMatchEnvelope new_() {
        ChatNewMatchEnvelope chatNewMatchEnvelope = new ChatNewMatchEnvelope();
        chatNewMatchEnvelope.nullCheck();
        return chatNewMatchEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatNewMatchEnvelope mo225055clone() {
        ChatNewMatchEnvelope chatNewMatchEnvelope = new ChatNewMatchEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            chatNewMatchEnvelope.meta = meta.mo225055clone();
        }
        ChatNewMatchData chatNewMatchData = this.data;
        if (chatNewMatchData != null) {
            chatNewMatchEnvelope.data = chatNewMatchData.mo225055clone();
        }
        NewMatchPaginationLinks newMatchPaginationLinks = this.pagination;
        if (newMatchPaginationLinks != null) {
            chatNewMatchEnvelope.pagination = newMatchPaginationLinks.mo225055clone();
        }
        return chatNewMatchEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatNewMatchEnvelope)) {
            return false;
        }
        ChatNewMatchEnvelope chatNewMatchEnvelope = (ChatNewMatchEnvelope) obj;
        return ValueObject.util_equals(this.meta, chatNewMatchEnvelope.meta) && ValueObject.util_equals(this.data, chatNewMatchEnvelope.data) && ValueObject.util_equals(this.pagination, chatNewMatchEnvelope.pagination);
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
        ChatNewMatchData chatNewMatchData = this.data;
        int iHashCode2 = (iHashCode + (chatNewMatchData != null ? chatNewMatchData.hashCode() : 0)) * 41;
        NewMatchPaginationLinks newMatchPaginationLinks = this.pagination;
        int iHashCode3 = iHashCode2 + (newMatchPaginationLinks != null ? newMatchPaginationLinks.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = ChatNewMatchData.new_();
        }
        if (this.pagination == null) {
            this.pagination = NewMatchPaginationLinks.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
