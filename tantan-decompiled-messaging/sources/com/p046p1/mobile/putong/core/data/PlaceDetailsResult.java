package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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
public class PlaceDetailsResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "placedetailsresult";

    @NonNull
    @ProtobufIndex(index = 1)
    public String formatted_address;

    @NonNull
    @ProtobufIndex(index = 3)
    public PlaceGeometry geometry;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public static ProtobufAdapter<PlaceDetailsResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<PlaceDetailsResult>() { // from class: com.p1.mobile.putong.core.data.PlaceDetailsResult.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PlaceDetailsResult placeDetailsResult) {
            String str = placeDetailsResult.formatted_address;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = placeDetailsResult.name;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            PlaceGeometry placeGeometry = placeDetailsResult.geometry;
            if (placeGeometry != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, placeGeometry, PlaceGeometry.PROTOBUF_ADAPTER);
            }
            placeDetailsResult.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PlaceDetailsResult parse(nb5 nb5Var) throws IOException {
            PlaceDetailsResult placeDetailsResult = new PlaceDetailsResult();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (placeDetailsResult.formatted_address == null) {
                        placeDetailsResult.formatted_address = "";
                    }
                    if (placeDetailsResult.name == null) {
                        placeDetailsResult.name = "";
                    }
                    if (placeDetailsResult.geometry != null) {
                        break;
                    }
                    placeDetailsResult.geometry = PlaceGeometry.new_();
                    break;
                }
                if (iM158752u == 10) {
                    placeDetailsResult.formatted_address = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    placeDetailsResult.name = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (placeDetailsResult.formatted_address == null) {
                            placeDetailsResult.formatted_address = "";
                        }
                        if (placeDetailsResult.name == null) {
                            placeDetailsResult.name = "";
                        }
                        if (placeDetailsResult.geometry != null) {
                            break;
                        }
                        placeDetailsResult.geometry = PlaceGeometry.new_();
                        return placeDetailsResult;
                    }
                    placeDetailsResult.geometry = (PlaceGeometry) nb5Var.m158743l(PlaceGeometry.PROTOBUF_ADAPTER);
                }
            }
            return placeDetailsResult;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PlaceDetailsResult placeDetailsResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = placeDetailsResult.formatted_address;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = placeDetailsResult.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            PlaceGeometry placeGeometry = placeDetailsResult.geometry;
            if (placeGeometry != null) {
                codedOutputByteBufferNano.m17254K(3, placeGeometry, PlaceGeometry.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PlaceDetailsResult> JSON_ADAPTER = new ObjectJsonAdapter<PlaceDetailsResult>() { // from class: com.p1.mobile.putong.core.data.PlaceDetailsResult.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PlaceDetailsResult.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PlaceDetailsResult newInstance() {
            return new PlaceDetailsResult();
        }

        public boolean parseField(PlaceDetailsResult placeDetailsResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "name":
                    placeDetailsResult.name = jsonParser.getValueAsString();
                    return true;
                case "formatted_address":
                    placeDetailsResult.formatted_address = jsonParser.getValueAsString();
                    return true;
                case "geometry":
                    placeDetailsResult.geometry = PlaceGeometry.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PlaceDetailsResult placeDetailsResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "name":
                case "formatted_address":
                case "geometry":
                    return true;
                default:
                    return super.parseFieldCheck(placeDetailsResult, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PlaceDetailsResult placeDetailsResult, JsonGenerator jsonGenerator) throws IOException {
            String str = placeDetailsResult.formatted_address;
            if (str != null) {
                jsonGenerator.writeStringField("formatted_address", str);
            }
            String str2 = placeDetailsResult.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            if (placeDetailsResult.geometry != null) {
                jsonGenerator.writeFieldName("geometry");
                PlaceGeometry.JSON_ADAPTER.serialize(placeDetailsResult.geometry, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PlaceDetailsResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PlaceDetailsResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PlaceDetailsResult new_() {
        PlaceDetailsResult placeDetailsResult = new PlaceDetailsResult();
        placeDetailsResult.nullCheck();
        return placeDetailsResult;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PlaceDetailsResult mo223809clone() {
        PlaceDetailsResult placeDetailsResult = new PlaceDetailsResult();
        placeDetailsResult.formatted_address = this.formatted_address;
        placeDetailsResult.name = this.name;
        PlaceGeometry placeGeometry = this.geometry;
        if (placeGeometry != null) {
            placeDetailsResult.geometry = placeGeometry.mo223809clone();
        }
        return placeDetailsResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlaceDetailsResult)) {
            return false;
        }
        PlaceDetailsResult placeDetailsResult = (PlaceDetailsResult) obj;
        return ValueObject.util_equals(this.formatted_address, placeDetailsResult.formatted_address) && ValueObject.util_equals(this.name, placeDetailsResult.name) && ValueObject.util_equals(this.geometry, placeDetailsResult.geometry);
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
        String str = this.formatted_address;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        PlaceGeometry placeGeometry = this.geometry;
        int iHashCode3 = iHashCode2 + (placeGeometry != null ? placeGeometry.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.formatted_address == null) {
            this.formatted_address = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.geometry == null) {
            this.geometry = PlaceGeometry.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
