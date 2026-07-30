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
public class CardPatternOptionIcon extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cardpatternoptionicon";

    @NonNull
    @ProtobufIndex(index = 1)
    public String iconId;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public CardOption option;
    public static ProtobufAdapter<CardPatternOptionIcon> PROTOBUF_ADAPTER = new MessageNanoAdapter<CardPatternOptionIcon>() { // from class: com.p1.mobile.putong.core.data.CardPatternOptionIcon.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CardPatternOptionIcon cardPatternOptionIcon) {
            String str = cardPatternOptionIcon.iconId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            CardOption cardOption = cardPatternOptionIcon.option;
            if (cardOption != null) {
                iO += CodedOutputByteBufferNano.l(2, cardOption, CardOption.PROTOBUF_ADAPTER);
            }
            ((MessageNano) cardPatternOptionIcon).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CardPatternOptionIcon m11911parse(nb5 nb5Var) throws IOException {
            CardPatternOptionIcon cardPatternOptionIcon = new CardPatternOptionIcon();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (cardPatternOptionIcon.iconId == null) {
                        cardPatternOptionIcon.iconId = "";
                    }
                    if (cardPatternOptionIcon.option != null) {
                        break;
                    }
                    cardPatternOptionIcon.option = CardOption.new_();
                    break;
                }
                if (iU == 10) {
                    cardPatternOptionIcon.iconId = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (cardPatternOptionIcon.iconId == null) {
                            cardPatternOptionIcon.iconId = "";
                        }
                        if (cardPatternOptionIcon.option != null) {
                            break;
                        }
                        cardPatternOptionIcon.option = CardOption.new_();
                        return cardPatternOptionIcon;
                    }
                    cardPatternOptionIcon.option = (CardOption) nb5Var.l(CardOption.PROTOBUF_ADAPTER);
                }
            }
            return cardPatternOptionIcon;
        }

        public void serialize(CardPatternOptionIcon cardPatternOptionIcon, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cardPatternOptionIcon.iconId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            CardOption cardOption = cardPatternOptionIcon.option;
            if (cardOption != null) {
                codedOutputByteBufferNano.K(2, cardOption, CardOption.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<CardPatternOptionIcon> JSON_ADAPTER = new ObjectJsonAdapter<CardPatternOptionIcon>() { // from class: com.p1.mobile.putong.core.data.CardPatternOptionIcon.2
        public Class getDataClass() {
            return CardPatternOptionIcon.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CardPatternOptionIcon m11912newInstance() {
            return new CardPatternOptionIcon();
        }

        public boolean parseField(CardPatternOptionIcon cardPatternOptionIcon, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("iconId")) {
                cardPatternOptionIcon.iconId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(Option.TYPE)) {
                return false;
            }
            cardPatternOptionIcon.option = (CardOption) CardOption.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(CardPatternOptionIcon cardPatternOptionIcon, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("iconId") || str.equals(Option.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(cardPatternOptionIcon, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(CardPatternOptionIcon cardPatternOptionIcon, JsonGenerator jsonGenerator) throws IOException {
            String str = cardPatternOptionIcon.iconId;
            if (str != null) {
                jsonGenerator.writeStringField("iconId", str);
            }
            if (cardPatternOptionIcon.option != null) {
                jsonGenerator.writeFieldName(Option.TYPE);
                CardOption.JSON_ADAPTER.serialize(cardPatternOptionIcon.option, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardPatternOptionIcon) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardPatternOptionIcon) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CardPatternOptionIcon new_() {
        CardPatternOptionIcon cardPatternOptionIcon = new CardPatternOptionIcon();
        cardPatternOptionIcon.nullCheck();
        return cardPatternOptionIcon;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CardPatternOptionIcon m11910clone() {
        CardPatternOptionIcon cardPatternOptionIcon = new CardPatternOptionIcon();
        cardPatternOptionIcon.iconId = this.iconId;
        CardOption cardOption = this.option;
        if (cardOption != null) {
            cardPatternOptionIcon.option = cardOption.m11894clone();
        }
        return cardPatternOptionIcon;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardPatternOptionIcon)) {
            return false;
        }
        CardPatternOptionIcon cardPatternOptionIcon = (CardPatternOptionIcon) obj;
        return ValueObject.util_equals(this.iconId, cardPatternOptionIcon.iconId) && ValueObject.util_equals(this.option, cardPatternOptionIcon.option);
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
        String str = this.iconId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        CardOption cardOption = this.option;
        int iHashCode2 = iHashCode + (cardOption != null ? cardOption.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.iconId == null) {
            this.iconId = "";
        }
        if (this.option == null) {
            this.option = CardOption.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
