package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveWealthLogoConfig;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveWealthLogoConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveWealthLogoConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveWealthLogoConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveWealthLogoConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveWealthLogoConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveWealthLogoConfig newInstance() {
            return new BLiveWealthLogoConfig();
        }

        public boolean parseField(BLiveWealthLogoConfig bLiveWealthLogoConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherIconMap":
                    bLiveWealthLogoConfig.otherIconMap = JsonAdapter.parseMap(jsonParser, JsonAdapter.STRING_ADAPTER, str2);
                    return true;
                case "description":
                    bLiveWealthLogoConfig.description = jsonParser.getValueAsString();
                    return true;
                case "tipsMap":
                    bLiveWealthLogoConfig.tipsMap = JsonAdapter.parseMap(jsonParser, JsonAdapter.STRING_ADAPTER, str2);
                    return true;
                case "picture":
                    bLiveWealthLogoConfig.picture = jsonParser.getValueAsString();
                    return true;
                case "openNewIcon":
                    bLiveWealthLogoConfig.openNewIcon = jsonParser.getValueAsBoolean();
                    return true;
                case "swipeIconMap":
                    bLiveWealthLogoConfig.swipeIconMap = JsonAdapter.parseMap(jsonParser, JsonAdapter.STRING_ADAPTER, str2);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveWealthLogoConfig bLiveWealthLogoConfig, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveWealthLogoConfig.swipeIconMap != null) {
                jsonGenerator.writeFieldName("swipeIconMap");
                JsonAdapter.serializeMap(bLiveWealthLogoConfig.swipeIconMap, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (bLiveWealthLogoConfig.otherIconMap != null) {
                jsonGenerator.writeFieldName("otherIconMap");
                JsonAdapter.serializeMap(bLiveWealthLogoConfig.otherIconMap, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (bLiveWealthLogoConfig.tipsMap != null) {
                jsonGenerator.writeFieldName("tipsMap");
                JsonAdapter.serializeMap(bLiveWealthLogoConfig.tipsMap, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str = bLiveWealthLogoConfig.description;
            if (str != null) {
                jsonGenerator.writeStringField("description", str);
            }
            String str2 = bLiveWealthLogoConfig.picture;
            if (str2 != null) {
                jsonGenerator.writeStringField("picture", str2);
            }
            jsonGenerator.writeBooleanField("openNewIcon", bLiveWealthLogoConfig.openNewIcon);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveWealthLogoConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivewealthlogoconfig";

    @NonNull
    @ProtobufIndex(index = 4)
    public String description;

    @ProtobufIndex(index = 6)
    public boolean openNewIcon;

    @Nullable
    @ProtobufIndex(index = 2)
    public Map<String, String> otherIconMap;

    @NonNull
    @ProtobufIndex(index = 5)
    public String picture;

    @Nullable
    @ProtobufIndex(index = 1)
    public Map<String, String> swipeIconMap;

    @Nullable
    @ProtobufIndex(index = 3)
    public Map<String, String> tipsMap;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m69648a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m69649b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m69650c(String str) {
        return str;
    }

    public static BLiveWealthLogoConfig new_() {
        BLiveWealthLogoConfig bLiveWealthLogoConfig = new BLiveWealthLogoConfig();
        bLiveWealthLogoConfig.nullCheck();
        return bLiveWealthLogoConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveWealthLogoConfig mo225055clone() {
        BLiveWealthLogoConfig bLiveWealthLogoConfig = new BLiveWealthLogoConfig();
        Map<String, String> map = this.swipeIconMap;
        if (map != null) {
            bLiveWealthLogoConfig.swipeIconMap = ValueObject.util_map(map, new qcj() { // from class: l.ua2
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveWealthLogoConfig.m69648a((String) obj);
                }
            });
        }
        Map<String, String> map2 = this.otherIconMap;
        if (map2 != null) {
            bLiveWealthLogoConfig.otherIconMap = ValueObject.util_map(map2, new qcj() { // from class: l.va2
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveWealthLogoConfig.m69649b((String) obj);
                }
            });
        }
        Map<String, String> map3 = this.tipsMap;
        if (map3 != null) {
            bLiveWealthLogoConfig.tipsMap = ValueObject.util_map(map3, new qcj() { // from class: l.wa2
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveWealthLogoConfig.m69650c((String) obj);
                }
            });
        }
        bLiveWealthLogoConfig.description = this.description;
        bLiveWealthLogoConfig.picture = this.picture;
        bLiveWealthLogoConfig.openNewIcon = this.openNewIcon;
        return bLiveWealthLogoConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveWealthLogoConfig)) {
            return false;
        }
        BLiveWealthLogoConfig bLiveWealthLogoConfig = (BLiveWealthLogoConfig) obj;
        return ValueObject.util_equals(this.swipeIconMap, bLiveWealthLogoConfig.swipeIconMap) && ValueObject.util_equals(this.otherIconMap, bLiveWealthLogoConfig.otherIconMap) && ValueObject.util_equals(this.tipsMap, bLiveWealthLogoConfig.tipsMap) && ValueObject.util_equals(this.description, bLiveWealthLogoConfig.description) && ValueObject.util_equals(this.picture, bLiveWealthLogoConfig.picture) && this.openNewIcon == bLiveWealthLogoConfig.openNewIcon;
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
        Map<String, String> map = this.swipeIconMap;
        int iHashCode = (i2 + (map != null ? map.hashCode() : 0)) * 41;
        Map<String, String> map2 = this.otherIconMap;
        int iHashCode2 = (iHashCode + (map2 != null ? map2.hashCode() : 0)) * 41;
        Map<String, String> map3 = this.tipsMap;
        int iHashCode3 = (iHashCode2 + (map3 != null ? map3.hashCode() : 0)) * 41;
        String str = this.description;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.picture;
        int iHashCode5 = ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.openNewIcon ? 1231 : 1237);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.description == null) {
            this.description = "";
        }
        if (this.picture == null) {
            this.picture = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
