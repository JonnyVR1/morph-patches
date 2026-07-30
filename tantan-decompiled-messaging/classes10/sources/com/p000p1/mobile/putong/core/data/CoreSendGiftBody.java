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
public class CoreSendGiftBody extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "coresendgiftbody";

    @NonNull
    @ProtobufIndex(index = 1)
    public String bizIdentifier;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String bizType;

    @NonNull
    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public String coinSign;

    @NonNull
    @ProtobufIndex(index = 9)
    public String consumeType;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public SendGiftExtra extra;

    @ProtobufIndex(index = 4)
    public int giftAmount;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String giftID;

    @NonNull
    @ProtobufIndex(index = 6)
    public String recvUserID;

    @NonNull
    @ProtobufIndex(index = 8)
    public GiftSubBizType subBizType;
    public static ProtobufAdapter<CoreSendGiftBody> PROTOBUF_ADAPTER = new MessageNanoAdapter<CoreSendGiftBody>() { // from class: com.p1.mobile.putong.core.data.CoreSendGiftBody.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CoreSendGiftBody coreSendGiftBody) {
            String str = coreSendGiftBody.bizIdentifier;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = coreSendGiftBody.bizType;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            SendGiftExtra sendGiftExtra = coreSendGiftBody.extra;
            if (sendGiftExtra != null) {
                iO += CodedOutputByteBufferNano.l(3, sendGiftExtra, SendGiftExtra.PROTOBUF_ADAPTER);
            }
            int iH = iO + CodedOutputByteBufferNano.h(4, coreSendGiftBody.giftAmount);
            String str3 = coreSendGiftBody.giftID;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(5, str3);
            }
            String str4 = coreSendGiftBody.recvUserID;
            if (str4 != null) {
                iH += CodedOutputByteBufferNano.o(6, str4);
            }
            GiftSubBizType giftSubBizType = coreSendGiftBody.subBizType;
            if (giftSubBizType != null) {
                iH += CodedOutputByteBufferNano.l(7, giftSubBizType, GiftSubBizType.PROTOBUF_ADAPTER);
            }
            GiftSubBizType giftSubBizType2 = coreSendGiftBody.subBizType;
            if (giftSubBizType2 != null) {
                iH += CodedOutputByteBufferNano.h(8, giftSubBizType2.ordinal());
            }
            String str5 = coreSendGiftBody.consumeType;
            if (str5 != null) {
                iH += CodedOutputByteBufferNano.o(9, str5);
            }
            String str6 = coreSendGiftBody.coinSign;
            if (str6 != null) {
                iH += CodedOutputByteBufferNano.o(10, str6);
            }
            ((MessageNano) coreSendGiftBody).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CoreSendGiftBody m12525parse(nb5 nb5Var) throws IOException {
            CoreSendGiftBody coreSendGiftBody = new CoreSendGiftBody();
            Integer numValueOf = null;
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (coreSendGiftBody.subBizType == null && numValueOf != null) {
                            coreSendGiftBody.subBizType = (GiftSubBizType) GiftSubBizType.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (coreSendGiftBody.bizIdentifier == null) {
                            coreSendGiftBody.bizIdentifier = "";
                        }
                        if (coreSendGiftBody.bizType == null) {
                            coreSendGiftBody.bizType = "";
                        }
                        if (coreSendGiftBody.extra == null) {
                            coreSendGiftBody.extra = SendGiftExtra.new_();
                        }
                        if (coreSendGiftBody.giftID == null) {
                            coreSendGiftBody.giftID = "";
                        }
                        if (coreSendGiftBody.recvUserID == null) {
                            coreSendGiftBody.recvUserID = "";
                        }
                        if (coreSendGiftBody.subBizType == null) {
                            coreSendGiftBody.subBizType = (GiftSubBizType) GiftSubBizType.JSON_ADAPTER.defaultEnum();
                        }
                        if (coreSendGiftBody.consumeType == null) {
                            coreSendGiftBody.consumeType = "";
                        }
                        if (coreSendGiftBody.coinSign == null) {
                            coreSendGiftBody.coinSign = "";
                        }
                        break;
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        coreSendGiftBody.bizIdentifier = nb5Var.s();
                        continue;
                    case 18:
                        coreSendGiftBody.bizType = nb5Var.s();
                        continue;
                    case 26:
                        coreSendGiftBody.extra = (SendGiftExtra) nb5Var.l(SendGiftExtra.PROTOBUF_ADAPTER);
                        continue;
                    case 32:
                        coreSendGiftBody.giftAmount = nb5Var.j();
                        continue;
                    case 42:
                        coreSendGiftBody.giftID = nb5Var.s();
                        continue;
                    case Conversation.EXPOSURE_LEVEL_TOP /* 50 */:
                        coreSendGiftBody.recvUserID = nb5Var.s();
                        continue;
                    case 58:
                        coreSendGiftBody.subBizType = (GiftSubBizType) nb5Var.l(GiftSubBizType.PROTOBUF_ADAPTER);
                        continue;
                    case 64:
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case 74:
                        coreSendGiftBody.consumeType = nb5Var.s();
                        continue;
                    case 82:
                        coreSendGiftBody.coinSign = nb5Var.s();
                        continue;
                    default:
                        if (coreSendGiftBody.subBizType == null && numValueOf != null) {
                            coreSendGiftBody.subBizType = (GiftSubBizType) GiftSubBizType.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (coreSendGiftBody.bizIdentifier == null) {
                            coreSendGiftBody.bizIdentifier = "";
                        }
                        if (coreSendGiftBody.bizType == null) {
                            coreSendGiftBody.bizType = "";
                        }
                        if (coreSendGiftBody.extra == null) {
                            coreSendGiftBody.extra = SendGiftExtra.new_();
                        }
                        if (coreSendGiftBody.giftID == null) {
                            coreSendGiftBody.giftID = "";
                        }
                        if (coreSendGiftBody.recvUserID == null) {
                            coreSendGiftBody.recvUserID = "";
                        }
                        if (coreSendGiftBody.subBizType == null) {
                            coreSendGiftBody.subBizType = (GiftSubBizType) GiftSubBizType.JSON_ADAPTER.defaultEnum();
                        }
                        if (coreSendGiftBody.consumeType == null) {
                            coreSendGiftBody.consumeType = "";
                        }
                        if (coreSendGiftBody.coinSign == null) {
                            coreSendGiftBody.coinSign = "";
                            return coreSendGiftBody;
                        }
                        break;
                }
            }
            return coreSendGiftBody;
        }

        public void serialize(CoreSendGiftBody coreSendGiftBody, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = coreSendGiftBody.bizIdentifier;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = coreSendGiftBody.bizType;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            SendGiftExtra sendGiftExtra = coreSendGiftBody.extra;
            if (sendGiftExtra != null) {
                codedOutputByteBufferNano.K(3, sendGiftExtra, SendGiftExtra.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.G(4, coreSendGiftBody.giftAmount);
            String str3 = coreSendGiftBody.giftID;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
            String str4 = coreSendGiftBody.recvUserID;
            if (str4 != null) {
                codedOutputByteBufferNano.R(6, str4);
            }
            GiftSubBizType giftSubBizType = coreSendGiftBody.subBizType;
            if (giftSubBizType != null) {
                codedOutputByteBufferNano.K(7, giftSubBizType, GiftSubBizType.PROTOBUF_ADAPTER);
            }
            GiftSubBizType giftSubBizType2 = coreSendGiftBody.subBizType;
            if (giftSubBizType2 != null) {
                codedOutputByteBufferNano.G(8, giftSubBizType2.ordinal());
            }
            String str5 = coreSendGiftBody.consumeType;
            if (str5 != null) {
                codedOutputByteBufferNano.R(9, str5);
            }
            String str6 = coreSendGiftBody.coinSign;
            if (str6 != null) {
                codedOutputByteBufferNano.R(10, str6);
            }
        }
    };
    public static JsonAdapter<CoreSendGiftBody> JSON_ADAPTER = new ObjectJsonAdapter<CoreSendGiftBody>() { // from class: com.p1.mobile.putong.core.data.CoreSendGiftBody.2
        public Class getDataClass() {
            return CoreSendGiftBody.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CoreSendGiftBody m12526newInstance() {
            return new CoreSendGiftBody();
        }

        public boolean parseField(CoreSendGiftBody coreSendGiftBody, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bizIdentifier":
                    coreSendGiftBody.bizIdentifier = jsonParser.getValueAsString();
                    return true;
                case "subBizType":
                    coreSendGiftBody.subBizType = (GiftSubBizType) GiftSubBizType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "giftID":
                    coreSendGiftBody.giftID = jsonParser.getValueAsString();
                    return true;
                case "consumeType":
                    coreSendGiftBody.consumeType = jsonParser.getValueAsString();
                    return true;
                case "coinSign":
                    coreSendGiftBody.coinSign = jsonParser.getValueAsString();
                    return true;
                case "giftAmount":
                    coreSendGiftBody.giftAmount = jsonParser.getValueAsInt();
                    return true;
                case "bizType":
                    coreSendGiftBody.bizType = jsonParser.getValueAsString();
                    return true;
                case "extra":
                    coreSendGiftBody.extra = (SendGiftExtra) SendGiftExtra.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "recvUserID":
                    coreSendGiftBody.recvUserID = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CoreSendGiftBody coreSendGiftBody, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "bizIdentifier":
                case "subBizType":
                case "giftID":
                case "consumeType":
                case "coinSign":
                case "giftAmount":
                case "bizType":
                case "extra":
                case "recvUserID":
                    return true;
                default:
                    return super.parseFieldCheck(coreSendGiftBody, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(CoreSendGiftBody coreSendGiftBody, JsonGenerator jsonGenerator) throws IOException {
            String str = coreSendGiftBody.bizIdentifier;
            if (str != null) {
                jsonGenerator.writeStringField("bizIdentifier", str);
            }
            String str2 = coreSendGiftBody.bizType;
            if (str2 != null) {
                jsonGenerator.writeStringField("bizType", str2);
            }
            if (coreSendGiftBody.extra != null) {
                jsonGenerator.writeFieldName("extra");
                SendGiftExtra.JSON_ADAPTER.serialize(coreSendGiftBody.extra, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("giftAmount", coreSendGiftBody.giftAmount);
            String str3 = coreSendGiftBody.giftID;
            if (str3 != null) {
                jsonGenerator.writeStringField("giftID", str3);
            }
            String str4 = coreSendGiftBody.recvUserID;
            if (str4 != null) {
                jsonGenerator.writeStringField("recvUserID", str4);
            }
            if (coreSendGiftBody.subBizType != null) {
                jsonGenerator.writeFieldName("subBizType");
                GiftSubBizType.JSON_ADAPTER.serialize(coreSendGiftBody.subBizType, jsonGenerator, true);
            }
            String str5 = coreSendGiftBody.consumeType;
            if (str5 != null) {
                jsonGenerator.writeStringField("consumeType", str5);
            }
            String str6 = coreSendGiftBody.coinSign;
            if (str6 != null) {
                jsonGenerator.writeStringField("coinSign", str6);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CoreSendGiftBody) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CoreSendGiftBody) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CoreSendGiftBody new_() {
        CoreSendGiftBody coreSendGiftBody = new CoreSendGiftBody();
        coreSendGiftBody.nullCheck();
        return coreSendGiftBody;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CoreSendGiftBody m12524clone() {
        CoreSendGiftBody coreSendGiftBody = new CoreSendGiftBody();
        coreSendGiftBody.bizIdentifier = this.bizIdentifier;
        coreSendGiftBody.bizType = this.bizType;
        SendGiftExtra sendGiftExtra = this.extra;
        if (sendGiftExtra != null) {
            coreSendGiftBody.extra = sendGiftExtra.m15580clone();
        }
        coreSendGiftBody.giftAmount = this.giftAmount;
        coreSendGiftBody.giftID = this.giftID;
        coreSendGiftBody.recvUserID = this.recvUserID;
        coreSendGiftBody.subBizType = this.subBizType;
        coreSendGiftBody.consumeType = this.consumeType;
        coreSendGiftBody.coinSign = this.coinSign;
        return coreSendGiftBody;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CoreSendGiftBody)) {
            return false;
        }
        CoreSendGiftBody coreSendGiftBody = (CoreSendGiftBody) obj;
        return ValueObject.util_equals(this.bizIdentifier, coreSendGiftBody.bizIdentifier) && ValueObject.util_equals(this.bizType, coreSendGiftBody.bizType) && ValueObject.util_equals(this.extra, coreSendGiftBody.extra) && this.giftAmount == coreSendGiftBody.giftAmount && ValueObject.util_equals(this.giftID, coreSendGiftBody.giftID) && ValueObject.util_equals(this.recvUserID, coreSendGiftBody.recvUserID) && ValueObject.util_equals(this.subBizType, coreSendGiftBody.subBizType) && ValueObject.util_equals(this.consumeType, coreSendGiftBody.consumeType) && ValueObject.util_equals(this.coinSign, coreSendGiftBody.coinSign);
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
        String str = this.bizIdentifier;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.bizType;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        SendGiftExtra sendGiftExtra = this.extra;
        int iHashCode3 = (((iHashCode2 + (sendGiftExtra != null ? sendGiftExtra.hashCode() : 0)) * 41) + this.giftAmount) * 41;
        String str3 = this.giftID;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.recvUserID;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        GiftSubBizType giftSubBizType = this.subBizType;
        int iHashCode6 = (iHashCode5 + (giftSubBizType != null ? giftSubBizType.hashCode() : 0)) * 41;
        String str5 = this.consumeType;
        int iHashCode7 = (iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.coinSign;
        int iHashCode8 = iHashCode7 + (str6 != null ? str6.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode8;
        return iHashCode8;
    }

    public void nullCheck() {
        if (this.bizIdentifier == null) {
            this.bizIdentifier = "";
        }
        if (this.bizType == null) {
            this.bizType = "";
        }
        if (this.extra == null) {
            this.extra = SendGiftExtra.new_();
        }
        if (this.giftID == null) {
            this.giftID = "";
        }
        if (this.recvUserID == null) {
            this.recvUserID = "";
        }
        if (this.subBizType == null) {
            this.subBizType = (GiftSubBizType) GiftSubBizType.JSON_ADAPTER.defaultEnum();
        }
        if (this.consumeType == null) {
            this.consumeType = "";
        }
        if (this.coinSign == null) {
            this.coinSign = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
