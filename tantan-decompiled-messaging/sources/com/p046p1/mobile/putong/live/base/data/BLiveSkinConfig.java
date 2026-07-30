package com.p046p1.mobile.putong.live.base.data;

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
public class BLiveSkinConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSkinConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSkinConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSkinConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSkinConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSkinConfig newInstance() {
            return new BLiveSkinConfig();
        }

        public boolean parseField(BLiveSkinConfig bLiveSkinConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bottomTabBarConfig":
                    bLiveSkinConfig.bottomTabBarConfig = BLiveBottomTabBarConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "topTabBarConfig":
                    bLiveSkinConfig.topTabBarConfig = BLiveTopBarConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "backgroundConfig":
                    bLiveSkinConfig.backgroundConfig = BLiveColor.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSkinConfig bLiveSkinConfig, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveSkinConfig.topTabBarConfig != null) {
                jsonGenerator.writeFieldName("topTabBarConfig");
                BLiveTopBarConfig.JSON_ADAPTER.serialize(bLiveSkinConfig.topTabBarConfig, jsonGenerator, true);
            }
            if (bLiveSkinConfig.bottomTabBarConfig != null) {
                jsonGenerator.writeFieldName("bottomTabBarConfig");
                BLiveBottomTabBarConfig.JSON_ADAPTER.serialize(bLiveSkinConfig.bottomTabBarConfig, jsonGenerator, true);
            }
            if (bLiveSkinConfig.backgroundConfig != null) {
                jsonGenerator.writeFieldName("backgroundConfig");
                BLiveColor.JSON_ADAPTER.serialize(bLiveSkinConfig.backgroundConfig, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSkinConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveskinconfig";

    @Nullable
    @ProtobufIndex(index = 3)
    public BLiveColor backgroundConfig;

    @Nullable
    @ProtobufIndex(index = 2)
    public BLiveBottomTabBarConfig bottomTabBarConfig;

    @Nullable
    @ProtobufIndex(index = 1)
    public BLiveTopBarConfig topTabBarConfig;

    public static BLiveSkinConfig new_() {
        BLiveSkinConfig bLiveSkinConfig = new BLiveSkinConfig();
        bLiveSkinConfig.nullCheck();
        return bLiveSkinConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSkinConfig mo223809clone() {
        BLiveSkinConfig bLiveSkinConfig = new BLiveSkinConfig();
        BLiveTopBarConfig bLiveTopBarConfig = this.topTabBarConfig;
        if (bLiveTopBarConfig != null) {
            bLiveSkinConfig.topTabBarConfig = bLiveTopBarConfig.mo223809clone();
        }
        BLiveBottomTabBarConfig bLiveBottomTabBarConfig = this.bottomTabBarConfig;
        if (bLiveBottomTabBarConfig != null) {
            bLiveSkinConfig.bottomTabBarConfig = bLiveBottomTabBarConfig.mo223809clone();
        }
        BLiveColor bLiveColor = this.backgroundConfig;
        if (bLiveColor != null) {
            bLiveSkinConfig.backgroundConfig = bLiveColor.mo223809clone();
        }
        return bLiveSkinConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSkinConfig)) {
            return false;
        }
        BLiveSkinConfig bLiveSkinConfig = (BLiveSkinConfig) obj;
        return ValueObject.util_equals(this.topTabBarConfig, bLiveSkinConfig.topTabBarConfig) && ValueObject.util_equals(this.bottomTabBarConfig, bLiveSkinConfig.bottomTabBarConfig) && ValueObject.util_equals(this.backgroundConfig, bLiveSkinConfig.backgroundConfig);
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
        BLiveTopBarConfig bLiveTopBarConfig = this.topTabBarConfig;
        int iHashCode = (i2 + (bLiveTopBarConfig != null ? bLiveTopBarConfig.hashCode() : 0)) * 41;
        BLiveBottomTabBarConfig bLiveBottomTabBarConfig = this.bottomTabBarConfig;
        int iHashCode2 = (iHashCode + (bLiveBottomTabBarConfig != null ? bLiveBottomTabBarConfig.hashCode() : 0)) * 41;
        BLiveColor bLiveColor = this.backgroundConfig;
        int iHashCode3 = iHashCode2 + (bLiveColor != null ? bLiveColor.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
