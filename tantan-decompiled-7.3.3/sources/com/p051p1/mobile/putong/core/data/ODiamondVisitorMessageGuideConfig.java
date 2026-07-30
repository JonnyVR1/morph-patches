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
public class ODiamondVisitorMessageGuideConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "odiamondvisitormessageguideconfig";

    @ProtobufIndex(index = 3)
    public int conversation_close_intervals;

    @ProtobufIndex(index = 1)
    public int total_limit_daily;

    @ProtobufIndex(index = 2)
    public int user_limit_daily;
    public static ProtobufAdapter<ODiamondVisitorMessageGuideConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ODiamondVisitorMessageGuideConfig>() { // from class: com.p1.mobile.putong.core.data.ODiamondVisitorMessageGuideConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ODiamondVisitorMessageGuideConfig oDiamondVisitorMessageGuideConfig) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, oDiamondVisitorMessageGuideConfig.total_limit_daily) + CodedOutputByteBufferNano.m17281h(2, oDiamondVisitorMessageGuideConfig.user_limit_daily) + CodedOutputByteBufferNano.m17281h(3, oDiamondVisitorMessageGuideConfig.conversation_close_intervals);
            oDiamondVisitorMessageGuideConfig.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ODiamondVisitorMessageGuideConfig parse(nc5 nc5Var) throws IOException {
            ODiamondVisitorMessageGuideConfig oDiamondVisitorMessageGuideConfig = new ODiamondVisitorMessageGuideConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    oDiamondVisitorMessageGuideConfig.total_limit_daily = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    oDiamondVisitorMessageGuideConfig.user_limit_daily = nc5Var.m162486j();
                } else {
                    if (iM162497u != 24) {
                        return oDiamondVisitorMessageGuideConfig;
                    }
                    oDiamondVisitorMessageGuideConfig.conversation_close_intervals = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ODiamondVisitorMessageGuideConfig oDiamondVisitorMessageGuideConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, oDiamondVisitorMessageGuideConfig.total_limit_daily);
            codedOutputByteBufferNano.m17305G(2, oDiamondVisitorMessageGuideConfig.user_limit_daily);
            codedOutputByteBufferNano.m17305G(3, oDiamondVisitorMessageGuideConfig.conversation_close_intervals);
        }
    };
    public static JsonAdapter<ODiamondVisitorMessageGuideConfig> JSON_ADAPTER = new ObjectJsonAdapter<ODiamondVisitorMessageGuideConfig>() { // from class: com.p1.mobile.putong.core.data.ODiamondVisitorMessageGuideConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ODiamondVisitorMessageGuideConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ODiamondVisitorMessageGuideConfig newInstance() {
            return new ODiamondVisitorMessageGuideConfig();
        }

        public boolean parseField(ODiamondVisitorMessageGuideConfig oDiamondVisitorMessageGuideConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "total_limit_daily":
                    oDiamondVisitorMessageGuideConfig.total_limit_daily = jsonParser.getValueAsInt();
                    return true;
                case "conversation_close_intervals":
                    oDiamondVisitorMessageGuideConfig.conversation_close_intervals = jsonParser.getValueAsInt();
                    return true;
                case "user_limit_daily":
                    oDiamondVisitorMessageGuideConfig.user_limit_daily = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ODiamondVisitorMessageGuideConfig oDiamondVisitorMessageGuideConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "total_limit_daily":
                case "conversation_close_intervals":
                case "user_limit_daily":
                    return true;
                default:
                    return super.parseFieldCheck(oDiamondVisitorMessageGuideConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ODiamondVisitorMessageGuideConfig oDiamondVisitorMessageGuideConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("total_limit_daily", oDiamondVisitorMessageGuideConfig.total_limit_daily);
            jsonGenerator.writeNumberField("user_limit_daily", oDiamondVisitorMessageGuideConfig.user_limit_daily);
            jsonGenerator.writeNumberField("conversation_close_intervals", oDiamondVisitorMessageGuideConfig.conversation_close_intervals);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ODiamondVisitorMessageGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ODiamondVisitorMessageGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ODiamondVisitorMessageGuideConfig new_() {
        ODiamondVisitorMessageGuideConfig oDiamondVisitorMessageGuideConfig = new ODiamondVisitorMessageGuideConfig();
        oDiamondVisitorMessageGuideConfig.nullCheck();
        return oDiamondVisitorMessageGuideConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ODiamondVisitorMessageGuideConfig mo225055clone() {
        ODiamondVisitorMessageGuideConfig oDiamondVisitorMessageGuideConfig = new ODiamondVisitorMessageGuideConfig();
        oDiamondVisitorMessageGuideConfig.total_limit_daily = this.total_limit_daily;
        oDiamondVisitorMessageGuideConfig.user_limit_daily = this.user_limit_daily;
        oDiamondVisitorMessageGuideConfig.conversation_close_intervals = this.conversation_close_intervals;
        return oDiamondVisitorMessageGuideConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ODiamondVisitorMessageGuideConfig)) {
            return false;
        }
        ODiamondVisitorMessageGuideConfig oDiamondVisitorMessageGuideConfig = (ODiamondVisitorMessageGuideConfig) obj;
        return this.total_limit_daily == oDiamondVisitorMessageGuideConfig.total_limit_daily && this.user_limit_daily == oDiamondVisitorMessageGuideConfig.user_limit_daily && this.conversation_close_intervals == oDiamondVisitorMessageGuideConfig.conversation_close_intervals;
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
        int i2 = (((((i * 41) + this.total_limit_daily) * 41) + this.user_limit_daily) * 41) + this.conversation_close_intervals;
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
