package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class ChatInterrupt extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatinterrupt";

    @NonNull
    @ProtobufIndex(index = 1)
    public ChatInterruptStage stage;
    public static ProtobufAdapter<ChatInterrupt> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatInterrupt>() { // from class: com.p1.mobile.putong.core.data.ChatInterrupt.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatInterrupt chatInterrupt) {
            ChatInterruptStage chatInterruptStage = chatInterrupt.stage;
            int iH = chatInterruptStage != null ? CodedOutputByteBufferNano.h(1, chatInterruptStage.ordinal()) : 0;
            ChatInterruptStage chatInterruptStage2 = chatInterrupt.stage;
            if (chatInterruptStage2 != null) {
                iH += CodedOutputByteBufferNano.l(2, chatInterruptStage2, ChatInterruptStage.PROTOBUF_ADAPTER);
            }
            ((MessageNano) chatInterrupt).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatInterrupt m12063parse(nb5 nb5Var) throws IOException {
            ChatInterrupt chatInterrupt = new ChatInterrupt();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (chatInterrupt.stage == null && numValueOf != null) {
                        chatInterrupt.stage = (ChatInterruptStage) ChatInterruptStage.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                    }
                    if (chatInterrupt.stage != null) {
                        break;
                    }
                    chatInterrupt.stage = (ChatInterruptStage) ChatInterruptStage.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 8) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else {
                    if (iU != 18) {
                        if (chatInterrupt.stage == null && numValueOf != null) {
                            chatInterrupt.stage = (ChatInterruptStage) ChatInterruptStage.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (chatInterrupt.stage != null) {
                            break;
                        }
                        chatInterrupt.stage = (ChatInterruptStage) ChatInterruptStage.JSON_ADAPTER.defaultEnum();
                        return chatInterrupt;
                    }
                    chatInterrupt.stage = (ChatInterruptStage) nb5Var.l(ChatInterruptStage.PROTOBUF_ADAPTER);
                }
            }
            return chatInterrupt;
        }

        public void serialize(ChatInterrupt chatInterrupt, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ChatInterruptStage chatInterruptStage = chatInterrupt.stage;
            if (chatInterruptStage != null) {
                codedOutputByteBufferNano.G(1, chatInterruptStage.ordinal());
            }
            ChatInterruptStage chatInterruptStage2 = chatInterrupt.stage;
            if (chatInterruptStage2 != null) {
                codedOutputByteBufferNano.K(2, chatInterruptStage2, ChatInterruptStage.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ChatInterrupt> JSON_ADAPTER = new ObjectJsonAdapter<ChatInterrupt>() { // from class: com.p1.mobile.putong.core.data.ChatInterrupt.2
        public Class getDataClass() {
            return ChatInterrupt.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatInterrupt m12064newInstance() {
            return new ChatInterrupt();
        }

        public boolean parseField(ChatInterrupt chatInterrupt, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("stage")) {
                return false;
            }
            chatInterrupt.stage = (ChatInterruptStage) ChatInterruptStage.JSON_ADAPTER.parse(jsonParser, str2);
            return true;
        }

        public boolean parseFieldCheck(ChatInterrupt chatInterrupt, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("stage")) {
                return true;
            }
            return super.parseFieldCheck(chatInterrupt, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ChatInterrupt chatInterrupt, JsonGenerator jsonGenerator) throws IOException {
            if (chatInterrupt.stage != null) {
                jsonGenerator.writeFieldName("stage");
                ChatInterruptStage.JSON_ADAPTER.serialize(chatInterrupt.stage, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatInterrupt) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatInterrupt) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatInterrupt new_() {
        ChatInterrupt chatInterrupt = new ChatInterrupt();
        chatInterrupt.nullCheck();
        return chatInterrupt;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatInterrupt m12062clone() {
        ChatInterrupt chatInterrupt = new ChatInterrupt();
        chatInterrupt.stage = this.stage;
        return chatInterrupt;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ChatInterrupt) {
            return ValueObject.util_equals(this.stage, ((ChatInterrupt) obj).stage);
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
        ChatInterruptStage chatInterruptStage = this.stage;
        int iHashCode = i2 + (chatInterruptStage != null ? chatInterruptStage.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.stage == null) {
            this.stage = (ChatInterruptStage) ChatInterruptStage.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
