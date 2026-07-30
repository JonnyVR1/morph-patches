package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.StudentVerificationStatus;
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
public class AgeVerificationInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "ageverificationinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public StudentVerificationStatus status;
    public static ProtobufAdapter<AgeVerificationInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<AgeVerificationInfo>() { // from class: com.p1.mobile.putong.core.data.AgeVerificationInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AgeVerificationInfo ageVerificationInfo) {
            StudentVerificationStatus studentVerificationStatus = ageVerificationInfo.status;
            int iH = studentVerificationStatus != null ? CodedOutputByteBufferNano.h(1, studentVerificationStatus.ordinal()) : 0;
            StudentVerificationStatus studentVerificationStatus2 = ageVerificationInfo.status;
            if (studentVerificationStatus2 != null) {
                iH += CodedOutputByteBufferNano.l(2, studentVerificationStatus2, StudentVerificationStatus.PROTOBUF_ADAPTER);
            }
            ((MessageNano) ageVerificationInfo).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AgeVerificationInfo m11553parse(nb5 nb5Var) throws IOException {
            AgeVerificationInfo ageVerificationInfo = new AgeVerificationInfo();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (ageVerificationInfo.status == null && numValueOf != null) {
                        ageVerificationInfo.status = StudentVerificationStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                    }
                    if (ageVerificationInfo.status != null) {
                        break;
                    }
                    ageVerificationInfo.status = StudentVerificationStatus.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 8) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else {
                    if (iU != 18) {
                        if (ageVerificationInfo.status == null && numValueOf != null) {
                            ageVerificationInfo.status = StudentVerificationStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (ageVerificationInfo.status != null) {
                            break;
                        }
                        ageVerificationInfo.status = StudentVerificationStatus.JSON_ADAPTER.defaultEnum();
                        return ageVerificationInfo;
                    }
                    ageVerificationInfo.status = (StudentVerificationStatus) nb5Var.l(StudentVerificationStatus.PROTOBUF_ADAPTER);
                }
            }
            return ageVerificationInfo;
        }

        public void serialize(AgeVerificationInfo ageVerificationInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            StudentVerificationStatus studentVerificationStatus = ageVerificationInfo.status;
            if (studentVerificationStatus != null) {
                codedOutputByteBufferNano.G(1, studentVerificationStatus.ordinal());
            }
            StudentVerificationStatus studentVerificationStatus2 = ageVerificationInfo.status;
            if (studentVerificationStatus2 != null) {
                codedOutputByteBufferNano.K(2, studentVerificationStatus2, StudentVerificationStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AgeVerificationInfo> JSON_ADAPTER = new ObjectJsonAdapter<AgeVerificationInfo>() { // from class: com.p1.mobile.putong.core.data.AgeVerificationInfo.2
        public Class getDataClass() {
            return AgeVerificationInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AgeVerificationInfo m11554newInstance() {
            return new AgeVerificationInfo();
        }

        public boolean parseField(AgeVerificationInfo ageVerificationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("status")) {
                return false;
            }
            ageVerificationInfo.status = (StudentVerificationStatus) StudentVerificationStatus.JSON_ADAPTER.parse(jsonParser, str2);
            return true;
        }

        public boolean parseFieldCheck(AgeVerificationInfo ageVerificationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("status")) {
                return true;
            }
            return super.parseFieldCheck(ageVerificationInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(AgeVerificationInfo ageVerificationInfo, JsonGenerator jsonGenerator) throws IOException {
            if (ageVerificationInfo.status != null) {
                jsonGenerator.writeFieldName("status");
                StudentVerificationStatus.JSON_ADAPTER.serialize(ageVerificationInfo.status, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AgeVerificationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AgeVerificationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AgeVerificationInfo new_() {
        AgeVerificationInfo ageVerificationInfo = new AgeVerificationInfo();
        ageVerificationInfo.nullCheck();
        return ageVerificationInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AgeVerificationInfo m11552clone() {
        AgeVerificationInfo ageVerificationInfo = new AgeVerificationInfo();
        ageVerificationInfo.status = this.status;
        return ageVerificationInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AgeVerificationInfo) {
            return ValueObject.util_equals(this.status, ((AgeVerificationInfo) obj).status);
        }
        return false;
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
        StudentVerificationStatus studentVerificationStatus = this.status;
        int iHashCode = i2 + (studentVerificationStatus != null ? studentVerificationStatus.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.status == null) {
            this.status = StudentVerificationStatus.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
