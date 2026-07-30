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
public class ChatBlockData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatblockdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public ChatBlockStatus status;
    public static ProtobufAdapter<ChatBlockData> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatBlockData>() { // from class: com.p1.mobile.putong.core.data.ChatBlockData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatBlockData chatBlockData) {
            ChatBlockStatus chatBlockStatus = chatBlockData.status;
            int iH = chatBlockStatus != null ? CodedOutputByteBufferNano.h(1, chatBlockStatus.ordinal()) : 0;
            ChatBlockStatus chatBlockStatus2 = chatBlockData.status;
            if (chatBlockStatus2 != null) {
                iH += CodedOutputByteBufferNano.l(2, chatBlockStatus2, ChatBlockStatus.PROTOBUF_ADAPTER);
            }
            ((MessageNano) chatBlockData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatBlockData m11989parse(nb5 nb5Var) throws IOException {
            ChatBlockData chatBlockData = new ChatBlockData();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (chatBlockData.status == null && numValueOf != null) {
                        chatBlockData.status = (ChatBlockStatus) ChatBlockStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                    }
                    if (chatBlockData.status != null) {
                        break;
                    }
                    chatBlockData.status = (ChatBlockStatus) ChatBlockStatus.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 8) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else {
                    if (iU != 18) {
                        if (chatBlockData.status == null && numValueOf != null) {
                            chatBlockData.status = (ChatBlockStatus) ChatBlockStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (chatBlockData.status != null) {
                            break;
                        }
                        chatBlockData.status = (ChatBlockStatus) ChatBlockStatus.JSON_ADAPTER.defaultEnum();
                        return chatBlockData;
                    }
                    chatBlockData.status = (ChatBlockStatus) nb5Var.l(ChatBlockStatus.PROTOBUF_ADAPTER);
                }
            }
            return chatBlockData;
        }

        public void serialize(ChatBlockData chatBlockData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ChatBlockStatus chatBlockStatus = chatBlockData.status;
            if (chatBlockStatus != null) {
                codedOutputByteBufferNano.G(1, chatBlockStatus.ordinal());
            }
            ChatBlockStatus chatBlockStatus2 = chatBlockData.status;
            if (chatBlockStatus2 != null) {
                codedOutputByteBufferNano.K(2, chatBlockStatus2, ChatBlockStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ChatBlockData> JSON_ADAPTER = new ObjectJsonAdapter<ChatBlockData>() { // from class: com.p1.mobile.putong.core.data.ChatBlockData.2
        public Class getDataClass() {
            return ChatBlockData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatBlockData m11990newInstance() {
            return new ChatBlockData();
        }

        public boolean parseField(ChatBlockData chatBlockData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("status")) {
                return false;
            }
            chatBlockData.status = (ChatBlockStatus) ChatBlockStatus.JSON_ADAPTER.parse(jsonParser, str2);
            return true;
        }

        public boolean parseFieldCheck(ChatBlockData chatBlockData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("status")) {
                return true;
            }
            return super.parseFieldCheck(chatBlockData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ChatBlockData chatBlockData, JsonGenerator jsonGenerator) throws IOException {
            if (chatBlockData.status != null) {
                jsonGenerator.writeFieldName("status");
                ChatBlockStatus.JSON_ADAPTER.serialize(chatBlockData.status, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatBlockData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatBlockData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatBlockData new_() {
        ChatBlockData chatBlockData = new ChatBlockData();
        chatBlockData.nullCheck();
        return chatBlockData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatBlockData m11988clone() {
        ChatBlockData chatBlockData = new ChatBlockData();
        chatBlockData.status = this.status;
        return chatBlockData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ChatBlockData) {
            return ValueObject.util_equals(this.status, ((ChatBlockData) obj).status);
        }
        return false;
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
        ChatBlockStatus chatBlockStatus = this.status;
        int iHashCode = i2 + (chatBlockStatus != null ? chatBlockStatus.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.status == null) {
            this.status = (ChatBlockStatus) ChatBlockStatus.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
