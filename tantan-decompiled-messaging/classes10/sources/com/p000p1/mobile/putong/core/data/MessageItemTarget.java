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
public class MessageItemTarget extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messageitemtarget";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String deeplink;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<MessageItemTarget> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageItemTarget>() { // from class: com.p1.mobile.putong.core.data.MessageItemTarget.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MessageItemTarget messageItemTarget) {
            String str = messageItemTarget.type;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = messageItemTarget.deeplink;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) messageItemTarget).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MessageItemTarget m14225parse(nb5 nb5Var) throws IOException {
            MessageItemTarget messageItemTarget = new MessageItemTarget();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (messageItemTarget.type == null) {
                        messageItemTarget.type = "";
                    }
                    if (messageItemTarget.deeplink != null) {
                        break;
                    }
                    messageItemTarget.deeplink = "";
                    break;
                }
                if (iU == 10) {
                    messageItemTarget.type = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (messageItemTarget.type == null) {
                            messageItemTarget.type = "";
                        }
                        if (messageItemTarget.deeplink != null) {
                            break;
                        }
                        messageItemTarget.deeplink = "";
                        return messageItemTarget;
                    }
                    messageItemTarget.deeplink = nb5Var.s();
                }
            }
            return messageItemTarget;
        }

        public void serialize(MessageItemTarget messageItemTarget, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageItemTarget.type;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = messageItemTarget.deeplink;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<MessageItemTarget> JSON_ADAPTER = new ObjectJsonAdapter<MessageItemTarget>() { // from class: com.p1.mobile.putong.core.data.MessageItemTarget.2
        public Class getDataClass() {
            return MessageItemTarget.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MessageItemTarget m14226newInstance() {
            return new MessageItemTarget();
        }

        public boolean parseField(MessageItemTarget messageItemTarget, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("type")) {
                messageItemTarget.type = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("deeplink")) {
                return false;
            }
            messageItemTarget.deeplink = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(MessageItemTarget messageItemTarget, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("type") || str.equals("deeplink")) {
                return true;
            }
            return super.parseFieldCheck(messageItemTarget, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(MessageItemTarget messageItemTarget, JsonGenerator jsonGenerator) throws IOException {
            String str = messageItemTarget.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = messageItemTarget.deeplink;
            if (str2 != null) {
                jsonGenerator.writeStringField("deeplink", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageItemTarget) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageItemTarget) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageItemTarget new_() {
        MessageItemTarget messageItemTarget = new MessageItemTarget();
        messageItemTarget.nullCheck();
        return messageItemTarget;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MessageItemTarget m14224clone() {
        MessageItemTarget messageItemTarget = new MessageItemTarget();
        messageItemTarget.type = this.type;
        messageItemTarget.deeplink = this.deeplink;
        return messageItemTarget;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageItemTarget)) {
            return false;
        }
        MessageItemTarget messageItemTarget = (MessageItemTarget) obj;
        return ValueObject.util_equals(this.type, messageItemTarget.type) && ValueObject.util_equals(this.deeplink, messageItemTarget.deeplink);
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
        String str2 = this.deeplink;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.deeplink == null) {
            this.deeplink = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
