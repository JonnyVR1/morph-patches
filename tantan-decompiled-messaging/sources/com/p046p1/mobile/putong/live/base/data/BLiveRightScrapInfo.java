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

/* JADX INFO: loaded from: classes13.dex */
public class BLiveRightScrapInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveRightScrapInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveRightScrapInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveRightScrapInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveRightScrapInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveRightScrapInfo newInstance() {
            return new BLiveRightScrapInfo();
        }

        public boolean parseField(BLiveRightScrapInfo bLiveRightScrapInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "remainCount":
                    bLiveRightScrapInfo.remainCount = jsonParser.getValueAsLong();
                    return true;
                case "jumpUrl":
                    bLiveRightScrapInfo.jumpUrl = jsonParser.getValueAsString();
                    return true;
                case "itemId":
                    bLiveRightScrapInfo.itemId = jsonParser.getValueAsLong();
                    return true;
                case "stockCount":
                    bLiveRightScrapInfo.stockCount = jsonParser.getValueAsLong();
                    return true;
                case "craftCost":
                    bLiveRightScrapInfo.craftCost = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveRightScrapInfo bLiveRightScrapInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("itemId", bLiveRightScrapInfo.itemId);
            jsonGenerator.writeNumberField("remainCount", bLiveRightScrapInfo.remainCount);
            jsonGenerator.writeNumberField("craftCost", bLiveRightScrapInfo.craftCost);
            jsonGenerator.writeNumberField("stockCount", bLiveRightScrapInfo.stockCount);
            String str = bLiveRightScrapInfo.jumpUrl;
            if (str != null) {
                jsonGenerator.writeStringField("jumpUrl", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveRightScrapInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliverightscrapinfo";

    @ProtobufIndex(index = 3)
    public long craftCost;

    @ProtobufIndex(index = 1)
    public long itemId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String jumpUrl;

    @ProtobufIndex(index = 2)
    public long remainCount;

    @ProtobufIndex(index = 4)
    public long stockCount;

    public static BLiveRightScrapInfo new_() {
        BLiveRightScrapInfo bLiveRightScrapInfo = new BLiveRightScrapInfo();
        bLiveRightScrapInfo.nullCheck();
        return bLiveRightScrapInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveRightScrapInfo mo223809clone() {
        BLiveRightScrapInfo bLiveRightScrapInfo = new BLiveRightScrapInfo();
        bLiveRightScrapInfo.itemId = this.itemId;
        bLiveRightScrapInfo.remainCount = this.remainCount;
        bLiveRightScrapInfo.craftCost = this.craftCost;
        bLiveRightScrapInfo.stockCount = this.stockCount;
        bLiveRightScrapInfo.jumpUrl = this.jumpUrl;
        return bLiveRightScrapInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveRightScrapInfo)) {
            return false;
        }
        BLiveRightScrapInfo bLiveRightScrapInfo = (BLiveRightScrapInfo) obj;
        return this.itemId == bLiveRightScrapInfo.itemId && this.remainCount == bLiveRightScrapInfo.remainCount && this.craftCost == bLiveRightScrapInfo.craftCost && this.stockCount == bLiveRightScrapInfo.stockCount && ValueObject.util_equals(this.jumpUrl, bLiveRightScrapInfo.jumpUrl);
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
        long j = this.itemId;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.remainCount;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.craftCost;
        int i4 = (i3 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        long j4 = this.stockCount;
        int i5 = (i4 + ((int) (j4 ^ (j4 >>> 32)))) * 41;
        String str = this.jumpUrl;
        int iHashCode = i5 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.jumpUrl == null) {
            this.jumpUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
