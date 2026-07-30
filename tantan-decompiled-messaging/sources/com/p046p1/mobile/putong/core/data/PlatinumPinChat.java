package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
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
public class PlatinumPinChat extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "platinumpinchat";

    @ProtobufIndex(index = 3)
    public double expireTime;

    @ProtobufIndex(index = 2)
    public boolean pin;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<PlatinumPinChat> PROTOBUF_ADAPTER = new MessageNanoAdapter<PlatinumPinChat>() { // from class: com.p1.mobile.putong.core.data.PlatinumPinChat.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PlatinumPinChat platinumPinChat) {
            String str = platinumPinChat.userId;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17220b(2, platinumPinChat.pin) + CodedOutputByteBufferNano.m17222d(3, platinumPinChat.expireTime);
            platinumPinChat.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PlatinumPinChat parse(nb5 nb5Var) throws IOException {
            PlatinumPinChat platinumPinChat = new PlatinumPinChat();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (platinumPinChat.userId != null) {
                        break;
                    }
                    platinumPinChat.userId = "";
                    break;
                }
                if (iM158752u == 10) {
                    platinumPinChat.userId = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    platinumPinChat.pin = nb5Var.m158738g();
                } else {
                    if (iM158752u != 25) {
                        if (platinumPinChat.userId != null) {
                            break;
                        }
                        platinumPinChat.userId = "";
                        return platinumPinChat;
                    }
                    platinumPinChat.expireTime = nb5Var.m158739h();
                }
            }
            return platinumPinChat;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PlatinumPinChat platinumPinChat, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = platinumPinChat.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17244A(2, platinumPinChat.pin);
            codedOutputByteBufferNano.m17246C(3, platinumPinChat.expireTime);
        }
    };
    public static JsonAdapter<PlatinumPinChat> JSON_ADAPTER = new ObjectJsonAdapter<PlatinumPinChat>() { // from class: com.p1.mobile.putong.core.data.PlatinumPinChat.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PlatinumPinChat.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PlatinumPinChat newInstance() {
            return new PlatinumPinChat();
        }

        public boolean parseField(PlatinumPinChat platinumPinChat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    platinumPinChat.userId = jsonParser.getValueAsString();
                    return true;
                case "expireTime":
                    platinumPinChat.expireTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "pin":
                    platinumPinChat.pin = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PlatinumPinChat platinumPinChat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userId":
                case "expireTime":
                case "pin":
                    return true;
                default:
                    return super.parseFieldCheck(platinumPinChat, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PlatinumPinChat platinumPinChat, JsonGenerator jsonGenerator) throws IOException {
            String str = platinumPinChat.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeBooleanField("pin", platinumPinChat.pin);
            jsonGenerator.writeFieldName("expireTime");
            Converter.API_TIME.serialize(Double.valueOf(platinumPinChat.expireTime), jsonGenerator, true);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PlatinumPinChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PlatinumPinChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PlatinumPinChat new_() {
        PlatinumPinChat platinumPinChat = new PlatinumPinChat();
        platinumPinChat.nullCheck();
        return platinumPinChat;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PlatinumPinChat mo223809clone() {
        PlatinumPinChat platinumPinChat = new PlatinumPinChat();
        platinumPinChat.userId = this.userId;
        platinumPinChat.pin = this.pin;
        platinumPinChat.expireTime = this.expireTime;
        return platinumPinChat;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlatinumPinChat)) {
            return false;
        }
        PlatinumPinChat platinumPinChat = (PlatinumPinChat) obj;
        return ValueObject.util_equals(this.userId, platinumPinChat.userId) && this.pin == platinumPinChat.pin && this.expireTime == platinumPinChat.expireTime;
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
        int i2 = i * 41;
        String str = this.userId;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.pin ? 1231 : 1237);
        long jDoubleToLongBits = Double.doubleToLongBits(this.expireTime);
        int i3 = (iHashCode * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
