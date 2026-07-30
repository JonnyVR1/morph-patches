package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Converter;
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
public class CameraCategory extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cameracategory";

    @ProtobufIndex(index = 5)
    public double cameraUpdateTime;

    @NonNull
    @ProtobufIndex(index = 3)
    public String category;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f678id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 6)
    public String status;

    @NonNull
    @ProtobufIndex(index = 4)
    public String type;
    public static ProtobufAdapter<CameraCategory> PROTOBUF_ADAPTER = new MessageNanoAdapter<CameraCategory>() { // from class: com.p1.mobile.putong.feed.data.CameraCategory.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CameraCategory cameraCategory) {
            String str = cameraCategory.f678id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = cameraCategory.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = cameraCategory.category;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = cameraCategory.type;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            int iD = iO + CodedOutputByteBufferNano.d(5, cameraCategory.cameraUpdateTime);
            String str5 = cameraCategory.status;
            if (str5 != null) {
                iD += CodedOutputByteBufferNano.o(6, str5);
            }
            ((MessageNano) cameraCategory).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CameraCategory m19446parse(nb5 nb5Var) throws IOException {
            CameraCategory cameraCategory = new CameraCategory();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (cameraCategory.f678id == null) {
                        cameraCategory.f678id = "";
                    }
                    if (cameraCategory.name == null) {
                        cameraCategory.name = "";
                    }
                    if (cameraCategory.category == null) {
                        cameraCategory.category = "";
                    }
                    if (cameraCategory.type == null) {
                        cameraCategory.type = "";
                    }
                    if (cameraCategory.status != null) {
                        break;
                    }
                    cameraCategory.status = "";
                    break;
                }
                if (iU == 10) {
                    cameraCategory.f678id = nb5Var.s();
                } else if (iU == 18) {
                    cameraCategory.name = nb5Var.s();
                } else if (iU == 26) {
                    cameraCategory.category = nb5Var.s();
                } else if (iU == 34) {
                    cameraCategory.type = nb5Var.s();
                } else if (iU == 41) {
                    cameraCategory.cameraUpdateTime = nb5Var.h();
                } else {
                    if (iU != 50) {
                        if (cameraCategory.f678id == null) {
                            cameraCategory.f678id = "";
                        }
                        if (cameraCategory.name == null) {
                            cameraCategory.name = "";
                        }
                        if (cameraCategory.category == null) {
                            cameraCategory.category = "";
                        }
                        if (cameraCategory.type == null) {
                            cameraCategory.type = "";
                        }
                        if (cameraCategory.status != null) {
                            break;
                        }
                        cameraCategory.status = "";
                        return cameraCategory;
                    }
                    cameraCategory.status = nb5Var.s();
                }
            }
            return cameraCategory;
        }

        public void serialize(CameraCategory cameraCategory, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cameraCategory.f678id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = cameraCategory.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = cameraCategory.category;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = cameraCategory.type;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            codedOutputByteBufferNano.C(5, cameraCategory.cameraUpdateTime);
            String str5 = cameraCategory.status;
            if (str5 != null) {
                codedOutputByteBufferNano.R(6, str5);
            }
        }
    };
    public static JsonAdapter<CameraCategory> JSON_ADAPTER = new ObjectJsonAdapter<CameraCategory>() { // from class: com.p1.mobile.putong.feed.data.CameraCategory.2
        public Class getDataClass() {
            return CameraCategory.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public CameraCategory mo17830newInstance() {
            return new CameraCategory();
        }

        public boolean parseField(CameraCategory cameraCategory, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "cameraUpdateTime":
                    cameraCategory.cameraUpdateTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "status":
                    cameraCategory.status = jsonParser.getValueAsString();
                    return true;
                case "id":
                    cameraCategory.f678id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    cameraCategory.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    cameraCategory.type = jsonParser.getValueAsString();
                    return true;
                case "category":
                    cameraCategory.category = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CameraCategory cameraCategory, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "cameraUpdateTime":
                case "status":
                    return true;
                case "id":
                    return false;
                case "name":
                case "type":
                case "category":
                    return true;
                default:
                    return super.parseFieldCheck(cameraCategory, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CameraCategory cameraCategory, JsonGenerator jsonGenerator) throws IOException {
            String str = cameraCategory.f678id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = cameraCategory.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            String str3 = cameraCategory.category;
            if (str3 != null) {
                jsonGenerator.writeStringField("category", str3);
            }
            String str4 = cameraCategory.type;
            if (str4 != null) {
                jsonGenerator.writeStringField("type", str4);
            }
            jsonGenerator.writeFieldName("cameraUpdateTime");
            Converter.API_TIME.serialize(Double.valueOf(cameraCategory.cameraUpdateTime), jsonGenerator, true);
            String str5 = cameraCategory.status;
            if (str5 != null) {
                jsonGenerator.writeStringField("status", str5);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CameraCategory) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CameraCategory) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CameraCategory new_() {
        CameraCategory cameraCategory = new CameraCategory();
        cameraCategory.nullCheck();
        return cameraCategory;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CameraCategory m19445clone() {
        CameraCategory cameraCategory = new CameraCategory();
        cameraCategory.f678id = this.f678id;
        cameraCategory.name = this.name;
        cameraCategory.category = this.category;
        cameraCategory.type = this.type;
        cameraCategory.cameraUpdateTime = this.cameraUpdateTime;
        cameraCategory.status = this.status;
        return cameraCategory;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraCategory)) {
            return false;
        }
        CameraCategory cameraCategory = (CameraCategory) obj;
        return ValueObject.util_equals(this.f678id, cameraCategory.f678id) && ValueObject.util_equals(this.name, cameraCategory.name) && ValueObject.util_equals(this.category, cameraCategory.category) && ValueObject.util_equals(this.type, cameraCategory.type) && this.cameraUpdateTime == cameraCategory.cameraUpdateTime && ValueObject.util_equals(this.status, cameraCategory.status);
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
        String str = this.f678id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.category;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.type;
        int iHashCode4 = str4 != null ? str4.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.cameraUpdateTime);
        int i3 = (((iHashCode3 + iHashCode4) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str5 = this.status;
        int iHashCode5 = i3 + (str5 != null ? str5.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.f678id == null) {
            this.f678id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.category == null) {
            this.category = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.status == null) {
            this.status = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
