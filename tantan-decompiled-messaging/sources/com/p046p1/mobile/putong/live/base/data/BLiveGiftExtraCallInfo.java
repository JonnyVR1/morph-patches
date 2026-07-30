package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
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
public class BLiveGiftExtraCallInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftExtraCallInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftExtraCallInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftExtraCallInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftExtraCallInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftExtraCallInfo newInstance() {
            return new BLiveGiftExtraCallInfo();
        }

        public boolean parseField(BLiveGiftExtraCallInfo bLiveGiftExtraCallInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "callId":
                    bLiveGiftExtraCallInfo.callId = jsonParser.getValueAsString();
                    return true;
                case "viceAnchorUserId":
                    bLiveGiftExtraCallInfo.viceAnchorUserId = jsonParser.getValueAsString();
                    return true;
                case "mainUserId":
                    bLiveGiftExtraCallInfo.mainUserId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftExtraCallInfo bLiveGiftExtraCallInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftExtraCallInfo.callId;
            if (str != null) {
                jsonGenerator.writeStringField("callId", str);
            }
            String str2 = bLiveGiftExtraCallInfo.mainUserId;
            if (str2 != null) {
                jsonGenerator.writeStringField("mainUserId", str2);
            }
            String str3 = bLiveGiftExtraCallInfo.viceAnchorUserId;
            if (str3 != null) {
                jsonGenerator.writeStringField("viceAnchorUserId", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftExtraCallInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftextracallinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String callId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String mainUserId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String viceAnchorUserId;

    public static BLiveGiftExtraCallInfo new_() {
        BLiveGiftExtraCallInfo bLiveGiftExtraCallInfo = new BLiveGiftExtraCallInfo();
        bLiveGiftExtraCallInfo.nullCheck();
        return bLiveGiftExtraCallInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftExtraCallInfo mo223809clone() {
        BLiveGiftExtraCallInfo bLiveGiftExtraCallInfo = new BLiveGiftExtraCallInfo();
        bLiveGiftExtraCallInfo.callId = this.callId;
        bLiveGiftExtraCallInfo.mainUserId = this.mainUserId;
        bLiveGiftExtraCallInfo.viceAnchorUserId = this.viceAnchorUserId;
        return bLiveGiftExtraCallInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftExtraCallInfo)) {
            return false;
        }
        BLiveGiftExtraCallInfo bLiveGiftExtraCallInfo = (BLiveGiftExtraCallInfo) obj;
        return ValueObject.util_equals(this.callId, bLiveGiftExtraCallInfo.callId) && ValueObject.util_equals(this.mainUserId, bLiveGiftExtraCallInfo.mainUserId) && ValueObject.util_equals(this.viceAnchorUserId, bLiveGiftExtraCallInfo.viceAnchorUserId);
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
        String str = this.callId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.mainUserId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.viceAnchorUserId;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.callId == null) {
            this.callId = "";
        }
        if (this.mainUserId == null) {
            this.mainUserId = "";
        }
        if (this.viceAnchorUserId == null) {
            this.viceAnchorUserId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
