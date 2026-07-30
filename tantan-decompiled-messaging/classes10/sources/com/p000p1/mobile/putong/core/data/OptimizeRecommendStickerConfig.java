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
public class OptimizeRecommendStickerConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "optimizerecommendstickerconfig";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int max_days_since_last_message;

    @ProtobufIndex(index = 1)
    public int max_times_of_showing_recommend_sticker_b;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int max_times_of_showing_recommend_sticker_c;
    public static ProtobufAdapter<OptimizeRecommendStickerConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<OptimizeRecommendStickerConfig>() { // from class: com.p1.mobile.putong.core.data.OptimizeRecommendStickerConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OptimizeRecommendStickerConfig optimizeRecommendStickerConfig) {
            int iH = CodedOutputByteBufferNano.h(1, optimizeRecommendStickerConfig.max_times_of_showing_recommend_sticker_b) + CodedOutputByteBufferNano.h(2, optimizeRecommendStickerConfig.max_times_of_showing_recommend_sticker_c) + CodedOutputByteBufferNano.h(3, optimizeRecommendStickerConfig.max_days_since_last_message);
            ((MessageNano) optimizeRecommendStickerConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OptimizeRecommendStickerConfig m14683parse(nb5 nb5Var) throws IOException {
            OptimizeRecommendStickerConfig optimizeRecommendStickerConfig = new OptimizeRecommendStickerConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    optimizeRecommendStickerConfig.max_times_of_showing_recommend_sticker_b = nb5Var.j();
                } else if (iU == 16) {
                    optimizeRecommendStickerConfig.max_times_of_showing_recommend_sticker_c = nb5Var.j();
                } else {
                    if (iU != 24) {
                        return optimizeRecommendStickerConfig;
                    }
                    optimizeRecommendStickerConfig.max_days_since_last_message = nb5Var.j();
                }
            }
        }

        public void serialize(OptimizeRecommendStickerConfig optimizeRecommendStickerConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, optimizeRecommendStickerConfig.max_times_of_showing_recommend_sticker_b);
            codedOutputByteBufferNano.G(2, optimizeRecommendStickerConfig.max_times_of_showing_recommend_sticker_c);
            codedOutputByteBufferNano.G(3, optimizeRecommendStickerConfig.max_days_since_last_message);
        }
    };
    public static JsonAdapter<OptimizeRecommendStickerConfig> JSON_ADAPTER = new ObjectJsonAdapter<OptimizeRecommendStickerConfig>() { // from class: com.p1.mobile.putong.core.data.OptimizeRecommendStickerConfig.2
        public Class getDataClass() {
            return OptimizeRecommendStickerConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public OptimizeRecommendStickerConfig m14684newInstance() {
            return new OptimizeRecommendStickerConfig();
        }

        public boolean parseField(OptimizeRecommendStickerConfig optimizeRecommendStickerConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "max_times_of_showing_recommend_sticker_b":
                    optimizeRecommendStickerConfig.max_times_of_showing_recommend_sticker_b = jsonParser.getValueAsInt();
                    return true;
                case "max_times_of_showing_recommend_sticker_c":
                    optimizeRecommendStickerConfig.max_times_of_showing_recommend_sticker_c = jsonParser.getValueAsInt();
                    return true;
                case "max_days_since_last_message":
                    optimizeRecommendStickerConfig.max_days_since_last_message = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OptimizeRecommendStickerConfig optimizeRecommendStickerConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "max_times_of_showing_recommend_sticker_b":
                case "max_times_of_showing_recommend_sticker_c":
                case "max_days_since_last_message":
                    return true;
                default:
                    return super.parseFieldCheck(optimizeRecommendStickerConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(OptimizeRecommendStickerConfig optimizeRecommendStickerConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("max_times_of_showing_recommend_sticker_b", optimizeRecommendStickerConfig.max_times_of_showing_recommend_sticker_b);
            jsonGenerator.writeNumberField("max_times_of_showing_recommend_sticker_c", optimizeRecommendStickerConfig.max_times_of_showing_recommend_sticker_c);
            jsonGenerator.writeNumberField("max_days_since_last_message", optimizeRecommendStickerConfig.max_days_since_last_message);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OptimizeRecommendStickerConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OptimizeRecommendStickerConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OptimizeRecommendStickerConfig new_() {
        OptimizeRecommendStickerConfig optimizeRecommendStickerConfig = new OptimizeRecommendStickerConfig();
        optimizeRecommendStickerConfig.nullCheck();
        return optimizeRecommendStickerConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OptimizeRecommendStickerConfig m14682clone() {
        OptimizeRecommendStickerConfig optimizeRecommendStickerConfig = new OptimizeRecommendStickerConfig();
        optimizeRecommendStickerConfig.max_times_of_showing_recommend_sticker_b = this.max_times_of_showing_recommend_sticker_b;
        optimizeRecommendStickerConfig.max_times_of_showing_recommend_sticker_c = this.max_times_of_showing_recommend_sticker_c;
        optimizeRecommendStickerConfig.max_days_since_last_message = this.max_days_since_last_message;
        return optimizeRecommendStickerConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OptimizeRecommendStickerConfig)) {
            return false;
        }
        OptimizeRecommendStickerConfig optimizeRecommendStickerConfig = (OptimizeRecommendStickerConfig) obj;
        return this.max_times_of_showing_recommend_sticker_b == optimizeRecommendStickerConfig.max_times_of_showing_recommend_sticker_b && this.max_times_of_showing_recommend_sticker_c == optimizeRecommendStickerConfig.max_times_of_showing_recommend_sticker_c && this.max_days_since_last_message == optimizeRecommendStickerConfig.max_days_since_last_message;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + this.max_times_of_showing_recommend_sticker_b) * 41) + this.max_times_of_showing_recommend_sticker_c) * 41) + this.max_days_since_last_message;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
