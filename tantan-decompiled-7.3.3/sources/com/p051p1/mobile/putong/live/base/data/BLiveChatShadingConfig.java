package com.p051p1.mobile.putong.live.base.data;

import android.text.TextUtils;
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
public class BLiveChatShadingConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveChatShadingConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveChatShadingConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveChatShadingConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveChatShadingConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveChatShadingConfig newInstance() {
            return new BLiveChatShadingConfig();
        }

        public boolean parseField(BLiveChatShadingConfig bLiveChatShadingConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "borderColorConfig":
                    bLiveChatShadingConfig.borderColorConfig = BLiveChatShadingContentConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "cornerConfig":
                    bLiveChatShadingConfig.cornerConfig = BLiveChatShadingCornerConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "backgroundColorConfig":
                    bLiveChatShadingConfig.backgroundColorConfig = BLiveChatShadingContentConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveChatShadingConfig bLiveChatShadingConfig, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveChatShadingConfig.backgroundColorConfig != null) {
                jsonGenerator.writeFieldName("backgroundColorConfig");
                BLiveChatShadingContentConfig.JSON_ADAPTER.serialize(bLiveChatShadingConfig.backgroundColorConfig, jsonGenerator, true);
            }
            if (bLiveChatShadingConfig.borderColorConfig != null) {
                jsonGenerator.writeFieldName("borderColorConfig");
                BLiveChatShadingContentConfig.JSON_ADAPTER.serialize(bLiveChatShadingConfig.borderColorConfig, jsonGenerator, true);
            }
            if (bLiveChatShadingConfig.cornerConfig != null) {
                jsonGenerator.writeFieldName("cornerConfig");
                BLiveChatShadingCornerConfig.JSON_ADAPTER.serialize(bLiveChatShadingConfig.cornerConfig, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveChatShadingConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivechatshadingconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveChatShadingContentConfig backgroundColorConfig;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveChatShadingContentConfig borderColorConfig;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveChatShadingCornerConfig cornerConfig;

    public static BLiveChatShadingConfig new_() {
        BLiveChatShadingConfig bLiveChatShadingConfig = new BLiveChatShadingConfig();
        bLiveChatShadingConfig.nullCheck();
        return bLiveChatShadingConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveChatShadingConfig mo225055clone() {
        BLiveChatShadingConfig bLiveChatShadingConfig = new BLiveChatShadingConfig();
        BLiveChatShadingContentConfig bLiveChatShadingContentConfig = this.backgroundColorConfig;
        if (bLiveChatShadingContentConfig != null) {
            bLiveChatShadingConfig.backgroundColorConfig = bLiveChatShadingContentConfig.mo225055clone();
        }
        BLiveChatShadingContentConfig bLiveChatShadingContentConfig2 = this.borderColorConfig;
        if (bLiveChatShadingContentConfig2 != null) {
            bLiveChatShadingConfig.borderColorConfig = bLiveChatShadingContentConfig2.mo225055clone();
        }
        BLiveChatShadingCornerConfig bLiveChatShadingCornerConfig = this.cornerConfig;
        if (bLiveChatShadingCornerConfig != null) {
            bLiveChatShadingConfig.cornerConfig = bLiveChatShadingCornerConfig.mo225055clone();
        }
        return bLiveChatShadingConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveChatShadingConfig)) {
            return false;
        }
        BLiveChatShadingConfig bLiveChatShadingConfig = (BLiveChatShadingConfig) obj;
        return ValueObject.util_equals(this.backgroundColorConfig, bLiveChatShadingConfig.backgroundColorConfig) && ValueObject.util_equals(this.borderColorConfig, bLiveChatShadingConfig.borderColorConfig) && ValueObject.util_equals(this.cornerConfig, bLiveChatShadingConfig.cornerConfig);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public boolean hasBorderConfig() {
        return this.borderColorConfig.colors.size() > 0;
    }

    public boolean hasChatShadingConfig() {
        return this.backgroundColorConfig.colors.size() > 0;
    }

    public boolean hasCornerConfig() {
        return !TextUtils.isEmpty(this.cornerConfig.pictureUrl);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        BLiveChatShadingContentConfig bLiveChatShadingContentConfig = this.backgroundColorConfig;
        int iHashCode = (i2 + (bLiveChatShadingContentConfig != null ? bLiveChatShadingContentConfig.hashCode() : 0)) * 41;
        BLiveChatShadingContentConfig bLiveChatShadingContentConfig2 = this.borderColorConfig;
        int iHashCode2 = (iHashCode + (bLiveChatShadingContentConfig2 != null ? bLiveChatShadingContentConfig2.hashCode() : 0)) * 41;
        BLiveChatShadingCornerConfig bLiveChatShadingCornerConfig = this.cornerConfig;
        int iHashCode3 = iHashCode2 + (bLiveChatShadingCornerConfig != null ? bLiveChatShadingCornerConfig.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.backgroundColorConfig == null) {
            this.backgroundColorConfig = BLiveChatShadingContentConfig.new_();
        }
        if (this.borderColorConfig == null) {
            this.borderColorConfig = BLiveChatShadingContentConfig.new_();
        }
        if (this.cornerConfig == null) {
            this.cornerConfig = BLiveChatShadingCornerConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
