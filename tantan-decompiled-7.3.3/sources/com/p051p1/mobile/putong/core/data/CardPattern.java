package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.CardOption;
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
public class CardPattern extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cardpattern";

    @NonNull
    @ProtobufIndex(index = 4)
    public CardPatternBottomContent bottomContent;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<CardOption> cardOptions;

    @NonNull
    @ProtobufIndex(index = 6)
    public String cover;

    @NonNull
    @ProtobufIndex(index = 3)
    public CardPatternOptionIcon lowerRightIcon;

    @NonNull
    @ProtobufIndex(index = 5)
    public String realUser;

    @NonNull
    @ProtobufIndex(index = 2)
    public CardPatternCombinedIcon topleftIcon;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<CardPattern> PROTOBUF_ADAPTER = new MessageNanoAdapter<CardPattern>() { // from class: com.p1.mobile.putong.core.data.CardPattern.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CardPattern cardPattern) {
            String str = cardPattern.userId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            CardPatternCombinedIcon cardPatternCombinedIcon = cardPattern.topleftIcon;
            if (cardPatternCombinedIcon != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, cardPatternCombinedIcon, CardPatternCombinedIcon.PROTOBUF_ADAPTER);
            }
            CardPatternOptionIcon cardPatternOptionIcon = cardPattern.lowerRightIcon;
            if (cardPatternOptionIcon != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, cardPatternOptionIcon, CardPatternOptionIcon.PROTOBUF_ADAPTER);
            }
            CardPatternBottomContent cardPatternBottomContent = cardPattern.bottomContent;
            if (cardPatternBottomContent != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, cardPatternBottomContent, CardPatternBottomContent.PROTOBUF_ADAPTER);
            }
            String str2 = cardPattern.realUser;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str2);
            }
            String str3 = cardPattern.cover;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str3);
            }
            List<CardOption> list = cardPattern.cardOptions;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(7, list, CardOption.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            cardPattern.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CardPattern parse(nc5 nc5Var) throws IOException {
            CardPattern cardPattern = new CardPattern();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (cardPattern.userId == null) {
                        cardPattern.userId = "";
                    }
                    if (cardPattern.topleftIcon == null) {
                        cardPattern.topleftIcon = CardPatternCombinedIcon.new_();
                    }
                    if (cardPattern.lowerRightIcon == null) {
                        cardPattern.lowerRightIcon = CardPatternOptionIcon.new_();
                    }
                    if (cardPattern.bottomContent == null) {
                        cardPattern.bottomContent = CardPatternBottomContent.new_();
                    }
                    if (cardPattern.realUser == null) {
                        cardPattern.realUser = "";
                    }
                    if (cardPattern.cover == null) {
                        cardPattern.cover = "";
                    }
                    if (cardPattern.cardOptions != null) {
                        break;
                    }
                    cardPattern.cardOptions = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    cardPattern.userId = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    cardPattern.topleftIcon = (CardPatternCombinedIcon) nc5Var.m162488l(CardPatternCombinedIcon.PROTOBUF_ADAPTER);
                } else if (iM162497u == 26) {
                    cardPattern.lowerRightIcon = (CardPatternOptionIcon) nc5Var.m162488l(CardPatternOptionIcon.PROTOBUF_ADAPTER);
                } else if (iM162497u == 34) {
                    cardPattern.bottomContent = (CardPatternBottomContent) nc5Var.m162488l(CardPatternBottomContent.PROTOBUF_ADAPTER);
                } else if (iM162497u == 42) {
                    cardPattern.realUser = nc5Var.m162495s();
                } else if (iM162497u == 50) {
                    cardPattern.cover = nc5Var.m162495s();
                } else {
                    if (iM162497u != 58) {
                        if (cardPattern.userId == null) {
                            cardPattern.userId = "";
                        }
                        if (cardPattern.topleftIcon == null) {
                            cardPattern.topleftIcon = CardPatternCombinedIcon.new_();
                        }
                        if (cardPattern.lowerRightIcon == null) {
                            cardPattern.lowerRightIcon = CardPatternOptionIcon.new_();
                        }
                        if (cardPattern.bottomContent == null) {
                            cardPattern.bottomContent = CardPatternBottomContent.new_();
                        }
                        if (cardPattern.realUser == null) {
                            cardPattern.realUser = "";
                        }
                        if (cardPattern.cover == null) {
                            cardPattern.cover = "";
                        }
                        if (cardPattern.cardOptions != null) {
                            break;
                        }
                        cardPattern.cardOptions = new ArrayList();
                        return cardPattern;
                    }
                    cardPattern.cardOptions = (List) nc5Var.m162488l(CardOption.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return cardPattern;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CardPattern cardPattern, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cardPattern.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            CardPatternCombinedIcon cardPatternCombinedIcon = cardPattern.topleftIcon;
            if (cardPatternCombinedIcon != null) {
                codedOutputByteBufferNano.m17309K(2, cardPatternCombinedIcon, CardPatternCombinedIcon.PROTOBUF_ADAPTER);
            }
            CardPatternOptionIcon cardPatternOptionIcon = cardPattern.lowerRightIcon;
            if (cardPatternOptionIcon != null) {
                codedOutputByteBufferNano.m17309K(3, cardPatternOptionIcon, CardPatternOptionIcon.PROTOBUF_ADAPTER);
            }
            CardPatternBottomContent cardPatternBottomContent = cardPattern.bottomContent;
            if (cardPatternBottomContent != null) {
                codedOutputByteBufferNano.m17309K(4, cardPatternBottomContent, CardPatternBottomContent.PROTOBUF_ADAPTER);
            }
            String str2 = cardPattern.realUser;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(5, str2);
            }
            String str3 = cardPattern.cover;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(6, str3);
            }
            List<CardOption> list = cardPattern.cardOptions;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(7, list, CardOption.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<CardPattern> JSON_ADAPTER = new ObjectJsonAdapter<CardPattern>() { // from class: com.p1.mobile.putong.core.data.CardPattern.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CardPattern.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CardPattern newInstance() {
            return new CardPattern();
        }

        public boolean parseField(CardPattern cardPattern, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "topleftIcon":
                    cardPattern.topleftIcon = CardPatternCombinedIcon.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "realUser":
                    cardPattern.realUser = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    cardPattern.userId = jsonParser.getValueAsString();
                    return true;
                case "lowerRightIcon":
                    cardPattern.lowerRightIcon = CardPatternOptionIcon.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "bottomContent":
                    cardPattern.bottomContent = CardPatternBottomContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CardPattern cardPattern, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "topleftIcon":
                case "realUser":
                case "userId":
                case "lowerRightIcon":
                case "bottomContent":
                    return true;
                default:
                    return super.parseFieldCheck(cardPattern, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CardPattern cardPattern, JsonGenerator jsonGenerator) throws IOException {
            String str = cardPattern.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            if (cardPattern.topleftIcon != null) {
                jsonGenerator.writeFieldName("topleftIcon");
                CardPatternCombinedIcon.JSON_ADAPTER.serialize(cardPattern.topleftIcon, jsonGenerator, true);
            }
            if (cardPattern.lowerRightIcon != null) {
                jsonGenerator.writeFieldName("lowerRightIcon");
                CardPatternOptionIcon.JSON_ADAPTER.serialize(cardPattern.lowerRightIcon, jsonGenerator, true);
            }
            if (cardPattern.bottomContent != null) {
                jsonGenerator.writeFieldName("bottomContent");
                CardPatternBottomContent.JSON_ADAPTER.serialize(cardPattern.bottomContent, jsonGenerator, true);
            }
            String str2 = cardPattern.realUser;
            if (str2 != null) {
                jsonGenerator.writeStringField(VisitorSortType.realUser, str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardPattern) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardPattern) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CardPattern new_() {
        CardPattern cardPattern = new CardPattern();
        cardPattern.nullCheck();
        return cardPattern;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CardPattern mo225055clone() {
        CardPattern cardPattern = new CardPattern();
        cardPattern.userId = this.userId;
        CardPatternCombinedIcon cardPatternCombinedIcon = this.topleftIcon;
        if (cardPatternCombinedIcon != null) {
            cardPattern.topleftIcon = cardPatternCombinedIcon.mo225055clone();
        }
        CardPatternOptionIcon cardPatternOptionIcon = this.lowerRightIcon;
        if (cardPatternOptionIcon != null) {
            cardPattern.lowerRightIcon = cardPatternOptionIcon.mo225055clone();
        }
        CardPatternBottomContent cardPatternBottomContent = this.bottomContent;
        if (cardPatternBottomContent != null) {
            cardPattern.bottomContent = cardPatternBottomContent.mo225055clone();
        }
        cardPattern.realUser = this.realUser;
        cardPattern.cover = this.cover;
        List<CardOption> list = this.cardOptions;
        if (list != null) {
            cardPattern.cardOptions = ValueObject.util_map(list, new qcj() { // from class: l.jm4
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((CardOption) obj).mo225055clone();
                }
            });
        }
        return cardPattern;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardPattern)) {
            return false;
        }
        CardPattern cardPattern = (CardPattern) obj;
        return ValueObject.util_equals(this.userId, cardPattern.userId) && ValueObject.util_equals(this.topleftIcon, cardPattern.topleftIcon) && ValueObject.util_equals(this.lowerRightIcon, cardPattern.lowerRightIcon) && ValueObject.util_equals(this.bottomContent, cardPattern.bottomContent) && ValueObject.util_equals(this.realUser, cardPattern.realUser) && ValueObject.util_equals(this.cover, cardPattern.cover) && ValueObject.util_equals(this.cardOptions, cardPattern.cardOptions);
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
        CardPatternCombinedIcon cardPatternCombinedIcon = this.topleftIcon;
        int iHashCode2 = (iHashCode + (cardPatternCombinedIcon != null ? cardPatternCombinedIcon.hashCode() : 0)) * 41;
        CardPatternOptionIcon cardPatternOptionIcon = this.lowerRightIcon;
        int iHashCode3 = (iHashCode2 + (cardPatternOptionIcon != null ? cardPatternOptionIcon.hashCode() : 0)) * 41;
        CardPatternBottomContent cardPatternBottomContent = this.bottomContent;
        int iHashCode4 = (iHashCode3 + (cardPatternBottomContent != null ? cardPatternBottomContent.hashCode() : 0)) * 41;
        String str2 = this.realUser;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.cover;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<CardOption> list = this.cardOptions;
        int iHashCode7 = iHashCode6 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.topleftIcon == null) {
            this.topleftIcon = CardPatternCombinedIcon.new_();
        }
        if (this.lowerRightIcon == null) {
            this.lowerRightIcon = CardPatternOptionIcon.new_();
        }
        if (this.bottomContent == null) {
            this.bottomContent = CardPatternBottomContent.new_();
        }
        if (this.realUser == null) {
            this.realUser = "";
        }
        if (this.cover == null) {
            this.cover = "";
        }
        if (this.cardOptions == null) {
            this.cardOptions = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
