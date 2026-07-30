package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.RankLevel;
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
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NearbyLocationInfoPois nearbyLocationInfoPois) {
            String str = nearbyLocationInfoPois.name;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = nearbyLocationInfoPois.address;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = nearbyLocationInfoPois.country;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = nearbyLocationInfoPois.city;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = nearbyLocationInfoPois.province;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            String str6 = nearbyLocationInfoPois.area;
            if (str6 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str6);
            }
            int iM17277d = iM17288o + CodedOutputByteBufferNano.m17277d(7, nearbyLocationInfoPois.lng) + CodedOutputByteBufferNano.m17277d(8, nearbyLocationInfoPois.lat) + CodedOutputByteBufferNano.m17281h(9, nearbyLocationInfoPois.distance);
            String str7 = nearbyLocationInfoPois.direction;
            if (str7 != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(10, str7);
            }
            String str8 = nearbyLocationInfoPois.tag;
            if (str8 != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(11, str8);
            }
            nearbyLocationInfoPois.cachedSize = iM17277d;
            return iM17277d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NearbyLocationInfoPois parse(nc5 nc5Var) throws IOException {
            NearbyLocationInfoPois nearbyLocationInfoPois = new NearbyLocationInfoPois();
            while (true) {
                switch (nc5Var.m162497u()) {
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
                        nearbyLocationInfoPois.name = nc5Var.m162495s();
                        continue;
                    case 18:
                        nearbyLocationInfoPois.address = nc5Var.m162495s();
                        continue;
                    case 26:
                        nearbyLocationInfoPois.country = nc5Var.m162495s();
                        continue;
                    case 34:
                        nearbyLocationInfoPois.city = nc5Var.m162495s();
                        continue;
                    case 42:
                        nearbyLocationInfoPois.province = nc5Var.m162495s();
                        continue;
                    case 50:
                        nearbyLocationInfoPois.area = nc5Var.m162495s();
                        continue;
                    case 57:
                        nearbyLocationInfoPois.lng = nc5Var.m162484h();
                        continue;
                    case 65:
                        nearbyLocationInfoPois.lat = nc5Var.m162484h();
                        continue;
                    case 72:
                        nearbyLocationInfoPois.distance = nc5Var.m162486j();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        nearbyLocationInfoPois.direction = nc5Var.m162495s();
                        continue;
                    case 90:
                        nearbyLocationInfoPois.tag = nc5Var.m162495s();
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NearbyLocationInfoPois nearbyLocationInfoPois, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = nearbyLocationInfoPois.name;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = nearbyLocationInfoPois.address;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = nearbyLocationInfoPois.country;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = nearbyLocationInfoPois.city;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = nearbyLocationInfoPois.province;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
            String str6 = nearbyLocationInfoPois.area;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(6, str6);
            }
            codedOutputByteBufferNano.m17301C(7, nearbyLocationInfoPois.lng);
            codedOutputByteBufferNano.m17301C(8, nearbyLocationInfoPois.lat);
            codedOutputByteBufferNano.m17305G(9, nearbyLocationInfoPois.distance);
            String str7 = nearbyLocationInfoPois.direction;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(10, str7);
            }
            String str8 = nearbyLocationInfoPois.tag;
            if (str8 != null) {
                codedOutputByteBufferNano.m17316R(11, str8);
            }
        }
    };
    public static JsonAdapter<NearbyLocationInfoPois> JSON_ADAPTER = new ObjectJsonAdapter<NearbyLocationInfoPois>() { // from class: com.p1.mobile.putong.data.NearbyLocationInfoPois.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NearbyLocationInfoPois.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NearbyLocationInfoPois newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NearbyLocationInfoPois nearbyLocationInfoPois, JsonGenerator jsonGenerator) throws IOException {
            String str = nearbyLocationInfoPois.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = nearbyLocationInfoPois.address;
            if (str2 != null) {
                jsonGenerator.writeStringField(PlaceTypes.ADDRESS, str2);
            }
            String str3 = nearbyLocationInfoPois.country;
            if (str3 != null) {
                jsonGenerator.writeStringField("country", str3);
            }
            String str4 = nearbyLocationInfoPois.city;
            if (str4 != null) {
                jsonGenerator.writeStringField(RankLevel.city, str4);
            }
            String str5 = nearbyLocationInfoPois.province;
            if (str5 != null) {
                jsonGenerator.writeStringField(RankLevel.province, str5);
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
                jsonGenerator.writeStringField("tag", str8);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NearbyLocationInfoPois) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NearbyLocationInfoPois) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NearbyLocationInfoPois new_() {
        NearbyLocationInfoPois nearbyLocationInfoPois = new NearbyLocationInfoPois();
        nearbyLocationInfoPois.nullCheck();
        return nearbyLocationInfoPois;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NearbyLocationInfoPois mo225055clone() {
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
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
