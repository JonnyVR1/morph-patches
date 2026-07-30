package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.OMSPositionInfo;
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
    public String f255id;
    public static ProtobufAdapter<OMSPositionInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSPositionInfo>() { // from class: com.p1.mobile.putong.data.OMSPositionInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSPositionInfo oMSPositionInfo) {
            String str = oMSPositionInfo.f255id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<String> list = oMSPositionInfo.contain;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = oMSPositionInfo.exclude;
            if (list2 != null) {
                iO += CodedOutputByteBufferNano.l(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) oMSPositionInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSPositionInfo m18645parse(nb5 nb5Var) throws IOException {
            OMSPositionInfo oMSPositionInfo = new OMSPositionInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (oMSPositionInfo.f255id == null) {
                        oMSPositionInfo.f255id = "";
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
                if (iU == 10) {
                    oMSPositionInfo.f255id = nb5Var.s();
                } else if (iU == 18) {
                    oMSPositionInfo.contain = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 26) {
                        if (oMSPositionInfo.f255id == null) {
                            oMSPositionInfo.f255id = "";
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
                    oMSPositionInfo.exclude = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return oMSPositionInfo;
        }

        public void serialize(OMSPositionInfo oMSPositionInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSPositionInfo.f255id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<String> list = oMSPositionInfo.contain;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = oMSPositionInfo.exclude;
            if (list2 != null) {
                codedOutputByteBufferNano.K(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OMSPositionInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSPositionInfo>() { // from class: com.p1.mobile.putong.data.OMSPositionInfo.2
        public Class getDataClass() {
            return OMSPositionInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSPositionInfo mo17830newInstance() {
            return new OMSPositionInfo();
        }

        public boolean parseField(OMSPositionInfo oMSPositionInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "exclude":
                    oMSPositionInfo.exclude = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    oMSPositionInfo.f255id = jsonParser.getValueAsString();
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSPositionInfo oMSPositionInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSPositionInfo.f255id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (oMSPositionInfo.contain != null) {
                jsonGenerator.writeFieldName("contain");
                JsonAdapter.serializeArray(oMSPositionInfo.contain, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (oMSPositionInfo.exclude != null) {
                jsonGenerator.writeFieldName("exclude");
                JsonAdapter.serializeArray(oMSPositionInfo.exclude, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSPositionInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSPositionInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m842a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m843b(String str) {
        return str;
    }

    public static OMSPositionInfo new_() {
        OMSPositionInfo oMSPositionInfo = new OMSPositionInfo();
        oMSPositionInfo.nullCheck();
        return oMSPositionInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSPositionInfo m18644clone() {
        OMSPositionInfo oMSPositionInfo = new OMSPositionInfo();
        oMSPositionInfo.f255id = this.f255id;
        List<String> list = this.contain;
        if (list != null) {
            oMSPositionInfo.contain = ValueObject.util_map(list, new w9j() { // from class: l.fz40
                public final Object call(Object obj) {
                    return OMSPositionInfo.m842a((String) obj);
                }
            });
        }
        List<String> list2 = this.exclude;
        if (list2 != null) {
            oMSPositionInfo.exclude = ValueObject.util_map(list2, new w9j() { // from class: l.gz40
                public final Object call(Object obj) {
                    return OMSPositionInfo.m843b((String) obj);
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
        return ValueObject.util_equals(this.f255id, oMSPositionInfo.f255id) && ValueObject.util_equals(this.contain, oMSPositionInfo.contain) && ValueObject.util_equals(this.exclude, oMSPositionInfo.exclude);
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
        String str = this.f255id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.contain;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.exclude;
        int iHashCode3 = iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f255id == null) {
            this.f255id = "";
        }
        if (this.contain == null) {
            this.contain = new ArrayList();
        }
        if (this.exclude == null) {
            this.exclude = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
