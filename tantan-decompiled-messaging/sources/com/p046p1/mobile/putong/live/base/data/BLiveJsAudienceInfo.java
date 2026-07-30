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
public class BLiveJsAudienceInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveJsAudienceInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveJsAudienceInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveJsAudienceInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveJsAudienceInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveJsAudienceInfo newInstance() {
            return new BLiveJsAudienceInfo();
        }

        public boolean parseField(BLiveJsAudienceInfo bLiveJsAudienceInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "isHost":
                    bLiveJsAudienceInfo.isHost = jsonParser.getValueAsBoolean();
                    return true;
                case "userId":
                    bLiveJsAudienceInfo.userId = jsonParser.getValueAsString();
                    return true;
                case "userName":
                    bLiveJsAudienceInfo.userName = jsonParser.getValueAsString();
                    return true;
                case "userImage":
                    bLiveJsAudienceInfo.userImage = jsonParser.getValueAsString();
                    return true;
                case "position":
                    bLiveJsAudienceInfo.position = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveJsAudienceInfo bLiveJsAudienceInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveJsAudienceInfo.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveJsAudienceInfo.userName;
            if (str2 != null) {
                jsonGenerator.writeStringField("userName", str2);
            }
            String str3 = bLiveJsAudienceInfo.userImage;
            if (str3 != null) {
                jsonGenerator.writeStringField("userImage", str3);
            }
            jsonGenerator.writeBooleanField("isHost", bLiveJsAudienceInfo.isHost);
            jsonGenerator.writeNumberField("position", bLiveJsAudienceInfo.position);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveJsAudienceInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivejsaudienceinfo";

    @ProtobufIndex(index = 4)
    public boolean isHost;

    @ProtobufIndex(index = 5)
    public int position;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userImage;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userName;

    public static BLiveJsAudienceInfo new_() {
        BLiveJsAudienceInfo bLiveJsAudienceInfo = new BLiveJsAudienceInfo();
        bLiveJsAudienceInfo.nullCheck();
        return bLiveJsAudienceInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveJsAudienceInfo mo223809clone() {
        BLiveJsAudienceInfo bLiveJsAudienceInfo = new BLiveJsAudienceInfo();
        bLiveJsAudienceInfo.userId = this.userId;
        bLiveJsAudienceInfo.userName = this.userName;
        bLiveJsAudienceInfo.userImage = this.userImage;
        bLiveJsAudienceInfo.isHost = this.isHost;
        bLiveJsAudienceInfo.position = this.position;
        return bLiveJsAudienceInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveJsAudienceInfo)) {
            return false;
        }
        BLiveJsAudienceInfo bLiveJsAudienceInfo = (BLiveJsAudienceInfo) obj;
        return ValueObject.util_equals(this.userId, bLiveJsAudienceInfo.userId) && ValueObject.util_equals(this.userName, bLiveJsAudienceInfo.userName) && ValueObject.util_equals(this.userImage, bLiveJsAudienceInfo.userImage) && this.isHost == bLiveJsAudienceInfo.isHost && this.position == bLiveJsAudienceInfo.position;
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.userImage;
        int iHashCode3 = ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.isHost ? 1231 : 1237)) * 41) + this.position;
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.userImage == null) {
            this.userImage = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
