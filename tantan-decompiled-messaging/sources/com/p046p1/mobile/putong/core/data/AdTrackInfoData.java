package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class AdTrackInfoData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "adtrackinfodata";

    @NonNull
    @ProtobufIndex(index = 1)
    public AdTrackInfo adTrackInfo;
    public static ProtobufAdapter<AdTrackInfoData> PROTOBUF_ADAPTER = new MessageNanoAdapter<AdTrackInfoData>() { // from class: com.p1.mobile.putong.core.data.AdTrackInfoData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AdTrackInfoData adTrackInfoData) {
            AdTrackInfo adTrackInfo = adTrackInfoData.adTrackInfo;
            int iM17230l = adTrackInfo != null ? CodedOutputByteBufferNano.m17230l(1, adTrackInfo, AdTrackInfo.PROTOBUF_ADAPTER) : 0;
            adTrackInfoData.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AdTrackInfoData parse(nb5 nb5Var) throws IOException {
            AdTrackInfoData adTrackInfoData = new AdTrackInfoData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (adTrackInfoData.adTrackInfo != null) {
                        break;
                    }
                    adTrackInfoData.adTrackInfo = AdTrackInfo.new_();
                    break;
                }
                if (iM158752u != 10) {
                    if (adTrackInfoData.adTrackInfo != null) {
                        break;
                    }
                    adTrackInfoData.adTrackInfo = AdTrackInfo.new_();
                    return adTrackInfoData;
                }
                adTrackInfoData.adTrackInfo = (AdTrackInfo) nb5Var.m158743l(AdTrackInfo.PROTOBUF_ADAPTER);
            }
            return adTrackInfoData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AdTrackInfoData adTrackInfoData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            AdTrackInfo adTrackInfo = adTrackInfoData.adTrackInfo;
            if (adTrackInfo != null) {
                codedOutputByteBufferNano.m17254K(1, adTrackInfo, AdTrackInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AdTrackInfoData> JSON_ADAPTER = new ObjectJsonAdapter<AdTrackInfoData>() { // from class: com.p1.mobile.putong.core.data.AdTrackInfoData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AdTrackInfoData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AdTrackInfoData newInstance() {
            return new AdTrackInfoData();
        }

        public boolean parseField(AdTrackInfoData adTrackInfoData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("adTrackInfo")) {
                return false;
            }
            adTrackInfoData.adTrackInfo = AdTrackInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AdTrackInfoData adTrackInfoData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("adTrackInfo")) {
                return true;
            }
            return super.parseFieldCheck(adTrackInfoData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AdTrackInfoData adTrackInfoData, JsonGenerator jsonGenerator) throws IOException {
            if (adTrackInfoData.adTrackInfo != null) {
                jsonGenerator.writeFieldName("adTrackInfo");
                AdTrackInfo.JSON_ADAPTER.serialize(adTrackInfoData.adTrackInfo, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AdTrackInfoData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AdTrackInfoData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AdTrackInfoData new_() {
        AdTrackInfoData adTrackInfoData = new AdTrackInfoData();
        adTrackInfoData.nullCheck();
        return adTrackInfoData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AdTrackInfoData mo223809clone() {
        AdTrackInfoData adTrackInfoData = new AdTrackInfoData();
        AdTrackInfo adTrackInfo = this.adTrackInfo;
        if (adTrackInfo != null) {
            adTrackInfoData.adTrackInfo = adTrackInfo.mo223809clone();
        }
        return adTrackInfoData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdTrackInfoData) {
            return ValueObject.util_equals(this.adTrackInfo, ((AdTrackInfoData) obj).adTrackInfo);
        }
        return false;
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
        AdTrackInfo adTrackInfo = this.adTrackInfo;
        int iHashCode = i2 + (adTrackInfo != null ? adTrackInfo.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.adTrackInfo == null) {
            this.adTrackInfo = AdTrackInfo.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
