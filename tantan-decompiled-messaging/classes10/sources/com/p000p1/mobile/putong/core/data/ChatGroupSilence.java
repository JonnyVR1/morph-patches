package com.p000p1.mobile.putong.core.data;

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
public class ChatGroupSilence extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatgroupsilence";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public long duration;

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public double until;
    public static ProtobufAdapter<ChatGroupSilence> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatGroupSilence>() { // from class: com.p1.mobile.putong.core.data.ChatGroupSilence.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatGroupSilence chatGroupSilence) {
            int iB = CodedOutputByteBufferNano.b(1, chatGroupSilence.enable) + CodedOutputByteBufferNano.j(2, chatGroupSilence.duration) + CodedOutputByteBufferNano.d(3, chatGroupSilence.until);
            ((MessageNano) chatGroupSilence).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatGroupSilence m12033parse(nb5 nb5Var) throws IOException {
            ChatGroupSilence chatGroupSilence = new ChatGroupSilence();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    chatGroupSilence.enable = nb5Var.g();
                } else if (iU == 16) {
                    chatGroupSilence.duration = nb5Var.k();
                } else {
                    if (iU != 25) {
                        return chatGroupSilence;
                    }
                    chatGroupSilence.until = nb5Var.h();
                }
            }
        }

        public void serialize(ChatGroupSilence chatGroupSilence, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, chatGroupSilence.enable);
            codedOutputByteBufferNano.I(2, chatGroupSilence.duration);
            codedOutputByteBufferNano.C(3, chatGroupSilence.until);
        }
    };
    public static JsonAdapter<ChatGroupSilence> JSON_ADAPTER = new ObjectJsonAdapter<ChatGroupSilence>() { // from class: com.p1.mobile.putong.core.data.ChatGroupSilence.2
        public Class getDataClass() {
            return ChatGroupSilence.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatGroupSilence m12034newInstance() {
            return new ChatGroupSilence();
        }

        public boolean parseField(ChatGroupSilence chatGroupSilence, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    chatGroupSilence.duration = jsonParser.getValueAsLong();
                    return true;
                case "enable":
                    chatGroupSilence.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "until":
                    chatGroupSilence.until = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChatGroupSilence chatGroupSilence, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "duration":
                case "enable":
                case "until":
                    return true;
                default:
                    return super.parseFieldCheck(chatGroupSilence, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ChatGroupSilence chatGroupSilence, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", chatGroupSilence.enable);
            jsonGenerator.writeNumberField("duration", chatGroupSilence.duration);
            jsonGenerator.writeFieldName("until");
            Converter.API_TIME.serialize(Double.valueOf(chatGroupSilence.until), jsonGenerator, true);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatGroupSilence) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatGroupSilence) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatGroupSilence new_() {
        ChatGroupSilence chatGroupSilence = new ChatGroupSilence();
        chatGroupSilence.nullCheck();
        return chatGroupSilence;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatGroupSilence m12032clone() {
        ChatGroupSilence chatGroupSilence = new ChatGroupSilence();
        chatGroupSilence.enable = this.enable;
        chatGroupSilence.duration = this.duration;
        chatGroupSilence.until = this.until;
        return chatGroupSilence;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatGroupSilence)) {
            return false;
        }
        ChatGroupSilence chatGroupSilence = (ChatGroupSilence) obj;
        return this.enable == chatGroupSilence.enable && this.duration == chatGroupSilence.duration && this.until == chatGroupSilence.until;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.enable ? 1231 : 1237)) * 41;
        long j = this.duration;
        int i3 = i2 + ((int) (j ^ (j >>> 32)));
        long jDoubleToLongBits = Double.doubleToLongBits(this.until);
        int i4 = (i3 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        ((ValueObject) this).hashCode = i4;
        return i4;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
