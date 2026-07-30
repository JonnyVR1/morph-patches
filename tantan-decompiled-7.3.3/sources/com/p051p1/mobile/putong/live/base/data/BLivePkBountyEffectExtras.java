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
public class BLivePkBountyEffectExtras extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePkBountyEffectExtras> JSON_ADAPTER = new ObjectJsonAdapter<BLivePkBountyEffectExtras>() { // from class: com.p1.mobile.putong.live.base.data.BLivePkBountyEffectExtras.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePkBountyEffectExtras.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePkBountyEffectExtras newInstance() {
            return new BLivePkBountyEffectExtras();
        }

        public boolean parseField(BLivePkBountyEffectExtras bLivePkBountyEffectExtras, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    bLivePkBountyEffectExtras.f45271id = jsonParser.getValueAsString();
                    return false;
                case "font":
                    bLivePkBountyEffectExtras.font = jsonParser.getValueAsString();
                    return true;
                case "size":
                    bLivePkBountyEffectExtras.size = jsonParser.getValueAsInt();
                    return true;
                case "type":
                    bLivePkBountyEffectExtras.type = jsonParser.getValueAsInt();
                    return true;
                case "color":
                    bLivePkBountyEffectExtras.color = jsonParser.getValueAsString();
                    return true;
                case "value":
                    bLivePkBountyEffectExtras.value = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePkBountyEffectExtras bLivePkBountyEffectExtras, JsonGenerator jsonGenerator) throws IOException {
            String str = bLivePkBountyEffectExtras.f45271id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("type", bLivePkBountyEffectExtras.type);
            String str2 = bLivePkBountyEffectExtras.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
            String str3 = bLivePkBountyEffectExtras.font;
            if (str3 != null) {
                jsonGenerator.writeStringField("font", str3);
            }
            jsonGenerator.writeNumberField("size", bLivePkBountyEffectExtras.size);
            String str4 = bLivePkBountyEffectExtras.color;
            if (str4 != null) {
                jsonGenerator.writeStringField("color", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePkBountyEffectExtras) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepkbountyeffectextras";

    @NonNull
    @ProtobufIndex(index = 6)
    public String color;

    @NonNull
    @ProtobufIndex(index = 4)
    public String font;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45271id;

    @ProtobufIndex(index = 5)
    public int size;

    @ProtobufIndex(index = 2)
    public int type;

    @NonNull
    @ProtobufIndex(index = 3)
    public String value;

    public static BLivePkBountyEffectExtras new_() {
        BLivePkBountyEffectExtras bLivePkBountyEffectExtras = new BLivePkBountyEffectExtras();
        bLivePkBountyEffectExtras.nullCheck();
        return bLivePkBountyEffectExtras;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePkBountyEffectExtras mo225055clone() {
        BLivePkBountyEffectExtras bLivePkBountyEffectExtras = new BLivePkBountyEffectExtras();
        bLivePkBountyEffectExtras.f45271id = this.f45271id;
        bLivePkBountyEffectExtras.type = this.type;
        bLivePkBountyEffectExtras.value = this.value;
        bLivePkBountyEffectExtras.font = this.font;
        bLivePkBountyEffectExtras.size = this.size;
        bLivePkBountyEffectExtras.color = this.color;
        return bLivePkBountyEffectExtras;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePkBountyEffectExtras)) {
            return false;
        }
        BLivePkBountyEffectExtras bLivePkBountyEffectExtras = (BLivePkBountyEffectExtras) obj;
        return ValueObject.util_equals(this.f45271id, bLivePkBountyEffectExtras.f45271id) && this.type == bLivePkBountyEffectExtras.type && ValueObject.util_equals(this.value, bLivePkBountyEffectExtras.value) && ValueObject.util_equals(this.font, bLivePkBountyEffectExtras.font) && this.size == bLivePkBountyEffectExtras.size && ValueObject.util_equals(this.color, bLivePkBountyEffectExtras.color);
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
        String str = this.f45271id;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.type) * 41;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.font;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.size) * 41;
        String str4 = this.color;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45271id == null) {
            this.f45271id = "";
        }
        if (this.value == null) {
            this.value = "";
        }
        if (this.font == null) {
            this.font = "";
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
