package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLivePkInviteSource;
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
public class Grade extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "grade";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20400id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 4)
    public String query;

    @NonNull
    @ProtobufIndex(index = 3)
    public String section;
    public static ProtobufAdapter<Grade> PROTOBUF_ADAPTER = new MessageNanoAdapter<Grade>() { // from class: com.p1.mobile.putong.core.data.Grade.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Grade grade) {
            String str = grade.f20400id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = grade.name;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = grade.section;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = grade.query;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            grade.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Grade parse(nb5 nb5Var) throws IOException {
            Grade grade = new Grade();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (grade.f20400id == null) {
                        grade.f20400id = "";
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
                if (iM158752u == 10) {
                    grade.f20400id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    grade.name = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    grade.section = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
                        if (grade.f20400id == null) {
                            grade.f20400id = "";
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
                    grade.query = nb5Var.m158750s();
                }
            }
            return grade;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Grade grade, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = grade.f20400id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = grade.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = grade.section;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = grade.query;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
        }
    };
    public static JsonAdapter<Grade> JSON_ADAPTER = new ObjectJsonAdapter<Grade>() { // from class: com.p1.mobile.putong.core.data.Grade.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Grade.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Grade newInstance() {
            return new Grade();
        }

        public boolean parseField(Grade grade, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    grade.f20400id = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Grade grade, JsonGenerator jsonGenerator) throws IOException {
            String str = grade.f20400id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = grade.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = grade.section;
            if (str3 != null) {
                jsonGenerator.writeStringField("section", str3);
            }
            String str4 = grade.query;
            if (str4 != null) {
                jsonGenerator.writeStringField(BLivePkInviteSource.query, str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Grade) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Grade) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Grade new_() {
        Grade grade = new Grade();
        grade.nullCheck();
        return grade;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Grade mo223809clone() {
        Grade grade = new Grade();
        grade.f20400id = this.f20400id;
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
        return ValueObject.util_equals(this.f20400id, grade.f20400id) && ValueObject.util_equals(this.name, grade.name) && ValueObject.util_equals(this.section, grade.section) && ValueObject.util_equals(this.query, grade.query);
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
        String str = this.f20400id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.section;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.query;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20400id == null) {
            this.f20400id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
