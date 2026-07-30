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
public class MessageRedesignBreakIceGuide extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messageredesignbreakiceguide";

    @NonNull
    @ProtobufIndex(index = 2)
    public MessageBreakIce breakIceGuide;

    @ProtobufIndex(index = 5)
    public boolean directlyToPicLikeDialog;

    @ProtobufIndex(index = 1)
    public boolean exchangeAnswerSwitch;

    @NonNull
    @ProtobufIndex(index = 3)
    public MessageIntegration integration;

    @ProtobufIndex(index = 4)
    public boolean mainSwitch;
    public static ProtobufAdapter<MessageRedesignBreakIceGuide> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageRedesignBreakIceGuide>() { // from class: com.p1.mobile.putong.core.data.MessageRedesignBreakIceGuide.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageRedesignBreakIceGuide messageRedesignBreakIceGuide) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, messageRedesignBreakIceGuide.exchangeAnswerSwitch);
            MessageBreakIce messageBreakIce = messageRedesignBreakIceGuide.breakIceGuide;
            if (messageBreakIce != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(2, messageBreakIce, MessageBreakIce.PROTOBUF_ADAPTER);
            }
            MessageIntegration messageIntegration = messageRedesignBreakIceGuide.integration;
            if (messageIntegration != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(3, messageIntegration, MessageIntegration.PROTOBUF_ADAPTER);
            }
            int iM17275b2 = iM17275b + CodedOutputByteBufferNano.m17275b(4, messageRedesignBreakIceGuide.mainSwitch) + CodedOutputByteBufferNano.m17275b(5, messageRedesignBreakIceGuide.directlyToPicLikeDialog);
            messageRedesignBreakIceGuide.cachedSize = iM17275b2;
            return iM17275b2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageRedesignBreakIceGuide parse(nc5 nc5Var) throws IOException {
            MessageRedesignBreakIceGuide messageRedesignBreakIceGuide = new MessageRedesignBreakIceGuide();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (messageRedesignBreakIceGuide.breakIceGuide == null) {
                        messageRedesignBreakIceGuide.breakIceGuide = MessageBreakIce.new_();
                    }
                    if (messageRedesignBreakIceGuide.integration != null) {
                        break;
                    }
                    messageRedesignBreakIceGuide.integration = MessageIntegration.new_();
                    break;
                }
                if (iM162497u == 8) {
                    messageRedesignBreakIceGuide.exchangeAnswerSwitch = nc5Var.m162483g();
                } else if (iM162497u == 18) {
                    messageRedesignBreakIceGuide.breakIceGuide = (MessageBreakIce) nc5Var.m162488l(MessageBreakIce.PROTOBUF_ADAPTER);
                } else if (iM162497u == 26) {
                    messageRedesignBreakIceGuide.integration = (MessageIntegration) nc5Var.m162488l(MessageIntegration.PROTOBUF_ADAPTER);
                } else if (iM162497u == 32) {
                    messageRedesignBreakIceGuide.mainSwitch = nc5Var.m162483g();
                } else {
                    if (iM162497u != 40) {
                        if (messageRedesignBreakIceGuide.breakIceGuide == null) {
                            messageRedesignBreakIceGuide.breakIceGuide = MessageBreakIce.new_();
                        }
                        if (messageRedesignBreakIceGuide.integration != null) {
                            break;
                        }
                        messageRedesignBreakIceGuide.integration = MessageIntegration.new_();
                        return messageRedesignBreakIceGuide;
                    }
                    messageRedesignBreakIceGuide.directlyToPicLikeDialog = nc5Var.m162483g();
                }
            }
            return messageRedesignBreakIceGuide;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageRedesignBreakIceGuide messageRedesignBreakIceGuide, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, messageRedesignBreakIceGuide.exchangeAnswerSwitch);
            MessageBreakIce messageBreakIce = messageRedesignBreakIceGuide.breakIceGuide;
            if (messageBreakIce != null) {
                codedOutputByteBufferNano.m17309K(2, messageBreakIce, MessageBreakIce.PROTOBUF_ADAPTER);
            }
            MessageIntegration messageIntegration = messageRedesignBreakIceGuide.integration;
            if (messageIntegration != null) {
                codedOutputByteBufferNano.m17309K(3, messageIntegration, MessageIntegration.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(4, messageRedesignBreakIceGuide.mainSwitch);
            codedOutputByteBufferNano.m17299A(5, messageRedesignBreakIceGuide.directlyToPicLikeDialog);
        }
    };
    public static JsonAdapter<MessageRedesignBreakIceGuide> JSON_ADAPTER = new ObjectJsonAdapter<MessageRedesignBreakIceGuide>() { // from class: com.p1.mobile.putong.core.data.MessageRedesignBreakIceGuide.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageRedesignBreakIceGuide.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageRedesignBreakIceGuide newInstance() {
            return new MessageRedesignBreakIceGuide();
        }

        public boolean parseField(MessageRedesignBreakIceGuide messageRedesignBreakIceGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "breakIceGuide":
                    messageRedesignBreakIceGuide.breakIceGuide = MessageBreakIce.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "mainSwitch":
                    messageRedesignBreakIceGuide.mainSwitch = jsonParser.getValueAsBoolean();
                    return true;
                case "directlyToPicLikeDialog":
                    messageRedesignBreakIceGuide.directlyToPicLikeDialog = jsonParser.getValueAsBoolean();
                    return true;
                case "integration":
                    messageRedesignBreakIceGuide.integration = MessageIntegration.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageRedesignBreakIceGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageRedesignBreakIceGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageRedesignBreakIceGuide new_() {
        MessageRedesignBreakIceGuide messageRedesignBreakIceGuide = new MessageRedesignBreakIceGuide();
        messageRedesignBreakIceGuide.nullCheck();
        return messageRedesignBreakIceGuide;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageRedesignBreakIceGuide mo225055clone() {
        MessageRedesignBreakIceGuide messageRedesignBreakIceGuide = new MessageRedesignBreakIceGuide();
        messageRedesignBreakIceGuide.exchangeAnswerSwitch = this.exchangeAnswerSwitch;
        MessageBreakIce messageBreakIce = this.breakIceGuide;
        if (messageBreakIce != null) {
            messageRedesignBreakIceGuide.breakIceGuide = messageBreakIce.mo225055clone();
        }
        MessageIntegration messageIntegration = this.integration;
        if (messageIntegration != null) {
            messageRedesignBreakIceGuide.integration = messageIntegration.mo225055clone();
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.exchangeAnswerSwitch ? 1231 : 1237)) * 41;
        MessageBreakIce messageBreakIce = this.breakIceGuide;
        int iHashCode = (i2 + (messageBreakIce != null ? messageBreakIce.hashCode() : 0)) * 41;
        MessageIntegration messageIntegration = this.integration;
        int iHashCode2 = ((((iHashCode + (messageIntegration != null ? messageIntegration.hashCode() : 0)) * 41) + (this.mainSwitch ? 1231 : 1237)) * 41) + (this.directlyToPicLikeDialog ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.breakIceGuide == null) {
            this.breakIceGuide = MessageBreakIce.new_();
        }
        if (this.integration == null) {
            this.integration = MessageIntegration.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
