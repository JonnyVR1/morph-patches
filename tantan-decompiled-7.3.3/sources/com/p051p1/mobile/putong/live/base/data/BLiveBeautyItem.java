package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
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
public class BLiveBeautyItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveBeautyItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveBeautyItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveBeautyItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveBeautyItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveBeautyItem newInstance() {
            return new BLiveBeautyItem();
        }

        public boolean parseField(BLiveBeautyItem bLiveBeautyItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    bLiveBeautyItem.f45185id = jsonParser.getValueAsInt();
                    return false;
                case "key":
                    bLiveBeautyItem.key = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    bLiveBeautyItem.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveBeautyItem.name = jsonParser.getValueAsString();
                    return true;
                case "defaultFilterValue":
                    bLiveBeautyItem.defaultFilterValue = jsonParser.getValueAsInt();
                    return true;
                case "defaultBeautyValue":
                    bLiveBeautyItem.defaultBeautyValue = jsonParser.getValueAsInt();
                    return true;
                case "isSuggested":
                    bLiveBeautyItem.isSuggested = jsonParser.getValueAsBoolean();
                    return true;
                case "settingTogether":
                    bLiveBeautyItem.settingTogether = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveBeautyItem bLiveBeautyItem, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", bLiveBeautyItem.f45185id);
            String str = bLiveBeautyItem.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = bLiveBeautyItem.icon;
            if (str2 != null) {
                jsonGenerator.writeStringField("icon", str2);
            }
            jsonGenerator.writeBooleanField("isSuggested", bLiveBeautyItem.isSuggested);
            jsonGenerator.writeBooleanField("settingTogether", bLiveBeautyItem.settingTogether);
            jsonGenerator.writeNumberField("defaultBeautyValue", bLiveBeautyItem.defaultBeautyValue);
            jsonGenerator.writeNumberField("defaultFilterValue", bLiveBeautyItem.defaultFilterValue);
            String str3 = bLiveBeautyItem.key;
            if (str3 != null) {
                jsonGenerator.writeStringField(Constants.KEY_KEY, str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveBeautyItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivebeautyitem";

    @ProtobufIndex(index = 6)
    public int defaultBeautyValue;

    @ProtobufIndex(index = 7)
    public int defaultFilterValue;

    @NonNull
    @ProtobufIndex(index = 3)
    public String icon;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f45185id;

    @ProtobufIndex(index = 4)
    public boolean isSuggested;

    @NonNull
    @ProtobufIndex(index = 8)
    public String key;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @ProtobufIndex(index = 5)
    public boolean settingTogether;
    public Float value = Float.valueOf(-1.0f);
    public boolean isSelected = false;

    public static BLiveBeautyItem create(int i, int i2) {
        BLiveBeautyItem bLiveBeautyItemNew_ = new_();
        bLiveBeautyItemNew_.f45185id = i;
        bLiveBeautyItemNew_.defaultBeautyValue = i2;
        return bLiveBeautyItemNew_;
    }

    public static BLiveBeautyItem new_() {
        BLiveBeautyItem bLiveBeautyItem = new BLiveBeautyItem();
        bLiveBeautyItem.nullCheck();
        return bLiveBeautyItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveBeautyItem mo225055clone() {
        BLiveBeautyItem bLiveBeautyItem = new BLiveBeautyItem();
        bLiveBeautyItem.f45185id = this.f45185id;
        bLiveBeautyItem.name = this.name;
        bLiveBeautyItem.icon = this.icon;
        bLiveBeautyItem.isSuggested = this.isSuggested;
        bLiveBeautyItem.settingTogether = this.settingTogether;
        bLiveBeautyItem.defaultBeautyValue = this.defaultBeautyValue;
        bLiveBeautyItem.defaultFilterValue = this.defaultFilterValue;
        bLiveBeautyItem.key = this.key;
        return bLiveBeautyItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveBeautyItem)) {
            return false;
        }
        BLiveBeautyItem bLiveBeautyItem = (BLiveBeautyItem) obj;
        return this.f45185id == bLiveBeautyItem.f45185id && ValueObject.util_equals(this.name, bLiveBeautyItem.name) && ValueObject.util_equals(this.icon, bLiveBeautyItem.icon) && this.isSuggested == bLiveBeautyItem.isSuggested && this.settingTogether == bLiveBeautyItem.settingTogether && this.defaultBeautyValue == bLiveBeautyItem.defaultBeautyValue && this.defaultFilterValue == bLiveBeautyItem.defaultFilterValue && ValueObject.util_equals(this.key, bLiveBeautyItem.key);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public float getDefaultBeautyValue() {
        return this.defaultBeautyValue / 100.0f;
    }

    public String getIconPath() {
        return null;
    }

    public float getValue() {
        return this.value.floatValue() < 0.0f ? getDefaultBeautyValue() : this.value.floatValue();
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.f45185id) * 41;
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.icon;
        int iHashCode2 = (((((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.isSuggested ? 1231 : 1237)) * 41) + (this.settingTogether ? 1231 : 1237)) * 41) + this.defaultBeautyValue) * 41) + this.defaultFilterValue) * 41;
        String str3 = this.key;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.key == null) {
            this.key = "";
        }
    }

    public void resetBeautyValue() {
        this.value = Float.valueOf(this.defaultBeautyValue / 100.0f);
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
    }

    public void setValue(float f) {
        this.value = Float.valueOf(f);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    public void setValue(Float f) {
        this.value = f;
    }
}
