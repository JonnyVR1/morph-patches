package com.p000p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ConnectorConfig connectorConfig) {
            int iH = CodedOutputByteBufferNano.h(1, connectorConfig.keepalive_interval) + CodedOutputByteBufferNano.h(2, connectorConfig.keepalive_timeout) + CodedOutputByteBufferNano.h(3, connectorConfig.keepalive_tries) + CodedOutputByteBufferNano.h(4, connectorConfig.reconnect_backoff_min) + CodedOutputByteBufferNano.h(5, connectorConfig.reconnect_backoff_max) + CodedOutputByteBufferNano.b(6, connectorConfig.use_thirdparty_push);
            ((MessageNano) connectorConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ConnectorConfig m17845parse(nb5 nb5Var) throws IOException {
            ConnectorConfig connectorConfig = new ConnectorConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    connectorConfig.keepalive_interval = nb5Var.j();
                } else if (iU == 16) {
                    connectorConfig.keepalive_timeout = nb5Var.j();
                } else if (iU == 24) {
                    connectorConfig.keepalive_tries = nb5Var.j();
                } else if (iU == 32) {
                    connectorConfig.reconnect_backoff_min = nb5Var.j();
                } else if (iU == 40) {
                    connectorConfig.reconnect_backoff_max = nb5Var.j();
                } else {
                    if (iU != 48) {
                        return connectorConfig;
                    }
                    connectorConfig.use_thirdparty_push = nb5Var.g();
                }
            }
        }

        public void serialize(ConnectorConfig connectorConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, connectorConfig.keepalive_interval);
            codedOutputByteBufferNano.G(2, connectorConfig.keepalive_timeout);
            codedOutputByteBufferNano.G(3, connectorConfig.keepalive_tries);
            codedOutputByteBufferNano.G(4, connectorConfig.reconnect_backoff_min);
            codedOutputByteBufferNano.G(5, connectorConfig.reconnect_backoff_max);
            codedOutputByteBufferNano.A(6, connectorConfig.use_thirdparty_push);
        }
    };
    public static JsonAdapter<ConnectorConfig> JSON_ADAPTER = new ObjectJsonAdapter<ConnectorConfig>() { // from class: com.p1.mobile.putong.data.ConnectorConfig.2
        public Class getDataClass() {
            return ConnectorConfig.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ConnectorConfig mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConnectorConfig connectorConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("keepalive_interval", connectorConfig.keepalive_interval);
            jsonGenerator.writeNumberField("keepalive_timeout", connectorConfig.keepalive_timeout);
            jsonGenerator.writeNumberField("keepalive_tries", connectorConfig.keepalive_tries);
            jsonGenerator.writeNumberField("reconnect_backoff_min", connectorConfig.reconnect_backoff_min);
            jsonGenerator.writeNumberField("reconnect_backoff_max", connectorConfig.reconnect_backoff_max);
            jsonGenerator.writeBooleanField("use_thirdparty_push", connectorConfig.use_thirdparty_push);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConnectorConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConnectorConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConnectorConfig new_() {
        ConnectorConfig connectorConfig = new ConnectorConfig();
        connectorConfig.nullCheck();
        return connectorConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ConnectorConfig m17844clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((((((i * 41) + this.keepalive_interval) * 41) + this.keepalive_timeout) * 41) + this.keepalive_tries) * 41) + this.reconnect_backoff_min) * 41) + this.reconnect_backoff_max) * 41) + (this.use_thirdparty_push ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
