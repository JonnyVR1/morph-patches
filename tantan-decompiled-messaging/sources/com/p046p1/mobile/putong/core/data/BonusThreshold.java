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
public class BonusThreshold extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bonusthreshold";

    @ProtobufIndex(index = 4)
    public int memojiBuzz;

    @ProtobufIndex(index = 1)
    public int textBuzz;

    @ProtobufIndex(index = 3)
    public int videoBuzz;

    @ProtobufIndex(index = 2)
    public int voiceBuzz;
    public static ProtobufAdapter<BonusThreshold> PROTOBUF_ADAPTER = new MessageNanoAdapter<BonusThreshold>() { // from class: com.p1.mobile.putong.core.data.BonusThreshold.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BonusThreshold bonusThreshold) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, bonusThreshold.textBuzz) + CodedOutputByteBufferNano.m17226h(2, bonusThreshold.voiceBuzz) + CodedOutputByteBufferNano.m17226h(3, bonusThreshold.videoBuzz) + CodedOutputByteBufferNano.m17226h(4, bonusThreshold.memojiBuzz);
            bonusThreshold.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BonusThreshold parse(nb5 nb5Var) throws IOException {
            BonusThreshold bonusThreshold = new BonusThreshold();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    bonusThreshold.textBuzz = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    bonusThreshold.voiceBuzz = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    bonusThreshold.videoBuzz = nb5Var.m158741j();
                } else {
                    if (iM158752u != 32) {
                        return bonusThreshold;
                    }
                    bonusThreshold.memojiBuzz = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BonusThreshold bonusThreshold, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, bonusThreshold.textBuzz);
            codedOutputByteBufferNano.m17250G(2, bonusThreshold.voiceBuzz);
            codedOutputByteBufferNano.m17250G(3, bonusThreshold.videoBuzz);
            codedOutputByteBufferNano.m17250G(4, bonusThreshold.memojiBuzz);
        }
    };
    public static JsonAdapter<BonusThreshold> JSON_ADAPTER = new ObjectJsonAdapter<BonusThreshold>() { // from class: com.p1.mobile.putong.core.data.BonusThreshold.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BonusThreshold.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BonusThreshold newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BonusThreshold bonusThreshold, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("textBuzz", bonusThreshold.textBuzz);
            jsonGenerator.writeNumberField("voiceBuzz", bonusThreshold.voiceBuzz);
            jsonGenerator.writeNumberField("videoBuzz", bonusThreshold.videoBuzz);
            jsonGenerator.writeNumberField("memojiBuzz", bonusThreshold.memojiBuzz);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BonusThreshold) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BonusThreshold) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BonusThreshold new_() {
        BonusThreshold bonusThreshold = new BonusThreshold();
        bonusThreshold.nullCheck();
        return bonusThreshold;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BonusThreshold mo223809clone() {
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
