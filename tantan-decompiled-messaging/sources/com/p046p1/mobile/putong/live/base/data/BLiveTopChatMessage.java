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
public class BLiveTopChatMessage extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveTopChatMessage> JSON_ADAPTER = new ObjectJsonAdapter<BLiveTopChatMessage>() { // from class: com.p1.mobile.putong.live.base.data.BLiveTopChatMessage.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveTopChatMessage.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveTopChatMessage newInstance() {
            return new BLiveTopChatMessage();
        }

        public boolean parseField(BLiveTopChatMessage bLiveTopChatMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startTime":
                    bLiveTopChatMessage.startTime = jsonParser.getValueAsLong();
                    return true;
                case "endTime":
                    bLiveTopChatMessage.endTime = jsonParser.getValueAsLong();
                    return true;
                case "cornerUrl":
                    bLiveTopChatMessage.cornerUrl = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveTopChatMessage.userId = jsonParser.getValueAsString();
                    return true;
                case "maskColor":
                    bLiveTopChatMessage.maskColor = jsonParser.getValueAsString();
                    return true;
                case "seqId":
                    bLiveTopChatMessage.seqId = jsonParser.getValueAsInt();
                    return true;
                case "userImage":
                    bLiveTopChatMessage.userImage = jsonParser.getValueAsString();
                    return true;
                case "currentTime":
                    bLiveTopChatMessage.currentTime = jsonParser.getValueAsLong();
                    return true;
                case "content":
                    bLiveTopChatMessage.content = jsonParser.getValueAsString();
                    return true;
                case "backgroundColor":
                    bLiveTopChatMessage.backgroundColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveTopChatMessage bLiveTopChatMessage, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("seqId", bLiveTopChatMessage.seqId);
            String str = bLiveTopChatMessage.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveTopChatMessage.userImage;
            if (str2 != null) {
                jsonGenerator.writeStringField("userImage", str2);
            }
            String str3 = bLiveTopChatMessage.content;
            if (str3 != null) {
                jsonGenerator.writeStringField("content", str3);
            }
            String str4 = bLiveTopChatMessage.backgroundColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("backgroundColor", str4);
            }
            String str5 = bLiveTopChatMessage.maskColor;
            if (str5 != null) {
                jsonGenerator.writeStringField("maskColor", str5);
            }
            String str6 = bLiveTopChatMessage.cornerUrl;
            if (str6 != null) {
                jsonGenerator.writeStringField("cornerUrl", str6);
            }
            jsonGenerator.writeNumberField("currentTime", bLiveTopChatMessage.currentTime);
            jsonGenerator.writeNumberField("endTime", bLiveTopChatMessage.endTime);
            jsonGenerator.writeNumberField(StudentVerRejectedReason.startTime, bLiveTopChatMessage.startTime);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveTopChatMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivetopchatmessage";

    @NonNull
    @ProtobufIndex(index = 4)
    public String backgroundColor;

    @NonNull
    @ProtobufIndex(index = 7)
    public String content;

    @NonNull
    @ProtobufIndex(index = 5)
    public String cornerUrl;

    @ProtobufIndex(index = 6)
    public long currentTime;

    @ProtobufIndex(index = 10)
    public long endTime;

    @NonNull
    @ProtobufIndex(index = 8)
    public String maskColor;

    @ProtobufIndex(index = 1)
    public int seqId;

    @ProtobufIndex(index = 9)
    public long startTime;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userImage;

    public static BLiveTopChatMessage new_() {
        BLiveTopChatMessage bLiveTopChatMessage = new BLiveTopChatMessage();
        bLiveTopChatMessage.nullCheck();
        return bLiveTopChatMessage;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveTopChatMessage mo223809clone() {
        BLiveTopChatMessage bLiveTopChatMessage = new BLiveTopChatMessage();
        bLiveTopChatMessage.seqId = this.seqId;
        bLiveTopChatMessage.userId = this.userId;
        bLiveTopChatMessage.userImage = this.userImage;
        bLiveTopChatMessage.content = this.content;
        bLiveTopChatMessage.backgroundColor = this.backgroundColor;
        bLiveTopChatMessage.maskColor = this.maskColor;
        bLiveTopChatMessage.cornerUrl = this.cornerUrl;
        bLiveTopChatMessage.currentTime = this.currentTime;
        bLiveTopChatMessage.endTime = this.endTime;
        bLiveTopChatMessage.startTime = this.startTime;
        return bLiveTopChatMessage;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveTopChatMessage)) {
            return false;
        }
        BLiveTopChatMessage bLiveTopChatMessage = (BLiveTopChatMessage) obj;
        return this.seqId == bLiveTopChatMessage.seqId && ValueObject.util_equals(this.userId, bLiveTopChatMessage.userId) && ValueObject.util_equals(this.userImage, bLiveTopChatMessage.userImage) && ValueObject.util_equals(this.content, bLiveTopChatMessage.content) && ValueObject.util_equals(this.backgroundColor, bLiveTopChatMessage.backgroundColor) && ValueObject.util_equals(this.maskColor, bLiveTopChatMessage.maskColor) && ValueObject.util_equals(this.cornerUrl, bLiveTopChatMessage.cornerUrl) && this.currentTime == bLiveTopChatMessage.currentTime && this.endTime == bLiveTopChatMessage.endTime && this.startTime == bLiveTopChatMessage.startTime;
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
        int i2 = ((i * 41) + this.seqId) * 41;
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userImage;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.content;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.backgroundColor;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.maskColor;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.cornerUrl;
        int iHashCode6 = str6 != null ? str6.hashCode() : 0;
        long j = this.currentTime;
        int i3 = (((iHashCode5 + iHashCode6) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.endTime;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.startTime;
        int i5 = i4 + ((int) (j3 ^ (j3 >>> 32)));
        this.hashCode = i5;
        return i5;
    }

    public boolean isInValidMessage() {
        long j = this.currentTime;
        long j2 = 1000 + j;
        long j3 = this.endTime;
        return j2 <= j3 && j3 - j >= 0;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.userImage == null) {
            this.userImage = "";
        }
        if (this.content == null) {
            this.content = "";
        }
        if (this.backgroundColor == null) {
            this.backgroundColor = "";
        }
        if (this.maskColor == null) {
            this.maskColor = "";
        }
        if (this.cornerUrl == null) {
            this.cornerUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
