package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
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
public class ReflectResponse extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "reflectresponse";

    @NonNull
    @ProtobufIndex(index = 1)
    public String reflectSequence;

    @NonNull
    @ProtobufIndex(index = 3)
    public String reflectSequenceMd5;

    @NonNull
    @ProtobufIndex(index = 2)
    public String reflectSequenceUrl;

    @NonNull
    @ProtobufIndex(index = 4)
    public String requestId;
    public static ProtobufAdapter<ReflectResponse> PROTOBUF_ADAPTER = new MessageNanoAdapter<ReflectResponse>() { // from class: com.p1.mobile.putong.data.ReflectResponse.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ReflectResponse reflectResponse) {
            String str = reflectResponse.reflectSequence;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = reflectResponse.reflectSequenceUrl;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = reflectResponse.reflectSequenceMd5;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = reflectResponse.requestId;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            reflectResponse.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ReflectResponse parse(nb5 nb5Var) throws IOException {
            ReflectResponse reflectResponse = new ReflectResponse();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (reflectResponse.reflectSequence == null) {
                        reflectResponse.reflectSequence = "";
                    }
                    if (reflectResponse.reflectSequenceUrl == null) {
                        reflectResponse.reflectSequenceUrl = "";
                    }
                    if (reflectResponse.reflectSequenceMd5 == null) {
                        reflectResponse.reflectSequenceMd5 = "";
                    }
                    if (reflectResponse.requestId != null) {
                        break;
                    }
                    reflectResponse.requestId = "";
                    break;
                }
                if (iM158752u == 10) {
                    reflectResponse.reflectSequence = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    reflectResponse.reflectSequenceUrl = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    reflectResponse.reflectSequenceMd5 = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
                        if (reflectResponse.reflectSequence == null) {
                            reflectResponse.reflectSequence = "";
                        }
                        if (reflectResponse.reflectSequenceUrl == null) {
                            reflectResponse.reflectSequenceUrl = "";
                        }
                        if (reflectResponse.reflectSequenceMd5 == null) {
                            reflectResponse.reflectSequenceMd5 = "";
                        }
                        if (reflectResponse.requestId != null) {
                            break;
                        }
                        reflectResponse.requestId = "";
                        return reflectResponse;
                    }
                    reflectResponse.requestId = nb5Var.m158750s();
                }
            }
            return reflectResponse;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ReflectResponse reflectResponse, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = reflectResponse.reflectSequence;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = reflectResponse.reflectSequenceUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = reflectResponse.reflectSequenceMd5;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = reflectResponse.requestId;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
        }
    };
    public static JsonAdapter<ReflectResponse> JSON_ADAPTER = new ObjectJsonAdapter<ReflectResponse>() { // from class: com.p1.mobile.putong.data.ReflectResponse.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ReflectResponse.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ReflectResponse newInstance() {
            return new ReflectResponse();
        }

        public boolean parseField(ReflectResponse reflectResponse, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "reflectSequence":
                    reflectResponse.reflectSequence = jsonParser.getValueAsString();
                    return true;
                case "requestId":
                    reflectResponse.requestId = jsonParser.getValueAsString();
                    return true;
                case "reflectSequenceMd5":
                    reflectResponse.reflectSequenceMd5 = jsonParser.getValueAsString();
                    return true;
                case "reflectSequenceUrl":
                    reflectResponse.reflectSequenceUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ReflectResponse reflectResponse, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "reflectSequence":
                case "requestId":
                case "reflectSequenceMd5":
                case "reflectSequenceUrl":
                    return true;
                default:
                    return super.parseFieldCheck(reflectResponse, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ReflectResponse reflectResponse, JsonGenerator jsonGenerator) throws IOException {
            String str = reflectResponse.reflectSequence;
            if (str != null) {
                jsonGenerator.writeStringField("reflectSequence", str);
            }
            String str2 = reflectResponse.reflectSequenceUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("reflectSequenceUrl", str2);
            }
            String str3 = reflectResponse.reflectSequenceMd5;
            if (str3 != null) {
                jsonGenerator.writeStringField("reflectSequenceMd5", str3);
            }
            String str4 = reflectResponse.requestId;
            if (str4 != null) {
                jsonGenerator.writeStringField("requestId", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ReflectResponse) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ReflectResponse) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ReflectResponse new_() {
        ReflectResponse reflectResponse = new ReflectResponse();
        reflectResponse.nullCheck();
        return reflectResponse;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ReflectResponse mo223809clone() {
        ReflectResponse reflectResponse = new ReflectResponse();
        reflectResponse.reflectSequence = this.reflectSequence;
        reflectResponse.reflectSequenceUrl = this.reflectSequenceUrl;
        reflectResponse.reflectSequenceMd5 = this.reflectSequenceMd5;
        reflectResponse.requestId = this.requestId;
        return reflectResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReflectResponse)) {
            return false;
        }
        ReflectResponse reflectResponse = (ReflectResponse) obj;
        return ValueObject.util_equals(this.reflectSequence, reflectResponse.reflectSequence) && ValueObject.util_equals(this.reflectSequenceUrl, reflectResponse.reflectSequenceUrl) && ValueObject.util_equals(this.reflectSequenceMd5, reflectResponse.reflectSequenceMd5) && ValueObject.util_equals(this.requestId, reflectResponse.requestId);
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
        String str = this.reflectSequence;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.reflectSequenceUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.reflectSequenceMd5;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.requestId;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.reflectSequence == null) {
            this.reflectSequence = "";
        }
        if (this.reflectSequenceUrl == null) {
            this.reflectSequenceUrl = "";
        }
        if (this.reflectSequenceMd5 == null) {
            this.reflectSequenceMd5 = "";
        }
        if (this.requestId == null) {
            this.requestId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
