package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
public class ChatInterrupt extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatinterrupt";

    @NonNull
    @ProtobufIndex(index = 1)
    public ChatInterruptStage stage;
    public static ProtobufAdapter<ChatInterrupt> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatInterrupt>() { // from class: com.p1.mobile.putong.core.data.ChatInterrupt.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatInterrupt chatInterrupt) {
            ChatInterruptStage chatInterruptStage = chatInterrupt.stage;
            int iM17281h = chatInterruptStage != null ? CodedOutputByteBufferNano.m17281h(1, chatInterruptStage.ordinal()) : 0;
            ChatInterruptStage chatInterruptStage2 = chatInterrupt.stage;
            if (chatInterruptStage2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(2, chatInterruptStage2, ChatInterruptStage.PROTOBUF_ADAPTER);
            }
            chatInterrupt.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatInterrupt parse(nc5 nc5Var) throws IOException {
            ChatInterrupt chatInterrupt = new ChatInterrupt();
            Integer numValueOf = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (chatInterrupt.stage == null && numValueOf != null) {
                        chatInterrupt.stage = (ChatInterruptStage) ChatInterruptStage.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (chatInterrupt.stage != null) {
                        break;
                    }
                    chatInterrupt.stage = (ChatInterruptStage) ChatInterruptStage.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM162497u == 8) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else {
                    if (iM162497u != 18) {
                        if (chatInterrupt.stage == null && numValueOf != null) {
                            chatInterrupt.stage = (ChatInterruptStage) ChatInterruptStage.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (chatInterrupt.stage != null) {
                            break;
                        }
                        chatInterrupt.stage = (ChatInterruptStage) ChatInterruptStage.JSON_ADAPTER.defaultEnum();
                        return chatInterrupt;
                    }
                    chatInterrupt.stage = (ChatInterruptStage) nc5Var.m162488l(ChatInterruptStage.PROTOBUF_ADAPTER);
                }
            }
            return chatInterrupt;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatInterrupt chatInterrupt, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ChatInterruptStage chatInterruptStage = chatInterrupt.stage;
            if (chatInterruptStage != null) {
                codedOutputByteBufferNano.m17305G(1, chatInterruptStage.ordinal());
            }
            ChatInterruptStage chatInterruptStage2 = chatInterrupt.stage;
            if (chatInterruptStage2 != null) {
                codedOutputByteBufferNano.m17309K(2, chatInterruptStage2, ChatInterruptStage.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ChatInterrupt> JSON_ADAPTER = new ObjectJsonAdapter<ChatInterrupt>() { // from class: com.p1.mobile.putong.core.data.ChatInterrupt.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatInterrupt.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatInterrupt newInstance() {
            return new ChatInterrupt();
        }

        public boolean parseField(ChatInterrupt chatInterrupt, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("stage")) {
                return false;
            }
            chatInterrupt.stage = ChatInterruptStage.JSON_ADAPTER.parse(jsonParser, str2);
            return true;
        }

        public boolean parseFieldCheck(ChatInterrupt chatInterrupt, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("stage")) {
                return true;
            }
            return super.parseFieldCheck(chatInterrupt, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatInterrupt chatInterrupt, JsonGenerator jsonGenerator) throws IOException {
            if (chatInterrupt.stage != null) {
                jsonGenerator.writeFieldName("stage");
                ChatInterruptStage.JSON_ADAPTER.serialize(chatInterrupt.stage, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatInterrupt) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatInterrupt) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatInterrupt new_() {
        ChatInterrupt chatInterrupt = new ChatInterrupt();
        chatInterrupt.nullCheck();
        return chatInterrupt;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatInterrupt mo225055clone() {
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
        ChatInterruptStage chatInterruptStage = this.stage;
        int iHashCode = i2 + (chatInterruptStage != null ? chatInterruptStage.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.stage == null) {
            this.stage = (ChatInterruptStage) ChatInterruptStage.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
