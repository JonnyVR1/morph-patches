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
public class BLiveColor extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveColor> JSON_ADAPTER = new ObjectJsonAdapter<BLiveColor>() { // from class: com.p1.mobile.putong.live.base.data.BLiveColor.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveColor.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveColor newInstance() {
            return new BLiveColor();
        }

        public boolean parseField(BLiveColor bLiveColor, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startColor":
                    bLiveColor.startColor = jsonParser.getValueAsString();
                    return true;
                case "alpha":
                    bLiveColor.alpha = jsonParser.getValueAsDouble();
                    return true;
                case "endColor":
                    bLiveColor.endColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveColor bLiveColor, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveColor.startColor;
            if (str != null) {
                jsonGenerator.writeStringField("startColor", str);
            }
            String str2 = bLiveColor.endColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("endColor", str2);
            }
            jsonGenerator.writeNumberField("alpha", bLiveColor.alpha);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveColor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivecolor";

    @ProtobufIndex(index = 3)
    public double alpha;

    @NonNull
    @ProtobufIndex(index = 2)
    public String endColor;

    @NonNull
    @ProtobufIndex(index = 1)
    public String startColor;

    public static BLiveColor new_() {
        BLiveColor bLiveColor = new BLiveColor();
        bLiveColor.nullCheck();
        return bLiveColor;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveColor mo225055clone() {
        BLiveColor bLiveColor = new BLiveColor();
        bLiveColor.startColor = this.startColor;
        bLiveColor.endColor = this.endColor;
        bLiveColor.alpha = this.alpha;
        return bLiveColor;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveColor)) {
            return false;
        }
        BLiveColor bLiveColor = (BLiveColor) obj;
        return ValueObject.util_equals(this.startColor, bLiveColor.startColor) && ValueObject.util_equals(this.endColor, bLiveColor.endColor) && this.alpha == bLiveColor.alpha;
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
        String str = this.startColor;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.endColor;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.alpha);
        int i3 = ((iHashCode + iHashCode2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.startColor == null) {
            this.startColor = "";
        }
        if (this.endColor == null) {
            this.endColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
