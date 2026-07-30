package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class CertificationConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "certificationconfig";

    @ProtobufIndex(index = 1)
    public boolean newVerificationSwitch;
    public static ProtobufAdapter<CertificationConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<CertificationConfig>() { // from class: com.p1.mobile.putong.core.data.CertificationConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CertificationConfig certificationConfig) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, certificationConfig.newVerificationSwitch);
            certificationConfig.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CertificationConfig parse(nb5 nb5Var) throws IOException {
            CertificationConfig certificationConfig = new CertificationConfig();
            while (nb5Var.m158752u() == 8) {
                certificationConfig.newVerificationSwitch = nb5Var.m158738g();
            }
            return certificationConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CertificationConfig certificationConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, certificationConfig.newVerificationSwitch);
        }
    };
    public static JsonAdapter<CertificationConfig> JSON_ADAPTER = new ObjectJsonAdapter<CertificationConfig>() { // from class: com.p1.mobile.putong.core.data.CertificationConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CertificationConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CertificationConfig newInstance() {
            return new CertificationConfig();
        }

        public boolean parseField(CertificationConfig certificationConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("newVerificationSwitch")) {
                return false;
            }
            certificationConfig.newVerificationSwitch = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(CertificationConfig certificationConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("newVerificationSwitch")) {
                return true;
            }
            return super.parseFieldCheck(certificationConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CertificationConfig certificationConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("newVerificationSwitch", certificationConfig.newVerificationSwitch);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CertificationConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CertificationConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CertificationConfig new_() {
        CertificationConfig certificationConfig = new CertificationConfig();
        certificationConfig.nullCheck();
        return certificationConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CertificationConfig mo223809clone() {
        CertificationConfig certificationConfig = new CertificationConfig();
        certificationConfig.newVerificationSwitch = this.newVerificationSwitch;
        return certificationConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof CertificationConfig) && this.newVerificationSwitch == ((CertificationConfig) obj).newVerificationSwitch;
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
        int i2 = (i * 41) + (this.newVerificationSwitch ? 1231 : 1237);
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
