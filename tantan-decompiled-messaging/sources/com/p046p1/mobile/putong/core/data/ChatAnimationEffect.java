package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.ChatAnimationEffect;
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
public class ChatAnimationEffect extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatanimationeffect";

    @NonNull
    @ProtobufIndex(index = 3)
    public String filepath;

    @NonNull
    @ProtobufIndex(index = 1)
    public String key;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> keywords;
    public static ProtobufAdapter<ChatAnimationEffect> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatAnimationEffect>() { // from class: com.p1.mobile.putong.core.data.ChatAnimationEffect.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatAnimationEffect chatAnimationEffect) {
            String str = chatAnimationEffect.key;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            List<String> list = chatAnimationEffect.keywords;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = chatAnimationEffect.filepath;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            chatAnimationEffect.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatAnimationEffect parse(nb5 nb5Var) throws IOException {
            ChatAnimationEffect chatAnimationEffect = new ChatAnimationEffect();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    chatAnimationEffect.key = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    chatAnimationEffect.keywords = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 26) {
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
                    chatAnimationEffect.filepath = nb5Var.m158750s();
                }
            }
            return chatAnimationEffect;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatAnimationEffect chatAnimationEffect, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = chatAnimationEffect.key;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            List<String> list = chatAnimationEffect.keywords;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = chatAnimationEffect.filepath;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
        }
    };
    public static JsonAdapter<ChatAnimationEffect> JSON_ADAPTER = new ObjectJsonAdapter<ChatAnimationEffect>() { // from class: com.p1.mobile.putong.core.data.ChatAnimationEffect.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatAnimationEffect.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatAnimationEffect newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatAnimationEffect chatAnimationEffect, JsonGenerator jsonGenerator) throws IOException {
            String str = chatAnimationEffect.key;
            if (str != null) {
                jsonGenerator.writeStringField(Constants.KEY_KEY, str);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatAnimationEffect) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatAnimationEffect) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35250a(String str) {
        return str;
    }

    public static ChatAnimationEffect new_() {
        ChatAnimationEffect chatAnimationEffect = new ChatAnimationEffect();
        chatAnimationEffect.nullCheck();
        return chatAnimationEffect;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatAnimationEffect mo223809clone() {
        ChatAnimationEffect chatAnimationEffect = new ChatAnimationEffect();
        chatAnimationEffect.key = this.key;
        List<String> list = this.keywords;
        if (list != null) {
            chatAnimationEffect.keywords = ValueObject.util_map(list, new w9j() { // from class: l.ct4
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ChatAnimationEffect.m35250a((String) obj);
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
        String str = this.key;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.keywords;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.filepath;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
