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
public class AdSdkConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "adsdkconfig";

    @ProtobufIndex(index = 2)
    public long basePrice;

    @NonNull
    @ProtobufIndex(index = 1)
    public String placementId;
    public static ProtobufAdapter<AdSdkConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<AdSdkConfig>() { // from class: com.p1.mobile.putong.data.AdSdkConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AdSdkConfig adSdkConfig) {
            String str = adSdkConfig.placementId;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.j(2, adSdkConfig.basePrice);
            ((MessageNano) adSdkConfig).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AdSdkConfig m17650parse(nb5 nb5Var) throws IOException {
            AdSdkConfig adSdkConfig = new AdSdkConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (adSdkConfig.placementId != null) {
                        break;
                    }
                    adSdkConfig.placementId = "";
                    break;
                }
                if (iU == 10) {
                    adSdkConfig.placementId = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (adSdkConfig.placementId != null) {
                            break;
                        }
                        adSdkConfig.placementId = "";
                        return adSdkConfig;
                    }
                    adSdkConfig.basePrice = nb5Var.k();
                }
            }
            return adSdkConfig;
        }

        public void serialize(AdSdkConfig adSdkConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = adSdkConfig.placementId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.I(2, adSdkConfig.basePrice);
        }
    };
    public static JsonAdapter<AdSdkConfig> JSON_ADAPTER = new ObjectJsonAdapter<AdSdkConfig>() { // from class: com.p1.mobile.putong.data.AdSdkConfig.2
        public Class getDataClass() {
            return AdSdkConfig.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AdSdkConfig mo17830newInstance() {
            return new AdSdkConfig();
        }

        public boolean parseField(AdSdkConfig adSdkConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("basePrice")) {
                adSdkConfig.basePrice = jsonParser.getValueAsLong();
                return true;
            }
            if (!str.equals("placementId")) {
                return false;
            }
            adSdkConfig.placementId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(AdSdkConfig adSdkConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("basePrice") || str.equals("placementId")) {
                return true;
            }
            return super.parseFieldCheck(adSdkConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AdSdkConfig adSdkConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = adSdkConfig.placementId;
            if (str != null) {
                jsonGenerator.writeStringField("placementId", str);
            }
            jsonGenerator.writeNumberField("basePrice", adSdkConfig.basePrice);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AdSdkConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AdSdkConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AdSdkConfig new_() {
        AdSdkConfig adSdkConfig = new AdSdkConfig();
        adSdkConfig.nullCheck();
        return adSdkConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AdSdkConfig m17649clone() {
        AdSdkConfig adSdkConfig = new AdSdkConfig();
        adSdkConfig.placementId = this.placementId;
        adSdkConfig.basePrice = this.basePrice;
        return adSdkConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSdkConfig)) {
            return false;
        }
        AdSdkConfig adSdkConfig = (AdSdkConfig) obj;
        return ValueObject.util_equals(this.placementId, adSdkConfig.placementId) && this.basePrice == adSdkConfig.basePrice;
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
        String str = this.placementId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        long j = this.basePrice;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.placementId == null) {
            this.placementId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
