package com.p051p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
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
public class BoostLimit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "boostlimit";

    @ProtobufIndex(index = 2)
    public long duration;

    @ProtobufIndex(index = 1)
    public float multiplier;

    @ProtobufIndex(index = 3)
    public int remaining;

    @ProtobufIndex(index = 5)
    public int reset;

    @ProtobufIndex(index = 4)
    public int total;
    public static ProtobufAdapter<BoostLimit> PROTOBUF_ADAPTER = new MessageNanoAdapter<BoostLimit>() { // from class: com.p1.mobile.putong.data.BoostLimit.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BoostLimit boostLimit) {
            int iM17279f = CodedOutputByteBufferNano.m17279f(1, boostLimit.multiplier) + CodedOutputByteBufferNano.m17283j(2, boostLimit.duration) + CodedOutputByteBufferNano.m17281h(3, boostLimit.remaining) + CodedOutputByteBufferNano.m17281h(4, boostLimit.total) + CodedOutputByteBufferNano.m17281h(5, boostLimit.reset);
            boostLimit.cachedSize = iM17279f;
            return iM17279f;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BoostLimit parse(nc5 nc5Var) throws IOException {
            BoostLimit boostLimit = new BoostLimit();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 13) {
                    boostLimit.multiplier = nc5Var.m162485i();
                } else if (iM162497u == 16) {
                    boostLimit.duration = nc5Var.m162487k();
                } else if (iM162497u == 24) {
                    boostLimit.remaining = nc5Var.m162486j();
                } else if (iM162497u == 32) {
                    boostLimit.total = nc5Var.m162486j();
                } else {
                    if (iM162497u != 40) {
                        return boostLimit;
                    }
                    boostLimit.reset = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BoostLimit boostLimit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17303E(1, boostLimit.multiplier);
            codedOutputByteBufferNano.m17307I(2, boostLimit.duration);
            codedOutputByteBufferNano.m17305G(3, boostLimit.remaining);
            codedOutputByteBufferNano.m17305G(4, boostLimit.total);
            codedOutputByteBufferNano.m17305G(5, boostLimit.reset);
        }
    };
    public static JsonAdapter<BoostLimit> JSON_ADAPTER = new ObjectJsonAdapter<BoostLimit>() { // from class: com.p1.mobile.putong.data.BoostLimit.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BoostLimit.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BoostLimit newInstance() {
            return new BoostLimit();
        }

        public boolean parseField(BoostLimit boostLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    boostLimit.duration = jsonParser.getValueAsLong();
                    return true;
                case "reset":
                    boostLimit.reset = jsonParser.getValueAsInt();
                    return true;
                case "total":
                    boostLimit.total = jsonParser.getValueAsInt();
                    return true;
                case "remaining":
                    boostLimit.remaining = jsonParser.getValueAsInt();
                    return true;
                case "multiplier":
                    boostLimit.multiplier = (float) jsonParser.getValueAsDouble();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(BoostLimit boostLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "duration":
                case "reset":
                case "total":
                case "remaining":
                case "multiplier":
                    return true;
                default:
                    return super.parseFieldCheck(boostLimit, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BoostLimit boostLimit, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("multiplier", boostLimit.multiplier);
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, boostLimit.duration);
            jsonGenerator.writeNumberField("remaining", boostLimit.remaining);
            jsonGenerator.writeNumberField("total", boostLimit.total);
            jsonGenerator.writeNumberField("reset", boostLimit.reset);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BoostLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BoostLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BoostLimit new_() {
        BoostLimit boostLimit = new BoostLimit();
        boostLimit.nullCheck();
        return boostLimit;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BoostLimit mo225055clone() {
        BoostLimit boostLimit = new BoostLimit();
        boostLimit.multiplier = this.multiplier;
        boostLimit.duration = this.duration;
        boostLimit.remaining = this.remaining;
        boostLimit.total = this.total;
        boostLimit.reset = this.reset;
        return boostLimit;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BoostLimit)) {
            return false;
        }
        BoostLimit boostLimit = (BoostLimit) obj;
        return this.multiplier == boostLimit.multiplier && this.duration == boostLimit.duration && this.remaining == boostLimit.remaining && this.total == boostLimit.total && this.reset == boostLimit.reset;
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
        int iFloatToIntBits = ((i * 41) + Float.floatToIntBits(this.multiplier)) * 41;
        long j = this.duration;
        int i2 = ((((((iFloatToIntBits + ((int) (j ^ (j >>> 32)))) * 41) + this.remaining) * 41) + this.total) * 41) + this.reset;
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
