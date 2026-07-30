package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.CardInfos;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;
import p149l.w9j;

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
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            List<String> list = cardInfos.cardTypes;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = cardInfos.cardName;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            String str3 = cardInfos.momentId;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(5, cardInfos.momentLikedYou) + CodedOutputByteBufferNano.m17220b(6, cardInfos.boostLikeYou) + CodedOutputByteBufferNano.m17220b(7, cardInfos.onlineHighReplyRate);
            cardInfos.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CardInfos parse(nb5 nb5Var) throws IOException {
            CardInfos cardInfos = new CardInfos();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    cardInfos.userId = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    cardInfos.cardTypes = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 26) {
                    cardInfos.cardName = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    cardInfos.momentId = nb5Var.m158750s();
                } else if (iM158752u == 40) {
                    cardInfos.momentLikedYou = nb5Var.m158738g();
                } else if (iM158752u == 48) {
                    cardInfos.boostLikeYou = nb5Var.m158738g();
                } else {
                    if (iM158752u != 56) {
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
                    cardInfos.onlineHighReplyRate = nb5Var.m158738g();
                }
            }
            return cardInfos;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CardInfos cardInfos, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cardInfos.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            List<String> list = cardInfos.cardTypes;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = cardInfos.cardName;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            String str3 = cardInfos.momentId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            codedOutputByteBufferNano.m17244A(5, cardInfos.momentLikedYou);
            codedOutputByteBufferNano.m17244A(6, cardInfos.boostLikeYou);
            codedOutputByteBufferNano.m17244A(7, cardInfos.onlineHighReplyRate);
        }
    };
    public static JsonAdapter<CardInfos> JSON_ADAPTER = new ObjectJsonAdapter<CardInfos>() { // from class: com.p1.mobile.putong.core.data.CardInfos.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CardInfos.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardInfos) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardInfos) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35231a(String str) {
        return str;
    }

    public static CardInfos new_() {
        CardInfos cardInfos = new CardInfos();
        cardInfos.nullCheck();
        return cardInfos;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CardInfos mo223809clone() {
        CardInfos cardInfos = new CardInfos();
        cardInfos.userId = this.userId;
        List<String> list = this.cardTypes;
        if (list != null) {
            cardInfos.cardTypes = ValueObject.util_map(list, new w9j() { // from class: l.wj4
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CardInfos.m35231a((String) obj);
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
