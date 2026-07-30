package com.p046p1.mobile.putong.account.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
public class CameraBeautyMode extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "camerabeautymode";

    @ProtobufIndex(index = 54)
    public int sliderType;

    @NonNull
    @ProtobufIndex(index = 51)
    public String title;

    @NonNull
    @ProtobufIndex(index = 53)
    public String type;

    @ProtobufIndex(index = 52)
    public float value;
    public static ProtobufAdapter<CameraBeautyMode> PROTOBUF_ADAPTER = new MessageNanoAdapter<CameraBeautyMode>() { // from class: com.p1.mobile.putong.account.data.CameraBeautyMode.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CameraBeautyMode cameraBeautyMode) {
            String str = cameraBeautyMode.title;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(51, str) : 0) + CodedOutputByteBufferNano.m17224f(52, cameraBeautyMode.value);
            String str2 = cameraBeautyMode.type;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(53, str2);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(54, cameraBeautyMode.sliderType);
            cameraBeautyMode.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CameraBeautyMode parse(nb5 nb5Var) throws IOException {
            CameraBeautyMode cameraBeautyMode = new CameraBeautyMode();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (cameraBeautyMode.title == null) {
                        cameraBeautyMode.title = "";
                    }
                    if (cameraBeautyMode.type != null) {
                        break;
                    }
                    cameraBeautyMode.type = "";
                    break;
                }
                if (iM158752u == 410) {
                    cameraBeautyMode.title = nb5Var.m158750s();
                } else if (iM158752u == 421) {
                    cameraBeautyMode.value = nb5Var.m158740i();
                } else if (iM158752u == 426) {
                    cameraBeautyMode.type = nb5Var.m158750s();
                } else {
                    if (iM158752u != 432) {
                        if (cameraBeautyMode.title == null) {
                            cameraBeautyMode.title = "";
                        }
                        if (cameraBeautyMode.type != null) {
                            break;
                        }
                        cameraBeautyMode.type = "";
                        return cameraBeautyMode;
                    }
                    cameraBeautyMode.sliderType = nb5Var.m158741j();
                }
            }
            return cameraBeautyMode;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CameraBeautyMode cameraBeautyMode, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cameraBeautyMode.title;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(51, str);
            }
            codedOutputByteBufferNano.m17248E(52, cameraBeautyMode.value);
            String str2 = cameraBeautyMode.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(53, str2);
            }
            codedOutputByteBufferNano.m17250G(54, cameraBeautyMode.sliderType);
        }
    };
    public static JsonAdapter<CameraBeautyMode> JSON_ADAPTER = new ObjectJsonAdapter<CameraBeautyMode>() { // from class: com.p1.mobile.putong.account.data.CameraBeautyMode.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CameraBeautyMode.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CameraBeautyMode newInstance() {
            return new CameraBeautyMode();
        }

        public boolean parseField(CameraBeautyMode cameraBeautyMode, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "type":
                    cameraBeautyMode.type = jsonParser.getValueAsString();
                    return true;
                case "title":
                    cameraBeautyMode.title = jsonParser.getValueAsString();
                    return true;
                case "value":
                    cameraBeautyMode.value = (float) jsonParser.getValueAsDouble();
                    return true;
                case "sliderType":
                    cameraBeautyMode.sliderType = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CameraBeautyMode cameraBeautyMode, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "type":
                case "title":
                case "value":
                case "sliderType":
                    return true;
                default:
                    return super.parseFieldCheck(cameraBeautyMode, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CameraBeautyMode cameraBeautyMode, JsonGenerator jsonGenerator) throws IOException {
            String str = cameraBeautyMode.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            jsonGenerator.writeNumberField("value", cameraBeautyMode.value);
            String str2 = cameraBeautyMode.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            jsonGenerator.writeNumberField("sliderType", cameraBeautyMode.sliderType);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CameraBeautyMode) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CameraBeautyMode) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CameraBeautyMode new_() {
        CameraBeautyMode cameraBeautyMode = new CameraBeautyMode();
        cameraBeautyMode.nullCheck();
        return cameraBeautyMode;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CameraBeautyMode mo223809clone() {
        CameraBeautyMode cameraBeautyMode = new CameraBeautyMode();
        cameraBeautyMode.title = this.title;
        cameraBeautyMode.value = this.value;
        cameraBeautyMode.type = this.type;
        cameraBeautyMode.sliderType = this.sliderType;
        return cameraBeautyMode;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraBeautyMode)) {
            return false;
        }
        CameraBeautyMode cameraBeautyMode = (CameraBeautyMode) obj;
        return ValueObject.util_equals(this.title, cameraBeautyMode.title) && this.value == cameraBeautyMode.value && ValueObject.util_equals(this.type, cameraBeautyMode.type) && this.sliderType == cameraBeautyMode.sliderType;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "camerabeautymode";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.title;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + Float.floatToIntBits(this.value)) * 41;
        String str2 = this.type;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.sliderType;
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    public CameraBeautyMode subtract(CameraBeautyMode cameraBeautyMode) {
        CameraBeautyMode cameraBeautyMode2 = new CameraBeautyMode();
        if (!ValueObject.util_equals(this.title, cameraBeautyMode.title)) {
            cameraBeautyMode2.title = this.title;
        }
        if (!ValueObject.util_equals(this.type, cameraBeautyMode.type)) {
            cameraBeautyMode2.type = this.type;
        }
        if (cameraBeautyMode2.equals(new CameraBeautyMode())) {
            return null;
        }
        return cameraBeautyMode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
