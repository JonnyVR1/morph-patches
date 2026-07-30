package com.p046p1.mobile.putong.core.data;

import com.clevertap.android.sdk.Constants;
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

/* JADX INFO: loaded from: classes10.dex */
public class SchoolVerificationAgeRange extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "schoolverificationagerange";

    @ProtobufIndex(index = 2)
    public int max;

    @ProtobufIndex(index = 1)
    public int min;
    public static ProtobufAdapter<SchoolVerificationAgeRange> PROTOBUF_ADAPTER = new MessageNanoAdapter<SchoolVerificationAgeRange>() { // from class: com.p1.mobile.putong.core.data.SchoolVerificationAgeRange.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SchoolVerificationAgeRange schoolVerificationAgeRange) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, schoolVerificationAgeRange.min) + CodedOutputByteBufferNano.m17226h(2, schoolVerificationAgeRange.max);
            schoolVerificationAgeRange.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SchoolVerificationAgeRange parse(nb5 nb5Var) throws IOException {
            SchoolVerificationAgeRange schoolVerificationAgeRange = new SchoolVerificationAgeRange();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    schoolVerificationAgeRange.min = nb5Var.m158741j();
                } else {
                    if (iM158752u != 16) {
                        return schoolVerificationAgeRange;
                    }
                    schoolVerificationAgeRange.max = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SchoolVerificationAgeRange schoolVerificationAgeRange, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, schoolVerificationAgeRange.min);
            codedOutputByteBufferNano.m17250G(2, schoolVerificationAgeRange.max);
        }
    };
    public static JsonAdapter<SchoolVerificationAgeRange> JSON_ADAPTER = new ObjectJsonAdapter<SchoolVerificationAgeRange>() { // from class: com.p1.mobile.putong.core.data.SchoolVerificationAgeRange.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SchoolVerificationAgeRange.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SchoolVerificationAgeRange newInstance() {
            return new SchoolVerificationAgeRange();
        }

        public boolean parseField(SchoolVerificationAgeRange schoolVerificationAgeRange, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Constants.PRIORITY_MAX)) {
                schoolVerificationAgeRange.max = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("min")) {
                return false;
            }
            schoolVerificationAgeRange.min = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(SchoolVerificationAgeRange schoolVerificationAgeRange, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Constants.PRIORITY_MAX) || str.equals("min")) {
                return true;
            }
            return super.parseFieldCheck(schoolVerificationAgeRange, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SchoolVerificationAgeRange schoolVerificationAgeRange, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("min", schoolVerificationAgeRange.min);
            jsonGenerator.writeNumberField(Constants.PRIORITY_MAX, schoolVerificationAgeRange.max);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SchoolVerificationAgeRange) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SchoolVerificationAgeRange) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SchoolVerificationAgeRange new_() {
        SchoolVerificationAgeRange schoolVerificationAgeRange = new SchoolVerificationAgeRange();
        schoolVerificationAgeRange.nullCheck();
        return schoolVerificationAgeRange;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SchoolVerificationAgeRange mo223809clone() {
        SchoolVerificationAgeRange schoolVerificationAgeRange = new SchoolVerificationAgeRange();
        schoolVerificationAgeRange.min = this.min;
        schoolVerificationAgeRange.max = this.max;
        return schoolVerificationAgeRange;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchoolVerificationAgeRange)) {
            return false;
        }
        SchoolVerificationAgeRange schoolVerificationAgeRange = (SchoolVerificationAgeRange) obj;
        return this.min == schoolVerificationAgeRange.min && this.max == schoolVerificationAgeRange.max;
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
        int i2 = (((i * 41) + this.min) * 41) + this.max;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
