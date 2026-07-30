package com.p000p1.mobile.putong.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.GPMemo;
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
public class GPMemoData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gpmemodata";

    @Nullable
    @ProtobufIndex(index = 1)
    public List<GPMemo> memos;
    public static ProtobufAdapter<GPMemoData> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPMemoData>() { // from class: com.p1.mobile.putong.data.GPMemoData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GPMemoData gPMemoData) {
            List<GPMemo> list = gPMemoData.memos;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, GPMemo.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) gPMemoData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GPMemoData m18154parse(nb5 nb5Var) throws IOException {
            GPMemoData gPMemoData = new GPMemoData();
            while (nb5Var.u() == 10) {
                gPMemoData.memos = (List) nb5Var.l(GPMemo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return gPMemoData;
        }

        public void serialize(GPMemoData gPMemoData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<GPMemo> list = gPMemoData.memos;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, GPMemo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<GPMemoData> JSON_ADAPTER = new ObjectJsonAdapter<GPMemoData>() { // from class: com.p1.mobile.putong.data.GPMemoData.2
        public Class getDataClass() {
            return GPMemoData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public GPMemoData mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GPMemoData gPMemoData, JsonGenerator jsonGenerator) throws IOException {
            if (gPMemoData.memos != null) {
                jsonGenerator.writeFieldName("memos");
                JsonAdapter.serializeArray(gPMemoData.memos, jsonGenerator, GPMemo.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPMemoData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPMemoData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPMemoData new_() {
        GPMemoData gPMemoData = new GPMemoData();
        gPMemoData.nullCheck();
        return gPMemoData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GPMemoData m18153clone() {
        GPMemoData gPMemoData = new GPMemoData();
        List<GPMemo> list = this.memos;
        if (list != null) {
            gPMemoData.memos = ValueObject.util_map(list, new w9j() { // from class: l.fej
                public final Object call(Object obj) {
                    return ((GPMemo) obj).m18150clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<GPMemo> list = this.memos;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
