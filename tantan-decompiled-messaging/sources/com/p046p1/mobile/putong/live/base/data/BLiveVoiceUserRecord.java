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
public class BLiveVoiceUserRecord extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceUserRecord> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceUserRecord>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceUserRecord.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceUserRecord.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceUserRecord newInstance() {
            return new BLiveVoiceUserRecord();
        }

        public boolean parseField(BLiveVoiceUserRecord bLiveVoiceUserRecord, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userTypeRole":
                    bLiveVoiceUserRecord.userTypeRole = jsonParser.getValueAsString();
                    return true;
                case "liveId":
                    bLiveVoiceUserRecord.liveId = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveVoiceUserRecord.userId = jsonParser.getValueAsString();
                    return true;
                case "heartbeatRewardPoint":
                    bLiveVoiceUserRecord.heartbeatRewardPoint = jsonParser.getValueAsLong();
                    return true;
                case "userNickname":
                    bLiveVoiceUserRecord.userNickname = jsonParser.getValueAsString();
                    return true;
                case "userAge":
                    bLiveVoiceUserRecord.userAge = jsonParser.getValueAsString();
                    return true;
                case "userAvatar":
                    bLiveVoiceUserRecord.userAvatar = jsonParser.getValueAsString();
                    return true;
                case "userGender":
                    bLiveVoiceUserRecord.userGender = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceUserRecord bLiveVoiceUserRecord, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceUserRecord.liveId;
            if (str != null) {
                jsonGenerator.writeStringField("liveId", str);
            }
            String str2 = bLiveVoiceUserRecord.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
            String str3 = bLiveVoiceUserRecord.userAvatar;
            if (str3 != null) {
                jsonGenerator.writeStringField("userAvatar", str3);
            }
            String str4 = bLiveVoiceUserRecord.userNickname;
            if (str4 != null) {
                jsonGenerator.writeStringField("userNickname", str4);
            }
            String str5 = bLiveVoiceUserRecord.userAge;
            if (str5 != null) {
                jsonGenerator.writeStringField("userAge", str5);
            }
            String str6 = bLiveVoiceUserRecord.userGender;
            if (str6 != null) {
                jsonGenerator.writeStringField("userGender", str6);
            }
            String str7 = bLiveVoiceUserRecord.userTypeRole;
            if (str7 != null) {
                jsonGenerator.writeStringField("userTypeRole", str7);
            }
            jsonGenerator.writeNumberField("heartbeatRewardPoint", bLiveVoiceUserRecord.heartbeatRewardPoint);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceUserRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceuserrecord";

    @ProtobufIndex(index = 8)
    public long heartbeatRewardPoint;

    @NonNull
    @ProtobufIndex(index = 1)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 7)
    public String userAge;

    @NonNull
    @ProtobufIndex(index = 5)
    public String userAvatar;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userGender;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String userNickname;

    @NonNull
    @ProtobufIndex(index = 4)
    public String userTypeRole;

    public static BLiveVoiceUserRecord new_() {
        BLiveVoiceUserRecord bLiveVoiceUserRecord = new BLiveVoiceUserRecord();
        bLiveVoiceUserRecord.nullCheck();
        return bLiveVoiceUserRecord;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceUserRecord mo223809clone() {
        BLiveVoiceUserRecord bLiveVoiceUserRecord = new BLiveVoiceUserRecord();
        bLiveVoiceUserRecord.liveId = this.liveId;
        bLiveVoiceUserRecord.userId = this.userId;
        bLiveVoiceUserRecord.userAvatar = this.userAvatar;
        bLiveVoiceUserRecord.userNickname = this.userNickname;
        bLiveVoiceUserRecord.userAge = this.userAge;
        bLiveVoiceUserRecord.userGender = this.userGender;
        bLiveVoiceUserRecord.userTypeRole = this.userTypeRole;
        bLiveVoiceUserRecord.heartbeatRewardPoint = this.heartbeatRewardPoint;
        return bLiveVoiceUserRecord;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceUserRecord)) {
            return false;
        }
        BLiveVoiceUserRecord bLiveVoiceUserRecord = (BLiveVoiceUserRecord) obj;
        return ValueObject.util_equals(this.liveId, bLiveVoiceUserRecord.liveId) && ValueObject.util_equals(this.userId, bLiveVoiceUserRecord.userId) && ValueObject.util_equals(this.userAvatar, bLiveVoiceUserRecord.userAvatar) && ValueObject.util_equals(this.userNickname, bLiveVoiceUserRecord.userNickname) && ValueObject.util_equals(this.userAge, bLiveVoiceUserRecord.userAge) && ValueObject.util_equals(this.userGender, bLiveVoiceUserRecord.userGender) && ValueObject.util_equals(this.userTypeRole, bLiveVoiceUserRecord.userTypeRole) && this.heartbeatRewardPoint == bLiveVoiceUserRecord.heartbeatRewardPoint;
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
        String str = this.liveId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.userAvatar;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.userNickname;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.userAge;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.userGender;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.userTypeRole;
        int iHashCode7 = str7 != null ? str7.hashCode() : 0;
        long j = this.heartbeatRewardPoint;
        int i3 = ((iHashCode6 + iHashCode7) * 41) + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.userAvatar == null) {
            this.userAvatar = "";
        }
        if (this.userNickname == null) {
            this.userNickname = "";
        }
        if (this.userAge == null) {
            this.userAge = "";
        }
        if (this.userGender == null) {
            this.userGender = "";
        }
        if (this.userTypeRole == null) {
            this.userTypeRole = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
