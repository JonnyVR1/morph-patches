package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.ReceiveRecords;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class RedPacket extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "redpacket";

    @NonNull
    @ProtobufIndex(index = 7)
    public String assignAmount;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int assignQuantity;

    @ProtobufIndex(index = 11)
    public long createTime;

    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public long expireTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f151id;

    @NonNull
    @ProtobufIndex(index = 13)
    public RedPacketMyInfo myInfo;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public RedPacketOwner owner;

    @ProtobufIndex(index = 9)
    public long payExpireTime;

    @Nullable
    @ProtobufIndex(index = 14)
    public String paySign;

    @ProtobufIndex(index = 4)
    public int quantity;

    @NonNull
    @ProtobufIndex(index = 12)
    public List<ReceiveRecords> receiveRecords;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public RedPacketInfo showInfo;

    @NonNull
    @ProtobufIndex(index = 8)
    public String splitType;

    @Nullable
    @ProtobufIndex(index = 15)
    public String status;

    @NonNull
    @ProtobufIndex(index = 6)
    public String totalAmount;
    public static ProtobufAdapter<RedPacket> PROTOBUF_ADAPTER = new MessageNanoAdapter<RedPacket>() { // from class: com.p1.mobile.putong.core.data.RedPacket.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RedPacket redPacket) {
            String str = redPacket.f151id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            RedPacketOwner redPacketOwner = redPacket.owner;
            if (redPacketOwner != null) {
                iO += CodedOutputByteBufferNano.l(2, redPacketOwner, RedPacketOwner.PROTOBUF_ADAPTER);
            }
            RedPacketInfo redPacketInfo = redPacket.showInfo;
            if (redPacketInfo != null) {
                iO += CodedOutputByteBufferNano.l(3, redPacketInfo, RedPacketInfo.PROTOBUF_ADAPTER);
            }
            int iH = iO + CodedOutputByteBufferNano.h(4, redPacket.quantity) + CodedOutputByteBufferNano.h(5, redPacket.assignQuantity);
            String str2 = redPacket.totalAmount;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(6, str2);
            }
            String str3 = redPacket.assignAmount;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(7, str3);
            }
            String str4 = redPacket.splitType;
            if (str4 != null) {
                iH += CodedOutputByteBufferNano.o(8, str4);
            }
            int iJ = iH + CodedOutputByteBufferNano.j(9, redPacket.payExpireTime) + CodedOutputByteBufferNano.j(10, redPacket.expireTime) + CodedOutputByteBufferNano.j(11, redPacket.createTime);
            List<ReceiveRecords> list = redPacket.receiveRecords;
            if (list != null) {
                iJ += CodedOutputByteBufferNano.l(12, list, ReceiveRecords.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            RedPacketMyInfo redPacketMyInfo = redPacket.myInfo;
            if (redPacketMyInfo != null) {
                iJ += CodedOutputByteBufferNano.l(13, redPacketMyInfo, RedPacketMyInfo.PROTOBUF_ADAPTER);
            }
            String str5 = redPacket.paySign;
            if (str5 != null) {
                iJ += CodedOutputByteBufferNano.o(14, str5);
            }
            String str6 = redPacket.status;
            if (str6 != null) {
                iJ += CodedOutputByteBufferNano.o(15, str6);
            }
            ((MessageNano) redPacket).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RedPacket m15333parse(nb5 nb5Var) throws IOException {
            RedPacket redPacket = new RedPacket();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (redPacket.f151id == null) {
                            redPacket.f151id = "";
                        }
                        if (redPacket.owner == null) {
                            redPacket.owner = RedPacketOwner.new_();
                        }
                        if (redPacket.showInfo == null) {
                            redPacket.showInfo = RedPacketInfo.new_();
                        }
                        if (redPacket.totalAmount == null) {
                            redPacket.totalAmount = "";
                        }
                        if (redPacket.assignAmount == null) {
                            redPacket.assignAmount = "";
                        }
                        if (redPacket.splitType == null) {
                            redPacket.splitType = "";
                        }
                        if (redPacket.receiveRecords == null) {
                            redPacket.receiveRecords = new ArrayList();
                        }
                        if (redPacket.myInfo == null) {
                            redPacket.myInfo = RedPacketMyInfo.new_();
                        }
                        break;
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        redPacket.f151id = nb5Var.s();
                        continue;
                    case 18:
                        redPacket.owner = (RedPacketOwner) nb5Var.l(RedPacketOwner.PROTOBUF_ADAPTER);
                        continue;
                    case 26:
                        redPacket.showInfo = (RedPacketInfo) nb5Var.l(RedPacketInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 32:
                        redPacket.quantity = nb5Var.j();
                        continue;
                    case 40:
                        redPacket.assignQuantity = nb5Var.j();
                        continue;
                    case Conversation.EXPOSURE_LEVEL_TOP /* 50 */:
                        redPacket.totalAmount = nb5Var.s();
                        continue;
                    case 58:
                        redPacket.assignAmount = nb5Var.s();
                        continue;
                    case 66:
                        redPacket.splitType = nb5Var.s();
                        continue;
                    case 72:
                        redPacket.payExpireTime = nb5Var.k();
                        continue;
                    case 80:
                        redPacket.expireTime = nb5Var.k();
                        continue;
                    case 88:
                        redPacket.createTime = nb5Var.k();
                        continue;
                    case 98:
                        redPacket.receiveRecords = (List) nb5Var.l(ReceiveRecords.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 106:
                        redPacket.myInfo = (RedPacketMyInfo) nb5Var.l(RedPacketMyInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 114:
                        redPacket.paySign = nb5Var.s();
                        continue;
                    case 122:
                        redPacket.status = nb5Var.s();
                        continue;
                    default:
                        if (redPacket.f151id == null) {
                            redPacket.f151id = "";
                        }
                        if (redPacket.owner == null) {
                            redPacket.owner = RedPacketOwner.new_();
                        }
                        if (redPacket.showInfo == null) {
                            redPacket.showInfo = RedPacketInfo.new_();
                        }
                        if (redPacket.totalAmount == null) {
                            redPacket.totalAmount = "";
                        }
                        if (redPacket.assignAmount == null) {
                            redPacket.assignAmount = "";
                        }
                        if (redPacket.splitType == null) {
                            redPacket.splitType = "";
                        }
                        if (redPacket.receiveRecords == null) {
                            redPacket.receiveRecords = new ArrayList();
                        }
                        if (redPacket.myInfo == null) {
                            redPacket.myInfo = RedPacketMyInfo.new_();
                            return redPacket;
                        }
                        break;
                }
            }
            return redPacket;
        }

        public void serialize(RedPacket redPacket, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = redPacket.f151id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            RedPacketOwner redPacketOwner = redPacket.owner;
            if (redPacketOwner != null) {
                codedOutputByteBufferNano.K(2, redPacketOwner, RedPacketOwner.PROTOBUF_ADAPTER);
            }
            RedPacketInfo redPacketInfo = redPacket.showInfo;
            if (redPacketInfo != null) {
                codedOutputByteBufferNano.K(3, redPacketInfo, RedPacketInfo.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.G(4, redPacket.quantity);
            codedOutputByteBufferNano.G(5, redPacket.assignQuantity);
            String str2 = redPacket.totalAmount;
            if (str2 != null) {
                codedOutputByteBufferNano.R(6, str2);
            }
            String str3 = redPacket.assignAmount;
            if (str3 != null) {
                codedOutputByteBufferNano.R(7, str3);
            }
            String str4 = redPacket.splitType;
            if (str4 != null) {
                codedOutputByteBufferNano.R(8, str4);
            }
            codedOutputByteBufferNano.I(9, redPacket.payExpireTime);
            codedOutputByteBufferNano.I(10, redPacket.expireTime);
            codedOutputByteBufferNano.I(11, redPacket.createTime);
            List<ReceiveRecords> list = redPacket.receiveRecords;
            if (list != null) {
                codedOutputByteBufferNano.K(12, list, ReceiveRecords.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            RedPacketMyInfo redPacketMyInfo = redPacket.myInfo;
            if (redPacketMyInfo != null) {
                codedOutputByteBufferNano.K(13, redPacketMyInfo, RedPacketMyInfo.PROTOBUF_ADAPTER);
            }
            String str5 = redPacket.paySign;
            if (str5 != null) {
                codedOutputByteBufferNano.R(14, str5);
            }
            String str6 = redPacket.status;
            if (str6 != null) {
                codedOutputByteBufferNano.R(15, str6);
            }
        }
    };
    public static JsonAdapter<RedPacket> JSON_ADAPTER = new ObjectJsonAdapter<RedPacket>() { // from class: com.p1.mobile.putong.core.data.RedPacket.2
        public Class getDataClass() {
            return RedPacket.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RedPacket m15334newInstance() {
            return new RedPacket();
        }

        public boolean parseField(RedPacket redPacket, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "receiveRecords":
                    redPacket.receiveRecords = JsonAdapter.parseArray(jsonParser, ReceiveRecords.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "quantity":
                    redPacket.quantity = jsonParser.getValueAsInt();
                    return true;
                case "totalAmount":
                    redPacket.totalAmount = jsonParser.getValueAsString();
                    return true;
                case "myInfo":
                    redPacket.myInfo = (RedPacketMyInfo) RedPacketMyInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "status":
                    redPacket.status = jsonParser.getValueAsString();
                    return true;
                case "expireTime":
                    redPacket.expireTime = jsonParser.getValueAsLong();
                    return true;
                case "paySign":
                    redPacket.paySign = jsonParser.getValueAsString();
                    return true;
                case "payExpireTime":
                    redPacket.payExpireTime = jsonParser.getValueAsLong();
                    return true;
                case "showInfo":
                    redPacket.showInfo = (RedPacketInfo) RedPacketInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "assignQuantity":
                    redPacket.assignQuantity = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    redPacket.f151id = jsonParser.getValueAsString();
                    return false;
                case "owner":
                    redPacket.owner = (RedPacketOwner) RedPacketOwner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "splitType":
                    redPacket.splitType = jsonParser.getValueAsString();
                    return true;
                case "createTime":
                    redPacket.createTime = jsonParser.getValueAsLong();
                    return true;
                case "assignAmount":
                    redPacket.assignAmount = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RedPacket redPacket, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "receiveRecords":
                case "quantity":
                case "totalAmount":
                case "myInfo":
                case "status":
                case "expireTime":
                case "paySign":
                case "payExpireTime":
                case "showInfo":
                case "assignQuantity":
                    return true;
                case "id":
                    return false;
                case "owner":
                case "splitType":
                case "createTime":
                case "assignAmount":
                    return true;
                default:
                    return super.parseFieldCheck(redPacket, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(RedPacket redPacket, JsonGenerator jsonGenerator) throws IOException {
            String str = redPacket.f151id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (redPacket.owner != null) {
                jsonGenerator.writeFieldName("owner");
                RedPacketOwner.JSON_ADAPTER.serialize(redPacket.owner, jsonGenerator, true);
            }
            if (redPacket.showInfo != null) {
                jsonGenerator.writeFieldName("showInfo");
                RedPacketInfo.JSON_ADAPTER.serialize(redPacket.showInfo, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("quantity", redPacket.quantity);
            jsonGenerator.writeNumberField("assignQuantity", redPacket.assignQuantity);
            String str2 = redPacket.totalAmount;
            if (str2 != null) {
                jsonGenerator.writeStringField("totalAmount", str2);
            }
            String str3 = redPacket.assignAmount;
            if (str3 != null) {
                jsonGenerator.writeStringField("assignAmount", str3);
            }
            String str4 = redPacket.splitType;
            if (str4 != null) {
                jsonGenerator.writeStringField("splitType", str4);
            }
            jsonGenerator.writeNumberField("payExpireTime", redPacket.payExpireTime);
            jsonGenerator.writeNumberField("expireTime", redPacket.expireTime);
            jsonGenerator.writeNumberField("createTime", redPacket.createTime);
            if (redPacket.receiveRecords != null) {
                jsonGenerator.writeFieldName("receiveRecords");
                JsonAdapter.serializeArray(redPacket.receiveRecords, jsonGenerator, ReceiveRecords.JSON_ADAPTER);
            }
            if (redPacket.myInfo != null) {
                jsonGenerator.writeFieldName("myInfo");
                RedPacketMyInfo.JSON_ADAPTER.serialize(redPacket.myInfo, jsonGenerator, true);
            }
            String str5 = redPacket.paySign;
            if (str5 != null) {
                jsonGenerator.writeStringField("paySign", str5);
            }
            String str6 = redPacket.status;
            if (str6 != null) {
                jsonGenerator.writeStringField("status", str6);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RedPacket) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RedPacket) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RedPacket new_() {
        RedPacket redPacket = new RedPacket();
        redPacket.nullCheck();
        return redPacket;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RedPacket m15332clone() {
        RedPacket redPacket = new RedPacket();
        redPacket.f151id = this.f151id;
        RedPacketOwner redPacketOwner = this.owner;
        if (redPacketOwner != null) {
            redPacket.owner = redPacketOwner.m15346clone();
        }
        RedPacketInfo redPacketInfo = this.showInfo;
        if (redPacketInfo != null) {
            redPacket.showInfo = redPacketInfo.m15338clone();
        }
        redPacket.quantity = this.quantity;
        redPacket.assignQuantity = this.assignQuantity;
        redPacket.totalAmount = this.totalAmount;
        redPacket.assignAmount = this.assignAmount;
        redPacket.splitType = this.splitType;
        redPacket.payExpireTime = this.payExpireTime;
        redPacket.expireTime = this.expireTime;
        redPacket.createTime = this.createTime;
        List<ReceiveRecords> list = this.receiveRecords;
        if (list != null) {
            redPacket.receiveRecords = ValueObject.util_map(list, new w9j() { // from class: l.ikc0
                public final Object call(Object obj) {
                    return ((ReceiveRecords) obj).m15296clone();
                }
            });
        }
        RedPacketMyInfo redPacketMyInfo = this.myInfo;
        if (redPacketMyInfo != null) {
            redPacket.myInfo = redPacketMyInfo.m15342clone();
        }
        redPacket.paySign = this.paySign;
        redPacket.status = this.status;
        return redPacket;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RedPacket)) {
            return false;
        }
        RedPacket redPacket = (RedPacket) obj;
        return ValueObject.util_equals(this.f151id, redPacket.f151id) && ValueObject.util_equals(this.owner, redPacket.owner) && ValueObject.util_equals(this.showInfo, redPacket.showInfo) && this.quantity == redPacket.quantity && this.assignQuantity == redPacket.assignQuantity && ValueObject.util_equals(this.totalAmount, redPacket.totalAmount) && ValueObject.util_equals(this.assignAmount, redPacket.assignAmount) && ValueObject.util_equals(this.splitType, redPacket.splitType) && this.payExpireTime == redPacket.payExpireTime && this.expireTime == redPacket.expireTime && this.createTime == redPacket.createTime && ValueObject.util_equals(this.receiveRecords, redPacket.receiveRecords) && ValueObject.util_equals(this.myInfo, redPacket.myInfo) && ValueObject.util_equals(this.paySign, redPacket.paySign) && ValueObject.util_equals(this.status, redPacket.status);
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
        String str = this.f151id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        RedPacketOwner redPacketOwner = this.owner;
        int iHashCode2 = (iHashCode + (redPacketOwner != null ? redPacketOwner.hashCode() : 0)) * 41;
        RedPacketInfo redPacketInfo = this.showInfo;
        int iHashCode3 = (((((iHashCode2 + (redPacketInfo != null ? redPacketInfo.hashCode() : 0)) * 41) + this.quantity) * 41) + this.assignQuantity) * 41;
        String str2 = this.totalAmount;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.assignAmount;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.splitType;
        int iHashCode6 = str4 != null ? str4.hashCode() : 0;
        long j = this.payExpireTime;
        int i3 = (((iHashCode5 + iHashCode6) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.expireTime;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.createTime;
        int i5 = (i4 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        List<ReceiveRecords> list = this.receiveRecords;
        int iHashCode7 = (i5 + (list != null ? list.hashCode() : 0)) * 41;
        RedPacketMyInfo redPacketMyInfo = this.myInfo;
        int iHashCode8 = (iHashCode7 + (redPacketMyInfo != null ? redPacketMyInfo.hashCode() : 0)) * 41;
        String str5 = this.paySign;
        int iHashCode9 = (iHashCode8 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.status;
        int iHashCode10 = iHashCode9 + (str6 != null ? str6.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode10;
        return iHashCode10;
    }

    public void nullCheck() {
        if (this.f151id == null) {
            this.f151id = "";
        }
        if (this.owner == null) {
            this.owner = RedPacketOwner.new_();
        }
        if (this.showInfo == null) {
            this.showInfo = RedPacketInfo.new_();
        }
        if (this.totalAmount == null) {
            this.totalAmount = "";
        }
        if (this.assignAmount == null) {
            this.assignAmount = "";
        }
        if (this.splitType == null) {
            this.splitType = "";
        }
        if (this.receiveRecords == null) {
            this.receiveRecords = new ArrayList();
        }
        if (this.myInfo == null) {
            this.myInfo = RedPacketMyInfo.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
