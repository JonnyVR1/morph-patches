package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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

/* JADX INFO: loaded from: classes10.dex */
public class AdTrackInfoEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "adtrackinfoenvelope";

    @NonNull
    @ProtobufIndex(index = 1)
    public AdTrackInfoData data;
    public static ProtobufAdapter<AdTrackInfoEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<AdTrackInfoEnvelope>() { // from class: com.p1.mobile.putong.core.data.AdTrackInfoEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AdTrackInfoEnvelope adTrackInfoEnvelope) {
            AdTrackInfoData adTrackInfoData = adTrackInfoEnvelope.data;
            int iM17285l = adTrackInfoData != null ? CodedOutputByteBufferNano.m17285l(1, adTrackInfoData, AdTrackInfoData.PROTOBUF_ADAPTER) : 0;
            adTrackInfoEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AdTrackInfoEnvelope parse(nc5 nc5Var) throws IOException {
            AdTrackInfoEnvelope adTrackInfoEnvelope = new AdTrackInfoEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (adTrackInfoEnvelope.data != null) {
                        break;
                    }
                    adTrackInfoEnvelope.data = AdTrackInfoData.new_();
                    break;
                }
                if (iM162497u != 10) {
                    if (adTrackInfoEnvelope.data != null) {
                        break;
                    }
                    adTrackInfoEnvelope.data = AdTrackInfoData.new_();
                    return adTrackInfoEnvelope;
                }
                adTrackInfoEnvelope.data = (AdTrackInfoData) nc5Var.m162488l(AdTrackInfoData.PROTOBUF_ADAPTER);
            }
            return adTrackInfoEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AdTrackInfoEnvelope adTrackInfoEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            AdTrackInfoData adTrackInfoData = adTrackInfoEnvelope.data;
            if (adTrackInfoData != null) {
                codedOutputByteBufferNano.m17309K(1, adTrackInfoData, AdTrackInfoData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AdTrackInfoEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<AdTrackInfoEnvelope>() { // from class: com.p1.mobile.putong.core.data.AdTrackInfoEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AdTrackInfoEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AdTrackInfoEnvelope newInstance() {
            return new AdTrackInfoEnvelope();
        }

        public boolean parseField(AdTrackInfoEnvelope adTrackInfoEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("data")) {
                return false;
            }
            adTrackInfoEnvelope.data = AdTrackInfoData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AdTrackInfoEnvelope adTrackInfoEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data")) {
                return true;
            }
            return super.parseFieldCheck(adTrackInfoEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AdTrackInfoEnvelope adTrackInfoEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (adTrackInfoEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                AdTrackInfoData.JSON_ADAPTER.serialize(adTrackInfoEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AdTrackInfoEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AdTrackInfoEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AdTrackInfoEnvelope new_() {
        AdTrackInfoEnvelope adTrackInfoEnvelope = new AdTrackInfoEnvelope();
        adTrackInfoEnvelope.nullCheck();
        return adTrackInfoEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AdTrackInfoEnvelope mo225055clone() {
        AdTrackInfoEnvelope adTrackInfoEnvelope = new AdTrackInfoEnvelope();
        AdTrackInfoData adTrackInfoData = this.data;
        if (adTrackInfoData != null) {
            adTrackInfoEnvelope.data = adTrackInfoData.mo225055clone();
        }
        return adTrackInfoEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdTrackInfoEnvelope) {
            return ValueObject.util_equals(this.data, ((AdTrackInfoEnvelope) obj).data);
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
        AdTrackInfoData adTrackInfoData = this.data;
        int iHashCode = i2 + (adTrackInfoData != null ? adTrackInfoData.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.data == null) {
            this.data = AdTrackInfoData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
