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
public class GooglePlaceData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "googleplacedata";

    @NonNull
    @ProtobufIndex(index = 1)
    public AutocompleteResponse autocomplete_response;

    @NonNull
    @ProtobufIndex(index = 2)
    public PlaceDetailsResult place_details_result;
    public static ProtobufAdapter<GooglePlaceData> PROTOBUF_ADAPTER = new MessageNanoAdapter<GooglePlaceData>() { // from class: com.p1.mobile.putong.core.data.GooglePlaceData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GooglePlaceData googlePlaceData) {
            AutocompleteResponse autocompleteResponse = googlePlaceData.autocomplete_response;
            int iM17230l = autocompleteResponse != null ? CodedOutputByteBufferNano.m17230l(1, autocompleteResponse, AutocompleteResponse.PROTOBUF_ADAPTER) : 0;
            PlaceDetailsResult placeDetailsResult = googlePlaceData.place_details_result;
            if (placeDetailsResult != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, placeDetailsResult, PlaceDetailsResult.PROTOBUF_ADAPTER);
            }
            googlePlaceData.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GooglePlaceData parse(nb5 nb5Var) throws IOException {
            GooglePlaceData googlePlaceData = new GooglePlaceData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (googlePlaceData.autocomplete_response == null) {
                        googlePlaceData.autocomplete_response = AutocompleteResponse.new_();
                    }
                    if (googlePlaceData.place_details_result != null) {
                        break;
                    }
                    googlePlaceData.place_details_result = PlaceDetailsResult.new_();
                    break;
                }
                if (iM158752u == 10) {
                    googlePlaceData.autocomplete_response = (AutocompleteResponse) nb5Var.m158743l(AutocompleteResponse.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (googlePlaceData.autocomplete_response == null) {
                            googlePlaceData.autocomplete_response = AutocompleteResponse.new_();
                        }
                        if (googlePlaceData.place_details_result != null) {
                            break;
                        }
                        googlePlaceData.place_details_result = PlaceDetailsResult.new_();
                        return googlePlaceData;
                    }
                    googlePlaceData.place_details_result = (PlaceDetailsResult) nb5Var.m158743l(PlaceDetailsResult.PROTOBUF_ADAPTER);
                }
            }
            return googlePlaceData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GooglePlaceData googlePlaceData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            AutocompleteResponse autocompleteResponse = googlePlaceData.autocomplete_response;
            if (autocompleteResponse != null) {
                codedOutputByteBufferNano.m17254K(1, autocompleteResponse, AutocompleteResponse.PROTOBUF_ADAPTER);
            }
            PlaceDetailsResult placeDetailsResult = googlePlaceData.place_details_result;
            if (placeDetailsResult != null) {
                codedOutputByteBufferNano.m17254K(2, placeDetailsResult, PlaceDetailsResult.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GooglePlaceData> JSON_ADAPTER = new ObjectJsonAdapter<GooglePlaceData>() { // from class: com.p1.mobile.putong.core.data.GooglePlaceData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GooglePlaceData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GooglePlaceData newInstance() {
            return new GooglePlaceData();
        }

        public boolean parseField(GooglePlaceData googlePlaceData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("autocomplete_response")) {
                googlePlaceData.autocomplete_response = AutocompleteResponse.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("place_details_result")) {
                return false;
            }
            googlePlaceData.place_details_result = PlaceDetailsResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(GooglePlaceData googlePlaceData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("autocomplete_response") || str.equals("place_details_result")) {
                return true;
            }
            return super.parseFieldCheck(googlePlaceData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GooglePlaceData googlePlaceData, JsonGenerator jsonGenerator) throws IOException {
            if (googlePlaceData.autocomplete_response != null) {
                jsonGenerator.writeFieldName("autocomplete_response");
                AutocompleteResponse.JSON_ADAPTER.serialize(googlePlaceData.autocomplete_response, jsonGenerator, true);
            }
            if (googlePlaceData.place_details_result != null) {
                jsonGenerator.writeFieldName("place_details_result");
                PlaceDetailsResult.JSON_ADAPTER.serialize(googlePlaceData.place_details_result, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GooglePlaceData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GooglePlaceData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GooglePlaceData new_() {
        GooglePlaceData googlePlaceData = new GooglePlaceData();
        googlePlaceData.nullCheck();
        return googlePlaceData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GooglePlaceData mo223809clone() {
        GooglePlaceData googlePlaceData = new GooglePlaceData();
        AutocompleteResponse autocompleteResponse = this.autocomplete_response;
        if (autocompleteResponse != null) {
            googlePlaceData.autocomplete_response = autocompleteResponse.mo223809clone();
        }
        PlaceDetailsResult placeDetailsResult = this.place_details_result;
        if (placeDetailsResult != null) {
            googlePlaceData.place_details_result = placeDetailsResult.mo223809clone();
        }
        return googlePlaceData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GooglePlaceData)) {
            return false;
        }
        GooglePlaceData googlePlaceData = (GooglePlaceData) obj;
        return ValueObject.util_equals(this.autocomplete_response, googlePlaceData.autocomplete_response) && ValueObject.util_equals(this.place_details_result, googlePlaceData.place_details_result);
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
        AutocompleteResponse autocompleteResponse = this.autocomplete_response;
        int iHashCode = (i2 + (autocompleteResponse != null ? autocompleteResponse.hashCode() : 0)) * 41;
        PlaceDetailsResult placeDetailsResult = this.place_details_result;
        int iHashCode2 = iHashCode + (placeDetailsResult != null ? placeDetailsResult.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.autocomplete_response == null) {
            this.autocomplete_response = AutocompleteResponse.new_();
        }
        if (this.place_details_result == null) {
            this.place_details_result = PlaceDetailsResult.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
