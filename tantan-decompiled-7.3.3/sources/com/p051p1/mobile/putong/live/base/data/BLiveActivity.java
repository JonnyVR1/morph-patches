package com.p051p1.mobile.putong.live.base.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.feed.data.Reference;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveActivity extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveActivity> JSON_ADAPTER = new ObjectJsonAdapter<BLiveActivity>() { // from class: com.p1.mobile.putong.live.base.data.BLiveActivity.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveActivity.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveActivity newInstance() {
            return new BLiveActivity();
        }

        public boolean parseField(BLiveActivity bLiveActivity, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "reference":
                    bLiveActivity.reference = BLiveOwner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "valueType":
                    bLiveActivity.valueType = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveActivity.f45175id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    bLiveActivity.type = jsonParser.getValueAsString();
                    return true;
                case "category":
                    bLiveActivity.category = jsonParser.getValueAsString();
                    return true;
                case "owner":
                    bLiveActivity.owner = BLiveOwner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    bLiveActivity.title = jsonParser.getValueAsString();
                    return true;
                case "value":
                    bLiveActivity.value = jsonParser.getValueAsString();
                    return true;
                case "multiCallInfo":
                    bLiveActivity.multiCallInfo = BLiveMultiCallInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "valueColor":
                    bLiveActivity.valueColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveActivity bLiveActivity, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveActivity.f45175id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveActivity.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = bLiveActivity.value;
            if (str3 != null) {
                jsonGenerator.writeStringField("value", str3);
            }
            if (bLiveActivity.owner != null) {
                jsonGenerator.writeFieldName(Owner.TYPE);
                BLiveOwner.JSON_ADAPTER.serialize(bLiveActivity.owner, jsonGenerator, true);
            }
            if (bLiveActivity.reference != null) {
                jsonGenerator.writeFieldName(Reference.TYPE);
                BLiveOwner.JSON_ADAPTER.serialize(bLiveActivity.reference, jsonGenerator, true);
            }
            String str4 = bLiveActivity.type;
            if (str4 != null) {
                jsonGenerator.writeStringField("type", str4);
            }
            String str5 = bLiveActivity.valueType;
            if (str5 != null) {
                jsonGenerator.writeStringField("valueType", str5);
            }
            String str6 = bLiveActivity.category;
            if (str6 != null) {
                jsonGenerator.writeStringField("category", str6);
            }
            if (bLiveActivity.multiCallInfo != null) {
                jsonGenerator.writeFieldName("multiCallInfo");
                BLiveMultiCallInfo.JSON_ADAPTER.serialize(bLiveActivity.multiCallInfo, jsonGenerator, true);
            }
            String str7 = bLiveActivity.valueColor;
            if (str7 != null) {
                jsonGenerator.writeStringField("valueColor", str7);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveActivity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveactivity";
    public static final String TYPE_MULTI_CALL = "multiCall";

    @NonNull
    @ProtobufIndex(index = 9)
    public String category;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45175id;

    @NonNull
    @ProtobufIndex(index = 8)
    public BLiveMultiCallInfo multiCallInfo;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveOwner owner;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveOwner reference;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;

    @NonNull
    @ProtobufIndex(index = 6)
    public String type;

    @NonNull
    @ProtobufIndex(index = 3)
    public String value;

    @NonNull
    @ProtobufIndex(index = 10)
    public String valueColor;

    @NonNull
    @ProtobufIndex(index = 7)
    public String valueType;

    public static BLiveActivity new_() {
        BLiveActivity bLiveActivity = new BLiveActivity();
        bLiveActivity.nullCheck();
        return bLiveActivity;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveActivity mo225055clone() {
        BLiveActivity bLiveActivity = new BLiveActivity();
        bLiveActivity.f45175id = this.f45175id;
        bLiveActivity.title = this.title;
        bLiveActivity.value = this.value;
        BLiveOwner bLiveOwner = this.owner;
        if (bLiveOwner != null) {
            bLiveActivity.owner = bLiveOwner.mo225055clone();
        }
        BLiveOwner bLiveOwner2 = this.reference;
        if (bLiveOwner2 != null) {
            bLiveActivity.reference = bLiveOwner2.mo225055clone();
        }
        bLiveActivity.type = this.type;
        bLiveActivity.valueType = this.valueType;
        bLiveActivity.category = this.category;
        BLiveMultiCallInfo bLiveMultiCallInfo = this.multiCallInfo;
        if (bLiveMultiCallInfo != null) {
            bLiveActivity.multiCallInfo = bLiveMultiCallInfo.mo225055clone();
        }
        bLiveActivity.valueColor = this.valueColor;
        return bLiveActivity;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveActivity)) {
            return false;
        }
        BLiveActivity bLiveActivity = (BLiveActivity) obj;
        return ValueObject.util_equals(this.f45175id, bLiveActivity.f45175id) && ValueObject.util_equals(this.title, bLiveActivity.title) && ValueObject.util_equals(this.value, bLiveActivity.value) && ValueObject.util_equals(this.owner, bLiveActivity.owner) && ValueObject.util_equals(this.reference, bLiveActivity.reference) && ValueObject.util_equals(this.type, bLiveActivity.type) && ValueObject.util_equals(this.valueType, bLiveActivity.valueType) && ValueObject.util_equals(this.category, bLiveActivity.category) && ValueObject.util_equals(this.multiCallInfo, bLiveActivity.multiCallInfo) && ValueObject.util_equals(this.valueColor, bLiveActivity.valueColor);
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
        String str = this.f45175id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.value;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        BLiveOwner bLiveOwner = this.owner;
        int iHashCode4 = (iHashCode3 + (bLiveOwner != null ? bLiveOwner.hashCode() : 0)) * 41;
        BLiveOwner bLiveOwner2 = this.reference;
        int iHashCode5 = (iHashCode4 + (bLiveOwner2 != null ? bLiveOwner2.hashCode() : 0)) * 41;
        String str4 = this.type;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.valueType;
        int iHashCode7 = (iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.category;
        int iHashCode8 = (iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 41;
        BLiveMultiCallInfo bLiveMultiCallInfo = this.multiCallInfo;
        int iHashCode9 = (iHashCode8 + (bLiveMultiCallInfo != null ? bLiveMultiCallInfo.hashCode() : 0)) * 41;
        String str7 = this.valueColor;
        int iHashCode10 = iHashCode9 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    public boolean isMultiCall() {
        return this.multiCallInfo.onGoing;
    }

    public boolean isMultiCallAudience() {
        return TextUtils.equals(this.multiCallInfo.role, "audience");
    }

    public boolean isMultiCallAudienceEnd() {
        if (!isMultiCallAudience()) {
            return false;
        }
        BLiveMultiCallInfo bLiveMultiCallInfo = this.multiCallInfo;
        return !bLiveMultiCallInfo.onGoing && bLiveMultiCallInfo.quitTime > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    public boolean isMultiCallAudienceGoing() {
        return isMultiCallAudience() && this.multiCallInfo.onGoing;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45175id == null) {
            this.f45175id = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.value == null) {
            this.value = "";
        }
        if (this.owner == null) {
            this.owner = BLiveOwner.new_();
        }
        if (this.reference == null) {
            this.reference = BLiveOwner.new_();
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.valueType == null) {
            this.valueType = "";
        }
        if (this.category == null) {
            this.category = "";
        }
        if (this.multiCallInfo == null) {
            this.multiCallInfo = BLiveMultiCallInfo.new_();
        }
        if (this.valueColor == null) {
            this.valueColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
