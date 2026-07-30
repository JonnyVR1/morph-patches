package com.p046p1.mobile.putong.account.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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

/* JADX INFO: loaded from: classes9.dex */
public class CameraFilter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "camerafilter";

    @NonNull
    @ProtobufIndex(index = 53)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 51)
    public String f16343id;

    @ProtobufIndex(index = 57)
    public int index;

    @NonNull
    @ProtobufIndex(index = 56)
    public String minVersion;

    @NonNull
    @ProtobufIndex(index = 52)
    public String name;

    @NonNull
    @ProtobufIndex(index = 54)
    public String resource;

    @NonNull
    @ProtobufIndex(index = 55)
    public String resourceMD5;
    public static ProtobufAdapter<CameraFilter> PROTOBUF_ADAPTER = new MessageNanoAdapter<CameraFilter>() { // from class: com.p1.mobile.putong.account.data.CameraFilter.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CameraFilter cameraFilter) {
            String str = cameraFilter.f16343id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(51, str) : 0;
            String str2 = cameraFilter.name;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(52, str2);
            }
            String str3 = cameraFilter.icon;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(53, str3);
            }
            String str4 = cameraFilter.resource;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(54, str4);
            }
            String str5 = cameraFilter.resourceMD5;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(55, str5);
            }
            String str6 = cameraFilter.minVersion;
            if (str6 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(56, str6);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(57, cameraFilter.index);
            cameraFilter.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CameraFilter parse(nb5 nb5Var) throws IOException {
            CameraFilter cameraFilter = new CameraFilter();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (cameraFilter.f16343id == null) {
                        cameraFilter.f16343id = "";
                    }
                    if (cameraFilter.name == null) {
                        cameraFilter.name = "";
                    }
                    if (cameraFilter.icon == null) {
                        cameraFilter.icon = "";
                    }
                    if (cameraFilter.resource == null) {
                        cameraFilter.resource = "";
                    }
                    if (cameraFilter.resourceMD5 == null) {
                        cameraFilter.resourceMD5 = "";
                    }
                    if (cameraFilter.minVersion != null) {
                        break;
                    }
                    cameraFilter.minVersion = "";
                    break;
                }
                if (iM158752u == 410) {
                    cameraFilter.f16343id = nb5Var.m158750s();
                } else if (iM158752u == 418) {
                    cameraFilter.name = nb5Var.m158750s();
                } else if (iM158752u == 426) {
                    cameraFilter.icon = nb5Var.m158750s();
                } else if (iM158752u == 434) {
                    cameraFilter.resource = nb5Var.m158750s();
                } else if (iM158752u == 442) {
                    cameraFilter.resourceMD5 = nb5Var.m158750s();
                } else if (iM158752u == 450) {
                    cameraFilter.minVersion = nb5Var.m158750s();
                } else {
                    if (iM158752u != 456) {
                        if (cameraFilter.f16343id == null) {
                            cameraFilter.f16343id = "";
                        }
                        if (cameraFilter.name == null) {
                            cameraFilter.name = "";
                        }
                        if (cameraFilter.icon == null) {
                            cameraFilter.icon = "";
                        }
                        if (cameraFilter.resource == null) {
                            cameraFilter.resource = "";
                        }
                        if (cameraFilter.resourceMD5 == null) {
                            cameraFilter.resourceMD5 = "";
                        }
                        if (cameraFilter.minVersion != null) {
                            break;
                        }
                        cameraFilter.minVersion = "";
                        return cameraFilter;
                    }
                    cameraFilter.index = nb5Var.m158741j();
                }
            }
            return cameraFilter;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CameraFilter cameraFilter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cameraFilter.f16343id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(51, str);
            }
            String str2 = cameraFilter.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(52, str2);
            }
            String str3 = cameraFilter.icon;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(53, str3);
            }
            String str4 = cameraFilter.resource;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(54, str4);
            }
            String str5 = cameraFilter.resourceMD5;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(55, str5);
            }
            String str6 = cameraFilter.minVersion;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(56, str6);
            }
            codedOutputByteBufferNano.m17250G(57, cameraFilter.index);
        }
    };
    public static JsonAdapter<CameraFilter> JSON_ADAPTER = new ObjectJsonAdapter<CameraFilter>() { // from class: com.p1.mobile.putong.account.data.CameraFilter.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CameraFilter.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CameraFilter newInstance() {
            return new CameraFilter();
        }

        public boolean parseField(CameraFilter cameraFilter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "resource":
                    cameraFilter.resource = jsonParser.getValueAsString();
                    return true;
                case "minVersion":
                    cameraFilter.minVersion = jsonParser.getValueAsString();
                    return true;
                case "id":
                    cameraFilter.f16343id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    cameraFilter.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    cameraFilter.name = jsonParser.getValueAsString();
                    return true;
                case "index":
                    cameraFilter.index = jsonParser.getValueAsInt();
                    return true;
                case "resourceMD5":
                    cameraFilter.resourceMD5 = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CameraFilter cameraFilter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "resource":
                case "minVersion":
                    return true;
                case "id":
                    return false;
                case "icon":
                case "name":
                case "index":
                case "resourceMD5":
                    return true;
                default:
                    return super.parseFieldCheck(cameraFilter, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CameraFilter cameraFilter, JsonGenerator jsonGenerator) throws IOException {
            String str = cameraFilter.f16343id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = cameraFilter.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = cameraFilter.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField("icon", str3);
            }
            String str4 = cameraFilter.resource;
            if (str4 != null) {
                jsonGenerator.writeStringField("resource", str4);
            }
            String str5 = cameraFilter.resourceMD5;
            if (str5 != null) {
                jsonGenerator.writeStringField("resourceMD5", str5);
            }
            String str6 = cameraFilter.minVersion;
            if (str6 != null) {
                jsonGenerator.writeStringField("minVersion", str6);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.INDEX, cameraFilter.index);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CameraFilter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CameraFilter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CameraFilter new_() {
        CameraFilter cameraFilter = new CameraFilter();
        cameraFilter.nullCheck();
        return cameraFilter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CameraFilter mo223809clone() {
        CameraFilter cameraFilter = new CameraFilter();
        cameraFilter.f16343id = this.f16343id;
        cameraFilter.name = this.name;
        cameraFilter.icon = this.icon;
        cameraFilter.resource = this.resource;
        cameraFilter.resourceMD5 = this.resourceMD5;
        cameraFilter.minVersion = this.minVersion;
        cameraFilter.index = this.index;
        return cameraFilter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraFilter)) {
            return false;
        }
        CameraFilter cameraFilter = (CameraFilter) obj;
        return ValueObject.util_equals(this.f16343id, cameraFilter.f16343id) && ValueObject.util_equals(this.name, cameraFilter.name) && ValueObject.util_equals(this.icon, cameraFilter.icon) && ValueObject.util_equals(this.resource, cameraFilter.resource) && ValueObject.util_equals(this.resourceMD5, cameraFilter.resourceMD5) && ValueObject.util_equals(this.minVersion, cameraFilter.minVersion) && this.index == cameraFilter.index;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "camerafilter";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f16343id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.resource;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.resourceMD5;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.minVersion;
        int iHashCode6 = ((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41) + this.index;
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f16343id == null) {
            this.f16343id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.resource == null) {
            this.resource = "";
        }
        if (this.resourceMD5 == null) {
            this.resourceMD5 = "";
        }
        if (this.minVersion == null) {
            this.minVersion = "";
        }
    }

    public CameraFilter subtract(CameraFilter cameraFilter) {
        CameraFilter cameraFilter2 = new CameraFilter();
        if (!ValueObject.util_equals(this.f16343id, cameraFilter.f16343id)) {
            cameraFilter2.f16343id = this.f16343id;
        }
        if (!ValueObject.util_equals(this.name, cameraFilter.name)) {
            cameraFilter2.name = this.name;
        }
        if (!ValueObject.util_equals(this.icon, cameraFilter.icon)) {
            cameraFilter2.icon = this.icon;
        }
        if (!ValueObject.util_equals(this.resource, cameraFilter.resource)) {
            cameraFilter2.resource = this.resource;
        }
        if (!ValueObject.util_equals(this.resourceMD5, cameraFilter.resourceMD5)) {
            cameraFilter2.resourceMD5 = this.resourceMD5;
        }
        if (!ValueObject.util_equals(this.minVersion, cameraFilter.minVersion)) {
            cameraFilter2.minVersion = this.minVersion;
        }
        if (cameraFilter2.equals(new CameraFilter())) {
            return null;
        }
        return cameraFilter2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
