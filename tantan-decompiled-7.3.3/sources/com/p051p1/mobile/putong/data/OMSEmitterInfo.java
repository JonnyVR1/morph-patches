package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class OMSEmitterInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsemitterinfo";

    @ProtobufIndex(index = 3)
    public boolean enable;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39636id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String url;

    @ProtobufIndex(index = 2)
    public int version;
    public static ProtobufAdapter<OMSEmitterInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSEmitterInfo>() { // from class: com.p1.mobile.putong.data.OMSEmitterInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSEmitterInfo oMSEmitterInfo) {
            String str = oMSEmitterInfo.f39636id;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17281h(2, oMSEmitterInfo.version) + CodedOutputByteBufferNano.m17275b(3, oMSEmitterInfo.enable);
            String str2 = oMSEmitterInfo.url;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str2);
            }
            oMSEmitterInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSEmitterInfo parse(nc5 nc5Var) throws IOException {
            OMSEmitterInfo oMSEmitterInfo = new OMSEmitterInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (oMSEmitterInfo.f39636id == null) {
                        oMSEmitterInfo.f39636id = "";
                    }
                    if (oMSEmitterInfo.url != null) {
                        break;
                    }
                    oMSEmitterInfo.url = "";
                    break;
                }
                if (iM162497u == 10) {
                    oMSEmitterInfo.f39636id = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    oMSEmitterInfo.version = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    oMSEmitterInfo.enable = nc5Var.m162483g();
                } else {
                    if (iM162497u != 34) {
                        if (oMSEmitterInfo.f39636id == null) {
                            oMSEmitterInfo.f39636id = "";
                        }
                        if (oMSEmitterInfo.url != null) {
                            break;
                        }
                        oMSEmitterInfo.url = "";
                        return oMSEmitterInfo;
                    }
                    oMSEmitterInfo.url = nc5Var.m162495s();
                }
            }
            return oMSEmitterInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSEmitterInfo oMSEmitterInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSEmitterInfo.f39636id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17305G(2, oMSEmitterInfo.version);
            codedOutputByteBufferNano.m17299A(3, oMSEmitterInfo.enable);
            String str2 = oMSEmitterInfo.url;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(4, str2);
            }
        }
    };
    public static JsonAdapter<OMSEmitterInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSEmitterInfo>() { // from class: com.p1.mobile.putong.data.OMSEmitterInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSEmitterInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSEmitterInfo newInstance() {
            return new OMSEmitterInfo();
        }

        public boolean parseField(OMSEmitterInfo oMSEmitterInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enable":
                    oMSEmitterInfo.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "id":
                    oMSEmitterInfo.f39636id = jsonParser.getValueAsString();
                    return false;
                case "url":
                    oMSEmitterInfo.url = jsonParser.getValueAsString();
                    return true;
                case "version":
                    oMSEmitterInfo.version = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSEmitterInfo oMSEmitterInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "enable":
                    return true;
                case "id":
                    return false;
                case "url":
                case "version":
                    return true;
                default:
                    return super.parseFieldCheck(oMSEmitterInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSEmitterInfo oMSEmitterInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSEmitterInfo.f39636id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField(WBConstants.AUTH_PARAMS_VERSION, oMSEmitterInfo.version);
            jsonGenerator.writeBooleanField("enable", oMSEmitterInfo.enable);
            String str2 = oMSEmitterInfo.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSEmitterInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSEmitterInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSEmitterInfo new_() {
        OMSEmitterInfo oMSEmitterInfo = new OMSEmitterInfo();
        oMSEmitterInfo.nullCheck();
        return oMSEmitterInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSEmitterInfo mo225055clone() {
        OMSEmitterInfo oMSEmitterInfo = new OMSEmitterInfo();
        oMSEmitterInfo.f39636id = this.f39636id;
        oMSEmitterInfo.version = this.version;
        oMSEmitterInfo.enable = this.enable;
        oMSEmitterInfo.url = this.url;
        return oMSEmitterInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSEmitterInfo)) {
            return false;
        }
        OMSEmitterInfo oMSEmitterInfo = (OMSEmitterInfo) obj;
        return ValueObject.util_equals(this.f39636id, oMSEmitterInfo.f39636id) && this.version == oMSEmitterInfo.version && this.enable == oMSEmitterInfo.enable && ValueObject.util_equals(this.url, oMSEmitterInfo.url);
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
        String str = this.f39636id;
        int iHashCode = (((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.version) * 41) + (this.enable ? 1231 : 1237)) * 41;
        String str2 = this.url;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39636id == null) {
            this.f39636id = "";
        }
        if (this.url == null) {
            this.url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
