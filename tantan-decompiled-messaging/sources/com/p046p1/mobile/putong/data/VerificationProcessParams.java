package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class VerificationProcessParams extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "verificationprocessparams";

    @NonNull
    @ProtobufIndex(index = 1)
    public VerificationProcessIdentity identity;
    public static ProtobufAdapter<VerificationProcessParams> PROTOBUF_ADAPTER = new MessageNanoAdapter<VerificationProcessParams>() { // from class: com.p1.mobile.putong.data.VerificationProcessParams.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VerificationProcessParams verificationProcessParams) {
            VerificationProcessIdentity verificationProcessIdentity = verificationProcessParams.identity;
            int iM17230l = verificationProcessIdentity != null ? CodedOutputByteBufferNano.m17230l(1, verificationProcessIdentity, VerificationProcessIdentity.PROTOBUF_ADAPTER) : 0;
            verificationProcessParams.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VerificationProcessParams parse(nb5 nb5Var) throws IOException {
            VerificationProcessParams verificationProcessParams = new VerificationProcessParams();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (verificationProcessParams.identity != null) {
                        break;
                    }
                    verificationProcessParams.identity = VerificationProcessIdentity.new_();
                    break;
                }
                if (iM158752u != 10) {
                    if (verificationProcessParams.identity != null) {
                        break;
                    }
                    verificationProcessParams.identity = VerificationProcessIdentity.new_();
                    return verificationProcessParams;
                }
                verificationProcessParams.identity = (VerificationProcessIdentity) nb5Var.m158743l(VerificationProcessIdentity.PROTOBUF_ADAPTER);
            }
            return verificationProcessParams;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VerificationProcessParams verificationProcessParams, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            VerificationProcessIdentity verificationProcessIdentity = verificationProcessParams.identity;
            if (verificationProcessIdentity != null) {
                codedOutputByteBufferNano.m17254K(1, verificationProcessIdentity, VerificationProcessIdentity.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<VerificationProcessParams> JSON_ADAPTER = new ObjectJsonAdapter<VerificationProcessParams>() { // from class: com.p1.mobile.putong.data.VerificationProcessParams.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VerificationProcessParams.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VerificationProcessParams newInstance() {
            return new VerificationProcessParams();
        }

        public boolean parseField(VerificationProcessParams verificationProcessParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("identity")) {
                return false;
            }
            verificationProcessParams.identity = VerificationProcessIdentity.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(VerificationProcessParams verificationProcessParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("identity")) {
                return true;
            }
            return super.parseFieldCheck(verificationProcessParams, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VerificationProcessParams verificationProcessParams, JsonGenerator jsonGenerator) throws IOException {
            if (verificationProcessParams.identity != null) {
                jsonGenerator.writeFieldName("identity");
                VerificationProcessIdentity.JSON_ADAPTER.serialize(verificationProcessParams.identity, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerificationProcessParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerificationProcessParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VerificationProcessParams new_() {
        VerificationProcessParams verificationProcessParams = new VerificationProcessParams();
        verificationProcessParams.nullCheck();
        return verificationProcessParams;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VerificationProcessParams mo223809clone() {
        VerificationProcessParams verificationProcessParams = new VerificationProcessParams();
        VerificationProcessIdentity verificationProcessIdentity = this.identity;
        if (verificationProcessIdentity != null) {
            verificationProcessParams.identity = verificationProcessIdentity.mo223809clone();
        }
        return verificationProcessParams;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VerificationProcessParams) {
            return ValueObject.util_equals(this.identity, ((VerificationProcessParams) obj).identity);
        }
        return false;
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
        VerificationProcessIdentity verificationProcessIdentity = this.identity;
        int iHashCode = i2 + (verificationProcessIdentity != null ? verificationProcessIdentity.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.identity == null) {
            this.identity = VerificationProcessIdentity.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
