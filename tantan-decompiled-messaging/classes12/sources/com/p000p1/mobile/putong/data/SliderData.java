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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SliderData sliderData) {
            int iH = CodedOutputByteBufferNano.h(1, sliderData.supplier) + CodedOutputByteBufferNano.h(2, sliderData.allowClose) + CodedOutputByteBufferNano.h(3, sliderData.retryClose) + CodedOutputByteBufferNano.h(4, sliderData.delayClose);
            String str = sliderData.uuid;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(5, str);
            }
            ((MessageNano) sliderData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SliderData m18986parse(nb5 nb5Var) throws IOException {
            SliderData sliderData = new SliderData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (sliderData.uuid != null) {
                        break;
                    }
                    sliderData.uuid = "";
                    break;
                }
                if (iU == 8) {
                    sliderData.supplier = nb5Var.j();
                } else if (iU == 16) {
                    sliderData.allowClose = nb5Var.j();
                } else if (iU == 24) {
                    sliderData.retryClose = nb5Var.j();
                } else if (iU == 32) {
                    sliderData.delayClose = nb5Var.j();
                } else {
                    if (iU != 42) {
                        if (sliderData.uuid != null) {
                            break;
                        }
                        sliderData.uuid = "";
                        return sliderData;
                    }
                    sliderData.uuid = nb5Var.s();
                }
            }
            return sliderData;
        }

        public void serialize(SliderData sliderData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, sliderData.supplier);
            codedOutputByteBufferNano.G(2, sliderData.allowClose);
            codedOutputByteBufferNano.G(3, sliderData.retryClose);
            codedOutputByteBufferNano.G(4, sliderData.delayClose);
            String str = sliderData.uuid;
            if (str != null) {
                codedOutputByteBufferNano.R(5, str);
            }
        }
    };
    public static JsonAdapter<SliderData> JSON_ADAPTER = new ObjectJsonAdapter<SliderData>() { // from class: com.p1.mobile.putong.data.SliderData.2
        public Class getDataClass() {
            return SliderData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public SliderData mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SliderData sliderData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("supplier", sliderData.supplier);
            jsonGenerator.writeNumberField("allowClose", sliderData.allowClose);
            jsonGenerator.writeNumberField("retryClose", sliderData.retryClose);
            jsonGenerator.writeNumberField("delayClose", sliderData.delayClose);
            String str = sliderData.uuid;
            if (str != null) {
                jsonGenerator.writeStringField(Device.UUID, str);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SliderData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
            return (SliderData) JSON_ADAPTER.parse(str);
        } catch (IOException e) {
            e.printStackTrace();
            return sliderData;
        }
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SliderData m18985clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((((((i * 41) + this.supplier) * 41) + this.allowClose) * 41) + this.retryClose) * 41) + this.delayClose) * 41;
        String str = this.uuid;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.uuid == null) {
            this.uuid = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
