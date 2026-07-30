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
public class BLiveDiscountItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveDiscountItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveDiscountItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveDiscountItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveDiscountItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveDiscountItem newInstance() {
            return new BLiveDiscountItem();
        }

        public boolean parseField(BLiveDiscountItem bLiveDiscountItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "remain":
                    bLiveDiscountItem.remain = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    bLiveDiscountItem.f45204id = jsonParser.getValueAsInt();
                    return false;
                case "discount":
                    bLiveDiscountItem.discount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveDiscountItem bLiveDiscountItem, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", bLiveDiscountItem.f45204id);
            jsonGenerator.writeNumberField("discount", bLiveDiscountItem.discount);
            jsonGenerator.writeNumberField("remain", bLiveDiscountItem.remain);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveDiscountItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivediscountitem";

    @ProtobufIndex(index = 2)
    public int discount;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f45204id;

    @ProtobufIndex(index = 3)
    public int remain;

    public static BLiveDiscountItem new_() {
        BLiveDiscountItem bLiveDiscountItem = new BLiveDiscountItem();
        bLiveDiscountItem.nullCheck();
        return bLiveDiscountItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveDiscountItem mo225055clone() {
        BLiveDiscountItem bLiveDiscountItem = new BLiveDiscountItem();
        bLiveDiscountItem.f45204id = this.f45204id;
        bLiveDiscountItem.discount = this.discount;
        bLiveDiscountItem.remain = this.remain;
        return bLiveDiscountItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveDiscountItem)) {
            return false;
        }
        BLiveDiscountItem bLiveDiscountItem = (BLiveDiscountItem) obj;
        return this.f45204id == bLiveDiscountItem.f45204id && this.discount == bLiveDiscountItem.discount && this.remain == bLiveDiscountItem.remain;
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
        int i2 = (((((i * 41) + this.f45204id) * 41) + this.discount) * 41) + this.remain;
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
