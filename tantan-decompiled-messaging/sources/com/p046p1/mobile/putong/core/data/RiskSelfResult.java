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
public class RiskSelfResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "riskselfresult";

    @NonNull
    @ProtobufIndex(index = 1)
    public RiskSelfData risk;
    public static ProtobufAdapter<RiskSelfResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<RiskSelfResult>() { // from class: com.p1.mobile.putong.core.data.RiskSelfResult.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RiskSelfResult riskSelfResult) {
            RiskSelfData riskSelfData = riskSelfResult.risk;
            int iM17230l = riskSelfData != null ? CodedOutputByteBufferNano.m17230l(1, riskSelfData, RiskSelfData.PROTOBUF_ADAPTER) : 0;
            riskSelfResult.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RiskSelfResult parse(nb5 nb5Var) throws IOException {
            RiskSelfResult riskSelfResult = new RiskSelfResult();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (riskSelfResult.risk != null) {
                        break;
                    }
                    riskSelfResult.risk = RiskSelfData.new_();
                    break;
                }
                if (iM158752u != 10) {
                    if (riskSelfResult.risk != null) {
                        break;
                    }
                    riskSelfResult.risk = RiskSelfData.new_();
                    return riskSelfResult;
                }
                riskSelfResult.risk = (RiskSelfData) nb5Var.m158743l(RiskSelfData.PROTOBUF_ADAPTER);
            }
            return riskSelfResult;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RiskSelfResult riskSelfResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            RiskSelfData riskSelfData = riskSelfResult.risk;
            if (riskSelfData != null) {
                codedOutputByteBufferNano.m17254K(1, riskSelfData, RiskSelfData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<RiskSelfResult> JSON_ADAPTER = new ObjectJsonAdapter<RiskSelfResult>() { // from class: com.p1.mobile.putong.core.data.RiskSelfResult.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RiskSelfResult.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RiskSelfResult newInstance() {
            return new RiskSelfResult();
        }

        public boolean parseField(RiskSelfResult riskSelfResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("risk")) {
                return false;
            }
            riskSelfResult.risk = RiskSelfData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(RiskSelfResult riskSelfResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("risk")) {
                return true;
            }
            return super.parseFieldCheck(riskSelfResult, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RiskSelfResult riskSelfResult, JsonGenerator jsonGenerator) throws IOException {
            if (riskSelfResult.risk != null) {
                jsonGenerator.writeFieldName("risk");
                RiskSelfData.JSON_ADAPTER.serialize(riskSelfResult.risk, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RiskSelfResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RiskSelfResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RiskSelfResult new_() {
        RiskSelfResult riskSelfResult = new RiskSelfResult();
        riskSelfResult.nullCheck();
        return riskSelfResult;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RiskSelfResult mo223809clone() {
        RiskSelfResult riskSelfResult = new RiskSelfResult();
        RiskSelfData riskSelfData = this.risk;
        if (riskSelfData != null) {
            riskSelfResult.risk = riskSelfData.mo223809clone();
        }
        return riskSelfResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RiskSelfResult) {
            return ValueObject.util_equals(this.risk, ((RiskSelfResult) obj).risk);
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
        RiskSelfData riskSelfData = this.risk;
        int iHashCode = i2 + (riskSelfData != null ? riskSelfData.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.risk == null) {
            this.risk = RiskSelfData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
