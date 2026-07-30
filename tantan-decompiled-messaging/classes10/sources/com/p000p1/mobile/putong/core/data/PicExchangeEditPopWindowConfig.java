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
public class PicExchangeEditPopWindowConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "picexchangeeditpopwindowconfig";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int randomNum;

    @ProtobufIndex(index = 1)
    public long randomTime;

    @ProtobufIndex(index = 4)
    public int switchFunNum;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public long switchFunTime;
    public static ProtobufAdapter<PicExchangeEditPopWindowConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<PicExchangeEditPopWindowConfig>() { // from class: com.p1.mobile.putong.core.data.PicExchangeEditPopWindowConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PicExchangeEditPopWindowConfig picExchangeEditPopWindowConfig) {
            int iJ = CodedOutputByteBufferNano.j(1, picExchangeEditPopWindowConfig.randomTime) + CodedOutputByteBufferNano.h(2, picExchangeEditPopWindowConfig.randomNum) + CodedOutputByteBufferNano.j(3, picExchangeEditPopWindowConfig.switchFunTime) + CodedOutputByteBufferNano.h(4, picExchangeEditPopWindowConfig.switchFunNum);
            ((MessageNano) picExchangeEditPopWindowConfig).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PicExchangeEditPopWindowConfig m14763parse(nb5 nb5Var) throws IOException {
            PicExchangeEditPopWindowConfig picExchangeEditPopWindowConfig = new PicExchangeEditPopWindowConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    picExchangeEditPopWindowConfig.randomTime = nb5Var.k();
                } else if (iU == 16) {
                    picExchangeEditPopWindowConfig.randomNum = nb5Var.j();
                } else if (iU == 24) {
                    picExchangeEditPopWindowConfig.switchFunTime = nb5Var.k();
                } else {
                    if (iU != 32) {
                        return picExchangeEditPopWindowConfig;
                    }
                    picExchangeEditPopWindowConfig.switchFunNum = nb5Var.j();
                }
            }
        }

        public void serialize(PicExchangeEditPopWindowConfig picExchangeEditPopWindowConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, picExchangeEditPopWindowConfig.randomTime);
            codedOutputByteBufferNano.G(2, picExchangeEditPopWindowConfig.randomNum);
            codedOutputByteBufferNano.I(3, picExchangeEditPopWindowConfig.switchFunTime);
            codedOutputByteBufferNano.G(4, picExchangeEditPopWindowConfig.switchFunNum);
        }
    };
    public static JsonAdapter<PicExchangeEditPopWindowConfig> JSON_ADAPTER = new ObjectJsonAdapter<PicExchangeEditPopWindowConfig>() { // from class: com.p1.mobile.putong.core.data.PicExchangeEditPopWindowConfig.2
        public Class getDataClass() {
            return PicExchangeEditPopWindowConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PicExchangeEditPopWindowConfig m14764newInstance() {
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

        public void serializeFields(PicExchangeEditPopWindowConfig picExchangeEditPopWindowConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("randomTime", picExchangeEditPopWindowConfig.randomTime);
            jsonGenerator.writeNumberField("randomNum", picExchangeEditPopWindowConfig.randomNum);
            jsonGenerator.writeNumberField("switchFunTime", picExchangeEditPopWindowConfig.switchFunTime);
            jsonGenerator.writeNumberField("switchFunNum", picExchangeEditPopWindowConfig.switchFunNum);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PicExchangeEditPopWindowConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PicExchangeEditPopWindowConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PicExchangeEditPopWindowConfig new_() {
        PicExchangeEditPopWindowConfig picExchangeEditPopWindowConfig = new PicExchangeEditPopWindowConfig();
        picExchangeEditPopWindowConfig.nullCheck();
        return picExchangeEditPopWindowConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PicExchangeEditPopWindowConfig m14762clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.randomTime;
        int i2 = ((((i * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.randomNum) * 41;
        long j2 = this.switchFunTime;
        int i3 = ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 41) + this.switchFunNum;
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
