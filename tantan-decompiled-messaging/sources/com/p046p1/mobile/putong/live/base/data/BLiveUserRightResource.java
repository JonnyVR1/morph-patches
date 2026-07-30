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
public class BLiveUserRightResource extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUserRightResource> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUserRightResource>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUserRightResource.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUserRightResource.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUserRightResource newInstance() {
            return new BLiveUserRightResource();
        }

        public boolean parseField(BLiveUserRightResource bLiveUserRightResource, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "fromUserId":
                    bLiveUserRightResource.fromUserId = jsonParser.getValueAsString();
                    return true;
                case "rightType":
                    bLiveUserRightResource.rightType = jsonParser.getValueAsString();
                    return true;
                case "avatarConfig":
                    bLiveUserRightResource.avatarConfig = BLiveAvatarConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "userId":
                    bLiveUserRightResource.userId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUserRightResource bLiveUserRightResource, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveUserRightResource.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveUserRightResource.rightType;
            if (str2 != null) {
                jsonGenerator.writeStringField("rightType", str2);
            }
            String str3 = bLiveUserRightResource.fromUserId;
            if (str3 != null) {
                jsonGenerator.writeStringField("fromUserId", str3);
            }
            if (bLiveUserRightResource.avatarConfig != null) {
                jsonGenerator.writeFieldName("avatarConfig");
                BLiveAvatarConfig.JSON_ADAPTER.serialize(bLiveUserRightResource.avatarConfig, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUserRightResource) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveuserrightresource";

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveAvatarConfig avatarConfig;

    @NonNull
    @ProtobufIndex(index = 3)
    public String fromUserId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String rightType;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    public static BLiveUserRightResource new_() {
        BLiveUserRightResource bLiveUserRightResource = new BLiveUserRightResource();
        bLiveUserRightResource.nullCheck();
        return bLiveUserRightResource;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUserRightResource mo223809clone() {
        BLiveUserRightResource bLiveUserRightResource = new BLiveUserRightResource();
        bLiveUserRightResource.userId = this.userId;
        bLiveUserRightResource.rightType = this.rightType;
        bLiveUserRightResource.fromUserId = this.fromUserId;
        BLiveAvatarConfig bLiveAvatarConfig = this.avatarConfig;
        if (bLiveAvatarConfig != null) {
            bLiveUserRightResource.avatarConfig = bLiveAvatarConfig.mo223809clone();
        }
        return bLiveUserRightResource;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUserRightResource)) {
            return false;
        }
        BLiveUserRightResource bLiveUserRightResource = (BLiveUserRightResource) obj;
        return ValueObject.util_equals(this.userId, bLiveUserRightResource.userId) && ValueObject.util_equals(this.rightType, bLiveUserRightResource.rightType) && ValueObject.util_equals(this.fromUserId, bLiveUserRightResource.fromUserId) && ValueObject.util_equals(this.avatarConfig, bLiveUserRightResource.avatarConfig);
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
        String str2 = this.rightType;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.fromUserId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        BLiveAvatarConfig bLiveAvatarConfig = this.avatarConfig;
        int iHashCode4 = iHashCode3 + (bLiveAvatarConfig != null ? bLiveAvatarConfig.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.rightType == null) {
            this.rightType = "";
        }
        if (this.fromUserId == null) {
            this.fromUserId = "";
        }
        if (this.avatarConfig == null) {
            this.avatarConfig = BLiveAvatarConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
