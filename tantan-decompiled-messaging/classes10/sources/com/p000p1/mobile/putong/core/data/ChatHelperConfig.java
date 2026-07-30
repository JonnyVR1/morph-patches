package com.p000p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ChatHelperConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chathelperconfig";

    @ProtobufIndex(index = 1)
    public boolean female_chat_assistant_enable;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int female_chat_assistant_profile_dlg_close_max;
    public static ProtobufAdapter<ChatHelperConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatHelperConfig>() { // from class: com.p1.mobile.putong.core.data.ChatHelperConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatHelperConfig chatHelperConfig) {
            int iB = CodedOutputByteBufferNano.b(1, chatHelperConfig.female_chat_assistant_enable) + CodedOutputByteBufferNano.h(2, chatHelperConfig.female_chat_assistant_profile_dlg_close_max);
            ((MessageNano) chatHelperConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatHelperConfig m12059parse(nb5 nb5Var) throws IOException {
            ChatHelperConfig chatHelperConfig = new ChatHelperConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    chatHelperConfig.female_chat_assistant_enable = nb5Var.g();
                } else {
                    if (iU != 16) {
                        return chatHelperConfig;
                    }
                    chatHelperConfig.female_chat_assistant_profile_dlg_close_max = nb5Var.j();
                }
            }
        }

        public void serialize(ChatHelperConfig chatHelperConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, chatHelperConfig.female_chat_assistant_enable);
            codedOutputByteBufferNano.G(2, chatHelperConfig.female_chat_assistant_profile_dlg_close_max);
        }
    };
    public static JsonAdapter<ChatHelperConfig> JSON_ADAPTER = new ObjectJsonAdapter<ChatHelperConfig>() { // from class: com.p1.mobile.putong.core.data.ChatHelperConfig.2
        public Class getDataClass() {
            return ChatHelperConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatHelperConfig m12060newInstance() {
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

        public void serializeFields(ChatHelperConfig chatHelperConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("female_chat_assistant_enable", chatHelperConfig.female_chat_assistant_enable);
            jsonGenerator.writeNumberField("female_chat_assistant_profile_dlg_close_max", chatHelperConfig.female_chat_assistant_profile_dlg_close_max);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatHelperConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatHelperConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatHelperConfig new_() {
        ChatHelperConfig chatHelperConfig = new ChatHelperConfig();
        chatHelperConfig.nullCheck();
        return chatHelperConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatHelperConfig m12058clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.female_chat_assistant_enable ? 1231 : 1237)) * 41) + this.female_chat_assistant_profile_dlg_close_max;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
