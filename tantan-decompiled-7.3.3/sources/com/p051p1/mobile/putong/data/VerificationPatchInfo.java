package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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

/* JADX INFO: loaded from: classes12.dex */
public class VerificationPatchInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "verificationpatchinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public AgeVerificationPatchInfo age;
    public static ProtobufAdapter<VerificationPatchInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<VerificationPatchInfo>() { // from class: com.p1.mobile.putong.data.VerificationPatchInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VerificationPatchInfo verificationPatchInfo) {
            AgeVerificationPatchInfo ageVerificationPatchInfo = verificationPatchInfo.age;
            int iM17285l = ageVerificationPatchInfo != null ? CodedOutputByteBufferNano.m17285l(1, ageVerificationPatchInfo, AgeVerificationPatchInfo.PROTOBUF_ADAPTER) : 0;
            verificationPatchInfo.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VerificationPatchInfo parse(nc5 nc5Var) throws IOException {
            VerificationPatchInfo verificationPatchInfo = new VerificationPatchInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (verificationPatchInfo.age != null) {
                        break;
                    }
                    verificationPatchInfo.age = AgeVerificationPatchInfo.new_();
                    break;
                }
                if (iM162497u != 10) {
                    if (verificationPatchInfo.age != null) {
                        break;
                    }
                    verificationPatchInfo.age = AgeVerificationPatchInfo.new_();
                    return verificationPatchInfo;
                }
                verificationPatchInfo.age = (AgeVerificationPatchInfo) nc5Var.m162488l(AgeVerificationPatchInfo.PROTOBUF_ADAPTER);
            }
            return verificationPatchInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VerificationPatchInfo verificationPatchInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            AgeVerificationPatchInfo ageVerificationPatchInfo = verificationPatchInfo.age;
            if (ageVerificationPatchInfo != null) {
                codedOutputByteBufferNano.m17309K(1, ageVerificationPatchInfo, AgeVerificationPatchInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<VerificationPatchInfo> JSON_ADAPTER = new ObjectJsonAdapter<VerificationPatchInfo>() { // from class: com.p1.mobile.putong.data.VerificationPatchInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VerificationPatchInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VerificationPatchInfo newInstance() {
            return new VerificationPatchInfo();
        }

        public boolean parseField(VerificationPatchInfo verificationPatchInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(SeeTextDynamicParam.age)) {
                return false;
            }
            verificationPatchInfo.age = AgeVerificationPatchInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(VerificationPatchInfo verificationPatchInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(SeeTextDynamicParam.age)) {
                return true;
            }
            return super.parseFieldCheck(verificationPatchInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VerificationPatchInfo verificationPatchInfo, JsonGenerator jsonGenerator) throws IOException {
            if (verificationPatchInfo.age != null) {
                jsonGenerator.writeFieldName(SeeTextDynamicParam.age);
                AgeVerificationPatchInfo.JSON_ADAPTER.serialize(verificationPatchInfo.age, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerificationPatchInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerificationPatchInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VerificationPatchInfo new_() {
        VerificationPatchInfo verificationPatchInfo = new VerificationPatchInfo();
        verificationPatchInfo.nullCheck();
        return verificationPatchInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VerificationPatchInfo mo225055clone() {
        VerificationPatchInfo verificationPatchInfo = new VerificationPatchInfo();
        AgeVerificationPatchInfo ageVerificationPatchInfo = this.age;
        if (ageVerificationPatchInfo != null) {
            verificationPatchInfo.age = ageVerificationPatchInfo.mo225055clone();
        }
        return verificationPatchInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VerificationPatchInfo) {
            return ValueObject.util_equals(this.age, ((VerificationPatchInfo) obj).age);
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
        AgeVerificationPatchInfo ageVerificationPatchInfo = this.age;
        int iHashCode = i2 + (ageVerificationPatchInfo != null ? ageVerificationPatchInfo.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.age == null) {
            this.age = AgeVerificationPatchInfo.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
