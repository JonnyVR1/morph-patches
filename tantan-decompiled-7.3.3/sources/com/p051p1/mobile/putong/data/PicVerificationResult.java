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
public class PicVerificationResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "picverificationresult";

    @ProtobufIndex(index = 1)
    public boolean verified;
    public static ProtobufAdapter<PicVerificationResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<PicVerificationResult>() { // from class: com.p1.mobile.putong.data.PicVerificationResult.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PicVerificationResult picVerificationResult) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, picVerificationResult.verified);
            picVerificationResult.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PicVerificationResult parse(nc5 nc5Var) throws IOException {
            PicVerificationResult picVerificationResult = new PicVerificationResult();
            while (nc5Var.m162497u() == 8) {
                picVerificationResult.verified = nc5Var.m162483g();
            }
            return picVerificationResult;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PicVerificationResult picVerificationResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, picVerificationResult.verified);
        }
    };
    public static JsonAdapter<PicVerificationResult> JSON_ADAPTER = new ObjectJsonAdapter<PicVerificationResult>() { // from class: com.p1.mobile.putong.data.PicVerificationResult.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PicVerificationResult.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PicVerificationResult newInstance() {
            return new PicVerificationResult();
        }

        public boolean parseField(PicVerificationResult picVerificationResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("verified")) {
                return false;
            }
            picVerificationResult.verified = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(PicVerificationResult picVerificationResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("verified")) {
                return true;
            }
            return super.parseFieldCheck(picVerificationResult, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PicVerificationResult picVerificationResult, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("verified", picVerificationResult.verified);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PicVerificationResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PicVerificationResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PicVerificationResult new_() {
        PicVerificationResult picVerificationResult = new PicVerificationResult();
        picVerificationResult.nullCheck();
        return picVerificationResult;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PicVerificationResult mo225055clone() {
        PicVerificationResult picVerificationResult = new PicVerificationResult();
        picVerificationResult.verified = this.verified;
        return picVerificationResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof PicVerificationResult) && this.verified == ((PicVerificationResult) obj).verified;
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
