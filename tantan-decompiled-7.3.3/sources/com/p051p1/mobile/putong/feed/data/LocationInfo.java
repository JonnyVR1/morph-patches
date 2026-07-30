package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.feed.data.LocationInfo;
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
public class LocationInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "locationinfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public String address;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<Double> coordinates;

    @NonNull
    @ProtobufIndex(index = 4)
    public String distance;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;
    public static ProtobufAdapter<LocationInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<LocationInfo>() { // from class: com.p1.mobile.putong.feed.data.LocationInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LocationInfo locationInfo) {
            String str = locationInfo.name;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = locationInfo.address;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            List<Double> list = locationInfo.coordinates;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, list, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = locationInfo.distance;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            locationInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LocationInfo parse(nc5 nc5Var) throws IOException {
            LocationInfo locationInfo = new LocationInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (locationInfo.name == null) {
                        locationInfo.name = "";
                    }
                    if (locationInfo.address == null) {
                        locationInfo.address = "";
                    }
                    if (locationInfo.coordinates == null) {
                        locationInfo.coordinates = new ArrayList();
                    }
                    if (locationInfo.distance != null) {
                        break;
                    }
                    locationInfo.distance = "";
                    break;
                }
                if (iM162497u == 10) {
                    locationInfo.name = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    locationInfo.address = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    locationInfo.coordinates = (List) nc5Var.m162488l(ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 34) {
                        if (locationInfo.name == null) {
                            locationInfo.name = "";
                        }
                        if (locationInfo.address == null) {
                            locationInfo.address = "";
                        }
                        if (locationInfo.coordinates == null) {
                            locationInfo.coordinates = new ArrayList();
                        }
                        if (locationInfo.distance != null) {
                            break;
                        }
                        locationInfo.distance = "";
                        return locationInfo;
                    }
                    locationInfo.distance = nc5Var.m162495s();
                }
            }
            return locationInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LocationInfo locationInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = locationInfo.name;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = locationInfo.address;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            List<Double> list = locationInfo.coordinates;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = locationInfo.distance;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
        }
    };
    public static JsonAdapter<LocationInfo> JSON_ADAPTER = new ObjectJsonAdapter<LocationInfo>() { // from class: com.p1.mobile.putong.feed.data.LocationInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LocationInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LocationInfo newInstance() {
            return new LocationInfo();
        }

        public boolean parseField(LocationInfo locationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "address":
                    locationInfo.address = jsonParser.getValueAsString();
                    return true;
                case "name":
                    locationInfo.name = jsonParser.getValueAsString();
                    return true;
                case "distance":
                    locationInfo.distance = jsonParser.getValueAsString();
                    return true;
                case "coordinates":
                    locationInfo.coordinates = JsonAdapter.parseArray(jsonParser, JsonAdapter.DOUBLE_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LocationInfo locationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "address":
                case "name":
                case "distance":
                case "coordinates":
                    return true;
                default:
                    return super.parseFieldCheck(locationInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LocationInfo locationInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = locationInfo.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = locationInfo.address;
            if (str2 != null) {
                jsonGenerator.writeStringField(PlaceTypes.ADDRESS, str2);
            }
            if (locationInfo.coordinates != null) {
                jsonGenerator.writeFieldName("coordinates");
                JsonAdapter.serializeArray(locationInfo.coordinates, jsonGenerator, JsonAdapter.DOUBLE_BOXED_ADAPTER);
            }
            String str3 = locationInfo.distance;
            if (str3 != null) {
                jsonGenerator.writeStringField("distance", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LocationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LocationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Double m62041a(Double d) {
        return d;
    }

    public static LocationInfo new_() {
        LocationInfo locationInfo = new LocationInfo();
        locationInfo.nullCheck();
        return locationInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LocationInfo mo225055clone() {
        LocationInfo locationInfo = new LocationInfo();
        locationInfo.name = this.name;
        locationInfo.address = this.address;
        List<Double> list = this.coordinates;
        if (list != null) {
            locationInfo.coordinates = ValueObject.util_map(list, new qcj() { // from class: l.sxv
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return LocationInfo.m62041a((Double) obj);
                }
            });
        }
        locationInfo.distance = this.distance;
        return locationInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocationInfo)) {
            return false;
        }
        LocationInfo locationInfo = (LocationInfo) obj;
        return ValueObject.util_equals(this.name, locationInfo.name) && ValueObject.util_equals(this.address, locationInfo.address) && ValueObject.util_equals(this.coordinates, locationInfo.coordinates) && ValueObject.util_equals(this.distance, locationInfo.distance);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.address;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<Double> list = this.coordinates;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.distance;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.address == null) {
            this.address = "";
        }
        if (this.coordinates == null) {
            this.coordinates = new ArrayList();
        }
        if (this.distance == null) {
            this.distance = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
