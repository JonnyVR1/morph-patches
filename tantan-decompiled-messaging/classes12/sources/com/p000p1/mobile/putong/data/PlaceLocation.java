package com.p000p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PlaceLocation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "placelocation";

    @ProtobufIndex(index = 1)
    public double lat;

    @ProtobufIndex(index = 2)
    public double lng;
    public static ProtobufAdapter<PlaceLocation> PROTOBUF_ADAPTER = new MessageNanoAdapter<PlaceLocation>() { // from class: com.p1.mobile.putong.data.PlaceLocation.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PlaceLocation placeLocation) {
            int iD = CodedOutputByteBufferNano.d(1, placeLocation.lat) + CodedOutputByteBufferNano.d(2, placeLocation.lng);
            ((MessageNano) placeLocation).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PlaceLocation m18811parse(nb5 nb5Var) throws IOException {
            PlaceLocation placeLocation = new PlaceLocation();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 9) {
                    placeLocation.lat = nb5Var.h();
                } else {
                    if (iU != 17) {
                        return placeLocation;
                    }
                    placeLocation.lng = nb5Var.h();
                }
            }
        }

        public void serialize(PlaceLocation placeLocation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.C(1, placeLocation.lat);
            codedOutputByteBufferNano.C(2, placeLocation.lng);
        }
    };
    public static JsonAdapter<PlaceLocation> JSON_ADAPTER = new ObjectJsonAdapter<PlaceLocation>() { // from class: com.p1.mobile.putong.data.PlaceLocation.2
        public Class getDataClass() {
            return PlaceLocation.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public PlaceLocation mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PlaceLocation placeLocation, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("lat", placeLocation.lat);
            jsonGenerator.writeNumberField("lng", placeLocation.lng);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PlaceLocation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PlaceLocation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PlaceLocation new_() {
        PlaceLocation placeLocation = new PlaceLocation();
        placeLocation.nullCheck();
        return placeLocation;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PlaceLocation m18810clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.lat);
        int i2 = (i * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.lng);
        int i3 = (i2 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
