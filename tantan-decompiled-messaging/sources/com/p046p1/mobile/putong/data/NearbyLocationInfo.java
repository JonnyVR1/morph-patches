package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.NearbyLocationInfoPois;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class NearbyLocationInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "nearbylocationinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String address;

    @NonNull
    @ProtobufIndex(index = 2)
    public String business;

    @ProtobufIndex(index = 4)
    public double lat;

    @ProtobufIndex(index = 3)
    public double lng;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<NearbyLocationInfoPois> pois;
    public static ProtobufAdapter<NearbyLocationInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<NearbyLocationInfo>() { // from class: com.p1.mobile.putong.data.NearbyLocationInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NearbyLocationInfo nearbyLocationInfo) {
            String str = nearbyLocationInfo.address;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = nearbyLocationInfo.business;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17222d = iM17233o + CodedOutputByteBufferNano.m17222d(3, nearbyLocationInfo.lng) + CodedOutputByteBufferNano.m17222d(4, nearbyLocationInfo.lat);
            List<NearbyLocationInfoPois> list = nearbyLocationInfo.pois;
            if (list != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(5, list, NearbyLocationInfoPois.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            nearbyLocationInfo.cachedSize = iM17222d;
            return iM17222d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NearbyLocationInfo parse(nb5 nb5Var) throws IOException {
            NearbyLocationInfo nearbyLocationInfo = new NearbyLocationInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (nearbyLocationInfo.address == null) {
                        nearbyLocationInfo.address = "";
                    }
                    if (nearbyLocationInfo.business == null) {
                        nearbyLocationInfo.business = "";
                    }
                    if (nearbyLocationInfo.pois != null) {
                        break;
                    }
                    nearbyLocationInfo.pois = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    nearbyLocationInfo.address = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    nearbyLocationInfo.business = nb5Var.m158750s();
                } else if (iM158752u == 25) {
                    nearbyLocationInfo.lng = nb5Var.m158739h();
                } else if (iM158752u == 33) {
                    nearbyLocationInfo.lat = nb5Var.m158739h();
                } else {
                    if (iM158752u != 42) {
                        if (nearbyLocationInfo.address == null) {
                            nearbyLocationInfo.address = "";
                        }
                        if (nearbyLocationInfo.business == null) {
                            nearbyLocationInfo.business = "";
                        }
                        if (nearbyLocationInfo.pois != null) {
                            break;
                        }
                        nearbyLocationInfo.pois = new ArrayList();
                        return nearbyLocationInfo;
                    }
                    nearbyLocationInfo.pois = (List) nb5Var.m158743l(NearbyLocationInfoPois.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return nearbyLocationInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NearbyLocationInfo nearbyLocationInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = nearbyLocationInfo.address;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = nearbyLocationInfo.business;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17246C(3, nearbyLocationInfo.lng);
            codedOutputByteBufferNano.m17246C(4, nearbyLocationInfo.lat);
            List<NearbyLocationInfoPois> list = nearbyLocationInfo.pois;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(5, list, NearbyLocationInfoPois.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<NearbyLocationInfo> JSON_ADAPTER = new ObjectJsonAdapter<NearbyLocationInfo>() { // from class: com.p1.mobile.putong.data.NearbyLocationInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NearbyLocationInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NearbyLocationInfo newInstance() {
            return new NearbyLocationInfo();
        }

        public boolean parseField(NearbyLocationInfo nearbyLocationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "address":
                    nearbyLocationInfo.address = jsonParser.getValueAsString();
                    return true;
                case "business":
                    nearbyLocationInfo.business = jsonParser.getValueAsString();
                    return true;
                case "lat":
                    nearbyLocationInfo.lat = jsonParser.getValueAsDouble();
                    return true;
                case "lng":
                    nearbyLocationInfo.lng = jsonParser.getValueAsDouble();
                    return true;
                case "pois":
                    nearbyLocationInfo.pois = JsonAdapter.parseArray(jsonParser, NearbyLocationInfoPois.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(NearbyLocationInfo nearbyLocationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "address":
                case "business":
                case "lat":
                case "lng":
                case "pois":
                    return true;
                default:
                    return super.parseFieldCheck(nearbyLocationInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NearbyLocationInfo nearbyLocationInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = nearbyLocationInfo.address;
            if (str != null) {
                jsonGenerator.writeStringField(PlaceTypes.ADDRESS, str);
            }
            String str2 = nearbyLocationInfo.business;
            if (str2 != null) {
                jsonGenerator.writeStringField("business", str2);
            }
            jsonGenerator.writeNumberField("lng", nearbyLocationInfo.lng);
            jsonGenerator.writeNumberField("lat", nearbyLocationInfo.lat);
            if (nearbyLocationInfo.pois != null) {
                jsonGenerator.writeFieldName("pois");
                JsonAdapter.serializeArray(nearbyLocationInfo.pois, jsonGenerator, NearbyLocationInfoPois.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NearbyLocationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NearbyLocationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NearbyLocationInfo new_() {
        NearbyLocationInfo nearbyLocationInfo = new NearbyLocationInfo();
        nearbyLocationInfo.nullCheck();
        return nearbyLocationInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NearbyLocationInfo mo223809clone() {
        NearbyLocationInfo nearbyLocationInfo = new NearbyLocationInfo();
        nearbyLocationInfo.address = this.address;
        nearbyLocationInfo.business = this.business;
        nearbyLocationInfo.lng = this.lng;
        nearbyLocationInfo.lat = this.lat;
        List<NearbyLocationInfoPois> list = this.pois;
        if (list != null) {
            nearbyLocationInfo.pois = ValueObject.util_map(list, new w9j() { // from class: l.i820
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((NearbyLocationInfoPois) obj).mo223809clone();
                }
            });
        }
        return nearbyLocationInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NearbyLocationInfo)) {
            return false;
        }
        NearbyLocationInfo nearbyLocationInfo = (NearbyLocationInfo) obj;
        return ValueObject.util_equals(this.address, nearbyLocationInfo.address) && ValueObject.util_equals(this.business, nearbyLocationInfo.business) && this.lng == nearbyLocationInfo.lng && this.lat == nearbyLocationInfo.lat && ValueObject.util_equals(this.pois, nearbyLocationInfo.pois);
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
        String str2 = this.business;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.lng);
        int i3 = ((iHashCode + iHashCode2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.lat);
        int i4 = ((i3 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41;
        List<NearbyLocationInfoPois> list = this.pois;
        int iHashCode3 = i4 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.address == null) {
            this.address = "";
        }
        if (this.business == null) {
            this.business = "";
        }
        if (this.pois == null) {
            this.pois = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
