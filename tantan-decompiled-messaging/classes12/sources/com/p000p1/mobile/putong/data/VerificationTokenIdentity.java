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
public class VerificationTokenIdentity extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "verificationtokenidentity";

    @ProtobufIndex(index = 5)
    public boolean dynamicProvider;

    @NonNull
    @ProtobufIndex(index = 2)
    public String identityName;

    @NonNull
    @ProtobufIndex(index = 3)
    public String identityNumber;

    @NonNull
    @ProtobufIndex(index = 7)
    public String metaInfo;

    @NonNull
    @ProtobufIndex(index = 1)
    public String provider;

    @NonNull
    @ProtobufIndex(index = 4)
    public String providerAppId;

    @ProtobufIndex(index = 6)
    public boolean upgrade;
    public static ProtobufAdapter<VerificationTokenIdentity> PROTOBUF_ADAPTER = new MessageNanoAdapter<VerificationTokenIdentity>() { // from class: com.p1.mobile.putong.data.VerificationTokenIdentity.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VerificationTokenIdentity verificationTokenIdentity) {
            String str = verificationTokenIdentity.provider;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = verificationTokenIdentity.identityName;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = verificationTokenIdentity.identityNumber;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = verificationTokenIdentity.providerAppId;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            int iB = iO + CodedOutputByteBufferNano.b(5, verificationTokenIdentity.dynamicProvider) + CodedOutputByteBufferNano.b(6, verificationTokenIdentity.upgrade);
            String str5 = verificationTokenIdentity.metaInfo;
            if (str5 != null) {
                iB += CodedOutputByteBufferNano.o(7, str5);
            }
            ((MessageNano) verificationTokenIdentity).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VerificationTokenIdentity m19286parse(nb5 nb5Var) throws IOException {
            VerificationTokenIdentity verificationTokenIdentity = new VerificationTokenIdentity();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (verificationTokenIdentity.provider == null) {
                        verificationTokenIdentity.provider = "";
                    }
                    if (verificationTokenIdentity.identityName == null) {
                        verificationTokenIdentity.identityName = "";
                    }
                    if (verificationTokenIdentity.identityNumber == null) {
                        verificationTokenIdentity.identityNumber = "";
                    }
                    if (verificationTokenIdentity.providerAppId == null) {
                        verificationTokenIdentity.providerAppId = "";
                    }
                    if (verificationTokenIdentity.metaInfo != null) {
                        break;
                    }
                    verificationTokenIdentity.metaInfo = "";
                    break;
                }
                if (iU == 10) {
                    verificationTokenIdentity.provider = nb5Var.s();
                } else if (iU == 18) {
                    verificationTokenIdentity.identityName = nb5Var.s();
                } else if (iU == 26) {
                    verificationTokenIdentity.identityNumber = nb5Var.s();
                } else if (iU == 34) {
                    verificationTokenIdentity.providerAppId = nb5Var.s();
                } else if (iU == 40) {
                    verificationTokenIdentity.dynamicProvider = nb5Var.g();
                } else if (iU == 48) {
                    verificationTokenIdentity.upgrade = nb5Var.g();
                } else {
                    if (iU != 58) {
                        if (verificationTokenIdentity.provider == null) {
                            verificationTokenIdentity.provider = "";
                        }
                        if (verificationTokenIdentity.identityName == null) {
                            verificationTokenIdentity.identityName = "";
                        }
                        if (verificationTokenIdentity.identityNumber == null) {
                            verificationTokenIdentity.identityNumber = "";
                        }
                        if (verificationTokenIdentity.providerAppId == null) {
                            verificationTokenIdentity.providerAppId = "";
                        }
                        if (verificationTokenIdentity.metaInfo != null) {
                            break;
                        }
                        verificationTokenIdentity.metaInfo = "";
                        return verificationTokenIdentity;
                    }
                    verificationTokenIdentity.metaInfo = nb5Var.s();
                }
            }
            return verificationTokenIdentity;
        }

        public void serialize(VerificationTokenIdentity verificationTokenIdentity, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = verificationTokenIdentity.provider;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = verificationTokenIdentity.identityName;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = verificationTokenIdentity.identityNumber;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = verificationTokenIdentity.providerAppId;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            codedOutputByteBufferNano.A(5, verificationTokenIdentity.dynamicProvider);
            codedOutputByteBufferNano.A(6, verificationTokenIdentity.upgrade);
            String str5 = verificationTokenIdentity.metaInfo;
            if (str5 != null) {
                codedOutputByteBufferNano.R(7, str5);
            }
        }
    };
    public static JsonAdapter<VerificationTokenIdentity> JSON_ADAPTER = new ObjectJsonAdapter<VerificationTokenIdentity>() { // from class: com.p1.mobile.putong.data.VerificationTokenIdentity.2
        public Class getDataClass() {
            return VerificationTokenIdentity.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public VerificationTokenIdentity mo17830newInstance() {
            return new VerificationTokenIdentity();
        }

        public boolean parseField(VerificationTokenIdentity verificationTokenIdentity, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "provider":
                    verificationTokenIdentity.provider = jsonParser.getValueAsString();
                    return true;
                case "metaInfo":
                    verificationTokenIdentity.metaInfo = jsonParser.getValueAsString();
                    return true;
                case "upgrade":
                    verificationTokenIdentity.upgrade = jsonParser.getValueAsBoolean();
                    return true;
                case "identityNumber":
                    verificationTokenIdentity.identityNumber = jsonParser.getValueAsString();
                    return true;
                case "providerAppId":
                    verificationTokenIdentity.providerAppId = jsonParser.getValueAsString();
                    return true;
                case "identityName":
                    verificationTokenIdentity.identityName = jsonParser.getValueAsString();
                    return true;
                case "dynamicProvider":
                    verificationTokenIdentity.dynamicProvider = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VerificationTokenIdentity verificationTokenIdentity, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "provider":
                case "metaInfo":
                case "upgrade":
                case "identityNumber":
                case "providerAppId":
                case "identityName":
                case "dynamicProvider":
                    return true;
                default:
                    return super.parseFieldCheck(verificationTokenIdentity, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VerificationTokenIdentity verificationTokenIdentity, JsonGenerator jsonGenerator) throws IOException {
            String str = verificationTokenIdentity.provider;
            if (str != null) {
                jsonGenerator.writeStringField("provider", str);
            }
            String str2 = verificationTokenIdentity.identityName;
            if (str2 != null) {
                jsonGenerator.writeStringField("identityName", str2);
            }
            String str3 = verificationTokenIdentity.identityNumber;
            if (str3 != null) {
                jsonGenerator.writeStringField("identityNumber", str3);
            }
            String str4 = verificationTokenIdentity.providerAppId;
            if (str4 != null) {
                jsonGenerator.writeStringField("providerAppId", str4);
            }
            jsonGenerator.writeBooleanField("dynamicProvider", verificationTokenIdentity.dynamicProvider);
            jsonGenerator.writeBooleanField("upgrade", verificationTokenIdentity.upgrade);
            String str5 = verificationTokenIdentity.metaInfo;
            if (str5 != null) {
                jsonGenerator.writeStringField("metaInfo", str5);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerificationTokenIdentity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerificationTokenIdentity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VerificationTokenIdentity new_() {
        VerificationTokenIdentity verificationTokenIdentity = new VerificationTokenIdentity();
        verificationTokenIdentity.nullCheck();
        return verificationTokenIdentity;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VerificationTokenIdentity m19285clone() {
        VerificationTokenIdentity verificationTokenIdentity = new VerificationTokenIdentity();
        verificationTokenIdentity.provider = this.provider;
        verificationTokenIdentity.identityName = this.identityName;
        verificationTokenIdentity.identityNumber = this.identityNumber;
        verificationTokenIdentity.providerAppId = this.providerAppId;
        verificationTokenIdentity.dynamicProvider = this.dynamicProvider;
        verificationTokenIdentity.upgrade = this.upgrade;
        verificationTokenIdentity.metaInfo = this.metaInfo;
        return verificationTokenIdentity;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerificationTokenIdentity)) {
            return false;
        }
        VerificationTokenIdentity verificationTokenIdentity = (VerificationTokenIdentity) obj;
        return ValueObject.util_equals(this.provider, verificationTokenIdentity.provider) && ValueObject.util_equals(this.identityName, verificationTokenIdentity.identityName) && ValueObject.util_equals(this.identityNumber, verificationTokenIdentity.identityNumber) && ValueObject.util_equals(this.providerAppId, verificationTokenIdentity.providerAppId) && this.dynamicProvider == verificationTokenIdentity.dynamicProvider && this.upgrade == verificationTokenIdentity.upgrade && ValueObject.util_equals(this.metaInfo, verificationTokenIdentity.metaInfo);
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
        String str2 = this.identityName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.identityNumber;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.providerAppId;
        int iHashCode4 = (((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.dynamicProvider ? 1231 : 1237)) * 41) + (this.upgrade ? 1231 : 1237)) * 41;
        String str5 = this.metaInfo;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.provider == null) {
            this.provider = "";
        }
        if (this.identityName == null) {
            this.identityName = "";
        }
        if (this.identityNumber == null) {
            this.identityNumber = "";
        }
        if (this.providerAppId == null) {
            this.providerAppId = "";
        }
        if (this.metaInfo == null) {
            this.metaInfo = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
