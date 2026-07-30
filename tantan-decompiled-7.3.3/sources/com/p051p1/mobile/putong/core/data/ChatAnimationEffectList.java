package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.ChatAnimationEffect;
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
public class ChatAnimationEffectList extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatanimationeffectlist";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<ChatAnimationEffect> data;
    public static ProtobufAdapter<ChatAnimationEffectList> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatAnimationEffectList>() { // from class: com.p1.mobile.putong.core.data.ChatAnimationEffectList.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatAnimationEffectList chatAnimationEffectList) {
            List<ChatAnimationEffect> list = chatAnimationEffectList.data;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ChatAnimationEffect.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            chatAnimationEffectList.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatAnimationEffectList parse(nc5 nc5Var) throws IOException {
            ChatAnimationEffectList chatAnimationEffectList = new ChatAnimationEffectList();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (chatAnimationEffectList.data != null) {
                        break;
                    }
                    chatAnimationEffectList.data = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (chatAnimationEffectList.data != null) {
                        break;
                    }
                    chatAnimationEffectList.data = new ArrayList();
                    return chatAnimationEffectList;
                }
                chatAnimationEffectList.data = (List) nc5Var.m162488l(ChatAnimationEffect.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return chatAnimationEffectList;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatAnimationEffectList chatAnimationEffectList, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<ChatAnimationEffect> list = chatAnimationEffectList.data;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ChatAnimationEffect.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ChatAnimationEffectList> JSON_ADAPTER = new ObjectJsonAdapter<ChatAnimationEffectList>() { // from class: com.p1.mobile.putong.core.data.ChatAnimationEffectList.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatAnimationEffectList.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatAnimationEffectList newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatAnimationEffectList chatAnimationEffectList, JsonGenerator jsonGenerator) throws IOException {
            if (chatAnimationEffectList.data != null) {
                jsonGenerator.writeFieldName("data");
                JsonAdapter.serializeArray(chatAnimationEffectList.data, jsonGenerator, ChatAnimationEffect.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatAnimationEffectList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatAnimationEffectList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatAnimationEffectList new_() {
        ChatAnimationEffectList chatAnimationEffectList = new ChatAnimationEffectList();
        chatAnimationEffectList.nullCheck();
        return chatAnimationEffectList;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatAnimationEffectList mo225055clone() {
        ChatAnimationEffectList chatAnimationEffectList = new ChatAnimationEffectList();
        List<ChatAnimationEffect> list = this.data;
        if (list != null) {
            chatAnimationEffectList.data = ValueObject.util_map(list, new qcj() { // from class: l.cu4
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((ChatAnimationEffect) obj).mo225055clone();
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
        List<ChatAnimationEffect> list = this.data;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.data == null) {
            this.data = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
