package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveWealthHierarchys extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveWealthHierarchys> JSON_ADAPTER = new ObjectJsonAdapter<BLiveWealthHierarchys>() { // from class: com.p1.mobile.putong.live.base.data.BLiveWealthHierarchys.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveWealthHierarchys.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveWealthHierarchys newInstance() {
            return new BLiveWealthHierarchys();
        }

        public boolean parseField(BLiveWealthHierarchys bLiveWealthHierarchys, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("wealthHierarchy")) {
                return false;
            }
            bLiveWealthHierarchys.wealthHierarchy = BLiveUserWealthHierarchy.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveWealthHierarchys bLiveWealthHierarchys, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveWealthHierarchys.wealthHierarchy != null) {
                jsonGenerator.writeFieldName("wealthHierarchy");
                BLiveUserWealthHierarchy.JSON_ADAPTER.serialize(bLiveWealthHierarchys.wealthHierarchy, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveWealthHierarchys) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivewealthhierarchys";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveUserWealthHierarchy wealthHierarchy;

    public static BLiveWealthHierarchys new_() {
        BLiveWealthHierarchys bLiveWealthHierarchys = new BLiveWealthHierarchys();
        bLiveWealthHierarchys.nullCheck();
        return bLiveWealthHierarchys;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveWealthHierarchys mo225055clone() {
        BLiveWealthHierarchys bLiveWealthHierarchys = new BLiveWealthHierarchys();
        BLiveUserWealthHierarchy bLiveUserWealthHierarchy = this.wealthHierarchy;
        if (bLiveUserWealthHierarchy != null) {
            bLiveWealthHierarchys.wealthHierarchy = bLiveUserWealthHierarchy.mo225055clone();
        }
        return bLiveWealthHierarchys;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveWealthHierarchys) {
            return ValueObject.util_equals(this.wealthHierarchy, ((BLiveWealthHierarchys) obj).wealthHierarchy);
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
        BLiveUserWealthHierarchy bLiveUserWealthHierarchy = this.wealthHierarchy;
        int iHashCode = i2 + (bLiveUserWealthHierarchy != null ? bLiveUserWealthHierarchy.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.wealthHierarchy == null) {
            this.wealthHierarchy = BLiveUserWealthHierarchy.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
