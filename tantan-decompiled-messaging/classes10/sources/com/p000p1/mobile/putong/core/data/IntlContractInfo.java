package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class IntlContractInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlcontractinfo";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String contractId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String contractStatus;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String membershipType;
    public static ProtobufAdapter<IntlContractInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlContractInfo>() { // from class: com.p1.mobile.putong.core.data.IntlContractInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlContractInfo intlContractInfo) {
            String str = intlContractInfo.contractStatus;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = intlContractInfo.membershipType;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = intlContractInfo.contractId;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) intlContractInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlContractInfo m13535parse(nb5 nb5Var) throws IOException {
            IntlContractInfo intlContractInfo = new IntlContractInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlContractInfo.contractStatus == null) {
                        intlContractInfo.contractStatus = "";
                    }
                    if (intlContractInfo.membershipType == null) {
                        intlContractInfo.membershipType = "";
                    }
                    if (intlContractInfo.contractId != null) {
                        break;
                    }
                    intlContractInfo.contractId = "";
                    break;
                }
                if (iU == 10) {
                    intlContractInfo.contractStatus = nb5Var.s();
                } else if (iU == 18) {
                    intlContractInfo.membershipType = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (intlContractInfo.contractStatus == null) {
                            intlContractInfo.contractStatus = "";
                        }
                        if (intlContractInfo.membershipType == null) {
                            intlContractInfo.membershipType = "";
                        }
                        if (intlContractInfo.contractId != null) {
                            break;
                        }
                        intlContractInfo.contractId = "";
                        return intlContractInfo;
                    }
                    intlContractInfo.contractId = nb5Var.s();
                }
            }
            return intlContractInfo;
        }

        public void serialize(IntlContractInfo intlContractInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlContractInfo.contractStatus;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = intlContractInfo.membershipType;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = intlContractInfo.contractId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<IntlContractInfo> JSON_ADAPTER = new ObjectJsonAdapter<IntlContractInfo>() { // from class: com.p1.mobile.putong.core.data.IntlContractInfo.2
        public Class getDataClass() {
            return IntlContractInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlContractInfo m13536newInstance() {
            return new IntlContractInfo();
        }

        public boolean parseField(IntlContractInfo intlContractInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "membershipType":
                    intlContractInfo.membershipType = jsonParser.getValueAsString();
                    return true;
                case "contractId":
                    intlContractInfo.contractId = jsonParser.getValueAsString();
                    return true;
                case "contractStatus":
                    intlContractInfo.contractStatus = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlContractInfo intlContractInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "membershipType":
                case "contractId":
                case "contractStatus":
                    return true;
                default:
                    return super.parseFieldCheck(intlContractInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(IntlContractInfo intlContractInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = intlContractInfo.contractStatus;
            if (str != null) {
                jsonGenerator.writeStringField("contractStatus", str);
            }
            String str2 = intlContractInfo.membershipType;
            if (str2 != null) {
                jsonGenerator.writeStringField("membershipType", str2);
            }
            String str3 = intlContractInfo.contractId;
            if (str3 != null) {
                jsonGenerator.writeStringField("contractId", str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlContractInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlContractInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlContractInfo new_() {
        IntlContractInfo intlContractInfo = new IntlContractInfo();
        intlContractInfo.nullCheck();
        return intlContractInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlContractInfo m13534clone() {
        IntlContractInfo intlContractInfo = new IntlContractInfo();
        intlContractInfo.contractStatus = this.contractStatus;
        intlContractInfo.membershipType = this.membershipType;
        intlContractInfo.contractId = this.contractId;
        return intlContractInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlContractInfo)) {
            return false;
        }
        IntlContractInfo intlContractInfo = (IntlContractInfo) obj;
        return ValueObject.util_equals(this.contractStatus, intlContractInfo.contractStatus) && ValueObject.util_equals(this.membershipType, intlContractInfo.membershipType) && ValueObject.util_equals(this.contractId, intlContractInfo.contractId);
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
        String str = this.contractStatus;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.membershipType;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.contractId;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.contractStatus == null) {
            this.contractStatus = "";
        }
        if (this.membershipType == null) {
            this.membershipType = "";
        }
        if (this.contractId == null) {
            this.contractId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
