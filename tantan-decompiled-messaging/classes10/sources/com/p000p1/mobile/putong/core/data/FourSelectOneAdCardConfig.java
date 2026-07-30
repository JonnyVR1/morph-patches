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
public class FourSelectOneAdCardConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fourselectoneadcardconfig";

    @ProtobufIndex(index = 4)
    public boolean enable;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int guideTimeInterval;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int maxCardGuideCountPerDay;

    @ProtobufIndex(index = 1)
    public int trigerGuideLeftSwipeCount;
    public static ProtobufAdapter<FourSelectOneAdCardConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<FourSelectOneAdCardConfig>() { // from class: com.p1.mobile.putong.core.data.FourSelectOneAdCardConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FourSelectOneAdCardConfig fourSelectOneAdCardConfig) {
            int iH = CodedOutputByteBufferNano.h(1, fourSelectOneAdCardConfig.trigerGuideLeftSwipeCount) + CodedOutputByteBufferNano.h(2, fourSelectOneAdCardConfig.maxCardGuideCountPerDay) + CodedOutputByteBufferNano.h(3, fourSelectOneAdCardConfig.guideTimeInterval) + CodedOutputByteBufferNano.b(4, fourSelectOneAdCardConfig.enable);
            ((MessageNano) fourSelectOneAdCardConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FourSelectOneAdCardConfig m12813parse(nb5 nb5Var) throws IOException {
            FourSelectOneAdCardConfig fourSelectOneAdCardConfig = new FourSelectOneAdCardConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    fourSelectOneAdCardConfig.trigerGuideLeftSwipeCount = nb5Var.j();
                } else if (iU == 16) {
                    fourSelectOneAdCardConfig.maxCardGuideCountPerDay = nb5Var.j();
                } else if (iU == 24) {
                    fourSelectOneAdCardConfig.guideTimeInterval = nb5Var.j();
                } else {
                    if (iU != 32) {
                        return fourSelectOneAdCardConfig;
                    }
                    fourSelectOneAdCardConfig.enable = nb5Var.g();
                }
            }
        }

        public void serialize(FourSelectOneAdCardConfig fourSelectOneAdCardConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, fourSelectOneAdCardConfig.trigerGuideLeftSwipeCount);
            codedOutputByteBufferNano.G(2, fourSelectOneAdCardConfig.maxCardGuideCountPerDay);
            codedOutputByteBufferNano.G(3, fourSelectOneAdCardConfig.guideTimeInterval);
            codedOutputByteBufferNano.A(4, fourSelectOneAdCardConfig.enable);
        }
    };
    public static JsonAdapter<FourSelectOneAdCardConfig> JSON_ADAPTER = new ObjectJsonAdapter<FourSelectOneAdCardConfig>() { // from class: com.p1.mobile.putong.core.data.FourSelectOneAdCardConfig.2
        public Class getDataClass() {
            return FourSelectOneAdCardConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FourSelectOneAdCardConfig m12814newInstance() {
            return new FourSelectOneAdCardConfig();
        }

        public boolean parseField(FourSelectOneAdCardConfig fourSelectOneAdCardConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "trigerGuideLeftSwipeCount":
                    fourSelectOneAdCardConfig.trigerGuideLeftSwipeCount = jsonParser.getValueAsInt();
                    return true;
                case "enable":
                    fourSelectOneAdCardConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "guideTimeInterval":
                    fourSelectOneAdCardConfig.guideTimeInterval = jsonParser.getValueAsInt();
                    return true;
                case "maxCardGuideCountPerDay":
                    fourSelectOneAdCardConfig.maxCardGuideCountPerDay = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FourSelectOneAdCardConfig fourSelectOneAdCardConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "trigerGuideLeftSwipeCount":
                case "enable":
                case "guideTimeInterval":
                case "maxCardGuideCountPerDay":
                    return true;
                default:
                    return super.parseFieldCheck(fourSelectOneAdCardConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(FourSelectOneAdCardConfig fourSelectOneAdCardConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("trigerGuideLeftSwipeCount", fourSelectOneAdCardConfig.trigerGuideLeftSwipeCount);
            jsonGenerator.writeNumberField("maxCardGuideCountPerDay", fourSelectOneAdCardConfig.maxCardGuideCountPerDay);
            jsonGenerator.writeNumberField("guideTimeInterval", fourSelectOneAdCardConfig.guideTimeInterval);
            jsonGenerator.writeBooleanField("enable", fourSelectOneAdCardConfig.enable);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FourSelectOneAdCardConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FourSelectOneAdCardConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FourSelectOneAdCardConfig new_() {
        FourSelectOneAdCardConfig fourSelectOneAdCardConfig = new FourSelectOneAdCardConfig();
        fourSelectOneAdCardConfig.nullCheck();
        return fourSelectOneAdCardConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FourSelectOneAdCardConfig m12812clone() {
        FourSelectOneAdCardConfig fourSelectOneAdCardConfig = new FourSelectOneAdCardConfig();
        fourSelectOneAdCardConfig.trigerGuideLeftSwipeCount = this.trigerGuideLeftSwipeCount;
        fourSelectOneAdCardConfig.maxCardGuideCountPerDay = this.maxCardGuideCountPerDay;
        fourSelectOneAdCardConfig.guideTimeInterval = this.guideTimeInterval;
        fourSelectOneAdCardConfig.enable = this.enable;
        return fourSelectOneAdCardConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FourSelectOneAdCardConfig)) {
            return false;
        }
        FourSelectOneAdCardConfig fourSelectOneAdCardConfig = (FourSelectOneAdCardConfig) obj;
        return this.trigerGuideLeftSwipeCount == fourSelectOneAdCardConfig.trigerGuideLeftSwipeCount && this.maxCardGuideCountPerDay == fourSelectOneAdCardConfig.maxCardGuideCountPerDay && this.guideTimeInterval == fourSelectOneAdCardConfig.guideTimeInterval && this.enable == fourSelectOneAdCardConfig.enable;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((i * 41) + this.trigerGuideLeftSwipeCount) * 41) + this.maxCardGuideCountPerDay) * 41) + this.guideTimeInterval) * 41) + (this.enable ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
