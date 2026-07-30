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
public class ContinuousChat extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "continuouschat";

    @ProtobufIndex(index = 1)
    public int days;

    @ProtobufIndex(index = 2)
    public long lastTime;

    @ProtobufIndex(index = 3)
    public int todayMM;
    public static ProtobufAdapter<ContinuousChat> PROTOBUF_ADAPTER = new MessageNanoAdapter<ContinuousChat>() { // from class: com.p1.mobile.putong.core.data.ContinuousChat.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ContinuousChat continuousChat) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, continuousChat.days) + CodedOutputByteBufferNano.m17283j(2, continuousChat.lastTime) + CodedOutputByteBufferNano.m17281h(3, continuousChat.todayMM);
            continuousChat.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ContinuousChat parse(nc5 nc5Var) throws IOException {
            ContinuousChat continuousChat = new ContinuousChat();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    continuousChat.days = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    continuousChat.lastTime = nc5Var.m162487k();
                } else {
                    if (iM162497u != 24) {
                        return continuousChat;
                    }
                    continuousChat.todayMM = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ContinuousChat continuousChat, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, continuousChat.days);
            codedOutputByteBufferNano.m17307I(2, continuousChat.lastTime);
            codedOutputByteBufferNano.m17305G(3, continuousChat.todayMM);
        }
    };
    public static JsonAdapter<ContinuousChat> JSON_ADAPTER = new ObjectJsonAdapter<ContinuousChat>() { // from class: com.p1.mobile.putong.core.data.ContinuousChat.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ContinuousChat.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ContinuousChat newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ContinuousChat continuousChat, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("days", continuousChat.days);
            jsonGenerator.writeNumberField("lastTime", continuousChat.lastTime);
            jsonGenerator.writeNumberField("todayMM", continuousChat.todayMM);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ContinuousChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ContinuousChat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ContinuousChat new_() {
        ContinuousChat continuousChat = new ContinuousChat();
        continuousChat.nullCheck();
        return continuousChat;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ContinuousChat mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.days) * 41;
        long j = this.lastTime;
        int i3 = ((i2 + ((int) (j ^ (j >>> 32)))) * 41) + this.todayMM;
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
