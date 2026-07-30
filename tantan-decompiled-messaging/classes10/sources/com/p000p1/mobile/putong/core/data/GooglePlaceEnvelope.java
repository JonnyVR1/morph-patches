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
public class GooglePlaceEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "googleplaceenvelope";

    @NonNull
    @ProtobufIndex(index = 1)
    public GooglePlaceData data;
    public static ProtobufAdapter<GooglePlaceEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<GooglePlaceEnvelope>() { // from class: com.p1.mobile.putong.core.data.GooglePlaceEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GooglePlaceEnvelope googlePlaceEnvelope) {
            GooglePlaceData googlePlaceData = googlePlaceEnvelope.data;
            int iL = googlePlaceData != null ? CodedOutputByteBufferNano.l(1, googlePlaceData, GooglePlaceData.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) googlePlaceEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GooglePlaceEnvelope m12993parse(nb5 nb5Var) throws IOException {
            GooglePlaceEnvelope googlePlaceEnvelope = new GooglePlaceEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (googlePlaceEnvelope.data != null) {
                        break;
                    }
                    googlePlaceEnvelope.data = GooglePlaceData.new_();
                    break;
                }
                if (iU != 10) {
                    if (googlePlaceEnvelope.data != null) {
                        break;
                    }
                    googlePlaceEnvelope.data = GooglePlaceData.new_();
                    return googlePlaceEnvelope;
                }
                googlePlaceEnvelope.data = (GooglePlaceData) nb5Var.l(GooglePlaceData.PROTOBUF_ADAPTER);
            }
            return googlePlaceEnvelope;
        }

        public void serialize(GooglePlaceEnvelope googlePlaceEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            GooglePlaceData googlePlaceData = googlePlaceEnvelope.data;
            if (googlePlaceData != null) {
                codedOutputByteBufferNano.K(1, googlePlaceData, GooglePlaceData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GooglePlaceEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<GooglePlaceEnvelope>() { // from class: com.p1.mobile.putong.core.data.GooglePlaceEnvelope.2
        public Class getDataClass() {
            return GooglePlaceEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GooglePlaceEnvelope m12994newInstance() {
            return new GooglePlaceEnvelope();
        }

        public boolean parseField(GooglePlaceEnvelope googlePlaceEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("data")) {
                return false;
            }
            googlePlaceEnvelope.data = (GooglePlaceData) GooglePlaceData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(GooglePlaceEnvelope googlePlaceEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data")) {
                return true;
            }
            return super.parseFieldCheck(googlePlaceEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(GooglePlaceEnvelope googlePlaceEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (googlePlaceEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                GooglePlaceData.JSON_ADAPTER.serialize(googlePlaceEnvelope.data, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GooglePlaceEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GooglePlaceEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GooglePlaceEnvelope new_() {
        GooglePlaceEnvelope googlePlaceEnvelope = new GooglePlaceEnvelope();
        googlePlaceEnvelope.nullCheck();
        return googlePlaceEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GooglePlaceEnvelope m12992clone() {
        GooglePlaceEnvelope googlePlaceEnvelope = new GooglePlaceEnvelope();
        GooglePlaceData googlePlaceData = this.data;
        if (googlePlaceData != null) {
            googlePlaceEnvelope.data = googlePlaceData.m12988clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        GooglePlaceData googlePlaceData = this.data;
        int iHashCode = i2 + (googlePlaceData != null ? googlePlaceData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.data == null) {
            this.data = GooglePlaceData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
