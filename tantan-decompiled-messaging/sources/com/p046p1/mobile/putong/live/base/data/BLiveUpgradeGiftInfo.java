package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.heytap.mcssdk.mode.Message;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveUpgradeGiftActInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfoItem;
import com.p046p1.mobile.putong.live.base.data.BLiveUpgradeGiftResLevel;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveUpgradeGiftInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUpgradeGiftInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUpgradeGiftInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUpgradeGiftInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUpgradeGiftInfo newInstance() {
            return new BLiveUpgradeGiftInfo();
        }

        public boolean parseField(BLiveUpgradeGiftInfo bLiveUpgradeGiftInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "activityInfos":
                    bLiveUpgradeGiftInfo.activityInfos = JsonAdapter.parseArray(jsonParser, BLiveUpgradeGiftActInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "giftLevels":
                    bLiveUpgradeGiftInfo.giftLevels = JsonAdapter.parseArray(jsonParser, BLiveUpgradeGiftResLevel.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    bLiveUpgradeGiftInfo.f44465id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    bLiveUpgradeGiftInfo.name = jsonParser.getValueAsString();
                    return true;
                case "rule":
                    bLiveUpgradeGiftInfo.rule = BLiveUpgradeGiftRule.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "type":
                    bLiveUpgradeGiftInfo.type = jsonParser.getValueAsString();
                    return true;
                case "slotGiftInfos":
                    bLiveUpgradeGiftInfo.slotGiftInfos = JsonAdapter.parseArray(jsonParser, BLiveUpgradeGiftInfoItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "storeName":
                    bLiveUpgradeGiftInfo.storeName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUpgradeGiftInfo bLiveUpgradeGiftInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveUpgradeGiftInfo.f44465id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveUpgradeGiftInfo.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = bLiveUpgradeGiftInfo.storeName;
            if (str3 != null) {
                jsonGenerator.writeStringField("storeName", str3);
            }
            String str4 = bLiveUpgradeGiftInfo.type;
            if (str4 != null) {
                jsonGenerator.writeStringField("type", str4);
            }
            if (bLiveUpgradeGiftInfo.giftLevels != null) {
                jsonGenerator.writeFieldName("giftLevels");
                JsonAdapter.serializeArray(bLiveUpgradeGiftInfo.giftLevels, jsonGenerator, BLiveUpgradeGiftResLevel.JSON_ADAPTER);
            }
            if (bLiveUpgradeGiftInfo.slotGiftInfos != null) {
                jsonGenerator.writeFieldName("slotGiftInfos");
                JsonAdapter.serializeArray(bLiveUpgradeGiftInfo.slotGiftInfos, jsonGenerator, BLiveUpgradeGiftInfoItem.JSON_ADAPTER);
            }
            if (bLiveUpgradeGiftInfo.rule != null) {
                jsonGenerator.writeFieldName(Message.RULE);
                BLiveUpgradeGiftRule.JSON_ADAPTER.serialize(bLiveUpgradeGiftInfo.rule, jsonGenerator, true);
            }
            if (bLiveUpgradeGiftInfo.activityInfos != null) {
                jsonGenerator.writeFieldName("activityInfos");
                JsonAdapter.serializeArray(bLiveUpgradeGiftInfo.activityInfos, jsonGenerator, BLiveUpgradeGiftActInfo.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUpgradeGiftInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveupgradegiftinfo";

    @NonNull
    @ProtobufIndex(index = 8)
    public List<BLiveUpgradeGiftActInfo> activityInfos;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<BLiveUpgradeGiftResLevel> giftLevels;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44465id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 7)
    public BLiveUpgradeGiftRule rule;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<BLiveUpgradeGiftInfoItem> slotGiftInfos;

    @NonNull
    @ProtobufIndex(index = 3)
    public String storeName;

    @NonNull
    @ProtobufIndex(index = 4)
    public String type;

    public static BLiveUpgradeGiftInfo new_() {
        BLiveUpgradeGiftInfo bLiveUpgradeGiftInfo = new BLiveUpgradeGiftInfo();
        bLiveUpgradeGiftInfo.nullCheck();
        return bLiveUpgradeGiftInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUpgradeGiftInfo mo223809clone() {
        BLiveUpgradeGiftInfo bLiveUpgradeGiftInfo = new BLiveUpgradeGiftInfo();
        bLiveUpgradeGiftInfo.f44465id = this.f44465id;
        bLiveUpgradeGiftInfo.name = this.name;
        bLiveUpgradeGiftInfo.storeName = this.storeName;
        bLiveUpgradeGiftInfo.type = this.type;
        List<BLiveUpgradeGiftResLevel> list = this.giftLevels;
        if (list != null) {
            bLiveUpgradeGiftInfo.giftLevels = ValueObject.util_map(list, new w9j() { // from class: l.g72
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveUpgradeGiftResLevel) obj).mo223809clone();
                }
            });
        }
        List<BLiveUpgradeGiftInfoItem> list2 = this.slotGiftInfos;
        if (list2 != null) {
            bLiveUpgradeGiftInfo.slotGiftInfos = ValueObject.util_map(list2, new w9j() { // from class: l.h72
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveUpgradeGiftInfoItem) obj).mo223809clone();
                }
            });
        }
        BLiveUpgradeGiftRule bLiveUpgradeGiftRule = this.rule;
        if (bLiveUpgradeGiftRule != null) {
            bLiveUpgradeGiftInfo.rule = bLiveUpgradeGiftRule.mo223809clone();
        }
        List<BLiveUpgradeGiftActInfo> list3 = this.activityInfos;
        if (list3 != null) {
            bLiveUpgradeGiftInfo.activityInfos = ValueObject.util_map(list3, new w9j() { // from class: l.i72
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveUpgradeGiftActInfo) obj).mo223809clone();
                }
            });
        }
        return bLiveUpgradeGiftInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUpgradeGiftInfo)) {
            return false;
        }
        BLiveUpgradeGiftInfo bLiveUpgradeGiftInfo = (BLiveUpgradeGiftInfo) obj;
        return ValueObject.util_equals(this.f44465id, bLiveUpgradeGiftInfo.f44465id) && ValueObject.util_equals(this.name, bLiveUpgradeGiftInfo.name) && ValueObject.util_equals(this.storeName, bLiveUpgradeGiftInfo.storeName) && ValueObject.util_equals(this.type, bLiveUpgradeGiftInfo.type) && ValueObject.util_equals(this.giftLevels, bLiveUpgradeGiftInfo.giftLevels) && ValueObject.util_equals(this.slotGiftInfos, bLiveUpgradeGiftInfo.slotGiftInfos) && ValueObject.util_equals(this.rule, bLiveUpgradeGiftInfo.rule) && ValueObject.util_equals(this.activityInfos, bLiveUpgradeGiftInfo.activityInfos);
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
        String str = this.f44465id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.storeName;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.type;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        List<BLiveUpgradeGiftResLevel> list = this.giftLevels;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveUpgradeGiftInfoItem> list2 = this.slotGiftInfos;
        int iHashCode6 = (iHashCode5 + (list2 != null ? list2.hashCode() : 0)) * 41;
        BLiveUpgradeGiftRule bLiveUpgradeGiftRule = this.rule;
        int iHashCode7 = (iHashCode6 + (bLiveUpgradeGiftRule != null ? bLiveUpgradeGiftRule.hashCode() : 0)) * 41;
        List<BLiveUpgradeGiftActInfo> list3 = this.activityInfos;
        int iHashCode8 = iHashCode7 + (list3 != null ? list3.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44465id == null) {
            this.f44465id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.storeName == null) {
            this.storeName = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.giftLevels == null) {
            this.giftLevels = new ArrayList();
        }
        if (this.slotGiftInfos == null) {
            this.slotGiftInfos = new ArrayList();
        }
        if (this.rule == null) {
            this.rule = BLiveUpgradeGiftRule.new_();
        }
        if (this.activityInfos == null) {
            this.activityInfos = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
