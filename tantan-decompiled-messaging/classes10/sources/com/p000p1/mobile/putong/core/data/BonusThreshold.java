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
public class BonusThreshold extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bonusthreshold";

    @ProtobufIndex(index = 4)
    public int memojiBuzz;

    @ProtobufIndex(index = 1)
    public int textBuzz;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int videoBuzz;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int voiceBuzz;
    public static ProtobufAdapter<BonusThreshold> PROTOBUF_ADAPTER = new MessageNanoAdapter<BonusThreshold>() { // from class: com.p1.mobile.putong.core.data.BonusThreshold.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BonusThreshold bonusThreshold) {
            int iH = CodedOutputByteBufferNano.h(1, bonusThreshold.textBuzz) + CodedOutputByteBufferNano.h(2, bonusThreshold.voiceBuzz) + CodedOutputByteBufferNano.h(3, bonusThreshold.videoBuzz) + CodedOutputByteBufferNano.h(4, bonusThreshold.memojiBuzz);
            ((MessageNano) bonusThreshold).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BonusThreshold m11775parse(nb5 nb5Var) throws IOException {
            BonusThreshold bonusThreshold = new BonusThreshold();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    bonusThreshold.textBuzz = nb5Var.j();
                } else if (iU == 16) {
                    bonusThreshold.voiceBuzz = nb5Var.j();
                } else if (iU == 24) {
                    bonusThreshold.videoBuzz = nb5Var.j();
                } else {
                    if (iU != 32) {
                        return bonusThreshold;
                    }
                    bonusThreshold.memojiBuzz = nb5Var.j();
                }
            }
        }

        public void serialize(BonusThreshold bonusThreshold, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, bonusThreshold.textBuzz);
            codedOutputByteBufferNano.G(2, bonusThreshold.voiceBuzz);
            codedOutputByteBufferNano.G(3, bonusThreshold.videoBuzz);
            codedOutputByteBufferNano.G(4, bonusThreshold.memojiBuzz);
        }
    };
    public static JsonAdapter<BonusThreshold> JSON_ADAPTER = new ObjectJsonAdapter<BonusThreshold>() { // from class: com.p1.mobile.putong.core.data.BonusThreshold.2
        public Class getDataClass() {
            return BonusThreshold.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public BonusThreshold m11776newInstance() {
            return new BonusThreshold();
        }

        public boolean parseField(BonusThreshold bonusThreshold, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "voiceBuzz":
                    bonusThreshold.voiceBuzz = jsonParser.getValueAsInt();
                    return true;
                case "textBuzz":
                    bonusThreshold.textBuzz = jsonParser.getValueAsInt();
                    return true;
                case "videoBuzz":
                    bonusThreshold.videoBuzz = jsonParser.getValueAsInt();
                    return true;
                case "memojiBuzz":
                    bonusThreshold.memojiBuzz = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(BonusThreshold bonusThreshold, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "voiceBuzz":
                case "textBuzz":
                case "videoBuzz":
                case "memojiBuzz":
                    return true;
                default:
                    return super.parseFieldCheck(bonusThreshold, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(BonusThreshold bonusThreshold, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("textBuzz", bonusThreshold.textBuzz);
            jsonGenerator.writeNumberField("voiceBuzz", bonusThreshold.voiceBuzz);
            jsonGenerator.writeNumberField("videoBuzz", bonusThreshold.videoBuzz);
            jsonGenerator.writeNumberField("memojiBuzz", bonusThreshold.memojiBuzz);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BonusThreshold) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BonusThreshold) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BonusThreshold new_() {
        BonusThreshold bonusThreshold = new BonusThreshold();
        bonusThreshold.nullCheck();
        return bonusThreshold;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BonusThreshold m11774clone() {
        BonusThreshold bonusThreshold = new BonusThreshold();
        bonusThreshold.textBuzz = this.textBuzz;
        bonusThreshold.voiceBuzz = this.voiceBuzz;
        bonusThreshold.videoBuzz = this.videoBuzz;
        bonusThreshold.memojiBuzz = this.memojiBuzz;
        return bonusThreshold;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BonusThreshold)) {
            return false;
        }
        BonusThreshold bonusThreshold = (BonusThreshold) obj;
        return this.textBuzz == bonusThreshold.textBuzz && this.voiceBuzz == bonusThreshold.voiceBuzz && this.videoBuzz == bonusThreshold.videoBuzz && this.memojiBuzz == bonusThreshold.memojiBuzz;
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
