package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.OMSIds;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSIds oMSIds) {
            List<String> list = oMSIds.add;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = oMSIds.delete;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            oMSIds.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSIds parse(nb5 nb5Var) throws IOException {
            OMSIds oMSIds = new OMSIds();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (oMSIds.add == null) {
                        oMSIds.add = new ArrayList();
                    }
                    if (oMSIds.delete != null) {
                        break;
                    }
                    oMSIds.delete = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    oMSIds.add = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        if (oMSIds.add == null) {
                            oMSIds.add = new ArrayList();
                        }
                        if (oMSIds.delete != null) {
                            break;
                        }
                        oMSIds.delete = new ArrayList();
                        return oMSIds;
                    }
                    oMSIds.delete = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return oMSIds;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSIds oMSIds, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = oMSIds.add;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = oMSIds.delete;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OMSIds> JSON_ADAPTER = new ObjectJsonAdapter<OMSIds>() { // from class: com.p1.mobile.putong.data.OMSIds.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSIds.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSIds newInstance() {
            return new OMSIds();
        }

        public boolean parseField(OMSIds oMSIds, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(RequestParameters.SUBRESOURCE_DELETE)) {
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
            if (str.equals(RequestParameters.SUBRESOURCE_DELETE) || str.equals("add")) {
                return true;
            }
            return super.parseFieldCheck(oMSIds, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSIds oMSIds, JsonGenerator jsonGenerator) throws IOException {
            if (oMSIds.add != null) {
                jsonGenerator.writeFieldName("add");
                JsonAdapter.serializeArray(oMSIds.add, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (oMSIds.delete != null) {
                jsonGenerator.writeFieldName(RequestParameters.SUBRESOURCE_DELETE);
                JsonAdapter.serializeArray(oMSIds.delete, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSIds) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSIds) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m59913a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m59914b(String str) {
        return str;
    }

    public static OMSIds new_() {
        OMSIds oMSIds = new OMSIds();
        oMSIds.nullCheck();
        return oMSIds;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSIds mo223809clone() {
        OMSIds oMSIds = new OMSIds();
        List<String> list = this.add;
        if (list != null) {
            oMSIds.add = ValueObject.util_map(list, new w9j() { // from class: l.zy40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return OMSIds.m59914b((String) obj);
                }
            });
        }
        List<String> list2 = this.delete;
        if (list2 != null) {
            oMSIds.delete = ValueObject.util_map(list2, new w9j() { // from class: l.az40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return OMSIds.m59913a((String) obj);
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
        List<String> list = this.add;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.delete;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.add == null) {
            this.add = new ArrayList();
        }
        if (this.delete == null) {
            this.delete = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
