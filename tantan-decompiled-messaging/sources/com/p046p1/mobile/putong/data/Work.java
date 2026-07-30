package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.Active;
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
public class Work extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "work";

    @ProtobufIndex(index = 4)
    public boolean active;

    @NonNull
    @ProtobufIndex(index = 3)
    public String company;

    @NonNull
    @ProtobufIndex(index = 2)
    public String department;

    @NonNull
    @ProtobufIndex(index = 1)
    public String industry;
    public static ProtobufAdapter<Work> PROTOBUF_ADAPTER = new MessageNanoAdapter<Work>() { // from class: com.p1.mobile.putong.data.Work.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Work work) {
            String str = work.industry;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = work.department;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = work.company;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(4, work.active);
            work.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Work parse(nb5 nb5Var) throws IOException {
            Work work = new Work();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (work.industry == null) {
                        work.industry = "";
                    }
                    if (work.department == null) {
                        work.department = "";
                    }
                    if (work.company != null) {
                        break;
                    }
                    work.company = "";
                    break;
                }
                if (iM158752u == 10) {
                    work.industry = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    work.department = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    work.company = nb5Var.m158750s();
                } else {
                    if (iM158752u != 32) {
                        if (work.industry == null) {
                            work.industry = "";
                        }
                        if (work.department == null) {
                            work.department = "";
                        }
                        if (work.company != null) {
                            break;
                        }
                        work.company = "";
                        return work;
                    }
                    work.active = nb5Var.m158738g();
                }
            }
            return work;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Work work, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = work.industry;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = work.department;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = work.company;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            codedOutputByteBufferNano.m17244A(4, work.active);
        }
    };
    public static JsonAdapter<Work> JSON_ADAPTER = new ObjectJsonAdapter<Work>() { // from class: com.p1.mobile.putong.data.Work.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Work.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Work newInstance() {
            return new Work();
        }

        public boolean parseField(Work work, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "active":
                    work.active = jsonParser.getValueAsBoolean();
                    return true;
                case "industry":
                    work.industry = jsonParser.getValueAsString();
                    return true;
                case "department":
                    work.department = jsonParser.getValueAsString();
                    return true;
                case "company":
                    work.company = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Work work, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "active":
                case "industry":
                case "department":
                case "company":
                    return true;
                default:
                    return super.parseFieldCheck(work, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Work work, JsonGenerator jsonGenerator) throws IOException {
            String str = work.industry;
            if (str != null) {
                jsonGenerator.writeStringField("industry", str);
            }
            String str2 = work.department;
            if (str2 != null) {
                jsonGenerator.writeStringField("department", str2);
            }
            String str3 = work.company;
            if (str3 != null) {
                jsonGenerator.writeStringField(ProfileLikeCategoryType.company, str3);
            }
            jsonGenerator.writeBooleanField(Active.TYPE, work.active);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Work) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Work) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Work new_() {
        Work work = new Work();
        work.nullCheck();
        return work;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Work mo223809clone() {
        Work work = new Work();
        work.industry = this.industry;
        work.department = this.department;
        work.company = this.company;
        work.active = this.active;
        return work;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Work)) {
            return false;
        }
        Work work = (Work) obj;
        return ValueObject.util_equals(this.industry, work.industry) && ValueObject.util_equals(this.department, work.department) && ValueObject.util_equals(this.company, work.company) && this.active == work.active;
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
        String str = this.industry;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.department;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.company;
        int iHashCode3 = ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.active ? 1231 : 1237);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.industry == null) {
            this.industry = "";
        }
        if (this.department == null) {
            this.department = "";
        }
        if (this.company == null) {
            this.company = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
