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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BoostLimit boostLimit) {
            int iF = CodedOutputByteBufferNano.f(1, boostLimit.multiplier) + CodedOutputByteBufferNano.j(2, boostLimit.duration) + CodedOutputByteBufferNano.h(3, boostLimit.remaining) + CodedOutputByteBufferNano.h(4, boostLimit.total) + CodedOutputByteBufferNano.h(5, boostLimit.reset);
            ((MessageNano) boostLimit).cachedSize = iF;
            return iF;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BoostLimit m17778parse(nb5 nb5Var) throws IOException {
            BoostLimit boostLimit = new BoostLimit();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 13) {
                    boostLimit.multiplier = nb5Var.i();
                } else if (iU == 16) {
                    boostLimit.duration = nb5Var.k();
                } else if (iU == 24) {
                    boostLimit.remaining = nb5Var.j();
                } else if (iU == 32) {
                    boostLimit.total = nb5Var.j();
                } else {
                    if (iU != 40) {
                        return boostLimit;
                    }
                    boostLimit.reset = nb5Var.j();
                }
            }
        }

        public void serialize(BoostLimit boostLimit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.E(1, boostLimit.multiplier);
            codedOutputByteBufferNano.I(2, boostLimit.duration);
            codedOutputByteBufferNano.G(3, boostLimit.remaining);
            codedOutputByteBufferNano.G(4, boostLimit.total);
            codedOutputByteBufferNano.G(5, boostLimit.reset);
        }
    };
    public static JsonAdapter<BoostLimit> JSON_ADAPTER = new ObjectJsonAdapter<BoostLimit>() { // from class: com.p1.mobile.putong.data.BoostLimit.2
        public Class getDataClass() {
            return BoostLimit.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public BoostLimit mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BoostLimit boostLimit, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("multiplier", boostLimit.multiplier);
            jsonGenerator.writeNumberField("duration", boostLimit.duration);
            jsonGenerator.writeNumberField("remaining", boostLimit.remaining);
            jsonGenerator.writeNumberField("total", boostLimit.total);
            jsonGenerator.writeNumberField("reset", boostLimit.reset);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BoostLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BoostLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BoostLimit new_() {
        BoostLimit boostLimit = new BoostLimit();
        boostLimit.nullCheck();
        return boostLimit;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BoostLimit m17777clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iFloatToIntBits = ((i * 41) + Float.floatToIntBits(this.multiplier)) * 41;
        long j = this.duration;
        int i2 = ((((((iFloatToIntBits + ((int) (j ^ (j >>> 32)))) * 41) + this.remaining) * 41) + this.total) * 41) + this.reset;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
