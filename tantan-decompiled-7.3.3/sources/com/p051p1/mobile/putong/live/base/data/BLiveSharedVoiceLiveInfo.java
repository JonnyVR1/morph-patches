package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
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
public class BLiveSharedVoiceLiveInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSharedVoiceLiveInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSharedVoiceLiveInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSharedVoiceLiveInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSharedVoiceLiveInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSharedVoiceLiveInfo newInstance() {
            return new BLiveSharedVoiceLiveInfo();
        }

        public boolean parseField(BLiveSharedVoiceLiveInfo bLiveSharedVoiceLiveInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "audienceCount":
                    bLiveSharedVoiceLiveInfo.audienceCount = jsonParser.getValueAsInt();
                    return true;
                case "description":
                    bLiveSharedVoiceLiveInfo.description = jsonParser.getValueAsString();
                    return true;
                case "liveId":
                    bLiveSharedVoiceLiveInfo.liveId = jsonParser.getValueAsString();
                    return true;
                case "anchorId":
                    bLiveSharedVoiceLiveInfo.anchorId = jsonParser.getValueAsString();
                    return true;
                case "roomId":
                    bLiveSharedVoiceLiveInfo.roomId = jsonParser.getValueAsString();
                    return true;
                case "voiceCallCount":
                    bLiveSharedVoiceLiveInfo.voiceCallCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSharedVoiceLiveInfo bLiveSharedVoiceLiveInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSharedVoiceLiveInfo.roomId;
            if (str != null) {
                jsonGenerator.writeStringField("roomId", str);
            }
            String str2 = bLiveSharedVoiceLiveInfo.liveId;
            if (str2 != null) {
                jsonGenerator.writeStringField("liveId", str2);
            }
            String str3 = bLiveSharedVoiceLiveInfo.description;
            if (str3 != null) {
                jsonGenerator.writeStringField("description", str3);
            }
            String str4 = bLiveSharedVoiceLiveInfo.anchorId;
            if (str4 != null) {
                jsonGenerator.writeStringField("anchorId", str4);
            }
            jsonGenerator.writeNumberField("audienceCount", bLiveSharedVoiceLiveInfo.audienceCount);
            jsonGenerator.writeNumberField("voiceCallCount", bLiveSharedVoiceLiveInfo.voiceCallCount);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSharedVoiceLiveInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesharedvoiceliveinfo";

    @NonNull
    @ProtobufIndex(index = 56)
    public String anchorId;

    @ProtobufIndex(index = 54)
    public int audienceCount;

    @NonNull
    @ProtobufIndex(index = 53)
    public String description;

    @NonNull
    @ProtobufIndex(index = 52)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 51)
    public String roomId;

    @ProtobufIndex(index = 55)
    public int voiceCallCount;

    public static BLiveSharedVoiceLiveInfo new_() {
        BLiveSharedVoiceLiveInfo bLiveSharedVoiceLiveInfo = new BLiveSharedVoiceLiveInfo();
        bLiveSharedVoiceLiveInfo.nullCheck();
        return bLiveSharedVoiceLiveInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSharedVoiceLiveInfo mo225055clone() {
        BLiveSharedVoiceLiveInfo bLiveSharedVoiceLiveInfo = new BLiveSharedVoiceLiveInfo();
        bLiveSharedVoiceLiveInfo.roomId = this.roomId;
        bLiveSharedVoiceLiveInfo.liveId = this.liveId;
        bLiveSharedVoiceLiveInfo.description = this.description;
        bLiveSharedVoiceLiveInfo.anchorId = this.anchorId;
        bLiveSharedVoiceLiveInfo.audienceCount = this.audienceCount;
        bLiveSharedVoiceLiveInfo.voiceCallCount = this.voiceCallCount;
        return bLiveSharedVoiceLiveInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSharedVoiceLiveInfo)) {
            return false;
        }
        BLiveSharedVoiceLiveInfo bLiveSharedVoiceLiveInfo = (BLiveSharedVoiceLiveInfo) obj;
        return ValueObject.util_equals(this.roomId, bLiveSharedVoiceLiveInfo.roomId) && ValueObject.util_equals(this.liveId, bLiveSharedVoiceLiveInfo.liveId) && ValueObject.util_equals(this.description, bLiveSharedVoiceLiveInfo.description) && ValueObject.util_equals(this.anchorId, bLiveSharedVoiceLiveInfo.anchorId) && this.audienceCount == bLiveSharedVoiceLiveInfo.audienceCount && this.voiceCallCount == bLiveSharedVoiceLiveInfo.voiceCallCount;
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
        String str2 = this.liveId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.description;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.anchorId;
        int iHashCode4 = ((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.audienceCount) * 41) + this.voiceCallCount;
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.description == null) {
            this.description = "";
        }
        if (this.anchorId == null) {
            this.anchorId = "";
        }
    }

    public BLiveSharedVoiceLiveInfo subtract(BLiveSharedVoiceLiveInfo bLiveSharedVoiceLiveInfo) {
        BLiveSharedVoiceLiveInfo bLiveSharedVoiceLiveInfo2 = new BLiveSharedVoiceLiveInfo();
        if (!ValueObject.util_equals(this.roomId, bLiveSharedVoiceLiveInfo.roomId)) {
            bLiveSharedVoiceLiveInfo2.roomId = this.roomId;
        }
        if (!ValueObject.util_equals(this.liveId, bLiveSharedVoiceLiveInfo.liveId)) {
            bLiveSharedVoiceLiveInfo2.liveId = this.liveId;
        }
        if (!ValueObject.util_equals(this.description, bLiveSharedVoiceLiveInfo.description)) {
            bLiveSharedVoiceLiveInfo2.description = this.description;
        }
        if (!ValueObject.util_equals(this.anchorId, bLiveSharedVoiceLiveInfo.anchorId)) {
            bLiveSharedVoiceLiveInfo2.anchorId = this.anchorId;
        }
        if (bLiveSharedVoiceLiveInfo2.equals(new BLiveSharedVoiceLiveInfo())) {
            return null;
        }
        return bLiveSharedVoiceLiveInfo2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
