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
public class BLiveBoardHierarchy extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveBoardHierarchy> JSON_ADAPTER = new ObjectJsonAdapter<BLiveBoardHierarchy>() { // from class: com.p1.mobile.putong.live.base.data.BLiveBoardHierarchy.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveBoardHierarchy.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveBoardHierarchy newInstance() {
            return new BLiveBoardHierarchy();
        }

        public boolean parseField(BLiveBoardHierarchy bLiveBoardHierarchy, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    bLiveBoardHierarchy.userId = jsonParser.getValueAsString();
                    return true;
                case "wealth":
                    bLiveBoardHierarchy.wealth = jsonParser.getValueAsLong();
                    return true;
                case "updatedTime":
                    bLiveBoardHierarchy.updatedTime = jsonParser.getValueAsString();
                    return true;
                case "gap":
                    bLiveBoardHierarchy.gap = jsonParser.getValueAsLong();
                    return true;
                case "grade":
                    bLiveBoardHierarchy.grade = jsonParser.getValueAsInt();
                    return true;
                case "wealthRatio":
                    bLiveBoardHierarchy.wealthRatio = (float) jsonParser.getValueAsDouble();
                    return true;
                case "iconUrl":
                    bLiveBoardHierarchy.iconUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveBoardHierarchy bLiveBoardHierarchy, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveBoardHierarchy.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField(Grade.TYPE, bLiveBoardHierarchy.grade);
            jsonGenerator.writeNumberField("wealth", bLiveBoardHierarchy.wealth);
            jsonGenerator.writeNumberField("gap", bLiveBoardHierarchy.gap);
            String str2 = bLiveBoardHierarchy.updatedTime;
            if (str2 != null) {
                jsonGenerator.writeStringField(LocationInvisibleField.updatedTime, str2);
            }
            String str3 = bLiveBoardHierarchy.iconUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("iconUrl", str3);
            }
            jsonGenerator.writeNumberField("wealthRatio", bLiveBoardHierarchy.wealthRatio);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveBoardHierarchy) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveboardhierarchy";

    @ProtobufIndex(index = 4)
    public long gap;

    @ProtobufIndex(index = 2)
    public int grade;

    @NonNull
    @ProtobufIndex(index = 6)
    public String iconUrl;

    @NonNull
    @ProtobufIndex(index = 5)
    public String updatedTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @ProtobufIndex(index = 3)
    public long wealth;

    @ProtobufIndex(index = 7)
    public float wealthRatio;

    public static BLiveBoardHierarchy new_() {
        BLiveBoardHierarchy bLiveBoardHierarchy = new BLiveBoardHierarchy();
        bLiveBoardHierarchy.nullCheck();
        return bLiveBoardHierarchy;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveBoardHierarchy mo225055clone() {
        BLiveBoardHierarchy bLiveBoardHierarchy = new BLiveBoardHierarchy();
        bLiveBoardHierarchy.userId = this.userId;
        bLiveBoardHierarchy.grade = this.grade;
        bLiveBoardHierarchy.wealth = this.wealth;
        bLiveBoardHierarchy.gap = this.gap;
        bLiveBoardHierarchy.updatedTime = this.updatedTime;
        bLiveBoardHierarchy.iconUrl = this.iconUrl;
        bLiveBoardHierarchy.wealthRatio = this.wealthRatio;
        return bLiveBoardHierarchy;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveBoardHierarchy)) {
            return false;
        }
        BLiveBoardHierarchy bLiveBoardHierarchy = (BLiveBoardHierarchy) obj;
        return ValueObject.util_equals(this.userId, bLiveBoardHierarchy.userId) && this.grade == bLiveBoardHierarchy.grade && this.wealth == bLiveBoardHierarchy.wealth && this.gap == bLiveBoardHierarchy.gap && ValueObject.util_equals(this.updatedTime, bLiveBoardHierarchy.updatedTime) && ValueObject.util_equals(this.iconUrl, bLiveBoardHierarchy.iconUrl) && this.wealthRatio == bLiveBoardHierarchy.wealthRatio;
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
        String str = this.userId;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.grade) * 41;
        long j = this.wealth;
        int i3 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.gap;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str2 = this.updatedTime;
        int iHashCode2 = (i4 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.iconUrl;
        int iHashCode3 = ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + Float.floatToIntBits(this.wealthRatio);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.updatedTime == null) {
            this.updatedTime = "";
        }
        if (this.iconUrl == null) {
            this.iconUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
