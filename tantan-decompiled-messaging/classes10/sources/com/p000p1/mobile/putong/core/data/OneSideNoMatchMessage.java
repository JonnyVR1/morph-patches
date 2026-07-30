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
public class OneSideNoMatchMessage extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "onesidenomatchmessage";

    @ProtobufIndex(index = 1)
    public boolean isOneSide;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean isReply;
    public static ProtobufAdapter<OneSideNoMatchMessage> PROTOBUF_ADAPTER = new MessageNanoAdapter<OneSideNoMatchMessage>() { // from class: com.p1.mobile.putong.core.data.OneSideNoMatchMessage.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OneSideNoMatchMessage oneSideNoMatchMessage) {
            int iB = CodedOutputByteBufferNano.b(1, oneSideNoMatchMessage.isOneSide) + CodedOutputByteBufferNano.b(2, oneSideNoMatchMessage.isReply);
            ((MessageNano) oneSideNoMatchMessage).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OneSideNoMatchMessage m14661parse(nb5 nb5Var) throws IOException {
            OneSideNoMatchMessage oneSideNoMatchMessage = new OneSideNoMatchMessage();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    oneSideNoMatchMessage.isOneSide = nb5Var.g();
                } else {
                    if (iU != 16) {
                        return oneSideNoMatchMessage;
                    }
                    oneSideNoMatchMessage.isReply = nb5Var.g();
                }
            }
        }

        public void serialize(OneSideNoMatchMessage oneSideNoMatchMessage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, oneSideNoMatchMessage.isOneSide);
            codedOutputByteBufferNano.A(2, oneSideNoMatchMessage.isReply);
        }
    };
    public static JsonAdapter<OneSideNoMatchMessage> JSON_ADAPTER = new ObjectJsonAdapter<OneSideNoMatchMessage>() { // from class: com.p1.mobile.putong.core.data.OneSideNoMatchMessage.2
        public Class getDataClass() {
            return OneSideNoMatchMessage.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public OneSideNoMatchMessage m14662newInstance() {
            return new OneSideNoMatchMessage();
        }

        public boolean parseField(OneSideNoMatchMessage oneSideNoMatchMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("isOneSide")) {
                oneSideNoMatchMessage.isOneSide = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("isReply")) {
                return false;
            }
            oneSideNoMatchMessage.isReply = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(OneSideNoMatchMessage oneSideNoMatchMessage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("isOneSide") || str.equals("isReply")) {
                return true;
            }
            return super.parseFieldCheck(oneSideNoMatchMessage, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(OneSideNoMatchMessage oneSideNoMatchMessage, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isOneSide", oneSideNoMatchMessage.isOneSide);
            jsonGenerator.writeBooleanField("isReply", oneSideNoMatchMessage.isReply);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OneSideNoMatchMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OneSideNoMatchMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OneSideNoMatchMessage new_() {
        OneSideNoMatchMessage oneSideNoMatchMessage = new OneSideNoMatchMessage();
        oneSideNoMatchMessage.nullCheck();
        return oneSideNoMatchMessage;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OneSideNoMatchMessage m14660clone() {
        OneSideNoMatchMessage oneSideNoMatchMessage = new OneSideNoMatchMessage();
        oneSideNoMatchMessage.isOneSide = this.isOneSide;
        oneSideNoMatchMessage.isReply = this.isReply;
        return oneSideNoMatchMessage;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OneSideNoMatchMessage)) {
            return false;
        }
        OneSideNoMatchMessage oneSideNoMatchMessage = (OneSideNoMatchMessage) obj;
        return this.isOneSide == oneSideNoMatchMessage.isOneSide && this.isReply == oneSideNoMatchMessage.isReply;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.isOneSide ? 1231 : 1237)) * 41) + (this.isReply ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
