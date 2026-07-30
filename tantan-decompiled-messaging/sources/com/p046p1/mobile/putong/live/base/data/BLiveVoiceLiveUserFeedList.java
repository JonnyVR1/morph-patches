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
public class BLiveVoiceLiveUserFeedList extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceLiveUserFeedList> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceLiveUserFeedList>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceLiveUserFeedList.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceLiveUserFeedList.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceLiveUserFeedList newInstance() {
            return new BLiveVoiceLiveUserFeedList();
        }

        public boolean parseField(BLiveVoiceLiveUserFeedList bLiveVoiceLiveUserFeedList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    bLiveVoiceLiveUserFeedList.userId = jsonParser.getValueAsString();
                    return true;
                case "streamUrl":
                    bLiveVoiceLiveUserFeedList.streamUrl = BLiveStreamUrl.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "voiceLiveId":
                    bLiveVoiceLiveUserFeedList.voiceLiveId = jsonParser.getValueAsString();
                    return true;
                case "relationship":
                    bLiveVoiceLiveUserFeedList.relationship = jsonParser.getValueAsString();
                    return true;
                case "voiceRoomId":
                    bLiveVoiceLiveUserFeedList.voiceRoomId = jsonParser.getValueAsString();
                    return true;
                case "streamCdnInfo":
                    bLiveVoiceLiveUserFeedList.streamCdnInfo = BLiveStreamCdnInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceLiveUserFeedList bLiveVoiceLiveUserFeedList, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceLiveUserFeedList.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveVoiceLiveUserFeedList.voiceLiveId;
            if (str2 != null) {
                jsonGenerator.writeStringField("voiceLiveId", str2);
            }
            String str3 = bLiveVoiceLiveUserFeedList.voiceRoomId;
            if (str3 != null) {
                jsonGenerator.writeStringField("voiceRoomId", str3);
            }
            String str4 = bLiveVoiceLiveUserFeedList.relationship;
            if (str4 != null) {
                jsonGenerator.writeStringField("relationship", str4);
            }
            if (bLiveVoiceLiveUserFeedList.streamCdnInfo != null) {
                jsonGenerator.writeFieldName("streamCdnInfo");
                BLiveStreamCdnInfo.JSON_ADAPTER.serialize(bLiveVoiceLiveUserFeedList.streamCdnInfo, jsonGenerator, true);
            }
            if (bLiveVoiceLiveUserFeedList.streamUrl != null) {
                jsonGenerator.writeFieldName("streamUrl");
                BLiveStreamUrl.JSON_ADAPTER.serialize(bLiveVoiceLiveUserFeedList.streamUrl, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceLiveUserFeedList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceliveuserfeedlist";

    @NonNull
    @ProtobufIndex(index = 4)
    public String relationship;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveStreamCdnInfo streamCdnInfo;

    @NonNull
    @ProtobufIndex(index = 6)
    public BLiveStreamUrl streamUrl;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String voiceLiveId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String voiceRoomId;

    public static BLiveVoiceLiveUserFeedList new_() {
        BLiveVoiceLiveUserFeedList bLiveVoiceLiveUserFeedList = new BLiveVoiceLiveUserFeedList();
        bLiveVoiceLiveUserFeedList.nullCheck();
        return bLiveVoiceLiveUserFeedList;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceLiveUserFeedList mo223809clone() {
        BLiveVoiceLiveUserFeedList bLiveVoiceLiveUserFeedList = new BLiveVoiceLiveUserFeedList();
        bLiveVoiceLiveUserFeedList.userId = this.userId;
        bLiveVoiceLiveUserFeedList.voiceLiveId = this.voiceLiveId;
        bLiveVoiceLiveUserFeedList.voiceRoomId = this.voiceRoomId;
        bLiveVoiceLiveUserFeedList.relationship = this.relationship;
        BLiveStreamCdnInfo bLiveStreamCdnInfo = this.streamCdnInfo;
        if (bLiveStreamCdnInfo != null) {
            bLiveVoiceLiveUserFeedList.streamCdnInfo = bLiveStreamCdnInfo.mo223809clone();
        }
        BLiveStreamUrl bLiveStreamUrl = this.streamUrl;
        if (bLiveStreamUrl != null) {
            bLiveVoiceLiveUserFeedList.streamUrl = bLiveStreamUrl.mo223809clone();
        }
        return bLiveVoiceLiveUserFeedList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceLiveUserFeedList)) {
            return false;
        }
        BLiveVoiceLiveUserFeedList bLiveVoiceLiveUserFeedList = (BLiveVoiceLiveUserFeedList) obj;
        return ValueObject.util_equals(this.userId, bLiveVoiceLiveUserFeedList.userId) && ValueObject.util_equals(this.voiceLiveId, bLiveVoiceLiveUserFeedList.voiceLiveId) && ValueObject.util_equals(this.voiceRoomId, bLiveVoiceLiveUserFeedList.voiceRoomId) && ValueObject.util_equals(this.relationship, bLiveVoiceLiveUserFeedList.relationship) && ValueObject.util_equals(this.streamCdnInfo, bLiveVoiceLiveUserFeedList.streamCdnInfo) && ValueObject.util_equals(this.streamUrl, bLiveVoiceLiveUserFeedList.streamUrl);
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
        String str2 = this.voiceLiveId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.voiceRoomId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.relationship;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        BLiveStreamCdnInfo bLiveStreamCdnInfo = this.streamCdnInfo;
        int iHashCode5 = (iHashCode4 + (bLiveStreamCdnInfo != null ? bLiveStreamCdnInfo.hashCode() : 0)) * 41;
        BLiveStreamUrl bLiveStreamUrl = this.streamUrl;
        int iHashCode6 = iHashCode5 + (bLiveStreamUrl != null ? bLiveStreamUrl.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.voiceLiveId == null) {
            this.voiceLiveId = "";
        }
        if (this.voiceRoomId == null) {
            this.voiceRoomId = "";
        }
        if (this.relationship == null) {
            this.relationship = "";
        }
        if (this.streamCdnInfo == null) {
            this.streamCdnInfo = BLiveStreamCdnInfo.new_();
        }
        if (this.streamUrl == null) {
            this.streamUrl = BLiveStreamUrl.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
