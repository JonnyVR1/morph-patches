package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveBossCallDetail;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveBossCall extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveBossCall> JSON_ADAPTER = new ObjectJsonAdapter<BLiveBossCall>() { // from class: com.p1.mobile.putong.live.base.data.BLiveBossCall.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveBossCall.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveBossCall newInstance() {
            return new BLiveBossCall();
        }

        public boolean parseField(BLiveBossCall bLiveBossCall, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userCallType")) {
                bLiveBossCall.userCallType = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("calls")) {
                return false;
            }
            bLiveBossCall.calls = JsonAdapter.parseArray(jsonParser, BLiveBossCallDetail.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveBossCall bLiveBossCall, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveBossCall.userCallType;
            if (str != null) {
                jsonGenerator.writeStringField("userCallType", str);
            }
            if (bLiveBossCall.calls != null) {
                jsonGenerator.writeFieldName("calls");
                JsonAdapter.serializeArray(bLiveBossCall.calls, jsonGenerator, BLiveBossCallDetail.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveBossCall) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivebosscall";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveBossCallDetail> calls;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userCallType;

    public static BLiveBossCall new_() {
        BLiveBossCall bLiveBossCall = new BLiveBossCall();
        bLiveBossCall.nullCheck();
        return bLiveBossCall;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveBossCall mo223809clone() {
        BLiveBossCall bLiveBossCall = new BLiveBossCall();
        bLiveBossCall.userCallType = this.userCallType;
        List<BLiveBossCallDetail> list = this.calls;
        if (list != null) {
            bLiveBossCall.calls = ValueObject.util_map(list, new w9j() { // from class: l.pr1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveBossCallDetail) obj).mo223809clone();
                }
            });
        }
        return bLiveBossCall;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveBossCall)) {
            return false;
        }
        BLiveBossCall bLiveBossCall = (BLiveBossCall) obj;
        return ValueObject.util_equals(this.userCallType, bLiveBossCall.userCallType) && ValueObject.util_equals(this.calls, bLiveBossCall.calls);
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
        String str = this.userCallType;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<BLiveBossCallDetail> list = this.calls;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userCallType == null) {
            this.userCallType = "";
        }
        if (this.calls == null) {
            this.calls = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
