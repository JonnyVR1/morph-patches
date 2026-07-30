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
public class BLiveVideoChatLive extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVideoChatLive> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVideoChatLive>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVideoChatLive.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVideoChatLive.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVideoChatLive newInstance() {
            return new BLiveVideoChatLive();
        }

        public boolean parseField(BLiveVideoChatLive bLiveVideoChatLive, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "anchor":
                    bLiveVideoChatLive.anchor = BLiveVideoChatUser.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "startedTime":
                    bLiveVideoChatLive.startedTime = jsonParser.getValueAsLong();
                    return true;
                case "anchorId":
                    bLiveVideoChatLive.anchorId = jsonParser.getValueAsString();
                    return true;
                case "roomId":
                    bLiveVideoChatLive.roomId = jsonParser.getValueAsString();
                    return true;
                case "status":
                    bLiveVideoChatLive.status = jsonParser.getValueAsString();
                    return true;
                case "autoAnswerConfig":
                    bLiveVideoChatLive.autoAnswerConfig = BLiveCommonConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    bLiveVideoChatLive.f44476id = jsonParser.getValueAsString();
                    return false;
                case "ttc":
                    bLiveVideoChatLive.ttc = jsonParser.getValueAsLong();
                    return true;
                case "punishMessage":
                    bLiveVideoChatLive.punishMessage = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVideoChatLive bLiveVideoChatLive, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVideoChatLive.f44476id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVideoChatLive.anchorId;
            if (str2 != null) {
                jsonGenerator.writeStringField("anchorId", str2);
            }
            String str3 = bLiveVideoChatLive.roomId;
            if (str3 != null) {
                jsonGenerator.writeStringField("roomId", str3);
            }
            String str4 = bLiveVideoChatLive.status;
            if (str4 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str4);
            }
            jsonGenerator.writeNumberField("startedTime", bLiveVideoChatLive.startedTime);
            if (bLiveVideoChatLive.anchor != null) {
                jsonGenerator.writeFieldName("anchor");
                BLiveVideoChatUser.JSON_ADAPTER.serialize(bLiveVideoChatLive.anchor, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("ttc", bLiveVideoChatLive.ttc);
            String str5 = bLiveVideoChatLive.punishMessage;
            if (str5 != null) {
                jsonGenerator.writeStringField("punishMessage", str5);
            }
            if (bLiveVideoChatLive.autoAnswerConfig != null) {
                jsonGenerator.writeFieldName("autoAnswerConfig");
                BLiveCommonConfig.JSON_ADAPTER.serialize(bLiveVideoChatLive.autoAnswerConfig, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVideoChatLive) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevideochatlive";

    @NonNull
    @ProtobufIndex(index = 6)
    public BLiveVideoChatUser anchor;

    @NonNull
    @ProtobufIndex(index = 2)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 9)
    public BLiveCommonConfig autoAnswerConfig;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44476id;

    @NonNull
    @ProtobufIndex(index = 8)
    public String punishMessage;

    @NonNull
    @ProtobufIndex(index = 3)
    public String roomId;

    @ProtobufIndex(index = 5)
    public long startedTime;

    @NonNull
    @ProtobufIndex(index = 4)
    public String status;

    @ProtobufIndex(index = 7)
    public long ttc;

    public static BLiveVideoChatLive new_() {
        BLiveVideoChatLive bLiveVideoChatLive = new BLiveVideoChatLive();
        bLiveVideoChatLive.nullCheck();
        return bLiveVideoChatLive;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVideoChatLive mo223809clone() {
        BLiveVideoChatLive bLiveVideoChatLive = new BLiveVideoChatLive();
        bLiveVideoChatLive.f44476id = this.f44476id;
        bLiveVideoChatLive.anchorId = this.anchorId;
        bLiveVideoChatLive.roomId = this.roomId;
        bLiveVideoChatLive.status = this.status;
        bLiveVideoChatLive.startedTime = this.startedTime;
        BLiveVideoChatUser bLiveVideoChatUser = this.anchor;
        if (bLiveVideoChatUser != null) {
            bLiveVideoChatLive.anchor = bLiveVideoChatUser.mo223809clone();
        }
        bLiveVideoChatLive.ttc = this.ttc;
        bLiveVideoChatLive.punishMessage = this.punishMessage;
        BLiveCommonConfig bLiveCommonConfig = this.autoAnswerConfig;
        if (bLiveCommonConfig != null) {
            bLiveVideoChatLive.autoAnswerConfig = bLiveCommonConfig.mo223809clone();
        }
        return bLiveVideoChatLive;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVideoChatLive)) {
            return false;
        }
        BLiveVideoChatLive bLiveVideoChatLive = (BLiveVideoChatLive) obj;
        return ValueObject.util_equals(this.f44476id, bLiveVideoChatLive.f44476id) && ValueObject.util_equals(this.anchorId, bLiveVideoChatLive.anchorId) && ValueObject.util_equals(this.roomId, bLiveVideoChatLive.roomId) && ValueObject.util_equals(this.status, bLiveVideoChatLive.status) && this.startedTime == bLiveVideoChatLive.startedTime && ValueObject.util_equals(this.anchor, bLiveVideoChatLive.anchor) && this.ttc == bLiveVideoChatLive.ttc && ValueObject.util_equals(this.punishMessage, bLiveVideoChatLive.punishMessage) && ValueObject.util_equals(this.autoAnswerConfig, bLiveVideoChatLive.autoAnswerConfig);
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
        String str = this.f44476id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.anchorId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.roomId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.status;
        int iHashCode4 = str4 != null ? str4.hashCode() : 0;
        long j = this.startedTime;
        int i3 = (((iHashCode3 + iHashCode4) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        BLiveVideoChatUser bLiveVideoChatUser = this.anchor;
        int iHashCode5 = (i3 + (bLiveVideoChatUser != null ? bLiveVideoChatUser.hashCode() : 0)) * 41;
        long j2 = this.ttc;
        int i4 = (iHashCode5 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str5 = this.punishMessage;
        int iHashCode6 = (i4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        BLiveCommonConfig bLiveCommonConfig = this.autoAnswerConfig;
        int iHashCode7 = iHashCode6 + (bLiveCommonConfig != null ? bLiveCommonConfig.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44476id == null) {
            this.f44476id = "";
        }
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.anchor == null) {
            this.anchor = BLiveVideoChatUser.new_();
        }
        if (this.punishMessage == null) {
            this.punishMessage = "";
        }
        if (this.autoAnswerConfig == null) {
            this.autoAnswerConfig = BLiveCommonConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
