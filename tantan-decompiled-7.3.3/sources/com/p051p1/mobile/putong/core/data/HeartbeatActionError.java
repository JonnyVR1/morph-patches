package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class HeartbeatActionError extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "heartbeatactionerror";

    @NonNull
    @ProtobufIndex(index = 2)
    public String message;

    @NonNull
    @ProtobufIndex(index = 1)
    public String subcode;
    public static ProtobufAdapter<HeartbeatActionError> PROTOBUF_ADAPTER = new MessageNanoAdapter<HeartbeatActionError>() { // from class: com.p1.mobile.putong.core.data.HeartbeatActionError.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HeartbeatActionError heartbeatActionError) {
            String str = heartbeatActionError.subcode;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = heartbeatActionError.message;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            heartbeatActionError.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HeartbeatActionError parse(nc5 nc5Var) throws IOException {
            HeartbeatActionError heartbeatActionError = new HeartbeatActionError();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (heartbeatActionError.subcode == null) {
                        heartbeatActionError.subcode = "";
                    }
                    if (heartbeatActionError.message != null) {
                        break;
                    }
                    heartbeatActionError.message = "";
                    break;
                }
                if (iM162497u == 10) {
                    heartbeatActionError.subcode = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (heartbeatActionError.subcode == null) {
                            heartbeatActionError.subcode = "";
                        }
                        if (heartbeatActionError.message != null) {
                            break;
                        }
                        heartbeatActionError.message = "";
                        return heartbeatActionError;
                    }
                    heartbeatActionError.message = nc5Var.m162495s();
                }
            }
            return heartbeatActionError;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HeartbeatActionError heartbeatActionError, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = heartbeatActionError.subcode;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = heartbeatActionError.message;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<HeartbeatActionError> JSON_ADAPTER = new ObjectJsonAdapter<HeartbeatActionError>() { // from class: com.p1.mobile.putong.core.data.HeartbeatActionError.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HeartbeatActionError.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HeartbeatActionError newInstance() {
            return new HeartbeatActionError();
        }

        public boolean parseField(HeartbeatActionError heartbeatActionError, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("subcode")) {
                heartbeatActionError.subcode = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("message")) {
                return false;
            }
            heartbeatActionError.message = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(HeartbeatActionError heartbeatActionError, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("subcode") || str.equals("message")) {
                return true;
            }
            return super.parseFieldCheck(heartbeatActionError, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HeartbeatActionError heartbeatActionError, JsonGenerator jsonGenerator) throws IOException {
            String str = heartbeatActionError.subcode;
            if (str != null) {
                jsonGenerator.writeStringField("subcode", str);
            }
            String str2 = heartbeatActionError.message;
            if (str2 != null) {
                jsonGenerator.writeStringField("message", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HeartbeatActionError) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HeartbeatActionError) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HeartbeatActionError new_() {
        HeartbeatActionError heartbeatActionError = new HeartbeatActionError();
        heartbeatActionError.nullCheck();
        return heartbeatActionError;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HeartbeatActionError mo225055clone() {
        HeartbeatActionError heartbeatActionError = new HeartbeatActionError();
        heartbeatActionError.subcode = this.subcode;
        heartbeatActionError.message = this.message;
        return heartbeatActionError;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeartbeatActionError)) {
            return false;
        }
        HeartbeatActionError heartbeatActionError = (HeartbeatActionError) obj;
        return ValueObject.util_equals(this.subcode, heartbeatActionError.subcode) && ValueObject.util_equals(this.message, heartbeatActionError.message);
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
        String str = this.subcode;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.message;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.subcode == null) {
            this.subcode = "";
        }
        if (this.message == null) {
            this.message = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
