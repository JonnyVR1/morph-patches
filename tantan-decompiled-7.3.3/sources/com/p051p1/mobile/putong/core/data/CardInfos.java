package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.CardInfos;
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
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class CardInfos extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cardinfos";

    @ProtobufIndex(index = 6)
    public boolean boostLikeYou;

    @NonNull
    @ProtobufIndex(index = 3)
    public String cardName;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> cardTypes;

    @NonNull
    @ProtobufIndex(index = 4)
    public String momentId;

    @ProtobufIndex(index = 5)
    public boolean momentLikedYou;

    @ProtobufIndex(index = 7)
    public boolean onlineHighReplyRate;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<CardInfos> PROTOBUF_ADAPTER = new MessageNanoAdapter<CardInfos>() { // from class: com.p1.mobile.putong.core.data.CardInfos.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CardInfos cardInfos) {
            String str = cardInfos.userId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            List<String> list = cardInfos.cardTypes;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = cardInfos.cardName;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            String str3 = cardInfos.momentId;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(5, cardInfos.momentLikedYou) + CodedOutputByteBufferNano.m17275b(6, cardInfos.boostLikeYou) + CodedOutputByteBufferNano.m17275b(7, cardInfos.onlineHighReplyRate);
            cardInfos.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CardInfos parse(nc5 nc5Var) throws IOException {
            CardInfos cardInfos = new CardInfos();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 10) {
                    cardInfos.userId = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    cardInfos.cardTypes = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 26) {
                    cardInfos.cardName = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    cardInfos.momentId = nc5Var.m162495s();
                } else if (iM162497u == 40) {
                    cardInfos.momentLikedYou = nc5Var.m162483g();
                } else if (iM162497u == 48) {
                    cardInfos.boostLikeYou = nc5Var.m162483g();
                } else {
                    if (iM162497u != 56) {
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
                    cardInfos.onlineHighReplyRate = nc5Var.m162483g();
                }
            }
            return cardInfos;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CardInfos cardInfos, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cardInfos.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            List<String> list = cardInfos.cardTypes;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = cardInfos.cardName;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            String str3 = cardInfos.momentId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            codedOutputByteBufferNano.m17299A(5, cardInfos.momentLikedYou);
            codedOutputByteBufferNano.m17299A(6, cardInfos.boostLikeYou);
            codedOutputByteBufferNano.m17299A(7, cardInfos.onlineHighReplyRate);
        }
    };
    public static JsonAdapter<CardInfos> JSON_ADAPTER = new ObjectJsonAdapter<CardInfos>() { // from class: com.p1.mobile.putong.core.data.CardInfos.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CardInfos.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CardInfos newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardInfos) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardInfos) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36234a(String str) {
        return str;
    }

    public static CardInfos new_() {
        CardInfos cardInfos = new CardInfos();
        cardInfos.nullCheck();
        return cardInfos;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CardInfos mo225055clone() {
        CardInfos cardInfos = new CardInfos();
        cardInfos.userId = this.userId;
        List<String> list = this.cardTypes;
        if (list != null) {
            cardInfos.cardTypes = ValueObject.util_map(list, new qcj() { // from class: l.vk4
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CardInfos.m36234a((String) obj);
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
        List<String> list = this.cardTypes;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.cardName;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.momentId;
        int iHashCode4 = ((((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.momentLikedYou ? 1231 : 1237)) * 41) + (this.boostLikeYou ? 1231 : 1237)) * 41) + (this.onlineHighReplyRate ? 1231 : 1237);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
