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
public class TrialBenefit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "trialbenefit";

    @NonNull
    @ProtobufIndex(index = 4)
    public Discount afterTrialDiscount;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public Discount discount;

    @ProtobufIndex(index = 1)
    public long trialDuration;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int trialReplaceItemID;
    public static ProtobufAdapter<TrialBenefit> PROTOBUF_ADAPTER = new MessageNanoAdapter<TrialBenefit>() { // from class: com.p1.mobile.putong.core.data.TrialBenefit.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TrialBenefit trialBenefit) {
            int iJ = CodedOutputByteBufferNano.j(1, trialBenefit.trialDuration);
            Discount discount = trialBenefit.discount;
            if (discount != null) {
                iJ += CodedOutputByteBufferNano.l(2, discount, Discount.PROTOBUF_ADAPTER);
            }
            int iH = iJ + CodedOutputByteBufferNano.h(3, trialBenefit.trialReplaceItemID);
            Discount discount2 = trialBenefit.afterTrialDiscount;
            if (discount2 != null) {
                iH += CodedOutputByteBufferNano.l(4, discount2, Discount.PROTOBUF_ADAPTER);
            }
            ((MessageNano) trialBenefit).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TrialBenefit m16028parse(nb5 nb5Var) throws IOException {
            TrialBenefit trialBenefit = new TrialBenefit();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (trialBenefit.discount == null) {
                        trialBenefit.discount = Discount.new_();
                    }
                    if (trialBenefit.afterTrialDiscount != null) {
                        break;
                    }
                    trialBenefit.afterTrialDiscount = Discount.new_();
                    break;
                }
                if (iU == 8) {
                    trialBenefit.trialDuration = nb5Var.k();
                } else if (iU == 18) {
                    trialBenefit.discount = (Discount) nb5Var.l(Discount.PROTOBUF_ADAPTER);
                } else if (iU == 24) {
                    trialBenefit.trialReplaceItemID = nb5Var.j();
                } else {
                    if (iU != 34) {
                        if (trialBenefit.discount == null) {
                            trialBenefit.discount = Discount.new_();
                        }
                        if (trialBenefit.afterTrialDiscount != null) {
                            break;
                        }
                        trialBenefit.afterTrialDiscount = Discount.new_();
                        return trialBenefit;
                    }
                    trialBenefit.afterTrialDiscount = (Discount) nb5Var.l(Discount.PROTOBUF_ADAPTER);
                }
            }
            return trialBenefit;
        }

        public void serialize(TrialBenefit trialBenefit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, trialBenefit.trialDuration);
            Discount discount = trialBenefit.discount;
            if (discount != null) {
                codedOutputByteBufferNano.K(2, discount, Discount.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.G(3, trialBenefit.trialReplaceItemID);
            Discount discount2 = trialBenefit.afterTrialDiscount;
            if (discount2 != null) {
                codedOutputByteBufferNano.K(4, discount2, Discount.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TrialBenefit> JSON_ADAPTER = new ObjectJsonAdapter<TrialBenefit>() { // from class: com.p1.mobile.putong.core.data.TrialBenefit.2
        public Class getDataClass() {
            return TrialBenefit.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TrialBenefit m16029newInstance() {
            return new TrialBenefit();
        }

        public boolean parseField(TrialBenefit trialBenefit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "afterTrialDiscount":
                    trialBenefit.afterTrialDiscount = (Discount) Discount.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "discount":
                    trialBenefit.discount = (Discount) Discount.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public void serializeFields(TrialBenefit trialBenefit, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("trialDuration", trialBenefit.trialDuration);
            if (trialBenefit.discount != null) {
                jsonGenerator.writeFieldName(Discount.TYPE);
                Discount.JSON_ADAPTER.serialize(trialBenefit.discount, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("trialReplaceItemID", trialBenefit.trialReplaceItemID);
            if (trialBenefit.afterTrialDiscount != null) {
                jsonGenerator.writeFieldName("afterTrialDiscount");
                Discount.JSON_ADAPTER.serialize(trialBenefit.afterTrialDiscount, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TrialBenefit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TrialBenefit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TrialBenefit new_() {
        TrialBenefit trialBenefit = new TrialBenefit();
        trialBenefit.nullCheck();
        return trialBenefit;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TrialBenefit m16027clone() {
        TrialBenefit trialBenefit = new TrialBenefit();
        trialBenefit.trialDuration = this.trialDuration;
        Discount discount = this.discount;
        if (discount != null) {
            trialBenefit.discount = discount.m12616clone();
        }
        trialBenefit.trialReplaceItemID = this.trialReplaceItemID;
        Discount discount2 = this.afterTrialDiscount;
        if (discount2 != null) {
            trialBenefit.afterTrialDiscount = discount2.m12616clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.trialDuration;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        Discount discount = this.discount;
        int iHashCode = (((i2 + (discount != null ? discount.hashCode() : 0)) * 41) + this.trialReplaceItemID) * 41;
        Discount discount2 = this.afterTrialDiscount;
        int iHashCode2 = iHashCode + (discount2 != null ? discount2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.discount == null) {
            this.discount = Discount.new_();
        }
        if (this.afterTrialDiscount == null) {
            this.afterTrialDiscount = Discount.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
