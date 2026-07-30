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
public class CreditScoreData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "creditscoredata";

    @ProtobufIndex(index = 2)
    public int creditScore;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20384id;

    @ProtobufIndex(index = 3)
    public boolean show;
    public static ProtobufAdapter<CreditScoreData> PROTOBUF_ADAPTER = new MessageNanoAdapter<CreditScoreData>() { // from class: com.p1.mobile.putong.core.data.CreditScoreData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CreditScoreData creditScoreData) {
            String str = creditScoreData.f20384id;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, creditScoreData.creditScore) + CodedOutputByteBufferNano.m17220b(3, creditScoreData.show);
            creditScoreData.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CreditScoreData parse(nb5 nb5Var) throws IOException {
            CreditScoreData creditScoreData = new CreditScoreData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (creditScoreData.f20384id != null) {
                        break;
                    }
                    creditScoreData.f20384id = "";
                    break;
                }
                if (iM158752u == 10) {
                    creditScoreData.f20384id = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    creditScoreData.creditScore = nb5Var.m158741j();
                } else {
                    if (iM158752u != 24) {
                        if (creditScoreData.f20384id != null) {
                            break;
                        }
                        creditScoreData.f20384id = "";
                        return creditScoreData;
                    }
                    creditScoreData.show = nb5Var.m158738g();
                }
            }
            return creditScoreData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CreditScoreData creditScoreData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = creditScoreData.f20384id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, creditScoreData.creditScore);
            codedOutputByteBufferNano.m17244A(3, creditScoreData.show);
        }
    };
    public static JsonAdapter<CreditScoreData> JSON_ADAPTER = new ObjectJsonAdapter<CreditScoreData>() { // from class: com.p1.mobile.putong.core.data.CreditScoreData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CreditScoreData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CreditScoreData newInstance() {
            return new CreditScoreData();
        }

        public boolean parseField(CreditScoreData creditScoreData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "creditScore":
                    creditScoreData.creditScore = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    creditScoreData.f20384id = jsonParser.getValueAsString();
                    return false;
                case "show":
                    creditScoreData.show = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CreditScoreData creditScoreData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "creditScore":
                    return true;
                case "id":
                    return false;
                case "show":
                    return true;
                default:
                    return super.parseFieldCheck(creditScoreData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CreditScoreData creditScoreData, JsonGenerator jsonGenerator) throws IOException {
            String str = creditScoreData.f20384id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("creditScore", creditScoreData.creditScore);
            jsonGenerator.writeBooleanField("show", creditScoreData.show);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CreditScoreData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CreditScoreData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CreditScoreData new_() {
        CreditScoreData creditScoreData = new CreditScoreData();
        creditScoreData.nullCheck();
        return creditScoreData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CreditScoreData mo223809clone() {
        CreditScoreData creditScoreData = new CreditScoreData();
        creditScoreData.f20384id = this.f20384id;
        creditScoreData.creditScore = this.creditScore;
        creditScoreData.show = this.show;
        return creditScoreData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreditScoreData)) {
            return false;
        }
        CreditScoreData creditScoreData = (CreditScoreData) obj;
        return ValueObject.util_equals(this.f20384id, creditScoreData.f20384id) && this.creditScore == creditScoreData.creditScore && this.show == creditScoreData.show;
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
        String str = this.f20384id;
        int iHashCode = ((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.creditScore) * 41) + (this.show ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20384id == null) {
            this.f20384id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
