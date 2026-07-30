package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.OMSResourceType;
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
public class BLiveLabel extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveLabel> JSON_ADAPTER = new ObjectJsonAdapter<BLiveLabel>() { // from class: com.p1.mobile.putong.live.base.data.BLiveLabel.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveLabel.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveLabel newInstance() {
            return new BLiveLabel();
        }

        public boolean parseField(BLiveLabel bLiveLabel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "background":
                    bLiveLabel.background = BLiveBackground.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "textColor":
                    bLiveLabel.textColor = jsonParser.getValueAsString();
                    return true;
                case "textSize":
                    bLiveLabel.textSize = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    bLiveLabel.f44392id = jsonParser.getValueAsString();
                    return false;
                case "url":
                    bLiveLabel.url = jsonParser.getValueAsString();
                    return true;
                case "alpha":
                    bLiveLabel.alpha = jsonParser.getValueAsDouble();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveLabel bLiveLabel, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveLabel.f44392id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("textSize", bLiveLabel.textSize);
            String str2 = bLiveLabel.textColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("textColor", str2);
            }
            if (bLiveLabel.background != null) {
                jsonGenerator.writeFieldName(OMSResourceType.background);
                BLiveBackground.JSON_ADAPTER.serialize(bLiveLabel.background, jsonGenerator, true);
            }
            String str3 = bLiveLabel.url;
            if (str3 != null) {
                jsonGenerator.writeStringField("url", str3);
            }
            jsonGenerator.writeNumberField("alpha", bLiveLabel.alpha);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveLabel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivelabel";

    @ProtobufIndex(index = 6)
    public double alpha;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveBackground background;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44392id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String textColor;

    @ProtobufIndex(index = 2)
    public int textSize;

    @NonNull
    @ProtobufIndex(index = 5)
    public String url;

    public static BLiveLabel new_() {
        BLiveLabel bLiveLabel = new BLiveLabel();
        bLiveLabel.nullCheck();
        return bLiveLabel;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveLabel mo223809clone() {
        BLiveLabel bLiveLabel = new BLiveLabel();
        bLiveLabel.f44392id = this.f44392id;
        bLiveLabel.textSize = this.textSize;
        bLiveLabel.textColor = this.textColor;
        BLiveBackground bLiveBackground = this.background;
        if (bLiveBackground != null) {
            bLiveLabel.background = bLiveBackground.mo223809clone();
        }
        bLiveLabel.url = this.url;
        bLiveLabel.alpha = this.alpha;
        return bLiveLabel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveLabel)) {
            return false;
        }
        BLiveLabel bLiveLabel = (BLiveLabel) obj;
        return ValueObject.util_equals(this.f44392id, bLiveLabel.f44392id) && this.textSize == bLiveLabel.textSize && ValueObject.util_equals(this.textColor, bLiveLabel.textColor) && ValueObject.util_equals(this.background, bLiveLabel.background) && ValueObject.util_equals(this.url, bLiveLabel.url) && this.alpha == bLiveLabel.alpha;
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
        String str = this.f44392id;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.textSize) * 41;
        String str2 = this.textColor;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveBackground bLiveBackground = this.background;
        int iHashCode3 = (iHashCode2 + (bLiveBackground != null ? bLiveBackground.hashCode() : 0)) * 41;
        String str3 = this.url;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.alpha);
        int i3 = ((iHashCode3 + iHashCode4) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44392id == null) {
            this.f44392id = "";
        }
        if (this.textColor == null) {
            this.textColor = "";
        }
        if (this.background == null) {
            this.background = BLiveBackground.new_();
        }
        if (this.url == null) {
            this.url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
