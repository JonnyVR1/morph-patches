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
public class CertificationNewConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "certificationnewconfig";

    @ProtobufIndex(index = 2)
    public int femaleLimit;

    @ProtobufIndex(index = 1)
    public int maleLimit;
    public static ProtobufAdapter<CertificationNewConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<CertificationNewConfig>() { // from class: com.p1.mobile.putong.core.data.CertificationNewConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CertificationNewConfig certificationNewConfig) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, certificationNewConfig.maleLimit) + CodedOutputByteBufferNano.m17226h(2, certificationNewConfig.femaleLimit);
            certificationNewConfig.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CertificationNewConfig parse(nb5 nb5Var) throws IOException {
            CertificationNewConfig certificationNewConfig = new CertificationNewConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    certificationNewConfig.maleLimit = nb5Var.m158741j();
                } else {
                    if (iM158752u != 16) {
                        return certificationNewConfig;
                    }
                    certificationNewConfig.femaleLimit = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CertificationNewConfig certificationNewConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, certificationNewConfig.maleLimit);
            codedOutputByteBufferNano.m17250G(2, certificationNewConfig.femaleLimit);
        }
    };
    public static JsonAdapter<CertificationNewConfig> JSON_ADAPTER = new ObjectJsonAdapter<CertificationNewConfig>() { // from class: com.p1.mobile.putong.core.data.CertificationNewConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CertificationNewConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CertificationNewConfig newInstance() {
            return new CertificationNewConfig();
        }

        public boolean parseField(CertificationNewConfig certificationNewConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("femaleLimit")) {
                certificationNewConfig.femaleLimit = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("maleLimit")) {
                return false;
            }
            certificationNewConfig.maleLimit = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(CertificationNewConfig certificationNewConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("femaleLimit") || str.equals("maleLimit")) {
                return true;
            }
            return super.parseFieldCheck(certificationNewConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CertificationNewConfig certificationNewConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("maleLimit", certificationNewConfig.maleLimit);
            jsonGenerator.writeNumberField("femaleLimit", certificationNewConfig.femaleLimit);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CertificationNewConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CertificationNewConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CertificationNewConfig new_() {
        CertificationNewConfig certificationNewConfig = new CertificationNewConfig();
        certificationNewConfig.nullCheck();
        return certificationNewConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CertificationNewConfig mo223809clone() {
        CertificationNewConfig certificationNewConfig = new CertificationNewConfig();
        certificationNewConfig.maleLimit = this.maleLimit;
        certificationNewConfig.femaleLimit = this.femaleLimit;
        return certificationNewConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CertificationNewConfig)) {
            return false;
        }
        CertificationNewConfig certificationNewConfig = (CertificationNewConfig) obj;
        return this.maleLimit == certificationNewConfig.maleLimit && this.femaleLimit == certificationNewConfig.femaleLimit;
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
        int i2 = (((i * 41) + this.maleLimit) * 41) + this.femaleLimit;
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
