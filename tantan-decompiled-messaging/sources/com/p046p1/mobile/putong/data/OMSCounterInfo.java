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
public class OMSCounterInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omscounterinfo";

    @NonNull
    @ProtobufIndex(index = 3)
    public OMSConstraint constraint;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f38784id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String version;
    public static ProtobufAdapter<OMSCounterInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSCounterInfo>() { // from class: com.p1.mobile.putong.data.OMSCounterInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSCounterInfo oMSCounterInfo) {
            String str = oMSCounterInfo.f38784id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = oMSCounterInfo.version;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            OMSConstraint oMSConstraint = oMSCounterInfo.constraint;
            if (oMSConstraint != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, oMSConstraint, OMSConstraint.PROTOBUF_ADAPTER);
            }
            oMSCounterInfo.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSCounterInfo parse(nb5 nb5Var) throws IOException {
            OMSCounterInfo oMSCounterInfo = new OMSCounterInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (oMSCounterInfo.f38784id == null) {
                        oMSCounterInfo.f38784id = "";
                    }
                    if (oMSCounterInfo.version == null) {
                        oMSCounterInfo.version = "";
                    }
                    if (oMSCounterInfo.constraint != null) {
                        break;
                    }
                    oMSCounterInfo.constraint = OMSConstraint.new_();
                    break;
                }
                if (iM158752u == 10) {
                    oMSCounterInfo.f38784id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    oMSCounterInfo.version = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (oMSCounterInfo.f38784id == null) {
                            oMSCounterInfo.f38784id = "";
                        }
                        if (oMSCounterInfo.version == null) {
                            oMSCounterInfo.version = "";
                        }
                        if (oMSCounterInfo.constraint != null) {
                            break;
                        }
                        oMSCounterInfo.constraint = OMSConstraint.new_();
                        return oMSCounterInfo;
                    }
                    oMSCounterInfo.constraint = (OMSConstraint) nb5Var.m158743l(OMSConstraint.PROTOBUF_ADAPTER);
                }
            }
            return oMSCounterInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSCounterInfo oMSCounterInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSCounterInfo.f38784id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = oMSCounterInfo.version;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            OMSConstraint oMSConstraint = oMSCounterInfo.constraint;
            if (oMSConstraint != null) {
                codedOutputByteBufferNano.m17254K(3, oMSConstraint, OMSConstraint.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSCounterInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSCounterInfo>() { // from class: com.p1.mobile.putong.data.OMSCounterInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSCounterInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSCounterInfo newInstance() {
            return new OMSCounterInfo();
        }

        public boolean parseField(OMSCounterInfo oMSCounterInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "constraint":
                    oMSCounterInfo.constraint = OMSConstraint.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    oMSCounterInfo.f38784id = jsonParser.getValueAsString();
                    return false;
                case "version":
                    oMSCounterInfo.version = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSCounterInfo oMSCounterInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "constraint":
                    return true;
                case "id":
                    return false;
                case "version":
                    return true;
                default:
                    return super.parseFieldCheck(oMSCounterInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSCounterInfo oMSCounterInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSCounterInfo.f38784id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = oMSCounterInfo.version;
            if (str2 != null) {
                jsonGenerator.writeStringField(WBConstants.AUTH_PARAMS_VERSION, str2);
            }
            if (oMSCounterInfo.constraint != null) {
                jsonGenerator.writeFieldName("constraint");
                OMSConstraint.JSON_ADAPTER.serialize(oMSCounterInfo.constraint, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSCounterInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSCounterInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSCounterInfo new_() {
        OMSCounterInfo oMSCounterInfo = new OMSCounterInfo();
        oMSCounterInfo.nullCheck();
        return oMSCounterInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSCounterInfo mo223809clone() {
        OMSCounterInfo oMSCounterInfo = new OMSCounterInfo();
        oMSCounterInfo.f38784id = this.f38784id;
        oMSCounterInfo.version = this.version;
        OMSConstraint oMSConstraint = this.constraint;
        if (oMSConstraint != null) {
            oMSCounterInfo.constraint = oMSConstraint.mo223809clone();
        }
        return oMSCounterInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSCounterInfo)) {
            return false;
        }
        OMSCounterInfo oMSCounterInfo = (OMSCounterInfo) obj;
        return ValueObject.util_equals(this.f38784id, oMSCounterInfo.f38784id) && ValueObject.util_equals(this.version, oMSCounterInfo.version) && ValueObject.util_equals(this.constraint, oMSCounterInfo.constraint);
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
        String str = this.f38784id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.version;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        OMSConstraint oMSConstraint = this.constraint;
        int iHashCode3 = iHashCode2 + (oMSConstraint != null ? oMSConstraint.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f38784id == null) {
            this.f38784id = "";
        }
        if (this.version == null) {
            this.version = "";
        }
        if (this.constraint == null) {
            this.constraint = OMSConstraint.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
