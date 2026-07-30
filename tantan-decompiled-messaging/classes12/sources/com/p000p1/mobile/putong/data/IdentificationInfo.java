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
public class IdentificationInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "identificationinfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public String identificationID;

    @NonNull
    @ProtobufIndex(index = 3)
    public String identificationType;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 4)
    public String zhiMaCertificationResult;
    public static ProtobufAdapter<IdentificationInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<IdentificationInfo>() { // from class: com.p1.mobile.putong.data.IdentificationInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IdentificationInfo identificationInfo) {
            String str = identificationInfo.name;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = identificationInfo.identificationID;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = identificationInfo.identificationType;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = identificationInfo.zhiMaCertificationResult;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) identificationInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IdentificationInfo m18217parse(nb5 nb5Var) throws IOException {
            IdentificationInfo identificationInfo = new IdentificationInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (identificationInfo.name == null) {
                        identificationInfo.name = "";
                    }
                    if (identificationInfo.identificationID == null) {
                        identificationInfo.identificationID = "";
                    }
                    if (identificationInfo.identificationType == null) {
                        identificationInfo.identificationType = "";
                    }
                    if (identificationInfo.zhiMaCertificationResult != null) {
                        break;
                    }
                    identificationInfo.zhiMaCertificationResult = "";
                    break;
                }
                if (iU == 10) {
                    identificationInfo.name = nb5Var.s();
                } else if (iU == 18) {
                    identificationInfo.identificationID = nb5Var.s();
                } else if (iU == 26) {
                    identificationInfo.identificationType = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (identificationInfo.name == null) {
                            identificationInfo.name = "";
                        }
                        if (identificationInfo.identificationID == null) {
                            identificationInfo.identificationID = "";
                        }
                        if (identificationInfo.identificationType == null) {
                            identificationInfo.identificationType = "";
                        }
                        if (identificationInfo.zhiMaCertificationResult != null) {
                            break;
                        }
                        identificationInfo.zhiMaCertificationResult = "";
                        return identificationInfo;
                    }
                    identificationInfo.zhiMaCertificationResult = nb5Var.s();
                }
            }
            return identificationInfo;
        }

        public void serialize(IdentificationInfo identificationInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = identificationInfo.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = identificationInfo.identificationID;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = identificationInfo.identificationType;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = identificationInfo.zhiMaCertificationResult;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<IdentificationInfo> JSON_ADAPTER = new ObjectJsonAdapter<IdentificationInfo>() { // from class: com.p1.mobile.putong.data.IdentificationInfo.2
        public Class getDataClass() {
            return IdentificationInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public IdentificationInfo mo17830newInstance() {
            return new IdentificationInfo();
        }

        public boolean parseField(IdentificationInfo identificationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "identificationID":
                    identificationInfo.identificationID = jsonParser.getValueAsString();
                    return true;
                case "name":
                    identificationInfo.name = jsonParser.getValueAsString();
                    return true;
                case "identificationType":
                    identificationInfo.identificationType = jsonParser.getValueAsString();
                    return true;
                case "zhiMaCertificationResult":
                    identificationInfo.zhiMaCertificationResult = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IdentificationInfo identificationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "identificationID":
                case "name":
                case "identificationType":
                case "zhiMaCertificationResult":
                    return true;
                default:
                    return super.parseFieldCheck(identificationInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IdentificationInfo identificationInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = identificationInfo.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            String str2 = identificationInfo.identificationID;
            if (str2 != null) {
                jsonGenerator.writeStringField("identificationID", str2);
            }
            String str3 = identificationInfo.identificationType;
            if (str3 != null) {
                jsonGenerator.writeStringField("identificationType", str3);
            }
            String str4 = identificationInfo.zhiMaCertificationResult;
            if (str4 != null) {
                jsonGenerator.writeStringField("zhiMaCertificationResult", str4);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IdentificationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IdentificationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IdentificationInfo new_() {
        IdentificationInfo identificationInfo = new IdentificationInfo();
        identificationInfo.nullCheck();
        return identificationInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IdentificationInfo m18216clone() {
        IdentificationInfo identificationInfo = new IdentificationInfo();
        identificationInfo.name = this.name;
        identificationInfo.identificationID = this.identificationID;
        identificationInfo.identificationType = this.identificationType;
        identificationInfo.zhiMaCertificationResult = this.zhiMaCertificationResult;
        return identificationInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IdentificationInfo)) {
            return false;
        }
        IdentificationInfo identificationInfo = (IdentificationInfo) obj;
        return ValueObject.util_equals(this.name, identificationInfo.name) && ValueObject.util_equals(this.identificationID, identificationInfo.identificationID) && ValueObject.util_equals(this.identificationType, identificationInfo.identificationType) && ValueObject.util_equals(this.zhiMaCertificationResult, identificationInfo.zhiMaCertificationResult);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.identificationID;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.identificationType;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.zhiMaCertificationResult;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.identificationID == null) {
            this.identificationID = "";
        }
        if (this.identificationType == null) {
            this.identificationType = "";
        }
        if (this.zhiMaCertificationResult == null) {
            this.zhiMaCertificationResult = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
