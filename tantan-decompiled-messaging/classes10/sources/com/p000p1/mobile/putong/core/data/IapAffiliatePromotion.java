package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot;
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
import java.util.Map;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class IapAffiliatePromotion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "iapaffiliatepromotion";

    @Nullable
    @ProtobufIndex(index = 4)
    public String discount;

    @Nullable
    @ProtobufIndex(index = 12)
    public Map<String, IapAffiliatePromotionDisplaySlot> displayConfig;

    @ProtobufIndex(index = 11)
    public long endTime;

    @Nullable
    @ProtobufIndex(index = 13)
    public IapAffiliatePromotionExtraConfig extraConfig;

    @ProtobufIndex(index = 14)
    public int ftDays;

    @NonNull
    @ProtobufIndex(index = 7)
    public String iapId;

    @Nullable
    @ProtobufIndex(index = 8)
    public String offerId;

    @Nullable
    @ProtobufIndex(index = 9)
    public String offerType;

    @NonNull
    @ProtobufIndex(index = 6)
    public String productId;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String productType;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public long promotionHitId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String promotionName;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String promotionType;

    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public long startTime;
    public static ProtobufAdapter<IapAffiliatePromotion> PROTOBUF_ADAPTER = new MessageNanoAdapter<IapAffiliatePromotion>() { // from class: com.p1.mobile.putong.core.data.IapAffiliatePromotion.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IapAffiliatePromotion iapAffiliatePromotion) {
            String str = iapAffiliatePromotion.promotionName;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.j(2, iapAffiliatePromotion.promotionHitId);
            String str2 = iapAffiliatePromotion.promotionType;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = iapAffiliatePromotion.discount;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(4, str3);
            }
            String str4 = iapAffiliatePromotion.productType;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(5, str4);
            }
            String str5 = iapAffiliatePromotion.productId;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(6, str5);
            }
            String str6 = iapAffiliatePromotion.iapId;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(7, str6);
            }
            String str7 = iapAffiliatePromotion.offerId;
            if (str7 != null) {
                iO += CodedOutputByteBufferNano.o(8, str7);
            }
            String str8 = iapAffiliatePromotion.offerType;
            if (str8 != null) {
                iO += CodedOutputByteBufferNano.o(9, str8);
            }
            int iJ = iO + CodedOutputByteBufferNano.j(10, iapAffiliatePromotion.startTime) + CodedOutputByteBufferNano.j(11, iapAffiliatePromotion.endTime);
            Map<String, IapAffiliatePromotionDisplaySlot> map = iapAffiliatePromotion.displayConfig;
            if (map != null) {
                iJ += CodedOutputByteBufferNano.l(12, map, IapAffiliatePromotionDisplaySlot.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
            IapAffiliatePromotionExtraConfig iapAffiliatePromotionExtraConfig = iapAffiliatePromotion.extraConfig;
            if (iapAffiliatePromotionExtraConfig != null) {
                iJ += CodedOutputByteBufferNano.l(13, iapAffiliatePromotionExtraConfig, IapAffiliatePromotionExtraConfig.PROTOBUF_ADAPTER);
            }
            int iH = iJ + CodedOutputByteBufferNano.h(14, iapAffiliatePromotion.ftDays);
            ((MessageNano) iapAffiliatePromotion).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IapAffiliatePromotion m13357parse(nb5 nb5Var) throws IOException {
            IapAffiliatePromotion iapAffiliatePromotion = new IapAffiliatePromotion();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (iapAffiliatePromotion.promotionName == null) {
                            iapAffiliatePromotion.promotionName = "";
                        }
                        if (iapAffiliatePromotion.promotionType == null) {
                            iapAffiliatePromotion.promotionType = "";
                        }
                        if (iapAffiliatePromotion.productType == null) {
                            iapAffiliatePromotion.productType = "";
                        }
                        if (iapAffiliatePromotion.productId == null) {
                            iapAffiliatePromotion.productId = "";
                        }
                        if (iapAffiliatePromotion.iapId == null) {
                            iapAffiliatePromotion.iapId = "";
                        }
                        break;
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        iapAffiliatePromotion.promotionName = nb5Var.s();
                        continue;
                    case 16:
                        iapAffiliatePromotion.promotionHitId = nb5Var.k();
                        continue;
                    case 26:
                        iapAffiliatePromotion.promotionType = nb5Var.s();
                        continue;
                    case 34:
                        iapAffiliatePromotion.discount = nb5Var.s();
                        continue;
                    case 42:
                        iapAffiliatePromotion.productType = nb5Var.s();
                        continue;
                    case Conversation.EXPOSURE_LEVEL_TOP /* 50 */:
                        iapAffiliatePromotion.productId = nb5Var.s();
                        continue;
                    case 58:
                        iapAffiliatePromotion.iapId = nb5Var.s();
                        continue;
                    case 66:
                        iapAffiliatePromotion.offerId = nb5Var.s();
                        continue;
                    case 74:
                        iapAffiliatePromotion.offerType = nb5Var.s();
                        continue;
                    case 80:
                        iapAffiliatePromotion.startTime = nb5Var.k();
                        continue;
                    case 88:
                        iapAffiliatePromotion.endTime = nb5Var.k();
                        continue;
                    case 98:
                        iapAffiliatePromotion.displayConfig = (Map) nb5Var.l(IapAffiliatePromotionDisplaySlot.PROTOBUF_ADAPTER.MAP_ADAPTER());
                        continue;
                    case 106:
                        iapAffiliatePromotion.extraConfig = (IapAffiliatePromotionExtraConfig) nb5Var.l(IapAffiliatePromotionExtraConfig.PROTOBUF_ADAPTER);
                        continue;
                    case 112:
                        iapAffiliatePromotion.ftDays = nb5Var.j();
                        continue;
                    default:
                        if (iapAffiliatePromotion.promotionName == null) {
                            iapAffiliatePromotion.promotionName = "";
                        }
                        if (iapAffiliatePromotion.promotionType == null) {
                            iapAffiliatePromotion.promotionType = "";
                        }
                        if (iapAffiliatePromotion.productType == null) {
                            iapAffiliatePromotion.productType = "";
                        }
                        if (iapAffiliatePromotion.productId == null) {
                            iapAffiliatePromotion.productId = "";
                        }
                        if (iapAffiliatePromotion.iapId == null) {
                            iapAffiliatePromotion.iapId = "";
                            return iapAffiliatePromotion;
                        }
                        break;
                }
            }
            return iapAffiliatePromotion;
        }

        public void serialize(IapAffiliatePromotion iapAffiliatePromotion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = iapAffiliatePromotion.promotionName;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.I(2, iapAffiliatePromotion.promotionHitId);
            String str2 = iapAffiliatePromotion.promotionType;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = iapAffiliatePromotion.discount;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            String str4 = iapAffiliatePromotion.productType;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
            String str5 = iapAffiliatePromotion.productId;
            if (str5 != null) {
                codedOutputByteBufferNano.R(6, str5);
            }
            String str6 = iapAffiliatePromotion.iapId;
            if (str6 != null) {
                codedOutputByteBufferNano.R(7, str6);
            }
            String str7 = iapAffiliatePromotion.offerId;
            if (str7 != null) {
                codedOutputByteBufferNano.R(8, str7);
            }
            String str8 = iapAffiliatePromotion.offerType;
            if (str8 != null) {
                codedOutputByteBufferNano.R(9, str8);
            }
            codedOutputByteBufferNano.I(10, iapAffiliatePromotion.startTime);
            codedOutputByteBufferNano.I(11, iapAffiliatePromotion.endTime);
            Map<String, IapAffiliatePromotionDisplaySlot> map = iapAffiliatePromotion.displayConfig;
            if (map != null) {
                codedOutputByteBufferNano.K(12, map, IapAffiliatePromotionDisplaySlot.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
            IapAffiliatePromotionExtraConfig iapAffiliatePromotionExtraConfig = iapAffiliatePromotion.extraConfig;
            if (iapAffiliatePromotionExtraConfig != null) {
                codedOutputByteBufferNano.K(13, iapAffiliatePromotionExtraConfig, IapAffiliatePromotionExtraConfig.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.G(14, iapAffiliatePromotion.ftDays);
        }
    };
    public static JsonAdapter<IapAffiliatePromotion> JSON_ADAPTER = new ObjectJsonAdapter<IapAffiliatePromotion>() { // from class: com.p1.mobile.putong.core.data.IapAffiliatePromotion.2
        public Class getDataClass() {
            return IapAffiliatePromotion.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IapAffiliatePromotion m13358newInstance() {
            return new IapAffiliatePromotion();
        }

        public boolean parseField(IapAffiliatePromotion iapAffiliatePromotion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startTime":
                    iapAffiliatePromotion.startTime = jsonParser.getValueAsLong();
                    return true;
                case "endTime":
                    iapAffiliatePromotion.endTime = jsonParser.getValueAsLong();
                    return true;
                case "offerId":
                    iapAffiliatePromotion.offerId = jsonParser.getValueAsString();
                    return true;
                case "productType":
                    iapAffiliatePromotion.productType = jsonParser.getValueAsString();
                    return true;
                case "ftDays":
                    iapAffiliatePromotion.ftDays = jsonParser.getValueAsInt();
                    return true;
                case "productId":
                    iapAffiliatePromotion.productId = jsonParser.getValueAsString();
                    return true;
                case "iapId":
                    iapAffiliatePromotion.iapId = jsonParser.getValueAsString();
                    return true;
                case "discount":
                    iapAffiliatePromotion.discount = jsonParser.getValueAsString();
                    return true;
                case "promotionHitId":
                    iapAffiliatePromotion.promotionHitId = jsonParser.getValueAsLong();
                    return true;
                case "promotionName":
                    iapAffiliatePromotion.promotionName = jsonParser.getValueAsString();
                    return true;
                case "promotionType":
                    iapAffiliatePromotion.promotionType = jsonParser.getValueAsString();
                    return true;
                case "extraConfig":
                    iapAffiliatePromotion.extraConfig = (IapAffiliatePromotionExtraConfig) IapAffiliatePromotionExtraConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "offerType":
                    iapAffiliatePromotion.offerType = jsonParser.getValueAsString();
                    return true;
                case "displayConfig":
                    iapAffiliatePromotion.displayConfig = JsonAdapter.parseMap(jsonParser, IapAffiliatePromotionDisplaySlot.JSON_ADAPTER, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IapAffiliatePromotion iapAffiliatePromotion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "startTime":
                case "endTime":
                case "offerId":
                case "productType":
                case "ftDays":
                case "productId":
                case "iapId":
                case "discount":
                case "promotionHitId":
                case "promotionName":
                case "promotionType":
                case "extraConfig":
                case "offerType":
                case "displayConfig":
                    return true;
                default:
                    return super.parseFieldCheck(iapAffiliatePromotion, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(IapAffiliatePromotion iapAffiliatePromotion, JsonGenerator jsonGenerator) throws IOException {
            String str = iapAffiliatePromotion.promotionName;
            if (str != null) {
                jsonGenerator.writeStringField("promotionName", str);
            }
            jsonGenerator.writeNumberField("promotionHitId", iapAffiliatePromotion.promotionHitId);
            String str2 = iapAffiliatePromotion.promotionType;
            if (str2 != null) {
                jsonGenerator.writeStringField("promotionType", str2);
            }
            String str3 = iapAffiliatePromotion.discount;
            if (str3 != null) {
                jsonGenerator.writeStringField(Discount.TYPE, str3);
            }
            jsonGenerator.writeNumberField("ftDays", iapAffiliatePromotion.ftDays);
            String str4 = iapAffiliatePromotion.productType;
            if (str4 != null) {
                jsonGenerator.writeStringField("productType", str4);
            }
            String str5 = iapAffiliatePromotion.productId;
            if (str5 != null) {
                jsonGenerator.writeStringField("productId", str5);
            }
            String str6 = iapAffiliatePromotion.iapId;
            if (str6 != null) {
                jsonGenerator.writeStringField("iapId", str6);
            }
            String str7 = iapAffiliatePromotion.offerId;
            if (str7 != null) {
                jsonGenerator.writeStringField("offerId", str7);
            }
            String str8 = iapAffiliatePromotion.offerType;
            if (str8 != null) {
                jsonGenerator.writeStringField("offerType", str8);
            }
            jsonGenerator.writeNumberField("startTime", iapAffiliatePromotion.startTime);
            jsonGenerator.writeNumberField("endTime", iapAffiliatePromotion.endTime);
            if (iapAffiliatePromotion.displayConfig != null) {
                jsonGenerator.writeFieldName("displayConfig");
                JsonAdapter.serializeMap(iapAffiliatePromotion.displayConfig, jsonGenerator, IapAffiliatePromotionDisplaySlot.JSON_ADAPTER);
            }
            if (iapAffiliatePromotion.extraConfig != null) {
                jsonGenerator.writeFieldName("extraConfig");
                IapAffiliatePromotionExtraConfig.JSON_ADAPTER.serialize(iapAffiliatePromotion.extraConfig, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IapAffiliatePromotion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IapAffiliatePromotion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IapAffiliatePromotion new_() {
        IapAffiliatePromotion iapAffiliatePromotion = new IapAffiliatePromotion();
        iapAffiliatePromotion.nullCheck();
        return iapAffiliatePromotion;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IapAffiliatePromotion m13356clone() {
        IapAffiliatePromotion iapAffiliatePromotion = new IapAffiliatePromotion();
        iapAffiliatePromotion.promotionName = this.promotionName;
        iapAffiliatePromotion.promotionHitId = this.promotionHitId;
        iapAffiliatePromotion.promotionType = this.promotionType;
        iapAffiliatePromotion.discount = this.discount;
        iapAffiliatePromotion.ftDays = this.ftDays;
        iapAffiliatePromotion.productType = this.productType;
        iapAffiliatePromotion.productId = this.productId;
        iapAffiliatePromotion.iapId = this.iapId;
        iapAffiliatePromotion.offerId = this.offerId;
        iapAffiliatePromotion.offerType = this.offerType;
        iapAffiliatePromotion.startTime = this.startTime;
        iapAffiliatePromotion.endTime = this.endTime;
        Map<String, IapAffiliatePromotionDisplaySlot> map = this.displayConfig;
        if (map != null) {
            iapAffiliatePromotion.displayConfig = ValueObject.util_map(map, new w9j() { // from class: l.h8m
                public final Object call(Object obj) {
                    return ((IapAffiliatePromotionDisplaySlot) obj).m13360clone();
                }
            });
        }
        IapAffiliatePromotionExtraConfig iapAffiliatePromotionExtraConfig = this.extraConfig;
        if (iapAffiliatePromotionExtraConfig != null) {
            iapAffiliatePromotion.extraConfig = iapAffiliatePromotionExtraConfig.m13364clone();
        }
        return iapAffiliatePromotion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IapAffiliatePromotion)) {
            return false;
        }
        IapAffiliatePromotion iapAffiliatePromotion = (IapAffiliatePromotion) obj;
        return ValueObject.util_equals(this.promotionName, iapAffiliatePromotion.promotionName) && this.promotionHitId == iapAffiliatePromotion.promotionHitId && ValueObject.util_equals(this.promotionType, iapAffiliatePromotion.promotionType) && ValueObject.util_equals(this.discount, iapAffiliatePromotion.discount) && this.ftDays == iapAffiliatePromotion.ftDays && ValueObject.util_equals(this.productType, iapAffiliatePromotion.productType) && ValueObject.util_equals(this.productId, iapAffiliatePromotion.productId) && ValueObject.util_equals(this.iapId, iapAffiliatePromotion.iapId) && ValueObject.util_equals(this.offerId, iapAffiliatePromotion.offerId) && ValueObject.util_equals(this.offerType, iapAffiliatePromotion.offerType) && this.startTime == iapAffiliatePromotion.startTime && this.endTime == iapAffiliatePromotion.endTime && ValueObject.util_equals(this.displayConfig, iapAffiliatePromotion.displayConfig) && ValueObject.util_equals(this.extraConfig, iapAffiliatePromotion.extraConfig);
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
        String str = this.promotionName;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j = this.promotionHitId;
        int i3 = (((i2 + iHashCode) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str2 = this.promotionType;
        int iHashCode2 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.discount;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.ftDays) * 41;
        String str4 = this.productType;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.productId;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.iapId;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.offerId;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.offerType;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        long j2 = this.startTime;
        int i4 = (iHashCode8 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.endTime;
        int i5 = (i4 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        Map<String, IapAffiliatePromotionDisplaySlot> map = this.displayConfig;
        int iHashCode9 = (i5 + (map != null ? map.hashCode() : 0)) * 41;
        IapAffiliatePromotionExtraConfig iapAffiliatePromotionExtraConfig = this.extraConfig;
        int iHashCode10 = iHashCode9 + (iapAffiliatePromotionExtraConfig != null ? iapAffiliatePromotionExtraConfig.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode10;
        return iHashCode10;
    }

    public void nullCheck() {
        if (this.promotionName == null) {
            this.promotionName = "";
        }
        if (this.promotionType == null) {
            this.promotionType = "";
        }
        if (this.productType == null) {
            this.productType = "";
        }
        if (this.productId == null) {
            this.productId = "";
        }
        if (this.iapId == null) {
            this.iapId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
