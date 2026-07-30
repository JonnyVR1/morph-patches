package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.core.data.Grade;
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
public class BLiveFanBaseGetRedPacketUser extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFanBaseGetRedPacketUser> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFanBaseGetRedPacketUser>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFanBaseGetRedPacketUser.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFanBaseGetRedPacketUser.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFanBaseGetRedPacketUser newInstance() {
            return new BLiveFanBaseGetRedPacketUser();
        }

        public boolean parseField(BLiveFanBaseGetRedPacketUser bLiveFanBaseGetRedPacketUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "grabbedGiftContent":
                    bLiveFanBaseGetRedPacketUser.grabbedGiftContent = BLiveFanBaseGift.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "userID":
                    bLiveFanBaseGetRedPacketUser.userID = jsonParser.getValueAsString();
                    return true;
                case "avatarUrl":
                    bLiveFanBaseGetRedPacketUser.avatarUrl = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveFanBaseGetRedPacketUser.name = jsonParser.getValueAsString();
                    return true;
                case "grade":
                    bLiveFanBaseGetRedPacketUser.grade = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFanBaseGetRedPacketUser bLiveFanBaseGetRedPacketUser, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveFanBaseGetRedPacketUser.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = bLiveFanBaseGetRedPacketUser.avatarUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("avatarUrl", str2);
            }
            jsonGenerator.writeNumberField(Grade.TYPE, bLiveFanBaseGetRedPacketUser.grade);
            if (bLiveFanBaseGetRedPacketUser.grabbedGiftContent != null) {
                jsonGenerator.writeFieldName("grabbedGiftContent");
                BLiveFanBaseGift.JSON_ADAPTER.serialize(bLiveFanBaseGetRedPacketUser.grabbedGiftContent, jsonGenerator, true);
            }
            String str3 = bLiveFanBaseGetRedPacketUser.userID;
            if (str3 != null) {
                jsonGenerator.writeStringField("userID", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFanBaseGetRedPacketUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefanbasegetredpacketuser";

    @NonNull
    @ProtobufIndex(index = 2)
    public String avatarUrl;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveFanBaseGift grabbedGiftContent;

    @ProtobufIndex(index = 3)
    public int grade;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 5)
    public String userID;

    public static BLiveFanBaseGetRedPacketUser new_() {
        BLiveFanBaseGetRedPacketUser bLiveFanBaseGetRedPacketUser = new BLiveFanBaseGetRedPacketUser();
        bLiveFanBaseGetRedPacketUser.nullCheck();
        return bLiveFanBaseGetRedPacketUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFanBaseGetRedPacketUser mo223809clone() {
        BLiveFanBaseGetRedPacketUser bLiveFanBaseGetRedPacketUser = new BLiveFanBaseGetRedPacketUser();
        bLiveFanBaseGetRedPacketUser.name = this.name;
        bLiveFanBaseGetRedPacketUser.avatarUrl = this.avatarUrl;
        bLiveFanBaseGetRedPacketUser.grade = this.grade;
        BLiveFanBaseGift bLiveFanBaseGift = this.grabbedGiftContent;
        if (bLiveFanBaseGift != null) {
            bLiveFanBaseGetRedPacketUser.grabbedGiftContent = bLiveFanBaseGift.mo223809clone();
        }
        bLiveFanBaseGetRedPacketUser.userID = this.userID;
        return bLiveFanBaseGetRedPacketUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFanBaseGetRedPacketUser)) {
            return false;
        }
        BLiveFanBaseGetRedPacketUser bLiveFanBaseGetRedPacketUser = (BLiveFanBaseGetRedPacketUser) obj;
        return ValueObject.util_equals(this.name, bLiveFanBaseGetRedPacketUser.name) && ValueObject.util_equals(this.avatarUrl, bLiveFanBaseGetRedPacketUser.avatarUrl) && this.grade == bLiveFanBaseGetRedPacketUser.grade && ValueObject.util_equals(this.grabbedGiftContent, bLiveFanBaseGetRedPacketUser.grabbedGiftContent) && ValueObject.util_equals(this.userID, bLiveFanBaseGetRedPacketUser.userID);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.avatarUrl;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.grade) * 41;
        BLiveFanBaseGift bLiveFanBaseGift = this.grabbedGiftContent;
        int iHashCode3 = (iHashCode2 + (bLiveFanBaseGift != null ? bLiveFanBaseGift.hashCode() : 0)) * 41;
        String str3 = this.userID;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.avatarUrl == null) {
            this.avatarUrl = "";
        }
        if (this.grabbedGiftContent == null) {
            this.grabbedGiftContent = BLiveFanBaseGift.new_();
        }
        if (this.userID == null) {
            this.userID = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
