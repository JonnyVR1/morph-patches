package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p051p1.mobile.putong.core.data.ConversationNotification;
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
public class ConversationNotification extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationnotification";

    @NonNull
    @ProtobufIndex(index = 2)
    public String localeKey;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> params;
    public static ProtobufAdapter<ConversationNotification> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationNotification>() { // from class: com.p1.mobile.putong.core.data.ConversationNotification.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConversationNotification conversationNotification) {
            List<String> list = conversationNotification.params;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = conversationNotification.localeKey;
            if (str != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(2, str);
            }
            conversationNotification.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConversationNotification parse(nc5 nc5Var) throws IOException {
            ConversationNotification conversationNotification = new ConversationNotification();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (conversationNotification.params == null) {
                        conversationNotification.params = new ArrayList();
                    }
                    if (conversationNotification.localeKey != null) {
                        break;
                    }
                    conversationNotification.localeKey = "";
                    break;
                }
                if (iM162497u == 10) {
                    conversationNotification.params = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 18) {
                        if (conversationNotification.params == null) {
                            conversationNotification.params = new ArrayList();
                        }
                        if (conversationNotification.localeKey != null) {
                            break;
                        }
                        conversationNotification.localeKey = "";
                        return conversationNotification;
                    }
                    conversationNotification.localeKey = nc5Var.m162495s();
                }
            }
            return conversationNotification;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConversationNotification conversationNotification, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = conversationNotification.params;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = conversationNotification.localeKey;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
        }
    };
    public static JsonAdapter<ConversationNotification> JSON_ADAPTER = new ObjectJsonAdapter<ConversationNotification>() { // from class: com.p1.mobile.putong.core.data.ConversationNotification.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConversationNotification.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConversationNotification newInstance() {
            return new ConversationNotification();
        }

        public boolean parseField(ConversationNotification conversationNotification, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("localeKey")) {
                conversationNotification.localeKey = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(CommandMessage.PARAMS)) {
                return false;
            }
            conversationNotification.params = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ConversationNotification conversationNotification, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("localeKey") || str.equals(CommandMessage.PARAMS)) {
                return true;
            }
            return super.parseFieldCheck(conversationNotification, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConversationNotification conversationNotification, JsonGenerator jsonGenerator) throws IOException {
            if (conversationNotification.params != null) {
                jsonGenerator.writeFieldName(CommandMessage.PARAMS);
                JsonAdapter.serializeArray(conversationNotification.params, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str = conversationNotification.localeKey;
            if (str != null) {
                jsonGenerator.writeStringField("localeKey", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationNotification) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationNotification) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36303a(String str) {
        return str;
    }

    public static ConversationNotification new_() {
        ConversationNotification conversationNotification = new ConversationNotification();
        conversationNotification.nullCheck();
        return conversationNotification;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConversationNotification mo225055clone() {
        ConversationNotification conversationNotification = new ConversationNotification();
        List<String> list = this.params;
        if (list != null) {
            conversationNotification.params = ValueObject.util_map(list, new qcj() { // from class: l.rj6
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ConversationNotification.m36303a((String) obj);
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
        List<String> list = this.params;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.localeKey;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.params == null) {
            this.params = new ArrayList();
        }
        if (this.localeKey == null) {
            this.localeKey = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
