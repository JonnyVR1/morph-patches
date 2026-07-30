package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.sina.weibo.sdk.constant.WBConstants;
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
    public String f38787id;

    @NonNull
    @ProtobufIndex(index = 3)
    public OMSPositionInfo position;

    @ProtobufIndex(index = 4)
    public boolean remote;

    @ProtobufIndex(index = 2)
    public int version;
    public static ProtobufAdapter<OMSDocumentInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSDocumentInfo>() { // from class: com.p1.mobile.putong.data.OMSDocumentInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSDocumentInfo oMSDocumentInfo) {
            String str = oMSDocumentInfo.f38787id;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, oMSDocumentInfo.version);
            OMSPositionInfo oMSPositionInfo = oMSDocumentInfo.position;
            if (oMSPositionInfo != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, oMSPositionInfo, OMSPositionInfo.PROTOBUF_ADAPTER);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(4, oMSDocumentInfo.remote);
            String str2 = oMSDocumentInfo.contentType;
            if (str2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(5, str2);
            }
            OMSDocumentContent oMSDocumentContent = oMSDocumentInfo.content;
            if (oMSDocumentContent != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(6, oMSDocumentContent, OMSDocumentContent.PROTOBUF_ADAPTER);
            }
            oMSDocumentInfo.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSDocumentInfo parse(nb5 nb5Var) throws IOException {
            OMSDocumentInfo oMSDocumentInfo = new OMSDocumentInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (oMSDocumentInfo.f38787id == null) {
                        oMSDocumentInfo.f38787id = "";
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
                if (iM158752u == 10) {
                    oMSDocumentInfo.f38787id = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    oMSDocumentInfo.version = nb5Var.m158741j();
                } else if (iM158752u == 26) {
                    oMSDocumentInfo.position = (OMSPositionInfo) nb5Var.m158743l(OMSPositionInfo.PROTOBUF_ADAPTER);
                } else if (iM158752u == 32) {
                    oMSDocumentInfo.remote = nb5Var.m158738g();
                } else if (iM158752u == 42) {
                    oMSDocumentInfo.contentType = nb5Var.m158750s();
                } else {
                    if (iM158752u != 50) {
                        if (oMSDocumentInfo.f38787id == null) {
                            oMSDocumentInfo.f38787id = "";
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
                    oMSDocumentInfo.content = (OMSDocumentContent) nb5Var.m158743l(OMSDocumentContent.PROTOBUF_ADAPTER);
                }
            }
            return oMSDocumentInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSDocumentInfo oMSDocumentInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSDocumentInfo.f38787id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, oMSDocumentInfo.version);
            OMSPositionInfo oMSPositionInfo = oMSDocumentInfo.position;
            if (oMSPositionInfo != null) {
                codedOutputByteBufferNano.m17254K(3, oMSPositionInfo, OMSPositionInfo.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(4, oMSDocumentInfo.remote);
            String str2 = oMSDocumentInfo.contentType;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(5, str2);
            }
            OMSDocumentContent oMSDocumentContent = oMSDocumentInfo.content;
            if (oMSDocumentContent != null) {
                codedOutputByteBufferNano.m17254K(6, oMSDocumentContent, OMSDocumentContent.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSDocumentInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSDocumentInfo>() { // from class: com.p1.mobile.putong.data.OMSDocumentInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSDocumentInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSDocumentInfo newInstance() {
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
                    oMSDocumentInfo.f38787id = jsonParser.getValueAsString();
                    return false;
                case "version":
                    oMSDocumentInfo.version = jsonParser.getValueAsInt();
                    return true;
                case "position":
                    oMSDocumentInfo.position = OMSPositionInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "content":
                    oMSDocumentInfo.content = OMSDocumentContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSDocumentInfo oMSDocumentInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSDocumentInfo.f38787id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField(WBConstants.AUTH_PARAMS_VERSION, oMSDocumentInfo.version);
            if (oMSDocumentInfo.position != null) {
                jsonGenerator.writeFieldName("position");
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSDocumentInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSDocumentInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSDocumentInfo new_() {
        OMSDocumentInfo oMSDocumentInfo = new OMSDocumentInfo();
        oMSDocumentInfo.nullCheck();
        return oMSDocumentInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSDocumentInfo mo223809clone() {
        OMSDocumentInfo oMSDocumentInfo = new OMSDocumentInfo();
        oMSDocumentInfo.f38787id = this.f38787id;
        oMSDocumentInfo.version = this.version;
        OMSPositionInfo oMSPositionInfo = this.position;
        if (oMSPositionInfo != null) {
            oMSDocumentInfo.position = oMSPositionInfo.mo223809clone();
        }
        oMSDocumentInfo.remote = this.remote;
        oMSDocumentInfo.contentType = this.contentType;
        OMSDocumentContent oMSDocumentContent = this.content;
        if (oMSDocumentContent != null) {
            oMSDocumentInfo.content = oMSDocumentContent.mo223809clone();
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
        return ValueObject.util_equals(this.f38787id, oMSDocumentInfo.f38787id) && this.version == oMSDocumentInfo.version && ValueObject.util_equals(this.position, oMSDocumentInfo.position) && this.remote == oMSDocumentInfo.remote && ValueObject.util_equals(this.contentType, oMSDocumentInfo.contentType) && ValueObject.util_equals(this.content, oMSDocumentInfo.content);
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
        String str = this.f38787id;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.version) * 41;
        OMSPositionInfo oMSPositionInfo = this.position;
        int iHashCode2 = (((iHashCode + (oMSPositionInfo != null ? oMSPositionInfo.hashCode() : 0)) * 41) + (this.remote ? 1231 : 1237)) * 41;
        String str2 = this.contentType;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        OMSDocumentContent oMSDocumentContent = this.content;
        int iHashCode4 = iHashCode3 + (oMSDocumentContent != null ? oMSDocumentContent.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f38787id == null) {
            this.f38787id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
