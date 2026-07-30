package com.p000p1.mobile.putong.core.data;

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
public class CertificationNewConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "certificationnewconfig";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int femaleLimit;

    @ProtobufIndex(index = 1)
    public int maleLimit;
    public static ProtobufAdapter<CertificationNewConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<CertificationNewConfig>() { // from class: com.p1.mobile.putong.core.data.CertificationNewConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CertificationNewConfig certificationNewConfig) {
            int iH = CodedOutputByteBufferNano.h(1, certificationNewConfig.maleLimit) + CodedOutputByteBufferNano.h(2, certificationNewConfig.femaleLimit);
            ((MessageNano) certificationNewConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CertificationNewConfig m11945parse(nb5 nb5Var) throws IOException {
            CertificationNewConfig certificationNewConfig = new CertificationNewConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    certificationNewConfig.maleLimit = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return certificationNewConfig;
                    }
                    certificationNewConfig.femaleLimit = nb5Var.j();
                }
            }
        }

        public void serialize(CertificationNewConfig certificationNewConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, certificationNewConfig.maleLimit);
            codedOutputByteBufferNano.G(2, certificationNewConfig.femaleLimit);
        }
    };
    public static JsonAdapter<CertificationNewConfig> JSON_ADAPTER = new ObjectJsonAdapter<CertificationNewConfig>() { // from class: com.p1.mobile.putong.core.data.CertificationNewConfig.2
        public Class getDataClass() {
            return CertificationNewConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CertificationNewConfig m11946newInstance() {
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

        public void serializeFields(CertificationNewConfig certificationNewConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("maleLimit", certificationNewConfig.maleLimit);
            jsonGenerator.writeNumberField("femaleLimit", certificationNewConfig.femaleLimit);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CertificationNewConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CertificationNewConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CertificationNewConfig new_() {
        CertificationNewConfig certificationNewConfig = new CertificationNewConfig();
        certificationNewConfig.nullCheck();
        return certificationNewConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CertificationNewConfig m11944clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.maleLimit) * 41) + this.femaleLimit;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
