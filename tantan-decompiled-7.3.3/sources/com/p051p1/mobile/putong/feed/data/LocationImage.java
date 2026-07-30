package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.feed.data.LocationImage;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class LocationImage extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "locationimage";

    @NonNull
    @ProtobufIndex(index = 1)
    public String address;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Double> coordinates;
    public static ProtobufAdapter<LocationImage> PROTOBUF_ADAPTER = new MessageNanoAdapter<LocationImage>() { // from class: com.p1.mobile.putong.feed.data.LocationImage.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LocationImage locationImage) {
            String str = locationImage.address;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            List<Double> list = locationImage.coordinates;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, list, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            locationImage.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LocationImage parse(nc5 nc5Var) throws IOException {
            LocationImage locationImage = new LocationImage();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (locationImage.address == null) {
                        locationImage.address = "";
                    }
                    if (locationImage.coordinates != null) {
                        break;
                    }
                    locationImage.coordinates = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    locationImage.address = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (locationImage.address == null) {
                            locationImage.address = "";
                        }
                        if (locationImage.coordinates != null) {
                            break;
                        }
                        locationImage.coordinates = new ArrayList();
                        return locationImage;
                    }
                    locationImage.coordinates = (List) nc5Var.m162488l(ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return locationImage;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LocationImage locationImage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = locationImage.address;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            List<Double> list = locationImage.coordinates;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<LocationImage> JSON_ADAPTER = new ObjectJsonAdapter<LocationImage>() { // from class: com.p1.mobile.putong.feed.data.LocationImage.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LocationImage.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LocationImage newInstance() {
            return new LocationImage();
        }

        public boolean parseField(LocationImage locationImage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(PlaceTypes.ADDRESS)) {
                locationImage.address = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("coordinates")) {
                return false;
            }
            locationImage.coordinates = JsonAdapter.parseArray(jsonParser, JsonAdapter.DOUBLE_BOXED_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(LocationImage locationImage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(PlaceTypes.ADDRESS) || str.equals("coordinates")) {
                return true;
            }
            return super.parseFieldCheck(locationImage, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LocationImage locationImage, JsonGenerator jsonGenerator) throws IOException {
            String str = locationImage.address;
            if (str != null) {
                jsonGenerator.writeStringField(PlaceTypes.ADDRESS, str);
            }
            if (locationImage.coordinates != null) {
                jsonGenerator.writeFieldName("coordinates");
                JsonAdapter.serializeArray(locationImage.coordinates, jsonGenerator, JsonAdapter.DOUBLE_BOXED_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LocationImage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LocationImage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Double m62040a(Double d) {
        return d;
    }

    public static LocationImage new_() {
        LocationImage locationImage = new LocationImage();
        locationImage.nullCheck();
        return locationImage;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LocationImage mo225055clone() {
        LocationImage locationImage = new LocationImage();
        locationImage.address = this.address;
        List<Double> list = this.coordinates;
        if (list != null) {
            locationImage.coordinates = ValueObject.util_map(list, new qcj() { // from class: l.rxv
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return LocationImage.m62040a((Double) obj);
                }
            });
        }
        return locationImage;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocationImage)) {
            return false;
        }
        LocationImage locationImage = (LocationImage) obj;
        return ValueObject.util_equals(this.address, locationImage.address) && ValueObject.util_equals(this.coordinates, locationImage.coordinates);
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
        String str = this.address;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<Double> list = this.coordinates;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.address == null) {
            this.address = "";
        }
        if (this.coordinates == null) {
            this.coordinates = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
