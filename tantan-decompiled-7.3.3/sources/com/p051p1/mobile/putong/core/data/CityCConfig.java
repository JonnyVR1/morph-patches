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
public class CityCConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "citycconfig";

    @ProtobufIndex(index = 1)
    public boolean showSelfCard;
    public static ProtobufAdapter<CityCConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<CityCConfig>() { // from class: com.p1.mobile.putong.core.data.CityCConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CityCConfig cityCConfig) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, cityCConfig.showSelfCard);
            cityCConfig.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CityCConfig parse(nc5 nc5Var) throws IOException {
            CityCConfig cityCConfig = new CityCConfig();
            while (nc5Var.m162497u() == 8) {
                cityCConfig.showSelfCard = nc5Var.m162483g();
            }
            return cityCConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CityCConfig cityCConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, cityCConfig.showSelfCard);
        }
    };
    public static JsonAdapter<CityCConfig> JSON_ADAPTER = new ObjectJsonAdapter<CityCConfig>() { // from class: com.p1.mobile.putong.core.data.CityCConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CityCConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CityCConfig newInstance() {
            return new CityCConfig();
        }

        public boolean parseField(CityCConfig cityCConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("showSelfCard")) {
                return false;
            }
            cityCConfig.showSelfCard = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(CityCConfig cityCConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("showSelfCard")) {
                return true;
            }
            return super.parseFieldCheck(cityCConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CityCConfig cityCConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("showSelfCard", cityCConfig.showSelfCard);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CityCConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CityCConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CityCConfig new_() {
        CityCConfig cityCConfig = new CityCConfig();
        cityCConfig.nullCheck();
        return cityCConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CityCConfig mo225055clone() {
        CityCConfig cityCConfig = new CityCConfig();
        cityCConfig.showSelfCard = this.showSelfCard;
        return cityCConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof CityCConfig) && this.showSelfCard == ((CityCConfig) obj).showSelfCard;
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
        int i2 = (i * 41) + (this.showSelfCard ? 1231 : 1237);
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
