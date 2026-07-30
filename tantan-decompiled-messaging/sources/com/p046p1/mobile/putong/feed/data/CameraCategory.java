package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
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
    public String f39217id;

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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CameraCategory cameraCategory) {
            String str = cameraCategory.f39217id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = cameraCategory.name;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = cameraCategory.category;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = cameraCategory.type;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            int iM17222d = iM17233o + CodedOutputByteBufferNano.m17222d(5, cameraCategory.cameraUpdateTime);
            String str5 = cameraCategory.status;
            if (str5 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(6, str5);
            }
            cameraCategory.cachedSize = iM17222d;
            return iM17222d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CameraCategory parse(nb5 nb5Var) throws IOException {
            CameraCategory cameraCategory = new CameraCategory();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (cameraCategory.f39217id == null) {
                        cameraCategory.f39217id = "";
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
                if (iM158752u == 10) {
                    cameraCategory.f39217id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    cameraCategory.name = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    cameraCategory.category = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    cameraCategory.type = nb5Var.m158750s();
                } else if (iM158752u == 41) {
                    cameraCategory.cameraUpdateTime = nb5Var.m158739h();
                } else {
                    if (iM158752u != 50) {
                        if (cameraCategory.f39217id == null) {
                            cameraCategory.f39217id = "";
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
                    cameraCategory.status = nb5Var.m158750s();
                }
            }
            return cameraCategory;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CameraCategory cameraCategory, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cameraCategory.f39217id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = cameraCategory.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = cameraCategory.category;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = cameraCategory.type;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            codedOutputByteBufferNano.m17246C(5, cameraCategory.cameraUpdateTime);
            String str5 = cameraCategory.status;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(6, str5);
            }
        }
    };
    public static JsonAdapter<CameraCategory> JSON_ADAPTER = new ObjectJsonAdapter<CameraCategory>() { // from class: com.p1.mobile.putong.feed.data.CameraCategory.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CameraCategory.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CameraCategory newInstance() {
            return new CameraCategory();
        }

        public boolean parseField(CameraCategory cameraCategory, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "cameraUpdateTime":
                    cameraCategory.cameraUpdateTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "status":
                    cameraCategory.status = jsonParser.getValueAsString();
                    return true;
                case "id":
                    cameraCategory.f39217id = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CameraCategory cameraCategory, JsonGenerator jsonGenerator) throws IOException {
            String str = cameraCategory.f39217id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = cameraCategory.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
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
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CameraCategory) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CameraCategory) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CameraCategory new_() {
        CameraCategory cameraCategory = new CameraCategory();
        cameraCategory.nullCheck();
        return cameraCategory;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CameraCategory mo223809clone() {
        CameraCategory cameraCategory = new CameraCategory();
        cameraCategory.f39217id = this.f39217id;
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
        return ValueObject.util_equals(this.f39217id, cameraCategory.f39217id) && ValueObject.util_equals(this.name, cameraCategory.name) && ValueObject.util_equals(this.category, cameraCategory.category) && ValueObject.util_equals(this.type, cameraCategory.type) && this.cameraUpdateTime == cameraCategory.cameraUpdateTime && ValueObject.util_equals(this.status, cameraCategory.status);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "cameracategory";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f39217id;
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
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39217id == null) {
            this.f39217id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
