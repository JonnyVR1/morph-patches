package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes13.dex */
public class BuryingPointParam extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "buryingpointparam";

    @NonNull
    @ProtobufIndex(index = 1)
    public String guideFrom;
    public static ProtobufAdapter<BuryingPointParam> PROTOBUF_ADAPTER = new MessageNanoAdapter<BuryingPointParam>() { // from class: com.p1.mobile.putong.feed.data.BuryingPointParam.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BuryingPointParam buryingPointParam) {
            String str = buryingPointParam.guideFrom;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            buryingPointParam.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BuryingPointParam parse(nc5 nc5Var) throws IOException {
            BuryingPointParam buryingPointParam = new BuryingPointParam();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (buryingPointParam.guideFrom != null) {
                        break;
                    }
                    buryingPointParam.guideFrom = "";
                    break;
                }
                if (iM162497u != 10) {
                    if (buryingPointParam.guideFrom != null) {
                        break;
                    }
                    buryingPointParam.guideFrom = "";
                    return buryingPointParam;
                }
                buryingPointParam.guideFrom = nc5Var.m162495s();
            }
            return buryingPointParam;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BuryingPointParam buryingPointParam, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = buryingPointParam.guideFrom;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
        }
    };
    public static JsonAdapter<BuryingPointParam> JSON_ADAPTER = new ObjectJsonAdapter<BuryingPointParam>() { // from class: com.p1.mobile.putong.feed.data.BuryingPointParam.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BuryingPointParam.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BuryingPointParam newInstance() {
            return new BuryingPointParam();
        }

        public boolean parseField(BuryingPointParam buryingPointParam, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("guideFrom")) {
                return false;
            }
            buryingPointParam.guideFrom = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(BuryingPointParam buryingPointParam, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("guideFrom")) {
                return true;
            }
            return super.parseFieldCheck(buryingPointParam, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BuryingPointParam buryingPointParam, JsonGenerator jsonGenerator) throws IOException {
            String str = buryingPointParam.guideFrom;
            if (str != null) {
                jsonGenerator.writeStringField("guideFrom", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BuryingPointParam) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BuryingPointParam) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BuryingPointParam new_() {
        BuryingPointParam buryingPointParam = new BuryingPointParam();
        buryingPointParam.nullCheck();
        return buryingPointParam;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BuryingPointParam mo225055clone() {
        BuryingPointParam buryingPointParam = new BuryingPointParam();
        buryingPointParam.guideFrom = this.guideFrom;
        return buryingPointParam;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BuryingPointParam) {
            return ValueObject.util_equals(this.guideFrom, ((BuryingPointParam) obj).guideFrom);
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
        String str = this.guideFrom;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.guideFrom == null) {
            this.guideFrom = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
