package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ReflectResponse reflectResponse) {
            String str = reflectResponse.reflectSequence;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = reflectResponse.reflectSequenceUrl;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = reflectResponse.reflectSequenceMd5;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = reflectResponse.requestId;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) reflectResponse).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ReflectResponse m18884parse(nb5 nb5Var) throws IOException {
            ReflectResponse reflectResponse = new ReflectResponse();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    reflectResponse.reflectSequence = nb5Var.s();
                } else if (iU == 18) {
                    reflectResponse.reflectSequenceUrl = nb5Var.s();
                } else if (iU == 26) {
                    reflectResponse.reflectSequenceMd5 = nb5Var.s();
                } else {
                    if (iU != 34) {
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
                    reflectResponse.requestId = nb5Var.s();
                }
            }
            return reflectResponse;
        }

        public void serialize(ReflectResponse reflectResponse, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = reflectResponse.reflectSequence;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = reflectResponse.reflectSequenceUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = reflectResponse.reflectSequenceMd5;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = reflectResponse.requestId;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<ReflectResponse> JSON_ADAPTER = new ObjectJsonAdapter<ReflectResponse>() { // from class: com.p1.mobile.putong.data.ReflectResponse.2
        public Class getDataClass() {
            return ReflectResponse.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ReflectResponse mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ReflectResponse) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ReflectResponse) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ReflectResponse new_() {
        ReflectResponse reflectResponse = new ReflectResponse();
        reflectResponse.nullCheck();
        return reflectResponse;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ReflectResponse m18883clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
