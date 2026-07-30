package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.LabelParams;
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
public class ChatRoundsDisplayedExternallyConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatroundsdisplayedexternallyconfig";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean enabled;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<LabelParams> filterTabList;
    public static ProtobufAdapter<ChatRoundsDisplayedExternallyConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatRoundsDisplayedExternallyConfig>() { // from class: com.p1.mobile.putong.core.data.ChatRoundsDisplayedExternallyConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfig) {
            List<LabelParams> list = chatRoundsDisplayedExternallyConfig.filterTabList;
            int iL = (list != null ? CodedOutputByteBufferNano.l(1, list, LabelParams.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.b(2, chatRoundsDisplayedExternallyConfig.enabled);
            ((MessageNano) chatRoundsDisplayedExternallyConfig).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatRoundsDisplayedExternallyConfig m12149parse(nb5 nb5Var) throws IOException {
            ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfig = new ChatRoundsDisplayedExternallyConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (chatRoundsDisplayedExternallyConfig.filterTabList != null) {
                        break;
                    }
                    chatRoundsDisplayedExternallyConfig.filterTabList = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    chatRoundsDisplayedExternallyConfig.filterTabList = (List) nb5Var.l(LabelParams.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 16) {
                        if (chatRoundsDisplayedExternallyConfig.filterTabList != null) {
                            break;
                        }
                        chatRoundsDisplayedExternallyConfig.filterTabList = new ArrayList();
                        return chatRoundsDisplayedExternallyConfig;
                    }
                    chatRoundsDisplayedExternallyConfig.enabled = nb5Var.g();
                }
            }
            return chatRoundsDisplayedExternallyConfig;
        }

        public void serialize(ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<LabelParams> list = chatRoundsDisplayedExternallyConfig.filterTabList;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, LabelParams.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.A(2, chatRoundsDisplayedExternallyConfig.enabled);
        }
    };
    public static JsonAdapter<ChatRoundsDisplayedExternallyConfig> JSON_ADAPTER = new ObjectJsonAdapter<ChatRoundsDisplayedExternallyConfig>() { // from class: com.p1.mobile.putong.core.data.ChatRoundsDisplayedExternallyConfig.2
        public Class getDataClass() {
            return ChatRoundsDisplayedExternallyConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatRoundsDisplayedExternallyConfig m12150newInstance() {
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

        public void serializeFields(ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfig, JsonGenerator jsonGenerator) throws IOException {
            if (chatRoundsDisplayedExternallyConfig.filterTabList != null) {
                jsonGenerator.writeFieldName("filterTabList");
                JsonAdapter.serializeArray(chatRoundsDisplayedExternallyConfig.filterTabList, jsonGenerator, LabelParams.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("enabled", chatRoundsDisplayedExternallyConfig.enabled);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatRoundsDisplayedExternallyConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatRoundsDisplayedExternallyConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatRoundsDisplayedExternallyConfig new_() {
        ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfig = new ChatRoundsDisplayedExternallyConfig();
        chatRoundsDisplayedExternallyConfig.nullCheck();
        return chatRoundsDisplayedExternallyConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatRoundsDisplayedExternallyConfig m12148clone() {
        ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfig = new ChatRoundsDisplayedExternallyConfig();
        List<LabelParams> list = this.filterTabList;
        if (list != null) {
            chatRoundsDisplayedExternallyConfig.filterTabList = ValueObject.util_map(list, new w9j() { // from class: l.c25
                public final Object call(Object obj) {
                    return ((LabelParams) obj).m13804clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<LabelParams> list = this.filterTabList;
        int iHashCode = ((i2 + (list != null ? list.hashCode() : 0)) * 41) + (this.enabled ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.filterTabList == null) {
            this.filterTabList = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
