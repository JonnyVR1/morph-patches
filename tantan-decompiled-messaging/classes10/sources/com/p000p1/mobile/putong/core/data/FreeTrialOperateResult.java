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
public class FreeTrialOperateResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "freetrialoperateresult";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String msg;

    @NonNull
    @ProtobufIndex(index = 1)
    public String operateResult;
    public static ProtobufAdapter<FreeTrialOperateResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<FreeTrialOperateResult>() { // from class: com.p1.mobile.putong.core.data.FreeTrialOperateResult.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FreeTrialOperateResult freeTrialOperateResult) {
            String str = freeTrialOperateResult.operateResult;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = freeTrialOperateResult.msg;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) freeTrialOperateResult).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FreeTrialOperateResult m12841parse(nb5 nb5Var) throws IOException {
            FreeTrialOperateResult freeTrialOperateResult = new FreeTrialOperateResult();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (freeTrialOperateResult.operateResult == null) {
                        freeTrialOperateResult.operateResult = "";
                    }
                    if (freeTrialOperateResult.msg != null) {
                        break;
                    }
                    freeTrialOperateResult.msg = "";
                    break;
                }
                if (iU == 10) {
                    freeTrialOperateResult.operateResult = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (freeTrialOperateResult.operateResult == null) {
                            freeTrialOperateResult.operateResult = "";
                        }
                        if (freeTrialOperateResult.msg != null) {
                            break;
                        }
                        freeTrialOperateResult.msg = "";
                        return freeTrialOperateResult;
                    }
                    freeTrialOperateResult.msg = nb5Var.s();
                }
            }
            return freeTrialOperateResult;
        }

        public void serialize(FreeTrialOperateResult freeTrialOperateResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = freeTrialOperateResult.operateResult;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = freeTrialOperateResult.msg;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<FreeTrialOperateResult> JSON_ADAPTER = new ObjectJsonAdapter<FreeTrialOperateResult>() { // from class: com.p1.mobile.putong.core.data.FreeTrialOperateResult.2
        public Class getDataClass() {
            return FreeTrialOperateResult.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FreeTrialOperateResult m12842newInstance() {
            return new FreeTrialOperateResult();
        }

        public boolean parseField(FreeTrialOperateResult freeTrialOperateResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("result")) {
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
            if (str.equals("result") || str.equals("msg")) {
                return true;
            }
            return super.parseFieldCheck(freeTrialOperateResult, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(FreeTrialOperateResult freeTrialOperateResult, JsonGenerator jsonGenerator) throws IOException {
            String str = freeTrialOperateResult.operateResult;
            if (str != null) {
                jsonGenerator.writeStringField("result", str);
            }
            String str2 = freeTrialOperateResult.msg;
            if (str2 != null) {
                jsonGenerator.writeStringField("msg", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FreeTrialOperateResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FreeTrialOperateResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FreeTrialOperateResult new_() {
        FreeTrialOperateResult freeTrialOperateResult = new FreeTrialOperateResult();
        freeTrialOperateResult.nullCheck();
        return freeTrialOperateResult;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FreeTrialOperateResult m12840clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.operateResult;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.msg;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.operateResult == null) {
            this.operateResult = "";
        }
        if (this.msg == null) {
            this.msg = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
