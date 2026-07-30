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
public class CounterShuoshuo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "countershuoshuo";

    @ProtobufIndex(index = 1)
    public int newLiked;
    public static ProtobufAdapter<CounterShuoshuo> PROTOBUF_ADAPTER = new MessageNanoAdapter<CounterShuoshuo>() { // from class: com.p1.mobile.putong.data.CounterShuoshuo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CounterShuoshuo counterShuoshuo) {
            int iH = CodedOutputByteBufferNano.h(1, counterShuoshuo.newLiked);
            ((MessageNano) counterShuoshuo).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CounterShuoshuo m17905parse(nb5 nb5Var) throws IOException {
            CounterShuoshuo counterShuoshuo = new CounterShuoshuo();
            while (nb5Var.u() == 8) {
                counterShuoshuo.newLiked = nb5Var.j();
            }
            return counterShuoshuo;
        }

        public void serialize(CounterShuoshuo counterShuoshuo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, counterShuoshuo.newLiked);
        }
    };
    public static JsonAdapter<CounterShuoshuo> JSON_ADAPTER = new ObjectJsonAdapter<CounterShuoshuo>() { // from class: com.p1.mobile.putong.data.CounterShuoshuo.2
        public Class getDataClass() {
            return CounterShuoshuo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public CounterShuoshuo mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CounterShuoshuo counterShuoshuo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("newLiked", counterShuoshuo.newLiked);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CounterShuoshuo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CounterShuoshuo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CounterShuoshuo new_() {
        CounterShuoshuo counterShuoshuo = new CounterShuoshuo();
        counterShuoshuo.nullCheck();
        return counterShuoshuo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CounterShuoshuo m17904clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + this.newLiked;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
