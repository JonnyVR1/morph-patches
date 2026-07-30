package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveDanmakuList extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveDanmakuList> JSON_ADAPTER = new ObjectJsonAdapter<BLiveDanmakuList>() { // from class: com.p1.mobile.putong.live.base.data.BLiveDanmakuList.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveDanmakuList.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveDanmakuList newInstance() {
            return new BLiveDanmakuList();
        }

        public boolean parseField(BLiveDanmakuList bLiveDanmakuList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("floatTypes")) {
                bLiveDanmakuList.floatTypes = JsonAdapter.parseArray(jsonParser, BLiveDanmakuListItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("fixedTypes")) {
                return false;
            }
            bLiveDanmakuList.fixedTypes = JsonAdapter.parseArray(jsonParser, BLiveDanmakuListItem.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveDanmakuList bLiveDanmakuList, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveDanmakuList.fixedTypes != null) {
                jsonGenerator.writeFieldName("fixedTypes");
                JsonAdapter.serializeArray(bLiveDanmakuList.fixedTypes, jsonGenerator, BLiveDanmakuListItem.JSON_ADAPTER);
            }
            if (bLiveDanmakuList.floatTypes != null) {
                jsonGenerator.writeFieldName("floatTypes");
                JsonAdapter.serializeArray(bLiveDanmakuList.floatTypes, jsonGenerator, BLiveDanmakuListItem.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveDanmakuList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivedanmakulist";

    @Nullable
    @ProtobufIndex(index = 1)
    public List<BLiveDanmakuListItem> fixedTypes;

    @Nullable
    @ProtobufIndex(index = 2)
    public List<BLiveDanmakuListItem> floatTypes;

    public static BLiveDanmakuList new_() {
        BLiveDanmakuList bLiveDanmakuList = new BLiveDanmakuList();
        bLiveDanmakuList.nullCheck();
        return bLiveDanmakuList;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveDanmakuList mo223809clone() {
        BLiveDanmakuList bLiveDanmakuList = new BLiveDanmakuList();
        List<BLiveDanmakuListItem> list = this.fixedTypes;
        if (list != null) {
            bLiveDanmakuList.fixedTypes = ValueObject.util_map(list, new w9j() { // from class: l.zs1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveDanmakuListItem) obj).mo223809clone();
                }
            });
        }
        List<BLiveDanmakuListItem> list2 = this.floatTypes;
        if (list2 != null) {
            bLiveDanmakuList.floatTypes = ValueObject.util_map(list2, new w9j() { // from class: l.at1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveDanmakuListItem) obj).mo223809clone();
                }
            });
        }
        return bLiveDanmakuList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveDanmakuList)) {
            return false;
        }
        BLiveDanmakuList bLiveDanmakuList = (BLiveDanmakuList) obj;
        return ValueObject.util_equals(this.fixedTypes, bLiveDanmakuList.fixedTypes) && ValueObject.util_equals(this.floatTypes, bLiveDanmakuList.floatTypes);
    }

    @Nullable
    public BLiveDanmakuListItem find(w9j<BLiveDanmakuListItem, Boolean> w9jVar) {
        BLiveDanmakuListItem bLiveDanmakuListItem = (BLiveDanmakuListItem) vwb.m200346r(this.fixedTypes, w9jVar);
        return bLiveDanmakuListItem == null ? (BLiveDanmakuListItem) vwb.m200346r(this.floatTypes, w9jVar) : bLiveDanmakuListItem;
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
        List<BLiveDanmakuListItem> list = this.fixedTypes;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveDanmakuListItem> list2 = this.floatTypes;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
