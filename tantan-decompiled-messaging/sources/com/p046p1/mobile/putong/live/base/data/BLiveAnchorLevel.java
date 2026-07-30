package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.core.data.Grade;
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
public class BLiveAnchorLevel extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAnchorLevel> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAnchorLevel>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAnchorLevel.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAnchorLevel.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAnchorLevel newInstance() {
            return new BLiveAnchorLevel();
        }

        public boolean parseField(BLiveAnchorLevel bLiveAnchorLevel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "backendUrl":
                    bLiveAnchorLevel.backendUrl = jsonParser.getValueAsString();
                    return true;
                case "shadingFrontUrl":
                    bLiveAnchorLevel.shadingFrontUrl = jsonParser.getValueAsString();
                    return true;
                case "gap":
                    bLiveAnchorLevel.gap = jsonParser.getValueAsLong();
                    return true;
                case "grade":
                    bLiveAnchorLevel.grade = jsonParser.getValueAsLong();
                    return true;
                case "wealthRatio":
                    bLiveAnchorLevel.wealthRatio = jsonParser.getValueAsDouble();
                    return true;
                case "iconUrl":
                    bLiveAnchorLevel.iconUrl = jsonParser.getValueAsString();
                    return true;
                case "shadingBackUrl":
                    bLiveAnchorLevel.shadingBackUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAnchorLevel bLiveAnchorLevel, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(Grade.TYPE, bLiveAnchorLevel.grade);
            jsonGenerator.writeNumberField("wealthRatio", bLiveAnchorLevel.wealthRatio);
            jsonGenerator.writeNumberField("gap", bLiveAnchorLevel.gap);
            String str = bLiveAnchorLevel.iconUrl;
            if (str != null) {
                jsonGenerator.writeStringField("iconUrl", str);
            }
            String str2 = bLiveAnchorLevel.backendUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("backendUrl", str2);
            }
            String str3 = bLiveAnchorLevel.shadingFrontUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("shadingFrontUrl", str3);
            }
            String str4 = bLiveAnchorLevel.shadingBackUrl;
            if (str4 != null) {
                jsonGenerator.writeStringField("shadingBackUrl", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAnchorLevel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveanchorlevel";

    @NonNull
    @ProtobufIndex(index = 5)
    public String backendUrl;

    @ProtobufIndex(index = 3)
    public long gap;

    @ProtobufIndex(index = 1)
    public long grade;

    @NonNull
    @ProtobufIndex(index = 4)
    public String iconUrl;

    @NonNull
    @ProtobufIndex(index = 7)
    public String shadingBackUrl;

    @NonNull
    @ProtobufIndex(index = 6)
    public String shadingFrontUrl;

    @ProtobufIndex(index = 2)
    public double wealthRatio;

    public static BLiveAnchorLevel new_() {
        BLiveAnchorLevel bLiveAnchorLevel = new BLiveAnchorLevel();
        bLiveAnchorLevel.nullCheck();
        return bLiveAnchorLevel;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAnchorLevel mo223809clone() {
        BLiveAnchorLevel bLiveAnchorLevel = new BLiveAnchorLevel();
        bLiveAnchorLevel.grade = this.grade;
        bLiveAnchorLevel.wealthRatio = this.wealthRatio;
        bLiveAnchorLevel.gap = this.gap;
        bLiveAnchorLevel.iconUrl = this.iconUrl;
        bLiveAnchorLevel.backendUrl = this.backendUrl;
        bLiveAnchorLevel.shadingFrontUrl = this.shadingFrontUrl;
        bLiveAnchorLevel.shadingBackUrl = this.shadingBackUrl;
        return bLiveAnchorLevel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAnchorLevel)) {
            return false;
        }
        BLiveAnchorLevel bLiveAnchorLevel = (BLiveAnchorLevel) obj;
        return this.grade == bLiveAnchorLevel.grade && this.wealthRatio == bLiveAnchorLevel.wealthRatio && this.gap == bLiveAnchorLevel.gap && ValueObject.util_equals(this.iconUrl, bLiveAnchorLevel.iconUrl) && ValueObject.util_equals(this.backendUrl, bLiveAnchorLevel.backendUrl) && ValueObject.util_equals(this.shadingFrontUrl, bLiveAnchorLevel.shadingFrontUrl) && ValueObject.util_equals(this.shadingBackUrl, bLiveAnchorLevel.shadingBackUrl);
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
        long j = this.grade;
        int i2 = (i * 41) + ((int) (j ^ (j >>> 32)));
        long jDoubleToLongBits = Double.doubleToLongBits(this.wealthRatio);
        int i3 = ((i2 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        long j2 = this.gap;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str = this.iconUrl;
        int iHashCode = (i4 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.backendUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.shadingFrontUrl;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.shadingBackUrl;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.iconUrl == null) {
            this.iconUrl = "";
        }
        if (this.backendUrl == null) {
            this.backendUrl = "";
        }
        if (this.shadingFrontUrl == null) {
            this.shadingFrontUrl = "";
        }
        if (this.shadingBackUrl == null) {
            this.shadingBackUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
