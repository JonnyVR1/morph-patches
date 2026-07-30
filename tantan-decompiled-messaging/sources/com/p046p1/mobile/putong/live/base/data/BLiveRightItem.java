package com.p046p1.mobile.putong.live.base.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
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
public class BLiveRightItem extends ValueObject implements Cloneable, Serializable {
    public static final String ACTION_ACTIVE = "activate";
    public static final String ACTION_EQUIP = "equip";
    public static final String ACTION_UN_EQUIP = "unequip";
    public static JsonAdapter<BLiveRightItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveRightItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveRightItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveRightItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveRightItem newInstance() {
            return new BLiveRightItem();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveRightItem bLiveRightItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2037669785:
                    if (str.equals("todayDisable")) {
                        b = 0;
                    }
                    break;
                case -1724546052:
                    if (str.equals("description")) {
                        b = 1;
                    }
                    break;
                case -1569307961:
                    if (str.equals("rightName")) {
                        b = 2;
                    }
                    break;
                case -1569106058:
                    if (str.equals("rightType")) {
                        b = 3;
                    }
                    break;
                case -1463513069:
                    if (str.equals("periodEndTimeInSeconds")) {
                        b = 4;
                    }
                    break;
                case -1255161247:
                    if (str.equals("jumpUrl")) {
                        b = 5;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 6;
                    }
                    break;
                case -510320899:
                    if (str.equals("rightPeriod")) {
                        b = 7;
                    }
                    break;
                case -356760349:
                    if (str.equals("thumbnailUrl")) {
                        b = 8;
                    }
                    break;
                case -285437776:
                    if (str.equals("dynamicUrl")) {
                        b = 9;
                    }
                    break;
                case 13085340:
                    if (str.equals("attribute")) {
                        b = 10;
                    }
                    break;
                case 19648543:
                    if (str.equals("scrapInfo")) {
                        b = 11;
                    }
                    break;
                case 155642962:
                    if (str.equals("updatedTimeInSeconds")) {
                        b = 12;
                    }
                    break;
                case 623926705:
                    if (str.equals("createTimeInSeconds")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 668488878:
                    if (str.equals("permanent")) {
                        b = 14;
                    }
                    break;
                case 898733580:
                    if (str.equals("userRightId")) {
                        b = 15;
                    }
                    break;
                case 1200600151:
                    if (str.equals("rightId")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 1603148003:
                    if (str.equals("fromUserInfo")) {
                        b = 17;
                    }
                    break;
                case 1792213217:
                    if (str.equals("placeType")) {
                        b = 18;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveRightItem.todayDisable = jsonParser.getValueAsBoolean();
                    return true;
                case 1:
                    bLiveRightItem.description = jsonParser.getValueAsString();
                    return true;
                case 2:
                    bLiveRightItem.rightName = jsonParser.getValueAsString();
                    return true;
                case 3:
                    bLiveRightItem.rightType = jsonParser.getValueAsString();
                    return true;
                case 4:
                    bLiveRightItem.periodEndTimeInSeconds = jsonParser.getValueAsLong();
                    return true;
                case 5:
                    bLiveRightItem.jumpUrl = jsonParser.getValueAsString();
                    return true;
                case 6:
                    bLiveRightItem.status = jsonParser.getValueAsString();
                    return true;
                case 7:
                    bLiveRightItem.rightPeriod = jsonParser.getValueAsString();
                    return true;
                case 8:
                    bLiveRightItem.thumbnailUrl = jsonParser.getValueAsString();
                    return true;
                case 9:
                    bLiveRightItem.dynamicUrl = jsonParser.getValueAsString();
                    return true;
                case 10:
                    bLiveRightItem.attribute = BLiveVoiceRightAttribute.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 11:
                    bLiveRightItem.scrapInfo = BLiveRightScrapInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    bLiveRightItem.updatedTimeInSeconds = jsonParser.getValueAsLong();
                    return true;
                case 13:
                    bLiveRightItem.createTimeInSeconds = jsonParser.getValueAsLong();
                    return true;
                case 14:
                    bLiveRightItem.permanent = jsonParser.getValueAsBoolean();
                    return true;
                case 15:
                    bLiveRightItem.userRightId = jsonParser.getValueAsString();
                    return true;
                case 16:
                    bLiveRightItem.rightId = jsonParser.getValueAsString();
                    return true;
                case 17:
                    bLiveRightItem.fromUserInfo = BLiveRightFromUser.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 18:
                    bLiveRightItem.placeType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveRightItem bLiveRightItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveRightItem.userRightId;
            if (str != null) {
                jsonGenerator.writeStringField("userRightId", str);
            }
            String str2 = bLiveRightItem.rightName;
            if (str2 != null) {
                jsonGenerator.writeStringField("rightName", str2);
            }
            String str3 = bLiveRightItem.rightType;
            if (str3 != null) {
                jsonGenerator.writeStringField("rightType", str3);
            }
            String str4 = bLiveRightItem.rightId;
            if (str4 != null) {
                jsonGenerator.writeStringField("rightId", str4);
            }
            String str5 = bLiveRightItem.description;
            if (str5 != null) {
                jsonGenerator.writeStringField("description", str5);
            }
            String str6 = bLiveRightItem.thumbnailUrl;
            if (str6 != null) {
                jsonGenerator.writeStringField("thumbnailUrl", str6);
            }
            String str7 = bLiveRightItem.rightPeriod;
            if (str7 != null) {
                jsonGenerator.writeStringField("rightPeriod", str7);
            }
            jsonGenerator.writeBooleanField("permanent", bLiveRightItem.permanent);
            jsonGenerator.writeNumberField("periodEndTimeInSeconds", bLiveRightItem.periodEndTimeInSeconds);
            String str8 = bLiveRightItem.jumpUrl;
            if (str8 != null) {
                jsonGenerator.writeStringField("jumpUrl", str8);
            }
            String str9 = bLiveRightItem.status;
            if (str9 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str9);
            }
            jsonGenerator.writeBooleanField("todayDisable", bLiveRightItem.todayDisable);
            jsonGenerator.writeNumberField("createTimeInSeconds", bLiveRightItem.createTimeInSeconds);
            if (bLiveRightItem.fromUserInfo != null) {
                jsonGenerator.writeFieldName("fromUserInfo");
                BLiveRightFromUser.JSON_ADAPTER.serialize(bLiveRightItem.fromUserInfo, jsonGenerator, true);
            }
            if (bLiveRightItem.scrapInfo != null) {
                jsonGenerator.writeFieldName("scrapInfo");
                BLiveRightScrapInfo.JSON_ADAPTER.serialize(bLiveRightItem.scrapInfo, jsonGenerator, true);
            }
            String str10 = bLiveRightItem.placeType;
            if (str10 != null) {
                jsonGenerator.writeStringField("placeType", str10);
            }
            if (bLiveRightItem.attribute != null) {
                jsonGenerator.writeFieldName("attribute");
                BLiveVoiceRightAttribute.JSON_ADAPTER.serialize(bLiveRightItem.attribute, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("updatedTimeInSeconds", bLiveRightItem.updatedTimeInSeconds);
            String str11 = bLiveRightItem.dynamicUrl;
            if (str11 != null) {
                jsonGenerator.writeStringField("dynamicUrl", str11);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveRightItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String PERIOD_DECAY = "decay";
    public static final String PERIOD_GRAY = "grey";
    public static final String PERIOD_VALID = "valid";
    public static final String STATUS_ACTIVATED = "activated";
    public static final String STATUS_EQUIPPED = "equipped";
    public static final String STATUS_NOT_ACQUIRED = "notAcquired";
    public static final String TYPE = "bliverightitem";

    @NonNull
    @ProtobufIndex(index = 17)
    public BLiveVoiceRightAttribute attribute;

    @ProtobufIndex(index = 13)
    public long createTimeInSeconds;

    @NonNull
    @ProtobufIndex(index = 5)
    public String description;

    @NonNull
    @ProtobufIndex(index = 19)
    public String dynamicUrl;

    @NonNull
    @ProtobufIndex(index = 14)
    public BLiveRightFromUser fromUserInfo;

    @NonNull
    @ProtobufIndex(index = 10)
    public String jumpUrl;

    @ProtobufIndex(index = 9)
    public long periodEndTimeInSeconds;

    @ProtobufIndex(index = 8)
    public boolean permanent;

    @NonNull
    @ProtobufIndex(index = 16)
    public String placeType;

    @NonNull
    @ProtobufIndex(index = 4)
    public String rightId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String rightName;

    @NonNull
    @ProtobufIndex(index = 7)
    public String rightPeriod;

    @NonNull
    @ProtobufIndex(index = 3)
    public String rightType;

    @Nullable
    @ProtobufIndex(index = 15)
    public BLiveRightScrapInfo scrapInfo;

    @NonNull
    @ProtobufIndex(index = 11)
    public String status;

    @NonNull
    @ProtobufIndex(index = 6)
    public String thumbnailUrl;

    @ProtobufIndex(index = 12)
    public boolean todayDisable;

    @ProtobufIndex(index = 18)
    public long updatedTimeInSeconds;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userRightId;

    public static BLiveRightItem new_() {
        BLiveRightItem bLiveRightItem = new BLiveRightItem();
        bLiveRightItem.nullCheck();
        return bLiveRightItem;
    }

    public boolean canActionRight() {
        return isEquipped() || isActive() || canActive();
    }

    public boolean canActive() {
        return TextUtils.equals(this.rightPeriod, PERIOD_DECAY);
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveRightItem mo223809clone() {
        BLiveRightItem bLiveRightItem = new BLiveRightItem();
        bLiveRightItem.userRightId = this.userRightId;
        bLiveRightItem.rightName = this.rightName;
        bLiveRightItem.rightType = this.rightType;
        bLiveRightItem.rightId = this.rightId;
        bLiveRightItem.description = this.description;
        bLiveRightItem.thumbnailUrl = this.thumbnailUrl;
        bLiveRightItem.rightPeriod = this.rightPeriod;
        bLiveRightItem.permanent = this.permanent;
        bLiveRightItem.periodEndTimeInSeconds = this.periodEndTimeInSeconds;
        bLiveRightItem.jumpUrl = this.jumpUrl;
        bLiveRightItem.status = this.status;
        bLiveRightItem.todayDisable = this.todayDisable;
        bLiveRightItem.createTimeInSeconds = this.createTimeInSeconds;
        BLiveRightFromUser bLiveRightFromUser = this.fromUserInfo;
        if (bLiveRightFromUser != null) {
            bLiveRightItem.fromUserInfo = bLiveRightFromUser.mo223809clone();
        }
        BLiveRightScrapInfo bLiveRightScrapInfo = this.scrapInfo;
        if (bLiveRightScrapInfo != null) {
            bLiveRightItem.scrapInfo = bLiveRightScrapInfo.mo223809clone();
        }
        bLiveRightItem.placeType = this.placeType;
        BLiveVoiceRightAttribute bLiveVoiceRightAttribute = this.attribute;
        if (bLiveVoiceRightAttribute != null) {
            bLiveRightItem.attribute = bLiveVoiceRightAttribute.mo223809clone();
        }
        bLiveRightItem.updatedTimeInSeconds = this.updatedTimeInSeconds;
        bLiveRightItem.dynamicUrl = this.dynamicUrl;
        return bLiveRightItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveRightItem)) {
            return false;
        }
        BLiveRightItem bLiveRightItem = (BLiveRightItem) obj;
        return ValueObject.util_equals(this.userRightId, bLiveRightItem.userRightId) && ValueObject.util_equals(this.rightName, bLiveRightItem.rightName) && ValueObject.util_equals(this.rightType, bLiveRightItem.rightType) && ValueObject.util_equals(this.rightId, bLiveRightItem.rightId) && ValueObject.util_equals(this.description, bLiveRightItem.description) && ValueObject.util_equals(this.thumbnailUrl, bLiveRightItem.thumbnailUrl) && ValueObject.util_equals(this.rightPeriod, bLiveRightItem.rightPeriod) && this.permanent == bLiveRightItem.permanent && this.periodEndTimeInSeconds == bLiveRightItem.periodEndTimeInSeconds && ValueObject.util_equals(this.jumpUrl, bLiveRightItem.jumpUrl) && ValueObject.util_equals(this.status, bLiveRightItem.status) && this.todayDisable == bLiveRightItem.todayDisable && this.createTimeInSeconds == bLiveRightItem.createTimeInSeconds && ValueObject.util_equals(this.fromUserInfo, bLiveRightItem.fromUserInfo) && ValueObject.util_equals(this.scrapInfo, bLiveRightItem.scrapInfo) && ValueObject.util_equals(this.placeType, bLiveRightItem.placeType) && ValueObject.util_equals(this.attribute, bLiveRightItem.attribute) && this.updatedTimeInSeconds == bLiveRightItem.updatedTimeInSeconds && ValueObject.util_equals(this.dynamicUrl, bLiveRightItem.dynamicUrl);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    @NonNull
    public String getDynamicUrl() {
        return this.dynamicUrl;
    }

    @NonNull
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.userRightId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.rightName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.rightType;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.rightId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.description;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.thumbnailUrl;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.rightPeriod;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        int i3 = this.permanent ? 1231 : 1237;
        long j = this.periodEndTimeInSeconds;
        int i4 = (((iHashCode7 + i3) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str8 = this.jumpUrl;
        int iHashCode8 = (i4 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.status;
        int iHashCode9 = (((iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41) + (this.todayDisable ? 1231 : 1237)) * 41;
        long j2 = this.createTimeInSeconds;
        int i5 = (iHashCode9 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        BLiveRightFromUser bLiveRightFromUser = this.fromUserInfo;
        int iHashCode10 = (i5 + (bLiveRightFromUser != null ? bLiveRightFromUser.hashCode() : 0)) * 41;
        BLiveRightScrapInfo bLiveRightScrapInfo = this.scrapInfo;
        int iHashCode11 = (iHashCode10 + (bLiveRightScrapInfo != null ? bLiveRightScrapInfo.hashCode() : 0)) * 41;
        String str10 = this.placeType;
        int iHashCode12 = (iHashCode11 + (str10 != null ? str10.hashCode() : 0)) * 41;
        BLiveVoiceRightAttribute bLiveVoiceRightAttribute = this.attribute;
        int iHashCode13 = (iHashCode12 + (bLiveVoiceRightAttribute != null ? bLiveVoiceRightAttribute.hashCode() : 0)) * 41;
        long j3 = this.updatedTimeInSeconds;
        int i6 = (iHashCode13 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        String str11 = this.dynamicUrl;
        int iHashCode14 = i6 + (str11 != null ? str11.hashCode() : 0);
        this.hashCode = iHashCode14;
        return iHashCode14;
    }

    public boolean isActive() {
        return TextUtils.equals(this.rightPeriod, PERIOD_VALID) && TextUtils.equals(this.status, STATUS_ACTIVATED);
    }

    public boolean isEquipped() {
        return TextUtils.equals(this.rightPeriod, PERIOD_VALID) && TextUtils.equals(this.status, "equipped");
    }

    public boolean isGray() {
        return TextUtils.equals(this.rightPeriod, "grey");
    }

    public boolean isLocked() {
        return TextUtils.equals(this.status, STATUS_NOT_ACQUIRED);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userRightId == null) {
            this.userRightId = "";
        }
        if (this.rightName == null) {
            this.rightName = "";
        }
        if (this.rightType == null) {
            this.rightType = "";
        }
        if (this.rightId == null) {
            this.rightId = "";
        }
        if (this.description == null) {
            this.description = "";
        }
        if (this.thumbnailUrl == null) {
            this.thumbnailUrl = "";
        }
        if (this.rightPeriod == null) {
            this.rightPeriod = "";
        }
        if (this.jumpUrl == null) {
            this.jumpUrl = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.fromUserInfo == null) {
            this.fromUserInfo = BLiveRightFromUser.new_();
        }
        if (this.placeType == null) {
            this.placeType = "";
        }
        if (this.attribute == null) {
            this.attribute = BLiveVoiceRightAttribute.new_();
        }
        if (this.dynamicUrl == null) {
            this.dynamicUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
