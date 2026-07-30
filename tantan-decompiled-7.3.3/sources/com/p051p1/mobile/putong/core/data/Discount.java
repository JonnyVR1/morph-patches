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
public class Discount extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "discount";

    @NonNull
    @ProtobufIndex(index = 1)
    public String discountType;

    @ProtobufIndex(index = 2)
    public int value;
    public static ProtobufAdapter<Discount> PROTOBUF_ADAPTER = new MessageNanoAdapter<Discount>() { // from class: com.p1.mobile.putong.core.data.Discount.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Discount discount) {
            String str = discount.discountType;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17281h(2, discount.value);
            discount.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Discount parse(nc5 nc5Var) throws IOException {
            Discount discount = new Discount();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (discount.discountType != null) {
                        break;
                    }
                    discount.discountType = "";
                    break;
                }
                if (iM162497u == 10) {
                    discount.discountType = nc5Var.m162495s();
                } else {
                    if (iM162497u != 16) {
                        if (discount.discountType != null) {
                            break;
                        }
                        discount.discountType = "";
                        return discount;
                    }
                    discount.value = nc5Var.m162486j();
                }
            }
            return discount;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Discount discount, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = discount.discountType;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17305G(2, discount.value);
        }
    };
    public static JsonAdapter<Discount> JSON_ADAPTER = new ObjectJsonAdapter<Discount>() { // from class: com.p1.mobile.putong.core.data.Discount.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Discount.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Discount newInstance() {
            return new Discount();
        }

        public boolean parseField(Discount discount, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("value")) {
                discount.value = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("discountType")) {
                return false;
            }
            discount.discountType = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(Discount discount, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("value") || str.equals("discountType")) {
                return true;
            }
            return super.parseFieldCheck(discount, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Discount discount, JsonGenerator jsonGenerator) throws IOException {
            String str = discount.discountType;
            if (str != null) {
                jsonGenerator.writeStringField("discountType", str);
            }
            jsonGenerator.writeNumberField("value", discount.value);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Discount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Discount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Discount new_() {
        Discount discount = new Discount();
        discount.nullCheck();
        return discount;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Discount mo225055clone() {
        Discount discount = new Discount();
        discount.discountType = this.discountType;
        discount.value = this.value;
        return discount;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Discount)) {
            return false;
        }
        Discount discount = (Discount) obj;
        return ValueObject.util_equals(this.discountType, discount.discountType) && this.value == discount.value;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "discount";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.discountType;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.value;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.discountType == null) {
            this.discountType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
