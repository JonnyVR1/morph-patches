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
public class SwipeVerifiedConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "swipeverifiedconfig";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = 3)
    public int maximum_verify_guide_times;

    @ProtobufIndex(index = 2)
    public int verified_user_additional_like_count;
    public static ProtobufAdapter<SwipeVerifiedConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<SwipeVerifiedConfig>() { // from class: com.p1.mobile.putong.core.data.SwipeVerifiedConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SwipeVerifiedConfig swipeVerifiedConfig) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, swipeVerifiedConfig.enable) + CodedOutputByteBufferNano.m17281h(2, swipeVerifiedConfig.verified_user_additional_like_count) + CodedOutputByteBufferNano.m17281h(3, swipeVerifiedConfig.maximum_verify_guide_times);
            swipeVerifiedConfig.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SwipeVerifiedConfig parse(nc5 nc5Var) throws IOException {
            SwipeVerifiedConfig swipeVerifiedConfig = new SwipeVerifiedConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    swipeVerifiedConfig.enable = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    swipeVerifiedConfig.verified_user_additional_like_count = nc5Var.m162486j();
                } else {
                    if (iM162497u != 24) {
                        return swipeVerifiedConfig;
                    }
                    swipeVerifiedConfig.maximum_verify_guide_times = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SwipeVerifiedConfig swipeVerifiedConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, swipeVerifiedConfig.enable);
            codedOutputByteBufferNano.m17305G(2, swipeVerifiedConfig.verified_user_additional_like_count);
            codedOutputByteBufferNano.m17305G(3, swipeVerifiedConfig.maximum_verify_guide_times);
        }
    };
    public static JsonAdapter<SwipeVerifiedConfig> JSON_ADAPTER = new ObjectJsonAdapter<SwipeVerifiedConfig>() { // from class: com.p1.mobile.putong.core.data.SwipeVerifiedConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SwipeVerifiedConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SwipeVerifiedConfig newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SwipeVerifiedConfig swipeVerifiedConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", swipeVerifiedConfig.enable);
            jsonGenerator.writeNumberField("verified_user_additional_like_count", swipeVerifiedConfig.verified_user_additional_like_count);
            jsonGenerator.writeNumberField("maximum_verify_guide_times", swipeVerifiedConfig.maximum_verify_guide_times);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SwipeVerifiedConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SwipeVerifiedConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SwipeVerifiedConfig new_() {
        SwipeVerifiedConfig swipeVerifiedConfig = new SwipeVerifiedConfig();
        swipeVerifiedConfig.nullCheck();
        return swipeVerifiedConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SwipeVerifiedConfig mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.verified_user_additional_like_count) * 41) + this.maximum_verify_guide_times;
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
