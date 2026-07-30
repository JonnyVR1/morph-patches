package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.User;
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
public class PrivilegeTopChat extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "privilegetopchat";

    @NonNull
    @ProtobufIndex(index = 1)
    public Conversation conversation;

    @ProtobufIndex(index = 3)
    public boolean isClicked;

    @NonNull
    @ProtobufIndex(index = 2)
    public User user;
    public static ProtobufAdapter<PrivilegeTopChat> PROTOBUF_ADAPTER = new MessageNanoAdapter<PrivilegeTopChat>() { // from class: com.p1.mobile.putong.core.data.PrivilegeTopChat.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PrivilegeTopChat privilegeTopChat) {
            Conversation conversation = privilegeTopChat.conversation;
            int iM17285l = conversation != null ? CodedOutputByteBufferNano.m17285l(1, conversation, Conversation.PROTOBUF_ADAPTER) : 0;
            User user = privilegeTopChat.user;
            if (user != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, user, User.PROTOBUF_ADAPTER);
            }
            int iM17275b = iM17285l + CodedOutputByteBufferNano.m17275b(3, privilegeTopChat.isClicked);
            privilegeTopChat.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PrivilegeTopChat parse(nc5 nc5Var) throws IOException {
            PrivilegeTopChat privilegeTopChat = new PrivilegeTopChat();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (privilegeTopChat.conversation == null) {
                        privilegeTopChat.conversation = Conversation.new_();
                    }
                    if (privilegeTopChat.user != null) {
                        break;
                    }
                    privilegeTopChat.user = User.new_();
                    break;
                }
                if (iM162497u == 10) {
                    privilegeTopChat.conversation = (Conversation) nc5Var.m162488l(Conversation.PROTOBUF_ADAPTER);
                } else if (iM162497u == 18) {
                    privilegeTopChat.user = (User) nc5Var.m162488l(User.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 24) {
                        if (privilegeTopChat.conversation == null) {
                            privilegeTopChat.conversation = Conversation.new_();
                        }
                        if (privilegeTopChat.user != null) {
                            break;
                        }
                        privilegeTopChat.user = User.new_();
                        return privilegeTopChat;
                    }
                    privilegeTopChat.isClicked = nc5Var.m162483g();
                }
            }
            return privilegeTopChat;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PrivilegeTopChat privilegeTopChat, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Conversation conversation = privilegeTopChat.conversation;
            if (conversation != null) {
                codedOutputByteBufferNano.m17309K(1, conversation, Conversation.PROTOBUF_ADAPTER);
            }
            User user = privilegeTopChat.user;
            if (user != null) {
                codedOutputByteBufferNano.m17309K(2, user, User.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(3, privilegeTopChat.isClicked);
        }
    };
    public static JsonAdapter<PrivilegeTopChat> JSON_ADAPTER = new ObjectJsonAdapter<PrivilegeTopChat>() { // from class: com.p1.mobile.putong.core.data.PrivilegeTopChat.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PrivilegeTopChat.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PrivilegeTopChat newInstance() {
            return new PrivilegeTopChat();
        }

        public boolean parseField(PrivilegeTopChat privilegeTopChat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "user":
                    privilegeTopChat.user = User.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "isClicked":
                    privilegeTopChat.isClicked = jsonParser.getValueAsBoolean();
                    return true;
                case "conversation":
                    privilegeTopChat.conversation = Conversation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PrivilegeTopChat privilegeTopChat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "user":
                case "isClicked":
                case "conversation":
                    return true;
                default:
                    return super.parseFieldCheck(privilegeTopChat, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PrivilegeTopChat privilegeTopChat, JsonGenerator jsonGenerator) throws IOException {
            if (privilegeTopChat.conversation != null) {
                jsonGenerator.writeFieldName("conversation");
                Conversation.JSON_ADAPTER.serialize(privilegeTopChat.conversation, jsonGenerator, true);
            }
            if (privilegeTopChat.user != null) {
                jsonGenerator.writeFieldName("user");
                User.JSON_ADAPTER.serialize(privilegeTopChat.user, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("isClicked", privilegeTopChat.isClicked);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PrivilegeTopChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PrivilegeTopChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PrivilegeTopChat new_() {
        PrivilegeTopChat privilegeTopChat = new PrivilegeTopChat();
        privilegeTopChat.nullCheck();
        return privilegeTopChat;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PrivilegeTopChat mo225055clone() {
        PrivilegeTopChat privilegeTopChat = new PrivilegeTopChat();
        Conversation conversation = this.conversation;
        if (conversation != null) {
            privilegeTopChat.conversation = conversation.mo225055clone();
        }
        User user = this.user;
        if (user != null) {
            privilegeTopChat.user = user.mo225055clone();
        }
        privilegeTopChat.isClicked = this.isClicked;
        return privilegeTopChat;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrivilegeTopChat)) {
            return false;
        }
        PrivilegeTopChat privilegeTopChat = (PrivilegeTopChat) obj;
        return ValueObject.util_equals(this.conversation, privilegeTopChat.conversation) && ValueObject.util_equals(this.user, privilegeTopChat.user) && this.isClicked == privilegeTopChat.isClicked;
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
        Conversation conversation = this.conversation;
        int iHashCode = (i2 + (conversation != null ? conversation.hashCode() : 0)) * 41;
        User user = this.user;
        int iHashCode2 = ((iHashCode + (user != null ? user.hashCode() : 0)) * 41) + (this.isClicked ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.conversation == null) {
            this.conversation = Conversation.new_();
        }
        if (this.user == null) {
            this.user = User.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
