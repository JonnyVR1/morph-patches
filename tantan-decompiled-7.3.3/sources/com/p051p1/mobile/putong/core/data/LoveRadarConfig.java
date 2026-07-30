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
public class LoveRadarConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "loveradarconfig";

    @ProtobufIndex(index = 1)
    public boolean isHaveLoveRadar;
    public static ProtobufAdapter<LoveRadarConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<LoveRadarConfig>() { // from class: com.p1.mobile.putong.core.data.LoveRadarConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LoveRadarConfig loveRadarConfig) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, loveRadarConfig.isHaveLoveRadar);
            loveRadarConfig.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LoveRadarConfig parse(nc5 nc5Var) throws IOException {
            LoveRadarConfig loveRadarConfig = new LoveRadarConfig();
            while (nc5Var.m162497u() == 8) {
                loveRadarConfig.isHaveLoveRadar = nc5Var.m162483g();
            }
            return loveRadarConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LoveRadarConfig loveRadarConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, loveRadarConfig.isHaveLoveRadar);
        }
    };
    public static JsonAdapter<LoveRadarConfig> JSON_ADAPTER = new ObjectJsonAdapter<LoveRadarConfig>() { // from class: com.p1.mobile.putong.core.data.LoveRadarConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LoveRadarConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LoveRadarConfig newInstance() {
            return new LoveRadarConfig();
        }

        public boolean parseField(LoveRadarConfig loveRadarConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("isHaveLoveRadar")) {
                return false;
            }
            loveRadarConfig.isHaveLoveRadar = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(LoveRadarConfig loveRadarConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("isHaveLoveRadar")) {
                return true;
            }
            return super.parseFieldCheck(loveRadarConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LoveRadarConfig loveRadarConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isHaveLoveRadar", loveRadarConfig.isHaveLoveRadar);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LoveRadarConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LoveRadarConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LoveRadarConfig new_() {
        LoveRadarConfig loveRadarConfig = new LoveRadarConfig();
        loveRadarConfig.nullCheck();
        return loveRadarConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LoveRadarConfig mo225055clone() {
        LoveRadarConfig loveRadarConfig = new LoveRadarConfig();
        loveRadarConfig.isHaveLoveRadar = this.isHaveLoveRadar;
        return loveRadarConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof LoveRadarConfig) && this.isHaveLoveRadar == ((LoveRadarConfig) obj).isHaveLoveRadar;
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
        int i2 = (i * 41) + (this.isHaveLoveRadar ? 1231 : 1237);
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
