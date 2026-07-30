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
public class ReSwipeConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "reswipeconfig";

    @ProtobufIndex(index = 3)
    public boolean enable;

    @NonNull
    @ProtobufIndex(index = 4)
    public String expType;

    @ProtobufIndex(index = 1)
    public int maxLabelCount;

    @ProtobufIndex(index = 2)
    public int showHours;
    public static ProtobufAdapter<ReSwipeConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ReSwipeConfig>() { // from class: com.p1.mobile.putong.core.data.ReSwipeConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ReSwipeConfig reSwipeConfig) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, reSwipeConfig.maxLabelCount) + CodedOutputByteBufferNano.m17281h(2, reSwipeConfig.showHours) + CodedOutputByteBufferNano.m17275b(3, reSwipeConfig.enable);
            String str = reSwipeConfig.expType;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(4, str);
            }
            reSwipeConfig.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ReSwipeConfig parse(nc5 nc5Var) throws IOException {
            ReSwipeConfig reSwipeConfig = new ReSwipeConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (reSwipeConfig.expType != null) {
                        break;
                    }
                    reSwipeConfig.expType = "";
                    break;
                }
                if (iM162497u == 8) {
                    reSwipeConfig.maxLabelCount = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    reSwipeConfig.showHours = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    reSwipeConfig.enable = nc5Var.m162483g();
                } else {
                    if (iM162497u != 34) {
                        if (reSwipeConfig.expType != null) {
                            break;
                        }
                        reSwipeConfig.expType = "";
                        return reSwipeConfig;
                    }
                    reSwipeConfig.expType = nc5Var.m162495s();
                }
            }
            return reSwipeConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ReSwipeConfig reSwipeConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, reSwipeConfig.maxLabelCount);
            codedOutputByteBufferNano.m17305G(2, reSwipeConfig.showHours);
            codedOutputByteBufferNano.m17299A(3, reSwipeConfig.enable);
            String str = reSwipeConfig.expType;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(4, str);
            }
        }
    };
    public static JsonAdapter<ReSwipeConfig> JSON_ADAPTER = new ObjectJsonAdapter<ReSwipeConfig>() { // from class: com.p1.mobile.putong.core.data.ReSwipeConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ReSwipeConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ReSwipeConfig newInstance() {
            return new ReSwipeConfig();
        }

        public boolean parseField(ReSwipeConfig reSwipeConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "showHours":
                    reSwipeConfig.showHours = jsonParser.getValueAsInt();
                    return true;
                case "expType":
                    reSwipeConfig.expType = jsonParser.getValueAsString();
                    return true;
                case "enable":
                    reSwipeConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "maxLabelCount":
                    reSwipeConfig.maxLabelCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ReSwipeConfig reSwipeConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "showHours":
                case "expType":
                case "enable":
                case "maxLabelCount":
                    return true;
                default:
                    return super.parseFieldCheck(reSwipeConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ReSwipeConfig reSwipeConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("maxLabelCount", reSwipeConfig.maxLabelCount);
            jsonGenerator.writeNumberField("showHours", reSwipeConfig.showHours);
            jsonGenerator.writeBooleanField("enable", reSwipeConfig.enable);
            String str = reSwipeConfig.expType;
            if (str != null) {
                jsonGenerator.writeStringField("expType", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ReSwipeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ReSwipeConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ReSwipeConfig new_() {
        ReSwipeConfig reSwipeConfig = new ReSwipeConfig();
        reSwipeConfig.nullCheck();
        return reSwipeConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ReSwipeConfig mo225055clone() {
        ReSwipeConfig reSwipeConfig = new ReSwipeConfig();
        reSwipeConfig.maxLabelCount = this.maxLabelCount;
        reSwipeConfig.showHours = this.showHours;
        reSwipeConfig.enable = this.enable;
        reSwipeConfig.expType = this.expType;
        return reSwipeConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReSwipeConfig)) {
            return false;
        }
        ReSwipeConfig reSwipeConfig = (ReSwipeConfig) obj;
        return this.maxLabelCount == reSwipeConfig.maxLabelCount && this.showHours == reSwipeConfig.showHours && this.enable == reSwipeConfig.enable && ValueObject.util_equals(this.expType, reSwipeConfig.expType);
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
        int i2 = ((((((i * 41) + this.maxLabelCount) * 41) + this.showHours) * 41) + (this.enable ? 1231 : 1237)) * 41;
        String str = this.expType;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.expType == null) {
            this.expType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
