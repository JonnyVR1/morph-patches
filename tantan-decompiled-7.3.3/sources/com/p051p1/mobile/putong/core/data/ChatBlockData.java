package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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
public class ChatBlockData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatblockdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public ChatBlockStatus status;
    public static ProtobufAdapter<ChatBlockData> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatBlockData>() { // from class: com.p1.mobile.putong.core.data.ChatBlockData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatBlockData chatBlockData) {
            ChatBlockStatus chatBlockStatus = chatBlockData.status;
            int iM17281h = chatBlockStatus != null ? CodedOutputByteBufferNano.m17281h(1, chatBlockStatus.ordinal()) : 0;
            ChatBlockStatus chatBlockStatus2 = chatBlockData.status;
            if (chatBlockStatus2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(2, chatBlockStatus2, ChatBlockStatus.PROTOBUF_ADAPTER);
            }
            chatBlockData.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatBlockData parse(nc5 nc5Var) throws IOException {
            ChatBlockData chatBlockData = new ChatBlockData();
            Integer numValueOf = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (chatBlockData.status == null && numValueOf != null) {
                        chatBlockData.status = (ChatBlockStatus) ChatBlockStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (chatBlockData.status != null) {
                        break;
                    }
                    chatBlockData.status = (ChatBlockStatus) ChatBlockStatus.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM162497u == 8) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else {
                    if (iM162497u != 18) {
                        if (chatBlockData.status == null && numValueOf != null) {
                            chatBlockData.status = (ChatBlockStatus) ChatBlockStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (chatBlockData.status != null) {
                            break;
                        }
                        chatBlockData.status = (ChatBlockStatus) ChatBlockStatus.JSON_ADAPTER.defaultEnum();
                        return chatBlockData;
                    }
                    chatBlockData.status = (ChatBlockStatus) nc5Var.m162488l(ChatBlockStatus.PROTOBUF_ADAPTER);
                }
            }
            return chatBlockData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatBlockData chatBlockData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ChatBlockStatus chatBlockStatus = chatBlockData.status;
            if (chatBlockStatus != null) {
                codedOutputByteBufferNano.m17305G(1, chatBlockStatus.ordinal());
            }
            ChatBlockStatus chatBlockStatus2 = chatBlockData.status;
            if (chatBlockStatus2 != null) {
                codedOutputByteBufferNano.m17309K(2, chatBlockStatus2, ChatBlockStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ChatBlockData> JSON_ADAPTER = new ObjectJsonAdapter<ChatBlockData>() { // from class: com.p1.mobile.putong.core.data.ChatBlockData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatBlockData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatBlockData newInstance() {
            return new ChatBlockData();
        }

        public boolean parseField(ChatBlockData chatBlockData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(NotificationCompat.CATEGORY_STATUS)) {
                return false;
            }
            chatBlockData.status = ChatBlockStatus.JSON_ADAPTER.parse(jsonParser, str2);
            return true;
        }

        public boolean parseFieldCheck(ChatBlockData chatBlockData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                return true;
            }
            return super.parseFieldCheck(chatBlockData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatBlockData chatBlockData, JsonGenerator jsonGenerator) throws IOException {
            if (chatBlockData.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                ChatBlockStatus.JSON_ADAPTER.serialize(chatBlockData.status, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatBlockData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatBlockData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatBlockData new_() {
        ChatBlockData chatBlockData = new ChatBlockData();
        chatBlockData.nullCheck();
        return chatBlockData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatBlockData mo225055clone() {
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
        ChatBlockStatus chatBlockStatus = this.status;
        int iHashCode = i2 + (chatBlockStatus != null ? chatBlockStatus.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.status == null) {
            this.status = (ChatBlockStatus) ChatBlockStatus.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
