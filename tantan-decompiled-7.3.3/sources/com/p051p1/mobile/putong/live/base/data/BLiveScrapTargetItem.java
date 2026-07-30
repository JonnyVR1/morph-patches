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
public class BLiveScrapTargetItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveScrapTargetItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveScrapTargetItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveScrapTargetItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveScrapTargetItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveScrapTargetItem newInstance() {
            return new BLiveScrapTargetItem();
        }

        public boolean parseField(BLiveScrapTargetItem bLiveScrapTargetItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "itemId":
                    bLiveScrapTargetItem.itemId = jsonParser.getValueAsString();
                    return true;
                case "itemStockByDay":
                    bLiveScrapTargetItem.itemStockByDay = jsonParser.getValueAsLong();
                    return true;
                case "cost":
                    bLiveScrapTargetItem.cost = jsonParser.getValueAsLong();
                    return true;
                case "icon":
                    bLiveScrapTargetItem.icon = jsonParser.getValueAsString();
                    return true;
                case "itemName":
                    bLiveScrapTargetItem.itemName = jsonParser.getValueAsString();
                    return true;
                case "itemType":
                    bLiveScrapTargetItem.itemType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveScrapTargetItem bLiveScrapTargetItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveScrapTargetItem.itemType;
            if (str != null) {
                jsonGenerator.writeStringField("itemType", str);
            }
            String str2 = bLiveScrapTargetItem.itemId;
            if (str2 != null) {
                jsonGenerator.writeStringField("itemId", str2);
            }
            jsonGenerator.writeNumberField("cost", bLiveScrapTargetItem.cost);
            jsonGenerator.writeNumberField("itemStockByDay", bLiveScrapTargetItem.itemStockByDay);
            String str3 = bLiveScrapTargetItem.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField("icon", str3);
            }
            String str4 = bLiveScrapTargetItem.itemName;
            if (str4 != null) {
                jsonGenerator.writeStringField("itemName", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveScrapTargetItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivescraptargetitem";

    @ProtobufIndex(index = 3)
    public long cost;

    @NonNull
    @ProtobufIndex(index = 5)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 2)
    public String itemId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String itemName;

    @ProtobufIndex(index = 4)
    public long itemStockByDay;

    @NonNull
    @ProtobufIndex(index = 1)
    public String itemType;

    public static BLiveScrapTargetItem new_() {
        BLiveScrapTargetItem bLiveScrapTargetItem = new BLiveScrapTargetItem();
        bLiveScrapTargetItem.nullCheck();
        return bLiveScrapTargetItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveScrapTargetItem mo225055clone() {
        BLiveScrapTargetItem bLiveScrapTargetItem = new BLiveScrapTargetItem();
        bLiveScrapTargetItem.itemType = this.itemType;
        bLiveScrapTargetItem.itemId = this.itemId;
        bLiveScrapTargetItem.cost = this.cost;
        bLiveScrapTargetItem.itemStockByDay = this.itemStockByDay;
        bLiveScrapTargetItem.icon = this.icon;
        bLiveScrapTargetItem.itemName = this.itemName;
        return bLiveScrapTargetItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveScrapTargetItem)) {
            return false;
        }
        BLiveScrapTargetItem bLiveScrapTargetItem = (BLiveScrapTargetItem) obj;
        return ValueObject.util_equals(this.itemType, bLiveScrapTargetItem.itemType) && ValueObject.util_equals(this.itemId, bLiveScrapTargetItem.itemId) && this.cost == bLiveScrapTargetItem.cost && this.itemStockByDay == bLiveScrapTargetItem.itemStockByDay && ValueObject.util_equals(this.icon, bLiveScrapTargetItem.icon) && ValueObject.util_equals(this.itemName, bLiveScrapTargetItem.itemName);
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
        String str = this.itemType;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.itemId;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.cost;
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.itemStockByDay;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str3 = this.icon;
        int iHashCode3 = (i4 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.itemName;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.itemType == null) {
            this.itemType = "";
        }
        if (this.itemId == null) {
            this.itemId = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.itemName == null) {
            this.itemName = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
