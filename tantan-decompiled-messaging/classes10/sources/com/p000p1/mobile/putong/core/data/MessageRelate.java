package com.p000p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
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
public class MessageRelate extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagerelate";

    @ProtobufIndex(index = 1)
    public double readLastMessageTime;
    public static ProtobufAdapter<MessageRelate> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageRelate>() { // from class: com.p1.mobile.putong.core.data.MessageRelate.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MessageRelate messageRelate) {
            int iD = CodedOutputByteBufferNano.d(1, messageRelate.readLastMessageTime);
            ((MessageNano) messageRelate).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MessageRelate m14261parse(nb5 nb5Var) throws IOException {
            MessageRelate messageRelate = new MessageRelate();
            while (nb5Var.u() == 9) {
                messageRelate.readLastMessageTime = nb5Var.h();
            }
            return messageRelate;
        }

        public void serialize(MessageRelate messageRelate, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.C(1, messageRelate.readLastMessageTime);
        }
    };
    public static JsonAdapter<MessageRelate> JSON_ADAPTER = new ObjectJsonAdapter<MessageRelate>() { // from class: com.p1.mobile.putong.core.data.MessageRelate.2
        public Class getDataClass() {
            return MessageRelate.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MessageRelate m14262newInstance() {
            return new MessageRelate();
        }

        public boolean parseField(MessageRelate messageRelate, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("readLastMessageTime")) {
                return false;
            }
            messageRelate.readLastMessageTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
            return true;
        }

        public boolean parseFieldCheck(MessageRelate messageRelate, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("readLastMessageTime")) {
                return true;
            }
            return super.parseFieldCheck(messageRelate, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(MessageRelate messageRelate, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("readLastMessageTime");
            Converter.API_TIME.serialize(Double.valueOf(messageRelate.readLastMessageTime), jsonGenerator, true);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageRelate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageRelate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageRelate new_() {
        MessageRelate messageRelate = new MessageRelate();
        messageRelate.nullCheck();
        return messageRelate;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MessageRelate m14260clone() {
        MessageRelate messageRelate = new MessageRelate();
        messageRelate.readLastMessageTime = this.readLastMessageTime;
        return messageRelate;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof MessageRelate) && this.readLastMessageTime == ((MessageRelate) obj).readLastMessageTime;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.readLastMessageTime);
        int i2 = (i * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
