package com.p046p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
public class RemainingBonus extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "remainingbonus";

    @ProtobufIndex(index = 4)
    public int memojiBuzz;

    @ProtobufIndex(index = 1)
    public int textBuzz;

    @ProtobufIndex(index = 3)
    public int videoBuzz;

    @ProtobufIndex(index = 2)
    public int voiceBuzz;
    public static ProtobufAdapter<RemainingBonus> PROTOBUF_ADAPTER = new MessageNanoAdapter<RemainingBonus>() { // from class: com.p1.mobile.putong.core.data.RemainingBonus.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RemainingBonus remainingBonus) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, remainingBonus.textBuzz) + CodedOutputByteBufferNano.m17226h(2, remainingBonus.voiceBuzz) + CodedOutputByteBufferNano.m17226h(3, remainingBonus.videoBuzz) + CodedOutputByteBufferNano.m17226h(4, remainingBonus.memojiBuzz);
            remainingBonus.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RemainingBonus parse(nb5 nb5Var) throws IOException {
            RemainingBonus remainingBonus = new RemainingBonus();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    remainingBonus.textBuzz = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    remainingBonus.voiceBuzz = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    remainingBonus.videoBuzz = nb5Var.m158741j();
                } else {
                    if (iM158752u != 32) {
                        return remainingBonus;
                    }
                    remainingBonus.memojiBuzz = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RemainingBonus remainingBonus, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, remainingBonus.textBuzz);
            codedOutputByteBufferNano.m17250G(2, remainingBonus.voiceBuzz);
            codedOutputByteBufferNano.m17250G(3, remainingBonus.videoBuzz);
            codedOutputByteBufferNano.m17250G(4, remainingBonus.memojiBuzz);
        }
    };
    public static JsonAdapter<RemainingBonus> JSON_ADAPTER = new ObjectJsonAdapter<RemainingBonus>() { // from class: com.p1.mobile.putong.core.data.RemainingBonus.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RemainingBonus.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RemainingBonus newInstance() {
            return new RemainingBonus();
        }

        public boolean parseField(RemainingBonus remainingBonus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "voiceBuzz":
                    remainingBonus.voiceBuzz = jsonParser.getValueAsInt();
                    return true;
                case "textBuzz":
                    remainingBonus.textBuzz = jsonParser.getValueAsInt();
                    return true;
                case "videoBuzz":
                    remainingBonus.videoBuzz = jsonParser.getValueAsInt();
                    return true;
                case "memojiBuzz":
                    remainingBonus.memojiBuzz = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RemainingBonus remainingBonus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "voiceBuzz":
                case "textBuzz":
                case "videoBuzz":
                case "memojiBuzz":
                    return true;
                default:
                    return super.parseFieldCheck(remainingBonus, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RemainingBonus remainingBonus, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("textBuzz", remainingBonus.textBuzz);
            jsonGenerator.writeNumberField("voiceBuzz", remainingBonus.voiceBuzz);
            jsonGenerator.writeNumberField("videoBuzz", remainingBonus.videoBuzz);
            jsonGenerator.writeNumberField("memojiBuzz", remainingBonus.memojiBuzz);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RemainingBonus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RemainingBonus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RemainingBonus new_() {
        RemainingBonus remainingBonus = new RemainingBonus();
        remainingBonus.nullCheck();
        return remainingBonus;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RemainingBonus mo223809clone() {
        RemainingBonus remainingBonus = new RemainingBonus();
        remainingBonus.textBuzz = this.textBuzz;
        remainingBonus.voiceBuzz = this.voiceBuzz;
        remainingBonus.videoBuzz = this.videoBuzz;
        remainingBonus.memojiBuzz = this.memojiBuzz;
        return remainingBonus;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RemainingBonus)) {
            return false;
        }
        RemainingBonus remainingBonus = (RemainingBonus) obj;
        return this.textBuzz == remainingBonus.textBuzz && this.voiceBuzz == remainingBonus.voiceBuzz && this.videoBuzz == remainingBonus.videoBuzz && this.memojiBuzz == remainingBonus.memojiBuzz;
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
        int i2 = (((((((i * 41) + this.textBuzz) * 41) + this.voiceBuzz) * 41) + this.videoBuzz) * 41) + this.memojiBuzz;
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
