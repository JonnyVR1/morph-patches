package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.TextCardData;
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
public class TextQuickChatCardData extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "textquickchatcarddata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<TextCardData> cards;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<User> users;
    public static ProtobufAdapter<TextQuickChatCardData> PROTOBUF_ADAPTER = new MessageNanoAdapter<TextQuickChatCardData>() { // from class: com.p1.mobile.putong.core.data.TextQuickChatCardData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TextQuickChatCardData textQuickChatCardData) {
            List<TextCardData> list = textQuickChatCardData.cards;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, TextCardData.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<User> list2 = textQuickChatCardData.users;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, User.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) textQuickChatCardData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TextQuickChatCardData m15966parse(nb5 nb5Var) throws IOException {
            TextQuickChatCardData textQuickChatCardData = new TextQuickChatCardData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (textQuickChatCardData.cards == null) {
                        textQuickChatCardData.cards = new ArrayList();
                    }
                    if (textQuickChatCardData.users != null) {
                        break;
                    }
                    textQuickChatCardData.users = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    textQuickChatCardData.cards = (List) nb5Var.l(TextCardData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (textQuickChatCardData.cards == null) {
                            textQuickChatCardData.cards = new ArrayList();
                        }
                        if (textQuickChatCardData.users != null) {
                            break;
                        }
                        textQuickChatCardData.users = new ArrayList();
                        return textQuickChatCardData;
                    }
                    textQuickChatCardData.users = (List) nb5Var.l(User.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return textQuickChatCardData;
        }

        public void serialize(TextQuickChatCardData textQuickChatCardData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<TextCardData> list = textQuickChatCardData.cards;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, TextCardData.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<User> list2 = textQuickChatCardData.users;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, User.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<TextQuickChatCardData> JSON_ADAPTER = new ObjectJsonAdapter<TextQuickChatCardData>() { // from class: com.p1.mobile.putong.core.data.TextQuickChatCardData.2
        public Class getDataClass() {
            return TextQuickChatCardData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TextQuickChatCardData m15967newInstance() {
            return new TextQuickChatCardData();
        }

        public boolean parseField(TextQuickChatCardData textQuickChatCardData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("cards")) {
                textQuickChatCardData.cards = JsonAdapter.parseArray(jsonParser, TextCardData.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("users")) {
                return false;
            }
            textQuickChatCardData.users = JsonAdapter.parseArray(jsonParser, User.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(TextQuickChatCardData textQuickChatCardData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("cards") || str.equals("users")) {
                return true;
            }
            return super.parseFieldCheck(textQuickChatCardData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(TextQuickChatCardData textQuickChatCardData, JsonGenerator jsonGenerator) throws IOException {
            if (textQuickChatCardData.cards != null) {
                jsonGenerator.writeFieldName("cards");
                JsonAdapter.serializeArray(textQuickChatCardData.cards, jsonGenerator, TextCardData.JSON_ADAPTER);
            }
            if (textQuickChatCardData.users != null) {
                jsonGenerator.writeFieldName("users");
                JsonAdapter.serializeArray(textQuickChatCardData.users, jsonGenerator, User.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TextQuickChatCardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TextQuickChatCardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TextQuickChatCardData new_() {
        TextQuickChatCardData textQuickChatCardData = new TextQuickChatCardData();
        textQuickChatCardData.nullCheck();
        return textQuickChatCardData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TextQuickChatCardData m15965clone() {
        TextQuickChatCardData textQuickChatCardData = new TextQuickChatCardData();
        List<TextCardData> list = this.cards;
        if (list != null) {
            textQuickChatCardData.cards = ValueObject.util_map(list, new w9j() { // from class: l.bji0
                public final Object call(Object obj) {
                    return ((TextCardData) obj).m15961clone();
                }
            });
        }
        List<User> list2 = this.users;
        if (list2 != null) {
            textQuickChatCardData.users = ValueObject.util_map(list2, new w9j() { // from class: l.cji0
                public final Object call(Object obj) {
                    return ((User) obj).clone();
                }
            });
        }
        return textQuickChatCardData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextQuickChatCardData)) {
            return false;
        }
        TextQuickChatCardData textQuickChatCardData = (TextQuickChatCardData) obj;
        return this == obj && ValueObject.util_equals(this.cards, textQuickChatCardData.cards) && ValueObject.util_equals(this.users, textQuickChatCardData.users);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        List<TextCardData> list = this.cards;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<User> list2 = this.users;
        int iHashCode3 = iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.cards == null) {
            this.cards = new ArrayList();
        }
        if (this.users == null) {
            this.users = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
