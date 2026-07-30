package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
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
public class IdCardVerificationInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "idcardverificationinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public StudentVerificationStatus status;
    public static ProtobufAdapter<IdCardVerificationInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<IdCardVerificationInfo>() { // from class: com.p1.mobile.putong.core.data.IdCardVerificationInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IdCardVerificationInfo idCardVerificationInfo) {
            StudentVerificationStatus studentVerificationStatus = idCardVerificationInfo.status;
            int iM17281h = studentVerificationStatus != null ? CodedOutputByteBufferNano.m17281h(1, studentVerificationStatus.ordinal()) : 0;
            StudentVerificationStatus studentVerificationStatus2 = idCardVerificationInfo.status;
            if (studentVerificationStatus2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(2, studentVerificationStatus2, StudentVerificationStatus.PROTOBUF_ADAPTER);
            }
            idCardVerificationInfo.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IdCardVerificationInfo parse(nc5 nc5Var) throws IOException {
            IdCardVerificationInfo idCardVerificationInfo = new IdCardVerificationInfo();
            Integer numValueOf = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (idCardVerificationInfo.status == null && numValueOf != null) {
                        idCardVerificationInfo.status = (StudentVerificationStatus) StudentVerificationStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (idCardVerificationInfo.status != null) {
                        break;
                    }
                    idCardVerificationInfo.status = (StudentVerificationStatus) StudentVerificationStatus.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM162497u == 8) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else {
                    if (iM162497u != 18) {
                        if (idCardVerificationInfo.status == null && numValueOf != null) {
                            idCardVerificationInfo.status = (StudentVerificationStatus) StudentVerificationStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (idCardVerificationInfo.status != null) {
                            break;
                        }
                        idCardVerificationInfo.status = (StudentVerificationStatus) StudentVerificationStatus.JSON_ADAPTER.defaultEnum();
                        return idCardVerificationInfo;
                    }
                    idCardVerificationInfo.status = (StudentVerificationStatus) nc5Var.m162488l(StudentVerificationStatus.PROTOBUF_ADAPTER);
                }
            }
            return idCardVerificationInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IdCardVerificationInfo idCardVerificationInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            StudentVerificationStatus studentVerificationStatus = idCardVerificationInfo.status;
            if (studentVerificationStatus != null) {
                codedOutputByteBufferNano.m17305G(1, studentVerificationStatus.ordinal());
            }
            StudentVerificationStatus studentVerificationStatus2 = idCardVerificationInfo.status;
            if (studentVerificationStatus2 != null) {
                codedOutputByteBufferNano.m17309K(2, studentVerificationStatus2, StudentVerificationStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IdCardVerificationInfo> JSON_ADAPTER = new ObjectJsonAdapter<IdCardVerificationInfo>() { // from class: com.p1.mobile.putong.core.data.IdCardVerificationInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IdCardVerificationInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IdCardVerificationInfo newInstance() {
            return new IdCardVerificationInfo();
        }

        public boolean parseField(IdCardVerificationInfo idCardVerificationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(NotificationCompat.CATEGORY_STATUS)) {
                return false;
            }
            idCardVerificationInfo.status = StudentVerificationStatus.JSON_ADAPTER.parse(jsonParser, str2);
            return true;
        }

        public boolean parseFieldCheck(IdCardVerificationInfo idCardVerificationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                return true;
            }
            return super.parseFieldCheck(idCardVerificationInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IdCardVerificationInfo idCardVerificationInfo, JsonGenerator jsonGenerator) throws IOException {
            if (idCardVerificationInfo.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                StudentVerificationStatus.JSON_ADAPTER.serialize(idCardVerificationInfo.status, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IdCardVerificationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IdCardVerificationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IdCardVerificationInfo new_() {
        IdCardVerificationInfo idCardVerificationInfo = new IdCardVerificationInfo();
        idCardVerificationInfo.nullCheck();
        return idCardVerificationInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IdCardVerificationInfo mo225055clone() {
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
