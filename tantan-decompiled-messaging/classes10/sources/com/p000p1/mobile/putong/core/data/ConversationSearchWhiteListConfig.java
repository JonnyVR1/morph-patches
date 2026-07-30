package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.ConversationSearchWhiteListConfig;
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
public class ConversationSearchWhiteListConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationsearchwhitelistconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> white_list;
    public static ProtobufAdapter<ConversationSearchWhiteListConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationSearchWhiteListConfig>() { // from class: com.p1.mobile.putong.core.data.ConversationSearchWhiteListConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ConversationSearchWhiteListConfig conversationSearchWhiteListConfig) {
            List<String> list = conversationSearchWhiteListConfig.white_list;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) conversationSearchWhiteListConfig).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ConversationSearchWhiteListConfig m12425parse(nb5 nb5Var) throws IOException {
            ConversationSearchWhiteListConfig conversationSearchWhiteListConfig = new ConversationSearchWhiteListConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (conversationSearchWhiteListConfig.white_list != null) {
                        break;
                    }
                    conversationSearchWhiteListConfig.white_list = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (conversationSearchWhiteListConfig.white_list != null) {
                        break;
                    }
                    conversationSearchWhiteListConfig.white_list = new ArrayList();
                    return conversationSearchWhiteListConfig;
                }
                conversationSearchWhiteListConfig.white_list = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return conversationSearchWhiteListConfig;
        }

        public void serialize(ConversationSearchWhiteListConfig conversationSearchWhiteListConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = conversationSearchWhiteListConfig.white_list;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ConversationSearchWhiteListConfig> JSON_ADAPTER = new ObjectJsonAdapter<ConversationSearchWhiteListConfig>() { // from class: com.p1.mobile.putong.core.data.ConversationSearchWhiteListConfig.2
        public Class getDataClass() {
            return ConversationSearchWhiteListConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ConversationSearchWhiteListConfig m12426newInstance() {
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

        public void serializeFields(ConversationSearchWhiteListConfig conversationSearchWhiteListConfig, JsonGenerator jsonGenerator) throws IOException {
            if (conversationSearchWhiteListConfig.white_list != null) {
                jsonGenerator.writeFieldName("white_list");
                JsonAdapter.serializeArray(conversationSearchWhiteListConfig.white_list, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationSearchWhiteListConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationSearchWhiteListConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m104a(String str) {
        return str;
    }

    public static ConversationSearchWhiteListConfig new_() {
        ConversationSearchWhiteListConfig conversationSearchWhiteListConfig = new ConversationSearchWhiteListConfig();
        conversationSearchWhiteListConfig.nullCheck();
        return conversationSearchWhiteListConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ConversationSearchWhiteListConfig m12424clone() {
        ConversationSearchWhiteListConfig conversationSearchWhiteListConfig = new ConversationSearchWhiteListConfig();
        List<String> list = this.white_list;
        if (list != null) {
            conversationSearchWhiteListConfig.white_list = ValueObject.util_map(list, new w9j() { // from class: l.fk6
                public final Object call(Object obj) {
                    return ConversationSearchWhiteListConfig.m104a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<String> list = this.white_list;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.white_list == null) {
            this.white_list = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
