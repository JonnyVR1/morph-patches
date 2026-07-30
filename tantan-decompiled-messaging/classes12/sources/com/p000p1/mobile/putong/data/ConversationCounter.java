package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ConversationCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationcounter";

    @NonNull
    @ProtobufIndex(index = 1)
    public CounterConversations conversations;

    @NonNull
    @ProtobufIndex(index = 5)
    public CounterConversations groupConversations;

    @NonNull
    @ProtobufIndex(index = 4)
    public CounterMessages groupMessages;

    @NonNull
    @ProtobufIndex(index = 2)
    public CounterMessages messages;

    @ProtobufIndex(index = 3)
    public double updatedTime;
    public static ProtobufAdapter<ConversationCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationCounter>() { // from class: com.p1.mobile.putong.data.ConversationCounter.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ConversationCounter conversationCounter) {
            CounterConversations counterConversations = conversationCounter.conversations;
            int iL = counterConversations != null ? CodedOutputByteBufferNano.l(1, counterConversations, CounterConversations.PROTOBUF_ADAPTER) : 0;
            CounterMessages counterMessages = conversationCounter.messages;
            if (counterMessages != null) {
                iL += CodedOutputByteBufferNano.l(2, counterMessages, CounterMessages.PROTOBUF_ADAPTER);
            }
            int iD = iL + CodedOutputByteBufferNano.d(3, conversationCounter.updatedTime);
            CounterMessages counterMessages2 = conversationCounter.groupMessages;
            if (counterMessages2 != null) {
                iD += CodedOutputByteBufferNano.l(4, counterMessages2, CounterMessages.PROTOBUF_ADAPTER);
            }
            CounterConversations counterConversations2 = conversationCounter.groupConversations;
            if (counterConversations2 != null) {
                iD += CodedOutputByteBufferNano.l(5, counterConversations2, CounterConversations.PROTOBUF_ADAPTER);
            }
            ((MessageNano) conversationCounter).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ConversationCounter m17866parse(nb5 nb5Var) throws IOException {
            ConversationCounter conversationCounter = new ConversationCounter();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (conversationCounter.conversations == null) {
                        conversationCounter.conversations = CounterConversations.new_();
                    }
                    if (conversationCounter.messages == null) {
                        conversationCounter.messages = CounterMessages.new_();
                    }
                    if (conversationCounter.groupMessages == null) {
                        conversationCounter.groupMessages = CounterMessages.new_();
                    }
                    if (conversationCounter.groupConversations != null) {
                        break;
                    }
                    conversationCounter.groupConversations = CounterConversations.new_();
                    break;
                }
                if (iU == 10) {
                    conversationCounter.conversations = (CounterConversations) nb5Var.l(CounterConversations.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    conversationCounter.messages = (CounterMessages) nb5Var.l(CounterMessages.PROTOBUF_ADAPTER);
                } else if (iU == 25) {
                    conversationCounter.updatedTime = nb5Var.h();
                } else if (iU == 34) {
                    conversationCounter.groupMessages = (CounterMessages) nb5Var.l(CounterMessages.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 42) {
                        if (conversationCounter.conversations == null) {
                            conversationCounter.conversations = CounterConversations.new_();
                        }
                        if (conversationCounter.messages == null) {
                            conversationCounter.messages = CounterMessages.new_();
                        }
                        if (conversationCounter.groupMessages == null) {
                            conversationCounter.groupMessages = CounterMessages.new_();
                        }
                        if (conversationCounter.groupConversations != null) {
                            break;
                        }
                        conversationCounter.groupConversations = CounterConversations.new_();
                        return conversationCounter;
                    }
                    conversationCounter.groupConversations = (CounterConversations) nb5Var.l(CounterConversations.PROTOBUF_ADAPTER);
                }
            }
            return conversationCounter;
        }

        public void serialize(ConversationCounter conversationCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            CounterConversations counterConversations = conversationCounter.conversations;
            if (counterConversations != null) {
                codedOutputByteBufferNano.K(1, counterConversations, CounterConversations.PROTOBUF_ADAPTER);
            }
            CounterMessages counterMessages = conversationCounter.messages;
            if (counterMessages != null) {
                codedOutputByteBufferNano.K(2, counterMessages, CounterMessages.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.C(3, conversationCounter.updatedTime);
            CounterMessages counterMessages2 = conversationCounter.groupMessages;
            if (counterMessages2 != null) {
                codedOutputByteBufferNano.K(4, counterMessages2, CounterMessages.PROTOBUF_ADAPTER);
            }
            CounterConversations counterConversations2 = conversationCounter.groupConversations;
            if (counterConversations2 != null) {
                codedOutputByteBufferNano.K(5, counterConversations2, CounterConversations.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ConversationCounter> JSON_ADAPTER = new ObjectJsonAdapter<ConversationCounter>() { // from class: com.p1.mobile.putong.data.ConversationCounter.2
        public Class getDataClass() {
            return ConversationCounter.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ConversationCounter mo17830newInstance() {
            return new ConversationCounter();
        }

        public boolean parseField(ConversationCounter conversationCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "updatedTime":
                    conversationCounter.updatedTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "messages":
                    conversationCounter.messages = (CounterMessages) CounterMessages.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "groupConversations":
                    conversationCounter.groupConversations = (CounterConversations) CounterConversations.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "conversations":
                    conversationCounter.conversations = (CounterConversations) CounterConversations.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "groupMessages":
                    conversationCounter.groupMessages = (CounterMessages) CounterMessages.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ConversationCounter conversationCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "updatedTime":
                case "messages":
                case "groupConversations":
                case "conversations":
                case "groupMessages":
                    return true;
                default:
                    return super.parseFieldCheck(conversationCounter, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConversationCounter conversationCounter, JsonGenerator jsonGenerator) throws IOException {
            if (conversationCounter.conversations != null) {
                jsonGenerator.writeFieldName(SchemeKey.conversations);
                CounterConversations.JSON_ADAPTER.serialize(conversationCounter.conversations, jsonGenerator, true);
            }
            if (conversationCounter.messages != null) {
                jsonGenerator.writeFieldName("messages");
                CounterMessages.JSON_ADAPTER.serialize(conversationCounter.messages, jsonGenerator, true);
            }
            jsonGenerator.writeFieldName(LocationInvisibleField.updatedTime);
            Converter.API_TIME.serialize(Double.valueOf(conversationCounter.updatedTime), jsonGenerator, true);
            if (conversationCounter.groupMessages != null) {
                jsonGenerator.writeFieldName("groupMessages");
                CounterMessages.JSON_ADAPTER.serialize(conversationCounter.groupMessages, jsonGenerator, true);
            }
            if (conversationCounter.groupConversations != null) {
                jsonGenerator.writeFieldName("groupConversations");
                CounterConversations.JSON_ADAPTER.serialize(conversationCounter.groupConversations, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationCounter new_() {
        ConversationCounter conversationCounter = new ConversationCounter();
        conversationCounter.nullCheck();
        return conversationCounter;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ConversationCounter m17865clone() {
        ConversationCounter conversationCounter = new ConversationCounter();
        CounterConversations counterConversations = this.conversations;
        if (counterConversations != null) {
            conversationCounter.conversations = counterConversations.m17877clone();
        }
        CounterMessages counterMessages = this.messages;
        if (counterMessages != null) {
            conversationCounter.messages = counterMessages.m17895clone();
        }
        conversationCounter.updatedTime = this.updatedTime;
        CounterMessages counterMessages2 = this.groupMessages;
        if (counterMessages2 != null) {
            conversationCounter.groupMessages = counterMessages2.m17895clone();
        }
        CounterConversations counterConversations2 = this.groupConversations;
        if (counterConversations2 != null) {
            conversationCounter.groupConversations = counterConversations2.m17877clone();
        }
        return conversationCounter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationCounter)) {
            return false;
        }
        ConversationCounter conversationCounter = (ConversationCounter) obj;
        return ValueObject.util_equals(this.conversations, conversationCounter.conversations) && ValueObject.util_equals(this.messages, conversationCounter.messages) && this.updatedTime == conversationCounter.updatedTime && ValueObject.util_equals(this.groupMessages, conversationCounter.groupMessages) && ValueObject.util_equals(this.groupConversations, conversationCounter.groupConversations);
    }

    public boolean equalsIgnoreTime(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationCounter)) {
            return false;
        }
        ConversationCounter conversationCounter = (ConversationCounter) obj;
        return ValueObject.util_equals(this.conversations, conversationCounter.conversations) && ValueObject.util_equals(this.messages, conversationCounter.messages);
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
        CounterConversations counterConversations = this.conversations;
        int iHashCode = (i2 + (counterConversations != null ? counterConversations.hashCode() : 0)) * 41;
        CounterMessages counterMessages = this.messages;
        int iHashCode2 = counterMessages != null ? counterMessages.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.updatedTime);
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        CounterMessages counterMessages2 = this.groupMessages;
        int iHashCode3 = (i3 + (counterMessages2 != null ? counterMessages2.hashCode() : 0)) * 41;
        CounterConversations counterConversations2 = this.groupConversations;
        int iHashCode4 = iHashCode3 + (counterConversations2 != null ? counterConversations2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.conversations == null) {
            this.conversations = CounterConversations.new_();
        }
        if (this.messages == null) {
            this.messages = CounterMessages.new_();
        }
        if (this.groupMessages == null) {
            this.groupMessages = CounterMessages.new_();
        }
        if (this.groupConversations == null) {
            this.groupConversations = CounterConversations.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
