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
public class CardOptRemote extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cardoptremote";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean card_resolution_opt;

    @ProtobufIndex(index = 1)
    public boolean card_swipe_opt;
    public static ProtobufAdapter<CardOptRemote> PROTOBUF_ADAPTER = new MessageNanoAdapter<CardOptRemote>() { // from class: com.p1.mobile.putong.core.data.CardOptRemote.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CardOptRemote cardOptRemote) {
            int iB = CodedOutputByteBufferNano.b(1, cardOptRemote.card_swipe_opt) + CodedOutputByteBufferNano.b(2, cardOptRemote.card_resolution_opt);
            ((MessageNano) cardOptRemote).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CardOptRemote m11891parse(nb5 nb5Var) throws IOException {
            CardOptRemote cardOptRemote = new CardOptRemote();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    cardOptRemote.card_swipe_opt = nb5Var.g();
                } else {
                    if (iU != 16) {
                        return cardOptRemote;
                    }
                    cardOptRemote.card_resolution_opt = nb5Var.g();
                }
            }
        }

        public void serialize(CardOptRemote cardOptRemote, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, cardOptRemote.card_swipe_opt);
            codedOutputByteBufferNano.A(2, cardOptRemote.card_resolution_opt);
        }
    };
    public static JsonAdapter<CardOptRemote> JSON_ADAPTER = new ObjectJsonAdapter<CardOptRemote>() { // from class: com.p1.mobile.putong.core.data.CardOptRemote.2
        public Class getDataClass() {
            return CardOptRemote.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CardOptRemote m11892newInstance() {
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

        public void serializeFields(CardOptRemote cardOptRemote, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("card_swipe_opt", cardOptRemote.card_swipe_opt);
            jsonGenerator.writeBooleanField("card_resolution_opt", cardOptRemote.card_resolution_opt);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardOptRemote) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardOptRemote) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CardOptRemote new_() {
        CardOptRemote cardOptRemote = new CardOptRemote();
        cardOptRemote.nullCheck();
        return cardOptRemote;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CardOptRemote m11890clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.card_swipe_opt ? 1231 : 1237)) * 41) + (this.card_resolution_opt ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
