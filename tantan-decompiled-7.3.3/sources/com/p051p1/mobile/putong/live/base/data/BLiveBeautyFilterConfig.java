package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveBeautyItem;
import com.p051p1.mobile.putong.live.base.data.BLiveFilterItem;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveBeautyFilterConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveBeautyFilterConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveBeautyFilterConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveBeautyFilterConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveBeautyFilterConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveBeautyFilterConfig newInstance() {
            return new BLiveBeautyFilterConfig();
        }

        public boolean parseField(BLiveBeautyFilterConfig bLiveBeautyFilterConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "momoResourcesUrl":
                    bLiveBeautyFilterConfig.momoResourcesUrl = jsonParser.getValueAsString();
                    return true;
                case "beautyConfig":
                    bLiveBeautyFilterConfig.beautyConfig = JsonAdapter.parseArray(jsonParser, BLiveBeautyItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "byteCvModelUrl":
                    bLiveBeautyFilterConfig.byteCvModelUrl = jsonParser.getValueAsString();
                    return true;
                case "licenseMd5":
                    bLiveBeautyFilterConfig.licenseMd5 = jsonParser.getValueAsString();
                    return true;
                case "licenseUrl":
                    bLiveBeautyFilterConfig.licenseUrl = jsonParser.getValueAsString();
                    return true;
                case "byteCvModelZipMd5":
                    bLiveBeautyFilterConfig.byteCvModelZipMd5 = jsonParser.getValueAsString();
                    return true;
                case "resourcesUrl":
                    bLiveBeautyFilterConfig.resourcesUrl = jsonParser.getValueAsString();
                    return true;
                case "md5":
                    bLiveBeautyFilterConfig.md5 = jsonParser.getValueAsString();
                    return true;
                case "version":
                    bLiveBeautyFilterConfig.version = jsonParser.getValueAsInt();
                    return true;
                case "momoMd5":
                    bLiveBeautyFilterConfig.momoMd5 = jsonParser.getValueAsString();
                    return true;
                case "filterConfig":
                    bLiveBeautyFilterConfig.filterConfig = JsonAdapter.parseArray(jsonParser, BLiveFilterItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "makeUpConfig":
                    bLiveBeautyFilterConfig.makeUpConfig = JsonAdapter.parseArray(jsonParser, BLiveBeautyItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveBeautyFilterConfig bLiveBeautyFilterConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveBeautyFilterConfig.resourcesUrl;
            if (str != null) {
                jsonGenerator.writeStringField("resourcesUrl", str);
            }
            String str2 = bLiveBeautyFilterConfig.md5;
            if (str2 != null) {
                jsonGenerator.writeStringField("md5", str2);
            }
            jsonGenerator.writeNumberField(WBConstants.AUTH_PARAMS_VERSION, bLiveBeautyFilterConfig.version);
            if (bLiveBeautyFilterConfig.beautyConfig != null) {
                jsonGenerator.writeFieldName("beautyConfig");
                JsonAdapter.serializeArray(bLiveBeautyFilterConfig.beautyConfig, jsonGenerator, BLiveBeautyItem.JSON_ADAPTER);
            }
            if (bLiveBeautyFilterConfig.makeUpConfig != null) {
                jsonGenerator.writeFieldName("makeUpConfig");
                JsonAdapter.serializeArray(bLiveBeautyFilterConfig.makeUpConfig, jsonGenerator, BLiveBeautyItem.JSON_ADAPTER);
            }
            if (bLiveBeautyFilterConfig.filterConfig != null) {
                jsonGenerator.writeFieldName("filterConfig");
                JsonAdapter.serializeArray(bLiveBeautyFilterConfig.filterConfig, jsonGenerator, BLiveFilterItem.JSON_ADAPTER);
            }
            String str3 = bLiveBeautyFilterConfig.momoResourcesUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("momoResourcesUrl", str3);
            }
            String str4 = bLiveBeautyFilterConfig.momoMd5;
            if (str4 != null) {
                jsonGenerator.writeStringField("momoMd5", str4);
            }
            String str5 = bLiveBeautyFilterConfig.licenseUrl;
            if (str5 != null) {
                jsonGenerator.writeStringField("licenseUrl", str5);
            }
            String str6 = bLiveBeautyFilterConfig.licenseMd5;
            if (str6 != null) {
                jsonGenerator.writeStringField("licenseMd5", str6);
            }
            String str7 = bLiveBeautyFilterConfig.byteCvModelUrl;
            if (str7 != null) {
                jsonGenerator.writeStringField("byteCvModelUrl", str7);
            }
            String str8 = bLiveBeautyFilterConfig.byteCvModelZipMd5;
            if (str8 != null) {
                jsonGenerator.writeStringField("byteCvModelZipMd5", str8);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveBeautyFilterConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivebeautyfilterconfig";

    @NonNull
    @ProtobufIndex(index = 4)
    public List<BLiveBeautyItem> beautyConfig;

    @NonNull
    @ProtobufIndex(index = 11)
    public String byteCvModelUrl;

    @NonNull
    @ProtobufIndex(index = 12)
    public String byteCvModelZipMd5;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<BLiveFilterItem> filterConfig;

    @NonNull
    @ProtobufIndex(index = 10)
    public String licenseMd5;

    @NonNull
    @ProtobufIndex(index = 9)
    public String licenseUrl;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<BLiveBeautyItem> makeUpConfig;

    @NonNull
    @ProtobufIndex(index = 2)
    public String md5;

    @NonNull
    @ProtobufIndex(index = 8)
    public String momoMd5;

    @NonNull
    @ProtobufIndex(index = 7)
    public String momoResourcesUrl;

    @NonNull
    @ProtobufIndex(index = 1)
    public String resourcesUrl;

    @ProtobufIndex(index = 3)
    public int version;

    public static BLiveBeautyFilterConfig new_() {
        BLiveBeautyFilterConfig bLiveBeautyFilterConfig = new BLiveBeautyFilterConfig();
        bLiveBeautyFilterConfig.nullCheck();
        return bLiveBeautyFilterConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveBeautyFilterConfig mo225055clone() {
        BLiveBeautyFilterConfig bLiveBeautyFilterConfig = new BLiveBeautyFilterConfig();
        bLiveBeautyFilterConfig.resourcesUrl = this.resourcesUrl;
        bLiveBeautyFilterConfig.md5 = this.md5;
        bLiveBeautyFilterConfig.version = this.version;
        List<BLiveBeautyItem> list = this.beautyConfig;
        if (list != null) {
            bLiveBeautyFilterConfig.beautyConfig = ValueObject.util_map(list, new qcj() { // from class: l.tr1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveBeautyItem) obj).mo225055clone();
                }
            });
        }
        List<BLiveBeautyItem> list2 = this.makeUpConfig;
        if (list2 != null) {
            bLiveBeautyFilterConfig.makeUpConfig = ValueObject.util_map(list2, new qcj() { // from class: l.ur1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveBeautyItem) obj).mo225055clone();
                }
            });
        }
        List<BLiveFilterItem> list3 = this.filterConfig;
        if (list3 != null) {
            bLiveBeautyFilterConfig.filterConfig = ValueObject.util_map(list3, new qcj() { // from class: l.vr1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveFilterItem) obj).mo225055clone();
                }
            });
        }
        bLiveBeautyFilterConfig.momoResourcesUrl = this.momoResourcesUrl;
        bLiveBeautyFilterConfig.momoMd5 = this.momoMd5;
        bLiveBeautyFilterConfig.licenseUrl = this.licenseUrl;
        bLiveBeautyFilterConfig.licenseMd5 = this.licenseMd5;
        bLiveBeautyFilterConfig.byteCvModelUrl = this.byteCvModelUrl;
        bLiveBeautyFilterConfig.byteCvModelZipMd5 = this.byteCvModelZipMd5;
        return bLiveBeautyFilterConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveBeautyFilterConfig)) {
            return false;
        }
        BLiveBeautyFilterConfig bLiveBeautyFilterConfig = (BLiveBeautyFilterConfig) obj;
        return ValueObject.util_equals(this.resourcesUrl, bLiveBeautyFilterConfig.resourcesUrl) && ValueObject.util_equals(this.md5, bLiveBeautyFilterConfig.md5) && this.version == bLiveBeautyFilterConfig.version && ValueObject.util_equals(this.beautyConfig, bLiveBeautyFilterConfig.beautyConfig) && ValueObject.util_equals(this.makeUpConfig, bLiveBeautyFilterConfig.makeUpConfig) && ValueObject.util_equals(this.filterConfig, bLiveBeautyFilterConfig.filterConfig) && ValueObject.util_equals(this.momoResourcesUrl, bLiveBeautyFilterConfig.momoResourcesUrl) && ValueObject.util_equals(this.momoMd5, bLiveBeautyFilterConfig.momoMd5) && ValueObject.util_equals(this.licenseUrl, bLiveBeautyFilterConfig.licenseUrl) && ValueObject.util_equals(this.licenseMd5, bLiveBeautyFilterConfig.licenseMd5) && ValueObject.util_equals(this.byteCvModelUrl, bLiveBeautyFilterConfig.byteCvModelUrl) && ValueObject.util_equals(this.byteCvModelZipMd5, bLiveBeautyFilterConfig.byteCvModelZipMd5);
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
        String str = this.resourcesUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.md5;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.version) * 41;
        List<BLiveBeautyItem> list = this.beautyConfig;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveBeautyItem> list2 = this.makeUpConfig;
        int iHashCode4 = (iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<BLiveFilterItem> list3 = this.filterConfig;
        int iHashCode5 = (iHashCode4 + (list3 != null ? list3.hashCode() : 0)) * 41;
        String str3 = this.momoResourcesUrl;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.momoMd5;
        int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.licenseUrl;
        int iHashCode8 = (iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.licenseMd5;
        int iHashCode9 = (iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.byteCvModelUrl;
        int iHashCode10 = (iHashCode9 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.byteCvModelZipMd5;
        int iHashCode11 = iHashCode10 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = iHashCode11;
        return iHashCode11;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.resourcesUrl == null) {
            this.resourcesUrl = "";
        }
        if (this.md5 == null) {
            this.md5 = "";
        }
        if (this.beautyConfig == null) {
            this.beautyConfig = new ArrayList();
        }
        if (this.makeUpConfig == null) {
            this.makeUpConfig = new ArrayList();
        }
        if (this.filterConfig == null) {
            this.filterConfig = new ArrayList();
        }
        if (this.momoResourcesUrl == null) {
            this.momoResourcesUrl = "";
        }
        if (this.momoMd5 == null) {
            this.momoMd5 = "";
        }
        if (this.licenseUrl == null) {
            this.licenseUrl = "";
        }
        if (this.licenseMd5 == null) {
            this.licenseMd5 = "";
        }
        if (this.byteCvModelUrl == null) {
            this.byteCvModelUrl = "";
        }
        if (this.byteCvModelZipMd5 == null) {
            this.byteCvModelZipMd5 = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
