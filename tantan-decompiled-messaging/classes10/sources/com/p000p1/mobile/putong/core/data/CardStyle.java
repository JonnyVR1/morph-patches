package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.CardStyle;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CardStyle extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cardstyle";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<String> dynamicLables;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> label;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<CardStyle> PROTOBUF_ADAPTER = new MessageNanoAdapter<CardStyle>() { // from class: com.p1.mobile.putong.core.data.CardStyle.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CardStyle cardStyle) {
            String str = cardStyle.userId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<String> list = cardStyle.label;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = cardStyle.dynamicLables;
            if (list2 != null) {
                iO += CodedOutputByteBufferNano.l(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) cardStyle).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CardStyle m11915parse(nb5 nb5Var) throws IOException {
            CardStyle cardStyle = new CardStyle();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (cardStyle.userId == null) {
                        cardStyle.userId = "";
                    }
                    if (cardStyle.label == null) {
                        cardStyle.label = new ArrayList();
                    }
                    if (cardStyle.dynamicLables != null) {
                        break;
                    }
                    cardStyle.dynamicLables = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    cardStyle.userId = nb5Var.s();
                } else if (iU == 18) {
                    cardStyle.label = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 26) {
                        if (cardStyle.userId == null) {
                            cardStyle.userId = "";
                        }
                        if (cardStyle.label == null) {
                            cardStyle.label = new ArrayList();
                        }
                        if (cardStyle.dynamicLables != null) {
                            break;
                        }
                        cardStyle.dynamicLables = new ArrayList();
                        return cardStyle;
                    }
                    cardStyle.dynamicLables = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return cardStyle;
        }

        public void serialize(CardStyle cardStyle, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cardStyle.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<String> list = cardStyle.label;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = cardStyle.dynamicLables;
            if (list2 != null) {
                codedOutputByteBufferNano.K(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<CardStyle> JSON_ADAPTER = new ObjectJsonAdapter<CardStyle>() { // from class: com.p1.mobile.putong.core.data.CardStyle.2
        public Class getDataClass() {
            return CardStyle.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CardStyle m11916newInstance() {
            return new CardStyle();
        }

        public boolean parseField(CardStyle cardStyle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    cardStyle.userId = jsonParser.getValueAsString();
                    return true;
                case "label":
                    cardStyle.label = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "dynamicLables":
                    cardStyle.dynamicLables = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CardStyle cardStyle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userId":
                case "label":
                case "dynamicLables":
                    return true;
                default:
                    return super.parseFieldCheck(cardStyle, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(CardStyle cardStyle, JsonGenerator jsonGenerator) throws IOException {
            String str = cardStyle.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            if (cardStyle.label != null) {
                jsonGenerator.writeFieldName("label");
                JsonAdapter.serializeArray(cardStyle.label, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (cardStyle.dynamicLables != null) {
                jsonGenerator.writeFieldName("dynamicLables");
                JsonAdapter.serializeArray(cardStyle.dynamicLables, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m37b(String str) {
        return str;
    }

    public static CardStyle new_() {
        CardStyle cardStyle = new CardStyle();
        cardStyle.nullCheck();
        return cardStyle;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CardStyle m11914clone() {
        CardStyle cardStyle = new CardStyle();
        cardStyle.userId = this.userId;
        List<String> list = this.label;
        if (list != null) {
            cardStyle.label = ValueObject.util_map(list, new w9j() { // from class: l.cm4
                public final Object call(Object obj) {
                    return CardStyle.m36a((String) obj);
                }
            });
        }
        List<String> list2 = this.dynamicLables;
        if (list2 != null) {
            cardStyle.dynamicLables = ValueObject.util_map(list2, new w9j() { // from class: l.dm4
                public final Object call(Object obj) {
                    return CardStyle.m37b((String) obj);
                }
            });
        }
        return cardStyle;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardStyle)) {
            return false;
        }
        CardStyle cardStyle = (CardStyle) obj;
        return ValueObject.util_equals(this.userId, cardStyle.userId) && ValueObject.util_equals(this.label, cardStyle.label) && ValueObject.util_equals(this.dynamicLables, cardStyle.dynamicLables);
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.label;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.dynamicLables;
        int iHashCode3 = iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.label == null) {
            this.label = new ArrayList();
        }
        if (this.dynamicLables == null) {
            this.dynamicLables = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
