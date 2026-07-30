package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.NearbyLocationInfo;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class NearbyLocationList extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "nearbylocationlist";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<NearbyLocationInfo> nearbys;
    public static ProtobufAdapter<NearbyLocationList> PROTOBUF_ADAPTER = new MessageNanoAdapter<NearbyLocationList>() { // from class: com.p1.mobile.putong.data.NearbyLocationList.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NearbyLocationList nearbyLocationList) {
            List<NearbyLocationInfo> list = nearbyLocationList.nearbys;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, NearbyLocationInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            nearbyLocationList.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NearbyLocationList parse(nc5 nc5Var) throws IOException {
            NearbyLocationList nearbyLocationList = new NearbyLocationList();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (nearbyLocationList.nearbys != null) {
                        break;
                    }
                    nearbyLocationList.nearbys = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (nearbyLocationList.nearbys != null) {
                        break;
                    }
                    nearbyLocationList.nearbys = new ArrayList();
                    return nearbyLocationList;
                }
                nearbyLocationList.nearbys = (List) nc5Var.m162488l(NearbyLocationInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return nearbyLocationList;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NearbyLocationList nearbyLocationList, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<NearbyLocationInfo> list = nearbyLocationList.nearbys;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, NearbyLocationInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<NearbyLocationList> JSON_ADAPTER = new ObjectJsonAdapter<NearbyLocationList>() { // from class: com.p1.mobile.putong.data.NearbyLocationList.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NearbyLocationList.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NearbyLocationList newInstance() {
            return new NearbyLocationList();
        }

        public boolean parseField(NearbyLocationList nearbyLocationList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("nearbys")) {
                return false;
            }
            nearbyLocationList.nearbys = JsonAdapter.parseArray(jsonParser, NearbyLocationInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(NearbyLocationList nearbyLocationList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("nearbys")) {
                return true;
            }
            return super.parseFieldCheck(nearbyLocationList, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NearbyLocationList nearbyLocationList, JsonGenerator jsonGenerator) throws IOException {
            if (nearbyLocationList.nearbys != null) {
                jsonGenerator.writeFieldName("nearbys");
                JsonAdapter.serializeArray(nearbyLocationList.nearbys, jsonGenerator, NearbyLocationInfo.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NearbyLocationList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NearbyLocationList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NearbyLocationList new_() {
        NearbyLocationList nearbyLocationList = new NearbyLocationList();
        nearbyLocationList.nullCheck();
        return nearbyLocationList;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NearbyLocationList mo225055clone() {
        NearbyLocationList nearbyLocationList = new NearbyLocationList();
        List<NearbyLocationInfo> list = this.nearbys;
        if (list != null) {
            nearbyLocationList.nearbys = ValueObject.util_map(list, new qcj() { // from class: l.rg20
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((NearbyLocationInfo) obj).mo225055clone();
                }
            });
        }
        return nearbyLocationList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NearbyLocationList) {
            return ValueObject.util_equals(this.nearbys, ((NearbyLocationList) obj).nearbys);
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
        List<NearbyLocationInfo> list = this.nearbys;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.nearbys == null) {
            this.nearbys = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
