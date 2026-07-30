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
public class BLiveGiftExtraVoiceInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftExtraVoiceInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftExtraVoiceInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftExtraVoiceInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftExtraVoiceInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftExtraVoiceInfo newInstance() {
            return new BLiveGiftExtraVoiceInfo();
        }

        public boolean parseField(BLiveGiftExtraVoiceInfo bLiveGiftExtraVoiceInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "voiceLiveMode":
                    bLiveGiftExtraVoiceInfo.voiceLiveMode = jsonParser.getValueAsString();
                    return true;
                case "callId":
                    bLiveGiftExtraVoiceInfo.callId = jsonParser.getValueAsString();
                    return true;
                case "templateType":
                    bLiveGiftExtraVoiceInfo.templateType = jsonParser.getValueAsString();
                    return true;
                case "voiceAnchorType":
                    bLiveGiftExtraVoiceInfo.voiceAnchorType = jsonParser.getValueAsString();
                    return true;
                case "viceAnchorUserId":
                    bLiveGiftExtraVoiceInfo.viceAnchorUserId = jsonParser.getValueAsString();
                    return true;
                case "mainUserId":
                    bLiveGiftExtraVoiceInfo.mainUserId = jsonParser.getValueAsString();
                    return true;
                case "position":
                    bLiveGiftExtraVoiceInfo.position = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftExtraVoiceInfo bLiveGiftExtraVoiceInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftExtraVoiceInfo.callId;
            if (str != null) {
                jsonGenerator.writeStringField("callId", str);
            }
            String str2 = bLiveGiftExtraVoiceInfo.mainUserId;
            if (str2 != null) {
                jsonGenerator.writeStringField("mainUserId", str2);
            }
            String str3 = bLiveGiftExtraVoiceInfo.viceAnchorUserId;
            if (str3 != null) {
                jsonGenerator.writeStringField("viceAnchorUserId", str3);
            }
            String str4 = bLiveGiftExtraVoiceInfo.voiceAnchorType;
            if (str4 != null) {
                jsonGenerator.writeStringField("voiceAnchorType", str4);
            }
            String str5 = bLiveGiftExtraVoiceInfo.templateType;
            if (str5 != null) {
                jsonGenerator.writeStringField("templateType", str5);
            }
            jsonGenerator.writeNumberField("position", bLiveGiftExtraVoiceInfo.position);
            String str6 = bLiveGiftExtraVoiceInfo.voiceLiveMode;
            if (str6 != null) {
                jsonGenerator.writeStringField("voiceLiveMode", str6);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftExtraVoiceInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftextravoiceinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String callId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String mainUserId;

    @ProtobufIndex(index = 6)
    public int position;

    @NonNull
    @ProtobufIndex(index = 5)
    public String templateType;

    @NonNull
    @ProtobufIndex(index = 3)
    public String viceAnchorUserId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String voiceAnchorType;

    @NonNull
    @ProtobufIndex(index = 7)
    public String voiceLiveMode;

    public static BLiveGiftExtraVoiceInfo new_() {
        BLiveGiftExtraVoiceInfo bLiveGiftExtraVoiceInfo = new BLiveGiftExtraVoiceInfo();
        bLiveGiftExtraVoiceInfo.nullCheck();
        return bLiveGiftExtraVoiceInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftExtraVoiceInfo mo223809clone() {
        BLiveGiftExtraVoiceInfo bLiveGiftExtraVoiceInfo = new BLiveGiftExtraVoiceInfo();
        bLiveGiftExtraVoiceInfo.callId = this.callId;
        bLiveGiftExtraVoiceInfo.mainUserId = this.mainUserId;
        bLiveGiftExtraVoiceInfo.viceAnchorUserId = this.viceAnchorUserId;
        bLiveGiftExtraVoiceInfo.voiceAnchorType = this.voiceAnchorType;
        bLiveGiftExtraVoiceInfo.templateType = this.templateType;
        bLiveGiftExtraVoiceInfo.position = this.position;
        bLiveGiftExtraVoiceInfo.voiceLiveMode = this.voiceLiveMode;
        return bLiveGiftExtraVoiceInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftExtraVoiceInfo)) {
            return false;
        }
        BLiveGiftExtraVoiceInfo bLiveGiftExtraVoiceInfo = (BLiveGiftExtraVoiceInfo) obj;
        return ValueObject.util_equals(this.callId, bLiveGiftExtraVoiceInfo.callId) && ValueObject.util_equals(this.mainUserId, bLiveGiftExtraVoiceInfo.mainUserId) && ValueObject.util_equals(this.viceAnchorUserId, bLiveGiftExtraVoiceInfo.viceAnchorUserId) && ValueObject.util_equals(this.voiceAnchorType, bLiveGiftExtraVoiceInfo.voiceAnchorType) && ValueObject.util_equals(this.templateType, bLiveGiftExtraVoiceInfo.templateType) && this.position == bLiveGiftExtraVoiceInfo.position && ValueObject.util_equals(this.voiceLiveMode, bLiveGiftExtraVoiceInfo.voiceLiveMode);
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
        String str = this.callId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.mainUserId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.viceAnchorUserId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.voiceAnchorType;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.templateType;
        int iHashCode5 = (((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41) + this.position) * 41;
        String str6 = this.voiceLiveMode;
        int iHashCode6 = iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.callId == null) {
            this.callId = "";
        }
        if (this.mainUserId == null) {
            this.mainUserId = "";
        }
        if (this.viceAnchorUserId == null) {
            this.viceAnchorUserId = "";
        }
        if (this.voiceAnchorType == null) {
            this.voiceAnchorType = "";
        }
        if (this.templateType == null) {
            this.templateType = "";
        }
        if (this.voiceLiveMode == null) {
            this.voiceLiveMode = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
