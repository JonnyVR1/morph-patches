package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.alibaba.fastjson.asm.Opcodes;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.StudentVerRejectedReason;
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

/* JADX INFO: loaded from: classes10.dex */
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
    @ProtobufIndex(index = 5)
    public String contractStatus;

    @ProtobufIndex(index = 13)
    public long createTime;

    @ProtobufIndex(index = 7)
    public long endTime;

    @ProtobufIndex(index = 12)
    public long intervalDays;

    @ProtobufIndex(index = 10)
    public boolean isUpgraded;

    @NonNull
    @ProtobufIndex(index = 3)
    public String membershipType;

    @NonNull
    @ProtobufIndex(index = 4)
    public String platform;

    @NonNull
    @ProtobufIndex(index = 2)
    public String productType;

    @ProtobufIndex(index = 6)
    public long startTime;
    public static ProtobufAdapter<RecentContractInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<RecentContractInfo>() { // from class: com.p1.mobile.putong.core.data.RecentContractInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RecentContractInfo recentContractInfo) {
            String str = recentContractInfo.contractId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = recentContractInfo.productType;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = recentContractInfo.membershipType;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = recentContractInfo.platform;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = recentContractInfo.contractStatus;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            int iM17283j = iM17288o + CodedOutputByteBufferNano.m17283j(6, recentContractInfo.startTime) + CodedOutputByteBufferNano.m17283j(7, recentContractInfo.endTime) + CodedOutputByteBufferNano.m17283j(8, recentContractInfo.cancelTime) + CodedOutputByteBufferNano.m17275b(9, recentContractInfo.autoRenew) + CodedOutputByteBufferNano.m17275b(10, recentContractInfo.isUpgraded);
            String str6 = recentContractInfo.chargeInterval;
            if (str6 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(11, str6);
            }
            int iM17283j2 = iM17283j + CodedOutputByteBufferNano.m17283j(12, recentContractInfo.intervalDays) + CodedOutputByteBufferNano.m17283j(13, recentContractInfo.createTime);
            recentContractInfo.cachedSize = iM17283j2;
            return iM17283j2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RecentContractInfo parse(nc5 nc5Var) throws IOException {
            RecentContractInfo recentContractInfo = new RecentContractInfo();
            while (true) {
                switch (nc5Var.m162497u()) {
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
                    case 10:
                        recentContractInfo.contractId = nc5Var.m162495s();
                        continue;
                    case 18:
                        recentContractInfo.productType = nc5Var.m162495s();
                        continue;
                    case 26:
                        recentContractInfo.membershipType = nc5Var.m162495s();
                        continue;
                    case 34:
                        recentContractInfo.platform = nc5Var.m162495s();
                        continue;
                    case 42:
                        recentContractInfo.contractStatus = nc5Var.m162495s();
                        continue;
                    case 48:
                        recentContractInfo.startTime = nc5Var.m162487k();
                        continue;
                    case 56:
                        recentContractInfo.endTime = nc5Var.m162487k();
                        continue;
                    case 64:
                        recentContractInfo.cancelTime = nc5Var.m162487k();
                        continue;
                    case 72:
                        recentContractInfo.autoRenew = nc5Var.m162483g();
                        continue;
                    case 80:
                        recentContractInfo.isUpgraded = nc5Var.m162483g();
                        continue;
                    case 90:
                        recentContractInfo.chargeInterval = nc5Var.m162495s();
                        continue;
                    case Opcodes.IADD /* 96 */:
                        recentContractInfo.intervalDays = nc5Var.m162487k();
                        continue;
                    case 104:
                        recentContractInfo.createTime = nc5Var.m162487k();
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RecentContractInfo recentContractInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = recentContractInfo.contractId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = recentContractInfo.productType;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = recentContractInfo.membershipType;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = recentContractInfo.platform;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = recentContractInfo.contractStatus;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
            codedOutputByteBufferNano.m17307I(6, recentContractInfo.startTime);
            codedOutputByteBufferNano.m17307I(7, recentContractInfo.endTime);
            codedOutputByteBufferNano.m17307I(8, recentContractInfo.cancelTime);
            codedOutputByteBufferNano.m17299A(9, recentContractInfo.autoRenew);
            codedOutputByteBufferNano.m17299A(10, recentContractInfo.isUpgraded);
            String str6 = recentContractInfo.chargeInterval;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(11, str6);
            }
            codedOutputByteBufferNano.m17307I(12, recentContractInfo.intervalDays);
            codedOutputByteBufferNano.m17307I(13, recentContractInfo.createTime);
        }
    };
    public static JsonAdapter<RecentContractInfo> JSON_ADAPTER = new ObjectJsonAdapter<RecentContractInfo>() { // from class: com.p1.mobile.putong.core.data.RecentContractInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RecentContractInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RecentContractInfo newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
            jsonGenerator.writeNumberField(StudentVerRejectedReason.startTime, recentContractInfo.startTime);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RecentContractInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RecentContractInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RecentContractInfo new_() {
        RecentContractInfo recentContractInfo = new RecentContractInfo();
        recentContractInfo.nullCheck();
        return recentContractInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RecentContractInfo mo225055clone() {
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
        this.hashCode = i7;
        return i7;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
