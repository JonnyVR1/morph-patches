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
public class BLiveSubTabConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSubTabConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSubTabConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSubTabConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSubTabConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSubTabConfig newInstance() {
            return new BLiveSubTabConfig();
        }

        public boolean parseField(BLiveSubTabConfig bLiveSubTabConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "selectTextColor":
                    bLiveSubTabConfig.selectTextColor = jsonParser.getValueAsString();
                    return true;
                case "selectBgColor":
                    bLiveSubTabConfig.selectBgColor = jsonParser.getValueAsString();
                    return true;
                case "unSelectTextColor":
                    bLiveSubTabConfig.unSelectTextColor = jsonParser.getValueAsString();
                    return true;
                case "unSelectBgColor":
                    bLiveSubTabConfig.unSelectBgColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSubTabConfig bLiveSubTabConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSubTabConfig.selectTextColor;
            if (str != null) {
                jsonGenerator.writeStringField("selectTextColor", str);
            }
            String str2 = bLiveSubTabConfig.unSelectTextColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("unSelectTextColor", str2);
            }
            String str3 = bLiveSubTabConfig.selectBgColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("selectBgColor", str3);
            }
            String str4 = bLiveSubTabConfig.unSelectBgColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("unSelectBgColor", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSubTabConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesubtabconfig";

    @NonNull
    @ProtobufIndex(index = 3)
    public String selectBgColor;

    @NonNull
    @ProtobufIndex(index = 1)
    public String selectTextColor;

    @NonNull
    @ProtobufIndex(index = 4)
    public String unSelectBgColor;

    @NonNull
    @ProtobufIndex(index = 2)
    public String unSelectTextColor;

    public static BLiveSubTabConfig new_() {
        BLiveSubTabConfig bLiveSubTabConfig = new BLiveSubTabConfig();
        bLiveSubTabConfig.nullCheck();
        return bLiveSubTabConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSubTabConfig mo225055clone() {
        BLiveSubTabConfig bLiveSubTabConfig = new BLiveSubTabConfig();
        bLiveSubTabConfig.selectTextColor = this.selectTextColor;
        bLiveSubTabConfig.unSelectTextColor = this.unSelectTextColor;
        bLiveSubTabConfig.selectBgColor = this.selectBgColor;
        bLiveSubTabConfig.unSelectBgColor = this.unSelectBgColor;
        return bLiveSubTabConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSubTabConfig)) {
            return false;
        }
        BLiveSubTabConfig bLiveSubTabConfig = (BLiveSubTabConfig) obj;
        return ValueObject.util_equals(this.selectTextColor, bLiveSubTabConfig.selectTextColor) && ValueObject.util_equals(this.unSelectTextColor, bLiveSubTabConfig.unSelectTextColor) && ValueObject.util_equals(this.selectBgColor, bLiveSubTabConfig.selectBgColor) && ValueObject.util_equals(this.unSelectBgColor, bLiveSubTabConfig.unSelectBgColor);
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
        String str = this.selectTextColor;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.unSelectTextColor;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.selectBgColor;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.unSelectBgColor;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.selectTextColor == null) {
            this.selectTextColor = "";
        }
        if (this.unSelectTextColor == null) {
            this.unSelectTextColor = "";
        }
        if (this.selectBgColor == null) {
            this.selectBgColor = "";
        }
        if (this.unSelectBgColor == null) {
            this.unSelectBgColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
