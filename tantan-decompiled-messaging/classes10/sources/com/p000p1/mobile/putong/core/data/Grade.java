package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class Grade extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "grade";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f62id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String name;

    @NonNull
    @ProtobufIndex(index = 4)
    public String query;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String section;
    public static ProtobufAdapter<Grade> PROTOBUF_ADAPTER = new MessageNanoAdapter<Grade>() { // from class: com.p1.mobile.putong.core.data.Grade.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Grade grade) {
            String str = grade.f62id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = grade.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = grade.section;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = grade.query;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) grade).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Grade m12997parse(nb5 nb5Var) throws IOException {
            Grade grade = new Grade();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (grade.f62id == null) {
                        grade.f62id = "";
                    }
                    if (grade.name == null) {
                        grade.name = "";
                    }
                    if (grade.section == null) {
                        grade.section = "";
                    }
                    if (grade.query != null) {
                        break;
                    }
                    grade.query = "";
                    break;
                }
                if (iU == 10) {
                    grade.f62id = nb5Var.s();
                } else if (iU == 18) {
                    grade.name = nb5Var.s();
                } else if (iU == 26) {
                    grade.section = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (grade.f62id == null) {
                            grade.f62id = "";
                        }
                        if (grade.name == null) {
                            grade.name = "";
                        }
                        if (grade.section == null) {
                            grade.section = "";
                        }
                        if (grade.query != null) {
                            break;
                        }
                        grade.query = "";
                        return grade;
                    }
                    grade.query = nb5Var.s();
                }
            }
            return grade;
        }

        public void serialize(Grade grade, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = grade.f62id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = grade.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = grade.section;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = grade.query;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<Grade> JSON_ADAPTER = new ObjectJsonAdapter<Grade>() { // from class: com.p1.mobile.putong.core.data.Grade.2
        public Class getDataClass() {
            return Grade.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Grade m12998newInstance() {
            return new Grade();
        }

        public boolean parseField(Grade grade, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    grade.f62id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    grade.name = jsonParser.getValueAsString();
                    return true;
                case "query":
                    grade.query = jsonParser.getValueAsString();
                    return true;
                case "section":
                    grade.section = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Grade grade, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "name":
                case "query":
                case "section":
                    return true;
                default:
                    return super.parseFieldCheck(grade, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(Grade grade, JsonGenerator jsonGenerator) throws IOException {
            String str = grade.f62id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = grade.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            String str3 = grade.section;
            if (str3 != null) {
                jsonGenerator.writeStringField("section", str3);
            }
            String str4 = grade.query;
            if (str4 != null) {
                jsonGenerator.writeStringField("query", str4);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Grade) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Grade) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Grade new_() {
        Grade grade = new Grade();
        grade.nullCheck();
        return grade;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Grade m12996clone() {
        Grade grade = new Grade();
        grade.f62id = this.f62id;
        grade.name = this.name;
        grade.section = this.section;
        grade.query = this.query;
        return grade;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Grade)) {
            return false;
        }
        Grade grade = (Grade) obj;
        return ValueObject.util_equals(this.f62id, grade.f62id) && ValueObject.util_equals(this.name, grade.name) && ValueObject.util_equals(this.section, grade.section) && ValueObject.util_equals(this.query, grade.query);
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
        String str = this.f62id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.section;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.query;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.f62id == null) {
            this.f62id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.section == null) {
            this.section = "";
        }
        if (this.query == null) {
            this.query = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
