package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.User;
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
public class ChatNewMatchData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatnewmatchdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<User> users;
    public static ProtobufAdapter<ChatNewMatchData> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatNewMatchData>() { // from class: com.p1.mobile.putong.core.data.ChatNewMatchData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatNewMatchData chatNewMatchData) {
            List<User> list = chatNewMatchData.users;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, User.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            chatNewMatchData.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatNewMatchData parse(nb5 nb5Var) throws IOException {
            ChatNewMatchData chatNewMatchData = new ChatNewMatchData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (chatNewMatchData.users != null) {
                        break;
                    }
                    chatNewMatchData.users = new ArrayList();
                    break;
                }
                if (iM158752u != 10) {
                    if (chatNewMatchData.users != null) {
                        break;
                    }
                    chatNewMatchData.users = new ArrayList();
                    return chatNewMatchData;
                }
                chatNewMatchData.users = (List) nb5Var.m158743l(User.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return chatNewMatchData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatNewMatchData chatNewMatchData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<User> list = chatNewMatchData.users;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, User.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ChatNewMatchData> JSON_ADAPTER = new ObjectJsonAdapter<ChatNewMatchData>() { // from class: com.p1.mobile.putong.core.data.ChatNewMatchData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatNewMatchData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatNewMatchData newInstance() {
            return new ChatNewMatchData();
        }

        public boolean parseField(ChatNewMatchData chatNewMatchData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("users")) {
                return false;
            }
            chatNewMatchData.users = JsonAdapter.parseArray(jsonParser, User.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ChatNewMatchData chatNewMatchData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("users")) {
                return true;
            }
            return super.parseFieldCheck(chatNewMatchData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatNewMatchData chatNewMatchData, JsonGenerator jsonGenerator) throws IOException {
            if (chatNewMatchData.users != null) {
                jsonGenerator.writeFieldName("users");
                JsonAdapter.serializeArray(chatNewMatchData.users, jsonGenerator, User.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatNewMatchData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatNewMatchData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatNewMatchData new_() {
        ChatNewMatchData chatNewMatchData = new ChatNewMatchData();
        chatNewMatchData.nullCheck();
        return chatNewMatchData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatNewMatchData mo223809clone() {
        ChatNewMatchData chatNewMatchData = new ChatNewMatchData();
        List<User> list = this.users;
        if (list != null) {
            chatNewMatchData.users = ValueObject.util_map(list, new w9j() { // from class: l.hz4
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((User) obj).mo223809clone();
                }
            });
        }
        return chatNewMatchData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ChatNewMatchData) {
            return ValueObject.util_equals(this.users, ((ChatNewMatchData) obj).users);
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
        List<User> list = this.users;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.users == null) {
            this.users = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
