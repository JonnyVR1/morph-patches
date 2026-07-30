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
public class RemainingBonus extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "remainingbonus";

    @ProtobufIndex(index = 4)
    public int memojiBuzz;

    @ProtobufIndex(index = 1)
    public int textBuzz;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int videoBuzz;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int voiceBuzz;
    public static ProtobufAdapter<RemainingBonus> PROTOBUF_ADAPTER = new MessageNanoAdapter<RemainingBonus>() { // from class: com.p1.mobile.putong.core.data.RemainingBonus.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RemainingBonus remainingBonus) {
            int iH = CodedOutputByteBufferNano.h(1, remainingBonus.textBuzz) + CodedOutputByteBufferNano.h(2, remainingBonus.voiceBuzz) + CodedOutputByteBufferNano.h(3, remainingBonus.videoBuzz) + CodedOutputByteBufferNano.h(4, remainingBonus.memojiBuzz);
            ((MessageNano) remainingBonus).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RemainingBonus m15383parse(nb5 nb5Var) throws IOException {
            RemainingBonus remainingBonus = new RemainingBonus();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    remainingBonus.textBuzz = nb5Var.j();
                } else if (iU == 16) {
                    remainingBonus.voiceBuzz = nb5Var.j();
                } else if (iU == 24) {
                    remainingBonus.videoBuzz = nb5Var.j();
                } else {
                    if (iU != 32) {
                        return remainingBonus;
                    }
                    remainingBonus.memojiBuzz = nb5Var.j();
                }
            }
        }

        public void serialize(RemainingBonus remainingBonus, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, remainingBonus.textBuzz);
            codedOutputByteBufferNano.G(2, remainingBonus.voiceBuzz);
            codedOutputByteBufferNano.G(3, remainingBonus.videoBuzz);
            codedOutputByteBufferNano.G(4, remainingBonus.memojiBuzz);
        }
    };
    public static JsonAdapter<RemainingBonus> JSON_ADAPTER = new ObjectJsonAdapter<RemainingBonus>() { // from class: com.p1.mobile.putong.core.data.RemainingBonus.2
        public Class getDataClass() {
            return RemainingBonus.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RemainingBonus m15384newInstance() {
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

        public void serializeFields(RemainingBonus remainingBonus, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("textBuzz", remainingBonus.textBuzz);
            jsonGenerator.writeNumberField("voiceBuzz", remainingBonus.voiceBuzz);
            jsonGenerator.writeNumberField("videoBuzz", remainingBonus.videoBuzz);
            jsonGenerator.writeNumberField("memojiBuzz", remainingBonus.memojiBuzz);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RemainingBonus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RemainingBonus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RemainingBonus new_() {
        RemainingBonus remainingBonus = new RemainingBonus();
        remainingBonus.nullCheck();
        return remainingBonus;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RemainingBonus m15382clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((i * 41) + this.textBuzz) * 41) + this.voiceBuzz) * 41) + this.videoBuzz) * 41) + this.memojiBuzz;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
