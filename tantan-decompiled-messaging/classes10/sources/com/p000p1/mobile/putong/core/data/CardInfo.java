package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.CardInfo;
import com.p1.mobile.putong.data.User;
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
public class CardInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cardinfo";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String background_color;

    @NonNull
    @ProtobufIndex(index = 1)
    public String tag;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> tags;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public User user;
    public static ProtobufAdapter<CardInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<CardInfo>() { // from class: com.p1.mobile.putong.core.data.CardInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CardInfo cardInfo) {
            String str = cardInfo.tag;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            User user = cardInfo.user;
            if (user != null) {
                iO += CodedOutputByteBufferNano.l(2, user, User.PROTOBUF_ADAPTER);
            }
            String str2 = cardInfo.background_color;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            List<String> list = cardInfo.tags;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) cardInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CardInfo m11875parse(nb5 nb5Var) throws IOException {
            CardInfo cardInfo = new CardInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    cardInfo.tag = nb5Var.s();
                } else if (iU == 18) {
                    cardInfo.user = (User) nb5Var.l(User.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    cardInfo.background_color = nb5Var.s();
                } else {
                    if (iU != 34) {
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
                    cardInfo.tags = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return cardInfo;
        }

        public void serialize(CardInfo cardInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cardInfo.tag;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            User user = cardInfo.user;
            if (user != null) {
                codedOutputByteBufferNano.K(2, user, User.PROTOBUF_ADAPTER);
            }
            String str2 = cardInfo.background_color;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            List<String> list = cardInfo.tags;
            if (list != null) {
                codedOutputByteBufferNano.K(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<CardInfo> JSON_ADAPTER = new ObjectJsonAdapter<CardInfo>() { // from class: com.p1.mobile.putong.core.data.CardInfo.2
        public Class getDataClass() {
            return CardInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CardInfo m11876newInstance() {
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
                    cardInfo.user = (User) User.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m32a(String str) {
        return str;
    }

    public static CardInfo new_() {
        CardInfo cardInfo = new CardInfo();
        cardInfo.nullCheck();
        return cardInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CardInfo m11874clone() {
        CardInfo cardInfo = new CardInfo();
        cardInfo.tag = this.tag;
        List<String> list = this.tags;
        if (list != null) {
            cardInfo.tags = ValueObject.util_map(list, new w9j() { // from class: l.vj4
                public final Object call(Object obj) {
                    return CardInfo.m32a((String) obj);
                }
            });
        }
        User user = this.user;
        if (user != null) {
            cardInfo.user = user.clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
