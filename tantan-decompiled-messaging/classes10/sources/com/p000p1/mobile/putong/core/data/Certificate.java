package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class Certificate extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "certificate";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public CertificateType type;
    public static ProtobufAdapter<Certificate> PROTOBUF_ADAPTER = new MessageNanoAdapter<Certificate>() { // from class: com.p1.mobile.putong.core.data.Certificate.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Certificate certificate) {
            String str = certificate.f20id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            CertificateType certificateType = certificate.type;
            if (certificateType != null) {
                iO += CodedOutputByteBufferNano.h(2, certificateType.ordinal());
            }
            CertificateType certificateType2 = certificate.type;
            if (certificateType2 != null) {
                iO += CodedOutputByteBufferNano.l(3, certificateType2, CertificateType.PROTOBUF_ADAPTER);
            }
            ((MessageNano) certificate).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Certificate m11935parse(nb5 nb5Var) throws IOException {
            Certificate certificate = new Certificate();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (certificate.type == null && numValueOf != null) {
                        certificate.type = (CertificateType) CertificateType.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                    }
                    if (certificate.f20id == null) {
                        certificate.f20id = "";
                    }
                    if (certificate.type != null) {
                        break;
                    }
                    certificate.type = (CertificateType) CertificateType.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 10) {
                    certificate.f20id = nb5Var.s();
                } else if (iU == 16) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else {
                    if (iU != 26) {
                        if (certificate.type == null && numValueOf != null) {
                            certificate.type = (CertificateType) CertificateType.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (certificate.f20id == null) {
                            certificate.f20id = "";
                        }
                        if (certificate.type != null) {
                            break;
                        }
                        certificate.type = (CertificateType) CertificateType.JSON_ADAPTER.defaultEnum();
                        return certificate;
                    }
                    certificate.type = (CertificateType) nb5Var.l(CertificateType.PROTOBUF_ADAPTER);
                }
            }
            return certificate;
        }

        public void serialize(Certificate certificate, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = certificate.f20id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            CertificateType certificateType = certificate.type;
            if (certificateType != null) {
                codedOutputByteBufferNano.G(2, certificateType.ordinal());
            }
            CertificateType certificateType2 = certificate.type;
            if (certificateType2 != null) {
                codedOutputByteBufferNano.K(3, certificateType2, CertificateType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Certificate> JSON_ADAPTER = new ObjectJsonAdapter<Certificate>() { // from class: com.p1.mobile.putong.core.data.Certificate.2
        public Class getDataClass() {
            return Certificate.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Certificate m11936newInstance() {
            return new Certificate();
        }

        public boolean parseField(Certificate certificate, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                certificate.f20id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("type")) {
                return false;
            }
            certificate.type = (CertificateType) CertificateType.JSON_ADAPTER.parse(jsonParser, str2);
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

        public void serializeFields(Certificate certificate, JsonGenerator jsonGenerator) throws IOException {
            String str = certificate.f20id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (certificate.type != null) {
                jsonGenerator.writeFieldName("type");
                CertificateType.JSON_ADAPTER.serialize(certificate.type, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Certificate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Certificate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Certificate new_() {
        Certificate certificate = new Certificate();
        certificate.nullCheck();
        return certificate;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Certificate m11934clone() {
        Certificate certificate = new Certificate();
        certificate.f20id = this.f20id;
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
        return ValueObject.util_equals(this.f20id, certificate.f20id) && ValueObject.util_equals(this.type, certificate.type);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f20id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        CertificateType certificateType = this.type;
        int iHashCode2 = iHashCode + (certificateType != null ? certificateType.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f20id == null) {
            this.f20id = "";
        }
        if (this.type == null) {
            this.type = (CertificateType) CertificateType.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
