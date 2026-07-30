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
public class CtdidVerificationInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "ctdidverificationinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public StudentVerificationStatus status;
    public static ProtobufAdapter<CtdidVerificationInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<CtdidVerificationInfo>() { // from class: com.p1.mobile.putong.core.data.CtdidVerificationInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CtdidVerificationInfo ctdidVerificationInfo) {
            StudentVerificationStatus studentVerificationStatus = ctdidVerificationInfo.status;
            int iL = studentVerificationStatus != null ? CodedOutputByteBufferNano.l(1, studentVerificationStatus, StudentVerificationStatus.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) ctdidVerificationInfo).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CtdidVerificationInfo m12567parse(nb5 nb5Var) throws IOException {
            CtdidVerificationInfo ctdidVerificationInfo = new CtdidVerificationInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (ctdidVerificationInfo.status != null) {
                        break;
                    }
                    ctdidVerificationInfo.status = StudentVerificationStatus.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU != 10) {
                    if (ctdidVerificationInfo.status != null) {
                        break;
                    }
                    ctdidVerificationInfo.status = StudentVerificationStatus.JSON_ADAPTER.defaultEnum();
                    return ctdidVerificationInfo;
                }
                ctdidVerificationInfo.status = (StudentVerificationStatus) nb5Var.l(StudentVerificationStatus.PROTOBUF_ADAPTER);
            }
            return ctdidVerificationInfo;
        }

        public void serialize(CtdidVerificationInfo ctdidVerificationInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            StudentVerificationStatus studentVerificationStatus = ctdidVerificationInfo.status;
            if (studentVerificationStatus != null) {
                codedOutputByteBufferNano.K(1, studentVerificationStatus, StudentVerificationStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<CtdidVerificationInfo> JSON_ADAPTER = new ObjectJsonAdapter<CtdidVerificationInfo>() { // from class: com.p1.mobile.putong.core.data.CtdidVerificationInfo.2
        public Class getDataClass() {
            return CtdidVerificationInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CtdidVerificationInfo m12568newInstance() {
            return new CtdidVerificationInfo();
        }

        public boolean parseField(CtdidVerificationInfo ctdidVerificationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("status")) {
                return false;
            }
            ctdidVerificationInfo.status = (StudentVerificationStatus) StudentVerificationStatus.JSON_ADAPTER.parse(jsonParser, str2);
            return true;
        }

        public boolean parseFieldCheck(CtdidVerificationInfo ctdidVerificationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("status")) {
                return true;
            }
            return super.parseFieldCheck(ctdidVerificationInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(CtdidVerificationInfo ctdidVerificationInfo, JsonGenerator jsonGenerator) throws IOException {
            if (ctdidVerificationInfo.status != null) {
                jsonGenerator.writeFieldName("status");
                StudentVerificationStatus.JSON_ADAPTER.serialize(ctdidVerificationInfo.status, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CtdidVerificationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CtdidVerificationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CtdidVerificationInfo new_() {
        CtdidVerificationInfo ctdidVerificationInfo = new CtdidVerificationInfo();
        ctdidVerificationInfo.nullCheck();
        return ctdidVerificationInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CtdidVerificationInfo m12566clone() {
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
