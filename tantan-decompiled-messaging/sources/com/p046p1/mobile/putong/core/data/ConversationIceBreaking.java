package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class ConversationIceBreaking extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationicebreaking";

    @NonNull
    @ProtobufIndex(index = 1)
    public String answeredMsgId;
    public static ProtobufAdapter<ConversationIceBreaking> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationIceBreaking>() { // from class: com.p1.mobile.putong.core.data.ConversationIceBreaking.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConversationIceBreaking conversationIceBreaking) {
            String str = conversationIceBreaking.answeredMsgId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            conversationIceBreaking.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConversationIceBreaking parse(nb5 nb5Var) throws IOException {
            ConversationIceBreaking conversationIceBreaking = new ConversationIceBreaking();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (conversationIceBreaking.answeredMsgId != null) {
                        break;
                    }
                    conversationIceBreaking.answeredMsgId = "";
                    break;
                }
                if (iM158752u != 10) {
                    if (conversationIceBreaking.answeredMsgId != null) {
                        break;
                    }
                    conversationIceBreaking.answeredMsgId = "";
                    return conversationIceBreaking;
                }
                conversationIceBreaking.answeredMsgId = nb5Var.m158750s();
            }
            return conversationIceBreaking;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConversationIceBreaking conversationIceBreaking, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = conversationIceBreaking.answeredMsgId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
        }
    };
    public static JsonAdapter<ConversationIceBreaking> JSON_ADAPTER = new ObjectJsonAdapter<ConversationIceBreaking>() { // from class: com.p1.mobile.putong.core.data.ConversationIceBreaking.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConversationIceBreaking.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConversationIceBreaking newInstance() {
            return new ConversationIceBreaking();
        }

        public boolean parseField(ConversationIceBreaking conversationIceBreaking, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("answeredMsgId")) {
                return false;
            }
            conversationIceBreaking.answeredMsgId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(ConversationIceBreaking conversationIceBreaking, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("answeredMsgId")) {
                return true;
            }
            return super.parseFieldCheck(conversationIceBreaking, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConversationIceBreaking conversationIceBreaking, JsonGenerator jsonGenerator) throws IOException {
            String str = conversationIceBreaking.answeredMsgId;
            if (str != null) {
                jsonGenerator.writeStringField("answeredMsgId", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationIceBreaking) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationIceBreaking) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationIceBreaking new_() {
        ConversationIceBreaking conversationIceBreaking = new ConversationIceBreaking();
        conversationIceBreaking.nullCheck();
        return conversationIceBreaking;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConversationIceBreaking mo223809clone() {
        ConversationIceBreaking conversationIceBreaking = new ConversationIceBreaking();
        conversationIceBreaking.answeredMsgId = this.answeredMsgId;
        return conversationIceBreaking;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConversationIceBreaking) {
            return ValueObject.util_equals(this.answeredMsgId, ((ConversationIceBreaking) obj).answeredMsgId);
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
        String str = this.answeredMsgId;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.answeredMsgId == null) {
            this.answeredMsgId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
