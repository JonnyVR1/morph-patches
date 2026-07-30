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
public class LowUCommercialCardConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "lowucommercialcardconfig";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int day_max_num;

    @ProtobufIndex(index = 1)
    public int start_card_num;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int two_card_diff_num;
    public static ProtobufAdapter<LowUCommercialCardConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<LowUCommercialCardConfig>() { // from class: com.p1.mobile.putong.core.data.LowUCommercialCardConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LowUCommercialCardConfig lowUCommercialCardConfig) {
            int iH = CodedOutputByteBufferNano.h(1, lowUCommercialCardConfig.start_card_num) + CodedOutputByteBufferNano.h(2, lowUCommercialCardConfig.two_card_diff_num) + CodedOutputByteBufferNano.h(3, lowUCommercialCardConfig.day_max_num);
            ((MessageNano) lowUCommercialCardConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LowUCommercialCardConfig m14033parse(nb5 nb5Var) throws IOException {
            LowUCommercialCardConfig lowUCommercialCardConfig = new LowUCommercialCardConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    lowUCommercialCardConfig.start_card_num = nb5Var.j();
                } else if (iU == 16) {
                    lowUCommercialCardConfig.two_card_diff_num = nb5Var.j();
                } else {
                    if (iU != 24) {
                        return lowUCommercialCardConfig;
                    }
                    lowUCommercialCardConfig.day_max_num = nb5Var.j();
                }
            }
        }

        public void serialize(LowUCommercialCardConfig lowUCommercialCardConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, lowUCommercialCardConfig.start_card_num);
            codedOutputByteBufferNano.G(2, lowUCommercialCardConfig.two_card_diff_num);
            codedOutputByteBufferNano.G(3, lowUCommercialCardConfig.day_max_num);
        }
    };
    public static JsonAdapter<LowUCommercialCardConfig> JSON_ADAPTER = new ObjectJsonAdapter<LowUCommercialCardConfig>() { // from class: com.p1.mobile.putong.core.data.LowUCommercialCardConfig.2
        public Class getDataClass() {
            return LowUCommercialCardConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LowUCommercialCardConfig m14034newInstance() {
            return new LowUCommercialCardConfig();
        }

        public boolean parseField(LowUCommercialCardConfig lowUCommercialCardConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "day_max_num":
                    lowUCommercialCardConfig.day_max_num = jsonParser.getValueAsInt();
                    return true;
                case "two_card_diff_num":
                    lowUCommercialCardConfig.two_card_diff_num = jsonParser.getValueAsInt();
                    return true;
                case "start_card_num":
                    lowUCommercialCardConfig.start_card_num = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LowUCommercialCardConfig lowUCommercialCardConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "day_max_num":
                case "two_card_diff_num":
                case "start_card_num":
                    return true;
                default:
                    return super.parseFieldCheck(lowUCommercialCardConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(LowUCommercialCardConfig lowUCommercialCardConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("start_card_num", lowUCommercialCardConfig.start_card_num);
            jsonGenerator.writeNumberField("two_card_diff_num", lowUCommercialCardConfig.two_card_diff_num);
            jsonGenerator.writeNumberField("day_max_num", lowUCommercialCardConfig.day_max_num);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LowUCommercialCardConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LowUCommercialCardConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LowUCommercialCardConfig new_() {
        LowUCommercialCardConfig lowUCommercialCardConfig = new LowUCommercialCardConfig();
        lowUCommercialCardConfig.nullCheck();
        return lowUCommercialCardConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LowUCommercialCardConfig m14032clone() {
        LowUCommercialCardConfig lowUCommercialCardConfig = new LowUCommercialCardConfig();
        lowUCommercialCardConfig.start_card_num = this.start_card_num;
        lowUCommercialCardConfig.two_card_diff_num = this.two_card_diff_num;
        lowUCommercialCardConfig.day_max_num = this.day_max_num;
        return lowUCommercialCardConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LowUCommercialCardConfig)) {
            return false;
        }
        LowUCommercialCardConfig lowUCommercialCardConfig = (LowUCommercialCardConfig) obj;
        return this.start_card_num == lowUCommercialCardConfig.start_card_num && this.two_card_diff_num == lowUCommercialCardConfig.two_card_diff_num && this.day_max_num == lowUCommercialCardConfig.day_max_num;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + this.start_card_num) * 41) + this.two_card_diff_num) * 41) + this.day_max_num;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
