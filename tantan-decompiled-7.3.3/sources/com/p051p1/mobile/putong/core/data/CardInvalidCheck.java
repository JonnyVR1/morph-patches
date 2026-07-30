package com.p051p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class CardInvalidCheck extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cardinvalidcheck";

    @ProtobufIndex(index = 1)
    public boolean checkCard;

    @ProtobufIndex(index = 2)
    public int checkInterval;
    public static ProtobufAdapter<CardInvalidCheck> PROTOBUF_ADAPTER = new MessageNanoAdapter<CardInvalidCheck>() { // from class: com.p1.mobile.putong.core.data.CardInvalidCheck.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CardInvalidCheck cardInvalidCheck) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, cardInvalidCheck.checkCard) + CodedOutputByteBufferNano.m17281h(2, cardInvalidCheck.checkInterval);
            cardInvalidCheck.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CardInvalidCheck parse(nc5 nc5Var) throws IOException {
            CardInvalidCheck cardInvalidCheck = new CardInvalidCheck();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    cardInvalidCheck.checkCard = nc5Var.m162483g();
                } else {
                    if (iM162497u != 16) {
                        return cardInvalidCheck;
                    }
                    cardInvalidCheck.checkInterval = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CardInvalidCheck cardInvalidCheck, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, cardInvalidCheck.checkCard);
            codedOutputByteBufferNano.m17305G(2, cardInvalidCheck.checkInterval);
        }
    };
    public static JsonAdapter<CardInvalidCheck> JSON_ADAPTER = new ObjectJsonAdapter<CardInvalidCheck>() { // from class: com.p1.mobile.putong.core.data.CardInvalidCheck.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CardInvalidCheck.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CardInvalidCheck newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CardInvalidCheck cardInvalidCheck, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("checkCard", cardInvalidCheck.checkCard);
            jsonGenerator.writeNumberField("checkInterval", cardInvalidCheck.checkInterval);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardInvalidCheck) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardInvalidCheck) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CardInvalidCheck new_() {
        CardInvalidCheck cardInvalidCheck = new CardInvalidCheck();
        cardInvalidCheck.nullCheck();
        return cardInvalidCheck;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CardInvalidCheck mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.checkCard ? 1231 : 1237)) * 41) + this.checkInterval;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
