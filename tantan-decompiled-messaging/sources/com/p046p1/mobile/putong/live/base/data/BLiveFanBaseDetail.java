package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
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
public class BLiveFanBaseDetail extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFanBaseDetail> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFanBaseDetail>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFanBaseDetail.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFanBaseDetail.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFanBaseDetail newInstance() {
            return new BLiveFanBaseDetail();
        }

        public boolean parseField(BLiveFanBaseDetail bLiveFanBaseDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "summary":
                    bLiveFanBaseDetail.summary = BLiveFanBaseDetailSummary.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "avatar":
                    bLiveFanBaseDetail.avatar = jsonParser.getValueAsString();
                    return true;
                case "activityScore":
                    bLiveFanBaseDetail.activityScore = BLiveFanBaseActivityScores.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "anchorId":
                    bLiveFanBaseDetail.anchorId = jsonParser.getValueAsString();
                    return true;
                case "defaultMedal":
                    bLiveFanBaseDetail.defaultMedal = BLiveFanBaseMedal.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    bLiveFanBaseDetail.f44364id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    bLiveFanBaseDetail.name = jsonParser.getValueAsString();
                    return true;
                case "icons":
                    bLiveFanBaseDetail.icons = JsonAdapter.parseArray(jsonParser, BLiveCommonViewConfig.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "joinFanbase":
                    bLiveFanBaseDetail.joinFanbase = BLiveJoinFanBase.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "memberCount":
                    bLiveFanBaseDetail.memberCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFanBaseDetail bLiveFanBaseDetail, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveFanBaseDetail.f44364id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveFanBaseDetail.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = bLiveFanBaseDetail.avatar;
            if (str3 != null) {
                jsonGenerator.writeStringField("avatar", str3);
            }
            String str4 = bLiveFanBaseDetail.anchorId;
            if (str4 != null) {
                jsonGenerator.writeStringField("anchorId", str4);
            }
            jsonGenerator.writeNumberField("memberCount", bLiveFanBaseDetail.memberCount);
            if (bLiveFanBaseDetail.activityScore != null) {
                jsonGenerator.writeFieldName("activityScore");
                BLiveFanBaseActivityScores.JSON_ADAPTER.serialize(bLiveFanBaseDetail.activityScore, jsonGenerator, true);
            }
            if (bLiveFanBaseDetail.defaultMedal != null) {
                jsonGenerator.writeFieldName("defaultMedal");
                BLiveFanBaseMedal.JSON_ADAPTER.serialize(bLiveFanBaseDetail.defaultMedal, jsonGenerator, true);
            }
            if (bLiveFanBaseDetail.joinFanbase != null) {
                jsonGenerator.writeFieldName("joinFanbase");
                BLiveJoinFanBase.JSON_ADAPTER.serialize(bLiveFanBaseDetail.joinFanbase, jsonGenerator, true);
            }
            if (bLiveFanBaseDetail.summary != null) {
                jsonGenerator.writeFieldName("summary");
                BLiveFanBaseDetailSummary.JSON_ADAPTER.serialize(bLiveFanBaseDetail.summary, jsonGenerator, true);
            }
            if (bLiveFanBaseDetail.icons != null) {
                jsonGenerator.writeFieldName("icons");
                JsonAdapter.serializeArray(bLiveFanBaseDetail.icons, jsonGenerator, BLiveCommonViewConfig.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFanBaseDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefanbasedetail";

    @NonNull
    @ProtobufIndex(index = 6)
    public BLiveFanBaseActivityScores activityScore;

    @NonNull
    @ProtobufIndex(index = 4)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String avatar;

    @NonNull
    @ProtobufIndex(index = 7)
    public BLiveFanBaseMedal defaultMedal;

    @NonNull
    @ProtobufIndex(index = 10)
    public List<BLiveCommonViewConfig> icons;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44364id;

    @NonNull
    @ProtobufIndex(index = 8)
    public BLiveJoinFanBase joinFanbase;

    @ProtobufIndex(index = 5)
    public int memberCount;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @Nullable
    @ProtobufIndex(index = 9)
    public BLiveFanBaseDetailSummary summary;

    public static BLiveFanBaseDetail new_() {
        BLiveFanBaseDetail bLiveFanBaseDetail = new BLiveFanBaseDetail();
        bLiveFanBaseDetail.nullCheck();
        return bLiveFanBaseDetail;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFanBaseDetail mo223809clone() {
        BLiveFanBaseDetail bLiveFanBaseDetail = new BLiveFanBaseDetail();
        bLiveFanBaseDetail.f44364id = this.f44364id;
        bLiveFanBaseDetail.name = this.name;
        bLiveFanBaseDetail.avatar = this.avatar;
        bLiveFanBaseDetail.anchorId = this.anchorId;
        bLiveFanBaseDetail.memberCount = this.memberCount;
        BLiveFanBaseActivityScores bLiveFanBaseActivityScores = this.activityScore;
        if (bLiveFanBaseActivityScores != null) {
            bLiveFanBaseDetail.activityScore = bLiveFanBaseActivityScores.mo223809clone();
        }
        BLiveFanBaseMedal bLiveFanBaseMedal = this.defaultMedal;
        if (bLiveFanBaseMedal != null) {
            bLiveFanBaseDetail.defaultMedal = bLiveFanBaseMedal.mo223809clone();
        }
        BLiveJoinFanBase bLiveJoinFanBase = this.joinFanbase;
        if (bLiveJoinFanBase != null) {
            bLiveFanBaseDetail.joinFanbase = bLiveJoinFanBase.mo223809clone();
        }
        BLiveFanBaseDetailSummary bLiveFanBaseDetailSummary = this.summary;
        if (bLiveFanBaseDetailSummary != null) {
            bLiveFanBaseDetail.summary = bLiveFanBaseDetailSummary.mo223809clone();
        }
        List<BLiveCommonViewConfig> list = this.icons;
        if (list != null) {
            bLiveFanBaseDetail.icons = ValueObject.util_map(list, new w9j() { // from class: l.pz1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveCommonViewConfig) obj).mo223809clone();
                }
            });
        }
        return bLiveFanBaseDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFanBaseDetail)) {
            return false;
        }
        BLiveFanBaseDetail bLiveFanBaseDetail = (BLiveFanBaseDetail) obj;
        return ValueObject.util_equals(this.f44364id, bLiveFanBaseDetail.f44364id) && ValueObject.util_equals(this.name, bLiveFanBaseDetail.name) && ValueObject.util_equals(this.avatar, bLiveFanBaseDetail.avatar) && ValueObject.util_equals(this.anchorId, bLiveFanBaseDetail.anchorId) && this.memberCount == bLiveFanBaseDetail.memberCount && ValueObject.util_equals(this.activityScore, bLiveFanBaseDetail.activityScore) && ValueObject.util_equals(this.defaultMedal, bLiveFanBaseDetail.defaultMedal) && ValueObject.util_equals(this.joinFanbase, bLiveFanBaseDetail.joinFanbase) && ValueObject.util_equals(this.summary, bLiveFanBaseDetail.summary) && ValueObject.util_equals(this.icons, bLiveFanBaseDetail.icons);
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
        String str = this.f44364id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.avatar;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.anchorId;
        int iHashCode4 = (((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.memberCount) * 41;
        BLiveFanBaseActivityScores bLiveFanBaseActivityScores = this.activityScore;
        int iHashCode5 = (iHashCode4 + (bLiveFanBaseActivityScores != null ? bLiveFanBaseActivityScores.hashCode() : 0)) * 41;
        BLiveFanBaseMedal bLiveFanBaseMedal = this.defaultMedal;
        int iHashCode6 = (iHashCode5 + (bLiveFanBaseMedal != null ? bLiveFanBaseMedal.hashCode() : 0)) * 41;
        BLiveJoinFanBase bLiveJoinFanBase = this.joinFanbase;
        int iHashCode7 = (iHashCode6 + (bLiveJoinFanBase != null ? bLiveJoinFanBase.hashCode() : 0)) * 41;
        BLiveFanBaseDetailSummary bLiveFanBaseDetailSummary = this.summary;
        int iHashCode8 = (iHashCode7 + (bLiveFanBaseDetailSummary != null ? bLiveFanBaseDetailSummary.hashCode() : 0)) * 41;
        List<BLiveCommonViewConfig> list = this.icons;
        int iHashCode9 = iHashCode8 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44364id == null) {
            this.f44364id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.activityScore == null) {
            this.activityScore = BLiveFanBaseActivityScores.new_();
        }
        if (this.defaultMedal == null) {
            this.defaultMedal = BLiveFanBaseMedal.new_();
        }
        if (this.joinFanbase == null) {
            this.joinFanbase = BLiveJoinFanBase.new_();
        }
        if (this.icons == null) {
            this.icons = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
