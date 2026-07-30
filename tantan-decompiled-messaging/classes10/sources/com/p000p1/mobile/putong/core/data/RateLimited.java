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
public class RateLimited extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "ratelimited";

    @ProtobufIndex(index = 4)
    public boolean memojiBuzz;

    @ProtobufIndex(index = 1)
    public boolean textBuzz;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean videoBuzz;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean voiceBuzz;
    public static ProtobufAdapter<RateLimited> PROTOBUF_ADAPTER = new MessageNanoAdapter<RateLimited>() { // from class: com.p1.mobile.putong.core.data.RateLimited.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RateLimited rateLimited) {
            int iB = CodedOutputByteBufferNano.b(1, rateLimited.textBuzz) + CodedOutputByteBufferNano.b(2, rateLimited.voiceBuzz) + CodedOutputByteBufferNano.b(3, rateLimited.videoBuzz) + CodedOutputByteBufferNano.b(4, rateLimited.memojiBuzz);
            ((MessageNano) rateLimited).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RateLimited m15225parse(nb5 nb5Var) throws IOException {
            RateLimited rateLimited = new RateLimited();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    rateLimited.textBuzz = nb5Var.g();
                } else if (iU == 16) {
                    rateLimited.voiceBuzz = nb5Var.g();
                } else if (iU == 24) {
                    rateLimited.videoBuzz = nb5Var.g();
                } else {
                    if (iU != 32) {
                        return rateLimited;
                    }
                    rateLimited.memojiBuzz = nb5Var.g();
                }
            }
        }

        public void serialize(RateLimited rateLimited, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, rateLimited.textBuzz);
            codedOutputByteBufferNano.A(2, rateLimited.voiceBuzz);
            codedOutputByteBufferNano.A(3, rateLimited.videoBuzz);
            codedOutputByteBufferNano.A(4, rateLimited.memojiBuzz);
        }
    };
    public static JsonAdapter<RateLimited> JSON_ADAPTER = new ObjectJsonAdapter<RateLimited>() { // from class: com.p1.mobile.putong.core.data.RateLimited.2
        public Class getDataClass() {
            return RateLimited.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RateLimited m15226newInstance() {
            return new RateLimited();
        }

        public boolean parseField(RateLimited rateLimited, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "voiceBuzz":
                    rateLimited.voiceBuzz = jsonParser.getValueAsBoolean();
                    return true;
                case "textBuzz":
                    rateLimited.textBuzz = jsonParser.getValueAsBoolean();
                    return true;
                case "videoBuzz":
                    rateLimited.videoBuzz = jsonParser.getValueAsBoolean();
                    return true;
                case "memojiBuzz":
                    rateLimited.memojiBuzz = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RateLimited rateLimited, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "voiceBuzz":
                case "textBuzz":
                case "videoBuzz":
                case "memojiBuzz":
                    return true;
                default:
                    return super.parseFieldCheck(rateLimited, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(RateLimited rateLimited, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("textBuzz", rateLimited.textBuzz);
            jsonGenerator.writeBooleanField("voiceBuzz", rateLimited.voiceBuzz);
            jsonGenerator.writeBooleanField("videoBuzz", rateLimited.videoBuzz);
            jsonGenerator.writeBooleanField("memojiBuzz", rateLimited.memojiBuzz);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RateLimited) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RateLimited) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RateLimited new_() {
        RateLimited rateLimited = new RateLimited();
        rateLimited.nullCheck();
        return rateLimited;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RateLimited m15224clone() {
        RateLimited rateLimited = new RateLimited();
        rateLimited.textBuzz = this.textBuzz;
        rateLimited.voiceBuzz = this.voiceBuzz;
        rateLimited.videoBuzz = this.videoBuzz;
        rateLimited.memojiBuzz = this.memojiBuzz;
        return rateLimited;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RateLimited)) {
            return false;
        }
        RateLimited rateLimited = (RateLimited) obj;
        return this.textBuzz == rateLimited.textBuzz && this.voiceBuzz == rateLimited.voiceBuzz && this.videoBuzz == rateLimited.videoBuzz && this.memojiBuzz == rateLimited.memojiBuzz;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((i * 41) + (this.textBuzz ? 1231 : 1237)) * 41) + (this.voiceBuzz ? 1231 : 1237)) * 41) + (this.videoBuzz ? 1231 : 1237)) * 41) + (this.memojiBuzz ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
