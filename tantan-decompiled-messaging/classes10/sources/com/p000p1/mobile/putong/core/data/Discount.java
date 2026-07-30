package com.p000p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class Discount extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "discount";

    @NonNull
    @ProtobufIndex(index = 1)
    public String discountType;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int value;
    public static ProtobufAdapter<Discount> PROTOBUF_ADAPTER = new MessageNanoAdapter<Discount>() { // from class: com.p1.mobile.putong.core.data.Discount.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Discount discount) {
            String str = discount.discountType;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, discount.value);
            ((MessageNano) discount).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Discount m12617parse(nb5 nb5Var) throws IOException {
            Discount discount = new Discount();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (discount.discountType != null) {
                        break;
                    }
                    discount.discountType = "";
                    break;
                }
                if (iU == 10) {
                    discount.discountType = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (discount.discountType != null) {
                            break;
                        }
                        discount.discountType = "";
                        return discount;
                    }
                    discount.value = nb5Var.j();
                }
            }
            return discount;
        }

        public void serialize(Discount discount, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = discount.discountType;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, discount.value);
        }
    };
    public static JsonAdapter<Discount> JSON_ADAPTER = new ObjectJsonAdapter<Discount>() { // from class: com.p1.mobile.putong.core.data.Discount.2
        public Class getDataClass() {
            return Discount.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Discount m12618newInstance() {
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

        public void serializeFields(Discount discount, JsonGenerator jsonGenerator) throws IOException {
            String str = discount.discountType;
            if (str != null) {
                jsonGenerator.writeStringField("discountType", str);
            }
            jsonGenerator.writeNumberField("value", discount.value);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Discount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Discount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Discount new_() {
        Discount discount = new Discount();
        discount.nullCheck();
        return discount;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Discount m12616clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.discountType;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.value;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.discountType == null) {
            this.discountType = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
