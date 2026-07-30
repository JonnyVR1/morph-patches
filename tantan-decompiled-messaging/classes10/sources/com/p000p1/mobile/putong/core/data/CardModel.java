package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.CardModel;
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
public class CardModel extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cardmodel";

    @ProtobufIndex(index = 6)
    public boolean boostLikeYou;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public BorderModel borderModel;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int cardType;

    @NonNull
    @ProtobufIndex(index = 12)
    public List<String> dynamicLabels;

    @NonNull
    @ProtobufIndex(index = 4)
    public CardExtraData extraData;

    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public int friendSenseExamLikeCnt;

    @ProtobufIndex(index = 9)
    public boolean meetAgain;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public boolean momentLikedYou;

    @ProtobufIndex(index = 7)
    public boolean newUser;

    @NonNull
    @ProtobufIndex(index = 8)
    public String payCardStyle;

    @ProtobufIndex(index = 11)
    public boolean selectionUser;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<CardModel> PROTOBUF_ADAPTER = new MessageNanoAdapter<CardModel>() { // from class: com.p1.mobile.putong.core.data.CardModel.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CardModel cardModel) {
            String str = cardModel.userId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            BorderModel borderModel = cardModel.borderModel;
            if (borderModel != null) {
                iO += CodedOutputByteBufferNano.l(2, borderModel, BorderModel.PROTOBUF_ADAPTER);
            }
            int iH = iO + CodedOutputByteBufferNano.h(3, cardModel.cardType);
            CardExtraData cardExtraData = cardModel.extraData;
            if (cardExtraData != null) {
                iH += CodedOutputByteBufferNano.l(4, cardExtraData, CardExtraData.PROTOBUF_ADAPTER);
            }
            int iB = iH + CodedOutputByteBufferNano.b(5, cardModel.momentLikedYou) + CodedOutputByteBufferNano.b(6, cardModel.boostLikeYou) + CodedOutputByteBufferNano.b(7, cardModel.newUser);
            String str2 = cardModel.payCardStyle;
            if (str2 != null) {
                iB += CodedOutputByteBufferNano.o(8, str2);
            }
            int iB2 = iB + CodedOutputByteBufferNano.b(9, cardModel.meetAgain) + CodedOutputByteBufferNano.h(10, cardModel.friendSenseExamLikeCnt) + CodedOutputByteBufferNano.b(11, cardModel.selectionUser);
            List<String> list = cardModel.dynamicLabels;
            if (list != null) {
                iB2 += CodedOutputByteBufferNano.l(12, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) cardModel).cachedSize = iB2;
            return iB2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CardModel m11887parse(nb5 nb5Var) throws IOException {
            CardModel cardModel = new CardModel();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (cardModel.userId == null) {
                            cardModel.userId = "";
                        }
                        if (cardModel.borderModel == null) {
                            cardModel.borderModel = BorderModel.new_();
                        }
                        if (cardModel.extraData == null) {
                            cardModel.extraData = CardExtraData.new_();
                        }
                        if (cardModel.payCardStyle == null) {
                            cardModel.payCardStyle = "";
                        }
                        if (cardModel.dynamicLabels == null) {
                            cardModel.dynamicLabels = new ArrayList();
                        }
                        break;
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        cardModel.userId = nb5Var.s();
                        continue;
                    case 18:
                        cardModel.borderModel = (BorderModel) nb5Var.l(BorderModel.PROTOBUF_ADAPTER);
                        continue;
                    case 24:
                        cardModel.cardType = nb5Var.j();
                        continue;
                    case 34:
                        cardModel.extraData = (CardExtraData) nb5Var.l(CardExtraData.PROTOBUF_ADAPTER);
                        continue;
                    case 40:
                        cardModel.momentLikedYou = nb5Var.g();
                        continue;
                    case 48:
                        cardModel.boostLikeYou = nb5Var.g();
                        continue;
                    case 56:
                        cardModel.newUser = nb5Var.g();
                        continue;
                    case 66:
                        cardModel.payCardStyle = nb5Var.s();
                        continue;
                    case 72:
                        cardModel.meetAgain = nb5Var.g();
                        continue;
                    case 80:
                        cardModel.friendSenseExamLikeCnt = nb5Var.j();
                        continue;
                    case 88:
                        cardModel.selectionUser = nb5Var.g();
                        continue;
                    case 98:
                        cardModel.dynamicLabels = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    default:
                        if (cardModel.userId == null) {
                            cardModel.userId = "";
                        }
                        if (cardModel.borderModel == null) {
                            cardModel.borderModel = BorderModel.new_();
                        }
                        if (cardModel.extraData == null) {
                            cardModel.extraData = CardExtraData.new_();
                        }
                        if (cardModel.payCardStyle == null) {
                            cardModel.payCardStyle = "";
                        }
                        if (cardModel.dynamicLabels == null) {
                            cardModel.dynamicLabels = new ArrayList();
                            return cardModel;
                        }
                        break;
                }
            }
            return cardModel;
        }

        public void serialize(CardModel cardModel, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cardModel.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            BorderModel borderModel = cardModel.borderModel;
            if (borderModel != null) {
                codedOutputByteBufferNano.K(2, borderModel, BorderModel.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.G(3, cardModel.cardType);
            CardExtraData cardExtraData = cardModel.extraData;
            if (cardExtraData != null) {
                codedOutputByteBufferNano.K(4, cardExtraData, CardExtraData.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(5, cardModel.momentLikedYou);
            codedOutputByteBufferNano.A(6, cardModel.boostLikeYou);
            codedOutputByteBufferNano.A(7, cardModel.newUser);
            String str2 = cardModel.payCardStyle;
            if (str2 != null) {
                codedOutputByteBufferNano.R(8, str2);
            }
            codedOutputByteBufferNano.A(9, cardModel.meetAgain);
            codedOutputByteBufferNano.G(10, cardModel.friendSenseExamLikeCnt);
            codedOutputByteBufferNano.A(11, cardModel.selectionUser);
            List<String> list = cardModel.dynamicLabels;
            if (list != null) {
                codedOutputByteBufferNano.K(12, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<CardModel> JSON_ADAPTER = new ObjectJsonAdapter<CardModel>() { // from class: com.p1.mobile.putong.core.data.CardModel.2
        public Class getDataClass() {
            return CardModel.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CardModel m11888newInstance() {
            return new CardModel();
        }

        public boolean parseField(CardModel cardModel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "boostLikeYou":
                    cardModel.boostLikeYou = jsonParser.getValueAsBoolean();
                    return true;
                case "friendSenseExamLikeCnt":
                    cardModel.friendSenseExamLikeCnt = jsonParser.getValueAsInt();
                    return true;
                case "payCardStyle":
                    cardModel.payCardStyle = jsonParser.getValueAsString();
                    return true;
                case "meetAgain":
                    cardModel.meetAgain = jsonParser.getValueAsBoolean();
                    return true;
                case "userId":
                    cardModel.userId = jsonParser.getValueAsString();
                    return true;
                case "extraData":
                    cardModel.extraData = (CardExtraData) CardExtraData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "cardType":
                    cardModel.cardType = jsonParser.getValueAsInt();
                    return true;
                case "momentLikedYou":
                    cardModel.momentLikedYou = jsonParser.getValueAsBoolean();
                    return true;
                case "dynamicLabels":
                    cardModel.dynamicLabels = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "borderModel":
                    cardModel.borderModel = (BorderModel) BorderModel.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "selectionUser":
                    cardModel.selectionUser = jsonParser.getValueAsBoolean();
                    return true;
                case "newUser":
                    cardModel.newUser = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CardModel cardModel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "boostLikeYou":
                case "friendSenseExamLikeCnt":
                case "payCardStyle":
                case "meetAgain":
                case "userId":
                case "extraData":
                case "cardType":
                case "momentLikedYou":
                case "dynamicLabels":
                case "borderModel":
                case "selectionUser":
                case "newUser":
                    return true;
                default:
                    return super.parseFieldCheck(cardModel, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(CardModel cardModel, JsonGenerator jsonGenerator) throws IOException {
            String str = cardModel.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            if (cardModel.borderModel != null) {
                jsonGenerator.writeFieldName("borderModel");
                BorderModel.JSON_ADAPTER.serialize(cardModel.borderModel, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("cardType", cardModel.cardType);
            if (cardModel.extraData != null) {
                jsonGenerator.writeFieldName("extraData");
                CardExtraData.JSON_ADAPTER.serialize(cardModel.extraData, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("momentLikedYou", cardModel.momentLikedYou);
            jsonGenerator.writeBooleanField("boostLikeYou", cardModel.boostLikeYou);
            jsonGenerator.writeBooleanField("newUser", cardModel.newUser);
            String str2 = cardModel.payCardStyle;
            if (str2 != null) {
                jsonGenerator.writeStringField("payCardStyle", str2);
            }
            jsonGenerator.writeBooleanField("meetAgain", cardModel.meetAgain);
            jsonGenerator.writeNumberField("friendSenseExamLikeCnt", cardModel.friendSenseExamLikeCnt);
            jsonGenerator.writeBooleanField("selectionUser", cardModel.selectionUser);
            if (cardModel.dynamicLabels != null) {
                jsonGenerator.writeFieldName("dynamicLabels");
                JsonAdapter.serializeArray(cardModel.dynamicLabels, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardModel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardModel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m34a(String str) {
        return str;
    }

    public static CardModel new_() {
        CardModel cardModel = new CardModel();
        cardModel.nullCheck();
        return cardModel;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CardModel m11886clone() {
        CardModel cardModel = new CardModel();
        cardModel.userId = this.userId;
        BorderModel borderModel = this.borderModel;
        if (borderModel != null) {
            cardModel.borderModel = borderModel.m11810clone();
        }
        cardModel.cardType = this.cardType;
        CardExtraData cardExtraData = this.extraData;
        if (cardExtraData != null) {
            cardModel.extraData = cardExtraData.m11866clone();
        }
        cardModel.momentLikedYou = this.momentLikedYou;
        cardModel.boostLikeYou = this.boostLikeYou;
        cardModel.newUser = this.newUser;
        cardModel.payCardStyle = this.payCardStyle;
        cardModel.meetAgain = this.meetAgain;
        cardModel.friendSenseExamLikeCnt = this.friendSenseExamLikeCnt;
        cardModel.selectionUser = this.selectionUser;
        List<String> list = this.dynamicLabels;
        if (list != null) {
            cardModel.dynamicLabels = ValueObject.util_map(list, new w9j() { // from class: l.bl4
                public final Object call(Object obj) {
                    return CardModel.m34a((String) obj);
                }
            });
        }
        return cardModel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardModel)) {
            return false;
        }
        CardModel cardModel = (CardModel) obj;
        return ValueObject.util_equals(this.userId, cardModel.userId) && ValueObject.util_equals(this.borderModel, cardModel.borderModel) && this.cardType == cardModel.cardType && ValueObject.util_equals(this.extraData, cardModel.extraData) && this.momentLikedYou == cardModel.momentLikedYou && this.boostLikeYou == cardModel.boostLikeYou && this.newUser == cardModel.newUser && ValueObject.util_equals(this.payCardStyle, cardModel.payCardStyle) && this.meetAgain == cardModel.meetAgain && this.friendSenseExamLikeCnt == cardModel.friendSenseExamLikeCnt && this.selectionUser == cardModel.selectionUser && ValueObject.util_equals(this.dynamicLabels, cardModel.dynamicLabels);
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
        BorderModel borderModel = this.borderModel;
        int iHashCode2 = (((iHashCode + (borderModel != null ? borderModel.hashCode() : 0)) * 41) + this.cardType) * 41;
        CardExtraData cardExtraData = this.extraData;
        int iHashCode3 = (((((((iHashCode2 + (cardExtraData != null ? cardExtraData.hashCode() : 0)) * 41) + (this.momentLikedYou ? 1231 : 1237)) * 41) + (this.boostLikeYou ? 1231 : 1237)) * 41) + (this.newUser ? 1231 : 1237)) * 41;
        String str2 = this.payCardStyle;
        int iHashCode4 = (((((((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.meetAgain ? 1231 : 1237)) * 41) + this.friendSenseExamLikeCnt) * 41) + (this.selectionUser ? 1231 : 1237)) * 41;
        List<String> list = this.dynamicLabels;
        int iHashCode5 = iHashCode4 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public boolean isRecommendMomentCard() {
        return this.cardType == 1;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.borderModel == null) {
            this.borderModel = BorderModel.new_();
        }
        if (this.extraData == null) {
            this.extraData = CardExtraData.new_();
        }
        if (this.payCardStyle == null) {
            this.payCardStyle = "";
        }
        if (this.dynamicLabels == null) {
            this.dynamicLabels = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
