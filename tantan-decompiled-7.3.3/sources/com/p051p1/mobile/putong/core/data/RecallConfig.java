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
public class RecallConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "recallconfig";

    @ProtobufIndex(index = 2)
    public boolean enable;

    @ProtobufIndex(index = 1)
    public int minutes;
    public static ProtobufAdapter<RecallConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<RecallConfig>() { // from class: com.p1.mobile.putong.core.data.RecallConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RecallConfig recallConfig) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, recallConfig.minutes) + CodedOutputByteBufferNano.m17275b(2, recallConfig.enable);
            recallConfig.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RecallConfig parse(nc5 nc5Var) throws IOException {
            RecallConfig recallConfig = new RecallConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    recallConfig.minutes = nc5Var.m162486j();
                } else {
                    if (iM162497u != 16) {
                        return recallConfig;
                    }
                    recallConfig.enable = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RecallConfig recallConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, recallConfig.minutes);
            codedOutputByteBufferNano.m17299A(2, recallConfig.enable);
        }
    };
    public static JsonAdapter<RecallConfig> JSON_ADAPTER = new ObjectJsonAdapter<RecallConfig>() { // from class: com.p1.mobile.putong.core.data.RecallConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RecallConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RecallConfig newInstance() {
            return new RecallConfig();
        }

        public boolean parseField(RecallConfig recallConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("enable")) {
                recallConfig.enable = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("minutes")) {
                return false;
            }
            recallConfig.minutes = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(RecallConfig recallConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("enable") || str.equals("minutes")) {
                return true;
            }
            return super.parseFieldCheck(recallConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RecallConfig recallConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("minutes", recallConfig.minutes);
            jsonGenerator.writeBooleanField("enable", recallConfig.enable);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RecallConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RecallConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RecallConfig new_() {
        RecallConfig recallConfig = new RecallConfig();
        recallConfig.nullCheck();
        return recallConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RecallConfig mo225055clone() {
        RecallConfig recallConfig = new RecallConfig();
        recallConfig.minutes = this.minutes;
        recallConfig.enable = this.enable;
        return recallConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecallConfig)) {
            return false;
        }
        RecallConfig recallConfig = (RecallConfig) obj;
        return this.minutes == recallConfig.minutes && this.enable == recallConfig.enable;
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
        int i2 = (((i * 41) + this.minutes) * 41) + (this.enable ? 1231 : 1237);
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
