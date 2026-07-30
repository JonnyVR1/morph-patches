package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.LocationInvisibleField;
import com.p046p1.mobile.putong.data.tenum.OldEnumProtobufAdapter;
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
public class Location extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "location";

    @ProtobufIndex(index = 1)
    public int distance;

    @Nullable
    @ProtobufIndex(index = 5)
    public List<LocationInvisibleField> invisibleFields;

    @Nullable
    @ProtobufIndex(index = 4)
    public Passby passby;

    @NonNull
    @ProtobufIndex(index = 3)
    public Region region;

    @ProtobufIndex(index = 2)
    public double updatedTime;
    public static ProtobufAdapter<Location> PROTOBUF_ADAPTER = new MessageNanoAdapter<Location>() { // from class: com.p1.mobile.putong.data.Location.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Location location) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, location.distance) + CodedOutputByteBufferNano.m17222d(2, location.updatedTime);
            Region region = location.region;
            if (region != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(3, region, Region.PROTOBUF_ADAPTER);
            }
            Passby passby = location.passby;
            if (passby != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(4, passby, Passby.PROTOBUF_ADAPTER);
            }
            List<LocationInvisibleField> list = location.invisibleFields;
            if (list != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(5, LocationInvisibleField.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<LocationInvisibleField> list2 = location.invisibleFields;
            if (list2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(6, list2, LocationInvisibleField.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            location.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Location parse(nb5 nb5Var) throws IOException {
            Location location = new Location();
            List list = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (location.invisibleFields == null && list != null) {
                        location.invisibleFields = LocationInvisibleField.oldEnumCovertList(list);
                    }
                    if (location.region != null) {
                        break;
                    }
                    location.region = Region.new_();
                    break;
                }
                if (iM158752u == 8) {
                    location.distance = nb5Var.m158741j();
                } else if (iM158752u == 17) {
                    location.updatedTime = nb5Var.m158739h();
                } else if (iM158752u == 26) {
                    location.region = (Region) nb5Var.m158743l(Region.PROTOBUF_ADAPTER);
                } else if (iM158752u == 34) {
                    location.passby = (Passby) nb5Var.m158743l(Passby.PROTOBUF_ADAPTER);
                } else if (iM158752u == 42) {
                    list = (List) nb5Var.m158743l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 50) {
                        if (location.invisibleFields == null && list != null) {
                            location.invisibleFields = LocationInvisibleField.oldEnumCovertList(list);
                        }
                        if (location.region != null) {
                            break;
                        }
                        location.region = Region.new_();
                        return location;
                    }
                    location.invisibleFields = (List) nb5Var.m158743l(LocationInvisibleField.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return location;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Location location, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, location.distance);
            codedOutputByteBufferNano.m17246C(2, location.updatedTime);
            Region region = location.region;
            if (region != null) {
                codedOutputByteBufferNano.m17254K(3, region, Region.PROTOBUF_ADAPTER);
            }
            Passby passby = location.passby;
            if (passby != null) {
                codedOutputByteBufferNano.m17254K(4, passby, Passby.PROTOBUF_ADAPTER);
            }
            List<LocationInvisibleField> list = location.invisibleFields;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(5, LocationInvisibleField.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<LocationInvisibleField> list2 = location.invisibleFields;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(6, list2, LocationInvisibleField.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<Location> JSON_ADAPTER = new ObjectJsonAdapter<Location>() { // from class: com.p1.mobile.putong.data.Location.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Location.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Location newInstance() {
            return new Location();
        }

        public boolean parseField(Location location, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "passby":
                    location.passby = Passby.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "region":
                    location.region = Region.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "updatedTime":
                    location.updatedTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "invisibleFields":
                    location.invisibleFields = JsonAdapter.parseArray(jsonParser, LocationInvisibleField.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "distance":
                    location.distance = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Location location, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "passby":
                case "region":
                case "updatedTime":
                case "invisibleFields":
                case "distance":
                    return true;
                default:
                    return super.parseFieldCheck(location, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Location location, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("distance", location.distance);
            jsonGenerator.writeFieldName(LocationInvisibleField.updatedTime);
            Converter.API_TIME.serialize(Double.valueOf(location.updatedTime), jsonGenerator, true);
            if (location.region != null) {
                jsonGenerator.writeFieldName("region");
                Region.JSON_ADAPTER.serialize(location.region, jsonGenerator, true);
            }
            if (location.passby != null) {
                jsonGenerator.writeFieldName(Passby.TYPE);
                Passby.JSON_ADAPTER.serialize(location.passby, jsonGenerator, true);
            }
            if (location.invisibleFields != null) {
                jsonGenerator.writeFieldName("invisibleFields");
                JsonAdapter.serializeArray(location.invisibleFields, jsonGenerator, LocationInvisibleField.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Location) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Location) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ LocationInvisibleField m59846a(LocationInvisibleField locationInvisibleField) {
        return locationInvisibleField;
    }

    public static Location new_() {
        Location location = new Location();
        location.nullCheck();
        return location;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Location mo223809clone() {
        Location location = new Location();
        location.distance = this.distance;
        location.updatedTime = this.updatedTime;
        Region region = this.region;
        if (region != null) {
            location.region = region.mo223809clone();
        }
        Passby passby = this.passby;
        if (passby != null) {
            location.passby = passby.mo223809clone();
        }
        List<LocationInvisibleField> list = this.invisibleFields;
        if (list != null) {
            location.invisibleFields = ValueObject.util_map(list, new w9j() { // from class: l.lvv
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Location.m59846a((LocationInvisibleField) obj);
                }
            });
        }
        return location;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Location)) {
            return false;
        }
        Location location = (Location) obj;
        return this.distance == location.distance && this.updatedTime == location.updatedTime && ValueObject.util_equals(this.region, location.region) && ValueObject.util_equals(this.passby, location.passby) && ValueObject.util_equals(this.invisibleFields, location.invisibleFields);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "location";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + this.distance;
        long jDoubleToLongBits = Double.doubleToLongBits(this.updatedTime);
        int i3 = ((i2 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        Region region = this.region;
        int iHashCode = (i3 + (region != null ? region.hashCode() : 0)) * 41;
        Passby passby = this.passby;
        int iHashCode2 = (iHashCode + (passby != null ? passby.hashCode() : 0)) * 41;
        List<LocationInvisibleField> list = this.invisibleFields;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    public boolean isHideDistance() {
        List<LocationInvisibleField> list = this.invisibleFields;
        return list != null && list.contains(LocationInvisibleField.get("distance"));
    }

    public boolean isHideInfo() {
        List<LocationInvisibleField> list = this.invisibleFields;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean isHideRegionCity() {
        List<LocationInvisibleField> list = this.invisibleFields;
        return list != null && list.contains(LocationInvisibleField.get(LocationInvisibleField.region_city));
    }

    public boolean isHideRegionCountry() {
        List<LocationInvisibleField> list = this.invisibleFields;
        return list != null && list.contains(LocationInvisibleField.get(LocationInvisibleField.region_country));
    }

    public boolean isHideRegionDistrict() {
        List<LocationInvisibleField> list = this.invisibleFields;
        return list != null && list.contains(LocationInvisibleField.get(LocationInvisibleField.region_district));
    }

    public boolean isHideUpdateTime() {
        List<LocationInvisibleField> list = this.invisibleFields;
        return list != null && list.contains(LocationInvisibleField.get(LocationInvisibleField.updatedTime));
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.region == null) {
            this.region = Region.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
