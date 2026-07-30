package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLivePkPointList;
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
public class BLivePkPointList extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePkPointList> JSON_ADAPTER = new ObjectJsonAdapter<BLivePkPointList>() { // from class: com.p1.mobile.putong.live.base.data.BLivePkPointList.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePkPointList.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePkPointList newInstance() {
            return new BLivePkPointList();
        }

        public boolean parseField(BLivePkPointList bLivePkPointList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userId")) {
                bLivePkPointList.userId = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("point")) {
                return false;
            }
            bLivePkPointList.point = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePkPointList bLivePkPointList, JsonGenerator jsonGenerator) throws IOException {
            if (bLivePkPointList.userId != null) {
                jsonGenerator.writeFieldName("userId");
                JsonAdapter.serializeArray(bLivePkPointList.userId, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (bLivePkPointList.point != null) {
                jsonGenerator.writeFieldName("point");
                JsonAdapter.serializeArray(bLivePkPointList.point, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePkPointList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepkpointlist";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> point;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> userId;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m69339a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m69340b(String str) {
        return str;
    }

    public static BLivePkPointList new_() {
        BLivePkPointList bLivePkPointList = new BLivePkPointList();
        bLivePkPointList.nullCheck();
        return bLivePkPointList;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePkPointList mo225055clone() {
        BLivePkPointList bLivePkPointList = new BLivePkPointList();
        List<String> list = this.userId;
        if (list != null) {
            bLivePkPointList.userId = ValueObject.util_map(list, new qcj() { // from class: l.o42
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLivePkPointList.m69339a((String) obj);
                }
            });
        }
        List<String> list2 = this.point;
        if (list2 != null) {
            bLivePkPointList.point = ValueObject.util_map(list2, new qcj() { // from class: l.p42
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLivePkPointList.m69340b((String) obj);
                }
            });
        }
        return bLivePkPointList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePkPointList)) {
            return false;
        }
        BLivePkPointList bLivePkPointList = (BLivePkPointList) obj;
        return ValueObject.util_equals(this.userId, bLivePkPointList.userId) && ValueObject.util_equals(this.point, bLivePkPointList.point);
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
        List<String> list = this.userId;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.point;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = new ArrayList();
        }
        if (this.point == null) {
            this.point = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
