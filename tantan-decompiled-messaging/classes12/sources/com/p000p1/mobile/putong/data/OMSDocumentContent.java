package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class OMSDocumentContent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsdocumentcontent";

    @NonNull
    @ProtobufIndex(index = 1)
    public OMSDocument template;
    public static ProtobufAdapter<OMSDocumentContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSDocumentContent>() { // from class: com.p1.mobile.putong.data.OMSDocumentContent.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSDocumentContent oMSDocumentContent) {
            OMSDocument oMSDocument = oMSDocumentContent.template;
            int iL = oMSDocument != null ? CodedOutputByteBufferNano.l(1, oMSDocument, OMSDocument.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) oMSDocumentContent).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSDocumentContent m18615parse(nb5 nb5Var) throws IOException {
            OMSDocumentContent oMSDocumentContent = new OMSDocumentContent();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (oMSDocumentContent.template != null) {
                        break;
                    }
                    oMSDocumentContent.template = OMSDocument.new_();
                    break;
                }
                if (iU != 10) {
                    if (oMSDocumentContent.template != null) {
                        break;
                    }
                    oMSDocumentContent.template = OMSDocument.new_();
                    return oMSDocumentContent;
                }
                oMSDocumentContent.template = (OMSDocument) nb5Var.l(OMSDocument.PROTOBUF_ADAPTER);
            }
            return oMSDocumentContent;
        }

        public void serialize(OMSDocumentContent oMSDocumentContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            OMSDocument oMSDocument = oMSDocumentContent.template;
            if (oMSDocument != null) {
                codedOutputByteBufferNano.K(1, oMSDocument, OMSDocument.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSDocumentContent> JSON_ADAPTER = new ObjectJsonAdapter<OMSDocumentContent>() { // from class: com.p1.mobile.putong.data.OMSDocumentContent.2
        public Class getDataClass() {
            return OMSDocumentContent.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSDocumentContent mo17830newInstance() {
            return new OMSDocumentContent();
        }

        public boolean parseField(OMSDocumentContent oMSDocumentContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("template")) {
                return false;
            }
            oMSDocumentContent.template = (OMSDocument) OMSDocument.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(OMSDocumentContent oMSDocumentContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("template")) {
                return true;
            }
            return super.parseFieldCheck(oMSDocumentContent, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSDocumentContent oMSDocumentContent, JsonGenerator jsonGenerator) throws IOException {
            if (oMSDocumentContent.template != null) {
                jsonGenerator.writeFieldName("template");
                OMSDocument.JSON_ADAPTER.serialize(oMSDocumentContent.template, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSDocumentContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSDocumentContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSDocumentContent new_() {
        OMSDocumentContent oMSDocumentContent = new OMSDocumentContent();
        oMSDocumentContent.nullCheck();
        return oMSDocumentContent;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSDocumentContent m18614clone() {
        OMSDocumentContent oMSDocumentContent = new OMSDocumentContent();
        OMSDocument oMSDocument = this.template;
        if (oMSDocument != null) {
            oMSDocumentContent.template = oMSDocument.m18611clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        OMSDocument oMSDocument = this.template;
        int iHashCode = i2 + (oMSDocument != null ? oMSDocument.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.template == null) {
            this.template = OMSDocument.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
