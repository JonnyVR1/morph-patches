package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.CardStyle;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class CardStyle extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cardstyle";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> dynamicLables;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> label;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<CardStyle> PROTOBUF_ADAPTER = new MessageNanoAdapter<CardStyle>() { // from class: com.p1.mobile.putong.core.data.CardStyle.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CardStyle cardStyle) {
            String str = cardStyle.userId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            List<String> list = cardStyle.label;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = cardStyle.dynamicLables;
            if (list2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            cardStyle.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CardStyle parse(nb5 nb5Var) throws IOException {
            CardStyle cardStyle = new CardStyle();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    cardStyle.userId = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    cardStyle.label = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 26) {
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
                    cardStyle.dynamicLables = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return cardStyle;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CardStyle cardStyle, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cardStyle.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            List<String> list = cardStyle.label;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = cardStyle.dynamicLables;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<CardStyle> JSON_ADAPTER = new ObjectJsonAdapter<CardStyle>() { // from class: com.p1.mobile.putong.core.data.CardStyle.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CardStyle.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CardStyle newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CardStyle cardStyle, JsonGenerator jsonGenerator) throws IOException {
            String str = cardStyle.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            if (cardStyle.label != null) {
                jsonGenerator.writeFieldName(Constants.ScionAnalytics.PARAM_LABEL);
                JsonAdapter.serializeArray(cardStyle.label, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (cardStyle.dynamicLables != null) {
                jsonGenerator.writeFieldName("dynamicLables");
                JsonAdapter.serializeArray(cardStyle.dynamicLables, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35234a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m35235b(String str) {
        return str;
    }

    public static CardStyle new_() {
        CardStyle cardStyle = new CardStyle();
        cardStyle.nullCheck();
        return cardStyle;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CardStyle mo223809clone() {
        CardStyle cardStyle = new CardStyle();
        cardStyle.userId = this.userId;
        List<String> list = this.label;
        if (list != null) {
            cardStyle.label = ValueObject.util_map(list, new w9j() { // from class: l.cm4
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CardStyle.m35234a((String) obj);
                }
            });
        }
        List<String> list2 = this.dynamicLables;
        if (list2 != null) {
            cardStyle.dynamicLables = ValueObject.util_map(list2, new w9j() { // from class: l.dm4
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CardStyle.m35235b((String) obj);
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
        List<String> list = this.label;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.dynamicLables;
        int iHashCode3 = iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
