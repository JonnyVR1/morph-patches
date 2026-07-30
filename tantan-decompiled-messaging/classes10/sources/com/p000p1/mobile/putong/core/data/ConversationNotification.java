package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.ConversationNotification;
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
public class ConversationNotification extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationnotification";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String localeKey;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> params;
    public static ProtobufAdapter<ConversationNotification> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationNotification>() { // from class: com.p1.mobile.putong.core.data.ConversationNotification.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ConversationNotification conversationNotification) {
            List<String> list = conversationNotification.params;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = conversationNotification.localeKey;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) conversationNotification).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ConversationNotification m12401parse(nb5 nb5Var) throws IOException {
            ConversationNotification conversationNotification = new ConversationNotification();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (conversationNotification.params == null) {
                        conversationNotification.params = new ArrayList();
                    }
                    if (conversationNotification.localeKey != null) {
                        break;
                    }
                    conversationNotification.localeKey = "";
                    break;
                }
                if (iU == 10) {
                    conversationNotification.params = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (conversationNotification.params == null) {
                            conversationNotification.params = new ArrayList();
                        }
                        if (conversationNotification.localeKey != null) {
                            break;
                        }
                        conversationNotification.localeKey = "";
                        return conversationNotification;
                    }
                    conversationNotification.localeKey = nb5Var.s();
                }
            }
            return conversationNotification;
        }

        public void serialize(ConversationNotification conversationNotification, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = conversationNotification.params;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = conversationNotification.localeKey;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<ConversationNotification> JSON_ADAPTER = new ObjectJsonAdapter<ConversationNotification>() { // from class: com.p1.mobile.putong.core.data.ConversationNotification.2
        public Class getDataClass() {
            return ConversationNotification.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ConversationNotification m12402newInstance() {
            return new ConversationNotification();
        }

        public boolean parseField(ConversationNotification conversationNotification, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("localeKey")) {
                conversationNotification.localeKey = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("params")) {
                return false;
            }
            conversationNotification.params = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ConversationNotification conversationNotification, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("localeKey") || str.equals("params")) {
                return true;
            }
            return super.parseFieldCheck(conversationNotification, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ConversationNotification conversationNotification, JsonGenerator jsonGenerator) throws IOException {
            if (conversationNotification.params != null) {
                jsonGenerator.writeFieldName("params");
                JsonAdapter.serializeArray(conversationNotification.params, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str = conversationNotification.localeKey;
            if (str != null) {
                jsonGenerator.writeStringField("localeKey", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationNotification) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationNotification) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m102a(String str) {
        return str;
    }

    public static ConversationNotification new_() {
        ConversationNotification conversationNotification = new ConversationNotification();
        conversationNotification.nullCheck();
        return conversationNotification;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ConversationNotification m12400clone() {
        ConversationNotification conversationNotification = new ConversationNotification();
        List<String> list = this.params;
        if (list != null) {
            conversationNotification.params = ValueObject.util_map(list, new w9j() { // from class: l.oi6
                public final Object call(Object obj) {
                    return ConversationNotification.m102a((String) obj);
                }
            });
        }
        conversationNotification.localeKey = this.localeKey;
        return conversationNotification;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationNotification)) {
            return false;
        }
        ConversationNotification conversationNotification = (ConversationNotification) obj;
        return ValueObject.util_equals(this.params, conversationNotification.params) && ValueObject.util_equals(this.localeKey, conversationNotification.localeKey);
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
        List<String> list = this.params;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.localeKey;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.params == null) {
            this.params = new ArrayList();
        }
        if (this.localeKey == null) {
            this.localeKey = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
