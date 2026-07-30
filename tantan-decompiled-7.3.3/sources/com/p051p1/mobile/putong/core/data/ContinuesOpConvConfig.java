package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class ContinuesOpConvConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "continuesopconvconfig";

    @ProtobufIndex(index = 2)
    public int branch_size;

    @ProtobufIndex(index = 4)
    public boolean enable;

    @NonNull
    @ProtobufIndex(index = 3)
    public String finish_tips;

    @ProtobufIndex(index = 1)
    public int max_count;
    public static ProtobufAdapter<ContinuesOpConvConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ContinuesOpConvConfig>() { // from class: com.p1.mobile.putong.core.data.ContinuesOpConvConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ContinuesOpConvConfig continuesOpConvConfig) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, continuesOpConvConfig.max_count) + CodedOutputByteBufferNano.m17281h(2, continuesOpConvConfig.branch_size);
            String str = continuesOpConvConfig.finish_tips;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(3, str);
            }
            int iM17275b = iM17281h + CodedOutputByteBufferNano.m17275b(4, continuesOpConvConfig.enable);
            continuesOpConvConfig.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ContinuesOpConvConfig parse(nc5 nc5Var) throws IOException {
            ContinuesOpConvConfig continuesOpConvConfig = new ContinuesOpConvConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (continuesOpConvConfig.finish_tips != null) {
                        break;
                    }
                    continuesOpConvConfig.finish_tips = "";
                    break;
                }
                if (iM162497u == 8) {
                    continuesOpConvConfig.max_count = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    continuesOpConvConfig.branch_size = nc5Var.m162486j();
                } else if (iM162497u == 26) {
                    continuesOpConvConfig.finish_tips = nc5Var.m162495s();
                } else {
                    if (iM162497u != 32) {
                        if (continuesOpConvConfig.finish_tips != null) {
                            break;
                        }
                        continuesOpConvConfig.finish_tips = "";
                        return continuesOpConvConfig;
                    }
                    continuesOpConvConfig.enable = nc5Var.m162483g();
                }
            }
            return continuesOpConvConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ContinuesOpConvConfig continuesOpConvConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, continuesOpConvConfig.max_count);
            codedOutputByteBufferNano.m17305G(2, continuesOpConvConfig.branch_size);
            String str = continuesOpConvConfig.finish_tips;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(3, str);
            }
            codedOutputByteBufferNano.m17299A(4, continuesOpConvConfig.enable);
        }
    };
    public static JsonAdapter<ContinuesOpConvConfig> JSON_ADAPTER = new ObjectJsonAdapter<ContinuesOpConvConfig>() { // from class: com.p1.mobile.putong.core.data.ContinuesOpConvConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ContinuesOpConvConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ContinuesOpConvConfig newInstance() {
            return new ContinuesOpConvConfig();
        }

        public boolean parseField(ContinuesOpConvConfig continuesOpConvConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enable":
                    continuesOpConvConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "branch_size":
                    continuesOpConvConfig.branch_size = jsonParser.getValueAsInt();
                    return true;
                case "max_count":
                    continuesOpConvConfig.max_count = jsonParser.getValueAsInt();
                    return true;
                case "finish_tips":
                    continuesOpConvConfig.finish_tips = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ContinuesOpConvConfig continuesOpConvConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "enable":
                case "branch_size":
                case "max_count":
                case "finish_tips":
                    return true;
                default:
                    return super.parseFieldCheck(continuesOpConvConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ContinuesOpConvConfig continuesOpConvConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("max_count", continuesOpConvConfig.max_count);
            jsonGenerator.writeNumberField("branch_size", continuesOpConvConfig.branch_size);
            String str = continuesOpConvConfig.finish_tips;
            if (str != null) {
                jsonGenerator.writeStringField("finish_tips", str);
            }
            jsonGenerator.writeBooleanField("enable", continuesOpConvConfig.enable);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ContinuesOpConvConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ContinuesOpConvConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ContinuesOpConvConfig new_() {
        ContinuesOpConvConfig continuesOpConvConfig = new ContinuesOpConvConfig();
        continuesOpConvConfig.nullCheck();
        return continuesOpConvConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ContinuesOpConvConfig mo225055clone() {
        ContinuesOpConvConfig continuesOpConvConfig = new ContinuesOpConvConfig();
        continuesOpConvConfig.max_count = this.max_count;
        continuesOpConvConfig.branch_size = this.branch_size;
        continuesOpConvConfig.finish_tips = this.finish_tips;
        continuesOpConvConfig.enable = this.enable;
        return continuesOpConvConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContinuesOpConvConfig)) {
            return false;
        }
        ContinuesOpConvConfig continuesOpConvConfig = (ContinuesOpConvConfig) obj;
        return this.max_count == continuesOpConvConfig.max_count && this.branch_size == continuesOpConvConfig.branch_size && ValueObject.util_equals(this.finish_tips, continuesOpConvConfig.finish_tips) && this.enable == continuesOpConvConfig.enable;
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
        int i2 = ((((i * 41) + this.max_count) * 41) + this.branch_size) * 41;
        String str = this.finish_tips;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.enable ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.finish_tips == null) {
            this.finish_tips = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
