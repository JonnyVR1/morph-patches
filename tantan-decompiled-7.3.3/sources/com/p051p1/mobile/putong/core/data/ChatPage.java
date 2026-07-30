package com.p051p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.ChatPage;
import com.p051p1.mobile.putong.data.Converter;
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
public class ChatPage extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatpage";

    @Nullable
    @ProtobufIndex(index = 1)
    public List<String> landPriorities;

    @ProtobufIndex(index = 2)
    public double lastEnterNewMatchPageTime;
    public static ProtobufAdapter<ChatPage> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatPage>() { // from class: com.p1.mobile.putong.core.data.ChatPage.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatPage chatPage) {
            List<String> list = chatPage.landPriorities;
            int iM17285l = (list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.m17277d(2, chatPage.lastEnterNewMatchPageTime);
            chatPage.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatPage parse(nc5 nc5Var) throws IOException {
            ChatPage chatPage = new ChatPage();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 10) {
                    chatPage.landPriorities = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 17) {
                        return chatPage;
                    }
                    chatPage.lastEnterNewMatchPageTime = nc5Var.m162484h();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatPage chatPage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = chatPage.landPriorities;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17301C(2, chatPage.lastEnterNewMatchPageTime);
        }
    };
    public static JsonAdapter<ChatPage> JSON_ADAPTER = new ObjectJsonAdapter<ChatPage>() { // from class: com.p1.mobile.putong.core.data.ChatPage.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatPage.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatPage newInstance() {
            return new ChatPage();
        }

        public boolean parseField(ChatPage chatPage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("landPriorities")) {
                chatPage.landPriorities = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("lastEnterNewMatchPageTime")) {
                return false;
            }
            chatPage.lastEnterNewMatchPageTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
            return true;
        }

        public boolean parseFieldCheck(ChatPage chatPage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("landPriorities") || str.equals("lastEnterNewMatchPageTime")) {
                return true;
            }
            return super.parseFieldCheck(chatPage, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatPage chatPage, JsonGenerator jsonGenerator) throws IOException {
            if (chatPage.landPriorities != null) {
                jsonGenerator.writeFieldName("landPriorities");
                JsonAdapter.serializeArray(chatPage.landPriorities, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeFieldName("lastEnterNewMatchPageTime");
            Converter.API_TIME.serialize(Double.valueOf(chatPage.lastEnterNewMatchPageTime), jsonGenerator, true);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatPage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatPage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36272a(String str) {
        return str;
    }

    public static ChatPage new_() {
        ChatPage chatPage = new ChatPage();
        chatPage.nullCheck();
        return chatPage;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatPage mo225055clone() {
        ChatPage chatPage = new ChatPage();
        List<String> list = this.landPriorities;
        if (list != null) {
            chatPage.landPriorities = ValueObject.util_map(list, new qcj() { // from class: l.n05
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ChatPage.m36272a((String) obj);
                }
            });
        }
        chatPage.lastEnterNewMatchPageTime = this.lastEnterNewMatchPageTime;
        return chatPage;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatPage)) {
            return false;
        }
        ChatPage chatPage = (ChatPage) obj;
        return ValueObject.util_equals(this.landPriorities, chatPage.landPriorities) && this.lastEnterNewMatchPageTime == chatPage.lastEnterNewMatchPageTime;
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
        List<String> list = this.landPriorities;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        long jDoubleToLongBits = Double.doubleToLongBits(this.lastEnterNewMatchPageTime);
        int i3 = (iHashCode * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
