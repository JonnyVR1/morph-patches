package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
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
public class FreeTrialOperateResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "freetrialoperateresult";

    @NonNull
    @ProtobufIndex(index = 2)
    public String msg;

    @NonNull
    @ProtobufIndex(index = 1)
    public String operateResult;
    public static ProtobufAdapter<FreeTrialOperateResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<FreeTrialOperateResult>() { // from class: com.p1.mobile.putong.core.data.FreeTrialOperateResult.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FreeTrialOperateResult freeTrialOperateResult) {
            String str = freeTrialOperateResult.operateResult;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = freeTrialOperateResult.msg;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            freeTrialOperateResult.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FreeTrialOperateResult parse(nb5 nb5Var) throws IOException {
            FreeTrialOperateResult freeTrialOperateResult = new FreeTrialOperateResult();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (freeTrialOperateResult.operateResult == null) {
                        freeTrialOperateResult.operateResult = "";
                    }
                    if (freeTrialOperateResult.msg != null) {
                        break;
                    }
                    freeTrialOperateResult.msg = "";
                    break;
                }
                if (iM158752u == 10) {
                    freeTrialOperateResult.operateResult = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (freeTrialOperateResult.operateResult == null) {
                            freeTrialOperateResult.operateResult = "";
                        }
                        if (freeTrialOperateResult.msg != null) {
                            break;
                        }
                        freeTrialOperateResult.msg = "";
                        return freeTrialOperateResult;
                    }
                    freeTrialOperateResult.msg = nb5Var.m158750s();
                }
            }
            return freeTrialOperateResult;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FreeTrialOperateResult freeTrialOperateResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = freeTrialOperateResult.operateResult;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = freeTrialOperateResult.msg;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<FreeTrialOperateResult> JSON_ADAPTER = new ObjectJsonAdapter<FreeTrialOperateResult>() { // from class: com.p1.mobile.putong.core.data.FreeTrialOperateResult.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FreeTrialOperateResult.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FreeTrialOperateResult newInstance() {
            return new FreeTrialOperateResult();
        }

        public boolean parseField(FreeTrialOperateResult freeTrialOperateResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(LovePlanetStage.result)) {
                freeTrialOperateResult.operateResult = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("msg")) {
                return false;
            }
            freeTrialOperateResult.msg = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(FreeTrialOperateResult freeTrialOperateResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(LovePlanetStage.result) || str.equals("msg")) {
                return true;
            }
            return super.parseFieldCheck(freeTrialOperateResult, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FreeTrialOperateResult freeTrialOperateResult, JsonGenerator jsonGenerator) throws IOException {
            String str = freeTrialOperateResult.operateResult;
            if (str != null) {
                jsonGenerator.writeStringField(LovePlanetStage.result, str);
            }
            String str2 = freeTrialOperateResult.msg;
            if (str2 != null) {
                jsonGenerator.writeStringField("msg", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FreeTrialOperateResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FreeTrialOperateResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FreeTrialOperateResult new_() {
        FreeTrialOperateResult freeTrialOperateResult = new FreeTrialOperateResult();
        freeTrialOperateResult.nullCheck();
        return freeTrialOperateResult;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FreeTrialOperateResult mo223809clone() {
        FreeTrialOperateResult freeTrialOperateResult = new FreeTrialOperateResult();
        freeTrialOperateResult.operateResult = this.operateResult;
        freeTrialOperateResult.msg = this.msg;
        return freeTrialOperateResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FreeTrialOperateResult)) {
            return false;
        }
        FreeTrialOperateResult freeTrialOperateResult = (FreeTrialOperateResult) obj;
        return ValueObject.util_equals(this.operateResult, freeTrialOperateResult.operateResult) && ValueObject.util_equals(this.msg, freeTrialOperateResult.msg);
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
        String str = this.operateResult;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.msg;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.operateResult == null) {
            this.operateResult = "";
        }
        if (this.msg == null) {
            this.msg = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
