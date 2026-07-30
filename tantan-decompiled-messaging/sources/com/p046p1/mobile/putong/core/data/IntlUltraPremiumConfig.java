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
public class IntlUltraPremiumConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlultrapremiumconfig";

    @ProtobufIndex(index = 1)
    public boolean androidEnable;

    @ProtobufIndex(index = 2)
    public int intl_instant_match_tips_swipe_num;
    public static ProtobufAdapter<IntlUltraPremiumConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlUltraPremiumConfig>() { // from class: com.p1.mobile.putong.core.data.IntlUltraPremiumConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlUltraPremiumConfig intlUltraPremiumConfig) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, intlUltraPremiumConfig.androidEnable) + CodedOutputByteBufferNano.m17226h(2, intlUltraPremiumConfig.intl_instant_match_tips_swipe_num);
            intlUltraPremiumConfig.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlUltraPremiumConfig parse(nb5 nb5Var) throws IOException {
            IntlUltraPremiumConfig intlUltraPremiumConfig = new IntlUltraPremiumConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    intlUltraPremiumConfig.androidEnable = nb5Var.m158738g();
                } else {
                    if (iM158752u != 16) {
                        return intlUltraPremiumConfig;
                    }
                    intlUltraPremiumConfig.intl_instant_match_tips_swipe_num = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlUltraPremiumConfig intlUltraPremiumConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, intlUltraPremiumConfig.androidEnable);
            codedOutputByteBufferNano.m17250G(2, intlUltraPremiumConfig.intl_instant_match_tips_swipe_num);
        }
    };
    public static JsonAdapter<IntlUltraPremiumConfig> JSON_ADAPTER = new ObjectJsonAdapter<IntlUltraPremiumConfig>() { // from class: com.p1.mobile.putong.core.data.IntlUltraPremiumConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlUltraPremiumConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlUltraPremiumConfig newInstance() {
            return new IntlUltraPremiumConfig();
        }

        public boolean parseField(IntlUltraPremiumConfig intlUltraPremiumConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("intl_instant_match_tips_swipe_num")) {
                intlUltraPremiumConfig.intl_instant_match_tips_swipe_num = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("androidEnable")) {
                return false;
            }
            intlUltraPremiumConfig.androidEnable = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(IntlUltraPremiumConfig intlUltraPremiumConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("intl_instant_match_tips_swipe_num") || str.equals("androidEnable")) {
                return true;
            }
            return super.parseFieldCheck(intlUltraPremiumConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlUltraPremiumConfig intlUltraPremiumConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("androidEnable", intlUltraPremiumConfig.androidEnable);
            jsonGenerator.writeNumberField("intl_instant_match_tips_swipe_num", intlUltraPremiumConfig.intl_instant_match_tips_swipe_num);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlUltraPremiumConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlUltraPremiumConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlUltraPremiumConfig new_() {
        IntlUltraPremiumConfig intlUltraPremiumConfig = new IntlUltraPremiumConfig();
        intlUltraPremiumConfig.nullCheck();
        return intlUltraPremiumConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlUltraPremiumConfig mo223809clone() {
        IntlUltraPremiumConfig intlUltraPremiumConfig = new IntlUltraPremiumConfig();
        intlUltraPremiumConfig.androidEnable = this.androidEnable;
        intlUltraPremiumConfig.intl_instant_match_tips_swipe_num = this.intl_instant_match_tips_swipe_num;
        return intlUltraPremiumConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlUltraPremiumConfig)) {
            return false;
        }
        IntlUltraPremiumConfig intlUltraPremiumConfig = (IntlUltraPremiumConfig) obj;
        return this.androidEnable == intlUltraPremiumConfig.androidEnable && this.intl_instant_match_tips_swipe_num == intlUltraPremiumConfig.intl_instant_match_tips_swipe_num;
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
        int i2 = (((i * 41) + (this.androidEnable ? 1231 : 1237)) * 41) + this.intl_instant_match_tips_swipe_num;
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
