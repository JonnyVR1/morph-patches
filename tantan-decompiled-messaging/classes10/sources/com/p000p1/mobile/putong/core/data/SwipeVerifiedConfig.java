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
public class SwipeVerifiedConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "swipeverifiedconfig";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int maximum_verify_guide_times;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int verified_user_additional_like_count;
    public static ProtobufAdapter<SwipeVerifiedConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<SwipeVerifiedConfig>() { // from class: com.p1.mobile.putong.core.data.SwipeVerifiedConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SwipeVerifiedConfig swipeVerifiedConfig) {
            int iB = CodedOutputByteBufferNano.b(1, swipeVerifiedConfig.enable) + CodedOutputByteBufferNano.h(2, swipeVerifiedConfig.verified_user_additional_like_count) + CodedOutputByteBufferNano.h(3, swipeVerifiedConfig.maximum_verify_guide_times);
            ((MessageNano) swipeVerifiedConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SwipeVerifiedConfig m15870parse(nb5 nb5Var) throws IOException {
            SwipeVerifiedConfig swipeVerifiedConfig = new SwipeVerifiedConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    swipeVerifiedConfig.enable = nb5Var.g();
                } else if (iU == 16) {
                    swipeVerifiedConfig.verified_user_additional_like_count = nb5Var.j();
                } else {
                    if (iU != 24) {
                        return swipeVerifiedConfig;
                    }
                    swipeVerifiedConfig.maximum_verify_guide_times = nb5Var.j();
                }
            }
        }

        public void serialize(SwipeVerifiedConfig swipeVerifiedConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, swipeVerifiedConfig.enable);
            codedOutputByteBufferNano.G(2, swipeVerifiedConfig.verified_user_additional_like_count);
            codedOutputByteBufferNano.G(3, swipeVerifiedConfig.maximum_verify_guide_times);
        }
    };
    public static JsonAdapter<SwipeVerifiedConfig> JSON_ADAPTER = new ObjectJsonAdapter<SwipeVerifiedConfig>() { // from class: com.p1.mobile.putong.core.data.SwipeVerifiedConfig.2
        public Class getDataClass() {
            return SwipeVerifiedConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SwipeVerifiedConfig m15871newInstance() {
            return new SwipeVerifiedConfig();
        }

        public boolean parseField(SwipeVerifiedConfig swipeVerifiedConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enable":
                    swipeVerifiedConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "maximum_verify_guide_times":
                    swipeVerifiedConfig.maximum_verify_guide_times = jsonParser.getValueAsInt();
                    return true;
                case "verified_user_additional_like_count":
                    swipeVerifiedConfig.verified_user_additional_like_count = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SwipeVerifiedConfig swipeVerifiedConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "enable":
                case "maximum_verify_guide_times":
                case "verified_user_additional_like_count":
                    return true;
                default:
                    return super.parseFieldCheck(swipeVerifiedConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(SwipeVerifiedConfig swipeVerifiedConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", swipeVerifiedConfig.enable);
            jsonGenerator.writeNumberField("verified_user_additional_like_count", swipeVerifiedConfig.verified_user_additional_like_count);
            jsonGenerator.writeNumberField("maximum_verify_guide_times", swipeVerifiedConfig.maximum_verify_guide_times);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SwipeVerifiedConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SwipeVerifiedConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SwipeVerifiedConfig new_() {
        SwipeVerifiedConfig swipeVerifiedConfig = new SwipeVerifiedConfig();
        swipeVerifiedConfig.nullCheck();
        return swipeVerifiedConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SwipeVerifiedConfig m15869clone() {
        SwipeVerifiedConfig swipeVerifiedConfig = new SwipeVerifiedConfig();
        swipeVerifiedConfig.enable = this.enable;
        swipeVerifiedConfig.verified_user_additional_like_count = this.verified_user_additional_like_count;
        swipeVerifiedConfig.maximum_verify_guide_times = this.maximum_verify_guide_times;
        return swipeVerifiedConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SwipeVerifiedConfig)) {
            return false;
        }
        SwipeVerifiedConfig swipeVerifiedConfig = (SwipeVerifiedConfig) obj;
        return this.enable == swipeVerifiedConfig.enable && this.verified_user_additional_like_count == swipeVerifiedConfig.verified_user_additional_like_count && this.maximum_verify_guide_times == swipeVerifiedConfig.maximum_verify_guide_times;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.verified_user_additional_like_count) * 41) + this.maximum_verify_guide_times;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
