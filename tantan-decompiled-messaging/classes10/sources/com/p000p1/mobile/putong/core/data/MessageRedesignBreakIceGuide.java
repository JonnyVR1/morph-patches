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
public class MessageRedesignBreakIceGuide extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messageredesignbreakiceguide";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public MessageBreakIce breakIceGuide;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public boolean directlyToPicLikeDialog;

    @ProtobufIndex(index = 1)
    public boolean exchangeAnswerSwitch;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public MessageIntegration integration;

    @ProtobufIndex(index = 4)
    public boolean mainSwitch;
    public static ProtobufAdapter<MessageRedesignBreakIceGuide> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageRedesignBreakIceGuide>() { // from class: com.p1.mobile.putong.core.data.MessageRedesignBreakIceGuide.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MessageRedesignBreakIceGuide messageRedesignBreakIceGuide) {
            int iB = CodedOutputByteBufferNano.b(1, messageRedesignBreakIceGuide.exchangeAnswerSwitch);
            MessageBreakIce messageBreakIce = messageRedesignBreakIceGuide.breakIceGuide;
            if (messageBreakIce != null) {
                iB += CodedOutputByteBufferNano.l(2, messageBreakIce, MessageBreakIce.PROTOBUF_ADAPTER);
            }
            MessageIntegration messageIntegration = messageRedesignBreakIceGuide.integration;
            if (messageIntegration != null) {
                iB += CodedOutputByteBufferNano.l(3, messageIntegration, MessageIntegration.PROTOBUF_ADAPTER);
            }
            int iB2 = iB + CodedOutputByteBufferNano.b(4, messageRedesignBreakIceGuide.mainSwitch) + CodedOutputByteBufferNano.b(5, messageRedesignBreakIceGuide.directlyToPicLikeDialog);
            ((MessageNano) messageRedesignBreakIceGuide).cachedSize = iB2;
            return iB2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MessageRedesignBreakIceGuide m14253parse(nb5 nb5Var) throws IOException {
            MessageRedesignBreakIceGuide messageRedesignBreakIceGuide = new MessageRedesignBreakIceGuide();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (messageRedesignBreakIceGuide.breakIceGuide == null) {
                        messageRedesignBreakIceGuide.breakIceGuide = MessageBreakIce.new_();
                    }
                    if (messageRedesignBreakIceGuide.integration != null) {
                        break;
                    }
                    messageRedesignBreakIceGuide.integration = MessageIntegration.new_();
                    break;
                }
                if (iU == 8) {
                    messageRedesignBreakIceGuide.exchangeAnswerSwitch = nb5Var.g();
                } else if (iU == 18) {
                    messageRedesignBreakIceGuide.breakIceGuide = (MessageBreakIce) nb5Var.l(MessageBreakIce.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    messageRedesignBreakIceGuide.integration = (MessageIntegration) nb5Var.l(MessageIntegration.PROTOBUF_ADAPTER);
                } else if (iU == 32) {
                    messageRedesignBreakIceGuide.mainSwitch = nb5Var.g();
                } else {
                    if (iU != 40) {
                        if (messageRedesignBreakIceGuide.breakIceGuide == null) {
                            messageRedesignBreakIceGuide.breakIceGuide = MessageBreakIce.new_();
                        }
                        if (messageRedesignBreakIceGuide.integration != null) {
                            break;
                        }
                        messageRedesignBreakIceGuide.integration = MessageIntegration.new_();
                        return messageRedesignBreakIceGuide;
                    }
                    messageRedesignBreakIceGuide.directlyToPicLikeDialog = nb5Var.g();
                }
            }
            return messageRedesignBreakIceGuide;
        }

        public void serialize(MessageRedesignBreakIceGuide messageRedesignBreakIceGuide, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, messageRedesignBreakIceGuide.exchangeAnswerSwitch);
            MessageBreakIce messageBreakIce = messageRedesignBreakIceGuide.breakIceGuide;
            if (messageBreakIce != null) {
                codedOutputByteBufferNano.K(2, messageBreakIce, MessageBreakIce.PROTOBUF_ADAPTER);
            }
            MessageIntegration messageIntegration = messageRedesignBreakIceGuide.integration;
            if (messageIntegration != null) {
                codedOutputByteBufferNano.K(3, messageIntegration, MessageIntegration.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(4, messageRedesignBreakIceGuide.mainSwitch);
            codedOutputByteBufferNano.A(5, messageRedesignBreakIceGuide.directlyToPicLikeDialog);
        }
    };
    public static JsonAdapter<MessageRedesignBreakIceGuide> JSON_ADAPTER = new ObjectJsonAdapter<MessageRedesignBreakIceGuide>() { // from class: com.p1.mobile.putong.core.data.MessageRedesignBreakIceGuide.2
        public Class getDataClass() {
            return MessageRedesignBreakIceGuide.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MessageRedesignBreakIceGuide m14254newInstance() {
            return new MessageRedesignBreakIceGuide();
        }

        public boolean parseField(MessageRedesignBreakIceGuide messageRedesignBreakIceGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "breakIceGuide":
                    messageRedesignBreakIceGuide.breakIceGuide = (MessageBreakIce) MessageBreakIce.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "mainSwitch":
                    messageRedesignBreakIceGuide.mainSwitch = jsonParser.getValueAsBoolean();
                    return true;
                case "directlyToPicLikeDialog":
                    messageRedesignBreakIceGuide.directlyToPicLikeDialog = jsonParser.getValueAsBoolean();
                    return true;
                case "integration":
                    messageRedesignBreakIceGuide.integration = (MessageIntegration) MessageIntegration.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "exchangeAnswerSwitch":
                    messageRedesignBreakIceGuide.exchangeAnswerSwitch = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MessageRedesignBreakIceGuide messageRedesignBreakIceGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "breakIceGuide":
                case "mainSwitch":
                case "directlyToPicLikeDialog":
                case "integration":
                case "exchangeAnswerSwitch":
                    return true;
                default:
                    return super.parseFieldCheck(messageRedesignBreakIceGuide, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(MessageRedesignBreakIceGuide messageRedesignBreakIceGuide, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("exchangeAnswerSwitch", messageRedesignBreakIceGuide.exchangeAnswerSwitch);
            if (messageRedesignBreakIceGuide.breakIceGuide != null) {
                jsonGenerator.writeFieldName("breakIceGuide");
                MessageBreakIce.JSON_ADAPTER.serialize(messageRedesignBreakIceGuide.breakIceGuide, jsonGenerator, true);
            }
            if (messageRedesignBreakIceGuide.integration != null) {
                jsonGenerator.writeFieldName("integration");
                MessageIntegration.JSON_ADAPTER.serialize(messageRedesignBreakIceGuide.integration, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("mainSwitch", messageRedesignBreakIceGuide.mainSwitch);
            jsonGenerator.writeBooleanField("directlyToPicLikeDialog", messageRedesignBreakIceGuide.directlyToPicLikeDialog);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageRedesignBreakIceGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageRedesignBreakIceGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageRedesignBreakIceGuide new_() {
        MessageRedesignBreakIceGuide messageRedesignBreakIceGuide = new MessageRedesignBreakIceGuide();
        messageRedesignBreakIceGuide.nullCheck();
        return messageRedesignBreakIceGuide;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MessageRedesignBreakIceGuide m14252clone() {
        MessageRedesignBreakIceGuide messageRedesignBreakIceGuide = new MessageRedesignBreakIceGuide();
        messageRedesignBreakIceGuide.exchangeAnswerSwitch = this.exchangeAnswerSwitch;
        MessageBreakIce messageBreakIce = this.breakIceGuide;
        if (messageBreakIce != null) {
            messageRedesignBreakIceGuide.breakIceGuide = messageBreakIce.m14174clone();
        }
        MessageIntegration messageIntegration = this.integration;
        if (messageIntegration != null) {
            messageRedesignBreakIceGuide.integration = messageIntegration.m14208clone();
        }
        messageRedesignBreakIceGuide.mainSwitch = this.mainSwitch;
        messageRedesignBreakIceGuide.directlyToPicLikeDialog = this.directlyToPicLikeDialog;
        return messageRedesignBreakIceGuide;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageRedesignBreakIceGuide)) {
            return false;
        }
        MessageRedesignBreakIceGuide messageRedesignBreakIceGuide = (MessageRedesignBreakIceGuide) obj;
        return this.exchangeAnswerSwitch == messageRedesignBreakIceGuide.exchangeAnswerSwitch && ValueObject.util_equals(this.breakIceGuide, messageRedesignBreakIceGuide.breakIceGuide) && ValueObject.util_equals(this.integration, messageRedesignBreakIceGuide.integration) && this.mainSwitch == messageRedesignBreakIceGuide.mainSwitch && this.directlyToPicLikeDialog == messageRedesignBreakIceGuide.directlyToPicLikeDialog;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.exchangeAnswerSwitch ? 1231 : 1237)) * 41;
        MessageBreakIce messageBreakIce = this.breakIceGuide;
        int iHashCode = (i2 + (messageBreakIce != null ? messageBreakIce.hashCode() : 0)) * 41;
        MessageIntegration messageIntegration = this.integration;
        int iHashCode2 = ((((iHashCode + (messageIntegration != null ? messageIntegration.hashCode() : 0)) * 41) + (this.mainSwitch ? 1231 : 1237)) * 41) + (this.directlyToPicLikeDialog ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.breakIceGuide == null) {
            this.breakIceGuide = MessageBreakIce.new_();
        }
        if (this.integration == null) {
            this.integration = MessageIntegration.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
