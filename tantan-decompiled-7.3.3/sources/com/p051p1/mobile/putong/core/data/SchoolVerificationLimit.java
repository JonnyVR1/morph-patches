package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
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

/* JADX INFO: loaded from: classes10.dex */
public class SchoolVerificationLimit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "schoolverificationlimit";

    @NonNull
    @ProtobufIndex(index = 2)
    public Integer afterSwipes;

    @NonNull
    @ProtobufIndex(index = 1)
    public Double frequency;

    @NonNull
    @ProtobufIndex(index = 3)
    public Integer maxIgnoreTimes;
    public static ProtobufAdapter<SchoolVerificationLimit> PROTOBUF_ADAPTER = new MessageNanoAdapter<SchoolVerificationLimit>() { // from class: com.p1.mobile.putong.core.data.SchoolVerificationLimit.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SchoolVerificationLimit schoolVerificationLimit) {
            Double d = schoolVerificationLimit.frequency;
            int iM17277d = d != null ? CodedOutputByteBufferNano.m17277d(1, d.doubleValue()) : 0;
            Integer num = schoolVerificationLimit.afterSwipes;
            if (num != null) {
                iM17277d += CodedOutputByteBufferNano.m17281h(2, num.intValue());
            }
            Integer num2 = schoolVerificationLimit.maxIgnoreTimes;
            if (num2 != null) {
                iM17277d += CodedOutputByteBufferNano.m17281h(3, num2.intValue());
            }
            schoolVerificationLimit.cachedSize = iM17277d;
            return iM17277d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SchoolVerificationLimit parse(nc5 nc5Var) throws IOException {
            Double dValueOf = Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            SchoolVerificationLimit schoolVerificationLimit = new SchoolVerificationLimit();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (schoolVerificationLimit.frequency == null) {
                        schoolVerificationLimit.frequency = dValueOf;
                    }
                    if (schoolVerificationLimit.afterSwipes == null) {
                        schoolVerificationLimit.afterSwipes = 0;
                    }
                    if (schoolVerificationLimit.maxIgnoreTimes != null) {
                        break;
                    }
                    schoolVerificationLimit.maxIgnoreTimes = 0;
                    break;
                }
                if (iM162497u == 9) {
                    schoolVerificationLimit.frequency = Double.valueOf(nc5Var.m162484h());
                } else if (iM162497u == 16) {
                    schoolVerificationLimit.afterSwipes = Integer.valueOf(nc5Var.m162486j());
                } else {
                    if (iM162497u != 24) {
                        if (schoolVerificationLimit.frequency == null) {
                            schoolVerificationLimit.frequency = dValueOf;
                        }
                        if (schoolVerificationLimit.afterSwipes == null) {
                            schoolVerificationLimit.afterSwipes = 0;
                        }
                        if (schoolVerificationLimit.maxIgnoreTimes != null) {
                            break;
                        }
                        schoolVerificationLimit.maxIgnoreTimes = 0;
                        return schoolVerificationLimit;
                    }
                    schoolVerificationLimit.maxIgnoreTimes = Integer.valueOf(nc5Var.m162486j());
                }
            }
            return schoolVerificationLimit;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SchoolVerificationLimit schoolVerificationLimit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Double d = schoolVerificationLimit.frequency;
            if (d != null) {
                codedOutputByteBufferNano.m17301C(1, d.doubleValue());
            }
            Integer num = schoolVerificationLimit.afterSwipes;
            if (num != null) {
                codedOutputByteBufferNano.m17305G(2, num.intValue());
            }
            Integer num2 = schoolVerificationLimit.maxIgnoreTimes;
            if (num2 != null) {
                codedOutputByteBufferNano.m17305G(3, num2.intValue());
            }
        }
    };
    public static JsonAdapter<SchoolVerificationLimit> JSON_ADAPTER = new ObjectJsonAdapter<SchoolVerificationLimit>() { // from class: com.p1.mobile.putong.core.data.SchoolVerificationLimit.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SchoolVerificationLimit.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SchoolVerificationLimit newInstance() {
            return new SchoolVerificationLimit();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(SchoolVerificationLimit schoolVerificationLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -455579504:
                    if (str.equals("maxIgnoreTimes")) {
                        b = 0;
                    }
                    break;
                case -70023844:
                    if (str.equals("frequency")) {
                        b = 1;
                    }
                    break;
                case 229295477:
                    if (str.equals("afterSwipes")) {
                        b = 2;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    schoolVerificationLimit.maxIgnoreTimes = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Integer.valueOf(jsonParser.getValueAsInt()) : null;
                    return true;
                case 1:
                    schoolVerificationLimit.frequency = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Double.valueOf(jsonParser.getValueAsDouble()) : null;
                    return true;
                case 2:
                    schoolVerificationLimit.afterSwipes = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Integer.valueOf(jsonParser.getValueAsInt()) : null;
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SchoolVerificationLimit schoolVerificationLimit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "maxIgnoreTimes":
                case "frequency":
                case "afterSwipes":
                    return true;
                default:
                    return super.parseFieldCheck(schoolVerificationLimit, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SchoolVerificationLimit schoolVerificationLimit, JsonGenerator jsonGenerator) throws IOException {
            Double d = schoolVerificationLimit.frequency;
            if (d != null) {
                jsonGenerator.writeNumberField("frequency", d.doubleValue());
            }
            Integer num = schoolVerificationLimit.afterSwipes;
            if (num != null) {
                jsonGenerator.writeNumberField("afterSwipes", num.intValue());
            }
            Integer num2 = schoolVerificationLimit.maxIgnoreTimes;
            if (num2 != null) {
                jsonGenerator.writeNumberField("maxIgnoreTimes", num2.intValue());
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SchoolVerificationLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SchoolVerificationLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SchoolVerificationLimit new_() {
        SchoolVerificationLimit schoolVerificationLimit = new SchoolVerificationLimit();
        schoolVerificationLimit.nullCheck();
        return schoolVerificationLimit;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SchoolVerificationLimit mo225055clone() {
        SchoolVerificationLimit schoolVerificationLimit = new SchoolVerificationLimit();
        schoolVerificationLimit.frequency = this.frequency;
        schoolVerificationLimit.afterSwipes = this.afterSwipes;
        schoolVerificationLimit.maxIgnoreTimes = this.maxIgnoreTimes;
        return schoolVerificationLimit;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchoolVerificationLimit)) {
            return false;
        }
        SchoolVerificationLimit schoolVerificationLimit = (SchoolVerificationLimit) obj;
        return ValueObject.util_equals(this.frequency, schoolVerificationLimit.frequency) && ValueObject.util_equals(this.afterSwipes, schoolVerificationLimit.afterSwipes) && ValueObject.util_equals(this.maxIgnoreTimes, schoolVerificationLimit.maxIgnoreTimes);
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
        Double d = this.frequency;
        int iHashCode = (i2 + (d != null ? d.hashCode() : 0)) * 41;
        Integer num = this.afterSwipes;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 41;
        Integer num2 = this.maxIgnoreTimes;
        int iHashCode3 = iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.frequency == null) {
            this.frequency = Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        }
        if (this.afterSwipes == null) {
            this.afterSwipes = 0;
        }
        if (this.maxIgnoreTimes == null) {
            this.maxIgnoreTimes = 0;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
