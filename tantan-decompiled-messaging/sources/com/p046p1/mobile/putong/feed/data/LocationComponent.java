package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.MessageLocation;
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
public class LocationComponent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "locationcomponent";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<MessageLocation> locations;
    public static ProtobufAdapter<LocationComponent> PROTOBUF_ADAPTER = new MessageNanoAdapter<LocationComponent>() { // from class: com.p1.mobile.putong.feed.data.LocationComponent.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LocationComponent locationComponent) {
            List<MessageLocation> list = locationComponent.locations;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, MessageLocation.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            locationComponent.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LocationComponent parse(nb5 nb5Var) throws IOException {
            LocationComponent locationComponent = new LocationComponent();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (locationComponent.locations != null) {
                        break;
                    }
                    locationComponent.locations = new ArrayList();
                    break;
                }
                if (iM158752u != 10) {
                    if (locationComponent.locations != null) {
                        break;
                    }
                    locationComponent.locations = new ArrayList();
                    return locationComponent;
                }
                locationComponent.locations = (List) nb5Var.m158743l(MessageLocation.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return locationComponent;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LocationComponent locationComponent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<MessageLocation> list = locationComponent.locations;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, MessageLocation.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<LocationComponent> JSON_ADAPTER = new ObjectJsonAdapter<LocationComponent>() { // from class: com.p1.mobile.putong.feed.data.LocationComponent.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LocationComponent.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LocationComponent newInstance() {
            return new LocationComponent();
        }

        public boolean parseField(LocationComponent locationComponent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("locations")) {
                return false;
            }
            locationComponent.locations = JsonAdapter.parseArray(jsonParser, MessageLocation.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(LocationComponent locationComponent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("locations")) {
                return true;
            }
            return super.parseFieldCheck(locationComponent, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LocationComponent locationComponent, JsonGenerator jsonGenerator) throws IOException {
            if (locationComponent.locations != null) {
                jsonGenerator.writeFieldName("locations");
                JsonAdapter.serializeArray(locationComponent.locations, jsonGenerator, MessageLocation.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LocationComponent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LocationComponent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LocationComponent new_() {
        LocationComponent locationComponent = new LocationComponent();
        locationComponent.nullCheck();
        return locationComponent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LocationComponent mo223809clone() {
        LocationComponent locationComponent = new LocationComponent();
        List<MessageLocation> list = this.locations;
        if (list != null) {
            locationComponent.locations = ValueObject.util_map(list, new w9j() { // from class: l.ovv
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((MessageLocation) obj).mo223809clone();
                }
            });
        }
        return locationComponent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LocationComponent) {
            return ValueObject.util_equals(this.locations, ((LocationComponent) obj).locations);
        }
        return false;
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
        List<MessageLocation> list = this.locations;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.locations == null) {
            this.locations = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
