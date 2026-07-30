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
public class BLiveUserCardButtonConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUserCardButtonConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUserCardButtonConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUserCardButtonConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUserCardButtonConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUserCardButtonConfig newInstance() {
            return new BLiveUserCardButtonConfig();
        }

        public boolean parseField(BLiveUserCardButtonConfig bLiveUserCardButtonConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userJumpUrl":
                    bLiveUserCardButtonConfig.userJumpUrl = jsonParser.getValueAsString();
                    return true;
                case "contentConfig":
                    bLiveUserCardButtonConfig.contentConfig = BLiveUserCardButtonContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "borderColorConfig":
                    bLiveUserCardButtonConfig.borderColorConfig = BLiveUserCardButtonColorConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "pictureConfig":
                    bLiveUserCardButtonConfig.pictureConfig = BLiveAvatarFrameConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "anchorJumpUrl":
                    bLiveUserCardButtonConfig.anchorJumpUrl = jsonParser.getValueAsString();
                    return true;
                case "backgroundColorConfig":
                    bLiveUserCardButtonConfig.backgroundColorConfig = BLiveUserCardButtonColorConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUserCardButtonConfig bLiveUserCardButtonConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveUserCardButtonConfig.userJumpUrl;
            if (str != null) {
                jsonGenerator.writeStringField("userJumpUrl", str);
            }
            String str2 = bLiveUserCardButtonConfig.anchorJumpUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("anchorJumpUrl", str2);
            }
            if (bLiveUserCardButtonConfig.pictureConfig != null) {
                jsonGenerator.writeFieldName("pictureConfig");
                BLiveAvatarFrameConfig.JSON_ADAPTER.serialize(bLiveUserCardButtonConfig.pictureConfig, jsonGenerator, true);
            }
            if (bLiveUserCardButtonConfig.contentConfig != null) {
                jsonGenerator.writeFieldName("contentConfig");
                BLiveUserCardButtonContent.JSON_ADAPTER.serialize(bLiveUserCardButtonConfig.contentConfig, jsonGenerator, true);
            }
            if (bLiveUserCardButtonConfig.backgroundColorConfig != null) {
                jsonGenerator.writeFieldName("backgroundColorConfig");
                BLiveUserCardButtonColorConfig.JSON_ADAPTER.serialize(bLiveUserCardButtonConfig.backgroundColorConfig, jsonGenerator, true);
            }
            if (bLiveUserCardButtonConfig.borderColorConfig != null) {
                jsonGenerator.writeFieldName("borderColorConfig");
                BLiveUserCardButtonColorConfig.JSON_ADAPTER.serialize(bLiveUserCardButtonConfig.borderColorConfig, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUserCardButtonConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveusercardbuttonconfig";

    @NonNull
    @ProtobufIndex(index = 2)
    public String anchorJumpUrl;

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveUserCardButtonColorConfig backgroundColorConfig;

    @NonNull
    @ProtobufIndex(index = 6)
    public BLiveUserCardButtonColorConfig borderColorConfig;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveUserCardButtonContent contentConfig;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveAvatarFrameConfig pictureConfig;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userJumpUrl;

    public static BLiveUserCardButtonConfig new_() {
        BLiveUserCardButtonConfig bLiveUserCardButtonConfig = new BLiveUserCardButtonConfig();
        bLiveUserCardButtonConfig.nullCheck();
        return bLiveUserCardButtonConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUserCardButtonConfig mo225055clone() {
        BLiveUserCardButtonConfig bLiveUserCardButtonConfig = new BLiveUserCardButtonConfig();
        bLiveUserCardButtonConfig.userJumpUrl = this.userJumpUrl;
        bLiveUserCardButtonConfig.anchorJumpUrl = this.anchorJumpUrl;
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig = this.pictureConfig;
        if (bLiveAvatarFrameConfig != null) {
            bLiveUserCardButtonConfig.pictureConfig = bLiveAvatarFrameConfig.mo225055clone();
        }
        BLiveUserCardButtonContent bLiveUserCardButtonContent = this.contentConfig;
        if (bLiveUserCardButtonContent != null) {
            bLiveUserCardButtonConfig.contentConfig = bLiveUserCardButtonContent.mo225055clone();
        }
        BLiveUserCardButtonColorConfig bLiveUserCardButtonColorConfig = this.backgroundColorConfig;
        if (bLiveUserCardButtonColorConfig != null) {
            bLiveUserCardButtonConfig.backgroundColorConfig = bLiveUserCardButtonColorConfig.mo225055clone();
        }
        BLiveUserCardButtonColorConfig bLiveUserCardButtonColorConfig2 = this.borderColorConfig;
        if (bLiveUserCardButtonColorConfig2 != null) {
            bLiveUserCardButtonConfig.borderColorConfig = bLiveUserCardButtonColorConfig2.mo225055clone();
        }
        return bLiveUserCardButtonConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUserCardButtonConfig)) {
            return false;
        }
        BLiveUserCardButtonConfig bLiveUserCardButtonConfig = (BLiveUserCardButtonConfig) obj;
        return ValueObject.util_equals(this.userJumpUrl, bLiveUserCardButtonConfig.userJumpUrl) && ValueObject.util_equals(this.anchorJumpUrl, bLiveUserCardButtonConfig.anchorJumpUrl) && ValueObject.util_equals(this.pictureConfig, bLiveUserCardButtonConfig.pictureConfig) && ValueObject.util_equals(this.contentConfig, bLiveUserCardButtonConfig.contentConfig) && ValueObject.util_equals(this.backgroundColorConfig, bLiveUserCardButtonConfig.backgroundColorConfig) && ValueObject.util_equals(this.borderColorConfig, bLiveUserCardButtonConfig.borderColorConfig);
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
        String str = this.userJumpUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.anchorJumpUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig = this.pictureConfig;
        int iHashCode3 = (iHashCode2 + (bLiveAvatarFrameConfig != null ? bLiveAvatarFrameConfig.hashCode() : 0)) * 41;
        BLiveUserCardButtonContent bLiveUserCardButtonContent = this.contentConfig;
        int iHashCode4 = (iHashCode3 + (bLiveUserCardButtonContent != null ? bLiveUserCardButtonContent.hashCode() : 0)) * 41;
        BLiveUserCardButtonColorConfig bLiveUserCardButtonColorConfig = this.backgroundColorConfig;
        int iHashCode5 = (iHashCode4 + (bLiveUserCardButtonColorConfig != null ? bLiveUserCardButtonColorConfig.hashCode() : 0)) * 41;
        BLiveUserCardButtonColorConfig bLiveUserCardButtonColorConfig2 = this.borderColorConfig;
        int iHashCode6 = iHashCode5 + (bLiveUserCardButtonColorConfig2 != null ? bLiveUserCardButtonColorConfig2.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userJumpUrl == null) {
            this.userJumpUrl = "";
        }
        if (this.anchorJumpUrl == null) {
            this.anchorJumpUrl = "";
        }
        if (this.pictureConfig == null) {
            this.pictureConfig = BLiveAvatarFrameConfig.new_();
        }
        if (this.contentConfig == null) {
            this.contentConfig = BLiveUserCardButtonContent.new_();
        }
        if (this.backgroundColorConfig == null) {
            this.backgroundColorConfig = BLiveUserCardButtonColorConfig.new_();
        }
        if (this.borderColorConfig == null) {
            this.borderColorConfig = BLiveUserCardButtonColorConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
