package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceBonusGiftItem;
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
public class BLiveVoiceBonusGifts extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceBonusGifts> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceBonusGifts>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceBonusGifts.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceBonusGifts.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceBonusGifts newInstance() {
            return new BLiveVoiceBonusGifts();
        }

        public boolean parseField(BLiveVoiceBonusGifts bLiveVoiceBonusGifts, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    bLiveVoiceBonusGifts.description = jsonParser.getValueAsString();
                    return true;
                case "tantanCoins":
                    bLiveVoiceBonusGifts.tantanCoins = jsonParser.getValueAsLong();
                    return true;
                case "attractUserNum":
                    bLiveVoiceBonusGifts.attractUserNum = jsonParser.getValueAsLong();
                    return true;
                case "giftItems":
                    bLiveVoiceBonusGifts.giftItems = JsonAdapter.parseArray(jsonParser, BLiveVoiceBonusGiftItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceBonusGifts bLiveVoiceBonusGifts, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("attractUserNum", bLiveVoiceBonusGifts.attractUserNum);
            String str = bLiveVoiceBonusGifts.description;
            if (str != null) {
                jsonGenerator.writeStringField("description", str);
            }
            jsonGenerator.writeNumberField("tantanCoins", bLiveVoiceBonusGifts.tantanCoins);
            if (bLiveVoiceBonusGifts.giftItems != null) {
                jsonGenerator.writeFieldName("giftItems");
                JsonAdapter.serializeArray(bLiveVoiceBonusGifts.giftItems, jsonGenerator, BLiveVoiceBonusGiftItem.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceBonusGifts) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicebonusgifts";

    @ProtobufIndex(index = 1)
    public long attractUserNum;

    @NonNull
    @ProtobufIndex(index = 2)
    public String description;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<BLiveVoiceBonusGiftItem> giftItems;

    @ProtobufIndex(index = 3)
    public long tantanCoins;

    public static BLiveVoiceBonusGifts new_() {
        BLiveVoiceBonusGifts bLiveVoiceBonusGifts = new BLiveVoiceBonusGifts();
        bLiveVoiceBonusGifts.nullCheck();
        return bLiveVoiceBonusGifts;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceBonusGifts mo225055clone() {
        BLiveVoiceBonusGifts bLiveVoiceBonusGifts = new BLiveVoiceBonusGifts();
        bLiveVoiceBonusGifts.attractUserNum = this.attractUserNum;
        bLiveVoiceBonusGifts.description = this.description;
        bLiveVoiceBonusGifts.tantanCoins = this.tantanCoins;
        List<BLiveVoiceBonusGiftItem> list = this.giftItems;
        if (list != null) {
            bLiveVoiceBonusGifts.giftItems = ValueObject.util_map(list, new qcj() { // from class: l.j82
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveVoiceBonusGiftItem) obj).mo225055clone();
                }
            });
        }
        return bLiveVoiceBonusGifts;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceBonusGifts)) {
            return false;
        }
        BLiveVoiceBonusGifts bLiveVoiceBonusGifts = (BLiveVoiceBonusGifts) obj;
        return this.attractUserNum == bLiveVoiceBonusGifts.attractUserNum && ValueObject.util_equals(this.description, bLiveVoiceBonusGifts.description) && this.tantanCoins == bLiveVoiceBonusGifts.tantanCoins && ValueObject.util_equals(this.giftItems, bLiveVoiceBonusGifts.giftItems);
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
        long j = this.attractUserNum;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str = this.description;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j2 = this.tantanCoins;
        int i3 = (((i2 + iHashCode) * 41) + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        List<BLiveVoiceBonusGiftItem> list = this.giftItems;
        int iHashCode2 = i3 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.description == null) {
            this.description = "";
        }
        if (this.giftItems == null) {
            this.giftItems = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
