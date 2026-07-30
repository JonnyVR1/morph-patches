package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.core.data.Grade;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveHierarchyProgress;
import com.p046p1.mobile.putong.live.base.data.BLiveWealthButton;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveHierarchyProgress extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveHierarchyProgress> JSON_ADAPTER = new ObjectJsonAdapter<BLiveHierarchyProgress>() { // from class: com.p1.mobile.putong.live.base.data.BLiveHierarchyProgress.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveHierarchyProgress.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveHierarchyProgress newInstance() {
            return new BLiveHierarchyProgress();
        }

        public boolean parseField(BLiveHierarchyProgress bLiveHierarchyProgress, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "superGrade":
                    bLiveHierarchyProgress.superGrade = jsonParser.getValueAsLong();
                    return true;
                case "wealth":
                    bLiveHierarchyProgress.wealth = jsonParser.getValueAsLong();
                    return true;
                case "jumpSchema":
                    bLiveHierarchyProgress.jumpSchema = jsonParser.getValueAsString();
                    return true;
                case "jumpText":
                    bLiveHierarchyProgress.jumpText = jsonParser.getValueAsString();
                    return true;
                case "grade":
                    bLiveHierarchyProgress.grade = jsonParser.getValueAsLong();
                    return true;
                case "style":
                    bLiveHierarchyProgress.style = BLiveHierarchyProgressStyle.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "zeroGradeBackendUrl":
                    bLiveHierarchyProgress.zeroGradeBackendUrl = jsonParser.getValueAsString();
                    return true;
                case "buttons":
                    bLiveHierarchyProgress.buttons = JsonAdapter.parseArray(jsonParser, BLiveWealthButton.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "progressText":
                    bLiveHierarchyProgress.progressText = jsonParser.getValueAsString();
                    return true;
                case "progressTexts":
                    bLiveHierarchyProgress.progressTexts = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "wealthRatio":
                    bLiveHierarchyProgress.wealthRatio = jsonParser.getValueAsDouble();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveHierarchyProgress bLiveHierarchyProgress, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(Grade.TYPE, bLiveHierarchyProgress.grade);
            jsonGenerator.writeNumberField("superGrade", bLiveHierarchyProgress.superGrade);
            jsonGenerator.writeNumberField("wealth", bLiveHierarchyProgress.wealth);
            jsonGenerator.writeNumberField("wealthRatio", bLiveHierarchyProgress.wealthRatio);
            String str = bLiveHierarchyProgress.progressText;
            if (str != null) {
                jsonGenerator.writeStringField("progressText", str);
            }
            String str2 = bLiveHierarchyProgress.jumpText;
            if (str2 != null) {
                jsonGenerator.writeStringField("jumpText", str2);
            }
            String str3 = bLiveHierarchyProgress.jumpSchema;
            if (str3 != null) {
                jsonGenerator.writeStringField("jumpSchema", str3);
            }
            String str4 = bLiveHierarchyProgress.zeroGradeBackendUrl;
            if (str4 != null) {
                jsonGenerator.writeStringField("zeroGradeBackendUrl", str4);
            }
            if (bLiveHierarchyProgress.buttons != null) {
                jsonGenerator.writeFieldName(Constants.KEY_BUTTONS);
                JsonAdapter.serializeArray(bLiveHierarchyProgress.buttons, jsonGenerator, BLiveWealthButton.JSON_ADAPTER);
            }
            if (bLiveHierarchyProgress.style != null) {
                jsonGenerator.writeFieldName("style");
                BLiveHierarchyProgressStyle.JSON_ADAPTER.serialize(bLiveHierarchyProgress.style, jsonGenerator, true);
            }
            if (bLiveHierarchyProgress.progressTexts != null) {
                jsonGenerator.writeFieldName("progressTexts");
                JsonAdapter.serializeArray(bLiveHierarchyProgress.progressTexts, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveHierarchyProgress) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivehierarchyprogress";

    @NonNull
    @ProtobufIndex(index = 9)
    public List<BLiveWealthButton> buttons;

    @ProtobufIndex(index = 1)
    public long grade;

    @NonNull
    @ProtobufIndex(index = 7)
    public String jumpSchema;

    @NonNull
    @ProtobufIndex(index = 6)
    public String jumpText;

    @NonNull
    @ProtobufIndex(index = 5)
    public String progressText;

    @NonNull
    @ProtobufIndex(index = 11)
    public List<String> progressTexts;

    @NonNull
    @ProtobufIndex(index = 10)
    public BLiveHierarchyProgressStyle style;

    @ProtobufIndex(index = 2)
    public long superGrade;

    @ProtobufIndex(index = 3)
    public long wealth;

    @ProtobufIndex(index = 4)
    public double wealthRatio;

    @NonNull
    @ProtobufIndex(index = 8)
    public String zeroGradeBackendUrl;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m68010a(String str) {
        return str;
    }

    public static BLiveHierarchyProgress new_() {
        BLiveHierarchyProgress bLiveHierarchyProgress = new BLiveHierarchyProgress();
        bLiveHierarchyProgress.nullCheck();
        return bLiveHierarchyProgress;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveHierarchyProgress mo223809clone() {
        BLiveHierarchyProgress bLiveHierarchyProgress = new BLiveHierarchyProgress();
        bLiveHierarchyProgress.grade = this.grade;
        bLiveHierarchyProgress.superGrade = this.superGrade;
        bLiveHierarchyProgress.wealth = this.wealth;
        bLiveHierarchyProgress.wealthRatio = this.wealthRatio;
        bLiveHierarchyProgress.progressText = this.progressText;
        bLiveHierarchyProgress.jumpText = this.jumpText;
        bLiveHierarchyProgress.jumpSchema = this.jumpSchema;
        bLiveHierarchyProgress.zeroGradeBackendUrl = this.zeroGradeBackendUrl;
        List<BLiveWealthButton> list = this.buttons;
        if (list != null) {
            bLiveHierarchyProgress.buttons = ValueObject.util_map(list, new w9j() { // from class: l.f12
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveWealthButton) obj).mo223809clone();
                }
            });
        }
        BLiveHierarchyProgressStyle bLiveHierarchyProgressStyle = this.style;
        if (bLiveHierarchyProgressStyle != null) {
            bLiveHierarchyProgress.style = bLiveHierarchyProgressStyle.mo223809clone();
        }
        List<String> list2 = this.progressTexts;
        if (list2 != null) {
            bLiveHierarchyProgress.progressTexts = ValueObject.util_map(list2, new w9j() { // from class: l.g12
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveHierarchyProgress.m68010a((String) obj);
                }
            });
        }
        return bLiveHierarchyProgress;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveHierarchyProgress)) {
            return false;
        }
        BLiveHierarchyProgress bLiveHierarchyProgress = (BLiveHierarchyProgress) obj;
        return this.grade == bLiveHierarchyProgress.grade && this.superGrade == bLiveHierarchyProgress.superGrade && this.wealth == bLiveHierarchyProgress.wealth && this.wealthRatio == bLiveHierarchyProgress.wealthRatio && ValueObject.util_equals(this.progressText, bLiveHierarchyProgress.progressText) && ValueObject.util_equals(this.jumpText, bLiveHierarchyProgress.jumpText) && ValueObject.util_equals(this.jumpSchema, bLiveHierarchyProgress.jumpSchema) && ValueObject.util_equals(this.zeroGradeBackendUrl, bLiveHierarchyProgress.zeroGradeBackendUrl) && ValueObject.util_equals(this.buttons, bLiveHierarchyProgress.buttons) && ValueObject.util_equals(this.style, bLiveHierarchyProgress.style) && ValueObject.util_equals(this.progressTexts, bLiveHierarchyProgress.progressTexts);
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
        long j2 = this.superGrade;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.wealth;
        int i4 = i3 + ((int) (j3 ^ (j3 >>> 32)));
        long jDoubleToLongBits = Double.doubleToLongBits(this.wealthRatio);
        int i5 = ((i4 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str = this.progressText;
        int iHashCode = (i5 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.jumpText;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.jumpSchema;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.zeroGradeBackendUrl;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        List<BLiveWealthButton> list = this.buttons;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 41;
        BLiveHierarchyProgressStyle bLiveHierarchyProgressStyle = this.style;
        int iHashCode6 = (iHashCode5 + (bLiveHierarchyProgressStyle != null ? bLiveHierarchyProgressStyle.hashCode() : 0)) * 41;
        List<String> list2 = this.progressTexts;
        int iHashCode7 = iHashCode6 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.progressText == null) {
            this.progressText = "";
        }
        if (this.jumpText == null) {
            this.jumpText = "";
        }
        if (this.jumpSchema == null) {
            this.jumpSchema = "";
        }
        if (this.zeroGradeBackendUrl == null) {
            this.zeroGradeBackendUrl = "";
        }
        if (this.buttons == null) {
            this.buttons = new ArrayList();
        }
        if (this.style == null) {
            this.style = BLiveHierarchyProgressStyle.new_();
        }
        if (this.progressTexts == null) {
            this.progressTexts = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
