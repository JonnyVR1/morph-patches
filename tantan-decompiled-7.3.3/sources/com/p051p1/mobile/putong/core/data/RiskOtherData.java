package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: classes10.dex */
public class RiskOtherData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "riskotherdata";

    @ProtobufIndex(index = 3)
    public boolean limited;

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<RiskOtherData> PROTOBUF_ADAPTER = new MessageNanoAdapter<RiskOtherData>() { // from class: com.p1.mobile.putong.core.data.RiskOtherData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RiskOtherData riskOtherData) {
            String str = riskOtherData.type;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = riskOtherData.text;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(3, riskOtherData.limited);
            riskOtherData.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RiskOtherData parse(nc5 nc5Var) throws IOException {
            RiskOtherData riskOtherData = new RiskOtherData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (riskOtherData.type == null) {
                        riskOtherData.type = "";
                    }
                    if (riskOtherData.text != null) {
                        break;
                    }
                    riskOtherData.text = "";
                    break;
                }
                if (iM162497u == 10) {
                    riskOtherData.type = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    riskOtherData.text = nc5Var.m162495s();
                } else {
                    if (iM162497u != 24) {
                        if (riskOtherData.type == null) {
                            riskOtherData.type = "";
                        }
                        if (riskOtherData.text != null) {
                            break;
                        }
                        riskOtherData.text = "";
                        return riskOtherData;
                    }
                    riskOtherData.limited = nc5Var.m162483g();
                }
            }
            return riskOtherData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RiskOtherData riskOtherData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = riskOtherData.type;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = riskOtherData.text;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17299A(3, riskOtherData.limited);
        }
    };
    public static JsonAdapter<RiskOtherData> JSON_ADAPTER = new ObjectJsonAdapter<RiskOtherData>() { // from class: com.p1.mobile.putong.core.data.RiskOtherData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RiskOtherData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RiskOtherData newInstance() {
            return new RiskOtherData();
        }

        public boolean parseField(RiskOtherData riskOtherData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "text":
                    riskOtherData.text = jsonParser.getValueAsString();
                    return true;
                case "type":
                    riskOtherData.type = jsonParser.getValueAsString();
                    return true;
                case "limited":
                    riskOtherData.limited = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RiskOtherData riskOtherData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "text":
                case "type":
                case "limited":
                    return true;
                default:
                    return super.parseFieldCheck(riskOtherData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RiskOtherData riskOtherData, JsonGenerator jsonGenerator) throws IOException {
            String str = riskOtherData.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = riskOtherData.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
            jsonGenerator.writeBooleanField("limited", riskOtherData.limited);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RiskOtherData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RiskOtherData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RiskOtherData new_() {
        RiskOtherData riskOtherData = new RiskOtherData();
        riskOtherData.nullCheck();
        return riskOtherData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RiskOtherData mo225055clone() {
        RiskOtherData riskOtherData = new RiskOtherData();
        riskOtherData.type = this.type;
        riskOtherData.text = this.text;
        riskOtherData.limited = this.limited;
        return riskOtherData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RiskOtherData)) {
            return false;
        }
        RiskOtherData riskOtherData = (RiskOtherData) obj;
        return ValueObject.util_equals(this.type, riskOtherData.type) && ValueObject.util_equals(this.text, riskOtherData.text) && this.limited == riskOtherData.limited;
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.limited ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.text == null) {
            this.text = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
