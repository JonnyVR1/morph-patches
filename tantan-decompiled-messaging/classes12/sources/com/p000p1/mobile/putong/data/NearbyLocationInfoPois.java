package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
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
public class NearbyLocationInfoPois extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "nearbylocationinfopois";

    @NonNull
    @ProtobufIndex(index = 2)
    public String address;

    @NonNull
    @ProtobufIndex(index = 6)
    public String area;

    @NonNull
    @ProtobufIndex(index = 4)
    public String city;

    @NonNull
    @ProtobufIndex(index = 3)
    public String country;

    @NonNull
    @ProtobufIndex(index = 10)
    public String direction;

    @ProtobufIndex(index = 9)
    public int distance;

    @ProtobufIndex(index = 8)
    public double lat;

    @ProtobufIndex(index = 7)
    public double lng;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 5)
    public String province;

    @NonNull
    @ProtobufIndex(index = 11)
    public String tag;
    public static ProtobufAdapter<NearbyLocationInfoPois> PROTOBUF_ADAPTER = new MessageNanoAdapter<NearbyLocationInfoPois>() { // from class: com.p1.mobile.putong.data.NearbyLocationInfoPois.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NearbyLocationInfoPois nearbyLocationInfoPois) {
            String str = nearbyLocationInfoPois.name;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = nearbyLocationInfoPois.address;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = nearbyLocationInfoPois.country;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = nearbyLocationInfoPois.city;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = nearbyLocationInfoPois.province;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            String str6 = nearbyLocationInfoPois.area;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(6, str6);
            }
            int iD = iO + CodedOutputByteBufferNano.d(7, nearbyLocationInfoPois.lng) + CodedOutputByteBufferNano.d(8, nearbyLocationInfoPois.lat) + CodedOutputByteBufferNano.h(9, nearbyLocationInfoPois.distance);
            String str7 = nearbyLocationInfoPois.direction;
            if (str7 != null) {
                iD += CodedOutputByteBufferNano.o(10, str7);
            }
            String str8 = nearbyLocationInfoPois.tag;
            if (str8 != null) {
                iD += CodedOutputByteBufferNano.o(11, str8);
            }
            ((MessageNano) nearbyLocationInfoPois).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NearbyLocationInfoPois m18528parse(nb5 nb5Var) throws IOException {
            NearbyLocationInfoPois nearbyLocationInfoPois = new NearbyLocationInfoPois();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (nearbyLocationInfoPois.name == null) {
                            nearbyLocationInfoPois.name = "";
                        }
                        if (nearbyLocationInfoPois.address == null) {
                            nearbyLocationInfoPois.address = "";
                        }
                        if (nearbyLocationInfoPois.country == null) {
                            nearbyLocationInfoPois.country = "";
                        }
                        if (nearbyLocationInfoPois.city == null) {
                            nearbyLocationInfoPois.city = "";
                        }
                        if (nearbyLocationInfoPois.province == null) {
                            nearbyLocationInfoPois.province = "";
                        }
                        if (nearbyLocationInfoPois.area == null) {
                            nearbyLocationInfoPois.area = "";
                        }
                        if (nearbyLocationInfoPois.direction == null) {
                            nearbyLocationInfoPois.direction = "";
                        }
                        if (nearbyLocationInfoPois.tag == null) {
                            nearbyLocationInfoPois.tag = "";
                        }
                        break;
                    case 10:
                        nearbyLocationInfoPois.name = nb5Var.s();
                        continue;
                    case 18:
                        nearbyLocationInfoPois.address = nb5Var.s();
                        continue;
                    case 26:
                        nearbyLocationInfoPois.country = nb5Var.s();
                        continue;
                    case 34:
                        nearbyLocationInfoPois.city = nb5Var.s();
                        continue;
                    case 42:
                        nearbyLocationInfoPois.province = nb5Var.s();
                        continue;
                    case 50:
                        nearbyLocationInfoPois.area = nb5Var.s();
                        continue;
                    case 57:
                        nearbyLocationInfoPois.lng = nb5Var.h();
                        continue;
                    case 65:
                        nearbyLocationInfoPois.lat = nb5Var.h();
                        continue;
                    case 72:
                        nearbyLocationInfoPois.distance = nb5Var.j();
                        continue;
                    case 82:
                        nearbyLocationInfoPois.direction = nb5Var.s();
                        continue;
                    case 90:
                        nearbyLocationInfoPois.tag = nb5Var.s();
                        continue;
                    default:
                        if (nearbyLocationInfoPois.name == null) {
                            nearbyLocationInfoPois.name = "";
                        }
                        if (nearbyLocationInfoPois.address == null) {
                            nearbyLocationInfoPois.address = "";
                        }
                        if (nearbyLocationInfoPois.country == null) {
                            nearbyLocationInfoPois.country = "";
                        }
                        if (nearbyLocationInfoPois.city == null) {
                            nearbyLocationInfoPois.city = "";
                        }
                        if (nearbyLocationInfoPois.province == null) {
                            nearbyLocationInfoPois.province = "";
                        }
                        if (nearbyLocationInfoPois.area == null) {
                            nearbyLocationInfoPois.area = "";
                        }
                        if (nearbyLocationInfoPois.direction == null) {
                            nearbyLocationInfoPois.direction = "";
                        }
                        if (nearbyLocationInfoPois.tag == null) {
                            nearbyLocationInfoPois.tag = "";
                            return nearbyLocationInfoPois;
                        }
                        break;
                }
            }
            return nearbyLocationInfoPois;
        }

        public void serialize(NearbyLocationInfoPois nearbyLocationInfoPois, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = nearbyLocationInfoPois.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = nearbyLocationInfoPois.address;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = nearbyLocationInfoPois.country;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = nearbyLocationInfoPois.city;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = nearbyLocationInfoPois.province;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            String str6 = nearbyLocationInfoPois.area;
            if (str6 != null) {
                codedOutputByteBufferNano.R(6, str6);
            }
            codedOutputByteBufferNano.C(7, nearbyLocationInfoPois.lng);
            codedOutputByteBufferNano.C(8, nearbyLocationInfoPois.lat);
            codedOutputByteBufferNano.G(9, nearbyLocationInfoPois.distance);
            String str7 = nearbyLocationInfoPois.direction;
            if (str7 != null) {
                codedOutputByteBufferNano.R(10, str7);
            }
            String str8 = nearbyLocationInfoPois.tag;
            if (str8 != null) {
                codedOutputByteBufferNano.R(11, str8);
            }
        }
    };
    public static JsonAdapter<NearbyLocationInfoPois> JSON_ADAPTER = new ObjectJsonAdapter<NearbyLocationInfoPois>() { // from class: com.p1.mobile.putong.data.NearbyLocationInfoPois.2
        public Class getDataClass() {
            return NearbyLocationInfoPois.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public NearbyLocationInfoPois mo17830newInstance() {
            return new NearbyLocationInfoPois();
        }

        public boolean parseField(NearbyLocationInfoPois nearbyLocationInfoPois, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "address":
                    nearbyLocationInfoPois.address = jsonParser.getValueAsString();
                    return true;
                case "province":
                    nearbyLocationInfoPois.province = jsonParser.getValueAsString();
                    return true;
                case "direction":
                    nearbyLocationInfoPois.direction = jsonParser.getValueAsString();
                    return true;
                case "lat":
                    nearbyLocationInfoPois.lat = jsonParser.getValueAsDouble();
                    return true;
                case "lng":
                    nearbyLocationInfoPois.lng = jsonParser.getValueAsDouble();
                    return true;
                case "tag":
                    nearbyLocationInfoPois.tag = jsonParser.getValueAsString();
                    return true;
                case "area":
                    nearbyLocationInfoPois.area = jsonParser.getValueAsString();
                    return true;
                case "city":
                    nearbyLocationInfoPois.city = jsonParser.getValueAsString();
                    return true;
                case "name":
                    nearbyLocationInfoPois.name = jsonParser.getValueAsString();
                    return true;
                case "distance":
                    nearbyLocationInfoPois.distance = jsonParser.getValueAsInt();
                    return true;
                case "country":
                    nearbyLocationInfoPois.country = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(NearbyLocationInfoPois nearbyLocationInfoPois, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "address":
                case "province":
                case "direction":
                case "lat":
                case "lng":
                case "tag":
                case "area":
                case "city":
                case "name":
                case "distance":
                case "country":
                    return true;
                default:
                    return super.parseFieldCheck(nearbyLocationInfoPois, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NearbyLocationInfoPois nearbyLocationInfoPois, JsonGenerator jsonGenerator) throws IOException {
            String str = nearbyLocationInfoPois.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            String str2 = nearbyLocationInfoPois.address;
            if (str2 != null) {
                jsonGenerator.writeStringField("address", str2);
            }
            String str3 = nearbyLocationInfoPois.country;
            if (str3 != null) {
                jsonGenerator.writeStringField("country", str3);
            }
            String str4 = nearbyLocationInfoPois.city;
            if (str4 != null) {
                jsonGenerator.writeStringField("city", str4);
            }
            String str5 = nearbyLocationInfoPois.province;
            if (str5 != null) {
                jsonGenerator.writeStringField("province", str5);
            }
            String str6 = nearbyLocationInfoPois.area;
            if (str6 != null) {
                jsonGenerator.writeStringField("area", str6);
            }
            jsonGenerator.writeNumberField("lng", nearbyLocationInfoPois.lng);
            jsonGenerator.writeNumberField("lat", nearbyLocationInfoPois.lat);
            jsonGenerator.writeNumberField("distance", nearbyLocationInfoPois.distance);
            String str7 = nearbyLocationInfoPois.direction;
            if (str7 != null) {
                jsonGenerator.writeStringField("direction", str7);
            }
            String str8 = nearbyLocationInfoPois.tag;
            if (str8 != null) {
                jsonGenerator.writeStringField(Tag.TYPE, str8);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NearbyLocationInfoPois) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NearbyLocationInfoPois) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NearbyLocationInfoPois new_() {
        NearbyLocationInfoPois nearbyLocationInfoPois = new NearbyLocationInfoPois();
        nearbyLocationInfoPois.nullCheck();
        return nearbyLocationInfoPois;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NearbyLocationInfoPois m18527clone() {
        NearbyLocationInfoPois nearbyLocationInfoPois = new NearbyLocationInfoPois();
        nearbyLocationInfoPois.name = this.name;
        nearbyLocationInfoPois.address = this.address;
        nearbyLocationInfoPois.country = this.country;
        nearbyLocationInfoPois.city = this.city;
        nearbyLocationInfoPois.province = this.province;
        nearbyLocationInfoPois.area = this.area;
        nearbyLocationInfoPois.lng = this.lng;
        nearbyLocationInfoPois.lat = this.lat;
        nearbyLocationInfoPois.distance = this.distance;
        nearbyLocationInfoPois.direction = this.direction;
        nearbyLocationInfoPois.tag = this.tag;
        return nearbyLocationInfoPois;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NearbyLocationInfoPois)) {
            return false;
        }
        NearbyLocationInfoPois nearbyLocationInfoPois = (NearbyLocationInfoPois) obj;
        return ValueObject.util_equals(this.name, nearbyLocationInfoPois.name) && ValueObject.util_equals(this.address, nearbyLocationInfoPois.address) && ValueObject.util_equals(this.country, nearbyLocationInfoPois.country) && ValueObject.util_equals(this.city, nearbyLocationInfoPois.city) && ValueObject.util_equals(this.province, nearbyLocationInfoPois.province) && ValueObject.util_equals(this.area, nearbyLocationInfoPois.area) && this.lng == nearbyLocationInfoPois.lng && this.lat == nearbyLocationInfoPois.lat && this.distance == nearbyLocationInfoPois.distance && ValueObject.util_equals(this.direction, nearbyLocationInfoPois.direction) && ValueObject.util_equals(this.tag, nearbyLocationInfoPois.tag);
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
        String str3 = this.country;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.city;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.province;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.area;
        int iHashCode6 = str6 != null ? str6.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.lng);
        int i3 = ((iHashCode5 + iHashCode6) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.lat);
        int i4 = ((((i3 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41) + this.distance) * 41;
        String str7 = this.direction;
        int iHashCode7 = (i4 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.tag;
        int iHashCode8 = iHashCode7 + (str8 != null ? str8.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode8;
        return iHashCode8;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.address == null) {
            this.address = "";
        }
        if (this.country == null) {
            this.country = "";
        }
        if (this.city == null) {
            this.city = "";
        }
        if (this.province == null) {
            this.province = "";
        }
        if (this.area == null) {
            this.area = "";
        }
        if (this.direction == null) {
            this.direction = "";
        }
        if (this.tag == null) {
            this.tag = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
