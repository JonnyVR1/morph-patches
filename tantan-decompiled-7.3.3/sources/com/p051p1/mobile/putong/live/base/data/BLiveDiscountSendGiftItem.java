package com.p051p1.mobile.putong.live.base.data;

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
public class BLiveDiscountSendGiftItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveDiscountSendGiftItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveDiscountSendGiftItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveDiscountSendGiftItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveDiscountSendGiftItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveDiscountSendGiftItem newInstance() {
            return new BLiveDiscountSendGiftItem();
        }

        public boolean parseField(BLiveDiscountSendGiftItem bLiveDiscountSendGiftItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                bLiveDiscountSendGiftItem.f45205id = jsonParser.getValueAsInt();
                return false;
            }
            if (!str.equals("cnt")) {
                return false;
            }
            bLiveDiscountSendGiftItem.cnt = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveDiscountSendGiftItem bLiveDiscountSendGiftItem, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", bLiveDiscountSendGiftItem.f45205id);
            jsonGenerator.writeNumberField("cnt", bLiveDiscountSendGiftItem.cnt);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveDiscountSendGiftItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivediscountsendgiftitem";

    @ProtobufIndex(index = 2)
    public int cnt;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f45205id;

    public static BLiveDiscountSendGiftItem new_() {
        BLiveDiscountSendGiftItem bLiveDiscountSendGiftItem = new BLiveDiscountSendGiftItem();
        bLiveDiscountSendGiftItem.nullCheck();
        return bLiveDiscountSendGiftItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveDiscountSendGiftItem mo225055clone() {
        BLiveDiscountSendGiftItem bLiveDiscountSendGiftItem = new BLiveDiscountSendGiftItem();
        bLiveDiscountSendGiftItem.f45205id = this.f45205id;
        bLiveDiscountSendGiftItem.cnt = this.cnt;
        return bLiveDiscountSendGiftItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveDiscountSendGiftItem)) {
            return false;
        }
        BLiveDiscountSendGiftItem bLiveDiscountSendGiftItem = (BLiveDiscountSendGiftItem) obj;
        return this.f45205id == bLiveDiscountSendGiftItem.f45205id && this.cnt == bLiveDiscountSendGiftItem.cnt;
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
        int i2 = (((i * 41) + this.f45205id) * 41) + this.cnt;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
