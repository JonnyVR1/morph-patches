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
public class PicExchangeEditPopWindowConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "picexchangeeditpopwindowconfig";

    @ProtobufIndex(index = 2)
    public int randomNum;

    @ProtobufIndex(index = 1)
    public long randomTime;

    @ProtobufIndex(index = 4)
    public int switchFunNum;

    @ProtobufIndex(index = 3)
    public long switchFunTime;
    public static ProtobufAdapter<PicExchangeEditPopWindowConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<PicExchangeEditPopWindowConfig>() { // from class: com.p1.mobile.putong.core.data.PicExchangeEditPopWindowConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PicExchangeEditPopWindowConfig picExchangeEditPopWindowConfig) {
            int iM17228j = CodedOutputByteBufferNano.m17228j(1, picExchangeEditPopWindowConfig.randomTime) + CodedOutputByteBufferNano.m17226h(2, picExchangeEditPopWindowConfig.randomNum) + CodedOutputByteBufferNano.m17228j(3, picExchangeEditPopWindowConfig.switchFunTime) + CodedOutputByteBufferNano.m17226h(4, picExchangeEditPopWindowConfig.switchFunNum);
            picExchangeEditPopWindowConfig.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PicExchangeEditPopWindowConfig parse(nb5 nb5Var) throws IOException {
            PicExchangeEditPopWindowConfig picExchangeEditPopWindowConfig = new PicExchangeEditPopWindowConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    picExchangeEditPopWindowConfig.randomTime = nb5Var.m158742k();
                } else if (iM158752u == 16) {
                    picExchangeEditPopWindowConfig.randomNum = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    picExchangeEditPopWindowConfig.switchFunTime = nb5Var.m158742k();
                } else {
                    if (iM158752u != 32) {
                        return picExchangeEditPopWindowConfig;
                    }
                    picExchangeEditPopWindowConfig.switchFunNum = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PicExchangeEditPopWindowConfig picExchangeEditPopWindowConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17252I(1, picExchangeEditPopWindowConfig.randomTime);
            codedOutputByteBufferNano.m17250G(2, picExchangeEditPopWindowConfig.randomNum);
            codedOutputByteBufferNano.m17252I(3, picExchangeEditPopWindowConfig.switchFunTime);
            codedOutputByteBufferNano.m17250G(4, picExchangeEditPopWindowConfig.switchFunNum);
        }
    };
    public static JsonAdapter<PicExchangeEditPopWindowConfig> JSON_ADAPTER = new ObjectJsonAdapter<PicExchangeEditPopWindowConfig>() { // from class: com.p1.mobile.putong.core.data.PicExchangeEditPopWindowConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PicExchangeEditPopWindowConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PicExchangeEditPopWindowConfig newInstance() {
            return new PicExchangeEditPopWindowConfig();
        }

        public boolean parseField(PicExchangeEditPopWindowConfig picExchangeEditPopWindowConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "randomNum":
                    picExchangeEditPopWindowConfig.randomNum = jsonParser.getValueAsInt();
                    return true;
                case "randomTime":
                    picExchangeEditPopWindowConfig.randomTime = jsonParser.getValueAsLong();
                    return true;
                case "switchFunNum":
                    picExchangeEditPopWindowConfig.switchFunNum = jsonParser.getValueAsInt();
                    return true;
                case "switchFunTime":
                    picExchangeEditPopWindowConfig.switchFunTime = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PicExchangeEditPopWindowConfig picExchangeEditPopWindowConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "randomNum":
                case "randomTime":
                case "switchFunNum":
                case "switchFunTime":
                    return true;
                default:
                    return super.parseFieldCheck(picExchangeEditPopWindowConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PicExchangeEditPopWindowConfig picExchangeEditPopWindowConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("randomTime", picExchangeEditPopWindowConfig.randomTime);
            jsonGenerator.writeNumberField("randomNum", picExchangeEditPopWindowConfig.randomNum);
            jsonGenerator.writeNumberField("switchFunTime", picExchangeEditPopWindowConfig.switchFunTime);
            jsonGenerator.writeNumberField("switchFunNum", picExchangeEditPopWindowConfig.switchFunNum);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PicExchangeEditPopWindowConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PicExchangeEditPopWindowConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PicExchangeEditPopWindowConfig new_() {
        PicExchangeEditPopWindowConfig picExchangeEditPopWindowConfig = new PicExchangeEditPopWindowConfig();
        picExchangeEditPopWindowConfig.nullCheck();
        return picExchangeEditPopWindowConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PicExchangeEditPopWindowConfig mo223809clone() {
        PicExchangeEditPopWindowConfig picExchangeEditPopWindowConfig = new PicExchangeEditPopWindowConfig();
        picExchangeEditPopWindowConfig.randomTime = this.randomTime;
        picExchangeEditPopWindowConfig.randomNum = this.randomNum;
        picExchangeEditPopWindowConfig.switchFunTime = this.switchFunTime;
        picExchangeEditPopWindowConfig.switchFunNum = this.switchFunNum;
        return picExchangeEditPopWindowConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PicExchangeEditPopWindowConfig)) {
            return false;
        }
        PicExchangeEditPopWindowConfig picExchangeEditPopWindowConfig = (PicExchangeEditPopWindowConfig) obj;
        return this.randomTime == picExchangeEditPopWindowConfig.randomTime && this.randomNum == picExchangeEditPopWindowConfig.randomNum && this.switchFunTime == picExchangeEditPopWindowConfig.switchFunTime && this.switchFunNum == picExchangeEditPopWindowConfig.switchFunNum;
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
        long j = this.randomTime;
        int i2 = ((((i * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.randomNum) * 41;
        long j2 = this.switchFunTime;
        int i3 = ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 41) + this.switchFunNum;
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
