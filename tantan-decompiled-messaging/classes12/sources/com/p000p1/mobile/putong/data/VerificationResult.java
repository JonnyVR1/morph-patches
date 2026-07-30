package com.p000p1.mobile.putong.data;

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
public class VerificationResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "verificationresult";

    @ProtobufIndex(index = 1)
    public boolean verified;
    public static ProtobufAdapter<VerificationResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<VerificationResult>() { // from class: com.p1.mobile.putong.data.VerificationResult.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VerificationResult verificationResult) {
            int iB = CodedOutputByteBufferNano.b(1, verificationResult.verified);
            ((MessageNano) verificationResult).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VerificationResult m19280parse(nb5 nb5Var) throws IOException {
            VerificationResult verificationResult = new VerificationResult();
            while (nb5Var.u() == 8) {
                verificationResult.verified = nb5Var.g();
            }
            return verificationResult;
        }

        public void serialize(VerificationResult verificationResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, verificationResult.verified);
        }
    };
    public static JsonAdapter<VerificationResult> JSON_ADAPTER = new ObjectJsonAdapter<VerificationResult>() { // from class: com.p1.mobile.putong.data.VerificationResult.2
        public Class getDataClass() {
            return VerificationResult.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public VerificationResult mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VerificationResult verificationResult, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("verified", verificationResult.verified);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerificationResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerificationResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VerificationResult new_() {
        VerificationResult verificationResult = new VerificationResult();
        verificationResult.nullCheck();
        return verificationResult;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VerificationResult m19279clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.verified ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
