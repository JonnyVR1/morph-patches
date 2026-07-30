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
import p153l.pzi0;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveAvatarFrameConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAvatarFrameConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAvatarFrameConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAvatarFrameConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAvatarFrameConfig newInstance() {
            return new BLiveAvatarFrameConfig();
        }

        public boolean parseField(BLiveAvatarFrameConfig bLiveAvatarFrameConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "staticUrl":
                    bLiveAvatarFrameConfig.staticUrl = jsonParser.getValueAsString();
                    return true;
                case "endMill":
                    bLiveAvatarFrameConfig.endMill = jsonParser.getValueAsLong();
                    return true;
                case "totalSec":
                    bLiveAvatarFrameConfig.totalSec = jsonParser.getValueAsInt();
                    return true;
                case "mediumDynamicUrl":
                    bLiveAvatarFrameConfig.mediumDynamicUrl = jsonParser.getValueAsString();
                    return true;
                case "changeVoiceNo":
                    bLiveAvatarFrameConfig.changeVoiceNo = jsonParser.getValueAsInt();
                    return true;
                case "dynamicUrl":
                    bLiveAvatarFrameConfig.dynamicUrl = jsonParser.getValueAsString();
                    return true;
                case "funnyUrl":
                    bLiveAvatarFrameConfig.funnyUrl = jsonParser.getValueAsString();
                    return true;
                case "smallDynamicUrl":
                    bLiveAvatarFrameConfig.smallDynamicUrl = jsonParser.getValueAsString();
                    return true;
                case "remainingSec":
                    bLiveAvatarFrameConfig.remainingSec = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAvatarFrameConfig bLiveAvatarFrameConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveAvatarFrameConfig.staticUrl;
            if (str != null) {
                jsonGenerator.writeStringField("staticUrl", str);
            }
            String str2 = bLiveAvatarFrameConfig.dynamicUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("dynamicUrl", str2);
            }
            String str3 = bLiveAvatarFrameConfig.smallDynamicUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("smallDynamicUrl", str3);
            }
            String str4 = bLiveAvatarFrameConfig.mediumDynamicUrl;
            if (str4 != null) {
                jsonGenerator.writeStringField("mediumDynamicUrl", str4);
            }
            jsonGenerator.writeNumberField("totalSec", bLiveAvatarFrameConfig.totalSec);
            jsonGenerator.writeNumberField("remainingSec", bLiveAvatarFrameConfig.remainingSec);
            jsonGenerator.writeNumberField("changeVoiceNo", bLiveAvatarFrameConfig.changeVoiceNo);
            jsonGenerator.writeNumberField("endMill", bLiveAvatarFrameConfig.endMill);
            String str5 = bLiveAvatarFrameConfig.funnyUrl;
            if (str5 != null) {
                jsonGenerator.writeStringField("funnyUrl", str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAvatarFrameConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveavatarframeconfig";

    @ProtobufIndex(index = 7)
    public int changeVoiceNo;

    @NonNull
    @ProtobufIndex(index = 2)
    public String dynamicUrl;

    @ProtobufIndex(index = 8)
    public long endMill;

    @NonNull
    @ProtobufIndex(index = 9)
    public String funnyUrl;

    @NonNull
    @ProtobufIndex(index = 4)
    public String mediumDynamicUrl;

    @ProtobufIndex(index = 6)
    public int remainingSec;

    @NonNull
    @ProtobufIndex(index = 3)
    public String smallDynamicUrl;

    @NonNull
    @ProtobufIndex(index = 1)
    public String staticUrl;

    @ProtobufIndex(index = 5)
    public int totalSec;

    public static BLiveAvatarFrameConfig new_() {
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig = new BLiveAvatarFrameConfig();
        bLiveAvatarFrameConfig.nullCheck();
        return bLiveAvatarFrameConfig;
    }

    public boolean checkNeedChangeVoice() {
        return this.changeVoiceNo > 0 && this.endMill > pzi0.m174454o() && this.totalSec > 0;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAvatarFrameConfig mo225055clone() {
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig = new BLiveAvatarFrameConfig();
        bLiveAvatarFrameConfig.staticUrl = this.staticUrl;
        bLiveAvatarFrameConfig.dynamicUrl = this.dynamicUrl;
        bLiveAvatarFrameConfig.smallDynamicUrl = this.smallDynamicUrl;
        bLiveAvatarFrameConfig.mediumDynamicUrl = this.mediumDynamicUrl;
        bLiveAvatarFrameConfig.totalSec = this.totalSec;
        bLiveAvatarFrameConfig.remainingSec = this.remainingSec;
        bLiveAvatarFrameConfig.changeVoiceNo = this.changeVoiceNo;
        bLiveAvatarFrameConfig.endMill = this.endMill;
        bLiveAvatarFrameConfig.funnyUrl = this.funnyUrl;
        return bLiveAvatarFrameConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAvatarFrameConfig)) {
            return false;
        }
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig = (BLiveAvatarFrameConfig) obj;
        return ValueObject.util_equals(this.staticUrl, bLiveAvatarFrameConfig.staticUrl) && ValueObject.util_equals(this.dynamicUrl, bLiveAvatarFrameConfig.dynamicUrl) && ValueObject.util_equals(this.smallDynamicUrl, bLiveAvatarFrameConfig.smallDynamicUrl) && ValueObject.util_equals(this.mediumDynamicUrl, bLiveAvatarFrameConfig.mediumDynamicUrl) && this.totalSec == bLiveAvatarFrameConfig.totalSec && this.remainingSec == bLiveAvatarFrameConfig.remainingSec && this.changeVoiceNo == bLiveAvatarFrameConfig.changeVoiceNo && this.endMill == bLiveAvatarFrameConfig.endMill && ValueObject.util_equals(this.funnyUrl, bLiveAvatarFrameConfig.funnyUrl);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public float getCurrentProgress() {
        return (((this.endMill - 1000) - pzi0.m174454o()) / (this.totalSec * 1000.0f)) * 100.0f;
    }

    public long getFixedRemainingSec() {
        return (this.endMill - pzi0.m174454o()) / 1000;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.staticUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.dynamicUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.smallDynamicUrl;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.mediumDynamicUrl;
        int iHashCode4 = (((((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.totalSec) * 41) + this.remainingSec) * 41) + this.changeVoiceNo) * 41;
        long j = this.endMill;
        int i3 = (iHashCode4 + ((int) (j ^ (j >>> 32)))) * 41;
        String str5 = this.funnyUrl;
        int iHashCode5 = i3 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.staticUrl == null) {
            this.staticUrl = "";
        }
        if (this.dynamicUrl == null) {
            this.dynamicUrl = "";
        }
        if (this.smallDynamicUrl == null) {
            this.smallDynamicUrl = "";
        }
        if (this.mediumDynamicUrl == null) {
            this.mediumDynamicUrl = "";
        }
        if (this.funnyUrl == null) {
            this.funnyUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
