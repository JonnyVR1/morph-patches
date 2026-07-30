package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class AdScenes extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "adscenes";

    @NonNull
    @ProtobufIndex(index = 1)
    public AdRewardExt ext;

    @NonNull
    @ProtobufIndex(index = 3)
    public AdSdk sdkConfig;

    @NonNull
    @ProtobufIndex(index = 2)
    public String selectMethod;
    public static ProtobufAdapter<AdScenes> PROTOBUF_ADAPTER = new MessageNanoAdapter<AdScenes>() { // from class: com.p1.mobile.putong.data.AdScenes.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AdScenes adScenes) {
            AdRewardExt adRewardExt = adScenes.ext;
            int iM17285l = adRewardExt != null ? CodedOutputByteBufferNano.m17285l(1, adRewardExt, AdRewardExt.PROTOBUF_ADAPTER) : 0;
            String str = adScenes.selectMethod;
            if (str != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(2, str);
            }
            AdSdk adSdk = adScenes.sdkConfig;
            if (adSdk != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, adSdk, AdSdk.PROTOBUF_ADAPTER);
            }
            adScenes.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AdScenes parse(nc5 nc5Var) throws IOException {
            AdScenes adScenes = new AdScenes();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (adScenes.selectMethod == null) {
                        adScenes.selectMethod = "";
                    }
                    if (adScenes.sdkConfig == null) {
                        adScenes.sdkConfig = AdSdk.new_();
                    }
                    if (adScenes.ext != null) {
                        break;
                    }
                    adScenes.ext = AdRewardExt.new_();
                    break;
                }
                if (iM162497u == 10) {
                    adScenes.ext = (AdRewardExt) nc5Var.m162488l(AdRewardExt.PROTOBUF_ADAPTER);
                } else if (iM162497u == 18) {
                    adScenes.selectMethod = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (adScenes.selectMethod == null) {
                            adScenes.selectMethod = "";
                        }
                        if (adScenes.sdkConfig == null) {
                            adScenes.sdkConfig = AdSdk.new_();
                        }
                        if (adScenes.ext != null) {
                            break;
                        }
                        adScenes.ext = AdRewardExt.new_();
                        return adScenes;
                    }
                    adScenes.sdkConfig = (AdSdk) nc5Var.m162488l(AdSdk.PROTOBUF_ADAPTER);
                }
            }
            return adScenes;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AdScenes adScenes, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            AdRewardExt adRewardExt = adScenes.ext;
            if (adRewardExt != null) {
                codedOutputByteBufferNano.m17309K(1, adRewardExt, AdRewardExt.PROTOBUF_ADAPTER);
            }
            String str = adScenes.selectMethod;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            AdSdk adSdk = adScenes.sdkConfig;
            if (adSdk != null) {
                codedOutputByteBufferNano.m17309K(3, adSdk, AdSdk.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AdScenes> JSON_ADAPTER = new ObjectJsonAdapter<AdScenes>() { // from class: com.p1.mobile.putong.data.AdScenes.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AdScenes.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AdScenes newInstance() {
            return new AdScenes();
        }

        public boolean parseField(AdScenes adScenes, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "sdkConfig":
                    adScenes.sdkConfig = AdSdk.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "ext":
                    adScenes.ext = AdRewardExt.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "selectMethod":
                    adScenes.selectMethod = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AdScenes adScenes, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "sdkConfig":
                case "ext":
                case "selectMethod":
                    return true;
                default:
                    return super.parseFieldCheck(adScenes, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AdScenes adScenes, JsonGenerator jsonGenerator) throws IOException {
            String str = adScenes.selectMethod;
            if (str != null) {
                jsonGenerator.writeStringField("selectMethod", str);
            }
            if (adScenes.sdkConfig != null) {
                jsonGenerator.writeFieldName("sdkConfig");
                AdSdk.JSON_ADAPTER.serialize(adScenes.sdkConfig, jsonGenerator, true);
            }
            if (adScenes.ext != null) {
                jsonGenerator.writeFieldName(BaseSei.EXT);
                AdRewardExt.JSON_ADAPTER.serialize(adScenes.ext, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AdScenes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AdScenes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AdScenes new_() {
        AdScenes adScenes = new AdScenes();
        adScenes.nullCheck();
        return adScenes;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AdScenes mo225055clone() {
        AdScenes adScenes = new AdScenes();
        adScenes.selectMethod = this.selectMethod;
        AdSdk adSdk = this.sdkConfig;
        if (adSdk != null) {
            adScenes.sdkConfig = adSdk.mo225055clone();
        }
        AdRewardExt adRewardExt = this.ext;
        if (adRewardExt != null) {
            adScenes.ext = adRewardExt.mo225055clone();
        }
        return adScenes;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdScenes)) {
            return false;
        }
        AdScenes adScenes = (AdScenes) obj;
        return ValueObject.util_equals(this.selectMethod, adScenes.selectMethod) && ValueObject.util_equals(this.sdkConfig, adScenes.sdkConfig) && ValueObject.util_equals(this.ext, adScenes.ext);
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
        String str = this.selectMethod;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        AdSdk adSdk = this.sdkConfig;
        int iHashCode2 = (iHashCode + (adSdk != null ? adSdk.hashCode() : 0)) * 41;
        AdRewardExt adRewardExt = this.ext;
        int iHashCode3 = iHashCode2 + (adRewardExt != null ? adRewardExt.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.selectMethod == null) {
            this.selectMethod = "";
        }
        if (this.sdkConfig == null) {
            this.sdkConfig = AdSdk.new_();
        }
        if (this.ext == null) {
            this.ext = AdRewardExt.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
