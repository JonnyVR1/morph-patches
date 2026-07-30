package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class CardExtraData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cardextradata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String momentId;
    public static ProtobufAdapter<CardExtraData> PROTOBUF_ADAPTER = new MessageNanoAdapter<CardExtraData>() { // from class: com.p1.mobile.putong.core.data.CardExtraData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CardExtraData cardExtraData) {
            String str = cardExtraData.momentId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            cardExtraData.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CardExtraData parse(nc5 nc5Var) throws IOException {
            CardExtraData cardExtraData = new CardExtraData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (cardExtraData.momentId != null) {
                        break;
                    }
                    cardExtraData.momentId = "";
                    break;
                }
                if (iM162497u != 10) {
                    if (cardExtraData.momentId != null) {
                        break;
                    }
                    cardExtraData.momentId = "";
                    return cardExtraData;
                }
                cardExtraData.momentId = nc5Var.m162495s();
            }
            return cardExtraData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CardExtraData cardExtraData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cardExtraData.momentId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
        }
    };
    public static JsonAdapter<CardExtraData> JSON_ADAPTER = new ObjectJsonAdapter<CardExtraData>() { // from class: com.p1.mobile.putong.core.data.CardExtraData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CardExtraData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CardExtraData newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CardExtraData cardExtraData, JsonGenerator jsonGenerator) throws IOException {
            String str = cardExtraData.momentId;
            if (str != null) {
                jsonGenerator.writeStringField("momentId", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardExtraData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardExtraData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CardExtraData new_() {
        CardExtraData cardExtraData = new CardExtraData();
        cardExtraData.nullCheck();
        return cardExtraData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CardExtraData mo225055clone() {
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
        String str = this.momentId;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.momentId == null) {
            this.momentId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
