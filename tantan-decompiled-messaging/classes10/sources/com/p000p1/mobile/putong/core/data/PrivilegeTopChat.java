package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.User;
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
public class PrivilegeTopChat extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "privilegetopchat";

    @NonNull
    @ProtobufIndex(index = 1)
    public Conversation conversation;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean isClicked;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public User user;
    public static ProtobufAdapter<PrivilegeTopChat> PROTOBUF_ADAPTER = new MessageNanoAdapter<PrivilegeTopChat>() { // from class: com.p1.mobile.putong.core.data.PrivilegeTopChat.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PrivilegeTopChat privilegeTopChat) {
            Conversation conversation = privilegeTopChat.conversation;
            int iL = conversation != null ? CodedOutputByteBufferNano.l(1, conversation, Conversation.PROTOBUF_ADAPTER) : 0;
            User user = privilegeTopChat.user;
            if (user != null) {
                iL += CodedOutputByteBufferNano.l(2, user, User.PROTOBUF_ADAPTER);
            }
            int iB = iL + CodedOutputByteBufferNano.b(3, privilegeTopChat.isClicked);
            ((MessageNano) privilegeTopChat).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PrivilegeTopChat m14897parse(nb5 nb5Var) throws IOException {
            PrivilegeTopChat privilegeTopChat = new PrivilegeTopChat();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (privilegeTopChat.conversation == null) {
                        privilegeTopChat.conversation = Conversation.new_();
                    }
                    if (privilegeTopChat.user != null) {
                        break;
                    }
                    privilegeTopChat.user = User.new_();
                    break;
                }
                if (iU == 10) {
                    privilegeTopChat.conversation = (Conversation) nb5Var.l(Conversation.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    privilegeTopChat.user = (User) nb5Var.l(User.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 24) {
                        if (privilegeTopChat.conversation == null) {
                            privilegeTopChat.conversation = Conversation.new_();
                        }
                        if (privilegeTopChat.user != null) {
                            break;
                        }
                        privilegeTopChat.user = User.new_();
                        return privilegeTopChat;
                    }
                    privilegeTopChat.isClicked = nb5Var.g();
                }
            }
            return privilegeTopChat;
        }

        public void serialize(PrivilegeTopChat privilegeTopChat, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Conversation conversation = privilegeTopChat.conversation;
            if (conversation != null) {
                codedOutputByteBufferNano.K(1, conversation, Conversation.PROTOBUF_ADAPTER);
            }
            User user = privilegeTopChat.user;
            if (user != null) {
                codedOutputByteBufferNano.K(2, user, User.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(3, privilegeTopChat.isClicked);
        }
    };
    public static JsonAdapter<PrivilegeTopChat> JSON_ADAPTER = new ObjectJsonAdapter<PrivilegeTopChat>() { // from class: com.p1.mobile.putong.core.data.PrivilegeTopChat.2
        public Class getDataClass() {
            return PrivilegeTopChat.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PrivilegeTopChat m14898newInstance() {
            return new PrivilegeTopChat();
        }

        public boolean parseField(PrivilegeTopChat privilegeTopChat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "user":
                    privilegeTopChat.user = (User) User.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "isClicked":
                    privilegeTopChat.isClicked = jsonParser.getValueAsBoolean();
                    return true;
                case "conversation":
                    privilegeTopChat.conversation = (Conversation) Conversation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public void serializeFields(PrivilegeTopChat privilegeTopChat, JsonGenerator jsonGenerator) throws IOException {
            if (privilegeTopChat.conversation != null) {
                jsonGenerator.writeFieldName(Conversation.TYPE);
                Conversation.JSON_ADAPTER.serialize(privilegeTopChat.conversation, jsonGenerator, true);
            }
            if (privilegeTopChat.user != null) {
                jsonGenerator.writeFieldName("user");
                User.JSON_ADAPTER.serialize(privilegeTopChat.user, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("isClicked", privilegeTopChat.isClicked);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PrivilegeTopChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PrivilegeTopChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PrivilegeTopChat new_() {
        PrivilegeTopChat privilegeTopChat = new PrivilegeTopChat();
        privilegeTopChat.nullCheck();
        return privilegeTopChat;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PrivilegeTopChat m14896clone() {
        PrivilegeTopChat privilegeTopChat = new PrivilegeTopChat();
        Conversation conversation = this.conversation;
        if (conversation != null) {
            privilegeTopChat.conversation = conversation.m12312clone();
        }
        User user = this.user;
        if (user != null) {
            privilegeTopChat.user = user.clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        Conversation conversation = this.conversation;
        int iHashCode = (i2 + (conversation != null ? conversation.hashCode() : 0)) * 41;
        User user = this.user;
        int iHashCode2 = ((iHashCode + (user != null ? user.hashCode() : 0)) * 41) + (this.isClicked ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.conversation == null) {
            this.conversation = Conversation.new_();
        }
        if (this.user == null) {
            this.user = User.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
