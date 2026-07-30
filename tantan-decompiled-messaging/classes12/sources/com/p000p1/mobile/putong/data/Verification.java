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
public class Verification extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "verification";

    @NonNull
    @ProtobufIndex(index = 1)
    public StudentVerification studies;
    public static ProtobufAdapter<Verification> PROTOBUF_ADAPTER = new MessageNanoAdapter<Verification>() { // from class: com.p1.mobile.putong.data.Verification.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Verification verification) {
            StudentVerification studentVerification = verification.studies;
            int iL = studentVerification != null ? CodedOutputByteBufferNano.l(1, studentVerification, StudentVerification.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) verification).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Verification m19256parse(nb5 nb5Var) throws IOException {
            Verification verification = new Verification();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (verification.studies != null) {
                        break;
                    }
                    verification.studies = StudentVerification.new_();
                    break;
                }
                if (iU != 10) {
                    if (verification.studies != null) {
                        break;
                    }
                    verification.studies = StudentVerification.new_();
                    return verification;
                }
                verification.studies = (StudentVerification) nb5Var.l(StudentVerification.PROTOBUF_ADAPTER);
            }
            return verification;
        }

        public void serialize(Verification verification, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            StudentVerification studentVerification = verification.studies;
            if (studentVerification != null) {
                codedOutputByteBufferNano.K(1, studentVerification, StudentVerification.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Verification> JSON_ADAPTER = new ObjectJsonAdapter<Verification>() { // from class: com.p1.mobile.putong.data.Verification.2
        public Class getDataClass() {
            return Verification.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Verification mo17830newInstance() {
            return new Verification();
        }

        public boolean parseField(Verification verification, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(Studies.TYPE)) {
                return false;
            }
            verification.studies = (StudentVerification) StudentVerification.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(Verification verification, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Studies.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(verification, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Verification verification, JsonGenerator jsonGenerator) throws IOException {
            if (verification.studies != null) {
                jsonGenerator.writeFieldName(Studies.TYPE);
                StudentVerification.JSON_ADAPTER.serialize(verification.studies, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Verification) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Verification) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Verification new_() {
        Verification verification = new Verification();
        verification.nullCheck();
        return verification;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Verification m19255clone() {
        Verification verification = new Verification();
        StudentVerification studentVerification = this.studies;
        if (studentVerification != null) {
            verification.studies = studentVerification.m19039clone();
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

    public String getClassParseName() {
        return "verification";
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        StudentVerification studentVerification = this.studies;
        int iHashCode = i2 + (studentVerification != null ? studentVerification.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.studies == null) {
            this.studies = StudentVerification.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
