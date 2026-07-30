package com.p000p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class LikersLimit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "likerslimit";

    @ProtobufIndex(index = 4)
    public double expiresTime;

    @ProtobufIndex(index = 1)
    public int remaining;

    @ProtobufIndex(index = 3)
    public int reset;

    @ProtobufIndex(index = 2)
    public int total;
    public static ProtobufAdapter<LikersLimit> PROTOBUF_ADAPTER = new MessageNanoAdapter<LikersLimit>() { // from class: com.p1.mobile.putong.data.LikersLimit.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LikersLimit likersLimit) {
            int iH = CodedOutputByteBufferNano.h(1, likersLimit.remaining) + CodedOutputByteBufferNano.h(2, likersLimit.total) + CodedOutputByteBufferNano.h(3, likersLimit.reset) + CodedOutputByteBufferNano.d(4, likersLimit.expiresTime);
            ((MessageNano) likersLimit).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LikersLimit m18292parse(nb5 nb5Var) throws IOException {
            LikersLimit likersLimit = new LikersLimit();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    likersLimit.remaining = nb5Var.j();
                } else if (iU == 16) {
                    likersLimit.total = nb5Var.j();
                } else if (iU == 24) {
                    likersLimit.reset = nb5Var.j();
                } else {
                    if (iU != 33) {
                        return likersLimit;
                    }
                    likersLimit.expiresTime = nb5Var.h();
                }
            }
        }

        public void serialize(LikersLimit likersLimit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, likersLimit.remaining);
            codedOutputByteBufferNano.G(2, likersLimit.total);
            codedOutputByteBufferNano.G(3, likersLimit.reset);
            codedOutputByteBufferNano.C(4, likersLimit.expiresTime);
        }
    };
    public static JsonAdapter<LikersLimit> JSON_ADAPTER = new ObjectJsonAdapter<LikersLimit>() { // from class: com.p1.mobile.putong.data.LikersLimit.2
        public Class getDataClass() {
            return LikersLimit.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LikersLimit mo17830newInstance() {
            return new LikersLimit();
        }

        public boolean parseField(LikersLimit likersLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "expiresTime":
                    likersLimit.expiresTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "reset":
                    likersLimit.reset = jsonParser.getValueAsInt();
                    return true;
                case "total":
                    likersLimit.total = jsonParser.getValueAsInt();
                    return true;
                case "remaining":
                    likersLimit.remaining = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LikersLimit likersLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "expiresTime":
                case "reset":
                case "total":
                case "remaining":
                    return true;
                default:
                    return super.parseFieldCheck(likersLimit, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LikersLimit likersLimit, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("remaining", likersLimit.remaining);
            jsonGenerator.writeNumberField("total", likersLimit.total);
            jsonGenerator.writeNumberField("reset", likersLimit.reset);
            jsonGenerator.writeFieldName("expiresTime");
            Converter.API_TIME.serialize(Double.valueOf(likersLimit.expiresTime), jsonGenerator, true);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikersLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LikersLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LikersLimit new_() {
        LikersLimit likersLimit = new LikersLimit();
        likersLimit.nullCheck();
        return likersLimit;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LikersLimit m18291clone() {
        LikersLimit likersLimit = new LikersLimit();
        likersLimit.remaining = this.remaining;
        likersLimit.total = this.total;
        likersLimit.reset = this.reset;
        likersLimit.expiresTime = this.expiresTime;
        return likersLimit;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LikersLimit)) {
            return false;
        }
        LikersLimit likersLimit = (LikersLimit) obj;
        return this.remaining == likersLimit.remaining && this.total == likersLimit.total && this.reset == likersLimit.reset && this.expiresTime == likersLimit.expiresTime;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + this.remaining) * 41) + this.total) * 41) + this.reset;
        long jDoubleToLongBits = Double.doubleToLongBits(this.expiresTime);
        int i3 = (i2 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
