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
public class LowUCommercialCardConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "lowucommercialcardconfig";

    @ProtobufIndex(index = 3)
    public int day_max_num;

    @ProtobufIndex(index = 1)
    public int start_card_num;

    @ProtobufIndex(index = 2)
    public int two_card_diff_num;
    public static ProtobufAdapter<LowUCommercialCardConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<LowUCommercialCardConfig>() { // from class: com.p1.mobile.putong.core.data.LowUCommercialCardConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LowUCommercialCardConfig lowUCommercialCardConfig) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, lowUCommercialCardConfig.start_card_num) + CodedOutputByteBufferNano.m17226h(2, lowUCommercialCardConfig.two_card_diff_num) + CodedOutputByteBufferNano.m17226h(3, lowUCommercialCardConfig.day_max_num);
            lowUCommercialCardConfig.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LowUCommercialCardConfig parse(nb5 nb5Var) throws IOException {
            LowUCommercialCardConfig lowUCommercialCardConfig = new LowUCommercialCardConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    lowUCommercialCardConfig.start_card_num = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    lowUCommercialCardConfig.two_card_diff_num = nb5Var.m158741j();
                } else {
                    if (iM158752u != 24) {
                        return lowUCommercialCardConfig;
                    }
                    lowUCommercialCardConfig.day_max_num = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LowUCommercialCardConfig lowUCommercialCardConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, lowUCommercialCardConfig.start_card_num);
            codedOutputByteBufferNano.m17250G(2, lowUCommercialCardConfig.two_card_diff_num);
            codedOutputByteBufferNano.m17250G(3, lowUCommercialCardConfig.day_max_num);
        }
    };
    public static JsonAdapter<LowUCommercialCardConfig> JSON_ADAPTER = new ObjectJsonAdapter<LowUCommercialCardConfig>() { // from class: com.p1.mobile.putong.core.data.LowUCommercialCardConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LowUCommercialCardConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LowUCommercialCardConfig newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LowUCommercialCardConfig lowUCommercialCardConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("start_card_num", lowUCommercialCardConfig.start_card_num);
            jsonGenerator.writeNumberField("two_card_diff_num", lowUCommercialCardConfig.two_card_diff_num);
            jsonGenerator.writeNumberField("day_max_num", lowUCommercialCardConfig.day_max_num);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LowUCommercialCardConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LowUCommercialCardConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LowUCommercialCardConfig new_() {
        LowUCommercialCardConfig lowUCommercialCardConfig = new LowUCommercialCardConfig();
        lowUCommercialCardConfig.nullCheck();
        return lowUCommercialCardConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LowUCommercialCardConfig mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + this.start_card_num) * 41) + this.two_card_diff_num) * 41) + this.day_max_num;
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
