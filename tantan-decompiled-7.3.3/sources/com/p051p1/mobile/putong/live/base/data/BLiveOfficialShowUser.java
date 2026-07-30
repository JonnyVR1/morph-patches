package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveOfficialShowUser extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveOfficialShowUser> JSON_ADAPTER = new ObjectJsonAdapter<BLiveOfficialShowUser>() { // from class: com.p1.mobile.putong.live.base.data.BLiveOfficialShowUser.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveOfficialShowUser.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveOfficialShowUser newInstance() {
            return new BLiveOfficialShowUser();
        }

        public boolean parseField(BLiveOfficialShowUser bLiveOfficialShowUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "timeDesc":
                    bLiveOfficialShowUser.timeDesc = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveOfficialShowUser.userId = jsonParser.getValueAsString();
                    return true;
                case "isFollowed":
                    bLiveOfficialShowUser.isFollowed = jsonParser.getValueAsBoolean();
                    return true;
                case "userDesc":
                    bLiveOfficialShowUser.userDesc = jsonParser.getValueAsString();
                    return true;
                case "userName":
                    bLiveOfficialShowUser.userName = jsonParser.getValueAsString();
                    return true;
                case "userAvatar":
                    bLiveOfficialShowUser.userAvatar = jsonParser.getValueAsString();
                    return true;
                case "userBanner":
                    bLiveOfficialShowUser.userBanner = BLiveBanner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveOfficialShowUser bLiveOfficialShowUser, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveOfficialShowUser.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveOfficialShowUser.userName;
            if (str2 != null) {
                jsonGenerator.writeStringField("userName", str2);
            }
            String str3 = bLiveOfficialShowUser.userAvatar;
            if (str3 != null) {
                jsonGenerator.writeStringField("userAvatar", str3);
            }
            String str4 = bLiveOfficialShowUser.timeDesc;
            if (str4 != null) {
                jsonGenerator.writeStringField("timeDesc", str4);
            }
            String str5 = bLiveOfficialShowUser.userDesc;
            if (str5 != null) {
                jsonGenerator.writeStringField("userDesc", str5);
            }
            jsonGenerator.writeBooleanField("isFollowed", bLiveOfficialShowUser.isFollowed);
            if (bLiveOfficialShowUser.userBanner != null) {
                jsonGenerator.writeFieldName("userBanner");
                BLiveBanner.JSON_ADAPTER.serialize(bLiveOfficialShowUser.userBanner, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveOfficialShowUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveofficialshowuser";

    @ProtobufIndex(index = 6)
    public boolean isFollowed;

    @NonNull
    @ProtobufIndex(index = 4)
    public String timeDesc;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userAvatar;

    @NonNull
    @ProtobufIndex(index = 7)
    public BLiveBanner userBanner;

    @NonNull
    @ProtobufIndex(index = 5)
    public String userDesc;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userName;

    public static BLiveOfficialShowUser new_() {
        BLiveOfficialShowUser bLiveOfficialShowUser = new BLiveOfficialShowUser();
        bLiveOfficialShowUser.nullCheck();
        return bLiveOfficialShowUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveOfficialShowUser mo225055clone() {
        BLiveOfficialShowUser bLiveOfficialShowUser = new BLiveOfficialShowUser();
        bLiveOfficialShowUser.userId = this.userId;
        bLiveOfficialShowUser.userName = this.userName;
        bLiveOfficialShowUser.userAvatar = this.userAvatar;
        bLiveOfficialShowUser.timeDesc = this.timeDesc;
        bLiveOfficialShowUser.userDesc = this.userDesc;
        bLiveOfficialShowUser.isFollowed = this.isFollowed;
        BLiveBanner bLiveBanner = this.userBanner;
        if (bLiveBanner != null) {
            bLiveOfficialShowUser.userBanner = bLiveBanner.mo225055clone();
        }
        return bLiveOfficialShowUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveOfficialShowUser)) {
            return false;
        }
        BLiveOfficialShowUser bLiveOfficialShowUser = (BLiveOfficialShowUser) obj;
        return ValueObject.util_equals(this.userId, bLiveOfficialShowUser.userId) && ValueObject.util_equals(this.userName, bLiveOfficialShowUser.userName) && ValueObject.util_equals(this.userAvatar, bLiveOfficialShowUser.userAvatar) && ValueObject.util_equals(this.timeDesc, bLiveOfficialShowUser.timeDesc) && ValueObject.util_equals(this.userDesc, bLiveOfficialShowUser.userDesc) && this.isFollowed == bLiveOfficialShowUser.isFollowed && ValueObject.util_equals(this.userBanner, bLiveOfficialShowUser.userBanner);
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
        String str3 = this.userAvatar;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.timeDesc;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.userDesc;
        int iHashCode5 = (((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41) + (this.isFollowed ? 1231 : 1237)) * 41;
        BLiveBanner bLiveBanner = this.userBanner;
        int iHashCode6 = iHashCode5 + (bLiveBanner != null ? bLiveBanner.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.userAvatar == null) {
            this.userAvatar = "";
        }
        if (this.timeDesc == null) {
            this.timeDesc = "";
        }
        if (this.userDesc == null) {
            this.userDesc = "";
        }
        if (this.userBanner == null) {
            this.userBanner = BLiveBanner.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
