package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.CardInfos;
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
public class CardInfos extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cardinfos";

    @ProtobufIndex(index = 6)
    public boolean boostLikeYou;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String cardName;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> cardTypes;

    @NonNull
    @ProtobufIndex(index = 4)
    public String momentId;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public boolean momentLikedYou;

    @ProtobufIndex(index = 7)
    public boolean onlineHighReplyRate;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<CardInfos> PROTOBUF_ADAPTER = new MessageNanoAdapter<CardInfos>() { // from class: com.p1.mobile.putong.core.data.CardInfos.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CardInfos cardInfos) {
            String str = cardInfos.userId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<String> list = cardInfos.cardTypes;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = cardInfos.cardName;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = cardInfos.momentId;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(4, str3);
            }
            int iB = iO + CodedOutputByteBufferNano.b(5, cardInfos.momentLikedYou) + CodedOutputByteBufferNano.b(6, cardInfos.boostLikeYou) + CodedOutputByteBufferNano.b(7, cardInfos.onlineHighReplyRate);
            ((MessageNano) cardInfos).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CardInfos m11879parse(nb5 nb5Var) throws IOException {
            CardInfos cardInfos = new CardInfos();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (cardInfos.userId == null) {
                        cardInfos.userId = "";
                    }
                    if (cardInfos.cardTypes == null) {
                        cardInfos.cardTypes = new ArrayList();
                    }
                    if (cardInfos.cardName == null) {
                        cardInfos.cardName = "";
                    }
                    if (cardInfos.momentId != null) {
                        break;
                    }
                    cardInfos.momentId = "";
                    break;
                }
                if (iU == 10) {
                    cardInfos.userId = nb5Var.s();
                } else if (iU == 18) {
                    cardInfos.cardTypes = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 26) {
                    cardInfos.cardName = nb5Var.s();
                } else if (iU == 34) {
                    cardInfos.momentId = nb5Var.s();
                } else if (iU == 40) {
                    cardInfos.momentLikedYou = nb5Var.g();
                } else if (iU == 48) {
                    cardInfos.boostLikeYou = nb5Var.g();
                } else {
                    if (iU != 56) {
                        if (cardInfos.userId == null) {
                            cardInfos.userId = "";
                        }
                        if (cardInfos.cardTypes == null) {
                            cardInfos.cardTypes = new ArrayList();
                        }
                        if (cardInfos.cardName == null) {
                            cardInfos.cardName = "";
                        }
                        if (cardInfos.momentId != null) {
                            break;
                        }
                        cardInfos.momentId = "";
                        return cardInfos;
                    }
                    cardInfos.onlineHighReplyRate = nb5Var.g();
                }
            }
            return cardInfos;
        }

        public void serialize(CardInfos cardInfos, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cardInfos.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<String> list = cardInfos.cardTypes;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = cardInfos.cardName;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = cardInfos.momentId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            codedOutputByteBufferNano.A(5, cardInfos.momentLikedYou);
            codedOutputByteBufferNano.A(6, cardInfos.boostLikeYou);
            codedOutputByteBufferNano.A(7, cardInfos.onlineHighReplyRate);
        }
    };
    public static JsonAdapter<CardInfos> JSON_ADAPTER = new ObjectJsonAdapter<CardInfos>() { // from class: com.p1.mobile.putong.core.data.CardInfos.2
        public Class getDataClass() {
            return CardInfos.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CardInfos m11880newInstance() {
            return new CardInfos();
        }

        public boolean parseField(CardInfos cardInfos, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "boostLikeYou":
                    cardInfos.boostLikeYou = jsonParser.getValueAsBoolean();
                    return true;
                case "onlineHighReplyRate":
                    cardInfos.onlineHighReplyRate = jsonParser.getValueAsBoolean();
                    return true;
                case "userId":
                    cardInfos.userId = jsonParser.getValueAsString();
                    return true;
                case "momentId":
                    cardInfos.momentId = jsonParser.getValueAsString();
                    return true;
                case "cardTypes":
                    cardInfos.cardTypes = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "cardName":
                    cardInfos.cardName = jsonParser.getValueAsString();
                    return true;
                case "momentLikedYou":
                    cardInfos.momentLikedYou = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CardInfos cardInfos, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "boostLikeYou":
                case "onlineHighReplyRate":
                case "userId":
                case "momentId":
                case "cardTypes":
                case "cardName":
                case "momentLikedYou":
                    return true;
                default:
                    return super.parseFieldCheck(cardInfos, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(CardInfos cardInfos, JsonGenerator jsonGenerator) throws IOException {
            String str = cardInfos.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            if (cardInfos.cardTypes != null) {
                jsonGenerator.writeFieldName("cardTypes");
                JsonAdapter.serializeArray(cardInfos.cardTypes, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str2 = cardInfos.cardName;
            if (str2 != null) {
                jsonGenerator.writeStringField("cardName", str2);
            }
            String str3 = cardInfos.momentId;
            if (str3 != null) {
                jsonGenerator.writeStringField("momentId", str3);
            }
            jsonGenerator.writeBooleanField("momentLikedYou", cardInfos.momentLikedYou);
            jsonGenerator.writeBooleanField("boostLikeYou", cardInfos.boostLikeYou);
            jsonGenerator.writeBooleanField("onlineHighReplyRate", cardInfos.onlineHighReplyRate);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardInfos) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardInfos) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m33a(String str) {
        return str;
    }

    public static CardInfos new_() {
        CardInfos cardInfos = new CardInfos();
        cardInfos.nullCheck();
        return cardInfos;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CardInfos m11878clone() {
        CardInfos cardInfos = new CardInfos();
        cardInfos.userId = this.userId;
        List<String> list = this.cardTypes;
        if (list != null) {
            cardInfos.cardTypes = ValueObject.util_map(list, new w9j() { // from class: l.wj4
                public final Object call(Object obj) {
                    return CardInfos.m33a((String) obj);
                }
            });
        }
        cardInfos.cardName = this.cardName;
        cardInfos.momentId = this.momentId;
        cardInfos.momentLikedYou = this.momentLikedYou;
        cardInfos.boostLikeYou = this.boostLikeYou;
        cardInfos.onlineHighReplyRate = this.onlineHighReplyRate;
        return cardInfos;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardInfos)) {
            return false;
        }
        CardInfos cardInfos = (CardInfos) obj;
        return ValueObject.util_equals(this.userId, cardInfos.userId) && ValueObject.util_equals(this.cardTypes, cardInfos.cardTypes) && ValueObject.util_equals(this.cardName, cardInfos.cardName) && ValueObject.util_equals(this.momentId, cardInfos.momentId) && this.momentLikedYou == cardInfos.momentLikedYou && this.boostLikeYou == cardInfos.boostLikeYou && this.onlineHighReplyRate == cardInfos.onlineHighReplyRate;
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.cardTypes;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.cardName;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.momentId;
        int iHashCode4 = ((((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.momentLikedYou ? 1231 : 1237)) * 41) + (this.boostLikeYou ? 1231 : 1237)) * 41) + (this.onlineHighReplyRate ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.cardTypes == null) {
            this.cardTypes = new ArrayList();
        }
        if (this.cardName == null) {
            this.cardName = "";
        }
        if (this.momentId == null) {
            this.momentId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
