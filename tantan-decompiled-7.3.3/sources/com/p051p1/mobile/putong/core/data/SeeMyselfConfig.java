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
public class SeeMyselfConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "seemyselfconfig";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = 2)
    public int mirror_guide_swipe_count;

    @ProtobufIndex(index = 3)
    public int mirror_guide_user_signup_days_count;
    public static ProtobufAdapter<SeeMyselfConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<SeeMyselfConfig>() { // from class: com.p1.mobile.putong.core.data.SeeMyselfConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SeeMyselfConfig seeMyselfConfig) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, seeMyselfConfig.enable) + CodedOutputByteBufferNano.m17281h(2, seeMyselfConfig.mirror_guide_swipe_count) + CodedOutputByteBufferNano.m17281h(3, seeMyselfConfig.mirror_guide_user_signup_days_count);
            seeMyselfConfig.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SeeMyselfConfig parse(nc5 nc5Var) throws IOException {
            SeeMyselfConfig seeMyselfConfig = new SeeMyselfConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    seeMyselfConfig.enable = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    seeMyselfConfig.mirror_guide_swipe_count = nc5Var.m162486j();
                } else {
                    if (iM162497u != 24) {
                        return seeMyselfConfig;
                    }
                    seeMyselfConfig.mirror_guide_user_signup_days_count = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SeeMyselfConfig seeMyselfConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, seeMyselfConfig.enable);
            codedOutputByteBufferNano.m17305G(2, seeMyselfConfig.mirror_guide_swipe_count);
            codedOutputByteBufferNano.m17305G(3, seeMyselfConfig.mirror_guide_user_signup_days_count);
        }
    };
    public static JsonAdapter<SeeMyselfConfig> JSON_ADAPTER = new ObjectJsonAdapter<SeeMyselfConfig>() { // from class: com.p1.mobile.putong.core.data.SeeMyselfConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SeeMyselfConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SeeMyselfConfig newInstance() {
            return new SeeMyselfConfig();
        }

        public boolean parseField(SeeMyselfConfig seeMyselfConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enable":
                    seeMyselfConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "mirror_guide_swipe_count":
                    seeMyselfConfig.mirror_guide_swipe_count = jsonParser.getValueAsInt();
                    return true;
                case "mirror_guide_user_signup_days_count":
                    seeMyselfConfig.mirror_guide_user_signup_days_count = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SeeMyselfConfig seeMyselfConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "enable":
                case "mirror_guide_swipe_count":
                case "mirror_guide_user_signup_days_count":
                    return true;
                default:
                    return super.parseFieldCheck(seeMyselfConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SeeMyselfConfig seeMyselfConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", seeMyselfConfig.enable);
            jsonGenerator.writeNumberField("mirror_guide_swipe_count", seeMyselfConfig.mirror_guide_swipe_count);
            jsonGenerator.writeNumberField("mirror_guide_user_signup_days_count", seeMyselfConfig.mirror_guide_user_signup_days_count);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SeeMyselfConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SeeMyselfConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SeeMyselfConfig new_() {
        SeeMyselfConfig seeMyselfConfig = new SeeMyselfConfig();
        seeMyselfConfig.nullCheck();
        return seeMyselfConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SeeMyselfConfig mo225055clone() {
        SeeMyselfConfig seeMyselfConfig = new SeeMyselfConfig();
        seeMyselfConfig.enable = this.enable;
        seeMyselfConfig.mirror_guide_swipe_count = this.mirror_guide_swipe_count;
        seeMyselfConfig.mirror_guide_user_signup_days_count = this.mirror_guide_user_signup_days_count;
        return seeMyselfConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SeeMyselfConfig)) {
            return false;
        }
        SeeMyselfConfig seeMyselfConfig = (SeeMyselfConfig) obj;
        return this.enable == seeMyselfConfig.enable && this.mirror_guide_swipe_count == seeMyselfConfig.mirror_guide_swipe_count && this.mirror_guide_user_signup_days_count == seeMyselfConfig.mirror_guide_user_signup_days_count;
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
        int i2 = (((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.mirror_guide_swipe_count) * 41) + this.mirror_guide_user_signup_days_count;
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
