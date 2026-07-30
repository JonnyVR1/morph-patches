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
public class IceBreakOfflineConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "icebreakofflineconfig";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = 2)
    public int insertA;

    @ProtobufIndex(index = 3)
    public int insertB;

    @ProtobufIndex(index = 4)
    public int insertN;
    public static ProtobufAdapter<IceBreakOfflineConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<IceBreakOfflineConfig>() { // from class: com.p1.mobile.putong.core.data.IceBreakOfflineConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IceBreakOfflineConfig iceBreakOfflineConfig) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, iceBreakOfflineConfig.enable) + CodedOutputByteBufferNano.m17281h(2, iceBreakOfflineConfig.insertA) + CodedOutputByteBufferNano.m17281h(3, iceBreakOfflineConfig.insertB) + CodedOutputByteBufferNano.m17281h(4, iceBreakOfflineConfig.insertN);
            iceBreakOfflineConfig.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IceBreakOfflineConfig parse(nc5 nc5Var) throws IOException {
            IceBreakOfflineConfig iceBreakOfflineConfig = new IceBreakOfflineConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    iceBreakOfflineConfig.enable = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    iceBreakOfflineConfig.insertA = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    iceBreakOfflineConfig.insertB = nc5Var.m162486j();
                } else {
                    if (iM162497u != 32) {
                        return iceBreakOfflineConfig;
                    }
                    iceBreakOfflineConfig.insertN = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IceBreakOfflineConfig iceBreakOfflineConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, iceBreakOfflineConfig.enable);
            codedOutputByteBufferNano.m17305G(2, iceBreakOfflineConfig.insertA);
            codedOutputByteBufferNano.m17305G(3, iceBreakOfflineConfig.insertB);
            codedOutputByteBufferNano.m17305G(4, iceBreakOfflineConfig.insertN);
        }
    };
    public static JsonAdapter<IceBreakOfflineConfig> JSON_ADAPTER = new ObjectJsonAdapter<IceBreakOfflineConfig>() { // from class: com.p1.mobile.putong.core.data.IceBreakOfflineConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IceBreakOfflineConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IceBreakOfflineConfig newInstance() {
            return new IceBreakOfflineConfig();
        }

        public boolean parseField(IceBreakOfflineConfig iceBreakOfflineConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enable":
                    iceBreakOfflineConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "insertA":
                    iceBreakOfflineConfig.insertA = jsonParser.getValueAsInt();
                    return true;
                case "insertB":
                    iceBreakOfflineConfig.insertB = jsonParser.getValueAsInt();
                    return true;
                case "insertN":
                    iceBreakOfflineConfig.insertN = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IceBreakOfflineConfig iceBreakOfflineConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "enable":
                case "insertA":
                case "insertB":
                case "insertN":
                    return true;
                default:
                    return super.parseFieldCheck(iceBreakOfflineConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IceBreakOfflineConfig iceBreakOfflineConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", iceBreakOfflineConfig.enable);
            jsonGenerator.writeNumberField("insertA", iceBreakOfflineConfig.insertA);
            jsonGenerator.writeNumberField("insertB", iceBreakOfflineConfig.insertB);
            jsonGenerator.writeNumberField("insertN", iceBreakOfflineConfig.insertN);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IceBreakOfflineConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IceBreakOfflineConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IceBreakOfflineConfig new_() {
        IceBreakOfflineConfig iceBreakOfflineConfig = new IceBreakOfflineConfig();
        iceBreakOfflineConfig.nullCheck();
        return iceBreakOfflineConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IceBreakOfflineConfig mo225055clone() {
        IceBreakOfflineConfig iceBreakOfflineConfig = new IceBreakOfflineConfig();
        iceBreakOfflineConfig.enable = this.enable;
        iceBreakOfflineConfig.insertA = this.insertA;
        iceBreakOfflineConfig.insertB = this.insertB;
        iceBreakOfflineConfig.insertN = this.insertN;
        return iceBreakOfflineConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IceBreakOfflineConfig)) {
            return false;
        }
        IceBreakOfflineConfig iceBreakOfflineConfig = (IceBreakOfflineConfig) obj;
        return this.enable == iceBreakOfflineConfig.enable && this.insertA == iceBreakOfflineConfig.insertA && this.insertB == iceBreakOfflineConfig.insertB && this.insertN == iceBreakOfflineConfig.insertN;
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
        int i2 = (((((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.insertA) * 41) + this.insertB) * 41) + this.insertN;
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
