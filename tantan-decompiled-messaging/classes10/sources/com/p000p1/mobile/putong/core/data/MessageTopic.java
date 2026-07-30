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
public class MessageTopic extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "messagetopic";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f110id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public MessageTopicMomentInfo moment;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String replyButtonText;

    @NonNull
    @ProtobufIndex(index = 4)
    public String text;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;
    public static ProtobufAdapter<MessageTopic> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageTopic>() { // from class: com.p1.mobile.putong.core.data.MessageTopic.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MessageTopic messageTopic) {
            String str = messageTopic.f110id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = messageTopic.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            MessageTopicMomentInfo messageTopicMomentInfo = messageTopic.moment;
            if (messageTopicMomentInfo != null) {
                iO += CodedOutputByteBufferNano.l(3, messageTopicMomentInfo, MessageTopicMomentInfo.PROTOBUF_ADAPTER);
            }
            String str3 = messageTopic.text;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(4, str3);
            }
            String str4 = messageTopic.replyButtonText;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(5, str4);
            }
            ((MessageNano) messageTopic).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MessageTopic m14289parse(nb5 nb5Var) throws IOException {
            MessageTopic messageTopic = new MessageTopic();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (messageTopic.f110id == null) {
                        messageTopic.f110id = "";
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
                if (iU == 10) {
                    messageTopic.f110id = nb5Var.s();
                } else if (iU == 18) {
                    messageTopic.type = nb5Var.s();
                } else if (iU == 26) {
                    messageTopic.moment = (MessageTopicMomentInfo) nb5Var.l(MessageTopicMomentInfo.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    messageTopic.text = nb5Var.s();
                } else {
                    if (iU != 42) {
                        if (messageTopic.f110id == null) {
                            messageTopic.f110id = "";
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
                    messageTopic.replyButtonText = nb5Var.s();
                }
            }
            return messageTopic;
        }

        public void serialize(MessageTopic messageTopic, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageTopic.f110id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = messageTopic.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            MessageTopicMomentInfo messageTopicMomentInfo = messageTopic.moment;
            if (messageTopicMomentInfo != null) {
                codedOutputByteBufferNano.K(3, messageTopicMomentInfo, MessageTopicMomentInfo.PROTOBUF_ADAPTER);
            }
            String str3 = messageTopic.text;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            String str4 = messageTopic.replyButtonText;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
        }
    };
    public static JsonAdapter<MessageTopic> JSON_ADAPTER = new ObjectJsonAdapter<MessageTopic>() { // from class: com.p1.mobile.putong.core.data.MessageTopic.2
        public Class getDataClass() {
            return MessageTopic.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MessageTopic m14290newInstance() {
            return new MessageTopic();
        }

        public boolean parseField(MessageTopic messageTopic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "replyButtonText":
                    messageTopic.replyButtonText = jsonParser.getValueAsString();
                    return true;
                case "moment":
                    messageTopic.moment = (MessageTopicMomentInfo) MessageTopicMomentInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    messageTopic.f110id = jsonParser.getValueAsString();
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

        public void serializeFields(MessageTopic messageTopic, JsonGenerator jsonGenerator) throws IOException {
            String str = messageTopic.f110id;
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageTopic new_() {
        MessageTopic messageTopic = new MessageTopic();
        messageTopic.nullCheck();
        return messageTopic;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MessageTopic m14288clone() {
        MessageTopic messageTopic = new MessageTopic();
        messageTopic.f110id = this.f110id;
        messageTopic.type = this.type;
        MessageTopicMomentInfo messageTopicMomentInfo = this.moment;
        if (messageTopicMomentInfo != null) {
            messageTopic.moment = messageTopicMomentInfo.m14292clone();
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
        return this == obj && ValueObject.util_equals(this.f110id, messageTopic.f110id) && ValueObject.util_equals(this.type, messageTopic.type) && ValueObject.util_equals(this.moment, messageTopic.moment) && ValueObject.util_equals(this.text, messageTopic.text) && ValueObject.util_equals(this.replyButtonText, messageTopic.replyButtonText);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        String str = this.f110id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        MessageTopicMomentInfo messageTopicMomentInfo = this.moment;
        int iHashCode4 = (iHashCode3 + (messageTopicMomentInfo != null ? messageTopicMomentInfo.hashCode() : 0)) * 41;
        String str3 = this.text;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.replyButtonText;
        int iHashCode6 = iHashCode5 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.f110id == null) {
            this.f110id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
