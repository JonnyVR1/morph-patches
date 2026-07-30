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
public class BLiveHierarchyProgressStyle extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveHierarchyProgressStyle> JSON_ADAPTER = new ObjectJsonAdapter<BLiveHierarchyProgressStyle>() { // from class: com.p1.mobile.putong.live.base.data.BLiveHierarchyProgressStyle.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveHierarchyProgressStyle.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveHierarchyProgressStyle newInstance() {
            return new BLiveHierarchyProgressStyle();
        }

        public boolean parseField(BLiveHierarchyProgressStyle bLiveHierarchyProgressStyle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bgEndColor":
                    bLiveHierarchyProgressStyle.bgEndColor = jsonParser.getValueAsString();
                    return true;
                case "startColor":
                    bLiveHierarchyProgressStyle.startColor = jsonParser.getValueAsString();
                    return true;
                case "textColor":
                    bLiveHierarchyProgressStyle.textColor = jsonParser.getValueAsString();
                    return true;
                case "bgStartColor":
                    bLiveHierarchyProgressStyle.bgStartColor = jsonParser.getValueAsString();
                    return true;
                case "endColor":
                    bLiveHierarchyProgressStyle.endColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveHierarchyProgressStyle bLiveHierarchyProgressStyle, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveHierarchyProgressStyle.startColor;
            if (str != null) {
                jsonGenerator.writeStringField("startColor", str);
            }
            String str2 = bLiveHierarchyProgressStyle.endColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("endColor", str2);
            }
            String str3 = bLiveHierarchyProgressStyle.bgStartColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("bgStartColor", str3);
            }
            String str4 = bLiveHierarchyProgressStyle.bgEndColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("bgEndColor", str4);
            }
            String str5 = bLiveHierarchyProgressStyle.textColor;
            if (str5 != null) {
                jsonGenerator.writeStringField("textColor", str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveHierarchyProgressStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivehierarchyprogressstyle";

    @NonNull
    @ProtobufIndex(index = 4)
    public String bgEndColor;

    @NonNull
    @ProtobufIndex(index = 3)
    public String bgStartColor;

    @NonNull
    @ProtobufIndex(index = 2)
    public String endColor;

    @NonNull
    @ProtobufIndex(index = 1)
    public String startColor;

    @NonNull
    @ProtobufIndex(index = 5)
    public String textColor;

    public static BLiveHierarchyProgressStyle new_() {
        BLiveHierarchyProgressStyle bLiveHierarchyProgressStyle = new BLiveHierarchyProgressStyle();
        bLiveHierarchyProgressStyle.nullCheck();
        return bLiveHierarchyProgressStyle;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveHierarchyProgressStyle mo225055clone() {
        BLiveHierarchyProgressStyle bLiveHierarchyProgressStyle = new BLiveHierarchyProgressStyle();
        bLiveHierarchyProgressStyle.startColor = this.startColor;
        bLiveHierarchyProgressStyle.endColor = this.endColor;
        bLiveHierarchyProgressStyle.bgStartColor = this.bgStartColor;
        bLiveHierarchyProgressStyle.bgEndColor = this.bgEndColor;
        bLiveHierarchyProgressStyle.textColor = this.textColor;
        return bLiveHierarchyProgressStyle;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveHierarchyProgressStyle)) {
            return false;
        }
        BLiveHierarchyProgressStyle bLiveHierarchyProgressStyle = (BLiveHierarchyProgressStyle) obj;
        return ValueObject.util_equals(this.startColor, bLiveHierarchyProgressStyle.startColor) && ValueObject.util_equals(this.endColor, bLiveHierarchyProgressStyle.endColor) && ValueObject.util_equals(this.bgStartColor, bLiveHierarchyProgressStyle.bgStartColor) && ValueObject.util_equals(this.bgEndColor, bLiveHierarchyProgressStyle.bgEndColor) && ValueObject.util_equals(this.textColor, bLiveHierarchyProgressStyle.textColor);
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
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.bgStartColor;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.bgEndColor;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.textColor;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.startColor == null) {
            this.startColor = "";
        }
        if (this.endColor == null) {
            this.endColor = "";
        }
        if (this.bgStartColor == null) {
            this.bgStartColor = "";
        }
        if (this.bgEndColor == null) {
            this.bgEndColor = "";
        }
        if (this.textColor == null) {
            this.textColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
