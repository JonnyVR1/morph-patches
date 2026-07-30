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
public class DoublePair extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "doublepair";

    @ProtobufIndex(index = 1)
    public double first;
    public boolean isEmpty = false;

    @ProtobufIndex(index = 2)
    public double second;
    public static ProtobufAdapter<DoublePair> PROTOBUF_ADAPTER = new MessageNanoAdapter<DoublePair>() { // from class: com.p1.mobile.putong.data.DoublePair.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(DoublePair doublePair) {
            int iD = CodedOutputByteBufferNano.d(1, doublePair.first) + CodedOutputByteBufferNano.d(2, doublePair.second);
            ((MessageNano) doublePair).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public DoublePair m18001parse(nb5 nb5Var) throws IOException {
            DoublePair doublePair = new DoublePair();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 9) {
                    doublePair.first = nb5Var.h();
                } else {
                    if (iU != 17) {
                        return doublePair;
                    }
                    doublePair.second = nb5Var.h();
                }
            }
        }

        public void serialize(DoublePair doublePair, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.C(1, doublePair.first);
            codedOutputByteBufferNano.C(2, doublePair.second);
        }
    };
    public static JsonAdapter<DoublePair> JSON_ADAPTER = new ObjectJsonAdapter<DoublePair>() { // from class: com.p1.mobile.putong.data.DoublePair.2
        public Class getDataClass() {
            return DoublePair.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public DoublePair mo17830newInstance() {
            return new DoublePair();
        }

        public boolean parseField(DoublePair doublePair, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("second")) {
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
            if (str.equals("second") || str.equals("first")) {
                return true;
            }
            return super.parseFieldCheck(doublePair, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DoublePair doublePair, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("first", doublePair.first);
            jsonGenerator.writeNumberField("second", doublePair.second);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DoublePair) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public DoublePair m18000clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.first);
        int i2 = (i * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.second);
        int i3 = (i2 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    public DoublePair() {
    }
}
