package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.OMSResourceType;
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
public class BLiveVirtualVoiceCpHouseInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVirtualVoiceCpHouseInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVirtualVoiceCpHouseInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVirtualVoiceCpHouseInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVirtualVoiceCpHouseInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVirtualVoiceCpHouseInfo newInstance() {
            return new BLiveVirtualVoiceCpHouseInfo();
        }

        public boolean parseField(BLiveVirtualVoiceCpHouseInfo bLiveVirtualVoiceCpHouseInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "upgradeGap":
                    bLiveVirtualVoiceCpHouseInfo.upgradeGap = jsonParser.getValueAsString();
                    return true;
                case "profileEffect":
                    bLiveVirtualVoiceCpHouseInfo.profileEffect = jsonParser.getValueAsString();
                    return true;
                case "background":
                    bLiveVirtualVoiceCpHouseInfo.background = jsonParser.getValueAsString();
                    return true;
                case "isUnlocked":
                    bLiveVirtualVoiceCpHouseInfo.isUnlocked = jsonParser.getValueAsBoolean();
                    return true;
                case "luxuryValue":
                    bLiveVirtualVoiceCpHouseInfo.luxuryValue = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveVirtualVoiceCpHouseInfo.f44479id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    bLiveVirtualVoiceCpHouseInfo.name = jsonParser.getValueAsString();
                    return true;
                case "image":
                    bLiveVirtualVoiceCpHouseInfo.image = jsonParser.getValueAsString();
                    return true;
                case "level":
                    bLiveVirtualVoiceCpHouseInfo.level = jsonParser.getValueAsInt();
                    return true;
                case "profileAvatarEffect":
                    bLiveVirtualVoiceCpHouseInfo.profileAvatarEffect = jsonParser.getValueAsString();
                    return true;
                case "profileVideoEffect":
                    bLiveVirtualVoiceCpHouseInfo.profileVideoEffect = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVirtualVoiceCpHouseInfo bLiveVirtualVoiceCpHouseInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVirtualVoiceCpHouseInfo.f44479id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVirtualVoiceCpHouseInfo.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = bLiveVirtualVoiceCpHouseInfo.background;
            if (str3 != null) {
                jsonGenerator.writeStringField(OMSResourceType.background, str3);
            }
            String str4 = bLiveVirtualVoiceCpHouseInfo.image;
            if (str4 != null) {
                jsonGenerator.writeStringField("image", str4);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.LEVEL, bLiveVirtualVoiceCpHouseInfo.level);
            jsonGenerator.writeBooleanField("isUnlocked", bLiveVirtualVoiceCpHouseInfo.isUnlocked);
            String str5 = bLiveVirtualVoiceCpHouseInfo.profileEffect;
            if (str5 != null) {
                jsonGenerator.writeStringField("profileEffect", str5);
            }
            String str6 = bLiveVirtualVoiceCpHouseInfo.upgradeGap;
            if (str6 != null) {
                jsonGenerator.writeStringField("upgradeGap", str6);
            }
            String str7 = bLiveVirtualVoiceCpHouseInfo.luxuryValue;
            if (str7 != null) {
                jsonGenerator.writeStringField("luxuryValue", str7);
            }
            String str8 = bLiveVirtualVoiceCpHouseInfo.profileAvatarEffect;
            if (str8 != null) {
                jsonGenerator.writeStringField("profileAvatarEffect", str8);
            }
            String str9 = bLiveVirtualVoiceCpHouseInfo.profileVideoEffect;
            if (str9 != null) {
                jsonGenerator.writeStringField("profileVideoEffect", str9);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVirtualVoiceCpHouseInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevirtualvoicecphouseinfo";

    @NonNull
    @ProtobufIndex(index = 3)
    public String background;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44479id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String image;

    @ProtobufIndex(index = 6)
    public boolean isUnlocked;

    @ProtobufIndex(index = 5)
    public int level;

    @NonNull
    @ProtobufIndex(index = 9)
    public String luxuryValue;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 10)
    public String profileAvatarEffect;

    @NonNull
    @ProtobufIndex(index = 7)
    public String profileEffect;

    @NonNull
    @ProtobufIndex(index = 11)
    public String profileVideoEffect;

    @NonNull
    @ProtobufIndex(index = 8)
    public String upgradeGap;

    public static BLiveVirtualVoiceCpHouseInfo new_() {
        BLiveVirtualVoiceCpHouseInfo bLiveVirtualVoiceCpHouseInfo = new BLiveVirtualVoiceCpHouseInfo();
        bLiveVirtualVoiceCpHouseInfo.nullCheck();
        return bLiveVirtualVoiceCpHouseInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVirtualVoiceCpHouseInfo mo223809clone() {
        BLiveVirtualVoiceCpHouseInfo bLiveVirtualVoiceCpHouseInfo = new BLiveVirtualVoiceCpHouseInfo();
        bLiveVirtualVoiceCpHouseInfo.f44479id = this.f44479id;
        bLiveVirtualVoiceCpHouseInfo.name = this.name;
        bLiveVirtualVoiceCpHouseInfo.background = this.background;
        bLiveVirtualVoiceCpHouseInfo.image = this.image;
        bLiveVirtualVoiceCpHouseInfo.level = this.level;
        bLiveVirtualVoiceCpHouseInfo.isUnlocked = this.isUnlocked;
        bLiveVirtualVoiceCpHouseInfo.profileEffect = this.profileEffect;
        bLiveVirtualVoiceCpHouseInfo.upgradeGap = this.upgradeGap;
        bLiveVirtualVoiceCpHouseInfo.luxuryValue = this.luxuryValue;
        bLiveVirtualVoiceCpHouseInfo.profileAvatarEffect = this.profileAvatarEffect;
        bLiveVirtualVoiceCpHouseInfo.profileVideoEffect = this.profileVideoEffect;
        return bLiveVirtualVoiceCpHouseInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVirtualVoiceCpHouseInfo)) {
            return false;
        }
        BLiveVirtualVoiceCpHouseInfo bLiveVirtualVoiceCpHouseInfo = (BLiveVirtualVoiceCpHouseInfo) obj;
        return ValueObject.util_equals(this.f44479id, bLiveVirtualVoiceCpHouseInfo.f44479id) && ValueObject.util_equals(this.name, bLiveVirtualVoiceCpHouseInfo.name) && ValueObject.util_equals(this.background, bLiveVirtualVoiceCpHouseInfo.background) && ValueObject.util_equals(this.image, bLiveVirtualVoiceCpHouseInfo.image) && this.level == bLiveVirtualVoiceCpHouseInfo.level && this.isUnlocked == bLiveVirtualVoiceCpHouseInfo.isUnlocked && ValueObject.util_equals(this.profileEffect, bLiveVirtualVoiceCpHouseInfo.profileEffect) && ValueObject.util_equals(this.upgradeGap, bLiveVirtualVoiceCpHouseInfo.upgradeGap) && ValueObject.util_equals(this.luxuryValue, bLiveVirtualVoiceCpHouseInfo.luxuryValue) && ValueObject.util_equals(this.profileAvatarEffect, bLiveVirtualVoiceCpHouseInfo.profileAvatarEffect) && ValueObject.util_equals(this.profileVideoEffect, bLiveVirtualVoiceCpHouseInfo.profileVideoEffect);
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
        String str = this.f44479id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.background;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.image;
        int iHashCode4 = (((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.level) * 41) + (this.isUnlocked ? 1231 : 1237)) * 41;
        String str5 = this.profileEffect;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.upgradeGap;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.luxuryValue;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.profileAvatarEffect;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.profileVideoEffect;
        int iHashCode9 = iHashCode8 + (str9 != null ? str9.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44479id == null) {
            this.f44479id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.background == null) {
            this.background = "";
        }
        if (this.image == null) {
            this.image = "";
        }
        if (this.profileEffect == null) {
            this.profileEffect = "";
        }
        if (this.upgradeGap == null) {
            this.upgradeGap = "";
        }
        if (this.luxuryValue == null) {
            this.luxuryValue = "";
        }
        if (this.profileAvatarEffect == null) {
            this.profileAvatarEffect = "";
        }
        if (this.profileVideoEffect == null) {
            this.profileVideoEffect = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
