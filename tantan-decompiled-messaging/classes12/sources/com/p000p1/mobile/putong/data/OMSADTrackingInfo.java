package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.OMSADTrackingInfo;
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSADTrackingInfo oMSADTrackingInfo) {
            List<String> list = oMSADTrackingInfo.viewURLs;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = oMSADTrackingInfo.clickURLs;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) oMSADTrackingInfo).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSADTrackingInfo m18564parse(nb5 nb5Var) throws IOException {
            OMSADTrackingInfo oMSADTrackingInfo = new OMSADTrackingInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (oMSADTrackingInfo.viewURLs == null) {
                        oMSADTrackingInfo.viewURLs = new ArrayList();
                    }
                    if (oMSADTrackingInfo.clickURLs != null) {
                        break;
                    }
                    oMSADTrackingInfo.clickURLs = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    oMSADTrackingInfo.viewURLs = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (oMSADTrackingInfo.viewURLs == null) {
                            oMSADTrackingInfo.viewURLs = new ArrayList();
                        }
                        if (oMSADTrackingInfo.clickURLs != null) {
                            break;
                        }
                        oMSADTrackingInfo.clickURLs = new ArrayList();
                        return oMSADTrackingInfo;
                    }
                    oMSADTrackingInfo.clickURLs = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return oMSADTrackingInfo;
        }

        public void serialize(OMSADTrackingInfo oMSADTrackingInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = oMSADTrackingInfo.viewURLs;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = oMSADTrackingInfo.clickURLs;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OMSADTrackingInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSADTrackingInfo>() { // from class: com.p1.mobile.putong.data.OMSADTrackingInfo.2
        public Class getDataClass() {
            return OMSADTrackingInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSADTrackingInfo mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSADTrackingInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSADTrackingInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m797a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m798b(String str) {
        return str;
    }

    public static OMSADTrackingInfo new_() {
        OMSADTrackingInfo oMSADTrackingInfo = new OMSADTrackingInfo();
        oMSADTrackingInfo.nullCheck();
        return oMSADTrackingInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSADTrackingInfo m18563clone() {
        OMSADTrackingInfo oMSADTrackingInfo = new OMSADTrackingInfo();
        List<String> list = this.viewURLs;
        if (list != null) {
            oMSADTrackingInfo.viewURLs = ValueObject.util_map(list, new w9j() { // from class: l.vx40
                public final Object call(Object obj) {
                    return OMSADTrackingInfo.m798b((String) obj);
                }
            });
        }
        List<String> list2 = this.clickURLs;
        if (list2 != null) {
            oMSADTrackingInfo.clickURLs = ValueObject.util_map(list2, new w9j() { // from class: l.wx40
                public final Object call(Object obj) {
                    return OMSADTrackingInfo.m797a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<String> list = this.viewURLs;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.clickURLs;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.viewURLs == null) {
            this.viewURLs = new ArrayList();
        }
        if (this.clickURLs == null) {
            this.clickURLs = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
