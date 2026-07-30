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
public class ConversationIceBreaking extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationicebreaking";

    @NonNull
    @ProtobufIndex(index = 1)
    public String answeredMsgId;
    public static ProtobufAdapter<ConversationIceBreaking> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationIceBreaking>() { // from class: com.p1.mobile.putong.core.data.ConversationIceBreaking.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ConversationIceBreaking conversationIceBreaking) {
            String str = conversationIceBreaking.answeredMsgId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) conversationIceBreaking).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ConversationIceBreaking m12373parse(nb5 nb5Var) throws IOException {
            ConversationIceBreaking conversationIceBreaking = new ConversationIceBreaking();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (conversationIceBreaking.answeredMsgId != null) {
                        break;
                    }
                    conversationIceBreaking.answeredMsgId = "";
                    break;
                }
                if (iU != 10) {
                    if (conversationIceBreaking.answeredMsgId != null) {
                        break;
                    }
                    conversationIceBreaking.answeredMsgId = "";
                    return conversationIceBreaking;
                }
                conversationIceBreaking.answeredMsgId = nb5Var.s();
            }
            return conversationIceBreaking;
        }

        public void serialize(ConversationIceBreaking conversationIceBreaking, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = conversationIceBreaking.answeredMsgId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<ConversationIceBreaking> JSON_ADAPTER = new ObjectJsonAdapter<ConversationIceBreaking>() { // from class: com.p1.mobile.putong.core.data.ConversationIceBreaking.2
        public Class getDataClass() {
            return ConversationIceBreaking.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ConversationIceBreaking m12374newInstance() {
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

        public void serializeFields(ConversationIceBreaking conversationIceBreaking, JsonGenerator jsonGenerator) throws IOException {
            String str = conversationIceBreaking.answeredMsgId;
            if (str != null) {
                jsonGenerator.writeStringField("answeredMsgId", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationIceBreaking) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationIceBreaking) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationIceBreaking new_() {
        ConversationIceBreaking conversationIceBreaking = new ConversationIceBreaking();
        conversationIceBreaking.nullCheck();
        return conversationIceBreaking;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ConversationIceBreaking m12372clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.answeredMsgId;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.answeredMsgId == null) {
            this.answeredMsgId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
