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
public class CardOption extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cardoption";

    @NonNull
    @ProtobufIndex(index = 1)
    public String action;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean disappear;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String link;
    public static ProtobufAdapter<CardOption> PROTOBUF_ADAPTER = new MessageNanoAdapter<CardOption>() { // from class: com.p1.mobile.putong.core.data.CardOption.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CardOption cardOption) {
            String str = cardOption.action;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = cardOption.link;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iB = iO + CodedOutputByteBufferNano.b(3, cardOption.disappear);
            ((MessageNano) cardOption).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CardOption m11895parse(nb5 nb5Var) throws IOException {
            CardOption cardOption = new CardOption();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (cardOption.action == null) {
                        cardOption.action = "";
                    }
                    if (cardOption.link != null) {
                        break;
                    }
                    cardOption.link = "";
                    break;
                }
                if (iU == 10) {
                    cardOption.action = nb5Var.s();
                } else if (iU == 18) {
                    cardOption.link = nb5Var.s();
                } else {
                    if (iU != 24) {
                        if (cardOption.action == null) {
                            cardOption.action = "";
                        }
                        if (cardOption.link != null) {
                            break;
                        }
                        cardOption.link = "";
                        return cardOption;
                    }
                    cardOption.disappear = nb5Var.g();
                }
            }
            return cardOption;
        }

        public void serialize(CardOption cardOption, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cardOption.action;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = cardOption.link;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.A(3, cardOption.disappear);
        }
    };
    public static JsonAdapter<CardOption> JSON_ADAPTER = new ObjectJsonAdapter<CardOption>() { // from class: com.p1.mobile.putong.core.data.CardOption.2
        public Class getDataClass() {
            return CardOption.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CardOption m11896newInstance() {
            return new CardOption();
        }

        public boolean parseField(CardOption cardOption, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "action":
                    cardOption.action = jsonParser.getValueAsString();
                    return true;
                case "disappear":
                    cardOption.disappear = jsonParser.getValueAsBoolean();
                    return true;
                case "link":
                    cardOption.link = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CardOption cardOption, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "action":
                case "disappear":
                case "link":
                    return true;
                default:
                    return super.parseFieldCheck(cardOption, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(CardOption cardOption, JsonGenerator jsonGenerator) throws IOException {
            String str = cardOption.action;
            if (str != null) {
                jsonGenerator.writeStringField("action", str);
            }
            String str2 = cardOption.link;
            if (str2 != null) {
                jsonGenerator.writeStringField("link", str2);
            }
            jsonGenerator.writeBooleanField("disappear", cardOption.disappear);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardOption) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardOption) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CardOption new_() {
        CardOption cardOption = new CardOption();
        cardOption.nullCheck();
        return cardOption;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CardOption m11894clone() {
        CardOption cardOption = new CardOption();
        cardOption.action = this.action;
        cardOption.link = this.link;
        cardOption.disappear = this.disappear;
        return cardOption;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardOption)) {
            return false;
        }
        CardOption cardOption = (CardOption) obj;
        return ValueObject.util_equals(this.action, cardOption.action) && ValueObject.util_equals(this.link, cardOption.link) && this.disappear == cardOption.disappear;
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
        String str = this.action;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.link;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.disappear ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.action == null) {
            this.action = "";
        }
        if (this.link == null) {
            this.link = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
