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
public class BLiveNewGiftWallInteractTextItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveNewGiftWallInteractTextItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveNewGiftWallInteractTextItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveNewGiftWallInteractTextItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveNewGiftWallInteractTextItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveNewGiftWallInteractTextItem newInstance() {
            return new BLiveNewGiftWallInteractTextItem();
        }

        public boolean parseField(BLiveNewGiftWallInteractTextItem bLiveNewGiftWallInteractTextItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("color")) {
                bLiveNewGiftWallInteractTextItem.color = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("value")) {
                return false;
            }
            bLiveNewGiftWallInteractTextItem.value = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveNewGiftWallInteractTextItem bLiveNewGiftWallInteractTextItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveNewGiftWallInteractTextItem.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            String str2 = bLiveNewGiftWallInteractTextItem.color;
            if (str2 != null) {
                jsonGenerator.writeStringField("color", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveNewGiftWallInteractTextItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivenewgiftwallinteracttextitem";

    @NonNull
    @ProtobufIndex(index = 2)
    public String color;

    @NonNull
    @ProtobufIndex(index = 1)
    public String value;

    public static BLiveNewGiftWallInteractTextItem new_() {
        BLiveNewGiftWallInteractTextItem bLiveNewGiftWallInteractTextItem = new BLiveNewGiftWallInteractTextItem();
        bLiveNewGiftWallInteractTextItem.nullCheck();
        return bLiveNewGiftWallInteractTextItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveNewGiftWallInteractTextItem mo223809clone() {
        BLiveNewGiftWallInteractTextItem bLiveNewGiftWallInteractTextItem = new BLiveNewGiftWallInteractTextItem();
        bLiveNewGiftWallInteractTextItem.value = this.value;
        bLiveNewGiftWallInteractTextItem.color = this.color;
        return bLiveNewGiftWallInteractTextItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveNewGiftWallInteractTextItem)) {
            return false;
        }
        BLiveNewGiftWallInteractTextItem bLiveNewGiftWallInteractTextItem = (BLiveNewGiftWallInteractTextItem) obj;
        return ValueObject.util_equals(this.value, bLiveNewGiftWallInteractTextItem.value) && ValueObject.util_equals(this.color, bLiveNewGiftWallInteractTextItem.color);
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
        String str = this.value;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.color;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
        if (this.color == null) {
            this.color = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
