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
public class KeepConnection extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "keepconnection";

    @ProtobufIndex(index = 1)
    public int chatTypingInterval;

    @ProtobufIndex(index = 2)
    public boolean chatTypingOpen;
    public static ProtobufAdapter<KeepConnection> PROTOBUF_ADAPTER = new MessageNanoAdapter<KeepConnection>() { // from class: com.p1.mobile.putong.core.data.KeepConnection.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(KeepConnection keepConnection) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, keepConnection.chatTypingInterval) + CodedOutputByteBufferNano.m17275b(2, keepConnection.chatTypingOpen);
            keepConnection.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public KeepConnection parse(nc5 nc5Var) throws IOException {
            KeepConnection keepConnection = new KeepConnection();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    keepConnection.chatTypingInterval = nc5Var.m162486j();
                } else {
                    if (iM162497u != 16) {
                        return keepConnection;
                    }
                    keepConnection.chatTypingOpen = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(KeepConnection keepConnection, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, keepConnection.chatTypingInterval);
            codedOutputByteBufferNano.m17299A(2, keepConnection.chatTypingOpen);
        }
    };
    public static JsonAdapter<KeepConnection> JSON_ADAPTER = new ObjectJsonAdapter<KeepConnection>() { // from class: com.p1.mobile.putong.core.data.KeepConnection.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return KeepConnection.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public KeepConnection newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(KeepConnection keepConnection, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("chatTypingInterval", keepConnection.chatTypingInterval);
            jsonGenerator.writeBooleanField("chatTypingOpen", keepConnection.chatTypingOpen);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((KeepConnection) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((KeepConnection) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static KeepConnection new_() {
        KeepConnection keepConnection = new KeepConnection();
        keepConnection.nullCheck();
        return keepConnection;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public KeepConnection mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.chatTypingInterval) * 41) + (this.chatTypingOpen ? 1231 : 1237);
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
