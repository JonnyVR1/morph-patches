package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class RiskSelfData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "riskselfdata";

    @NonNull
    @ProtobufIndex(index = 4)
    public String ceilText;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f20496id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String popUpText;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<RiskSelfData> PROTOBUF_ADAPTER = new MessageNanoAdapter<RiskSelfData>() { // from class: com.p1.mobile.putong.core.data.RiskSelfData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RiskSelfData riskSelfData) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, riskSelfData.f20496id);
            String str = riskSelfData.type;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = riskSelfData.popUpText;
            if (str2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            String str3 = riskSelfData.ceilText;
            if (str3 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            riskSelfData.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RiskSelfData parse(nb5 nb5Var) throws IOException {
            RiskSelfData riskSelfData = new RiskSelfData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (riskSelfData.type == null) {
                        riskSelfData.type = "";
                    }
                    if (riskSelfData.popUpText == null) {
                        riskSelfData.popUpText = "";
                    }
                    if (riskSelfData.ceilText != null) {
                        break;
                    }
                    riskSelfData.ceilText = "";
                    break;
                }
                if (iM158752u == 8) {
                    riskSelfData.f20496id = nb5Var.m158741j();
                } else if (iM158752u == 18) {
                    riskSelfData.type = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    riskSelfData.popUpText = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
                        if (riskSelfData.type == null) {
                            riskSelfData.type = "";
                        }
                        if (riskSelfData.popUpText == null) {
                            riskSelfData.popUpText = "";
                        }
                        if (riskSelfData.ceilText != null) {
                            break;
                        }
                        riskSelfData.ceilText = "";
                        return riskSelfData;
                    }
                    riskSelfData.ceilText = nb5Var.m158750s();
                }
            }
            return riskSelfData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RiskSelfData riskSelfData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, riskSelfData.f20496id);
            String str = riskSelfData.type;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = riskSelfData.popUpText;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            String str3 = riskSelfData.ceilText;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
        }
    };
    public static JsonAdapter<RiskSelfData> JSON_ADAPTER = new ObjectJsonAdapter<RiskSelfData>() { // from class: com.p1.mobile.putong.core.data.RiskSelfData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RiskSelfData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RiskSelfData newInstance() {
            return new RiskSelfData();
        }

        public boolean parseField(RiskSelfData riskSelfData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "popUpText":
                    riskSelfData.popUpText = jsonParser.getValueAsString();
                    return true;
                case "ceilText":
                    riskSelfData.ceilText = jsonParser.getValueAsString();
                    return true;
                case "id":
                    riskSelfData.f20496id = jsonParser.getValueAsInt();
                    return false;
                case "type":
                    riskSelfData.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RiskSelfData riskSelfData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "popUpText":
                case "ceilText":
                    return true;
                case "id":
                    return false;
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(riskSelfData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RiskSelfData riskSelfData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", riskSelfData.f20496id);
            String str = riskSelfData.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = riskSelfData.popUpText;
            if (str2 != null) {
                jsonGenerator.writeStringField("popUpText", str2);
            }
            String str3 = riskSelfData.ceilText;
            if (str3 != null) {
                jsonGenerator.writeStringField("ceilText", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RiskSelfData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RiskSelfData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RiskSelfData new_() {
        RiskSelfData riskSelfData = new RiskSelfData();
        riskSelfData.nullCheck();
        return riskSelfData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RiskSelfData mo223809clone() {
        RiskSelfData riskSelfData = new RiskSelfData();
        riskSelfData.f20496id = this.f20496id;
        riskSelfData.type = this.type;
        riskSelfData.popUpText = this.popUpText;
        riskSelfData.ceilText = this.ceilText;
        return riskSelfData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RiskSelfData)) {
            return false;
        }
        RiskSelfData riskSelfData = (RiskSelfData) obj;
        return this.f20496id == riskSelfData.f20496id && ValueObject.util_equals(this.type, riskSelfData.type) && ValueObject.util_equals(this.popUpText, riskSelfData.popUpText) && ValueObject.util_equals(this.ceilText, riskSelfData.ceilText);
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
        int i2 = ((i * 41) + this.f20496id) * 41;
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.popUpText;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.ceilText;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.popUpText == null) {
            this.popUpText = "";
        }
        if (this.ceilText == null) {
            this.ceilText = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
