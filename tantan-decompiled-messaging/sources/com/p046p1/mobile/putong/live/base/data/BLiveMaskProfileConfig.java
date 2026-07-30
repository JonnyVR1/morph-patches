package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class BLiveMaskProfileConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMaskProfileConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMaskProfileConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMaskProfileConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMaskProfileConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMaskProfileConfig newInstance() {
            return new BLiveMaskProfileConfig();
        }

        public boolean parseField(BLiveMaskProfileConfig bLiveMaskProfileConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "backgroundPictureConfig":
                    bLiveMaskProfileConfig.backgroundPictureConfig = BLiveAvatarFrameConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "profileVersion":
                    bLiveMaskProfileConfig.profileVersion = jsonParser.getValueAsInt();
                    return true;
                case "buttonConfig":
                    bLiveMaskProfileConfig.buttonConfig = BLiveUserCardButtonConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "wholeFrameConfig":
                    bLiveMaskProfileConfig.wholeFrameConfig = BLiveUserCardWholeFrameConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "topFrameConfig":
                    bLiveMaskProfileConfig.topFrameConfig = BLiveAvatarFrameConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMaskProfileConfig bLiveMaskProfileConfig, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveMaskProfileConfig.topFrameConfig != null) {
                jsonGenerator.writeFieldName("topFrameConfig");
                BLiveAvatarFrameConfig.JSON_ADAPTER.serialize(bLiveMaskProfileConfig.topFrameConfig, jsonGenerator, true);
            }
            if (bLiveMaskProfileConfig.backgroundPictureConfig != null) {
                jsonGenerator.writeFieldName("backgroundPictureConfig");
                BLiveAvatarFrameConfig.JSON_ADAPTER.serialize(bLiveMaskProfileConfig.backgroundPictureConfig, jsonGenerator, true);
            }
            if (bLiveMaskProfileConfig.buttonConfig != null) {
                jsonGenerator.writeFieldName("buttonConfig");
                BLiveUserCardButtonConfig.JSON_ADAPTER.serialize(bLiveMaskProfileConfig.buttonConfig, jsonGenerator, true);
            }
            if (bLiveMaskProfileConfig.wholeFrameConfig != null) {
                jsonGenerator.writeFieldName("wholeFrameConfig");
                BLiveUserCardWholeFrameConfig.JSON_ADAPTER.serialize(bLiveMaskProfileConfig.wholeFrameConfig, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("profileVersion", bLiveMaskProfileConfig.profileVersion);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMaskProfileConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemaskprofileconfig";

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveAvatarFrameConfig backgroundPictureConfig;

    @Nullable
    @ProtobufIndex(index = 3)
    public BLiveUserCardButtonConfig buttonConfig;

    @ProtobufIndex(index = 5)
    public int profileVersion;

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveAvatarFrameConfig topFrameConfig;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveUserCardWholeFrameConfig wholeFrameConfig;

    public static BLiveMaskProfileConfig new_() {
        BLiveMaskProfileConfig bLiveMaskProfileConfig = new BLiveMaskProfileConfig();
        bLiveMaskProfileConfig.nullCheck();
        return bLiveMaskProfileConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMaskProfileConfig mo223809clone() {
        BLiveMaskProfileConfig bLiveMaskProfileConfig = new BLiveMaskProfileConfig();
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig = this.topFrameConfig;
        if (bLiveAvatarFrameConfig != null) {
            bLiveMaskProfileConfig.topFrameConfig = bLiveAvatarFrameConfig.mo223809clone();
        }
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig2 = this.backgroundPictureConfig;
        if (bLiveAvatarFrameConfig2 != null) {
            bLiveMaskProfileConfig.backgroundPictureConfig = bLiveAvatarFrameConfig2.mo223809clone();
        }
        BLiveUserCardButtonConfig bLiveUserCardButtonConfig = this.buttonConfig;
        if (bLiveUserCardButtonConfig != null) {
            bLiveMaskProfileConfig.buttonConfig = bLiveUserCardButtonConfig.mo223809clone();
        }
        BLiveUserCardWholeFrameConfig bLiveUserCardWholeFrameConfig = this.wholeFrameConfig;
        if (bLiveUserCardWholeFrameConfig != null) {
            bLiveMaskProfileConfig.wholeFrameConfig = bLiveUserCardWholeFrameConfig.mo223809clone();
        }
        bLiveMaskProfileConfig.profileVersion = this.profileVersion;
        return bLiveMaskProfileConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMaskProfileConfig)) {
            return false;
        }
        BLiveMaskProfileConfig bLiveMaskProfileConfig = (BLiveMaskProfileConfig) obj;
        return ValueObject.util_equals(this.topFrameConfig, bLiveMaskProfileConfig.topFrameConfig) && ValueObject.util_equals(this.backgroundPictureConfig, bLiveMaskProfileConfig.backgroundPictureConfig) && ValueObject.util_equals(this.buttonConfig, bLiveMaskProfileConfig.buttonConfig) && ValueObject.util_equals(this.wholeFrameConfig, bLiveMaskProfileConfig.wholeFrameConfig) && this.profileVersion == bLiveMaskProfileConfig.profileVersion;
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
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig = this.topFrameConfig;
        int iHashCode = (i2 + (bLiveAvatarFrameConfig != null ? bLiveAvatarFrameConfig.hashCode() : 0)) * 41;
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig2 = this.backgroundPictureConfig;
        int iHashCode2 = (iHashCode + (bLiveAvatarFrameConfig2 != null ? bLiveAvatarFrameConfig2.hashCode() : 0)) * 41;
        BLiveUserCardButtonConfig bLiveUserCardButtonConfig = this.buttonConfig;
        int iHashCode3 = (iHashCode2 + (bLiveUserCardButtonConfig != null ? bLiveUserCardButtonConfig.hashCode() : 0)) * 41;
        BLiveUserCardWholeFrameConfig bLiveUserCardWholeFrameConfig = this.wholeFrameConfig;
        int iHashCode4 = ((iHashCode3 + (bLiveUserCardWholeFrameConfig != null ? bLiveUserCardWholeFrameConfig.hashCode() : 0)) * 41) + this.profileVersion;
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.topFrameConfig == null) {
            this.topFrameConfig = BLiveAvatarFrameConfig.new_();
        }
        if (this.backgroundPictureConfig == null) {
            this.backgroundPictureConfig = BLiveAvatarFrameConfig.new_();
        }
        if (this.wholeFrameConfig == null) {
            this.wholeFrameConfig = BLiveUserCardWholeFrameConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
