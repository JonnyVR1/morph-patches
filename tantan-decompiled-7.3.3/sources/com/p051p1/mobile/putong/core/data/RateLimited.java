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
public class RateLimited extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "ratelimited";

    @ProtobufIndex(index = 4)
    public boolean memojiBuzz;

    @ProtobufIndex(index = 1)
    public boolean textBuzz;

    @ProtobufIndex(index = 3)
    public boolean videoBuzz;

    @ProtobufIndex(index = 2)
    public boolean voiceBuzz;
    public static ProtobufAdapter<RateLimited> PROTOBUF_ADAPTER = new MessageNanoAdapter<RateLimited>() { // from class: com.p1.mobile.putong.core.data.RateLimited.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RateLimited rateLimited) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, rateLimited.textBuzz) + CodedOutputByteBufferNano.m17275b(2, rateLimited.voiceBuzz) + CodedOutputByteBufferNano.m17275b(3, rateLimited.videoBuzz) + CodedOutputByteBufferNano.m17275b(4, rateLimited.memojiBuzz);
            rateLimited.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RateLimited parse(nc5 nc5Var) throws IOException {
            RateLimited rateLimited = new RateLimited();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    rateLimited.textBuzz = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    rateLimited.voiceBuzz = nc5Var.m162483g();
                } else if (iM162497u == 24) {
                    rateLimited.videoBuzz = nc5Var.m162483g();
                } else {
                    if (iM162497u != 32) {
                        return rateLimited;
                    }
                    rateLimited.memojiBuzz = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RateLimited rateLimited, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, rateLimited.textBuzz);
            codedOutputByteBufferNano.m17299A(2, rateLimited.voiceBuzz);
            codedOutputByteBufferNano.m17299A(3, rateLimited.videoBuzz);
            codedOutputByteBufferNano.m17299A(4, rateLimited.memojiBuzz);
        }
    };
    public static JsonAdapter<RateLimited> JSON_ADAPTER = new ObjectJsonAdapter<RateLimited>() { // from class: com.p1.mobile.putong.core.data.RateLimited.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RateLimited.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RateLimited newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RateLimited rateLimited, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("textBuzz", rateLimited.textBuzz);
            jsonGenerator.writeBooleanField("voiceBuzz", rateLimited.voiceBuzz);
            jsonGenerator.writeBooleanField("videoBuzz", rateLimited.videoBuzz);
            jsonGenerator.writeBooleanField("memojiBuzz", rateLimited.memojiBuzz);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RateLimited) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RateLimited) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RateLimited new_() {
        RateLimited rateLimited = new RateLimited();
        rateLimited.nullCheck();
        return rateLimited;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RateLimited mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((i * 41) + (this.textBuzz ? 1231 : 1237)) * 41) + (this.voiceBuzz ? 1231 : 1237)) * 41) + (this.videoBuzz ? 1231 : 1237)) * 41) + (this.memojiBuzz ? 1231 : 1237);
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
