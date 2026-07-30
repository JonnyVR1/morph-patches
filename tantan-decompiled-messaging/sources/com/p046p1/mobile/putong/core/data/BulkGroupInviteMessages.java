package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.BulkGroupInviteMessages;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class BulkGroupInviteMessages extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bulkgroupinvitemessages";

    @NonNull
    @ProtobufIndex(index = 2)
    public Message message;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> toUserIds;
    public static ProtobufAdapter<BulkGroupInviteMessages> PROTOBUF_ADAPTER = new MessageNanoAdapter<BulkGroupInviteMessages>() { // from class: com.p1.mobile.putong.core.data.BulkGroupInviteMessages.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BulkGroupInviteMessages bulkGroupInviteMessages) {
            List<String> list = bulkGroupInviteMessages.toUserIds;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            Message message = bulkGroupInviteMessages.message;
            if (message != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, message, Message.PROTOBUF_ADAPTER);
            }
            bulkGroupInviteMessages.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BulkGroupInviteMessages parse(nb5 nb5Var) throws IOException {
            BulkGroupInviteMessages bulkGroupInviteMessages = new BulkGroupInviteMessages();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (bulkGroupInviteMessages.toUserIds == null) {
                        bulkGroupInviteMessages.toUserIds = new ArrayList();
                    }
                    if (bulkGroupInviteMessages.message != null) {
                        break;
                    }
                    bulkGroupInviteMessages.message = Message.new_();
                    break;
                }
                if (iM158752u == 10) {
                    bulkGroupInviteMessages.toUserIds = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        if (bulkGroupInviteMessages.toUserIds == null) {
                            bulkGroupInviteMessages.toUserIds = new ArrayList();
                        }
                        if (bulkGroupInviteMessages.message != null) {
                            break;
                        }
                        bulkGroupInviteMessages.message = Message.new_();
                        return bulkGroupInviteMessages;
                    }
                    bulkGroupInviteMessages.message = (Message) nb5Var.m158743l(Message.PROTOBUF_ADAPTER);
                }
            }
            return bulkGroupInviteMessages;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BulkGroupInviteMessages bulkGroupInviteMessages, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = bulkGroupInviteMessages.toUserIds;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            Message message = bulkGroupInviteMessages.message;
            if (message != null) {
                codedOutputByteBufferNano.m17254K(2, message, Message.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<BulkGroupInviteMessages> JSON_ADAPTER = new ObjectJsonAdapter<BulkGroupInviteMessages>() { // from class: com.p1.mobile.putong.core.data.BulkGroupInviteMessages.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BulkGroupInviteMessages.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BulkGroupInviteMessages newInstance() {
            return new BulkGroupInviteMessages();
        }

        public boolean parseField(BulkGroupInviteMessages bulkGroupInviteMessages, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("toUserIds")) {
                bulkGroupInviteMessages.toUserIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("message")) {
                return false;
            }
            bulkGroupInviteMessages.message = Message.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(BulkGroupInviteMessages bulkGroupInviteMessages, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("toUserIds") || str.equals("message")) {
                return true;
            }
            return super.parseFieldCheck(bulkGroupInviteMessages, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BulkGroupInviteMessages bulkGroupInviteMessages, JsonGenerator jsonGenerator) throws IOException {
            if (bulkGroupInviteMessages.toUserIds != null) {
                jsonGenerator.writeFieldName("toUserIds");
                JsonAdapter.serializeArray(bulkGroupInviteMessages.toUserIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (bulkGroupInviteMessages.message != null) {
                jsonGenerator.writeFieldName("message");
                Message.JSON_ADAPTER.serialize(bulkGroupInviteMessages.message, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BulkGroupInviteMessages) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BulkGroupInviteMessages) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35227a(String str) {
        return str;
    }

    public static BulkGroupInviteMessages new_() {
        BulkGroupInviteMessages bulkGroupInviteMessages = new BulkGroupInviteMessages();
        bulkGroupInviteMessages.nullCheck();
        return bulkGroupInviteMessages;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BulkGroupInviteMessages mo223809clone() {
        BulkGroupInviteMessages bulkGroupInviteMessages = new BulkGroupInviteMessages();
        List<String> list = this.toUserIds;
        if (list != null) {
            bulkGroupInviteMessages.toUserIds = ValueObject.util_map(list, new w9j() { // from class: l.ph3
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BulkGroupInviteMessages.m35227a((String) obj);
                }
            });
        }
        Message message = this.message;
        if (message != null) {
            bulkGroupInviteMessages.message = message.mo223809clone();
        }
        return bulkGroupInviteMessages;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BulkGroupInviteMessages)) {
            return false;
        }
        BulkGroupInviteMessages bulkGroupInviteMessages = (BulkGroupInviteMessages) obj;
        return ValueObject.util_equals(this.toUserIds, bulkGroupInviteMessages.toUserIds) && ValueObject.util_equals(this.message, bulkGroupInviteMessages.message);
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
        List<String> list = this.toUserIds;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        Message message = this.message;
        int iHashCode2 = iHashCode + (message != null ? message.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.toUserIds == null) {
            this.toUserIds = new ArrayList();
        }
        if (this.message == null) {
            this.message = Message.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
