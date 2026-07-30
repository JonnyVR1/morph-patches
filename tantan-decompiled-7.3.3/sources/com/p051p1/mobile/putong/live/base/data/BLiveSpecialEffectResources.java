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
public class BLiveSpecialEffectResources extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSpecialEffectResources> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSpecialEffectResources>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSpecialEffectResources.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSpecialEffectResources.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSpecialEffectResources newInstance() {
            return new BLiveSpecialEffectResources();
        }

        public boolean parseField(BLiveSpecialEffectResources bLiveSpecialEffectResources, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "textColor":
                    bLiveSpecialEffectResources.textColor = jsonParser.getValueAsString();
                    return true;
                case "textSize":
                    bLiveSpecialEffectResources.textSize = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    bLiveSpecialEffectResources.f45286id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    bLiveSpecialEffectResources.type = jsonParser.getValueAsInt();
                    return true;
                case "value":
                    bLiveSpecialEffectResources.value = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSpecialEffectResources bLiveSpecialEffectResources, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSpecialEffectResources.f45286id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("type", bLiveSpecialEffectResources.type);
            String str2 = bLiveSpecialEffectResources.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
            jsonGenerator.writeNumberField("textSize", bLiveSpecialEffectResources.textSize);
            String str3 = bLiveSpecialEffectResources.textColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("textColor", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSpecialEffectResources) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivespecialeffectresources";
    private static final int TYPE_IMAGE = 1;
    private static final int TYPE_TEXT = 2;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45286id;

    @NonNull
    @ProtobufIndex(index = 5)
    public String textColor;

    @ProtobufIndex(index = 4)
    public int textSize;

    @ProtobufIndex(index = 2)
    public int type;

    @NonNull
    @ProtobufIndex(index = 3)
    public String value;

    public BLiveSpecialEffectResources(@NonNull String str, int i, @NonNull String str2, int i2, String str3) {
        this.f45286id = str;
        this.type = i;
        this.value = str2;
        this.textSize = i2;
        this.textColor = str3;
    }

    public static BLiveSpecialEffectResources new_() {
        BLiveSpecialEffectResources bLiveSpecialEffectResources = new BLiveSpecialEffectResources();
        bLiveSpecialEffectResources.nullCheck();
        return bLiveSpecialEffectResources;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSpecialEffectResources mo225055clone() {
        BLiveSpecialEffectResources bLiveSpecialEffectResources = new BLiveSpecialEffectResources();
        bLiveSpecialEffectResources.f45286id = this.f45286id;
        bLiveSpecialEffectResources.type = this.type;
        bLiveSpecialEffectResources.value = this.value;
        bLiveSpecialEffectResources.textSize = this.textSize;
        bLiveSpecialEffectResources.textColor = this.textColor;
        return bLiveSpecialEffectResources;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSpecialEffectResources)) {
            return false;
        }
        BLiveSpecialEffectResources bLiveSpecialEffectResources = (BLiveSpecialEffectResources) obj;
        return ValueObject.util_equals(this.f45286id, bLiveSpecialEffectResources.f45286id) && this.type == bLiveSpecialEffectResources.type && ValueObject.util_equals(this.value, bLiveSpecialEffectResources.value) && this.textSize == bLiveSpecialEffectResources.textSize && ValueObject.util_equals(this.textColor, bLiveSpecialEffectResources.textColor);
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
        String str = this.f45286id;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.type) * 41;
        String str2 = this.value;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.textSize) * 41;
        String str3 = this.textColor;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45286id == null) {
            this.f45286id = "";
        }
        if (this.value == null) {
            this.value = "";
        }
        if (this.textColor == null) {
            this.textColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    public boolean typeIsImageUrl() {
        return this.type == 1;
    }

    public boolean typeIsText() {
        return this.type == 2;
    }

    public BLiveSpecialEffectResources(@NonNull String str, int i, @NonNull String str2) {
        this.f45286id = str;
        this.type = i;
        this.value = str2;
    }

    public BLiveSpecialEffectResources() {
    }
}
