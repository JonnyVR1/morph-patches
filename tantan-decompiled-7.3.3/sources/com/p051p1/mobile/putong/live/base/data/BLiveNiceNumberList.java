package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveNiceNumberList;
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
public class BLiveNiceNumberList extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveNiceNumberList> JSON_ADAPTER = new ObjectJsonAdapter<BLiveNiceNumberList>() { // from class: com.p1.mobile.putong.live.base.data.BLiveNiceNumberList.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveNiceNumberList.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveNiceNumberList newInstance() {
            return new BLiveNiceNumberList();
        }

        public boolean parseField(BLiveNiceNumberList bLiveNiceNumberList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("numbers")) {
                return false;
            }
            bLiveNiceNumberList.numbers = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveNiceNumberList bLiveNiceNumberList, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveNiceNumberList.numbers != null) {
                jsonGenerator.writeFieldName("numbers");
                JsonAdapter.serializeArray(bLiveNiceNumberList.numbers, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveNiceNumberList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivenicenumberlist";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> numbers;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m69277a(String str) {
        return str;
    }

    public static BLiveNiceNumberList new_() {
        BLiveNiceNumberList bLiveNiceNumberList = new BLiveNiceNumberList();
        bLiveNiceNumberList.nullCheck();
        return bLiveNiceNumberList;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveNiceNumberList mo225055clone() {
        BLiveNiceNumberList bLiveNiceNumberList = new BLiveNiceNumberList();
        List<String> list = this.numbers;
        if (list != null) {
            bLiveNiceNumberList.numbers = ValueObject.util_map(list, new qcj() { // from class: l.a42
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveNiceNumberList.m69277a((String) obj);
                }
            });
        }
        return bLiveNiceNumberList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BLiveNiceNumberList) {
            return ValueObject.util_equals(this.numbers, ((BLiveNiceNumberList) obj).numbers);
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
        List<String> list = this.numbers;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.numbers == null) {
            this.numbers = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
