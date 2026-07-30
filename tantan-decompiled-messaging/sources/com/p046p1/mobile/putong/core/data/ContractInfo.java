package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.MembershipType;
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
public class ContractInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "contractinfo";

    @ProtobufIndex(index = 3)
    public int continuousDays;

    @ProtobufIndex(index = 5)
    public int contractCanceledDays;

    @NonNull
    @ProtobufIndex(index = 1)
    public String contractID;

    @NonNull
    @ProtobufIndex(index = 2)
    public String contractStatus;

    @NonNull
    @ProtobufIndex(index = 6)
    public MembershipType membershipType;

    @NonNull
    @ProtobufIndex(index = 7)
    public Merchandise merchandise;

    @ProtobufIndex(index = 4)
    public int privilegeExpiredDays;
    public static ProtobufAdapter<ContractInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<ContractInfo>() { // from class: com.p1.mobile.putong.core.data.ContractInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ContractInfo contractInfo) {
            String str = contractInfo.contractID;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = contractInfo.contractStatus;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(3, contractInfo.continuousDays) + CodedOutputByteBufferNano.m17226h(4, contractInfo.privilegeExpiredDays) + CodedOutputByteBufferNano.m17226h(5, contractInfo.contractCanceledDays);
            MembershipType membershipType = contractInfo.membershipType;
            if (membershipType != null) {
                iM17226h += CodedOutputByteBufferNano.m17226h(6, membershipType.ordinal());
            }
            Merchandise merchandise = contractInfo.merchandise;
            if (merchandise != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(7, merchandise, Merchandise.PROTOBUF_ADAPTER);
            }
            MembershipType membershipType2 = contractInfo.membershipType;
            if (membershipType2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(8, membershipType2, MembershipType.PROTOBUF_ADAPTER);
            }
            contractInfo.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ContractInfo parse(nb5 nb5Var) throws IOException {
            ContractInfo contractInfo = new ContractInfo();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (contractInfo.membershipType == null && numValueOf != null) {
                        contractInfo.membershipType = (MembershipType) MembershipType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (contractInfo.contractID == null) {
                        contractInfo.contractID = "";
                    }
                    if (contractInfo.contractStatus == null) {
                        contractInfo.contractStatus = "";
                    }
                    if (contractInfo.membershipType == null) {
                        contractInfo.membershipType = (MembershipType) MembershipType.JSON_ADAPTER.defaultEnum();
                    }
                    if (contractInfo.merchandise != null) {
                        break;
                    }
                    contractInfo.merchandise = Merchandise.new_();
                    break;
                }
                if (iM158752u == 10) {
                    contractInfo.contractID = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    contractInfo.contractStatus = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    contractInfo.continuousDays = nb5Var.m158741j();
                } else if (iM158752u == 32) {
                    contractInfo.privilegeExpiredDays = nb5Var.m158741j();
                } else if (iM158752u == 40) {
                    contractInfo.contractCanceledDays = nb5Var.m158741j();
                } else if (iM158752u == 48) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 58) {
                    contractInfo.merchandise = (Merchandise) nb5Var.m158743l(Merchandise.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 66) {
                        if (contractInfo.membershipType == null && numValueOf != null) {
                            contractInfo.membershipType = (MembershipType) MembershipType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (contractInfo.contractID == null) {
                            contractInfo.contractID = "";
                        }
                        if (contractInfo.contractStatus == null) {
                            contractInfo.contractStatus = "";
                        }
                        if (contractInfo.membershipType == null) {
                            contractInfo.membershipType = (MembershipType) MembershipType.JSON_ADAPTER.defaultEnum();
                        }
                        if (contractInfo.merchandise != null) {
                            break;
                        }
                        contractInfo.merchandise = Merchandise.new_();
                        return contractInfo;
                    }
                    contractInfo.membershipType = (MembershipType) nb5Var.m158743l(MembershipType.PROTOBUF_ADAPTER);
                }
            }
            return contractInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ContractInfo contractInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = contractInfo.contractID;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = contractInfo.contractStatus;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17250G(3, contractInfo.continuousDays);
            codedOutputByteBufferNano.m17250G(4, contractInfo.privilegeExpiredDays);
            codedOutputByteBufferNano.m17250G(5, contractInfo.contractCanceledDays);
            MembershipType membershipType = contractInfo.membershipType;
            if (membershipType != null) {
                codedOutputByteBufferNano.m17250G(6, membershipType.ordinal());
            }
            Merchandise merchandise = contractInfo.merchandise;
            if (merchandise != null) {
                codedOutputByteBufferNano.m17254K(7, merchandise, Merchandise.PROTOBUF_ADAPTER);
            }
            MembershipType membershipType2 = contractInfo.membershipType;
            if (membershipType2 != null) {
                codedOutputByteBufferNano.m17254K(8, membershipType2, MembershipType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ContractInfo> JSON_ADAPTER = new ObjectJsonAdapter<ContractInfo>() { // from class: com.p1.mobile.putong.core.data.ContractInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ContractInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ContractInfo newInstance() {
            return new ContractInfo();
        }

        public boolean parseField(ContractInfo contractInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "privilegeExpiredDays":
                    contractInfo.privilegeExpiredDays = jsonParser.getValueAsInt();
                    return true;
                case "continuousDays":
                    contractInfo.continuousDays = jsonParser.getValueAsInt();
                    return true;
                case "membershipType":
                    contractInfo.membershipType = MembershipType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "merchandise":
                    contractInfo.merchandise = Merchandise.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "contractID":
                    contractInfo.contractID = jsonParser.getValueAsString();
                    return true;
                case "contractStatus":
                    contractInfo.contractStatus = jsonParser.getValueAsString();
                    return true;
                case "contractCanceledDays":
                    contractInfo.contractCanceledDays = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ContractInfo contractInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "privilegeExpiredDays":
                case "continuousDays":
                case "membershipType":
                case "merchandise":
                case "contractID":
                case "contractStatus":
                case "contractCanceledDays":
                    return true;
                default:
                    return super.parseFieldCheck(contractInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ContractInfo contractInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = contractInfo.contractID;
            if (str != null) {
                jsonGenerator.writeStringField("contractID", str);
            }
            String str2 = contractInfo.contractStatus;
            if (str2 != null) {
                jsonGenerator.writeStringField("contractStatus", str2);
            }
            jsonGenerator.writeNumberField("continuousDays", contractInfo.continuousDays);
            jsonGenerator.writeNumberField("privilegeExpiredDays", contractInfo.privilegeExpiredDays);
            jsonGenerator.writeNumberField("contractCanceledDays", contractInfo.contractCanceledDays);
            if (contractInfo.membershipType != null) {
                jsonGenerator.writeFieldName("membershipType");
                MembershipType.JSON_ADAPTER.serialize(contractInfo.membershipType, jsonGenerator, true);
            }
            if (contractInfo.merchandise != null) {
                jsonGenerator.writeFieldName(Merchandise.TYPE);
                Merchandise.JSON_ADAPTER.serialize(contractInfo.merchandise, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ContractInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ContractInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ContractInfo new_() {
        ContractInfo contractInfo = new ContractInfo();
        contractInfo.nullCheck();
        return contractInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ContractInfo mo223809clone() {
        ContractInfo contractInfo = new ContractInfo();
        contractInfo.contractID = this.contractID;
        contractInfo.contractStatus = this.contractStatus;
        contractInfo.continuousDays = this.continuousDays;
        contractInfo.privilegeExpiredDays = this.privilegeExpiredDays;
        contractInfo.contractCanceledDays = this.contractCanceledDays;
        contractInfo.membershipType = this.membershipType;
        Merchandise merchandise = this.merchandise;
        if (merchandise != null) {
            contractInfo.merchandise = merchandise.mo223809clone();
        }
        return contractInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContractInfo)) {
            return false;
        }
        ContractInfo contractInfo = (ContractInfo) obj;
        return ValueObject.util_equals(this.contractID, contractInfo.contractID) && ValueObject.util_equals(this.contractStatus, contractInfo.contractStatus) && this.continuousDays == contractInfo.continuousDays && this.privilegeExpiredDays == contractInfo.privilegeExpiredDays && this.contractCanceledDays == contractInfo.contractCanceledDays && ValueObject.util_equals(this.membershipType, contractInfo.membershipType) && ValueObject.util_equals(this.merchandise, contractInfo.merchandise);
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
        String str = this.contractID;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.contractStatus;
        int iHashCode2 = (((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.continuousDays) * 41) + this.privilegeExpiredDays) * 41) + this.contractCanceledDays) * 41;
        MembershipType membershipType = this.membershipType;
        int iHashCode3 = (iHashCode2 + (membershipType != null ? membershipType.hashCode() : 0)) * 41;
        Merchandise merchandise = this.merchandise;
        int iHashCode4 = iHashCode3 + (merchandise != null ? merchandise.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.contractID == null) {
            this.contractID = "";
        }
        if (this.contractStatus == null) {
            this.contractStatus = "";
        }
        if (this.membershipType == null) {
            this.membershipType = (MembershipType) MembershipType.JSON_ADAPTER.defaultEnum();
        }
        if (this.merchandise == null) {
            this.merchandise = Merchandise.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
