package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.CardModel;
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
import java.util.List;
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class CardModel extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cardmodel";

    @ProtobufIndex(index = 6)
    public boolean boostLikeYou;

    @NonNull
    @ProtobufIndex(index = 2)
    public BorderModel borderModel;

    @ProtobufIndex(index = 3)
    public int cardType;

    @NonNull
    @ProtobufIndex(index = 12)
    public List<String> dynamicLabels;

    @NonNull
    @ProtobufIndex(index = 4)
    public CardExtraData extraData;

    @ProtobufIndex(index = 10)
    public int friendSenseExamLikeCnt;

    @ProtobufIndex(index = 9)
    public boolean meetAgain;

    @ProtobufIndex(index = 5)
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CardModel cardModel) {
            String str = cardModel.userId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            BorderModel borderModel = cardModel.borderModel;
            if (borderModel != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, borderModel, BorderModel.PROTOBUF_ADAPTER);
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(3, cardModel.cardType);
            CardExtraData cardExtraData = cardModel.extraData;
            if (cardExtraData != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(4, cardExtraData, CardExtraData.PROTOBUF_ADAPTER);
            }
            int iM17275b = iM17281h + CodedOutputByteBufferNano.m17275b(5, cardModel.momentLikedYou) + CodedOutputByteBufferNano.m17275b(6, cardModel.boostLikeYou) + CodedOutputByteBufferNano.m17275b(7, cardModel.newUser);
            String str2 = cardModel.payCardStyle;
            if (str2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(8, str2);
            }
            int iM17275b2 = iM17275b + CodedOutputByteBufferNano.m17275b(9, cardModel.meetAgain) + CodedOutputByteBufferNano.m17281h(10, cardModel.friendSenseExamLikeCnt) + CodedOutputByteBufferNano.m17275b(11, cardModel.selectionUser);
            List<String> list = cardModel.dynamicLabels;
            if (list != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17285l(12, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            cardModel.cachedSize = iM17275b2;
            return iM17275b2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CardModel parse(nc5 nc5Var) throws IOException {
            CardModel cardModel = new CardModel();
            while (true) {
                switch (nc5Var.m162497u()) {
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
                    case 10:
                        cardModel.userId = nc5Var.m162495s();
                        continue;
                    case 18:
                        cardModel.borderModel = (BorderModel) nc5Var.m162488l(BorderModel.PROTOBUF_ADAPTER);
                        continue;
                    case 24:
                        cardModel.cardType = nc5Var.m162486j();
                        continue;
                    case 34:
                        cardModel.extraData = (CardExtraData) nc5Var.m162488l(CardExtraData.PROTOBUF_ADAPTER);
                        continue;
                    case 40:
                        cardModel.momentLikedYou = nc5Var.m162483g();
                        continue;
                    case 48:
                        cardModel.boostLikeYou = nc5Var.m162483g();
                        continue;
                    case 56:
                        cardModel.newUser = nc5Var.m162483g();
                        continue;
                    case 66:
                        cardModel.payCardStyle = nc5Var.m162495s();
                        continue;
                    case 72:
                        cardModel.meetAgain = nc5Var.m162483g();
                        continue;
                    case 80:
                        cardModel.friendSenseExamLikeCnt = nc5Var.m162486j();
                        continue;
                    case 88:
                        cardModel.selectionUser = nc5Var.m162483g();
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        cardModel.dynamicLabels = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CardModel cardModel, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cardModel.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            BorderModel borderModel = cardModel.borderModel;
            if (borderModel != null) {
                codedOutputByteBufferNano.m17309K(2, borderModel, BorderModel.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17305G(3, cardModel.cardType);
            CardExtraData cardExtraData = cardModel.extraData;
            if (cardExtraData != null) {
                codedOutputByteBufferNano.m17309K(4, cardExtraData, CardExtraData.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(5, cardModel.momentLikedYou);
            codedOutputByteBufferNano.m17299A(6, cardModel.boostLikeYou);
            codedOutputByteBufferNano.m17299A(7, cardModel.newUser);
            String str2 = cardModel.payCardStyle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(8, str2);
            }
            codedOutputByteBufferNano.m17299A(9, cardModel.meetAgain);
            codedOutputByteBufferNano.m17305G(10, cardModel.friendSenseExamLikeCnt);
            codedOutputByteBufferNano.m17299A(11, cardModel.selectionUser);
            List<String> list = cardModel.dynamicLabels;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(12, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<CardModel> JSON_ADAPTER = new ObjectJsonAdapter<CardModel>() { // from class: com.p1.mobile.putong.core.data.CardModel.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CardModel.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CardModel newInstance() {
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
                    cardModel.extraData = CardExtraData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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
                    cardModel.borderModel = BorderModel.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardModel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardModel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36235a(String str) {
        return str;
    }

    public static CardModel new_() {
        CardModel cardModel = new CardModel();
        cardModel.nullCheck();
        return cardModel;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CardModel mo225055clone() {
        CardModel cardModel = new CardModel();
        cardModel.userId = this.userId;
        BorderModel borderModel = this.borderModel;
        if (borderModel != null) {
            cardModel.borderModel = borderModel.mo225055clone();
        }
        cardModel.cardType = this.cardType;
        CardExtraData cardExtraData = this.extraData;
        if (cardExtraData != null) {
            cardModel.extraData = cardExtraData.mo225055clone();
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
            cardModel.dynamicLabels = ValueObject.util_map(list, new qcj() { // from class: l.am4
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CardModel.m36235a((String) obj);
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
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    public boolean isRecommendMomentCard() {
        return this.cardType == 1;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
