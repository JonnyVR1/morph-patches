package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.BulkGroupInviteMessages;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class BulkGroupInviteMessages extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bulkgroupinvitemessages";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public Message message;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> toUserIds;
    public static ProtobufAdapter<BulkGroupInviteMessages> PROTOBUF_ADAPTER = new MessageNanoAdapter<BulkGroupInviteMessages>() { // from class: com.p1.mobile.putong.core.data.BulkGroupInviteMessages.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BulkGroupInviteMessages bulkGroupInviteMessages) {
            List<String> list = bulkGroupInviteMessages.toUserIds;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            Message message = bulkGroupInviteMessages.message;
            if (message != null) {
                iL += CodedOutputByteBufferNano.l(2, message, Message.PROTOBUF_ADAPTER);
            }
            ((MessageNano) bulkGroupInviteMessages).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BulkGroupInviteMessages m11823parse(nb5 nb5Var) throws IOException {
            BulkGroupInviteMessages bulkGroupInviteMessages = new BulkGroupInviteMessages();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (bulkGroupInviteMessages.toUserIds == null) {
                        bulkGroupInviteMessages.toUserIds = new ArrayList();
                    }
                    if (bulkGroupInviteMessages.message != null) {
                        break;
                    }
                    bulkGroupInviteMessages.message = Message.new_();
                    break;
                }
                if (iU == 10) {
                    bulkGroupInviteMessages.toUserIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (bulkGroupInviteMessages.toUserIds == null) {
                            bulkGroupInviteMessages.toUserIds = new ArrayList();
                        }
                        if (bulkGroupInviteMessages.message != null) {
                            break;
                        }
                        bulkGroupInviteMessages.message = Message.new_();
                        return bulkGroupInviteMessages;
                    }
                    bulkGroupInviteMessages.message = (Message) nb5Var.l(Message.PROTOBUF_ADAPTER);
                }
            }
            return bulkGroupInviteMessages;
        }

        public void serialize(BulkGroupInviteMessages bulkGroupInviteMessages, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = bulkGroupInviteMessages.toUserIds;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            Message message = bulkGroupInviteMessages.message;
            if (message != null) {
                codedOutputByteBufferNano.K(2, message, Message.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<BulkGroupInviteMessages> JSON_ADAPTER = new ObjectJsonAdapter<BulkGroupInviteMessages>() { // from class: com.p1.mobile.putong.core.data.BulkGroupInviteMessages.2
        public Class getDataClass() {
            return BulkGroupInviteMessages.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public BulkGroupInviteMessages m11824newInstance() {
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
            bulkGroupInviteMessages.message = (Message) Message.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(BulkGroupInviteMessages bulkGroupInviteMessages, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("toUserIds") || str.equals("message")) {
                return true;
            }
            return super.parseFieldCheck(bulkGroupInviteMessages, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BulkGroupInviteMessages) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BulkGroupInviteMessages) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m29a(String str) {
        return str;
    }

    public static BulkGroupInviteMessages new_() {
        BulkGroupInviteMessages bulkGroupInviteMessages = new BulkGroupInviteMessages();
        bulkGroupInviteMessages.nullCheck();
        return bulkGroupInviteMessages;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BulkGroupInviteMessages m11822clone() {
        BulkGroupInviteMessages bulkGroupInviteMessages = new BulkGroupInviteMessages();
        List<String> list = this.toUserIds;
        if (list != null) {
            bulkGroupInviteMessages.toUserIds = ValueObject.util_map(list, new w9j() { // from class: l.ph3
                public final Object call(Object obj) {
                    return BulkGroupInviteMessages.m29a((String) obj);
                }
            });
        }
        Message message = this.message;
        if (message != null) {
            bulkGroupInviteMessages.message = message.m14153clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<String> list = this.toUserIds;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        Message message = this.message;
        int iHashCode2 = iHashCode + (message != null ? message.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.toUserIds == null) {
            this.toUserIds = new ArrayList();
        }
        if (this.message == null) {
            this.message = Message.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
