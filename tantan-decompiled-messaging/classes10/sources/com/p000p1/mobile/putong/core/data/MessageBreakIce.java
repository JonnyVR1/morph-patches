package com.p000p1.mobile.putong.core.data;

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
public class MessageBreakIce extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagebreakice";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean exchangeAnswerEnable;
    public static ProtobufAdapter<MessageBreakIce> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageBreakIce>() { // from class: com.p1.mobile.putong.core.data.MessageBreakIce.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MessageBreakIce messageBreakIce) {
            int iB = CodedOutputByteBufferNano.b(1, messageBreakIce.enable) + CodedOutputByteBufferNano.b(2, messageBreakIce.exchangeAnswerEnable);
            ((MessageNano) messageBreakIce).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MessageBreakIce m14175parse(nb5 nb5Var) throws IOException {
            MessageBreakIce messageBreakIce = new MessageBreakIce();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    messageBreakIce.enable = nb5Var.g();
                } else {
                    if (iU != 16) {
                        return messageBreakIce;
                    }
                    messageBreakIce.exchangeAnswerEnable = nb5Var.g();
                }
            }
        }

        public void serialize(MessageBreakIce messageBreakIce, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, messageBreakIce.enable);
            codedOutputByteBufferNano.A(2, messageBreakIce.exchangeAnswerEnable);
        }
    };
    public static JsonAdapter<MessageBreakIce> JSON_ADAPTER = new ObjectJsonAdapter<MessageBreakIce>() { // from class: com.p1.mobile.putong.core.data.MessageBreakIce.2
        public Class getDataClass() {
            return MessageBreakIce.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MessageBreakIce m14176newInstance() {
            return new MessageBreakIce();
        }

        public boolean parseField(MessageBreakIce messageBreakIce, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("enable")) {
                messageBreakIce.enable = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("exchangeAnswerEnable")) {
                return false;
            }
            messageBreakIce.exchangeAnswerEnable = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(MessageBreakIce messageBreakIce, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("enable") || str.equals("exchangeAnswerEnable")) {
                return true;
            }
            return super.parseFieldCheck(messageBreakIce, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(MessageBreakIce messageBreakIce, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", messageBreakIce.enable);
            jsonGenerator.writeBooleanField("exchangeAnswerEnable", messageBreakIce.exchangeAnswerEnable);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageBreakIce) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageBreakIce) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageBreakIce new_() {
        MessageBreakIce messageBreakIce = new MessageBreakIce();
        messageBreakIce.nullCheck();
        return messageBreakIce;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MessageBreakIce m14174clone() {
        MessageBreakIce messageBreakIce = new MessageBreakIce();
        messageBreakIce.enable = this.enable;
        messageBreakIce.exchangeAnswerEnable = this.exchangeAnswerEnable;
        return messageBreakIce;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageBreakIce)) {
            return false;
        }
        MessageBreakIce messageBreakIce = (MessageBreakIce) obj;
        return this.enable == messageBreakIce.enable && this.exchangeAnswerEnable == messageBreakIce.exchangeAnswerEnable;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.enable ? 1231 : 1237)) * 41) + (this.exchangeAnswerEnable ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
