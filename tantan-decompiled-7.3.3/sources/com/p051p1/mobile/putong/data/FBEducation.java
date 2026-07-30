package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.MerchandiseTimeUnit;
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

/* JADX INFO: loaded from: classes12.dex */
public class FBEducation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fbeducation";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39598id;

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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FBEducation fBEducation) {
            String str = fBEducation.f39598id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            FBPage fBPage = fBEducation.school;
            if (fBPage != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, fBPage, FBPage.PROTOBUF_ADAPTER);
            }
            FBPage fBPage2 = fBEducation.type;
            if (fBPage2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, fBPage2, FBPage.PROTOBUF_ADAPTER);
            }
            FBPage fBPage3 = fBEducation.year;
            if (fBPage3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, fBPage3, FBPage.PROTOBUF_ADAPTER);
            }
            fBEducation.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FBEducation parse(nc5 nc5Var) throws IOException {
            FBEducation fBEducation = new FBEducation();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (fBEducation.f39598id == null) {
                        fBEducation.f39598id = "";
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
                if (iM162497u == 10) {
                    fBEducation.f39598id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    fBEducation.school = (FBPage) nc5Var.m162488l(FBPage.PROTOBUF_ADAPTER);
                } else if (iM162497u == 26) {
                    fBEducation.type = (FBPage) nc5Var.m162488l(FBPage.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 34) {
                        if (fBEducation.f39598id == null) {
                            fBEducation.f39598id = "";
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
                    fBEducation.year = (FBPage) nc5Var.m162488l(FBPage.PROTOBUF_ADAPTER);
                }
            }
            return fBEducation;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FBEducation fBEducation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = fBEducation.f39598id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            FBPage fBPage = fBEducation.school;
            if (fBPage != null) {
                codedOutputByteBufferNano.m17309K(2, fBPage, FBPage.PROTOBUF_ADAPTER);
            }
            FBPage fBPage2 = fBEducation.type;
            if (fBPage2 != null) {
                codedOutputByteBufferNano.m17309K(3, fBPage2, FBPage.PROTOBUF_ADAPTER);
            }
            FBPage fBPage3 = fBEducation.year;
            if (fBPage3 != null) {
                codedOutputByteBufferNano.m17309K(4, fBPage3, FBPage.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FBEducation> JSON_ADAPTER = new ObjectJsonAdapter<FBEducation>() { // from class: com.p1.mobile.putong.data.FBEducation.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FBEducation.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FBEducation newInstance() {
            return new FBEducation();
        }

        public boolean parseField(FBEducation fBEducation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "school":
                    fBEducation.school = FBPage.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    fBEducation.f39598id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    fBEducation.type = FBPage.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "year":
                    fBEducation.year = FBPage.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FBEducation fBEducation, JsonGenerator jsonGenerator) throws IOException {
            String str = fBEducation.f39598id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (fBEducation.school != null) {
                jsonGenerator.writeFieldName("school");
                FBPage.JSON_ADAPTER.serialize(fBEducation.school, jsonGenerator, true);
            }
            if (fBEducation.type != null) {
                jsonGenerator.writeFieldName("type");
                FBPage.JSON_ADAPTER.serialize(fBEducation.type, jsonGenerator, true);
            }
            if (fBEducation.year != null) {
                jsonGenerator.writeFieldName(MerchandiseTimeUnit.year);
                FBPage.JSON_ADAPTER.serialize(fBEducation.year, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FBEducation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FBEducation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FBEducation new_() {
        FBEducation fBEducation = new FBEducation();
        fBEducation.nullCheck();
        return fBEducation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FBEducation mo225055clone() {
        FBEducation fBEducation = new FBEducation();
        fBEducation.f39598id = this.f39598id;
        FBPage fBPage = this.school;
        if (fBPage != null) {
            fBEducation.school = fBPage.mo225055clone();
        }
        FBPage fBPage2 = this.type;
        if (fBPage2 != null) {
            fBEducation.type = fBPage2.mo225055clone();
        }
        FBPage fBPage3 = this.year;
        if (fBPage3 != null) {
            fBEducation.year = fBPage3.mo225055clone();
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
        return ValueObject.util_equals(this.f39598id, fBEducation.f39598id) && ValueObject.util_equals(this.school, fBEducation.school) && ValueObject.util_equals(this.type, fBEducation.type) && ValueObject.util_equals(this.year, fBEducation.year);
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
        String str = this.f39598id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        FBPage fBPage = this.school;
        int iHashCode2 = (iHashCode + (fBPage != null ? fBPage.hashCode() : 0)) * 41;
        FBPage fBPage2 = this.type;
        int iHashCode3 = (iHashCode2 + (fBPage2 != null ? fBPage2.hashCode() : 0)) * 41;
        FBPage fBPage3 = this.year;
        int iHashCode4 = iHashCode3 + (fBPage3 != null ? fBPage3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39598id == null) {
            this.f39598id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
