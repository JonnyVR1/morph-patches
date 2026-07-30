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
public class SwipeRateLimitConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "swiperatelimitconfig";

    @ProtobufIndex(index = 6)
    public int anchorGrade;

    @ProtobufIndex(index = 2)
    public int countPerSecond;

    @ProtobufIndex(index = 5)
    public boolean dimaond;

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = 7)
    public int locaInterval;

    @ProtobufIndex(index = 4)
    public boolean svip;

    @ProtobufIndex(index = 3)
    public boolean vip;
    public static ProtobufAdapter<SwipeRateLimitConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<SwipeRateLimitConfig>() { // from class: com.p1.mobile.putong.core.data.SwipeRateLimitConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SwipeRateLimitConfig swipeRateLimitConfig) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, swipeRateLimitConfig.enable) + CodedOutputByteBufferNano.m17281h(2, swipeRateLimitConfig.countPerSecond) + CodedOutputByteBufferNano.m17275b(3, swipeRateLimitConfig.vip) + CodedOutputByteBufferNano.m17275b(4, swipeRateLimitConfig.svip) + CodedOutputByteBufferNano.m17275b(5, swipeRateLimitConfig.dimaond) + CodedOutputByteBufferNano.m17281h(6, swipeRateLimitConfig.anchorGrade) + CodedOutputByteBufferNano.m17281h(7, swipeRateLimitConfig.locaInterval);
            swipeRateLimitConfig.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SwipeRateLimitConfig parse(nc5 nc5Var) throws IOException {
            SwipeRateLimitConfig swipeRateLimitConfig = new SwipeRateLimitConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    swipeRateLimitConfig.enable = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    swipeRateLimitConfig.countPerSecond = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    swipeRateLimitConfig.vip = nc5Var.m162483g();
                } else if (iM162497u == 32) {
                    swipeRateLimitConfig.svip = nc5Var.m162483g();
                } else if (iM162497u == 40) {
                    swipeRateLimitConfig.dimaond = nc5Var.m162483g();
                } else if (iM162497u == 48) {
                    swipeRateLimitConfig.anchorGrade = nc5Var.m162486j();
                } else {
                    if (iM162497u != 56) {
                        return swipeRateLimitConfig;
                    }
                    swipeRateLimitConfig.locaInterval = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SwipeRateLimitConfig swipeRateLimitConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, swipeRateLimitConfig.enable);
            codedOutputByteBufferNano.m17305G(2, swipeRateLimitConfig.countPerSecond);
            codedOutputByteBufferNano.m17299A(3, swipeRateLimitConfig.vip);
            codedOutputByteBufferNano.m17299A(4, swipeRateLimitConfig.svip);
            codedOutputByteBufferNano.m17299A(5, swipeRateLimitConfig.dimaond);
            codedOutputByteBufferNano.m17305G(6, swipeRateLimitConfig.anchorGrade);
            codedOutputByteBufferNano.m17305G(7, swipeRateLimitConfig.locaInterval);
        }
    };
    public static JsonAdapter<SwipeRateLimitConfig> JSON_ADAPTER = new ObjectJsonAdapter<SwipeRateLimitConfig>() { // from class: com.p1.mobile.putong.core.data.SwipeRateLimitConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SwipeRateLimitConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SwipeRateLimitConfig newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SwipeRateLimitConfig swipeRateLimitConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", swipeRateLimitConfig.enable);
            jsonGenerator.writeNumberField("countPerSecond", swipeRateLimitConfig.countPerSecond);
            jsonGenerator.writeBooleanField("vip", swipeRateLimitConfig.vip);
            jsonGenerator.writeBooleanField("svip", swipeRateLimitConfig.svip);
            jsonGenerator.writeBooleanField("dimaond", swipeRateLimitConfig.dimaond);
            jsonGenerator.writeNumberField("anchorGrade", swipeRateLimitConfig.anchorGrade);
            jsonGenerator.writeNumberField("locaInterval", swipeRateLimitConfig.locaInterval);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SwipeRateLimitConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SwipeRateLimitConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SwipeRateLimitConfig new_() {
        SwipeRateLimitConfig swipeRateLimitConfig = new SwipeRateLimitConfig();
        swipeRateLimitConfig.nullCheck();
        return swipeRateLimitConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SwipeRateLimitConfig mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((((((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.countPerSecond) * 41) + (this.vip ? 1231 : 1237)) * 41) + (this.svip ? 1231 : 1237)) * 41) + (this.dimaond ? 1231 : 1237)) * 41) + this.anchorGrade) * 41) + this.locaInterval;
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
