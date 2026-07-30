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
public class MessageFeedbackStatus extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagefeedbackstatus";

    @NonNull
    @ProtobufIndex(index = 2)
    public String feedback_category;

    @NonNull
    @ProtobufIndex(index = 1)
    public String feedback_id;

    @NonNull
    @ProtobufIndex(index = 3)
    public MessageFeedbackQuestion question;
    public static ProtobufAdapter<MessageFeedbackStatus> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageFeedbackStatus>() { // from class: com.p1.mobile.putong.core.data.MessageFeedbackStatus.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageFeedbackStatus messageFeedbackStatus) {
            String str = messageFeedbackStatus.feedback_id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = messageFeedbackStatus.feedback_category;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            MessageFeedbackQuestion messageFeedbackQuestion = messageFeedbackStatus.question;
            if (messageFeedbackQuestion != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, messageFeedbackQuestion, MessageFeedbackQuestion.PROTOBUF_ADAPTER);
            }
            messageFeedbackStatus.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageFeedbackStatus parse(nc5 nc5Var) throws IOException {
            MessageFeedbackStatus messageFeedbackStatus = new MessageFeedbackStatus();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (messageFeedbackStatus.feedback_id == null) {
                        messageFeedbackStatus.feedback_id = "";
                    }
                    if (messageFeedbackStatus.feedback_category == null) {
                        messageFeedbackStatus.feedback_category = "";
                    }
                    if (messageFeedbackStatus.question != null) {
                        break;
                    }
                    messageFeedbackStatus.question = MessageFeedbackQuestion.new_();
                    break;
                }
                if (iM162497u == 10) {
                    messageFeedbackStatus.feedback_id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    messageFeedbackStatus.feedback_category = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (messageFeedbackStatus.feedback_id == null) {
                            messageFeedbackStatus.feedback_id = "";
                        }
                        if (messageFeedbackStatus.feedback_category == null) {
                            messageFeedbackStatus.feedback_category = "";
                        }
                        if (messageFeedbackStatus.question != null) {
                            break;
                        }
                        messageFeedbackStatus.question = MessageFeedbackQuestion.new_();
                        return messageFeedbackStatus;
                    }
                    messageFeedbackStatus.question = (MessageFeedbackQuestion) nc5Var.m162488l(MessageFeedbackQuestion.PROTOBUF_ADAPTER);
                }
            }
            return messageFeedbackStatus;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageFeedbackStatus messageFeedbackStatus, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageFeedbackStatus.feedback_id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = messageFeedbackStatus.feedback_category;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            MessageFeedbackQuestion messageFeedbackQuestion = messageFeedbackStatus.question;
            if (messageFeedbackQuestion != null) {
                codedOutputByteBufferNano.m17309K(3, messageFeedbackQuestion, MessageFeedbackQuestion.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MessageFeedbackStatus> JSON_ADAPTER = new ObjectJsonAdapter<MessageFeedbackStatus>() { // from class: com.p1.mobile.putong.core.data.MessageFeedbackStatus.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageFeedbackStatus.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageFeedbackStatus newInstance() {
            return new MessageFeedbackStatus();
        }

        public boolean parseField(MessageFeedbackStatus messageFeedbackStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "feedback_id":
                    messageFeedbackStatus.feedback_id = jsonParser.getValueAsString();
                    return true;
                case "question":
                    messageFeedbackStatus.question = MessageFeedbackQuestion.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "feedback_category":
                    messageFeedbackStatus.feedback_category = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MessageFeedbackStatus messageFeedbackStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "feedback_id":
                case "question":
                case "feedback_category":
                    return true;
                default:
                    return super.parseFieldCheck(messageFeedbackStatus, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MessageFeedbackStatus messageFeedbackStatus, JsonGenerator jsonGenerator) throws IOException {
            String str = messageFeedbackStatus.feedback_id;
            if (str != null) {
                jsonGenerator.writeStringField("feedback_id", str);
            }
            String str2 = messageFeedbackStatus.feedback_category;
            if (str2 != null) {
                jsonGenerator.writeStringField("feedback_category", str2);
            }
            if (messageFeedbackStatus.question != null) {
                jsonGenerator.writeFieldName("question");
                MessageFeedbackQuestion.JSON_ADAPTER.serialize(messageFeedbackStatus.question, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageFeedbackStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageFeedbackStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageFeedbackStatus new_() {
        MessageFeedbackStatus messageFeedbackStatus = new MessageFeedbackStatus();
        messageFeedbackStatus.nullCheck();
        return messageFeedbackStatus;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageFeedbackStatus mo225055clone() {
        MessageFeedbackStatus messageFeedbackStatus = new MessageFeedbackStatus();
        messageFeedbackStatus.feedback_id = this.feedback_id;
        messageFeedbackStatus.feedback_category = this.feedback_category;
        MessageFeedbackQuestion messageFeedbackQuestion = this.question;
        if (messageFeedbackQuestion != null) {
            messageFeedbackStatus.question = messageFeedbackQuestion.mo225055clone();
        }
        return messageFeedbackStatus;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageFeedbackStatus)) {
            return false;
        }
        MessageFeedbackStatus messageFeedbackStatus = (MessageFeedbackStatus) obj;
        return ValueObject.util_equals(this.feedback_id, messageFeedbackStatus.feedback_id) && ValueObject.util_equals(this.feedback_category, messageFeedbackStatus.feedback_category) && ValueObject.util_equals(this.question, messageFeedbackStatus.question);
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
        String str = this.feedback_id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.feedback_category;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        MessageFeedbackQuestion messageFeedbackQuestion = this.question;
        int iHashCode3 = iHashCode2 + (messageFeedbackQuestion != null ? messageFeedbackQuestion.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.feedback_id == null) {
            this.feedback_id = "";
        }
        if (this.feedback_category == null) {
            this.feedback_category = "";
        }
        if (this.question == null) {
            this.question = MessageFeedbackQuestion.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
