package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class AdTrackInfoEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "adtrackinfoenvelope";

    @NonNull
    @ProtobufIndex(index = 1)
    public AdTrackInfoData data;
    public static ProtobufAdapter<AdTrackInfoEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<AdTrackInfoEnvelope>() { // from class: com.p1.mobile.putong.core.data.AdTrackInfoEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AdTrackInfoEnvelope adTrackInfoEnvelope) {
            AdTrackInfoData adTrackInfoData = adTrackInfoEnvelope.data;
            int iL = adTrackInfoData != null ? CodedOutputByteBufferNano.l(1, adTrackInfoData, AdTrackInfoData.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) adTrackInfoEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AdTrackInfoEnvelope m11541parse(nb5 nb5Var) throws IOException {
            AdTrackInfoEnvelope adTrackInfoEnvelope = new AdTrackInfoEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (adTrackInfoEnvelope.data != null) {
                        break;
                    }
                    adTrackInfoEnvelope.data = AdTrackInfoData.new_();
                    break;
                }
                if (iU != 10) {
                    if (adTrackInfoEnvelope.data != null) {
                        break;
                    }
                    adTrackInfoEnvelope.data = AdTrackInfoData.new_();
                    return adTrackInfoEnvelope;
                }
                adTrackInfoEnvelope.data = (AdTrackInfoData) nb5Var.l(AdTrackInfoData.PROTOBUF_ADAPTER);
            }
            return adTrackInfoEnvelope;
        }

        public void serialize(AdTrackInfoEnvelope adTrackInfoEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            AdTrackInfoData adTrackInfoData = adTrackInfoEnvelope.data;
            if (adTrackInfoData != null) {
                codedOutputByteBufferNano.K(1, adTrackInfoData, AdTrackInfoData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AdTrackInfoEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<AdTrackInfoEnvelope>() { // from class: com.p1.mobile.putong.core.data.AdTrackInfoEnvelope.2
        public Class getDataClass() {
            return AdTrackInfoEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AdTrackInfoEnvelope m11542newInstance() {
            return new AdTrackInfoEnvelope();
        }

        public boolean parseField(AdTrackInfoEnvelope adTrackInfoEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("data")) {
                return false;
            }
            adTrackInfoEnvelope.data = (AdTrackInfoData) AdTrackInfoData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AdTrackInfoEnvelope adTrackInfoEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data")) {
                return true;
            }
            return super.parseFieldCheck(adTrackInfoEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(AdTrackInfoEnvelope adTrackInfoEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (adTrackInfoEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                AdTrackInfoData.JSON_ADAPTER.serialize(adTrackInfoEnvelope.data, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AdTrackInfoEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AdTrackInfoEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AdTrackInfoEnvelope new_() {
        AdTrackInfoEnvelope adTrackInfoEnvelope = new AdTrackInfoEnvelope();
        adTrackInfoEnvelope.nullCheck();
        return adTrackInfoEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AdTrackInfoEnvelope m11540clone() {
        AdTrackInfoEnvelope adTrackInfoEnvelope = new AdTrackInfoEnvelope();
        AdTrackInfoData adTrackInfoData = this.data;
        if (adTrackInfoData != null) {
            adTrackInfoEnvelope.data = adTrackInfoData.m11536clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        AdTrackInfoData adTrackInfoData = this.data;
        int iHashCode = i2 + (adTrackInfoData != null ? adTrackInfoData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.data == null) {
            this.data = AdTrackInfoData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
