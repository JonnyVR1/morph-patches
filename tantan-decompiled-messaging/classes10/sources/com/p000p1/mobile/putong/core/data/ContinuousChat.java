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
public class ContinuousChat extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "continuouschat";

    @ProtobufIndex(index = 1)
    public int days;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public long lastTime;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int todayMM;
    public static ProtobufAdapter<ContinuousChat> PROTOBUF_ADAPTER = new MessageNanoAdapter<ContinuousChat>() { // from class: com.p1.mobile.putong.core.data.ContinuousChat.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ContinuousChat continuousChat) {
            int iH = CodedOutputByteBufferNano.h(1, continuousChat.days) + CodedOutputByteBufferNano.j(2, continuousChat.lastTime) + CodedOutputByteBufferNano.h(3, continuousChat.todayMM);
            ((MessageNano) continuousChat).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ContinuousChat m12273parse(nb5 nb5Var) throws IOException {
            ContinuousChat continuousChat = new ContinuousChat();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    continuousChat.days = nb5Var.j();
                } else if (iU == 16) {
                    continuousChat.lastTime = nb5Var.k();
                } else {
                    if (iU != 24) {
                        return continuousChat;
                    }
                    continuousChat.todayMM = nb5Var.j();
                }
            }
        }

        public void serialize(ContinuousChat continuousChat, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, continuousChat.days);
            codedOutputByteBufferNano.I(2, continuousChat.lastTime);
            codedOutputByteBufferNano.G(3, continuousChat.todayMM);
        }
    };
    public static JsonAdapter<ContinuousChat> JSON_ADAPTER = new ObjectJsonAdapter<ContinuousChat>() { // from class: com.p1.mobile.putong.core.data.ContinuousChat.2
        public Class getDataClass() {
            return ContinuousChat.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ContinuousChat m12274newInstance() {
            return new ContinuousChat();
        }

        public boolean parseField(ContinuousChat continuousChat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "lastTime":
                    continuousChat.lastTime = jsonParser.getValueAsLong();
                    return true;
                case "todayMM":
                    continuousChat.todayMM = jsonParser.getValueAsInt();
                    return true;
                case "days":
                    continuousChat.days = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ContinuousChat continuousChat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "lastTime":
                case "todayMM":
                case "days":
                    return true;
                default:
                    return super.parseFieldCheck(continuousChat, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ContinuousChat continuousChat, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("days", continuousChat.days);
            jsonGenerator.writeNumberField("lastTime", continuousChat.lastTime);
            jsonGenerator.writeNumberField("todayMM", continuousChat.todayMM);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ContinuousChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ContinuousChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ContinuousChat new_() {
        ContinuousChat continuousChat = new ContinuousChat();
        continuousChat.nullCheck();
        return continuousChat;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ContinuousChat m12272clone() {
        ContinuousChat continuousChat = new ContinuousChat();
        continuousChat.days = this.days;
        continuousChat.lastTime = this.lastTime;
        continuousChat.todayMM = this.todayMM;
        return continuousChat;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContinuousChat)) {
            return false;
        }
        ContinuousChat continuousChat = (ContinuousChat) obj;
        return this.days == continuousChat.days && this.lastTime == continuousChat.lastTime && this.todayMM == continuousChat.todayMM;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.days) * 41;
        long j = this.lastTime;
        int i3 = ((i2 + ((int) (j ^ (j >>> 32)))) * 41) + this.todayMM;
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
