package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.OMSResourceType;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveCoverLabel;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveCoverLabel extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveCoverLabel> JSON_ADAPTER = new ObjectJsonAdapter<BLiveCoverLabel>() { // from class: com.p1.mobile.putong.live.base.data.BLiveCoverLabel.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveCoverLabel.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveCoverLabel newInstance() {
            return new BLiveCoverLabel();
        }

        public boolean parseField(BLiveCoverLabel bLiveCoverLabel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bgImageH":
                    bLiveCoverLabel.bgImageH = (float) jsonParser.getValueAsDouble();
                    return true;
                case "bgImageW":
                    bLiveCoverLabel.bgImageW = (float) jsonParser.getValueAsDouble();
                    return true;
                case "fontColor":
                    bLiveCoverLabel.fontColor = jsonParser.getValueAsString();
                    return true;
                case "background":
                    bLiveCoverLabel.background = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "opacity":
                    bLiveCoverLabel.opacity = (float) jsonParser.getValueAsDouble();
                    return true;
                case "fontFamily":
                    bLiveCoverLabel.fontFamily = jsonParser.getValueAsString();
                    return true;
                case "linearGradient":
                    bLiveCoverLabel.linearGradient = jsonParser.getValueAsInt();
                    return true;
                case "bgImage":
                    bLiveCoverLabel.bgImage = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    bLiveCoverLabel.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveCoverLabel.name = jsonParser.getValueAsString();
                    return true;
                case "text":
                    bLiveCoverLabel.text = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveCoverLabel.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveCoverLabel bLiveCoverLabel, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveCoverLabel.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = bLiveCoverLabel.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
            String str3 = bLiveCoverLabel.fontFamily;
            if (str3 != null) {
                jsonGenerator.writeStringField("fontFamily", str3);
            }
            String str4 = bLiveCoverLabel.icon;
            if (str4 != null) {
                jsonGenerator.writeStringField("icon", str4);
            }
            jsonGenerator.writeNumberField("linearGradient", bLiveCoverLabel.linearGradient);
            if (bLiveCoverLabel.background != null) {
                jsonGenerator.writeFieldName(OMSResourceType.background);
                JsonAdapter.serializeArray(bLiveCoverLabel.background, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("opacity", bLiveCoverLabel.opacity);
            String str5 = bLiveCoverLabel.fontColor;
            if (str5 != null) {
                jsonGenerator.writeStringField("fontColor", str5);
            }
            String str6 = bLiveCoverLabel.bgImage;
            if (str6 != null) {
                jsonGenerator.writeStringField("bgImage", str6);
            }
            jsonGenerator.writeNumberField("bgImageW", bLiveCoverLabel.bgImageW);
            jsonGenerator.writeNumberField("bgImageH", bLiveCoverLabel.bgImageH);
            String str7 = bLiveCoverLabel.name;
            if (str7 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str7);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveCoverLabel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivecoverlabel";

    @NonNull
    @ProtobufIndex(index = 6)
    public List<String> background;

    @NonNull
    @ProtobufIndex(index = 9)
    public String bgImage;

    @ProtobufIndex(index = 11)
    public float bgImageH;

    @ProtobufIndex(index = 10)
    public float bgImageW;

    @NonNull
    @ProtobufIndex(index = 8)
    public String fontColor;

    @Nullable
    @ProtobufIndex(index = 3)
    public String fontFamily;

    @NonNull
    @ProtobufIndex(index = 4)
    public String icon;

    @ProtobufIndex(index = 5)
    public int linearGradient;

    @NonNull
    @ProtobufIndex(index = 12)
    public String name;

    @ProtobufIndex(index = 7)
    public float opacity;

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m68944a(String str) {
        return str;
    }

    public static BLiveCoverLabel new_() {
        BLiveCoverLabel bLiveCoverLabel = new BLiveCoverLabel();
        bLiveCoverLabel.nullCheck();
        return bLiveCoverLabel;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveCoverLabel mo225055clone() {
        BLiveCoverLabel bLiveCoverLabel = new BLiveCoverLabel();
        bLiveCoverLabel.type = this.type;
        bLiveCoverLabel.text = this.text;
        bLiveCoverLabel.fontFamily = this.fontFamily;
        bLiveCoverLabel.icon = this.icon;
        bLiveCoverLabel.linearGradient = this.linearGradient;
        List<String> list = this.background;
        if (list != null) {
            bLiveCoverLabel.background = ValueObject.util_map(list, new qcj() { // from class: l.ys1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveCoverLabel.m68944a((String) obj);
                }
            });
        }
        bLiveCoverLabel.opacity = this.opacity;
        bLiveCoverLabel.fontColor = this.fontColor;
        bLiveCoverLabel.bgImage = this.bgImage;
        bLiveCoverLabel.bgImageW = this.bgImageW;
        bLiveCoverLabel.bgImageH = this.bgImageH;
        bLiveCoverLabel.name = this.name;
        return bLiveCoverLabel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveCoverLabel)) {
            return false;
        }
        BLiveCoverLabel bLiveCoverLabel = (BLiveCoverLabel) obj;
        return ValueObject.util_equals(this.type, bLiveCoverLabel.type) && ValueObject.util_equals(this.text, bLiveCoverLabel.text) && ValueObject.util_equals(this.fontFamily, bLiveCoverLabel.fontFamily) && ValueObject.util_equals(this.icon, bLiveCoverLabel.icon) && this.linearGradient == bLiveCoverLabel.linearGradient && ValueObject.util_equals(this.background, bLiveCoverLabel.background) && this.opacity == bLiveCoverLabel.opacity && ValueObject.util_equals(this.fontColor, bLiveCoverLabel.fontColor) && ValueObject.util_equals(this.bgImage, bLiveCoverLabel.bgImage) && this.bgImageW == bLiveCoverLabel.bgImageW && this.bgImageH == bLiveCoverLabel.bgImageH && ValueObject.util_equals(this.name, bLiveCoverLabel.name);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.fontFamily;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.icon;
        int iHashCode4 = (((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.linearGradient) * 41;
        List<String> list = this.background;
        int iHashCode5 = (((iHashCode4 + (list != null ? list.hashCode() : 0)) * 41) + Float.floatToIntBits(this.opacity)) * 41;
        String str5 = this.fontColor;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.bgImage;
        int iHashCode7 = (((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41) + Float.floatToIntBits(this.bgImageW)) * 41) + Float.floatToIntBits(this.bgImageH)) * 41;
        String str7 = this.name;
        int iHashCode8 = iHashCode7 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.background == null) {
            this.background = new ArrayList();
        }
        if (this.fontColor == null) {
            this.fontColor = "";
        }
        if (this.bgImage == null) {
            this.bgImage = "";
        }
        if (this.name == null) {
            this.name = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
