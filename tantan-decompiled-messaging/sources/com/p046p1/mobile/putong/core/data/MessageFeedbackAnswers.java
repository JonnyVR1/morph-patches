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
public class MessageFeedbackAnswers extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagefeedbackanswers";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20444id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String value;
    public static ProtobufAdapter<MessageFeedbackAnswers> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageFeedbackAnswers>() { // from class: com.p1.mobile.putong.core.data.MessageFeedbackAnswers.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageFeedbackAnswers messageFeedbackAnswers) {
            String str = messageFeedbackAnswers.f20444id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = messageFeedbackAnswers.value;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            messageFeedbackAnswers.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageFeedbackAnswers parse(nb5 nb5Var) throws IOException {
            MessageFeedbackAnswers messageFeedbackAnswers = new MessageFeedbackAnswers();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (messageFeedbackAnswers.f20444id == null) {
                        messageFeedbackAnswers.f20444id = "";
                    }
                    if (messageFeedbackAnswers.value != null) {
                        break;
                    }
                    messageFeedbackAnswers.value = "";
                    break;
                }
                if (iM158752u == 10) {
                    messageFeedbackAnswers.f20444id = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (messageFeedbackAnswers.f20444id == null) {
                            messageFeedbackAnswers.f20444id = "";
                        }
                        if (messageFeedbackAnswers.value != null) {
                            break;
                        }
                        messageFeedbackAnswers.value = "";
                        return messageFeedbackAnswers;
                    }
                    messageFeedbackAnswers.value = nb5Var.m158750s();
                }
            }
            return messageFeedbackAnswers;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageFeedbackAnswers messageFeedbackAnswers, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageFeedbackAnswers.f20444id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = messageFeedbackAnswers.value;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<MessageFeedbackAnswers> JSON_ADAPTER = new ObjectJsonAdapter<MessageFeedbackAnswers>() { // from class: com.p1.mobile.putong.core.data.MessageFeedbackAnswers.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageFeedbackAnswers.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageFeedbackAnswers newInstance() {
            return new MessageFeedbackAnswers();
        }

        public boolean parseField(MessageFeedbackAnswers messageFeedbackAnswers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                messageFeedbackAnswers.f20444id = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MessageFeedbackAnswers messageFeedbackAnswers, JsonGenerator jsonGenerator) throws IOException {
            String str = messageFeedbackAnswers.f20444id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = messageFeedbackAnswers.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageFeedbackAnswers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageFeedbackAnswers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageFeedbackAnswers new_() {
        MessageFeedbackAnswers messageFeedbackAnswers = new MessageFeedbackAnswers();
        messageFeedbackAnswers.nullCheck();
        return messageFeedbackAnswers;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageFeedbackAnswers mo223809clone() {
        MessageFeedbackAnswers messageFeedbackAnswers = new MessageFeedbackAnswers();
        messageFeedbackAnswers.f20444id = this.f20444id;
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
        return ValueObject.util_equals(this.f20444id, messageFeedbackAnswers.f20444id) && ValueObject.util_equals(this.value, messageFeedbackAnswers.value);
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
        String str = this.f20444id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.value;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20444id == null) {
            this.f20444id = "";
        }
        if (this.value == null) {
            this.value = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
