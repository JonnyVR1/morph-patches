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
public class SeeMyselfConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "seemyselfconfig";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int mirror_guide_swipe_count;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int mirror_guide_user_signup_days_count;
    public static ProtobufAdapter<SeeMyselfConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<SeeMyselfConfig>() { // from class: com.p1.mobile.putong.core.data.SeeMyselfConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SeeMyselfConfig seeMyselfConfig) {
            int iB = CodedOutputByteBufferNano.b(1, seeMyselfConfig.enable) + CodedOutputByteBufferNano.h(2, seeMyselfConfig.mirror_guide_swipe_count) + CodedOutputByteBufferNano.h(3, seeMyselfConfig.mirror_guide_user_signup_days_count);
            ((MessageNano) seeMyselfConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SeeMyselfConfig m15527parse(nb5 nb5Var) throws IOException {
            SeeMyselfConfig seeMyselfConfig = new SeeMyselfConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    seeMyselfConfig.enable = nb5Var.g();
                } else if (iU == 16) {
                    seeMyselfConfig.mirror_guide_swipe_count = nb5Var.j();
                } else {
                    if (iU != 24) {
                        return seeMyselfConfig;
                    }
                    seeMyselfConfig.mirror_guide_user_signup_days_count = nb5Var.j();
                }
            }
        }

        public void serialize(SeeMyselfConfig seeMyselfConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, seeMyselfConfig.enable);
            codedOutputByteBufferNano.G(2, seeMyselfConfig.mirror_guide_swipe_count);
            codedOutputByteBufferNano.G(3, seeMyselfConfig.mirror_guide_user_signup_days_count);
        }
    };
    public static JsonAdapter<SeeMyselfConfig> JSON_ADAPTER = new ObjectJsonAdapter<SeeMyselfConfig>() { // from class: com.p1.mobile.putong.core.data.SeeMyselfConfig.2
        public Class getDataClass() {
            return SeeMyselfConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SeeMyselfConfig m15528newInstance() {
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

        public void serializeFields(SeeMyselfConfig seeMyselfConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", seeMyselfConfig.enable);
            jsonGenerator.writeNumberField("mirror_guide_swipe_count", seeMyselfConfig.mirror_guide_swipe_count);
            jsonGenerator.writeNumberField("mirror_guide_user_signup_days_count", seeMyselfConfig.mirror_guide_user_signup_days_count);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SeeMyselfConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SeeMyselfConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SeeMyselfConfig new_() {
        SeeMyselfConfig seeMyselfConfig = new SeeMyselfConfig();
        seeMyselfConfig.nullCheck();
        return seeMyselfConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SeeMyselfConfig m15526clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.mirror_guide_swipe_count) * 41) + this.mirror_guide_user_signup_days_count;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
