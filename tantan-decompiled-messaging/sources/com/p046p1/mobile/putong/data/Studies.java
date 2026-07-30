package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.Grade;
import com.p046p1.mobile.putong.core.data.ProfileLikeCategoryType;
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

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Studies studies) {
            String str = studies.major;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = studies.school;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(3, studies.active) + CodedOutputByteBufferNano.m17220b(4, studies.verified);
            String str3 = studies.grade;
            if (str3 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(5, str3);
            }
            QualificationType qualificationType = studies.qualification;
            if (qualificationType != null) {
                iM17220b += CodedOutputByteBufferNano.m17226h(6, qualificationType.ordinal());
            }
            QualificationType qualificationType2 = studies.qualification;
            if (qualificationType2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(7, qualificationType2, QualificationType.PROTOBUF_ADAPTER);
            }
            studies.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Studies parse(nb5 nb5Var) throws IOException {
            Studies studies = new Studies();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    studies.major = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    studies.school = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    studies.active = nb5Var.m158738g();
                } else if (iM158752u == 32) {
                    studies.verified = nb5Var.m158738g();
                } else if (iM158752u == 42) {
                    studies.grade = nb5Var.m158750s();
                } else if (iM158752u == 48) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else {
                    if (iM158752u != 58) {
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
                    studies.qualification = (QualificationType) nb5Var.m158743l(QualificationType.PROTOBUF_ADAPTER);
                }
            }
            return studies;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Studies studies, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = studies.major;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = studies.school;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17244A(3, studies.active);
            codedOutputByteBufferNano.m17244A(4, studies.verified);
            String str3 = studies.grade;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(5, str3);
            }
            QualificationType qualificationType = studies.qualification;
            if (qualificationType != null) {
                codedOutputByteBufferNano.m17250G(6, qualificationType.ordinal());
            }
            QualificationType qualificationType2 = studies.qualification;
            if (qualificationType2 != null) {
                codedOutputByteBufferNano.m17254K(7, qualificationType2, QualificationType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Studies> JSON_ADAPTER = new ObjectJsonAdapter<Studies>() { // from class: com.p1.mobile.putong.data.Studies.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Studies.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Studies newInstance() {
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
                    studies.qualification = QualificationType.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Studies studies, JsonGenerator jsonGenerator) throws IOException {
            String str = studies.major;
            if (str != null) {
                jsonGenerator.writeStringField("major", str);
            }
            String str2 = studies.school;
            if (str2 != null) {
                jsonGenerator.writeStringField("school", str2);
            }
            jsonGenerator.writeBooleanField(Active.TYPE, studies.active);
            jsonGenerator.writeBooleanField("verified", studies.verified);
            String str3 = studies.grade;
            if (str3 != null) {
                jsonGenerator.writeStringField(Grade.TYPE, str3);
            }
            if (studies.qualification != null) {
                jsonGenerator.writeFieldName(ProfileLikeCategoryType.qualification);
                QualificationType.JSON_ADAPTER.serialize(studies.qualification, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Studies) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Studies) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Studies new_() {
        Studies studies = new Studies();
        studies.nullCheck();
        return studies;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Studies mo223809clone() {
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
        String str = this.major;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.school;
        int iHashCode2 = (((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.active ? 1231 : 1237)) * 41) + (this.verified ? 1231 : 1237)) * 41;
        String str3 = this.grade;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        QualificationType qualificationType = this.qualification;
        int iHashCode4 = iHashCode3 + (qualificationType != null ? qualificationType.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
