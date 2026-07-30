package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Region;
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
public class School extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "school";

    @NonNull
    @ProtobufIndex(index = 4)
    public String firstLetter;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21240id;

    @Nullable
    @ProtobufIndex(index = 5)
    public SchoolLevel level;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 3)
    public String pinyin;

    @Nullable
    @ProtobufIndex(index = 6)
    public Region region;
    public static ProtobufAdapter<School> PROTOBUF_ADAPTER = new MessageNanoAdapter<School>() { // from class: com.p1.mobile.putong.core.data.School.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(School school) {
            String str = school.f21240id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = school.name;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = school.pinyin;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = school.firstLetter;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            SchoolLevel schoolLevel = school.level;
            if (schoolLevel != null) {
                iM17288o += CodedOutputByteBufferNano.m17281h(5, schoolLevel.ordinal());
            }
            Region region = school.region;
            if (region != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(6, region, Region.PROTOBUF_ADAPTER);
            }
            SchoolLevel schoolLevel2 = school.level;
            if (schoolLevel2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(7, schoolLevel2, SchoolLevel.PROTOBUF_ADAPTER);
            }
            school.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public School parse(nc5 nc5Var) throws IOException {
            School school = new School();
            Integer numValueOf = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (school.level == null && numValueOf != null) {
                        school.level = (SchoolLevel) SchoolLevel.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (school.f21240id == null) {
                        school.f21240id = "";
                    }
                    if (school.name == null) {
                        school.name = "";
                    }
                    if (school.pinyin == null) {
                        school.pinyin = "";
                    }
                    if (school.firstLetter != null) {
                        break;
                    }
                    school.firstLetter = "";
                    break;
                }
                if (iM162497u == 10) {
                    school.f21240id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    school.name = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    school.pinyin = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    school.firstLetter = nc5Var.m162495s();
                } else if (iM162497u == 40) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else if (iM162497u == 50) {
                    school.region = (Region) nc5Var.m162488l(Region.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 58) {
                        if (school.level == null && numValueOf != null) {
                            school.level = (SchoolLevel) SchoolLevel.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (school.f21240id == null) {
                            school.f21240id = "";
                        }
                        if (school.name == null) {
                            school.name = "";
                        }
                        if (school.pinyin == null) {
                            school.pinyin = "";
                        }
                        if (school.firstLetter != null) {
                            break;
                        }
                        school.firstLetter = "";
                        return school;
                    }
                    school.level = (SchoolLevel) nc5Var.m162488l(SchoolLevel.PROTOBUF_ADAPTER);
                }
            }
            return school;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(School school, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = school.f21240id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = school.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = school.pinyin;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = school.firstLetter;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            SchoolLevel schoolLevel = school.level;
            if (schoolLevel != null) {
                codedOutputByteBufferNano.m17305G(5, schoolLevel.ordinal());
            }
            Region region = school.region;
            if (region != null) {
                codedOutputByteBufferNano.m17309K(6, region, Region.PROTOBUF_ADAPTER);
            }
            SchoolLevel schoolLevel2 = school.level;
            if (schoolLevel2 != null) {
                codedOutputByteBufferNano.m17309K(7, schoolLevel2, SchoolLevel.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<School> JSON_ADAPTER = new ObjectJsonAdapter<School>() { // from class: com.p1.mobile.putong.core.data.School.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return School.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public School newInstance() {
            return new School();
        }

        public boolean parseField(School school, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "firstLetter":
                    school.firstLetter = jsonParser.getValueAsString();
                    return true;
                case "pinyin":
                    school.pinyin = jsonParser.getValueAsString();
                    return true;
                case "region":
                    school.region = Region.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    school.f21240id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    school.name = jsonParser.getValueAsString();
                    return true;
                case "level":
                    school.level = SchoolLevel.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(School school, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "firstLetter":
                case "pinyin":
                case "region":
                    return true;
                case "id":
                    return false;
                case "name":
                case "level":
                    return true;
                default:
                    return super.parseFieldCheck(school, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(School school, JsonGenerator jsonGenerator) throws IOException {
            String str = school.f21240id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = school.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = school.pinyin;
            if (str3 != null) {
                jsonGenerator.writeStringField("pinyin", str3);
            }
            String str4 = school.firstLetter;
            if (str4 != null) {
                jsonGenerator.writeStringField("firstLetter", str4);
            }
            if (school.level != null) {
                jsonGenerator.writeFieldName(FirebaseAnalytics.Param.LEVEL);
                SchoolLevel.JSON_ADAPTER.serialize(school.level, jsonGenerator, true);
            }
            if (school.region != null) {
                jsonGenerator.writeFieldName("region");
                Region.JSON_ADAPTER.serialize(school.region, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((School) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((School) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static School new_() {
        School school = new School();
        school.nullCheck();
        return school;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public School mo225055clone() {
        School school = new School();
        school.f21240id = this.f21240id;
        school.name = this.name;
        school.pinyin = this.pinyin;
        school.firstLetter = this.firstLetter;
        school.level = this.level;
        Region region = this.region;
        if (region != null) {
            school.region = region.mo225055clone();
        }
        return school;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof School)) {
            return false;
        }
        School school = (School) obj;
        return ValueObject.util_equals(this.f21240id, school.f21240id) && ValueObject.util_equals(this.name, school.name) && ValueObject.util_equals(this.pinyin, school.pinyin) && ValueObject.util_equals(this.firstLetter, school.firstLetter) && ValueObject.util_equals(this.level, school.level) && ValueObject.util_equals(this.region, school.region);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "school";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f21240id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.pinyin;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.firstLetter;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        SchoolLevel schoolLevel = this.level;
        int iHashCode5 = (iHashCode4 + (schoolLevel != null ? schoolLevel.hashCode() : 0)) * 41;
        Region region = this.region;
        int iHashCode6 = iHashCode5 + (region != null ? region.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21240id == null) {
            this.f21240id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.pinyin == null) {
            this.pinyin = "";
        }
        if (this.firstLetter == null) {
            this.firstLetter = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
