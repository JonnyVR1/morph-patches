package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class OMSDocumentContent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsdocumentcontent";

    @NonNull
    @ProtobufIndex(index = 1)
    public OMSDocument template;
    public static ProtobufAdapter<OMSDocumentContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSDocumentContent>() { // from class: com.p1.mobile.putong.data.OMSDocumentContent.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSDocumentContent oMSDocumentContent) {
            OMSDocument oMSDocument = oMSDocumentContent.template;
            int iM17230l = oMSDocument != null ? CodedOutputByteBufferNano.m17230l(1, oMSDocument, OMSDocument.PROTOBUF_ADAPTER) : 0;
            oMSDocumentContent.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSDocumentContent parse(nb5 nb5Var) throws IOException {
            OMSDocumentContent oMSDocumentContent = new OMSDocumentContent();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (oMSDocumentContent.template != null) {
                        break;
                    }
                    oMSDocumentContent.template = OMSDocument.new_();
                    break;
                }
                if (iM158752u != 10) {
                    if (oMSDocumentContent.template != null) {
                        break;
                    }
                    oMSDocumentContent.template = OMSDocument.new_();
                    return oMSDocumentContent;
                }
                oMSDocumentContent.template = (OMSDocument) nb5Var.m158743l(OMSDocument.PROTOBUF_ADAPTER);
            }
            return oMSDocumentContent;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSDocumentContent oMSDocumentContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            OMSDocument oMSDocument = oMSDocumentContent.template;
            if (oMSDocument != null) {
                codedOutputByteBufferNano.m17254K(1, oMSDocument, OMSDocument.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSDocumentContent> JSON_ADAPTER = new ObjectJsonAdapter<OMSDocumentContent>() { // from class: com.p1.mobile.putong.data.OMSDocumentContent.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSDocumentContent.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSDocumentContent newInstance() {
            return new OMSDocumentContent();
        }

        public boolean parseField(OMSDocumentContent oMSDocumentContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("template")) {
                return false;
            }
            oMSDocumentContent.template = OMSDocument.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(OMSDocumentContent oMSDocumentContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("template")) {
                return true;
            }
            return super.parseFieldCheck(oMSDocumentContent, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSDocumentContent oMSDocumentContent, JsonGenerator jsonGenerator) throws IOException {
            if (oMSDocumentContent.template != null) {
                jsonGenerator.writeFieldName("template");
                OMSDocument.JSON_ADAPTER.serialize(oMSDocumentContent.template, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSDocumentContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSDocumentContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSDocumentContent new_() {
        OMSDocumentContent oMSDocumentContent = new OMSDocumentContent();
        oMSDocumentContent.nullCheck();
        return oMSDocumentContent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSDocumentContent mo223809clone() {
        OMSDocumentContent oMSDocumentContent = new OMSDocumentContent();
        OMSDocument oMSDocument = this.template;
        if (oMSDocument != null) {
            oMSDocumentContent.template = oMSDocument.mo223809clone();
        }
        return oMSDocumentContent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OMSDocumentContent) {
            return ValueObject.util_equals(this.template, ((OMSDocumentContent) obj).template);
        }
        return false;
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
        OMSDocument oMSDocument = this.template;
        int iHashCode = i2 + (oMSDocument != null ? oMSDocument.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.template == null) {
            this.template = OMSDocument.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
