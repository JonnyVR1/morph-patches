package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.OMSIds;
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
public class OMSIds extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsids";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> add;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> delete;
    public static ProtobufAdapter<OMSIds> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSIds>() { // from class: com.p1.mobile.putong.data.OMSIds.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSIds oMSIds) {
            List<String> list = oMSIds.add;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = oMSIds.delete;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) oMSIds).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSIds m18627parse(nb5 nb5Var) throws IOException {
            OMSIds oMSIds = new OMSIds();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (oMSIds.add == null) {
                        oMSIds.add = new ArrayList();
                    }
                    if (oMSIds.delete != null) {
                        break;
                    }
                    oMSIds.delete = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    oMSIds.add = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (oMSIds.add == null) {
                            oMSIds.add = new ArrayList();
                        }
                        if (oMSIds.delete != null) {
                            break;
                        }
                        oMSIds.delete = new ArrayList();
                        return oMSIds;
                    }
                    oMSIds.delete = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return oMSIds;
        }

        public void serialize(OMSIds oMSIds, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = oMSIds.add;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = oMSIds.delete;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OMSIds> JSON_ADAPTER = new ObjectJsonAdapter<OMSIds>() { // from class: com.p1.mobile.putong.data.OMSIds.2
        public Class getDataClass() {
            return OMSIds.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSIds mo17830newInstance() {
            return new OMSIds();
        }

        public boolean parseField(OMSIds oMSIds, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("delete")) {
                oMSIds.delete = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("add")) {
                return false;
            }
            oMSIds.add = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(OMSIds oMSIds, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("delete") || str.equals("add")) {
                return true;
            }
            return super.parseFieldCheck(oMSIds, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSIds oMSIds, JsonGenerator jsonGenerator) throws IOException {
            if (oMSIds.add != null) {
                jsonGenerator.writeFieldName("add");
                JsonAdapter.serializeArray(oMSIds.add, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (oMSIds.delete != null) {
                jsonGenerator.writeFieldName("delete");
                JsonAdapter.serializeArray(oMSIds.delete, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSIds) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSIds) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m831a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m832b(String str) {
        return str;
    }

    public static OMSIds new_() {
        OMSIds oMSIds = new OMSIds();
        oMSIds.nullCheck();
        return oMSIds;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSIds m18626clone() {
        OMSIds oMSIds = new OMSIds();
        List<String> list = this.add;
        if (list != null) {
            oMSIds.add = ValueObject.util_map(list, new w9j() { // from class: l.zy40
                public final Object call(Object obj) {
                    return OMSIds.m832b((String) obj);
                }
            });
        }
        List<String> list2 = this.delete;
        if (list2 != null) {
            oMSIds.delete = ValueObject.util_map(list2, new w9j() { // from class: l.az40
                public final Object call(Object obj) {
                    return OMSIds.m831a((String) obj);
                }
            });
        }
        return oMSIds;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSIds)) {
            return false;
        }
        OMSIds oMSIds = (OMSIds) obj;
        return ValueObject.util_equals(this.add, oMSIds.add) && ValueObject.util_equals(this.delete, oMSIds.delete);
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
        List<String> list = this.add;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.delete;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.add == null) {
            this.add = new ArrayList();
        }
        if (this.delete == null) {
            this.delete = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
