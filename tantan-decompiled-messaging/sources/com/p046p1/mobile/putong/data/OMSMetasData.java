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
public class OMSMetasData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsmetasdata";

    @NonNull
    @ProtobufIndex(index = 2)
    public NewOmsLoadStrategy loadStrategy;

    @NonNull
    @ProtobufIndex(index = 1)
    public String version;
    public static ProtobufAdapter<OMSMetasData> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSMetasData>() { // from class: com.p1.mobile.putong.data.OMSMetasData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSMetasData oMSMetasData) {
            String str = oMSMetasData.version;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            NewOmsLoadStrategy newOmsLoadStrategy = oMSMetasData.loadStrategy;
            if (newOmsLoadStrategy != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, newOmsLoadStrategy, NewOmsLoadStrategy.PROTOBUF_ADAPTER);
            }
            oMSMetasData.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSMetasData parse(nb5 nb5Var) throws IOException {
            OMSMetasData oMSMetasData = new OMSMetasData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (oMSMetasData.version == null) {
                        oMSMetasData.version = "";
                    }
                    if (oMSMetasData.loadStrategy != null) {
                        break;
                    }
                    oMSMetasData.loadStrategy = NewOmsLoadStrategy.new_();
                    break;
                }
                if (iM158752u == 10) {
                    oMSMetasData.version = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (oMSMetasData.version == null) {
                            oMSMetasData.version = "";
                        }
                        if (oMSMetasData.loadStrategy != null) {
                            break;
                        }
                        oMSMetasData.loadStrategy = NewOmsLoadStrategy.new_();
                        return oMSMetasData;
                    }
                    oMSMetasData.loadStrategy = (NewOmsLoadStrategy) nb5Var.m158743l(NewOmsLoadStrategy.PROTOBUF_ADAPTER);
                }
            }
            return oMSMetasData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSMetasData oMSMetasData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSMetasData.version;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            NewOmsLoadStrategy newOmsLoadStrategy = oMSMetasData.loadStrategy;
            if (newOmsLoadStrategy != null) {
                codedOutputByteBufferNano.m17254K(2, newOmsLoadStrategy, NewOmsLoadStrategy.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSMetasData> JSON_ADAPTER = new ObjectJsonAdapter<OMSMetasData>() { // from class: com.p1.mobile.putong.data.OMSMetasData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSMetasData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSMetasData newInstance() {
            return new OMSMetasData();
        }

        public boolean parseField(OMSMetasData oMSMetasData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("loadStrategy")) {
                oMSMetasData.loadStrategy = NewOmsLoadStrategy.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(WBConstants.AUTH_PARAMS_VERSION)) {
                return false;
            }
            oMSMetasData.version = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(OMSMetasData oMSMetasData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("loadStrategy") || str.equals(WBConstants.AUTH_PARAMS_VERSION)) {
                return true;
            }
            return super.parseFieldCheck(oMSMetasData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSMetasData oMSMetasData, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSMetasData.version;
            if (str != null) {
                jsonGenerator.writeStringField(WBConstants.AUTH_PARAMS_VERSION, str);
            }
            if (oMSMetasData.loadStrategy != null) {
                jsonGenerator.writeFieldName("loadStrategy");
                NewOmsLoadStrategy.JSON_ADAPTER.serialize(oMSMetasData.loadStrategy, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSMetasData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSMetasData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSMetasData new_() {
        OMSMetasData oMSMetasData = new OMSMetasData();
        oMSMetasData.nullCheck();
        return oMSMetasData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSMetasData mo223809clone() {
        OMSMetasData oMSMetasData = new OMSMetasData();
        oMSMetasData.version = this.version;
        NewOmsLoadStrategy newOmsLoadStrategy = this.loadStrategy;
        if (newOmsLoadStrategy != null) {
            oMSMetasData.loadStrategy = newOmsLoadStrategy.mo223809clone();
        }
        return oMSMetasData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSMetasData)) {
            return false;
        }
        OMSMetasData oMSMetasData = (OMSMetasData) obj;
        return ValueObject.util_equals(this.version, oMSMetasData.version) && ValueObject.util_equals(this.loadStrategy, oMSMetasData.loadStrategy);
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
        String str = this.version;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        NewOmsLoadStrategy newOmsLoadStrategy = this.loadStrategy;
        int iHashCode2 = iHashCode + (newOmsLoadStrategy != null ? newOmsLoadStrategy.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.version == null) {
            this.version = "";
        }
        if (this.loadStrategy == null) {
            this.loadStrategy = NewOmsLoadStrategy.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
