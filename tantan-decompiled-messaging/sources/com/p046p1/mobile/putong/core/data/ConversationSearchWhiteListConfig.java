package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.ConversationSearchWhiteListConfig;
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
public class ConversationSearchWhiteListConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationsearchwhitelistconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> white_list;
    public static ProtobufAdapter<ConversationSearchWhiteListConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationSearchWhiteListConfig>() { // from class: com.p1.mobile.putong.core.data.ConversationSearchWhiteListConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConversationSearchWhiteListConfig conversationSearchWhiteListConfig) {
            List<String> list = conversationSearchWhiteListConfig.white_list;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            conversationSearchWhiteListConfig.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConversationSearchWhiteListConfig parse(nb5 nb5Var) throws IOException {
            ConversationSearchWhiteListConfig conversationSearchWhiteListConfig = new ConversationSearchWhiteListConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (conversationSearchWhiteListConfig.white_list != null) {
                        break;
                    }
                    conversationSearchWhiteListConfig.white_list = new ArrayList();
                    break;
                }
                if (iM158752u != 10) {
                    if (conversationSearchWhiteListConfig.white_list != null) {
                        break;
                    }
                    conversationSearchWhiteListConfig.white_list = new ArrayList();
                    return conversationSearchWhiteListConfig;
                }
                conversationSearchWhiteListConfig.white_list = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return conversationSearchWhiteListConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConversationSearchWhiteListConfig conversationSearchWhiteListConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = conversationSearchWhiteListConfig.white_list;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ConversationSearchWhiteListConfig> JSON_ADAPTER = new ObjectJsonAdapter<ConversationSearchWhiteListConfig>() { // from class: com.p1.mobile.putong.core.data.ConversationSearchWhiteListConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConversationSearchWhiteListConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConversationSearchWhiteListConfig newInstance() {
            return new ConversationSearchWhiteListConfig();
        }

        public boolean parseField(ConversationSearchWhiteListConfig conversationSearchWhiteListConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("white_list")) {
                return false;
            }
            conversationSearchWhiteListConfig.white_list = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ConversationSearchWhiteListConfig conversationSearchWhiteListConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("white_list")) {
                return true;
            }
            return super.parseFieldCheck(conversationSearchWhiteListConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConversationSearchWhiteListConfig conversationSearchWhiteListConfig, JsonGenerator jsonGenerator) throws IOException {
            if (conversationSearchWhiteListConfig.white_list != null) {
                jsonGenerator.writeFieldName("white_list");
                JsonAdapter.serializeArray(conversationSearchWhiteListConfig.white_list, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationSearchWhiteListConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationSearchWhiteListConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35302a(String str) {
        return str;
    }

    public static ConversationSearchWhiteListConfig new_() {
        ConversationSearchWhiteListConfig conversationSearchWhiteListConfig = new ConversationSearchWhiteListConfig();
        conversationSearchWhiteListConfig.nullCheck();
        return conversationSearchWhiteListConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConversationSearchWhiteListConfig mo223809clone() {
        ConversationSearchWhiteListConfig conversationSearchWhiteListConfig = new ConversationSearchWhiteListConfig();
        List<String> list = this.white_list;
        if (list != null) {
            conversationSearchWhiteListConfig.white_list = ValueObject.util_map(list, new w9j() { // from class: l.fk6
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ConversationSearchWhiteListConfig.m35302a((String) obj);
                }
            });
        }
        return conversationSearchWhiteListConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConversationSearchWhiteListConfig) {
            return ValueObject.util_equals(this.white_list, ((ConversationSearchWhiteListConfig) obj).white_list);
        }
        return false;
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
        List<String> list = this.white_list;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.white_list == null) {
            this.white_list = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
