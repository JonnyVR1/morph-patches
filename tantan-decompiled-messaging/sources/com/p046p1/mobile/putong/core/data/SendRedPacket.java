package com.p046p1.mobile.putong.core.data;

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
public class SendRedPacket extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "sendredpacket";

    @ProtobufIndex(index = 1)
    public boolean active;
    public static ProtobufAdapter<SendRedPacket> PROTOBUF_ADAPTER = new MessageNanoAdapter<SendRedPacket>() { // from class: com.p1.mobile.putong.core.data.SendRedPacket.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SendRedPacket sendRedPacket) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, sendRedPacket.active);
            sendRedPacket.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SendRedPacket parse(nb5 nb5Var) throws IOException {
            SendRedPacket sendRedPacket = new SendRedPacket();
            while (nb5Var.m158752u() == 8) {
                sendRedPacket.active = nb5Var.m158738g();
            }
            return sendRedPacket;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SendRedPacket sendRedPacket, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, sendRedPacket.active);
        }
    };
    public static JsonAdapter<SendRedPacket> JSON_ADAPTER = new ObjectJsonAdapter<SendRedPacket>() { // from class: com.p1.mobile.putong.core.data.SendRedPacket.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SendRedPacket.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SendRedPacket newInstance() {
            return new SendRedPacket();
        }

        public boolean parseField(SendRedPacket sendRedPacket, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(Active.TYPE)) {
                return false;
            }
            sendRedPacket.active = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(SendRedPacket sendRedPacket, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Active.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(sendRedPacket, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SendRedPacket sendRedPacket, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(Active.TYPE, sendRedPacket.active);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SendRedPacket) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SendRedPacket) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SendRedPacket new_() {
        SendRedPacket sendRedPacket = new SendRedPacket();
        sendRedPacket.nullCheck();
        return sendRedPacket;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SendRedPacket mo223809clone() {
        SendRedPacket sendRedPacket = new SendRedPacket();
        sendRedPacket.active = this.active;
        return sendRedPacket;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof SendRedPacket) && this.active == ((SendRedPacket) obj).active;
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
        int i2 = (i * 41) + (this.active ? 1231 : 1237);
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
