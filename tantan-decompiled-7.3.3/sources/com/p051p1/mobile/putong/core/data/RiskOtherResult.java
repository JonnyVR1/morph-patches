package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class RiskOtherResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "riskotherresult";

    @NonNull
    @ProtobufIndex(index = 2)
    public RiskOtherData descriptionRisk;

    @NonNull
    @ProtobufIndex(index = 1)
    public RiskOtherData userRisk;
    public static ProtobufAdapter<RiskOtherResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<RiskOtherResult>() { // from class: com.p1.mobile.putong.core.data.RiskOtherResult.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RiskOtherResult riskOtherResult) {
            RiskOtherData riskOtherData = riskOtherResult.userRisk;
            int iM17285l = riskOtherData != null ? CodedOutputByteBufferNano.m17285l(1, riskOtherData, RiskOtherData.PROTOBUF_ADAPTER) : 0;
            RiskOtherData riskOtherData2 = riskOtherResult.descriptionRisk;
            if (riskOtherData2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, riskOtherData2, RiskOtherData.PROTOBUF_ADAPTER);
            }
            riskOtherResult.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RiskOtherResult parse(nc5 nc5Var) throws IOException {
            RiskOtherResult riskOtherResult = new RiskOtherResult();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (riskOtherResult.userRisk == null) {
                        riskOtherResult.userRisk = RiskOtherData.new_();
                    }
                    if (riskOtherResult.descriptionRisk != null) {
                        break;
                    }
                    riskOtherResult.descriptionRisk = RiskOtherData.new_();
                    break;
                }
                if (iM162497u == 10) {
                    riskOtherResult.userRisk = (RiskOtherData) nc5Var.m162488l(RiskOtherData.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (riskOtherResult.userRisk == null) {
                            riskOtherResult.userRisk = RiskOtherData.new_();
                        }
                        if (riskOtherResult.descriptionRisk != null) {
                            break;
                        }
                        riskOtherResult.descriptionRisk = RiskOtherData.new_();
                        return riskOtherResult;
                    }
                    riskOtherResult.descriptionRisk = (RiskOtherData) nc5Var.m162488l(RiskOtherData.PROTOBUF_ADAPTER);
                }
            }
            return riskOtherResult;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RiskOtherResult riskOtherResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            RiskOtherData riskOtherData = riskOtherResult.userRisk;
            if (riskOtherData != null) {
                codedOutputByteBufferNano.m17309K(1, riskOtherData, RiskOtherData.PROTOBUF_ADAPTER);
            }
            RiskOtherData riskOtherData2 = riskOtherResult.descriptionRisk;
            if (riskOtherData2 != null) {
                codedOutputByteBufferNano.m17309K(2, riskOtherData2, RiskOtherData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<RiskOtherResult> JSON_ADAPTER = new ObjectJsonAdapter<RiskOtherResult>() { // from class: com.p1.mobile.putong.core.data.RiskOtherResult.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RiskOtherResult.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RiskOtherResult newInstance() {
            return new RiskOtherResult();
        }

        public boolean parseField(RiskOtherResult riskOtherResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userRisk")) {
                riskOtherResult.userRisk = RiskOtherData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("descriptionRisk")) {
                return false;
            }
            riskOtherResult.descriptionRisk = RiskOtherData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(RiskOtherResult riskOtherResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userRisk") || str.equals("descriptionRisk")) {
                return true;
            }
            return super.parseFieldCheck(riskOtherResult, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RiskOtherResult riskOtherResult, JsonGenerator jsonGenerator) throws IOException {
            if (riskOtherResult.userRisk != null) {
                jsonGenerator.writeFieldName("userRisk");
                RiskOtherData.JSON_ADAPTER.serialize(riskOtherResult.userRisk, jsonGenerator, true);
            }
            if (riskOtherResult.descriptionRisk != null) {
                jsonGenerator.writeFieldName("descriptionRisk");
                RiskOtherData.JSON_ADAPTER.serialize(riskOtherResult.descriptionRisk, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RiskOtherResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RiskOtherResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RiskOtherResult new_() {
        RiskOtherResult riskOtherResult = new RiskOtherResult();
        riskOtherResult.nullCheck();
        return riskOtherResult;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RiskOtherResult mo225055clone() {
        RiskOtherResult riskOtherResult = new RiskOtherResult();
        RiskOtherData riskOtherData = this.userRisk;
        if (riskOtherData != null) {
            riskOtherResult.userRisk = riskOtherData.mo225055clone();
        }
        RiskOtherData riskOtherData2 = this.descriptionRisk;
        if (riskOtherData2 != null) {
            riskOtherResult.descriptionRisk = riskOtherData2.mo225055clone();
        }
        return riskOtherResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RiskOtherResult)) {
            return false;
        }
        RiskOtherResult riskOtherResult = (RiskOtherResult) obj;
        return ValueObject.util_equals(this.userRisk, riskOtherResult.userRisk) && ValueObject.util_equals(this.descriptionRisk, riskOtherResult.descriptionRisk);
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
        RiskOtherData riskOtherData = this.userRisk;
        int iHashCode = (i2 + (riskOtherData != null ? riskOtherData.hashCode() : 0)) * 41;
        RiskOtherData riskOtherData2 = this.descriptionRisk;
        int iHashCode2 = iHashCode + (riskOtherData2 != null ? riskOtherData2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userRisk == null) {
            this.userRisk = RiskOtherData.new_();
        }
        if (this.descriptionRisk == null) {
            this.descriptionRisk = RiskOtherData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
