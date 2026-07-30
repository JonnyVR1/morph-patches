package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Meta;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class LogoutRecommendEnvelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "logoutrecommendenvelope";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public LogoutRecommendData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<LogoutRecommendEnvelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<LogoutRecommendEnvelope>() { // from class: com.p1.mobile.putong.core.data.LogoutRecommendEnvelope.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LogoutRecommendEnvelope logoutRecommendEnvelope) {
            Meta meta = logoutRecommendEnvelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            LogoutRecommendData logoutRecommendData = logoutRecommendEnvelope.data;
            if (logoutRecommendData != null) {
                iL += CodedOutputByteBufferNano.l(2, logoutRecommendData, LogoutRecommendData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) logoutRecommendEnvelope).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LogoutRecommendEnvelope m13973parse(nb5 nb5Var) throws IOException {
            LogoutRecommendEnvelope logoutRecommendEnvelope = new LogoutRecommendEnvelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (logoutRecommendEnvelope.meta == null) {
                        logoutRecommendEnvelope.meta = Meta.new_();
                    }
                    if (logoutRecommendEnvelope.data != null) {
                        break;
                    }
                    logoutRecommendEnvelope.data = LogoutRecommendData.new_();
                    break;
                }
                if (iU == 10) {
                    logoutRecommendEnvelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (logoutRecommendEnvelope.meta == null) {
                            logoutRecommendEnvelope.meta = Meta.new_();
                        }
                        if (logoutRecommendEnvelope.data != null) {
                            break;
                        }
                        logoutRecommendEnvelope.data = LogoutRecommendData.new_();
                        return logoutRecommendEnvelope;
                    }
                    logoutRecommendEnvelope.data = (LogoutRecommendData) nb5Var.l(LogoutRecommendData.PROTOBUF_ADAPTER);
                }
            }
            return logoutRecommendEnvelope;
        }

        public void serialize(LogoutRecommendEnvelope logoutRecommendEnvelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = logoutRecommendEnvelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            LogoutRecommendData logoutRecommendData = logoutRecommendEnvelope.data;
            if (logoutRecommendData != null) {
                codedOutputByteBufferNano.K(2, logoutRecommendData, LogoutRecommendData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LogoutRecommendEnvelope> JSON_ADAPTER = new ObjectJsonAdapter<LogoutRecommendEnvelope>() { // from class: com.p1.mobile.putong.core.data.LogoutRecommendEnvelope.2
        public Class getDataClass() {
            return LogoutRecommendEnvelope.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LogoutRecommendEnvelope m13974newInstance() {
            return new LogoutRecommendEnvelope();
        }

        public boolean parseField(LogoutRecommendEnvelope logoutRecommendEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                logoutRecommendEnvelope.data = (LogoutRecommendData) LogoutRecommendData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            logoutRecommendEnvelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(LogoutRecommendEnvelope logoutRecommendEnvelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(logoutRecommendEnvelope, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LogoutRecommendEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LogoutRecommendEnvelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LogoutRecommendEnvelope new_() {
        LogoutRecommendEnvelope logoutRecommendEnvelope = new LogoutRecommendEnvelope();
        logoutRecommendEnvelope.nullCheck();
        return logoutRecommendEnvelope;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LogoutRecommendEnvelope m13972clone() {
        LogoutRecommendEnvelope logoutRecommendEnvelope = new LogoutRecommendEnvelope();
        Meta meta = this.meta;
        if (meta != null) {
            logoutRecommendEnvelope.meta = meta.clone();
        }
        LogoutRecommendData logoutRecommendData = this.data;
        if (logoutRecommendData != null) {
            logoutRecommendEnvelope.data = logoutRecommendData.m13968clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        LogoutRecommendData logoutRecommendData = this.data;
        int iHashCode2 = iHashCode + (logoutRecommendData != null ? logoutRecommendData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = LogoutRecommendData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
