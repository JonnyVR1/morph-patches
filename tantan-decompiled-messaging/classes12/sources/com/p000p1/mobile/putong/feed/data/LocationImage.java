package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.LocationImage;
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LocationImage locationImage) {
            String str = locationImage.address;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<Double> list = locationImage.coordinates;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) locationImage).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LocationImage m19575parse(nb5 nb5Var) throws IOException {
            LocationImage locationImage = new LocationImage();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (locationImage.address == null) {
                        locationImage.address = "";
                    }
                    if (locationImage.coordinates != null) {
                        break;
                    }
                    locationImage.coordinates = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    locationImage.address = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (locationImage.address == null) {
                            locationImage.address = "";
                        }
                        if (locationImage.coordinates != null) {
                            break;
                        }
                        locationImage.coordinates = new ArrayList();
                        return locationImage;
                    }
                    locationImage.coordinates = (List) nb5Var.l(ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return locationImage;
        }

        public void serialize(LocationImage locationImage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = locationImage.address;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<Double> list = locationImage.coordinates;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.DOUBLE_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<LocationImage> JSON_ADAPTER = new ObjectJsonAdapter<LocationImage>() { // from class: com.p1.mobile.putong.feed.data.LocationImage.2
        public Class getDataClass() {
            return LocationImage.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LocationImage mo17830newInstance() {
            return new LocationImage();
        }

        public boolean parseField(LocationImage locationImage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("address")) {
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
            if (str.equals("address") || str.equals("coordinates")) {
                return true;
            }
            return super.parseFieldCheck(locationImage, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LocationImage locationImage, JsonGenerator jsonGenerator) throws IOException {
            String str = locationImage.address;
            if (str != null) {
                jsonGenerator.writeStringField("address", str);
            }
            if (locationImage.coordinates != null) {
                jsonGenerator.writeFieldName("coordinates");
                JsonAdapter.serializeArray(locationImage.coordinates, jsonGenerator, JsonAdapter.DOUBLE_BOXED_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LocationImage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LocationImage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Double m1782a(Double d) {
        return d;
    }

    public static LocationImage new_() {
        LocationImage locationImage = new LocationImage();
        locationImage.nullCheck();
        return locationImage;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LocationImage m19574clone() {
        LocationImage locationImage = new LocationImage();
        locationImage.address = this.address;
        List<Double> list = this.coordinates;
        if (list != null) {
            locationImage.coordinates = ValueObject.util_map(list, new w9j() { // from class: l.qvv
                public final Object call(Object obj) {
                    return LocationImage.m1782a((Double) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.address;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<Double> list = this.coordinates;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.address == null) {
            this.address = "";
        }
        if (this.coordinates == null) {
            this.coordinates = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
