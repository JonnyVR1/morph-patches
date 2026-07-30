package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.LabelParams;
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
public class ChatRoundsDisplayedExternallyConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatroundsdisplayedexternallyconfig";

    @ProtobufIndex(index = 2)
    public boolean enabled;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<LabelParams> filterTabList;
    public static ProtobufAdapter<ChatRoundsDisplayedExternallyConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatRoundsDisplayedExternallyConfig>() { // from class: com.p1.mobile.putong.core.data.ChatRoundsDisplayedExternallyConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfig) {
            List<LabelParams> list = chatRoundsDisplayedExternallyConfig.filterTabList;
            int iM17285l = (list != null ? CodedOutputByteBufferNano.m17285l(1, list, LabelParams.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.m17275b(2, chatRoundsDisplayedExternallyConfig.enabled);
            chatRoundsDisplayedExternallyConfig.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatRoundsDisplayedExternallyConfig parse(nc5 nc5Var) throws IOException {
            ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfig = new ChatRoundsDisplayedExternallyConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (chatRoundsDisplayedExternallyConfig.filterTabList != null) {
                        break;
                    }
                    chatRoundsDisplayedExternallyConfig.filterTabList = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    chatRoundsDisplayedExternallyConfig.filterTabList = (List) nc5Var.m162488l(LabelParams.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 16) {
                        if (chatRoundsDisplayedExternallyConfig.filterTabList != null) {
                            break;
                        }
                        chatRoundsDisplayedExternallyConfig.filterTabList = new ArrayList();
                        return chatRoundsDisplayedExternallyConfig;
                    }
                    chatRoundsDisplayedExternallyConfig.enabled = nc5Var.m162483g();
                }
            }
            return chatRoundsDisplayedExternallyConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<LabelParams> list = chatRoundsDisplayedExternallyConfig.filterTabList;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, LabelParams.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17299A(2, chatRoundsDisplayedExternallyConfig.enabled);
        }
    };
    public static JsonAdapter<ChatRoundsDisplayedExternallyConfig> JSON_ADAPTER = new ObjectJsonAdapter<ChatRoundsDisplayedExternallyConfig>() { // from class: com.p1.mobile.putong.core.data.ChatRoundsDisplayedExternallyConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatRoundsDisplayedExternallyConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatRoundsDisplayedExternallyConfig newInstance() {
            return new ChatRoundsDisplayedExternallyConfig();
        }

        public boolean parseField(ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("enabled")) {
                chatRoundsDisplayedExternallyConfig.enabled = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("filterTabList")) {
                return false;
            }
            chatRoundsDisplayedExternallyConfig.filterTabList = JsonAdapter.parseArray(jsonParser, LabelParams.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("enabled") || str.equals("filterTabList")) {
                return true;
            }
            return super.parseFieldCheck(chatRoundsDisplayedExternallyConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfig, JsonGenerator jsonGenerator) throws IOException {
            if (chatRoundsDisplayedExternallyConfig.filterTabList != null) {
                jsonGenerator.writeFieldName("filterTabList");
                JsonAdapter.serializeArray(chatRoundsDisplayedExternallyConfig.filterTabList, jsonGenerator, LabelParams.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("enabled", chatRoundsDisplayedExternallyConfig.enabled);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatRoundsDisplayedExternallyConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatRoundsDisplayedExternallyConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatRoundsDisplayedExternallyConfig new_() {
        ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfig = new ChatRoundsDisplayedExternallyConfig();
        chatRoundsDisplayedExternallyConfig.nullCheck();
        return chatRoundsDisplayedExternallyConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatRoundsDisplayedExternallyConfig mo225055clone() {
        ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfig = new ChatRoundsDisplayedExternallyConfig();
        List<LabelParams> list = this.filterTabList;
        if (list != null) {
            chatRoundsDisplayedExternallyConfig.filterTabList = ValueObject.util_map(list, new qcj() { // from class: l.b35
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((LabelParams) obj).mo225055clone();
                }
            });
        }
        chatRoundsDisplayedExternallyConfig.enabled = this.enabled;
        return chatRoundsDisplayedExternallyConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatRoundsDisplayedExternallyConfig)) {
            return false;
        }
        ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfig = (ChatRoundsDisplayedExternallyConfig) obj;
        return ValueObject.util_equals(this.filterTabList, chatRoundsDisplayedExternallyConfig.filterTabList) && this.enabled == chatRoundsDisplayedExternallyConfig.enabled;
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
        List<LabelParams> list = this.filterTabList;
        int iHashCode = ((i2 + (list != null ? list.hashCode() : 0)) * 41) + (this.enabled ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.filterTabList == null) {
            this.filterTabList = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
