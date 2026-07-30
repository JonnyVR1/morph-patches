package com.p046p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class MessageRelate extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagerelate";

    @ProtobufIndex(index = 1)
    public double readLastMessageTime;
    public static ProtobufAdapter<MessageRelate> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageRelate>() { // from class: com.p1.mobile.putong.core.data.MessageRelate.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageRelate messageRelate) {
            int iM17222d = CodedOutputByteBufferNano.m17222d(1, messageRelate.readLastMessageTime);
            messageRelate.cachedSize = iM17222d;
            return iM17222d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageRelate parse(nb5 nb5Var) throws IOException {
            MessageRelate messageRelate = new MessageRelate();
            while (nb5Var.m158752u() == 9) {
                messageRelate.readLastMessageTime = nb5Var.m158739h();
            }
            return messageRelate;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageRelate messageRelate, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17246C(1, messageRelate.readLastMessageTime);
        }
    };
    public static JsonAdapter<MessageRelate> JSON_ADAPTER = new ObjectJsonAdapter<MessageRelate>() { // from class: com.p1.mobile.putong.core.data.MessageRelate.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageRelate.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageRelate newInstance() {
            return new MessageRelate();
        }

        public boolean parseField(MessageRelate messageRelate, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("readLastMessageTime")) {
                return false;
            }
            messageRelate.readLastMessageTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
            return true;
        }

        public boolean parseFieldCheck(MessageRelate messageRelate, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("readLastMessageTime")) {
                return true;
            }
            return super.parseFieldCheck(messageRelate, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MessageRelate messageRelate, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("readLastMessageTime");
            Converter.API_TIME.serialize(Double.valueOf(messageRelate.readLastMessageTime), jsonGenerator, true);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageRelate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageRelate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageRelate new_() {
        MessageRelate messageRelate = new MessageRelate();
        messageRelate.nullCheck();
        return messageRelate;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageRelate mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.readLastMessageTime);
        int i2 = (i * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
