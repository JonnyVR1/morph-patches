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
public class CardOptRemote extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cardoptremote";

    @ProtobufIndex(index = 2)
    public boolean card_resolution_opt;

    @ProtobufIndex(index = 1)
    public boolean card_swipe_opt;
    public static ProtobufAdapter<CardOptRemote> PROTOBUF_ADAPTER = new MessageNanoAdapter<CardOptRemote>() { // from class: com.p1.mobile.putong.core.data.CardOptRemote.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CardOptRemote cardOptRemote) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, cardOptRemote.card_swipe_opt) + CodedOutputByteBufferNano.m17275b(2, cardOptRemote.card_resolution_opt);
            cardOptRemote.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CardOptRemote parse(nc5 nc5Var) throws IOException {
            CardOptRemote cardOptRemote = new CardOptRemote();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    cardOptRemote.card_swipe_opt = nc5Var.m162483g();
                } else {
                    if (iM162497u != 16) {
                        return cardOptRemote;
                    }
                    cardOptRemote.card_resolution_opt = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CardOptRemote cardOptRemote, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, cardOptRemote.card_swipe_opt);
            codedOutputByteBufferNano.m17299A(2, cardOptRemote.card_resolution_opt);
        }
    };
    public static JsonAdapter<CardOptRemote> JSON_ADAPTER = new ObjectJsonAdapter<CardOptRemote>() { // from class: com.p1.mobile.putong.core.data.CardOptRemote.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CardOptRemote.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CardOptRemote newInstance() {
            return new CardOptRemote();
        }

        public boolean parseField(CardOptRemote cardOptRemote, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("card_swipe_opt")) {
                cardOptRemote.card_swipe_opt = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("card_resolution_opt")) {
                return false;
            }
            cardOptRemote.card_resolution_opt = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(CardOptRemote cardOptRemote, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("card_swipe_opt") || str.equals("card_resolution_opt")) {
                return true;
            }
            return super.parseFieldCheck(cardOptRemote, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CardOptRemote cardOptRemote, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("card_swipe_opt", cardOptRemote.card_swipe_opt);
            jsonGenerator.writeBooleanField("card_resolution_opt", cardOptRemote.card_resolution_opt);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardOptRemote) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardOptRemote) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CardOptRemote new_() {
        CardOptRemote cardOptRemote = new CardOptRemote();
        cardOptRemote.nullCheck();
        return cardOptRemote;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CardOptRemote mo225055clone() {
        CardOptRemote cardOptRemote = new CardOptRemote();
        cardOptRemote.card_swipe_opt = this.card_swipe_opt;
        cardOptRemote.card_resolution_opt = this.card_resolution_opt;
        return cardOptRemote;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardOptRemote)) {
            return false;
        }
        CardOptRemote cardOptRemote = (CardOptRemote) obj;
        return this.card_swipe_opt == cardOptRemote.card_swipe_opt && this.card_resolution_opt == cardOptRemote.card_resolution_opt;
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
        int i2 = (((i * 41) + (this.card_swipe_opt ? 1231 : 1237)) * 41) + (this.card_resolution_opt ? 1231 : 1237);
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
