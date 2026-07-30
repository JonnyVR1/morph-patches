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
public class BLiveVideoQualityConf extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVideoQualityConf> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVideoQualityConf>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVideoQualityConf.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVideoQualityConf.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVideoQualityConf newInstance() {
            return new BLiveVideoQualityConf();
        }

        public boolean parseField(BLiveVideoQualityConf bLiveVideoQualityConf, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "encode":
                    bLiveVideoQualityConf.encode = BLiveEncode.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "videoCodecType":
                    bLiveVideoQualityConf.videoCodecType = jsonParser.getValueAsInt();
                    return true;
                case "pushUrl":
                    bLiveVideoQualityConf.pushUrl = jsonParser.getValueAsString();
                    return true;
                case "mixEncode":
                    bLiveVideoQualityConf.mixEncode = BLiveMixEncode.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "rtcProvider":
                    bLiveVideoQualityConf.rtcProvider = jsonParser.getValueAsString();
                    return true;
                case "capture":
                    bLiveVideoQualityConf.capture = BLiveCapture.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "rtcRole":
                    bLiveVideoQualityConf.rtcRole = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVideoQualityConf bLiveVideoQualityConf, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveVideoQualityConf.capture != null) {
                jsonGenerator.writeFieldName("capture");
                BLiveCapture.JSON_ADAPTER.serialize(bLiveVideoQualityConf.capture, jsonGenerator, true);
            }
            if (bLiveVideoQualityConf.encode != null) {
                jsonGenerator.writeFieldName("encode");
                BLiveEncode.JSON_ADAPTER.serialize(bLiveVideoQualityConf.encode, jsonGenerator, true);
            }
            if (bLiveVideoQualityConf.mixEncode != null) {
                jsonGenerator.writeFieldName("mixEncode");
                BLiveMixEncode.JSON_ADAPTER.serialize(bLiveVideoQualityConf.mixEncode, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("videoCodecType", bLiveVideoQualityConf.videoCodecType);
            String str = bLiveVideoQualityConf.pushUrl;
            if (str != null) {
                jsonGenerator.writeStringField("pushUrl", str);
            }
            String str2 = bLiveVideoQualityConf.rtcRole;
            if (str2 != null) {
                jsonGenerator.writeStringField("rtcRole", str2);
            }
            String str3 = bLiveVideoQualityConf.rtcProvider;
            if (str3 != null) {
                jsonGenerator.writeStringField("rtcProvider", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVideoQualityConf) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevideoqualityconf";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveCapture capture;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveEncode encode;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveMixEncode mixEncode;

    @NonNull
    @ProtobufIndex(index = 5)
    public String pushUrl;

    @NonNull
    @ProtobufIndex(index = 7)
    public String rtcProvider;

    @NonNull
    @ProtobufIndex(index = 6)
    public String rtcRole;

    @ProtobufIndex(index = 4)
    public int videoCodecType;

    public static BLiveVideoQualityConf new_() {
        BLiveVideoQualityConf bLiveVideoQualityConf = new BLiveVideoQualityConf();
        bLiveVideoQualityConf.nullCheck();
        return bLiveVideoQualityConf;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVideoQualityConf mo225055clone() {
        BLiveVideoQualityConf bLiveVideoQualityConf = new BLiveVideoQualityConf();
        BLiveCapture bLiveCapture = this.capture;
        if (bLiveCapture != null) {
            bLiveVideoQualityConf.capture = bLiveCapture.mo225055clone();
        }
        BLiveEncode bLiveEncode = this.encode;
        if (bLiveEncode != null) {
            bLiveVideoQualityConf.encode = bLiveEncode.mo225055clone();
        }
        BLiveMixEncode bLiveMixEncode = this.mixEncode;
        if (bLiveMixEncode != null) {
            bLiveVideoQualityConf.mixEncode = bLiveMixEncode.mo225055clone();
        }
        bLiveVideoQualityConf.videoCodecType = this.videoCodecType;
        bLiveVideoQualityConf.pushUrl = this.pushUrl;
        bLiveVideoQualityConf.rtcRole = this.rtcRole;
        bLiveVideoQualityConf.rtcProvider = this.rtcProvider;
        return bLiveVideoQualityConf;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVideoQualityConf)) {
            return false;
        }
        BLiveVideoQualityConf bLiveVideoQualityConf = (BLiveVideoQualityConf) obj;
        return ValueObject.util_equals(this.capture, bLiveVideoQualityConf.capture) && ValueObject.util_equals(this.encode, bLiveVideoQualityConf.encode) && ValueObject.util_equals(this.mixEncode, bLiveVideoQualityConf.mixEncode) && this.videoCodecType == bLiveVideoQualityConf.videoCodecType && ValueObject.util_equals(this.pushUrl, bLiveVideoQualityConf.pushUrl) && ValueObject.util_equals(this.rtcRole, bLiveVideoQualityConf.rtcRole) && ValueObject.util_equals(this.rtcProvider, bLiveVideoQualityConf.rtcProvider);
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
        BLiveCapture bLiveCapture = this.capture;
        int iHashCode = (i2 + (bLiveCapture != null ? bLiveCapture.hashCode() : 0)) * 41;
        BLiveEncode bLiveEncode = this.encode;
        int iHashCode2 = (iHashCode + (bLiveEncode != null ? bLiveEncode.hashCode() : 0)) * 41;
        BLiveMixEncode bLiveMixEncode = this.mixEncode;
        int iHashCode3 = (((iHashCode2 + (bLiveMixEncode != null ? bLiveMixEncode.hashCode() : 0)) * 41) + this.videoCodecType) * 41;
        String str = this.pushUrl;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.rtcRole;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.rtcProvider;
        int iHashCode6 = iHashCode5 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.capture == null) {
            this.capture = BLiveCapture.new_();
        }
        if (this.encode == null) {
            this.encode = BLiveEncode.new_();
        }
        if (this.mixEncode == null) {
            this.mixEncode = BLiveMixEncode.new_();
        }
        if (this.pushUrl == null) {
            this.pushUrl = "";
        }
        if (this.rtcRole == null) {
            this.rtcRole = "";
        }
        if (this.rtcProvider == null) {
            this.rtcProvider = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
