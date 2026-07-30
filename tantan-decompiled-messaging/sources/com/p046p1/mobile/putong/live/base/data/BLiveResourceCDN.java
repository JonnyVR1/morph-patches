package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveResourceCDN;
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
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveResourceCDN extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveResourceCDN> JSON_ADAPTER = new ObjectJsonAdapter<BLiveResourceCDN>() { // from class: com.p1.mobile.putong.live.base.data.BLiveResourceCDN.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveResourceCDN.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveResourceCDN newInstance() {
            return new BLiveResourceCDN();
        }

        public boolean parseField(BLiveResourceCDN bLiveResourceCDN, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "cdnUrl":
                    bLiveResourceCDN.cdnUrl = jsonParser.getValueAsString();
                    return true;
                case "enableDialogNewStrategy":
                    bLiveResourceCDN.enableDialogNewStrategy = jsonParser.getValueAsBoolean();
                    return true;
                case "region":
                    bLiveResourceCDN.region = LiveRegionTag.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "version":
                    bLiveResourceCDN.version = jsonParser.getValueAsString();
                    return true;
                case "loadResourceIdsMap":
                    bLiveResourceCDN.loadResourceIdsMap = BLiveResourceCDNLoadTypeItem.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "loadTypes":
                    bLiveResourceCDN.loadTypes = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveResourceCDN bLiveResourceCDN, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveResourceCDN.region != null) {
                jsonGenerator.writeFieldName("region");
                LiveRegionTag.JSON_ADAPTER.serialize(bLiveResourceCDN.region, jsonGenerator, true);
            }
            String str = bLiveResourceCDN.version;
            if (str != null) {
                jsonGenerator.writeStringField(WBConstants.AUTH_PARAMS_VERSION, str);
            }
            String str2 = bLiveResourceCDN.cdnUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("cdnUrl", str2);
            }
            if (bLiveResourceCDN.loadTypes != null) {
                jsonGenerator.writeFieldName("loadTypes");
                JsonAdapter.serializeArray(bLiveResourceCDN.loadTypes, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (bLiveResourceCDN.loadResourceIdsMap != null) {
                jsonGenerator.writeFieldName("loadResourceIdsMap");
                BLiveResourceCDNLoadTypeItem.JSON_ADAPTER.serialize(bLiveResourceCDN.loadResourceIdsMap, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("enableDialogNewStrategy", bLiveResourceCDN.enableDialogNewStrategy);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveResourceCDN) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveresourcecdn";

    @NonNull
    @ProtobufIndex(index = 3)
    public String cdnUrl;

    @ProtobufIndex(index = 7)
    public boolean enableDialogNewStrategy;

    @NonNull
    @ProtobufIndex(index = 6)
    public BLiveResourceCDNLoadTypeItem loadResourceIdsMap;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<String> loadTypes;

    @NonNull
    @ProtobufIndex(index = 1)
    public LiveRegionTag region;

    @NonNull
    @ProtobufIndex(index = 2)
    public String version;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m68190a(String str) {
        return str;
    }

    public static BLiveResourceCDN new_() {
        BLiveResourceCDN bLiveResourceCDN = new BLiveResourceCDN();
        bLiveResourceCDN.nullCheck();
        return bLiveResourceCDN;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveResourceCDN mo223809clone() {
        BLiveResourceCDN bLiveResourceCDN = new BLiveResourceCDN();
        bLiveResourceCDN.region = this.region;
        bLiveResourceCDN.version = this.version;
        bLiveResourceCDN.cdnUrl = this.cdnUrl;
        List<String> list = this.loadTypes;
        if (list != null) {
            bLiveResourceCDN.loadTypes = ValueObject.util_map(list, new w9j() { // from class: l.u42
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveResourceCDN.m68190a((String) obj);
                }
            });
        }
        BLiveResourceCDNLoadTypeItem bLiveResourceCDNLoadTypeItem = this.loadResourceIdsMap;
        if (bLiveResourceCDNLoadTypeItem != null) {
            bLiveResourceCDN.loadResourceIdsMap = bLiveResourceCDNLoadTypeItem.mo223809clone();
        }
        bLiveResourceCDN.enableDialogNewStrategy = this.enableDialogNewStrategy;
        return bLiveResourceCDN;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveResourceCDN)) {
            return false;
        }
        BLiveResourceCDN bLiveResourceCDN = (BLiveResourceCDN) obj;
        return ValueObject.util_equals(this.region, bLiveResourceCDN.region) && ValueObject.util_equals(this.version, bLiveResourceCDN.version) && ValueObject.util_equals(this.cdnUrl, bLiveResourceCDN.cdnUrl) && ValueObject.util_equals(this.loadTypes, bLiveResourceCDN.loadTypes) && ValueObject.util_equals(this.loadResourceIdsMap, bLiveResourceCDN.loadResourceIdsMap) && this.enableDialogNewStrategy == bLiveResourceCDN.enableDialogNewStrategy;
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
        LiveRegionTag liveRegionTag = this.region;
        int iHashCode = (i2 + (liveRegionTag != null ? liveRegionTag.hashCode() : 0)) * 41;
        String str = this.version;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.cdnUrl;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.loadTypes;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 41;
        BLiveResourceCDNLoadTypeItem bLiveResourceCDNLoadTypeItem = this.loadResourceIdsMap;
        int iHashCode5 = ((iHashCode4 + (bLiveResourceCDNLoadTypeItem != null ? bLiveResourceCDNLoadTypeItem.hashCode() : 0)) * 41) + (this.enableDialogNewStrategy ? 1231 : 1237);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.region == null) {
            this.region = (LiveRegionTag) LiveRegionTag.JSON_ADAPTER.defaultEnum();
        }
        if (this.version == null) {
            this.version = "";
        }
        if (this.cdnUrl == null) {
            this.cdnUrl = "";
        }
        if (this.loadTypes == null) {
            this.loadTypes = new ArrayList();
        }
        if (this.loadResourceIdsMap == null) {
            this.loadResourceIdsMap = BLiveResourceCDNLoadTypeItem.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
