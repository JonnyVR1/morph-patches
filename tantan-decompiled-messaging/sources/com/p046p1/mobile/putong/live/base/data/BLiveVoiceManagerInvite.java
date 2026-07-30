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
public class BLiveVoiceManagerInvite extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceManagerInvite> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceManagerInvite>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceManagerInvite.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceManagerInvite.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceManagerInvite newInstance() {
            return new BLiveVoiceManagerInvite();
        }

        public boolean parseField(BLiveVoiceManagerInvite bLiveVoiceManagerInvite, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    bLiveVoiceManagerInvite.status = BLiveVoiceManagerInviteStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "userId":
                    bLiveVoiceManagerInvite.userId = jsonParser.getValueAsString();
                    return true;
                case "entryTime":
                    bLiveVoiceManagerInvite.entryTime = jsonParser.getValueAsString();
                    return true;
                case "isOnline":
                    bLiveVoiceManagerInvite.isOnline = jsonParser.getValueAsBoolean();
                    return true;
                case "id":
                    bLiveVoiceManagerInvite.f44505id = jsonParser.getValueAsString();
                    return false;
                case "mask":
                    bLiveVoiceManagerInvite.mask = BLiveUserMask.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "isManager":
                    bLiveVoiceManagerInvite.isManager = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceManagerInvite bLiveVoiceManagerInvite, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceManagerInvite.f44505id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVoiceManagerInvite.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
            if (bLiveVoiceManagerInvite.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                BLiveVoiceManagerInviteStatus.JSON_ADAPTER.serialize(bLiveVoiceManagerInvite.status, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("isManager", bLiveVoiceManagerInvite.isManager);
            jsonGenerator.writeBooleanField("isOnline", bLiveVoiceManagerInvite.isOnline);
            if (bLiveVoiceManagerInvite.mask != null) {
                jsonGenerator.writeFieldName("mask");
                BLiveUserMask.JSON_ADAPTER.serialize(bLiveVoiceManagerInvite.mask, jsonGenerator, true);
            }
            String str3 = bLiveVoiceManagerInvite.entryTime;
            if (str3 != null) {
                jsonGenerator.writeStringField("entryTime", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceManagerInvite) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicemanagerinvite";

    @NonNull
    @ProtobufIndex(index = 8)
    public String entryTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44505id;

    @ProtobufIndex(index = 4)
    public boolean isManager;

    @ProtobufIndex(index = 5)
    public boolean isOnline;

    @NonNull
    @ProtobufIndex(index = 6)
    public BLiveUserMask mask;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveVoiceManagerInviteStatus status;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userId;

    public static BLiveVoiceManagerInvite new_() {
        BLiveVoiceManagerInvite bLiveVoiceManagerInvite = new BLiveVoiceManagerInvite();
        bLiveVoiceManagerInvite.nullCheck();
        return bLiveVoiceManagerInvite;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceManagerInvite mo223809clone() {
        BLiveVoiceManagerInvite bLiveVoiceManagerInvite = new BLiveVoiceManagerInvite();
        bLiveVoiceManagerInvite.f44505id = this.f44505id;
        bLiveVoiceManagerInvite.userId = this.userId;
        bLiveVoiceManagerInvite.status = this.status;
        bLiveVoiceManagerInvite.isManager = this.isManager;
        bLiveVoiceManagerInvite.isOnline = this.isOnline;
        BLiveUserMask bLiveUserMask = this.mask;
        if (bLiveUserMask != null) {
            bLiveVoiceManagerInvite.mask = bLiveUserMask.mo223809clone();
        }
        bLiveVoiceManagerInvite.entryTime = this.entryTime;
        return bLiveVoiceManagerInvite;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceManagerInvite)) {
            return false;
        }
        BLiveVoiceManagerInvite bLiveVoiceManagerInvite = (BLiveVoiceManagerInvite) obj;
        return ValueObject.util_equals(this.f44505id, bLiveVoiceManagerInvite.f44505id) && ValueObject.util_equals(this.userId, bLiveVoiceManagerInvite.userId) && ValueObject.util_equals(this.status, bLiveVoiceManagerInvite.status) && this.isManager == bLiveVoiceManagerInvite.isManager && this.isOnline == bLiveVoiceManagerInvite.isOnline && ValueObject.util_equals(this.mask, bLiveVoiceManagerInvite.mask) && ValueObject.util_equals(this.entryTime, bLiveVoiceManagerInvite.entryTime);
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
        String str = this.f44505id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveVoiceManagerInviteStatus bLiveVoiceManagerInviteStatus = this.status;
        int iHashCode3 = (((((iHashCode2 + (bLiveVoiceManagerInviteStatus != null ? bLiveVoiceManagerInviteStatus.hashCode() : 0)) * 41) + (this.isManager ? 1231 : 1237)) * 41) + (this.isOnline ? 1231 : 1237)) * 41;
        BLiveUserMask bLiveUserMask = this.mask;
        int iHashCode4 = (iHashCode3 + (bLiveUserMask != null ? bLiveUserMask.hashCode() : 0)) * 41;
        String str3 = this.entryTime;
        int iHashCode5 = iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44505id == null) {
            this.f44505id = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.status == null) {
            this.status = (BLiveVoiceManagerInviteStatus) BLiveVoiceManagerInviteStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.mask == null) {
            this.mask = BLiveUserMask.new_();
        }
        if (this.entryTime == null) {
            this.entryTime = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
