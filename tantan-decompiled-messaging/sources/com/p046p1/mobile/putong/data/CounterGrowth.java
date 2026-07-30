package com.p046p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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

/* JADX INFO: loaded from: classes12.dex */
public class CounterGrowth extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "countergrowth";

    @ProtobufIndex(index = 2)
    public int count;

    @ProtobufIndex(index = 1)
    public int remaining;

    @ProtobufIndex(index = 4)
    public int reset;

    @ProtobufIndex(index = 3)
    public int total;
    public static ProtobufAdapter<CounterGrowth> PROTOBUF_ADAPTER = new MessageNanoAdapter<CounterGrowth>() { // from class: com.p1.mobile.putong.data.CounterGrowth.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CounterGrowth counterGrowth) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, counterGrowth.remaining) + CodedOutputByteBufferNano.m17226h(2, counterGrowth.count) + CodedOutputByteBufferNano.m17226h(3, counterGrowth.total) + CodedOutputByteBufferNano.m17226h(4, counterGrowth.reset);
            counterGrowth.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CounterGrowth parse(nb5 nb5Var) throws IOException {
            CounterGrowth counterGrowth = new CounterGrowth();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    counterGrowth.remaining = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    counterGrowth.count = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    counterGrowth.total = nb5Var.m158741j();
                } else {
                    if (iM158752u != 32) {
                        return counterGrowth;
                    }
                    counterGrowth.reset = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CounterGrowth counterGrowth, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, counterGrowth.remaining);
            codedOutputByteBufferNano.m17250G(2, counterGrowth.count);
            codedOutputByteBufferNano.m17250G(3, counterGrowth.total);
            codedOutputByteBufferNano.m17250G(4, counterGrowth.reset);
        }
    };
    public static JsonAdapter<CounterGrowth> JSON_ADAPTER = new ObjectJsonAdapter<CounterGrowth>() { // from class: com.p1.mobile.putong.data.CounterGrowth.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CounterGrowth.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CounterGrowth newInstance() {
            return new CounterGrowth();
        }

        public boolean parseField(CounterGrowth counterGrowth, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "count":
                    counterGrowth.count = jsonParser.getValueAsInt();
                    return true;
                case "reset":
                    counterGrowth.reset = jsonParser.getValueAsInt();
                    return true;
                case "total":
                    counterGrowth.total = jsonParser.getValueAsInt();
                    return true;
                case "remaining":
                    counterGrowth.remaining = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CounterGrowth counterGrowth, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "count":
                case "reset":
                case "total":
                case "remaining":
                    return true;
                default:
                    return super.parseFieldCheck(counterGrowth, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CounterGrowth counterGrowth, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("remaining", counterGrowth.remaining);
            jsonGenerator.writeNumberField("count", counterGrowth.count);
            jsonGenerator.writeNumberField("total", counterGrowth.total);
            jsonGenerator.writeNumberField("reset", counterGrowth.reset);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CounterGrowth) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CounterGrowth) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CounterGrowth new_() {
        CounterGrowth counterGrowth = new CounterGrowth();
        counterGrowth.nullCheck();
        return counterGrowth;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CounterGrowth mo223809clone() {
        CounterGrowth counterGrowth = new CounterGrowth();
        counterGrowth.remaining = this.remaining;
        counterGrowth.count = this.count;
        counterGrowth.total = this.total;
        counterGrowth.reset = this.reset;
        return counterGrowth;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CounterGrowth)) {
            return false;
        }
        CounterGrowth counterGrowth = (CounterGrowth) obj;
        return this.remaining == counterGrowth.remaining && this.count == counterGrowth.count && this.total == counterGrowth.total && this.reset == counterGrowth.reset;
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
        int i2 = (((((((i * 41) + this.remaining) * 41) + this.count) * 41) + this.total) * 41) + this.reset;
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
