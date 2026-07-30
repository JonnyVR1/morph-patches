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
public class PinChat extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "pinchat";

    @ProtobufIndex(index = 1)
    public boolean pin;
    public static ProtobufAdapter<PinChat> PROTOBUF_ADAPTER = new MessageNanoAdapter<PinChat>() { // from class: com.p1.mobile.putong.core.data.PinChat.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PinChat pinChat) {
            int iB = CodedOutputByteBufferNano.b(1, pinChat.pin);
            ((MessageNano) pinChat).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PinChat m14809parse(nb5 nb5Var) throws IOException {
            PinChat pinChat = new PinChat();
            while (nb5Var.u() == 8) {
                pinChat.pin = nb5Var.g();
            }
            return pinChat;
        }

        public void serialize(PinChat pinChat, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, pinChat.pin);
        }
    };
    public static JsonAdapter<PinChat> JSON_ADAPTER = new ObjectJsonAdapter<PinChat>() { // from class: com.p1.mobile.putong.core.data.PinChat.2
        public Class getDataClass() {
            return PinChat.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PinChat m14810newInstance() {
            return new PinChat();
        }

        public boolean parseField(PinChat pinChat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("pin")) {
                return false;
            }
            pinChat.pin = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(PinChat pinChat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("pin")) {
                return true;
            }
            return super.parseFieldCheck(pinChat, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(PinChat pinChat, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("pin", pinChat.pin);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PinChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PinChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PinChat new_() {
        PinChat pinChat = new PinChat();
        pinChat.nullCheck();
        return pinChat;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PinChat m14808clone() {
        PinChat pinChat = new PinChat();
        pinChat.pin = this.pin;
        return pinChat;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof PinChat) && this.pin == ((PinChat) obj).pin;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.pin ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
