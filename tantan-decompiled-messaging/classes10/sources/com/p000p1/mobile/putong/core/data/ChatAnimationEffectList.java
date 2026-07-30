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
public class ChatAnimationEffectList extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatanimationeffectlist";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<ChatAnimationEffect> data;
    public static ProtobufAdapter<ChatAnimationEffectList> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatAnimationEffectList>() { // from class: com.p1.mobile.putong.core.data.ChatAnimationEffectList.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatAnimationEffectList chatAnimationEffectList) {
            List<ChatAnimationEffect> list = chatAnimationEffectList.data;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ChatAnimationEffect.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) chatAnimationEffectList).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatAnimationEffectList m11969parse(nb5 nb5Var) throws IOException {
            ChatAnimationEffectList chatAnimationEffectList = new ChatAnimationEffectList();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (chatAnimationEffectList.data != null) {
                        break;
                    }
                    chatAnimationEffectList.data = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (chatAnimationEffectList.data != null) {
                        break;
                    }
                    chatAnimationEffectList.data = new ArrayList();
                    return chatAnimationEffectList;
                }
                chatAnimationEffectList.data = (List) nb5Var.l(ChatAnimationEffect.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return chatAnimationEffectList;
        }

        public void serialize(ChatAnimationEffectList chatAnimationEffectList, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<ChatAnimationEffect> list = chatAnimationEffectList.data;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ChatAnimationEffect.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ChatAnimationEffectList> JSON_ADAPTER = new ObjectJsonAdapter<ChatAnimationEffectList>() { // from class: com.p1.mobile.putong.core.data.ChatAnimationEffectList.2
        public Class getDataClass() {
            return ChatAnimationEffectList.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatAnimationEffectList m11970newInstance() {
            return new ChatAnimationEffectList();
        }

        public boolean parseField(ChatAnimationEffectList chatAnimationEffectList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("data")) {
                return false;
            }
            chatAnimationEffectList.data = JsonAdapter.parseArray(jsonParser, ChatAnimationEffect.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ChatAnimationEffectList chatAnimationEffectList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data")) {
                return true;
            }
            return super.parseFieldCheck(chatAnimationEffectList, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ChatAnimationEffectList chatAnimationEffectList, JsonGenerator jsonGenerator) throws IOException {
            if (chatAnimationEffectList.data != null) {
                jsonGenerator.writeFieldName("data");
                JsonAdapter.serializeArray(chatAnimationEffectList.data, jsonGenerator, ChatAnimationEffect.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatAnimationEffectList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatAnimationEffectList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatAnimationEffectList new_() {
        ChatAnimationEffectList chatAnimationEffectList = new ChatAnimationEffectList();
        chatAnimationEffectList.nullCheck();
        return chatAnimationEffectList;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatAnimationEffectList m11968clone() {
        ChatAnimationEffectList chatAnimationEffectList = new ChatAnimationEffectList();
        List<ChatAnimationEffect> list = this.data;
        if (list != null) {
            chatAnimationEffectList.data = ValueObject.util_map(list, new w9j() { // from class: l.dt4
                public final Object call(Object obj) {
                    return ((ChatAnimationEffect) obj).m11964clone();
                }
            });
        }
        return chatAnimationEffectList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ChatAnimationEffectList) {
            return ValueObject.util_equals(this.data, ((ChatAnimationEffectList) obj).data);
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
        List<ChatAnimationEffect> list = this.data;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.data == null) {
            this.data = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
