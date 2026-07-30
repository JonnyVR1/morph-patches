package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.facebook.AuthenticationTokenClaims;
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
public class Identity extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "identity";

    @NonNull
    @ProtobufIndex(index = 2)
    public Certificate certificate;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 3)
    public VerificationStatus status;
    public static ProtobufAdapter<Identity> PROTOBUF_ADAPTER = new MessageNanoAdapter<Identity>() { // from class: com.p1.mobile.putong.core.data.Identity.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Identity identity) {
            String str = identity.name;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            Certificate certificate = identity.certificate;
            if (certificate != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, certificate, Certificate.PROTOBUF_ADAPTER);
            }
            VerificationStatus verificationStatus = identity.status;
            if (verificationStatus != null) {
                iM17288o += CodedOutputByteBufferNano.m17281h(3, verificationStatus.ordinal());
            }
            VerificationStatus verificationStatus2 = identity.status;
            if (verificationStatus2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, verificationStatus2, VerificationStatus.PROTOBUF_ADAPTER);
            }
            identity.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Identity parse(nc5 nc5Var) throws IOException {
            Identity identity = new Identity();
            Integer numValueOf = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (identity.status == null && numValueOf != null) {
                        identity.status = (VerificationStatus) VerificationStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (identity.name == null) {
                        identity.name = "";
                    }
                    if (identity.certificate == null) {
                        identity.certificate = Certificate.new_();
                    }
                    if (identity.status != null) {
                        break;
                    }
                    identity.status = (VerificationStatus) VerificationStatus.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM162497u == 10) {
                    identity.name = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    identity.certificate = (Certificate) nc5Var.m162488l(Certificate.PROTOBUF_ADAPTER);
                } else if (iM162497u == 24) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else {
                    if (iM162497u != 34) {
                        if (identity.status == null && numValueOf != null) {
                            identity.status = (VerificationStatus) VerificationStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (identity.name == null) {
                            identity.name = "";
                        }
                        if (identity.certificate == null) {
                            identity.certificate = Certificate.new_();
                        }
                        if (identity.status != null) {
                            break;
                        }
                        identity.status = (VerificationStatus) VerificationStatus.JSON_ADAPTER.defaultEnum();
                        return identity;
                    }
                    identity.status = (VerificationStatus) nc5Var.m162488l(VerificationStatus.PROTOBUF_ADAPTER);
                }
            }
            return identity;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Identity identity, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = identity.name;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            Certificate certificate = identity.certificate;
            if (certificate != null) {
                codedOutputByteBufferNano.m17309K(2, certificate, Certificate.PROTOBUF_ADAPTER);
            }
            VerificationStatus verificationStatus = identity.status;
            if (verificationStatus != null) {
                codedOutputByteBufferNano.m17305G(3, verificationStatus.ordinal());
            }
            VerificationStatus verificationStatus2 = identity.status;
            if (verificationStatus2 != null) {
                codedOutputByteBufferNano.m17309K(4, verificationStatus2, VerificationStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Identity> JSON_ADAPTER = new ObjectJsonAdapter<Identity>() { // from class: com.p1.mobile.putong.core.data.Identity.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Identity.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Identity newInstance() {
            return new Identity();
        }

        public boolean parseField(Identity identity, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    identity.status = VerificationStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "name":
                    identity.name = jsonParser.getValueAsString();
                    return true;
                case "certificate":
                    identity.certificate = Certificate.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Identity identity, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "status":
                case "name":
                case "certificate":
                    return true;
                default:
                    return super.parseFieldCheck(identity, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Identity identity, JsonGenerator jsonGenerator) throws IOException {
            String str = identity.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            if (identity.certificate != null) {
                jsonGenerator.writeFieldName(Certificate.TYPE);
                Certificate.JSON_ADAPTER.serialize(identity.certificate, jsonGenerator, true);
            }
            if (identity.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                VerificationStatus.JSON_ADAPTER.serialize(identity.status, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Identity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Identity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Identity new_() {
        Identity identity = new Identity();
        identity.nullCheck();
        return identity;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Identity mo225055clone() {
        Identity identity = new Identity();
        identity.name = this.name;
        Certificate certificate = this.certificate;
        if (certificate != null) {
            identity.certificate = certificate.mo225055clone();
        }
        identity.status = this.status;
        return identity;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Identity)) {
            return false;
        }
        Identity identity = (Identity) obj;
        return ValueObject.util_equals(this.name, identity.name) && ValueObject.util_equals(this.certificate, identity.certificate) && ValueObject.util_equals(this.status, identity.status);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "identity";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        Certificate certificate = this.certificate;
        int iHashCode2 = (iHashCode + (certificate != null ? certificate.hashCode() : 0)) * 41;
        VerificationStatus verificationStatus = this.status;
        int iHashCode3 = iHashCode2 + (verificationStatus != null ? verificationStatus.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.certificate == null) {
            this.certificate = Certificate.new_();
        }
        if (this.status == null) {
            this.status = (VerificationStatus) VerificationStatus.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
