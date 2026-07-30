package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes10.dex */
public class Benefit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "benefit";

    @NonNull
    @ProtobufIndex(index = 1)
    public LocalBenefit localBenefit;
    public static ProtobufAdapter<Benefit> PROTOBUF_ADAPTER = new MessageNanoAdapter<Benefit>() { // from class: com.p1.mobile.putong.core.data.Benefit.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Benefit benefit) {
            LocalBenefit localBenefit = benefit.localBenefit;
            int iM17230l = localBenefit != null ? CodedOutputByteBufferNano.m17230l(1, localBenefit, LocalBenefit.PROTOBUF_ADAPTER) : 0;
            benefit.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Benefit parse(nb5 nb5Var) throws IOException {
            Benefit benefit = new Benefit();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (benefit.localBenefit != null) {
                        break;
                    }
                    benefit.localBenefit = LocalBenefit.new_();
                    break;
                }
                if (iM158752u != 10) {
                    if (benefit.localBenefit != null) {
                        break;
                    }
                    benefit.localBenefit = LocalBenefit.new_();
                    return benefit;
                }
                benefit.localBenefit = (LocalBenefit) nb5Var.m158743l(LocalBenefit.PROTOBUF_ADAPTER);
            }
            return benefit;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Benefit benefit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            LocalBenefit localBenefit = benefit.localBenefit;
            if (localBenefit != null) {
                codedOutputByteBufferNano.m17254K(1, localBenefit, LocalBenefit.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Benefit> JSON_ADAPTER = new ObjectJsonAdapter<Benefit>() { // from class: com.p1.mobile.putong.core.data.Benefit.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Benefit.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Benefit newInstance() {
            return new Benefit();
        }

        public boolean parseField(Benefit benefit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("localBenefit")) {
                return false;
            }
            benefit.localBenefit = LocalBenefit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(Benefit benefit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("localBenefit")) {
                return true;
            }
            return super.parseFieldCheck(benefit, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Benefit benefit, JsonGenerator jsonGenerator) throws IOException {
            if (benefit.localBenefit != null) {
                jsonGenerator.writeFieldName("localBenefit");
                LocalBenefit.JSON_ADAPTER.serialize(benefit.localBenefit, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Benefit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Benefit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Benefit new_() {
        Benefit benefit = new Benefit();
        benefit.nullCheck();
        return benefit;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Benefit mo223809clone() {
        Benefit benefit = new Benefit();
        LocalBenefit localBenefit = this.localBenefit;
        if (localBenefit != null) {
            benefit.localBenefit = localBenefit.mo223809clone();
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        LocalBenefit localBenefit = this.localBenefit;
        int iHashCode = i2 + (localBenefit != null ? localBenefit.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.localBenefit == null) {
            this.localBenefit = LocalBenefit.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
