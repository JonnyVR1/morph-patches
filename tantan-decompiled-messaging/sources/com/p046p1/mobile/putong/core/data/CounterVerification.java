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
public class CounterVerification extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "counterverification";

    @ProtobufIndex(index = 4)
    public double lastVerifyTime;

    @ProtobufIndex(index = 3)
    public double latestUpdatedTime;

    @ProtobufIndex(index = 2)
    public boolean needSync;

    @ProtobufIndex(index = 5)
    public double nextVerifyTime;

    @ProtobufIndex(index = 6)
    public boolean syncAll;

    @ProtobufIndex(index = 1)
    public int total;
    public static ProtobufAdapter<CounterVerification> PROTOBUF_ADAPTER = new MessageNanoAdapter<CounterVerification>() { // from class: com.p1.mobile.putong.core.data.CounterVerification.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CounterVerification counterVerification) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, counterVerification.total) + CodedOutputByteBufferNano.m17220b(2, counterVerification.needSync) + CodedOutputByteBufferNano.m17222d(3, counterVerification.latestUpdatedTime) + CodedOutputByteBufferNano.m17222d(4, counterVerification.lastVerifyTime) + CodedOutputByteBufferNano.m17222d(5, counterVerification.nextVerifyTime) + CodedOutputByteBufferNano.m17220b(6, counterVerification.syncAll);
            counterVerification.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CounterVerification parse(nb5 nb5Var) throws IOException {
            CounterVerification counterVerification = new CounterVerification();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    counterVerification.total = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    counterVerification.needSync = nb5Var.m158738g();
                } else if (iM158752u == 25) {
                    counterVerification.latestUpdatedTime = nb5Var.m158739h();
                } else if (iM158752u == 33) {
                    counterVerification.lastVerifyTime = nb5Var.m158739h();
                } else if (iM158752u == 41) {
                    counterVerification.nextVerifyTime = nb5Var.m158739h();
                } else {
                    if (iM158752u != 48) {
                        return counterVerification;
                    }
                    counterVerification.syncAll = nb5Var.m158738g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CounterVerification counterVerification, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, counterVerification.total);
            codedOutputByteBufferNano.m17244A(2, counterVerification.needSync);
            codedOutputByteBufferNano.m17246C(3, counterVerification.latestUpdatedTime);
            codedOutputByteBufferNano.m17246C(4, counterVerification.lastVerifyTime);
            codedOutputByteBufferNano.m17246C(5, counterVerification.nextVerifyTime);
            codedOutputByteBufferNano.m17244A(6, counterVerification.syncAll);
        }
    };
    public static JsonAdapter<CounterVerification> JSON_ADAPTER = new ObjectJsonAdapter<CounterVerification>() { // from class: com.p1.mobile.putong.core.data.CounterVerification.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CounterVerification.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CounterVerification newInstance() {
            return new CounterVerification();
        }

        public boolean parseField(CounterVerification counterVerification, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "syncAll":
                    counterVerification.syncAll = jsonParser.getValueAsBoolean();
                    return true;
                case "lastVerifyTime":
                    counterVerification.lastVerifyTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "total":
                    counterVerification.total = jsonParser.getValueAsInt();
                    return true;
                case "needSync":
                    counterVerification.needSync = jsonParser.getValueAsBoolean();
                    return true;
                case "latestUpdatedTime":
                    counterVerification.latestUpdatedTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "nextVerifyTime":
                    counterVerification.nextVerifyTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CounterVerification counterVerification, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "syncAll":
                case "lastVerifyTime":
                case "total":
                case "needSync":
                case "latestUpdatedTime":
                case "nextVerifyTime":
                    return true;
                default:
                    return super.parseFieldCheck(counterVerification, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CounterVerification counterVerification, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("total", counterVerification.total);
            jsonGenerator.writeBooleanField("needSync", counterVerification.needSync);
            jsonGenerator.writeFieldName("latestUpdatedTime");
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(counterVerification.latestUpdatedTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("lastVerifyTime");
            jsonAdapter.serialize(Double.valueOf(counterVerification.lastVerifyTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("nextVerifyTime");
            jsonAdapter.serialize(Double.valueOf(counterVerification.nextVerifyTime), jsonGenerator, true);
            jsonGenerator.writeBooleanField("syncAll", counterVerification.syncAll);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CounterVerification) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CounterVerification) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CounterVerification new_() {
        CounterVerification counterVerification = new CounterVerification();
        counterVerification.nullCheck();
        return counterVerification;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CounterVerification mo223809clone() {
        CounterVerification counterVerification = new CounterVerification();
        counterVerification.total = this.total;
        counterVerification.needSync = this.needSync;
        counterVerification.latestUpdatedTime = this.latestUpdatedTime;
        counterVerification.lastVerifyTime = this.lastVerifyTime;
        counterVerification.nextVerifyTime = this.nextVerifyTime;
        counterVerification.syncAll = this.syncAll;
        return counterVerification;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CounterVerification)) {
            return false;
        }
        CounterVerification counterVerification = (CounterVerification) obj;
        return this.total == counterVerification.total && this.needSync == counterVerification.needSync && this.latestUpdatedTime == counterVerification.latestUpdatedTime && this.lastVerifyTime == counterVerification.lastVerifyTime && this.nextVerifyTime == counterVerification.nextVerifyTime && this.syncAll == counterVerification.syncAll;
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
        int i2 = ((i * 41) + this.total) * 41;
        int i3 = this.needSync ? 1231 : 1237;
        long jDoubleToLongBits = Double.doubleToLongBits(this.latestUpdatedTime);
        int i4 = ((i2 + i3) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.lastVerifyTime);
        int i5 = (i4 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.nextVerifyTime);
        int i6 = (((i5 * 41) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 41) + (this.syncAll ? 1231 : 1237);
        this.hashCode = i6;
        return i6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
