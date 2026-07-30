package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.MessageLocation;
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
public class LocationComponent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "locationcomponent";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<MessageLocation> locations;
    public static ProtobufAdapter<LocationComponent> PROTOBUF_ADAPTER = new MessageNanoAdapter<LocationComponent>() { // from class: com.p1.mobile.putong.feed.data.LocationComponent.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LocationComponent locationComponent) {
            List<MessageLocation> list = locationComponent.locations;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, MessageLocation.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) locationComponent).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LocationComponent m19572parse(nb5 nb5Var) throws IOException {
            LocationComponent locationComponent = new LocationComponent();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (locationComponent.locations != null) {
                        break;
                    }
                    locationComponent.locations = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (locationComponent.locations != null) {
                        break;
                    }
                    locationComponent.locations = new ArrayList();
                    return locationComponent;
                }
                locationComponent.locations = (List) nb5Var.l(MessageLocation.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return locationComponent;
        }

        public void serialize(LocationComponent locationComponent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<MessageLocation> list = locationComponent.locations;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, MessageLocation.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<LocationComponent> JSON_ADAPTER = new ObjectJsonAdapter<LocationComponent>() { // from class: com.p1.mobile.putong.feed.data.LocationComponent.2
        public Class getDataClass() {
            return LocationComponent.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LocationComponent mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LocationComponent locationComponent, JsonGenerator jsonGenerator) throws IOException {
            if (locationComponent.locations != null) {
                jsonGenerator.writeFieldName("locations");
                JsonAdapter.serializeArray(locationComponent.locations, jsonGenerator, MessageLocation.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LocationComponent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LocationComponent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LocationComponent new_() {
        LocationComponent locationComponent = new LocationComponent();
        locationComponent.nullCheck();
        return locationComponent;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LocationComponent m19571clone() {
        LocationComponent locationComponent = new LocationComponent();
        List<MessageLocation> list = this.locations;
        if (list != null) {
            locationComponent.locations = ValueObject.util_map(list, new w9j() { // from class: l.ovv
                public final Object call(Object obj) {
                    return ((MessageLocation) obj).m18458clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<MessageLocation> list = this.locations;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.locations == null) {
            this.locations = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
