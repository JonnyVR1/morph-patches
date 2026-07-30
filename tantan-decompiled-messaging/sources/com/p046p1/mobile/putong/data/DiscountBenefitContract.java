package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class DiscountBenefitContract extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "discountbenefitcontract";

    @NonNull
    @ProtobufIndex(index = 1)
    public String discountType;

    @ProtobufIndex(index = 5)
    public boolean hasPrivilegesChange;

    @NonNull
    @ProtobufIndex(index = 4)
    public PrivilegesChangeContract privilegesChange;

    @NonNull
    @ProtobufIndex(index = 3)
    public String showDiscount;

    @ProtobufIndex(index = 2)
    public int value;
    public static ProtobufAdapter<DiscountBenefitContract> PROTOBUF_ADAPTER = new MessageNanoAdapter<DiscountBenefitContract>() { // from class: com.p1.mobile.putong.data.DiscountBenefitContract.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DiscountBenefitContract discountBenefitContract) {
            String str = discountBenefitContract.discountType;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, discountBenefitContract.value);
            String str2 = discountBenefitContract.showDiscount;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            PrivilegesChangeContract privilegesChangeContract = discountBenefitContract.privilegesChange;
            if (privilegesChangeContract != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, privilegesChangeContract, PrivilegesChangeContract.PROTOBUF_ADAPTER);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(5, discountBenefitContract.hasPrivilegesChange);
            discountBenefitContract.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DiscountBenefitContract parse(nb5 nb5Var) throws IOException {
            DiscountBenefitContract discountBenefitContract = new DiscountBenefitContract();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (discountBenefitContract.discountType == null) {
                        discountBenefitContract.discountType = "";
                    }
                    if (discountBenefitContract.showDiscount == null) {
                        discountBenefitContract.showDiscount = "";
                    }
                    if (discountBenefitContract.privilegesChange != null) {
                        break;
                    }
                    discountBenefitContract.privilegesChange = PrivilegesChangeContract.new_();
                    break;
                }
                if (iM158752u == 10) {
                    discountBenefitContract.discountType = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    discountBenefitContract.value = nb5Var.m158741j();
                } else if (iM158752u == 26) {
                    discountBenefitContract.showDiscount = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    discountBenefitContract.privilegesChange = (PrivilegesChangeContract) nb5Var.m158743l(PrivilegesChangeContract.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 40) {
                        if (discountBenefitContract.discountType == null) {
                            discountBenefitContract.discountType = "";
                        }
                        if (discountBenefitContract.showDiscount == null) {
                            discountBenefitContract.showDiscount = "";
                        }
                        if (discountBenefitContract.privilegesChange != null) {
                            break;
                        }
                        discountBenefitContract.privilegesChange = PrivilegesChangeContract.new_();
                        return discountBenefitContract;
                    }
                    discountBenefitContract.hasPrivilegesChange = nb5Var.m158738g();
                }
            }
            return discountBenefitContract;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DiscountBenefitContract discountBenefitContract, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = discountBenefitContract.discountType;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, discountBenefitContract.value);
            String str2 = discountBenefitContract.showDiscount;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            PrivilegesChangeContract privilegesChangeContract = discountBenefitContract.privilegesChange;
            if (privilegesChangeContract != null) {
                codedOutputByteBufferNano.m17254K(4, privilegesChangeContract, PrivilegesChangeContract.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(5, discountBenefitContract.hasPrivilegesChange);
        }
    };
    public static JsonAdapter<DiscountBenefitContract> JSON_ADAPTER = new ObjectJsonAdapter<DiscountBenefitContract>() { // from class: com.p1.mobile.putong.data.DiscountBenefitContract.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DiscountBenefitContract.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public DiscountBenefitContract newInstance() {
            return new DiscountBenefitContract();
        }

        public boolean parseField(DiscountBenefitContract discountBenefitContract, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "privilegesChange":
                    discountBenefitContract.privilegesChange = PrivilegesChangeContract.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "hasPrivilegesChange":
                    discountBenefitContract.hasPrivilegesChange = jsonParser.getValueAsBoolean();
                    return true;
                case "showDiscount":
                    discountBenefitContract.showDiscount = jsonParser.getValueAsString();
                    return true;
                case "value":
                    discountBenefitContract.value = jsonParser.getValueAsInt();
                    return true;
                case "discountType":
                    discountBenefitContract.discountType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(DiscountBenefitContract discountBenefitContract, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "privilegesChange":
                case "hasPrivilegesChange":
                case "showDiscount":
                case "value":
                case "discountType":
                    return true;
                default:
                    return super.parseFieldCheck(discountBenefitContract, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DiscountBenefitContract discountBenefitContract, JsonGenerator jsonGenerator) throws IOException {
            String str = discountBenefitContract.discountType;
            if (str != null) {
                jsonGenerator.writeStringField("discountType", str);
            }
            jsonGenerator.writeNumberField("value", discountBenefitContract.value);
            String str2 = discountBenefitContract.showDiscount;
            if (str2 != null) {
                jsonGenerator.writeStringField("showDiscount", str2);
            }
            if (discountBenefitContract.privilegesChange != null) {
                jsonGenerator.writeFieldName("privilegesChange");
                PrivilegesChangeContract.JSON_ADAPTER.serialize(discountBenefitContract.privilegesChange, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("hasPrivilegesChange", discountBenefitContract.hasPrivilegesChange);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DiscountBenefitContract) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DiscountBenefitContract) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DiscountBenefitContract new_() {
        DiscountBenefitContract discountBenefitContract = new DiscountBenefitContract();
        discountBenefitContract.nullCheck();
        return discountBenefitContract;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DiscountBenefitContract mo223809clone() {
        DiscountBenefitContract discountBenefitContract = new DiscountBenefitContract();
        discountBenefitContract.discountType = this.discountType;
        discountBenefitContract.value = this.value;
        discountBenefitContract.showDiscount = this.showDiscount;
        PrivilegesChangeContract privilegesChangeContract = this.privilegesChange;
        if (privilegesChangeContract != null) {
            discountBenefitContract.privilegesChange = privilegesChangeContract.mo223809clone();
        }
        discountBenefitContract.hasPrivilegesChange = this.hasPrivilegesChange;
        return discountBenefitContract;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DiscountBenefitContract)) {
            return false;
        }
        DiscountBenefitContract discountBenefitContract = (DiscountBenefitContract) obj;
        return ValueObject.util_equals(this.discountType, discountBenefitContract.discountType) && this.value == discountBenefitContract.value && ValueObject.util_equals(this.showDiscount, discountBenefitContract.showDiscount) && ValueObject.util_equals(this.privilegesChange, discountBenefitContract.privilegesChange) && this.hasPrivilegesChange == discountBenefitContract.hasPrivilegesChange;
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
        PrivilegesChangeContract privilegesChangeContract = this.privilegesChange;
        int iHashCode3 = ((iHashCode2 + (privilegesChangeContract != null ? privilegesChangeContract.hashCode() : 0)) * 41) + (this.hasPrivilegesChange ? 1231 : 1237);
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
            this.privilegesChange = PrivilegesChangeContract.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
