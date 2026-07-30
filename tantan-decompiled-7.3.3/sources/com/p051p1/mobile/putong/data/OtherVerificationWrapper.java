package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class OtherVerificationWrapper extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "otherverificationwrapper";

    @NonNull
    @ProtobufIndex(index = 6)
    public VerificationResult otherCTDID;

    @NonNull
    @ProtobufIndex(index = 2)
    public VerificationResult otherDVIPCompany;

    @NonNull
    @ProtobufIndex(index = 3)
    public VerificationResult otherDVIPJob;

    @NonNull
    @ProtobufIndex(index = 5)
    public VerificationResult otherDVIPMembership;

    @NonNull
    @ProtobufIndex(index = 4)
    public VerificationResult otherDVIPSalary;

    @NonNull
    @ProtobufIndex(index = 1)
    public VerificationResult otherDVIPSchool;
    public static ProtobufAdapter<OtherVerificationWrapper> PROTOBUF_ADAPTER = new MessageNanoAdapter<OtherVerificationWrapper>() { // from class: com.p1.mobile.putong.data.OtherVerificationWrapper.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OtherVerificationWrapper otherVerificationWrapper) {
            VerificationResult verificationResult = otherVerificationWrapper.otherDVIPSchool;
            int iM17285l = verificationResult != null ? CodedOutputByteBufferNano.m17285l(1, verificationResult, VerificationResult.PROTOBUF_ADAPTER) : 0;
            VerificationResult verificationResult2 = otherVerificationWrapper.otherDVIPCompany;
            if (verificationResult2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, verificationResult2, VerificationResult.PROTOBUF_ADAPTER);
            }
            VerificationResult verificationResult3 = otherVerificationWrapper.otherDVIPJob;
            if (verificationResult3 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, verificationResult3, VerificationResult.PROTOBUF_ADAPTER);
            }
            VerificationResult verificationResult4 = otherVerificationWrapper.otherDVIPSalary;
            if (verificationResult4 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(4, verificationResult4, VerificationResult.PROTOBUF_ADAPTER);
            }
            VerificationResult verificationResult5 = otherVerificationWrapper.otherDVIPMembership;
            if (verificationResult5 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(5, verificationResult5, VerificationResult.PROTOBUF_ADAPTER);
            }
            VerificationResult verificationResult6 = otherVerificationWrapper.otherCTDID;
            if (verificationResult6 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(6, verificationResult6, VerificationResult.PROTOBUF_ADAPTER);
            }
            otherVerificationWrapper.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OtherVerificationWrapper parse(nc5 nc5Var) throws IOException {
            OtherVerificationWrapper otherVerificationWrapper = new OtherVerificationWrapper();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (otherVerificationWrapper.otherDVIPSchool == null) {
                        otherVerificationWrapper.otherDVIPSchool = VerificationResult.new_();
                    }
                    if (otherVerificationWrapper.otherDVIPCompany == null) {
                        otherVerificationWrapper.otherDVIPCompany = VerificationResult.new_();
                    }
                    if (otherVerificationWrapper.otherDVIPJob == null) {
                        otherVerificationWrapper.otherDVIPJob = VerificationResult.new_();
                    }
                    if (otherVerificationWrapper.otherDVIPSalary == null) {
                        otherVerificationWrapper.otherDVIPSalary = VerificationResult.new_();
                    }
                    if (otherVerificationWrapper.otherDVIPMembership == null) {
                        otherVerificationWrapper.otherDVIPMembership = VerificationResult.new_();
                    }
                    if (otherVerificationWrapper.otherCTDID != null) {
                        break;
                    }
                    otherVerificationWrapper.otherCTDID = VerificationResult.new_();
                    break;
                }
                if (iM162497u == 10) {
                    otherVerificationWrapper.otherDVIPSchool = (VerificationResult) nc5Var.m162488l(VerificationResult.PROTOBUF_ADAPTER);
                } else if (iM162497u == 18) {
                    otherVerificationWrapper.otherDVIPCompany = (VerificationResult) nc5Var.m162488l(VerificationResult.PROTOBUF_ADAPTER);
                } else if (iM162497u == 26) {
                    otherVerificationWrapper.otherDVIPJob = (VerificationResult) nc5Var.m162488l(VerificationResult.PROTOBUF_ADAPTER);
                } else if (iM162497u == 34) {
                    otherVerificationWrapper.otherDVIPSalary = (VerificationResult) nc5Var.m162488l(VerificationResult.PROTOBUF_ADAPTER);
                } else if (iM162497u == 42) {
                    otherVerificationWrapper.otherDVIPMembership = (VerificationResult) nc5Var.m162488l(VerificationResult.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 50) {
                        if (otherVerificationWrapper.otherDVIPSchool == null) {
                            otherVerificationWrapper.otherDVIPSchool = VerificationResult.new_();
                        }
                        if (otherVerificationWrapper.otherDVIPCompany == null) {
                            otherVerificationWrapper.otherDVIPCompany = VerificationResult.new_();
                        }
                        if (otherVerificationWrapper.otherDVIPJob == null) {
                            otherVerificationWrapper.otherDVIPJob = VerificationResult.new_();
                        }
                        if (otherVerificationWrapper.otherDVIPSalary == null) {
                            otherVerificationWrapper.otherDVIPSalary = VerificationResult.new_();
                        }
                        if (otherVerificationWrapper.otherDVIPMembership == null) {
                            otherVerificationWrapper.otherDVIPMembership = VerificationResult.new_();
                        }
                        if (otherVerificationWrapper.otherCTDID != null) {
                            break;
                        }
                        otherVerificationWrapper.otherCTDID = VerificationResult.new_();
                        return otherVerificationWrapper;
                    }
                    otherVerificationWrapper.otherCTDID = (VerificationResult) nc5Var.m162488l(VerificationResult.PROTOBUF_ADAPTER);
                }
            }
            return otherVerificationWrapper;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OtherVerificationWrapper otherVerificationWrapper, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            VerificationResult verificationResult = otherVerificationWrapper.otherDVIPSchool;
            if (verificationResult != null) {
                codedOutputByteBufferNano.m17309K(1, verificationResult, VerificationResult.PROTOBUF_ADAPTER);
            }
            VerificationResult verificationResult2 = otherVerificationWrapper.otherDVIPCompany;
            if (verificationResult2 != null) {
                codedOutputByteBufferNano.m17309K(2, verificationResult2, VerificationResult.PROTOBUF_ADAPTER);
            }
            VerificationResult verificationResult3 = otherVerificationWrapper.otherDVIPJob;
            if (verificationResult3 != null) {
                codedOutputByteBufferNano.m17309K(3, verificationResult3, VerificationResult.PROTOBUF_ADAPTER);
            }
            VerificationResult verificationResult4 = otherVerificationWrapper.otherDVIPSalary;
            if (verificationResult4 != null) {
                codedOutputByteBufferNano.m17309K(4, verificationResult4, VerificationResult.PROTOBUF_ADAPTER);
            }
            VerificationResult verificationResult5 = otherVerificationWrapper.otherDVIPMembership;
            if (verificationResult5 != null) {
                codedOutputByteBufferNano.m17309K(5, verificationResult5, VerificationResult.PROTOBUF_ADAPTER);
            }
            VerificationResult verificationResult6 = otherVerificationWrapper.otherCTDID;
            if (verificationResult6 != null) {
                codedOutputByteBufferNano.m17309K(6, verificationResult6, VerificationResult.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OtherVerificationWrapper> JSON_ADAPTER = new ObjectJsonAdapter<OtherVerificationWrapper>() { // from class: com.p1.mobile.putong.data.OtherVerificationWrapper.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OtherVerificationWrapper.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OtherVerificationWrapper newInstance() {
            return new OtherVerificationWrapper();
        }

        public boolean parseField(OtherVerificationWrapper otherVerificationWrapper, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherDVIPCompany":
                    otherVerificationWrapper.otherDVIPCompany = VerificationResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "otherCTDID":
                    otherVerificationWrapper.otherCTDID = VerificationResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "otherDVIPSalary":
                    otherVerificationWrapper.otherDVIPSalary = VerificationResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "otherDVIPSchool":
                    otherVerificationWrapper.otherDVIPSchool = VerificationResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "otherDVIPMembership":
                    otherVerificationWrapper.otherDVIPMembership = VerificationResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "otherDVIPJob":
                    otherVerificationWrapper.otherDVIPJob = VerificationResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OtherVerificationWrapper otherVerificationWrapper, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "otherDVIPCompany":
                case "otherCTDID":
                case "otherDVIPSalary":
                case "otherDVIPSchool":
                case "otherDVIPMembership":
                case "otherDVIPJob":
                    return true;
                default:
                    return super.parseFieldCheck(otherVerificationWrapper, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OtherVerificationWrapper otherVerificationWrapper, JsonGenerator jsonGenerator) throws IOException {
            if (otherVerificationWrapper.otherDVIPSchool != null) {
                jsonGenerator.writeFieldName("otherDVIPSchool");
                VerificationResult.JSON_ADAPTER.serialize(otherVerificationWrapper.otherDVIPSchool, jsonGenerator, true);
            }
            if (otherVerificationWrapper.otherDVIPCompany != null) {
                jsonGenerator.writeFieldName("otherDVIPCompany");
                VerificationResult.JSON_ADAPTER.serialize(otherVerificationWrapper.otherDVIPCompany, jsonGenerator, true);
            }
            if (otherVerificationWrapper.otherDVIPJob != null) {
                jsonGenerator.writeFieldName("otherDVIPJob");
                VerificationResult.JSON_ADAPTER.serialize(otherVerificationWrapper.otherDVIPJob, jsonGenerator, true);
            }
            if (otherVerificationWrapper.otherDVIPSalary != null) {
                jsonGenerator.writeFieldName("otherDVIPSalary");
                VerificationResult.JSON_ADAPTER.serialize(otherVerificationWrapper.otherDVIPSalary, jsonGenerator, true);
            }
            if (otherVerificationWrapper.otherDVIPMembership != null) {
                jsonGenerator.writeFieldName("otherDVIPMembership");
                VerificationResult.JSON_ADAPTER.serialize(otherVerificationWrapper.otherDVIPMembership, jsonGenerator, true);
            }
            if (otherVerificationWrapper.otherCTDID != null) {
                jsonGenerator.writeFieldName("otherCTDID");
                VerificationResult.JSON_ADAPTER.serialize(otherVerificationWrapper.otherCTDID, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OtherVerificationWrapper) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OtherVerificationWrapper) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OtherVerificationWrapper new_() {
        OtherVerificationWrapper otherVerificationWrapper = new OtherVerificationWrapper();
        otherVerificationWrapper.nullCheck();
        return otherVerificationWrapper;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OtherVerificationWrapper mo225055clone() {
        OtherVerificationWrapper otherVerificationWrapper = new OtherVerificationWrapper();
        VerificationResult verificationResult = this.otherDVIPSchool;
        if (verificationResult != null) {
            otherVerificationWrapper.otherDVIPSchool = verificationResult.mo225055clone();
        }
        VerificationResult verificationResult2 = this.otherDVIPCompany;
        if (verificationResult2 != null) {
            otherVerificationWrapper.otherDVIPCompany = verificationResult2.mo225055clone();
        }
        VerificationResult verificationResult3 = this.otherDVIPJob;
        if (verificationResult3 != null) {
            otherVerificationWrapper.otherDVIPJob = verificationResult3.mo225055clone();
        }
        VerificationResult verificationResult4 = this.otherDVIPSalary;
        if (verificationResult4 != null) {
            otherVerificationWrapper.otherDVIPSalary = verificationResult4.mo225055clone();
        }
        VerificationResult verificationResult5 = this.otherDVIPMembership;
        if (verificationResult5 != null) {
            otherVerificationWrapper.otherDVIPMembership = verificationResult5.mo225055clone();
        }
        VerificationResult verificationResult6 = this.otherCTDID;
        if (verificationResult6 != null) {
            otherVerificationWrapper.otherCTDID = verificationResult6.mo225055clone();
        }
        return otherVerificationWrapper;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OtherVerificationWrapper)) {
            return false;
        }
        OtherVerificationWrapper otherVerificationWrapper = (OtherVerificationWrapper) obj;
        return ValueObject.util_equals(this.otherDVIPSchool, otherVerificationWrapper.otherDVIPSchool) && ValueObject.util_equals(this.otherDVIPCompany, otherVerificationWrapper.otherDVIPCompany) && ValueObject.util_equals(this.otherDVIPJob, otherVerificationWrapper.otherDVIPJob) && ValueObject.util_equals(this.otherDVIPSalary, otherVerificationWrapper.otherDVIPSalary) && ValueObject.util_equals(this.otherDVIPMembership, otherVerificationWrapper.otherDVIPMembership) && ValueObject.util_equals(this.otherCTDID, otherVerificationWrapper.otherCTDID);
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
        VerificationResult verificationResult = this.otherDVIPSchool;
        int iHashCode = (i2 + (verificationResult != null ? verificationResult.hashCode() : 0)) * 41;
        VerificationResult verificationResult2 = this.otherDVIPCompany;
        int iHashCode2 = (iHashCode + (verificationResult2 != null ? verificationResult2.hashCode() : 0)) * 41;
        VerificationResult verificationResult3 = this.otherDVIPJob;
        int iHashCode3 = (iHashCode2 + (verificationResult3 != null ? verificationResult3.hashCode() : 0)) * 41;
        VerificationResult verificationResult4 = this.otherDVIPSalary;
        int iHashCode4 = (iHashCode3 + (verificationResult4 != null ? verificationResult4.hashCode() : 0)) * 41;
        VerificationResult verificationResult5 = this.otherDVIPMembership;
        int iHashCode5 = (iHashCode4 + (verificationResult5 != null ? verificationResult5.hashCode() : 0)) * 41;
        VerificationResult verificationResult6 = this.otherCTDID;
        int iHashCode6 = iHashCode5 + (verificationResult6 != null ? verificationResult6.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.otherDVIPSchool == null) {
            this.otherDVIPSchool = VerificationResult.new_();
        }
        if (this.otherDVIPCompany == null) {
            this.otherDVIPCompany = VerificationResult.new_();
        }
        if (this.otherDVIPJob == null) {
            this.otherDVIPJob = VerificationResult.new_();
        }
        if (this.otherDVIPSalary == null) {
            this.otherDVIPSalary = VerificationResult.new_();
        }
        if (this.otherDVIPMembership == null) {
            this.otherDVIPMembership = VerificationResult.new_();
        }
        if (this.otherCTDID == null) {
            this.otherCTDID = VerificationResult.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
