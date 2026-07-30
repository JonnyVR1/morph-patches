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
public class FemaleVipConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "femalevipconfig";

    @ProtobufIndex(index = 2)
    public boolean guide_card_insert_enable;

    @ProtobufIndex(index = 3)
    public int guide_card_insert_interval_day;

    @ProtobufIndex(index = 4)
    public boolean guide_card_right_swipe_guide_purchase;

    @ProtobufIndex(index = 1)
    public int guide_card_swipe_limit_count;
    public static ProtobufAdapter<FemaleVipConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<FemaleVipConfig>() { // from class: com.p1.mobile.putong.core.data.FemaleVipConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FemaleVipConfig femaleVipConfig) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, femaleVipConfig.guide_card_swipe_limit_count) + CodedOutputByteBufferNano.m17220b(2, femaleVipConfig.guide_card_insert_enable) + CodedOutputByteBufferNano.m17226h(3, femaleVipConfig.guide_card_insert_interval_day) + CodedOutputByteBufferNano.m17220b(4, femaleVipConfig.guide_card_right_swipe_guide_purchase);
            femaleVipConfig.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FemaleVipConfig parse(nb5 nb5Var) throws IOException {
            FemaleVipConfig femaleVipConfig = new FemaleVipConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    femaleVipConfig.guide_card_swipe_limit_count = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    femaleVipConfig.guide_card_insert_enable = nb5Var.m158738g();
                } else if (iM158752u == 24) {
                    femaleVipConfig.guide_card_insert_interval_day = nb5Var.m158741j();
                } else {
                    if (iM158752u != 32) {
                        return femaleVipConfig;
                    }
                    femaleVipConfig.guide_card_right_swipe_guide_purchase = nb5Var.m158738g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FemaleVipConfig femaleVipConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, femaleVipConfig.guide_card_swipe_limit_count);
            codedOutputByteBufferNano.m17244A(2, femaleVipConfig.guide_card_insert_enable);
            codedOutputByteBufferNano.m17250G(3, femaleVipConfig.guide_card_insert_interval_day);
            codedOutputByteBufferNano.m17244A(4, femaleVipConfig.guide_card_right_swipe_guide_purchase);
        }
    };
    public static JsonAdapter<FemaleVipConfig> JSON_ADAPTER = new ObjectJsonAdapter<FemaleVipConfig>() { // from class: com.p1.mobile.putong.core.data.FemaleVipConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FemaleVipConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FemaleVipConfig newInstance() {
            return new FemaleVipConfig();
        }

        public boolean parseField(FemaleVipConfig femaleVipConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "guide_card_swipe_limit_count":
                    femaleVipConfig.guide_card_swipe_limit_count = jsonParser.getValueAsInt();
                    return true;
                case "guide_card_insert_enable":
                    femaleVipConfig.guide_card_insert_enable = jsonParser.getValueAsBoolean();
                    return true;
                case "guide_card_insert_interval_day":
                    femaleVipConfig.guide_card_insert_interval_day = jsonParser.getValueAsInt();
                    return true;
                case "guide_card_right_swipe_guide_purchase":
                    femaleVipConfig.guide_card_right_swipe_guide_purchase = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FemaleVipConfig femaleVipConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "guide_card_swipe_limit_count":
                case "guide_card_insert_enable":
                case "guide_card_insert_interval_day":
                case "guide_card_right_swipe_guide_purchase":
                    return true;
                default:
                    return super.parseFieldCheck(femaleVipConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FemaleVipConfig femaleVipConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("guide_card_swipe_limit_count", femaleVipConfig.guide_card_swipe_limit_count);
            jsonGenerator.writeBooleanField("guide_card_insert_enable", femaleVipConfig.guide_card_insert_enable);
            jsonGenerator.writeBooleanField("guide_card_right_swipe_guide_purchase", femaleVipConfig.guide_card_right_swipe_guide_purchase);
            jsonGenerator.writeNumberField("guide_card_insert_interval_day", femaleVipConfig.guide_card_insert_interval_day);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FemaleVipConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FemaleVipConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FemaleVipConfig new_() {
        FemaleVipConfig femaleVipConfig = new FemaleVipConfig();
        femaleVipConfig.nullCheck();
        return femaleVipConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FemaleVipConfig mo223809clone() {
        FemaleVipConfig femaleVipConfig = new FemaleVipConfig();
        femaleVipConfig.guide_card_swipe_limit_count = this.guide_card_swipe_limit_count;
        femaleVipConfig.guide_card_insert_enable = this.guide_card_insert_enable;
        femaleVipConfig.guide_card_right_swipe_guide_purchase = this.guide_card_right_swipe_guide_purchase;
        femaleVipConfig.guide_card_insert_interval_day = this.guide_card_insert_interval_day;
        return femaleVipConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FemaleVipConfig)) {
            return false;
        }
        FemaleVipConfig femaleVipConfig = (FemaleVipConfig) obj;
        return this.guide_card_swipe_limit_count == femaleVipConfig.guide_card_swipe_limit_count && this.guide_card_insert_enable == femaleVipConfig.guide_card_insert_enable && this.guide_card_right_swipe_guide_purchase == femaleVipConfig.guide_card_right_swipe_guide_purchase && this.guide_card_insert_interval_day == femaleVipConfig.guide_card_insert_interval_day;
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
        int i2 = (((((((i * 41) + this.guide_card_swipe_limit_count) * 41) + (this.guide_card_insert_enable ? 1231 : 1237)) * 41) + (this.guide_card_right_swipe_guide_purchase ? 1231 : 1237)) * 41) + this.guide_card_insert_interval_day;
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
