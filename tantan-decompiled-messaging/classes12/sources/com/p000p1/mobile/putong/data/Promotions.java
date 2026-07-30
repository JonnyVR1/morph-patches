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
public class Promotions extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "promotions";

    @NonNull
    @ProtobufIndex(index = 2)
    public String benefitType;

    @NonNull
    @ProtobufIndex(index = 1)
    public String couponName;

    @NonNull
    @ProtobufIndex(index = 4)
    public DiscountBenefitContract discountBenefit;

    @ProtobufIndex(index = 3)
    public double nextDeductTime;
    public static ProtobufAdapter<Promotions> PROTOBUF_ADAPTER = new MessageNanoAdapter<Promotions>() { // from class: com.p1.mobile.putong.data.Promotions.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Promotions promotions) {
            String str = promotions.couponName;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = promotions.benefitType;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iD = iO + CodedOutputByteBufferNano.d(3, promotions.nextDeductTime);
            DiscountBenefitContract discountBenefitContract = promotions.discountBenefit;
            if (discountBenefitContract != null) {
                iD += CodedOutputByteBufferNano.l(4, discountBenefitContract, DiscountBenefitContract.PROTOBUF_ADAPTER);
            }
            ((MessageNano) promotions).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Promotions m18856parse(nb5 nb5Var) throws IOException {
            Promotions promotions = new Promotions();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (promotions.couponName == null) {
                        promotions.couponName = "";
                    }
                    if (promotions.benefitType == null) {
                        promotions.benefitType = "";
                    }
                    if (promotions.discountBenefit != null) {
                        break;
                    }
                    promotions.discountBenefit = DiscountBenefitContract.new_();
                    break;
                }
                if (iU == 10) {
                    promotions.couponName = nb5Var.s();
                } else if (iU == 18) {
                    promotions.benefitType = nb5Var.s();
                } else if (iU == 25) {
                    promotions.nextDeductTime = nb5Var.h();
                } else {
                    if (iU != 34) {
                        if (promotions.couponName == null) {
                            promotions.couponName = "";
                        }
                        if (promotions.benefitType == null) {
                            promotions.benefitType = "";
                        }
                        if (promotions.discountBenefit != null) {
                            break;
                        }
                        promotions.discountBenefit = DiscountBenefitContract.new_();
                        return promotions;
                    }
                    promotions.discountBenefit = (DiscountBenefitContract) nb5Var.l(DiscountBenefitContract.PROTOBUF_ADAPTER);
                }
            }
            return promotions;
        }

        public void serialize(Promotions promotions, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = promotions.couponName;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = promotions.benefitType;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.C(3, promotions.nextDeductTime);
            DiscountBenefitContract discountBenefitContract = promotions.discountBenefit;
            if (discountBenefitContract != null) {
                codedOutputByteBufferNano.K(4, discountBenefitContract, DiscountBenefitContract.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Promotions> JSON_ADAPTER = new ObjectJsonAdapter<Promotions>() { // from class: com.p1.mobile.putong.data.Promotions.2
        public Class getDataClass() {
            return Promotions.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Promotions mo17830newInstance() {
            return new Promotions();
        }

        public boolean parseField(Promotions promotions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "benefitType":
                    promotions.benefitType = jsonParser.getValueAsString();
                    return true;
                case "nextDeductTime":
                    promotions.nextDeductTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "couponName":
                    promotions.couponName = jsonParser.getValueAsString();
                    return true;
                case "discountBenefit":
                    promotions.discountBenefit = (DiscountBenefitContract) DiscountBenefitContract.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Promotions promotions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "benefitType":
                case "nextDeductTime":
                case "couponName":
                case "discountBenefit":
                    return true;
                default:
                    return super.parseFieldCheck(promotions, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Promotions promotions, JsonGenerator jsonGenerator) throws IOException {
            String str = promotions.couponName;
            if (str != null) {
                jsonGenerator.writeStringField("couponName", str);
            }
            String str2 = promotions.benefitType;
            if (str2 != null) {
                jsonGenerator.writeStringField("benefitType", str2);
            }
            jsonGenerator.writeFieldName("nextDeductTime");
            Converter.API_TIME.serialize(Double.valueOf(promotions.nextDeductTime), jsonGenerator, true);
            if (promotions.discountBenefit != null) {
                jsonGenerator.writeFieldName("discountBenefit");
                DiscountBenefitContract.JSON_ADAPTER.serialize(promotions.discountBenefit, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Promotions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Promotions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Promotions new_() {
        Promotions promotions = new Promotions();
        promotions.nullCheck();
        return promotions;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Promotions m18855clone() {
        Promotions promotions = new Promotions();
        promotions.couponName = this.couponName;
        promotions.benefitType = this.benefitType;
        promotions.nextDeductTime = this.nextDeductTime;
        DiscountBenefitContract discountBenefitContract = this.discountBenefit;
        if (discountBenefitContract != null) {
            promotions.discountBenefit = discountBenefitContract.m17991clone();
        }
        return promotions;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Promotions)) {
            return false;
        }
        Promotions promotions = (Promotions) obj;
        return ValueObject.util_equals(this.couponName, promotions.couponName) && ValueObject.util_equals(this.benefitType, promotions.benefitType) && this.nextDeductTime == promotions.nextDeductTime && ValueObject.util_equals(this.discountBenefit, promotions.discountBenefit);
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
        String str = this.couponName;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.benefitType;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.nextDeductTime);
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        DiscountBenefitContract discountBenefitContract = this.discountBenefit;
        int iHashCode3 = i3 + (discountBenefitContract != null ? discountBenefitContract.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.couponName == null) {
            this.couponName = "";
        }
        if (this.benefitType == null) {
            this.benefitType = "";
        }
        if (this.discountBenefit == null) {
            this.discountBenefit = DiscountBenefitContract.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
