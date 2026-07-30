package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveDynamicEffectExtend;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveUserCardWholeFrameConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUserCardWholeFrameConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUserCardWholeFrameConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUserCardWholeFrameConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUserCardWholeFrameConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUserCardWholeFrameConfig newInstance() {
            return new BLiveUserCardWholeFrameConfig();
        }

        public boolean parseField(BLiveUserCardWholeFrameConfig bLiveUserCardWholeFrameConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "dynamicEffectExtends":
                    bLiveUserCardWholeFrameConfig.dynamicEffectExtends = JsonAdapter.parseArray(jsonParser, BLiveDynamicEffectExtend.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "staticUrl":
                    bLiveUserCardWholeFrameConfig.staticUrl = jsonParser.getValueAsString();
                    return true;
                case "resourceId":
                    bLiveUserCardWholeFrameConfig.resourceId = jsonParser.getValueAsInt();
                    return true;
                case "playType":
                    bLiveUserCardWholeFrameConfig.playType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUserCardWholeFrameConfig bLiveUserCardWholeFrameConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveUserCardWholeFrameConfig.playType;
            if (str != null) {
                jsonGenerator.writeStringField("playType", str);
            }
            jsonGenerator.writeNumberField("resourceId", bLiveUserCardWholeFrameConfig.resourceId);
            String str2 = bLiveUserCardWholeFrameConfig.staticUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("staticUrl", str2);
            }
            if (bLiveUserCardWholeFrameConfig.dynamicEffectExtends != null) {
                jsonGenerator.writeFieldName("dynamicEffectExtends");
                JsonAdapter.serializeArray(bLiveUserCardWholeFrameConfig.dynamicEffectExtends, jsonGenerator, BLiveDynamicEffectExtend.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUserCardWholeFrameConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveusercardwholeframeconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<BLiveDynamicEffectExtend> dynamicEffectExtends;

    @NonNull
    @ProtobufIndex(index = 2)
    public String playType;

    @ProtobufIndex(index = 3)
    public int resourceId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String staticUrl;

    public static BLiveUserCardWholeFrameConfig new_() {
        BLiveUserCardWholeFrameConfig bLiveUserCardWholeFrameConfig = new BLiveUserCardWholeFrameConfig();
        bLiveUserCardWholeFrameConfig.nullCheck();
        return bLiveUserCardWholeFrameConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUserCardWholeFrameConfig mo223809clone() {
        BLiveUserCardWholeFrameConfig bLiveUserCardWholeFrameConfig = new BLiveUserCardWholeFrameConfig();
        bLiveUserCardWholeFrameConfig.playType = this.playType;
        bLiveUserCardWholeFrameConfig.resourceId = this.resourceId;
        bLiveUserCardWholeFrameConfig.staticUrl = this.staticUrl;
        List<BLiveDynamicEffectExtend> list = this.dynamicEffectExtends;
        if (list != null) {
            bLiveUserCardWholeFrameConfig.dynamicEffectExtends = ValueObject.util_map(list, new w9j() { // from class: l.p72
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveDynamicEffectExtend) obj).mo223809clone();
                }
            });
        }
        return bLiveUserCardWholeFrameConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUserCardWholeFrameConfig)) {
            return false;
        }
        BLiveUserCardWholeFrameConfig bLiveUserCardWholeFrameConfig = (BLiveUserCardWholeFrameConfig) obj;
        return ValueObject.util_equals(this.playType, bLiveUserCardWholeFrameConfig.playType) && this.resourceId == bLiveUserCardWholeFrameConfig.resourceId && ValueObject.util_equals(this.staticUrl, bLiveUserCardWholeFrameConfig.staticUrl) && ValueObject.util_equals(this.dynamicEffectExtends, bLiveUserCardWholeFrameConfig.dynamicEffectExtends);
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
        String str = this.playType;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.resourceId) * 41;
        String str2 = this.staticUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<BLiveDynamicEffectExtend> list = this.dynamicEffectExtends;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.playType == null) {
            this.playType = "";
        }
        if (this.staticUrl == null) {
            this.staticUrl = "";
        }
        if (this.dynamicEffectExtends == null) {
            this.dynamicEffectExtends = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
