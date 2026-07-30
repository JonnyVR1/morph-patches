package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class AdSdk extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "adsdk";

    @NonNull
    @ProtobufIndex(index = 1)
    public AdSdkConfig gdt;

    @NonNull
    @ProtobufIndex(index = 2)
    public AdSdkConfig momo;
    public static ProtobufAdapter<AdSdk> PROTOBUF_ADAPTER = new MessageNanoAdapter<AdSdk>() { // from class: com.p1.mobile.putong.data.AdSdk.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AdSdk adSdk) {
            AdSdkConfig adSdkConfig = adSdk.gdt;
            int iM17230l = adSdkConfig != null ? CodedOutputByteBufferNano.m17230l(1, adSdkConfig, AdSdkConfig.PROTOBUF_ADAPTER) : 0;
            AdSdkConfig adSdkConfig2 = adSdk.momo;
            if (adSdkConfig2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, adSdkConfig2, AdSdkConfig.PROTOBUF_ADAPTER);
            }
            adSdk.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AdSdk parse(nb5 nb5Var) throws IOException {
            AdSdk adSdk = new AdSdk();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (adSdk.gdt == null) {
                        adSdk.gdt = AdSdkConfig.new_();
                    }
                    if (adSdk.momo != null) {
                        break;
                    }
                    adSdk.momo = AdSdkConfig.new_();
                    break;
                }
                if (iM158752u == 10) {
                    adSdk.gdt = (AdSdkConfig) nb5Var.m158743l(AdSdkConfig.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (adSdk.gdt == null) {
                            adSdk.gdt = AdSdkConfig.new_();
                        }
                        if (adSdk.momo != null) {
                            break;
                        }
                        adSdk.momo = AdSdkConfig.new_();
                        return adSdk;
                    }
                    adSdk.momo = (AdSdkConfig) nb5Var.m158743l(AdSdkConfig.PROTOBUF_ADAPTER);
                }
            }
            return adSdk;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AdSdk adSdk, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            AdSdkConfig adSdkConfig = adSdk.gdt;
            if (adSdkConfig != null) {
                codedOutputByteBufferNano.m17254K(1, adSdkConfig, AdSdkConfig.PROTOBUF_ADAPTER);
            }
            AdSdkConfig adSdkConfig2 = adSdk.momo;
            if (adSdkConfig2 != null) {
                codedOutputByteBufferNano.m17254K(2, adSdkConfig2, AdSdkConfig.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AdSdk> JSON_ADAPTER = new ObjectJsonAdapter<AdSdk>() { // from class: com.p1.mobile.putong.data.AdSdk.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AdSdk.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AdSdk newInstance() {
            return new AdSdk();
        }

        public boolean parseField(AdSdk adSdk, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("gdt")) {
                adSdk.gdt = AdSdkConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("momo")) {
                return false;
            }
            adSdk.momo = AdSdkConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AdSdk adSdk, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("gdt") || str.equals("momo")) {
                return true;
            }
            return super.parseFieldCheck(adSdk, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AdSdk adSdk, JsonGenerator jsonGenerator) throws IOException {
            if (adSdk.gdt != null) {
                jsonGenerator.writeFieldName("gdt");
                AdSdkConfig.JSON_ADAPTER.serialize(adSdk.gdt, jsonGenerator, true);
            }
            if (adSdk.momo != null) {
                jsonGenerator.writeFieldName("momo");
                AdSdkConfig.JSON_ADAPTER.serialize(adSdk.momo, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AdSdk) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AdSdk) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AdSdk new_() {
        AdSdk adSdk = new AdSdk();
        adSdk.nullCheck();
        return adSdk;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AdSdk mo223809clone() {
        AdSdk adSdk = new AdSdk();
        AdSdkConfig adSdkConfig = this.gdt;
        if (adSdkConfig != null) {
            adSdk.gdt = adSdkConfig.mo223809clone();
        }
        AdSdkConfig adSdkConfig2 = this.momo;
        if (adSdkConfig2 != null) {
            adSdk.momo = adSdkConfig2.mo223809clone();
        }
        return adSdk;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSdk)) {
            return false;
        }
        AdSdk adSdk = (AdSdk) obj;
        return ValueObject.util_equals(this.gdt, adSdk.gdt) && ValueObject.util_equals(this.momo, adSdk.momo);
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
        AdSdkConfig adSdkConfig = this.gdt;
        int iHashCode = (i2 + (adSdkConfig != null ? adSdkConfig.hashCode() : 0)) * 41;
        AdSdkConfig adSdkConfig2 = this.momo;
        int iHashCode2 = iHashCode + (adSdkConfig2 != null ? adSdkConfig2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.gdt == null) {
            this.gdt = AdSdkConfig.new_();
        }
        if (this.momo == null) {
            this.momo = AdSdkConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
