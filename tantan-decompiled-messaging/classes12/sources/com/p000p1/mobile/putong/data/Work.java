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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Work work) {
            String str = work.industry;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = work.department;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = work.company;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            int iB = iO + CodedOutputByteBufferNano.b(4, work.active);
            ((MessageNano) work).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Work m19389parse(nb5 nb5Var) throws IOException {
            Work work = new Work();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    work.industry = nb5Var.s();
                } else if (iU == 18) {
                    work.department = nb5Var.s();
                } else if (iU == 26) {
                    work.company = nb5Var.s();
                } else {
                    if (iU != 32) {
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
                    work.active = nb5Var.g();
                }
            }
            return work;
        }

        public void serialize(Work work, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = work.industry;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = work.department;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = work.company;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            codedOutputByteBufferNano.A(4, work.active);
        }
    };
    public static JsonAdapter<Work> JSON_ADAPTER = new ObjectJsonAdapter<Work>() { // from class: com.p1.mobile.putong.data.Work.2
        public Class getDataClass() {
            return Work.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Work mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                jsonGenerator.writeStringField("company", str3);
            }
            jsonGenerator.writeBooleanField("active", work.active);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Work) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Work) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Work new_() {
        Work work = new Work();
        work.nullCheck();
        return work;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Work m19388clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
