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
public class AdTrackInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "adtrackinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String firebaseId;
    public static ProtobufAdapter<AdTrackInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<AdTrackInfo>() { // from class: com.p1.mobile.putong.core.data.AdTrackInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AdTrackInfo adTrackInfo) {
            String str = adTrackInfo.firebaseId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            adTrackInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AdTrackInfo parse(nc5 nc5Var) throws IOException {
            AdTrackInfo adTrackInfo = new AdTrackInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (adTrackInfo.firebaseId != null) {
                        break;
                    }
                    adTrackInfo.firebaseId = "";
                    break;
                }
                if (iM162497u != 10) {
                    if (adTrackInfo.firebaseId != null) {
                        break;
                    }
                    adTrackInfo.firebaseId = "";
                    return adTrackInfo;
                }
                adTrackInfo.firebaseId = nc5Var.m162495s();
            }
            return adTrackInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AdTrackInfo adTrackInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = adTrackInfo.firebaseId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
        }
    };
    public static JsonAdapter<AdTrackInfo> JSON_ADAPTER = new ObjectJsonAdapter<AdTrackInfo>() { // from class: com.p1.mobile.putong.core.data.AdTrackInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AdTrackInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AdTrackInfo newInstance() {
            return new AdTrackInfo();
        }

        public boolean parseField(AdTrackInfo adTrackInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("firebaseId")) {
                return false;
            }
            adTrackInfo.firebaseId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(AdTrackInfo adTrackInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("firebaseId")) {
                return true;
            }
            return super.parseFieldCheck(adTrackInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AdTrackInfo adTrackInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = adTrackInfo.firebaseId;
            if (str != null) {
                jsonGenerator.writeStringField("firebaseId", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AdTrackInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AdTrackInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AdTrackInfo new_() {
        AdTrackInfo adTrackInfo = new AdTrackInfo();
        adTrackInfo.nullCheck();
        return adTrackInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AdTrackInfo mo225055clone() {
        AdTrackInfo adTrackInfo = new AdTrackInfo();
        adTrackInfo.firebaseId = this.firebaseId;
        return adTrackInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdTrackInfo) {
            return ValueObject.util_equals(this.firebaseId, ((AdTrackInfo) obj).firebaseId);
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
        String str = this.firebaseId;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.firebaseId == null) {
            this.firebaseId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
