package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.NearbyLocationInfo;
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
public class NearbyLocationList extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "nearbylocationlist";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<NearbyLocationInfo> nearbys;
    public static ProtobufAdapter<NearbyLocationList> PROTOBUF_ADAPTER = new MessageNanoAdapter<NearbyLocationList>() { // from class: com.p1.mobile.putong.data.NearbyLocationList.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NearbyLocationList nearbyLocationList) {
            List<NearbyLocationInfo> list = nearbyLocationList.nearbys;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, NearbyLocationInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) nearbyLocationList).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NearbyLocationList m18531parse(nb5 nb5Var) throws IOException {
            NearbyLocationList nearbyLocationList = new NearbyLocationList();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (nearbyLocationList.nearbys != null) {
                        break;
                    }
                    nearbyLocationList.nearbys = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (nearbyLocationList.nearbys != null) {
                        break;
                    }
                    nearbyLocationList.nearbys = new ArrayList();
                    return nearbyLocationList;
                }
                nearbyLocationList.nearbys = (List) nb5Var.l(NearbyLocationInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return nearbyLocationList;
        }

        public void serialize(NearbyLocationList nearbyLocationList, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<NearbyLocationInfo> list = nearbyLocationList.nearbys;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, NearbyLocationInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<NearbyLocationList> JSON_ADAPTER = new ObjectJsonAdapter<NearbyLocationList>() { // from class: com.p1.mobile.putong.data.NearbyLocationList.2
        public Class getDataClass() {
            return NearbyLocationList.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public NearbyLocationList mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NearbyLocationList nearbyLocationList, JsonGenerator jsonGenerator) throws IOException {
            if (nearbyLocationList.nearbys != null) {
                jsonGenerator.writeFieldName("nearbys");
                JsonAdapter.serializeArray(nearbyLocationList.nearbys, jsonGenerator, NearbyLocationInfo.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NearbyLocationList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NearbyLocationList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NearbyLocationList new_() {
        NearbyLocationList nearbyLocationList = new NearbyLocationList();
        nearbyLocationList.nullCheck();
        return nearbyLocationList;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NearbyLocationList m18530clone() {
        NearbyLocationList nearbyLocationList = new NearbyLocationList();
        List<NearbyLocationInfo> list = this.nearbys;
        if (list != null) {
            nearbyLocationList.nearbys = ValueObject.util_map(list, new w9j() { // from class: l.j820
                public final Object call(Object obj) {
                    return ((NearbyLocationInfo) obj).m18524clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<NearbyLocationInfo> list = this.nearbys;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.nearbys == null) {
            this.nearbys = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
