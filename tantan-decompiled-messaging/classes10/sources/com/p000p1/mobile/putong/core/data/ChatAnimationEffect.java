package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.ChatAnimationEffect;
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
public class ChatAnimationEffect extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatanimationeffect";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String filepath;

    @NonNull
    @ProtobufIndex(index = 1)
    public String key;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> keywords;
    public static ProtobufAdapter<ChatAnimationEffect> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatAnimationEffect>() { // from class: com.p1.mobile.putong.core.data.ChatAnimationEffect.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatAnimationEffect chatAnimationEffect) {
            String str = chatAnimationEffect.key;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<String> list = chatAnimationEffect.keywords;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = chatAnimationEffect.filepath;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            ((MessageNano) chatAnimationEffect).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatAnimationEffect m11965parse(nb5 nb5Var) throws IOException {
            ChatAnimationEffect chatAnimationEffect = new ChatAnimationEffect();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (chatAnimationEffect.key == null) {
                        chatAnimationEffect.key = "";
                    }
                    if (chatAnimationEffect.keywords == null) {
                        chatAnimationEffect.keywords = new ArrayList();
                    }
                    if (chatAnimationEffect.filepath != null) {
                        break;
                    }
                    chatAnimationEffect.filepath = "";
                    break;
                }
                if (iU == 10) {
                    chatAnimationEffect.key = nb5Var.s();
                } else if (iU == 18) {
                    chatAnimationEffect.keywords = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 26) {
                        if (chatAnimationEffect.key == null) {
                            chatAnimationEffect.key = "";
                        }
                        if (chatAnimationEffect.keywords == null) {
                            chatAnimationEffect.keywords = new ArrayList();
                        }
                        if (chatAnimationEffect.filepath != null) {
                            break;
                        }
                        chatAnimationEffect.filepath = "";
                        return chatAnimationEffect;
                    }
                    chatAnimationEffect.filepath = nb5Var.s();
                }
            }
            return chatAnimationEffect;
        }

        public void serialize(ChatAnimationEffect chatAnimationEffect, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = chatAnimationEffect.key;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<String> list = chatAnimationEffect.keywords;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = chatAnimationEffect.filepath;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
        }
    };
    public static JsonAdapter<ChatAnimationEffect> JSON_ADAPTER = new ObjectJsonAdapter<ChatAnimationEffect>() { // from class: com.p1.mobile.putong.core.data.ChatAnimationEffect.2
        public Class getDataClass() {
            return ChatAnimationEffect.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatAnimationEffect m11966newInstance() {
            return new ChatAnimationEffect();
        }

        public boolean parseField(ChatAnimationEffect chatAnimationEffect, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "filepath":
                    chatAnimationEffect.filepath = jsonParser.getValueAsString();
                    return true;
                case "key":
                    chatAnimationEffect.key = jsonParser.getValueAsString();
                    return true;
                case "keywords":
                    chatAnimationEffect.keywords = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChatAnimationEffect chatAnimationEffect, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "filepath":
                case "key":
                case "keywords":
                    return true;
                default:
                    return super.parseFieldCheck(chatAnimationEffect, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ChatAnimationEffect chatAnimationEffect, JsonGenerator jsonGenerator) throws IOException {
            String str = chatAnimationEffect.key;
            if (str != null) {
                jsonGenerator.writeStringField("key", str);
            }
            if (chatAnimationEffect.keywords != null) {
                jsonGenerator.writeFieldName("keywords");
                JsonAdapter.serializeArray(chatAnimationEffect.keywords, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str2 = chatAnimationEffect.filepath;
            if (str2 != null) {
                jsonGenerator.writeStringField("filepath", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatAnimationEffect) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatAnimationEffect) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m52a(String str) {
        return str;
    }

    public static ChatAnimationEffect new_() {
        ChatAnimationEffect chatAnimationEffect = new ChatAnimationEffect();
        chatAnimationEffect.nullCheck();
        return chatAnimationEffect;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatAnimationEffect m11964clone() {
        ChatAnimationEffect chatAnimationEffect = new ChatAnimationEffect();
        chatAnimationEffect.key = this.key;
        List<String> list = this.keywords;
        if (list != null) {
            chatAnimationEffect.keywords = ValueObject.util_map(list, new w9j() { // from class: l.ct4
                public final Object call(Object obj) {
                    return ChatAnimationEffect.m52a((String) obj);
                }
            });
        }
        chatAnimationEffect.filepath = this.filepath;
        return chatAnimationEffect;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatAnimationEffect)) {
            return false;
        }
        ChatAnimationEffect chatAnimationEffect = (ChatAnimationEffect) obj;
        return ValueObject.util_equals(this.key, chatAnimationEffect.key) && ValueObject.util_equals(this.keywords, chatAnimationEffect.keywords) && ValueObject.util_equals(this.filepath, chatAnimationEffect.filepath);
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
        String str = this.key;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.keywords;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.filepath;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.key == null) {
            this.key = "";
        }
        if (this.keywords == null) {
            this.keywords = new ArrayList();
        }
        if (this.filepath == null) {
            this.filepath = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
