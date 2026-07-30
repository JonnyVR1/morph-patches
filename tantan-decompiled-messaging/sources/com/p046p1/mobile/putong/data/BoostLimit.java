package com.p046p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
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
            int iM17224f = CodedOutputByteBufferNano.m17224f(1, boostLimit.multiplier) + CodedOutputByteBufferNano.m17228j(2, boostLimit.duration) + CodedOutputByteBufferNano.m17226h(3, boostLimit.remaining) + CodedOutputByteBufferNano.m17226h(4, boostLimit.total) + CodedOutputByteBufferNano.m17226h(5, boostLimit.reset);
            boostLimit.cachedSize = iM17224f;
            return iM17224f;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BoostLimit parse(nb5 nb5Var) throws IOException {
            BoostLimit boostLimit = new BoostLimit();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 13) {
                    boostLimit.multiplier = nb5Var.m158740i();
                } else if (iM158752u == 16) {
                    boostLimit.duration = nb5Var.m158742k();
                } else if (iM158752u == 24) {
                    boostLimit.remaining = nb5Var.m158741j();
                } else if (iM158752u == 32) {
                    boostLimit.total = nb5Var.m158741j();
                } else {
                    if (iM158752u != 40) {
                        return boostLimit;
                    }
                    boostLimit.reset = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BoostLimit boostLimit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17248E(1, boostLimit.multiplier);
            codedOutputByteBufferNano.m17252I(2, boostLimit.duration);
            codedOutputByteBufferNano.m17250G(3, boostLimit.remaining);
            codedOutputByteBufferNano.m17250G(4, boostLimit.total);
            codedOutputByteBufferNano.m17250G(5, boostLimit.reset);
        }
    };
    public static JsonAdapter<BoostLimit> JSON_ADAPTER = new ObjectJsonAdapter<BoostLimit>() { // from class: com.p1.mobile.putong.data.BoostLimit.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BoostLimit.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BoostLimit boostLimit, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("multiplier", boostLimit.multiplier);
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, boostLimit.duration);
            jsonGenerator.writeNumberField("remaining", boostLimit.remaining);
            jsonGenerator.writeNumberField("total", boostLimit.total);
            jsonGenerator.writeNumberField("reset", boostLimit.reset);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BoostLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public BoostLimit mo223809clone() {
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
