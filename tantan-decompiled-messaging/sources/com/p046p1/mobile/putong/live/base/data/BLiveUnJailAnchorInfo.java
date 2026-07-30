package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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
public class BLiveUnJailAnchorInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUnJailAnchorInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUnJailAnchorInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUnJailAnchorInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUnJailAnchorInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUnJailAnchorInfo newInstance() {
            return new BLiveUnJailAnchorInfo();
        }

        public boolean parseField(BLiveUnJailAnchorInfo bLiveUnJailAnchorInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "liveId":
                    bLiveUnJailAnchorInfo.liveId = jsonParser.getValueAsString();
                    return true;
                case "roomId":
                    bLiveUnJailAnchorInfo.roomId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveUnJailAnchorInfo.f44463id = jsonParser.getValueAsLong();
                    return false;
                case "name":
                    bLiveUnJailAnchorInfo.name = jsonParser.getValueAsString();
                    return true;
                case "giftType":
                    bLiveUnJailAnchorInfo.giftType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUnJailAnchorInfo bLiveUnJailAnchorInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", bLiveUnJailAnchorInfo.f44463id);
            String str = bLiveUnJailAnchorInfo.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = bLiveUnJailAnchorInfo.roomId;
            if (str2 != null) {
                jsonGenerator.writeStringField("roomId", str2);
            }
            String str3 = bLiveUnJailAnchorInfo.liveId;
            if (str3 != null) {
                jsonGenerator.writeStringField("liveId", str3);
            }
            String str4 = bLiveUnJailAnchorInfo.giftType;
            if (str4 != null) {
                jsonGenerator.writeStringField("giftType", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUnJailAnchorInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveunjailanchorinfo";

    @NonNull
    @ProtobufIndex(index = 5)
    public String giftType;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public long f44463id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 3)
    public String roomId;

    public static BLiveUnJailAnchorInfo new_() {
        BLiveUnJailAnchorInfo bLiveUnJailAnchorInfo = new BLiveUnJailAnchorInfo();
        bLiveUnJailAnchorInfo.nullCheck();
        return bLiveUnJailAnchorInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUnJailAnchorInfo mo223809clone() {
        BLiveUnJailAnchorInfo bLiveUnJailAnchorInfo = new BLiveUnJailAnchorInfo();
        bLiveUnJailAnchorInfo.f44463id = this.f44463id;
        bLiveUnJailAnchorInfo.name = this.name;
        bLiveUnJailAnchorInfo.roomId = this.roomId;
        bLiveUnJailAnchorInfo.liveId = this.liveId;
        bLiveUnJailAnchorInfo.giftType = this.giftType;
        return bLiveUnJailAnchorInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUnJailAnchorInfo)) {
            return false;
        }
        BLiveUnJailAnchorInfo bLiveUnJailAnchorInfo = (BLiveUnJailAnchorInfo) obj;
        return this.f44463id == bLiveUnJailAnchorInfo.f44463id && ValueObject.util_equals(this.name, bLiveUnJailAnchorInfo.name) && ValueObject.util_equals(this.roomId, bLiveUnJailAnchorInfo.roomId) && ValueObject.util_equals(this.liveId, bLiveUnJailAnchorInfo.liveId) && ValueObject.util_equals(this.giftType, bLiveUnJailAnchorInfo.giftType);
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
        long j = this.f44463id;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.roomId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.liveId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.giftType;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.giftType == null) {
            this.giftType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
