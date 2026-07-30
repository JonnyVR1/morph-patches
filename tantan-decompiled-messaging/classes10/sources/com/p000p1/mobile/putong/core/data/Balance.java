package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
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
public class Balance extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "balance";

    @ProtobufIndex(index = 4)
    public double actualAmount;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public double amount;

    @ProtobufIndex(index = 6)
    public double createdTime;

    @NonNull
    @ProtobufIndex(index = 8)
    public String failedReason;

    @NonNull
    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public RedPacketGiftType giftType;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f13id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public BalanceOpsType operation;

    @NonNull
    @ProtobufIndex(index = 9)
    public String otherUserName;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public BalanceStatusType status;

    @ProtobufIndex(index = 7)
    public double updatedTime;
    public static ProtobufAdapter<Balance> PROTOBUF_ADAPTER = new MessageNanoAdapter<Balance>() { // from class: com.p1.mobile.putong.core.data.Balance.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Balance balance) {
            String str = balance.f13id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            BalanceOpsType balanceOpsType = balance.operation;
            if (balanceOpsType != null) {
                iO += CodedOutputByteBufferNano.h(2, balanceOpsType.ordinal());
            }
            int iD = iO + CodedOutputByteBufferNano.d(3, balance.amount) + CodedOutputByteBufferNano.d(4, balance.actualAmount);
            BalanceStatusType balanceStatusType = balance.status;
            if (balanceStatusType != null) {
                iD += CodedOutputByteBufferNano.h(5, balanceStatusType.ordinal());
            }
            int iD2 = iD + CodedOutputByteBufferNano.d(6, balance.createdTime) + CodedOutputByteBufferNano.d(7, balance.updatedTime);
            String str2 = balance.failedReason;
            if (str2 != null) {
                iD2 += CodedOutputByteBufferNano.o(8, str2);
            }
            String str3 = balance.otherUserName;
            if (str3 != null) {
                iD2 += CodedOutputByteBufferNano.o(9, str3);
            }
            RedPacketGiftType redPacketGiftType = balance.giftType;
            if (redPacketGiftType != null) {
                iD2 += CodedOutputByteBufferNano.h(10, redPacketGiftType.ordinal());
            }
            BalanceOpsType balanceOpsType2 = balance.operation;
            if (balanceOpsType2 != null) {
                iD2 += CodedOutputByteBufferNano.l(11, balanceOpsType2, BalanceOpsType.PROTOBUF_ADAPTER);
            }
            BalanceStatusType balanceStatusType2 = balance.status;
            if (balanceStatusType2 != null) {
                iD2 += CodedOutputByteBufferNano.l(12, balanceStatusType2, BalanceStatusType.PROTOBUF_ADAPTER);
            }
            RedPacketGiftType redPacketGiftType2 = balance.giftType;
            if (redPacketGiftType2 != null) {
                iD2 += CodedOutputByteBufferNano.l(13, redPacketGiftType2, RedPacketGiftType.PROTOBUF_ADAPTER);
            }
            ((MessageNano) balance).cachedSize = iD2;
            return iD2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Balance m11725parse(nb5 nb5Var) throws IOException {
            Balance balance = new Balance();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            Integer numValueOf3 = null;
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (balance.operation == null && numValueOf != null) {
                            balance.operation = (BalanceOpsType) BalanceOpsType.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (balance.status == null && numValueOf2 != null) {
                            balance.status = (BalanceStatusType) BalanceStatusType.JSON_ADAPTER.newTEnum((String) null, numValueOf2.intValue());
                        }
                        if (balance.giftType == null && numValueOf3 != null) {
                            balance.giftType = (RedPacketGiftType) RedPacketGiftType.JSON_ADAPTER.newTEnum((String) null, numValueOf3.intValue());
                        }
                        if (balance.f13id == null) {
                            balance.f13id = "";
                        }
                        if (balance.operation == null) {
                            balance.operation = (BalanceOpsType) BalanceOpsType.JSON_ADAPTER.defaultEnum();
                        }
                        if (balance.status == null) {
                            balance.status = (BalanceStatusType) BalanceStatusType.JSON_ADAPTER.defaultEnum();
                        }
                        if (balance.failedReason == null) {
                            balance.failedReason = "";
                        }
                        if (balance.otherUserName == null) {
                            balance.otherUserName = "";
                        }
                        if (balance.giftType == null) {
                            balance.giftType = (RedPacketGiftType) RedPacketGiftType.JSON_ADAPTER.defaultEnum();
                        }
                        break;
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        balance.f13id = nb5Var.s();
                        continue;
                    case 16:
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case 25:
                        balance.amount = nb5Var.h();
                        continue;
                    case 33:
                        balance.actualAmount = nb5Var.h();
                        continue;
                    case 40:
                        numValueOf2 = Integer.valueOf(nb5Var.j());
                        continue;
                    case 49:
                        balance.createdTime = nb5Var.h();
                        continue;
                    case 57:
                        balance.updatedTime = nb5Var.h();
                        continue;
                    case 66:
                        balance.failedReason = nb5Var.s();
                        continue;
                    case 74:
                        balance.otherUserName = nb5Var.s();
                        continue;
                    case 80:
                        numValueOf3 = Integer.valueOf(nb5Var.j());
                        continue;
                    case Conversation.LEVEL_TOP_PLATINUM /* 90 */:
                        balance.operation = (BalanceOpsType) nb5Var.l(BalanceOpsType.PROTOBUF_ADAPTER);
                        continue;
                    case 98:
                        balance.status = (BalanceStatusType) nb5Var.l(BalanceStatusType.PROTOBUF_ADAPTER);
                        continue;
                    case 106:
                        balance.giftType = (RedPacketGiftType) nb5Var.l(RedPacketGiftType.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (balance.operation == null && numValueOf != null) {
                            balance.operation = (BalanceOpsType) BalanceOpsType.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (balance.status == null && numValueOf2 != null) {
                            balance.status = (BalanceStatusType) BalanceStatusType.JSON_ADAPTER.newTEnum((String) null, numValueOf2.intValue());
                        }
                        if (balance.giftType == null && numValueOf3 != null) {
                            balance.giftType = (RedPacketGiftType) RedPacketGiftType.JSON_ADAPTER.newTEnum((String) null, numValueOf3.intValue());
                        }
                        if (balance.f13id == null) {
                            balance.f13id = "";
                        }
                        if (balance.operation == null) {
                            balance.operation = (BalanceOpsType) BalanceOpsType.JSON_ADAPTER.defaultEnum();
                        }
                        if (balance.status == null) {
                            balance.status = (BalanceStatusType) BalanceStatusType.JSON_ADAPTER.defaultEnum();
                        }
                        if (balance.failedReason == null) {
                            balance.failedReason = "";
                        }
                        if (balance.otherUserName == null) {
                            balance.otherUserName = "";
                        }
                        if (balance.giftType == null) {
                            balance.giftType = (RedPacketGiftType) RedPacketGiftType.JSON_ADAPTER.defaultEnum();
                            return balance;
                        }
                        break;
                }
            }
            return balance;
        }

        public void serialize(Balance balance, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = balance.f13id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            BalanceOpsType balanceOpsType = balance.operation;
            if (balanceOpsType != null) {
                codedOutputByteBufferNano.G(2, balanceOpsType.ordinal());
            }
            codedOutputByteBufferNano.C(3, balance.amount);
            codedOutputByteBufferNano.C(4, balance.actualAmount);
            BalanceStatusType balanceStatusType = balance.status;
            if (balanceStatusType != null) {
                codedOutputByteBufferNano.G(5, balanceStatusType.ordinal());
            }
            codedOutputByteBufferNano.C(6, balance.createdTime);
            codedOutputByteBufferNano.C(7, balance.updatedTime);
            String str2 = balance.failedReason;
            if (str2 != null) {
                codedOutputByteBufferNano.R(8, str2);
            }
            String str3 = balance.otherUserName;
            if (str3 != null) {
                codedOutputByteBufferNano.R(9, str3);
            }
            RedPacketGiftType redPacketGiftType = balance.giftType;
            if (redPacketGiftType != null) {
                codedOutputByteBufferNano.G(10, redPacketGiftType.ordinal());
            }
            BalanceOpsType balanceOpsType2 = balance.operation;
            if (balanceOpsType2 != null) {
                codedOutputByteBufferNano.K(11, balanceOpsType2, BalanceOpsType.PROTOBUF_ADAPTER);
            }
            BalanceStatusType balanceStatusType2 = balance.status;
            if (balanceStatusType2 != null) {
                codedOutputByteBufferNano.K(12, balanceStatusType2, BalanceStatusType.PROTOBUF_ADAPTER);
            }
            RedPacketGiftType redPacketGiftType2 = balance.giftType;
            if (redPacketGiftType2 != null) {
                codedOutputByteBufferNano.K(13, redPacketGiftType2, RedPacketGiftType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Balance> JSON_ADAPTER = new ObjectJsonAdapter<Balance>() { // from class: com.p1.mobile.putong.core.data.Balance.2
        public Class getDataClass() {
            return Balance.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Balance m11726newInstance() {
            return new Balance();
        }

        public boolean parseField(Balance balance, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "amount":
                    balance.amount = jsonParser.getValueAsDouble();
                    return true;
                case "otherUserName":
                    balance.otherUserName = jsonParser.getValueAsString();
                    return true;
                case "status":
                    balance.status = (BalanceStatusType) BalanceStatusType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "updatedTime":
                    balance.updatedTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "createdTime":
                    balance.createdTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "id":
                    balance.f13id = jsonParser.getValueAsString();
                    return false;
                case "actualAmount":
                    balance.actualAmount = jsonParser.getValueAsDouble();
                    return true;
                case "giftType":
                    balance.giftType = (RedPacketGiftType) RedPacketGiftType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "operation":
                    balance.operation = (BalanceOpsType) BalanceOpsType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "failedReason":
                    balance.failedReason = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Balance balance, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "amount":
                case "otherUserName":
                case "status":
                case "updatedTime":
                case "createdTime":
                    return true;
                case "id":
                    return false;
                case "actualAmount":
                case "giftType":
                case "operation":
                case "failedReason":
                    return true;
                default:
                    return super.parseFieldCheck(balance, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(Balance balance, JsonGenerator jsonGenerator) throws IOException {
            String str = balance.f13id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (balance.operation != null) {
                jsonGenerator.writeFieldName(MessageType.operation);
                BalanceOpsType.JSON_ADAPTER.serialize(balance.operation, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("amount", balance.amount);
            jsonGenerator.writeNumberField("actualAmount", balance.actualAmount);
            if (balance.status != null) {
                jsonGenerator.writeFieldName("status");
                BalanceStatusType.JSON_ADAPTER.serialize(balance.status, jsonGenerator, true);
            }
            jsonGenerator.writeFieldName("createdTime");
            JsonAdapter jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(balance.createdTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("updatedTime");
            jsonAdapter.serialize(Double.valueOf(balance.updatedTime), jsonGenerator, true);
            String str2 = balance.failedReason;
            if (str2 != null) {
                jsonGenerator.writeStringField("failedReason", str2);
            }
            String str3 = balance.otherUserName;
            if (str3 != null) {
                jsonGenerator.writeStringField("otherUserName", str3);
            }
            if (balance.giftType != null) {
                jsonGenerator.writeFieldName("giftType");
                RedPacketGiftType.JSON_ADAPTER.serialize(balance.giftType, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Balance) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Balance) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Balance new_() {
        Balance balance = new Balance();
        balance.nullCheck();
        return balance;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Balance m11724clone() {
        Balance balance = new Balance();
        balance.f13id = this.f13id;
        balance.operation = this.operation;
        balance.amount = this.amount;
        balance.actualAmount = this.actualAmount;
        balance.status = this.status;
        balance.createdTime = this.createdTime;
        balance.updatedTime = this.updatedTime;
        balance.failedReason = this.failedReason;
        balance.otherUserName = this.otherUserName;
        balance.giftType = this.giftType;
        return balance;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Balance)) {
            return false;
        }
        Balance balance = (Balance) obj;
        return ValueObject.util_equals(this.f13id, balance.f13id) && ValueObject.util_equals(this.operation, balance.operation) && this.amount == balance.amount && this.actualAmount == balance.actualAmount && ValueObject.util_equals(this.status, balance.status) && this.createdTime == balance.createdTime && this.updatedTime == balance.updatedTime && ValueObject.util_equals(this.failedReason, balance.failedReason) && ValueObject.util_equals(this.otherUserName, balance.otherUserName) && ValueObject.util_equals(this.giftType, balance.giftType);
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
        String str = this.f13id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BalanceOpsType balanceOpsType = this.operation;
        int iHashCode2 = balanceOpsType != null ? balanceOpsType.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.amount);
        int i3 = ((iHashCode + iHashCode2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.actualAmount);
        int i4 = ((i3 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41;
        BalanceStatusType balanceStatusType = this.status;
        int iHashCode3 = i4 + (balanceStatusType != null ? balanceStatusType.hashCode() : 0);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.createdTime);
        int i5 = (iHashCode3 * 41) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.updatedTime);
        int i6 = ((i5 * 41) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 41;
        String str2 = this.failedReason;
        int iHashCode4 = (i6 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.otherUserName;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 41;
        RedPacketGiftType redPacketGiftType = this.giftType;
        int iHashCode6 = iHashCode5 + (redPacketGiftType != null ? redPacketGiftType.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

    public void nullCheck() {
        if (this.f13id == null) {
            this.f13id = "";
        }
        if (this.operation == null) {
            this.operation = (BalanceOpsType) BalanceOpsType.JSON_ADAPTER.defaultEnum();
        }
        if (this.status == null) {
            this.status = (BalanceStatusType) BalanceStatusType.JSON_ADAPTER.defaultEnum();
        }
        if (this.failedReason == null) {
            this.failedReason = "";
        }
        if (this.otherUserName == null) {
            this.otherUserName = "";
        }
        if (this.giftType == null) {
            this.giftType = (RedPacketGiftType) RedPacketGiftType.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
