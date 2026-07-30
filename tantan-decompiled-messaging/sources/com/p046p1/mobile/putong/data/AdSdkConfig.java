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
public class AdSdkConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "adsdkconfig";

    @ProtobufIndex(index = 2)
    public long basePrice;

    @NonNull
    @ProtobufIndex(index = 1)
    public String placementId;
    public static ProtobufAdapter<AdSdkConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<AdSdkConfig>() { // from class: com.p1.mobile.putong.data.AdSdkConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AdSdkConfig adSdkConfig) {
            String str = adSdkConfig.placementId;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17228j(2, adSdkConfig.basePrice);
            adSdkConfig.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AdSdkConfig parse(nb5 nb5Var) throws IOException {
            AdSdkConfig adSdkConfig = new AdSdkConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (adSdkConfig.placementId != null) {
                        break;
                    }
                    adSdkConfig.placementId = "";
                    break;
                }
                if (iM158752u == 10) {
                    adSdkConfig.placementId = nb5Var.m158750s();
                } else {
                    if (iM158752u != 16) {
                        if (adSdkConfig.placementId != null) {
                            break;
                        }
                        adSdkConfig.placementId = "";
                        return adSdkConfig;
                    }
                    adSdkConfig.basePrice = nb5Var.m158742k();
                }
            }
            return adSdkConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AdSdkConfig adSdkConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = adSdkConfig.placementId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17252I(2, adSdkConfig.basePrice);
        }
    };
    public static JsonAdapter<AdSdkConfig> JSON_ADAPTER = new ObjectJsonAdapter<AdSdkConfig>() { // from class: com.p1.mobile.putong.data.AdSdkConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AdSdkConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AdSdkConfig newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AdSdkConfig adSdkConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = adSdkConfig.placementId;
            if (str != null) {
                jsonGenerator.writeStringField("placementId", str);
            }
            jsonGenerator.writeNumberField("basePrice", adSdkConfig.basePrice);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AdSdkConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AdSdkConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AdSdkConfig new_() {
        AdSdkConfig adSdkConfig = new AdSdkConfig();
        adSdkConfig.nullCheck();
        return adSdkConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AdSdkConfig mo223809clone() {
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
        String str = this.placementId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        long j = this.basePrice;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.placementId == null) {
            this.placementId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
