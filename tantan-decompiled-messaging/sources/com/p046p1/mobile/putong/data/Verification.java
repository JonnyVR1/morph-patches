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
public class Verification extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "verification";

    @NonNull
    @ProtobufIndex(index = 1)
    public StudentVerification studies;
    public static ProtobufAdapter<Verification> PROTOBUF_ADAPTER = new MessageNanoAdapter<Verification>() { // from class: com.p1.mobile.putong.data.Verification.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Verification verification) {
            StudentVerification studentVerification = verification.studies;
            int iM17230l = studentVerification != null ? CodedOutputByteBufferNano.m17230l(1, studentVerification, StudentVerification.PROTOBUF_ADAPTER) : 0;
            verification.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Verification parse(nb5 nb5Var) throws IOException {
            Verification verification = new Verification();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (verification.studies != null) {
                        break;
                    }
                    verification.studies = StudentVerification.new_();
                    break;
                }
                if (iM158752u != 10) {
                    if (verification.studies != null) {
                        break;
                    }
                    verification.studies = StudentVerification.new_();
                    return verification;
                }
                verification.studies = (StudentVerification) nb5Var.m158743l(StudentVerification.PROTOBUF_ADAPTER);
            }
            return verification;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Verification verification, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            StudentVerification studentVerification = verification.studies;
            if (studentVerification != null) {
                codedOutputByteBufferNano.m17254K(1, studentVerification, StudentVerification.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Verification> JSON_ADAPTER = new ObjectJsonAdapter<Verification>() { // from class: com.p1.mobile.putong.data.Verification.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Verification.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Verification newInstance() {
            return new Verification();
        }

        public boolean parseField(Verification verification, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(Studies.TYPE)) {
                return false;
            }
            verification.studies = StudentVerification.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(Verification verification, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Studies.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(verification, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Verification verification, JsonGenerator jsonGenerator) throws IOException {
            if (verification.studies != null) {
                jsonGenerator.writeFieldName(Studies.TYPE);
                StudentVerification.JSON_ADAPTER.serialize(verification.studies, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Verification) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Verification) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Verification new_() {
        Verification verification = new Verification();
        verification.nullCheck();
        return verification;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Verification mo223809clone() {
        Verification verification = new Verification();
        StudentVerification studentVerification = this.studies;
        if (studentVerification != null) {
            verification.studies = studentVerification.mo223809clone();
        }
        return verification;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Verification) {
            return ValueObject.util_equals(this.studies, ((Verification) obj).studies);
        }
        return false;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "verification";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        StudentVerification studentVerification = this.studies;
        int iHashCode = i2 + (studentVerification != null ? studentVerification.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.studies == null) {
            this.studies = StudentVerification.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
