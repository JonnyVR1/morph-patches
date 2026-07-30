package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.StudentVerRejectedReason;
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
public class BLiveVideoChatSummary extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVideoChatSummary> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVideoChatSummary>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVideoChatSummary.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVideoChatSummary.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVideoChatSummary newInstance() {
            return new BLiveVideoChatSummary();
        }

        public boolean parseField(BLiveVideoChatSummary bLiveVideoChatSummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startTime":
                    bLiveVideoChatSummary.startTime = jsonParser.getValueAsLong();
                    return true;
                case "duration":
                    bLiveVideoChatSummary.duration = jsonParser.getValueAsInt();
                    return true;
                case "endTime":
                    bLiveVideoChatSummary.endTime = jsonParser.getValueAsLong();
                    return true;
                case "anchor":
                    bLiveVideoChatSummary.anchor = BLiveVideoChatUser.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "chatId":
                    bLiveVideoChatSummary.chatId = jsonParser.getValueAsString();
                    return true;
                case "liveId":
                    bLiveVideoChatSummary.liveId = jsonParser.getValueAsString();
                    return true;
                case "roomId":
                    bLiveVideoChatSummary.roomId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveVideoChatSummary.f44478id = jsonParser.getValueAsString();
                    return false;
                case "rewardPoint":
                    bLiveVideoChatSummary.rewardPoint = jsonParser.getValueAsLong();
                    return true;
                case "audience":
                    bLiveVideoChatSummary.audience = BLiveVideoChatUser.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "orderMinutes":
                    bLiveVideoChatSummary.orderMinutes = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVideoChatSummary bLiveVideoChatSummary, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVideoChatSummary.f44478id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVideoChatSummary.chatId;
            if (str2 != null) {
                jsonGenerator.writeStringField("chatId", str2);
            }
            String str3 = bLiveVideoChatSummary.liveId;
            if (str3 != null) {
                jsonGenerator.writeStringField("liveId", str3);
            }
            String str4 = bLiveVideoChatSummary.roomId;
            if (str4 != null) {
                jsonGenerator.writeStringField("roomId", str4);
            }
            if (bLiveVideoChatSummary.anchor != null) {
                jsonGenerator.writeFieldName("anchor");
                BLiveVideoChatUser.JSON_ADAPTER.serialize(bLiveVideoChatSummary.anchor, jsonGenerator, true);
            }
            if (bLiveVideoChatSummary.audience != null) {
                jsonGenerator.writeFieldName("audience");
                BLiveVideoChatUser.JSON_ADAPTER.serialize(bLiveVideoChatSummary.audience, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, bLiveVideoChatSummary.duration);
            jsonGenerator.writeNumberField("rewardPoint", bLiveVideoChatSummary.rewardPoint);
            jsonGenerator.writeNumberField("endTime", bLiveVideoChatSummary.endTime);
            jsonGenerator.writeNumberField(StudentVerRejectedReason.startTime, bLiveVideoChatSummary.startTime);
            jsonGenerator.writeNumberField("orderMinutes", bLiveVideoChatSummary.orderMinutes);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVideoChatSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevideochatsummary";

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveVideoChatUser anchor;

    @NonNull
    @ProtobufIndex(index = 6)
    public BLiveVideoChatUser audience;

    @NonNull
    @ProtobufIndex(index = 2)
    public String chatId;

    @ProtobufIndex(index = 7)
    public int duration;

    @ProtobufIndex(index = 9)
    public long endTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44478id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String liveId;

    @ProtobufIndex(index = 11)
    public int orderMinutes;

    @ProtobufIndex(index = 8)
    public long rewardPoint;

    @NonNull
    @ProtobufIndex(index = 4)
    public String roomId;

    @ProtobufIndex(index = 10)
    public long startTime;

    public static BLiveVideoChatSummary new_() {
        BLiveVideoChatSummary bLiveVideoChatSummary = new BLiveVideoChatSummary();
        bLiveVideoChatSummary.nullCheck();
        return bLiveVideoChatSummary;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVideoChatSummary mo223809clone() {
        BLiveVideoChatSummary bLiveVideoChatSummary = new BLiveVideoChatSummary();
        bLiveVideoChatSummary.f44478id = this.f44478id;
        bLiveVideoChatSummary.chatId = this.chatId;
        bLiveVideoChatSummary.liveId = this.liveId;
        bLiveVideoChatSummary.roomId = this.roomId;
        BLiveVideoChatUser bLiveVideoChatUser = this.anchor;
        if (bLiveVideoChatUser != null) {
            bLiveVideoChatSummary.anchor = bLiveVideoChatUser.mo223809clone();
        }
        BLiveVideoChatUser bLiveVideoChatUser2 = this.audience;
        if (bLiveVideoChatUser2 != null) {
            bLiveVideoChatSummary.audience = bLiveVideoChatUser2.mo223809clone();
        }
        bLiveVideoChatSummary.duration = this.duration;
        bLiveVideoChatSummary.rewardPoint = this.rewardPoint;
        bLiveVideoChatSummary.endTime = this.endTime;
        bLiveVideoChatSummary.startTime = this.startTime;
        bLiveVideoChatSummary.orderMinutes = this.orderMinutes;
        return bLiveVideoChatSummary;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVideoChatSummary)) {
            return false;
        }
        BLiveVideoChatSummary bLiveVideoChatSummary = (BLiveVideoChatSummary) obj;
        return ValueObject.util_equals(this.f44478id, bLiveVideoChatSummary.f44478id) && ValueObject.util_equals(this.chatId, bLiveVideoChatSummary.chatId) && ValueObject.util_equals(this.liveId, bLiveVideoChatSummary.liveId) && ValueObject.util_equals(this.roomId, bLiveVideoChatSummary.roomId) && ValueObject.util_equals(this.anchor, bLiveVideoChatSummary.anchor) && ValueObject.util_equals(this.audience, bLiveVideoChatSummary.audience) && this.duration == bLiveVideoChatSummary.duration && this.rewardPoint == bLiveVideoChatSummary.rewardPoint && this.endTime == bLiveVideoChatSummary.endTime && this.startTime == bLiveVideoChatSummary.startTime && this.orderMinutes == bLiveVideoChatSummary.orderMinutes;
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
        String str = this.f44478id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.chatId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.liveId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.roomId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        BLiveVideoChatUser bLiveVideoChatUser = this.anchor;
        int iHashCode5 = (iHashCode4 + (bLiveVideoChatUser != null ? bLiveVideoChatUser.hashCode() : 0)) * 41;
        BLiveVideoChatUser bLiveVideoChatUser2 = this.audience;
        int iHashCode6 = (((iHashCode5 + (bLiveVideoChatUser2 != null ? bLiveVideoChatUser2.hashCode() : 0)) * 41) + this.duration) * 41;
        long j = this.rewardPoint;
        int i3 = (iHashCode6 + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.endTime;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.startTime;
        int i5 = ((i4 + ((int) (j3 ^ (j3 >>> 32)))) * 41) + this.orderMinutes;
        this.hashCode = i5;
        return i5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44478id == null) {
            this.f44478id = "";
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
        if (this.anchor == null) {
            this.anchor = BLiveVideoChatUser.new_();
        }
        if (this.audience == null) {
            this.audience = BLiveVideoChatUser.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
