package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.StudentVerRejectedReason;
import com.p000p1.mobile.putong.data.StudentVerification;
import com.p000p1.mobile.putong.data.tenum.OldEnumProtobufAdapter;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class StudentVerification extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "studentverification";

    @NonNull
    @ProtobufIndex(index = 4)
    public String endTime;

    @NonNull
    @ProtobufIndex(index = 7)
    @Deprecated
    public Boolean hideSchoolName;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Media> pictures;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<StudentVerRejectedReason> rejectionReasons;

    @NonNull
    @ProtobufIndex(index = 1)
    public String school;

    @NonNull
    @ProtobufIndex(index = 3)
    public String startTime;

    @NonNull
    @ProtobufIndex(index = 5)
    public StudentVerificationStatus status;
    public static ProtobufAdapter<StudentVerification> PROTOBUF_ADAPTER = new MessageNanoAdapter<StudentVerification>() { // from class: com.p1.mobile.putong.data.StudentVerification.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(StudentVerification studentVerification) {
            String str = studentVerification.school;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<Media> list = studentVerification.pictures;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = studentVerification.startTime;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = studentVerification.endTime;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(4, str3);
            }
            StudentVerificationStatus studentVerificationStatus = studentVerification.status;
            if (studentVerificationStatus != null) {
                iO += CodedOutputByteBufferNano.h(5, studentVerificationStatus.ordinal());
            }
            List<StudentVerRejectedReason> list2 = studentVerification.rejectionReasons;
            if (list2 != null) {
                iO += CodedOutputByteBufferNano.l(6, StudentVerRejectedReason.covertToOldEnumList(list2), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Boolean bool = studentVerification.hideSchoolName;
            if (bool != null) {
                iO += CodedOutputByteBufferNano.b(7, bool.booleanValue());
            }
            StudentVerificationStatus studentVerificationStatus2 = studentVerification.status;
            if (studentVerificationStatus2 != null) {
                iO += CodedOutputByteBufferNano.l(8, studentVerificationStatus2, StudentVerificationStatus.PROTOBUF_ADAPTER);
            }
            List<StudentVerRejectedReason> list3 = studentVerification.rejectionReasons;
            if (list3 != null) {
                iO += CodedOutputByteBufferNano.l(9, list3, StudentVerRejectedReason.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) studentVerification).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public StudentVerification m19040parse(nb5 nb5Var) throws IOException {
            StudentVerification studentVerification = new StudentVerification();
            Integer numValueOf = null;
            List list = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (studentVerification.status == null && numValueOf != null) {
                        studentVerification.status = (StudentVerificationStatus) StudentVerificationStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (studentVerification.rejectionReasons == null && list != null) {
                        studentVerification.rejectionReasons = StudentVerRejectedReason.oldEnumCovertList(list);
                    }
                    if (studentVerification.school == null) {
                        studentVerification.school = "";
                    }
                    if (studentVerification.pictures == null) {
                        studentVerification.pictures = new ArrayList();
                    }
                    if (studentVerification.startTime == null) {
                        studentVerification.startTime = "";
                    }
                    if (studentVerification.endTime == null) {
                        studentVerification.endTime = "";
                    }
                    if (studentVerification.status == null) {
                        studentVerification.status = (StudentVerificationStatus) StudentVerificationStatus.JSON_ADAPTER.defaultEnum();
                    }
                    if (studentVerification.rejectionReasons == null) {
                        studentVerification.rejectionReasons = new ArrayList();
                    }
                    if (studentVerification.hideSchoolName != null) {
                        break;
                    }
                    studentVerification.hideSchoolName = Boolean.FALSE;
                    break;
                }
                if (iU == 10) {
                    studentVerification.school = nb5Var.s();
                } else if (iU == 18) {
                    studentVerification.pictures = (List) nb5Var.l(Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 26) {
                    studentVerification.startTime = nb5Var.s();
                } else if (iU == 34) {
                    studentVerification.endTime = nb5Var.s();
                } else if (iU == 40) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 50) {
                    list = (List) nb5Var.l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 56) {
                    studentVerification.hideSchoolName = Boolean.valueOf(nb5Var.g());
                } else if (iU == 66) {
                    studentVerification.status = (StudentVerificationStatus) nb5Var.l(StudentVerificationStatus.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 74) {
                        if (studentVerification.status == null && numValueOf != null) {
                            studentVerification.status = (StudentVerificationStatus) StudentVerificationStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (studentVerification.rejectionReasons == null && list != null) {
                            studentVerification.rejectionReasons = StudentVerRejectedReason.oldEnumCovertList(list);
                        }
                        if (studentVerification.school == null) {
                            studentVerification.school = "";
                        }
                        if (studentVerification.pictures == null) {
                            studentVerification.pictures = new ArrayList();
                        }
                        if (studentVerification.startTime == null) {
                            studentVerification.startTime = "";
                        }
                        if (studentVerification.endTime == null) {
                            studentVerification.endTime = "";
                        }
                        if (studentVerification.status == null) {
                            studentVerification.status = (StudentVerificationStatus) StudentVerificationStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (studentVerification.rejectionReasons == null) {
                            studentVerification.rejectionReasons = new ArrayList();
                        }
                        if (studentVerification.hideSchoolName != null) {
                            break;
                        }
                        studentVerification.hideSchoolName = Boolean.FALSE;
                        return studentVerification;
                    }
                    studentVerification.rejectionReasons = (List) nb5Var.l(StudentVerRejectedReason.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return studentVerification;
        }

        public void serialize(StudentVerification studentVerification, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = studentVerification.school;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<Media> list = studentVerification.pictures;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = studentVerification.startTime;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = studentVerification.endTime;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            StudentVerificationStatus studentVerificationStatus = studentVerification.status;
            if (studentVerificationStatus != null) {
                codedOutputByteBufferNano.G(5, studentVerificationStatus.ordinal());
            }
            List<StudentVerRejectedReason> list2 = studentVerification.rejectionReasons;
            if (list2 != null) {
                codedOutputByteBufferNano.K(6, StudentVerRejectedReason.covertToOldEnumList(list2), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Boolean bool = studentVerification.hideSchoolName;
            if (bool != null) {
                codedOutputByteBufferNano.A(7, bool.booleanValue());
            }
            StudentVerificationStatus studentVerificationStatus2 = studentVerification.status;
            if (studentVerificationStatus2 != null) {
                codedOutputByteBufferNano.K(8, studentVerificationStatus2, StudentVerificationStatus.PROTOBUF_ADAPTER);
            }
            List<StudentVerRejectedReason> list3 = studentVerification.rejectionReasons;
            if (list3 != null) {
                codedOutputByteBufferNano.K(9, list3, StudentVerRejectedReason.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<StudentVerification> JSON_ADAPTER = new ObjectJsonAdapter<StudentVerification>() { // from class: com.p1.mobile.putong.data.StudentVerification.2
        public Class getDataClass() {
            return StudentVerification.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public StudentVerification mo17830newInstance() {
            return new StudentVerification();
        }

        public boolean parseField(StudentVerification studentVerification, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startTime":
                    studentVerification.startTime = jsonParser.getValueAsString();
                    return true;
                case "endTime":
                    studentVerification.endTime = jsonParser.getValueAsString();
                    return true;
                case "rejectionReasons":
                    studentVerification.rejectionReasons = JsonAdapter.parseArray(jsonParser, StudentVerRejectedReason.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "hideSchoolName":
                    studentVerification.hideSchoolName = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : Boolean.valueOf(jsonParser.getValueAsBoolean());
                    return true;
                case "school":
                    studentVerification.school = (String) Converter.SCHOOL_ID.parse(jsonParser, str2);
                    return true;
                case "status":
                    studentVerification.status = (StudentVerificationStatus) StudentVerificationStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "pictures":
                    studentVerification.pictures = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_MEDIA, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(StudentVerification studentVerification, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "startTime":
                case "endTime":
                case "rejectionReasons":
                case "hideSchoolName":
                case "school":
                case "status":
                case "pictures":
                    return true;
                default:
                    return super.parseFieldCheck(studentVerification, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(StudentVerification studentVerification, JsonGenerator jsonGenerator) throws IOException {
            if (studentVerification.school != null) {
                jsonGenerator.writeFieldName(StudentVerRejectedReason.school);
                Converter.SCHOOL_ID.serialize(studentVerification.school, jsonGenerator, true);
            }
            if (studentVerification.pictures != null) {
                jsonGenerator.writeFieldName("pictures");
                JsonAdapter.serializeArray(studentVerification.pictures, jsonGenerator, Converter.RAW_PICTURE_TO_MEDIA);
            }
            String str = studentVerification.startTime;
            if (str != null) {
                jsonGenerator.writeStringField(StudentVerRejectedReason.startTime, str);
            }
            String str2 = studentVerification.endTime;
            if (str2 != null) {
                jsonGenerator.writeStringField("endTime", str2);
            }
            if (studentVerification.status != null) {
                jsonGenerator.writeFieldName("status");
                StudentVerificationStatus.JSON_ADAPTER.serialize(studentVerification.status, jsonGenerator, true);
            }
            if (studentVerification.rejectionReasons != null) {
                jsonGenerator.writeFieldName("rejectionReasons");
                JsonAdapter.serializeArray(studentVerification.rejectionReasons, jsonGenerator, StudentVerRejectedReason.JSON_ADAPTER);
            }
            Boolean bool = studentVerification.hideSchoolName;
            if (bool != null) {
                jsonGenerator.writeBooleanField("hideSchoolName", bool.booleanValue());
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StudentVerification) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((StudentVerification) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ StudentVerRejectedReason m1014a(StudentVerRejectedReason studentVerRejectedReason) {
        return studentVerRejectedReason;
    }

    public static StudentVerification new_() {
        StudentVerification studentVerification = new StudentVerification();
        studentVerification.nullCheck();
        return studentVerification;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public StudentVerification m19039clone() {
        StudentVerification studentVerification = new StudentVerification();
        studentVerification.school = this.school;
        List<Media> list = this.pictures;
        if (list != null) {
            studentVerification.pictures = ValueObject.util_map(list, new w9j() { // from class: l.f2g0
                public final Object call(Object obj) {
                    return ((Media) obj).mo17714clone();
                }
            });
        }
        studentVerification.startTime = this.startTime;
        studentVerification.endTime = this.endTime;
        studentVerification.status = this.status;
        List<StudentVerRejectedReason> list2 = this.rejectionReasons;
        if (list2 != null) {
            studentVerification.rejectionReasons = ValueObject.util_map(list2, new w9j() { // from class: l.g2g0
                public final Object call(Object obj) {
                    return StudentVerification.m1014a((StudentVerRejectedReason) obj);
                }
            });
        }
        studentVerification.hideSchoolName = this.hideSchoolName;
        return studentVerification;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StudentVerification)) {
            return false;
        }
        StudentVerification studentVerification = (StudentVerification) obj;
        return ValueObject.util_equals(this.school, studentVerification.school) && ValueObject.util_equals(this.pictures, studentVerification.pictures) && ValueObject.util_equals(this.startTime, studentVerification.startTime) && ValueObject.util_equals(this.endTime, studentVerification.endTime) && ValueObject.util_equals(this.status, studentVerification.status) && ValueObject.util_equals(this.rejectionReasons, studentVerification.rejectionReasons) && ValueObject.util_equals(this.hideSchoolName, studentVerification.hideSchoolName);
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
        String str = this.school;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<Media> list = this.pictures;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.startTime;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.endTime;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        StudentVerificationStatus studentVerificationStatus = this.status;
        int iHashCode5 = (iHashCode4 + (studentVerificationStatus != null ? studentVerificationStatus.hashCode() : 0)) * 41;
        List<StudentVerRejectedReason> list2 = this.rejectionReasons;
        int iHashCode6 = (iHashCode5 + (list2 != null ? list2.hashCode() : 0)) * 41;
        Boolean bool = this.hideSchoolName;
        int iHashCode7 = iHashCode6 + (bool != null ? bool.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode7;
        return iHashCode7;
    }

    public void nullCheck() {
        if (this.school == null) {
            this.school = "";
        }
        if (this.pictures == null) {
            this.pictures = new ArrayList();
        }
        if (this.startTime == null) {
            this.startTime = "";
        }
        if (this.endTime == null) {
            this.endTime = "";
        }
        if (this.status == null) {
            this.status = (StudentVerificationStatus) StudentVerificationStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.rejectionReasons == null) {
            this.rejectionReasons = new ArrayList();
        }
        if (this.hideSchoolName == null) {
            this.hideSchoolName = Boolean.FALSE;
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
