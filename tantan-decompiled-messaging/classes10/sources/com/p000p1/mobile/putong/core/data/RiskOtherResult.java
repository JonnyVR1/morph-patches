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
public class RiskOtherResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "riskotherresult";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public RiskOtherData descriptionRisk;

    @NonNull
    @ProtobufIndex(index = 1)
    public RiskOtherData userRisk;
    public static ProtobufAdapter<RiskOtherResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<RiskOtherResult>() { // from class: com.p1.mobile.putong.core.data.RiskOtherResult.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RiskOtherResult riskOtherResult) {
            RiskOtherData riskOtherData = riskOtherResult.userRisk;
            int iL = riskOtherData != null ? CodedOutputByteBufferNano.l(1, riskOtherData, RiskOtherData.PROTOBUF_ADAPTER) : 0;
            RiskOtherData riskOtherData2 = riskOtherResult.descriptionRisk;
            if (riskOtherData2 != null) {
                iL += CodedOutputByteBufferNano.l(2, riskOtherData2, RiskOtherData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) riskOtherResult).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RiskOtherResult m15451parse(nb5 nb5Var) throws IOException {
            RiskOtherResult riskOtherResult = new RiskOtherResult();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (riskOtherResult.userRisk == null) {
                        riskOtherResult.userRisk = RiskOtherData.new_();
                    }
                    if (riskOtherResult.descriptionRisk != null) {
                        break;
                    }
                    riskOtherResult.descriptionRisk = RiskOtherData.new_();
                    break;
                }
                if (iU == 10) {
                    riskOtherResult.userRisk = (RiskOtherData) nb5Var.l(RiskOtherData.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (riskOtherResult.userRisk == null) {
                            riskOtherResult.userRisk = RiskOtherData.new_();
                        }
                        if (riskOtherResult.descriptionRisk != null) {
                            break;
                        }
                        riskOtherResult.descriptionRisk = RiskOtherData.new_();
                        return riskOtherResult;
                    }
                    riskOtherResult.descriptionRisk = (RiskOtherData) nb5Var.l(RiskOtherData.PROTOBUF_ADAPTER);
                }
            }
            return riskOtherResult;
        }

        public void serialize(RiskOtherResult riskOtherResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            RiskOtherData riskOtherData = riskOtherResult.userRisk;
            if (riskOtherData != null) {
                codedOutputByteBufferNano.K(1, riskOtherData, RiskOtherData.PROTOBUF_ADAPTER);
            }
            RiskOtherData riskOtherData2 = riskOtherResult.descriptionRisk;
            if (riskOtherData2 != null) {
                codedOutputByteBufferNano.K(2, riskOtherData2, RiskOtherData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<RiskOtherResult> JSON_ADAPTER = new ObjectJsonAdapter<RiskOtherResult>() { // from class: com.p1.mobile.putong.core.data.RiskOtherResult.2
        public Class getDataClass() {
            return RiskOtherResult.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RiskOtherResult m15452newInstance() {
            return new RiskOtherResult();
        }

        public boolean parseField(RiskOtherResult riskOtherResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userRisk")) {
                riskOtherResult.userRisk = (RiskOtherData) RiskOtherData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("descriptionRisk")) {
                return false;
            }
            riskOtherResult.descriptionRisk = (RiskOtherData) RiskOtherData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(RiskOtherResult riskOtherResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userRisk") || str.equals("descriptionRisk")) {
                return true;
            }
            return super.parseFieldCheck(riskOtherResult, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RiskOtherResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RiskOtherResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RiskOtherResult new_() {
        RiskOtherResult riskOtherResult = new RiskOtherResult();
        riskOtherResult.nullCheck();
        return riskOtherResult;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RiskOtherResult m15450clone() {
        RiskOtherResult riskOtherResult = new RiskOtherResult();
        RiskOtherData riskOtherData = this.userRisk;
        if (riskOtherData != null) {
            riskOtherResult.userRisk = riskOtherData.m15446clone();
        }
        RiskOtherData riskOtherData2 = this.descriptionRisk;
        if (riskOtherData2 != null) {
            riskOtherResult.descriptionRisk = riskOtherData2.m15446clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        RiskOtherData riskOtherData = this.userRisk;
        int iHashCode = (i2 + (riskOtherData != null ? riskOtherData.hashCode() : 0)) * 41;
        RiskOtherData riskOtherData2 = this.descriptionRisk;
        int iHashCode2 = iHashCode + (riskOtherData2 != null ? riskOtherData2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.userRisk == null) {
            this.userRisk = RiskOtherData.new_();
        }
        if (this.descriptionRisk == null) {
            this.descriptionRisk = RiskOtherData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
