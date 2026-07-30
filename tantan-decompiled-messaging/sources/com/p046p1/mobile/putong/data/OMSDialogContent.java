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
public class OMSDialogContent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsdialogcontent";

    @NonNull
    @ProtobufIndex(index = 2)
    public OMSDialog morph;

    @NonNull
    @ProtobufIndex(index = 1)
    public OMSWebDialogResource web;
    public static ProtobufAdapter<OMSDialogContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSDialogContent>() { // from class: com.p1.mobile.putong.data.OMSDialogContent.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSDialogContent oMSDialogContent) {
            OMSWebDialogResource oMSWebDialogResource = oMSDialogContent.web;
            int iM17230l = oMSWebDialogResource != null ? CodedOutputByteBufferNano.m17230l(1, oMSWebDialogResource, OMSWebDialogResource.PROTOBUF_ADAPTER) : 0;
            OMSDialog oMSDialog = oMSDialogContent.morph;
            if (oMSDialog != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, oMSDialog, OMSDialog.PROTOBUF_ADAPTER);
            }
            oMSDialogContent.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSDialogContent parse(nb5 nb5Var) throws IOException {
            OMSDialogContent oMSDialogContent = new OMSDialogContent();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (oMSDialogContent.web == null) {
                        oMSDialogContent.web = OMSWebDialogResource.new_();
                    }
                    if (oMSDialogContent.morph != null) {
                        break;
                    }
                    oMSDialogContent.morph = OMSDialog.new_();
                    break;
                }
                if (iM158752u == 10) {
                    oMSDialogContent.web = (OMSWebDialogResource) nb5Var.m158743l(OMSWebDialogResource.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (oMSDialogContent.web == null) {
                            oMSDialogContent.web = OMSWebDialogResource.new_();
                        }
                        if (oMSDialogContent.morph != null) {
                            break;
                        }
                        oMSDialogContent.morph = OMSDialog.new_();
                        return oMSDialogContent;
                    }
                    oMSDialogContent.morph = (OMSDialog) nb5Var.m158743l(OMSDialog.PROTOBUF_ADAPTER);
                }
            }
            return oMSDialogContent;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSDialogContent oMSDialogContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            OMSWebDialogResource oMSWebDialogResource = oMSDialogContent.web;
            if (oMSWebDialogResource != null) {
                codedOutputByteBufferNano.m17254K(1, oMSWebDialogResource, OMSWebDialogResource.PROTOBUF_ADAPTER);
            }
            OMSDialog oMSDialog = oMSDialogContent.morph;
            if (oMSDialog != null) {
                codedOutputByteBufferNano.m17254K(2, oMSDialog, OMSDialog.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSDialogContent> JSON_ADAPTER = new ObjectJsonAdapter<OMSDialogContent>() { // from class: com.p1.mobile.putong.data.OMSDialogContent.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSDialogContent.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSDialogContent newInstance() {
            return new OMSDialogContent();
        }

        public boolean parseField(OMSDialogContent oMSDialogContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(SchemeKey.web)) {
                oMSDialogContent.web = OMSWebDialogResource.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(OMSDialogType.morph)) {
                return false;
            }
            oMSDialogContent.morph = OMSDialog.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(OMSDialogContent oMSDialogContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(SchemeKey.web) || str.equals(OMSDialogType.morph)) {
                return true;
            }
            return super.parseFieldCheck(oMSDialogContent, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSDialogContent oMSDialogContent, JsonGenerator jsonGenerator) throws IOException {
            if (oMSDialogContent.web != null) {
                jsonGenerator.writeFieldName(SchemeKey.web);
                OMSWebDialogResource.JSON_ADAPTER.serialize(oMSDialogContent.web, jsonGenerator, true);
            }
            if (oMSDialogContent.morph != null) {
                jsonGenerator.writeFieldName(OMSDialogType.morph);
                OMSDialog.JSON_ADAPTER.serialize(oMSDialogContent.morph, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSDialogContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSDialogContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSDialogContent new_() {
        OMSDialogContent oMSDialogContent = new OMSDialogContent();
        oMSDialogContent.nullCheck();
        return oMSDialogContent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSDialogContent mo223809clone() {
        OMSDialogContent oMSDialogContent = new OMSDialogContent();
        OMSWebDialogResource oMSWebDialogResource = this.web;
        if (oMSWebDialogResource != null) {
            oMSDialogContent.web = oMSWebDialogResource.mo223809clone();
        }
        OMSDialog oMSDialog = this.morph;
        if (oMSDialog != null) {
            oMSDialogContent.morph = oMSDialog.mo223809clone();
        }
        return oMSDialogContent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSDialogContent)) {
            return false;
        }
        OMSDialogContent oMSDialogContent = (OMSDialogContent) obj;
        return ValueObject.util_equals(this.web, oMSDialogContent.web) && ValueObject.util_equals(this.morph, oMSDialogContent.morph);
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
        OMSWebDialogResource oMSWebDialogResource = this.web;
        int iHashCode = (i2 + (oMSWebDialogResource != null ? oMSWebDialogResource.hashCode() : 0)) * 41;
        OMSDialog oMSDialog = this.morph;
        int iHashCode2 = iHashCode + (oMSDialog != null ? oMSDialog.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.web == null) {
            this.web = OMSWebDialogResource.new_();
        }
        if (this.morph == null) {
            this.morph = OMSDialog.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
