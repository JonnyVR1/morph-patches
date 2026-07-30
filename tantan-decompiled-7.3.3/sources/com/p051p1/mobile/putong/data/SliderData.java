package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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

/* JADX INFO: loaded from: classes12.dex */
public class SliderData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "sliderdata";

    @ProtobufIndex(index = 2)
    public int allowClose;

    @ProtobufIndex(index = 4)
    public int delayClose;

    @ProtobufIndex(index = 3)
    public int retryClose;

    @ProtobufIndex(index = 1)
    public int supplier;

    @NonNull
    @ProtobufIndex(index = 5)
    public String uuid;
    public static ProtobufAdapter<SliderData> PROTOBUF_ADAPTER = new MessageNanoAdapter<SliderData>() { // from class: com.p1.mobile.putong.data.SliderData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SliderData sliderData) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, sliderData.supplier) + CodedOutputByteBufferNano.m17281h(2, sliderData.allowClose) + CodedOutputByteBufferNano.m17281h(3, sliderData.retryClose) + CodedOutputByteBufferNano.m17281h(4, sliderData.delayClose);
            String str = sliderData.uuid;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(5, str);
            }
            sliderData.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SliderData parse(nc5 nc5Var) throws IOException {
            SliderData sliderData = new SliderData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (sliderData.uuid != null) {
                        break;
                    }
                    sliderData.uuid = "";
                    break;
                }
                if (iM162497u == 8) {
                    sliderData.supplier = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    sliderData.allowClose = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    sliderData.retryClose = nc5Var.m162486j();
                } else if (iM162497u == 32) {
                    sliderData.delayClose = nc5Var.m162486j();
                } else {
                    if (iM162497u != 42) {
                        if (sliderData.uuid != null) {
                            break;
                        }
                        sliderData.uuid = "";
                        return sliderData;
                    }
                    sliderData.uuid = nc5Var.m162495s();
                }
            }
            return sliderData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SliderData sliderData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, sliderData.supplier);
            codedOutputByteBufferNano.m17305G(2, sliderData.allowClose);
            codedOutputByteBufferNano.m17305G(3, sliderData.retryClose);
            codedOutputByteBufferNano.m17305G(4, sliderData.delayClose);
            String str = sliderData.uuid;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(5, str);
            }
        }
    };
    public static JsonAdapter<SliderData> JSON_ADAPTER = new ObjectJsonAdapter<SliderData>() { // from class: com.p1.mobile.putong.data.SliderData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SliderData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SliderData newInstance() {
            return new SliderData();
        }

        public boolean parseField(SliderData sliderData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "delayClose":
                    sliderData.delayClose = jsonParser.getValueAsInt();
                    return true;
                case "supplier":
                    sliderData.supplier = jsonParser.getValueAsInt();
                    return true;
                case "allowClose":
                    sliderData.allowClose = jsonParser.getValueAsInt();
                    return true;
                case "retryClose":
                    sliderData.retryClose = jsonParser.getValueAsInt();
                    return true;
                case "uuid":
                    sliderData.uuid = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SliderData sliderData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "delayClose":
                case "supplier":
                case "allowClose":
                case "retryClose":
                case "uuid":
                    return true;
                default:
                    return super.parseFieldCheck(sliderData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SliderData sliderData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("supplier", sliderData.supplier);
            jsonGenerator.writeNumberField("allowClose", sliderData.allowClose);
            jsonGenerator.writeNumberField("retryClose", sliderData.retryClose);
            jsonGenerator.writeNumberField("delayClose", sliderData.delayClose);
            String str = sliderData.uuid;
            if (str != null) {
                jsonGenerator.writeStringField("uuid", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SliderData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SliderData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SliderData new_() {
        SliderData sliderData = new SliderData();
        sliderData.nullCheck();
        return sliderData;
    }

    public static SliderData parse(String str, SliderData sliderData) {
        try {
            return JSON_ADAPTER.parse(str);
        } catch (IOException e) {
            e.printStackTrace();
            return sliderData;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SliderData mo225055clone() {
        SliderData sliderData = new SliderData();
        sliderData.supplier = this.supplier;
        sliderData.allowClose = this.allowClose;
        sliderData.retryClose = this.retryClose;
        sliderData.delayClose = this.delayClose;
        sliderData.uuid = this.uuid;
        return sliderData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SliderData)) {
            return false;
        }
        SliderData sliderData = (SliderData) obj;
        return this.supplier == sliderData.supplier && this.allowClose == sliderData.allowClose && this.retryClose == sliderData.retryClose && this.delayClose == sliderData.delayClose && ValueObject.util_equals(this.uuid, sliderData.uuid);
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
        int i2 = ((((((((i * 41) + this.supplier) * 41) + this.allowClose) * 41) + this.retryClose) * 41) + this.delayClose) * 41;
        String str = this.uuid;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.uuid == null) {
            this.uuid = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
