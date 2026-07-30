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
public class KeepConnection extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "keepconnection";

    @ProtobufIndex(index = 1)
    public int chatTypingInterval;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean chatTypingOpen;
    public static ProtobufAdapter<KeepConnection> PROTOBUF_ADAPTER = new MessageNanoAdapter<KeepConnection>() { // from class: com.p1.mobile.putong.core.data.KeepConnection.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(KeepConnection keepConnection) {
            int iH = CodedOutputByteBufferNano.h(1, keepConnection.chatTypingInterval) + CodedOutputByteBufferNano.b(2, keepConnection.chatTypingOpen);
            ((MessageNano) keepConnection).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public KeepConnection m13777parse(nb5 nb5Var) throws IOException {
            KeepConnection keepConnection = new KeepConnection();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    keepConnection.chatTypingInterval = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return keepConnection;
                    }
                    keepConnection.chatTypingOpen = nb5Var.g();
                }
            }
        }

        public void serialize(KeepConnection keepConnection, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, keepConnection.chatTypingInterval);
            codedOutputByteBufferNano.A(2, keepConnection.chatTypingOpen);
        }
    };
    public static JsonAdapter<KeepConnection> JSON_ADAPTER = new ObjectJsonAdapter<KeepConnection>() { // from class: com.p1.mobile.putong.core.data.KeepConnection.2
        public Class getDataClass() {
            return KeepConnection.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public KeepConnection m13778newInstance() {
            return new KeepConnection();
        }

        public boolean parseField(KeepConnection keepConnection, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("chatTypingOpen")) {
                keepConnection.chatTypingOpen = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("chatTypingInterval")) {
                return false;
            }
            keepConnection.chatTypingInterval = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(KeepConnection keepConnection, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("chatTypingOpen") || str.equals("chatTypingInterval")) {
                return true;
            }
            return super.parseFieldCheck(keepConnection, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(KeepConnection keepConnection, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("chatTypingInterval", keepConnection.chatTypingInterval);
            jsonGenerator.writeBooleanField("chatTypingOpen", keepConnection.chatTypingOpen);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((KeepConnection) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((KeepConnection) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static KeepConnection new_() {
        KeepConnection keepConnection = new KeepConnection();
        keepConnection.nullCheck();
        return keepConnection;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public KeepConnection m13776clone() {
        KeepConnection keepConnection = new KeepConnection();
        keepConnection.chatTypingInterval = this.chatTypingInterval;
        keepConnection.chatTypingOpen = this.chatTypingOpen;
        return keepConnection;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KeepConnection)) {
            return false;
        }
        KeepConnection keepConnection = (KeepConnection) obj;
        return this.chatTypingInterval == keepConnection.chatTypingInterval && this.chatTypingOpen == keepConnection.chatTypingOpen;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.chatTypingInterval) * 41) + (this.chatTypingOpen ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
