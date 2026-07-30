package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class Studies extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "studies";

    @ProtobufIndex(index = 3)
    public boolean active;

    @NonNull
    @ProtobufIndex(index = 5)
    public String grade;

    @NonNull
    @ProtobufIndex(index = 1)
    public String major;

    @NonNull
    @ProtobufIndex(index = 6)
    public QualificationType qualification;

    @NonNull
    @ProtobufIndex(index = 2)
    public String school;

    @ProtobufIndex(index = 4)
    public boolean verified;
    public static ProtobufAdapter<Studies> PROTOBUF_ADAPTER = new MessageNanoAdapter<Studies>() { // from class: com.p1.mobile.putong.data.Studies.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Studies studies) {
            String str = studies.major;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = studies.school;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iB = iO + CodedOutputByteBufferNano.b(3, studies.active) + CodedOutputByteBufferNano.b(4, studies.verified);
            String str3 = studies.grade;
            if (str3 != null) {
                iB += CodedOutputByteBufferNano.o(5, str3);
            }
            QualificationType qualificationType = studies.qualification;
            if (qualificationType != null) {
                iB += CodedOutputByteBufferNano.h(6, qualificationType.ordinal());
            }
            QualificationType qualificationType2 = studies.qualification;
            if (qualificationType2 != null) {
                iB += CodedOutputByteBufferNano.l(7, qualificationType2, QualificationType.PROTOBUF_ADAPTER);
            }
            ((MessageNano) studies).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Studies m19043parse(nb5 nb5Var) throws IOException {
            Studies studies = new Studies();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (studies.qualification == null && numValueOf != null) {
                        studies.qualification = (QualificationType) QualificationType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (studies.major == null) {
                        studies.major = "";
                    }
                    if (studies.school == null) {
                        studies.school = "";
                    }
                    if (studies.grade == null) {
                        studies.grade = "";
                    }
                    if (studies.qualification != null) {
                        break;
                    }
                    studies.qualification = (QualificationType) QualificationType.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 10) {
                    studies.major = nb5Var.s();
                } else if (iU == 18) {
                    studies.school = nb5Var.s();
                } else if (iU == 24) {
                    studies.active = nb5Var.g();
                } else if (iU == 32) {
                    studies.verified = nb5Var.g();
                } else if (iU == 42) {
                    studies.grade = nb5Var.s();
                } else if (iU == 48) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else {
                    if (iU != 58) {
                        if (studies.qualification == null && numValueOf != null) {
                            studies.qualification = (QualificationType) QualificationType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (studies.major == null) {
                            studies.major = "";
                        }
                        if (studies.school == null) {
                            studies.school = "";
                        }
                        if (studies.grade == null) {
                            studies.grade = "";
                        }
                        if (studies.qualification != null) {
                            break;
                        }
                        studies.qualification = (QualificationType) QualificationType.JSON_ADAPTER.defaultEnum();
                        return studies;
                    }
                    studies.qualification = (QualificationType) nb5Var.l(QualificationType.PROTOBUF_ADAPTER);
                }
            }
            return studies;
        }

        public void serialize(Studies studies, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = studies.major;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = studies.school;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.A(3, studies.active);
            codedOutputByteBufferNano.A(4, studies.verified);
            String str3 = studies.grade;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
            QualificationType qualificationType = studies.qualification;
            if (qualificationType != null) {
                codedOutputByteBufferNano.G(6, qualificationType.ordinal());
            }
            QualificationType qualificationType2 = studies.qualification;
            if (qualificationType2 != null) {
                codedOutputByteBufferNano.K(7, qualificationType2, QualificationType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Studies> JSON_ADAPTER = new ObjectJsonAdapter<Studies>() { // from class: com.p1.mobile.putong.data.Studies.2
        public Class getDataClass() {
            return Studies.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Studies mo17830newInstance() {
            return new Studies();
        }

        public boolean parseField(Studies studies, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "verified":
                    studies.verified = jsonParser.getValueAsBoolean();
                    return true;
                case "active":
                    studies.active = jsonParser.getValueAsBoolean();
                    return true;
                case "school":
                    studies.school = jsonParser.getValueAsString();
                    return true;
                case "qualification":
                    studies.qualification = (QualificationType) QualificationType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "grade":
                    studies.grade = jsonParser.getValueAsString();
                    return true;
                case "major":
                    studies.major = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Studies studies, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "verified":
                case "active":
                case "school":
                case "qualification":
                case "grade":
                case "major":
                    return true;
                default:
                    return super.parseFieldCheck(studies, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Studies studies, JsonGenerator jsonGenerator) throws IOException {
            String str = studies.major;
            if (str != null) {
                jsonGenerator.writeStringField("major", str);
            }
            String str2 = studies.school;
            if (str2 != null) {
                jsonGenerator.writeStringField(StudentVerRejectedReason.school, str2);
            }
            jsonGenerator.writeBooleanField("active", studies.active);
            jsonGenerator.writeBooleanField("verified", studies.verified);
            String str3 = studies.grade;
            if (str3 != null) {
                jsonGenerator.writeStringField("grade", str3);
            }
            if (studies.qualification != null) {
                jsonGenerator.writeFieldName("qualification");
                QualificationType.JSON_ADAPTER.serialize(studies.qualification, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Studies) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Studies) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Studies new_() {
        Studies studies = new Studies();
        studies.nullCheck();
        return studies;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Studies m19042clone() {
        Studies studies = new Studies();
        studies.major = this.major;
        studies.school = this.school;
        studies.active = this.active;
        studies.verified = this.verified;
        studies.grade = this.grade;
        studies.qualification = this.qualification;
        return studies;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Studies)) {
            return false;
        }
        Studies studies = (Studies) obj;
        return ValueObject.util_equals(this.major, studies.major) && ValueObject.util_equals(this.school, studies.school) && this.active == studies.active && this.verified == studies.verified && ValueObject.util_equals(this.grade, studies.grade) && ValueObject.util_equals(this.qualification, studies.qualification);
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
        String str = this.major;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.school;
        int iHashCode2 = (((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.active ? 1231 : 1237)) * 41) + (this.verified ? 1231 : 1237)) * 41;
        String str3 = this.grade;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        QualificationType qualificationType = this.qualification;
        int iHashCode4 = iHashCode3 + (qualificationType != null ? qualificationType.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.major == null) {
            this.major = "";
        }
        if (this.school == null) {
            this.school = "";
        }
        if (this.grade == null) {
            this.grade = "";
        }
        if (this.qualification == null) {
            this.qualification = (QualificationType) QualificationType.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
