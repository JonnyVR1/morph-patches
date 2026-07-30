package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Location;
import com.p000p1.mobile.putong.data.LocationInvisibleField;
import com.p000p1.mobile.putong.data.tenum.OldEnumProtobufAdapter;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Location location) {
            int iH = CodedOutputByteBufferNano.h(1, location.distance) + CodedOutputByteBufferNano.d(2, location.updatedTime);
            Region region = location.region;
            if (region != null) {
                iH += CodedOutputByteBufferNano.l(3, region, Region.PROTOBUF_ADAPTER);
            }
            Passby passby = location.passby;
            if (passby != null) {
                iH += CodedOutputByteBufferNano.l(4, passby, Passby.PROTOBUF_ADAPTER);
            }
            List<LocationInvisibleField> list = location.invisibleFields;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(5, LocationInvisibleField.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<LocationInvisibleField> list2 = location.invisibleFields;
            if (list2 != null) {
                iH += CodedOutputByteBufferNano.l(6, list2, LocationInvisibleField.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) location).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Location m18418parse(nb5 nb5Var) throws IOException {
            Location location = new Location();
            List list = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (location.invisibleFields == null && list != null) {
                        location.invisibleFields = LocationInvisibleField.oldEnumCovertList(list);
                    }
                    if (location.region != null) {
                        break;
                    }
                    location.region = Region.new_();
                    break;
                }
                if (iU == 8) {
                    location.distance = nb5Var.j();
                } else if (iU == 17) {
                    location.updatedTime = nb5Var.h();
                } else if (iU == 26) {
                    location.region = (Region) nb5Var.l(Region.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    location.passby = (Passby) nb5Var.l(Passby.PROTOBUF_ADAPTER);
                } else if (iU == 42) {
                    list = (List) nb5Var.l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 50) {
                        if (location.invisibleFields == null && list != null) {
                            location.invisibleFields = LocationInvisibleField.oldEnumCovertList(list);
                        }
                        if (location.region != null) {
                            break;
                        }
                        location.region = Region.new_();
                        return location;
                    }
                    location.invisibleFields = (List) nb5Var.l(LocationInvisibleField.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return location;
        }

        public void serialize(Location location, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, location.distance);
            codedOutputByteBufferNano.C(2, location.updatedTime);
            Region region = location.region;
            if (region != null) {
                codedOutputByteBufferNano.K(3, region, Region.PROTOBUF_ADAPTER);
            }
            Passby passby = location.passby;
            if (passby != null) {
                codedOutputByteBufferNano.K(4, passby, Passby.PROTOBUF_ADAPTER);
            }
            List<LocationInvisibleField> list = location.invisibleFields;
            if (list != null) {
                codedOutputByteBufferNano.K(5, LocationInvisibleField.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<LocationInvisibleField> list2 = location.invisibleFields;
            if (list2 != null) {
                codedOutputByteBufferNano.K(6, list2, LocationInvisibleField.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<Location> JSON_ADAPTER = new ObjectJsonAdapter<Location>() { // from class: com.p1.mobile.putong.data.Location.2
        public Class getDataClass() {
            return Location.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Location mo17830newInstance() {
            return new Location();
        }

        public boolean parseField(Location location, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "passby":
                    location.passby = (Passby) Passby.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "region":
                    location.region = (Region) Region.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "updatedTime":
                    location.updatedTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Location location, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("distance", location.distance);
            jsonGenerator.writeFieldName(LocationInvisibleField.updatedTime);
            Converter.API_TIME.serialize(Double.valueOf(location.updatedTime), jsonGenerator, true);
            if (location.region != null) {
                jsonGenerator.writeFieldName(Region.TYPE);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Location) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Location) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ LocationInvisibleField m764a(LocationInvisibleField locationInvisibleField) {
        return locationInvisibleField;
    }

    public static Location new_() {
        Location location = new Location();
        location.nullCheck();
        return location;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Location m18417clone() {
        Location location = new Location();
        location.distance = this.distance;
        location.updatedTime = this.updatedTime;
        Region region = this.region;
        if (region != null) {
            location.region = region.m18889clone();
        }
        Passby passby = this.passby;
        if (passby != null) {
            location.passby = passby.m18770clone();
        }
        List<LocationInvisibleField> list = this.invisibleFields;
        if (list != null) {
            location.invisibleFields = ValueObject.util_map(list, new w9j() { // from class: l.lvv
                public final Object call(Object obj) {
                    return Location.m764a((LocationInvisibleField) obj);
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

    public String getClassParseName() {
        return "location";
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
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

    public void nullCheck() {
        if (this.region == null) {
            this.region = Region.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
