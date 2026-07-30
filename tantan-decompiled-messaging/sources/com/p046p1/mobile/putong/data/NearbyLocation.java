package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class NearbyLocation extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "nearbylocation";

    @NonNull
    @ProtobufIndex(index = 2)
    public NearbyLocationList data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<NearbyLocation> PROTOBUF_ADAPTER = new MessageNanoAdapter<NearbyLocation>() { // from class: com.p1.mobile.putong.data.NearbyLocation.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NearbyLocation nearbyLocation) {
            Meta meta = nearbyLocation.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            NearbyLocationList nearbyLocationList = nearbyLocation.data;
            if (nearbyLocationList != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, nearbyLocationList, NearbyLocationList.PROTOBUF_ADAPTER);
            }
            nearbyLocation.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NearbyLocation parse(nb5 nb5Var) throws IOException {
            NearbyLocation nearbyLocation = new NearbyLocation();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (nearbyLocation.meta == null) {
                        nearbyLocation.meta = Meta.new_();
                    }
                    if (nearbyLocation.data != null) {
                        break;
                    }
                    nearbyLocation.data = NearbyLocationList.new_();
                    break;
                }
                if (iM158752u == 10) {
                    nearbyLocation.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (nearbyLocation.meta == null) {
                            nearbyLocation.meta = Meta.new_();
                        }
                        if (nearbyLocation.data != null) {
                            break;
                        }
                        nearbyLocation.data = NearbyLocationList.new_();
                        return nearbyLocation;
                    }
                    nearbyLocation.data = (NearbyLocationList) nb5Var.m158743l(NearbyLocationList.PROTOBUF_ADAPTER);
                }
            }
            return nearbyLocation;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NearbyLocation nearbyLocation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = nearbyLocation.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            NearbyLocationList nearbyLocationList = nearbyLocation.data;
            if (nearbyLocationList != null) {
                codedOutputByteBufferNano.m17254K(2, nearbyLocationList, NearbyLocationList.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<NearbyLocation> JSON_ADAPTER = new ObjectJsonAdapter<NearbyLocation>() { // from class: com.p1.mobile.putong.data.NearbyLocation.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NearbyLocation.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NearbyLocation newInstance() {
            return new NearbyLocation();
        }

        public boolean parseField(NearbyLocation nearbyLocation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                nearbyLocation.data = NearbyLocationList.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            nearbyLocation.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(NearbyLocation nearbyLocation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(nearbyLocation, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NearbyLocation nearbyLocation, JsonGenerator jsonGenerator) throws IOException {
            if (nearbyLocation.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(nearbyLocation.meta, jsonGenerator, true);
            }
            if (nearbyLocation.data != null) {
                jsonGenerator.writeFieldName("data");
                NearbyLocationList.JSON_ADAPTER.serialize(nearbyLocation.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NearbyLocation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NearbyLocation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NearbyLocation new_() {
        NearbyLocation nearbyLocation = new NearbyLocation();
        nearbyLocation.nullCheck();
        return nearbyLocation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NearbyLocation mo223809clone() {
        NearbyLocation nearbyLocation = new NearbyLocation();
        Meta meta = this.meta;
        if (meta != null) {
            nearbyLocation.meta = meta.mo223809clone();
        }
        NearbyLocationList nearbyLocationList = this.data;
        if (nearbyLocationList != null) {
            nearbyLocation.data = nearbyLocationList.mo223809clone();
        }
        return nearbyLocation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NearbyLocation)) {
            return false;
        }
        NearbyLocation nearbyLocation = (NearbyLocation) obj;
        return this == obj && ValueObject.util_equals(this.meta, nearbyLocation.meta) && ValueObject.util_equals(this.data, nearbyLocation.data);
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
        int iHashCode = super.hashCode() * 41;
        Meta meta = this.meta;
        int iHashCode2 = (iHashCode + (meta != null ? meta.hashCode() : 0)) * 41;
        NearbyLocationList nearbyLocationList = this.data;
        int iHashCode3 = iHashCode2 + (nearbyLocationList != null ? nearbyLocationList.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = NearbyLocationList.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
