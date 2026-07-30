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
public class IntlUltraPremiumConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlultrapremiumconfig";

    @ProtobufIndex(index = 1)
    public boolean androidEnable;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int intl_instant_match_tips_swipe_num;
    public static ProtobufAdapter<IntlUltraPremiumConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlUltraPremiumConfig>() { // from class: com.p1.mobile.putong.core.data.IntlUltraPremiumConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlUltraPremiumConfig intlUltraPremiumConfig) {
            int iB = CodedOutputByteBufferNano.b(1, intlUltraPremiumConfig.androidEnable) + CodedOutputByteBufferNano.h(2, intlUltraPremiumConfig.intl_instant_match_tips_swipe_num);
            ((MessageNano) intlUltraPremiumConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlUltraPremiumConfig m13723parse(nb5 nb5Var) throws IOException {
            IntlUltraPremiumConfig intlUltraPremiumConfig = new IntlUltraPremiumConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    intlUltraPremiumConfig.androidEnable = nb5Var.g();
                } else {
                    if (iU != 16) {
                        return intlUltraPremiumConfig;
                    }
                    intlUltraPremiumConfig.intl_instant_match_tips_swipe_num = nb5Var.j();
                }
            }
        }

        public void serialize(IntlUltraPremiumConfig intlUltraPremiumConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, intlUltraPremiumConfig.androidEnable);
            codedOutputByteBufferNano.G(2, intlUltraPremiumConfig.intl_instant_match_tips_swipe_num);
        }
    };
    public static JsonAdapter<IntlUltraPremiumConfig> JSON_ADAPTER = new ObjectJsonAdapter<IntlUltraPremiumConfig>() { // from class: com.p1.mobile.putong.core.data.IntlUltraPremiumConfig.2
        public Class getDataClass() {
            return IntlUltraPremiumConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlUltraPremiumConfig m13724newInstance() {
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

        public void serializeFields(IntlUltraPremiumConfig intlUltraPremiumConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("androidEnable", intlUltraPremiumConfig.androidEnable);
            jsonGenerator.writeNumberField("intl_instant_match_tips_swipe_num", intlUltraPremiumConfig.intl_instant_match_tips_swipe_num);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlUltraPremiumConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlUltraPremiumConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlUltraPremiumConfig new_() {
        IntlUltraPremiumConfig intlUltraPremiumConfig = new IntlUltraPremiumConfig();
        intlUltraPremiumConfig.nullCheck();
        return intlUltraPremiumConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlUltraPremiumConfig m13722clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.androidEnable ? 1231 : 1237)) * 41) + this.intl_instant_match_tips_swipe_num;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
