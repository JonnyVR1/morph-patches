package com.p051p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class ChatHelperConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chathelperconfig";

    @ProtobufIndex(index = 1)
    public boolean female_chat_assistant_enable;

    @ProtobufIndex(index = 2)
    public int female_chat_assistant_profile_dlg_close_max;
    public static ProtobufAdapter<ChatHelperConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatHelperConfig>() { // from class: com.p1.mobile.putong.core.data.ChatHelperConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatHelperConfig chatHelperConfig) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, chatHelperConfig.female_chat_assistant_enable) + CodedOutputByteBufferNano.m17281h(2, chatHelperConfig.female_chat_assistant_profile_dlg_close_max);
            chatHelperConfig.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatHelperConfig parse(nc5 nc5Var) throws IOException {
            ChatHelperConfig chatHelperConfig = new ChatHelperConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    chatHelperConfig.female_chat_assistant_enable = nc5Var.m162483g();
                } else {
                    if (iM162497u != 16) {
                        return chatHelperConfig;
                    }
                    chatHelperConfig.female_chat_assistant_profile_dlg_close_max = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatHelperConfig chatHelperConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, chatHelperConfig.female_chat_assistant_enable);
            codedOutputByteBufferNano.m17305G(2, chatHelperConfig.female_chat_assistant_profile_dlg_close_max);
        }
    };
    public static JsonAdapter<ChatHelperConfig> JSON_ADAPTER = new ObjectJsonAdapter<ChatHelperConfig>() { // from class: com.p1.mobile.putong.core.data.ChatHelperConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatHelperConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatHelperConfig newInstance() {
            return new ChatHelperConfig();
        }

        public boolean parseField(ChatHelperConfig chatHelperConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("female_chat_assistant_enable")) {
                chatHelperConfig.female_chat_assistant_enable = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("female_chat_assistant_profile_dlg_close_max")) {
                return false;
            }
            chatHelperConfig.female_chat_assistant_profile_dlg_close_max = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(ChatHelperConfig chatHelperConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("female_chat_assistant_enable") || str.equals("female_chat_assistant_profile_dlg_close_max")) {
                return true;
            }
            return super.parseFieldCheck(chatHelperConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatHelperConfig chatHelperConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("female_chat_assistant_enable", chatHelperConfig.female_chat_assistant_enable);
            jsonGenerator.writeNumberField("female_chat_assistant_profile_dlg_close_max", chatHelperConfig.female_chat_assistant_profile_dlg_close_max);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatHelperConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatHelperConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatHelperConfig new_() {
        ChatHelperConfig chatHelperConfig = new ChatHelperConfig();
        chatHelperConfig.nullCheck();
        return chatHelperConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatHelperConfig mo225055clone() {
        ChatHelperConfig chatHelperConfig = new ChatHelperConfig();
        chatHelperConfig.female_chat_assistant_enable = this.female_chat_assistant_enable;
        chatHelperConfig.female_chat_assistant_profile_dlg_close_max = this.female_chat_assistant_profile_dlg_close_max;
        return chatHelperConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatHelperConfig)) {
            return false;
        }
        ChatHelperConfig chatHelperConfig = (ChatHelperConfig) obj;
        return this.female_chat_assistant_enable == chatHelperConfig.female_chat_assistant_enable && this.female_chat_assistant_profile_dlg_close_max == chatHelperConfig.female_chat_assistant_profile_dlg_close_max;
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
        int i2 = (((i * 41) + (this.female_chat_assistant_enable ? 1231 : 1237)) * 41) + this.female_chat_assistant_profile_dlg_close_max;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
