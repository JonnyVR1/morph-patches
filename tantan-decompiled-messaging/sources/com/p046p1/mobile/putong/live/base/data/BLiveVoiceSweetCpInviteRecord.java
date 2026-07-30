package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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
public class BLiveVoiceSweetCpInviteRecord extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceSweetCpInviteRecord> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceSweetCpInviteRecord>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceSweetCpInviteRecord.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceSweetCpInviteRecord.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceSweetCpInviteRecord newInstance() {
            return new BLiveVoiceSweetCpInviteRecord();
        }

        public boolean parseField(BLiveVoiceSweetCpInviteRecord bLiveVoiceSweetCpInviteRecord, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    bLiveVoiceSweetCpInviteRecord.status = jsonParser.getValueAsString();
                    return true;
                case "inviteUsername":
                    bLiveVoiceSweetCpInviteRecord.inviteUsername = jsonParser.getValueAsString();
                    return true;
                case "inviteUserAvatar":
                    bLiveVoiceSweetCpInviteRecord.inviteUserAvatar = jsonParser.getValueAsString();
                    return true;
                case "inviteUserId":
                    bLiveVoiceSweetCpInviteRecord.inviteUserId = jsonParser.getValueAsString();
                    return true;
                case "inviteTime":
                    bLiveVoiceSweetCpInviteRecord.inviteTime = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceSweetCpInviteRecord bLiveVoiceSweetCpInviteRecord, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceSweetCpInviteRecord.inviteUserId;
            if (str != null) {
                jsonGenerator.writeStringField("inviteUserId", str);
            }
            String str2 = bLiveVoiceSweetCpInviteRecord.inviteUsername;
            if (str2 != null) {
                jsonGenerator.writeStringField("inviteUsername", str2);
            }
            String str3 = bLiveVoiceSweetCpInviteRecord.inviteUserAvatar;
            if (str3 != null) {
                jsonGenerator.writeStringField("inviteUserAvatar", str3);
            }
            String str4 = bLiveVoiceSweetCpInviteRecord.inviteTime;
            if (str4 != null) {
                jsonGenerator.writeStringField("inviteTime", str4);
            }
            String str5 = bLiveVoiceSweetCpInviteRecord.status;
            if (str5 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceSweetCpInviteRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicesweetcpinviterecord";

    @NonNull
    @ProtobufIndex(index = 4)
    public String inviteTime;

    @NonNull
    @ProtobufIndex(index = 3)
    public String inviteUserAvatar;

    @NonNull
    @ProtobufIndex(index = 1)
    public String inviteUserId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String inviteUsername;

    @NonNull
    @ProtobufIndex(index = 5)
    public String status;

    public static BLiveVoiceSweetCpInviteRecord new_() {
        BLiveVoiceSweetCpInviteRecord bLiveVoiceSweetCpInviteRecord = new BLiveVoiceSweetCpInviteRecord();
        bLiveVoiceSweetCpInviteRecord.nullCheck();
        return bLiveVoiceSweetCpInviteRecord;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceSweetCpInviteRecord mo223809clone() {
        BLiveVoiceSweetCpInviteRecord bLiveVoiceSweetCpInviteRecord = new BLiveVoiceSweetCpInviteRecord();
        bLiveVoiceSweetCpInviteRecord.inviteUserId = this.inviteUserId;
        bLiveVoiceSweetCpInviteRecord.inviteUsername = this.inviteUsername;
        bLiveVoiceSweetCpInviteRecord.inviteUserAvatar = this.inviteUserAvatar;
        bLiveVoiceSweetCpInviteRecord.inviteTime = this.inviteTime;
        bLiveVoiceSweetCpInviteRecord.status = this.status;
        return bLiveVoiceSweetCpInviteRecord;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceSweetCpInviteRecord)) {
            return false;
        }
        BLiveVoiceSweetCpInviteRecord bLiveVoiceSweetCpInviteRecord = (BLiveVoiceSweetCpInviteRecord) obj;
        return ValueObject.util_equals(this.inviteUserId, bLiveVoiceSweetCpInviteRecord.inviteUserId) && ValueObject.util_equals(this.inviteUsername, bLiveVoiceSweetCpInviteRecord.inviteUsername) && ValueObject.util_equals(this.inviteUserAvatar, bLiveVoiceSweetCpInviteRecord.inviteUserAvatar) && ValueObject.util_equals(this.inviteTime, bLiveVoiceSweetCpInviteRecord.inviteTime) && ValueObject.util_equals(this.status, bLiveVoiceSweetCpInviteRecord.status);
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
        String str = this.inviteUserId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.inviteUsername;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.inviteUserAvatar;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.inviteTime;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.status;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.inviteUserId == null) {
            this.inviteUserId = "";
        }
        if (this.inviteUsername == null) {
            this.inviteUsername = "";
        }
        if (this.inviteUserAvatar == null) {
            this.inviteUserAvatar = "";
        }
        if (this.inviteTime == null) {
            this.inviteTime = "";
        }
        if (this.status == null) {
            this.status = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
