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
public class TrialBenefit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "trialbenefit";

    @NonNull
    @ProtobufIndex(index = 4)
    public Discount afterTrialDiscount;

    @NonNull
    @ProtobufIndex(index = 2)
    public Discount discount;

    @ProtobufIndex(index = 1)
    public long trialDuration;

    @ProtobufIndex(index = 3)
    public int trialReplaceItemID;
    public static ProtobufAdapter<TrialBenefit> PROTOBUF_ADAPTER = new MessageNanoAdapter<TrialBenefit>() { // from class: com.p1.mobile.putong.core.data.TrialBenefit.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TrialBenefit trialBenefit) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, trialBenefit.trialDuration);
            Discount discount = trialBenefit.discount;
            if (discount != null) {
                iM17283j += CodedOutputByteBufferNano.m17285l(2, discount, Discount.PROTOBUF_ADAPTER);
            }
            int iM17281h = iM17283j + CodedOutputByteBufferNano.m17281h(3, trialBenefit.trialReplaceItemID);
            Discount discount2 = trialBenefit.afterTrialDiscount;
            if (discount2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(4, discount2, Discount.PROTOBUF_ADAPTER);
            }
            trialBenefit.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TrialBenefit parse(nc5 nc5Var) throws IOException {
            TrialBenefit trialBenefit = new TrialBenefit();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (trialBenefit.discount == null) {
                        trialBenefit.discount = Discount.new_();
                    }
                    if (trialBenefit.afterTrialDiscount != null) {
                        break;
                    }
                    trialBenefit.afterTrialDiscount = Discount.new_();
                    break;
                }
                if (iM162497u == 8) {
                    trialBenefit.trialDuration = nc5Var.m162487k();
                } else if (iM162497u == 18) {
                    trialBenefit.discount = (Discount) nc5Var.m162488l(Discount.PROTOBUF_ADAPTER);
                } else if (iM162497u == 24) {
                    trialBenefit.trialReplaceItemID = nc5Var.m162486j();
                } else {
                    if (iM162497u != 34) {
                        if (trialBenefit.discount == null) {
                            trialBenefit.discount = Discount.new_();
                        }
                        if (trialBenefit.afterTrialDiscount != null) {
                            break;
                        }
                        trialBenefit.afterTrialDiscount = Discount.new_();
                        return trialBenefit;
                    }
                    trialBenefit.afterTrialDiscount = (Discount) nc5Var.m162488l(Discount.PROTOBUF_ADAPTER);
                }
            }
            return trialBenefit;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TrialBenefit trialBenefit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, trialBenefit.trialDuration);
            Discount discount = trialBenefit.discount;
            if (discount != null) {
                codedOutputByteBufferNano.m17309K(2, discount, Discount.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17305G(3, trialBenefit.trialReplaceItemID);
            Discount discount2 = trialBenefit.afterTrialDiscount;
            if (discount2 != null) {
                codedOutputByteBufferNano.m17309K(4, discount2, Discount.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TrialBenefit> JSON_ADAPTER = new ObjectJsonAdapter<TrialBenefit>() { // from class: com.p1.mobile.putong.core.data.TrialBenefit.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TrialBenefit.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TrialBenefit newInstance() {
            return new TrialBenefit();
        }

        public boolean parseField(TrialBenefit trialBenefit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "afterTrialDiscount":
                    trialBenefit.afterTrialDiscount = Discount.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "discount":
                    trialBenefit.discount = Discount.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "trialReplaceItemID":
                    trialBenefit.trialReplaceItemID = jsonParser.getValueAsInt();
                    return true;
                case "trialDuration":
                    trialBenefit.trialDuration = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TrialBenefit trialBenefit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "afterTrialDiscount":
                case "discount":
                case "trialReplaceItemID":
                case "trialDuration":
                    return true;
                default:
                    return super.parseFieldCheck(trialBenefit, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TrialBenefit trialBenefit, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("trialDuration", trialBenefit.trialDuration);
            if (trialBenefit.discount != null) {
                jsonGenerator.writeFieldName("discount");
                Discount.JSON_ADAPTER.serialize(trialBenefit.discount, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("trialReplaceItemID", trialBenefit.trialReplaceItemID);
            if (trialBenefit.afterTrialDiscount != null) {
                jsonGenerator.writeFieldName("afterTrialDiscount");
                Discount.JSON_ADAPTER.serialize(trialBenefit.afterTrialDiscount, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TrialBenefit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TrialBenefit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TrialBenefit new_() {
        TrialBenefit trialBenefit = new TrialBenefit();
        trialBenefit.nullCheck();
        return trialBenefit;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TrialBenefit mo225055clone() {
        TrialBenefit trialBenefit = new TrialBenefit();
        trialBenefit.trialDuration = this.trialDuration;
        Discount discount = this.discount;
        if (discount != null) {
            trialBenefit.discount = discount.mo225055clone();
        }
        trialBenefit.trialReplaceItemID = this.trialReplaceItemID;
        Discount discount2 = this.afterTrialDiscount;
        if (discount2 != null) {
            trialBenefit.afterTrialDiscount = discount2.mo225055clone();
        }
        return trialBenefit;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TrialBenefit)) {
            return false;
        }
        TrialBenefit trialBenefit = (TrialBenefit) obj;
        return this.trialDuration == trialBenefit.trialDuration && ValueObject.util_equals(this.discount, trialBenefit.discount) && this.trialReplaceItemID == trialBenefit.trialReplaceItemID && ValueObject.util_equals(this.afterTrialDiscount, trialBenefit.afterTrialDiscount);
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
        long j = this.trialDuration;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        Discount discount = this.discount;
        int iHashCode = (((i2 + (discount != null ? discount.hashCode() : 0)) * 41) + this.trialReplaceItemID) * 41;
        Discount discount2 = this.afterTrialDiscount;
        int iHashCode2 = iHashCode + (discount2 != null ? discount2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.discount == null) {
            this.discount = Discount.new_();
        }
        if (this.afterTrialDiscount == null) {
            this.afterTrialDiscount = Discount.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
