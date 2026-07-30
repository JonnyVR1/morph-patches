package com.p051p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
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
public class ChatGroupSilence extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatgroupsilence";

    @ProtobufIndex(index = 2)
    public long duration;

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = 3)
    public double until;
    public static ProtobufAdapter<ChatGroupSilence> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatGroupSilence>() { // from class: com.p1.mobile.putong.core.data.ChatGroupSilence.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatGroupSilence chatGroupSilence) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, chatGroupSilence.enable) + CodedOutputByteBufferNano.m17283j(2, chatGroupSilence.duration) + CodedOutputByteBufferNano.m17277d(3, chatGroupSilence.until);
            chatGroupSilence.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatGroupSilence parse(nc5 nc5Var) throws IOException {
            ChatGroupSilence chatGroupSilence = new ChatGroupSilence();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    chatGroupSilence.enable = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    chatGroupSilence.duration = nc5Var.m162487k();
                } else {
                    if (iM162497u != 25) {
                        return chatGroupSilence;
                    }
                    chatGroupSilence.until = nc5Var.m162484h();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatGroupSilence chatGroupSilence, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, chatGroupSilence.enable);
            codedOutputByteBufferNano.m17307I(2, chatGroupSilence.duration);
            codedOutputByteBufferNano.m17301C(3, chatGroupSilence.until);
        }
    };
    public static JsonAdapter<ChatGroupSilence> JSON_ADAPTER = new ObjectJsonAdapter<ChatGroupSilence>() { // from class: com.p1.mobile.putong.core.data.ChatGroupSilence.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatGroupSilence.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatGroupSilence newInstance() {
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
                    chatGroupSilence.until = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatGroupSilence chatGroupSilence, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", chatGroupSilence.enable);
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, chatGroupSilence.duration);
            jsonGenerator.writeFieldName("until");
            Converter.API_TIME.serialize(Double.valueOf(chatGroupSilence.until), jsonGenerator, true);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatGroupSilence) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatGroupSilence) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatGroupSilence new_() {
        ChatGroupSilence chatGroupSilence = new ChatGroupSilence();
        chatGroupSilence.nullCheck();
        return chatGroupSilence;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatGroupSilence mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.enable ? 1231 : 1237)) * 41;
        long j = this.duration;
        int i3 = i2 + ((int) (j ^ (j >>> 32)));
        long jDoubleToLongBits = Double.doubleToLongBits(this.until);
        int i4 = (i3 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        this.hashCode = i4;
        return i4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
