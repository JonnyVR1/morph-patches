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
public class CardExtraInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cardextrainfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public String descriptionContent;

    @NonNull
    @ProtobufIndex(index = 3)
    public String descriptionId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<CardExtraInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<CardExtraInfo>() { // from class: com.p1.mobile.putong.core.data.CardExtraInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CardExtraInfo cardExtraInfo) {
            String str = cardExtraInfo.userId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = cardExtraInfo.descriptionContent;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = cardExtraInfo.descriptionId;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            cardExtraInfo.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CardExtraInfo parse(nb5 nb5Var) throws IOException {
            CardExtraInfo cardExtraInfo = new CardExtraInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (cardExtraInfo.userId == null) {
                        cardExtraInfo.userId = "";
                    }
                    if (cardExtraInfo.descriptionContent == null) {
                        cardExtraInfo.descriptionContent = "";
                    }
                    if (cardExtraInfo.descriptionId != null) {
                        break;
                    }
                    cardExtraInfo.descriptionId = "";
                    break;
                }
                if (iM158752u == 10) {
                    cardExtraInfo.userId = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    cardExtraInfo.descriptionContent = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (cardExtraInfo.userId == null) {
                            cardExtraInfo.userId = "";
                        }
                        if (cardExtraInfo.descriptionContent == null) {
                            cardExtraInfo.descriptionContent = "";
                        }
                        if (cardExtraInfo.descriptionId != null) {
                            break;
                        }
                        cardExtraInfo.descriptionId = "";
                        return cardExtraInfo;
                    }
                    cardExtraInfo.descriptionId = nb5Var.m158750s();
                }
            }
            return cardExtraInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CardExtraInfo cardExtraInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cardExtraInfo.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = cardExtraInfo.descriptionContent;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = cardExtraInfo.descriptionId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
        }
    };
    public static JsonAdapter<CardExtraInfo> JSON_ADAPTER = new ObjectJsonAdapter<CardExtraInfo>() { // from class: com.p1.mobile.putong.core.data.CardExtraInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CardExtraInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CardExtraInfo newInstance() {
            return new CardExtraInfo();
        }

        public boolean parseField(CardExtraInfo cardExtraInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "descriptionContent":
                    cardExtraInfo.descriptionContent = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    cardExtraInfo.userId = jsonParser.getValueAsString();
                    return true;
                case "descriptionId":
                    cardExtraInfo.descriptionId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CardExtraInfo cardExtraInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "descriptionContent":
                case "userId":
                case "descriptionId":
                    return true;
                default:
                    return super.parseFieldCheck(cardExtraInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CardExtraInfo cardExtraInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = cardExtraInfo.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = cardExtraInfo.descriptionContent;
            if (str2 != null) {
                jsonGenerator.writeStringField("descriptionContent", str2);
            }
            String str3 = cardExtraInfo.descriptionId;
            if (str3 != null) {
                jsonGenerator.writeStringField("descriptionId", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardExtraInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardExtraInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CardExtraInfo new_() {
        CardExtraInfo cardExtraInfo = new CardExtraInfo();
        cardExtraInfo.nullCheck();
        return cardExtraInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CardExtraInfo mo223809clone() {
        CardExtraInfo cardExtraInfo = new CardExtraInfo();
        cardExtraInfo.userId = this.userId;
        cardExtraInfo.descriptionContent = this.descriptionContent;
        cardExtraInfo.descriptionId = this.descriptionId;
        return cardExtraInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardExtraInfo)) {
            return false;
        }
        CardExtraInfo cardExtraInfo = (CardExtraInfo) obj;
        return ValueObject.util_equals(this.userId, cardExtraInfo.userId) && ValueObject.util_equals(this.descriptionContent, cardExtraInfo.descriptionContent) && ValueObject.util_equals(this.descriptionId, cardExtraInfo.descriptionId);
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.descriptionContent;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.descriptionId;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.descriptionContent == null) {
            this.descriptionContent = "";
        }
        if (this.descriptionId == null) {
            this.descriptionId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
