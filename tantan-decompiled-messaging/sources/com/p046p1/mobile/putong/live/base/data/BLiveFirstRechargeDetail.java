package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveBonus;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveFirstRechargeDetail extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFirstRechargeDetail> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFirstRechargeDetail>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFirstRechargeDetail.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFirstRechargeDetail.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFirstRechargeDetail newInstance() {
            return new BLiveFirstRechargeDetail();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveFirstRechargeDetail bLiveFirstRechargeDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2126037894:
                    if (str.equals("showDialogBonus")) {
                        b = 0;
                    }
                    break;
                case -1576063289:
                    if (str.equals("hasAdditionalCheckout")) {
                        b = 1;
                    }
                    break;
                case -1147109517:
                    if (str.equals("decorateCheckout")) {
                        b = 2;
                    }
                    break;
                case -748916528:
                    if (str.equals("isActive")) {
                        b = 3;
                    }
                    break;
                case -581595721:
                    if (str.equals("showGuideNotice")) {
                        b = 4;
                    }
                    break;
                case -376221399:
                    if (str.equals("bonusEndTime")) {
                        b = 5;
                    }
                    break;
                case -233358096:
                    if (str.equals("bonusStartTime")) {
                        b = 6;
                    }
                    break;
                case 93921311:
                    if (str.equals("bonus")) {
                        b = 7;
                    }
                    break;
                case 535685800:
                    if (str.equals("emphasizeCheckout")) {
                        b = 8;
                    }
                    break;
                case 601235430:
                    if (str.equals("currentTime")) {
                        b = 9;
                    }
                    break;
                case 676080658:
                    if (str.equals("checkoutBanner")) {
                        b = 10;
                    }
                    break;
                case 1022998817:
                    if (str.equals("trialGiftId")) {
                        b = 11;
                    }
                    break;
                case 1541247220:
                    if (str.equals("guideNotice")) {
                        b = 12;
                    }
                    break;
                case 1911625575:
                    if (str.equals("hasGainedBonus")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveFirstRechargeDetail.showDialogBonus = jsonParser.getValueAsBoolean();
                    return true;
                case 1:
                    bLiveFirstRechargeDetail.hasAdditionalCheckout = jsonParser.getValueAsBoolean();
                    return true;
                case 2:
                    bLiveFirstRechargeDetail.decorateCheckout = jsonParser.getValueAsBoolean();
                    return true;
                case 3:
                    bLiveFirstRechargeDetail.isActive = jsonParser.getValueAsBoolean();
                    return true;
                case 4:
                    bLiveFirstRechargeDetail.showGuideNotice = jsonParser.getValueAsBoolean();
                    return true;
                case 5:
                    bLiveFirstRechargeDetail.bonusEndTime = jsonParser.getValueAsLong();
                    return true;
                case 6:
                    bLiveFirstRechargeDetail.bonusStartTime = jsonParser.getValueAsLong();
                    return true;
                case 7:
                    bLiveFirstRechargeDetail.bonus = JsonAdapter.parseArray(jsonParser, BLiveBonus.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    bLiveFirstRechargeDetail.emphasizeCheckout = jsonParser.getValueAsBoolean();
                    return true;
                case 9:
                    bLiveFirstRechargeDetail.currentTime = jsonParser.getValueAsLong();
                    return true;
                case 10:
                    bLiveFirstRechargeDetail.checkoutBanner = jsonParser.getValueAsString();
                    return true;
                case 11:
                    bLiveFirstRechargeDetail.trialGiftId = jsonParser.getValueAsInt();
                    return true;
                case 12:
                    bLiveFirstRechargeDetail.guideNotice = jsonParser.getValueAsString();
                    return true;
                case 13:
                    bLiveFirstRechargeDetail.hasGainedBonus = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFirstRechargeDetail bLiveFirstRechargeDetail, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("showDialogBonus", bLiveFirstRechargeDetail.showDialogBonus);
            jsonGenerator.writeBooleanField("showGuideNotice", bLiveFirstRechargeDetail.showGuideNotice);
            String str = bLiveFirstRechargeDetail.guideNotice;
            if (str != null) {
                jsonGenerator.writeStringField("guideNotice", str);
            }
            jsonGenerator.writeBooleanField("hasAdditionalCheckout", bLiveFirstRechargeDetail.hasAdditionalCheckout);
            jsonGenerator.writeBooleanField("emphasizeCheckout", bLiveFirstRechargeDetail.emphasizeCheckout);
            jsonGenerator.writeBooleanField("decorateCheckout", bLiveFirstRechargeDetail.decorateCheckout);
            String str2 = bLiveFirstRechargeDetail.checkoutBanner;
            if (str2 != null) {
                jsonGenerator.writeStringField("checkoutBanner", str2);
            }
            jsonGenerator.writeNumberField("trialGiftId", bLiveFirstRechargeDetail.trialGiftId);
            jsonGenerator.writeBooleanField("isActive", bLiveFirstRechargeDetail.isActive);
            jsonGenerator.writeBooleanField("hasGainedBonus", bLiveFirstRechargeDetail.hasGainedBonus);
            jsonGenerator.writeNumberField("currentTime", bLiveFirstRechargeDetail.currentTime);
            jsonGenerator.writeNumberField("bonusStartTime", bLiveFirstRechargeDetail.bonusStartTime);
            jsonGenerator.writeNumberField("bonusEndTime", bLiveFirstRechargeDetail.bonusEndTime);
            if (bLiveFirstRechargeDetail.bonus != null) {
                jsonGenerator.writeFieldName("bonus");
                JsonAdapter.serializeArray(bLiveFirstRechargeDetail.bonus, jsonGenerator, BLiveBonus.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFirstRechargeDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefirstrechargedetail";

    @NonNull
    @ProtobufIndex(index = 14)
    public List<BLiveBonus> bonus;

    @ProtobufIndex(index = 13)
    public long bonusEndTime;

    @ProtobufIndex(index = 12)
    public long bonusStartTime;

    @NonNull
    @ProtobufIndex(index = 7)
    public String checkoutBanner;

    @ProtobufIndex(index = 11)
    public long currentTime;

    @ProtobufIndex(index = 6)
    public boolean decorateCheckout;

    @ProtobufIndex(index = 5)
    public boolean emphasizeCheckout;

    @NonNull
    @ProtobufIndex(index = 3)
    public String guideNotice;

    @ProtobufIndex(index = 4)
    public boolean hasAdditionalCheckout;

    @ProtobufIndex(index = 10)
    public boolean hasGainedBonus;

    @ProtobufIndex(index = 9)
    public boolean isActive;

    @ProtobufIndex(index = 1)
    public boolean showDialogBonus;

    @ProtobufIndex(index = 2)
    public boolean showGuideNotice;

    @ProtobufIndex(index = 8)
    public int trialGiftId;

    public static BLiveFirstRechargeDetail new_() {
        BLiveFirstRechargeDetail bLiveFirstRechargeDetail = new BLiveFirstRechargeDetail();
        bLiveFirstRechargeDetail.nullCheck();
        return bLiveFirstRechargeDetail;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFirstRechargeDetail mo223809clone() {
        BLiveFirstRechargeDetail bLiveFirstRechargeDetail = new BLiveFirstRechargeDetail();
        bLiveFirstRechargeDetail.showDialogBonus = this.showDialogBonus;
        bLiveFirstRechargeDetail.showGuideNotice = this.showGuideNotice;
        bLiveFirstRechargeDetail.guideNotice = this.guideNotice;
        bLiveFirstRechargeDetail.hasAdditionalCheckout = this.hasAdditionalCheckout;
        bLiveFirstRechargeDetail.emphasizeCheckout = this.emphasizeCheckout;
        bLiveFirstRechargeDetail.decorateCheckout = this.decorateCheckout;
        bLiveFirstRechargeDetail.checkoutBanner = this.checkoutBanner;
        bLiveFirstRechargeDetail.trialGiftId = this.trialGiftId;
        bLiveFirstRechargeDetail.isActive = this.isActive;
        bLiveFirstRechargeDetail.hasGainedBonus = this.hasGainedBonus;
        bLiveFirstRechargeDetail.currentTime = this.currentTime;
        bLiveFirstRechargeDetail.bonusStartTime = this.bonusStartTime;
        bLiveFirstRechargeDetail.bonusEndTime = this.bonusEndTime;
        List<BLiveBonus> list = this.bonus;
        if (list != null) {
            bLiveFirstRechargeDetail.bonus = ValueObject.util_map(list, new w9j() { // from class: l.wz1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveBonus) obj).mo223809clone();
                }
            });
        }
        return bLiveFirstRechargeDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFirstRechargeDetail)) {
            return false;
        }
        BLiveFirstRechargeDetail bLiveFirstRechargeDetail = (BLiveFirstRechargeDetail) obj;
        return this.showDialogBonus == bLiveFirstRechargeDetail.showDialogBonus && this.showGuideNotice == bLiveFirstRechargeDetail.showGuideNotice && ValueObject.util_equals(this.guideNotice, bLiveFirstRechargeDetail.guideNotice) && this.hasAdditionalCheckout == bLiveFirstRechargeDetail.hasAdditionalCheckout && this.emphasizeCheckout == bLiveFirstRechargeDetail.emphasizeCheckout && this.decorateCheckout == bLiveFirstRechargeDetail.decorateCheckout && ValueObject.util_equals(this.checkoutBanner, bLiveFirstRechargeDetail.checkoutBanner) && this.trialGiftId == bLiveFirstRechargeDetail.trialGiftId && this.isActive == bLiveFirstRechargeDetail.isActive && this.hasGainedBonus == bLiveFirstRechargeDetail.hasGainedBonus && this.currentTime == bLiveFirstRechargeDetail.currentTime && this.bonusStartTime == bLiveFirstRechargeDetail.bonusStartTime && this.bonusEndTime == bLiveFirstRechargeDetail.bonusEndTime && ValueObject.util_equals(this.bonus, bLiveFirstRechargeDetail.bonus);
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
        int i2 = ((((i * 41) + (this.showDialogBonus ? 1231 : 1237)) * 41) + (this.showGuideNotice ? 1231 : 1237)) * 41;
        String str = this.guideNotice;
        int iHashCode = (((((((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.hasAdditionalCheckout ? 1231 : 1237)) * 41) + (this.emphasizeCheckout ? 1231 : 1237)) * 41) + (this.decorateCheckout ? 1231 : 1237)) * 41;
        String str2 = this.checkoutBanner;
        int iHashCode2 = (((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.trialGiftId) * 41) + (this.isActive ? 1231 : 1237)) * 41;
        int i3 = this.hasGainedBonus ? 1231 : 1237;
        long j = this.currentTime;
        int i4 = (((iHashCode2 + i3) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.bonusStartTime;
        int i5 = (i4 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.bonusEndTime;
        int i6 = (i5 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        List<BLiveBonus> list = this.bonus;
        int iHashCode3 = i6 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.guideNotice == null) {
            this.guideNotice = "";
        }
        if (this.checkoutBanner == null) {
            this.checkoutBanner = "";
        }
        if (this.bonus == null) {
            this.bonus = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
