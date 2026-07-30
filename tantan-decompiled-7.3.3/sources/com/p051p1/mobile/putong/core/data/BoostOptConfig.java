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
public class BoostOptConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "boostoptconfig";

    @ProtobufIndex(index = 1)
    public int min_match_count;
    public static ProtobufAdapter<BoostOptConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<BoostOptConfig>() { // from class: com.p1.mobile.putong.core.data.BoostOptConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BoostOptConfig boostOptConfig) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, boostOptConfig.min_match_count);
            boostOptConfig.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BoostOptConfig parse(nc5 nc5Var) throws IOException {
            BoostOptConfig boostOptConfig = new BoostOptConfig();
            while (nc5Var.m162497u() == 8) {
                boostOptConfig.min_match_count = nc5Var.m162486j();
            }
            return boostOptConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BoostOptConfig boostOptConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, boostOptConfig.min_match_count);
        }
    };
    public static JsonAdapter<BoostOptConfig> JSON_ADAPTER = new ObjectJsonAdapter<BoostOptConfig>() { // from class: com.p1.mobile.putong.core.data.BoostOptConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BoostOptConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BoostOptConfig newInstance() {
            return new BoostOptConfig();
        }

        public boolean parseField(BoostOptConfig boostOptConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("min_match_count")) {
                return false;
            }
            boostOptConfig.min_match_count = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(BoostOptConfig boostOptConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("min_match_count")) {
                return true;
            }
            return super.parseFieldCheck(boostOptConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BoostOptConfig boostOptConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("min_match_count", boostOptConfig.min_match_count);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BoostOptConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BoostOptConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BoostOptConfig new_() {
        BoostOptConfig boostOptConfig = new BoostOptConfig();
        boostOptConfig.nullCheck();
        return boostOptConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BoostOptConfig mo225055clone() {
        BoostOptConfig boostOptConfig = new BoostOptConfig();
        boostOptConfig.min_match_count = this.min_match_count;
        return boostOptConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BoostOptConfig) && this.min_match_count == ((BoostOptConfig) obj).min_match_count;
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
        int i2 = (i * 41) + this.min_match_count;
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
