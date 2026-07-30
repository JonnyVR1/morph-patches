package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.core.data.Grade;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveUserLevel extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUserLevel> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUserLevel>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUserLevel.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUserLevel.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUserLevel newInstance() {
            return new BLiveUserLevel();
        }

        public boolean parseField(BLiveUserLevel bLiveUserLevel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "backendUrl":
                    bLiveUserLevel.backendUrl = jsonParser.getValueAsString();
                    return true;
                case "textColor":
                    bLiveUserLevel.textColor = jsonParser.getValueAsString();
                    return true;
                case "shadingFrontUrl":
                    bLiveUserLevel.shadingFrontUrl = jsonParser.getValueAsString();
                    return true;
                case "turnEffect":
                    bLiveUserLevel.turnEffect = jsonParser.getValueAsString();
                    return true;
                case "openEffect":
                    bLiveUserLevel.openEffect = jsonParser.getValueAsString();
                    return true;
                case "gap":
                    bLiveUserLevel.gap = jsonParser.getValueAsLong();
                    return true;
                case "grade":
                    bLiveUserLevel.grade = jsonParser.getValueAsLong();
                    return true;
                case "gradeColor":
                    bLiveUserLevel.gradeColor = jsonParser.getValueAsString();
                    return true;
                case "progressColor":
                    bLiveUserLevel.progressColor = jsonParser.getValueAsString();
                    return true;
                case "wealthRatio":
                    bLiveUserLevel.wealthRatio = jsonParser.getValueAsDouble();
                    return true;
                case "iconUrl":
                    bLiveUserLevel.iconUrl = jsonParser.getValueAsString();
                    return true;
                case "shadingBackUrl":
                    bLiveUserLevel.shadingBackUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUserLevel bLiveUserLevel, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(Grade.TYPE, bLiveUserLevel.grade);
            jsonGenerator.writeNumberField("wealthRatio", bLiveUserLevel.wealthRatio);
            jsonGenerator.writeNumberField("gap", bLiveUserLevel.gap);
            String str = bLiveUserLevel.iconUrl;
            if (str != null) {
                jsonGenerator.writeStringField("iconUrl", str);
            }
            String str2 = bLiveUserLevel.backendUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("backendUrl", str2);
            }
            String str3 = bLiveUserLevel.shadingFrontUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("shadingFrontUrl", str3);
            }
            String str4 = bLiveUserLevel.shadingBackUrl;
            if (str4 != null) {
                jsonGenerator.writeStringField("shadingBackUrl", str4);
            }
            String str5 = bLiveUserLevel.progressColor;
            if (str5 != null) {
                jsonGenerator.writeStringField(WBConstants.TRANS_PROGRESS_COLOR, str5);
            }
            String str6 = bLiveUserLevel.gradeColor;
            if (str6 != null) {
                jsonGenerator.writeStringField("gradeColor", str6);
            }
            String str7 = bLiveUserLevel.textColor;
            if (str7 != null) {
                jsonGenerator.writeStringField("textColor", str7);
            }
            String str8 = bLiveUserLevel.openEffect;
            if (str8 != null) {
                jsonGenerator.writeStringField("openEffect", str8);
            }
            String str9 = bLiveUserLevel.turnEffect;
            if (str9 != null) {
                jsonGenerator.writeStringField("turnEffect", str9);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUserLevel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveuserlevel";

    @NonNull
    @ProtobufIndex(index = 5)
    public String backendUrl;

    @ProtobufIndex(index = 3)
    public long gap;

    @ProtobufIndex(index = 1)
    public long grade;

    @NonNull
    @ProtobufIndex(index = 9)
    public String gradeColor;

    @NonNull
    @ProtobufIndex(index = 4)
    public String iconUrl;

    @NonNull
    @ProtobufIndex(index = 11)
    public String openEffect;

    @NonNull
    @ProtobufIndex(index = 8)
    public String progressColor;

    @NonNull
    @ProtobufIndex(index = 7)
    public String shadingBackUrl;

    @NonNull
    @ProtobufIndex(index = 6)
    public String shadingFrontUrl;

    @NonNull
    @ProtobufIndex(index = 10)
    public String textColor;

    @NonNull
    @ProtobufIndex(index = 12)
    public String turnEffect;

    @ProtobufIndex(index = 2)
    public double wealthRatio;

    public static BLiveUserLevel new_() {
        BLiveUserLevel bLiveUserLevel = new BLiveUserLevel();
        bLiveUserLevel.nullCheck();
        return bLiveUserLevel;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUserLevel mo225055clone() {
        BLiveUserLevel bLiveUserLevel = new BLiveUserLevel();
        bLiveUserLevel.grade = this.grade;
        bLiveUserLevel.wealthRatio = this.wealthRatio;
        bLiveUserLevel.gap = this.gap;
        bLiveUserLevel.iconUrl = this.iconUrl;
        bLiveUserLevel.backendUrl = this.backendUrl;
        bLiveUserLevel.shadingFrontUrl = this.shadingFrontUrl;
        bLiveUserLevel.shadingBackUrl = this.shadingBackUrl;
        bLiveUserLevel.progressColor = this.progressColor;
        bLiveUserLevel.gradeColor = this.gradeColor;
        bLiveUserLevel.textColor = this.textColor;
        bLiveUserLevel.openEffect = this.openEffect;
        bLiveUserLevel.turnEffect = this.turnEffect;
        return bLiveUserLevel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUserLevel)) {
            return false;
        }
        BLiveUserLevel bLiveUserLevel = (BLiveUserLevel) obj;
        return this.grade == bLiveUserLevel.grade && this.wealthRatio == bLiveUserLevel.wealthRatio && this.gap == bLiveUserLevel.gap && ValueObject.util_equals(this.iconUrl, bLiveUserLevel.iconUrl) && ValueObject.util_equals(this.backendUrl, bLiveUserLevel.backendUrl) && ValueObject.util_equals(this.shadingFrontUrl, bLiveUserLevel.shadingFrontUrl) && ValueObject.util_equals(this.shadingBackUrl, bLiveUserLevel.shadingBackUrl) && ValueObject.util_equals(this.progressColor, bLiveUserLevel.progressColor) && ValueObject.util_equals(this.gradeColor, bLiveUserLevel.gradeColor) && ValueObject.util_equals(this.textColor, bLiveUserLevel.textColor) && ValueObject.util_equals(this.openEffect, bLiveUserLevel.openEffect) && ValueObject.util_equals(this.turnEffect, bLiveUserLevel.turnEffect);
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
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.progressColor;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.gradeColor;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.textColor;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.openEffect;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.turnEffect;
        int iHashCode9 = iHashCode8 + (str9 != null ? str9.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
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
        if (this.progressColor == null) {
            this.progressColor = "";
        }
        if (this.gradeColor == null) {
            this.gradeColor = "";
        }
        if (this.textColor == null) {
            this.textColor = "";
        }
        if (this.openEffect == null) {
            this.openEffect = "";
        }
        if (this.turnEffect == null) {
            this.turnEffect = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
