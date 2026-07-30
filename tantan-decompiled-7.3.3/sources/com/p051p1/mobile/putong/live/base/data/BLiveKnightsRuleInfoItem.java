package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveKnightsPrivilegeItem;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveKnightsRuleInfoItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveKnightsRuleInfoItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveKnightsRuleInfoItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveKnightsRuleInfoItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveKnightsRuleInfoItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveKnightsRuleInfoItem newInstance() {
            return new BLiveKnightsRuleInfoItem();
        }

        public boolean parseField(BLiveKnightsRuleInfoItem bLiveKnightsRuleInfoItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "refreshCoolingDuration":
                    bLiveKnightsRuleInfoItem.refreshCoolingDuration = jsonParser.getValueAsString();
                    return true;
                case "knightIntroduceUrl":
                    bLiveKnightsRuleInfoItem.knightIntroduceUrl = jsonParser.getValueAsString();
                    return true;
                case "guardPopupIcon":
                    bLiveKnightsRuleInfoItem.guardPopupIcon = jsonParser.getValueAsString();
                    return true;
                case "showDiscount":
                    bLiveKnightsRuleInfoItem.showDiscount = jsonParser.getValueAsBoolean();
                    return true;
                case "discountNotice":
                    bLiveKnightsRuleInfoItem.discountNotice = jsonParser.getValueAsString();
                    return true;
                case "guardType":
                    bLiveKnightsRuleInfoItem.guardType = BLiveGuardType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "effectiveDuration":
                    bLiveKnightsRuleInfoItem.effectiveDuration = jsonParser.getValueAsInt();
                    return true;
                case "refreshCoolingTime":
                    bLiveKnightsRuleInfoItem.refreshCoolingTime = jsonParser.getValueAsInt();
                    return true;
                case "knightCoins":
                    bLiveKnightsRuleInfoItem.knightCoins = jsonParser.getValueAsInt();
                    return true;
                case "guardNotice":
                    bLiveKnightsRuleInfoItem.guardNotice = jsonParser.getValueAsString();
                    return true;
                case "knightGiftCoins":
                    bLiveKnightsRuleInfoItem.knightGiftCoins = jsonParser.getValueAsInt();
                    return true;
                case "guardPrivileges":
                    bLiveKnightsRuleInfoItem.guardPrivileges = JsonAdapter.parseArray(jsonParser, BLiveKnightsPrivilegeItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "knightsContractGiftId":
                    bLiveKnightsRuleInfoItem.knightsContractGiftId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveKnightsRuleInfoItem bLiveKnightsRuleInfoItem, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("effectiveDuration", bLiveKnightsRuleInfoItem.effectiveDuration);
            jsonGenerator.writeNumberField("knightCoins", bLiveKnightsRuleInfoItem.knightCoins);
            jsonGenerator.writeNumberField("knightGiftCoins", bLiveKnightsRuleInfoItem.knightGiftCoins);
            jsonGenerator.writeNumberField("refreshCoolingTime", bLiveKnightsRuleInfoItem.refreshCoolingTime);
            String str = bLiveKnightsRuleInfoItem.knightIntroduceUrl;
            if (str != null) {
                jsonGenerator.writeStringField("knightIntroduceUrl", str);
            }
            String str2 = bLiveKnightsRuleInfoItem.knightsContractGiftId;
            if (str2 != null) {
                jsonGenerator.writeStringField("knightsContractGiftId", str2);
            }
            String str3 = bLiveKnightsRuleInfoItem.refreshCoolingDuration;
            if (str3 != null) {
                jsonGenerator.writeStringField("refreshCoolingDuration", str3);
            }
            if (bLiveKnightsRuleInfoItem.guardType != null) {
                jsonGenerator.writeFieldName("guardType");
                BLiveGuardType.JSON_ADAPTER.serialize(bLiveKnightsRuleInfoItem.guardType, jsonGenerator, true);
            }
            if (bLiveKnightsRuleInfoItem.guardPrivileges != null) {
                jsonGenerator.writeFieldName("guardPrivileges");
                JsonAdapter.serializeArray(bLiveKnightsRuleInfoItem.guardPrivileges, jsonGenerator, BLiveKnightsPrivilegeItem.JSON_ADAPTER);
            }
            String str4 = bLiveKnightsRuleInfoItem.guardNotice;
            if (str4 != null) {
                jsonGenerator.writeStringField("guardNotice", str4);
            }
            String str5 = bLiveKnightsRuleInfoItem.guardPopupIcon;
            if (str5 != null) {
                jsonGenerator.writeStringField("guardPopupIcon", str5);
            }
            String str6 = bLiveKnightsRuleInfoItem.discountNotice;
            if (str6 != null) {
                jsonGenerator.writeStringField("discountNotice", str6);
            }
            jsonGenerator.writeBooleanField("showDiscount", bLiveKnightsRuleInfoItem.showDiscount);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveKnightsRuleInfoItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveknightsruleinfoitem";

    @NonNull
    @ProtobufIndex(index = 13)
    public String discountNotice;

    @ProtobufIndex(index = 1)
    public int effectiveDuration;

    @NonNull
    @ProtobufIndex(index = 11)
    public String guardNotice;

    @NonNull
    @ProtobufIndex(index = 12)
    public String guardPopupIcon;

    @NonNull
    @ProtobufIndex(index = 9)
    public List<BLiveKnightsPrivilegeItem> guardPrivileges;

    @NonNull
    @ProtobufIndex(index = 8)
    public BLiveGuardType guardType;

    @ProtobufIndex(index = 2)
    public int knightCoins;

    @ProtobufIndex(index = 3)
    public int knightGiftCoins;

    @NonNull
    @ProtobufIndex(index = 5)
    public String knightIntroduceUrl;

    @NonNull
    @ProtobufIndex(index = 6)
    public String knightsContractGiftId;

    @NonNull
    @ProtobufIndex(index = 7)
    public String refreshCoolingDuration;

    @ProtobufIndex(index = 4)
    public int refreshCoolingTime;

    @ProtobufIndex(index = 14)
    public boolean showDiscount;

    public static BLiveKnightsRuleInfoItem new_() {
        BLiveKnightsRuleInfoItem bLiveKnightsRuleInfoItem = new BLiveKnightsRuleInfoItem();
        bLiveKnightsRuleInfoItem.nullCheck();
        return bLiveKnightsRuleInfoItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveKnightsRuleInfoItem mo225055clone() {
        BLiveKnightsRuleInfoItem bLiveKnightsRuleInfoItem = new BLiveKnightsRuleInfoItem();
        bLiveKnightsRuleInfoItem.effectiveDuration = this.effectiveDuration;
        bLiveKnightsRuleInfoItem.knightCoins = this.knightCoins;
        bLiveKnightsRuleInfoItem.knightGiftCoins = this.knightGiftCoins;
        bLiveKnightsRuleInfoItem.refreshCoolingTime = this.refreshCoolingTime;
        bLiveKnightsRuleInfoItem.knightIntroduceUrl = this.knightIntroduceUrl;
        bLiveKnightsRuleInfoItem.knightsContractGiftId = this.knightsContractGiftId;
        bLiveKnightsRuleInfoItem.refreshCoolingDuration = this.refreshCoolingDuration;
        bLiveKnightsRuleInfoItem.guardType = this.guardType;
        List<BLiveKnightsPrivilegeItem> list = this.guardPrivileges;
        if (list != null) {
            bLiveKnightsRuleInfoItem.guardPrivileges = ValueObject.util_map(list, new qcj() { // from class: l.c22
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveKnightsPrivilegeItem) obj).mo225055clone();
                }
            });
        }
        bLiveKnightsRuleInfoItem.guardNotice = this.guardNotice;
        bLiveKnightsRuleInfoItem.guardPopupIcon = this.guardPopupIcon;
        bLiveKnightsRuleInfoItem.discountNotice = this.discountNotice;
        bLiveKnightsRuleInfoItem.showDiscount = this.showDiscount;
        return bLiveKnightsRuleInfoItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveKnightsRuleInfoItem)) {
            return false;
        }
        BLiveKnightsRuleInfoItem bLiveKnightsRuleInfoItem = (BLiveKnightsRuleInfoItem) obj;
        return this.effectiveDuration == bLiveKnightsRuleInfoItem.effectiveDuration && this.knightCoins == bLiveKnightsRuleInfoItem.knightCoins && this.knightGiftCoins == bLiveKnightsRuleInfoItem.knightGiftCoins && this.refreshCoolingTime == bLiveKnightsRuleInfoItem.refreshCoolingTime && ValueObject.util_equals(this.knightIntroduceUrl, bLiveKnightsRuleInfoItem.knightIntroduceUrl) && ValueObject.util_equals(this.knightsContractGiftId, bLiveKnightsRuleInfoItem.knightsContractGiftId) && ValueObject.util_equals(this.refreshCoolingDuration, bLiveKnightsRuleInfoItem.refreshCoolingDuration) && ValueObject.util_equals(this.guardType, bLiveKnightsRuleInfoItem.guardType) && ValueObject.util_equals(this.guardPrivileges, bLiveKnightsRuleInfoItem.guardPrivileges) && ValueObject.util_equals(this.guardNotice, bLiveKnightsRuleInfoItem.guardNotice) && ValueObject.util_equals(this.guardPopupIcon, bLiveKnightsRuleInfoItem.guardPopupIcon) && ValueObject.util_equals(this.discountNotice, bLiveKnightsRuleInfoItem.discountNotice) && this.showDiscount == bLiveKnightsRuleInfoItem.showDiscount;
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
        int i2 = ((((((((i * 41) + this.effectiveDuration) * 41) + this.knightCoins) * 41) + this.knightGiftCoins) * 41) + this.refreshCoolingTime) * 41;
        String str = this.knightIntroduceUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.knightsContractGiftId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.refreshCoolingDuration;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        BLiveGuardType bLiveGuardType = this.guardType;
        int iHashCode4 = (iHashCode3 + (bLiveGuardType != null ? bLiveGuardType.hashCode() : 0)) * 41;
        List<BLiveKnightsPrivilegeItem> list = this.guardPrivileges;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 41;
        String str4 = this.guardNotice;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.guardPopupIcon;
        int iHashCode7 = (iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.discountNotice;
        int iHashCode8 = ((iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 41) + (this.showDiscount ? 1231 : 1237);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.knightIntroduceUrl == null) {
            this.knightIntroduceUrl = "";
        }
        if (this.knightsContractGiftId == null) {
            this.knightsContractGiftId = "";
        }
        if (this.refreshCoolingDuration == null) {
            this.refreshCoolingDuration = "";
        }
        if (this.guardType == null) {
            this.guardType = (BLiveGuardType) BLiveGuardType.JSON_ADAPTER.defaultEnum();
        }
        if (this.guardPrivileges == null) {
            this.guardPrivileges = new ArrayList();
        }
        if (this.guardNotice == null) {
            this.guardNotice = "";
        }
        if (this.guardPopupIcon == null) {
            this.guardPopupIcon = "";
        }
        if (this.discountNotice == null) {
            this.discountNotice = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
