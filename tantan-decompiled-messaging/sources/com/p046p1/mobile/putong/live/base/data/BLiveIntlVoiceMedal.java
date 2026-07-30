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
public class BLiveIntlVoiceMedal extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveIntlVoiceMedal> JSON_ADAPTER = new ObjectJsonAdapter<BLiveIntlVoiceMedal>() { // from class: com.p1.mobile.putong.live.base.data.BLiveIntlVoiceMedal.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveIntlVoiceMedal.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveIntlVoiceMedal newInstance() {
            return new BLiveIntlVoiceMedal();
        }

        public boolean parseField(BLiveIntlVoiceMedal bLiveIntlVoiceMedal, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startColor":
                    bLiveIntlVoiceMedal.startColor = jsonParser.getValueAsString();
                    return true;
                case "familyGrade":
                    bLiveIntlVoiceMedal.familyGrade = jsonParser.getValueAsInt();
                    return true;
                case "icon":
                    bLiveIntlVoiceMedal.icon = jsonParser.getValueAsString();
                    return true;
                case "grade":
                    bLiveIntlVoiceMedal.grade = jsonParser.getValueAsInt();
                    return true;
                case "borderColor":
                    bLiveIntlVoiceMedal.borderColor = jsonParser.getValueAsString();
                    return true;
                case "borderEndColor":
                    bLiveIntlVoiceMedal.borderEndColor = jsonParser.getValueAsString();
                    return true;
                case "endColor":
                    bLiveIntlVoiceMedal.endColor = jsonParser.getValueAsString();
                    return true;
                case "borderStartColor":
                    bLiveIntlVoiceMedal.borderStartColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveIntlVoiceMedal bLiveIntlVoiceMedal, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("familyGrade", bLiveIntlVoiceMedal.familyGrade);
            jsonGenerator.writeNumberField(Grade.TYPE, bLiveIntlVoiceMedal.grade);
            String str = bLiveIntlVoiceMedal.icon;
            if (str != null) {
                jsonGenerator.writeStringField("icon", str);
            }
            String str2 = bLiveIntlVoiceMedal.startColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("startColor", str2);
            }
            String str3 = bLiveIntlVoiceMedal.endColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("endColor", str3);
            }
            String str4 = bLiveIntlVoiceMedal.borderColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("borderColor", str4);
            }
            String str5 = bLiveIntlVoiceMedal.borderStartColor;
            if (str5 != null) {
                jsonGenerator.writeStringField("borderStartColor", str5);
            }
            String str6 = bLiveIntlVoiceMedal.borderEndColor;
            if (str6 != null) {
                jsonGenerator.writeStringField("borderEndColor", str6);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveIntlVoiceMedal) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveintlvoicemedal";

    @NonNull
    @ProtobufIndex(index = 5)
    public String borderColor;

    @NonNull
    @ProtobufIndex(index = 8)
    public String borderEndColor;

    @NonNull
    @ProtobufIndex(index = 7)
    public String borderStartColor;

    @NonNull
    @ProtobufIndex(index = 4)
    public String endColor;

    @ProtobufIndex(index = 1)
    public int familyGrade;

    @ProtobufIndex(index = 6)
    public int grade;

    @NonNull
    @ProtobufIndex(index = 2)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 3)
    public String startColor;

    public static BLiveIntlVoiceMedal new_() {
        BLiveIntlVoiceMedal bLiveIntlVoiceMedal = new BLiveIntlVoiceMedal();
        bLiveIntlVoiceMedal.nullCheck();
        return bLiveIntlVoiceMedal;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveIntlVoiceMedal mo223809clone() {
        BLiveIntlVoiceMedal bLiveIntlVoiceMedal = new BLiveIntlVoiceMedal();
        bLiveIntlVoiceMedal.familyGrade = this.familyGrade;
        bLiveIntlVoiceMedal.grade = this.grade;
        bLiveIntlVoiceMedal.icon = this.icon;
        bLiveIntlVoiceMedal.startColor = this.startColor;
        bLiveIntlVoiceMedal.endColor = this.endColor;
        bLiveIntlVoiceMedal.borderColor = this.borderColor;
        bLiveIntlVoiceMedal.borderStartColor = this.borderStartColor;
        bLiveIntlVoiceMedal.borderEndColor = this.borderEndColor;
        return bLiveIntlVoiceMedal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveIntlVoiceMedal)) {
            return false;
        }
        BLiveIntlVoiceMedal bLiveIntlVoiceMedal = (BLiveIntlVoiceMedal) obj;
        return this.familyGrade == bLiveIntlVoiceMedal.familyGrade && this.grade == bLiveIntlVoiceMedal.grade && ValueObject.util_equals(this.icon, bLiveIntlVoiceMedal.icon) && ValueObject.util_equals(this.startColor, bLiveIntlVoiceMedal.startColor) && ValueObject.util_equals(this.endColor, bLiveIntlVoiceMedal.endColor) && ValueObject.util_equals(this.borderColor, bLiveIntlVoiceMedal.borderColor) && ValueObject.util_equals(this.borderStartColor, bLiveIntlVoiceMedal.borderStartColor) && ValueObject.util_equals(this.borderEndColor, bLiveIntlVoiceMedal.borderEndColor);
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
        int i2 = ((((i * 41) + this.familyGrade) * 41) + this.grade) * 41;
        String str = this.icon;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.startColor;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.endColor;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.borderColor;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.borderStartColor;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.borderEndColor;
        int iHashCode6 = iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.startColor == null) {
            this.startColor = "";
        }
        if (this.endColor == null) {
            this.endColor = "";
        }
        if (this.borderColor == null) {
            this.borderColor = "";
        }
        if (this.borderStartColor == null) {
            this.borderStartColor = "";
        }
        if (this.borderEndColor == null) {
            this.borderEndColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
