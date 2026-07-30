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
public class PinChat extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "pinchat";

    @ProtobufIndex(index = 1)
    public boolean pin;
    public static ProtobufAdapter<PinChat> PROTOBUF_ADAPTER = new MessageNanoAdapter<PinChat>() { // from class: com.p1.mobile.putong.core.data.PinChat.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PinChat pinChat) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, pinChat.pin);
            pinChat.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PinChat parse(nc5 nc5Var) throws IOException {
            PinChat pinChat = new PinChat();
            while (nc5Var.m162497u() == 8) {
                pinChat.pin = nc5Var.m162483g();
            }
            return pinChat;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PinChat pinChat, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, pinChat.pin);
        }
    };
    public static JsonAdapter<PinChat> JSON_ADAPTER = new ObjectJsonAdapter<PinChat>() { // from class: com.p1.mobile.putong.core.data.PinChat.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PinChat.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PinChat newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PinChat pinChat, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("pin", pinChat.pin);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PinChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PinChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PinChat new_() {
        PinChat pinChat = new PinChat();
        pinChat.nullCheck();
        return pinChat;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PinChat mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.pin ? 1231 : 1237);
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
