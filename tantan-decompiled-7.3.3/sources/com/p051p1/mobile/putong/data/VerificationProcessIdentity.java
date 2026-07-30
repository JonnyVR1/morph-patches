package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class VerificationProcessIdentity extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "verificationprocessidentity";

    @NonNull
    @ProtobufIndex(index = 2)
    public String certifyId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String provider;
    public static ProtobufAdapter<VerificationProcessIdentity> PROTOBUF_ADAPTER = new MessageNanoAdapter<VerificationProcessIdentity>() { // from class: com.p1.mobile.putong.data.VerificationProcessIdentity.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VerificationProcessIdentity verificationProcessIdentity) {
            String str = verificationProcessIdentity.provider;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = verificationProcessIdentity.certifyId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            verificationProcessIdentity.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VerificationProcessIdentity parse(nc5 nc5Var) throws IOException {
            VerificationProcessIdentity verificationProcessIdentity = new VerificationProcessIdentity();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (verificationProcessIdentity.provider == null) {
                        verificationProcessIdentity.provider = "";
                    }
                    if (verificationProcessIdentity.certifyId != null) {
                        break;
                    }
                    verificationProcessIdentity.certifyId = "";
                    break;
                }
                if (iM162497u == 10) {
                    verificationProcessIdentity.provider = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (verificationProcessIdentity.provider == null) {
                            verificationProcessIdentity.provider = "";
                        }
                        if (verificationProcessIdentity.certifyId != null) {
                            break;
                        }
                        verificationProcessIdentity.certifyId = "";
                        return verificationProcessIdentity;
                    }
                    verificationProcessIdentity.certifyId = nc5Var.m162495s();
                }
            }
            return verificationProcessIdentity;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VerificationProcessIdentity verificationProcessIdentity, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = verificationProcessIdentity.provider;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = verificationProcessIdentity.certifyId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<VerificationProcessIdentity> JSON_ADAPTER = new ObjectJsonAdapter<VerificationProcessIdentity>() { // from class: com.p1.mobile.putong.data.VerificationProcessIdentity.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VerificationProcessIdentity.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VerificationProcessIdentity newInstance() {
            return new VerificationProcessIdentity();
        }

        public boolean parseField(VerificationProcessIdentity verificationProcessIdentity, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("certifyId")) {
                verificationProcessIdentity.certifyId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("provider")) {
                return false;
            }
            verificationProcessIdentity.provider = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(VerificationProcessIdentity verificationProcessIdentity, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("certifyId") || str.equals("provider")) {
                return true;
            }
            return super.parseFieldCheck(verificationProcessIdentity, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VerificationProcessIdentity verificationProcessIdentity, JsonGenerator jsonGenerator) throws IOException {
            String str = verificationProcessIdentity.provider;
            if (str != null) {
                jsonGenerator.writeStringField("provider", str);
            }
            String str2 = verificationProcessIdentity.certifyId;
            if (str2 != null) {
                jsonGenerator.writeStringField("certifyId", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerificationProcessIdentity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerificationProcessIdentity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VerificationProcessIdentity new_() {
        VerificationProcessIdentity verificationProcessIdentity = new VerificationProcessIdentity();
        verificationProcessIdentity.nullCheck();
        return verificationProcessIdentity;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VerificationProcessIdentity mo225055clone() {
        VerificationProcessIdentity verificationProcessIdentity = new VerificationProcessIdentity();
        verificationProcessIdentity.provider = this.provider;
        verificationProcessIdentity.certifyId = this.certifyId;
        return verificationProcessIdentity;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerificationProcessIdentity)) {
            return false;
        }
        VerificationProcessIdentity verificationProcessIdentity = (VerificationProcessIdentity) obj;
        return ValueObject.util_equals(this.provider, verificationProcessIdentity.provider) && ValueObject.util_equals(this.certifyId, verificationProcessIdentity.certifyId);
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
        String str = this.provider;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.certifyId;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.provider == null) {
            this.provider = "";
        }
        if (this.certifyId == null) {
            this.certifyId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
