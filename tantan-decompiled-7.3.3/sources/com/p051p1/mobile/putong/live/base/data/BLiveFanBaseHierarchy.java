package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.core.data.Grade;
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
public class BLiveFanBaseHierarchy extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFanBaseHierarchy> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFanBaseHierarchy>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFanBaseHierarchy.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFanBaseHierarchy.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFanBaseHierarchy newInstance() {
            return new BLiveFanBaseHierarchy();
        }

        public boolean parseField(BLiveFanBaseHierarchy bLiveFanBaseHierarchy, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    bLiveFanBaseHierarchy.userId = jsonParser.getValueAsString();
                    return true;
                case "fanbaseId":
                    bLiveFanBaseHierarchy.fanbaseId = jsonParser.getValueAsString();
                    return true;
                case "max":
                    bLiveFanBaseHierarchy.max = jsonParser.getValueAsLong();
                    return true;
                case "min":
                    bLiveFanBaseHierarchy.min = jsonParser.getValueAsLong();
                    return true;
                case "grade":
                    bLiveFanBaseHierarchy.grade = jsonParser.getValueAsLong();
                    return true;
                case "maxGrade":
                    bLiveFanBaseHierarchy.maxGrade = jsonParser.getValueAsLong();
                    return true;
                case "current":
                    bLiveFanBaseHierarchy.current = jsonParser.getValueAsLong();
                    return true;
                case "iconUrl":
                    bLiveFanBaseHierarchy.iconUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFanBaseHierarchy bLiveFanBaseHierarchy, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveFanBaseHierarchy.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveFanBaseHierarchy.fanbaseId;
            if (str2 != null) {
                jsonGenerator.writeStringField("fanbaseId", str2);
            }
            jsonGenerator.writeNumberField(Grade.TYPE, bLiveFanBaseHierarchy.grade);
            jsonGenerator.writeNumberField("current", bLiveFanBaseHierarchy.current);
            jsonGenerator.writeNumberField("min", bLiveFanBaseHierarchy.min);
            jsonGenerator.writeNumberField(Constants.PRIORITY_MAX, bLiveFanBaseHierarchy.max);
            jsonGenerator.writeNumberField("maxGrade", bLiveFanBaseHierarchy.maxGrade);
            String str3 = bLiveFanBaseHierarchy.iconUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("iconUrl", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFanBaseHierarchy) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefanbasehierarchy";

    @ProtobufIndex(index = 4)
    public long current;

    @NonNull
    @ProtobufIndex(index = 2)
    public String fanbaseId;

    @ProtobufIndex(index = 3)
    public long grade;

    @NonNull
    @ProtobufIndex(index = 8)
    public String iconUrl;

    @ProtobufIndex(index = 6)
    public long max;

    @ProtobufIndex(index = 7)
    public long maxGrade;

    @ProtobufIndex(index = 5)
    public long min;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    public static BLiveFanBaseHierarchy new_() {
        BLiveFanBaseHierarchy bLiveFanBaseHierarchy = new BLiveFanBaseHierarchy();
        bLiveFanBaseHierarchy.nullCheck();
        return bLiveFanBaseHierarchy;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFanBaseHierarchy mo225055clone() {
        BLiveFanBaseHierarchy bLiveFanBaseHierarchy = new BLiveFanBaseHierarchy();
        bLiveFanBaseHierarchy.userId = this.userId;
        bLiveFanBaseHierarchy.fanbaseId = this.fanbaseId;
        bLiveFanBaseHierarchy.grade = this.grade;
        bLiveFanBaseHierarchy.current = this.current;
        bLiveFanBaseHierarchy.min = this.min;
        bLiveFanBaseHierarchy.max = this.max;
        bLiveFanBaseHierarchy.maxGrade = this.maxGrade;
        bLiveFanBaseHierarchy.iconUrl = this.iconUrl;
        return bLiveFanBaseHierarchy;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFanBaseHierarchy)) {
            return false;
        }
        BLiveFanBaseHierarchy bLiveFanBaseHierarchy = (BLiveFanBaseHierarchy) obj;
        return ValueObject.util_equals(this.userId, bLiveFanBaseHierarchy.userId) && ValueObject.util_equals(this.fanbaseId, bLiveFanBaseHierarchy.fanbaseId) && this.grade == bLiveFanBaseHierarchy.grade && this.current == bLiveFanBaseHierarchy.current && this.min == bLiveFanBaseHierarchy.min && this.max == bLiveFanBaseHierarchy.max && this.maxGrade == bLiveFanBaseHierarchy.maxGrade && ValueObject.util_equals(this.iconUrl, bLiveFanBaseHierarchy.iconUrl);
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
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.fanbaseId;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.grade;
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.current;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.min;
        int i5 = (i4 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        long j4 = this.max;
        int i6 = (i5 + ((int) (j4 ^ (j4 >>> 32)))) * 41;
        long j5 = this.maxGrade;
        int i7 = (i6 + ((int) (j5 ^ (j5 >>> 32)))) * 41;
        String str3 = this.iconUrl;
        int iHashCode3 = i7 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.fanbaseId == null) {
            this.fanbaseId = "";
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
