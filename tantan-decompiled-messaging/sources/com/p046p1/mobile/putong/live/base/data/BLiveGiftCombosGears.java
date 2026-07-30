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
public class BLiveGiftCombosGears extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftCombosGears> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftCombosGears>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftCombosGears.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftCombosGears.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftCombosGears newInstance() {
            return new BLiveGiftCombosGears();
        }

        public boolean parseField(BLiveGiftCombosGears bLiveGiftCombosGears, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("combosHitNum")) {
                bLiveGiftCombosGears.combosHitNum = jsonParser.getValueAsLong();
                return true;
            }
            if (!str.equals("previewText")) {
                return false;
            }
            bLiveGiftCombosGears.previewText = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftCombosGears bLiveGiftCombosGears, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("combosHitNum", bLiveGiftCombosGears.combosHitNum);
            String str = bLiveGiftCombosGears.previewText;
            if (str != null) {
                jsonGenerator.writeStringField("previewText", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftCombosGears) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftcombosgears";

    @ProtobufIndex(index = 1)
    public long combosHitNum;

    @NonNull
    @ProtobufIndex(index = 2)
    public String previewText;

    public static BLiveGiftCombosGears new_() {
        BLiveGiftCombosGears bLiveGiftCombosGears = new BLiveGiftCombosGears();
        bLiveGiftCombosGears.nullCheck();
        return bLiveGiftCombosGears;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftCombosGears mo223809clone() {
        BLiveGiftCombosGears bLiveGiftCombosGears = new BLiveGiftCombosGears();
        bLiveGiftCombosGears.combosHitNum = this.combosHitNum;
        bLiveGiftCombosGears.previewText = this.previewText;
        return bLiveGiftCombosGears;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftCombosGears)) {
            return false;
        }
        BLiveGiftCombosGears bLiveGiftCombosGears = (BLiveGiftCombosGears) obj;
        return this.combosHitNum == bLiveGiftCombosGears.combosHitNum && ValueObject.util_equals(this.previewText, bLiveGiftCombosGears.previewText);
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
        long j = this.combosHitNum;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str = this.previewText;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.previewText == null) {
            this.previewText = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
