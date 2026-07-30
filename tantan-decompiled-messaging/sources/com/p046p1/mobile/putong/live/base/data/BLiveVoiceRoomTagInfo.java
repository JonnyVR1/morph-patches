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
public class BLiveVoiceRoomTagInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceRoomTagInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceRoomTagInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceRoomTagInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceRoomTagInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceRoomTagInfo newInstance() {
            return new BLiveVoiceRoomTagInfo();
        }

        public boolean parseField(BLiveVoiceRoomTagInfo bLiveVoiceRoomTagInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bubble":
                    bLiveVoiceRoomTagInfo.bubble = BLiveVoiceTagBubble.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "roomId":
                    bLiveVoiceRoomTagInfo.roomId = jsonParser.getValueAsString();
                    return true;
                case "tagValue":
                    bLiveVoiceRoomTagInfo.tagValue = jsonParser.getValueAsString();
                    return true;
                case "targetUserId":
                    bLiveVoiceRoomTagInfo.targetUserId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceRoomTagInfo bLiveVoiceRoomTagInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceRoomTagInfo.roomId;
            if (str != null) {
                jsonGenerator.writeStringField("roomId", str);
            }
            String str2 = bLiveVoiceRoomTagInfo.targetUserId;
            if (str2 != null) {
                jsonGenerator.writeStringField("targetUserId", str2);
            }
            String str3 = bLiveVoiceRoomTagInfo.tagValue;
            if (str3 != null) {
                jsonGenerator.writeStringField("tagValue", str3);
            }
            if (bLiveVoiceRoomTagInfo.bubble != null) {
                jsonGenerator.writeFieldName("bubble");
                BLiveVoiceTagBubble.JSON_ADAPTER.serialize(bLiveVoiceRoomTagInfo.bubble, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceRoomTagInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceroomtaginfo";

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveVoiceTagBubble bubble;

    @NonNull
    @ProtobufIndex(index = 1)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String tagValue;

    @NonNull
    @ProtobufIndex(index = 2)
    public String targetUserId;

    public static BLiveVoiceRoomTagInfo new_() {
        BLiveVoiceRoomTagInfo bLiveVoiceRoomTagInfo = new BLiveVoiceRoomTagInfo();
        bLiveVoiceRoomTagInfo.nullCheck();
        return bLiveVoiceRoomTagInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceRoomTagInfo mo223809clone() {
        BLiveVoiceRoomTagInfo bLiveVoiceRoomTagInfo = new BLiveVoiceRoomTagInfo();
        bLiveVoiceRoomTagInfo.roomId = this.roomId;
        bLiveVoiceRoomTagInfo.targetUserId = this.targetUserId;
        bLiveVoiceRoomTagInfo.tagValue = this.tagValue;
        BLiveVoiceTagBubble bLiveVoiceTagBubble = this.bubble;
        if (bLiveVoiceTagBubble != null) {
            bLiveVoiceRoomTagInfo.bubble = bLiveVoiceTagBubble.mo223809clone();
        }
        return bLiveVoiceRoomTagInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceRoomTagInfo)) {
            return false;
        }
        BLiveVoiceRoomTagInfo bLiveVoiceRoomTagInfo = (BLiveVoiceRoomTagInfo) obj;
        return ValueObject.util_equals(this.roomId, bLiveVoiceRoomTagInfo.roomId) && ValueObject.util_equals(this.targetUserId, bLiveVoiceRoomTagInfo.targetUserId) && ValueObject.util_equals(this.tagValue, bLiveVoiceRoomTagInfo.tagValue) && ValueObject.util_equals(this.bubble, bLiveVoiceRoomTagInfo.bubble);
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
        String str = this.roomId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.targetUserId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.tagValue;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        BLiveVoiceTagBubble bLiveVoiceTagBubble = this.bubble;
        int iHashCode4 = iHashCode3 + (bLiveVoiceTagBubble != null ? bLiveVoiceTagBubble.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.targetUserId == null) {
            this.targetUserId = "";
        }
        if (this.tagValue == null) {
            this.tagValue = "";
        }
        if (this.bubble == null) {
            this.bubble = BLiveVoiceTagBubble.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
