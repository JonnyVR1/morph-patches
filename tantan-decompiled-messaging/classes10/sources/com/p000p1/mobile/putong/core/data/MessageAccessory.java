package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.GiftRecord;
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
public class MessageAccessory extends ValueObject implements Cloneable, Serializable {
    public static final String TOPIC_TYPE = "topic";
    public static final String TYPE = "messageaccessory";
    public static final String TYPE_CHALLENGE = "challenge";

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public QuestionCategory category;

    @Nullable
    @ProtobufIndex(index = 4)
    public List<GiftRecord> giftRecords;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String f104id;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<MessageAccessory> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageAccessory>() { // from class: com.p1.mobile.putong.core.data.MessageAccessory.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MessageAccessory messageAccessory) {
            String str = messageAccessory.type;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            QuestionCategory questionCategory = messageAccessory.category;
            if (questionCategory != null) {
                iO += CodedOutputByteBufferNano.h(2, questionCategory.ordinal());
            }
            String str2 = messageAccessory.f104id;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            List<GiftRecord> list = messageAccessory.giftRecords;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(4, list, GiftRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            QuestionCategory questionCategory2 = messageAccessory.category;
            if (questionCategory2 != null) {
                iO += CodedOutputByteBufferNano.l(5, questionCategory2, QuestionCategory.PROTOBUF_ADAPTER);
            }
            ((MessageNano) messageAccessory).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MessageAccessory m14160parse(nb5 nb5Var) throws IOException {
            MessageAccessory messageAccessory = new MessageAccessory();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (messageAccessory.category == null && numValueOf != null) {
                        messageAccessory.category = (QuestionCategory) QuestionCategory.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                    }
                    if (messageAccessory.type == null) {
                        messageAccessory.type = "";
                    }
                    if (messageAccessory.f104id != null) {
                        break;
                    }
                    messageAccessory.f104id = "";
                    break;
                }
                if (iU == 10) {
                    messageAccessory.type = nb5Var.s();
                } else if (iU == 16) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 26) {
                    messageAccessory.f104id = nb5Var.s();
                } else if (iU == 34) {
                    messageAccessory.giftRecords = (List) nb5Var.l(GiftRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 42) {
                        if (messageAccessory.category == null && numValueOf != null) {
                            messageAccessory.category = (QuestionCategory) QuestionCategory.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (messageAccessory.type == null) {
                            messageAccessory.type = "";
                        }
                        if (messageAccessory.f104id != null) {
                            break;
                        }
                        messageAccessory.f104id = "";
                        return messageAccessory;
                    }
                    messageAccessory.category = (QuestionCategory) nb5Var.l(QuestionCategory.PROTOBUF_ADAPTER);
                }
            }
            return messageAccessory;
        }

        public void serialize(MessageAccessory messageAccessory, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageAccessory.type;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            QuestionCategory questionCategory = messageAccessory.category;
            if (questionCategory != null) {
                codedOutputByteBufferNano.G(2, questionCategory.ordinal());
            }
            String str2 = messageAccessory.f104id;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            List<GiftRecord> list = messageAccessory.giftRecords;
            if (list != null) {
                codedOutputByteBufferNano.K(4, list, GiftRecord.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            QuestionCategory questionCategory2 = messageAccessory.category;
            if (questionCategory2 != null) {
                codedOutputByteBufferNano.K(5, questionCategory2, QuestionCategory.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MessageAccessory> JSON_ADAPTER = new ObjectJsonAdapter<MessageAccessory>() { // from class: com.p1.mobile.putong.core.data.MessageAccessory.2
        public Class getDataClass() {
            return MessageAccessory.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MessageAccessory m14161newInstance() {
            return new MessageAccessory();
        }

        public boolean parseField(MessageAccessory messageAccessory, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "giftRecords":
                    messageAccessory.giftRecords = JsonAdapter.parseArray(jsonParser, GiftRecord.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    messageAccessory.f104id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    messageAccessory.type = jsonParser.getValueAsString();
                    return true;
                case "category":
                    messageAccessory.category = (QuestionCategory) QuestionCategory.JSON_ADAPTER.parse(jsonParser, str2);
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

        public void serializeFields(MessageAccessory messageAccessory, JsonGenerator jsonGenerator) throws IOException {
            String str = messageAccessory.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            if (messageAccessory.category != null) {
                jsonGenerator.writeFieldName("category");
                QuestionCategory.JSON_ADAPTER.serialize(messageAccessory.category, jsonGenerator, true);
            }
            String str2 = messageAccessory.f104id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
            if (messageAccessory.giftRecords != null) {
                jsonGenerator.writeFieldName("giftRecords");
                JsonAdapter.serializeArray(messageAccessory.giftRecords, jsonGenerator, GiftRecord.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageAccessory) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageAccessory) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageAccessory new_() {
        MessageAccessory messageAccessory = new MessageAccessory();
        messageAccessory.nullCheck();
        return messageAccessory;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MessageAccessory m14159clone() {
        MessageAccessory messageAccessory = new MessageAccessory();
        messageAccessory.type = this.type;
        messageAccessory.category = this.category;
        messageAccessory.f104id = this.f104id;
        List<GiftRecord> list = this.giftRecords;
        if (list != null) {
            messageAccessory.giftRecords = ValueObject.util_map(list, new w9j() { // from class: l.lly
                public final Object call(Object obj) {
                    return ((GiftRecord) obj).m12956clone();
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
        return ValueObject.util_equals(this.type, messageAccessory.type) && ValueObject.util_equals(this.category, messageAccessory.category) && ValueObject.util_equals(this.f104id, messageAccessory.f104id) && ValueObject.util_equals(this.giftRecords, messageAccessory.giftRecords);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        QuestionCategory questionCategory = this.category;
        int iHashCode2 = (iHashCode + (questionCategory != null ? questionCategory.hashCode() : 0)) * 41;
        String str2 = this.f104id;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<GiftRecord> list = this.giftRecords;
        int iHashCode4 = iHashCode3 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.f104id == null) {
            this.f104id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
