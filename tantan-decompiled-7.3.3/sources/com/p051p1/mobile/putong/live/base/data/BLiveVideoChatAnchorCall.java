package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVideoChatAnchorCall extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVideoChatAnchorCall> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVideoChatAnchorCall>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVideoChatAnchorCall.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVideoChatAnchorCall.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVideoChatAnchorCall newInstance() {
            return new BLiveVideoChatAnchorCall();
        }

        public boolean parseField(BLiveVideoChatAnchorCall bLiveVideoChatAnchorCall, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "liveId":
                    bLiveVideoChatAnchorCall.liveId = jsonParser.getValueAsString();
                    return true;
                case "anchorId":
                    bLiveVideoChatAnchorCall.anchorId = jsonParser.getValueAsString();
                    return true;
                case "roomId":
                    bLiveVideoChatAnchorCall.roomId = jsonParser.getValueAsString();
                    return true;
                case "status":
                    bLiveVideoChatAnchorCall.status = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveVideoChatAnchorCall.userId = jsonParser.getValueAsString();
                    return true;
                case "updatedDate":
                    bLiveVideoChatAnchorCall.updatedDate = jsonParser.getValueAsLong();
                    return true;
                case "createdTime":
                    bLiveVideoChatAnchorCall.createdTime = jsonParser.getValueAsLong();
                    return true;
                case "id":
                    bLiveVideoChatAnchorCall.f45323id = jsonParser.getValueAsString();
                    return false;
                case "ttc":
                    bLiveVideoChatAnchorCall.ttc = jsonParser.getValueAsLong();
                    return true;
                case "user":
                    bLiveVideoChatAnchorCall.user = BLiveVideoChatUser.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVideoChatAnchorCall bLiveVideoChatAnchorCall, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVideoChatAnchorCall.f45323id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVideoChatAnchorCall.roomId;
            if (str2 != null) {
                jsonGenerator.writeStringField("roomId", str2);
            }
            String str3 = bLiveVideoChatAnchorCall.liveId;
            if (str3 != null) {
                jsonGenerator.writeStringField("liveId", str3);
            }
            String str4 = bLiveVideoChatAnchorCall.anchorId;
            if (str4 != null) {
                jsonGenerator.writeStringField("anchorId", str4);
            }
            String str5 = bLiveVideoChatAnchorCall.userId;
            if (str5 != null) {
                jsonGenerator.writeStringField("userId", str5);
            }
            if (bLiveVideoChatAnchorCall.user != null) {
                jsonGenerator.writeFieldName("user");
                BLiveVideoChatUser.JSON_ADAPTER.serialize(bLiveVideoChatAnchorCall.user, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("ttc", bLiveVideoChatAnchorCall.ttc);
            String str6 = bLiveVideoChatAnchorCall.status;
            if (str6 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str6);
            }
            jsonGenerator.writeNumberField("createdTime", bLiveVideoChatAnchorCall.createdTime);
            jsonGenerator.writeNumberField("updatedDate", bLiveVideoChatAnchorCall.updatedDate);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVideoChatAnchorCall) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevideochatanchorcall";

    @NonNull
    @ProtobufIndex(index = 4)
    public String anchorId;

    @ProtobufIndex(index = 9)
    public long createdTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45323id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 8)
    public String status;

    @ProtobufIndex(index = 7)
    public long ttc;

    @ProtobufIndex(index = 10)
    public long updatedDate;

    @NonNull
    @ProtobufIndex(index = 6)
    public BLiveVideoChatUser user;

    @NonNull
    @ProtobufIndex(index = 5)
    public String userId;

    public static BLiveVideoChatAnchorCall new_() {
        BLiveVideoChatAnchorCall bLiveVideoChatAnchorCall = new BLiveVideoChatAnchorCall();
        bLiveVideoChatAnchorCall.nullCheck();
        return bLiveVideoChatAnchorCall;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVideoChatAnchorCall mo225055clone() {
        BLiveVideoChatAnchorCall bLiveVideoChatAnchorCall = new BLiveVideoChatAnchorCall();
        bLiveVideoChatAnchorCall.f45323id = this.f45323id;
        bLiveVideoChatAnchorCall.roomId = this.roomId;
        bLiveVideoChatAnchorCall.liveId = this.liveId;
        bLiveVideoChatAnchorCall.anchorId = this.anchorId;
        bLiveVideoChatAnchorCall.userId = this.userId;
        BLiveVideoChatUser bLiveVideoChatUser = this.user;
        if (bLiveVideoChatUser != null) {
            bLiveVideoChatAnchorCall.user = bLiveVideoChatUser.mo225055clone();
        }
        bLiveVideoChatAnchorCall.ttc = this.ttc;
        bLiveVideoChatAnchorCall.status = this.status;
        bLiveVideoChatAnchorCall.createdTime = this.createdTime;
        bLiveVideoChatAnchorCall.updatedDate = this.updatedDate;
        return bLiveVideoChatAnchorCall;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVideoChatAnchorCall)) {
            return false;
        }
        BLiveVideoChatAnchorCall bLiveVideoChatAnchorCall = (BLiveVideoChatAnchorCall) obj;
        return ValueObject.util_equals(this.f45323id, bLiveVideoChatAnchorCall.f45323id) && ValueObject.util_equals(this.roomId, bLiveVideoChatAnchorCall.roomId) && ValueObject.util_equals(this.liveId, bLiveVideoChatAnchorCall.liveId) && ValueObject.util_equals(this.anchorId, bLiveVideoChatAnchorCall.anchorId) && ValueObject.util_equals(this.userId, bLiveVideoChatAnchorCall.userId) && ValueObject.util_equals(this.user, bLiveVideoChatAnchorCall.user) && this.ttc == bLiveVideoChatAnchorCall.ttc && ValueObject.util_equals(this.status, bLiveVideoChatAnchorCall.status) && this.createdTime == bLiveVideoChatAnchorCall.createdTime && this.updatedDate == bLiveVideoChatAnchorCall.updatedDate;
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
        String str = this.f45323id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.roomId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.liveId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.anchorId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.userId;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        BLiveVideoChatUser bLiveVideoChatUser = this.user;
        int iHashCode6 = bLiveVideoChatUser != null ? bLiveVideoChatUser.hashCode() : 0;
        long j = this.ttc;
        int i3 = (((iHashCode5 + iHashCode6) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str6 = this.status;
        int iHashCode7 = (i3 + (str6 != null ? str6.hashCode() : 0)) * 41;
        long j2 = this.createdTime;
        int i4 = (iHashCode7 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.updatedDate;
        int i5 = i4 + ((int) (j3 ^ (j3 >>> 32)));
        this.hashCode = i5;
        return i5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45323id == null) {
            this.f45323id = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.user == null) {
            this.user = BLiveVideoChatUser.new_();
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
