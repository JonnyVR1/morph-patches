package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Meta;
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
public class LogoutCounterEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "logoutcounterenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public LogoutCounter data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<LogoutCounterEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<LogoutCounterEnvelope>() { // from class: com.p1.mobile.putong.core.data.LogoutCounterEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LogoutCounterEnvelope logoutCounterEnvelope) {
            Meta meta = logoutCounterEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            LogoutCounter logoutCounter = logoutCounterEnvelope.data;
            if (logoutCounter != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, logoutCounter, LogoutCounter.PROTOBUF_ADAPTER);
            }
            logoutCounterEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LogoutCounterEnvelope parse(nc5 nc5Var) throws IOException {
            LogoutCounterEnvelope logoutCounterEnvelope = new LogoutCounterEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (logoutCounterEnvelope.meta == null) {
                        logoutCounterEnvelope.meta = Meta.new_();
                    }
                    if (logoutCounterEnvelope.data != null) {
                        break;
                    }
                    logoutCounterEnvelope.data = LogoutCounter.new_();
                    break;
                }
                if (iM162497u == 10) {
                    logoutCounterEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (logoutCounterEnvelope.meta == null) {
                            logoutCounterEnvelope.meta = Meta.new_();
                        }
                        if (logoutCounterEnvelope.data != null) {
                            break;
                        }
                        logoutCounterEnvelope.data = LogoutCounter.new_();
                        return logoutCounterEnvelope;
                    }
                    logoutCounterEnvelope.data = (LogoutCounter) nc5Var.m162488l(LogoutCounter.PROTOBUF_ADAPTER);
                }
            }
            return logoutCounterEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LogoutCounterEnvelope logoutCounterEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = logoutCounterEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            LogoutCounter logoutCounter = logoutCounterEnvelope.data;
            if (logoutCounter != null) {
                codedOutputByteBufferNano.m17309K(2, logoutCounter, LogoutCounter.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LogoutCounterEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<LogoutCounterEnvelope>() { // from class: com.p1.mobile.putong.core.data.LogoutCounterEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LogoutCounterEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LogoutCounterEnvelope newInstance() {
            return new LogoutCounterEnvelope();
        }

        public boolean parseField(LogoutCounterEnvelope logoutCounterEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                logoutCounterEnvelope.data = LogoutCounter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            logoutCounterEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(LogoutCounterEnvelope logoutCounterEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(logoutCounterEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LogoutCounterEnvelope logoutCounterEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (logoutCounterEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(logoutCounterEnvelope.meta, jsonGenerator, true);
            }
            if (logoutCounterEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                LogoutCounter.JSON_ADAPTER.serialize(logoutCounterEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LogoutCounterEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LogoutCounterEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LogoutCounterEnvelope new_() {
        LogoutCounterEnvelope logoutCounterEnvelope = new LogoutCounterEnvelope();
        logoutCounterEnvelope.nullCheck();
        return logoutCounterEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LogoutCounterEnvelope mo225055clone() {
        LogoutCounterEnvelope logoutCounterEnvelope = new LogoutCounterEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            logoutCounterEnvelope.meta = meta.mo225055clone();
        }
        LogoutCounter logoutCounter = this.data;
        if (logoutCounter != null) {
            logoutCounterEnvelope.data = logoutCounter.mo225055clone();
        }
        return logoutCounterEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogoutCounterEnvelope)) {
            return false;
        }
        LogoutCounterEnvelope logoutCounterEnvelope = (LogoutCounterEnvelope) obj;
        return ValueObject.util_equals(this.meta, logoutCounterEnvelope.meta) && ValueObject.util_equals(this.data, logoutCounterEnvelope.data);
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
        int i2 = i * 41;
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        LogoutCounter logoutCounter = this.data;
        int iHashCode2 = iHashCode + (logoutCounter != null ? logoutCounter.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = LogoutCounter.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
