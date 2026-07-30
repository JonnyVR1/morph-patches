package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.OMSResource;
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
public class OMSDocument extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsdocument";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f247id;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<OMSResource> pages;

    @NonNull
    @ProtobufIndex(index = 2)
    public String templateID;
    public static ProtobufAdapter<OMSDocument> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSDocument>() { // from class: com.p1.mobile.putong.data.OMSDocument.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSDocument oMSDocument) {
            String str = oMSDocument.f247id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = oMSDocument.templateID;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            List<OMSResource> list = oMSDocument.pages;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(3, list, OMSResource.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) oMSDocument).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSDocument m18612parse(nb5 nb5Var) throws IOException {
            OMSDocument oMSDocument = new OMSDocument();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (oMSDocument.f247id == null) {
                        oMSDocument.f247id = "";
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
                if (iU == 10) {
                    oMSDocument.f247id = nb5Var.s();
                } else if (iU == 18) {
                    oMSDocument.templateID = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (oMSDocument.f247id == null) {
                            oMSDocument.f247id = "";
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
                    oMSDocument.pages = (List) nb5Var.l(OMSResource.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return oMSDocument;
        }

        public void serialize(OMSDocument oMSDocument, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSDocument.f247id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = oMSDocument.templateID;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            List<OMSResource> list = oMSDocument.pages;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, OMSResource.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OMSDocument> JSON_ADAPTER = new ObjectJsonAdapter<OMSDocument>() { // from class: com.p1.mobile.putong.data.OMSDocument.2
        public Class getDataClass() {
            return OMSDocument.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSDocument mo17830newInstance() {
            return new OMSDocument();
        }

        public boolean parseField(OMSDocument oMSDocument, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    oMSDocument.f247id = jsonParser.getValueAsString();
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSDocument oMSDocument, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSDocument.f247id;
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSDocument) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSDocument) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSDocument new_() {
        OMSDocument oMSDocument = new OMSDocument();
        oMSDocument.nullCheck();
        return oMSDocument;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSDocument m18611clone() {
        OMSDocument oMSDocument = new OMSDocument();
        oMSDocument.f247id = this.f247id;
        oMSDocument.templateID = this.templateID;
        List<OMSResource> list = this.pages;
        if (list != null) {
            oMSDocument.pages = ValueObject.util_map(list, new w9j() { // from class: l.yy40
                public final Object call(Object obj) {
                    return ((OMSResource) obj).m18650clone();
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
        return ValueObject.util_equals(this.f247id, oMSDocument.f247id) && ValueObject.util_equals(this.templateID, oMSDocument.templateID) && ValueObject.util_equals(this.pages, oMSDocument.pages);
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
        String str = this.f247id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.templateID;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<OMSResource> list = this.pages;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f247id == null) {
            this.f247id = "";
        }
        if (this.templateID == null) {
            this.templateID = "";
        }
        if (this.pages == null) {
            this.pages = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
