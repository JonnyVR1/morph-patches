package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class PlaceLocation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "placelocation";

    @ProtobufIndex(index = 1)
    public double lat;

    @ProtobufIndex(index = 2)
    public double lng;
    public static ProtobufAdapter<PlaceLocation> PROTOBUF_ADAPTER = new MessageNanoAdapter<PlaceLocation>() { // from class: com.p1.mobile.putong.data.PlaceLocation.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PlaceLocation placeLocation) {
            int iM17277d = CodedOutputByteBufferNano.m17277d(1, placeLocation.lat) + CodedOutputByteBufferNano.m17277d(2, placeLocation.lng);
            placeLocation.cachedSize = iM17277d;
            return iM17277d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PlaceLocation parse(nc5 nc5Var) throws IOException {
            PlaceLocation placeLocation = new PlaceLocation();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 9) {
                    placeLocation.lat = nc5Var.m162484h();
                } else {
                    if (iM162497u != 17) {
                        return placeLocation;
                    }
                    placeLocation.lng = nc5Var.m162484h();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PlaceLocation placeLocation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17301C(1, placeLocation.lat);
            codedOutputByteBufferNano.m17301C(2, placeLocation.lng);
        }
    };
    public static JsonAdapter<PlaceLocation> JSON_ADAPTER = new ObjectJsonAdapter<PlaceLocation>() { // from class: com.p1.mobile.putong.data.PlaceLocation.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PlaceLocation.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PlaceLocation newInstance() {
            return new PlaceLocation();
        }

        public boolean parseField(PlaceLocation placeLocation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("lat")) {
                placeLocation.lat = jsonParser.getValueAsDouble();
                return true;
            }
            if (!str.equals("lng")) {
                return false;
            }
            placeLocation.lng = jsonParser.getValueAsDouble();
            return true;
        }

        public boolean parseFieldCheck(PlaceLocation placeLocation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("lat") || str.equals("lng")) {
                return true;
            }
            return super.parseFieldCheck(placeLocation, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PlaceLocation placeLocation, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("lat", placeLocation.lat);
            jsonGenerator.writeNumberField("lng", placeLocation.lng);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PlaceLocation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PlaceLocation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PlaceLocation new_() {
        PlaceLocation placeLocation = new PlaceLocation();
        placeLocation.nullCheck();
        return placeLocation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PlaceLocation mo225055clone() {
        PlaceLocation placeLocation = new PlaceLocation();
        placeLocation.lat = this.lat;
        placeLocation.lng = this.lng;
        return placeLocation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlaceLocation)) {
            return false;
        }
        PlaceLocation placeLocation = (PlaceLocation) obj;
        return this.lat == placeLocation.lat && this.lng == placeLocation.lng;
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
        long jDoubleToLongBits = Double.doubleToLongBits(this.lat);
        int i2 = (i * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.lng);
        int i3 = (i2 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
