package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.GiftRecord;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class MessageAccessory extends ValueObject implements Cloneable, Serializable {
    public static final String TOPIC_TYPE = "topic";
    public static final String TYPE = "messageaccessory";
    public static final String TYPE_CHALLENGE = "challenge";

    @Nullable
    @ProtobufIndex(index = 2)
    public QuestionCategory category;

    @Nullable
    @ProtobufIndex(index = 4)
    public List<GiftRecord> giftRecords;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 3)
    public String f21184id;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<MessageAccessory> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageAccessory>() { // from class: com.p1.mobile.putong.core.data.MessageAccessory.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageAccessory messageAccessory) {
            String str = messageAccessory.type;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            QuestionCategory questionCategory = messageAccessory.category;
            if (questionCategory != null) {
                iM17288o += CodedOutputByteBufferNano.m17281h(2, questionCategory.ordinal());
            }
            String str2 = messageAccessory.f21184id;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            List<GiftRecord> list = messageAccessory.giftRecords;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, list, GiftRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            QuestionCategory questionCategory2 = messageAccessory.category;
            if (questionCategory2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(5, questionCategory2, QuestionCategory.PROTOBUF_ADAPTER);
            }
            messageAccessory.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageAccessory parse(nc5 nc5Var) throws IOException {
            MessageAccessory messageAccessory = new MessageAccessory();
            Integer numValueOf = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (messageAccessory.category == null && numValueOf != null) {
                        messageAccessory.category = (QuestionCategory) QuestionCategory.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (messageAccessory.type == null) {
                        messageAccessory.type = "";
                    }
                    if (messageAccessory.f21184id != null) {
                        break;
                    }
                    messageAccessory.f21184id = "";
                    break;
                }
                if (iM162497u == 10) {
                    messageAccessory.type = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else if (iM162497u == 26) {
                    messageAccessory.f21184id = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    messageAccessory.giftRecords = (List) nc5Var.m162488l(GiftRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 42) {
                        if (messageAccessory.category == null && numValueOf != null) {
                            messageAccessory.category = (QuestionCategory) QuestionCategory.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (messageAccessory.type == null) {
                            messageAccessory.type = "";
                        }
                        if (messageAccessory.f21184id != null) {
                            break;
                        }
                        messageAccessory.f21184id = "";
                        return messageAccessory;
                    }
                    messageAccessory.category = (QuestionCategory) nc5Var.m162488l(QuestionCategory.PROTOBUF_ADAPTER);
                }
            }
            return messageAccessory;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageAccessory messageAccessory, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageAccessory.type;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            QuestionCategory questionCategory = messageAccessory.category;
            if (questionCategory != null) {
                codedOutputByteBufferNano.m17305G(2, questionCategory.ordinal());
            }
            String str2 = messageAccessory.f21184id;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            List<GiftRecord> list = messageAccessory.giftRecords;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(4, list, GiftRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            QuestionCategory questionCategory2 = messageAccessory.category;
            if (questionCategory2 != null) {
                codedOutputByteBufferNano.m17309K(5, questionCategory2, QuestionCategory.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MessageAccessory> JSON_ADAPTER = new ObjectJsonAdapter<MessageAccessory>() { // from class: com.p1.mobile.putong.core.data.MessageAccessory.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageAccessory.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageAccessory newInstance() {
            return new MessageAccessory();
        }

        public boolean parseField(MessageAccessory messageAccessory, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "giftRecords":
                    messageAccessory.giftRecords = JsonAdapter.parseArray(jsonParser, GiftRecord.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    messageAccessory.f21184id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    messageAccessory.type = jsonParser.getValueAsString();
                    return true;
                case "category":
                    messageAccessory.category = QuestionCategory.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MessageAccessory messageAccessory, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "giftRecords":
                    return true;
                case "id":
                    return false;
                case "type":
                case "category":
                    return true;
                default:
                    return super.parseFieldCheck(messageAccessory, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MessageAccessory messageAccessory, JsonGenerator jsonGenerator) throws IOException {
            String str = messageAccessory.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            if (messageAccessory.category != null) {
                jsonGenerator.writeFieldName("category");
                QuestionCategory.JSON_ADAPTER.serialize(messageAccessory.category, jsonGenerator, true);
            }
            String str2 = messageAccessory.f21184id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
            if (messageAccessory.giftRecords != null) {
                jsonGenerator.writeFieldName("giftRecords");
                JsonAdapter.serializeArray(messageAccessory.giftRecords, jsonGenerator, GiftRecord.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageAccessory) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageAccessory) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageAccessory new_() {
        MessageAccessory messageAccessory = new MessageAccessory();
        messageAccessory.nullCheck();
        return messageAccessory;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageAccessory mo225055clone() {
        MessageAccessory messageAccessory = new MessageAccessory();
        messageAccessory.type = this.type;
        messageAccessory.category = this.category;
        messageAccessory.f21184id = this.f21184id;
        List<GiftRecord> list = this.giftRecords;
        if (list != null) {
            messageAccessory.giftRecords = ValueObject.util_map(list, new qcj() { // from class: l.iuy
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((GiftRecord) obj).mo225055clone();
                }
            });
        }
        return messageAccessory;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageAccessory)) {
            return false;
        }
        MessageAccessory messageAccessory = (MessageAccessory) obj;
        return ValueObject.util_equals(this.type, messageAccessory.type) && ValueObject.util_equals(this.category, messageAccessory.category) && ValueObject.util_equals(this.f21184id, messageAccessory.f21184id) && ValueObject.util_equals(this.giftRecords, messageAccessory.giftRecords);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        QuestionCategory questionCategory = this.category;
        int iHashCode2 = (iHashCode + (questionCategory != null ? questionCategory.hashCode() : 0)) * 41;
        String str2 = this.f21184id;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<GiftRecord> list = this.giftRecords;
        int iHashCode4 = iHashCode3 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.f21184id == null) {
            this.f21184id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
