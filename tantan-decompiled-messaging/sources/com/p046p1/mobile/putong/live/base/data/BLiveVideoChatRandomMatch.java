package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.LocationInvisibleField;
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
public class BLiveVideoChatRandomMatch extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVideoChatRandomMatch> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVideoChatRandomMatch>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVideoChatRandomMatch.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVideoChatRandomMatch.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVideoChatRandomMatch newInstance() {
            return new BLiveVideoChatRandomMatch();
        }

        public boolean parseField(BLiveVideoChatRandomMatch bLiveVideoChatRandomMatch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "chatId":
                    bLiveVideoChatRandomMatch.chatId = jsonParser.getValueAsString();
                    return true;
                case "liveId":
                    bLiveVideoChatRandomMatch.liveId = jsonParser.getValueAsString();
                    return true;
                case "anchorId":
                    bLiveVideoChatRandomMatch.anchorId = jsonParser.getValueAsString();
                    return true;
                case "roomId":
                    bLiveVideoChatRandomMatch.roomId = jsonParser.getValueAsString();
                    return true;
                case "status":
                    bLiveVideoChatRandomMatch.status = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveVideoChatRandomMatch.userId = jsonParser.getValueAsString();
                    return true;
                case "updatedTime":
                    bLiveVideoChatRandomMatch.updatedTime = jsonParser.getValueAsString();
                    return true;
                case "createdTime":
                    bLiveVideoChatRandomMatch.createdTime = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveVideoChatRandomMatch.f44477id = jsonParser.getValueAsString();
                    return false;
                case "matchTimeoutSec":
                    bLiveVideoChatRandomMatch.matchTimeoutSec = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVideoChatRandomMatch bLiveVideoChatRandomMatch, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVideoChatRandomMatch.f44477id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVideoChatRandomMatch.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
            String str3 = bLiveVideoChatRandomMatch.chatId;
            if (str3 != null) {
                jsonGenerator.writeStringField("chatId", str3);
            }
            String str4 = bLiveVideoChatRandomMatch.liveId;
            if (str4 != null) {
                jsonGenerator.writeStringField("liveId", str4);
            }
            String str5 = bLiveVideoChatRandomMatch.roomId;
            if (str5 != null) {
                jsonGenerator.writeStringField("roomId", str5);
            }
            String str6 = bLiveVideoChatRandomMatch.anchorId;
            if (str6 != null) {
                jsonGenerator.writeStringField("anchorId", str6);
            }
            jsonGenerator.writeNumberField("matchTimeoutSec", bLiveVideoChatRandomMatch.matchTimeoutSec);
            String str7 = bLiveVideoChatRandomMatch.status;
            if (str7 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str7);
            }
            String str8 = bLiveVideoChatRandomMatch.createdTime;
            if (str8 != null) {
                jsonGenerator.writeStringField("createdTime", str8);
            }
            String str9 = bLiveVideoChatRandomMatch.updatedTime;
            if (str9 != null) {
                jsonGenerator.writeStringField(LocationInvisibleField.updatedTime, str9);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVideoChatRandomMatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevideochatrandommatch";

    @NonNull
    @ProtobufIndex(index = 6)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String chatId;

    @NonNull
    @ProtobufIndex(index = 9)
    public String createdTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44477id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String liveId;

    @ProtobufIndex(index = 7)
    public int matchTimeoutSec;

    @NonNull
    @ProtobufIndex(index = 5)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 8)
    public String status;

    @NonNull
    @ProtobufIndex(index = 10)
    public String updatedTime;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userId;

    public static BLiveVideoChatRandomMatch new_() {
        BLiveVideoChatRandomMatch bLiveVideoChatRandomMatch = new BLiveVideoChatRandomMatch();
        bLiveVideoChatRandomMatch.nullCheck();
        return bLiveVideoChatRandomMatch;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVideoChatRandomMatch mo223809clone() {
        BLiveVideoChatRandomMatch bLiveVideoChatRandomMatch = new BLiveVideoChatRandomMatch();
        bLiveVideoChatRandomMatch.f44477id = this.f44477id;
        bLiveVideoChatRandomMatch.userId = this.userId;
        bLiveVideoChatRandomMatch.chatId = this.chatId;
        bLiveVideoChatRandomMatch.liveId = this.liveId;
        bLiveVideoChatRandomMatch.roomId = this.roomId;
        bLiveVideoChatRandomMatch.anchorId = this.anchorId;
        bLiveVideoChatRandomMatch.matchTimeoutSec = this.matchTimeoutSec;
        bLiveVideoChatRandomMatch.status = this.status;
        bLiveVideoChatRandomMatch.createdTime = this.createdTime;
        bLiveVideoChatRandomMatch.updatedTime = this.updatedTime;
        return bLiveVideoChatRandomMatch;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVideoChatRandomMatch)) {
            return false;
        }
        BLiveVideoChatRandomMatch bLiveVideoChatRandomMatch = (BLiveVideoChatRandomMatch) obj;
        return ValueObject.util_equals(this.f44477id, bLiveVideoChatRandomMatch.f44477id) && ValueObject.util_equals(this.userId, bLiveVideoChatRandomMatch.userId) && ValueObject.util_equals(this.chatId, bLiveVideoChatRandomMatch.chatId) && ValueObject.util_equals(this.liveId, bLiveVideoChatRandomMatch.liveId) && ValueObject.util_equals(this.roomId, bLiveVideoChatRandomMatch.roomId) && ValueObject.util_equals(this.anchorId, bLiveVideoChatRandomMatch.anchorId) && this.matchTimeoutSec == bLiveVideoChatRandomMatch.matchTimeoutSec && ValueObject.util_equals(this.status, bLiveVideoChatRandomMatch.status) && ValueObject.util_equals(this.createdTime, bLiveVideoChatRandomMatch.createdTime) && ValueObject.util_equals(this.updatedTime, bLiveVideoChatRandomMatch.updatedTime);
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
        String str = this.f44477id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.chatId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.liveId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.roomId;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.anchorId;
        int iHashCode6 = (((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41) + this.matchTimeoutSec) * 41;
        String str7 = this.status;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.createdTime;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.updatedTime;
        int iHashCode9 = iHashCode8 + (str9 != null ? str9.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44477id == null) {
            this.f44477id = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.chatId == null) {
            this.chatId = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.createdTime == null) {
            this.createdTime = "";
        }
        if (this.updatedTime == null) {
            this.updatedTime = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
