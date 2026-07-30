package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
public class SchoolVerificationLimit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "schoolverificationlimit";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public Integer afterSwipes;

    @NonNull
    @ProtobufIndex(index = 1)
    public Double frequency;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public Integer maxIgnoreTimes;
    public static ProtobufAdapter<SchoolVerificationLimit> PROTOBUF_ADAPTER = new MessageNanoAdapter<SchoolVerificationLimit>() { // from class: com.p1.mobile.putong.core.data.SchoolVerificationLimit.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SchoolVerificationLimit schoolVerificationLimit) {
            Double d = schoolVerificationLimit.frequency;
            int iD = d != null ? CodedOutputByteBufferNano.d(1, d.doubleValue()) : 0;
            Integer num = schoolVerificationLimit.afterSwipes;
            if (num != null) {
                iD += CodedOutputByteBufferNano.h(2, num.intValue());
            }
            Integer num2 = schoolVerificationLimit.maxIgnoreTimes;
            if (num2 != null) {
                iD += CodedOutputByteBufferNano.h(3, num2.intValue());
            }
            ((MessageNano) schoolVerificationLimit).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SchoolVerificationLimit m15491parse(nb5 nb5Var) throws IOException {
            Double dValueOf = Double.valueOf(0.0d);
            SchoolVerificationLimit schoolVerificationLimit = new SchoolVerificationLimit();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 9) {
                    schoolVerificationLimit.frequency = Double.valueOf(nb5Var.h());
                } else if (iU == 16) {
                    schoolVerificationLimit.afterSwipes = Integer.valueOf(nb5Var.j());
                } else {
                    if (iU != 24) {
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
                    schoolVerificationLimit.maxIgnoreTimes = Integer.valueOf(nb5Var.j());
                }
            }
            return schoolVerificationLimit;
        }

        public void serialize(SchoolVerificationLimit schoolVerificationLimit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Double d = schoolVerificationLimit.frequency;
            if (d != null) {
                codedOutputByteBufferNano.C(1, d.doubleValue());
            }
            Integer num = schoolVerificationLimit.afterSwipes;
            if (num != null) {
                codedOutputByteBufferNano.G(2, num.intValue());
            }
            Integer num2 = schoolVerificationLimit.maxIgnoreTimes;
            if (num2 != null) {
                codedOutputByteBufferNano.G(3, num2.intValue());
            }
        }
    };
    public static JsonAdapter<SchoolVerificationLimit> JSON_ADAPTER = new ObjectJsonAdapter<SchoolVerificationLimit>() { // from class: com.p1.mobile.putong.core.data.SchoolVerificationLimit.2
        public Class getDataClass() {
            return SchoolVerificationLimit.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SchoolVerificationLimit m15492newInstance() {
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
                case QuickChatCardWrapper.QuickChatCardType.PASSIVE /* 2 */:
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SchoolVerificationLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SchoolVerificationLimit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SchoolVerificationLimit new_() {
        SchoolVerificationLimit schoolVerificationLimit = new SchoolVerificationLimit();
        schoolVerificationLimit.nullCheck();
        return schoolVerificationLimit;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SchoolVerificationLimit m15490clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.frequency == null) {
            this.frequency = Double.valueOf(0.0d);
        }
        if (this.afterSwipes == null) {
            this.afterSwipes = 0;
        }
        if (this.maxIgnoreTimes == null) {
            this.maxIgnoreTimes = 0;
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
