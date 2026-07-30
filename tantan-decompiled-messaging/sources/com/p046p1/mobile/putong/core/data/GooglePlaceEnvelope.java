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
public class GooglePlaceEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "googleplaceenvelope";

    @NonNull
    @ProtobufIndex(index = 1)
    public GooglePlaceData data;
    public static ProtobufAdapter<GooglePlaceEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<GooglePlaceEnvelope>() { // from class: com.p1.mobile.putong.core.data.GooglePlaceEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GooglePlaceEnvelope googlePlaceEnvelope) {
            GooglePlaceData googlePlaceData = googlePlaceEnvelope.data;
            int iM17230l = googlePlaceData != null ? CodedOutputByteBufferNano.m17230l(1, googlePlaceData, GooglePlaceData.PROTOBUF_ADAPTER) : 0;
            googlePlaceEnvelope.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GooglePlaceEnvelope parse(nb5 nb5Var) throws IOException {
            GooglePlaceEnvelope googlePlaceEnvelope = new GooglePlaceEnvelope();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (googlePlaceEnvelope.data != null) {
                        break;
                    }
                    googlePlaceEnvelope.data = GooglePlaceData.new_();
                    break;
                }
                if (iM158752u != 10) {
                    if (googlePlaceEnvelope.data != null) {
                        break;
                    }
                    googlePlaceEnvelope.data = GooglePlaceData.new_();
                    return googlePlaceEnvelope;
                }
                googlePlaceEnvelope.data = (GooglePlaceData) nb5Var.m158743l(GooglePlaceData.PROTOBUF_ADAPTER);
            }
            return googlePlaceEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GooglePlaceEnvelope googlePlaceEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            GooglePlaceData googlePlaceData = googlePlaceEnvelope.data;
            if (googlePlaceData != null) {
                codedOutputByteBufferNano.m17254K(1, googlePlaceData, GooglePlaceData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GooglePlaceEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<GooglePlaceEnvelope>() { // from class: com.p1.mobile.putong.core.data.GooglePlaceEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GooglePlaceEnvelope.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GooglePlaceEnvelope newInstance() {
            return new GooglePlaceEnvelope();
        }

        public boolean parseField(GooglePlaceEnvelope googlePlaceEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("data")) {
                return false;
            }
            googlePlaceEnvelope.data = GooglePlaceData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(GooglePlaceEnvelope googlePlaceEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data")) {
                return true;
            }
            return super.parseFieldCheck(googlePlaceEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GooglePlaceEnvelope googlePlaceEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (googlePlaceEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                GooglePlaceData.JSON_ADAPTER.serialize(googlePlaceEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GooglePlaceEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GooglePlaceEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GooglePlaceEnvelope new_() {
        GooglePlaceEnvelope googlePlaceEnvelope = new GooglePlaceEnvelope();
        googlePlaceEnvelope.nullCheck();
        return googlePlaceEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GooglePlaceEnvelope mo223809clone() {
        GooglePlaceEnvelope googlePlaceEnvelope = new GooglePlaceEnvelope();
        GooglePlaceData googlePlaceData = this.data;
        if (googlePlaceData != null) {
            googlePlaceEnvelope.data = googlePlaceData.mo223809clone();
        }
        return googlePlaceEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GooglePlaceEnvelope) {
            return ValueObject.util_equals(this.data, ((GooglePlaceEnvelope) obj).data);
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
        GooglePlaceData googlePlaceData = this.data;
        int iHashCode = i2 + (googlePlaceData != null ? googlePlaceData.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.data == null) {
            this.data = GooglePlaceData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
