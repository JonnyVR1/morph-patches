package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
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
public class PlatinumPinChat extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "platinumpinchat";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public double expireTime;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean pin;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<PlatinumPinChat> PROTOBUF_ADAPTER = new MessageNanoAdapter<PlatinumPinChat>() { // from class: com.p1.mobile.putong.core.data.PlatinumPinChat.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PlatinumPinChat platinumPinChat) {
            String str = platinumPinChat.userId;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.b(2, platinumPinChat.pin) + CodedOutputByteBufferNano.d(3, platinumPinChat.expireTime);
            ((MessageNano) platinumPinChat).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PlatinumPinChat m14821parse(nb5 nb5Var) throws IOException {
            PlatinumPinChat platinumPinChat = new PlatinumPinChat();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (platinumPinChat.userId != null) {
                        break;
                    }
                    platinumPinChat.userId = "";
                    break;
                }
                if (iU == 10) {
                    platinumPinChat.userId = nb5Var.s();
                } else if (iU == 16) {
                    platinumPinChat.pin = nb5Var.g();
                } else {
                    if (iU != 25) {
                        if (platinumPinChat.userId != null) {
                            break;
                        }
                        platinumPinChat.userId = "";
                        return platinumPinChat;
                    }
                    platinumPinChat.expireTime = nb5Var.h();
                }
            }
            return platinumPinChat;
        }

        public void serialize(PlatinumPinChat platinumPinChat, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = platinumPinChat.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.A(2, platinumPinChat.pin);
            codedOutputByteBufferNano.C(3, platinumPinChat.expireTime);
        }
    };
    public static JsonAdapter<PlatinumPinChat> JSON_ADAPTER = new ObjectJsonAdapter<PlatinumPinChat>() { // from class: com.p1.mobile.putong.core.data.PlatinumPinChat.2
        public Class getDataClass() {
            return PlatinumPinChat.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PlatinumPinChat m14822newInstance() {
            return new PlatinumPinChat();
        }

        public boolean parseField(PlatinumPinChat platinumPinChat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    platinumPinChat.userId = jsonParser.getValueAsString();
                    return true;
                case "expireTime":
                    platinumPinChat.expireTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
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

        public void serializeFields(PlatinumPinChat platinumPinChat, JsonGenerator jsonGenerator) throws IOException {
            String str = platinumPinChat.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeBooleanField("pin", platinumPinChat.pin);
            jsonGenerator.writeFieldName("expireTime");
            Converter.API_TIME.serialize(Double.valueOf(platinumPinChat.expireTime), jsonGenerator, true);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PlatinumPinChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PlatinumPinChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PlatinumPinChat new_() {
        PlatinumPinChat platinumPinChat = new PlatinumPinChat();
        platinumPinChat.nullCheck();
        return platinumPinChat;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PlatinumPinChat m14820clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.userId;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.pin ? 1231 : 1237);
        long jDoubleToLongBits = Double.doubleToLongBits(this.expireTime);
        int i3 = (iHashCode * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
