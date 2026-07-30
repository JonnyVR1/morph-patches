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
public class FakeLikeLimits extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fakelikelimits";

    @ProtobufIndex(index = 2)
    public int limitFemaleHigh;

    @ProtobufIndex(index = 1)
    public int limitFemaleLow;

    @ProtobufIndex(index = 4)
    public int limitMaleHigh;

    @ProtobufIndex(index = 3)
    public int limitMaleLow;
    public static ProtobufAdapter<FakeLikeLimits> PROTOBUF_ADAPTER = new MessageNanoAdapter<FakeLikeLimits>() { // from class: com.p1.mobile.putong.data.FakeLikeLimits.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FakeLikeLimits fakeLikeLimits) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, fakeLikeLimits.limitFemaleLow) + CodedOutputByteBufferNano.m17281h(2, fakeLikeLimits.limitFemaleHigh) + CodedOutputByteBufferNano.m17281h(3, fakeLikeLimits.limitMaleLow) + CodedOutputByteBufferNano.m17281h(4, fakeLikeLimits.limitMaleHigh);
            fakeLikeLimits.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FakeLikeLimits parse(nc5 nc5Var) throws IOException {
            FakeLikeLimits fakeLikeLimits = new FakeLikeLimits();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    fakeLikeLimits.limitFemaleLow = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    fakeLikeLimits.limitFemaleHigh = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    fakeLikeLimits.limitMaleLow = nc5Var.m162486j();
                } else {
                    if (iM162497u != 32) {
                        return fakeLikeLimits;
                    }
                    fakeLikeLimits.limitMaleHigh = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FakeLikeLimits fakeLikeLimits, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, fakeLikeLimits.limitFemaleLow);
            codedOutputByteBufferNano.m17305G(2, fakeLikeLimits.limitFemaleHigh);
            codedOutputByteBufferNano.m17305G(3, fakeLikeLimits.limitMaleLow);
            codedOutputByteBufferNano.m17305G(4, fakeLikeLimits.limitMaleHigh);
        }
    };
    public static JsonAdapter<FakeLikeLimits> JSON_ADAPTER = new ObjectJsonAdapter<FakeLikeLimits>() { // from class: com.p1.mobile.putong.data.FakeLikeLimits.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FakeLikeLimits.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FakeLikeLimits newInstance() {
            return new FakeLikeLimits();
        }

        public boolean parseField(FakeLikeLimits fakeLikeLimits, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "limitMaleHigh":
                    fakeLikeLimits.limitMaleHigh = jsonParser.getValueAsInt();
                    return true;
                case "limitMaleLow":
                    fakeLikeLimits.limitMaleLow = jsonParser.getValueAsInt();
                    return true;
                case "limitFemaleLow":
                    fakeLikeLimits.limitFemaleLow = jsonParser.getValueAsInt();
                    return true;
                case "limitFemaleHigh":
                    fakeLikeLimits.limitFemaleHigh = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FakeLikeLimits fakeLikeLimits, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "limitMaleHigh":
                case "limitMaleLow":
                case "limitFemaleLow":
                case "limitFemaleHigh":
                    return true;
                default:
                    return super.parseFieldCheck(fakeLikeLimits, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FakeLikeLimits fakeLikeLimits, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("limitFemaleLow", fakeLikeLimits.limitFemaleLow);
            jsonGenerator.writeNumberField("limitFemaleHigh", fakeLikeLimits.limitFemaleHigh);
            jsonGenerator.writeNumberField("limitMaleLow", fakeLikeLimits.limitMaleLow);
            jsonGenerator.writeNumberField("limitMaleHigh", fakeLikeLimits.limitMaleHigh);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FakeLikeLimits) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FakeLikeLimits) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FakeLikeLimits new_() {
        FakeLikeLimits fakeLikeLimits = new FakeLikeLimits();
        fakeLikeLimits.nullCheck();
        return fakeLikeLimits;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FakeLikeLimits mo225055clone() {
        FakeLikeLimits fakeLikeLimits = new FakeLikeLimits();
        fakeLikeLimits.limitFemaleLow = this.limitFemaleLow;
        fakeLikeLimits.limitFemaleHigh = this.limitFemaleHigh;
        fakeLikeLimits.limitMaleLow = this.limitMaleLow;
        fakeLikeLimits.limitMaleHigh = this.limitMaleHigh;
        return fakeLikeLimits;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FakeLikeLimits)) {
            return false;
        }
        FakeLikeLimits fakeLikeLimits = (FakeLikeLimits) obj;
        return this.limitFemaleLow == fakeLikeLimits.limitFemaleLow && this.limitFemaleHigh == fakeLikeLimits.limitFemaleHigh && this.limitMaleLow == fakeLikeLimits.limitMaleLow && this.limitMaleHigh == fakeLikeLimits.limitMaleHigh;
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
        int i2 = (((((((i * 41) + this.limitFemaleLow) * 41) + this.limitFemaleHigh) * 41) + this.limitMaleLow) * 41) + this.limitMaleHigh;
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
