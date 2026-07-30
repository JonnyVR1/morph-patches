package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.OMSResourceInfo;
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
public class OMSResource extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsresource";

    @ProtobufIndex(index = 1)
    public int index;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<OMSResourceInfo> nodes;
    public static ProtobufAdapter<OMSResource> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSResource>() { // from class: com.p1.mobile.putong.data.OMSResource.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSResource oMSResource) {
            int iH = CodedOutputByteBufferNano.h(1, oMSResource.index);
            List<OMSResourceInfo> list = oMSResource.nodes;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(2, list, OMSResourceInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) oMSResource).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSResource m18651parse(nb5 nb5Var) throws IOException {
            OMSResource oMSResource = new OMSResource();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (oMSResource.nodes != null) {
                        break;
                    }
                    oMSResource.nodes = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    oMSResource.index = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (oMSResource.nodes != null) {
                            break;
                        }
                        oMSResource.nodes = new ArrayList();
                        return oMSResource;
                    }
                    oMSResource.nodes = (List) nb5Var.l(OMSResourceInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return oMSResource;
        }

        public void serialize(OMSResource oMSResource, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, oMSResource.index);
            List<OMSResourceInfo> list = oMSResource.nodes;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, OMSResourceInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OMSResource> JSON_ADAPTER = new ObjectJsonAdapter<OMSResource>() { // from class: com.p1.mobile.putong.data.OMSResource.2
        public Class getDataClass() {
            return OMSResource.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSResource mo17830newInstance() {
            return new OMSResource();
        }

        public boolean parseField(OMSResource oMSResource, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("index")) {
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
            if (str.equals("index") || str.equals("nodes")) {
                return true;
            }
            return super.parseFieldCheck(oMSResource, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSResource oMSResource, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("index", oMSResource.index);
            if (oMSResource.nodes != null) {
                jsonGenerator.writeFieldName("nodes");
                JsonAdapter.serializeArray(oMSResource.nodes, jsonGenerator, OMSResourceInfo.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSResource) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSResource) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSResource new_() {
        OMSResource oMSResource = new OMSResource();
        oMSResource.nullCheck();
        return oMSResource;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSResource m18650clone() {
        OMSResource oMSResource = new OMSResource();
        oMSResource.index = this.index;
        List<OMSResourceInfo> list = this.nodes;
        if (list != null) {
            oMSResource.nodes = ValueObject.util_map(list, new w9j() { // from class: l.hz40
                public final Object call(Object obj) {
                    return ((OMSResourceInfo) obj).m18656clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.index) * 41;
        List<OMSResourceInfo> list = this.nodes;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.nodes == null) {
            this.nodes = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
