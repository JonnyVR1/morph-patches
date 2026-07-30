package com.p051p1.mobile.putong.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.GPMemo;
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
public class GPMemoData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gpmemodata";

    @Nullable
    @ProtobufIndex(index = 1)
    public List<GPMemo> memos;
    public static ProtobufAdapter<GPMemoData> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPMemoData>() { // from class: com.p1.mobile.putong.data.GPMemoData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GPMemoData gPMemoData) {
            List<GPMemo> list = gPMemoData.memos;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, GPMemo.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            gPMemoData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GPMemoData parse(nc5 nc5Var) throws IOException {
            GPMemoData gPMemoData = new GPMemoData();
            while (nc5Var.m162497u() == 10) {
                gPMemoData.memos = (List) nc5Var.m162488l(GPMemo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return gPMemoData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GPMemoData gPMemoData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<GPMemo> list = gPMemoData.memos;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, GPMemo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<GPMemoData> JSON_ADAPTER = new ObjectJsonAdapter<GPMemoData>() { // from class: com.p1.mobile.putong.data.GPMemoData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GPMemoData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GPMemoData newInstance() {
            return new GPMemoData();
        }

        public boolean parseField(GPMemoData gPMemoData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("memos")) {
                return false;
            }
            gPMemoData.memos = JsonAdapter.parseArray(jsonParser, GPMemo.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(GPMemoData gPMemoData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("memos")) {
                return true;
            }
            return super.parseFieldCheck(gPMemoData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GPMemoData gPMemoData, JsonGenerator jsonGenerator) throws IOException {
            if (gPMemoData.memos != null) {
                jsonGenerator.writeFieldName("memos");
                JsonAdapter.serializeArray(gPMemoData.memos, jsonGenerator, GPMemo.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPMemoData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPMemoData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPMemoData new_() {
        GPMemoData gPMemoData = new GPMemoData();
        gPMemoData.nullCheck();
        return gPMemoData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GPMemoData mo225055clone() {
        GPMemoData gPMemoData = new GPMemoData();
        List<GPMemo> list = this.memos;
        if (list != null) {
            gPMemoData.memos = ValueObject.util_map(list, new qcj() { // from class: l.zgj
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((GPMemo) obj).mo225055clone();
                }
            });
        }
        return gPMemoData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GPMemoData) {
            return ValueObject.util_equals(this.memos, ((GPMemoData) obj).memos);
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
        List<GPMemo> list = this.memos;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
