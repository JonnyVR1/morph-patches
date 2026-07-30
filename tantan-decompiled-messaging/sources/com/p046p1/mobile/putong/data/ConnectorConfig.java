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
public class ConnectorConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "connectorconfig";

    @ProtobufIndex(index = 1)
    public int keepalive_interval;

    @ProtobufIndex(index = 2)
    public int keepalive_timeout;

    @ProtobufIndex(index = 3)
    public int keepalive_tries;

    @ProtobufIndex(index = 5)
    public int reconnect_backoff_max;

    @ProtobufIndex(index = 4)
    public int reconnect_backoff_min;

    @ProtobufIndex(index = 6)
    public boolean use_thirdparty_push;
    public static ProtobufAdapter<ConnectorConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConnectorConfig>() { // from class: com.p1.mobile.putong.data.ConnectorConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConnectorConfig connectorConfig) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, connectorConfig.keepalive_interval) + CodedOutputByteBufferNano.m17226h(2, connectorConfig.keepalive_timeout) + CodedOutputByteBufferNano.m17226h(3, connectorConfig.keepalive_tries) + CodedOutputByteBufferNano.m17226h(4, connectorConfig.reconnect_backoff_min) + CodedOutputByteBufferNano.m17226h(5, connectorConfig.reconnect_backoff_max) + CodedOutputByteBufferNano.m17220b(6, connectorConfig.use_thirdparty_push);
            connectorConfig.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConnectorConfig parse(nb5 nb5Var) throws IOException {
            ConnectorConfig connectorConfig = new ConnectorConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    connectorConfig.keepalive_interval = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    connectorConfig.keepalive_timeout = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    connectorConfig.keepalive_tries = nb5Var.m158741j();
                } else if (iM158752u == 32) {
                    connectorConfig.reconnect_backoff_min = nb5Var.m158741j();
                } else if (iM158752u == 40) {
                    connectorConfig.reconnect_backoff_max = nb5Var.m158741j();
                } else {
                    if (iM158752u != 48) {
                        return connectorConfig;
                    }
                    connectorConfig.use_thirdparty_push = nb5Var.m158738g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConnectorConfig connectorConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, connectorConfig.keepalive_interval);
            codedOutputByteBufferNano.m17250G(2, connectorConfig.keepalive_timeout);
            codedOutputByteBufferNano.m17250G(3, connectorConfig.keepalive_tries);
            codedOutputByteBufferNano.m17250G(4, connectorConfig.reconnect_backoff_min);
            codedOutputByteBufferNano.m17250G(5, connectorConfig.reconnect_backoff_max);
            codedOutputByteBufferNano.m17244A(6, connectorConfig.use_thirdparty_push);
        }
    };
    public static JsonAdapter<ConnectorConfig> JSON_ADAPTER = new ObjectJsonAdapter<ConnectorConfig>() { // from class: com.p1.mobile.putong.data.ConnectorConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConnectorConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConnectorConfig newInstance() {
            return new ConnectorConfig();
        }

        public boolean parseField(ConnectorConfig connectorConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "keepalive_interval":
                    connectorConfig.keepalive_interval = jsonParser.getValueAsInt();
                    return true;
                case "use_thirdparty_push":
                    connectorConfig.use_thirdparty_push = jsonParser.getValueAsBoolean();
                    return true;
                case "keepalive_tries":
                    connectorConfig.keepalive_tries = jsonParser.getValueAsInt();
                    return true;
                case "keepalive_timeout":
                    connectorConfig.keepalive_timeout = jsonParser.getValueAsInt();
                    return true;
                case "reconnect_backoff_max":
                    connectorConfig.reconnect_backoff_max = jsonParser.getValueAsInt();
                    return true;
                case "reconnect_backoff_min":
                    connectorConfig.reconnect_backoff_min = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ConnectorConfig connectorConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "keepalive_interval":
                case "use_thirdparty_push":
                case "keepalive_tries":
                case "keepalive_timeout":
                case "reconnect_backoff_max":
                case "reconnect_backoff_min":
                    return true;
                default:
                    return super.parseFieldCheck(connectorConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConnectorConfig connectorConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("keepalive_interval", connectorConfig.keepalive_interval);
            jsonGenerator.writeNumberField("keepalive_timeout", connectorConfig.keepalive_timeout);
            jsonGenerator.writeNumberField("keepalive_tries", connectorConfig.keepalive_tries);
            jsonGenerator.writeNumberField("reconnect_backoff_min", connectorConfig.reconnect_backoff_min);
            jsonGenerator.writeNumberField("reconnect_backoff_max", connectorConfig.reconnect_backoff_max);
            jsonGenerator.writeBooleanField("use_thirdparty_push", connectorConfig.use_thirdparty_push);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConnectorConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConnectorConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConnectorConfig new_() {
        ConnectorConfig connectorConfig = new ConnectorConfig();
        connectorConfig.nullCheck();
        return connectorConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConnectorConfig mo223809clone() {
        ConnectorConfig connectorConfig = new ConnectorConfig();
        connectorConfig.keepalive_interval = this.keepalive_interval;
        connectorConfig.keepalive_timeout = this.keepalive_timeout;
        connectorConfig.keepalive_tries = this.keepalive_tries;
        connectorConfig.reconnect_backoff_min = this.reconnect_backoff_min;
        connectorConfig.reconnect_backoff_max = this.reconnect_backoff_max;
        connectorConfig.use_thirdparty_push = this.use_thirdparty_push;
        return connectorConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectorConfig)) {
            return false;
        }
        ConnectorConfig connectorConfig = (ConnectorConfig) obj;
        return this.keepalive_interval == connectorConfig.keepalive_interval && this.keepalive_timeout == connectorConfig.keepalive_timeout && this.keepalive_tries == connectorConfig.keepalive_tries && this.reconnect_backoff_min == connectorConfig.reconnect_backoff_min && this.reconnect_backoff_max == connectorConfig.reconnect_backoff_max && this.use_thirdparty_push == connectorConfig.use_thirdparty_push;
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
        int i2 = (((((((((((i * 41) + this.keepalive_interval) * 41) + this.keepalive_timeout) * 41) + this.keepalive_tries) * 41) + this.reconnect_backoff_min) * 41) + this.reconnect_backoff_max) * 41) + (this.use_thirdparty_push ? 1231 : 1237);
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
