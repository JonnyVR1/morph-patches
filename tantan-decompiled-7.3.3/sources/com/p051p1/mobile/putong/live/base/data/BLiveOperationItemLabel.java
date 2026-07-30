package com.p051p1.mobile.putong.live.base.data;

import android.text.TextUtils;
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
public class BLiveOperationItemLabel extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveOperationItemLabel> JSON_ADAPTER = new ObjectJsonAdapter<BLiveOperationItemLabel>() { // from class: com.p1.mobile.putong.live.base.data.BLiveOperationItemLabel.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveOperationItemLabel.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveOperationItemLabel newInstance() {
            return new BLiveOperationItemLabel();
        }

        public boolean parseField(BLiveOperationItemLabel bLiveOperationItemLabel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "backTransparency":
                    bLiveOperationItemLabel.backTransparency = jsonParser.getValueAsInt();
                    return true;
                case "foreTransparency":
                    bLiveOperationItemLabel.foreTransparency = jsonParser.getValueAsInt();
                    return true;
                case "position":
                    bLiveOperationItemLabel.position = jsonParser.getValueAsString();
                    return true;
                case "content":
                    bLiveOperationItemLabel.content = jsonParser.getValueAsString();
                    return true;
                case "backColor":
                    bLiveOperationItemLabel.backColor = jsonParser.getValueAsString();
                    return true;
                case "foreColor":
                    bLiveOperationItemLabel.foreColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveOperationItemLabel bLiveOperationItemLabel, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveOperationItemLabel.content;
            if (str != null) {
                jsonGenerator.writeStringField("content", str);
            }
            String str2 = bLiveOperationItemLabel.foreColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("foreColor", str2);
            }
            jsonGenerator.writeNumberField("foreTransparency", bLiveOperationItemLabel.foreTransparency);
            String str3 = bLiveOperationItemLabel.backColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("backColor", str3);
            }
            jsonGenerator.writeNumberField("backTransparency", bLiveOperationItemLabel.backTransparency);
            String str4 = bLiveOperationItemLabel.position;
            if (str4 != null) {
                jsonGenerator.writeStringField("position", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveOperationItemLabel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    private static final String LOCATION_TOP_LEFT = "topLeft";
    private static final String LOCATION_TOP_RIGHT = "topRight";
    public static final String TYPE = "bliveoperationitemlabel";

    @NonNull
    @ProtobufIndex(index = 4)
    public String backColor;

    @ProtobufIndex(index = 5)
    public int backTransparency;

    @NonNull
    @ProtobufIndex(index = 1)
    public String content;

    @NonNull
    @ProtobufIndex(index = 2)
    public String foreColor;

    @ProtobufIndex(index = 3)
    public int foreTransparency;

    @NonNull
    @ProtobufIndex(index = 6)
    public String position;

    public static BLiveOperationItemLabel new_() {
        BLiveOperationItemLabel bLiveOperationItemLabel = new BLiveOperationItemLabel();
        bLiveOperationItemLabel.nullCheck();
        return bLiveOperationItemLabel;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveOperationItemLabel mo225055clone() {
        BLiveOperationItemLabel bLiveOperationItemLabel = new BLiveOperationItemLabel();
        bLiveOperationItemLabel.content = this.content;
        bLiveOperationItemLabel.foreColor = this.foreColor;
        bLiveOperationItemLabel.foreTransparency = this.foreTransparency;
        bLiveOperationItemLabel.backColor = this.backColor;
        bLiveOperationItemLabel.backTransparency = this.backTransparency;
        bLiveOperationItemLabel.position = this.position;
        return bLiveOperationItemLabel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveOperationItemLabel)) {
            return false;
        }
        BLiveOperationItemLabel bLiveOperationItemLabel = (BLiveOperationItemLabel) obj;
        return ValueObject.util_equals(this.content, bLiveOperationItemLabel.content) && ValueObject.util_equals(this.foreColor, bLiveOperationItemLabel.foreColor) && this.foreTransparency == bLiveOperationItemLabel.foreTransparency && ValueObject.util_equals(this.backColor, bLiveOperationItemLabel.backColor) && this.backTransparency == bLiveOperationItemLabel.backTransparency && ValueObject.util_equals(this.position, bLiveOperationItemLabel.position);
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
        String str = this.content;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.foreColor;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.foreTransparency) * 41;
        String str3 = this.backColor;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.backTransparency) * 41;
        String str4 = this.position;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    public boolean isTopLeft() {
        return TextUtils.equals(this.position, LOCATION_TOP_LEFT);
    }

    public boolean isTopRight() {
        return TextUtils.equals(this.position, "topRight");
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.content == null) {
            this.content = "";
        }
        if (this.foreColor == null) {
            this.foreColor = "";
        }
        if (this.backColor == null) {
            this.backColor = "";
        }
        if (this.position == null) {
            this.position = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
