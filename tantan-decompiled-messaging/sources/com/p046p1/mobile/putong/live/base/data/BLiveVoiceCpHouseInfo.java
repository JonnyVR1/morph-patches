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
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceCpHouseInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceCpHouseInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceCpHouseInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceCpHouseInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceCpHouseInfo newInstance() {
            return new BLiveVoiceCpHouseInfo();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1641345674:
                    if (str.equals("otherUserId")) {
                        b = 0;
                    }
                    break;
                case -1596347255:
                    if (str.equals("luxuryGap")) {
                        b = 1;
                    }
                    break;
                case -1471378278:
                    if (str.equals("profileEffect")) {
                        b = 2;
                    }
                    break;
                case -1246042517:
                    if (str.equals("giftId")) {
                        b = 3;
                    }
                    break;
                case -1141694276:
                    if (str.equals("meUserAvatar")) {
                        b = 4;
                    }
                    break;
                case -1080045530:
                    if (str.equals("otherUserName")) {
                        b = 5;
                    }
                    break;
                case -861826962:
                    if (str.equals("houseBackground")) {
                        b = 6;
                    }
                    break;
                case -836030906:
                    if (str.equals("userId")) {
                        b = 7;
                    }
                    break;
                case -809397321:
                    if (str.equals("cpLuxuryValue")) {
                        b = 8;
                    }
                    break;
                case -724149935:
                    if (str.equals("cpUserAvatar")) {
                        b = 9;
                    }
                    break;
                case -570815324:
                    if (str.equals("medalImage")) {
                        b = 10;
                    }
                    break;
                case -266666762:
                    if (str.equals("userName")) {
                        b = 11;
                    }
                    break;
                case -167361234:
                    if (str.equals("isUnLock")) {
                        b = 12;
                    }
                    break;
                case 3059304:
                    if (str.equals("cpId")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 3492908:
                    if (str.equals(BLivePkCategory.rank)) {
                        b = 14;
                    }
                    break;
                case 550371648:
                    if (str.equals("houseUnlockLuxuryValue")) {
                        b = 15;
                    }
                    break;
                case 923941668:
                    if (str.equals("houseLuxuryValue")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 940545650:
                    if (str.equals("medalId")) {
                        b = 17;
                    }
                    break;
                case 1033512395:
                    if (str.equals("houseName")) {
                        b = 18;
                    }
                    break;
                case 1033631596:
                    if (str.equals("houseRank")) {
                        b = 19;
                    }
                    break;
                case 1100515419:
                    if (str.equals("houseId")) {
                        b = 20;
                    }
                    break;
                case 1969841691:
                    if (str.equals("houseImage")) {
                        b = 21;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveVoiceCpHouseInfo.otherUserId = jsonParser.getValueAsString();
                    return true;
                case 1:
                    bLiveVoiceCpHouseInfo.luxuryGap = jsonParser.getValueAsString();
                    return true;
                case 2:
                    bLiveVoiceCpHouseInfo.profileEffect = jsonParser.getValueAsString();
                    return true;
                case 3:
                    bLiveVoiceCpHouseInfo.giftId = jsonParser.getValueAsString();
                    return true;
                case 4:
                    bLiveVoiceCpHouseInfo.meUserAvatar = jsonParser.getValueAsString();
                    return true;
                case 5:
                    bLiveVoiceCpHouseInfo.otherUserName = jsonParser.getValueAsString();
                    return true;
                case 6:
                    bLiveVoiceCpHouseInfo.houseBackground = jsonParser.getValueAsString();
                    return true;
                case 7:
                    bLiveVoiceCpHouseInfo.userId = jsonParser.getValueAsString();
                    return true;
                case 8:
                    bLiveVoiceCpHouseInfo.cpLuxuryValue = jsonParser.getValueAsDouble();
                    return true;
                case 9:
                    bLiveVoiceCpHouseInfo.cpUserAvatar = jsonParser.getValueAsString();
                    return true;
                case 10:
                    bLiveVoiceCpHouseInfo.medalImage = jsonParser.getValueAsString();
                    return true;
                case 11:
                    bLiveVoiceCpHouseInfo.userName = jsonParser.getValueAsString();
                    return true;
                case 12:
                    bLiveVoiceCpHouseInfo.isUnLock = jsonParser.getValueAsBoolean();
                    return true;
                case 13:
                    bLiveVoiceCpHouseInfo.cpId = jsonParser.getValueAsString();
                    return true;
                case 14:
                    bLiveVoiceCpHouseInfo.rank = jsonParser.getValueAsInt();
                    return true;
                case 15:
                    bLiveVoiceCpHouseInfo.houseUnlockLuxuryValue = jsonParser.getValueAsDouble();
                    return true;
                case 16:
                    bLiveVoiceCpHouseInfo.houseLuxuryValue = jsonParser.getValueAsDouble();
                    return true;
                case 17:
                    bLiveVoiceCpHouseInfo.medalId = jsonParser.getValueAsString();
                    return true;
                case 18:
                    bLiveVoiceCpHouseInfo.houseName = jsonParser.getValueAsString();
                    return true;
                case 19:
                    bLiveVoiceCpHouseInfo.houseRank = jsonParser.getValueAsInt();
                    return true;
                case 20:
                    bLiveVoiceCpHouseInfo.houseId = jsonParser.getValueAsString();
                    return true;
                case 21:
                    bLiveVoiceCpHouseInfo.houseImage = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceCpHouseInfo.houseId;
            if (str != null) {
                jsonGenerator.writeStringField("houseId", str);
            }
            jsonGenerator.writeNumberField("houseUnlockLuxuryValue", bLiveVoiceCpHouseInfo.houseUnlockLuxuryValue);
            String str2 = bLiveVoiceCpHouseInfo.medalId;
            if (str2 != null) {
                jsonGenerator.writeStringField("medalId", str2);
            }
            jsonGenerator.writeNumberField("houseRank", bLiveVoiceCpHouseInfo.houseRank);
            String str3 = bLiveVoiceCpHouseInfo.houseName;
            if (str3 != null) {
                jsonGenerator.writeStringField("houseName", str3);
            }
            String str4 = bLiveVoiceCpHouseInfo.giftId;
            if (str4 != null) {
                jsonGenerator.writeStringField("giftId", str4);
            }
            jsonGenerator.writeBooleanField("isUnLock", bLiveVoiceCpHouseInfo.isUnLock);
            String str5 = bLiveVoiceCpHouseInfo.medalImage;
            if (str5 != null) {
                jsonGenerator.writeStringField("medalImage", str5);
            }
            String str6 = bLiveVoiceCpHouseInfo.houseBackground;
            if (str6 != null) {
                jsonGenerator.writeStringField("houseBackground", str6);
            }
            jsonGenerator.writeNumberField("cpLuxuryValue", bLiveVoiceCpHouseInfo.cpLuxuryValue);
            jsonGenerator.writeNumberField("houseLuxuryValue", bLiveVoiceCpHouseInfo.houseLuxuryValue);
            String str7 = bLiveVoiceCpHouseInfo.cpUserAvatar;
            if (str7 != null) {
                jsonGenerator.writeStringField("cpUserAvatar", str7);
            }
            String str8 = bLiveVoiceCpHouseInfo.cpId;
            if (str8 != null) {
                jsonGenerator.writeStringField("cpId", str8);
            }
            String str9 = bLiveVoiceCpHouseInfo.houseImage;
            if (str9 != null) {
                jsonGenerator.writeStringField("houseImage", str9);
            }
            String str10 = bLiveVoiceCpHouseInfo.meUserAvatar;
            if (str10 != null) {
                jsonGenerator.writeStringField("meUserAvatar", str10);
            }
            String str11 = bLiveVoiceCpHouseInfo.userName;
            if (str11 != null) {
                jsonGenerator.writeStringField("userName", str11);
            }
            String str12 = bLiveVoiceCpHouseInfo.otherUserName;
            if (str12 != null) {
                jsonGenerator.writeStringField("otherUserName", str12);
            }
            String str13 = bLiveVoiceCpHouseInfo.luxuryGap;
            if (str13 != null) {
                jsonGenerator.writeStringField("luxuryGap", str13);
            }
            String str14 = bLiveVoiceCpHouseInfo.otherUserId;
            if (str14 != null) {
                jsonGenerator.writeStringField("otherUserId", str14);
            }
            String str15 = bLiveVoiceCpHouseInfo.userId;
            if (str15 != null) {
                jsonGenerator.writeStringField("userId", str15);
            }
            jsonGenerator.writeNumberField(BLivePkCategory.rank, bLiveVoiceCpHouseInfo.rank);
            String str16 = bLiveVoiceCpHouseInfo.profileEffect;
            if (str16 != null) {
                jsonGenerator.writeStringField("profileEffect", str16);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceCpHouseInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicecphouseinfo";

    @NonNull
    @ProtobufIndex(index = 12)
    public String cpId;

    @ProtobufIndex(index = 9)
    public double cpLuxuryValue;

    @NonNull
    @ProtobufIndex(index = 11)
    public String cpUserAvatar;

    @NonNull
    @ProtobufIndex(index = 6)
    public String giftId;

    @NonNull
    @ProtobufIndex(index = 15)
    public String houseBackground;

    @NonNull
    @ProtobufIndex(index = 1)
    public String houseId;

    @NonNull
    @ProtobufIndex(index = 13)
    public String houseImage;

    @ProtobufIndex(index = 10)
    public double houseLuxuryValue;

    @NonNull
    @ProtobufIndex(index = 5)
    public String houseName;

    @ProtobufIndex(index = 4)
    public int houseRank;

    @ProtobufIndex(index = 2)
    public double houseUnlockLuxuryValue;

    @ProtobufIndex(index = 7)
    public boolean isUnLock;

    @NonNull
    @ProtobufIndex(index = 18)
    public String luxuryGap;

    @NonNull
    @ProtobufIndex(index = 14)
    public String meUserAvatar;

    @NonNull
    @ProtobufIndex(index = 3)
    public String medalId;

    @NonNull
    @ProtobufIndex(index = 8)
    public String medalImage;

    @NonNull
    @ProtobufIndex(index = 19)
    public String otherUserId;

    @NonNull
    @ProtobufIndex(index = 17)
    public String otherUserName;

    @NonNull
    @ProtobufIndex(index = 22)
    public String profileEffect;

    @ProtobufIndex(index = 21)
    public int rank;

    @NonNull
    @ProtobufIndex(index = 20)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 16)
    public String userName;

    public static BLiveVoiceCpHouseInfo new_() {
        BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo = new BLiveVoiceCpHouseInfo();
        bLiveVoiceCpHouseInfo.nullCheck();
        return bLiveVoiceCpHouseInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceCpHouseInfo mo223809clone() {
        BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo = new BLiveVoiceCpHouseInfo();
        bLiveVoiceCpHouseInfo.houseId = this.houseId;
        bLiveVoiceCpHouseInfo.houseUnlockLuxuryValue = this.houseUnlockLuxuryValue;
        bLiveVoiceCpHouseInfo.medalId = this.medalId;
        bLiveVoiceCpHouseInfo.houseRank = this.houseRank;
        bLiveVoiceCpHouseInfo.houseName = this.houseName;
        bLiveVoiceCpHouseInfo.giftId = this.giftId;
        bLiveVoiceCpHouseInfo.isUnLock = this.isUnLock;
        bLiveVoiceCpHouseInfo.medalImage = this.medalImage;
        bLiveVoiceCpHouseInfo.houseBackground = this.houseBackground;
        bLiveVoiceCpHouseInfo.cpLuxuryValue = this.cpLuxuryValue;
        bLiveVoiceCpHouseInfo.houseLuxuryValue = this.houseLuxuryValue;
        bLiveVoiceCpHouseInfo.cpUserAvatar = this.cpUserAvatar;
        bLiveVoiceCpHouseInfo.cpId = this.cpId;
        bLiveVoiceCpHouseInfo.houseImage = this.houseImage;
        bLiveVoiceCpHouseInfo.meUserAvatar = this.meUserAvatar;
        bLiveVoiceCpHouseInfo.userName = this.userName;
        bLiveVoiceCpHouseInfo.otherUserName = this.otherUserName;
        bLiveVoiceCpHouseInfo.luxuryGap = this.luxuryGap;
        bLiveVoiceCpHouseInfo.otherUserId = this.otherUserId;
        bLiveVoiceCpHouseInfo.userId = this.userId;
        bLiveVoiceCpHouseInfo.rank = this.rank;
        bLiveVoiceCpHouseInfo.profileEffect = this.profileEffect;
        return bLiveVoiceCpHouseInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceCpHouseInfo)) {
            return false;
        }
        BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo = (BLiveVoiceCpHouseInfo) obj;
        return ValueObject.util_equals(this.houseId, bLiveVoiceCpHouseInfo.houseId) && this.houseUnlockLuxuryValue == bLiveVoiceCpHouseInfo.houseUnlockLuxuryValue && ValueObject.util_equals(this.medalId, bLiveVoiceCpHouseInfo.medalId) && this.houseRank == bLiveVoiceCpHouseInfo.houseRank && ValueObject.util_equals(this.houseName, bLiveVoiceCpHouseInfo.houseName) && ValueObject.util_equals(this.giftId, bLiveVoiceCpHouseInfo.giftId) && this.isUnLock == bLiveVoiceCpHouseInfo.isUnLock && ValueObject.util_equals(this.medalImage, bLiveVoiceCpHouseInfo.medalImage) && ValueObject.util_equals(this.houseBackground, bLiveVoiceCpHouseInfo.houseBackground) && this.cpLuxuryValue == bLiveVoiceCpHouseInfo.cpLuxuryValue && this.houseLuxuryValue == bLiveVoiceCpHouseInfo.houseLuxuryValue && ValueObject.util_equals(this.cpUserAvatar, bLiveVoiceCpHouseInfo.cpUserAvatar) && ValueObject.util_equals(this.cpId, bLiveVoiceCpHouseInfo.cpId) && ValueObject.util_equals(this.houseImage, bLiveVoiceCpHouseInfo.houseImage) && ValueObject.util_equals(this.meUserAvatar, bLiveVoiceCpHouseInfo.meUserAvatar) && ValueObject.util_equals(this.userName, bLiveVoiceCpHouseInfo.userName) && ValueObject.util_equals(this.otherUserName, bLiveVoiceCpHouseInfo.otherUserName) && ValueObject.util_equals(this.luxuryGap, bLiveVoiceCpHouseInfo.luxuryGap) && ValueObject.util_equals(this.otherUserId, bLiveVoiceCpHouseInfo.otherUserId) && ValueObject.util_equals(this.userId, bLiveVoiceCpHouseInfo.userId) && this.rank == bLiveVoiceCpHouseInfo.rank && ValueObject.util_equals(this.profileEffect, bLiveVoiceCpHouseInfo.profileEffect);
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
        String str = this.houseId;
        int iHashCode = str != null ? str.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.houseUnlockLuxuryValue);
        int i3 = (((i2 + iHashCode) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str2 = this.medalId;
        int iHashCode2 = (((i3 + (str2 != null ? str2.hashCode() : 0)) * 41) + this.houseRank) * 41;
        String str3 = this.houseName;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.giftId;
        int iHashCode4 = (((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.isUnLock ? 1231 : 1237)) * 41;
        String str5 = this.medalImage;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.houseBackground;
        int iHashCode6 = iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.cpLuxuryValue);
        int i4 = (iHashCode6 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.houseLuxuryValue);
        int i5 = ((i4 * 41) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 41;
        String str7 = this.cpUserAvatar;
        int iHashCode7 = (i5 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.cpId;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.houseImage;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.meUserAvatar;
        int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.userName;
        int iHashCode11 = (iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * 41;
        String str12 = this.otherUserName;
        int iHashCode12 = (iHashCode11 + (str12 != null ? str12.hashCode() : 0)) * 41;
        String str13 = this.luxuryGap;
        int iHashCode13 = (iHashCode12 + (str13 != null ? str13.hashCode() : 0)) * 41;
        String str14 = this.otherUserId;
        int iHashCode14 = (iHashCode13 + (str14 != null ? str14.hashCode() : 0)) * 41;
        String str15 = this.userId;
        int iHashCode15 = (((iHashCode14 + (str15 != null ? str15.hashCode() : 0)) * 41) + this.rank) * 41;
        String str16 = this.profileEffect;
        int iHashCode16 = iHashCode15 + (str16 != null ? str16.hashCode() : 0);
        this.hashCode = iHashCode16;
        return iHashCode16;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.houseId == null) {
            this.houseId = "";
        }
        if (this.medalId == null) {
            this.medalId = "";
        }
        if (this.houseName == null) {
            this.houseName = "";
        }
        if (this.giftId == null) {
            this.giftId = "";
        }
        if (this.medalImage == null) {
            this.medalImage = "";
        }
        if (this.houseBackground == null) {
            this.houseBackground = "";
        }
        if (this.cpUserAvatar == null) {
            this.cpUserAvatar = "";
        }
        if (this.cpId == null) {
            this.cpId = "";
        }
        if (this.houseImage == null) {
            this.houseImage = "";
        }
        if (this.meUserAvatar == null) {
            this.meUserAvatar = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.otherUserName == null) {
            this.otherUserName = "";
        }
        if (this.luxuryGap == null) {
            this.luxuryGap = "";
        }
        if (this.otherUserId == null) {
            this.otherUserId = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.profileEffect == null) {
            this.profileEffect = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
