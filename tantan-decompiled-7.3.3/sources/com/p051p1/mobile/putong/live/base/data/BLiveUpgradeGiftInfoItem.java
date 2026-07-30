package com.p051p1.mobile.putong.live.base.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveUpgradeGiftResLevel;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.jyb;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveUpgradeGiftInfoItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUpgradeGiftInfoItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUpgradeGiftInfoItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfoItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUpgradeGiftInfoItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUpgradeGiftInfoItem newInstance() {
            return new BLiveUpgradeGiftInfoItem();
        }

        public boolean parseField(BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "entranceScore":
                    bLiveUpgradeGiftInfoItem.entranceScore = jsonParser.getValueAsInt();
                    return true;
                case "purchasePrice":
                    bLiveUpgradeGiftInfoItem.purchasePrice = jsonParser.getValueAsInt();
                    return true;
                case "accumulatedScore":
                    bLiveUpgradeGiftInfoItem.accumulatedScore = jsonParser.getValueAsInt();
                    return true;
                case "status":
                    bLiveUpgradeGiftInfoItem.status = jsonParser.getValueAsString();
                    return true;
                case "expiredTime":
                    bLiveUpgradeGiftInfoItem.expiredTime = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    bLiveUpgradeGiftInfoItem.f45314id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    bLiveUpgradeGiftInfoItem.name = jsonParser.getValueAsString();
                    return true;
                case "hdUrl":
                    bLiveUpgradeGiftInfoItem.hdUrl = jsonParser.getValueAsString();
                    return true;
                case "level":
                    bLiveUpgradeGiftInfoItem.level = BLiveUpgradeGiftLevel.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveUpgradeGiftInfoItem.f45314id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveUpgradeGiftInfoItem.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = bLiveUpgradeGiftInfoItem.hdUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("hdUrl", str3);
            }
            if (bLiveUpgradeGiftInfoItem.level != null) {
                jsonGenerator.writeFieldName(FirebaseAnalytics.Param.LEVEL);
                BLiveUpgradeGiftLevel.JSON_ADAPTER.serialize(bLiveUpgradeGiftInfoItem.level, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("purchasePrice", bLiveUpgradeGiftInfoItem.purchasePrice);
            jsonGenerator.writeNumberField("accumulatedScore", bLiveUpgradeGiftInfoItem.accumulatedScore);
            jsonGenerator.writeNumberField("entranceScore", bLiveUpgradeGiftInfoItem.entranceScore);
            jsonGenerator.writeNumberField("expiredTime", bLiveUpgradeGiftInfoItem.expiredTime);
            String str4 = bLiveUpgradeGiftInfoItem.status;
            if (str4 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUpgradeGiftInfoItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveupgradegiftinfoitem";
    public static final String TYPE_EQUIP = "equipped";
    public static final String TYPE_LOCKED = "locked";
    public static final String TYPE_UNEQUIPPED = "unlocked";
    public static final String TYPE_UNLOCKING = "unlocking";

    @ProtobufIndex(index = 6)
    public int accumulatedScore;

    @ProtobufIndex(index = 7)
    public int entranceScore;

    @ProtobufIndex(index = 8)
    public int expiredTime;

    @NonNull
    public List<BLiveUpgradeGiftResLevel> giftLevels;

    @NonNull
    @ProtobufIndex(index = 3)
    public String hdUrl;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45314id;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveUpgradeGiftLevel level;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @ProtobufIndex(index = 5)
    public int purchasePrice;

    @NonNull
    @ProtobufIndex(index = 9)
    public String status;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$getTargetRedLevel$0(BLiveUpgradeGiftResLevel bLiveUpgradeGiftResLevel) {
        return Boolean.valueOf(TextUtils.equals(bLiveUpgradeGiftResLevel.f45316id, this.level.f45315id));
    }

    public static BLiveUpgradeGiftInfoItem new_() {
        BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem = new BLiveUpgradeGiftInfoItem();
        bLiveUpgradeGiftInfoItem.nullCheck();
        return bLiveUpgradeGiftInfoItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUpgradeGiftInfoItem mo225055clone() {
        BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem = new BLiveUpgradeGiftInfoItem();
        bLiveUpgradeGiftInfoItem.f45314id = this.f45314id;
        bLiveUpgradeGiftInfoItem.name = this.name;
        bLiveUpgradeGiftInfoItem.hdUrl = this.hdUrl;
        BLiveUpgradeGiftLevel bLiveUpgradeGiftLevel = this.level;
        if (bLiveUpgradeGiftLevel != null) {
            bLiveUpgradeGiftInfoItem.level = bLiveUpgradeGiftLevel.mo225055clone();
        }
        bLiveUpgradeGiftInfoItem.purchasePrice = this.purchasePrice;
        bLiveUpgradeGiftInfoItem.accumulatedScore = this.accumulatedScore;
        bLiveUpgradeGiftInfoItem.entranceScore = this.entranceScore;
        bLiveUpgradeGiftInfoItem.expiredTime = this.expiredTime;
        bLiveUpgradeGiftInfoItem.status = this.status;
        return bLiveUpgradeGiftInfoItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUpgradeGiftInfoItem)) {
            return false;
        }
        BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem = (BLiveUpgradeGiftInfoItem) obj;
        return ValueObject.util_equals(this.f45314id, bLiveUpgradeGiftInfoItem.f45314id) && ValueObject.util_equals(this.name, bLiveUpgradeGiftInfoItem.name) && ValueObject.util_equals(this.hdUrl, bLiveUpgradeGiftInfoItem.hdUrl) && ValueObject.util_equals(this.level, bLiveUpgradeGiftInfoItem.level) && this.purchasePrice == bLiveUpgradeGiftInfoItem.purchasePrice && this.accumulatedScore == bLiveUpgradeGiftInfoItem.accumulatedScore && this.entranceScore == bLiveUpgradeGiftInfoItem.entranceScore && this.expiredTime == bLiveUpgradeGiftInfoItem.expiredTime && ValueObject.util_equals(this.status, bLiveUpgradeGiftInfoItem.status);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public BLiveUpgradeGiftResLevel getTargetRedLevel() {
        return (BLiveUpgradeGiftResLevel) jyb.m147529r(this.giftLevels, new qcj() { // from class: l.q72
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f155932a.lambda$getTargetRedLevel$0((BLiveUpgradeGiftResLevel) obj);
            }
        });
    }

    public int getUnlockProgress() {
        return (int) ((this.accumulatedScore / this.entranceScore) * 100.0f);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f45314id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.hdUrl;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        BLiveUpgradeGiftLevel bLiveUpgradeGiftLevel = this.level;
        int iHashCode4 = (((((((((iHashCode3 + (bLiveUpgradeGiftLevel != null ? bLiveUpgradeGiftLevel.hashCode() : 0)) * 41) + this.purchasePrice) * 41) + this.accumulatedScore) * 41) + this.entranceScore) * 41) + this.expiredTime) * 41;
        String str4 = this.status;
        int iHashCode5 = iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    public boolean isEquipped() {
        return TextUtils.equals(this.status, "equipped");
    }

    public boolean isLocked() {
        return TextUtils.equals(this.status, "locked");
    }

    public boolean isUnLocked() {
        return TextUtils.equals(this.status, "unlocked");
    }

    public boolean isUnLocking() {
        return TextUtils.equals(this.status, TYPE_UNLOCKING);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45314id == null) {
            this.f45314id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.hdUrl == null) {
            this.hdUrl = "";
        }
        if (this.level == null) {
            this.level = BLiveUpgradeGiftLevel.new_();
        }
        if (this.status == null) {
            this.status = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
