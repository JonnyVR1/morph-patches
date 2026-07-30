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
public class LocalBenefit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "localbenefit";

    @NonNull
    @ProtobufIndex(index = 1)
    public String benefitType;

    @NonNull
    @ProtobufIndex(index = 3)
    public DiscountBenefit discountBenefit;

    @NonNull
    @ProtobufIndex(index = 4)
    public GiftBenefit giftBenefit;

    @NonNull
    @ProtobufIndex(index = 2)
    public TrialBenefit trialBenefit;
    public static ProtobufAdapter<LocalBenefit> PROTOBUF_ADAPTER = new MessageNanoAdapter<LocalBenefit>() { // from class: com.p1.mobile.putong.core.data.LocalBenefit.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LocalBenefit localBenefit) {
            String str = localBenefit.benefitType;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            TrialBenefit trialBenefit = localBenefit.trialBenefit;
            if (trialBenefit != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, trialBenefit, TrialBenefit.PROTOBUF_ADAPTER);
            }
            DiscountBenefit discountBenefit = localBenefit.discountBenefit;
            if (discountBenefit != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, discountBenefit, DiscountBenefit.PROTOBUF_ADAPTER);
            }
            GiftBenefit giftBenefit = localBenefit.giftBenefit;
            if (giftBenefit != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, giftBenefit, GiftBenefit.PROTOBUF_ADAPTER);
            }
            localBenefit.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LocalBenefit parse(nc5 nc5Var) throws IOException {
            LocalBenefit localBenefit = new LocalBenefit();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 10) {
                    localBenefit.benefitType = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    localBenefit.trialBenefit = (TrialBenefit) nc5Var.m162488l(TrialBenefit.PROTOBUF_ADAPTER);
                } else if (iM162497u == 26) {
                    localBenefit.discountBenefit = (DiscountBenefit) nc5Var.m162488l(DiscountBenefit.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 34) {
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
                    localBenefit.giftBenefit = (GiftBenefit) nc5Var.m162488l(GiftBenefit.PROTOBUF_ADAPTER);
                }
            }
            return localBenefit;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LocalBenefit localBenefit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = localBenefit.benefitType;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            TrialBenefit trialBenefit = localBenefit.trialBenefit;
            if (trialBenefit != null) {
                codedOutputByteBufferNano.m17309K(2, trialBenefit, TrialBenefit.PROTOBUF_ADAPTER);
            }
            DiscountBenefit discountBenefit = localBenefit.discountBenefit;
            if (discountBenefit != null) {
                codedOutputByteBufferNano.m17309K(3, discountBenefit, DiscountBenefit.PROTOBUF_ADAPTER);
            }
            GiftBenefit giftBenefit = localBenefit.giftBenefit;
            if (giftBenefit != null) {
                codedOutputByteBufferNano.m17309K(4, giftBenefit, GiftBenefit.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LocalBenefit> JSON_ADAPTER = new ObjectJsonAdapter<LocalBenefit>() { // from class: com.p1.mobile.putong.core.data.LocalBenefit.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LocalBenefit.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LocalBenefit newInstance() {
            return new LocalBenefit();
        }

        public boolean parseField(LocalBenefit localBenefit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "giftBenefit":
                    localBenefit.giftBenefit = GiftBenefit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "benefitType":
                    localBenefit.benefitType = jsonParser.getValueAsString();
                    return true;
                case "discountBenefit":
                    localBenefit.discountBenefit = DiscountBenefit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "trialBenefit":
                    localBenefit.trialBenefit = TrialBenefit.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LocalBenefit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LocalBenefit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LocalBenefit new_() {
        LocalBenefit localBenefit = new LocalBenefit();
        localBenefit.nullCheck();
        return localBenefit;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LocalBenefit mo225055clone() {
        LocalBenefit localBenefit = new LocalBenefit();
        localBenefit.benefitType = this.benefitType;
        TrialBenefit trialBenefit = this.trialBenefit;
        if (trialBenefit != null) {
            localBenefit.trialBenefit = trialBenefit.mo225055clone();
        }
        DiscountBenefit discountBenefit = this.discountBenefit;
        if (discountBenefit != null) {
            localBenefit.discountBenefit = discountBenefit.mo225055clone();
        }
        GiftBenefit giftBenefit = this.giftBenefit;
        if (giftBenefit != null) {
            localBenefit.giftBenefit = giftBenefit.mo225055clone();
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
        String str = this.benefitType;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        TrialBenefit trialBenefit = this.trialBenefit;
        int iHashCode2 = (iHashCode + (trialBenefit != null ? trialBenefit.hashCode() : 0)) * 41;
        DiscountBenefit discountBenefit = this.discountBenefit;
        int iHashCode3 = (iHashCode2 + (discountBenefit != null ? discountBenefit.hashCode() : 0)) * 41;
        GiftBenefit giftBenefit = this.giftBenefit;
        int iHashCode4 = iHashCode3 + (giftBenefit != null ? giftBenefit.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
