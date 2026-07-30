package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.CardInfo;
import com.p051p1.mobile.putong.data.User;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class CardInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cardinfo";

    @NonNull
    @ProtobufIndex(index = 3)
    public String background_color;

    @NonNull
    @ProtobufIndex(index = 1)
    public String tag;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> tags;

    @NonNull
    @ProtobufIndex(index = 2)
    public User user;
    public static ProtobufAdapter<CardInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<CardInfo>() { // from class: com.p1.mobile.putong.core.data.CardInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CardInfo cardInfo) {
            String str = cardInfo.tag;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            User user = cardInfo.user;
            if (user != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, user, User.PROTOBUF_ADAPTER);
            }
            String str2 = cardInfo.background_color;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            List<String> list = cardInfo.tags;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            cardInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CardInfo parse(nc5 nc5Var) throws IOException {
            CardInfo cardInfo = new CardInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (cardInfo.tag == null) {
                        cardInfo.tag = "";
                    }
                    if (cardInfo.tags == null) {
                        cardInfo.tags = new ArrayList();
                    }
                    if (cardInfo.user == null) {
                        cardInfo.user = User.new_();
                    }
                    if (cardInfo.background_color != null) {
                        break;
                    }
                    cardInfo.background_color = "";
                    break;
                }
                if (iM162497u == 10) {
                    cardInfo.tag = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    cardInfo.user = (User) nc5Var.m162488l(User.PROTOBUF_ADAPTER);
                } else if (iM162497u == 26) {
                    cardInfo.background_color = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (cardInfo.tag == null) {
                            cardInfo.tag = "";
                        }
                        if (cardInfo.tags == null) {
                            cardInfo.tags = new ArrayList();
                        }
                        if (cardInfo.user == null) {
                            cardInfo.user = User.new_();
                        }
                        if (cardInfo.background_color != null) {
                            break;
                        }
                        cardInfo.background_color = "";
                        return cardInfo;
                    }
                    cardInfo.tags = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return cardInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CardInfo cardInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cardInfo.tag;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            User user = cardInfo.user;
            if (user != null) {
                codedOutputByteBufferNano.m17309K(2, user, User.PROTOBUF_ADAPTER);
            }
            String str2 = cardInfo.background_color;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            List<String> list = cardInfo.tags;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<CardInfo> JSON_ADAPTER = new ObjectJsonAdapter<CardInfo>() { // from class: com.p1.mobile.putong.core.data.CardInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CardInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CardInfo newInstance() {
            return new CardInfo();
        }

        public boolean parseField(CardInfo cardInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "tag":
                    cardInfo.tag = jsonParser.getValueAsString();
                    return true;
                case "tags":
                    cardInfo.tags = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "user":
                    cardInfo.user = User.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "background_color":
                    cardInfo.background_color = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CardInfo cardInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "tag":
                case "tags":
                case "user":
                case "background_color":
                    return true;
                default:
                    return super.parseFieldCheck(cardInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CardInfo cardInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = cardInfo.tag;
            if (str != null) {
                jsonGenerator.writeStringField("tag", str);
            }
            if (cardInfo.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(cardInfo.tags, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (cardInfo.user != null) {
                jsonGenerator.writeFieldName("user");
                User.JSON_ADAPTER.serialize(cardInfo.user, jsonGenerator, true);
            }
            String str2 = cardInfo.background_color;
            if (str2 != null) {
                jsonGenerator.writeStringField("background_color", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36233a(String str) {
        return str;
    }

    public static CardInfo new_() {
        CardInfo cardInfo = new CardInfo();
        cardInfo.nullCheck();
        return cardInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CardInfo mo225055clone() {
        CardInfo cardInfo = new CardInfo();
        cardInfo.tag = this.tag;
        List<String> list = this.tags;
        if (list != null) {
            cardInfo.tags = ValueObject.util_map(list, new qcj() { // from class: l.uk4
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CardInfo.m36233a((String) obj);
                }
            });
        }
        User user = this.user;
        if (user != null) {
            cardInfo.user = user.mo225055clone();
        }
        cardInfo.background_color = this.background_color;
        return cardInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardInfo)) {
            return false;
        }
        CardInfo cardInfo = (CardInfo) obj;
        return ValueObject.util_equals(this.tag, cardInfo.tag) && ValueObject.util_equals(this.tags, cardInfo.tags) && ValueObject.util_equals(this.user, cardInfo.user) && ValueObject.util_equals(this.background_color, cardInfo.background_color);
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
        String str = this.tag;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.tags;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        User user = this.user;
        int iHashCode3 = (iHashCode2 + (user != null ? user.hashCode() : 0)) * 41;
        String str2 = this.background_color;
        int iHashCode4 = iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.tag == null) {
            this.tag = "";
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        if (this.user == null) {
            this.user = User.new_();
        }
        if (this.background_color == null) {
            this.background_color = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
