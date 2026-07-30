package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveMerchandise extends CopyObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMerchandise> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMerchandise>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMerchandise.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMerchandise.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMerchandise newInstance() {
            return new BLiveMerchandise();
        }

        public boolean parseField(BLiveMerchandise bLiveMerchandise, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "promotionStockKeepUnit":
                    bLiveMerchandise.promotionStockKeepUnit = BLiveStockKeepUnit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "productType":
                    bLiveMerchandise.productType = BLiveProductType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "defaultStockKeepUnit":
                    bLiveMerchandise.defaultStockKeepUnit = BLiveStockKeepUnit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "quantity":
                    bLiveMerchandise.quantity = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    bLiveMerchandise.f56856id = jsonParser.getValueAsString();
                    return false;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMerchandise bLiveMerchandise, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveMerchandise.f56856id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (bLiveMerchandise.productType != null) {
                jsonGenerator.writeFieldName("productType");
                BLiveProductType.JSON_ADAPTER.serialize(bLiveMerchandise.productType, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.QUANTITY, bLiveMerchandise.quantity);
            if (bLiveMerchandise.defaultStockKeepUnit != null) {
                jsonGenerator.writeFieldName("defaultStockKeepUnit");
                BLiveStockKeepUnit.JSON_ADAPTER.serialize(bLiveMerchandise.defaultStockKeepUnit, jsonGenerator, true);
            }
            if (bLiveMerchandise.promotionStockKeepUnit != null) {
                jsonGenerator.writeFieldName("promotionStockKeepUnit");
                BLiveStockKeepUnit.JSON_ADAPTER.serialize(bLiveMerchandise.promotionStockKeepUnit, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMerchandise) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemerchandise";

    @NonNull
    @ProtobufIndex(index = 53)
    public BLiveStockKeepUnit defaultStockKeepUnit;

    @NonNull
    @ProtobufIndex(index = 51)
    public BLiveProductType productType;

    @NonNull
    @ProtobufIndex(index = 54)
    public BLiveStockKeepUnit promotionStockKeepUnit;

    @ProtobufIndex(index = 52)
    public int quantity;
    public boolean isCustomRecharge = false;
    public boolean isCustomRechargeInput = false;
    public boolean isOneRMBRecharge = false;
    public boolean isIncomingPrice = false;

    public static BLiveMerchandise new_() {
        BLiveMerchandise bLiveMerchandise = new BLiveMerchandise();
        bLiveMerchandise.nullCheck();
        return bLiveMerchandise;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMerchandise mo225055clone() {
        BLiveMerchandise bLiveMerchandise = new BLiveMerchandise();
        bLiveMerchandise._id = this._id;
        bLiveMerchandise.f56856id = this.f56856id;
        bLiveMerchandise.productType = this.productType;
        bLiveMerchandise.quantity = this.quantity;
        BLiveStockKeepUnit bLiveStockKeepUnit = this.defaultStockKeepUnit;
        if (bLiveStockKeepUnit != null) {
            bLiveMerchandise.defaultStockKeepUnit = bLiveStockKeepUnit.mo225055clone();
        }
        BLiveStockKeepUnit bLiveStockKeepUnit2 = this.promotionStockKeepUnit;
        if (bLiveStockKeepUnit2 != null) {
            bLiveMerchandise.promotionStockKeepUnit = bLiveStockKeepUnit2.mo225055clone();
        }
        return bLiveMerchandise;
    }

    @Override // com.tantanapp.common.data.CopyObject
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMerchandise)) {
            return false;
        }
        BLiveMerchandise bLiveMerchandise = (BLiveMerchandise) obj;
        return super.equals(obj) && ValueObject.util_equals(this.productType, bLiveMerchandise.productType) && this.quantity == bLiveMerchandise.quantity && ValueObject.util_equals(this.defaultStockKeepUnit, bLiveMerchandise.defaultStockKeepUnit) && ValueObject.util_equals(this.promotionStockKeepUnit, bLiveMerchandise.promotionStockKeepUnit);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    @Override // com.tantanapp.common.data.CopyObject
    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        BLiveProductType bLiveProductType = this.productType;
        int iHashCode2 = (((iHashCode + (bLiveProductType != null ? bLiveProductType.hashCode() : 0)) * 41) + this.quantity) * 41;
        BLiveStockKeepUnit bLiveStockKeepUnit = this.defaultStockKeepUnit;
        int iHashCode3 = (iHashCode2 + (bLiveStockKeepUnit != null ? bLiveStockKeepUnit.hashCode() : 0)) * 41;
        BLiveStockKeepUnit bLiveStockKeepUnit2 = this.promotionStockKeepUnit;
        int iHashCode4 = iHashCode3 + (bLiveStockKeepUnit2 != null ? bLiveStockKeepUnit2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.productType == null) {
            this.productType = (BLiveProductType) BLiveProductType.JSON_ADAPTER.defaultEnum();
        }
        if (this.defaultStockKeepUnit == null) {
            this.defaultStockKeepUnit = BLiveStockKeepUnit.new_();
        }
        if (this.promotionStockKeepUnit == null) {
            this.promotionStockKeepUnit = BLiveStockKeepUnit.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
