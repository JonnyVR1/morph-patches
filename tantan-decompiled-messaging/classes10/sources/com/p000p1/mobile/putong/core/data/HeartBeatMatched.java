package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
public class HeartBeatMatched extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "heartbeatmatched";

    @Nullable
    @ProtobufIndex(index = 4)
    public HeartbeatActionError error;

    @ProtobufIndex(index = 1)
    public boolean matched;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String tracker;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public long waitSeconds;
    public static ProtobufAdapter<HeartBeatMatched> PROTOBUF_ADAPTER = new MessageNanoAdapter<HeartBeatMatched>() { // from class: com.p1.mobile.putong.core.data.HeartBeatMatched.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(HeartBeatMatched heartBeatMatched) {
            int iB = CodedOutputByteBufferNano.b(1, heartBeatMatched.matched) + CodedOutputByteBufferNano.j(2, heartBeatMatched.waitSeconds);
            String str = heartBeatMatched.tracker;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(3, str);
            }
            HeartbeatActionError heartbeatActionError = heartBeatMatched.error;
            if (heartbeatActionError != null) {
                iB += CodedOutputByteBufferNano.l(4, heartbeatActionError, HeartbeatActionError.PROTOBUF_ADAPTER);
            }
            ((MessageNano) heartBeatMatched).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public HeartBeatMatched m13239parse(nb5 nb5Var) throws IOException {
            HeartBeatMatched heartBeatMatched = new HeartBeatMatched();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (heartBeatMatched.tracker != null) {
                        break;
                    }
                    heartBeatMatched.tracker = "";
                    break;
                }
                if (iU == 8) {
                    heartBeatMatched.matched = nb5Var.g();
                } else if (iU == 16) {
                    heartBeatMatched.waitSeconds = nb5Var.k();
                } else if (iU == 26) {
                    heartBeatMatched.tracker = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (heartBeatMatched.tracker != null) {
                            break;
                        }
                        heartBeatMatched.tracker = "";
                        return heartBeatMatched;
                    }
                    heartBeatMatched.error = (HeartbeatActionError) nb5Var.l(HeartbeatActionError.PROTOBUF_ADAPTER);
                }
            }
            return heartBeatMatched;
        }

        public void serialize(HeartBeatMatched heartBeatMatched, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, heartBeatMatched.matched);
            codedOutputByteBufferNano.I(2, heartBeatMatched.waitSeconds);
            String str = heartBeatMatched.tracker;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
            HeartbeatActionError heartbeatActionError = heartBeatMatched.error;
            if (heartbeatActionError != null) {
                codedOutputByteBufferNano.K(4, heartbeatActionError, HeartbeatActionError.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<HeartBeatMatched> JSON_ADAPTER = new ObjectJsonAdapter<HeartBeatMatched>() { // from class: com.p1.mobile.putong.core.data.HeartBeatMatched.2
        public Class getDataClass() {
            return HeartBeatMatched.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public HeartBeatMatched m13240newInstance() {
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
                    heartBeatMatched.error = (HeartbeatActionError) HeartbeatActionError.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HeartBeatMatched) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HeartBeatMatched) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HeartBeatMatched new_() {
        HeartBeatMatched heartBeatMatched = new HeartBeatMatched();
        heartBeatMatched.nullCheck();
        return heartBeatMatched;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public HeartBeatMatched m13238clone() {
        HeartBeatMatched heartBeatMatched = new HeartBeatMatched();
        heartBeatMatched.matched = this.matched;
        heartBeatMatched.waitSeconds = this.waitSeconds;
        heartBeatMatched.tracker = this.tracker;
        HeartbeatActionError heartbeatActionError = this.error;
        if (heartbeatActionError != null) {
            heartBeatMatched.error = heartbeatActionError.m13242clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.tracker == null) {
            this.tracker = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
