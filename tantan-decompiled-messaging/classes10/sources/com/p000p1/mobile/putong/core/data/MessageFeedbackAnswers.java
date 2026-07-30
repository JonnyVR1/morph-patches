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
public class MessageFeedbackAnswers extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagefeedbackanswers";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f106id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String value;
    public static ProtobufAdapter<MessageFeedbackAnswers> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageFeedbackAnswers>() { // from class: com.p1.mobile.putong.core.data.MessageFeedbackAnswers.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MessageFeedbackAnswers messageFeedbackAnswers) {
            String str = messageFeedbackAnswers.f106id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = messageFeedbackAnswers.value;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) messageFeedbackAnswers).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MessageFeedbackAnswers m14193parse(nb5 nb5Var) throws IOException {
            MessageFeedbackAnswers messageFeedbackAnswers = new MessageFeedbackAnswers();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (messageFeedbackAnswers.f106id == null) {
                        messageFeedbackAnswers.f106id = "";
                    }
                    if (messageFeedbackAnswers.value != null) {
                        break;
                    }
                    messageFeedbackAnswers.value = "";
                    break;
                }
                if (iU == 10) {
                    messageFeedbackAnswers.f106id = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (messageFeedbackAnswers.f106id == null) {
                            messageFeedbackAnswers.f106id = "";
                        }
                        if (messageFeedbackAnswers.value != null) {
                            break;
                        }
                        messageFeedbackAnswers.value = "";
                        return messageFeedbackAnswers;
                    }
                    messageFeedbackAnswers.value = nb5Var.s();
                }
            }
            return messageFeedbackAnswers;
        }

        public void serialize(MessageFeedbackAnswers messageFeedbackAnswers, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageFeedbackAnswers.f106id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = messageFeedbackAnswers.value;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<MessageFeedbackAnswers> JSON_ADAPTER = new ObjectJsonAdapter<MessageFeedbackAnswers>() { // from class: com.p1.mobile.putong.core.data.MessageFeedbackAnswers.2
        public Class getDataClass() {
            return MessageFeedbackAnswers.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MessageFeedbackAnswers m14194newInstance() {
            return new MessageFeedbackAnswers();
        }

        public boolean parseField(MessageFeedbackAnswers messageFeedbackAnswers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                messageFeedbackAnswers.f106id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("value")) {
                return false;
            }
            messageFeedbackAnswers.value = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(MessageFeedbackAnswers messageFeedbackAnswers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("value")) {
                return true;
            }
            return super.parseFieldCheck(messageFeedbackAnswers, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(MessageFeedbackAnswers messageFeedbackAnswers, JsonGenerator jsonGenerator) throws IOException {
            String str = messageFeedbackAnswers.f106id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = messageFeedbackAnswers.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageFeedbackAnswers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageFeedbackAnswers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageFeedbackAnswers new_() {
        MessageFeedbackAnswers messageFeedbackAnswers = new MessageFeedbackAnswers();
        messageFeedbackAnswers.nullCheck();
        return messageFeedbackAnswers;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MessageFeedbackAnswers m14192clone() {
        MessageFeedbackAnswers messageFeedbackAnswers = new MessageFeedbackAnswers();
        messageFeedbackAnswers.f106id = this.f106id;
        messageFeedbackAnswers.value = this.value;
        return messageFeedbackAnswers;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageFeedbackAnswers)) {
            return false;
        }
        MessageFeedbackAnswers messageFeedbackAnswers = (MessageFeedbackAnswers) obj;
        return ValueObject.util_equals(this.f106id, messageFeedbackAnswers.f106id) && ValueObject.util_equals(this.value, messageFeedbackAnswers.value);
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
        String str = this.f106id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.value;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f106id == null) {
            this.f106id = "";
        }
        if (this.value == null) {
            this.value = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
