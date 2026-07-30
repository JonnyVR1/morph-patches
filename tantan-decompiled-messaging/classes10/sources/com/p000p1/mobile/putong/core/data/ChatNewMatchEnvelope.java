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
public class ChatNewMatchEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatnewmatchenvelope";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public ChatNewMatchData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public NewMatchPaginationLinks pagination;
    public static ProtobufAdapter<ChatNewMatchEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatNewMatchEnvelope>() { // from class: com.p1.mobile.putong.core.data.ChatNewMatchEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatNewMatchEnvelope chatNewMatchEnvelope) {
            Meta meta = chatNewMatchEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            ChatNewMatchData chatNewMatchData = chatNewMatchEnvelope.data;
            if (chatNewMatchData != null) {
                iL += CodedOutputByteBufferNano.l(2, chatNewMatchData, ChatNewMatchData.PROTOBUF_ADAPTER);
            }
            NewMatchPaginationLinks newMatchPaginationLinks = chatNewMatchEnvelope.pagination;
            if (newMatchPaginationLinks != null) {
                iL += CodedOutputByteBufferNano.l(3, newMatchPaginationLinks, NewMatchPaginationLinks.PROTOBUF_ADAPTER);
            }
            ((MessageNano) chatNewMatchEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatNewMatchEnvelope m12097parse(nb5 nb5Var) throws IOException {
            ChatNewMatchEnvelope chatNewMatchEnvelope = new ChatNewMatchEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    chatNewMatchEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    chatNewMatchEnvelope.data = (ChatNewMatchData) nb5Var.l(ChatNewMatchData.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 26) {
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
                    chatNewMatchEnvelope.pagination = (NewMatchPaginationLinks) nb5Var.l(NewMatchPaginationLinks.PROTOBUF_ADAPTER);
                }
            }
            return chatNewMatchEnvelope;
        }

        public void serialize(ChatNewMatchEnvelope chatNewMatchEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = chatNewMatchEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            ChatNewMatchData chatNewMatchData = chatNewMatchEnvelope.data;
            if (chatNewMatchData != null) {
                codedOutputByteBufferNano.K(2, chatNewMatchData, ChatNewMatchData.PROTOBUF_ADAPTER);
            }
            NewMatchPaginationLinks newMatchPaginationLinks = chatNewMatchEnvelope.pagination;
            if (newMatchPaginationLinks != null) {
                codedOutputByteBufferNano.K(3, newMatchPaginationLinks, NewMatchPaginationLinks.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ChatNewMatchEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<ChatNewMatchEnvelope>() { // from class: com.p1.mobile.putong.core.data.ChatNewMatchEnvelope.2
        public Class getDataClass() {
            return ChatNewMatchEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatNewMatchEnvelope m12098newInstance() {
            return new ChatNewMatchEnvelope();
        }

        public boolean parseField(ChatNewMatchEnvelope chatNewMatchEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "data":
                    chatNewMatchEnvelope.data = (ChatNewMatchData) ChatNewMatchData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "meta":
                    chatNewMatchEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "pagination":
                    chatNewMatchEnvelope.pagination = (NewMatchPaginationLinks) NewMatchPaginationLinks.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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
                jsonGenerator.writeFieldName("pagination");
                NewMatchPaginationLinks.JSON_ADAPTER.serialize(chatNewMatchEnvelope.pagination, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatNewMatchEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatNewMatchEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatNewMatchEnvelope new_() {
        ChatNewMatchEnvelope chatNewMatchEnvelope = new ChatNewMatchEnvelope();
        chatNewMatchEnvelope.nullCheck();
        return chatNewMatchEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatNewMatchEnvelope m12096clone() {
        ChatNewMatchEnvelope chatNewMatchEnvelope = new ChatNewMatchEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            chatNewMatchEnvelope.meta = meta.clone();
        }
        ChatNewMatchData chatNewMatchData = this.data;
        if (chatNewMatchData != null) {
            chatNewMatchEnvelope.data = chatNewMatchData.m12092clone();
        }
        NewMatchPaginationLinks newMatchPaginationLinks = this.pagination;
        if (newMatchPaginationLinks != null) {
            chatNewMatchEnvelope.pagination = newMatchPaginationLinks.m14522clone();
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
        ChatNewMatchData chatNewMatchData = this.data;
        int iHashCode2 = (iHashCode + (chatNewMatchData != null ? chatNewMatchData.hashCode() : 0)) * 41;
        NewMatchPaginationLinks newMatchPaginationLinks = this.pagination;
        int iHashCode3 = iHashCode2 + (newMatchPaginationLinks != null ? newMatchPaginationLinks.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
