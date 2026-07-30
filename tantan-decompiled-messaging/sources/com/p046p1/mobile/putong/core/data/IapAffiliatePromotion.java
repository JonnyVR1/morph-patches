package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot;
import com.p046p1.mobile.putong.data.StudentVerRejectedReason;
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
import java.util.Map;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
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
    @ProtobufIndex(index = 5)
    public String productType;

    @ProtobufIndex(index = 2)
    public long promotionHitId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String promotionName;

    @NonNull
    @ProtobufIndex(index = 3)
    public String promotionType;

    @ProtobufIndex(index = 10)
    public long startTime;
    public static ProtobufAdapter<IapAffiliatePromotion> PROTOBUF_ADAPTER = new MessageNanoAdapter<IapAffiliatePromotion>() { // from class: com.p1.mobile.putong.core.data.IapAffiliatePromotion.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IapAffiliatePromotion iapAffiliatePromotion) {
            String str = iapAffiliatePromotion.promotionName;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17228j(2, iapAffiliatePromotion.promotionHitId);
            String str2 = iapAffiliatePromotion.promotionType;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            String str3 = iapAffiliatePromotion.discount;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            String str4 = iapAffiliatePromotion.productType;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str4);
            }
            String str5 = iapAffiliatePromotion.productId;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str5);
            }
            String str6 = iapAffiliatePromotion.iapId;
            if (str6 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(7, str6);
            }
            String str7 = iapAffiliatePromotion.offerId;
            if (str7 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(8, str7);
            }
            String str8 = iapAffiliatePromotion.offerType;
            if (str8 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(9, str8);
            }
            int iM17228j = iM17233o + CodedOutputByteBufferNano.m17228j(10, iapAffiliatePromotion.startTime) + CodedOutputByteBufferNano.m17228j(11, iapAffiliatePromotion.endTime);
            Map<String, IapAffiliatePromotionDisplaySlot> map = iapAffiliatePromotion.displayConfig;
            if (map != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(12, map, IapAffiliatePromotionDisplaySlot.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
            IapAffiliatePromotionExtraConfig iapAffiliatePromotionExtraConfig = iapAffiliatePromotion.extraConfig;
            if (iapAffiliatePromotionExtraConfig != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(13, iapAffiliatePromotionExtraConfig, IapAffiliatePromotionExtraConfig.PROTOBUF_ADAPTER);
            }
            int iM17226h = iM17228j + CodedOutputByteBufferNano.m17226h(14, iapAffiliatePromotion.ftDays);
            iapAffiliatePromotion.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IapAffiliatePromotion parse(nb5 nb5Var) throws IOException {
            IapAffiliatePromotion iapAffiliatePromotion = new IapAffiliatePromotion();
            while (true) {
                switch (nb5Var.m158752u()) {
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
                    case 10:
                        iapAffiliatePromotion.promotionName = nb5Var.m158750s();
                        continue;
                    case 16:
                        iapAffiliatePromotion.promotionHitId = nb5Var.m158742k();
                        continue;
                    case 26:
                        iapAffiliatePromotion.promotionType = nb5Var.m158750s();
                        continue;
                    case 34:
                        iapAffiliatePromotion.discount = nb5Var.m158750s();
                        continue;
                    case 42:
                        iapAffiliatePromotion.productType = nb5Var.m158750s();
                        continue;
                    case 50:
                        iapAffiliatePromotion.productId = nb5Var.m158750s();
                        continue;
                    case 58:
                        iapAffiliatePromotion.iapId = nb5Var.m158750s();
                        continue;
                    case 66:
                        iapAffiliatePromotion.offerId = nb5Var.m158750s();
                        continue;
                    case 74:
                        iapAffiliatePromotion.offerType = nb5Var.m158750s();
                        continue;
                    case 80:
                        iapAffiliatePromotion.startTime = nb5Var.m158742k();
                        continue;
                    case 88:
                        iapAffiliatePromotion.endTime = nb5Var.m158742k();
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        iapAffiliatePromotion.displayConfig = (Map) nb5Var.m158743l(IapAffiliatePromotionDisplaySlot.PROTOBUF_ADAPTER.MAP_ADAPTER());
                        continue;
                    case 106:
                        iapAffiliatePromotion.extraConfig = (IapAffiliatePromotionExtraConfig) nb5Var.m158743l(IapAffiliatePromotionExtraConfig.PROTOBUF_ADAPTER);
                        continue;
                    case 112:
                        iapAffiliatePromotion.ftDays = nb5Var.m158741j();
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IapAffiliatePromotion iapAffiliatePromotion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = iapAffiliatePromotion.promotionName;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17252I(2, iapAffiliatePromotion.promotionHitId);
            String str2 = iapAffiliatePromotion.promotionType;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            String str3 = iapAffiliatePromotion.discount;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            String str4 = iapAffiliatePromotion.productType;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(5, str4);
            }
            String str5 = iapAffiliatePromotion.productId;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(6, str5);
            }
            String str6 = iapAffiliatePromotion.iapId;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(7, str6);
            }
            String str7 = iapAffiliatePromotion.offerId;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(8, str7);
            }
            String str8 = iapAffiliatePromotion.offerType;
            if (str8 != null) {
                codedOutputByteBufferNano.m17261R(9, str8);
            }
            codedOutputByteBufferNano.m17252I(10, iapAffiliatePromotion.startTime);
            codedOutputByteBufferNano.m17252I(11, iapAffiliatePromotion.endTime);
            Map<String, IapAffiliatePromotionDisplaySlot> map = iapAffiliatePromotion.displayConfig;
            if (map != null) {
                codedOutputByteBufferNano.m17254K(12, map, IapAffiliatePromotionDisplaySlot.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
            IapAffiliatePromotionExtraConfig iapAffiliatePromotionExtraConfig = iapAffiliatePromotion.extraConfig;
            if (iapAffiliatePromotionExtraConfig != null) {
                codedOutputByteBufferNano.m17254K(13, iapAffiliatePromotionExtraConfig, IapAffiliatePromotionExtraConfig.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17250G(14, iapAffiliatePromotion.ftDays);
        }
    };
    public static JsonAdapter<IapAffiliatePromotion> JSON_ADAPTER = new ObjectJsonAdapter<IapAffiliatePromotion>() { // from class: com.p1.mobile.putong.core.data.IapAffiliatePromotion.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IapAffiliatePromotion.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IapAffiliatePromotion newInstance() {
            return new IapAffiliatePromotion();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(IapAffiliatePromotion iapAffiliatePromotion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2129294769:
                    if (str.equals(StudentVerRejectedReason.startTime)) {
                        b = 0;
                    }
                    break;
                case -1607243192:
                    if (str.equals("endTime")) {
                        b = 1;
                    }
                    break;
                case -1548813161:
                    if (str.equals("offerId")) {
                        b = 2;
                    }
                    break;
                case -1491615543:
                    if (str.equals("productType")) {
                        b = 3;
                    }
                    break;
                case -1265542587:
                    if (str.equals("ftDays")) {
                        b = 4;
                    }
                    break;
                case -1051830678:
                    if (str.equals("productId")) {
                        b = 5;
                    }
                    break;
                case 99969427:
                    if (str.equals("iapId")) {
                        b = 6;
                    }
                    break;
                case 273184065:
                    if (str.equals("discount")) {
                        b = 7;
                    }
                    break;
                case 682525995:
                    if (str.equals("promotionHitId")) {
                        b = 8;
                    }
                    break;
                case 714924494:
                    if (str.equals("promotionName")) {
                        b = 9;
                    }
                    break;
                case 715126397:
                    if (str.equals("promotionType")) {
                        b = 10;
                    }
                    break;
                case 902870898:
                    if (str.equals("extraConfig")) {
                        b = 11;
                    }
                    break;
                case 1944555446:
                    if (str.equals("offerType")) {
                        b = 12;
                    }
                    break;
                case 2022731428:
                    if (str.equals("displayConfig")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    iapAffiliatePromotion.startTime = jsonParser.getValueAsLong();
                    return true;
                case 1:
                    iapAffiliatePromotion.endTime = jsonParser.getValueAsLong();
                    return true;
                case 2:
                    iapAffiliatePromotion.offerId = jsonParser.getValueAsString();
                    return true;
                case 3:
                    iapAffiliatePromotion.productType = jsonParser.getValueAsString();
                    return true;
                case 4:
                    iapAffiliatePromotion.ftDays = jsonParser.getValueAsInt();
                    return true;
                case 5:
                    iapAffiliatePromotion.productId = jsonParser.getValueAsString();
                    return true;
                case 6:
                    iapAffiliatePromotion.iapId = jsonParser.getValueAsString();
                    return true;
                case 7:
                    iapAffiliatePromotion.discount = jsonParser.getValueAsString();
                    return true;
                case 8:
                    iapAffiliatePromotion.promotionHitId = jsonParser.getValueAsLong();
                    return true;
                case 9:
                    iapAffiliatePromotion.promotionName = jsonParser.getValueAsString();
                    return true;
                case 10:
                    iapAffiliatePromotion.promotionType = jsonParser.getValueAsString();
                    return true;
                case 11:
                    iapAffiliatePromotion.extraConfig = IapAffiliatePromotionExtraConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 12:
                    iapAffiliatePromotion.offerType = jsonParser.getValueAsString();
                    return true;
                case 13:
                    iapAffiliatePromotion.displayConfig = JsonAdapter.parseMap(jsonParser, IapAffiliatePromotionDisplaySlot.JSON_ADAPTER, str2);
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(IapAffiliatePromotion iapAffiliatePromotion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2129294769:
                    if (str.equals(StudentVerRejectedReason.startTime)) {
                        b = 0;
                    }
                    break;
                case -1607243192:
                    if (str.equals("endTime")) {
                        b = 1;
                    }
                    break;
                case -1548813161:
                    if (str.equals("offerId")) {
                        b = 2;
                    }
                    break;
                case -1491615543:
                    if (str.equals("productType")) {
                        b = 3;
                    }
                    break;
                case -1265542587:
                    if (str.equals("ftDays")) {
                        b = 4;
                    }
                    break;
                case -1051830678:
                    if (str.equals("productId")) {
                        b = 5;
                    }
                    break;
                case 99969427:
                    if (str.equals("iapId")) {
                        b = 6;
                    }
                    break;
                case 273184065:
                    if (str.equals("discount")) {
                        b = 7;
                    }
                    break;
                case 682525995:
                    if (str.equals("promotionHitId")) {
                        b = 8;
                    }
                    break;
                case 714924494:
                    if (str.equals("promotionName")) {
                        b = 9;
                    }
                    break;
                case 715126397:
                    if (str.equals("promotionType")) {
                        b = 10;
                    }
                    break;
                case 902870898:
                    if (str.equals("extraConfig")) {
                        b = 11;
                    }
                    break;
                case 1944555446:
                    if (str.equals("offerType")) {
                        b = 12;
                    }
                    break;
                case 2022731428:
                    if (str.equals("displayConfig")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    return true;
                default:
                    return super.parseFieldCheck(iapAffiliatePromotion, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                jsonGenerator.writeStringField("discount", str3);
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
            jsonGenerator.writeNumberField(StudentVerRejectedReason.startTime, iapAffiliatePromotion.startTime);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IapAffiliatePromotion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IapAffiliatePromotion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IapAffiliatePromotion new_() {
        IapAffiliatePromotion iapAffiliatePromotion = new IapAffiliatePromotion();
        iapAffiliatePromotion.nullCheck();
        return iapAffiliatePromotion;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IapAffiliatePromotion mo223809clone() {
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
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((IapAffiliatePromotionDisplaySlot) obj).mo223809clone();
                }
            });
        }
        IapAffiliatePromotionExtraConfig iapAffiliatePromotionExtraConfig = this.extraConfig;
        if (iapAffiliatePromotionExtraConfig != null) {
            iapAffiliatePromotion.extraConfig = iapAffiliatePromotionExtraConfig.mo223809clone();
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
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
