package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class DiscountBenefit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "discountbenefit";

    @NonNull
    @ProtobufIndex(index = 1)
    public String discountType;

    @ProtobufIndex(index = 5)
    public boolean hasPrivilegesChange;

    @NonNull
    @ProtobufIndex(index = 4)
    public PrivilegesChange privilegesChange;

    @NonNull
    @ProtobufIndex(index = 3)
    public String showDiscount;

    @ProtobufIndex(index = 2)
    public int value;
    public static ProtobufAdapter<DiscountBenefit> PROTOBUF_ADAPTER = new MessageNanoAdapter<DiscountBenefit>() { // from class: com.p1.mobile.putong.core.data.DiscountBenefit.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DiscountBenefit discountBenefit) {
            String str = discountBenefit.discountType;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17281h(2, discountBenefit.value);
            String str2 = discountBenefit.showDiscount;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            PrivilegesChange privilegesChange = discountBenefit.privilegesChange;
            if (privilegesChange != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, privilegesChange, PrivilegesChange.PROTOBUF_ADAPTER);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(5, discountBenefit.hasPrivilegesChange);
            discountBenefit.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DiscountBenefit parse(nc5 nc5Var) throws IOException {
            DiscountBenefit discountBenefit = new DiscountBenefit();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (discountBenefit.discountType == null) {
                        discountBenefit.discountType = "";
                    }
                    if (discountBenefit.showDiscount == null) {
                        discountBenefit.showDiscount = "";
                    }
                    if (discountBenefit.privilegesChange != null) {
                        break;
                    }
                    discountBenefit.privilegesChange = PrivilegesChange.new_();
                    break;
                }
                if (iM162497u == 10) {
                    discountBenefit.discountType = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    discountBenefit.value = nc5Var.m162486j();
                } else if (iM162497u == 26) {
                    discountBenefit.showDiscount = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    discountBenefit.privilegesChange = (PrivilegesChange) nc5Var.m162488l(PrivilegesChange.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 40) {
                        if (discountBenefit.discountType == null) {
                            discountBenefit.discountType = "";
                        }
                        if (discountBenefit.showDiscount == null) {
                            discountBenefit.showDiscount = "";
                        }
                        if (discountBenefit.privilegesChange != null) {
                            break;
                        }
                        discountBenefit.privilegesChange = PrivilegesChange.new_();
                        return discountBenefit;
                    }
                    discountBenefit.hasPrivilegesChange = nc5Var.m162483g();
                }
            }
            return discountBenefit;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DiscountBenefit discountBenefit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = discountBenefit.discountType;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17305G(2, discountBenefit.value);
            String str2 = discountBenefit.showDiscount;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            PrivilegesChange privilegesChange = discountBenefit.privilegesChange;
            if (privilegesChange != null) {
                codedOutputByteBufferNano.m17309K(4, privilegesChange, PrivilegesChange.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(5, discountBenefit.hasPrivilegesChange);
        }
    };
    public static JsonAdapter<DiscountBenefit> JSON_ADAPTER = new ObjectJsonAdapter<DiscountBenefit>() { // from class: com.p1.mobile.putong.core.data.DiscountBenefit.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DiscountBenefit.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public DiscountBenefit newInstance() {
            return new DiscountBenefit();
        }

        public boolean parseField(DiscountBenefit discountBenefit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "privilegesChange":
                    discountBenefit.privilegesChange = PrivilegesChange.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "hasPrivilegesChange":
                    discountBenefit.hasPrivilegesChange = jsonParser.getValueAsBoolean();
                    return true;
                case "showDiscount":
                    discountBenefit.showDiscount = jsonParser.getValueAsString();
                    return true;
                case "value":
                    discountBenefit.value = jsonParser.getValueAsInt();
                    return true;
                case "discountType":
                    discountBenefit.discountType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(DiscountBenefit discountBenefit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "privilegesChange":
                case "hasPrivilegesChange":
                case "showDiscount":
                case "value":
                case "discountType":
                    return true;
                default:
                    return super.parseFieldCheck(discountBenefit, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DiscountBenefit discountBenefit, JsonGenerator jsonGenerator) throws IOException {
            String str = discountBenefit.discountType;
            if (str != null) {
                jsonGenerator.writeStringField("discountType", str);
            }
            jsonGenerator.writeNumberField("value", discountBenefit.value);
            String str2 = discountBenefit.showDiscount;
            if (str2 != null) {
                jsonGenerator.writeStringField("showDiscount", str2);
            }
            if (discountBenefit.privilegesChange != null) {
                jsonGenerator.writeFieldName("privilegesChange");
                PrivilegesChange.JSON_ADAPTER.serialize(discountBenefit.privilegesChange, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("hasPrivilegesChange", discountBenefit.hasPrivilegesChange);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DiscountBenefit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DiscountBenefit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DiscountBenefit new_() {
        DiscountBenefit discountBenefit = new DiscountBenefit();
        discountBenefit.nullCheck();
        return discountBenefit;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DiscountBenefit mo225055clone() {
        DiscountBenefit discountBenefit = new DiscountBenefit();
        discountBenefit.discountType = this.discountType;
        discountBenefit.value = this.value;
        discountBenefit.showDiscount = this.showDiscount;
        PrivilegesChange privilegesChange = this.privilegesChange;
        if (privilegesChange != null) {
            discountBenefit.privilegesChange = privilegesChange.mo225055clone();
        }
        discountBenefit.hasPrivilegesChange = this.hasPrivilegesChange;
        return discountBenefit;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DiscountBenefit)) {
            return false;
        }
        DiscountBenefit discountBenefit = (DiscountBenefit) obj;
        return ValueObject.util_equals(this.discountType, discountBenefit.discountType) && this.value == discountBenefit.value && ValueObject.util_equals(this.showDiscount, discountBenefit.showDiscount) && ValueObject.util_equals(this.privilegesChange, discountBenefit.privilegesChange) && this.hasPrivilegesChange == discountBenefit.hasPrivilegesChange;
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
        String str = this.discountType;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.value) * 41;
        String str2 = this.showDiscount;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        PrivilegesChange privilegesChange = this.privilegesChange;
        int iHashCode3 = ((iHashCode2 + (privilegesChange != null ? privilegesChange.hashCode() : 0)) * 41) + (this.hasPrivilegesChange ? 1231 : 1237);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.discountType == null) {
            this.discountType = "";
        }
        if (this.showDiscount == null) {
            this.showDiscount = "";
        }
        if (this.privilegesChange == null) {
            this.privilegesChange = PrivilegesChange.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
