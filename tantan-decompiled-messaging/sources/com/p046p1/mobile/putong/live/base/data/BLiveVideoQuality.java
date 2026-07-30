package com.p046p1.mobile.putong.live.base.data;

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
public class BLiveVideoQuality extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVideoQuality> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVideoQuality>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVideoQuality.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVideoQuality.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVideoQuality newInstance() {
            return new BLiveVideoQuality();
        }

        public boolean parseField(BLiveVideoQuality bLiveVideoQuality, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "videoCodecType":
                    bLiveVideoQuality.videoCodecType = jsonParser.getValueAsInt();
                    return true;
                case "pushWidth":
                    bLiveVideoQuality.pushWidth = jsonParser.getValueAsInt();
                    return true;
                case "captureFps":
                    bLiveVideoQuality.captureFps = jsonParser.getValueAsInt();
                    return true;
                case "pushFps":
                    bLiveVideoQuality.pushFps = jsonParser.getValueAsInt();
                    return true;
                case "pushBitrate":
                    bLiveVideoQuality.pushBitrate = jsonParser.getValueAsInt();
                    return true;
                case "captureWidth":
                    bLiveVideoQuality.captureWidth = jsonParser.getValueAsInt();
                    return true;
                case "pushHeight":
                    bLiveVideoQuality.pushHeight = jsonParser.getValueAsInt();
                    return true;
                case "downGrade":
                    bLiveVideoQuality.downGrade = jsonParser.getValueAsBoolean();
                    return true;
                case "captureHeight":
                    bLiveVideoQuality.captureHeight = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVideoQuality bLiveVideoQuality, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("captureWidth", bLiveVideoQuality.captureWidth);
            jsonGenerator.writeNumberField("captureHeight", bLiveVideoQuality.captureHeight);
            jsonGenerator.writeNumberField("captureFps", bLiveVideoQuality.captureFps);
            jsonGenerator.writeNumberField("pushWidth", bLiveVideoQuality.pushWidth);
            jsonGenerator.writeNumberField("pushHeight", bLiveVideoQuality.pushHeight);
            jsonGenerator.writeNumberField("pushBitrate", bLiveVideoQuality.pushBitrate);
            jsonGenerator.writeNumberField("pushFps", bLiveVideoQuality.pushFps);
            jsonGenerator.writeBooleanField("downGrade", bLiveVideoQuality.downGrade);
            jsonGenerator.writeNumberField("videoCodecType", bLiveVideoQuality.videoCodecType);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVideoQuality) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevideoquality";

    @ProtobufIndex(index = 3)
    public int captureFps;

    @ProtobufIndex(index = 2)
    public int captureHeight;

    @ProtobufIndex(index = 1)
    public int captureWidth;

    @ProtobufIndex(index = 8)
    public boolean downGrade;

    @ProtobufIndex(index = 6)
    public int pushBitrate;

    @ProtobufIndex(index = 7)
    public int pushFps;

    @ProtobufIndex(index = 5)
    public int pushHeight;

    @ProtobufIndex(index = 4)
    public int pushWidth;

    @ProtobufIndex(index = 9)
    public int videoCodecType;

    public static BLiveVideoQuality new_() {
        BLiveVideoQuality bLiveVideoQuality = new BLiveVideoQuality();
        bLiveVideoQuality.nullCheck();
        return bLiveVideoQuality;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVideoQuality mo223809clone() {
        BLiveVideoQuality bLiveVideoQuality = new BLiveVideoQuality();
        bLiveVideoQuality.captureWidth = this.captureWidth;
        bLiveVideoQuality.captureHeight = this.captureHeight;
        bLiveVideoQuality.captureFps = this.captureFps;
        bLiveVideoQuality.pushWidth = this.pushWidth;
        bLiveVideoQuality.pushHeight = this.pushHeight;
        bLiveVideoQuality.pushBitrate = this.pushBitrate;
        bLiveVideoQuality.pushFps = this.pushFps;
        bLiveVideoQuality.downGrade = this.downGrade;
        bLiveVideoQuality.videoCodecType = this.videoCodecType;
        return bLiveVideoQuality;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVideoQuality)) {
            return false;
        }
        BLiveVideoQuality bLiveVideoQuality = (BLiveVideoQuality) obj;
        return this.captureWidth == bLiveVideoQuality.captureWidth && this.captureHeight == bLiveVideoQuality.captureHeight && this.captureFps == bLiveVideoQuality.captureFps && this.pushWidth == bLiveVideoQuality.pushWidth && this.pushHeight == bLiveVideoQuality.pushHeight && this.pushBitrate == bLiveVideoQuality.pushBitrate && this.pushFps == bLiveVideoQuality.pushFps && this.downGrade == bLiveVideoQuality.downGrade && this.videoCodecType == bLiveVideoQuality.videoCodecType;
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
        int i2 = (((((((((((((((((i * 41) + this.captureWidth) * 41) + this.captureHeight) * 41) + this.captureFps) * 41) + this.pushWidth) * 41) + this.pushHeight) * 41) + this.pushBitrate) * 41) + this.pushFps) * 41) + (this.downGrade ? 1231 : 1237)) * 41) + this.videoCodecType;
        this.hashCode = i2;
        return i2;
    }

    public boolean isValid() {
        return this.captureWidth > 99 && this.captureHeight > 176 && this.captureFps > 5 && this.pushWidth > 99 && this.pushHeight > 176 && this.pushFps > 5 && this.pushBitrate > 1000;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
