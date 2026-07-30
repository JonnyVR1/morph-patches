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
public class SendRedPacket extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "sendredpacket";

    @ProtobufIndex(index = 1)
    public boolean active;
    public static ProtobufAdapter<SendRedPacket> PROTOBUF_ADAPTER = new MessageNanoAdapter<SendRedPacket>() { // from class: com.p1.mobile.putong.core.data.SendRedPacket.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SendRedPacket sendRedPacket) {
            int iB = CodedOutputByteBufferNano.b(1, sendRedPacket.active);
            ((MessageNano) sendRedPacket).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SendRedPacket m15585parse(nb5 nb5Var) throws IOException {
            SendRedPacket sendRedPacket = new SendRedPacket();
            while (nb5Var.u() == 8) {
                sendRedPacket.active = nb5Var.g();
            }
            return sendRedPacket;
        }

        public void serialize(SendRedPacket sendRedPacket, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, sendRedPacket.active);
        }
    };
    public static JsonAdapter<SendRedPacket> JSON_ADAPTER = new ObjectJsonAdapter<SendRedPacket>() { // from class: com.p1.mobile.putong.core.data.SendRedPacket.2
        public Class getDataClass() {
            return SendRedPacket.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SendRedPacket m15586newInstance() {
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

        public void serializeFields(SendRedPacket sendRedPacket, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(Active.TYPE, sendRedPacket.active);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SendRedPacket) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SendRedPacket) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SendRedPacket new_() {
        SendRedPacket sendRedPacket = new SendRedPacket();
        sendRedPacket.nullCheck();
        return sendRedPacket;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SendRedPacket m15584clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.active ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
