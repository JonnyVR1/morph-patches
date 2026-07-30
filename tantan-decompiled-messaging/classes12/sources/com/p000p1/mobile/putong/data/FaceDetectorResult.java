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
public class FaceDetectorResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "facedetectorresult";

    @ProtobufIndex(index = 1)
    public long code;

    @ProtobufIndex(index = 4)
    public long errorIndex;

    @NonNull
    @ProtobufIndex(index = 3)
    public String message;

    @NonNull
    @ProtobufIndex(index = 5)
    public String reason;

    @ProtobufIndex(index = 2)
    public long score;
    public static ProtobufAdapter<FaceDetectorResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<FaceDetectorResult>() { // from class: com.p1.mobile.putong.data.FaceDetectorResult.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FaceDetectorResult faceDetectorResult) {
            int iJ = CodedOutputByteBufferNano.j(1, faceDetectorResult.code) + CodedOutputByteBufferNano.j(2, faceDetectorResult.score);
            String str = faceDetectorResult.message;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(3, str);
            }
            int iJ2 = iJ + CodedOutputByteBufferNano.j(4, faceDetectorResult.errorIndex);
            String str2 = faceDetectorResult.reason;
            if (str2 != null) {
                iJ2 += CodedOutputByteBufferNano.o(5, str2);
            }
            ((MessageNano) faceDetectorResult).cachedSize = iJ2;
            return iJ2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FaceDetectorResult m18067parse(nb5 nb5Var) throws IOException {
            FaceDetectorResult faceDetectorResult = new FaceDetectorResult();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (faceDetectorResult.message == null) {
                        faceDetectorResult.message = "";
                    }
                    if (faceDetectorResult.reason != null) {
                        break;
                    }
                    faceDetectorResult.reason = "";
                    break;
                }
                if (iU == 8) {
                    faceDetectorResult.code = nb5Var.k();
                } else if (iU == 16) {
                    faceDetectorResult.score = nb5Var.k();
                } else if (iU == 26) {
                    faceDetectorResult.message = nb5Var.s();
                } else if (iU == 32) {
                    faceDetectorResult.errorIndex = nb5Var.k();
                } else {
                    if (iU != 42) {
                        if (faceDetectorResult.message == null) {
                            faceDetectorResult.message = "";
                        }
                        if (faceDetectorResult.reason != null) {
                            break;
                        }
                        faceDetectorResult.reason = "";
                        return faceDetectorResult;
                    }
                    faceDetectorResult.reason = nb5Var.s();
                }
            }
            return faceDetectorResult;
        }

        public void serialize(FaceDetectorResult faceDetectorResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, faceDetectorResult.code);
            codedOutputByteBufferNano.I(2, faceDetectorResult.score);
            String str = faceDetectorResult.message;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
            codedOutputByteBufferNano.I(4, faceDetectorResult.errorIndex);
            String str2 = faceDetectorResult.reason;
            if (str2 != null) {
                codedOutputByteBufferNano.R(5, str2);
            }
        }
    };
    public static JsonAdapter<FaceDetectorResult> JSON_ADAPTER = new ObjectJsonAdapter<FaceDetectorResult>() { // from class: com.p1.mobile.putong.data.FaceDetectorResult.2
        public Class getDataClass() {
            return FaceDetectorResult.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FaceDetectorResult mo17830newInstance() {
            return new FaceDetectorResult();
        }

        public boolean parseField(FaceDetectorResult faceDetectorResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "reason":
                    faceDetectorResult.reason = jsonParser.getValueAsString();
                    return true;
                case "error_index":
                    faceDetectorResult.errorIndex = jsonParser.getValueAsLong();
                    return true;
                case "code":
                    faceDetectorResult.code = jsonParser.getValueAsLong();
                    return true;
                case "score":
                    faceDetectorResult.score = jsonParser.getValueAsLong();
                    return true;
                case "message":
                    faceDetectorResult.message = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FaceDetectorResult faceDetectorResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "reason":
                case "error_index":
                case "code":
                case "score":
                case "message":
                    return true;
                default:
                    return super.parseFieldCheck(faceDetectorResult, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FaceDetectorResult faceDetectorResult, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("code", faceDetectorResult.code);
            jsonGenerator.writeNumberField("score", faceDetectorResult.score);
            String str = faceDetectorResult.message;
            if (str != null) {
                jsonGenerator.writeStringField("message", str);
            }
            jsonGenerator.writeNumberField("error_index", faceDetectorResult.errorIndex);
            String str2 = faceDetectorResult.reason;
            if (str2 != null) {
                jsonGenerator.writeStringField("reason", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FaceDetectorResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FaceDetectorResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FaceDetectorResult new_() {
        FaceDetectorResult faceDetectorResult = new FaceDetectorResult();
        faceDetectorResult.nullCheck();
        return faceDetectorResult;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FaceDetectorResult m18066clone() {
        FaceDetectorResult faceDetectorResult = new FaceDetectorResult();
        faceDetectorResult.code = this.code;
        faceDetectorResult.score = this.score;
        faceDetectorResult.message = this.message;
        faceDetectorResult.errorIndex = this.errorIndex;
        faceDetectorResult.reason = this.reason;
        return faceDetectorResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FaceDetectorResult)) {
            return false;
        }
        FaceDetectorResult faceDetectorResult = (FaceDetectorResult) obj;
        return this.code == faceDetectorResult.code && this.score == faceDetectorResult.score && ValueObject.util_equals(this.message, faceDetectorResult.message) && this.errorIndex == faceDetectorResult.errorIndex && ValueObject.util_equals(this.reason, faceDetectorResult.reason);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.code;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.score;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str = this.message;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j3 = this.errorIndex;
        int i4 = (((i3 + iHashCode) * 41) + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        String str2 = this.reason;
        int iHashCode2 = i4 + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.message == null) {
            this.message = "";
        }
        if (this.reason == null) {
            this.reason = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
