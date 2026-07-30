package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class MessageReference extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagereference";

    @NonNull
    @ProtobufIndex(index = 3)
    public MomentAction action;

    @Nullable
    @ProtobufIndex(index = 4)
    public String answerId;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 2)
    public String f20447id;

    @Nullable
    @ProtobufIndex(index = 6)
    public MessageTopic topic;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<MessageReference> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageReference>() { // from class: com.p1.mobile.putong.core.data.MessageReference.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageReference messageReference) {
            String str = messageReference.type;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = messageReference.f20447id;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            MomentAction momentAction = messageReference.action;
            if (momentAction != null) {
                iM17233o += CodedOutputByteBufferNano.m17226h(3, momentAction.ordinal());
            }
            String str3 = messageReference.answerId;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            MomentAction momentAction2 = messageReference.action;
            if (momentAction2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(5, momentAction2, MomentAction.PROTOBUF_ADAPTER);
            }
            MessageTopic messageTopic = messageReference.topic;
            if (messageTopic != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(6, messageTopic, MessageTopic.PROTOBUF_ADAPTER);
            }
            messageReference.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageReference parse(nb5 nb5Var) throws IOException {
            MessageReference messageReference = new MessageReference();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (messageReference.action == null && numValueOf != null) {
                        messageReference.action = (MomentAction) MomentAction.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (messageReference.type == null) {
                        messageReference.type = "";
                    }
                    if (messageReference.f20447id == null) {
                        messageReference.f20447id = "";
                    }
                    if (messageReference.action != null) {
                        break;
                    }
                    messageReference.action = (MomentAction) MomentAction.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM158752u == 10) {
                    messageReference.type = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    messageReference.f20447id = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 34) {
                    messageReference.answerId = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    messageReference.action = (MomentAction) nb5Var.m158743l(MomentAction.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 50) {
                        if (messageReference.action == null && numValueOf != null) {
                            messageReference.action = (MomentAction) MomentAction.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (messageReference.type == null) {
                            messageReference.type = "";
                        }
                        if (messageReference.f20447id == null) {
                            messageReference.f20447id = "";
                        }
                        if (messageReference.action != null) {
                            break;
                        }
                        messageReference.action = (MomentAction) MomentAction.JSON_ADAPTER.defaultEnum();
                        return messageReference;
                    }
                    messageReference.topic = (MessageTopic) nb5Var.m158743l(MessageTopic.PROTOBUF_ADAPTER);
                }
            }
            return messageReference;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageReference messageReference, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageReference.type;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = messageReference.f20447id;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            MomentAction momentAction = messageReference.action;
            if (momentAction != null) {
                codedOutputByteBufferNano.m17250G(3, momentAction.ordinal());
            }
            String str3 = messageReference.answerId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            MomentAction momentAction2 = messageReference.action;
            if (momentAction2 != null) {
                codedOutputByteBufferNano.m17254K(5, momentAction2, MomentAction.PROTOBUF_ADAPTER);
            }
            MessageTopic messageTopic = messageReference.topic;
            if (messageTopic != null) {
                codedOutputByteBufferNano.m17254K(6, messageTopic, MessageTopic.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MessageReference> JSON_ADAPTER = new ObjectJsonAdapter<MessageReference>() { // from class: com.p1.mobile.putong.core.data.MessageReference.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageReference.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageReference newInstance() {
            return new MessageReference();
        }

        public boolean parseField(MessageReference messageReference, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "action":
                    messageReference.action = MomentAction.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "answerId":
                    messageReference.answerId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    messageReference.f20447id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    messageReference.type = jsonParser.getValueAsString();
                    return true;
                case "topic":
                    messageReference.topic = MessageTopic.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MessageReference messageReference, JsonGenerator jsonGenerator) throws IOException {
            String str = messageReference.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = messageReference.f20447id;
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
                jsonGenerator.writeFieldName("topic");
                MessageTopic.JSON_ADAPTER.serialize(messageReference.topic, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageReference) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageReference) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageReference new_() {
        MessageReference messageReference = new MessageReference();
        messageReference.nullCheck();
        return messageReference;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageReference mo223809clone() {
        MessageReference messageReference = new MessageReference();
        messageReference.type = this.type;
        messageReference.f20447id = this.f20447id;
        messageReference.action = this.action;
        messageReference.answerId = this.answerId;
        MessageTopic messageTopic = this.topic;
        if (messageTopic != null) {
            messageReference.topic = messageTopic.mo223809clone();
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
        return ValueObject.util_equals(this.type, messageReference.type) && ValueObject.util_equals(this.f20447id, messageReference.f20447id) && ValueObject.util_equals(this.action, messageReference.action) && ValueObject.util_equals(this.answerId, messageReference.answerId) && ValueObject.util_equals(this.topic, messageReference.topic);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.f20447id;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        MomentAction momentAction = this.action;
        int iHashCode3 = (iHashCode2 + (momentAction != null ? momentAction.hashCode() : 0)) * 41;
        String str3 = this.answerId;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        MessageTopic messageTopic = this.topic;
        int iHashCode5 = iHashCode4 + (messageTopic != null ? messageTopic.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.f20447id == null) {
            this.f20447id = "";
        }
        if (this.action == null) {
            this.action = (MomentAction) MomentAction.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
