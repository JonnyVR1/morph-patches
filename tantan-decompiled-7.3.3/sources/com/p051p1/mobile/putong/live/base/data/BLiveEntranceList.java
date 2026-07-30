package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveEntrance;
import com.p051p1.mobile.putong.live.base.data.BLiveEntranceList;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveEntranceList extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveEntranceList> JSON_ADAPTER = new ObjectJsonAdapter<BLiveEntranceList>() { // from class: com.p1.mobile.putong.live.base.data.BLiveEntranceList.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveEntranceList.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveEntranceList newInstance() {
            return new BLiveEntranceList();
        }

        public boolean parseField(BLiveEntranceList bLiveEntranceList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("keyList")) {
                bLiveEntranceList.keyList = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("entrances")) {
                return false;
            }
            bLiveEntranceList.entrances = JsonAdapter.parseArray(jsonParser, BLiveEntrance.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveEntranceList bLiveEntranceList, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveEntranceList.keyList != null) {
                jsonGenerator.writeFieldName("keyList");
                JsonAdapter.serializeArray(bLiveEntranceList.keyList, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (bLiveEntranceList.entrances != null) {
                jsonGenerator.writeFieldName("entrances");
                JsonAdapter.serializeArray(bLiveEntranceList.entrances, jsonGenerator, BLiveEntrance.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveEntranceList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveentrancelist";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveEntrance> entrances;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> keyList;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m69122b(String str) {
        return str;
    }

    public static BLiveEntranceList new_() {
        BLiveEntranceList bLiveEntranceList = new BLiveEntranceList();
        bLiveEntranceList.nullCheck();
        return bLiveEntranceList;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveEntranceList mo225055clone() {
        BLiveEntranceList bLiveEntranceList = new BLiveEntranceList();
        List<String> list = this.keyList;
        if (list != null) {
            bLiveEntranceList.keyList = ValueObject.util_map(list, new qcj() { // from class: l.qz1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveEntranceList.m69122b((String) obj);
                }
            });
        }
        List<BLiveEntrance> list2 = this.entrances;
        if (list2 != null) {
            bLiveEntranceList.entrances = ValueObject.util_map(list2, new qcj() { // from class: l.rz1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveEntrance) obj).mo225055clone();
                }
            });
        }
        return bLiveEntranceList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveEntranceList)) {
            return false;
        }
        BLiveEntranceList bLiveEntranceList = (BLiveEntranceList) obj;
        return ValueObject.util_equals(this.keyList, bLiveEntranceList.keyList) && ValueObject.util_equals(this.entrances, bLiveEntranceList.entrances);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public BLiveEntrance getLiveEntrance(String str) {
        for (int i = 0; i < this.keyList.size(); i++) {
            if (str.equals(this.keyList.get(i))) {
                return this.entrances.get(i);
            }
        }
        return null;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<String> list = this.keyList;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveEntrance> list2 = this.entrances;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.keyList == null) {
            this.keyList = new ArrayList();
        }
        if (this.entrances == null) {
            this.entrances = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
