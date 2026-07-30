package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.PromotionPrivilegePrices;
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
import java.util.List;
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class SummarizedPrivilegePrice extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "summarizedprivilegeprice";

    @NonNull
    @ProtobufIndex(index = 10)
    public String business;

    @NonNull
    @ProtobufIndex(index = 4)
    public String coinSign;

    @NonNull
    @ProtobufIndex(index = 11)
    public String diamondSign;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public SummarizedPrivilegesId f20509id;

    @ProtobufIndex(index = 6)
    public int num;

    @ProtobufIndex(index = 9)
    public int originalPrice;

    @ProtobufIndex(index = 5)
    public int price;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<PromotionPrivilegePrices> promotionPrivilegePrices;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    @ProtobufIndex(index = 3)
    public int unitPrice;
    public static ProtobufAdapter<SummarizedPrivilegePrice> PROTOBUF_ADAPTER = new MessageNanoAdapter<SummarizedPrivilegePrice>() { // from class: com.p1.mobile.putong.core.data.SummarizedPrivilegePrice.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SummarizedPrivilegePrice summarizedPrivilegePrice) {
            SummarizedPrivilegesId summarizedPrivilegesId = summarizedPrivilegePrice.f20509id;
            int iM17226h = summarizedPrivilegesId != null ? CodedOutputByteBufferNano.m17226h(1, summarizedPrivilegesId.ordinal()) : 0;
            String str = summarizedPrivilegePrice.type;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            int iM17226h2 = iM17226h + CodedOutputByteBufferNano.m17226h(3, summarizedPrivilegePrice.unitPrice);
            String str2 = summarizedPrivilegePrice.coinSign;
            if (str2 != null) {
                iM17226h2 += CodedOutputByteBufferNano.m17233o(4, str2);
            }
            int iM17226h3 = iM17226h2 + CodedOutputByteBufferNano.m17226h(5, summarizedPrivilegePrice.price) + CodedOutputByteBufferNano.m17226h(6, summarizedPrivilegePrice.num);
            SummarizedPrivilegesId summarizedPrivilegesId2 = summarizedPrivilegePrice.f20509id;
            if (summarizedPrivilegesId2 != null) {
                iM17226h3 += CodedOutputByteBufferNano.m17230l(7, summarizedPrivilegesId2, SummarizedPrivilegesId.PROTOBUF_ADAPTER);
            }
            List<PromotionPrivilegePrices> list = summarizedPrivilegePrice.promotionPrivilegePrices;
            if (list != null) {
                iM17226h3 += CodedOutputByteBufferNano.m17230l(8, list, PromotionPrivilegePrices.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17226h4 = iM17226h3 + CodedOutputByteBufferNano.m17226h(9, summarizedPrivilegePrice.originalPrice);
            String str3 = summarizedPrivilegePrice.business;
            if (str3 != null) {
                iM17226h4 += CodedOutputByteBufferNano.m17233o(10, str3);
            }
            String str4 = summarizedPrivilegePrice.diamondSign;
            if (str4 != null) {
                iM17226h4 += CodedOutputByteBufferNano.m17233o(11, str4);
            }
            summarizedPrivilegePrice.cachedSize = iM17226h4;
            return iM17226h4;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SummarizedPrivilegePrice parse(nb5 nb5Var) throws IOException {
            SummarizedPrivilegePrice summarizedPrivilegePrice = new SummarizedPrivilegePrice();
            Integer numValueOf = null;
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (summarizedPrivilegePrice.f20509id == null && numValueOf != null) {
                            summarizedPrivilegePrice.f20509id = (SummarizedPrivilegesId) SummarizedPrivilegesId.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (summarizedPrivilegePrice.f20509id == null) {
                            summarizedPrivilegePrice.f20509id = (SummarizedPrivilegesId) SummarizedPrivilegesId.JSON_ADAPTER.defaultEnum();
                        }
                        if (summarizedPrivilegePrice.type == null) {
                            summarizedPrivilegePrice.type = "";
                        }
                        if (summarizedPrivilegePrice.coinSign == null) {
                            summarizedPrivilegePrice.coinSign = "";
                        }
                        if (summarizedPrivilegePrice.promotionPrivilegePrices == null) {
                            summarizedPrivilegePrice.promotionPrivilegePrices = new ArrayList();
                        }
                        if (summarizedPrivilegePrice.business == null) {
                            summarizedPrivilegePrice.business = "";
                        }
                        if (summarizedPrivilegePrice.diamondSign == null) {
                            summarizedPrivilegePrice.diamondSign = "";
                        }
                        break;
                    case 8:
                        numValueOf = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 18:
                        summarizedPrivilegePrice.type = nb5Var.m158750s();
                        continue;
                    case 24:
                        summarizedPrivilegePrice.unitPrice = nb5Var.m158741j();
                        continue;
                    case 34:
                        summarizedPrivilegePrice.coinSign = nb5Var.m158750s();
                        continue;
                    case 40:
                        summarizedPrivilegePrice.price = nb5Var.m158741j();
                        continue;
                    case 48:
                        summarizedPrivilegePrice.num = nb5Var.m158741j();
                        continue;
                    case 58:
                        summarizedPrivilegePrice.f20509id = (SummarizedPrivilegesId) nb5Var.m158743l(SummarizedPrivilegesId.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        summarizedPrivilegePrice.promotionPrivilegePrices = (List) nb5Var.m158743l(PromotionPrivilegePrices.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 72:
                        summarizedPrivilegePrice.originalPrice = nb5Var.m158741j();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        summarizedPrivilegePrice.business = nb5Var.m158750s();
                        continue;
                    case 90:
                        summarizedPrivilegePrice.diamondSign = nb5Var.m158750s();
                        continue;
                    default:
                        if (summarizedPrivilegePrice.f20509id == null && numValueOf != null) {
                            summarizedPrivilegePrice.f20509id = (SummarizedPrivilegesId) SummarizedPrivilegesId.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (summarizedPrivilegePrice.f20509id == null) {
                            summarizedPrivilegePrice.f20509id = (SummarizedPrivilegesId) SummarizedPrivilegesId.JSON_ADAPTER.defaultEnum();
                        }
                        if (summarizedPrivilegePrice.type == null) {
                            summarizedPrivilegePrice.type = "";
                        }
                        if (summarizedPrivilegePrice.coinSign == null) {
                            summarizedPrivilegePrice.coinSign = "";
                        }
                        if (summarizedPrivilegePrice.promotionPrivilegePrices == null) {
                            summarizedPrivilegePrice.promotionPrivilegePrices = new ArrayList();
                        }
                        if (summarizedPrivilegePrice.business == null) {
                            summarizedPrivilegePrice.business = "";
                        }
                        if (summarizedPrivilegePrice.diamondSign == null) {
                            summarizedPrivilegePrice.diamondSign = "";
                            return summarizedPrivilegePrice;
                        }
                        break;
                }
            }
            return summarizedPrivilegePrice;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SummarizedPrivilegePrice summarizedPrivilegePrice, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SummarizedPrivilegesId summarizedPrivilegesId = summarizedPrivilegePrice.f20509id;
            if (summarizedPrivilegesId != null) {
                codedOutputByteBufferNano.m17250G(1, summarizedPrivilegesId.ordinal());
            }
            String str = summarizedPrivilegePrice.type;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            codedOutputByteBufferNano.m17250G(3, summarizedPrivilegePrice.unitPrice);
            String str2 = summarizedPrivilegePrice.coinSign;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(4, str2);
            }
            codedOutputByteBufferNano.m17250G(5, summarizedPrivilegePrice.price);
            codedOutputByteBufferNano.m17250G(6, summarizedPrivilegePrice.num);
            SummarizedPrivilegesId summarizedPrivilegesId2 = summarizedPrivilegePrice.f20509id;
            if (summarizedPrivilegesId2 != null) {
                codedOutputByteBufferNano.m17254K(7, summarizedPrivilegesId2, SummarizedPrivilegesId.PROTOBUF_ADAPTER);
            }
            List<PromotionPrivilegePrices> list = summarizedPrivilegePrice.promotionPrivilegePrices;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(8, list, PromotionPrivilegePrices.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17250G(9, summarizedPrivilegePrice.originalPrice);
            String str3 = summarizedPrivilegePrice.business;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(10, str3);
            }
            String str4 = summarizedPrivilegePrice.diamondSign;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(11, str4);
            }
        }
    };
    public static JsonAdapter<SummarizedPrivilegePrice> JSON_ADAPTER = new ObjectJsonAdapter<SummarizedPrivilegePrice>() { // from class: com.p1.mobile.putong.core.data.SummarizedPrivilegePrice.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SummarizedPrivilegePrice.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SummarizedPrivilegePrice newInstance() {
            return new SummarizedPrivilegePrice();
        }

        public boolean parseField(SummarizedPrivilegePrice summarizedPrivilegePrice, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "business":
                    summarizedPrivilegePrice.business = jsonParser.getValueAsString();
                    return true;
                case "coinSign":
                    summarizedPrivilegePrice.coinSign = jsonParser.getValueAsString();
                    return true;
                case "unitPrice":
                    summarizedPrivilegePrice.unitPrice = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    summarizedPrivilegePrice.f20509id = SummarizedPrivilegesId.JSON_ADAPTER.parse(jsonParser, str2);
                    return false;
                case "num":
                    summarizedPrivilegePrice.num = jsonParser.getValueAsInt();
                    return true;
                case "type":
                    summarizedPrivilegePrice.type = jsonParser.getValueAsString();
                    return true;
                case "promotionPrivilegePrices":
                    summarizedPrivilegePrice.promotionPrivilegePrices = JsonAdapter.parseArray(jsonParser, PromotionPrivilegePrices.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "price":
                    summarizedPrivilegePrice.price = jsonParser.getValueAsInt();
                    return true;
                case "originalPrice":
                    summarizedPrivilegePrice.originalPrice = jsonParser.getValueAsInt();
                    return true;
                case "diamondSign":
                    summarizedPrivilegePrice.diamondSign = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SummarizedPrivilegePrice summarizedPrivilegePrice, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "business":
                case "coinSign":
                case "unitPrice":
                    return true;
                case "id":
                    return false;
                case "num":
                case "type":
                case "promotionPrivilegePrices":
                case "price":
                case "originalPrice":
                case "diamondSign":
                    return true;
                default:
                    return super.parseFieldCheck(summarizedPrivilegePrice, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SummarizedPrivilegePrice summarizedPrivilegePrice, JsonGenerator jsonGenerator) throws IOException {
            if (summarizedPrivilegePrice.f20509id != null) {
                jsonGenerator.writeFieldName("id");
                SummarizedPrivilegesId.JSON_ADAPTER.serialize(summarizedPrivilegePrice.f20509id, jsonGenerator, true);
            }
            String str = summarizedPrivilegePrice.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            jsonGenerator.writeNumberField("unitPrice", summarizedPrivilegePrice.unitPrice);
            String str2 = summarizedPrivilegePrice.coinSign;
            if (str2 != null) {
                jsonGenerator.writeStringField("coinSign", str2);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.PRICE, summarizedPrivilegePrice.price);
            jsonGenerator.writeNumberField("num", summarizedPrivilegePrice.num);
            jsonGenerator.writeNumberField("originalPrice", summarizedPrivilegePrice.originalPrice);
            if (summarizedPrivilegePrice.promotionPrivilegePrices != null) {
                jsonGenerator.writeFieldName("promotionPrivilegePrices");
                JsonAdapter.serializeArray(summarizedPrivilegePrice.promotionPrivilegePrices, jsonGenerator, PromotionPrivilegePrices.JSON_ADAPTER);
            }
            String str3 = summarizedPrivilegePrice.business;
            if (str3 != null) {
                jsonGenerator.writeStringField("business", str3);
            }
            String str4 = summarizedPrivilegePrice.diamondSign;
            if (str4 != null) {
                jsonGenerator.writeStringField("diamondSign", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SummarizedPrivilegePrice) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SummarizedPrivilegePrice) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SummarizedPrivilegePrice new_() {
        SummarizedPrivilegePrice summarizedPrivilegePrice = new SummarizedPrivilegePrice();
        summarizedPrivilegePrice.nullCheck();
        return summarizedPrivilegePrice;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SummarizedPrivilegePrice mo223809clone() {
        SummarizedPrivilegePrice summarizedPrivilegePrice = new SummarizedPrivilegePrice();
        summarizedPrivilegePrice.f20509id = this.f20509id;
        summarizedPrivilegePrice.type = this.type;
        summarizedPrivilegePrice.unitPrice = this.unitPrice;
        summarizedPrivilegePrice.coinSign = this.coinSign;
        summarizedPrivilegePrice.price = this.price;
        summarizedPrivilegePrice.num = this.num;
        summarizedPrivilegePrice.originalPrice = this.originalPrice;
        List<PromotionPrivilegePrices> list = this.promotionPrivilegePrices;
        if (list != null) {
            summarizedPrivilegePrice.promotionPrivilegePrices = ValueObject.util_map(list, new w9j() { // from class: l.gvg0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((PromotionPrivilegePrices) obj).mo223809clone();
                }
            });
        }
        summarizedPrivilegePrice.business = this.business;
        summarizedPrivilegePrice.diamondSign = this.diamondSign;
        return summarizedPrivilegePrice;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SummarizedPrivilegePrice)) {
            return false;
        }
        SummarizedPrivilegePrice summarizedPrivilegePrice = (SummarizedPrivilegePrice) obj;
        return ValueObject.util_equals(this.f20509id, summarizedPrivilegePrice.f20509id) && ValueObject.util_equals(this.type, summarizedPrivilegePrice.type) && this.unitPrice == summarizedPrivilegePrice.unitPrice && ValueObject.util_equals(this.coinSign, summarizedPrivilegePrice.coinSign) && this.price == summarizedPrivilegePrice.price && this.num == summarizedPrivilegePrice.num && this.originalPrice == summarizedPrivilegePrice.originalPrice && ValueObject.util_equals(this.promotionPrivilegePrices, summarizedPrivilegePrice.promotionPrivilegePrices) && ValueObject.util_equals(this.business, summarizedPrivilegePrice.business) && ValueObject.util_equals(this.diamondSign, summarizedPrivilegePrice.diamondSign);
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
        SummarizedPrivilegesId summarizedPrivilegesId = this.f20509id;
        int iHashCode = (i2 + (summarizedPrivilegesId != null ? summarizedPrivilegesId.hashCode() : 0)) * 41;
        String str = this.type;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 41) + this.unitPrice) * 41;
        String str2 = this.coinSign;
        int iHashCode3 = (((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41) + this.price) * 41) + this.num) * 41) + this.originalPrice) * 41;
        List<PromotionPrivilegePrices> list = this.promotionPrivilegePrices;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.business;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.diamondSign;
        int iHashCode6 = iHashCode5 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20509id == null) {
            this.f20509id = (SummarizedPrivilegesId) SummarizedPrivilegesId.JSON_ADAPTER.defaultEnum();
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.coinSign == null) {
            this.coinSign = "";
        }
        if (this.promotionPrivilegePrices == null) {
            this.promotionPrivilegePrices = new ArrayList();
        }
        if (this.business == null) {
            this.business = "";
        }
        if (this.diamondSign == null) {
            this.diamondSign = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
