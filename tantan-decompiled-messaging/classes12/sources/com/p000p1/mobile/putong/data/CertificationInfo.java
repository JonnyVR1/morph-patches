package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class CertificationInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "certificationinfo";

    @Nullable
    @ProtobufIndex(index = 3)
    public String operator;

    @NonNull
    @ProtobufIndex(index = 1)
    public String thirdparty_access_token;

    @NonNull
    @ProtobufIndex(index = 2)
    public String thirdparty_id;
    public static ProtobufAdapter<CertificationInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<CertificationInfo>() { // from class: com.p1.mobile.putong.data.CertificationInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CertificationInfo certificationInfo) {
            String str = certificationInfo.thirdparty_access_token;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = certificationInfo.thirdparty_id;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = certificationInfo.operator;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) certificationInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CertificationInfo m17802parse(nb5 nb5Var) throws IOException {
            CertificationInfo certificationInfo = new CertificationInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (certificationInfo.thirdparty_access_token == null) {
                        certificationInfo.thirdparty_access_token = "";
                    }
                    if (certificationInfo.thirdparty_id != null) {
                        break;
                    }
                    certificationInfo.thirdparty_id = "";
                    break;
                }
                if (iU == 10) {
                    certificationInfo.thirdparty_access_token = nb5Var.s();
                } else if (iU == 18) {
                    certificationInfo.thirdparty_id = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (certificationInfo.thirdparty_access_token == null) {
                            certificationInfo.thirdparty_access_token = "";
                        }
                        if (certificationInfo.thirdparty_id != null) {
                            break;
                        }
                        certificationInfo.thirdparty_id = "";
                        return certificationInfo;
                    }
                    certificationInfo.operator = nb5Var.s();
                }
            }
            return certificationInfo;
        }

        public void serialize(CertificationInfo certificationInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = certificationInfo.thirdparty_access_token;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = certificationInfo.thirdparty_id;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = certificationInfo.operator;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<CertificationInfo> JSON_ADAPTER = new ObjectJsonAdapter<CertificationInfo>() { // from class: com.p1.mobile.putong.data.CertificationInfo.2
        public Class getDataClass() {
            return CertificationInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public CertificationInfo mo17830newInstance() {
            return new CertificationInfo();
        }

        public boolean parseField(CertificationInfo certificationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "operator":
                    certificationInfo.operator = jsonParser.getValueAsString();
                    return true;
                case "thirdparty_id":
                    certificationInfo.thirdparty_id = jsonParser.getValueAsString();
                    return true;
                case "thirdparty_access_token":
                    certificationInfo.thirdparty_access_token = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CertificationInfo certificationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "operator":
                case "thirdparty_id":
                case "thirdparty_access_token":
                    return true;
                default:
                    return super.parseFieldCheck(certificationInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CertificationInfo certificationInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = certificationInfo.thirdparty_access_token;
            if (str != null) {
                jsonGenerator.writeStringField("thirdparty_access_token", str);
            }
            String str2 = certificationInfo.thirdparty_id;
            if (str2 != null) {
                jsonGenerator.writeStringField("thirdparty_id", str2);
            }
            String str3 = certificationInfo.operator;
            if (str3 != null) {
                jsonGenerator.writeStringField("operator", str3);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CertificationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CertificationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CertificationInfo new_() {
        CertificationInfo certificationInfo = new CertificationInfo();
        certificationInfo.nullCheck();
        return certificationInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CertificationInfo m17801clone() {
        CertificationInfo certificationInfo = new CertificationInfo();
        certificationInfo.thirdparty_access_token = this.thirdparty_access_token;
        certificationInfo.thirdparty_id = this.thirdparty_id;
        certificationInfo.operator = this.operator;
        return certificationInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CertificationInfo)) {
            return false;
        }
        CertificationInfo certificationInfo = (CertificationInfo) obj;
        return ValueObject.util_equals(this.thirdparty_access_token, certificationInfo.thirdparty_access_token) && ValueObject.util_equals(this.thirdparty_id, certificationInfo.thirdparty_id) && ValueObject.util_equals(this.operator, certificationInfo.operator);
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
        String str = this.thirdparty_access_token;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.thirdparty_id;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.operator;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.thirdparty_access_token == null) {
            this.thirdparty_access_token = "";
        }
        if (this.thirdparty_id == null) {
            this.thirdparty_id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
