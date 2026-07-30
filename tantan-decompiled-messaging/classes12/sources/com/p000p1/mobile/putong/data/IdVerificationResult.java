package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
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
public class IdVerificationResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "idverificationresult";

    @ProtobufIndex(index = 2)
    public int age;

    @NonNull
    @ProtobufIndex(index = 3)
    public String first4;

    @ProtobufIndex(index = 1)
    public boolean verified;
    public static ProtobufAdapter<IdVerificationResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<IdVerificationResult>() { // from class: com.p1.mobile.putong.data.IdVerificationResult.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IdVerificationResult idVerificationResult) {
            int iB = CodedOutputByteBufferNano.b(1, idVerificationResult.verified) + CodedOutputByteBufferNano.h(2, idVerificationResult.age);
            String str = idVerificationResult.first4;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(3, str);
            }
            ((MessageNano) idVerificationResult).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IdVerificationResult m18211parse(nb5 nb5Var) throws IOException {
            IdVerificationResult idVerificationResult = new IdVerificationResult();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (idVerificationResult.first4 != null) {
                        break;
                    }
                    idVerificationResult.first4 = "";
                    break;
                }
                if (iU == 8) {
                    idVerificationResult.verified = nb5Var.g();
                } else if (iU == 16) {
                    idVerificationResult.age = nb5Var.j();
                } else {
                    if (iU != 26) {
                        if (idVerificationResult.first4 != null) {
                            break;
                        }
                        idVerificationResult.first4 = "";
                        return idVerificationResult;
                    }
                    idVerificationResult.first4 = nb5Var.s();
                }
            }
            return idVerificationResult;
        }

        public void serialize(IdVerificationResult idVerificationResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, idVerificationResult.verified);
            codedOutputByteBufferNano.G(2, idVerificationResult.age);
            String str = idVerificationResult.first4;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
        }
    };
    public static JsonAdapter<IdVerificationResult> JSON_ADAPTER = new ObjectJsonAdapter<IdVerificationResult>() { // from class: com.p1.mobile.putong.data.IdVerificationResult.2
        public Class getDataClass() {
            return IdVerificationResult.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public IdVerificationResult mo17830newInstance() {
            return new IdVerificationResult();
        }

        public boolean parseField(IdVerificationResult idVerificationResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "verified":
                    idVerificationResult.verified = jsonParser.getValueAsBoolean();
                    return true;
                case "first4":
                    idVerificationResult.first4 = jsonParser.getValueAsString();
                    return true;
                case "age":
                    idVerificationResult.age = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IdVerificationResult idVerificationResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "verified":
                case "first4":
                case "age":
                    return true;
                default:
                    return super.parseFieldCheck(idVerificationResult, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IdVerificationResult idVerificationResult, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("verified", idVerificationResult.verified);
            jsonGenerator.writeNumberField(SeeTextDynamicParam.age, idVerificationResult.age);
            String str = idVerificationResult.first4;
            if (str != null) {
                jsonGenerator.writeStringField("first4", str);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IdVerificationResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IdVerificationResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IdVerificationResult new_() {
        IdVerificationResult idVerificationResult = new IdVerificationResult();
        idVerificationResult.nullCheck();
        return idVerificationResult;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IdVerificationResult m18210clone() {
        IdVerificationResult idVerificationResult = new IdVerificationResult();
        idVerificationResult.verified = this.verified;
        idVerificationResult.age = this.age;
        idVerificationResult.first4 = this.first4;
        return idVerificationResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IdVerificationResult)) {
            return false;
        }
        IdVerificationResult idVerificationResult = (IdVerificationResult) obj;
        return this.verified == idVerificationResult.verified && this.age == idVerificationResult.age && ValueObject.util_equals(this.first4, idVerificationResult.first4);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + (this.verified ? 1231 : 1237)) * 41) + this.age) * 41;
        String str = this.first4;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.first4 == null) {
            this.first4 = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
