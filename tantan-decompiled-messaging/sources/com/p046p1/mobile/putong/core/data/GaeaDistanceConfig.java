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
public class GaeaDistanceConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gaeadistanceconfig";

    @ProtobufIndex(index = 1)
    public boolean gaeaDistanceOpen;
    public static ProtobufAdapter<GaeaDistanceConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<GaeaDistanceConfig>() { // from class: com.p1.mobile.putong.core.data.GaeaDistanceConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GaeaDistanceConfig gaeaDistanceConfig) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, gaeaDistanceConfig.gaeaDistanceOpen);
            gaeaDistanceConfig.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GaeaDistanceConfig parse(nb5 nb5Var) throws IOException {
            GaeaDistanceConfig gaeaDistanceConfig = new GaeaDistanceConfig();
            while (nb5Var.m158752u() == 8) {
                gaeaDistanceConfig.gaeaDistanceOpen = nb5Var.m158738g();
            }
            return gaeaDistanceConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GaeaDistanceConfig gaeaDistanceConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, gaeaDistanceConfig.gaeaDistanceOpen);
        }
    };
    public static JsonAdapter<GaeaDistanceConfig> JSON_ADAPTER = new ObjectJsonAdapter<GaeaDistanceConfig>() { // from class: com.p1.mobile.putong.core.data.GaeaDistanceConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GaeaDistanceConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GaeaDistanceConfig newInstance() {
            return new GaeaDistanceConfig();
        }

        public boolean parseField(GaeaDistanceConfig gaeaDistanceConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("gaeaDistanceOpen")) {
                return false;
            }
            gaeaDistanceConfig.gaeaDistanceOpen = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(GaeaDistanceConfig gaeaDistanceConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("gaeaDistanceOpen")) {
                return true;
            }
            return super.parseFieldCheck(gaeaDistanceConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GaeaDistanceConfig gaeaDistanceConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("gaeaDistanceOpen", gaeaDistanceConfig.gaeaDistanceOpen);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GaeaDistanceConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GaeaDistanceConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GaeaDistanceConfig new_() {
        GaeaDistanceConfig gaeaDistanceConfig = new GaeaDistanceConfig();
        gaeaDistanceConfig.nullCheck();
        return gaeaDistanceConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GaeaDistanceConfig mo223809clone() {
        GaeaDistanceConfig gaeaDistanceConfig = new GaeaDistanceConfig();
        gaeaDistanceConfig.gaeaDistanceOpen = this.gaeaDistanceOpen;
        return gaeaDistanceConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GaeaDistanceConfig) && this.gaeaDistanceOpen == ((GaeaDistanceConfig) obj).gaeaDistanceOpen;
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
        int i2 = (i * 41) + (this.gaeaDistanceOpen ? 1231 : 1237);
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
