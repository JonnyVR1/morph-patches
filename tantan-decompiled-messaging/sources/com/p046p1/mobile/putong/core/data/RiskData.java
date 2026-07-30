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
public class RiskData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "riskdata";

    @ProtobufIndex(index = 2)
    public boolean limited;

    @NonNull
    @ProtobufIndex(index = 1)
    public String text;
    public static ProtobufAdapter<RiskData> PROTOBUF_ADAPTER = new MessageNanoAdapter<RiskData>() { // from class: com.p1.mobile.putong.core.data.RiskData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RiskData riskData) {
            String str = riskData.text;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17220b(2, riskData.limited);
            riskData.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RiskData parse(nb5 nb5Var) throws IOException {
            RiskData riskData = new RiskData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (riskData.text != null) {
                        break;
                    }
                    riskData.text = "";
                    break;
                }
                if (iM158752u == 10) {
                    riskData.text = nb5Var.m158750s();
                } else {
                    if (iM158752u != 16) {
                        if (riskData.text != null) {
                            break;
                        }
                        riskData.text = "";
                        return riskData;
                    }
                    riskData.limited = nb5Var.m158738g();
                }
            }
            return riskData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RiskData riskData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = riskData.text;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17244A(2, riskData.limited);
        }
    };
    public static JsonAdapter<RiskData> JSON_ADAPTER = new ObjectJsonAdapter<RiskData>() { // from class: com.p1.mobile.putong.core.data.RiskData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RiskData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RiskData newInstance() {
            return new RiskData();
        }

        public boolean parseField(RiskData riskData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("text")) {
                riskData.text = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("limited")) {
                return false;
            }
            riskData.limited = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(RiskData riskData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("text") || str.equals("limited")) {
                return true;
            }
            return super.parseFieldCheck(riskData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RiskData riskData, JsonGenerator jsonGenerator) throws IOException {
            String str = riskData.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
            jsonGenerator.writeBooleanField("limited", riskData.limited);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RiskData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RiskData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RiskData new_() {
        RiskData riskData = new RiskData();
        riskData.nullCheck();
        return riskData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RiskData mo223809clone() {
        RiskData riskData = new RiskData();
        riskData.text = this.text;
        riskData.limited = this.limited;
        return riskData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RiskData)) {
            return false;
        }
        RiskData riskData = (RiskData) obj;
        return ValueObject.util_equals(this.text, riskData.text) && this.limited == riskData.limited;
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
        String str = this.text;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.limited ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
