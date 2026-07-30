package com.p046p1.mobile.putong.live.base.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveLovePlanetPlayerInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveLovePlanetPlayerInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveLovePlanetPlayerInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveLovePlanetPlayerInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveLovePlanetPlayerInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveLovePlanetPlayerInfo newInstance() {
            return new BLiveLovePlanetPlayerInfo();
        }

        public boolean parseField(BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "avatar":
                    bLiveLovePlanetPlayerInfo.avatar = jsonParser.getValueAsString();
                    return true;
                case "avatarConfig":
                    bLiveLovePlanetPlayerInfo.avatarConfig = BLiveMaskAvatarConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "gender":
                    bLiveLovePlanetPlayerInfo.gender = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveLovePlanetPlayerInfo.userId = jsonParser.getValueAsString();
                    return true;
                case "userName":
                    bLiveLovePlanetPlayerInfo.userName = jsonParser.getValueAsString();
                    return true;
                case "sendScore":
                    bLiveLovePlanetPlayerInfo.sendScore = jsonParser.getValueAsLong();
                    return true;
                case "position":
                    bLiveLovePlanetPlayerInfo.position = jsonParser.getValueAsInt();
                    return true;
                case "selectPosition":
                    bLiveLovePlanetPlayerInfo.selectPosition = jsonParser.getValueAsLong();
                    return true;
                case "receivedScore":
                    bLiveLovePlanetPlayerInfo.receivedScore = jsonParser.getValueAsLong();
                    return true;
                case "isLeave":
                    bLiveLovePlanetPlayerInfo.isLeave = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveLovePlanetPlayerInfo.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField("selectPosition", bLiveLovePlanetPlayerInfo.selectPosition);
            jsonGenerator.writeNumberField("receivedScore", bLiveLovePlanetPlayerInfo.receivedScore);
            String str2 = bLiveLovePlanetPlayerInfo.userName;
            if (str2 != null) {
                jsonGenerator.writeStringField("userName", str2);
            }
            String str3 = bLiveLovePlanetPlayerInfo.gender;
            if (str3 != null) {
                jsonGenerator.writeStringField("gender", str3);
            }
            String str4 = bLiveLovePlanetPlayerInfo.avatar;
            if (str4 != null) {
                jsonGenerator.writeStringField("avatar", str4);
            }
            jsonGenerator.writeNumberField("position", bLiveLovePlanetPlayerInfo.position);
            jsonGenerator.writeBooleanField("isLeave", bLiveLovePlanetPlayerInfo.isLeave);
            jsonGenerator.writeNumberField("sendScore", bLiveLovePlanetPlayerInfo.sendScore);
            if (bLiveLovePlanetPlayerInfo.avatarConfig != null) {
                jsonGenerator.writeFieldName("avatarConfig");
                BLiveMaskAvatarConfig.JSON_ADAPTER.serialize(bLiveLovePlanetPlayerInfo.avatarConfig, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveLovePlanetPlayerInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveloveplanetplayerinfo";

    @NonNull
    @ProtobufIndex(index = 6)
    public String avatar;

    @NonNull
    @ProtobufIndex(index = 10)
    public BLiveMaskAvatarConfig avatarConfig;

    @NonNull
    @ProtobufIndex(index = 5)
    public String gender;

    @ProtobufIndex(index = 8)
    public boolean isLeave;

    @ProtobufIndex(index = 7)
    public int position;

    @ProtobufIndex(index = 3)
    public long receivedScore;

    @ProtobufIndex(index = 2)
    public long selectPosition;

    @ProtobufIndex(index = 9)
    public long sendScore;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String userName;

    public static BLiveLovePlanetPlayerInfo new_() {
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo = new BLiveLovePlanetPlayerInfo();
        bLiveLovePlanetPlayerInfo.nullCheck();
        return bLiveLovePlanetPlayerInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveLovePlanetPlayerInfo mo223809clone() {
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo = new BLiveLovePlanetPlayerInfo();
        bLiveLovePlanetPlayerInfo.userId = this.userId;
        bLiveLovePlanetPlayerInfo.selectPosition = this.selectPosition;
        bLiveLovePlanetPlayerInfo.receivedScore = this.receivedScore;
        bLiveLovePlanetPlayerInfo.userName = this.userName;
        bLiveLovePlanetPlayerInfo.gender = this.gender;
        bLiveLovePlanetPlayerInfo.avatar = this.avatar;
        bLiveLovePlanetPlayerInfo.position = this.position;
        bLiveLovePlanetPlayerInfo.isLeave = this.isLeave;
        bLiveLovePlanetPlayerInfo.sendScore = this.sendScore;
        BLiveMaskAvatarConfig bLiveMaskAvatarConfig = this.avatarConfig;
        if (bLiveMaskAvatarConfig != null) {
            bLiveLovePlanetPlayerInfo.avatarConfig = bLiveMaskAvatarConfig.mo223809clone();
        }
        return bLiveLovePlanetPlayerInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveLovePlanetPlayerInfo)) {
            return false;
        }
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo = (BLiveLovePlanetPlayerInfo) obj;
        return ValueObject.util_equals(this.userId, bLiveLovePlanetPlayerInfo.userId) && this.selectPosition == bLiveLovePlanetPlayerInfo.selectPosition && this.receivedScore == bLiveLovePlanetPlayerInfo.receivedScore && ValueObject.util_equals(this.userName, bLiveLovePlanetPlayerInfo.userName) && ValueObject.util_equals(this.gender, bLiveLovePlanetPlayerInfo.gender) && ValueObject.util_equals(this.avatar, bLiveLovePlanetPlayerInfo.avatar) && this.position == bLiveLovePlanetPlayerInfo.position && this.isLeave == bLiveLovePlanetPlayerInfo.isLeave && this.sendScore == bLiveLovePlanetPlayerInfo.sendScore && ValueObject.util_equals(this.avatarConfig, bLiveLovePlanetPlayerInfo.avatarConfig);
    }

    public String getAvatarUrl() {
        return (NullChecker.m81303a(this.avatarConfig) && this.avatarConfig.frameConfig.checkNeedChangeVoice() && !TextUtils.isEmpty(this.avatarConfig.frameConfig.funnyUrl)) ? this.avatarConfig.frameConfig.funnyUrl : this.avatar;
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
        int iHashCode = str != null ? str.hashCode() : 0;
        long j = this.selectPosition;
        int i3 = (((i2 + iHashCode) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.receivedScore;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str2 = this.userName;
        int iHashCode2 = (i4 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.gender;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.avatar;
        int iHashCode4 = (((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.position) * 41) + (this.isLeave ? 1231 : 1237)) * 41;
        long j3 = this.sendScore;
        int i5 = (iHashCode4 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        BLiveMaskAvatarConfig bLiveMaskAvatarConfig = this.avatarConfig;
        int iHashCode5 = i5 + (bLiveMaskAvatarConfig != null ? bLiveMaskAvatarConfig.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.gender == null) {
            this.gender = "";
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
        if (this.avatarConfig == null) {
            this.avatarConfig = BLiveMaskAvatarConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
