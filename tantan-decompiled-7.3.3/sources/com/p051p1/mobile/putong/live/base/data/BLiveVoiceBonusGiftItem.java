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
public class BLiveVoiceBonusGiftItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceBonusGiftItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceBonusGiftItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceBonusGiftItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceBonusGiftItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceBonusGiftItem newInstance() {
            return new BLiveVoiceBonusGiftItem();
        }

        public boolean parseField(BLiveVoiceBonusGiftItem bLiveVoiceBonusGiftItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "tantanCoins":
                    bLiveVoiceBonusGiftItem.tantanCoins = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveVoiceBonusGiftItem.f45332id = jsonParser.getValueAsString();
                    return false;
                case "giftUrl":
                    bLiveVoiceBonusGiftItem.giftUrl = jsonParser.getValueAsString();
                    return true;
                case "count":
                    bLiveVoiceBonusGiftItem.count = jsonParser.getValueAsLong();
                    return true;
                case "giftName":
                    bLiveVoiceBonusGiftItem.giftName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceBonusGiftItem bLiveVoiceBonusGiftItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceBonusGiftItem.f45332id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVoiceBonusGiftItem.giftName;
            if (str2 != null) {
                jsonGenerator.writeStringField("giftName", str2);
            }
            String str3 = bLiveVoiceBonusGiftItem.giftUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("giftUrl", str3);
            }
            jsonGenerator.writeNumberField("count", bLiveVoiceBonusGiftItem.count);
            String str4 = bLiveVoiceBonusGiftItem.tantanCoins;
            if (str4 != null) {
                jsonGenerator.writeStringField("tantanCoins", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceBonusGiftItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicebonusgiftitem";

    @ProtobufIndex(index = 4)
    public long count;

    @NonNull
    @ProtobufIndex(index = 2)
    public String giftName;

    @NonNull
    @ProtobufIndex(index = 3)
    public String giftUrl;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45332id;

    @NonNull
    @ProtobufIndex(index = 5)
    public String tantanCoins;

    public static BLiveVoiceBonusGiftItem new_() {
        BLiveVoiceBonusGiftItem bLiveVoiceBonusGiftItem = new BLiveVoiceBonusGiftItem();
        bLiveVoiceBonusGiftItem.nullCheck();
        return bLiveVoiceBonusGiftItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceBonusGiftItem mo225055clone() {
        BLiveVoiceBonusGiftItem bLiveVoiceBonusGiftItem = new BLiveVoiceBonusGiftItem();
        bLiveVoiceBonusGiftItem.f45332id = this.f45332id;
        bLiveVoiceBonusGiftItem.giftName = this.giftName;
        bLiveVoiceBonusGiftItem.giftUrl = this.giftUrl;
        bLiveVoiceBonusGiftItem.count = this.count;
        bLiveVoiceBonusGiftItem.tantanCoins = this.tantanCoins;
        return bLiveVoiceBonusGiftItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceBonusGiftItem)) {
            return false;
        }
        BLiveVoiceBonusGiftItem bLiveVoiceBonusGiftItem = (BLiveVoiceBonusGiftItem) obj;
        return ValueObject.util_equals(this.f45332id, bLiveVoiceBonusGiftItem.f45332id) && ValueObject.util_equals(this.giftName, bLiveVoiceBonusGiftItem.giftName) && ValueObject.util_equals(this.giftUrl, bLiveVoiceBonusGiftItem.giftUrl) && this.count == bLiveVoiceBonusGiftItem.count && ValueObject.util_equals(this.tantanCoins, bLiveVoiceBonusGiftItem.tantanCoins);
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
        String str = this.f45332id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.giftName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.giftUrl;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        long j = this.count;
        int i3 = (((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str4 = this.tantanCoins;
        int iHashCode4 = i3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45332id == null) {
            this.f45332id = "";
        }
        if (this.giftName == null) {
            this.giftName = "";
        }
        if (this.giftUrl == null) {
            this.giftUrl = "";
        }
        if (this.tantanCoins == null) {
            this.tantanCoins = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
