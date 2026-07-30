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
public class PicVerificationResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "picverificationresult";

    @ProtobufIndex(index = 1)
    public boolean verified;
    public static ProtobufAdapter<PicVerificationResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<PicVerificationResult>() { // from class: com.p1.mobile.putong.data.PicVerificationResult.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PicVerificationResult picVerificationResult) {
            int iB = CodedOutputByteBufferNano.b(1, picVerificationResult.verified);
            ((MessageNano) picVerificationResult).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PicVerificationResult m18804parse(nb5 nb5Var) throws IOException {
            PicVerificationResult picVerificationResult = new PicVerificationResult();
            while (nb5Var.u() == 8) {
                picVerificationResult.verified = nb5Var.g();
            }
            return picVerificationResult;
        }

        public void serialize(PicVerificationResult picVerificationResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, picVerificationResult.verified);
        }
    };
    public static JsonAdapter<PicVerificationResult> JSON_ADAPTER = new ObjectJsonAdapter<PicVerificationResult>() { // from class: com.p1.mobile.putong.data.PicVerificationResult.2
        public Class getDataClass() {
            return PicVerificationResult.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public PicVerificationResult mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PicVerificationResult picVerificationResult, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("verified", picVerificationResult.verified);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PicVerificationResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PicVerificationResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PicVerificationResult new_() {
        PicVerificationResult picVerificationResult = new PicVerificationResult();
        picVerificationResult.nullCheck();
        return picVerificationResult;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PicVerificationResult m18803clone() {
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
