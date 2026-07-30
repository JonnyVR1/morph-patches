package com.p046p1.mobile.putong.live.base.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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
public class BLiveRightAnchorInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveRightAnchorInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveRightAnchorInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveRightAnchorInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveRightAnchorInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveRightAnchorInfo newInstance() {
            return new BLiveRightAnchorInfo();
        }

        public boolean parseField(BLiveRightAnchorInfo bLiveRightAnchorInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "avatar":
                    bLiveRightAnchorInfo.avatar = jsonParser.getValueAsString();
                    return true;
                case "status":
                    bLiveRightAnchorInfo.status = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveRightAnchorInfo.f44432id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    bLiveRightAnchorInfo.name = jsonParser.getValueAsString();
                    return true;
                case "userRightId":
                    bLiveRightAnchorInfo.userRightId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveRightAnchorInfo bLiveRightAnchorInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveRightAnchorInfo.f44432id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveRightAnchorInfo.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = bLiveRightAnchorInfo.avatar;
            if (str3 != null) {
                jsonGenerator.writeStringField("avatar", str3);
            }
            String str4 = bLiveRightAnchorInfo.status;
            if (str4 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str4);
            }
            String str5 = bLiveRightAnchorInfo.userRightId;
            if (str5 != null) {
                jsonGenerator.writeStringField("userRightId", str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveRightAnchorInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliverightanchorinfo";

    @NonNull
    @ProtobufIndex(index = 3)
    public String avatar;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44432id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 4)
    public String status;

    @NonNull
    @ProtobufIndex(index = 5)
    public String userRightId;

    public static BLiveRightAnchorInfo new_() {
        BLiveRightAnchorInfo bLiveRightAnchorInfo = new BLiveRightAnchorInfo();
        bLiveRightAnchorInfo.nullCheck();
        return bLiveRightAnchorInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveRightAnchorInfo mo223809clone() {
        BLiveRightAnchorInfo bLiveRightAnchorInfo = new BLiveRightAnchorInfo();
        bLiveRightAnchorInfo.f44432id = this.f44432id;
        bLiveRightAnchorInfo.name = this.name;
        bLiveRightAnchorInfo.avatar = this.avatar;
        bLiveRightAnchorInfo.status = this.status;
        bLiveRightAnchorInfo.userRightId = this.userRightId;
        return bLiveRightAnchorInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveRightAnchorInfo)) {
            return false;
        }
        BLiveRightAnchorInfo bLiveRightAnchorInfo = (BLiveRightAnchorInfo) obj;
        return ValueObject.util_equals(this.f44432id, bLiveRightAnchorInfo.f44432id) && ValueObject.util_equals(this.name, bLiveRightAnchorInfo.name) && ValueObject.util_equals(this.avatar, bLiveRightAnchorInfo.avatar) && ValueObject.util_equals(this.status, bLiveRightAnchorInfo.status) && ValueObject.util_equals(this.userRightId, bLiveRightAnchorInfo.userRightId);
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
        String str = this.f44432id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.avatar;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.status;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.userRightId;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    public boolean isEquipped() {
        return TextUtils.equals(this.status, "equipped");
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44432id == null) {
            this.f44432id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.userRightId == null) {
            this.userRightId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
