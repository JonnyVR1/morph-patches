package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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
public class BLiveVideoChatAttendeeCallInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVideoChatAttendeeCallInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVideoChatAttendeeCallInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVideoChatAttendeeCallInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVideoChatAttendeeCallInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVideoChatAttendeeCallInfo newInstance() {
            return new BLiveVideoChatAttendeeCallInfo();
        }

        public boolean parseField(BLiveVideoChatAttendeeCallInfo bLiveVideoChatAttendeeCallInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "anchor":
                    bLiveVideoChatAttendeeCallInfo.anchor = BLiveVideoChatUser.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "callDesc":
                    bLiveVideoChatAttendeeCallInfo.callDesc = jsonParser.getValueAsString();
                    return true;
                case "price":
                    bLiveVideoChatAttendeeCallInfo.price = jsonParser.getValueAsString();
                    return true;
                case "hasDiscountPrice":
                    bLiveVideoChatAttendeeCallInfo.hasDiscountPrice = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVideoChatAttendeeCallInfo bLiveVideoChatAttendeeCallInfo, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveVideoChatAttendeeCallInfo.anchor != null) {
                jsonGenerator.writeFieldName("anchor");
                BLiveVideoChatUser.JSON_ADAPTER.serialize(bLiveVideoChatAttendeeCallInfo.anchor, jsonGenerator, true);
            }
            String str = bLiveVideoChatAttendeeCallInfo.price;
            if (str != null) {
                jsonGenerator.writeStringField(FirebaseAnalytics.Param.PRICE, str);
            }
            jsonGenerator.writeBooleanField("hasDiscountPrice", bLiveVideoChatAttendeeCallInfo.hasDiscountPrice);
            String str2 = bLiveVideoChatAttendeeCallInfo.callDesc;
            if (str2 != null) {
                jsonGenerator.writeStringField("callDesc", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVideoChatAttendeeCallInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevideochatattendeecallinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveVideoChatUser anchor;

    @NonNull
    @ProtobufIndex(index = 4)
    public String callDesc;

    @ProtobufIndex(index = 3)
    public boolean hasDiscountPrice;

    @NonNull
    @ProtobufIndex(index = 2)
    public String price;

    public static BLiveVideoChatAttendeeCallInfo new_() {
        BLiveVideoChatAttendeeCallInfo bLiveVideoChatAttendeeCallInfo = new BLiveVideoChatAttendeeCallInfo();
        bLiveVideoChatAttendeeCallInfo.nullCheck();
        return bLiveVideoChatAttendeeCallInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVideoChatAttendeeCallInfo mo223809clone() {
        BLiveVideoChatAttendeeCallInfo bLiveVideoChatAttendeeCallInfo = new BLiveVideoChatAttendeeCallInfo();
        BLiveVideoChatUser bLiveVideoChatUser = this.anchor;
        if (bLiveVideoChatUser != null) {
            bLiveVideoChatAttendeeCallInfo.anchor = bLiveVideoChatUser.mo223809clone();
        }
        bLiveVideoChatAttendeeCallInfo.price = this.price;
        bLiveVideoChatAttendeeCallInfo.hasDiscountPrice = this.hasDiscountPrice;
        bLiveVideoChatAttendeeCallInfo.callDesc = this.callDesc;
        return bLiveVideoChatAttendeeCallInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVideoChatAttendeeCallInfo)) {
            return false;
        }
        BLiveVideoChatAttendeeCallInfo bLiveVideoChatAttendeeCallInfo = (BLiveVideoChatAttendeeCallInfo) obj;
        return ValueObject.util_equals(this.anchor, bLiveVideoChatAttendeeCallInfo.anchor) && ValueObject.util_equals(this.price, bLiveVideoChatAttendeeCallInfo.price) && this.hasDiscountPrice == bLiveVideoChatAttendeeCallInfo.hasDiscountPrice && ValueObject.util_equals(this.callDesc, bLiveVideoChatAttendeeCallInfo.callDesc);
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
        BLiveVideoChatUser bLiveVideoChatUser = this.anchor;
        int iHashCode = (i2 + (bLiveVideoChatUser != null ? bLiveVideoChatUser.hashCode() : 0)) * 41;
        String str = this.price;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 41) + (this.hasDiscountPrice ? 1231 : 1237)) * 41;
        String str2 = this.callDesc;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.anchor == null) {
            this.anchor = BLiveVideoChatUser.new_();
        }
        if (this.price == null) {
            this.price = "";
        }
        if (this.callDesc == null) {
            this.callDesc = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
