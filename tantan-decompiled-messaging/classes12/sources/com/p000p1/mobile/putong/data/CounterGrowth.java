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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CounterGrowth counterGrowth) {
            int iH = CodedOutputByteBufferNano.h(1, counterGrowth.remaining) + CodedOutputByteBufferNano.h(2, counterGrowth.count) + CodedOutputByteBufferNano.h(3, counterGrowth.total) + CodedOutputByteBufferNano.h(4, counterGrowth.reset);
            ((MessageNano) counterGrowth).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CounterGrowth m17887parse(nb5 nb5Var) throws IOException {
            CounterGrowth counterGrowth = new CounterGrowth();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    counterGrowth.remaining = nb5Var.j();
                } else if (iU == 16) {
                    counterGrowth.count = nb5Var.j();
                } else if (iU == 24) {
                    counterGrowth.total = nb5Var.j();
                } else {
                    if (iU != 32) {
                        return counterGrowth;
                    }
                    counterGrowth.reset = nb5Var.j();
                }
            }
        }

        public void serialize(CounterGrowth counterGrowth, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, counterGrowth.remaining);
            codedOutputByteBufferNano.G(2, counterGrowth.count);
            codedOutputByteBufferNano.G(3, counterGrowth.total);
            codedOutputByteBufferNano.G(4, counterGrowth.reset);
        }
    };
    public static JsonAdapter<CounterGrowth> JSON_ADAPTER = new ObjectJsonAdapter<CounterGrowth>() { // from class: com.p1.mobile.putong.data.CounterGrowth.2
        public Class getDataClass() {
            return CounterGrowth.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public CounterGrowth mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CounterGrowth counterGrowth, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("remaining", counterGrowth.remaining);
            jsonGenerator.writeNumberField("count", counterGrowth.count);
            jsonGenerator.writeNumberField("total", counterGrowth.total);
            jsonGenerator.writeNumberField("reset", counterGrowth.reset);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CounterGrowth) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CounterGrowth) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CounterGrowth new_() {
        CounterGrowth counterGrowth = new CounterGrowth();
        counterGrowth.nullCheck();
        return counterGrowth;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CounterGrowth m17886clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((i * 41) + this.remaining) * 41) + this.count) * 41) + this.total) * 41) + this.reset;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
