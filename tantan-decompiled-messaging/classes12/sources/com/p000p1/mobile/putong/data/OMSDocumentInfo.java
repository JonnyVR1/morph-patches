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
public class OMSDocumentInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsdocumentinfo";

    @NonNull
    @ProtobufIndex(index = 6)
    public OMSDocumentContent content;

    @NonNull
    @ProtobufIndex(index = 5)
    public String contentType;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f248id;

    @NonNull
    @ProtobufIndex(index = 3)
    public OMSPositionInfo position;

    @ProtobufIndex(index = 4)
    public boolean remote;

    @ProtobufIndex(index = 2)
    public int version;
    public static ProtobufAdapter<OMSDocumentInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSDocumentInfo>() { // from class: com.p1.mobile.putong.data.OMSDocumentInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSDocumentInfo oMSDocumentInfo) {
            String str = oMSDocumentInfo.f248id;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, oMSDocumentInfo.version);
            OMSPositionInfo oMSPositionInfo = oMSDocumentInfo.position;
            if (oMSPositionInfo != null) {
                iO += CodedOutputByteBufferNano.l(3, oMSPositionInfo, OMSPositionInfo.PROTOBUF_ADAPTER);
            }
            int iB = iO + CodedOutputByteBufferNano.b(4, oMSDocumentInfo.remote);
            String str2 = oMSDocumentInfo.contentType;
            if (str2 != null) {
                iB += CodedOutputByteBufferNano.o(5, str2);
            }
            OMSDocumentContent oMSDocumentContent = oMSDocumentInfo.content;
            if (oMSDocumentContent != null) {
                iB += CodedOutputByteBufferNano.l(6, oMSDocumentContent, OMSDocumentContent.PROTOBUF_ADAPTER);
            }
            ((MessageNano) oMSDocumentInfo).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSDocumentInfo m18618parse(nb5 nb5Var) throws IOException {
            OMSDocumentInfo oMSDocumentInfo = new OMSDocumentInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (oMSDocumentInfo.f248id == null) {
                        oMSDocumentInfo.f248id = "";
                    }
                    if (oMSDocumentInfo.position == null) {
                        oMSDocumentInfo.position = OMSPositionInfo.new_();
                    }
                    if (oMSDocumentInfo.contentType == null) {
                        oMSDocumentInfo.contentType = "";
                    }
                    if (oMSDocumentInfo.content != null) {
                        break;
                    }
                    oMSDocumentInfo.content = OMSDocumentContent.new_();
                    break;
                }
                if (iU == 10) {
                    oMSDocumentInfo.f248id = nb5Var.s();
                } else if (iU == 16) {
                    oMSDocumentInfo.version = nb5Var.j();
                } else if (iU == 26) {
                    oMSDocumentInfo.position = (OMSPositionInfo) nb5Var.l(OMSPositionInfo.PROTOBUF_ADAPTER);
                } else if (iU == 32) {
                    oMSDocumentInfo.remote = nb5Var.g();
                } else if (iU == 42) {
                    oMSDocumentInfo.contentType = nb5Var.s();
                } else {
                    if (iU != 50) {
                        if (oMSDocumentInfo.f248id == null) {
                            oMSDocumentInfo.f248id = "";
                        }
                        if (oMSDocumentInfo.position == null) {
                            oMSDocumentInfo.position = OMSPositionInfo.new_();
                        }
                        if (oMSDocumentInfo.contentType == null) {
                            oMSDocumentInfo.contentType = "";
                        }
                        if (oMSDocumentInfo.content != null) {
                            break;
                        }
                        oMSDocumentInfo.content = OMSDocumentContent.new_();
                        return oMSDocumentInfo;
                    }
                    oMSDocumentInfo.content = (OMSDocumentContent) nb5Var.l(OMSDocumentContent.PROTOBUF_ADAPTER);
                }
            }
            return oMSDocumentInfo;
        }

        public void serialize(OMSDocumentInfo oMSDocumentInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSDocumentInfo.f248id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, oMSDocumentInfo.version);
            OMSPositionInfo oMSPositionInfo = oMSDocumentInfo.position;
            if (oMSPositionInfo != null) {
                codedOutputByteBufferNano.K(3, oMSPositionInfo, OMSPositionInfo.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(4, oMSDocumentInfo.remote);
            String str2 = oMSDocumentInfo.contentType;
            if (str2 != null) {
                codedOutputByteBufferNano.R(5, str2);
            }
            OMSDocumentContent oMSDocumentContent = oMSDocumentInfo.content;
            if (oMSDocumentContent != null) {
                codedOutputByteBufferNano.K(6, oMSDocumentContent, OMSDocumentContent.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSDocumentInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSDocumentInfo>() { // from class: com.p1.mobile.putong.data.OMSDocumentInfo.2
        public Class getDataClass() {
            return OMSDocumentInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSDocumentInfo mo17830newInstance() {
            return new OMSDocumentInfo();
        }

        public boolean parseField(OMSDocumentInfo oMSDocumentInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "remote":
                    oMSDocumentInfo.remote = jsonParser.getValueAsBoolean();
                    return true;
                case "contentType":
                    oMSDocumentInfo.contentType = jsonParser.getValueAsString();
                    return true;
                case "id":
                    oMSDocumentInfo.f248id = jsonParser.getValueAsString();
                    return false;
                case "version":
                    oMSDocumentInfo.version = jsonParser.getValueAsInt();
                    return true;
                case "position":
                    oMSDocumentInfo.position = (OMSPositionInfo) OMSPositionInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "content":
                    oMSDocumentInfo.content = (OMSDocumentContent) OMSDocumentContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSDocumentInfo oMSDocumentInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "remote":
                case "contentType":
                    return true;
                case "id":
                    return false;
                case "version":
                case "position":
                case "content":
                    return true;
                default:
                    return super.parseFieldCheck(oMSDocumentInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSDocumentInfo oMSDocumentInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSDocumentInfo.f248id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("version", oMSDocumentInfo.version);
            if (oMSDocumentInfo.position != null) {
                jsonGenerator.writeFieldName(Position.TYPE);
                OMSPositionInfo.JSON_ADAPTER.serialize(oMSDocumentInfo.position, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("remote", oMSDocumentInfo.remote);
            String str2 = oMSDocumentInfo.contentType;
            if (str2 != null) {
                jsonGenerator.writeStringField("contentType", str2);
            }
            if (oMSDocumentInfo.content != null) {
                jsonGenerator.writeFieldName("content");
                OMSDocumentContent.JSON_ADAPTER.serialize(oMSDocumentInfo.content, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSDocumentInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSDocumentInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSDocumentInfo new_() {
        OMSDocumentInfo oMSDocumentInfo = new OMSDocumentInfo();
        oMSDocumentInfo.nullCheck();
        return oMSDocumentInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSDocumentInfo m18617clone() {
        OMSDocumentInfo oMSDocumentInfo = new OMSDocumentInfo();
        oMSDocumentInfo.f248id = this.f248id;
        oMSDocumentInfo.version = this.version;
        OMSPositionInfo oMSPositionInfo = this.position;
        if (oMSPositionInfo != null) {
            oMSDocumentInfo.position = oMSPositionInfo.m18644clone();
        }
        oMSDocumentInfo.remote = this.remote;
        oMSDocumentInfo.contentType = this.contentType;
        OMSDocumentContent oMSDocumentContent = this.content;
        if (oMSDocumentContent != null) {
            oMSDocumentInfo.content = oMSDocumentContent.m18614clone();
        }
        return oMSDocumentInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSDocumentInfo)) {
            return false;
        }
        OMSDocumentInfo oMSDocumentInfo = (OMSDocumentInfo) obj;
        return ValueObject.util_equals(this.f248id, oMSDocumentInfo.f248id) && this.version == oMSDocumentInfo.version && ValueObject.util_equals(this.position, oMSDocumentInfo.position) && this.remote == oMSDocumentInfo.remote && ValueObject.util_equals(this.contentType, oMSDocumentInfo.contentType) && ValueObject.util_equals(this.content, oMSDocumentInfo.content);
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
        String str = this.f248id;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.version) * 41;
        OMSPositionInfo oMSPositionInfo = this.position;
        int iHashCode2 = (((iHashCode + (oMSPositionInfo != null ? oMSPositionInfo.hashCode() : 0)) * 41) + (this.remote ? 1231 : 1237)) * 41;
        String str2 = this.contentType;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        OMSDocumentContent oMSDocumentContent = this.content;
        int iHashCode4 = iHashCode3 + (oMSDocumentContent != null ? oMSDocumentContent.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.f248id == null) {
            this.f248id = "";
        }
        if (this.position == null) {
            this.position = OMSPositionInfo.new_();
        }
        if (this.contentType == null) {
            this.contentType = "";
        }
        if (this.content == null) {
            this.content = OMSDocumentContent.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
