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
public class MessageTopic extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "messagetopic";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20448id;

    @NonNull
    @ProtobufIndex(index = 3)
    public MessageTopicMomentInfo moment;

    @NonNull
    @ProtobufIndex(index = 5)
    public String replyButtonText;

    @NonNull
    @ProtobufIndex(index = 4)
    public String text;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<MessageTopic> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageTopic>() { // from class: com.p1.mobile.putong.core.data.MessageTopic.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageTopic messageTopic) {
            String str = messageTopic.f20448id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = messageTopic.type;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            MessageTopicMomentInfo messageTopicMomentInfo = messageTopic.moment;
            if (messageTopicMomentInfo != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, messageTopicMomentInfo, MessageTopicMomentInfo.PROTOBUF_ADAPTER);
            }
            String str3 = messageTopic.text;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            String str4 = messageTopic.replyButtonText;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str4);
            }
            messageTopic.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageTopic parse(nb5 nb5Var) throws IOException {
            MessageTopic messageTopic = new MessageTopic();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (messageTopic.f20448id == null) {
                        messageTopic.f20448id = "";
                    }
                    if (messageTopic.type == null) {
                        messageTopic.type = "";
                    }
                    if (messageTopic.moment == null) {
                        messageTopic.moment = MessageTopicMomentInfo.new_();
                    }
                    if (messageTopic.text == null) {
                        messageTopic.text = "";
                    }
                    if (messageTopic.replyButtonText != null) {
                        break;
                    }
                    messageTopic.replyButtonText = "";
                    break;
                }
                if (iM158752u == 10) {
                    messageTopic.f20448id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    messageTopic.type = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    messageTopic.moment = (MessageTopicMomentInfo) nb5Var.m158743l(MessageTopicMomentInfo.PROTOBUF_ADAPTER);
                } else if (iM158752u == 34) {
                    messageTopic.text = nb5Var.m158750s();
                } else {
                    if (iM158752u != 42) {
                        if (messageTopic.f20448id == null) {
                            messageTopic.f20448id = "";
                        }
                        if (messageTopic.type == null) {
                            messageTopic.type = "";
                        }
                        if (messageTopic.moment == null) {
                            messageTopic.moment = MessageTopicMomentInfo.new_();
                        }
                        if (messageTopic.text == null) {
                            messageTopic.text = "";
                        }
                        if (messageTopic.replyButtonText != null) {
                            break;
                        }
                        messageTopic.replyButtonText = "";
                        return messageTopic;
                    }
                    messageTopic.replyButtonText = nb5Var.m158750s();
                }
            }
            return messageTopic;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageTopic messageTopic, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageTopic.f20448id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = messageTopic.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            MessageTopicMomentInfo messageTopicMomentInfo = messageTopic.moment;
            if (messageTopicMomentInfo != null) {
                codedOutputByteBufferNano.m17254K(3, messageTopicMomentInfo, MessageTopicMomentInfo.PROTOBUF_ADAPTER);
            }
            String str3 = messageTopic.text;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            String str4 = messageTopic.replyButtonText;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(5, str4);
            }
        }
    };
    public static JsonAdapter<MessageTopic> JSON_ADAPTER = new ObjectJsonAdapter<MessageTopic>() { // from class: com.p1.mobile.putong.core.data.MessageTopic.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageTopic.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageTopic newInstance() {
            return new MessageTopic();
        }

        public boolean parseField(MessageTopic messageTopic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "replyButtonText":
                    messageTopic.replyButtonText = jsonParser.getValueAsString();
                    return true;
                case "moment":
                    messageTopic.moment = MessageTopicMomentInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    messageTopic.f20448id = jsonParser.getValueAsString();
                    return false;
                case "text":
                    messageTopic.text = jsonParser.getValueAsString();
                    return true;
                case "type":
                    messageTopic.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MessageTopic messageTopic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "replyButtonText":
                case "moment":
                    return true;
                case "id":
                    return false;
                case "text":
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(messageTopic, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MessageTopic messageTopic, JsonGenerator jsonGenerator) throws IOException {
            String str = messageTopic.f20448id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = messageTopic.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            if (messageTopic.moment != null) {
                jsonGenerator.writeFieldName("moment");
                MessageTopicMomentInfo.JSON_ADAPTER.serialize(messageTopic.moment, jsonGenerator, true);
            }
            String str3 = messageTopic.text;
            if (str3 != null) {
                jsonGenerator.writeStringField("text", str3);
            }
            String str4 = messageTopic.replyButtonText;
            if (str4 != null) {
                jsonGenerator.writeStringField("replyButtonText", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageTopic new_() {
        MessageTopic messageTopic = new MessageTopic();
        messageTopic.nullCheck();
        return messageTopic;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageTopic mo223809clone() {
        MessageTopic messageTopic = new MessageTopic();
        messageTopic.f20448id = this.f20448id;
        messageTopic.type = this.type;
        MessageTopicMomentInfo messageTopicMomentInfo = this.moment;
        if (messageTopicMomentInfo != null) {
            messageTopic.moment = messageTopicMomentInfo.mo223809clone();
        }
        messageTopic.text = this.text;
        messageTopic.replyButtonText = this.replyButtonText;
        return messageTopic;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageTopic)) {
            return false;
        }
        MessageTopic messageTopic = (MessageTopic) obj;
        return this == obj && ValueObject.util_equals(this.f20448id, messageTopic.f20448id) && ValueObject.util_equals(this.type, messageTopic.type) && ValueObject.util_equals(this.moment, messageTopic.moment) && ValueObject.util_equals(this.text, messageTopic.text) && ValueObject.util_equals(this.replyButtonText, messageTopic.replyButtonText);
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
        int iHashCode = super.hashCode() * 41;
        String str = this.f20448id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        MessageTopicMomentInfo messageTopicMomentInfo = this.moment;
        int iHashCode4 = (iHashCode3 + (messageTopicMomentInfo != null ? messageTopicMomentInfo.hashCode() : 0)) * 41;
        String str3 = this.text;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.replyButtonText;
        int iHashCode6 = iHashCode5 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.f20448id == null) {
            this.f20448id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.moment == null) {
            this.moment = MessageTopicMomentInfo.new_();
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.replyButtonText == null) {
            this.replyButtonText = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
