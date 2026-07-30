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
public class BLiveWealthButton extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveWealthButton> JSON_ADAPTER = new ObjectJsonAdapter<BLiveWealthButton>() { // from class: com.p1.mobile.putong.live.base.data.BLiveWealthButton.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveWealthButton.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveWealthButton newInstance() {
            return new BLiveWealthButton();
        }

        public boolean parseField(BLiveWealthButton bLiveWealthButton, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startColor":
                    bLiveWealthButton.startColor = jsonParser.getValueAsString();
                    return true;
                case "textColor":
                    bLiveWealthButton.textColor = jsonParser.getValueAsString();
                    return true;
                case "schema":
                    bLiveWealthButton.schema = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    bLiveWealthButton.icon = jsonParser.getValueAsString();
                    return true;
                case "text":
                    bLiveWealthButton.text = jsonParser.getValueAsString();
                    return true;
                case "type":
                    bLiveWealthButton.type = jsonParser.getValueAsString();
                    return true;
                case "bgUrl":
                    bLiveWealthButton.bgUrl = jsonParser.getValueAsString();
                    return true;
                case "endColor":
                    bLiveWealthButton.endColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveWealthButton bLiveWealthButton, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveWealthButton.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = bLiveWealthButton.icon;
            if (str2 != null) {
                jsonGenerator.writeStringField("icon", str2);
            }
            String str3 = bLiveWealthButton.text;
            if (str3 != null) {
                jsonGenerator.writeStringField("text", str3);
            }
            String str4 = bLiveWealthButton.textColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("textColor", str4);
            }
            String str5 = bLiveWealthButton.schema;
            if (str5 != null) {
                jsonGenerator.writeStringField("schema", str5);
            }
            String str6 = bLiveWealthButton.startColor;
            if (str6 != null) {
                jsonGenerator.writeStringField("startColor", str6);
            }
            String str7 = bLiveWealthButton.endColor;
            if (str7 != null) {
                jsonGenerator.writeStringField("endColor", str7);
            }
            String str8 = bLiveWealthButton.bgUrl;
            if (str8 != null) {
                jsonGenerator.writeStringField("bgUrl", str8);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveWealthButton) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivewealthbutton";

    @NonNull
    @ProtobufIndex(index = 7)
    public String bgUrl;

    @NonNull
    @ProtobufIndex(index = 6)
    public String endColor;

    @NonNull
    @ProtobufIndex(index = 2)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 4)
    public String schema;

    @NonNull
    @ProtobufIndex(index = 5)
    public String startColor;

    @NonNull
    @ProtobufIndex(index = 3)
    public String text;

    @NonNull
    @ProtobufIndex(index = 8)
    public String textColor;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;

    public static BLiveWealthButton new_() {
        BLiveWealthButton bLiveWealthButton = new BLiveWealthButton();
        bLiveWealthButton.nullCheck();
        return bLiveWealthButton;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveWealthButton mo223809clone() {
        BLiveWealthButton bLiveWealthButton = new BLiveWealthButton();
        bLiveWealthButton.type = this.type;
        bLiveWealthButton.icon = this.icon;
        bLiveWealthButton.text = this.text;
        bLiveWealthButton.textColor = this.textColor;
        bLiveWealthButton.schema = this.schema;
        bLiveWealthButton.startColor = this.startColor;
        bLiveWealthButton.endColor = this.endColor;
        bLiveWealthButton.bgUrl = this.bgUrl;
        return bLiveWealthButton;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveWealthButton)) {
            return false;
        }
        BLiveWealthButton bLiveWealthButton = (BLiveWealthButton) obj;
        return ValueObject.util_equals(this.type, bLiveWealthButton.type) && ValueObject.util_equals(this.icon, bLiveWealthButton.icon) && ValueObject.util_equals(this.text, bLiveWealthButton.text) && ValueObject.util_equals(this.textColor, bLiveWealthButton.textColor) && ValueObject.util_equals(this.schema, bLiveWealthButton.schema) && ValueObject.util_equals(this.startColor, bLiveWealthButton.startColor) && ValueObject.util_equals(this.endColor, bLiveWealthButton.endColor) && ValueObject.util_equals(this.bgUrl, bLiveWealthButton.bgUrl);
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
        String str2 = this.icon;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.text;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.textColor;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.schema;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.startColor;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.endColor;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.bgUrl;
        int iHashCode8 = iHashCode7 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.textColor == null) {
            this.textColor = "";
        }
        if (this.schema == null) {
            this.schema = "";
        }
        if (this.startColor == null) {
            this.startColor = "";
        }
        if (this.endColor == null) {
            this.endColor = "";
        }
        if (this.bgUrl == null) {
            this.bgUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
