package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
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
public class BLiveMedalColor extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMedalColor> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMedalColor>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMedalColor.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMedalColor.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMedalColor newInstance() {
            return new BLiveMedalColor();
        }

        public boolean parseField(BLiveMedalColor bLiveMedalColor, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                bLiveMedalColor.name = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("color")) {
                return false;
            }
            bLiveMedalColor.color = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMedalColor bLiveMedalColor, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveMedalColor.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = bLiveMedalColor.color;
            if (str2 != null) {
                jsonGenerator.writeStringField("color", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMedalColor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemedalcolor";

    @NonNull
    @ProtobufIndex(index = 2)
    public String color;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    public static BLiveMedalColor new_() {
        BLiveMedalColor bLiveMedalColor = new BLiveMedalColor();
        bLiveMedalColor.nullCheck();
        return bLiveMedalColor;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMedalColor mo225055clone() {
        BLiveMedalColor bLiveMedalColor = new BLiveMedalColor();
        bLiveMedalColor.name = this.name;
        bLiveMedalColor.color = this.color;
        return bLiveMedalColor;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMedalColor)) {
            return false;
        }
        BLiveMedalColor bLiveMedalColor = (BLiveMedalColor) obj;
        return ValueObject.util_equals(this.name, bLiveMedalColor.name) && ValueObject.util_equals(this.color, bLiveMedalColor.color);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.color;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
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
