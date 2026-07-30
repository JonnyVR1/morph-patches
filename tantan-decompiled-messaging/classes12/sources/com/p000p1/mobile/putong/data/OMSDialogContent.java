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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSDialogContent oMSDialogContent) {
            OMSWebDialogResource oMSWebDialogResource = oMSDialogContent.web;
            int iL = oMSWebDialogResource != null ? CodedOutputByteBufferNano.l(1, oMSWebDialogResource, OMSWebDialogResource.PROTOBUF_ADAPTER) : 0;
            OMSDialog oMSDialog = oMSDialogContent.morph;
            if (oMSDialog != null) {
                iL += CodedOutputByteBufferNano.l(2, oMSDialog, OMSDialog.PROTOBUF_ADAPTER);
            }
            ((MessageNano) oMSDialogContent).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSDialogContent m18597parse(nb5 nb5Var) throws IOException {
            OMSDialogContent oMSDialogContent = new OMSDialogContent();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (oMSDialogContent.web == null) {
                        oMSDialogContent.web = OMSWebDialogResource.new_();
                    }
                    if (oMSDialogContent.morph != null) {
                        break;
                    }
                    oMSDialogContent.morph = OMSDialog.new_();
                    break;
                }
                if (iU == 10) {
                    oMSDialogContent.web = (OMSWebDialogResource) nb5Var.l(OMSWebDialogResource.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (oMSDialogContent.web == null) {
                            oMSDialogContent.web = OMSWebDialogResource.new_();
                        }
                        if (oMSDialogContent.morph != null) {
                            break;
                        }
                        oMSDialogContent.morph = OMSDialog.new_();
                        return oMSDialogContent;
                    }
                    oMSDialogContent.morph = (OMSDialog) nb5Var.l(OMSDialog.PROTOBUF_ADAPTER);
                }
            }
            return oMSDialogContent;
        }

        public void serialize(OMSDialogContent oMSDialogContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            OMSWebDialogResource oMSWebDialogResource = oMSDialogContent.web;
            if (oMSWebDialogResource != null) {
                codedOutputByteBufferNano.K(1, oMSWebDialogResource, OMSWebDialogResource.PROTOBUF_ADAPTER);
            }
            OMSDialog oMSDialog = oMSDialogContent.morph;
            if (oMSDialog != null) {
                codedOutputByteBufferNano.K(2, oMSDialog, OMSDialog.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSDialogContent> JSON_ADAPTER = new ObjectJsonAdapter<OMSDialogContent>() { // from class: com.p1.mobile.putong.data.OMSDialogContent.2
        public Class getDataClass() {
            return OMSDialogContent.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSDialogContent mo17830newInstance() {
            return new OMSDialogContent();
        }

        public boolean parseField(OMSDialogContent oMSDialogContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(SchemeKey.web)) {
                oMSDialogContent.web = (OMSWebDialogResource) OMSWebDialogResource.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(OMSDialogType.morph)) {
                return false;
            }
            oMSDialogContent.morph = (OMSDialog) OMSDialog.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(OMSDialogContent oMSDialogContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(SchemeKey.web) || str.equals(OMSDialogType.morph)) {
                return true;
            }
            return super.parseFieldCheck(oMSDialogContent, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSDialogContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSDialogContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSDialogContent new_() {
        OMSDialogContent oMSDialogContent = new OMSDialogContent();
        oMSDialogContent.nullCheck();
        return oMSDialogContent;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSDialogContent m18596clone() {
        OMSDialogContent oMSDialogContent = new OMSDialogContent();
        OMSWebDialogResource oMSWebDialogResource = this.web;
        if (oMSWebDialogResource != null) {
            oMSDialogContent.web = oMSWebDialogResource.m18689clone();
        }
        OMSDialog oMSDialog = this.morph;
        if (oMSDialog != null) {
            oMSDialogContent.morph = oMSDialog.m18593clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        OMSWebDialogResource oMSWebDialogResource = this.web;
        int iHashCode = (i2 + (oMSWebDialogResource != null ? oMSWebDialogResource.hashCode() : 0)) * 41;
        OMSDialog oMSDialog = this.morph;
        int iHashCode2 = iHashCode + (oMSDialog != null ? oMSDialog.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.web == null) {
            this.web = OMSWebDialogResource.new_();
        }
        if (this.morph == null) {
            this.morph = OMSDialog.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
