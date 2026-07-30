package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.OMSPositionInfo;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class OMSPositionInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omspositioninfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> contain;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> exclude;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39642id;
    public static ProtobufAdapter<OMSPositionInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSPositionInfo>() { // from class: com.p1.mobile.putong.data.OMSPositionInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSPositionInfo oMSPositionInfo) {
            String str = oMSPositionInfo.f39642id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            List<String> list = oMSPositionInfo.contain;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = oMSPositionInfo.exclude;
            if (list2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            oMSPositionInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSPositionInfo parse(nc5 nc5Var) throws IOException {
            OMSPositionInfo oMSPositionInfo = new OMSPositionInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (oMSPositionInfo.f39642id == null) {
                        oMSPositionInfo.f39642id = "";
                    }
                    if (oMSPositionInfo.contain == null) {
                        oMSPositionInfo.contain = new ArrayList();
                    }
                    if (oMSPositionInfo.exclude != null) {
                        break;
                    }
                    oMSPositionInfo.exclude = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    oMSPositionInfo.f39642id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    oMSPositionInfo.contain = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 26) {
                        if (oMSPositionInfo.f39642id == null) {
                            oMSPositionInfo.f39642id = "";
                        }
                        if (oMSPositionInfo.contain == null) {
                            oMSPositionInfo.contain = new ArrayList();
                        }
                        if (oMSPositionInfo.exclude != null) {
                            break;
                        }
                        oMSPositionInfo.exclude = new ArrayList();
                        return oMSPositionInfo;
                    }
                    oMSPositionInfo.exclude = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return oMSPositionInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSPositionInfo oMSPositionInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSPositionInfo.f39642id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            List<String> list = oMSPositionInfo.contain;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = oMSPositionInfo.exclude;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OMSPositionInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSPositionInfo>() { // from class: com.p1.mobile.putong.data.OMSPositionInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSPositionInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSPositionInfo newInstance() {
            return new OMSPositionInfo();
        }

        public boolean parseField(OMSPositionInfo oMSPositionInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "exclude":
                    oMSPositionInfo.exclude = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    oMSPositionInfo.f39642id = jsonParser.getValueAsString();
                    return false;
                case "contain":
                    oMSPositionInfo.contain = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSPositionInfo oMSPositionInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "exclude":
                    return true;
                case "id":
                    return false;
                case "contain":
                    return true;
                default:
                    return super.parseFieldCheck(oMSPositionInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSPositionInfo oMSPositionInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSPositionInfo.f39642id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (oMSPositionInfo.contain != null) {
                jsonGenerator.writeFieldName("contain");
                JsonAdapter.serializeArray(oMSPositionInfo.contain, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (oMSPositionInfo.exclude != null) {
                jsonGenerator.writeFieldName(SocialConstants.PARAM_EXCLUDE);
                JsonAdapter.serializeArray(oMSPositionInfo.exclude, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSPositionInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSPositionInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m61108a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m61109b(String str) {
        return str;
    }

    public static OMSPositionInfo new_() {
        OMSPositionInfo oMSPositionInfo = new OMSPositionInfo();
        oMSPositionInfo.nullCheck();
        return oMSPositionInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSPositionInfo mo225055clone() {
        OMSPositionInfo oMSPositionInfo = new OMSPositionInfo();
        oMSPositionInfo.f39642id = this.f39642id;
        List<String> list = this.contain;
        if (list != null) {
            oMSPositionInfo.contain = ValueObject.util_map(list, new qcj() { // from class: l.u750
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return OMSPositionInfo.m61108a((String) obj);
                }
            });
        }
        List<String> list2 = this.exclude;
        if (list2 != null) {
            oMSPositionInfo.exclude = ValueObject.util_map(list2, new qcj() { // from class: l.v750
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return OMSPositionInfo.m61109b((String) obj);
                }
            });
        }
        return oMSPositionInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSPositionInfo)) {
            return false;
        }
        OMSPositionInfo oMSPositionInfo = (OMSPositionInfo) obj;
        return ValueObject.util_equals(this.f39642id, oMSPositionInfo.f39642id) && ValueObject.util_equals(this.contain, oMSPositionInfo.contain) && ValueObject.util_equals(this.exclude, oMSPositionInfo.exclude);
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
        String str = this.f39642id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.contain;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.exclude;
        int iHashCode3 = iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39642id == null) {
            this.f39642id = "";
        }
        if (this.contain == null) {
            this.contain = new ArrayList();
        }
        if (this.exclude == null) {
            this.exclude = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
