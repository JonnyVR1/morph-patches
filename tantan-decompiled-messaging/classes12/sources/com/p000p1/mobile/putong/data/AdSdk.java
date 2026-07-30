package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AdSdk adSdk) {
            AdSdkConfig adSdkConfig = adSdk.gdt;
            int iL = adSdkConfig != null ? CodedOutputByteBufferNano.l(1, adSdkConfig, AdSdkConfig.PROTOBUF_ADAPTER) : 0;
            AdSdkConfig adSdkConfig2 = adSdk.momo;
            if (adSdkConfig2 != null) {
                iL += CodedOutputByteBufferNano.l(2, adSdkConfig2, AdSdkConfig.PROTOBUF_ADAPTER);
            }
            ((MessageNano) adSdk).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AdSdk m17647parse(nb5 nb5Var) throws IOException {
            AdSdk adSdk = new AdSdk();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (adSdk.gdt == null) {
                        adSdk.gdt = AdSdkConfig.new_();
                    }
                    if (adSdk.momo != null) {
                        break;
                    }
                    adSdk.momo = AdSdkConfig.new_();
                    break;
                }
                if (iU == 10) {
                    adSdk.gdt = (AdSdkConfig) nb5Var.l(AdSdkConfig.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (adSdk.gdt == null) {
                            adSdk.gdt = AdSdkConfig.new_();
                        }
                        if (adSdk.momo != null) {
                            break;
                        }
                        adSdk.momo = AdSdkConfig.new_();
                        return adSdk;
                    }
                    adSdk.momo = (AdSdkConfig) nb5Var.l(AdSdkConfig.PROTOBUF_ADAPTER);
                }
            }
            return adSdk;
        }

        public void serialize(AdSdk adSdk, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            AdSdkConfig adSdkConfig = adSdk.gdt;
            if (adSdkConfig != null) {
                codedOutputByteBufferNano.K(1, adSdkConfig, AdSdkConfig.PROTOBUF_ADAPTER);
            }
            AdSdkConfig adSdkConfig2 = adSdk.momo;
            if (adSdkConfig2 != null) {
                codedOutputByteBufferNano.K(2, adSdkConfig2, AdSdkConfig.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AdSdk> JSON_ADAPTER = new ObjectJsonAdapter<AdSdk>() { // from class: com.p1.mobile.putong.data.AdSdk.2
        public Class getDataClass() {
            return AdSdk.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AdSdk mo17830newInstance() {
            return new AdSdk();
        }

        public boolean parseField(AdSdk adSdk, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("gdt")) {
                adSdk.gdt = (AdSdkConfig) AdSdkConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("momo")) {
                return false;
            }
            adSdk.momo = (AdSdkConfig) AdSdkConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AdSdk adSdk, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("gdt") || str.equals("momo")) {
                return true;
            }
            return super.parseFieldCheck(adSdk, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AdSdk) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AdSdk) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AdSdk new_() {
        AdSdk adSdk = new AdSdk();
        adSdk.nullCheck();
        return adSdk;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AdSdk m17646clone() {
        AdSdk adSdk = new AdSdk();
        AdSdkConfig adSdkConfig = this.gdt;
        if (adSdkConfig != null) {
            adSdk.gdt = adSdkConfig.m17649clone();
        }
        AdSdkConfig adSdkConfig2 = this.momo;
        if (adSdkConfig2 != null) {
            adSdk.momo = adSdkConfig2.m17649clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        AdSdkConfig adSdkConfig = this.gdt;
        int iHashCode = (i2 + (adSdkConfig != null ? adSdkConfig.hashCode() : 0)) * 41;
        AdSdkConfig adSdkConfig2 = this.momo;
        int iHashCode2 = iHashCode + (adSdkConfig2 != null ? adSdkConfig2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.gdt == null) {
            this.gdt = AdSdkConfig.new_();
        }
        if (this.momo == null) {
            this.momo = AdSdkConfig.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
