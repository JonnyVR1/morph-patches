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
public class AdTrackInfoData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "adtrackinfodata";

    @NonNull
    @ProtobufIndex(index = 1)
    public AdTrackInfo adTrackInfo;
    public static ProtobufAdapter<AdTrackInfoData> PROTOBUF_ADAPTER = new MessageNanoAdapter<AdTrackInfoData>() { // from class: com.p1.mobile.putong.core.data.AdTrackInfoData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AdTrackInfoData adTrackInfoData) {
            AdTrackInfo adTrackInfo = adTrackInfoData.adTrackInfo;
            int iL = adTrackInfo != null ? CodedOutputByteBufferNano.l(1, adTrackInfo, AdTrackInfo.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) adTrackInfoData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AdTrackInfoData m11537parse(nb5 nb5Var) throws IOException {
            AdTrackInfoData adTrackInfoData = new AdTrackInfoData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (adTrackInfoData.adTrackInfo != null) {
                        break;
                    }
                    adTrackInfoData.adTrackInfo = AdTrackInfo.new_();
                    break;
                }
                if (iU != 10) {
                    if (adTrackInfoData.adTrackInfo != null) {
                        break;
                    }
                    adTrackInfoData.adTrackInfo = AdTrackInfo.new_();
                    return adTrackInfoData;
                }
                adTrackInfoData.adTrackInfo = (AdTrackInfo) nb5Var.l(AdTrackInfo.PROTOBUF_ADAPTER);
            }
            return adTrackInfoData;
        }

        public void serialize(AdTrackInfoData adTrackInfoData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            AdTrackInfo adTrackInfo = adTrackInfoData.adTrackInfo;
            if (adTrackInfo != null) {
                codedOutputByteBufferNano.K(1, adTrackInfo, AdTrackInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AdTrackInfoData> JSON_ADAPTER = new ObjectJsonAdapter<AdTrackInfoData>() { // from class: com.p1.mobile.putong.core.data.AdTrackInfoData.2
        public Class getDataClass() {
            return AdTrackInfoData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AdTrackInfoData m11538newInstance() {
            return new AdTrackInfoData();
        }

        public boolean parseField(AdTrackInfoData adTrackInfoData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("adTrackInfo")) {
                return false;
            }
            adTrackInfoData.adTrackInfo = (AdTrackInfo) AdTrackInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AdTrackInfoData adTrackInfoData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("adTrackInfo")) {
                return true;
            }
            return super.parseFieldCheck(adTrackInfoData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(AdTrackInfoData adTrackInfoData, JsonGenerator jsonGenerator) throws IOException {
            if (adTrackInfoData.adTrackInfo != null) {
                jsonGenerator.writeFieldName("adTrackInfo");
                AdTrackInfo.JSON_ADAPTER.serialize(adTrackInfoData.adTrackInfo, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AdTrackInfoData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AdTrackInfoData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AdTrackInfoData new_() {
        AdTrackInfoData adTrackInfoData = new AdTrackInfoData();
        adTrackInfoData.nullCheck();
        return adTrackInfoData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AdTrackInfoData m11536clone() {
        AdTrackInfoData adTrackInfoData = new AdTrackInfoData();
        AdTrackInfo adTrackInfo = this.adTrackInfo;
        if (adTrackInfo != null) {
            adTrackInfoData.adTrackInfo = adTrackInfo.m11532clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        AdTrackInfo adTrackInfo = this.adTrackInfo;
        int iHashCode = i2 + (adTrackInfo != null ? adTrackInfo.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.adTrackInfo == null) {
            this.adTrackInfo = AdTrackInfo.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
