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
public class OneSideNoMatchMessage extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "onesidenomatchmessage";

    @ProtobufIndex(index = 1)
    public boolean isOneSide;

    @ProtobufIndex(index = 2)
    public boolean isReply;
    public static ProtobufAdapter<OneSideNoMatchMessage> PROTOBUF_ADAPTER = new MessageNanoAdapter<OneSideNoMatchMessage>() { // from class: com.p1.mobile.putong.core.data.OneSideNoMatchMessage.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OneSideNoMatchMessage oneSideNoMatchMessage) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, oneSideNoMatchMessage.isOneSide) + CodedOutputByteBufferNano.m17275b(2, oneSideNoMatchMessage.isReply);
            oneSideNoMatchMessage.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OneSideNoMatchMessage parse(nc5 nc5Var) throws IOException {
            OneSideNoMatchMessage oneSideNoMatchMessage = new OneSideNoMatchMessage();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    oneSideNoMatchMessage.isOneSide = nc5Var.m162483g();
                } else {
                    if (iM162497u != 16) {
                        return oneSideNoMatchMessage;
                    }
                    oneSideNoMatchMessage.isReply = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OneSideNoMatchMessage oneSideNoMatchMessage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, oneSideNoMatchMessage.isOneSide);
            codedOutputByteBufferNano.m17299A(2, oneSideNoMatchMessage.isReply);
        }
    };
    public static JsonAdapter<OneSideNoMatchMessage> JSON_ADAPTER = new ObjectJsonAdapter<OneSideNoMatchMessage>() { // from class: com.p1.mobile.putong.core.data.OneSideNoMatchMessage.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OneSideNoMatchMessage.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OneSideNoMatchMessage newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OneSideNoMatchMessage oneSideNoMatchMessage, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isOneSide", oneSideNoMatchMessage.isOneSide);
            jsonGenerator.writeBooleanField("isReply", oneSideNoMatchMessage.isReply);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OneSideNoMatchMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OneSideNoMatchMessage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OneSideNoMatchMessage new_() {
        OneSideNoMatchMessage oneSideNoMatchMessage = new OneSideNoMatchMessage();
        oneSideNoMatchMessage.nullCheck();
        return oneSideNoMatchMessage;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OneSideNoMatchMessage mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.isOneSide ? 1231 : 1237)) * 41) + (this.isReply ? 1231 : 1237);
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
