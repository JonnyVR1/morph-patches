package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.core.data.Grade;
import com.p051p1.mobile.putong.data.LocationInvisibleField;
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
public class BLiveUserProfileConfigHierarchy extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUserProfileConfigHierarchy> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUserProfileConfigHierarchy>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUserProfileConfigHierarchy.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUserProfileConfigHierarchy.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUserProfileConfigHierarchy newInstance() {
            return new BLiveUserProfileConfigHierarchy();
        }

        public boolean parseField(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "titleColor":
                    bLiveUserProfileConfigHierarchy.titleColor = jsonParser.getValueAsString();
                    return true;
                case "superGrade":
                    bLiveUserProfileConfigHierarchy.superGrade = jsonParser.getValueAsLong();
                    return true;
                case "wealth":
                    bLiveUserProfileConfigHierarchy.wealth = jsonParser.getValueAsString();
                    return true;
                case "jumpScheme":
                    bLiveUserProfileConfigHierarchy.jumpScheme = jsonParser.getValueAsString();
                    return true;
                case "updatedTime":
                    bLiveUserProfileConfigHierarchy.updatedTime = jsonParser.getValueAsString();
                    return true;
                case "gap":
                    bLiveUserProfileConfigHierarchy.gap = jsonParser.getValueAsLong();
                    return true;
                case "type":
                    bLiveUserProfileConfigHierarchy.type = jsonParser.getValueAsString();
                    return true;
                case "grade":
                    bLiveUserProfileConfigHierarchy.grade = jsonParser.getValueAsLong();
                    return true;
                case "title":
                    bLiveUserProfileConfigHierarchy.title = jsonParser.getValueAsString();
                    return true;
                case "titleBackUrl":
                    bLiveUserProfileConfigHierarchy.titleBackUrl = jsonParser.getValueAsString();
                    return true;
                case "wealthRatio":
                    bLiveUserProfileConfigHierarchy.wealthRatio = jsonParser.getValueAsDouble();
                    return true;
                case "iconUrl":
                    bLiveUserProfileConfigHierarchy.iconUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(Grade.TYPE, bLiveUserProfileConfigHierarchy.grade);
            String str = bLiveUserProfileConfigHierarchy.wealth;
            if (str != null) {
                jsonGenerator.writeStringField("wealth", str);
            }
            jsonGenerator.writeNumberField("wealthRatio", bLiveUserProfileConfigHierarchy.wealthRatio);
            jsonGenerator.writeNumberField("gap", bLiveUserProfileConfigHierarchy.gap);
            String str2 = bLiveUserProfileConfigHierarchy.iconUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("iconUrl", str2);
            }
            String str3 = bLiveUserProfileConfigHierarchy.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
            jsonGenerator.writeNumberField("superGrade", bLiveUserProfileConfigHierarchy.superGrade);
            String str4 = bLiveUserProfileConfigHierarchy.updatedTime;
            if (str4 != null) {
                jsonGenerator.writeStringField(LocationInvisibleField.updatedTime, str4);
            }
            String str5 = bLiveUserProfileConfigHierarchy.jumpScheme;
            if (str5 != null) {
                jsonGenerator.writeStringField("jumpScheme", str5);
            }
            String str6 = bLiveUserProfileConfigHierarchy.title;
            if (str6 != null) {
                jsonGenerator.writeStringField("title", str6);
            }
            String str7 = bLiveUserProfileConfigHierarchy.titleBackUrl;
            if (str7 != null) {
                jsonGenerator.writeStringField("titleBackUrl", str7);
            }
            String str8 = bLiveUserProfileConfigHierarchy.titleColor;
            if (str8 != null) {
                jsonGenerator.writeStringField("titleColor", str8);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUserProfileConfigHierarchy) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveuserprofileconfighierarchy";

    @ProtobufIndex(index = 4)
    public long gap;

    @ProtobufIndex(index = 1)
    public long grade;

    @NonNull
    @ProtobufIndex(index = 5)
    public String iconUrl;

    @NonNull
    @ProtobufIndex(index = 9)
    public String jumpScheme;

    @ProtobufIndex(index = 7)
    public long superGrade;

    @NonNull
    @ProtobufIndex(index = 10)
    public String title;

    @NonNull
    @ProtobufIndex(index = 11)
    public String titleBackUrl;

    @NonNull
    @ProtobufIndex(index = 12)
    public String titleColor;

    @NonNull
    @ProtobufIndex(index = 6)
    public String type;

    @NonNull
    @ProtobufIndex(index = 8)
    public String updatedTime;

    @NonNull
    @ProtobufIndex(index = 2)
    public String wealth;

    @ProtobufIndex(index = 3)
    public double wealthRatio;

    public static BLiveUserProfileConfigHierarchy new_() {
        BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy = new BLiveUserProfileConfigHierarchy();
        bLiveUserProfileConfigHierarchy.nullCheck();
        return bLiveUserProfileConfigHierarchy;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUserProfileConfigHierarchy mo225055clone() {
        BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy = new BLiveUserProfileConfigHierarchy();
        bLiveUserProfileConfigHierarchy.grade = this.grade;
        bLiveUserProfileConfigHierarchy.wealth = this.wealth;
        bLiveUserProfileConfigHierarchy.wealthRatio = this.wealthRatio;
        bLiveUserProfileConfigHierarchy.gap = this.gap;
        bLiveUserProfileConfigHierarchy.iconUrl = this.iconUrl;
        bLiveUserProfileConfigHierarchy.type = this.type;
        bLiveUserProfileConfigHierarchy.superGrade = this.superGrade;
        bLiveUserProfileConfigHierarchy.updatedTime = this.updatedTime;
        bLiveUserProfileConfigHierarchy.jumpScheme = this.jumpScheme;
        bLiveUserProfileConfigHierarchy.title = this.title;
        bLiveUserProfileConfigHierarchy.titleBackUrl = this.titleBackUrl;
        bLiveUserProfileConfigHierarchy.titleColor = this.titleColor;
        return bLiveUserProfileConfigHierarchy;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUserProfileConfigHierarchy)) {
            return false;
        }
        BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy = (BLiveUserProfileConfigHierarchy) obj;
        return this.grade == bLiveUserProfileConfigHierarchy.grade && ValueObject.util_equals(this.wealth, bLiveUserProfileConfigHierarchy.wealth) && this.wealthRatio == bLiveUserProfileConfigHierarchy.wealthRatio && this.gap == bLiveUserProfileConfigHierarchy.gap && ValueObject.util_equals(this.iconUrl, bLiveUserProfileConfigHierarchy.iconUrl) && ValueObject.util_equals(this.type, bLiveUserProfileConfigHierarchy.type) && this.superGrade == bLiveUserProfileConfigHierarchy.superGrade && ValueObject.util_equals(this.updatedTime, bLiveUserProfileConfigHierarchy.updatedTime) && ValueObject.util_equals(this.jumpScheme, bLiveUserProfileConfigHierarchy.jumpScheme) && ValueObject.util_equals(this.title, bLiveUserProfileConfigHierarchy.title) && ValueObject.util_equals(this.titleBackUrl, bLiveUserProfileConfigHierarchy.titleBackUrl) && ValueObject.util_equals(this.titleColor, bLiveUserProfileConfigHierarchy.titleColor);
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
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str = this.wealth;
        int iHashCode = str != null ? str.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.wealthRatio);
        int i3 = (((i2 + iHashCode) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        long j2 = this.gap;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str2 = this.iconUrl;
        int iHashCode2 = (i4 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        long j3 = this.superGrade;
        int i5 = (((iHashCode2 + iHashCode3) * 41) + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        String str4 = this.updatedTime;
        int iHashCode4 = (i5 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.jumpScheme;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.title;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.titleBackUrl;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.titleColor;
        int iHashCode8 = iHashCode7 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.wealth == null) {
            this.wealth = "";
        }
        if (this.iconUrl == null) {
            this.iconUrl = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.updatedTime == null) {
            this.updatedTime = "";
        }
        if (this.jumpScheme == null) {
            this.jumpScheme = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.titleBackUrl == null) {
            this.titleBackUrl = "";
        }
        if (this.titleColor == null) {
            this.titleColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
