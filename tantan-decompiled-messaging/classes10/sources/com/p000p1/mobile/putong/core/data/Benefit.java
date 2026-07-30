package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class Benefit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "benefit";

    @NonNull
    @ProtobufIndex(index = 1)
    public LocalBenefit localBenefit;
    public static ProtobufAdapter<Benefit> PROTOBUF_ADAPTER = new MessageNanoAdapter<Benefit>() { // from class: com.p1.mobile.putong.core.data.Benefit.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Benefit benefit) {
            LocalBenefit localBenefit = benefit.localBenefit;
            int iL = localBenefit != null ? CodedOutputByteBufferNano.l(1, localBenefit, LocalBenefit.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) benefit).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Benefit m11751parse(nb5 nb5Var) throws IOException {
            Benefit benefit = new Benefit();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (benefit.localBenefit != null) {
                        break;
                    }
                    benefit.localBenefit = LocalBenefit.new_();
                    break;
                }
                if (iU != 10) {
                    if (benefit.localBenefit != null) {
                        break;
                    }
                    benefit.localBenefit = LocalBenefit.new_();
                    return benefit;
                }
                benefit.localBenefit = (LocalBenefit) nb5Var.l(LocalBenefit.PROTOBUF_ADAPTER);
            }
            return benefit;
        }

        public void serialize(Benefit benefit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            LocalBenefit localBenefit = benefit.localBenefit;
            if (localBenefit != null) {
                codedOutputByteBufferNano.K(1, localBenefit, LocalBenefit.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Benefit> JSON_ADAPTER = new ObjectJsonAdapter<Benefit>() { // from class: com.p1.mobile.putong.core.data.Benefit.2
        public Class getDataClass() {
            return Benefit.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Benefit m11752newInstance() {
            return new Benefit();
        }

        public boolean parseField(Benefit benefit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("localBenefit")) {
                return false;
            }
            benefit.localBenefit = (LocalBenefit) LocalBenefit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(Benefit benefit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("localBenefit")) {
                return true;
            }
            return super.parseFieldCheck(benefit, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(Benefit benefit, JsonGenerator jsonGenerator) throws IOException {
            if (benefit.localBenefit != null) {
                jsonGenerator.writeFieldName("localBenefit");
                LocalBenefit.JSON_ADAPTER.serialize(benefit.localBenefit, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Benefit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Benefit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Benefit new_() {
        Benefit benefit = new Benefit();
        benefit.nullCheck();
        return benefit;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Benefit m11750clone() {
        Benefit benefit = new Benefit();
        LocalBenefit localBenefit = this.localBenefit;
        if (localBenefit != null) {
            benefit.localBenefit = localBenefit.m13948clone();
        }
        return benefit;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Benefit) {
            return ValueObject.util_equals(this.localBenefit, ((Benefit) obj).localBenefit);
        }
        return false;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        LocalBenefit localBenefit = this.localBenefit;
        int iHashCode = i2 + (localBenefit != null ? localBenefit.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.localBenefit == null) {
            this.localBenefit = LocalBenefit.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
