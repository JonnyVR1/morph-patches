package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.OMSResourceInfo;
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
public class OMSResource extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsresource";

    @ProtobufIndex(index = 1)
    public int index;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<OMSResourceInfo> nodes;
    public static ProtobufAdapter<OMSResource> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSResource>() { // from class: com.p1.mobile.putong.data.OMSResource.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSResource oMSResource) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, oMSResource.index);
            List<OMSResourceInfo> list = oMSResource.nodes;
            if (list != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(2, list, OMSResourceInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            oMSResource.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSResource parse(nb5 nb5Var) throws IOException {
            OMSResource oMSResource = new OMSResource();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (oMSResource.nodes != null) {
                        break;
                    }
                    oMSResource.nodes = new ArrayList();
                    break;
                }
                if (iM158752u == 8) {
                    oMSResource.index = nb5Var.m158741j();
                } else {
                    if (iM158752u != 18) {
                        if (oMSResource.nodes != null) {
                            break;
                        }
                        oMSResource.nodes = new ArrayList();
                        return oMSResource;
                    }
                    oMSResource.nodes = (List) nb5Var.m158743l(OMSResourceInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return oMSResource;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSResource oMSResource, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, oMSResource.index);
            List<OMSResourceInfo> list = oMSResource.nodes;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, OMSResourceInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OMSResource> JSON_ADAPTER = new ObjectJsonAdapter<OMSResource>() { // from class: com.p1.mobile.putong.data.OMSResource.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSResource.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSResource newInstance() {
            return new OMSResource();
        }

        public boolean parseField(OMSResource oMSResource, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(FirebaseAnalytics.Param.INDEX)) {
                oMSResource.index = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("nodes")) {
                return false;
            }
            oMSResource.nodes = JsonAdapter.parseArray(jsonParser, OMSResourceInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(OMSResource oMSResource, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(FirebaseAnalytics.Param.INDEX) || str.equals("nodes")) {
                return true;
            }
            return super.parseFieldCheck(oMSResource, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSResource oMSResource, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.INDEX, oMSResource.index);
            if (oMSResource.nodes != null) {
                jsonGenerator.writeFieldName("nodes");
                JsonAdapter.serializeArray(oMSResource.nodes, jsonGenerator, OMSResourceInfo.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSResource) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSResource) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSResource new_() {
        OMSResource oMSResource = new OMSResource();
        oMSResource.nullCheck();
        return oMSResource;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSResource mo223809clone() {
        OMSResource oMSResource = new OMSResource();
        oMSResource.index = this.index;
        List<OMSResourceInfo> list = this.nodes;
        if (list != null) {
            oMSResource.nodes = ValueObject.util_map(list, new w9j() { // from class: l.hz40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((OMSResourceInfo) obj).mo223809clone();
                }
            });
        }
        return oMSResource;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSResource)) {
            return false;
        }
        OMSResource oMSResource = (OMSResource) obj;
        return this.index == oMSResource.index && ValueObject.util_equals(this.nodes, oMSResource.nodes);
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
        int i2 = ((i * 41) + this.index) * 41;
        List<OMSResourceInfo> list = this.nodes;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.nodes == null) {
            this.nodes = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
