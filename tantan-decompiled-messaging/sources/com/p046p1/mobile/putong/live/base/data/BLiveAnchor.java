package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.SchemeKey;
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
public class BLiveAnchor extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAnchor> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAnchor>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAnchor.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAnchor.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAnchor newInstance() {
            return new BLiveAnchor();
        }

        public boolean parseField(BLiveAnchor bLiveAnchor, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "reward":
                    bLiveAnchor.reward = BLiveReward.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "status":
                    bLiveAnchor.status = BLiveAnchorStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "pkRecommendSource":
                    bLiveAnchor.pkRecommendSource = BLivePkInviteSource.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "id":
                    bLiveAnchor.f44331id = jsonParser.getValueAsString();
                    return false;
                case "room":
                    bLiveAnchor.room = BLiveOwner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "type":
                    bLiveAnchor.type = jsonParser.getValueAsString();
                    return true;
                case "liveSetting":
                    bLiveAnchor.liveSetting = BLiveAnchorSetting.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "liveData":
                    bLiveAnchor.liveData = BLiveAnchorData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "multiCallInfo":
                    bLiveAnchor.multiCallInfo = BLiveMultiCallInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "availableTime":
                    bLiveAnchor.availableTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "isPking":
                    bLiveAnchor.isPking = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAnchor bLiveAnchor, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveAnchor.f44331id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (bLiveAnchor.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                BLiveAnchorStatus.JSON_ADAPTER.serialize(bLiveAnchor.status, jsonGenerator, true);
            }
            jsonGenerator.writeFieldName("availableTime");
            Converter.API_TIME.serialize(Double.valueOf(bLiveAnchor.availableTime), jsonGenerator, true);
            String str2 = bLiveAnchor.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            if (bLiveAnchor.liveData != null) {
                jsonGenerator.writeFieldName("liveData");
                BLiveAnchorData.JSON_ADAPTER.serialize(bLiveAnchor.liveData, jsonGenerator, true);
            }
            if (bLiveAnchor.reward != null) {
                jsonGenerator.writeFieldName("reward");
                BLiveReward.JSON_ADAPTER.serialize(bLiveAnchor.reward, jsonGenerator, true);
            }
            if (bLiveAnchor.room != null) {
                jsonGenerator.writeFieldName("room");
                BLiveOwner.JSON_ADAPTER.serialize(bLiveAnchor.room, jsonGenerator, true);
            }
            if (bLiveAnchor.liveSetting != null) {
                jsonGenerator.writeFieldName(SchemeKey.liveSetting);
                BLiveAnchorSetting.JSON_ADAPTER.serialize(bLiveAnchor.liveSetting, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("isPking", bLiveAnchor.isPking);
            if (bLiveAnchor.pkRecommendSource != null) {
                jsonGenerator.writeFieldName("pkRecommendSource");
                BLivePkInviteSource.JSON_ADAPTER.serialize(bLiveAnchor.pkRecommendSource, jsonGenerator, true);
            }
            if (bLiveAnchor.multiCallInfo != null) {
                jsonGenerator.writeFieldName("multiCallInfo");
                BLiveMultiCallInfo.JSON_ADAPTER.serialize(bLiveAnchor.multiCallInfo, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAnchor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveanchor";

    @ProtobufIndex(index = 3)
    public double availableTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44331id;

    @ProtobufIndex(index = 9)
    public boolean isPking;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveAnchorData liveData;

    @NonNull
    @ProtobufIndex(index = 8)
    public BLiveAnchorSetting liveSetting;

    @NonNull
    @ProtobufIndex(index = 13)
    public BLiveMultiCallInfo multiCallInfo;

    @NonNull
    @ProtobufIndex(index = 10)
    public BLivePkInviteSource pkRecommendSource;

    @NonNull
    @ProtobufIndex(index = 6)
    public BLiveReward reward;

    @NonNull
    @ProtobufIndex(index = 7)
    public BLiveOwner room;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveAnchorStatus status;

    @NonNull
    @ProtobufIndex(index = 4)
    public String type;

    public static BLiveAnchor new_() {
        BLiveAnchor bLiveAnchor = new BLiveAnchor();
        bLiveAnchor.nullCheck();
        return bLiveAnchor;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAnchor mo223809clone() {
        BLiveAnchor bLiveAnchor = new BLiveAnchor();
        bLiveAnchor.f44331id = this.f44331id;
        bLiveAnchor.status = this.status;
        bLiveAnchor.availableTime = this.availableTime;
        bLiveAnchor.type = this.type;
        BLiveAnchorData bLiveAnchorData = this.liveData;
        if (bLiveAnchorData != null) {
            bLiveAnchor.liveData = bLiveAnchorData.mo223809clone();
        }
        BLiveReward bLiveReward = this.reward;
        if (bLiveReward != null) {
            bLiveAnchor.reward = bLiveReward.mo223809clone();
        }
        BLiveOwner bLiveOwner = this.room;
        if (bLiveOwner != null) {
            bLiveAnchor.room = bLiveOwner.mo223809clone();
        }
        BLiveAnchorSetting bLiveAnchorSetting = this.liveSetting;
        if (bLiveAnchorSetting != null) {
            bLiveAnchor.liveSetting = bLiveAnchorSetting.mo223809clone();
        }
        bLiveAnchor.isPking = this.isPking;
        bLiveAnchor.pkRecommendSource = this.pkRecommendSource;
        BLiveMultiCallInfo bLiveMultiCallInfo = this.multiCallInfo;
        if (bLiveMultiCallInfo != null) {
            bLiveAnchor.multiCallInfo = bLiveMultiCallInfo.mo223809clone();
        }
        return bLiveAnchor;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAnchor)) {
            return false;
        }
        BLiveAnchor bLiveAnchor = (BLiveAnchor) obj;
        return ValueObject.util_equals(this.f44331id, bLiveAnchor.f44331id) && ValueObject.util_equals(this.status, bLiveAnchor.status) && this.availableTime == bLiveAnchor.availableTime && ValueObject.util_equals(this.type, bLiveAnchor.type) && ValueObject.util_equals(this.liveData, bLiveAnchor.liveData) && ValueObject.util_equals(this.reward, bLiveAnchor.reward) && ValueObject.util_equals(this.room, bLiveAnchor.room) && ValueObject.util_equals(this.liveSetting, bLiveAnchor.liveSetting) && this.isPking == bLiveAnchor.isPking && ValueObject.util_equals(this.pkRecommendSource, bLiveAnchor.pkRecommendSource) && ValueObject.util_equals(this.multiCallInfo, bLiveAnchor.multiCallInfo);
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
        String str = this.f44331id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveAnchorStatus bLiveAnchorStatus = this.status;
        int iHashCode2 = bLiveAnchorStatus != null ? bLiveAnchorStatus.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.availableTime);
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str2 = this.type;
        int iHashCode3 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveAnchorData bLiveAnchorData = this.liveData;
        int iHashCode4 = (iHashCode3 + (bLiveAnchorData != null ? bLiveAnchorData.hashCode() : 0)) * 41;
        BLiveReward bLiveReward = this.reward;
        int iHashCode5 = (iHashCode4 + (bLiveReward != null ? bLiveReward.hashCode() : 0)) * 41;
        BLiveOwner bLiveOwner = this.room;
        int iHashCode6 = (iHashCode5 + (bLiveOwner != null ? bLiveOwner.hashCode() : 0)) * 41;
        BLiveAnchorSetting bLiveAnchorSetting = this.liveSetting;
        int iHashCode7 = (((iHashCode6 + (bLiveAnchorSetting != null ? bLiveAnchorSetting.hashCode() : 0)) * 41) + (this.isPking ? 1231 : 1237)) * 41;
        BLivePkInviteSource bLivePkInviteSource = this.pkRecommendSource;
        int iHashCode8 = (iHashCode7 + (bLivePkInviteSource != null ? bLivePkInviteSource.hashCode() : 0)) * 41;
        BLiveMultiCallInfo bLiveMultiCallInfo = this.multiCallInfo;
        int iHashCode9 = iHashCode8 + (bLiveMultiCallInfo != null ? bLiveMultiCallInfo.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44331id == null) {
            this.f44331id = "";
        }
        if (this.status == null) {
            this.status = (BLiveAnchorStatus) BLiveAnchorStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.liveData == null) {
            this.liveData = BLiveAnchorData.new_();
        }
        if (this.reward == null) {
            this.reward = BLiveReward.new_();
        }
        if (this.room == null) {
            this.room = BLiveOwner.new_();
        }
        if (this.liveSetting == null) {
            this.liveSetting = BLiveAnchorSetting.new_();
        }
        if (this.pkRecommendSource == null) {
            this.pkRecommendSource = (BLivePkInviteSource) BLivePkInviteSource.JSON_ADAPTER.defaultEnum();
        }
        if (this.multiCallInfo == null) {
            this.multiCallInfo = BLiveMultiCallInfo.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
