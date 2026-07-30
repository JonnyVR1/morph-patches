package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, heartBeatMatched.matched) + CodedOutputByteBufferNano.m17228j(2, heartBeatMatched.waitSeconds);
            String str = heartBeatMatched.tracker;
            if (str != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(3, str);
            }
            HeartbeatActionError heartbeatActionError = heartBeatMatched.error;
            if (heartbeatActionError != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(4, heartbeatActionError, HeartbeatActionError.PROTOBUF_ADAPTER);
            }
            heartBeatMatched.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HeartBeatMatched parse(nb5 nb5Var) throws IOException {
            HeartBeatMatched heartBeatMatched = new HeartBeatMatched();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (heartBeatMatched.tracker != null) {
                        break;
                    }
                    heartBeatMatched.tracker = "";
                    break;
                }
                if (iM158752u == 8) {
                    heartBeatMatched.matched = nb5Var.m158738g();
                } else if (iM158752u == 16) {
                    heartBeatMatched.waitSeconds = nb5Var.m158742k();
                } else if (iM158752u == 26) {
                    heartBeatMatched.tracker = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
                        if (heartBeatMatched.tracker != null) {
                            break;
                        }
                        heartBeatMatched.tracker = "";
                        return heartBeatMatched;
                    }
                    heartBeatMatched.error = (HeartbeatActionError) nb5Var.m158743l(HeartbeatActionError.PROTOBUF_ADAPTER);
                }
            }
            return heartBeatMatched;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HeartBeatMatched heartBeatMatched, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, heartBeatMatched.matched);
            codedOutputByteBufferNano.m17252I(2, heartBeatMatched.waitSeconds);
            String str = heartBeatMatched.tracker;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(3, str);
            }
            HeartbeatActionError heartbeatActionError = heartBeatMatched.error;
            if (heartbeatActionError != null) {
                codedOutputByteBufferNano.m17254K(4, heartbeatActionError, HeartbeatActionError.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<HeartBeatMatched> JSON_ADAPTER = new ObjectJsonAdapter<HeartBeatMatched>() { // from class: com.p1.mobile.putong.core.data.HeartBeatMatched.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HeartBeatMatched.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HeartBeatMatched) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public HeartBeatMatched mo223809clone() {
        HeartBeatMatched heartBeatMatched = new HeartBeatMatched();
        heartBeatMatched.matched = this.matched;
        heartBeatMatched.waitSeconds = this.waitSeconds;
        heartBeatMatched.tracker = this.tracker;
        HeartbeatActionError heartbeatActionError = this.error;
        if (heartbeatActionError != null) {
            heartBeatMatched.error = heartbeatActionError.mo223809clone();
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
