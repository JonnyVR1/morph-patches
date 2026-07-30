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
public class Certificate extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "certificate";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21100id;

    @NonNull
    @ProtobufIndex(index = 2)
    public CertificateType type;
    public static ProtobufAdapter<Certificate> PROTOBUF_ADAPTER = new MessageNanoAdapter<Certificate>() { // from class: com.p1.mobile.putong.core.data.Certificate.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Certificate certificate) {
            String str = certificate.f21100id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            CertificateType certificateType = certificate.type;
            if (certificateType != null) {
                iM17288o += CodedOutputByteBufferNano.m17281h(2, certificateType.ordinal());
            }
            CertificateType certificateType2 = certificate.type;
            if (certificateType2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, certificateType2, CertificateType.PROTOBUF_ADAPTER);
            }
            certificate.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Certificate parse(nc5 nc5Var) throws IOException {
            Certificate certificate = new Certificate();
            Integer numValueOf = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (certificate.type == null && numValueOf != null) {
                        certificate.type = (CertificateType) CertificateType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (certificate.f21100id == null) {
                        certificate.f21100id = "";
                    }
                    if (certificate.type != null) {
                        break;
                    }
                    certificate.type = (CertificateType) CertificateType.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM162497u == 10) {
                    certificate.f21100id = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else {
                    if (iM162497u != 26) {
                        if (certificate.type == null && numValueOf != null) {
                            certificate.type = (CertificateType) CertificateType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (certificate.f21100id == null) {
                            certificate.f21100id = "";
                        }
                        if (certificate.type != null) {
                            break;
                        }
                        certificate.type = (CertificateType) CertificateType.JSON_ADAPTER.defaultEnum();
                        return certificate;
                    }
                    certificate.type = (CertificateType) nc5Var.m162488l(CertificateType.PROTOBUF_ADAPTER);
                }
            }
            return certificate;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Certificate certificate, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = certificate.f21100id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            CertificateType certificateType = certificate.type;
            if (certificateType != null) {
                codedOutputByteBufferNano.m17305G(2, certificateType.ordinal());
            }
            CertificateType certificateType2 = certificate.type;
            if (certificateType2 != null) {
                codedOutputByteBufferNano.m17309K(3, certificateType2, CertificateType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Certificate> JSON_ADAPTER = new ObjectJsonAdapter<Certificate>() { // from class: com.p1.mobile.putong.core.data.Certificate.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Certificate.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Certificate newInstance() {
            return new Certificate();
        }

        public boolean parseField(Certificate certificate, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                certificate.f21100id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("type")) {
                return false;
            }
            certificate.type = CertificateType.JSON_ADAPTER.parse(jsonParser, str2);
            return true;
        }

        public boolean parseFieldCheck(Certificate certificate, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("type")) {
                return true;
            }
            return super.parseFieldCheck(certificate, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Certificate certificate, JsonGenerator jsonGenerator) throws IOException {
            String str = certificate.f21100id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (certificate.type != null) {
                jsonGenerator.writeFieldName("type");
                CertificateType.JSON_ADAPTER.serialize(certificate.type, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Certificate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Certificate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Certificate new_() {
        Certificate certificate = new Certificate();
        certificate.nullCheck();
        return certificate;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Certificate mo225055clone() {
        Certificate certificate = new Certificate();
        certificate.f21100id = this.f21100id;
        certificate.type = this.type;
        return certificate;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Certificate)) {
            return false;
        }
        Certificate certificate = (Certificate) obj;
        return ValueObject.util_equals(this.f21100id, certificate.f21100id) && ValueObject.util_equals(this.type, certificate.type);
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
        String str = this.f21100id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        CertificateType certificateType = this.type;
        int iHashCode2 = iHashCode + (certificateType != null ? certificateType.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21100id == null) {
            this.f21100id = "";
        }
        if (this.type == null) {
            this.type = (CertificateType) CertificateType.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
