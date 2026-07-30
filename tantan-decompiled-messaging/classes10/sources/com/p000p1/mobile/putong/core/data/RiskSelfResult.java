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
public class RiskSelfResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "riskselfresult";

    @NonNull
    @ProtobufIndex(index = 1)
    public RiskSelfData risk;
    public static ProtobufAdapter<RiskSelfResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<RiskSelfResult>() { // from class: com.p1.mobile.putong.core.data.RiskSelfResult.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RiskSelfResult riskSelfResult) {
            RiskSelfData riskSelfData = riskSelfResult.risk;
            int iL = riskSelfData != null ? CodedOutputByteBufferNano.l(1, riskSelfData, RiskSelfData.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) riskSelfResult).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RiskSelfResult m15459parse(nb5 nb5Var) throws IOException {
            RiskSelfResult riskSelfResult = new RiskSelfResult();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (riskSelfResult.risk != null) {
                        break;
                    }
                    riskSelfResult.risk = RiskSelfData.new_();
                    break;
                }
                if (iU != 10) {
                    if (riskSelfResult.risk != null) {
                        break;
                    }
                    riskSelfResult.risk = RiskSelfData.new_();
                    return riskSelfResult;
                }
                riskSelfResult.risk = (RiskSelfData) nb5Var.l(RiskSelfData.PROTOBUF_ADAPTER);
            }
            return riskSelfResult;
        }

        public void serialize(RiskSelfResult riskSelfResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            RiskSelfData riskSelfData = riskSelfResult.risk;
            if (riskSelfData != null) {
                codedOutputByteBufferNano.K(1, riskSelfData, RiskSelfData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<RiskSelfResult> JSON_ADAPTER = new ObjectJsonAdapter<RiskSelfResult>() { // from class: com.p1.mobile.putong.core.data.RiskSelfResult.2
        public Class getDataClass() {
            return RiskSelfResult.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RiskSelfResult m15460newInstance() {
            return new RiskSelfResult();
        }

        public boolean parseField(RiskSelfResult riskSelfResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("risk")) {
                return false;
            }
            riskSelfResult.risk = (RiskSelfData) RiskSelfData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(RiskSelfResult riskSelfResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("risk")) {
                return true;
            }
            return super.parseFieldCheck(riskSelfResult, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(RiskSelfResult riskSelfResult, JsonGenerator jsonGenerator) throws IOException {
            if (riskSelfResult.risk != null) {
                jsonGenerator.writeFieldName("risk");
                RiskSelfData.JSON_ADAPTER.serialize(riskSelfResult.risk, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RiskSelfResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RiskSelfResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RiskSelfResult new_() {
        RiskSelfResult riskSelfResult = new RiskSelfResult();
        riskSelfResult.nullCheck();
        return riskSelfResult;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RiskSelfResult m15458clone() {
        RiskSelfResult riskSelfResult = new RiskSelfResult();
        RiskSelfData riskSelfData = this.risk;
        if (riskSelfData != null) {
            riskSelfResult.risk = riskSelfData.m15454clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        RiskSelfData riskSelfData = this.risk;
        int iHashCode = i2 + (riskSelfData != null ? riskSelfData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.risk == null) {
            this.risk = RiskSelfData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
