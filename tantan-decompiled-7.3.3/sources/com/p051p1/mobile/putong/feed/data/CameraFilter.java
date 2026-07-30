package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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

/* JADX INFO: loaded from: classes13.dex */
public class CameraFilter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "camerafilter";

    @NonNull
    @ProtobufIndex(index = 53)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 51)
    public String f40066id;

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
    public static ProtobufAdapter<CameraFilter> PROTOBUF_ADAPTER = new MessageNanoAdapter<CameraFilter>() { // from class: com.p1.mobile.putong.feed.data.CameraFilter.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CameraFilter cameraFilter) {
            String str = cameraFilter.f40066id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(51, str) : 0;
            String str2 = cameraFilter.name;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(52, str2);
            }
            String str3 = cameraFilter.icon;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(53, str3);
            }
            String str4 = cameraFilter.resource;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(54, str4);
            }
            String str5 = cameraFilter.resourceMD5;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(55, str5);
            }
            String str6 = cameraFilter.minVersion;
            if (str6 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(56, str6);
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(57, cameraFilter.index);
            cameraFilter.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CameraFilter parse(nc5 nc5Var) throws IOException {
            CameraFilter cameraFilter = new CameraFilter();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (cameraFilter.f40066id == null) {
                        cameraFilter.f40066id = "";
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
                if (iM162497u == 410) {
                    cameraFilter.f40066id = nc5Var.m162495s();
                } else if (iM162497u == 418) {
                    cameraFilter.name = nc5Var.m162495s();
                } else if (iM162497u == 426) {
                    cameraFilter.icon = nc5Var.m162495s();
                } else if (iM162497u == 434) {
                    cameraFilter.resource = nc5Var.m162495s();
                } else if (iM162497u == 442) {
                    cameraFilter.resourceMD5 = nc5Var.m162495s();
                } else if (iM162497u == 450) {
                    cameraFilter.minVersion = nc5Var.m162495s();
                } else {
                    if (iM162497u != 456) {
                        if (cameraFilter.f40066id == null) {
                            cameraFilter.f40066id = "";
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
                    cameraFilter.index = nc5Var.m162486j();
                }
            }
            return cameraFilter;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CameraFilter cameraFilter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cameraFilter.f40066id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(51, str);
            }
            String str2 = cameraFilter.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(52, str2);
            }
            String str3 = cameraFilter.icon;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(53, str3);
            }
            String str4 = cameraFilter.resource;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(54, str4);
            }
            String str5 = cameraFilter.resourceMD5;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(55, str5);
            }
            String str6 = cameraFilter.minVersion;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(56, str6);
            }
            codedOutputByteBufferNano.m17305G(57, cameraFilter.index);
        }
    };
    public static JsonAdapter<CameraFilter> JSON_ADAPTER = new ObjectJsonAdapter<CameraFilter>() { // from class: com.p1.mobile.putong.feed.data.CameraFilter.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CameraFilter.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                    cameraFilter.f40066id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CameraFilter cameraFilter, JsonGenerator jsonGenerator) throws IOException {
            String str = cameraFilter.f40066id;
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CameraFilter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public CameraFilter mo225055clone() {
        CameraFilter cameraFilter = new CameraFilter();
        cameraFilter.f40066id = this.f40066id;
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
        return ValueObject.util_equals(this.f40066id, cameraFilter.f40066id) && ValueObject.util_equals(this.name, cameraFilter.name) && ValueObject.util_equals(this.icon, cameraFilter.icon) && ValueObject.util_equals(this.resource, cameraFilter.resource) && ValueObject.util_equals(this.resourceMD5, cameraFilter.resourceMD5) && ValueObject.util_equals(this.minVersion, cameraFilter.minVersion) && this.index == cameraFilter.index;
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
        String str = this.f40066id;
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
        if (this.f40066id == null) {
            this.f40066id = "";
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
        if (!ValueObject.util_equals(this.f40066id, cameraFilter.f40066id)) {
            cameraFilter2.f40066id = this.f40066id;
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
