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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SliderVerifyData sliderVerifyData) {
            String str = sliderVerifyData.uuid;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = sliderVerifyData.token;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(3, sliderVerifyData.supplier);
            String str3 = sliderVerifyData.verifyResult;
            if (str3 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            String str4 = sliderVerifyData.validate;
            if (str4 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(5, str4);
            }
            sliderVerifyData.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SliderVerifyData parse(nc5 nc5Var) throws IOException {
            SliderVerifyData sliderVerifyData = new SliderVerifyData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 10) {
                    sliderVerifyData.uuid = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    sliderVerifyData.token = nc5Var.m162495s();
                } else if (iM162497u == 24) {
                    sliderVerifyData.supplier = nc5Var.m162486j();
                } else if (iM162497u == 34) {
                    sliderVerifyData.verifyResult = nc5Var.m162495s();
                } else {
                    if (iM162497u != 42) {
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
                    sliderVerifyData.validate = nc5Var.m162495s();
                }
            }
            return sliderVerifyData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SliderVerifyData sliderVerifyData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = sliderVerifyData.uuid;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = sliderVerifyData.token;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17305G(3, sliderVerifyData.supplier);
            String str3 = sliderVerifyData.verifyResult;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            String str4 = sliderVerifyData.validate;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(5, str4);
            }
        }
    };
    public static JsonAdapter<SliderVerifyData> JSON_ADAPTER = new ObjectJsonAdapter<SliderVerifyData>() { // from class: com.p1.mobile.putong.data.SliderVerifyData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SliderVerifyData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SliderVerifyData newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SliderVerifyData sliderVerifyData, JsonGenerator jsonGenerator) throws IOException {
            String str = sliderVerifyData.uuid;
            if (str != null) {
                jsonGenerator.writeStringField("uuid", str);
            }
            String str2 = sliderVerifyData.token;
            if (str2 != null) {
                jsonGenerator.writeStringField("token", str2);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SliderVerifyData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SliderVerifyData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SliderVerifyData new_() {
        SliderVerifyData sliderVerifyData = new SliderVerifyData();
        sliderVerifyData.nullCheck();
        return sliderVerifyData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SliderVerifyData mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
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
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
