package com.p046p1.mobile.putong.live.base.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveTouchMeDetail extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveTouchMeDetail> JSON_ADAPTER = new ObjectJsonAdapter<BLiveTouchMeDetail>() { // from class: com.p1.mobile.putong.live.base.data.BLiveTouchMeDetail.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveTouchMeDetail.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveTouchMeDetail newInstance() {
            return new BLiveTouchMeDetail();
        }

        public boolean parseField(BLiveTouchMeDetail bLiveTouchMeDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("isOnline")) {
                bLiveTouchMeDetail.isOnline = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("openStatus")) {
                return false;
            }
            bLiveTouchMeDetail.openStatus = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveTouchMeDetail bLiveTouchMeDetail, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isOnline", bLiveTouchMeDetail.isOnline);
            jsonGenerator.writeBooleanField("openStatus", bLiveTouchMeDetail.openStatus);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveTouchMeDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivetouchmedetail";

    @ProtobufIndex(index = 1)
    public boolean isOnline;

    @ProtobufIndex(index = 2)
    public boolean openStatus;

    public static BLiveTouchMeDetail new_() {
        BLiveTouchMeDetail bLiveTouchMeDetail = new BLiveTouchMeDetail();
        bLiveTouchMeDetail.nullCheck();
        return bLiveTouchMeDetail;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveTouchMeDetail mo223809clone() {
        BLiveTouchMeDetail bLiveTouchMeDetail = new BLiveTouchMeDetail();
        bLiveTouchMeDetail.isOnline = this.isOnline;
        bLiveTouchMeDetail.openStatus = this.openStatus;
        return bLiveTouchMeDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveTouchMeDetail)) {
            return false;
        }
        BLiveTouchMeDetail bLiveTouchMeDetail = (BLiveTouchMeDetail) obj;
        return this.isOnline == bLiveTouchMeDetail.isOnline && this.openStatus == bLiveTouchMeDetail.openStatus;
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
        int i2 = (((i * 41) + (this.isOnline ? 1231 : 1237)) * 41) + (this.openStatus ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
