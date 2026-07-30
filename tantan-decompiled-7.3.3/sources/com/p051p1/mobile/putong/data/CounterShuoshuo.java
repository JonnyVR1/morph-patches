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
public class CounterShuoshuo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "countershuoshuo";

    @ProtobufIndex(index = 1)
    public int newLiked;
    public static ProtobufAdapter<CounterShuoshuo> PROTOBUF_ADAPTER = new MessageNanoAdapter<CounterShuoshuo>() { // from class: com.p1.mobile.putong.data.CounterShuoshuo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CounterShuoshuo counterShuoshuo) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, counterShuoshuo.newLiked);
            counterShuoshuo.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CounterShuoshuo parse(nc5 nc5Var) throws IOException {
            CounterShuoshuo counterShuoshuo = new CounterShuoshuo();
            while (nc5Var.m162497u() == 8) {
                counterShuoshuo.newLiked = nc5Var.m162486j();
            }
            return counterShuoshuo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CounterShuoshuo counterShuoshuo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, counterShuoshuo.newLiked);
        }
    };
    public static JsonAdapter<CounterShuoshuo> JSON_ADAPTER = new ObjectJsonAdapter<CounterShuoshuo>() { // from class: com.p1.mobile.putong.data.CounterShuoshuo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CounterShuoshuo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CounterShuoshuo newInstance() {
            return new CounterShuoshuo();
        }

        public boolean parseField(CounterShuoshuo counterShuoshuo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("newLiked")) {
                return false;
            }
            counterShuoshuo.newLiked = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(CounterShuoshuo counterShuoshuo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("newLiked")) {
                return true;
            }
            return super.parseFieldCheck(counterShuoshuo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CounterShuoshuo counterShuoshuo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("newLiked", counterShuoshuo.newLiked);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CounterShuoshuo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CounterShuoshuo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CounterShuoshuo new_() {
        CounterShuoshuo counterShuoshuo = new CounterShuoshuo();
        counterShuoshuo.nullCheck();
        return counterShuoshuo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CounterShuoshuo mo225055clone() {
        CounterShuoshuo counterShuoshuo = new CounterShuoshuo();
        counterShuoshuo.newLiked = this.newLiked;
        return counterShuoshuo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof CounterShuoshuo) && this.newLiked == ((CounterShuoshuo) obj).newLiked;
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
        int i2 = (i * 41) + this.newLiked;
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
