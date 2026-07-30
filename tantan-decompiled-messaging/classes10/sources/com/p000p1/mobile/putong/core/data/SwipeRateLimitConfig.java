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
public class SwipeRateLimitConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "swiperatelimitconfig";

    @ProtobufIndex(index = 6)
    public int anchorGrade;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int countPerSecond;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public boolean dimaond;

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = 7)
    public int locaInterval;

    @ProtobufIndex(index = 4)
    public boolean svip;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean vip;
    public static ProtobufAdapter<SwipeRateLimitConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<SwipeRateLimitConfig>() { // from class: com.p1.mobile.putong.core.data.SwipeRateLimitConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SwipeRateLimitConfig swipeRateLimitConfig) {
            int iB = CodedOutputByteBufferNano.b(1, swipeRateLimitConfig.enable) + CodedOutputByteBufferNano.h(2, swipeRateLimitConfig.countPerSecond) + CodedOutputByteBufferNano.b(3, swipeRateLimitConfig.vip) + CodedOutputByteBufferNano.b(4, swipeRateLimitConfig.svip) + CodedOutputByteBufferNano.b(5, swipeRateLimitConfig.dimaond) + CodedOutputByteBufferNano.h(6, swipeRateLimitConfig.anchorGrade) + CodedOutputByteBufferNano.h(7, swipeRateLimitConfig.locaInterval);
            ((MessageNano) swipeRateLimitConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SwipeRateLimitConfig m15858parse(nb5 nb5Var) throws IOException {
            SwipeRateLimitConfig swipeRateLimitConfig = new SwipeRateLimitConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    swipeRateLimitConfig.enable = nb5Var.g();
                } else if (iU == 16) {
                    swipeRateLimitConfig.countPerSecond = nb5Var.j();
                } else if (iU == 24) {
                    swipeRateLimitConfig.vip = nb5Var.g();
                } else if (iU == 32) {
                    swipeRateLimitConfig.svip = nb5Var.g();
                } else if (iU == 40) {
                    swipeRateLimitConfig.dimaond = nb5Var.g();
                } else if (iU == 48) {
                    swipeRateLimitConfig.anchorGrade = nb5Var.j();
                } else {
                    if (iU != 56) {
                        return swipeRateLimitConfig;
                    }
                    swipeRateLimitConfig.locaInterval = nb5Var.j();
                }
            }
        }

        public void serialize(SwipeRateLimitConfig swipeRateLimitConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, swipeRateLimitConfig.enable);
            codedOutputByteBufferNano.G(2, swipeRateLimitConfig.countPerSecond);
            codedOutputByteBufferNano.A(3, swipeRateLimitConfig.vip);
            codedOutputByteBufferNano.A(4, swipeRateLimitConfig.svip);
            codedOutputByteBufferNano.A(5, swipeRateLimitConfig.dimaond);
            codedOutputByteBufferNano.G(6, swipeRateLimitConfig.anchorGrade);
            codedOutputByteBufferNano.G(7, swipeRateLimitConfig.locaInterval);
        }
    };
    public static JsonAdapter<SwipeRateLimitConfig> JSON_ADAPTER = new ObjectJsonAdapter<SwipeRateLimitConfig>() { // from class: com.p1.mobile.putong.core.data.SwipeRateLimitConfig.2
        public Class getDataClass() {
            return SwipeRateLimitConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SwipeRateLimitConfig m15859newInstance() {
            return new SwipeRateLimitConfig();
        }

        public boolean parseField(SwipeRateLimitConfig swipeRateLimitConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "locaInterval":
                    swipeRateLimitConfig.locaInterval = jsonParser.getValueAsInt();
                    return true;
                case "anchorGrade":
                    swipeRateLimitConfig.anchorGrade = jsonParser.getValueAsInt();
                    return true;
                case "enable":
                    swipeRateLimitConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "vip":
                    swipeRateLimitConfig.vip = jsonParser.getValueAsBoolean();
                    return true;
                case "svip":
                    swipeRateLimitConfig.svip = jsonParser.getValueAsBoolean();
                    return true;
                case "dimaond":
                    swipeRateLimitConfig.dimaond = jsonParser.getValueAsBoolean();
                    return true;
                case "countPerSecond":
                    swipeRateLimitConfig.countPerSecond = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SwipeRateLimitConfig swipeRateLimitConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "locaInterval":
                case "anchorGrade":
                case "enable":
                case "vip":
                case "svip":
                case "dimaond":
                case "countPerSecond":
                    return true;
                default:
                    return super.parseFieldCheck(swipeRateLimitConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(SwipeRateLimitConfig swipeRateLimitConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", swipeRateLimitConfig.enable);
            jsonGenerator.writeNumberField("countPerSecond", swipeRateLimitConfig.countPerSecond);
            jsonGenerator.writeBooleanField("vip", swipeRateLimitConfig.vip);
            jsonGenerator.writeBooleanField("svip", swipeRateLimitConfig.svip);
            jsonGenerator.writeBooleanField("dimaond", swipeRateLimitConfig.dimaond);
            jsonGenerator.writeNumberField("anchorGrade", swipeRateLimitConfig.anchorGrade);
            jsonGenerator.writeNumberField("locaInterval", swipeRateLimitConfig.locaInterval);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SwipeRateLimitConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SwipeRateLimitConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SwipeRateLimitConfig new_() {
        SwipeRateLimitConfig swipeRateLimitConfig = new SwipeRateLimitConfig();
        swipeRateLimitConfig.nullCheck();
        return swipeRateLimitConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SwipeRateLimitConfig m15857clone() {
        SwipeRateLimitConfig swipeRateLimitConfig = new SwipeRateLimitConfig();
        swipeRateLimitConfig.enable = this.enable;
        swipeRateLimitConfig.countPerSecond = this.countPerSecond;
        swipeRateLimitConfig.vip = this.vip;
        swipeRateLimitConfig.svip = this.svip;
        swipeRateLimitConfig.dimaond = this.dimaond;
        swipeRateLimitConfig.anchorGrade = this.anchorGrade;
        swipeRateLimitConfig.locaInterval = this.locaInterval;
        return swipeRateLimitConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SwipeRateLimitConfig)) {
            return false;
        }
        SwipeRateLimitConfig swipeRateLimitConfig = (SwipeRateLimitConfig) obj;
        return this.enable == swipeRateLimitConfig.enable && this.countPerSecond == swipeRateLimitConfig.countPerSecond && this.vip == swipeRateLimitConfig.vip && this.svip == swipeRateLimitConfig.svip && this.dimaond == swipeRateLimitConfig.dimaond && this.anchorGrade == swipeRateLimitConfig.anchorGrade && this.locaInterval == swipeRateLimitConfig.locaInterval;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((((((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.countPerSecond) * 41) + (this.vip ? 1231 : 1237)) * 41) + (this.svip ? 1231 : 1237)) * 41) + (this.dimaond ? 1231 : 1237)) * 41) + this.anchorGrade) * 41) + this.locaInterval;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
