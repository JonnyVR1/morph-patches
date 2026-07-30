package com.p051p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.MerchandiseTimeUnit;
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
public class DoublePair extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "doublepair";

    @ProtobufIndex(index = 1)
    public double first;
    public boolean isEmpty = false;

    @ProtobufIndex(index = 2)
    public double second;
    public static ProtobufAdapter<DoublePair> PROTOBUF_ADAPTER = new MessageNanoAdapter<DoublePair>() { // from class: com.p1.mobile.putong.data.DoublePair.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DoublePair doublePair) {
            int iM17277d = CodedOutputByteBufferNano.m17277d(1, doublePair.first) + CodedOutputByteBufferNano.m17277d(2, doublePair.second);
            doublePair.cachedSize = iM17277d;
            return iM17277d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DoublePair parse(nc5 nc5Var) throws IOException {
            DoublePair doublePair = new DoublePair();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 9) {
                    doublePair.first = nc5Var.m162484h();
                } else {
                    if (iM162497u != 17) {
                        return doublePair;
                    }
                    doublePair.second = nc5Var.m162484h();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DoublePair doublePair, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17301C(1, doublePair.first);
            codedOutputByteBufferNano.m17301C(2, doublePair.second);
        }
    };
    public static JsonAdapter<DoublePair> JSON_ADAPTER = new ObjectJsonAdapter<DoublePair>() { // from class: com.p1.mobile.putong.data.DoublePair.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DoublePair.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public DoublePair newInstance() {
            return new DoublePair();
        }

        public boolean parseField(DoublePair doublePair, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(MerchandiseTimeUnit.second)) {
                doublePair.second = jsonParser.getValueAsDouble();
                return true;
            }
            if (!str.equals("first")) {
                return false;
            }
            doublePair.first = jsonParser.getValueAsDouble();
            return true;
        }

        public boolean parseFieldCheck(DoublePair doublePair, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(MerchandiseTimeUnit.second) || str.equals("first")) {
                return true;
            }
            return super.parseFieldCheck(doublePair, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DoublePair doublePair, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("first", doublePair.first);
            jsonGenerator.writeNumberField(MerchandiseTimeUnit.second, doublePair.second);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DoublePair) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DoublePair) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public DoublePair(double d, double d2) {
        this.first = d;
        this.second = d2;
    }

    public static DoublePair new_() {
        DoublePair doublePair = new DoublePair();
        doublePair.nullCheck();
        return doublePair;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DoublePair mo225055clone() {
        DoublePair doublePair = new DoublePair();
        doublePair.first = this.first;
        doublePair.second = this.second;
        return doublePair;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DoublePair)) {
            return false;
        }
        DoublePair doublePair = (DoublePair) obj;
        return this.first == doublePair.first && this.second == doublePair.second;
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
        long jDoubleToLongBits = Double.doubleToLongBits(this.first);
        int i2 = (i * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.second);
        int i3 = (i2 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    public DoublePair() {
    }
}
