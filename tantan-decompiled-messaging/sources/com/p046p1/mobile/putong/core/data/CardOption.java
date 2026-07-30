package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Link;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class CardOption extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cardoption";

    @NonNull
    @ProtobufIndex(index = 1)
    public String action;

    @ProtobufIndex(index = 3)
    public boolean disappear;

    @NonNull
    @ProtobufIndex(index = 2)
    public String link;
    public static ProtobufAdapter<CardOption> PROTOBUF_ADAPTER = new MessageNanoAdapter<CardOption>() { // from class: com.p1.mobile.putong.core.data.CardOption.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CardOption cardOption) {
            String str = cardOption.action;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = cardOption.link;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(3, cardOption.disappear);
            cardOption.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CardOption parse(nb5 nb5Var) throws IOException {
            CardOption cardOption = new CardOption();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (cardOption.action == null) {
                        cardOption.action = "";
                    }
                    if (cardOption.link != null) {
                        break;
                    }
                    cardOption.link = "";
                    break;
                }
                if (iM158752u == 10) {
                    cardOption.action = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    cardOption.link = nb5Var.m158750s();
                } else {
                    if (iM158752u != 24) {
                        if (cardOption.action == null) {
                            cardOption.action = "";
                        }
                        if (cardOption.link != null) {
                            break;
                        }
                        cardOption.link = "";
                        return cardOption;
                    }
                    cardOption.disappear = nb5Var.m158738g();
                }
            }
            return cardOption;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CardOption cardOption, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cardOption.action;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = cardOption.link;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17244A(3, cardOption.disappear);
        }
    };
    public static JsonAdapter<CardOption> JSON_ADAPTER = new ObjectJsonAdapter<CardOption>() { // from class: com.p1.mobile.putong.core.data.CardOption.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CardOption.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CardOption newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CardOption cardOption, JsonGenerator jsonGenerator) throws IOException {
            String str = cardOption.action;
            if (str != null) {
                jsonGenerator.writeStringField("action", str);
            }
            String str2 = cardOption.link;
            if (str2 != null) {
                jsonGenerator.writeStringField(Link.TYPE, str2);
            }
            jsonGenerator.writeBooleanField("disappear", cardOption.disappear);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardOption) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardOption) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CardOption new_() {
        CardOption cardOption = new CardOption();
        cardOption.nullCheck();
        return cardOption;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CardOption mo223809clone() {
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
        String str = this.action;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.link;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.disappear ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.action == null) {
            this.action = "";
        }
        if (this.link == null) {
            this.link = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
