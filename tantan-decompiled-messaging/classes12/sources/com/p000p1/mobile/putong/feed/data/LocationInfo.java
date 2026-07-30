package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.LocationInfo;
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
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LocationInfo locationInfo) {
            String str = locationInfo.name;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = locationInfo.address;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            List<Double> list = locationInfo.coordinates;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(3, list, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = locationInfo.distance;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(4, str3);
            }
            ((MessageNano) locationInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LocationInfo m19578parse(nb5 nb5Var) throws IOException {
            LocationInfo locationInfo = new LocationInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    locationInfo.name = nb5Var.s();
                } else if (iU == 18) {
                    locationInfo.address = nb5Var.s();
                } else if (iU == 26) {
                    locationInfo.coordinates = (List) nb5Var.l(ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 34) {
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
                    locationInfo.distance = nb5Var.s();
                }
            }
            return locationInfo;
        }

        public void serialize(LocationInfo locationInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = locationInfo.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = locationInfo.address;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            List<Double> list = locationInfo.coordinates;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = locationInfo.distance;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
        }
    };
    public static JsonAdapter<LocationInfo> JSON_ADAPTER = new ObjectJsonAdapter<LocationInfo>() { // from class: com.p1.mobile.putong.feed.data.LocationInfo.2
        public Class getDataClass() {
            return LocationInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LocationInfo mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LocationInfo locationInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = locationInfo.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            String str2 = locationInfo.address;
            if (str2 != null) {
                jsonGenerator.writeStringField("address", str2);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LocationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LocationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Double m1783a(Double d) {
        return d;
    }

    public static LocationInfo new_() {
        LocationInfo locationInfo = new LocationInfo();
        locationInfo.nullCheck();
        return locationInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LocationInfo m19577clone() {
        LocationInfo locationInfo = new LocationInfo();
        locationInfo.name = this.name;
        locationInfo.address = this.address;
        List<Double> list = this.coordinates;
        if (list != null) {
            locationInfo.coordinates = ValueObject.util_map(list, new w9j() { // from class: l.rvv
                public final Object call(Object obj) {
                    return LocationInfo.m1783a((Double) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
