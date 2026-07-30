package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class LocalPushSendConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "localpushsendconfig";

    @ProtobufIndex(index = 3)
    public int today_home_send_size;

    @ProtobufIndex(index = 2)
    public int today_send_size;

    @ProtobufIndex(index = 1)
    public long update_time;
    public static ProtobufAdapter<LocalPushSendConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<LocalPushSendConfig>() { // from class: com.p1.mobile.putong.data.LocalPushSendConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LocalPushSendConfig localPushSendConfig) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, localPushSendConfig.update_time) + CodedOutputByteBufferNano.m17281h(2, localPushSendConfig.today_send_size) + CodedOutputByteBufferNano.m17281h(3, localPushSendConfig.today_home_send_size);
            localPushSendConfig.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LocalPushSendConfig parse(nc5 nc5Var) throws IOException {
            LocalPushSendConfig localPushSendConfig = new LocalPushSendConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    localPushSendConfig.update_time = nc5Var.m162487k();
                } else if (iM162497u == 16) {
                    localPushSendConfig.today_send_size = nc5Var.m162486j();
                } else {
                    if (iM162497u != 24) {
                        return localPushSendConfig;
                    }
                    localPushSendConfig.today_home_send_size = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LocalPushSendConfig localPushSendConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, localPushSendConfig.update_time);
            codedOutputByteBufferNano.m17305G(2, localPushSendConfig.today_send_size);
            codedOutputByteBufferNano.m17305G(3, localPushSendConfig.today_home_send_size);
        }
    };
    public static JsonAdapter<LocalPushSendConfig> JSON_ADAPTER = new ObjectJsonAdapter<LocalPushSendConfig>() { // from class: com.p1.mobile.putong.data.LocalPushSendConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LocalPushSendConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LocalPushSendConfig newInstance() {
            return new LocalPushSendConfig();
        }

        public boolean parseField(LocalPushSendConfig localPushSendConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "today_send_size":
                    localPushSendConfig.today_send_size = jsonParser.getValueAsInt();
                    return true;
                case "update_time":
                    localPushSendConfig.update_time = jsonParser.getValueAsLong();
                    return true;
                case "today_home_send_size":
                    localPushSendConfig.today_home_send_size = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LocalPushSendConfig localPushSendConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "today_send_size":
                case "update_time":
                case "today_home_send_size":
                    return true;
                default:
                    return super.parseFieldCheck(localPushSendConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LocalPushSendConfig localPushSendConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("update_time", localPushSendConfig.update_time);
            jsonGenerator.writeNumberField("today_send_size", localPushSendConfig.today_send_size);
            jsonGenerator.writeNumberField("today_home_send_size", localPushSendConfig.today_home_send_size);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LocalPushSendConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LocalPushSendConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LocalPushSendConfig new_() {
        LocalPushSendConfig localPushSendConfig = new LocalPushSendConfig();
        localPushSendConfig.nullCheck();
        return localPushSendConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LocalPushSendConfig mo225055clone() {
        LocalPushSendConfig localPushSendConfig = new LocalPushSendConfig();
        localPushSendConfig.update_time = this.update_time;
        localPushSendConfig.today_send_size = this.today_send_size;
        localPushSendConfig.today_home_send_size = this.today_home_send_size;
        return localPushSendConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalPushSendConfig)) {
            return false;
        }
        LocalPushSendConfig localPushSendConfig = (LocalPushSendConfig) obj;
        return this.update_time == localPushSendConfig.update_time && this.today_send_size == localPushSendConfig.today_send_size && this.today_home_send_size == localPushSendConfig.today_home_send_size;
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
        long j = this.update_time;
        int i2 = (((((i * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.today_send_size) * 41) + this.today_home_send_size;
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
