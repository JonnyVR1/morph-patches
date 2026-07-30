package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class HeartBeatMatched extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "heartbeatmatched";

    @Nullable
    @ProtobufIndex(index = 4)
    public HeartbeatActionError error;

    @ProtobufIndex(index = 1)
    public boolean matched;

    @NonNull
    @ProtobufIndex(index = 3)
    public String tracker;

    @ProtobufIndex(index = 2)
    public long waitSeconds;
    public static ProtobufAdapter<HeartBeatMatched> PROTOBUF_ADAPTER = new MessageNanoAdapter<HeartBeatMatched>() { // from class: com.p1.mobile.putong.core.data.HeartBeatMatched.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HeartBeatMatched heartBeatMatched) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, heartBeatMatched.matched) + CodedOutputByteBufferNano.m17283j(2, heartBeatMatched.waitSeconds);
            String str = heartBeatMatched.tracker;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(3, str);
            }
            HeartbeatActionError heartbeatActionError = heartBeatMatched.error;
            if (heartbeatActionError != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(4, heartbeatActionError, HeartbeatActionError.PROTOBUF_ADAPTER);
            }
            heartBeatMatched.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HeartBeatMatched parse(nc5 nc5Var) throws IOException {
            HeartBeatMatched heartBeatMatched = new HeartBeatMatched();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (heartBeatMatched.tracker != null) {
                        break;
                    }
                    heartBeatMatched.tracker = "";
                    break;
                }
                if (iM162497u == 8) {
                    heartBeatMatched.matched = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    heartBeatMatched.waitSeconds = nc5Var.m162487k();
                } else if (iM162497u == 26) {
                    heartBeatMatched.tracker = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (heartBeatMatched.tracker != null) {
                            break;
                        }
                        heartBeatMatched.tracker = "";
                        return heartBeatMatched;
                    }
                    heartBeatMatched.error = (HeartbeatActionError) nc5Var.m162488l(HeartbeatActionError.PROTOBUF_ADAPTER);
                }
            }
            return heartBeatMatched;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HeartBeatMatched heartBeatMatched, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, heartBeatMatched.matched);
            codedOutputByteBufferNano.m17307I(2, heartBeatMatched.waitSeconds);
            String str = heartBeatMatched.tracker;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(3, str);
            }
            HeartbeatActionError heartbeatActionError = heartBeatMatched.error;
            if (heartbeatActionError != null) {
                codedOutputByteBufferNano.m17309K(4, heartbeatActionError, HeartbeatActionError.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<HeartBeatMatched> JSON_ADAPTER = new ObjectJsonAdapter<HeartBeatMatched>() { // from class: com.p1.mobile.putong.core.data.HeartBeatMatched.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HeartBeatMatched.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HeartBeatMatched newInstance() {
            return new HeartBeatMatched();
        }

        public boolean parseField(HeartBeatMatched heartBeatMatched, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "waitSeconds":
                    heartBeatMatched.waitSeconds = jsonParser.getValueAsLong();
                    return true;
                case "tracker":
                    heartBeatMatched.tracker = jsonParser.getValueAsString();
                    return true;
                case "error":
                    heartBeatMatched.error = HeartbeatActionError.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "matched":
                    heartBeatMatched.matched = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(HeartBeatMatched heartBeatMatched, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "waitSeconds":
                case "tracker":
                case "error":
                case "matched":
                    return true;
                default:
                    return super.parseFieldCheck(heartBeatMatched, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HeartBeatMatched heartBeatMatched, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("matched", heartBeatMatched.matched);
            jsonGenerator.writeNumberField("waitSeconds", heartBeatMatched.waitSeconds);
            String str = heartBeatMatched.tracker;
            if (str != null) {
                jsonGenerator.writeStringField("tracker", str);
            }
            if (heartBeatMatched.error != null) {
                jsonGenerator.writeFieldName("error");
                HeartbeatActionError.JSON_ADAPTER.serialize(heartBeatMatched.error, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HeartBeatMatched) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HeartBeatMatched) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HeartBeatMatched new_() {
        HeartBeatMatched heartBeatMatched = new HeartBeatMatched();
        heartBeatMatched.nullCheck();
        return heartBeatMatched;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HeartBeatMatched mo225055clone() {
        HeartBeatMatched heartBeatMatched = new HeartBeatMatched();
        heartBeatMatched.matched = this.matched;
        heartBeatMatched.waitSeconds = this.waitSeconds;
        heartBeatMatched.tracker = this.tracker;
        HeartbeatActionError heartbeatActionError = this.error;
        if (heartbeatActionError != null) {
            heartBeatMatched.error = heartbeatActionError.mo225055clone();
        }
        return heartBeatMatched;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeartBeatMatched)) {
            return false;
        }
        HeartBeatMatched heartBeatMatched = (HeartBeatMatched) obj;
        return this.matched == heartBeatMatched.matched && this.waitSeconds == heartBeatMatched.waitSeconds && ValueObject.util_equals(this.tracker, heartBeatMatched.tracker) && ValueObject.util_equals(this.error, heartBeatMatched.error);
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
        int i2 = ((i * 41) + (this.matched ? 1231 : 1237)) * 41;
        long j = this.waitSeconds;
        int i3 = (i2 + ((int) (j ^ (j >>> 32)))) * 41;
        String str = this.tracker;
        int iHashCode = (i3 + (str != null ? str.hashCode() : 0)) * 41;
        HeartbeatActionError heartbeatActionError = this.error;
        int iHashCode2 = iHashCode + (heartbeatActionError != null ? heartbeatActionError.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.tracker == null) {
            this.tracker = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
