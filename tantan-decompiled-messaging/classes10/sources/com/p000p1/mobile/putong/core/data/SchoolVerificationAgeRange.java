package com.p000p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
public class SchoolVerificationAgeRange extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "schoolverificationagerange";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int max;

    @ProtobufIndex(index = 1)
    public int min;
    public static ProtobufAdapter<SchoolVerificationAgeRange> PROTOBUF_ADAPTER = new MessageNanoAdapter<SchoolVerificationAgeRange>() { // from class: com.p1.mobile.putong.core.data.SchoolVerificationAgeRange.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SchoolVerificationAgeRange schoolVerificationAgeRange) {
            int iH = CodedOutputByteBufferNano.h(1, schoolVerificationAgeRange.min) + CodedOutputByteBufferNano.h(2, schoolVerificationAgeRange.max);
            ((MessageNano) schoolVerificationAgeRange).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SchoolVerificationAgeRange m15487parse(nb5 nb5Var) throws IOException {
            SchoolVerificationAgeRange schoolVerificationAgeRange = new SchoolVerificationAgeRange();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    schoolVerificationAgeRange.min = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return schoolVerificationAgeRange;
                    }
                    schoolVerificationAgeRange.max = nb5Var.j();
                }
            }
        }

        public void serialize(SchoolVerificationAgeRange schoolVerificationAgeRange, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, schoolVerificationAgeRange.min);
            codedOutputByteBufferNano.G(2, schoolVerificationAgeRange.max);
        }
    };
    public static JsonAdapter<SchoolVerificationAgeRange> JSON_ADAPTER = new ObjectJsonAdapter<SchoolVerificationAgeRange>() { // from class: com.p1.mobile.putong.core.data.SchoolVerificationAgeRange.2
        public Class getDataClass() {
            return SchoolVerificationAgeRange.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SchoolVerificationAgeRange m15488newInstance() {
            return new SchoolVerificationAgeRange();
        }

        public boolean parseField(SchoolVerificationAgeRange schoolVerificationAgeRange, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("max")) {
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
            if (str.equals("max") || str.equals("min")) {
                return true;
            }
            return super.parseFieldCheck(schoolVerificationAgeRange, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(SchoolVerificationAgeRange schoolVerificationAgeRange, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("min", schoolVerificationAgeRange.min);
            jsonGenerator.writeNumberField("max", schoolVerificationAgeRange.max);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SchoolVerificationAgeRange) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SchoolVerificationAgeRange) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SchoolVerificationAgeRange new_() {
        SchoolVerificationAgeRange schoolVerificationAgeRange = new SchoolVerificationAgeRange();
        schoolVerificationAgeRange.nullCheck();
        return schoolVerificationAgeRange;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SchoolVerificationAgeRange m15486clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.min) * 41) + this.max;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
