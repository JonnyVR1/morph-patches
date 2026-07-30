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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FakeLikeLimits fakeLikeLimits) {
            int iH = CodedOutputByteBufferNano.h(1, fakeLikeLimits.limitFemaleLow) + CodedOutputByteBufferNano.h(2, fakeLikeLimits.limitFemaleHigh) + CodedOutputByteBufferNano.h(3, fakeLikeLimits.limitMaleLow) + CodedOutputByteBufferNano.h(4, fakeLikeLimits.limitMaleHigh);
            ((MessageNano) fakeLikeLimits).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FakeLikeLimits m18091parse(nb5 nb5Var) throws IOException {
            FakeLikeLimits fakeLikeLimits = new FakeLikeLimits();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    fakeLikeLimits.limitFemaleLow = nb5Var.j();
                } else if (iU == 16) {
                    fakeLikeLimits.limitFemaleHigh = nb5Var.j();
                } else if (iU == 24) {
                    fakeLikeLimits.limitMaleLow = nb5Var.j();
                } else {
                    if (iU != 32) {
                        return fakeLikeLimits;
                    }
                    fakeLikeLimits.limitMaleHigh = nb5Var.j();
                }
            }
        }

        public void serialize(FakeLikeLimits fakeLikeLimits, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, fakeLikeLimits.limitFemaleLow);
            codedOutputByteBufferNano.G(2, fakeLikeLimits.limitFemaleHigh);
            codedOutputByteBufferNano.G(3, fakeLikeLimits.limitMaleLow);
            codedOutputByteBufferNano.G(4, fakeLikeLimits.limitMaleHigh);
        }
    };
    public static JsonAdapter<FakeLikeLimits> JSON_ADAPTER = new ObjectJsonAdapter<FakeLikeLimits>() { // from class: com.p1.mobile.putong.data.FakeLikeLimits.2
        public Class getDataClass() {
            return FakeLikeLimits.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FakeLikeLimits mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FakeLikeLimits fakeLikeLimits, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("limitFemaleLow", fakeLikeLimits.limitFemaleLow);
            jsonGenerator.writeNumberField("limitFemaleHigh", fakeLikeLimits.limitFemaleHigh);
            jsonGenerator.writeNumberField("limitMaleLow", fakeLikeLimits.limitMaleLow);
            jsonGenerator.writeNumberField("limitMaleHigh", fakeLikeLimits.limitMaleHigh);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FakeLikeLimits) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FakeLikeLimits) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FakeLikeLimits new_() {
        FakeLikeLimits fakeLikeLimits = new FakeLikeLimits();
        fakeLikeLimits.nullCheck();
        return fakeLikeLimits;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FakeLikeLimits m18090clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((i * 41) + this.limitFemaleLow) * 41) + this.limitFemaleHigh) * 41) + this.limitMaleLow) * 41) + this.limitMaleHigh;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
