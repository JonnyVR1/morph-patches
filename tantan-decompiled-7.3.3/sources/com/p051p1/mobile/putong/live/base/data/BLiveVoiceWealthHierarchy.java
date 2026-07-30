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
public class BLiveVoiceWealthHierarchy extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceWealthHierarchy> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceWealthHierarchy>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceWealthHierarchy.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceWealthHierarchy.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceWealthHierarchy newInstance() {
            return new BLiveVoiceWealthHierarchy();
        }

        public boolean parseField(BLiveVoiceWealthHierarchy bLiveVoiceWealthHierarchy, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    bLiveVoiceWealthHierarchy.userId = jsonParser.getValueAsString();
                    return true;
                case "updatedTime":
                    bLiveVoiceWealthHierarchy.updatedTime = jsonParser.getValueAsLong();
                    return true;
                case "gap":
                    bLiveVoiceWealthHierarchy.gap = jsonParser.getValueAsLong();
                    return true;
                case "grade":
                    bLiveVoiceWealthHierarchy.grade = jsonParser.getValueAsInt();
                    return true;
                case "iconUrl":
                    bLiveVoiceWealthHierarchy.iconUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceWealthHierarchy bLiveVoiceWealthHierarchy, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceWealthHierarchy.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveVoiceWealthHierarchy.iconUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("iconUrl", str2);
            }
            jsonGenerator.writeNumberField("gap", bLiveVoiceWealthHierarchy.gap);
            jsonGenerator.writeNumberField(LocationInvisibleField.updatedTime, bLiveVoiceWealthHierarchy.updatedTime);
            jsonGenerator.writeNumberField(Grade.TYPE, bLiveVoiceWealthHierarchy.grade);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceWealthHierarchy) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicewealthhierarchy";

    @ProtobufIndex(index = 1)
    public long gap;

    @ProtobufIndex(index = 5)
    public int grade;

    @NonNull
    @ProtobufIndex(index = 3)
    public String iconUrl;

    @ProtobufIndex(index = 4)
    public long updatedTime;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userId;

    public static BLiveVoiceWealthHierarchy new_() {
        BLiveVoiceWealthHierarchy bLiveVoiceWealthHierarchy = new BLiveVoiceWealthHierarchy();
        bLiveVoiceWealthHierarchy.nullCheck();
        return bLiveVoiceWealthHierarchy;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceWealthHierarchy mo225055clone() {
        BLiveVoiceWealthHierarchy bLiveVoiceWealthHierarchy = new BLiveVoiceWealthHierarchy();
        bLiveVoiceWealthHierarchy.userId = this.userId;
        bLiveVoiceWealthHierarchy.iconUrl = this.iconUrl;
        bLiveVoiceWealthHierarchy.gap = this.gap;
        bLiveVoiceWealthHierarchy.updatedTime = this.updatedTime;
        bLiveVoiceWealthHierarchy.grade = this.grade;
        return bLiveVoiceWealthHierarchy;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceWealthHierarchy)) {
            return false;
        }
        BLiveVoiceWealthHierarchy bLiveVoiceWealthHierarchy = (BLiveVoiceWealthHierarchy) obj;
        return ValueObject.util_equals(this.userId, bLiveVoiceWealthHierarchy.userId) && ValueObject.util_equals(this.iconUrl, bLiveVoiceWealthHierarchy.iconUrl) && this.gap == bLiveVoiceWealthHierarchy.gap && this.updatedTime == bLiveVoiceWealthHierarchy.updatedTime && this.grade == bLiveVoiceWealthHierarchy.grade;
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
        String str2 = this.iconUrl;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.gap;
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.updatedTime;
        int i4 = ((i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41) + this.grade;
        this.hashCode = i4;
        return i4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
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
