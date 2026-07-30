package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.ReSwipeConvLabelItem;
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

/* JADX INFO: loaded from: classes10.dex */
public class ReSwipeConvLabels extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "reswipeconvlabels";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<ReSwipeConvLabelItem> labelList;
    public static ProtobufAdapter<ReSwipeConvLabels> PROTOBUF_ADAPTER = new MessageNanoAdapter<ReSwipeConvLabels>() { // from class: com.p1.mobile.putong.core.data.ReSwipeConvLabels.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ReSwipeConvLabels reSwipeConvLabels) {
            List<ReSwipeConvLabelItem> list = reSwipeConvLabels.labelList;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ReSwipeConvLabelItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            reSwipeConvLabels.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ReSwipeConvLabels parse(nc5 nc5Var) throws IOException {
            ReSwipeConvLabels reSwipeConvLabels = new ReSwipeConvLabels();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (reSwipeConvLabels.labelList != null) {
                        break;
                    }
                    reSwipeConvLabels.labelList = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (reSwipeConvLabels.labelList != null) {
                        break;
                    }
                    reSwipeConvLabels.labelList = new ArrayList();
                    return reSwipeConvLabels;
                }
                reSwipeConvLabels.labelList = (List) nc5Var.m162488l(ReSwipeConvLabelItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return reSwipeConvLabels;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ReSwipeConvLabels reSwipeConvLabels, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<ReSwipeConvLabelItem> list = reSwipeConvLabels.labelList;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ReSwipeConvLabelItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ReSwipeConvLabels> JSON_ADAPTER = new ObjectJsonAdapter<ReSwipeConvLabels>() { // from class: com.p1.mobile.putong.core.data.ReSwipeConvLabels.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ReSwipeConvLabels.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ReSwipeConvLabels newInstance() {
            return new ReSwipeConvLabels();
        }

        public boolean parseField(ReSwipeConvLabels reSwipeConvLabels, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("labelList")) {
                return false;
            }
            reSwipeConvLabels.labelList = JsonAdapter.parseArray(jsonParser, ReSwipeConvLabelItem.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ReSwipeConvLabels reSwipeConvLabels, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("labelList")) {
                return true;
            }
            return super.parseFieldCheck(reSwipeConvLabels, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ReSwipeConvLabels reSwipeConvLabels, JsonGenerator jsonGenerator) throws IOException {
            if (reSwipeConvLabels.labelList != null) {
                jsonGenerator.writeFieldName("labelList");
                JsonAdapter.serializeArray(reSwipeConvLabels.labelList, jsonGenerator, ReSwipeConvLabelItem.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ReSwipeConvLabels) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ReSwipeConvLabels) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ReSwipeConvLabels new_() {
        ReSwipeConvLabels reSwipeConvLabels = new ReSwipeConvLabels();
        reSwipeConvLabels.nullCheck();
        return reSwipeConvLabels;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ReSwipeConvLabels mo225055clone() {
        ReSwipeConvLabels reSwipeConvLabels = new ReSwipeConvLabels();
        List<ReSwipeConvLabelItem> list = this.labelList;
        if (list != null) {
            reSwipeConvLabels.labelList = ValueObject.util_map(list, new qcj() { // from class: l.amc0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((ReSwipeConvLabelItem) obj).mo225055clone();
                }
            });
        }
        return reSwipeConvLabels;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReSwipeConvLabels) {
            return ValueObject.util_equals(this.labelList, ((ReSwipeConvLabels) obj).labelList);
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
        List<ReSwipeConvLabelItem> list = this.labelList;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.labelList == null) {
            this.labelList = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
