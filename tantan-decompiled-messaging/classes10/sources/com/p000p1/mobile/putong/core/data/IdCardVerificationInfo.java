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
public class IdCardVerificationInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "idcardverificationinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public StudentVerificationStatus status;
    public static ProtobufAdapter<IdCardVerificationInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<IdCardVerificationInfo>() { // from class: com.p1.mobile.putong.core.data.IdCardVerificationInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IdCardVerificationInfo idCardVerificationInfo) {
            StudentVerificationStatus studentVerificationStatus = idCardVerificationInfo.status;
            int iH = studentVerificationStatus != null ? CodedOutputByteBufferNano.h(1, studentVerificationStatus.ordinal()) : 0;
            StudentVerificationStatus studentVerificationStatus2 = idCardVerificationInfo.status;
            if (studentVerificationStatus2 != null) {
                iH += CodedOutputByteBufferNano.l(2, studentVerificationStatus2, StudentVerificationStatus.PROTOBUF_ADAPTER);
            }
            ((MessageNano) idCardVerificationInfo).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IdCardVerificationInfo m13409parse(nb5 nb5Var) throws IOException {
            IdCardVerificationInfo idCardVerificationInfo = new IdCardVerificationInfo();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (idCardVerificationInfo.status == null && numValueOf != null) {
                        idCardVerificationInfo.status = StudentVerificationStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                    }
                    if (idCardVerificationInfo.status != null) {
                        break;
                    }
                    idCardVerificationInfo.status = StudentVerificationStatus.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 8) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else {
                    if (iU != 18) {
                        if (idCardVerificationInfo.status == null && numValueOf != null) {
                            idCardVerificationInfo.status = StudentVerificationStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (idCardVerificationInfo.status != null) {
                            break;
                        }
                        idCardVerificationInfo.status = StudentVerificationStatus.JSON_ADAPTER.defaultEnum();
                        return idCardVerificationInfo;
                    }
                    idCardVerificationInfo.status = (StudentVerificationStatus) nb5Var.l(StudentVerificationStatus.PROTOBUF_ADAPTER);
                }
            }
            return idCardVerificationInfo;
        }

        public void serialize(IdCardVerificationInfo idCardVerificationInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            StudentVerificationStatus studentVerificationStatus = idCardVerificationInfo.status;
            if (studentVerificationStatus != null) {
                codedOutputByteBufferNano.G(1, studentVerificationStatus.ordinal());
            }
            StudentVerificationStatus studentVerificationStatus2 = idCardVerificationInfo.status;
            if (studentVerificationStatus2 != null) {
                codedOutputByteBufferNano.K(2, studentVerificationStatus2, StudentVerificationStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IdCardVerificationInfo> JSON_ADAPTER = new ObjectJsonAdapter<IdCardVerificationInfo>() { // from class: com.p1.mobile.putong.core.data.IdCardVerificationInfo.2
        public Class getDataClass() {
            return IdCardVerificationInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IdCardVerificationInfo m13410newInstance() {
            return new IdCardVerificationInfo();
        }

        public boolean parseField(IdCardVerificationInfo idCardVerificationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("status")) {
                return false;
            }
            idCardVerificationInfo.status = (StudentVerificationStatus) StudentVerificationStatus.JSON_ADAPTER.parse(jsonParser, str2);
            return true;
        }

        public boolean parseFieldCheck(IdCardVerificationInfo idCardVerificationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("status")) {
                return true;
            }
            return super.parseFieldCheck(idCardVerificationInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(IdCardVerificationInfo idCardVerificationInfo, JsonGenerator jsonGenerator) throws IOException {
            if (idCardVerificationInfo.status != null) {
                jsonGenerator.writeFieldName("status");
                StudentVerificationStatus.JSON_ADAPTER.serialize(idCardVerificationInfo.status, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IdCardVerificationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IdCardVerificationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IdCardVerificationInfo new_() {
        IdCardVerificationInfo idCardVerificationInfo = new IdCardVerificationInfo();
        idCardVerificationInfo.nullCheck();
        return idCardVerificationInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IdCardVerificationInfo m13408clone() {
        IdCardVerificationInfo idCardVerificationInfo = new IdCardVerificationInfo();
        idCardVerificationInfo.status = this.status;
        return idCardVerificationInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IdCardVerificationInfo) {
            return ValueObject.util_equals(this.status, ((IdCardVerificationInfo) obj).status);
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
