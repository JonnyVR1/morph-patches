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
public class LogoutRecommendEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "logoutrecommendenvelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public LogoutRecommendData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<LogoutRecommendEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<LogoutRecommendEnvelope>() { // from class: com.p1.mobile.putong.core.data.LogoutRecommendEnvelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LogoutRecommendEnvelope logoutRecommendEnvelope) {
            Meta meta = logoutRecommendEnvelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            LogoutRecommendData logoutRecommendData = logoutRecommendEnvelope.data;
            if (logoutRecommendData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, logoutRecommendData, LogoutRecommendData.PROTOBUF_ADAPTER);
            }
            logoutRecommendEnvelope.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LogoutRecommendEnvelope parse(nc5 nc5Var) throws IOException {
            LogoutRecommendEnvelope logoutRecommendEnvelope = new LogoutRecommendEnvelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (logoutRecommendEnvelope.meta == null) {
                        logoutRecommendEnvelope.meta = Meta.new_();
                    }
                    if (logoutRecommendEnvelope.data != null) {
                        break;
                    }
                    logoutRecommendEnvelope.data = LogoutRecommendData.new_();
                    break;
                }
                if (iM162497u == 10) {
                    logoutRecommendEnvelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (logoutRecommendEnvelope.meta == null) {
                            logoutRecommendEnvelope.meta = Meta.new_();
                        }
                        if (logoutRecommendEnvelope.data != null) {
                            break;
                        }
                        logoutRecommendEnvelope.data = LogoutRecommendData.new_();
                        return logoutRecommendEnvelope;
                    }
                    logoutRecommendEnvelope.data = (LogoutRecommendData) nc5Var.m162488l(LogoutRecommendData.PROTOBUF_ADAPTER);
                }
            }
            return logoutRecommendEnvelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LogoutRecommendEnvelope logoutRecommendEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = logoutRecommendEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            LogoutRecommendData logoutRecommendData = logoutRecommendEnvelope.data;
            if (logoutRecommendData != null) {
                codedOutputByteBufferNano.m17309K(2, logoutRecommendData, LogoutRecommendData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LogoutRecommendEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<LogoutRecommendEnvelope>() { // from class: com.p1.mobile.putong.core.data.LogoutRecommendEnvelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LogoutRecommendEnvelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LogoutRecommendEnvelope newInstance() {
            return new LogoutRecommendEnvelope();
        }

        public boolean parseField(LogoutRecommendEnvelope logoutRecommendEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                logoutRecommendEnvelope.data = LogoutRecommendData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            logoutRecommendEnvelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(LogoutRecommendEnvelope logoutRecommendEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(logoutRecommendEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LogoutRecommendEnvelope logoutRecommendEnvelope, JsonGenerator jsonGenerator) throws IOException {
            if (logoutRecommendEnvelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(logoutRecommendEnvelope.meta, jsonGenerator, true);
            }
            if (logoutRecommendEnvelope.data != null) {
                jsonGenerator.writeFieldName("data");
                LogoutRecommendData.JSON_ADAPTER.serialize(logoutRecommendEnvelope.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LogoutRecommendEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LogoutRecommendEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LogoutRecommendEnvelope new_() {
        LogoutRecommendEnvelope logoutRecommendEnvelope = new LogoutRecommendEnvelope();
        logoutRecommendEnvelope.nullCheck();
        return logoutRecommendEnvelope;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LogoutRecommendEnvelope mo225055clone() {
        LogoutRecommendEnvelope logoutRecommendEnvelope = new LogoutRecommendEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            logoutRecommendEnvelope.meta = meta.mo225055clone();
        }
        LogoutRecommendData logoutRecommendData = this.data;
        if (logoutRecommendData != null) {
            logoutRecommendEnvelope.data = logoutRecommendData.mo225055clone();
        }
        return logoutRecommendEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogoutRecommendEnvelope)) {
            return false;
        }
        LogoutRecommendEnvelope logoutRecommendEnvelope = (LogoutRecommendEnvelope) obj;
        return ValueObject.util_equals(this.meta, logoutRecommendEnvelope.meta) && ValueObject.util_equals(this.data, logoutRecommendEnvelope.data);
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
        LogoutRecommendData logoutRecommendData = this.data;
        int iHashCode2 = iHashCode + (logoutRecommendData != null ? logoutRecommendData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = LogoutRecommendData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
