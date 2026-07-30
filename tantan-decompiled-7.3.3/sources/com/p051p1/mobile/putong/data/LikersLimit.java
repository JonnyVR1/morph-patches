package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LikersLimit likersLimit) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, likersLimit.remaining) + CodedOutputByteBufferNano.m17281h(2, likersLimit.total) + CodedOutputByteBufferNano.m17281h(3, likersLimit.reset) + CodedOutputByteBufferNano.m17277d(4, likersLimit.expiresTime);
            likersLimit.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LikersLimit parse(nc5 nc5Var) throws IOException {
            LikersLimit likersLimit = new LikersLimit();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    likersLimit.remaining = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    likersLimit.total = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    likersLimit.reset = nc5Var.m162486j();
                } else {
                    if (iM162497u != 33) {
                        return likersLimit;
                    }
                    likersLimit.expiresTime = nc5Var.m162484h();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LikersLimit likersLimit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, likersLimit.remaining);
            codedOutputByteBufferNano.m17305G(2, likersLimit.total);
            codedOutputByteBufferNano.m17305G(3, likersLimit.reset);
            codedOutputByteBufferNano.m17301C(4, likersLimit.expiresTime);
        }
    };
    public static JsonAdapter<LikersLimit> JSON_ADAPTER = new ObjectJsonAdapter<LikersLimit>() { // from class: com.p1.mobile.putong.data.LikersLimit.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LikersLimit.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LikersLimit newInstance() {
            return new LikersLimit();
        }

        public boolean parseField(LikersLimit likersLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "expiresTime":
                    likersLimit.expiresTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LikersLimit likersLimit, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("remaining", likersLimit.remaining);
            jsonGenerator.writeNumberField("total", likersLimit.total);
            jsonGenerator.writeNumberField("reset", likersLimit.reset);
            jsonGenerator.writeFieldName("expiresTime");
            Converter.API_TIME.serialize(Double.valueOf(likersLimit.expiresTime), jsonGenerator, true);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikersLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LikersLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LikersLimit new_() {
        LikersLimit likersLimit = new LikersLimit();
        likersLimit.nullCheck();
        return likersLimit;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LikersLimit mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + this.remaining) * 41) + this.total) * 41) + this.reset;
        long jDoubleToLongBits = Double.doubleToLongBits(this.expiresTime);
        int i3 = (i2 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
