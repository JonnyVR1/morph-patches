package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.MembershipType;
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
public class ContractInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "contractinfo";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int continuousDays;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int contractCanceledDays;

    @NonNull
    @ProtobufIndex(index = 1)
    public String contractID;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ContractInfo contractInfo) {
            String str = contractInfo.contractID;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = contractInfo.contractStatus;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iH = iO + CodedOutputByteBufferNano.h(3, contractInfo.continuousDays) + CodedOutputByteBufferNano.h(4, contractInfo.privilegeExpiredDays) + CodedOutputByteBufferNano.h(5, contractInfo.contractCanceledDays);
            MembershipType membershipType = contractInfo.membershipType;
            if (membershipType != null) {
                iH += CodedOutputByteBufferNano.h(6, membershipType.ordinal());
            }
            Merchandise merchandise = contractInfo.merchandise;
            if (merchandise != null) {
                iH += CodedOutputByteBufferNano.l(7, merchandise, Merchandise.PROTOBUF_ADAPTER);
            }
            MembershipType membershipType2 = contractInfo.membershipType;
            if (membershipType2 != null) {
                iH += CodedOutputByteBufferNano.l(8, membershipType2, MembershipType.PROTOBUF_ADAPTER);
            }
            ((MessageNano) contractInfo).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ContractInfo m12281parse(nb5 nb5Var) throws IOException {
            ContractInfo contractInfo = new ContractInfo();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (contractInfo.membershipType == null && numValueOf != null) {
                        contractInfo.membershipType = MembershipType.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                    }
                    if (contractInfo.contractID == null) {
                        contractInfo.contractID = "";
                    }
                    if (contractInfo.contractStatus == null) {
                        contractInfo.contractStatus = "";
                    }
                    if (contractInfo.membershipType == null) {
                        contractInfo.membershipType = MembershipType.JSON_ADAPTER.defaultEnum();
                    }
                    if (contractInfo.merchandise != null) {
                        break;
                    }
                    contractInfo.merchandise = Merchandise.new_();
                    break;
                }
                if (iU == 10) {
                    contractInfo.contractID = nb5Var.s();
                } else if (iU == 18) {
                    contractInfo.contractStatus = nb5Var.s();
                } else if (iU == 24) {
                    contractInfo.continuousDays = nb5Var.j();
                } else if (iU == 32) {
                    contractInfo.privilegeExpiredDays = nb5Var.j();
                } else if (iU == 40) {
                    contractInfo.contractCanceledDays = nb5Var.j();
                } else if (iU == 48) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 58) {
                    contractInfo.merchandise = (Merchandise) nb5Var.l(Merchandise.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 66) {
                        if (contractInfo.membershipType == null && numValueOf != null) {
                            contractInfo.membershipType = MembershipType.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (contractInfo.contractID == null) {
                            contractInfo.contractID = "";
                        }
                        if (contractInfo.contractStatus == null) {
                            contractInfo.contractStatus = "";
                        }
                        if (contractInfo.membershipType == null) {
                            contractInfo.membershipType = MembershipType.JSON_ADAPTER.defaultEnum();
                        }
                        if (contractInfo.merchandise != null) {
                            break;
                        }
                        contractInfo.merchandise = Merchandise.new_();
                        return contractInfo;
                    }
                    contractInfo.membershipType = (MembershipType) nb5Var.l(MembershipType.PROTOBUF_ADAPTER);
                }
            }
            return contractInfo;
        }

        public void serialize(ContractInfo contractInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = contractInfo.contractID;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = contractInfo.contractStatus;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.G(3, contractInfo.continuousDays);
            codedOutputByteBufferNano.G(4, contractInfo.privilegeExpiredDays);
            codedOutputByteBufferNano.G(5, contractInfo.contractCanceledDays);
            MembershipType membershipType = contractInfo.membershipType;
            if (membershipType != null) {
                codedOutputByteBufferNano.G(6, membershipType.ordinal());
            }
            Merchandise merchandise = contractInfo.merchandise;
            if (merchandise != null) {
                codedOutputByteBufferNano.K(7, merchandise, Merchandise.PROTOBUF_ADAPTER);
            }
            MembershipType membershipType2 = contractInfo.membershipType;
            if (membershipType2 != null) {
                codedOutputByteBufferNano.K(8, membershipType2, MembershipType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ContractInfo> JSON_ADAPTER = new ObjectJsonAdapter<ContractInfo>() { // from class: com.p1.mobile.putong.core.data.ContractInfo.2
        public Class getDataClass() {
            return ContractInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ContractInfo m12282newInstance() {
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
                    contractInfo.membershipType = (MembershipType) MembershipType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "merchandise":
                    contractInfo.merchandise = (Merchandise) Merchandise.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ContractInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ContractInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ContractInfo new_() {
        ContractInfo contractInfo = new ContractInfo();
        contractInfo.nullCheck();
        return contractInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ContractInfo m12280clone() {
        ContractInfo contractInfo = new ContractInfo();
        contractInfo.contractID = this.contractID;
        contractInfo.contractStatus = this.contractStatus;
        contractInfo.continuousDays = this.continuousDays;
        contractInfo.privilegeExpiredDays = this.privilegeExpiredDays;
        contractInfo.contractCanceledDays = this.contractCanceledDays;
        contractInfo.membershipType = this.membershipType;
        Merchandise merchandise = this.merchandise;
        if (merchandise != null) {
            contractInfo.merchandise = merchandise.m14136clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.contractID == null) {
            this.contractID = "";
        }
        if (this.contractStatus == null) {
            this.contractStatus = "";
        }
        if (this.membershipType == null) {
            this.membershipType = MembershipType.JSON_ADAPTER.defaultEnum();
        }
        if (this.merchandise == null) {
            this.merchandise = Merchandise.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
