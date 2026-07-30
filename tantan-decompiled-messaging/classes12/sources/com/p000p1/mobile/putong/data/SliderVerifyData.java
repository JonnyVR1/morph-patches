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
public class SliderVerifyData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "sliderverifydata";

    @ProtobufIndex(index = 3)
    public int supplier;

    @NonNull
    @ProtobufIndex(index = 2)
    public String token;

    @NonNull
    @ProtobufIndex(index = 1)
    public String uuid;

    @NonNull
    @ProtobufIndex(index = 5)
    public String validate;

    @NonNull
    @ProtobufIndex(index = 4)
    public String verifyResult;
    public static ProtobufAdapter<SliderVerifyData> PROTOBUF_ADAPTER = new MessageNanoAdapter<SliderVerifyData>() { // from class: com.p1.mobile.putong.data.SliderVerifyData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SliderVerifyData sliderVerifyData) {
            String str = sliderVerifyData.uuid;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = sliderVerifyData.token;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iH = iO + CodedOutputByteBufferNano.h(3, sliderVerifyData.supplier);
            String str3 = sliderVerifyData.verifyResult;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(4, str3);
            }
            String str4 = sliderVerifyData.validate;
            if (str4 != null) {
                iH += CodedOutputByteBufferNano.o(5, str4);
            }
            ((MessageNano) sliderVerifyData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SliderVerifyData m18992parse(nb5 nb5Var) throws IOException {
            SliderVerifyData sliderVerifyData = new SliderVerifyData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (sliderVerifyData.uuid == null) {
                        sliderVerifyData.uuid = "";
                    }
                    if (sliderVerifyData.token == null) {
                        sliderVerifyData.token = "";
                    }
                    if (sliderVerifyData.verifyResult == null) {
                        sliderVerifyData.verifyResult = "";
                    }
                    if (sliderVerifyData.validate != null) {
                        break;
                    }
                    sliderVerifyData.validate = "";
                    break;
                }
                if (iU == 10) {
                    sliderVerifyData.uuid = nb5Var.s();
                } else if (iU == 18) {
                    sliderVerifyData.token = nb5Var.s();
                } else if (iU == 24) {
                    sliderVerifyData.supplier = nb5Var.j();
                } else if (iU == 34) {
                    sliderVerifyData.verifyResult = nb5Var.s();
                } else {
                    if (iU != 42) {
                        if (sliderVerifyData.uuid == null) {
                            sliderVerifyData.uuid = "";
                        }
                        if (sliderVerifyData.token == null) {
                            sliderVerifyData.token = "";
                        }
                        if (sliderVerifyData.verifyResult == null) {
                            sliderVerifyData.verifyResult = "";
                        }
                        if (sliderVerifyData.validate != null) {
                            break;
                        }
                        sliderVerifyData.validate = "";
                        return sliderVerifyData;
                    }
                    sliderVerifyData.validate = nb5Var.s();
                }
            }
            return sliderVerifyData;
        }

        public void serialize(SliderVerifyData sliderVerifyData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = sliderVerifyData.uuid;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = sliderVerifyData.token;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.G(3, sliderVerifyData.supplier);
            String str3 = sliderVerifyData.verifyResult;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            String str4 = sliderVerifyData.validate;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
        }
    };
    public static JsonAdapter<SliderVerifyData> JSON_ADAPTER = new ObjectJsonAdapter<SliderVerifyData>() { // from class: com.p1.mobile.putong.data.SliderVerifyData.2
        public Class getDataClass() {
            return SliderVerifyData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public SliderVerifyData mo17830newInstance() {
            return new SliderVerifyData();
        }

        public boolean parseField(SliderVerifyData sliderVerifyData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "supplier":
                    sliderVerifyData.supplier = jsonParser.getValueAsInt();
                    return true;
                case "validate":
                    sliderVerifyData.validate = jsonParser.getValueAsString();
                    return true;
                case "verifyResult":
                    sliderVerifyData.verifyResult = jsonParser.getValueAsString();
                    return true;
                case "uuid":
                    sliderVerifyData.uuid = jsonParser.getValueAsString();
                    return true;
                case "token":
                    sliderVerifyData.token = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SliderVerifyData sliderVerifyData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "supplier":
                case "validate":
                case "verifyResult":
                case "uuid":
                case "token":
                    return true;
                default:
                    return super.parseFieldCheck(sliderVerifyData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SliderVerifyData sliderVerifyData, JsonGenerator jsonGenerator) throws IOException {
            String str = sliderVerifyData.uuid;
            if (str != null) {
                jsonGenerator.writeStringField(Device.UUID, str);
            }
            String str2 = sliderVerifyData.token;
            if (str2 != null) {
                jsonGenerator.writeStringField(Token.TYPE, str2);
            }
            jsonGenerator.writeNumberField("supplier", sliderVerifyData.supplier);
            String str3 = sliderVerifyData.verifyResult;
            if (str3 != null) {
                jsonGenerator.writeStringField("verifyResult", str3);
            }
            String str4 = sliderVerifyData.validate;
            if (str4 != null) {
                jsonGenerator.writeStringField("validate", str4);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SliderVerifyData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SliderVerifyData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SliderVerifyData new_() {
        SliderVerifyData sliderVerifyData = new SliderVerifyData();
        sliderVerifyData.nullCheck();
        return sliderVerifyData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SliderVerifyData m18991clone() {
        SliderVerifyData sliderVerifyData = new SliderVerifyData();
        sliderVerifyData.uuid = this.uuid;
        sliderVerifyData.token = this.token;
        sliderVerifyData.supplier = this.supplier;
        sliderVerifyData.verifyResult = this.verifyResult;
        sliderVerifyData.validate = this.validate;
        return sliderVerifyData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SliderVerifyData)) {
            return false;
        }
        SliderVerifyData sliderVerifyData = (SliderVerifyData) obj;
        return ValueObject.util_equals(this.uuid, sliderVerifyData.uuid) && ValueObject.util_equals(this.token, sliderVerifyData.token) && this.supplier == sliderVerifyData.supplier && ValueObject.util_equals(this.verifyResult, sliderVerifyData.verifyResult) && ValueObject.util_equals(this.validate, sliderVerifyData.validate);
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
        String str = this.uuid;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.token;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.supplier) * 41;
        String str3 = this.verifyResult;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.validate;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.uuid == null) {
            this.uuid = "";
        }
        if (this.token == null) {
            this.token = "";
        }
        if (this.verifyResult == null) {
            this.verifyResult = "";
        }
        if (this.validate == null) {
            this.validate = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
