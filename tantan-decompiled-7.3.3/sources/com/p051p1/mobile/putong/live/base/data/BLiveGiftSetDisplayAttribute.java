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
public class BLiveGiftSetDisplayAttribute extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftSetDisplayAttribute> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftSetDisplayAttribute>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftSetDisplayAttribute.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftSetDisplayAttribute.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftSetDisplayAttribute newInstance() {
            return new BLiveGiftSetDisplayAttribute();
        }

        public boolean parseField(BLiveGiftSetDisplayAttribute bLiveGiftSetDisplayAttribute, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "giftDisplayAttribute":
                    bLiveGiftSetDisplayAttribute.giftDisplayAttribute = BLiveGiftSetDisplayAttributeItem.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "resourceDisplayAttribute":
                    bLiveGiftSetDisplayAttribute.resourceDisplayAttribute = BLiveGiftSetDisplayAttributeItem.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "giftSetDescDisplayAttribute":
                    bLiveGiftSetDisplayAttribute.giftSetDescDisplayAttribute = BLiveGiftSetDisplayAttributeItem.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "questionMarkDisplayAttribute":
                    bLiveGiftSetDisplayAttribute.questionMarkDisplayAttribute = BLiveGiftSetDisplayAttributeItem.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "safeAreaPicUrl":
                    bLiveGiftSetDisplayAttribute.safeAreaPicUrl = jsonParser.getValueAsString();
                    return true;
                case "tickerDisplayAttribute":
                    bLiveGiftSetDisplayAttribute.tickerDisplayAttribute = BLiveGiftSetDisplayAttributeItem.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "backgroundPicUrl":
                    bLiveGiftSetDisplayAttribute.backgroundPicUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftSetDisplayAttribute bLiveGiftSetDisplayAttribute, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftSetDisplayAttribute.backgroundPicUrl;
            if (str != null) {
                jsonGenerator.writeStringField("backgroundPicUrl", str);
            }
            String str2 = bLiveGiftSetDisplayAttribute.safeAreaPicUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("safeAreaPicUrl", str2);
            }
            if (bLiveGiftSetDisplayAttribute.tickerDisplayAttribute != null) {
                jsonGenerator.writeFieldName("tickerDisplayAttribute");
                BLiveGiftSetDisplayAttributeItem.JSON_ADAPTER.serialize(bLiveGiftSetDisplayAttribute.tickerDisplayAttribute, jsonGenerator, true);
            }
            if (bLiveGiftSetDisplayAttribute.giftSetDescDisplayAttribute != null) {
                jsonGenerator.writeFieldName("giftSetDescDisplayAttribute");
                BLiveGiftSetDisplayAttributeItem.JSON_ADAPTER.serialize(bLiveGiftSetDisplayAttribute.giftSetDescDisplayAttribute, jsonGenerator, true);
            }
            if (bLiveGiftSetDisplayAttribute.giftDisplayAttribute != null) {
                jsonGenerator.writeFieldName("giftDisplayAttribute");
                BLiveGiftSetDisplayAttributeItem.JSON_ADAPTER.serialize(bLiveGiftSetDisplayAttribute.giftDisplayAttribute, jsonGenerator, true);
            }
            if (bLiveGiftSetDisplayAttribute.resourceDisplayAttribute != null) {
                jsonGenerator.writeFieldName("resourceDisplayAttribute");
                BLiveGiftSetDisplayAttributeItem.JSON_ADAPTER.serialize(bLiveGiftSetDisplayAttribute.resourceDisplayAttribute, jsonGenerator, true);
            }
            if (bLiveGiftSetDisplayAttribute.questionMarkDisplayAttribute != null) {
                jsonGenerator.writeFieldName("questionMarkDisplayAttribute");
                BLiveGiftSetDisplayAttributeItem.JSON_ADAPTER.serialize(bLiveGiftSetDisplayAttribute.questionMarkDisplayAttribute, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftSetDisplayAttribute) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftsetdisplayattribute";

    @NonNull
    @ProtobufIndex(index = 1)
    public String backgroundPicUrl;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveGiftSetDisplayAttributeItem giftDisplayAttribute;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveGiftSetDisplayAttributeItem giftSetDescDisplayAttribute;

    @NonNull
    @ProtobufIndex(index = 7)
    public BLiveGiftSetDisplayAttributeItem questionMarkDisplayAttribute;

    @NonNull
    @ProtobufIndex(index = 6)
    public BLiveGiftSetDisplayAttributeItem resourceDisplayAttribute;

    @NonNull
    @ProtobufIndex(index = 2)
    public String safeAreaPicUrl;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveGiftSetDisplayAttributeItem tickerDisplayAttribute;

    public static BLiveGiftSetDisplayAttribute new_() {
        BLiveGiftSetDisplayAttribute bLiveGiftSetDisplayAttribute = new BLiveGiftSetDisplayAttribute();
        bLiveGiftSetDisplayAttribute.nullCheck();
        return bLiveGiftSetDisplayAttribute;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftSetDisplayAttribute mo225055clone() {
        BLiveGiftSetDisplayAttribute bLiveGiftSetDisplayAttribute = new BLiveGiftSetDisplayAttribute();
        bLiveGiftSetDisplayAttribute.backgroundPicUrl = this.backgroundPicUrl;
        bLiveGiftSetDisplayAttribute.safeAreaPicUrl = this.safeAreaPicUrl;
        BLiveGiftSetDisplayAttributeItem bLiveGiftSetDisplayAttributeItem = this.tickerDisplayAttribute;
        if (bLiveGiftSetDisplayAttributeItem != null) {
            bLiveGiftSetDisplayAttribute.tickerDisplayAttribute = bLiveGiftSetDisplayAttributeItem.mo225055clone();
        }
        BLiveGiftSetDisplayAttributeItem bLiveGiftSetDisplayAttributeItem2 = this.giftSetDescDisplayAttribute;
        if (bLiveGiftSetDisplayAttributeItem2 != null) {
            bLiveGiftSetDisplayAttribute.giftSetDescDisplayAttribute = bLiveGiftSetDisplayAttributeItem2.mo225055clone();
        }
        BLiveGiftSetDisplayAttributeItem bLiveGiftSetDisplayAttributeItem3 = this.giftDisplayAttribute;
        if (bLiveGiftSetDisplayAttributeItem3 != null) {
            bLiveGiftSetDisplayAttribute.giftDisplayAttribute = bLiveGiftSetDisplayAttributeItem3.mo225055clone();
        }
        BLiveGiftSetDisplayAttributeItem bLiveGiftSetDisplayAttributeItem4 = this.resourceDisplayAttribute;
        if (bLiveGiftSetDisplayAttributeItem4 != null) {
            bLiveGiftSetDisplayAttribute.resourceDisplayAttribute = bLiveGiftSetDisplayAttributeItem4.mo225055clone();
        }
        BLiveGiftSetDisplayAttributeItem bLiveGiftSetDisplayAttributeItem5 = this.questionMarkDisplayAttribute;
        if (bLiveGiftSetDisplayAttributeItem5 != null) {
            bLiveGiftSetDisplayAttribute.questionMarkDisplayAttribute = bLiveGiftSetDisplayAttributeItem5.mo225055clone();
        }
        return bLiveGiftSetDisplayAttribute;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftSetDisplayAttribute)) {
            return false;
        }
        BLiveGiftSetDisplayAttribute bLiveGiftSetDisplayAttribute = (BLiveGiftSetDisplayAttribute) obj;
        return ValueObject.util_equals(this.backgroundPicUrl, bLiveGiftSetDisplayAttribute.backgroundPicUrl) && ValueObject.util_equals(this.safeAreaPicUrl, bLiveGiftSetDisplayAttribute.safeAreaPicUrl) && ValueObject.util_equals(this.tickerDisplayAttribute, bLiveGiftSetDisplayAttribute.tickerDisplayAttribute) && ValueObject.util_equals(this.giftSetDescDisplayAttribute, bLiveGiftSetDisplayAttribute.giftSetDescDisplayAttribute) && ValueObject.util_equals(this.giftDisplayAttribute, bLiveGiftSetDisplayAttribute.giftDisplayAttribute) && ValueObject.util_equals(this.resourceDisplayAttribute, bLiveGiftSetDisplayAttribute.resourceDisplayAttribute) && ValueObject.util_equals(this.questionMarkDisplayAttribute, bLiveGiftSetDisplayAttribute.questionMarkDisplayAttribute);
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
        String str = this.backgroundPicUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.safeAreaPicUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveGiftSetDisplayAttributeItem bLiveGiftSetDisplayAttributeItem = this.tickerDisplayAttribute;
        int iHashCode3 = (iHashCode2 + (bLiveGiftSetDisplayAttributeItem != null ? bLiveGiftSetDisplayAttributeItem.hashCode() : 0)) * 41;
        BLiveGiftSetDisplayAttributeItem bLiveGiftSetDisplayAttributeItem2 = this.giftSetDescDisplayAttribute;
        int iHashCode4 = (iHashCode3 + (bLiveGiftSetDisplayAttributeItem2 != null ? bLiveGiftSetDisplayAttributeItem2.hashCode() : 0)) * 41;
        BLiveGiftSetDisplayAttributeItem bLiveGiftSetDisplayAttributeItem3 = this.giftDisplayAttribute;
        int iHashCode5 = (iHashCode4 + (bLiveGiftSetDisplayAttributeItem3 != null ? bLiveGiftSetDisplayAttributeItem3.hashCode() : 0)) * 41;
        BLiveGiftSetDisplayAttributeItem bLiveGiftSetDisplayAttributeItem4 = this.resourceDisplayAttribute;
        int iHashCode6 = (iHashCode5 + (bLiveGiftSetDisplayAttributeItem4 != null ? bLiveGiftSetDisplayAttributeItem4.hashCode() : 0)) * 41;
        BLiveGiftSetDisplayAttributeItem bLiveGiftSetDisplayAttributeItem5 = this.questionMarkDisplayAttribute;
        int iHashCode7 = iHashCode6 + (bLiveGiftSetDisplayAttributeItem5 != null ? bLiveGiftSetDisplayAttributeItem5.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.backgroundPicUrl == null) {
            this.backgroundPicUrl = "";
        }
        if (this.safeAreaPicUrl == null) {
            this.safeAreaPicUrl = "";
        }
        if (this.tickerDisplayAttribute == null) {
            this.tickerDisplayAttribute = BLiveGiftSetDisplayAttributeItem.new_();
        }
        if (this.giftSetDescDisplayAttribute == null) {
            this.giftSetDescDisplayAttribute = BLiveGiftSetDisplayAttributeItem.new_();
        }
        if (this.giftDisplayAttribute == null) {
            this.giftDisplayAttribute = BLiveGiftSetDisplayAttributeItem.new_();
        }
        if (this.resourceDisplayAttribute == null) {
            this.resourceDisplayAttribute = BLiveGiftSetDisplayAttributeItem.new_();
        }
        if (this.questionMarkDisplayAttribute == null) {
            this.questionMarkDisplayAttribute = BLiveGiftSetDisplayAttributeItem.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
