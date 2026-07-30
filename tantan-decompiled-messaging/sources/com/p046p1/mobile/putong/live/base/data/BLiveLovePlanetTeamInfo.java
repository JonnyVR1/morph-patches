package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
public class BLiveLovePlanetTeamInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveLovePlanetTeamInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveLovePlanetTeamInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveLovePlanetTeamInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveLovePlanetTeamInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveLovePlanetTeamInfo newInstance() {
            return new BLiveLovePlanetTeamInfo();
        }

        public boolean parseField(BLiveLovePlanetTeamInfo bLiveLovePlanetTeamInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherUserId":
                    bLiveLovePlanetTeamInfo.otherUserId = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveLovePlanetTeamInfo.userId = jsonParser.getValueAsString();
                    return true;
                case "totalScore":
                    bLiveLovePlanetTeamInfo.totalScore = jsonParser.getValueAsLong();
                    return true;
                case "tip":
                    bLiveLovePlanetTeamInfo.tip = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveLovePlanetTeamInfo bLiveLovePlanetTeamInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveLovePlanetTeamInfo.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveLovePlanetTeamInfo.otherUserId;
            if (str2 != null) {
                jsonGenerator.writeStringField("otherUserId", str2);
            }
            String str3 = bLiveLovePlanetTeamInfo.tip;
            if (str3 != null) {
                jsonGenerator.writeStringField("tip", str3);
            }
            jsonGenerator.writeNumberField("totalScore", bLiveLovePlanetTeamInfo.totalScore);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveLovePlanetTeamInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveloveplanetteaminfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public String otherUserId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String tip;

    @ProtobufIndex(index = 4)
    public long totalScore;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    public static BLiveLovePlanetTeamInfo new_() {
        BLiveLovePlanetTeamInfo bLiveLovePlanetTeamInfo = new BLiveLovePlanetTeamInfo();
        bLiveLovePlanetTeamInfo.nullCheck();
        return bLiveLovePlanetTeamInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveLovePlanetTeamInfo mo223809clone() {
        BLiveLovePlanetTeamInfo bLiveLovePlanetTeamInfo = new BLiveLovePlanetTeamInfo();
        bLiveLovePlanetTeamInfo.userId = this.userId;
        bLiveLovePlanetTeamInfo.otherUserId = this.otherUserId;
        bLiveLovePlanetTeamInfo.tip = this.tip;
        bLiveLovePlanetTeamInfo.totalScore = this.totalScore;
        return bLiveLovePlanetTeamInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveLovePlanetTeamInfo)) {
            return false;
        }
        BLiveLovePlanetTeamInfo bLiveLovePlanetTeamInfo = (BLiveLovePlanetTeamInfo) obj;
        return ValueObject.util_equals(this.userId, bLiveLovePlanetTeamInfo.userId) && ValueObject.util_equals(this.otherUserId, bLiveLovePlanetTeamInfo.otherUserId) && ValueObject.util_equals(this.tip, bLiveLovePlanetTeamInfo.tip) && this.totalScore == bLiveLovePlanetTeamInfo.totalScore;
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
        String str2 = this.otherUserId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.tip;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        long j = this.totalScore;
        int i3 = ((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.otherUserId == null) {
            this.otherUserId = "";
        }
        if (this.tip == null) {
            this.tip = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
