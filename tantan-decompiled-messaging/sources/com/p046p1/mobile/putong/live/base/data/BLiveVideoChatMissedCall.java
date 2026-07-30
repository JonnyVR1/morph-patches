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
public class BLiveVideoChatMissedCall extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVideoChatMissedCall> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVideoChatMissedCall>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVideoChatMissedCall.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVideoChatMissedCall.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVideoChatMissedCall newInstance() {
            return new BLiveVideoChatMissedCall();
        }

        public boolean parseField(BLiveVideoChatMissedCall bLiveVideoChatMissedCall, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "avatar":
                    bLiveVideoChatMissedCall.avatar = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveVideoChatMissedCall.userId = jsonParser.getValueAsString();
                    return true;
                case "canCallUser":
                    bLiveVideoChatMissedCall.canCallUser = jsonParser.getValueAsBoolean();
                    return true;
                case "isOnline":
                    bLiveVideoChatMissedCall.isOnline = jsonParser.getValueAsBoolean();
                    return true;
                case "userName":
                    bLiveVideoChatMissedCall.userName = jsonParser.getValueAsString();
                    return true;
                case "isNew":
                    bLiveVideoChatMissedCall.isNew = jsonParser.getValueAsBoolean();
                    return true;
                case "calledTime":
                    bLiveVideoChatMissedCall.calledTime = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVideoChatMissedCall bLiveVideoChatMissedCall, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVideoChatMissedCall.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveVideoChatMissedCall.userName;
            if (str2 != null) {
                jsonGenerator.writeStringField("userName", str2);
            }
            String str3 = bLiveVideoChatMissedCall.avatar;
            if (str3 != null) {
                jsonGenerator.writeStringField("avatar", str3);
            }
            jsonGenerator.writeBooleanField("isOnline", bLiveVideoChatMissedCall.isOnline);
            jsonGenerator.writeBooleanField("isNew", bLiveVideoChatMissedCall.isNew);
            jsonGenerator.writeNumberField("calledTime", bLiveVideoChatMissedCall.calledTime);
            jsonGenerator.writeBooleanField("canCallUser", bLiveVideoChatMissedCall.canCallUser);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVideoChatMissedCall) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevideochatmissedcall";

    @NonNull
    @ProtobufIndex(index = 3)
    public String avatar;

    @ProtobufIndex(index = 6)
    public long calledTime;

    @ProtobufIndex(index = 7)
    public boolean canCallUser;

    @ProtobufIndex(index = 5)
    public boolean isNew;

    @ProtobufIndex(index = 4)
    public boolean isOnline;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userName;

    public static BLiveVideoChatMissedCall new_() {
        BLiveVideoChatMissedCall bLiveVideoChatMissedCall = new BLiveVideoChatMissedCall();
        bLiveVideoChatMissedCall.nullCheck();
        return bLiveVideoChatMissedCall;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVideoChatMissedCall mo223809clone() {
        BLiveVideoChatMissedCall bLiveVideoChatMissedCall = new BLiveVideoChatMissedCall();
        bLiveVideoChatMissedCall.userId = this.userId;
        bLiveVideoChatMissedCall.userName = this.userName;
        bLiveVideoChatMissedCall.avatar = this.avatar;
        bLiveVideoChatMissedCall.isOnline = this.isOnline;
        bLiveVideoChatMissedCall.isNew = this.isNew;
        bLiveVideoChatMissedCall.calledTime = this.calledTime;
        bLiveVideoChatMissedCall.canCallUser = this.canCallUser;
        return bLiveVideoChatMissedCall;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVideoChatMissedCall)) {
            return false;
        }
        BLiveVideoChatMissedCall bLiveVideoChatMissedCall = (BLiveVideoChatMissedCall) obj;
        return ValueObject.util_equals(this.userId, bLiveVideoChatMissedCall.userId) && ValueObject.util_equals(this.userName, bLiveVideoChatMissedCall.userName) && ValueObject.util_equals(this.avatar, bLiveVideoChatMissedCall.avatar) && this.isOnline == bLiveVideoChatMissedCall.isOnline && this.isNew == bLiveVideoChatMissedCall.isNew && this.calledTime == bLiveVideoChatMissedCall.calledTime && this.canCallUser == bLiveVideoChatMissedCall.canCallUser;
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
        String str2 = this.userName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.avatar;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.isOnline ? 1231 : 1237)) * 41;
        int i3 = this.isNew ? 1231 : 1237;
        long j = this.calledTime;
        int i4 = ((((iHashCode3 + i3) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + (this.canCallUser ? 1231 : 1237);
        this.hashCode = i4;
        return i4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
