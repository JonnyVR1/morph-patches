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
public class CtdidVerificationInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "ctdidverificationinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public StudentVerificationStatus status;
    public static ProtobufAdapter<CtdidVerificationInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<CtdidVerificationInfo>() { // from class: com.p1.mobile.putong.core.data.CtdidVerificationInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CtdidVerificationInfo ctdidVerificationInfo) {
            StudentVerificationStatus studentVerificationStatus = ctdidVerificationInfo.status;
            int iM17230l = studentVerificationStatus != null ? CodedOutputByteBufferNano.m17230l(1, studentVerificationStatus, StudentVerificationStatus.PROTOBUF_ADAPTER) : 0;
            ctdidVerificationInfo.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CtdidVerificationInfo parse(nb5 nb5Var) throws IOException {
            CtdidVerificationInfo ctdidVerificationInfo = new CtdidVerificationInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (ctdidVerificationInfo.status != null) {
                        break;
                    }
                    ctdidVerificationInfo.status = (StudentVerificationStatus) StudentVerificationStatus.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM158752u != 10) {
                    if (ctdidVerificationInfo.status != null) {
                        break;
                    }
                    ctdidVerificationInfo.status = (StudentVerificationStatus) StudentVerificationStatus.JSON_ADAPTER.defaultEnum();
                    return ctdidVerificationInfo;
                }
                ctdidVerificationInfo.status = (StudentVerificationStatus) nb5Var.m158743l(StudentVerificationStatus.PROTOBUF_ADAPTER);
            }
            return ctdidVerificationInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CtdidVerificationInfo ctdidVerificationInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            StudentVerificationStatus studentVerificationStatus = ctdidVerificationInfo.status;
            if (studentVerificationStatus != null) {
                codedOutputByteBufferNano.m17254K(1, studentVerificationStatus, StudentVerificationStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<CtdidVerificationInfo> JSON_ADAPTER = new ObjectJsonAdapter<CtdidVerificationInfo>() { // from class: com.p1.mobile.putong.core.data.CtdidVerificationInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CtdidVerificationInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CtdidVerificationInfo newInstance() {
            return new CtdidVerificationInfo();
        }

        public boolean parseField(CtdidVerificationInfo ctdidVerificationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(NotificationCompat.CATEGORY_STATUS)) {
                return false;
            }
            ctdidVerificationInfo.status = StudentVerificationStatus.JSON_ADAPTER.parse(jsonParser, str2);
            return true;
        }

        public boolean parseFieldCheck(CtdidVerificationInfo ctdidVerificationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                return true;
            }
            return super.parseFieldCheck(ctdidVerificationInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CtdidVerificationInfo ctdidVerificationInfo, JsonGenerator jsonGenerator) throws IOException {
            if (ctdidVerificationInfo.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                StudentVerificationStatus.JSON_ADAPTER.serialize(ctdidVerificationInfo.status, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CtdidVerificationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CtdidVerificationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CtdidVerificationInfo new_() {
        CtdidVerificationInfo ctdidVerificationInfo = new CtdidVerificationInfo();
        ctdidVerificationInfo.nullCheck();
        return ctdidVerificationInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CtdidVerificationInfo mo223809clone() {
        CtdidVerificationInfo ctdidVerificationInfo = new CtdidVerificationInfo();
        ctdidVerificationInfo.status = this.status;
        return ctdidVerificationInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CtdidVerificationInfo) {
            return ValueObject.util_equals(this.status, ((CtdidVerificationInfo) obj).status);
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
