package com.p000p1.mobile.putong.account.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
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
public class CameraSticker extends ValueObject implements Cloneable, Serializable {
    public static final int CATEGORY_BEAUTY = 2;
    public static final String CATEGORY_BEAUTY_AND_DEFAULT_FILTER = "beautyMix";
    public static final String CATEGORY_BEAUTY_FILTER = "beauty";
    public static final int CATEGORY_DEFAULT = 1;
    public static final String CATEGORY_DEFAULT_FILTER = "default";
    public static final String CATEGORY_MAKEUP = "makeup";
    public static final int STATE_COMPLETE = 3;
    public static final int STATE_DOWNLOADING = 2;
    public static final int STATE_ERROR = 4;
    public static final int STATE_UNDOWNLOAD = 1;
    public static final String TYPE = "camerasticker";
    public String cId;

    @NonNull
    @ProtobufIndex(index = 60)
    public String category;

    @ProtobufIndex(index = 58)
    public double createdTime;

    @NonNull
    @ProtobufIndex(index = 61)
    public String extra;
    public boolean hasModelFile;

    @NonNull
    @ProtobufIndex(index = 53)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 51)
    public String f333id;

    @ProtobufIndex(index = 57)
    public int index;

    @NonNull
    @ProtobufIndex(index = 56)
    public String minVersion;
    public String modelFilePath;

    @NonNull
    @ProtobufIndex(index = 52)
    public String name;

    @NonNull
    @ProtobufIndex(index = 54)
    public String resource;

    @NonNull
    @ProtobufIndex(index = 55)
    public String resourceMD5;
    public int state = 1;

    @ProtobufIndex(index = 59)
    public double updateTime;
    public static ProtobufAdapter<CameraSticker> PROTOBUF_ADAPTER = new MessageNanoAdapter<CameraSticker>() { // from class: com.p1.mobile.putong.account.data.CameraSticker.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CameraSticker cameraSticker) {
            String str = cameraSticker.f333id;
            int iO = str != null ? CodedOutputByteBufferNano.o(51, str) : 0;
            String str2 = cameraSticker.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(52, str2);
            }
            String str3 = cameraSticker.icon;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(53, str3);
            }
            String str4 = cameraSticker.resource;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(54, str4);
            }
            String str5 = cameraSticker.resourceMD5;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(55, str5);
            }
            String str6 = cameraSticker.minVersion;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(56, str6);
            }
            int iH = iO + CodedOutputByteBufferNano.h(57, cameraSticker.index) + CodedOutputByteBufferNano.d(58, cameraSticker.createdTime) + CodedOutputByteBufferNano.d(59, cameraSticker.updateTime);
            String str7 = cameraSticker.category;
            if (str7 != null) {
                iH += CodedOutputByteBufferNano.o(60, str7);
            }
            String str8 = cameraSticker.extra;
            if (str8 != null) {
                iH += CodedOutputByteBufferNano.o(61, str8);
            }
            ((MessageNano) cameraSticker).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CameraSticker m28907parse(nb5 nb5Var) throws IOException {
            CameraSticker cameraSticker = new CameraSticker();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (cameraSticker.f333id == null) {
                            cameraSticker.f333id = "";
                        }
                        if (cameraSticker.name == null) {
                            cameraSticker.name = "";
                        }
                        if (cameraSticker.icon == null) {
                            cameraSticker.icon = "";
                        }
                        if (cameraSticker.resource == null) {
                            cameraSticker.resource = "";
                        }
                        if (cameraSticker.resourceMD5 == null) {
                            cameraSticker.resourceMD5 = "";
                        }
                        if (cameraSticker.minVersion == null) {
                            cameraSticker.minVersion = "";
                        }
                        if (cameraSticker.category == null) {
                            cameraSticker.category = "";
                        }
                        if (cameraSticker.extra == null) {
                            cameraSticker.extra = "";
                        }
                        break;
                    case 410:
                        cameraSticker.f333id = nb5Var.s();
                        continue;
                    case 418:
                        cameraSticker.name = nb5Var.s();
                        continue;
                    case 426:
                        cameraSticker.icon = nb5Var.s();
                        continue;
                    case 434:
                        cameraSticker.resource = nb5Var.s();
                        continue;
                    case 442:
                        cameraSticker.resourceMD5 = nb5Var.s();
                        continue;
                    case 450:
                        cameraSticker.minVersion = nb5Var.s();
                        continue;
                    case 456:
                        cameraSticker.index = nb5Var.j();
                        continue;
                    case 465:
                        cameraSticker.createdTime = nb5Var.h();
                        continue;
                    case 473:
                        cameraSticker.updateTime = nb5Var.h();
                        continue;
                    case 482:
                        cameraSticker.category = nb5Var.s();
                        continue;
                    case 490:
                        cameraSticker.extra = nb5Var.s();
                        continue;
                    default:
                        if (cameraSticker.f333id == null) {
                            cameraSticker.f333id = "";
                        }
                        if (cameraSticker.name == null) {
                            cameraSticker.name = "";
                        }
                        if (cameraSticker.icon == null) {
                            cameraSticker.icon = "";
                        }
                        if (cameraSticker.resource == null) {
                            cameraSticker.resource = "";
                        }
                        if (cameraSticker.resourceMD5 == null) {
                            cameraSticker.resourceMD5 = "";
                        }
                        if (cameraSticker.minVersion == null) {
                            cameraSticker.minVersion = "";
                        }
                        if (cameraSticker.category == null) {
                            cameraSticker.category = "";
                        }
                        if (cameraSticker.extra == null) {
                            cameraSticker.extra = "";
                            return cameraSticker;
                        }
                        break;
                }
            }
            return cameraSticker;
        }

        public void serialize(CameraSticker cameraSticker, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cameraSticker.f333id;
            if (str != null) {
                codedOutputByteBufferNano.R(51, str);
            }
            String str2 = cameraSticker.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(52, str2);
            }
            String str3 = cameraSticker.icon;
            if (str3 != null) {
                codedOutputByteBufferNano.R(53, str3);
            }
            String str4 = cameraSticker.resource;
            if (str4 != null) {
                codedOutputByteBufferNano.R(54, str4);
            }
            String str5 = cameraSticker.resourceMD5;
            if (str5 != null) {
                codedOutputByteBufferNano.R(55, str5);
            }
            String str6 = cameraSticker.minVersion;
            if (str6 != null) {
                codedOutputByteBufferNano.R(56, str6);
            }
            codedOutputByteBufferNano.G(57, cameraSticker.index);
            codedOutputByteBufferNano.C(58, cameraSticker.createdTime);
            codedOutputByteBufferNano.C(59, cameraSticker.updateTime);
            String str7 = cameraSticker.category;
            if (str7 != null) {
                codedOutputByteBufferNano.R(60, str7);
            }
            String str8 = cameraSticker.extra;
            if (str8 != null) {
                codedOutputByteBufferNano.R(61, str8);
            }
        }
    };
    public static JsonAdapter<CameraSticker> JSON_ADAPTER = new ObjectJsonAdapter<CameraSticker>() { // from class: com.p1.mobile.putong.account.data.CameraSticker.2
        public Class getDataClass() {
            return CameraSticker.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CameraSticker m28908newInstance() {
            return new CameraSticker();
        }

        public boolean parseField(CameraSticker cameraSticker, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "createdTime":
                    cameraSticker.createdTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "resource":
                    cameraSticker.resource = jsonParser.getValueAsString();
                    return true;
                case "minVersion":
                    cameraSticker.minVersion = jsonParser.getValueAsString();
                    return true;
                case "updateTime":
                    cameraSticker.updateTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "id":
                    cameraSticker.f333id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    cameraSticker.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    cameraSticker.name = jsonParser.getValueAsString();
                    return true;
                case "category":
                    cameraSticker.category = jsonParser.getValueAsString();
                    return true;
                case "extra":
                    cameraSticker.extra = jsonParser.getValueAsString();
                    return true;
                case "index":
                    cameraSticker.index = jsonParser.getValueAsInt();
                    return true;
                case "resourceMD5":
                    cameraSticker.resourceMD5 = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CameraSticker cameraSticker, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "createdTime":
                case "resource":
                case "minVersion":
                case "updateTime":
                    return true;
                case "id":
                    return false;
                case "icon":
                case "name":
                case "category":
                case "extra":
                case "index":
                case "resourceMD5":
                    return true;
                default:
                    return super.parseFieldCheck(cameraSticker, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(CameraSticker cameraSticker, JsonGenerator jsonGenerator) throws IOException {
            String str = cameraSticker.f333id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = cameraSticker.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            String str3 = cameraSticker.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField("icon", str3);
            }
            String str4 = cameraSticker.resource;
            if (str4 != null) {
                jsonGenerator.writeStringField("resource", str4);
            }
            String str5 = cameraSticker.resourceMD5;
            if (str5 != null) {
                jsonGenerator.writeStringField("resourceMD5", str5);
            }
            String str6 = cameraSticker.minVersion;
            if (str6 != null) {
                jsonGenerator.writeStringField("minVersion", str6);
            }
            jsonGenerator.writeNumberField("index", cameraSticker.index);
            jsonGenerator.writeFieldName("createdTime");
            JsonAdapter jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(cameraSticker.createdTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("updateTime");
            jsonAdapter.serialize(Double.valueOf(cameraSticker.updateTime), jsonGenerator, true);
            String str7 = cameraSticker.category;
            if (str7 != null) {
                jsonGenerator.writeStringField("category", str7);
            }
            String str8 = cameraSticker.extra;
            if (str8 != null) {
                jsonGenerator.writeStringField("extra", str8);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CameraSticker) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CameraSticker) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CameraSticker new_() {
        CameraSticker cameraSticker = new CameraSticker();
        cameraSticker.nullCheck();
        return cameraSticker;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CameraSticker m28906clone() {
        CameraSticker cameraSticker = new CameraSticker();
        cameraSticker.f333id = this.f333id;
        cameraSticker.name = this.name;
        cameraSticker.icon = this.icon;
        cameraSticker.resource = this.resource;
        cameraSticker.resourceMD5 = this.resourceMD5;
        cameraSticker.minVersion = this.minVersion;
        cameraSticker.index = this.index;
        cameraSticker.createdTime = this.createdTime;
        cameraSticker.updateTime = this.updateTime;
        cameraSticker.category = this.category;
        cameraSticker.extra = this.extra;
        return cameraSticker;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraSticker)) {
            return false;
        }
        CameraSticker cameraSticker = (CameraSticker) obj;
        return ValueObject.util_equals(this.f333id, cameraSticker.f333id) && ValueObject.util_equals(this.name, cameraSticker.name) && ValueObject.util_equals(this.icon, cameraSticker.icon) && ValueObject.util_equals(this.resource, cameraSticker.resource) && ValueObject.util_equals(this.resourceMD5, cameraSticker.resourceMD5) && ValueObject.util_equals(this.minVersion, cameraSticker.minVersion) && this.index == cameraSticker.index && this.createdTime == cameraSticker.createdTime && this.updateTime == cameraSticker.updateTime && ValueObject.util_equals(this.category, cameraSticker.category) && ValueObject.util_equals(this.extra, cameraSticker.extra);
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
        String str = this.f333id;
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
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i3 = (iHashCode6 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.updateTime);
        int i4 = ((i3 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41;
        String str7 = this.category;
        int iHashCode7 = (i4 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.extra;
        int iHashCode8 = iHashCode7 + (str8 != null ? str8.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode8;
        return iHashCode8;
    }

    public boolean isBeautySticker() {
        return CATEGORY_BEAUTY_FILTER.equals(this.category);
    }

    public void nullCheck() {
        if (this.f333id == null) {
            this.f333id = "";
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
        if (this.category == null) {
            this.category = "";
        }
        if (this.extra == null) {
            this.extra = "";
        }
    }

    public CameraSticker subtract(CameraSticker cameraSticker) {
        CameraSticker cameraSticker2 = new CameraSticker();
        if (!ValueObject.util_equals(this.f333id, cameraSticker.f333id)) {
            cameraSticker2.f333id = this.f333id;
        }
        if (!ValueObject.util_equals(this.name, cameraSticker.name)) {
            cameraSticker2.name = this.name;
        }
        if (!ValueObject.util_equals(this.icon, cameraSticker.icon)) {
            cameraSticker2.icon = this.icon;
        }
        if (!ValueObject.util_equals(this.resource, cameraSticker.resource)) {
            cameraSticker2.resource = this.resource;
        }
        if (!ValueObject.util_equals(this.resourceMD5, cameraSticker.resourceMD5)) {
            cameraSticker2.resourceMD5 = this.resourceMD5;
        }
        if (!ValueObject.util_equals(this.minVersion, cameraSticker.minVersion)) {
            cameraSticker2.minVersion = this.minVersion;
        }
        if (!ValueObject.util_equals(this.category, cameraSticker.category)) {
            cameraSticker2.category = this.category;
        }
        if (!ValueObject.util_equals(this.extra, cameraSticker.extra)) {
            cameraSticker2.extra = this.extra;
        }
        if (cameraSticker2.equals(new CameraSticker())) {
            return null;
        }
        return cameraSticker2;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
