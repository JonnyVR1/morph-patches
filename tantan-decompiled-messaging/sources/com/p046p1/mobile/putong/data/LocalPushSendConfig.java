package com.p046p1.mobile.putong.data;

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
            int iM17228j = CodedOutputByteBufferNano.m17228j(1, localPushSendConfig.update_time) + CodedOutputByteBufferNano.m17226h(2, localPushSendConfig.today_send_size) + CodedOutputByteBufferNano.m17226h(3, localPushSendConfig.today_home_send_size);
            localPushSendConfig.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LocalPushSendConfig parse(nb5 nb5Var) throws IOException {
            LocalPushSendConfig localPushSendConfig = new LocalPushSendConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    localPushSendConfig.update_time = nb5Var.m158742k();
                } else if (iM158752u == 16) {
                    localPushSendConfig.today_send_size = nb5Var.m158741j();
                } else {
                    if (iM158752u != 24) {
                        return localPushSendConfig;
                    }
                    localPushSendConfig.today_home_send_size = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LocalPushSendConfig localPushSendConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17252I(1, localPushSendConfig.update_time);
            codedOutputByteBufferNano.m17250G(2, localPushSendConfig.today_send_size);
            codedOutputByteBufferNano.m17250G(3, localPushSendConfig.today_home_send_size);
        }
    };
    public static JsonAdapter<LocalPushSendConfig> JSON_ADAPTER = new ObjectJsonAdapter<LocalPushSendConfig>() { // from class: com.p1.mobile.putong.data.LocalPushSendConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LocalPushSendConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LocalPushSendConfig localPushSendConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("update_time", localPushSendConfig.update_time);
            jsonGenerator.writeNumberField("today_send_size", localPushSendConfig.today_send_size);
            jsonGenerator.writeNumberField("today_home_send_size", localPushSendConfig.today_home_send_size);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LocalPushSendConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public LocalPushSendConfig mo223809clone() {
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
