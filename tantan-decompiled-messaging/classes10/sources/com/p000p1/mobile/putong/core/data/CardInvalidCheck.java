package com.p000p1.mobile.putong.core.data;

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
public class CardInvalidCheck extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cardinvalidcheck";

    @ProtobufIndex(index = 1)
    public boolean checkCard;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int checkInterval;
    public static ProtobufAdapter<CardInvalidCheck> PROTOBUF_ADAPTER = new MessageNanoAdapter<CardInvalidCheck>() { // from class: com.p1.mobile.putong.core.data.CardInvalidCheck.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CardInvalidCheck cardInvalidCheck) {
            int iB = CodedOutputByteBufferNano.b(1, cardInvalidCheck.checkCard) + CodedOutputByteBufferNano.h(2, cardInvalidCheck.checkInterval);
            ((MessageNano) cardInvalidCheck).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CardInvalidCheck m11883parse(nb5 nb5Var) throws IOException {
            CardInvalidCheck cardInvalidCheck = new CardInvalidCheck();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    cardInvalidCheck.checkCard = nb5Var.g();
                } else {
                    if (iU != 16) {
                        return cardInvalidCheck;
                    }
                    cardInvalidCheck.checkInterval = nb5Var.j();
                }
            }
        }

        public void serialize(CardInvalidCheck cardInvalidCheck, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, cardInvalidCheck.checkCard);
            codedOutputByteBufferNano.G(2, cardInvalidCheck.checkInterval);
        }
    };
    public static JsonAdapter<CardInvalidCheck> JSON_ADAPTER = new ObjectJsonAdapter<CardInvalidCheck>() { // from class: com.p1.mobile.putong.core.data.CardInvalidCheck.2
        public Class getDataClass() {
            return CardInvalidCheck.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CardInvalidCheck m11884newInstance() {
            return new CardInvalidCheck();
        }

        public boolean parseField(CardInvalidCheck cardInvalidCheck, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("checkInterval")) {
                cardInvalidCheck.checkInterval = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("checkCard")) {
                return false;
            }
            cardInvalidCheck.checkCard = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(CardInvalidCheck cardInvalidCheck, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("checkInterval") || str.equals("checkCard")) {
                return true;
            }
            return super.parseFieldCheck(cardInvalidCheck, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(CardInvalidCheck cardInvalidCheck, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("checkCard", cardInvalidCheck.checkCard);
            jsonGenerator.writeNumberField("checkInterval", cardInvalidCheck.checkInterval);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardInvalidCheck) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardInvalidCheck) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CardInvalidCheck new_() {
        CardInvalidCheck cardInvalidCheck = new CardInvalidCheck();
        cardInvalidCheck.nullCheck();
        return cardInvalidCheck;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CardInvalidCheck m11882clone() {
        CardInvalidCheck cardInvalidCheck = new CardInvalidCheck();
        cardInvalidCheck.checkCard = this.checkCard;
        cardInvalidCheck.checkInterval = this.checkInterval;
        return cardInvalidCheck;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardInvalidCheck)) {
            return false;
        }
        CardInvalidCheck cardInvalidCheck = (CardInvalidCheck) obj;
        return this.checkCard == cardInvalidCheck.checkCard && this.checkInterval == cardInvalidCheck.checkInterval;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.checkCard ? 1231 : 1237)) * 41) + this.checkInterval;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
