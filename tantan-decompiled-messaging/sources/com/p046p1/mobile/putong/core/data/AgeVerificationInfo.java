package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
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
public class AgeVerificationInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "ageverificationinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public StudentVerificationStatus status;
    public static ProtobufAdapter<AgeVerificationInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<AgeVerificationInfo>() { // from class: com.p1.mobile.putong.core.data.AgeVerificationInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AgeVerificationInfo ageVerificationInfo) {
            StudentVerificationStatus studentVerificationStatus = ageVerificationInfo.status;
            int iM17226h = studentVerificationStatus != null ? CodedOutputByteBufferNano.m17226h(1, studentVerificationStatus.ordinal()) : 0;
            StudentVerificationStatus studentVerificationStatus2 = ageVerificationInfo.status;
            if (studentVerificationStatus2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(2, studentVerificationStatus2, StudentVerificationStatus.PROTOBUF_ADAPTER);
            }
            ageVerificationInfo.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AgeVerificationInfo parse(nb5 nb5Var) throws IOException {
            AgeVerificationInfo ageVerificationInfo = new AgeVerificationInfo();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (ageVerificationInfo.status == null && numValueOf != null) {
                        ageVerificationInfo.status = (StudentVerificationStatus) StudentVerificationStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (ageVerificationInfo.status != null) {
                        break;
                    }
                    ageVerificationInfo.status = (StudentVerificationStatus) StudentVerificationStatus.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM158752u == 8) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else {
                    if (iM158752u != 18) {
                        if (ageVerificationInfo.status == null && numValueOf != null) {
                            ageVerificationInfo.status = (StudentVerificationStatus) StudentVerificationStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (ageVerificationInfo.status != null) {
                            break;
                        }
                        ageVerificationInfo.status = (StudentVerificationStatus) StudentVerificationStatus.JSON_ADAPTER.defaultEnum();
                        return ageVerificationInfo;
                    }
                    ageVerificationInfo.status = (StudentVerificationStatus) nb5Var.m158743l(StudentVerificationStatus.PROTOBUF_ADAPTER);
                }
            }
            return ageVerificationInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AgeVerificationInfo ageVerificationInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            StudentVerificationStatus studentVerificationStatus = ageVerificationInfo.status;
            if (studentVerificationStatus != null) {
                codedOutputByteBufferNano.m17250G(1, studentVerificationStatus.ordinal());
            }
            StudentVerificationStatus studentVerificationStatus2 = ageVerificationInfo.status;
            if (studentVerificationStatus2 != null) {
                codedOutputByteBufferNano.m17254K(2, studentVerificationStatus2, StudentVerificationStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AgeVerificationInfo> JSON_ADAPTER = new ObjectJsonAdapter<AgeVerificationInfo>() { // from class: com.p1.mobile.putong.core.data.AgeVerificationInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AgeVerificationInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AgeVerificationInfo newInstance() {
            return new AgeVerificationInfo();
        }

        public boolean parseField(AgeVerificationInfo ageVerificationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(NotificationCompat.CATEGORY_STATUS)) {
                return false;
            }
            ageVerificationInfo.status = StudentVerificationStatus.JSON_ADAPTER.parse(jsonParser, str2);
            return true;
        }

        public boolean parseFieldCheck(AgeVerificationInfo ageVerificationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                return true;
            }
            return super.parseFieldCheck(ageVerificationInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AgeVerificationInfo ageVerificationInfo, JsonGenerator jsonGenerator) throws IOException {
            if (ageVerificationInfo.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                StudentVerificationStatus.JSON_ADAPTER.serialize(ageVerificationInfo.status, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AgeVerificationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AgeVerificationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AgeVerificationInfo new_() {
        AgeVerificationInfo ageVerificationInfo = new AgeVerificationInfo();
        ageVerificationInfo.nullCheck();
        return ageVerificationInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AgeVerificationInfo mo223809clone() {
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
        StudentVerificationStatus studentVerificationStatus = this.status;
        int iHashCode = i2 + (studentVerificationStatus != null ? studentVerificationStatus.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.status == null) {
            this.status = (StudentVerificationStatus) StudentVerificationStatus.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
