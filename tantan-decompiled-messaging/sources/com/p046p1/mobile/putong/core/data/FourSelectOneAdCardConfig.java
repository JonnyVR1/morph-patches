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
public class FourSelectOneAdCardConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fourselectoneadcardconfig";

    @ProtobufIndex(index = 4)
    public boolean enable;

    @ProtobufIndex(index = 3)
    public int guideTimeInterval;

    @ProtobufIndex(index = 2)
    public int maxCardGuideCountPerDay;

    @ProtobufIndex(index = 1)
    public int trigerGuideLeftSwipeCount;
    public static ProtobufAdapter<FourSelectOneAdCardConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<FourSelectOneAdCardConfig>() { // from class: com.p1.mobile.putong.core.data.FourSelectOneAdCardConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FourSelectOneAdCardConfig fourSelectOneAdCardConfig) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, fourSelectOneAdCardConfig.trigerGuideLeftSwipeCount) + CodedOutputByteBufferNano.m17226h(2, fourSelectOneAdCardConfig.maxCardGuideCountPerDay) + CodedOutputByteBufferNano.m17226h(3, fourSelectOneAdCardConfig.guideTimeInterval) + CodedOutputByteBufferNano.m17220b(4, fourSelectOneAdCardConfig.enable);
            fourSelectOneAdCardConfig.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FourSelectOneAdCardConfig parse(nb5 nb5Var) throws IOException {
            FourSelectOneAdCardConfig fourSelectOneAdCardConfig = new FourSelectOneAdCardConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    fourSelectOneAdCardConfig.trigerGuideLeftSwipeCount = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    fourSelectOneAdCardConfig.maxCardGuideCountPerDay = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    fourSelectOneAdCardConfig.guideTimeInterval = nb5Var.m158741j();
                } else {
                    if (iM158752u != 32) {
                        return fourSelectOneAdCardConfig;
                    }
                    fourSelectOneAdCardConfig.enable = nb5Var.m158738g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FourSelectOneAdCardConfig fourSelectOneAdCardConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, fourSelectOneAdCardConfig.trigerGuideLeftSwipeCount);
            codedOutputByteBufferNano.m17250G(2, fourSelectOneAdCardConfig.maxCardGuideCountPerDay);
            codedOutputByteBufferNano.m17250G(3, fourSelectOneAdCardConfig.guideTimeInterval);
            codedOutputByteBufferNano.m17244A(4, fourSelectOneAdCardConfig.enable);
        }
    };
    public static JsonAdapter<FourSelectOneAdCardConfig> JSON_ADAPTER = new ObjectJsonAdapter<FourSelectOneAdCardConfig>() { // from class: com.p1.mobile.putong.core.data.FourSelectOneAdCardConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FourSelectOneAdCardConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FourSelectOneAdCardConfig newInstance() {
            return new FourSelectOneAdCardConfig();
        }

        public boolean parseField(FourSelectOneAdCardConfig fourSelectOneAdCardConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "trigerGuideLeftSwipeCount":
                    fourSelectOneAdCardConfig.trigerGuideLeftSwipeCount = jsonParser.getValueAsInt();
                    return true;
                case "enable":
                    fourSelectOneAdCardConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "guideTimeInterval":
                    fourSelectOneAdCardConfig.guideTimeInterval = jsonParser.getValueAsInt();
                    return true;
                case "maxCardGuideCountPerDay":
                    fourSelectOneAdCardConfig.maxCardGuideCountPerDay = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FourSelectOneAdCardConfig fourSelectOneAdCardConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "trigerGuideLeftSwipeCount":
                case "enable":
                case "guideTimeInterval":
                case "maxCardGuideCountPerDay":
                    return true;
                default:
                    return super.parseFieldCheck(fourSelectOneAdCardConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FourSelectOneAdCardConfig fourSelectOneAdCardConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("trigerGuideLeftSwipeCount", fourSelectOneAdCardConfig.trigerGuideLeftSwipeCount);
            jsonGenerator.writeNumberField("maxCardGuideCountPerDay", fourSelectOneAdCardConfig.maxCardGuideCountPerDay);
            jsonGenerator.writeNumberField("guideTimeInterval", fourSelectOneAdCardConfig.guideTimeInterval);
            jsonGenerator.writeBooleanField("enable", fourSelectOneAdCardConfig.enable);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FourSelectOneAdCardConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FourSelectOneAdCardConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FourSelectOneAdCardConfig new_() {
        FourSelectOneAdCardConfig fourSelectOneAdCardConfig = new FourSelectOneAdCardConfig();
        fourSelectOneAdCardConfig.nullCheck();
        return fourSelectOneAdCardConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FourSelectOneAdCardConfig mo223809clone() {
        FourSelectOneAdCardConfig fourSelectOneAdCardConfig = new FourSelectOneAdCardConfig();
        fourSelectOneAdCardConfig.trigerGuideLeftSwipeCount = this.trigerGuideLeftSwipeCount;
        fourSelectOneAdCardConfig.maxCardGuideCountPerDay = this.maxCardGuideCountPerDay;
        fourSelectOneAdCardConfig.guideTimeInterval = this.guideTimeInterval;
        fourSelectOneAdCardConfig.enable = this.enable;
        return fourSelectOneAdCardConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FourSelectOneAdCardConfig)) {
            return false;
        }
        FourSelectOneAdCardConfig fourSelectOneAdCardConfig = (FourSelectOneAdCardConfig) obj;
        return this.trigerGuideLeftSwipeCount == fourSelectOneAdCardConfig.trigerGuideLeftSwipeCount && this.maxCardGuideCountPerDay == fourSelectOneAdCardConfig.maxCardGuideCountPerDay && this.guideTimeInterval == fourSelectOneAdCardConfig.guideTimeInterval && this.enable == fourSelectOneAdCardConfig.enable;
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
        int i2 = (((((((i * 41) + this.trigerGuideLeftSwipeCount) * 41) + this.maxCardGuideCountPerDay) * 41) + this.guideTimeInterval) * 41) + (this.enable ? 1231 : 1237);
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
