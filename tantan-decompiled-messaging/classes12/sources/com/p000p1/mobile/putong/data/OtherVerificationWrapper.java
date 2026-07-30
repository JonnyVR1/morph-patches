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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OtherVerificationWrapper otherVerificationWrapper) {
            VerificationResult verificationResult = otherVerificationWrapper.otherDVIPSchool;
            int iL = verificationResult != null ? CodedOutputByteBufferNano.l(1, verificationResult, VerificationResult.PROTOBUF_ADAPTER) : 0;
            VerificationResult verificationResult2 = otherVerificationWrapper.otherDVIPCompany;
            if (verificationResult2 != null) {
                iL += CodedOutputByteBufferNano.l(2, verificationResult2, VerificationResult.PROTOBUF_ADAPTER);
            }
            VerificationResult verificationResult3 = otherVerificationWrapper.otherDVIPJob;
            if (verificationResult3 != null) {
                iL += CodedOutputByteBufferNano.l(3, verificationResult3, VerificationResult.PROTOBUF_ADAPTER);
            }
            VerificationResult verificationResult4 = otherVerificationWrapper.otherDVIPSalary;
            if (verificationResult4 != null) {
                iL += CodedOutputByteBufferNano.l(4, verificationResult4, VerificationResult.PROTOBUF_ADAPTER);
            }
            VerificationResult verificationResult5 = otherVerificationWrapper.otherDVIPMembership;
            if (verificationResult5 != null) {
                iL += CodedOutputByteBufferNano.l(5, verificationResult5, VerificationResult.PROTOBUF_ADAPTER);
            }
            VerificationResult verificationResult6 = otherVerificationWrapper.otherCTDID;
            if (verificationResult6 != null) {
                iL += CodedOutputByteBufferNano.l(6, verificationResult6, VerificationResult.PROTOBUF_ADAPTER);
            }
            ((MessageNano) otherVerificationWrapper).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OtherVerificationWrapper m18759parse(nb5 nb5Var) throws IOException {
            OtherVerificationWrapper otherVerificationWrapper = new OtherVerificationWrapper();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    otherVerificationWrapper.otherDVIPSchool = (VerificationResult) nb5Var.l(VerificationResult.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    otherVerificationWrapper.otherDVIPCompany = (VerificationResult) nb5Var.l(VerificationResult.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    otherVerificationWrapper.otherDVIPJob = (VerificationResult) nb5Var.l(VerificationResult.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    otherVerificationWrapper.otherDVIPSalary = (VerificationResult) nb5Var.l(VerificationResult.PROTOBUF_ADAPTER);
                } else if (iU == 42) {
                    otherVerificationWrapper.otherDVIPMembership = (VerificationResult) nb5Var.l(VerificationResult.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 50) {
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
                    otherVerificationWrapper.otherCTDID = (VerificationResult) nb5Var.l(VerificationResult.PROTOBUF_ADAPTER);
                }
            }
            return otherVerificationWrapper;
        }

        public void serialize(OtherVerificationWrapper otherVerificationWrapper, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            VerificationResult verificationResult = otherVerificationWrapper.otherDVIPSchool;
            if (verificationResult != null) {
                codedOutputByteBufferNano.K(1, verificationResult, VerificationResult.PROTOBUF_ADAPTER);
            }
            VerificationResult verificationResult2 = otherVerificationWrapper.otherDVIPCompany;
            if (verificationResult2 != null) {
                codedOutputByteBufferNano.K(2, verificationResult2, VerificationResult.PROTOBUF_ADAPTER);
            }
            VerificationResult verificationResult3 = otherVerificationWrapper.otherDVIPJob;
            if (verificationResult3 != null) {
                codedOutputByteBufferNano.K(3, verificationResult3, VerificationResult.PROTOBUF_ADAPTER);
            }
            VerificationResult verificationResult4 = otherVerificationWrapper.otherDVIPSalary;
            if (verificationResult4 != null) {
                codedOutputByteBufferNano.K(4, verificationResult4, VerificationResult.PROTOBUF_ADAPTER);
            }
            VerificationResult verificationResult5 = otherVerificationWrapper.otherDVIPMembership;
            if (verificationResult5 != null) {
                codedOutputByteBufferNano.K(5, verificationResult5, VerificationResult.PROTOBUF_ADAPTER);
            }
            VerificationResult verificationResult6 = otherVerificationWrapper.otherCTDID;
            if (verificationResult6 != null) {
                codedOutputByteBufferNano.K(6, verificationResult6, VerificationResult.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OtherVerificationWrapper> JSON_ADAPTER = new ObjectJsonAdapter<OtherVerificationWrapper>() { // from class: com.p1.mobile.putong.data.OtherVerificationWrapper.2
        public Class getDataClass() {
            return OtherVerificationWrapper.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OtherVerificationWrapper mo17830newInstance() {
            return new OtherVerificationWrapper();
        }

        public boolean parseField(OtherVerificationWrapper otherVerificationWrapper, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherDVIPCompany":
                    otherVerificationWrapper.otherDVIPCompany = (VerificationResult) VerificationResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "otherCTDID":
                    otherVerificationWrapper.otherCTDID = (VerificationResult) VerificationResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "otherDVIPSalary":
                    otherVerificationWrapper.otherDVIPSalary = (VerificationResult) VerificationResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "otherDVIPSchool":
                    otherVerificationWrapper.otherDVIPSchool = (VerificationResult) VerificationResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "otherDVIPMembership":
                    otherVerificationWrapper.otherDVIPMembership = (VerificationResult) VerificationResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "otherDVIPJob":
                    otherVerificationWrapper.otherDVIPJob = (VerificationResult) VerificationResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OtherVerificationWrapper) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OtherVerificationWrapper) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OtherVerificationWrapper new_() {
        OtherVerificationWrapper otherVerificationWrapper = new OtherVerificationWrapper();
        otherVerificationWrapper.nullCheck();
        return otherVerificationWrapper;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OtherVerificationWrapper m18758clone() {
        OtherVerificationWrapper otherVerificationWrapper = new OtherVerificationWrapper();
        VerificationResult verificationResult = this.otherDVIPSchool;
        if (verificationResult != null) {
            otherVerificationWrapper.otherDVIPSchool = verificationResult.m19279clone();
        }
        VerificationResult verificationResult2 = this.otherDVIPCompany;
        if (verificationResult2 != null) {
            otherVerificationWrapper.otherDVIPCompany = verificationResult2.m19279clone();
        }
        VerificationResult verificationResult3 = this.otherDVIPJob;
        if (verificationResult3 != null) {
            otherVerificationWrapper.otherDVIPJob = verificationResult3.m19279clone();
        }
        VerificationResult verificationResult4 = this.otherDVIPSalary;
        if (verificationResult4 != null) {
            otherVerificationWrapper.otherDVIPSalary = verificationResult4.m19279clone();
        }
        VerificationResult verificationResult5 = this.otherDVIPMembership;
        if (verificationResult5 != null) {
            otherVerificationWrapper.otherDVIPMembership = verificationResult5.m19279clone();
        }
        VerificationResult verificationResult6 = this.otherCTDID;
        if (verificationResult6 != null) {
            otherVerificationWrapper.otherCTDID = verificationResult6.m19279clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
