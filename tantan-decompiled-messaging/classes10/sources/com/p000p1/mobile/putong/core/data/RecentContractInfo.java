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
public class RecentContractInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "recentcontractinfo";

    @ProtobufIndex(index = 9)
    public boolean autoRenew;

    @ProtobufIndex(index = 8)
    public long cancelTime;

    @NonNull
    @ProtobufIndex(index = 11)
    public String chargeInterval;

    @NonNull
    @ProtobufIndex(index = 1)
    public String contractId;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String contractStatus;

    @ProtobufIndex(index = 13)
    public long createTime;

    @ProtobufIndex(index = 7)
    public long endTime;

    @ProtobufIndex(index = 12)
    public long intervalDays;

    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public boolean isUpgraded;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String membershipType;

    @NonNull
    @ProtobufIndex(index = 4)
    public String platform;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String productType;

    @ProtobufIndex(index = 6)
    public long startTime;
    public static ProtobufAdapter<RecentContractInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<RecentContractInfo>() { // from class: com.p1.mobile.putong.core.data.RecentContractInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RecentContractInfo recentContractInfo) {
            String str = recentContractInfo.contractId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = recentContractInfo.productType;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = recentContractInfo.membershipType;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = recentContractInfo.platform;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = recentContractInfo.contractStatus;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            int iJ = iO + CodedOutputByteBufferNano.j(6, recentContractInfo.startTime) + CodedOutputByteBufferNano.j(7, recentContractInfo.endTime) + CodedOutputByteBufferNano.j(8, recentContractInfo.cancelTime) + CodedOutputByteBufferNano.b(9, recentContractInfo.autoRenew) + CodedOutputByteBufferNano.b(10, recentContractInfo.isUpgraded);
            String str6 = recentContractInfo.chargeInterval;
            if (str6 != null) {
                iJ += CodedOutputByteBufferNano.o(11, str6);
            }
            int iJ2 = iJ + CodedOutputByteBufferNano.j(12, recentContractInfo.intervalDays) + CodedOutputByteBufferNano.j(13, recentContractInfo.createTime);
            ((MessageNano) recentContractInfo).cachedSize = iJ2;
            return iJ2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RecentContractInfo m15301parse(nb5 nb5Var) throws IOException {
            RecentContractInfo recentContractInfo = new RecentContractInfo();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (recentContractInfo.contractId == null) {
                            recentContractInfo.contractId = "";
                        }
                        if (recentContractInfo.productType == null) {
                            recentContractInfo.productType = "";
                        }
                        if (recentContractInfo.membershipType == null) {
                            recentContractInfo.membershipType = "";
                        }
                        if (recentContractInfo.platform == null) {
                            recentContractInfo.platform = "";
                        }
                        if (recentContractInfo.contractStatus == null) {
                            recentContractInfo.contractStatus = "";
                        }
                        if (recentContractInfo.chargeInterval == null) {
                            recentContractInfo.chargeInterval = "";
                        }
                        break;
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        recentContractInfo.contractId = nb5Var.s();
                        continue;
                    case 18:
                        recentContractInfo.productType = nb5Var.s();
                        continue;
                    case 26:
                        recentContractInfo.membershipType = nb5Var.s();
                        continue;
                    case 34:
                        recentContractInfo.platform = nb5Var.s();
                        continue;
                    case 42:
                        recentContractInfo.contractStatus = nb5Var.s();
                        continue;
                    case 48:
                        recentContractInfo.startTime = nb5Var.k();
                        continue;
                    case 56:
                        recentContractInfo.endTime = nb5Var.k();
                        continue;
                    case 64:
                        recentContractInfo.cancelTime = nb5Var.k();
                        continue;
                    case 72:
                        recentContractInfo.autoRenew = nb5Var.g();
                        continue;
                    case 80:
                        recentContractInfo.isUpgraded = nb5Var.g();
                        continue;
                    case Conversation.LEVEL_TOP_PLATINUM /* 90 */:
                        recentContractInfo.chargeInterval = nb5Var.s();
                        continue;
                    case 96:
                        recentContractInfo.intervalDays = nb5Var.k();
                        continue;
                    case 104:
                        recentContractInfo.createTime = nb5Var.k();
                        continue;
                    default:
                        if (recentContractInfo.contractId == null) {
                            recentContractInfo.contractId = "";
                        }
                        if (recentContractInfo.productType == null) {
                            recentContractInfo.productType = "";
                        }
                        if (recentContractInfo.membershipType == null) {
                            recentContractInfo.membershipType = "";
                        }
                        if (recentContractInfo.platform == null) {
                            recentContractInfo.platform = "";
                        }
                        if (recentContractInfo.contractStatus == null) {
                            recentContractInfo.contractStatus = "";
                        }
                        if (recentContractInfo.chargeInterval == null) {
                            recentContractInfo.chargeInterval = "";
                            return recentContractInfo;
                        }
                        break;
                }
            }
            return recentContractInfo;
        }

        public void serialize(RecentContractInfo recentContractInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = recentContractInfo.contractId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = recentContractInfo.productType;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = recentContractInfo.membershipType;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = recentContractInfo.platform;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = recentContractInfo.contractStatus;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            codedOutputByteBufferNano.I(6, recentContractInfo.startTime);
            codedOutputByteBufferNano.I(7, recentContractInfo.endTime);
            codedOutputByteBufferNano.I(8, recentContractInfo.cancelTime);
            codedOutputByteBufferNano.A(9, recentContractInfo.autoRenew);
            codedOutputByteBufferNano.A(10, recentContractInfo.isUpgraded);
            String str6 = recentContractInfo.chargeInterval;
            if (str6 != null) {
                codedOutputByteBufferNano.R(11, str6);
            }
            codedOutputByteBufferNano.I(12, recentContractInfo.intervalDays);
            codedOutputByteBufferNano.I(13, recentContractInfo.createTime);
        }
    };
    public static JsonAdapter<RecentContractInfo> JSON_ADAPTER = new ObjectJsonAdapter<RecentContractInfo>() { // from class: com.p1.mobile.putong.core.data.RecentContractInfo.2
        public Class getDataClass() {
            return RecentContractInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RecentContractInfo m15302newInstance() {
            return new RecentContractInfo();
        }

        public boolean parseField(RecentContractInfo recentContractInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startTime":
                    recentContractInfo.startTime = jsonParser.getValueAsLong();
                    return true;
                case "endTime":
                    recentContractInfo.endTime = jsonParser.getValueAsLong();
                    return true;
                case "intervalDays":
                    recentContractInfo.intervalDays = jsonParser.getValueAsLong();
                    return true;
                case "productType":
                    recentContractInfo.productType = jsonParser.getValueAsString();
                    return true;
                case "membershipType":
                    recentContractInfo.membershipType = jsonParser.getValueAsString();
                    return true;
                case "contractId":
                    recentContractInfo.contractId = jsonParser.getValueAsString();
                    return true;
                case "isUpgraded":
                    recentContractInfo.isUpgraded = jsonParser.getValueAsBoolean();
                    return true;
                case "contractStatus":
                    recentContractInfo.contractStatus = jsonParser.getValueAsString();
                    return true;
                case "createTime":
                    recentContractInfo.createTime = jsonParser.getValueAsLong();
                    return true;
                case "autoRenew":
                    recentContractInfo.autoRenew = jsonParser.getValueAsBoolean();
                    return true;
                case "chargeInterval":
                    recentContractInfo.chargeInterval = jsonParser.getValueAsString();
                    return true;
                case "platform":
                    recentContractInfo.platform = jsonParser.getValueAsString();
                    return true;
                case "cancelTime":
                    recentContractInfo.cancelTime = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RecentContractInfo recentContractInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "startTime":
                case "endTime":
                case "intervalDays":
                case "productType":
                case "membershipType":
                case "contractId":
                case "isUpgraded":
                case "contractStatus":
                case "createTime":
                case "autoRenew":
                case "chargeInterval":
                case "platform":
                case "cancelTime":
                    return true;
                default:
                    return super.parseFieldCheck(recentContractInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(RecentContractInfo recentContractInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = recentContractInfo.contractId;
            if (str != null) {
                jsonGenerator.writeStringField("contractId", str);
            }
            String str2 = recentContractInfo.productType;
            if (str2 != null) {
                jsonGenerator.writeStringField("productType", str2);
            }
            String str3 = recentContractInfo.membershipType;
            if (str3 != null) {
                jsonGenerator.writeStringField("membershipType", str3);
            }
            String str4 = recentContractInfo.platform;
            if (str4 != null) {
                jsonGenerator.writeStringField("platform", str4);
            }
            String str5 = recentContractInfo.contractStatus;
            if (str5 != null) {
                jsonGenerator.writeStringField("contractStatus", str5);
            }
            jsonGenerator.writeNumberField("startTime", recentContractInfo.startTime);
            jsonGenerator.writeNumberField("endTime", recentContractInfo.endTime);
            jsonGenerator.writeNumberField("cancelTime", recentContractInfo.cancelTime);
            jsonGenerator.writeBooleanField("autoRenew", recentContractInfo.autoRenew);
            jsonGenerator.writeBooleanField("isUpgraded", recentContractInfo.isUpgraded);
            String str6 = recentContractInfo.chargeInterval;
            if (str6 != null) {
                jsonGenerator.writeStringField("chargeInterval", str6);
            }
            jsonGenerator.writeNumberField("intervalDays", recentContractInfo.intervalDays);
            jsonGenerator.writeNumberField("createTime", recentContractInfo.createTime);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RecentContractInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RecentContractInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RecentContractInfo new_() {
        RecentContractInfo recentContractInfo = new RecentContractInfo();
        recentContractInfo.nullCheck();
        return recentContractInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RecentContractInfo m15300clone() {
        RecentContractInfo recentContractInfo = new RecentContractInfo();
        recentContractInfo.contractId = this.contractId;
        recentContractInfo.productType = this.productType;
        recentContractInfo.membershipType = this.membershipType;
        recentContractInfo.platform = this.platform;
        recentContractInfo.contractStatus = this.contractStatus;
        recentContractInfo.startTime = this.startTime;
        recentContractInfo.endTime = this.endTime;
        recentContractInfo.cancelTime = this.cancelTime;
        recentContractInfo.autoRenew = this.autoRenew;
        recentContractInfo.isUpgraded = this.isUpgraded;
        recentContractInfo.chargeInterval = this.chargeInterval;
        recentContractInfo.intervalDays = this.intervalDays;
        recentContractInfo.createTime = this.createTime;
        return recentContractInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecentContractInfo)) {
            return false;
        }
        RecentContractInfo recentContractInfo = (RecentContractInfo) obj;
        return ValueObject.util_equals(this.contractId, recentContractInfo.contractId) && ValueObject.util_equals(this.productType, recentContractInfo.productType) && ValueObject.util_equals(this.membershipType, recentContractInfo.membershipType) && ValueObject.util_equals(this.platform, recentContractInfo.platform) && ValueObject.util_equals(this.contractStatus, recentContractInfo.contractStatus) && this.startTime == recentContractInfo.startTime && this.endTime == recentContractInfo.endTime && this.cancelTime == recentContractInfo.cancelTime && this.autoRenew == recentContractInfo.autoRenew && this.isUpgraded == recentContractInfo.isUpgraded && ValueObject.util_equals(this.chargeInterval, recentContractInfo.chargeInterval) && this.intervalDays == recentContractInfo.intervalDays && this.createTime == recentContractInfo.createTime;
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
        String str = this.contractId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.productType;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.membershipType;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.platform;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.contractStatus;
        int iHashCode5 = str5 != null ? str5.hashCode() : 0;
        long j = this.startTime;
        int i3 = (((iHashCode4 + iHashCode5) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.endTime;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.cancelTime;
        int i5 = (((((i4 + ((int) (j3 ^ (j3 >>> 32)))) * 41) + (this.autoRenew ? 1231 : 1237)) * 41) + (this.isUpgraded ? 1231 : 1237)) * 41;
        String str6 = this.chargeInterval;
        int iHashCode6 = (i5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        long j4 = this.intervalDays;
        int i6 = (iHashCode6 + ((int) (j4 ^ (j4 >>> 32)))) * 41;
        long j5 = this.createTime;
        int i7 = i6 + ((int) (j5 ^ (j5 >>> 32)));
        ((ValueObject) this).hashCode = i7;
        return i7;
    }

    public void nullCheck() {
        if (this.contractId == null) {
            this.contractId = "";
        }
        if (this.productType == null) {
            this.productType = "";
        }
        if (this.membershipType == null) {
            this.membershipType = "";
        }
        if (this.platform == null) {
            this.platform = "";
        }
        if (this.contractStatus == null) {
            this.contractStatus = "";
        }
        if (this.chargeInterval == null) {
            this.chargeInterval = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
