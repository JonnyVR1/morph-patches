package com.p000p1.mobile.putong.account.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CameraFilter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "camerafilter";

    @NonNull
    @ProtobufIndex(index = 53)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 51)
    public String f332id;

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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CameraFilter cameraFilter) {
            String str = cameraFilter.f332id;
            int iO = str != null ? CodedOutputByteBufferNano.o(51, str) : 0;
            String str2 = cameraFilter.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(52, str2);
            }
            String str3 = cameraFilter.icon;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(53, str3);
            }
            String str4 = cameraFilter.resource;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(54, str4);
            }
            String str5 = cameraFilter.resourceMD5;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(55, str5);
            }
            String str6 = cameraFilter.minVersion;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(56, str6);
            }
            int iH = iO + CodedOutputByteBufferNano.h(57, cameraFilter.index);
            ((MessageNano) cameraFilter).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CameraFilter m28903parse(nb5 nb5Var) throws IOException {
            CameraFilter cameraFilter = new CameraFilter();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (cameraFilter.f332id == null) {
                        cameraFilter.f332id = "";
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
                if (iU == 410) {
                    cameraFilter.f332id = nb5Var.s();
                } else if (iU == 418) {
                    cameraFilter.name = nb5Var.s();
                } else if (iU == 426) {
                    cameraFilter.icon = nb5Var.s();
                } else if (iU == 434) {
                    cameraFilter.resource = nb5Var.s();
                } else if (iU == 442) {
                    cameraFilter.resourceMD5 = nb5Var.s();
                } else if (iU == 450) {
                    cameraFilter.minVersion = nb5Var.s();
                } else {
                    if (iU != 456) {
                        if (cameraFilter.f332id == null) {
                            cameraFilter.f332id = "";
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
                    cameraFilter.index = nb5Var.j();
                }
            }
            return cameraFilter;
        }

        public void serialize(CameraFilter cameraFilter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cameraFilter.f332id;
            if (str != null) {
                codedOutputByteBufferNano.R(51, str);
            }
            String str2 = cameraFilter.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(52, str2);
            }
            String str3 = cameraFilter.icon;
            if (str3 != null) {
                codedOutputByteBufferNano.R(53, str3);
            }
            String str4 = cameraFilter.resource;
            if (str4 != null) {
                codedOutputByteBufferNano.R(54, str4);
            }
            String str5 = cameraFilter.resourceMD5;
            if (str5 != null) {
                codedOutputByteBufferNano.R(55, str5);
            }
            String str6 = cameraFilter.minVersion;
            if (str6 != null) {
                codedOutputByteBufferNano.R(56, str6);
            }
            codedOutputByteBufferNano.G(57, cameraFilter.index);
        }
    };
    public static JsonAdapter<CameraFilter> JSON_ADAPTER = new ObjectJsonAdapter<CameraFilter>() { // from class: com.p1.mobile.putong.account.data.CameraFilter.2
        public Class getDataClass() {
            return CameraFilter.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CameraFilter m28904newInstance() {
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
                    cameraFilter.f332id = jsonParser.getValueAsString();
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

        public void serializeFields(CameraFilter cameraFilter, JsonGenerator jsonGenerator) throws IOException {
            String str = cameraFilter.f332id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = cameraFilter.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
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
            jsonGenerator.writeNumberField("index", cameraFilter.index);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CameraFilter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CameraFilter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CameraFilter new_() {
        CameraFilter cameraFilter = new CameraFilter();
        cameraFilter.nullCheck();
        return cameraFilter;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CameraFilter m28902clone() {
        CameraFilter cameraFilter = new CameraFilter();
        cameraFilter.f332id = this.f332id;
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
        return ValueObject.util_equals(this.f332id, cameraFilter.f332id) && ValueObject.util_equals(this.name, cameraFilter.name) && ValueObject.util_equals(this.icon, cameraFilter.icon) && ValueObject.util_equals(this.resource, cameraFilter.resource) && ValueObject.util_equals(this.resourceMD5, cameraFilter.resourceMD5) && ValueObject.util_equals(this.minVersion, cameraFilter.minVersion) && this.index == cameraFilter.index;
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
        String str = this.f332id;
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
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

    public void nullCheck() {
        if (this.f332id == null) {
            this.f332id = "";
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
        if (!ValueObject.util_equals(this.f332id, cameraFilter.f332id)) {
            cameraFilter2.f332id = this.f332id;
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
