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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NearbyLocation nearbyLocation) {
            Meta meta = nearbyLocation.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            NearbyLocationList nearbyLocationList = nearbyLocation.data;
            if (nearbyLocationList != null) {
                iL += CodedOutputByteBufferNano.l(2, nearbyLocationList, NearbyLocationList.PROTOBUF_ADAPTER);
            }
            ((MessageNano) nearbyLocation).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NearbyLocation m18522parse(nb5 nb5Var) throws IOException {
            NearbyLocation nearbyLocation = new NearbyLocation();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (nearbyLocation.meta == null) {
                        nearbyLocation.meta = Meta.new_();
                    }
                    if (nearbyLocation.data != null) {
                        break;
                    }
                    nearbyLocation.data = NearbyLocationList.new_();
                    break;
                }
                if (iU == 10) {
                    nearbyLocation.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (nearbyLocation.meta == null) {
                            nearbyLocation.meta = Meta.new_();
                        }
                        if (nearbyLocation.data != null) {
                            break;
                        }
                        nearbyLocation.data = NearbyLocationList.new_();
                        return nearbyLocation;
                    }
                    nearbyLocation.data = (NearbyLocationList) nb5Var.l(NearbyLocationList.PROTOBUF_ADAPTER);
                }
            }
            return nearbyLocation;
        }

        public void serialize(NearbyLocation nearbyLocation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = nearbyLocation.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            NearbyLocationList nearbyLocationList = nearbyLocation.data;
            if (nearbyLocationList != null) {
                codedOutputByteBufferNano.K(2, nearbyLocationList, NearbyLocationList.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<NearbyLocation> JSON_ADAPTER = new ObjectJsonAdapter<NearbyLocation>() { // from class: com.p1.mobile.putong.data.NearbyLocation.2
        public Class getDataClass() {
            return NearbyLocation.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public NearbyLocation mo17830newInstance() {
            return new NearbyLocation();
        }

        public boolean parseField(NearbyLocation nearbyLocation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Data.TYPE)) {
                nearbyLocation.data = (NearbyLocationList) NearbyLocationList.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(Meta.TYPE)) {
                return false;
            }
            nearbyLocation.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(NearbyLocation nearbyLocation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Data.TYPE) || str.equals(Meta.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(nearbyLocation, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NearbyLocation nearbyLocation, JsonGenerator jsonGenerator) throws IOException {
            if (nearbyLocation.meta != null) {
                jsonGenerator.writeFieldName(Meta.TYPE);
                Meta.JSON_ADAPTER.serialize(nearbyLocation.meta, jsonGenerator, true);
            }
            if (nearbyLocation.data != null) {
                jsonGenerator.writeFieldName(Data.TYPE);
                NearbyLocationList.JSON_ADAPTER.serialize(nearbyLocation.data, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NearbyLocation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NearbyLocation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NearbyLocation new_() {
        NearbyLocation nearbyLocation = new NearbyLocation();
        nearbyLocation.nullCheck();
        return nearbyLocation;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NearbyLocation m18521clone() {
        NearbyLocation nearbyLocation = new NearbyLocation();
        Meta meta = this.meta;
        if (meta != null) {
            nearbyLocation.meta = meta.m18461clone();
        }
        NearbyLocationList nearbyLocationList = this.data;
        if (nearbyLocationList != null) {
            nearbyLocation.data = nearbyLocationList.m18530clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        Meta meta = this.meta;
        int iHashCode2 = (iHashCode + (meta != null ? meta.hashCode() : 0)) * 41;
        NearbyLocationList nearbyLocationList = this.data;
        int iHashCode3 = iHashCode2 + (nearbyLocationList != null ? nearbyLocationList.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = NearbyLocationList.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
