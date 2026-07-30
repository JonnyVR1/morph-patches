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
public class FBEducation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fbeducation";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f211id;

    @NonNull
    @ProtobufIndex(index = 2)
    public FBPage school;

    @NonNull
    @ProtobufIndex(index = 3)
    public FBPage type;

    @NonNull
    @ProtobufIndex(index = 4)
    public FBPage year;
    public static ProtobufAdapter<FBEducation> PROTOBUF_ADAPTER = new MessageNanoAdapter<FBEducation>() { // from class: com.p1.mobile.putong.data.FBEducation.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FBEducation fBEducation) {
            String str = fBEducation.f211id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            FBPage fBPage = fBEducation.school;
            if (fBPage != null) {
                iO += CodedOutputByteBufferNano.l(2, fBPage, FBPage.PROTOBUF_ADAPTER);
            }
            FBPage fBPage2 = fBEducation.type;
            if (fBPage2 != null) {
                iO += CodedOutputByteBufferNano.l(3, fBPage2, FBPage.PROTOBUF_ADAPTER);
            }
            FBPage fBPage3 = fBEducation.year;
            if (fBPage3 != null) {
                iO += CodedOutputByteBufferNano.l(4, fBPage3, FBPage.PROTOBUF_ADAPTER);
            }
            ((MessageNano) fBEducation).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FBEducation m18037parse(nb5 nb5Var) throws IOException {
            FBEducation fBEducation = new FBEducation();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (fBEducation.f211id == null) {
                        fBEducation.f211id = "";
                    }
                    if (fBEducation.school == null) {
                        fBEducation.school = FBPage.new_();
                    }
                    if (fBEducation.type == null) {
                        fBEducation.type = FBPage.new_();
                    }
                    if (fBEducation.year != null) {
                        break;
                    }
                    fBEducation.year = FBPage.new_();
                    break;
                }
                if (iU == 10) {
                    fBEducation.f211id = nb5Var.s();
                } else if (iU == 18) {
                    fBEducation.school = (FBPage) nb5Var.l(FBPage.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    fBEducation.type = (FBPage) nb5Var.l(FBPage.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 34) {
                        if (fBEducation.f211id == null) {
                            fBEducation.f211id = "";
                        }
                        if (fBEducation.school == null) {
                            fBEducation.school = FBPage.new_();
                        }
                        if (fBEducation.type == null) {
                            fBEducation.type = FBPage.new_();
                        }
                        if (fBEducation.year != null) {
                            break;
                        }
                        fBEducation.year = FBPage.new_();
                        return fBEducation;
                    }
                    fBEducation.year = (FBPage) nb5Var.l(FBPage.PROTOBUF_ADAPTER);
                }
            }
            return fBEducation;
        }

        public void serialize(FBEducation fBEducation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = fBEducation.f211id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            FBPage fBPage = fBEducation.school;
            if (fBPage != null) {
                codedOutputByteBufferNano.K(2, fBPage, FBPage.PROTOBUF_ADAPTER);
            }
            FBPage fBPage2 = fBEducation.type;
            if (fBPage2 != null) {
                codedOutputByteBufferNano.K(3, fBPage2, FBPage.PROTOBUF_ADAPTER);
            }
            FBPage fBPage3 = fBEducation.year;
            if (fBPage3 != null) {
                codedOutputByteBufferNano.K(4, fBPage3, FBPage.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FBEducation> JSON_ADAPTER = new ObjectJsonAdapter<FBEducation>() { // from class: com.p1.mobile.putong.data.FBEducation.2
        public Class getDataClass() {
            return FBEducation.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FBEducation mo17830newInstance() {
            return new FBEducation();
        }

        public boolean parseField(FBEducation fBEducation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "school":
                    fBEducation.school = (FBPage) FBPage.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    fBEducation.f211id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    fBEducation.type = (FBPage) FBPage.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "year":
                    fBEducation.year = (FBPage) FBPage.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FBEducation fBEducation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "school":
                    return true;
                case "id":
                    return false;
                case "type":
                case "year":
                    return true;
                default:
                    return super.parseFieldCheck(fBEducation, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FBEducation fBEducation, JsonGenerator jsonGenerator) throws IOException {
            String str = fBEducation.f211id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (fBEducation.school != null) {
                jsonGenerator.writeFieldName(StudentVerRejectedReason.school);
                FBPage.JSON_ADAPTER.serialize(fBEducation.school, jsonGenerator, true);
            }
            if (fBEducation.type != null) {
                jsonGenerator.writeFieldName("type");
                FBPage.JSON_ADAPTER.serialize(fBEducation.type, jsonGenerator, true);
            }
            if (fBEducation.year != null) {
                jsonGenerator.writeFieldName("year");
                FBPage.JSON_ADAPTER.serialize(fBEducation.year, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FBEducation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FBEducation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FBEducation new_() {
        FBEducation fBEducation = new FBEducation();
        fBEducation.nullCheck();
        return fBEducation;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FBEducation m18036clone() {
        FBEducation fBEducation = new FBEducation();
        fBEducation.f211id = this.f211id;
        FBPage fBPage = this.school;
        if (fBPage != null) {
            fBEducation.school = fBPage.m18045clone();
        }
        FBPage fBPage2 = this.type;
        if (fBPage2 != null) {
            fBEducation.type = fBPage2.m18045clone();
        }
        FBPage fBPage3 = this.year;
        if (fBPage3 != null) {
            fBEducation.year = fBPage3.m18045clone();
        }
        return fBEducation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FBEducation)) {
            return false;
        }
        FBEducation fBEducation = (FBEducation) obj;
        return ValueObject.util_equals(this.f211id, fBEducation.f211id) && ValueObject.util_equals(this.school, fBEducation.school) && ValueObject.util_equals(this.type, fBEducation.type) && ValueObject.util_equals(this.year, fBEducation.year);
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
        String str = this.f211id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        FBPage fBPage = this.school;
        int iHashCode2 = (iHashCode + (fBPage != null ? fBPage.hashCode() : 0)) * 41;
        FBPage fBPage2 = this.type;
        int iHashCode3 = (iHashCode2 + (fBPage2 != null ? fBPage2.hashCode() : 0)) * 41;
        FBPage fBPage3 = this.year;
        int iHashCode4 = iHashCode3 + (fBPage3 != null ? fBPage3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.f211id == null) {
            this.f211id = "";
        }
        if (this.school == null) {
            this.school = FBPage.new_();
        }
        if (this.type == null) {
            this.type = FBPage.new_();
        }
        if (this.year == null) {
            this.year = FBPage.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
