package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.SchemeKey;
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
public class BLiveScrapBrief extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveScrapBrief> JSON_ADAPTER = new ObjectJsonAdapter<BLiveScrapBrief>() { // from class: com.p1.mobile.putong.live.base.data.BLiveScrapBrief.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveScrapBrief.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveScrapBrief newInstance() {
            return new BLiveScrapBrief();
        }

        public boolean parseField(BLiveScrapBrief bLiveScrapBrief, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    bLiveScrapBrief.description = BLiveCommonViewConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "remainCount":
                    bLiveScrapBrief.remainCount = jsonParser.getValueAsLong();
                    return true;
                case "itemId":
                    bLiveScrapBrief.itemId = jsonParser.getValueAsString();
                    return true;
                case "category":
                    bLiveScrapBrief.category = jsonParser.getValueAsString();
                    return true;
                case "rankType":
                    bLiveScrapBrief.rankType = BLiveScrapRankType.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "targetItem":
                    bLiveScrapBrief.targetItem = BLiveScrapTargetItem.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "giftRight":
                    bLiveScrapBrief.giftRight = BLiveScrapLiveRight.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "liveRight":
                    bLiveScrapBrief.liveRight = BLiveScrapLiveRight.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "itemStock":
                    bLiveScrapBrief.itemStock = BLiveScrapItemStock.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveScrapBrief bLiveScrapBrief, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveScrapBrief.itemId;
            if (str != null) {
                jsonGenerator.writeStringField("itemId", str);
            }
            String str2 = bLiveScrapBrief.category;
            if (str2 != null) {
                jsonGenerator.writeStringField("category", str2);
            }
            if (bLiveScrapBrief.rankType != null) {
                jsonGenerator.writeFieldName("rankType");
                BLiveScrapRankType.JSON_ADAPTER.serialize(bLiveScrapBrief.rankType, jsonGenerator, true);
            }
            if (bLiveScrapBrief.description != null) {
                jsonGenerator.writeFieldName("description");
                BLiveCommonViewConfig.JSON_ADAPTER.serialize(bLiveScrapBrief.description, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("remainCount", bLiveScrapBrief.remainCount);
            if (bLiveScrapBrief.targetItem != null) {
                jsonGenerator.writeFieldName("targetItem");
                BLiveScrapTargetItem.JSON_ADAPTER.serialize(bLiveScrapBrief.targetItem, jsonGenerator, true);
            }
            if (bLiveScrapBrief.itemStock != null) {
                jsonGenerator.writeFieldName("itemStock");
                BLiveScrapItemStock.JSON_ADAPTER.serialize(bLiveScrapBrief.itemStock, jsonGenerator, true);
            }
            if (bLiveScrapBrief.giftRight != null) {
                jsonGenerator.writeFieldName("giftRight");
                BLiveScrapLiveRight.JSON_ADAPTER.serialize(bLiveScrapBrief.giftRight, jsonGenerator, true);
            }
            if (bLiveScrapBrief.liveRight != null) {
                jsonGenerator.writeFieldName(SchemeKey.liveRight);
                BLiveScrapLiveRight.JSON_ADAPTER.serialize(bLiveScrapBrief.liveRight, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveScrapBrief) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivescrapbrief";

    @NonNull
    @ProtobufIndex(index = 2)
    public String category;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveCommonViewConfig description;

    @Nullable
    @ProtobufIndex(index = 8)
    public BLiveScrapLiveRight giftRight;

    @NonNull
    @ProtobufIndex(index = 1)
    public String itemId;

    @NonNull
    @ProtobufIndex(index = 7)
    public BLiveScrapItemStock itemStock;

    @Nullable
    @ProtobufIndex(index = 9)
    public BLiveScrapLiveRight liveRight;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveScrapRankType rankType;

    @ProtobufIndex(index = 5)
    public long remainCount;

    @NonNull
    @ProtobufIndex(index = 6)
    public BLiveScrapTargetItem targetItem;
    public boolean isSelected = false;
    public boolean isRightTabScrap = false;

    public static BLiveScrapBrief new_() {
        BLiveScrapBrief bLiveScrapBrief = new BLiveScrapBrief();
        bLiveScrapBrief.nullCheck();
        return bLiveScrapBrief;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveScrapBrief mo223809clone() {
        BLiveScrapBrief bLiveScrapBrief = new BLiveScrapBrief();
        bLiveScrapBrief.itemId = this.itemId;
        bLiveScrapBrief.category = this.category;
        BLiveScrapRankType bLiveScrapRankType = this.rankType;
        if (bLiveScrapRankType != null) {
            bLiveScrapBrief.rankType = bLiveScrapRankType.mo223809clone();
        }
        BLiveCommonViewConfig bLiveCommonViewConfig = this.description;
        if (bLiveCommonViewConfig != null) {
            bLiveScrapBrief.description = bLiveCommonViewConfig.mo223809clone();
        }
        bLiveScrapBrief.remainCount = this.remainCount;
        BLiveScrapTargetItem bLiveScrapTargetItem = this.targetItem;
        if (bLiveScrapTargetItem != null) {
            bLiveScrapBrief.targetItem = bLiveScrapTargetItem.mo223809clone();
        }
        BLiveScrapItemStock bLiveScrapItemStock = this.itemStock;
        if (bLiveScrapItemStock != null) {
            bLiveScrapBrief.itemStock = bLiveScrapItemStock.mo223809clone();
        }
        BLiveScrapLiveRight bLiveScrapLiveRight = this.giftRight;
        if (bLiveScrapLiveRight != null) {
            bLiveScrapBrief.giftRight = bLiveScrapLiveRight.mo223809clone();
        }
        BLiveScrapLiveRight bLiveScrapLiveRight2 = this.liveRight;
        if (bLiveScrapLiveRight2 != null) {
            bLiveScrapBrief.liveRight = bLiveScrapLiveRight2.mo223809clone();
        }
        return bLiveScrapBrief;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveScrapBrief)) {
            return false;
        }
        BLiveScrapBrief bLiveScrapBrief = (BLiveScrapBrief) obj;
        return ValueObject.util_equals(this.itemId, bLiveScrapBrief.itemId) && ValueObject.util_equals(this.category, bLiveScrapBrief.category) && ValueObject.util_equals(this.rankType, bLiveScrapBrief.rankType) && ValueObject.util_equals(this.description, bLiveScrapBrief.description) && this.remainCount == bLiveScrapBrief.remainCount && ValueObject.util_equals(this.targetItem, bLiveScrapBrief.targetItem) && ValueObject.util_equals(this.itemStock, bLiveScrapBrief.itemStock) && ValueObject.util_equals(this.giftRight, bLiveScrapBrief.giftRight) && ValueObject.util_equals(this.liveRight, bLiveScrapBrief.liveRight);
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
        String str = this.itemId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.category;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveScrapRankType bLiveScrapRankType = this.rankType;
        int iHashCode3 = (iHashCode2 + (bLiveScrapRankType != null ? bLiveScrapRankType.hashCode() : 0)) * 41;
        BLiveCommonViewConfig bLiveCommonViewConfig = this.description;
        int iHashCode4 = bLiveCommonViewConfig != null ? bLiveCommonViewConfig.hashCode() : 0;
        long j = this.remainCount;
        int i3 = (((iHashCode3 + iHashCode4) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        BLiveScrapTargetItem bLiveScrapTargetItem = this.targetItem;
        int iHashCode5 = (i3 + (bLiveScrapTargetItem != null ? bLiveScrapTargetItem.hashCode() : 0)) * 41;
        BLiveScrapItemStock bLiveScrapItemStock = this.itemStock;
        int iHashCode6 = (iHashCode5 + (bLiveScrapItemStock != null ? bLiveScrapItemStock.hashCode() : 0)) * 41;
        BLiveScrapLiveRight bLiveScrapLiveRight = this.giftRight;
        int iHashCode7 = (iHashCode6 + (bLiveScrapLiveRight != null ? bLiveScrapLiveRight.hashCode() : 0)) * 41;
        BLiveScrapLiveRight bLiveScrapLiveRight2 = this.liveRight;
        int iHashCode8 = iHashCode7 + (bLiveScrapLiveRight2 != null ? bLiveScrapLiveRight2.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.itemId == null) {
            this.itemId = "";
        }
        if (this.category == null) {
            this.category = "";
        }
        if (this.rankType == null) {
            this.rankType = BLiveScrapRankType.new_();
        }
        if (this.description == null) {
            this.description = BLiveCommonViewConfig.new_();
        }
        if (this.targetItem == null) {
            this.targetItem = BLiveScrapTargetItem.new_();
        }
        if (this.itemStock == null) {
            this.itemStock = BLiveScrapItemStock.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
