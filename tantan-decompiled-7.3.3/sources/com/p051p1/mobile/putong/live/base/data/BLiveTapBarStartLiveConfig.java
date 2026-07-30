package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.Nullable;
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
public class BLiveTapBarStartLiveConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveTapBarStartLiveConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveTapBarStartLiveConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveTapBarStartLiveConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveTapBarStartLiveConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveTapBarStartLiveConfig newInstance() {
            return new BLiveTapBarStartLiveConfig();
        }

        public boolean parseField(BLiveTapBarStartLiveConfig bLiveTapBarStartLiveConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "backgroundUrl":
                    bLiveTapBarStartLiveConfig.backgroundUrl = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    bLiveTapBarStartLiveConfig.icon = jsonParser.getValueAsString();
                    return true;
                case "content":
                    bLiveTapBarStartLiveConfig.content = BLiveCommonViewConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveTapBarStartLiveConfig bLiveTapBarStartLiveConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveTapBarStartLiveConfig.icon;
            if (str != null) {
                jsonGenerator.writeStringField("icon", str);
            }
            String str2 = bLiveTapBarStartLiveConfig.backgroundUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("backgroundUrl", str2);
            }
            if (bLiveTapBarStartLiveConfig.content != null) {
                jsonGenerator.writeFieldName("content");
                BLiveCommonViewConfig.JSON_ADAPTER.serialize(bLiveTapBarStartLiveConfig.content, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveTapBarStartLiveConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivetapbarstartliveconfig";

    @Nullable
    @ProtobufIndex(index = 2)
    public String backgroundUrl;

    @Nullable
    @ProtobufIndex(index = 3)
    public BLiveCommonViewConfig content;

    @Nullable
    @ProtobufIndex(index = 1)
    public String icon;

    public static BLiveTapBarStartLiveConfig new_() {
        BLiveTapBarStartLiveConfig bLiveTapBarStartLiveConfig = new BLiveTapBarStartLiveConfig();
        bLiveTapBarStartLiveConfig.nullCheck();
        return bLiveTapBarStartLiveConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveTapBarStartLiveConfig mo225055clone() {
        BLiveTapBarStartLiveConfig bLiveTapBarStartLiveConfig = new BLiveTapBarStartLiveConfig();
        bLiveTapBarStartLiveConfig.icon = this.icon;
        bLiveTapBarStartLiveConfig.backgroundUrl = this.backgroundUrl;
        BLiveCommonViewConfig bLiveCommonViewConfig = this.content;
        if (bLiveCommonViewConfig != null) {
            bLiveTapBarStartLiveConfig.content = bLiveCommonViewConfig.mo225055clone();
        }
        return bLiveTapBarStartLiveConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveTapBarStartLiveConfig)) {
            return false;
        }
        BLiveTapBarStartLiveConfig bLiveTapBarStartLiveConfig = (BLiveTapBarStartLiveConfig) obj;
        return ValueObject.util_equals(this.icon, bLiveTapBarStartLiveConfig.icon) && ValueObject.util_equals(this.backgroundUrl, bLiveTapBarStartLiveConfig.backgroundUrl) && ValueObject.util_equals(this.content, bLiveTapBarStartLiveConfig.content);
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
        String str = this.icon;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.backgroundUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveCommonViewConfig bLiveCommonViewConfig = this.content;
        int iHashCode3 = iHashCode2 + (bLiveCommonViewConfig != null ? bLiveCommonViewConfig.hashCode() : 0);
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
