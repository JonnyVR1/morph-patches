package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.OMSResource;
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

/* JADX INFO: loaded from: classes12.dex */
public class OMSDocument extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsdocument";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39634id;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<OMSResource> pages;

    @NonNull
    @ProtobufIndex(index = 2)
    public String templateID;
    public static ProtobufAdapter<OMSDocument> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSDocument>() { // from class: com.p1.mobile.putong.data.OMSDocument.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSDocument oMSDocument) {
            String str = oMSDocument.f39634id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = oMSDocument.templateID;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            List<OMSResource> list = oMSDocument.pages;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, list, OMSResource.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            oMSDocument.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSDocument parse(nc5 nc5Var) throws IOException {
            OMSDocument oMSDocument = new OMSDocument();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (oMSDocument.f39634id == null) {
                        oMSDocument.f39634id = "";
                    }
                    if (oMSDocument.templateID == null) {
                        oMSDocument.templateID = "";
                    }
                    if (oMSDocument.pages != null) {
                        break;
                    }
                    oMSDocument.pages = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    oMSDocument.f39634id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    oMSDocument.templateID = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (oMSDocument.f39634id == null) {
                            oMSDocument.f39634id = "";
                        }
                        if (oMSDocument.templateID == null) {
                            oMSDocument.templateID = "";
                        }
                        if (oMSDocument.pages != null) {
                            break;
                        }
                        oMSDocument.pages = new ArrayList();
                        return oMSDocument;
                    }
                    oMSDocument.pages = (List) nc5Var.m162488l(OMSResource.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return oMSDocument;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSDocument oMSDocument, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSDocument.f39634id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = oMSDocument.templateID;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            List<OMSResource> list = oMSDocument.pages;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, OMSResource.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OMSDocument> JSON_ADAPTER = new ObjectJsonAdapter<OMSDocument>() { // from class: com.p1.mobile.putong.data.OMSDocument.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSDocument.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSDocument newInstance() {
            return new OMSDocument();
        }

        public boolean parseField(OMSDocument oMSDocument, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    oMSDocument.f39634id = jsonParser.getValueAsString();
                    return false;
                case "pages":
                    oMSDocument.pages = JsonAdapter.parseArray(jsonParser, OMSResource.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "templateID":
                    oMSDocument.templateID = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSDocument oMSDocument, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "pages":
                case "templateID":
                    return true;
                default:
                    return super.parseFieldCheck(oMSDocument, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSDocument oMSDocument, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSDocument.f39634id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = oMSDocument.templateID;
            if (str2 != null) {
                jsonGenerator.writeStringField("templateID", str2);
            }
            if (oMSDocument.pages != null) {
                jsonGenerator.writeFieldName("pages");
                JsonAdapter.serializeArray(oMSDocument.pages, jsonGenerator, OMSResource.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSDocument) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSDocument) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSDocument new_() {
        OMSDocument oMSDocument = new OMSDocument();
        oMSDocument.nullCheck();
        return oMSDocument;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSDocument mo225055clone() {
        OMSDocument oMSDocument = new OMSDocument();
        oMSDocument.f39634id = this.f39634id;
        oMSDocument.templateID = this.templateID;
        List<OMSResource> list = this.pages;
        if (list != null) {
            oMSDocument.pages = ValueObject.util_map(list, new qcj() { // from class: l.n750
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((OMSResource) obj).mo225055clone();
                }
            });
        }
        return oMSDocument;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSDocument)) {
            return false;
        }
        OMSDocument oMSDocument = (OMSDocument) obj;
        return ValueObject.util_equals(this.f39634id, oMSDocument.f39634id) && ValueObject.util_equals(this.templateID, oMSDocument.templateID) && ValueObject.util_equals(this.pages, oMSDocument.pages);
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
        String str = this.f39634id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.templateID;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<OMSResource> list = this.pages;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39634id == null) {
            this.f39634id = "";
        }
        if (this.templateID == null) {
            this.templateID = "";
        }
        if (this.pages == null) {
            this.pages = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
