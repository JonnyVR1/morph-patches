package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class VerificationResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "verificationresult";

    @ProtobufIndex(index = 1)
    public boolean verified;
    public static ProtobufAdapter<VerificationResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<VerificationResult>() { // from class: com.p1.mobile.putong.data.VerificationResult.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VerificationResult verificationResult) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, verificationResult.verified);
            verificationResult.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VerificationResult parse(nc5 nc5Var) throws IOException {
            VerificationResult verificationResult = new VerificationResult();
            while (nc5Var.m162497u() == 8) {
                verificationResult.verified = nc5Var.m162483g();
            }
            return verificationResult;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VerificationResult verificationResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, verificationResult.verified);
        }
    };
    public static JsonAdapter<VerificationResult> JSON_ADAPTER = new ObjectJsonAdapter<VerificationResult>() { // from class: com.p1.mobile.putong.data.VerificationResult.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VerificationResult.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VerificationResult newInstance() {
            return new VerificationResult();
        }

        public boolean parseField(VerificationResult verificationResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("verified")) {
                return false;
            }
            verificationResult.verified = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(VerificationResult verificationResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("verified")) {
                return true;
            }
            return super.parseFieldCheck(verificationResult, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VerificationResult verificationResult, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("verified", verificationResult.verified);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerificationResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerificationResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VerificationResult new_() {
        VerificationResult verificationResult = new VerificationResult();
        verificationResult.nullCheck();
        return verificationResult;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VerificationResult mo225055clone() {
        VerificationResult verificationResult = new VerificationResult();
        verificationResult.verified = this.verified;
        return verificationResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof VerificationResult) && this.verified == ((VerificationResult) obj).verified;
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
        int i2 = (i * 41) + (this.verified ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
