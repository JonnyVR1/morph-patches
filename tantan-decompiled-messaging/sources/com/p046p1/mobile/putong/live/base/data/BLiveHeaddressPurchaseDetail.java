package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.BundleStatus;
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
public class BLiveHeaddressPurchaseDetail extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveHeaddressPurchaseDetail> JSON_ADAPTER = new ObjectJsonAdapter<BLiveHeaddressPurchaseDetail>() { // from class: com.p1.mobile.putong.live.base.data.BLiveHeaddressPurchaseDetail.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveHeaddressPurchaseDetail.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveHeaddressPurchaseDetail newInstance() {
            return new BLiveHeaddressPurchaseDetail();
        }

        public boolean parseField(BLiveHeaddressPurchaseDetail bLiveHeaddressPurchaseDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "purchased":
                    bLiveHeaddressPurchaseDetail.purchased = jsonParser.getValueAsBoolean();
                    return true;
                case "inuse":
                    bLiveHeaddressPurchaseDetail.inuse = jsonParser.getValueAsBoolean();
                    return true;
                case "userRightId":
                    bLiveHeaddressPurchaseDetail.userRightId = jsonParser.getValueAsString();
                    return true;
                case "validEndTime":
                    bLiveHeaddressPurchaseDetail.validEndTime = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveHeaddressPurchaseDetail bLiveHeaddressPurchaseDetail, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveHeaddressPurchaseDetail.userRightId;
            if (str != null) {
                jsonGenerator.writeStringField("userRightId", str);
            }
            jsonGenerator.writeBooleanField(BundleStatus.purchased, bLiveHeaddressPurchaseDetail.purchased);
            jsonGenerator.writeBooleanField("inuse", bLiveHeaddressPurchaseDetail.inuse);
            jsonGenerator.writeNumberField("validEndTime", bLiveHeaddressPurchaseDetail.validEndTime);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveHeaddressPurchaseDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveheaddresspurchasedetail";

    @ProtobufIndex(index = 3)
    public boolean inuse;

    @ProtobufIndex(index = 2)
    public boolean purchased;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userRightId;

    @ProtobufIndex(index = 4)
    public long validEndTime;

    public static BLiveHeaddressPurchaseDetail new_() {
        BLiveHeaddressPurchaseDetail bLiveHeaddressPurchaseDetail = new BLiveHeaddressPurchaseDetail();
        bLiveHeaddressPurchaseDetail.nullCheck();
        return bLiveHeaddressPurchaseDetail;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveHeaddressPurchaseDetail mo223809clone() {
        BLiveHeaddressPurchaseDetail bLiveHeaddressPurchaseDetail = new BLiveHeaddressPurchaseDetail();
        bLiveHeaddressPurchaseDetail.userRightId = this.userRightId;
        bLiveHeaddressPurchaseDetail.purchased = this.purchased;
        bLiveHeaddressPurchaseDetail.inuse = this.inuse;
        bLiveHeaddressPurchaseDetail.validEndTime = this.validEndTime;
        return bLiveHeaddressPurchaseDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveHeaddressPurchaseDetail)) {
            return false;
        }
        BLiveHeaddressPurchaseDetail bLiveHeaddressPurchaseDetail = (BLiveHeaddressPurchaseDetail) obj;
        return ValueObject.util_equals(this.userRightId, bLiveHeaddressPurchaseDetail.userRightId) && this.purchased == bLiveHeaddressPurchaseDetail.purchased && this.inuse == bLiveHeaddressPurchaseDetail.inuse && this.validEndTime == bLiveHeaddressPurchaseDetail.validEndTime;
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
        String str = this.userRightId;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.purchased ? 1231 : 1237)) * 41;
        int i3 = this.inuse ? 1231 : 1237;
        long j = this.validEndTime;
        int i4 = ((iHashCode + i3) * 41) + ((int) (j ^ (j >>> 32)));
        this.hashCode = i4;
        return i4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userRightId == null) {
            this.userRightId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
