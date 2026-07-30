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
public class CardPatternOptionIcon extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cardpatternoptionicon";

    @NonNull
    @ProtobufIndex(index = 1)
    public String iconId;

    @NonNull
    @ProtobufIndex(index = 2)
    public CardOption option;
    public static ProtobufAdapter<CardPatternOptionIcon> PROTOBUF_ADAPTER = new MessageNanoAdapter<CardPatternOptionIcon>() { // from class: com.p1.mobile.putong.core.data.CardPatternOptionIcon.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CardPatternOptionIcon cardPatternOptionIcon) {
            String str = cardPatternOptionIcon.iconId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            CardOption cardOption = cardPatternOptionIcon.option;
            if (cardOption != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, cardOption, CardOption.PROTOBUF_ADAPTER);
            }
            cardPatternOptionIcon.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CardPatternOptionIcon parse(nc5 nc5Var) throws IOException {
            CardPatternOptionIcon cardPatternOptionIcon = new CardPatternOptionIcon();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (cardPatternOptionIcon.iconId == null) {
                        cardPatternOptionIcon.iconId = "";
                    }
                    if (cardPatternOptionIcon.option != null) {
                        break;
                    }
                    cardPatternOptionIcon.option = CardOption.new_();
                    break;
                }
                if (iM162497u == 10) {
                    cardPatternOptionIcon.iconId = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (cardPatternOptionIcon.iconId == null) {
                            cardPatternOptionIcon.iconId = "";
                        }
                        if (cardPatternOptionIcon.option != null) {
                            break;
                        }
                        cardPatternOptionIcon.option = CardOption.new_();
                        return cardPatternOptionIcon;
                    }
                    cardPatternOptionIcon.option = (CardOption) nc5Var.m162488l(CardOption.PROTOBUF_ADAPTER);
                }
            }
            return cardPatternOptionIcon;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CardPatternOptionIcon cardPatternOptionIcon, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cardPatternOptionIcon.iconId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            CardOption cardOption = cardPatternOptionIcon.option;
            if (cardOption != null) {
                codedOutputByteBufferNano.m17309K(2, cardOption, CardOption.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<CardPatternOptionIcon> JSON_ADAPTER = new ObjectJsonAdapter<CardPatternOptionIcon>() { // from class: com.p1.mobile.putong.core.data.CardPatternOptionIcon.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CardPatternOptionIcon.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CardPatternOptionIcon newInstance() {
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
            cardPatternOptionIcon.option = CardOption.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(CardPatternOptionIcon cardPatternOptionIcon, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("iconId") || str.equals(Option.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(cardPatternOptionIcon, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardPatternOptionIcon) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardPatternOptionIcon) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CardPatternOptionIcon new_() {
        CardPatternOptionIcon cardPatternOptionIcon = new CardPatternOptionIcon();
        cardPatternOptionIcon.nullCheck();
        return cardPatternOptionIcon;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CardPatternOptionIcon mo225055clone() {
        CardPatternOptionIcon cardPatternOptionIcon = new CardPatternOptionIcon();
        cardPatternOptionIcon.iconId = this.iconId;
        CardOption cardOption = this.option;
        if (cardOption != null) {
            cardPatternOptionIcon.option = cardOption.mo225055clone();
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
        String str = this.iconId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        CardOption cardOption = this.option;
        int iHashCode2 = iHashCode + (cardOption != null ? cardOption.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.iconId == null) {
            this.iconId = "";
        }
        if (this.option == null) {
            this.option = CardOption.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
