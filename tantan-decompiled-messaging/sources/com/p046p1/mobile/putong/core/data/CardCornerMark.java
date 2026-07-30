package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
public class CardCornerMark extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cardcornermark";

    @NonNull
    @ProtobufIndex(index = 2)
    public String url;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userID;
    public static ProtobufAdapter<CardCornerMark> PROTOBUF_ADAPTER = new MessageNanoAdapter<CardCornerMark>() { // from class: com.p1.mobile.putong.core.data.CardCornerMark.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CardCornerMark cardCornerMark) {
            String str = cardCornerMark.userID;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = cardCornerMark.url;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            cardCornerMark.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CardCornerMark parse(nb5 nb5Var) throws IOException {
            CardCornerMark cardCornerMark = new CardCornerMark();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (cardCornerMark.userID == null) {
                        cardCornerMark.userID = "";
                    }
                    if (cardCornerMark.url != null) {
                        break;
                    }
                    cardCornerMark.url = "";
                    break;
                }
                if (iM158752u == 10) {
                    cardCornerMark.userID = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (cardCornerMark.userID == null) {
                            cardCornerMark.userID = "";
                        }
                        if (cardCornerMark.url != null) {
                            break;
                        }
                        cardCornerMark.url = "";
                        return cardCornerMark;
                    }
                    cardCornerMark.url = nb5Var.m158750s();
                }
            }
            return cardCornerMark;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CardCornerMark cardCornerMark, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cardCornerMark.userID;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = cardCornerMark.url;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<CardCornerMark> JSON_ADAPTER = new ObjectJsonAdapter<CardCornerMark>() { // from class: com.p1.mobile.putong.core.data.CardCornerMark.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CardCornerMark.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CardCornerMark newInstance() {
            return new CardCornerMark();
        }

        public boolean parseField(CardCornerMark cardCornerMark, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userID")) {
                cardCornerMark.userID = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("url")) {
                return false;
            }
            cardCornerMark.url = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(CardCornerMark cardCornerMark, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userID") || str.equals("url")) {
                return true;
            }
            return super.parseFieldCheck(cardCornerMark, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CardCornerMark cardCornerMark, JsonGenerator jsonGenerator) throws IOException {
            String str = cardCornerMark.userID;
            if (str != null) {
                jsonGenerator.writeStringField("userID", str);
            }
            String str2 = cardCornerMark.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardCornerMark) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardCornerMark) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CardCornerMark new_() {
        CardCornerMark cardCornerMark = new CardCornerMark();
        cardCornerMark.nullCheck();
        return cardCornerMark;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CardCornerMark mo223809clone() {
        CardCornerMark cardCornerMark = new CardCornerMark();
        cardCornerMark.userID = this.userID;
        cardCornerMark.url = this.url;
        return cardCornerMark;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardCornerMark)) {
            return false;
        }
        CardCornerMark cardCornerMark = (CardCornerMark) obj;
        return ValueObject.util_equals(this.userID, cardCornerMark.userID) && ValueObject.util_equals(this.url, cardCornerMark.url);
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
        String str = this.userID;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userID == null) {
            this.userID = "";
        }
        if (this.url == null) {
            this.url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
