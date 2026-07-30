package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class MessageReference extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagereference";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public MomentAction action;

    @Nullable
    @ProtobufIndex(index = 4)
    public String answerId;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String f109id;

    @Nullable
    @ProtobufIndex(index = 6)
    public MessageTopic topic;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<MessageReference> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageReference>() { // from class: com.p1.mobile.putong.core.data.MessageReference.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MessageReference messageReference) {
            String str = messageReference.type;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = messageReference.f109id;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            MomentAction momentAction = messageReference.action;
            if (momentAction != null) {
                iO += CodedOutputByteBufferNano.h(3, momentAction.ordinal());
            }
            String str3 = messageReference.answerId;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(4, str3);
            }
            MomentAction momentAction2 = messageReference.action;
            if (momentAction2 != null) {
                iO += CodedOutputByteBufferNano.l(5, momentAction2, MomentAction.PROTOBUF_ADAPTER);
            }
            MessageTopic messageTopic = messageReference.topic;
            if (messageTopic != null) {
                iO += CodedOutputByteBufferNano.l(6, messageTopic, MessageTopic.PROTOBUF_ADAPTER);
            }
            ((MessageNano) messageReference).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MessageReference m14257parse(nb5 nb5Var) throws IOException {
            MessageReference messageReference = new MessageReference();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (messageReference.action == null && numValueOf != null) {
                        messageReference.action = (MomentAction) MomentAction.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                    }
                    if (messageReference.type == null) {
                        messageReference.type = "";
                    }
                    if (messageReference.f109id == null) {
                        messageReference.f109id = "";
                    }
                    if (messageReference.action != null) {
                        break;
                    }
                    messageReference.action = (MomentAction) MomentAction.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 10) {
                    messageReference.type = nb5Var.s();
                } else if (iU == 18) {
                    messageReference.f109id = nb5Var.s();
                } else if (iU == 24) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 34) {
                    messageReference.answerId = nb5Var.s();
                } else if (iU == 42) {
                    messageReference.action = (MomentAction) nb5Var.l(MomentAction.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 50) {
                        if (messageReference.action == null && numValueOf != null) {
                            messageReference.action = (MomentAction) MomentAction.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (messageReference.type == null) {
                            messageReference.type = "";
                        }
                        if (messageReference.f109id == null) {
                            messageReference.f109id = "";
                        }
                        if (messageReference.action != null) {
                            break;
                        }
                        messageReference.action = (MomentAction) MomentAction.JSON_ADAPTER.defaultEnum();
                        return messageReference;
                    }
                    messageReference.topic = (MessageTopic) nb5Var.l(MessageTopic.PROTOBUF_ADAPTER);
                }
            }
            return messageReference;
        }

        public void serialize(MessageReference messageReference, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageReference.type;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = messageReference.f109id;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            MomentAction momentAction = messageReference.action;
            if (momentAction != null) {
                codedOutputByteBufferNano.G(3, momentAction.ordinal());
            }
            String str3 = messageReference.answerId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            MomentAction momentAction2 = messageReference.action;
            if (momentAction2 != null) {
                codedOutputByteBufferNano.K(5, momentAction2, MomentAction.PROTOBUF_ADAPTER);
            }
            MessageTopic messageTopic = messageReference.topic;
            if (messageTopic != null) {
                codedOutputByteBufferNano.K(6, messageTopic, MessageTopic.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MessageReference> JSON_ADAPTER = new ObjectJsonAdapter<MessageReference>() { // from class: com.p1.mobile.putong.core.data.MessageReference.2
        public Class getDataClass() {
            return MessageReference.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MessageReference m14258newInstance() {
            return new MessageReference();
        }

        public boolean parseField(MessageReference messageReference, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "action":
                    messageReference.action = (MomentAction) MomentAction.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "answerId":
                    messageReference.answerId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    messageReference.f109id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    messageReference.type = jsonParser.getValueAsString();
                    return true;
                case "topic":
                    messageReference.topic = (MessageTopic) MessageTopic.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MessageReference messageReference, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "action":
                case "answerId":
                    return true;
                case "id":
                    return false;
                case "type":
                case "topic":
                    return true;
                default:
                    return super.parseFieldCheck(messageReference, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(MessageReference messageReference, JsonGenerator jsonGenerator) throws IOException {
            String str = messageReference.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = messageReference.f109id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
            if (messageReference.action != null) {
                jsonGenerator.writeFieldName("action");
                MomentAction.JSON_ADAPTER.serialize(messageReference.action, jsonGenerator, true);
            }
            String str3 = messageReference.answerId;
            if (str3 != null) {
                jsonGenerator.writeStringField("answerId", str3);
            }
            if (messageReference.topic != null) {
                jsonGenerator.writeFieldName(MessageAccessory.TOPIC_TYPE);
                MessageTopic.JSON_ADAPTER.serialize(messageReference.topic, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageReference) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageReference) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageReference new_() {
        MessageReference messageReference = new MessageReference();
        messageReference.nullCheck();
        return messageReference;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MessageReference m14256clone() {
        MessageReference messageReference = new MessageReference();
        messageReference.type = this.type;
        messageReference.f109id = this.f109id;
        messageReference.action = this.action;
        messageReference.answerId = this.answerId;
        MessageTopic messageTopic = this.topic;
        if (messageTopic != null) {
            messageReference.topic = messageTopic.m14288clone();
        }
        return messageReference;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageReference)) {
            return false;
        }
        MessageReference messageReference = (MessageReference) obj;
        return ValueObject.util_equals(this.type, messageReference.type) && ValueObject.util_equals(this.f109id, messageReference.f109id) && ValueObject.util_equals(this.action, messageReference.action) && ValueObject.util_equals(this.answerId, messageReference.answerId) && ValueObject.util_equals(this.topic, messageReference.topic);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.f109id;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        MomentAction momentAction = this.action;
        int iHashCode3 = (iHashCode2 + (momentAction != null ? momentAction.hashCode() : 0)) * 41;
        String str3 = this.answerId;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        MessageTopic messageTopic = this.topic;
        int iHashCode5 = iHashCode4 + (messageTopic != null ? messageTopic.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.f109id == null) {
            this.f109id = "";
        }
        if (this.action == null) {
            this.action = (MomentAction) MomentAction.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
