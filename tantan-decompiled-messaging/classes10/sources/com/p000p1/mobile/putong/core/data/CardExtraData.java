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
public class CardExtraData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cardextradata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String momentId;
    public static ProtobufAdapter<CardExtraData> PROTOBUF_ADAPTER = new MessageNanoAdapter<CardExtraData>() { // from class: com.p1.mobile.putong.core.data.CardExtraData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CardExtraData cardExtraData) {
            String str = cardExtraData.momentId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) cardExtraData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CardExtraData m11867parse(nb5 nb5Var) throws IOException {
            CardExtraData cardExtraData = new CardExtraData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (cardExtraData.momentId != null) {
                        break;
                    }
                    cardExtraData.momentId = "";
                    break;
                }
                if (iU != 10) {
                    if (cardExtraData.momentId != null) {
                        break;
                    }
                    cardExtraData.momentId = "";
                    return cardExtraData;
                }
                cardExtraData.momentId = nb5Var.s();
            }
            return cardExtraData;
        }

        public void serialize(CardExtraData cardExtraData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cardExtraData.momentId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<CardExtraData> JSON_ADAPTER = new ObjectJsonAdapter<CardExtraData>() { // from class: com.p1.mobile.putong.core.data.CardExtraData.2
        public Class getDataClass() {
            return CardExtraData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CardExtraData m11868newInstance() {
            return new CardExtraData();
        }

        public boolean parseField(CardExtraData cardExtraData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("momentId")) {
                return false;
            }
            cardExtraData.momentId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(CardExtraData cardExtraData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("momentId")) {
                return true;
            }
            return super.parseFieldCheck(cardExtraData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(CardExtraData cardExtraData, JsonGenerator jsonGenerator) throws IOException {
            String str = cardExtraData.momentId;
            if (str != null) {
                jsonGenerator.writeStringField("momentId", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardExtraData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardExtraData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CardExtraData new_() {
        CardExtraData cardExtraData = new CardExtraData();
        cardExtraData.nullCheck();
        return cardExtraData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CardExtraData m11866clone() {
        CardExtraData cardExtraData = new CardExtraData();
        cardExtraData.momentId = this.momentId;
        return cardExtraData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CardExtraData) {
            return ValueObject.util_equals(this.momentId, ((CardExtraData) obj).momentId);
        }
        return false;
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
        String str = this.momentId;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.momentId == null) {
            this.momentId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
