package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.core.data.Reason;
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
public class BLiveRecommendInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveRecommendInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveRecommendInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveRecommendInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveRecommendInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveRecommendInfo newInstance() {
            return new BLiveRecommendInfo();
        }

        public boolean parseField(BLiveRecommendInfo bLiveRecommendInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "extInfo":
                    bLiveRecommendInfo.extInfo = BLiveRecommendExtInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "reason":
                    bLiveRecommendInfo.reason = jsonParser.getValueAsString();
                    return true;
                case "inAppPrompt":
                    bLiveRecommendInfo.inAppPrompt = BLiveInAppPromptContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "jumpType":
                    bLiveRecommendInfo.jumpType = jsonParser.getValueAsString();
                    return true;
                case "category":
                    bLiveRecommendInfo.category = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveRecommendInfo bLiveRecommendInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveRecommendInfo.category;
            if (str != null) {
                jsonGenerator.writeStringField("category", str);
            }
            String str2 = bLiveRecommendInfo.reason;
            if (str2 != null) {
                jsonGenerator.writeStringField(Reason.TYPE, str2);
            }
            if (bLiveRecommendInfo.inAppPrompt != null) {
                jsonGenerator.writeFieldName("inAppPrompt");
                BLiveInAppPromptContent.JSON_ADAPTER.serialize(bLiveRecommendInfo.inAppPrompt, jsonGenerator, true);
            }
            String str3 = bLiveRecommendInfo.jumpType;
            if (str3 != null) {
                jsonGenerator.writeStringField("jumpType", str3);
            }
            if (bLiveRecommendInfo.extInfo != null) {
                jsonGenerator.writeFieldName("extInfo");
                BLiveRecommendExtInfo.JSON_ADAPTER.serialize(bLiveRecommendInfo.extInfo, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveRecommendInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliverecommendinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String category;

    @Nullable
    @ProtobufIndex(index = 5)
    public BLiveRecommendExtInfo extInfo;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveInAppPromptContent inAppPrompt;

    @NonNull
    @ProtobufIndex(index = 4)
    public String jumpType;

    @Nullable
    @ProtobufIndex(index = 2)
    public String reason;

    public static BLiveRecommendInfo new_() {
        BLiveRecommendInfo bLiveRecommendInfo = new BLiveRecommendInfo();
        bLiveRecommendInfo.nullCheck();
        return bLiveRecommendInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveRecommendInfo mo223809clone() {
        BLiveRecommendInfo bLiveRecommendInfo = new BLiveRecommendInfo();
        bLiveRecommendInfo.category = this.category;
        bLiveRecommendInfo.reason = this.reason;
        BLiveInAppPromptContent bLiveInAppPromptContent = this.inAppPrompt;
        if (bLiveInAppPromptContent != null) {
            bLiveRecommendInfo.inAppPrompt = bLiveInAppPromptContent.mo223809clone();
        }
        bLiveRecommendInfo.jumpType = this.jumpType;
        BLiveRecommendExtInfo bLiveRecommendExtInfo = this.extInfo;
        if (bLiveRecommendExtInfo != null) {
            bLiveRecommendInfo.extInfo = bLiveRecommendExtInfo.mo223809clone();
        }
        return bLiveRecommendInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveRecommendInfo)) {
            return false;
        }
        BLiveRecommendInfo bLiveRecommendInfo = (BLiveRecommendInfo) obj;
        return ValueObject.util_equals(this.category, bLiveRecommendInfo.category) && ValueObject.util_equals(this.reason, bLiveRecommendInfo.reason) && ValueObject.util_equals(this.inAppPrompt, bLiveRecommendInfo.inAppPrompt) && ValueObject.util_equals(this.jumpType, bLiveRecommendInfo.jumpType) && ValueObject.util_equals(this.extInfo, bLiveRecommendInfo.extInfo);
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
        String str = this.category;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.reason;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveInAppPromptContent bLiveInAppPromptContent = this.inAppPrompt;
        int iHashCode3 = (iHashCode2 + (bLiveInAppPromptContent != null ? bLiveInAppPromptContent.hashCode() : 0)) * 41;
        String str3 = this.jumpType;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        BLiveRecommendExtInfo bLiveRecommendExtInfo = this.extInfo;
        int iHashCode5 = iHashCode4 + (bLiveRecommendExtInfo != null ? bLiveRecommendExtInfo.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.category == null) {
            this.category = "";
        }
        if (this.inAppPrompt == null) {
            this.inAppPrompt = BLiveInAppPromptContent.new_();
        }
        if (this.jumpType == null) {
            this.jumpType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
