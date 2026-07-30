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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VerificationProcessIdentity verificationProcessIdentity) {
            String str = verificationProcessIdentity.provider;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = verificationProcessIdentity.certifyId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) verificationProcessIdentity).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VerificationProcessIdentity m19271parse(nb5 nb5Var) throws IOException {
            VerificationProcessIdentity verificationProcessIdentity = new VerificationProcessIdentity();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (verificationProcessIdentity.provider == null) {
                        verificationProcessIdentity.provider = "";
                    }
                    if (verificationProcessIdentity.certifyId != null) {
                        break;
                    }
                    verificationProcessIdentity.certifyId = "";
                    break;
                }
                if (iU == 10) {
                    verificationProcessIdentity.provider = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (verificationProcessIdentity.provider == null) {
                            verificationProcessIdentity.provider = "";
                        }
                        if (verificationProcessIdentity.certifyId != null) {
                            break;
                        }
                        verificationProcessIdentity.certifyId = "";
                        return verificationProcessIdentity;
                    }
                    verificationProcessIdentity.certifyId = nb5Var.s();
                }
            }
            return verificationProcessIdentity;
        }

        public void serialize(VerificationProcessIdentity verificationProcessIdentity, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = verificationProcessIdentity.provider;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = verificationProcessIdentity.certifyId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<VerificationProcessIdentity> JSON_ADAPTER = new ObjectJsonAdapter<VerificationProcessIdentity>() { // from class: com.p1.mobile.putong.data.VerificationProcessIdentity.2
        public Class getDataClass() {
            return VerificationProcessIdentity.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public VerificationProcessIdentity mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerificationProcessIdentity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerificationProcessIdentity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VerificationProcessIdentity new_() {
        VerificationProcessIdentity verificationProcessIdentity = new VerificationProcessIdentity();
        verificationProcessIdentity.nullCheck();
        return verificationProcessIdentity;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VerificationProcessIdentity m19270clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.provider;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.certifyId;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.provider == null) {
            this.provider = "";
        }
        if (this.certifyId == null) {
            this.certifyId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
