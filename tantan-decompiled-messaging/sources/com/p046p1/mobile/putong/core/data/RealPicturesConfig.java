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
public class RealPicturesConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "realpicturesconfig";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = 2)
    public int photo_reward_guide_limit;

    @ProtobufIndex(index = 3)
    public int photo_reward_guide_no_match_days;

    @ProtobufIndex(index = 4)
    public int photo_reward_guide_swipe_like_threshold;
    public static ProtobufAdapter<RealPicturesConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<RealPicturesConfig>() { // from class: com.p1.mobile.putong.core.data.RealPicturesConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RealPicturesConfig realPicturesConfig) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, realPicturesConfig.enable) + CodedOutputByteBufferNano.m17226h(2, realPicturesConfig.photo_reward_guide_limit) + CodedOutputByteBufferNano.m17226h(3, realPicturesConfig.photo_reward_guide_no_match_days) + CodedOutputByteBufferNano.m17226h(4, realPicturesConfig.photo_reward_guide_swipe_like_threshold);
            realPicturesConfig.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RealPicturesConfig parse(nb5 nb5Var) throws IOException {
            RealPicturesConfig realPicturesConfig = new RealPicturesConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    realPicturesConfig.enable = nb5Var.m158738g();
                } else if (iM158752u == 16) {
                    realPicturesConfig.photo_reward_guide_limit = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    realPicturesConfig.photo_reward_guide_no_match_days = nb5Var.m158741j();
                } else {
                    if (iM158752u != 32) {
                        return realPicturesConfig;
                    }
                    realPicturesConfig.photo_reward_guide_swipe_like_threshold = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RealPicturesConfig realPicturesConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, realPicturesConfig.enable);
            codedOutputByteBufferNano.m17250G(2, realPicturesConfig.photo_reward_guide_limit);
            codedOutputByteBufferNano.m17250G(3, realPicturesConfig.photo_reward_guide_no_match_days);
            codedOutputByteBufferNano.m17250G(4, realPicturesConfig.photo_reward_guide_swipe_like_threshold);
        }
    };
    public static JsonAdapter<RealPicturesConfig> JSON_ADAPTER = new ObjectJsonAdapter<RealPicturesConfig>() { // from class: com.p1.mobile.putong.core.data.RealPicturesConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RealPicturesConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RealPicturesConfig newInstance() {
            return new RealPicturesConfig();
        }

        public boolean parseField(RealPicturesConfig realPicturesConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "photo_reward_guide_limit":
                    realPicturesConfig.photo_reward_guide_limit = jsonParser.getValueAsInt();
                    return true;
                case "enable":
                    realPicturesConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "photo_reward_guide_swipe_like_threshold":
                    realPicturesConfig.photo_reward_guide_swipe_like_threshold = jsonParser.getValueAsInt();
                    return true;
                case "photo_reward_guide_no_match_days":
                    realPicturesConfig.photo_reward_guide_no_match_days = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RealPicturesConfig realPicturesConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "photo_reward_guide_limit":
                case "enable":
                case "photo_reward_guide_swipe_like_threshold":
                case "photo_reward_guide_no_match_days":
                    return true;
                default:
                    return super.parseFieldCheck(realPicturesConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RealPicturesConfig realPicturesConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", realPicturesConfig.enable);
            jsonGenerator.writeNumberField("photo_reward_guide_limit", realPicturesConfig.photo_reward_guide_limit);
            jsonGenerator.writeNumberField("photo_reward_guide_no_match_days", realPicturesConfig.photo_reward_guide_no_match_days);
            jsonGenerator.writeNumberField("photo_reward_guide_swipe_like_threshold", realPicturesConfig.photo_reward_guide_swipe_like_threshold);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RealPicturesConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RealPicturesConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RealPicturesConfig new_() {
        RealPicturesConfig realPicturesConfig = new RealPicturesConfig();
        realPicturesConfig.nullCheck();
        return realPicturesConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RealPicturesConfig mo223809clone() {
        RealPicturesConfig realPicturesConfig = new RealPicturesConfig();
        realPicturesConfig.enable = this.enable;
        realPicturesConfig.photo_reward_guide_limit = this.photo_reward_guide_limit;
        realPicturesConfig.photo_reward_guide_no_match_days = this.photo_reward_guide_no_match_days;
        realPicturesConfig.photo_reward_guide_swipe_like_threshold = this.photo_reward_guide_swipe_like_threshold;
        return realPicturesConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RealPicturesConfig)) {
            return false;
        }
        RealPicturesConfig realPicturesConfig = (RealPicturesConfig) obj;
        return this.enable == realPicturesConfig.enable && this.photo_reward_guide_limit == realPicturesConfig.photo_reward_guide_limit && this.photo_reward_guide_no_match_days == realPicturesConfig.photo_reward_guide_no_match_days && this.photo_reward_guide_swipe_like_threshold == realPicturesConfig.photo_reward_guide_swipe_like_threshold;
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
        int i2 = (((((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.photo_reward_guide_limit) * 41) + this.photo_reward_guide_no_match_days) * 41) + this.photo_reward_guide_swipe_like_threshold;
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
