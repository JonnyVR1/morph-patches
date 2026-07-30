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
public class NonExpansionCardSwipeVerifiedConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "nonexpansioncardswipeverifiedconfig";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int continuous_left_sliding_bubble;

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = 4)
    public int maximum_verify_guide_times;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int verified_user_additional_like_count;
    public static ProtobufAdapter<NonExpansionCardSwipeVerifiedConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<NonExpansionCardSwipeVerifiedConfig>() { // from class: com.p1.mobile.putong.core.data.NonExpansionCardSwipeVerifiedConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NonExpansionCardSwipeVerifiedConfig nonExpansionCardSwipeVerifiedConfig) {
            int iB = CodedOutputByteBufferNano.b(1, nonExpansionCardSwipeVerifiedConfig.enable) + CodedOutputByteBufferNano.h(2, nonExpansionCardSwipeVerifiedConfig.continuous_left_sliding_bubble) + CodedOutputByteBufferNano.h(3, nonExpansionCardSwipeVerifiedConfig.verified_user_additional_like_count) + CodedOutputByteBufferNano.h(4, nonExpansionCardSwipeVerifiedConfig.maximum_verify_guide_times);
            ((MessageNano) nonExpansionCardSwipeVerifiedConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NonExpansionCardSwipeVerifiedConfig m14567parse(nb5 nb5Var) throws IOException {
            NonExpansionCardSwipeVerifiedConfig nonExpansionCardSwipeVerifiedConfig = new NonExpansionCardSwipeVerifiedConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    nonExpansionCardSwipeVerifiedConfig.enable = nb5Var.g();
                } else if (iU == 16) {
                    nonExpansionCardSwipeVerifiedConfig.continuous_left_sliding_bubble = nb5Var.j();
                } else if (iU == 24) {
                    nonExpansionCardSwipeVerifiedConfig.verified_user_additional_like_count = nb5Var.j();
                } else {
                    if (iU != 32) {
                        return nonExpansionCardSwipeVerifiedConfig;
                    }
                    nonExpansionCardSwipeVerifiedConfig.maximum_verify_guide_times = nb5Var.j();
                }
            }
        }

        public void serialize(NonExpansionCardSwipeVerifiedConfig nonExpansionCardSwipeVerifiedConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, nonExpansionCardSwipeVerifiedConfig.enable);
            codedOutputByteBufferNano.G(2, nonExpansionCardSwipeVerifiedConfig.continuous_left_sliding_bubble);
            codedOutputByteBufferNano.G(3, nonExpansionCardSwipeVerifiedConfig.verified_user_additional_like_count);
            codedOutputByteBufferNano.G(4, nonExpansionCardSwipeVerifiedConfig.maximum_verify_guide_times);
        }
    };
    public static JsonAdapter<NonExpansionCardSwipeVerifiedConfig> JSON_ADAPTER = new ObjectJsonAdapter<NonExpansionCardSwipeVerifiedConfig>() { // from class: com.p1.mobile.putong.core.data.NonExpansionCardSwipeVerifiedConfig.2
        public Class getDataClass() {
            return NonExpansionCardSwipeVerifiedConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public NonExpansionCardSwipeVerifiedConfig m14568newInstance() {
            return new NonExpansionCardSwipeVerifiedConfig();
        }

        public boolean parseField(NonExpansionCardSwipeVerifiedConfig nonExpansionCardSwipeVerifiedConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enable":
                    nonExpansionCardSwipeVerifiedConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "continuous_left_sliding_bubble":
                    nonExpansionCardSwipeVerifiedConfig.continuous_left_sliding_bubble = jsonParser.getValueAsInt();
                    return true;
                case "maximum_verify_guide_times":
                    nonExpansionCardSwipeVerifiedConfig.maximum_verify_guide_times = jsonParser.getValueAsInt();
                    return true;
                case "verified_user_additional_like_count":
                    nonExpansionCardSwipeVerifiedConfig.verified_user_additional_like_count = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(NonExpansionCardSwipeVerifiedConfig nonExpansionCardSwipeVerifiedConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "enable":
                case "continuous_left_sliding_bubble":
                case "maximum_verify_guide_times":
                case "verified_user_additional_like_count":
                    return true;
                default:
                    return super.parseFieldCheck(nonExpansionCardSwipeVerifiedConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(NonExpansionCardSwipeVerifiedConfig nonExpansionCardSwipeVerifiedConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", nonExpansionCardSwipeVerifiedConfig.enable);
            jsonGenerator.writeNumberField("continuous_left_sliding_bubble", nonExpansionCardSwipeVerifiedConfig.continuous_left_sliding_bubble);
            jsonGenerator.writeNumberField("verified_user_additional_like_count", nonExpansionCardSwipeVerifiedConfig.verified_user_additional_like_count);
            jsonGenerator.writeNumberField("maximum_verify_guide_times", nonExpansionCardSwipeVerifiedConfig.maximum_verify_guide_times);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NonExpansionCardSwipeVerifiedConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NonExpansionCardSwipeVerifiedConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NonExpansionCardSwipeVerifiedConfig new_() {
        NonExpansionCardSwipeVerifiedConfig nonExpansionCardSwipeVerifiedConfig = new NonExpansionCardSwipeVerifiedConfig();
        nonExpansionCardSwipeVerifiedConfig.nullCheck();
        return nonExpansionCardSwipeVerifiedConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NonExpansionCardSwipeVerifiedConfig m14566clone() {
        NonExpansionCardSwipeVerifiedConfig nonExpansionCardSwipeVerifiedConfig = new NonExpansionCardSwipeVerifiedConfig();
        nonExpansionCardSwipeVerifiedConfig.enable = this.enable;
        nonExpansionCardSwipeVerifiedConfig.continuous_left_sliding_bubble = this.continuous_left_sliding_bubble;
        nonExpansionCardSwipeVerifiedConfig.verified_user_additional_like_count = this.verified_user_additional_like_count;
        nonExpansionCardSwipeVerifiedConfig.maximum_verify_guide_times = this.maximum_verify_guide_times;
        return nonExpansionCardSwipeVerifiedConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NonExpansionCardSwipeVerifiedConfig)) {
            return false;
        }
        NonExpansionCardSwipeVerifiedConfig nonExpansionCardSwipeVerifiedConfig = (NonExpansionCardSwipeVerifiedConfig) obj;
        return this.enable == nonExpansionCardSwipeVerifiedConfig.enable && this.continuous_left_sliding_bubble == nonExpansionCardSwipeVerifiedConfig.continuous_left_sliding_bubble && this.verified_user_additional_like_count == nonExpansionCardSwipeVerifiedConfig.verified_user_additional_like_count && this.maximum_verify_guide_times == nonExpansionCardSwipeVerifiedConfig.maximum_verify_guide_times;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.continuous_left_sliding_bubble) * 41) + this.verified_user_additional_like_count) * 41) + this.maximum_verify_guide_times;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
