package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.OMSADTrackingInfo;
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
public class OMSADTrackingInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsadtrackinginfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> clickURLs;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> viewURLs;
    public static ProtobufAdapter<OMSADTrackingInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSADTrackingInfo>() { // from class: com.p1.mobile.putong.data.OMSADTrackingInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSADTrackingInfo oMSADTrackingInfo) {
            List<String> list = oMSADTrackingInfo.viewURLs;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = oMSADTrackingInfo.clickURLs;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            oMSADTrackingInfo.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSADTrackingInfo parse(nb5 nb5Var) throws IOException {
            OMSADTrackingInfo oMSADTrackingInfo = new OMSADTrackingInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (oMSADTrackingInfo.viewURLs == null) {
                        oMSADTrackingInfo.viewURLs = new ArrayList();
                    }
                    if (oMSADTrackingInfo.clickURLs != null) {
                        break;
                    }
                    oMSADTrackingInfo.clickURLs = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    oMSADTrackingInfo.viewURLs = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        if (oMSADTrackingInfo.viewURLs == null) {
                            oMSADTrackingInfo.viewURLs = new ArrayList();
                        }
                        if (oMSADTrackingInfo.clickURLs != null) {
                            break;
                        }
                        oMSADTrackingInfo.clickURLs = new ArrayList();
                        return oMSADTrackingInfo;
                    }
                    oMSADTrackingInfo.clickURLs = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return oMSADTrackingInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSADTrackingInfo oMSADTrackingInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = oMSADTrackingInfo.viewURLs;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = oMSADTrackingInfo.clickURLs;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OMSADTrackingInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSADTrackingInfo>() { // from class: com.p1.mobile.putong.data.OMSADTrackingInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSADTrackingInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSADTrackingInfo newInstance() {
            return new OMSADTrackingInfo();
        }

        public boolean parseField(OMSADTrackingInfo oMSADTrackingInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("clickURLs")) {
                oMSADTrackingInfo.clickURLs = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("viewURLs")) {
                return false;
            }
            oMSADTrackingInfo.viewURLs = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(OMSADTrackingInfo oMSADTrackingInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("clickURLs") || str.equals("viewURLs")) {
                return true;
            }
            return super.parseFieldCheck(oMSADTrackingInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSADTrackingInfo oMSADTrackingInfo, JsonGenerator jsonGenerator) throws IOException {
            if (oMSADTrackingInfo.viewURLs != null) {
                jsonGenerator.writeFieldName("viewURLs");
                JsonAdapter.serializeArray(oMSADTrackingInfo.viewURLs, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (oMSADTrackingInfo.clickURLs != null) {
                jsonGenerator.writeFieldName("clickURLs");
                JsonAdapter.serializeArray(oMSADTrackingInfo.clickURLs, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSADTrackingInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSADTrackingInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m59879a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m59880b(String str) {
        return str;
    }

    public static OMSADTrackingInfo new_() {
        OMSADTrackingInfo oMSADTrackingInfo = new OMSADTrackingInfo();
        oMSADTrackingInfo.nullCheck();
        return oMSADTrackingInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSADTrackingInfo mo223809clone() {
        OMSADTrackingInfo oMSADTrackingInfo = new OMSADTrackingInfo();
        List<String> list = this.viewURLs;
        if (list != null) {
            oMSADTrackingInfo.viewURLs = ValueObject.util_map(list, new w9j() { // from class: l.vx40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return OMSADTrackingInfo.m59880b((String) obj);
                }
            });
        }
        List<String> list2 = this.clickURLs;
        if (list2 != null) {
            oMSADTrackingInfo.clickURLs = ValueObject.util_map(list2, new w9j() { // from class: l.wx40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return OMSADTrackingInfo.m59879a((String) obj);
                }
            });
        }
        return oMSADTrackingInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSADTrackingInfo)) {
            return false;
        }
        OMSADTrackingInfo oMSADTrackingInfo = (OMSADTrackingInfo) obj;
        return ValueObject.util_equals(this.viewURLs, oMSADTrackingInfo.viewURLs) && ValueObject.util_equals(this.clickURLs, oMSADTrackingInfo.clickURLs);
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
        List<String> list = this.viewURLs;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.clickURLs;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.viewURLs == null) {
            this.viewURLs = new ArrayList();
        }
        if (this.clickURLs == null) {
            this.clickURLs = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
