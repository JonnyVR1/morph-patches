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
public class LocalBenefit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "localbenefit";

    @NonNull
    @ProtobufIndex(index = 1)
    public String benefitType;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public DiscountBenefit discountBenefit;

    @NonNull
    @ProtobufIndex(index = 4)
    public GiftBenefit giftBenefit;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public TrialBenefit trialBenefit;
    public static ProtobufAdapter<LocalBenefit> PROTOBUF_ADAPTER = new MessageNanoAdapter<LocalBenefit>() { // from class: com.p1.mobile.putong.core.data.LocalBenefit.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LocalBenefit localBenefit) {
            String str = localBenefit.benefitType;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            TrialBenefit trialBenefit = localBenefit.trialBenefit;
            if (trialBenefit != null) {
                iO += CodedOutputByteBufferNano.l(2, trialBenefit, TrialBenefit.PROTOBUF_ADAPTER);
            }
            DiscountBenefit discountBenefit = localBenefit.discountBenefit;
            if (discountBenefit != null) {
                iO += CodedOutputByteBufferNano.l(3, discountBenefit, DiscountBenefit.PROTOBUF_ADAPTER);
            }
            GiftBenefit giftBenefit = localBenefit.giftBenefit;
            if (giftBenefit != null) {
                iO += CodedOutputByteBufferNano.l(4, giftBenefit, GiftBenefit.PROTOBUF_ADAPTER);
            }
            ((MessageNano) localBenefit).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LocalBenefit m13949parse(nb5 nb5Var) throws IOException {
            LocalBenefit localBenefit = new LocalBenefit();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (localBenefit.benefitType == null) {
                        localBenefit.benefitType = "";
                    }
                    if (localBenefit.trialBenefit == null) {
                        localBenefit.trialBenefit = TrialBenefit.new_();
                    }
                    if (localBenefit.discountBenefit == null) {
                        localBenefit.discountBenefit = DiscountBenefit.new_();
                    }
                    if (localBenefit.giftBenefit != null) {
                        break;
                    }
                    localBenefit.giftBenefit = GiftBenefit.new_();
                    break;
                }
                if (iU == 10) {
                    localBenefit.benefitType = nb5Var.s();
                } else if (iU == 18) {
                    localBenefit.trialBenefit = (TrialBenefit) nb5Var.l(TrialBenefit.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    localBenefit.discountBenefit = (DiscountBenefit) nb5Var.l(DiscountBenefit.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 34) {
                        if (localBenefit.benefitType == null) {
                            localBenefit.benefitType = "";
                        }
                        if (localBenefit.trialBenefit == null) {
                            localBenefit.trialBenefit = TrialBenefit.new_();
                        }
                        if (localBenefit.discountBenefit == null) {
                            localBenefit.discountBenefit = DiscountBenefit.new_();
                        }
                        if (localBenefit.giftBenefit != null) {
                            break;
                        }
                        localBenefit.giftBenefit = GiftBenefit.new_();
                        return localBenefit;
                    }
                    localBenefit.giftBenefit = (GiftBenefit) nb5Var.l(GiftBenefit.PROTOBUF_ADAPTER);
                }
            }
            return localBenefit;
        }

        public void serialize(LocalBenefit localBenefit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = localBenefit.benefitType;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            TrialBenefit trialBenefit = localBenefit.trialBenefit;
            if (trialBenefit != null) {
                codedOutputByteBufferNano.K(2, trialBenefit, TrialBenefit.PROTOBUF_ADAPTER);
            }
            DiscountBenefit discountBenefit = localBenefit.discountBenefit;
            if (discountBenefit != null) {
                codedOutputByteBufferNano.K(3, discountBenefit, DiscountBenefit.PROTOBUF_ADAPTER);
            }
            GiftBenefit giftBenefit = localBenefit.giftBenefit;
            if (giftBenefit != null) {
                codedOutputByteBufferNano.K(4, giftBenefit, GiftBenefit.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LocalBenefit> JSON_ADAPTER = new ObjectJsonAdapter<LocalBenefit>() { // from class: com.p1.mobile.putong.core.data.LocalBenefit.2
        public Class getDataClass() {
            return LocalBenefit.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LocalBenefit m13950newInstance() {
            return new LocalBenefit();
        }

        public boolean parseField(LocalBenefit localBenefit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "giftBenefit":
                    localBenefit.giftBenefit = (GiftBenefit) GiftBenefit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "benefitType":
                    localBenefit.benefitType = jsonParser.getValueAsString();
                    return true;
                case "discountBenefit":
                    localBenefit.discountBenefit = (DiscountBenefit) DiscountBenefit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "trialBenefit":
                    localBenefit.trialBenefit = (TrialBenefit) TrialBenefit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LocalBenefit localBenefit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "giftBenefit":
                case "benefitType":
                case "discountBenefit":
                case "trialBenefit":
                    return true;
                default:
                    return super.parseFieldCheck(localBenefit, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(LocalBenefit localBenefit, JsonGenerator jsonGenerator) throws IOException {
            String str = localBenefit.benefitType;
            if (str != null) {
                jsonGenerator.writeStringField("benefitType", str);
            }
            if (localBenefit.trialBenefit != null) {
                jsonGenerator.writeFieldName("trialBenefit");
                TrialBenefit.JSON_ADAPTER.serialize(localBenefit.trialBenefit, jsonGenerator, true);
            }
            if (localBenefit.discountBenefit != null) {
                jsonGenerator.writeFieldName("discountBenefit");
                DiscountBenefit.JSON_ADAPTER.serialize(localBenefit.discountBenefit, jsonGenerator, true);
            }
            if (localBenefit.giftBenefit != null) {
                jsonGenerator.writeFieldName("giftBenefit");
                GiftBenefit.JSON_ADAPTER.serialize(localBenefit.giftBenefit, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LocalBenefit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LocalBenefit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LocalBenefit new_() {
        LocalBenefit localBenefit = new LocalBenefit();
        localBenefit.nullCheck();
        return localBenefit;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LocalBenefit m13948clone() {
        LocalBenefit localBenefit = new LocalBenefit();
        localBenefit.benefitType = this.benefitType;
        TrialBenefit trialBenefit = this.trialBenefit;
        if (trialBenefit != null) {
            localBenefit.trialBenefit = trialBenefit.m16027clone();
        }
        DiscountBenefit discountBenefit = this.discountBenefit;
        if (discountBenefit != null) {
            localBenefit.discountBenefit = discountBenefit.m12620clone();
        }
        GiftBenefit giftBenefit = this.giftBenefit;
        if (giftBenefit != null) {
            localBenefit.giftBenefit = giftBenefit.m12930clone();
        }
        return localBenefit;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalBenefit)) {
            return false;
        }
        LocalBenefit localBenefit = (LocalBenefit) obj;
        return ValueObject.util_equals(this.benefitType, localBenefit.benefitType) && ValueObject.util_equals(this.trialBenefit, localBenefit.trialBenefit) && ValueObject.util_equals(this.discountBenefit, localBenefit.discountBenefit) && ValueObject.util_equals(this.giftBenefit, localBenefit.giftBenefit);
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
        String str = this.benefitType;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        TrialBenefit trialBenefit = this.trialBenefit;
        int iHashCode2 = (iHashCode + (trialBenefit != null ? trialBenefit.hashCode() : 0)) * 41;
        DiscountBenefit discountBenefit = this.discountBenefit;
        int iHashCode3 = (iHashCode2 + (discountBenefit != null ? discountBenefit.hashCode() : 0)) * 41;
        GiftBenefit giftBenefit = this.giftBenefit;
        int iHashCode4 = iHashCode3 + (giftBenefit != null ? giftBenefit.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.benefitType == null) {
            this.benefitType = "";
        }
        if (this.trialBenefit == null) {
            this.trialBenefit = TrialBenefit.new_();
        }
        if (this.discountBenefit == null) {
            this.discountBenefit = DiscountBenefit.new_();
        }
        if (this.giftBenefit == null) {
            this.giftBenefit = GiftBenefit.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
