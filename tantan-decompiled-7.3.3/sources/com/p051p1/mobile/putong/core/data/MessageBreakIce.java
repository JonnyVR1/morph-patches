package com.p051p1.mobile.putong.core.data;

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
public class MessageBreakIce extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagebreakice";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = 2)
    public boolean exchangeAnswerEnable;
    public static ProtobufAdapter<MessageBreakIce> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageBreakIce>() { // from class: com.p1.mobile.putong.core.data.MessageBreakIce.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageBreakIce messageBreakIce) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, messageBreakIce.enable) + CodedOutputByteBufferNano.m17275b(2, messageBreakIce.exchangeAnswerEnable);
            messageBreakIce.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageBreakIce parse(nc5 nc5Var) throws IOException {
            MessageBreakIce messageBreakIce = new MessageBreakIce();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    messageBreakIce.enable = nc5Var.m162483g();
                } else {
                    if (iM162497u != 16) {
                        return messageBreakIce;
                    }
                    messageBreakIce.exchangeAnswerEnable = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageBreakIce messageBreakIce, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, messageBreakIce.enable);
            codedOutputByteBufferNano.m17299A(2, messageBreakIce.exchangeAnswerEnable);
        }
    };
    public static JsonAdapter<MessageBreakIce> JSON_ADAPTER = new ObjectJsonAdapter<MessageBreakIce>() { // from class: com.p1.mobile.putong.core.data.MessageBreakIce.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageBreakIce.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageBreakIce newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MessageBreakIce messageBreakIce, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", messageBreakIce.enable);
            jsonGenerator.writeBooleanField("exchangeAnswerEnable", messageBreakIce.exchangeAnswerEnable);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageBreakIce) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageBreakIce) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageBreakIce new_() {
        MessageBreakIce messageBreakIce = new MessageBreakIce();
        messageBreakIce.nullCheck();
        return messageBreakIce;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageBreakIce mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.enable ? 1231 : 1237)) * 41) + (this.exchangeAnswerEnable ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
