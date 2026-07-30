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
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceGiftWallBookInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceGiftWallBookInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceGiftWallBookInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBookInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceGiftWallBookInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceGiftWallBookInfo newInstance() {
            return new BLiveVoiceGiftWallBookInfo();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1655164295:
                    if (str.equals("noLightReason")) {
                        b = 0;
                    }
                    break;
                case -1246042517:
                    if (str.equals("giftId")) {
                        b = 1;
                    }
                    break;
                case -1037701588:
                    if (str.equals("firstLightUserId")) {
                        b = 2;
                    }
                    break;
                case -870281654:
                    if (str.equals("mostGiveUserName")) {
                        b = 3;
                    }
                    break;
                case -798663844:
                    if (str.equals("firstLightUserName")) {
                        b = 4;
                    }
                    break;
                case -144300250:
                    if (str.equals("canLight")) {
                        b = 5;
                    }
                    break;
                case 173421982:
                    if (str.equals("giftWallBookId")) {
                        b = 6;
                    }
                    break;
                case 550080011:
                    if (str.equals("giftImage")) {
                        b = 7;
                    }
                    break;
                case 556701177:
                    if (str.equals("giftPrice")) {
                        b = 8;
                    }
                    break;
                case 560137992:
                    if (str.equals("giftTitle")) {
                        b = 9;
                    }
                    break;
                case 824828248:
                    if (str.equals("mostGiveUserAvatar")) {
                        b = 10;
                    }
                    break;
                case 930066922:
                    if (str.equals("firstLightUserAvatar")) {
                        b = 11;
                    }
                    break;
                case 1149722683:
                    if (str.equals("mostGiveCount")) {
                        b = 12;
                    }
                    break;
                case 1800209562:
                    if (str.equals("mostGiveUserId")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1938543667:
                    if (str.equals("firstLightTime")) {
                        b = 14;
                    }
                    break;
                case 2064376332:
                    if (str.equals("isLight")) {
                        b = 15;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveVoiceGiftWallBookInfo.noLightReason = jsonParser.getValueAsString();
                    return true;
                case 1:
                    bLiveVoiceGiftWallBookInfo.giftId = jsonParser.getValueAsString();
                    return true;
                case 2:
                    bLiveVoiceGiftWallBookInfo.firstLightUserId = jsonParser.getValueAsString();
                    return true;
                case 3:
                    bLiveVoiceGiftWallBookInfo.mostGiveUserName = jsonParser.getValueAsString();
                    return true;
                case 4:
                    bLiveVoiceGiftWallBookInfo.firstLightUserName = jsonParser.getValueAsString();
                    return true;
                case 5:
                    bLiveVoiceGiftWallBookInfo.canLight = jsonParser.getValueAsBoolean();
                    return true;
                case 6:
                    bLiveVoiceGiftWallBookInfo.giftWallBookId = jsonParser.getValueAsString();
                    return true;
                case 7:
                    bLiveVoiceGiftWallBookInfo.giftImage = jsonParser.getValueAsString();
                    return true;
                case 8:
                    bLiveVoiceGiftWallBookInfo.giftPrice = jsonParser.getValueAsString();
                    return true;
                case 9:
                    bLiveVoiceGiftWallBookInfo.giftTitle = jsonParser.getValueAsString();
                    return true;
                case 10:
                    bLiveVoiceGiftWallBookInfo.mostGiveUserAvatar = jsonParser.getValueAsString();
                    return true;
                case 11:
                    bLiveVoiceGiftWallBookInfo.firstLightUserAvatar = jsonParser.getValueAsString();
                    return true;
                case 12:
                    bLiveVoiceGiftWallBookInfo.mostGiveCount = jsonParser.getValueAsInt();
                    return true;
                case 13:
                    bLiveVoiceGiftWallBookInfo.mostGiveUserId = jsonParser.getValueAsString();
                    return true;
                case 14:
                    bLiveVoiceGiftWallBookInfo.firstLightTime = jsonParser.getValueAsString();
                    return true;
                case 15:
                    bLiveVoiceGiftWallBookInfo.isLight = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceGiftWallBookInfo.giftWallBookId;
            if (str != null) {
                jsonGenerator.writeStringField("giftWallBookId", str);
            }
            jsonGenerator.writeBooleanField("isLight", bLiveVoiceGiftWallBookInfo.isLight);
            String str2 = bLiveVoiceGiftWallBookInfo.giftId;
            if (str2 != null) {
                jsonGenerator.writeStringField("giftId", str2);
            }
            String str3 = bLiveVoiceGiftWallBookInfo.giftImage;
            if (str3 != null) {
                jsonGenerator.writeStringField("giftImage", str3);
            }
            String str4 = bLiveVoiceGiftWallBookInfo.giftTitle;
            if (str4 != null) {
                jsonGenerator.writeStringField("giftTitle", str4);
            }
            String str5 = bLiveVoiceGiftWallBookInfo.giftPrice;
            if (str5 != null) {
                jsonGenerator.writeStringField("giftPrice", str5);
            }
            jsonGenerator.writeBooleanField("canLight", bLiveVoiceGiftWallBookInfo.canLight);
            String str6 = bLiveVoiceGiftWallBookInfo.noLightReason;
            if (str6 != null) {
                jsonGenerator.writeStringField("noLightReason", str6);
            }
            String str7 = bLiveVoiceGiftWallBookInfo.firstLightTime;
            if (str7 != null) {
                jsonGenerator.writeStringField("firstLightTime", str7);
            }
            String str8 = bLiveVoiceGiftWallBookInfo.firstLightUserId;
            if (str8 != null) {
                jsonGenerator.writeStringField("firstLightUserId", str8);
            }
            String str9 = bLiveVoiceGiftWallBookInfo.firstLightUserName;
            if (str9 != null) {
                jsonGenerator.writeStringField("firstLightUserName", str9);
            }
            String str10 = bLiveVoiceGiftWallBookInfo.firstLightUserAvatar;
            if (str10 != null) {
                jsonGenerator.writeStringField("firstLightUserAvatar", str10);
            }
            String str11 = bLiveVoiceGiftWallBookInfo.mostGiveUserId;
            if (str11 != null) {
                jsonGenerator.writeStringField("mostGiveUserId", str11);
            }
            String str12 = bLiveVoiceGiftWallBookInfo.mostGiveUserName;
            if (str12 != null) {
                jsonGenerator.writeStringField("mostGiveUserName", str12);
            }
            String str13 = bLiveVoiceGiftWallBookInfo.mostGiveUserAvatar;
            if (str13 != null) {
                jsonGenerator.writeStringField("mostGiveUserAvatar", str13);
            }
            jsonGenerator.writeNumberField("mostGiveCount", bLiveVoiceGiftWallBookInfo.mostGiveCount);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceGiftWallBookInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicegiftwallbookinfo";

    @ProtobufIndex(index = 7)
    public boolean canLight;

    @NonNull
    @ProtobufIndex(index = 9)
    public String firstLightTime;

    @NonNull
    @ProtobufIndex(index = 12)
    public String firstLightUserAvatar;

    @NonNull
    @ProtobufIndex(index = 10)
    public String firstLightUserId;

    @NonNull
    @ProtobufIndex(index = 11)
    public String firstLightUserName;

    @NonNull
    @ProtobufIndex(index = 3)
    public String giftId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String giftImage;

    @NonNull
    @ProtobufIndex(index = 6)
    public String giftPrice;

    @NonNull
    @ProtobufIndex(index = 5)
    public String giftTitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String giftWallBookId;

    @ProtobufIndex(index = 2)
    public boolean isLight;

    @ProtobufIndex(index = 16)
    public int mostGiveCount;

    @NonNull
    @ProtobufIndex(index = 15)
    public String mostGiveUserAvatar;

    @NonNull
    @ProtobufIndex(index = 13)
    public String mostGiveUserId;

    @NonNull
    @ProtobufIndex(index = 14)
    public String mostGiveUserName;

    @NonNull
    @ProtobufIndex(index = 8)
    public String noLightReason;

    public static BLiveVoiceGiftWallBookInfo new_() {
        BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo = new BLiveVoiceGiftWallBookInfo();
        bLiveVoiceGiftWallBookInfo.nullCheck();
        return bLiveVoiceGiftWallBookInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceGiftWallBookInfo mo225055clone() {
        BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo = new BLiveVoiceGiftWallBookInfo();
        bLiveVoiceGiftWallBookInfo.giftWallBookId = this.giftWallBookId;
        bLiveVoiceGiftWallBookInfo.isLight = this.isLight;
        bLiveVoiceGiftWallBookInfo.giftId = this.giftId;
        bLiveVoiceGiftWallBookInfo.giftImage = this.giftImage;
        bLiveVoiceGiftWallBookInfo.giftTitle = this.giftTitle;
        bLiveVoiceGiftWallBookInfo.giftPrice = this.giftPrice;
        bLiveVoiceGiftWallBookInfo.canLight = this.canLight;
        bLiveVoiceGiftWallBookInfo.noLightReason = this.noLightReason;
        bLiveVoiceGiftWallBookInfo.firstLightTime = this.firstLightTime;
        bLiveVoiceGiftWallBookInfo.firstLightUserId = this.firstLightUserId;
        bLiveVoiceGiftWallBookInfo.firstLightUserName = this.firstLightUserName;
        bLiveVoiceGiftWallBookInfo.firstLightUserAvatar = this.firstLightUserAvatar;
        bLiveVoiceGiftWallBookInfo.mostGiveUserId = this.mostGiveUserId;
        bLiveVoiceGiftWallBookInfo.mostGiveUserName = this.mostGiveUserName;
        bLiveVoiceGiftWallBookInfo.mostGiveUserAvatar = this.mostGiveUserAvatar;
        bLiveVoiceGiftWallBookInfo.mostGiveCount = this.mostGiveCount;
        return bLiveVoiceGiftWallBookInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceGiftWallBookInfo)) {
            return false;
        }
        BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo = (BLiveVoiceGiftWallBookInfo) obj;
        return ValueObject.util_equals(this.giftWallBookId, bLiveVoiceGiftWallBookInfo.giftWallBookId) && this.isLight == bLiveVoiceGiftWallBookInfo.isLight && ValueObject.util_equals(this.giftId, bLiveVoiceGiftWallBookInfo.giftId) && ValueObject.util_equals(this.giftImage, bLiveVoiceGiftWallBookInfo.giftImage) && ValueObject.util_equals(this.giftTitle, bLiveVoiceGiftWallBookInfo.giftTitle) && ValueObject.util_equals(this.giftPrice, bLiveVoiceGiftWallBookInfo.giftPrice) && this.canLight == bLiveVoiceGiftWallBookInfo.canLight && ValueObject.util_equals(this.noLightReason, bLiveVoiceGiftWallBookInfo.noLightReason) && ValueObject.util_equals(this.firstLightTime, bLiveVoiceGiftWallBookInfo.firstLightTime) && ValueObject.util_equals(this.firstLightUserId, bLiveVoiceGiftWallBookInfo.firstLightUserId) && ValueObject.util_equals(this.firstLightUserName, bLiveVoiceGiftWallBookInfo.firstLightUserName) && ValueObject.util_equals(this.firstLightUserAvatar, bLiveVoiceGiftWallBookInfo.firstLightUserAvatar) && ValueObject.util_equals(this.mostGiveUserId, bLiveVoiceGiftWallBookInfo.mostGiveUserId) && ValueObject.util_equals(this.mostGiveUserName, bLiveVoiceGiftWallBookInfo.mostGiveUserName) && ValueObject.util_equals(this.mostGiveUserAvatar, bLiveVoiceGiftWallBookInfo.mostGiveUserAvatar) && this.mostGiveCount == bLiveVoiceGiftWallBookInfo.mostGiveCount;
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
        String str = this.giftWallBookId;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.isLight ? 1231 : 1237)) * 41;
        String str2 = this.giftId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.giftImage;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.giftTitle;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.giftPrice;
        int iHashCode5 = (((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41) + (this.canLight ? 1231 : 1237)) * 41;
        String str6 = this.noLightReason;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.firstLightTime;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.firstLightUserId;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.firstLightUserName;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.firstLightUserAvatar;
        int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.mostGiveUserId;
        int iHashCode11 = (iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * 41;
        String str12 = this.mostGiveUserName;
        int iHashCode12 = (iHashCode11 + (str12 != null ? str12.hashCode() : 0)) * 41;
        String str13 = this.mostGiveUserAvatar;
        int iHashCode13 = ((iHashCode12 + (str13 != null ? str13.hashCode() : 0)) * 41) + this.mostGiveCount;
        this.hashCode = iHashCode13;
        return iHashCode13;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.giftWallBookId == null) {
            this.giftWallBookId = "";
        }
        if (this.giftId == null) {
            this.giftId = "";
        }
        if (this.giftImage == null) {
            this.giftImage = "";
        }
        if (this.giftTitle == null) {
            this.giftTitle = "";
        }
        if (this.giftPrice == null) {
            this.giftPrice = "";
        }
        if (this.noLightReason == null) {
            this.noLightReason = "";
        }
        if (this.firstLightTime == null) {
            this.firstLightTime = "";
        }
        if (this.firstLightUserId == null) {
            this.firstLightUserId = "";
        }
        if (this.firstLightUserName == null) {
            this.firstLightUserName = "";
        }
        if (this.firstLightUserAvatar == null) {
            this.firstLightUserAvatar = "";
        }
        if (this.mostGiveUserId == null) {
            this.mostGiveUserId = "";
        }
        if (this.mostGiveUserName == null) {
            this.mostGiveUserName = "";
        }
        if (this.mostGiveUserAvatar == null) {
            this.mostGiveUserAvatar = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
