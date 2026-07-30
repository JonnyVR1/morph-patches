package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.PromotionPrivilegePrices;
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
import java.util.List;
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;
import p153l.qcj;

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
    public SummarizedPrivilegesId f21251id;

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
            SummarizedPrivilegesId summarizedPrivilegesId = summarizedPrivilegePrice.f21251id;
            int iM17281h = summarizedPrivilegesId != null ? CodedOutputByteBufferNano.m17281h(1, summarizedPrivilegesId.ordinal()) : 0;
            String str = summarizedPrivilegePrice.type;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            int iM17281h2 = iM17281h + CodedOutputByteBufferNano.m17281h(3, summarizedPrivilegePrice.unitPrice);
            String str2 = summarizedPrivilegePrice.coinSign;
            if (str2 != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17288o(4, str2);
            }
            int iM17281h3 = iM17281h2 + CodedOutputByteBufferNano.m17281h(5, summarizedPrivilegePrice.price) + CodedOutputByteBufferNano.m17281h(6, summarizedPrivilegePrice.num);
            SummarizedPrivilegesId summarizedPrivilegesId2 = summarizedPrivilegePrice.f21251id;
            if (summarizedPrivilegesId2 != null) {
                iM17281h3 += CodedOutputByteBufferNano.m17285l(7, summarizedPrivilegesId2, SummarizedPrivilegesId.PROTOBUF_ADAPTER);
            }
            List<PromotionPrivilegePrices> list = summarizedPrivilegePrice.promotionPrivilegePrices;
            if (list != null) {
                iM17281h3 += CodedOutputByteBufferNano.m17285l(8, list, PromotionPrivilegePrices.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17281h4 = iM17281h3 + CodedOutputByteBufferNano.m17281h(9, summarizedPrivilegePrice.originalPrice);
            String str3 = summarizedPrivilegePrice.business;
            if (str3 != null) {
                iM17281h4 += CodedOutputByteBufferNano.m17288o(10, str3);
            }
            String str4 = summarizedPrivilegePrice.diamondSign;
            if (str4 != null) {
                iM17281h4 += CodedOutputByteBufferNano.m17288o(11, str4);
            }
            summarizedPrivilegePrice.cachedSize = iM17281h4;
            return iM17281h4;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SummarizedPrivilegePrice parse(nc5 nc5Var) throws IOException {
            SummarizedPrivilegePrice summarizedPrivilegePrice = new SummarizedPrivilegePrice();
            Integer numValueOf = null;
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (summarizedPrivilegePrice.f21251id == null && numValueOf != null) {
                            summarizedPrivilegePrice.f21251id = (SummarizedPrivilegesId) SummarizedPrivilegesId.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (summarizedPrivilegePrice.f21251id == null) {
                            summarizedPrivilegePrice.f21251id = (SummarizedPrivilegesId) SummarizedPrivilegesId.JSON_ADAPTER.defaultEnum();
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
                        numValueOf = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 18:
                        summarizedPrivilegePrice.type = nc5Var.m162495s();
                        continue;
                    case 24:
                        summarizedPrivilegePrice.unitPrice = nc5Var.m162486j();
                        continue;
                    case 34:
                        summarizedPrivilegePrice.coinSign = nc5Var.m162495s();
                        continue;
                    case 40:
                        summarizedPrivilegePrice.price = nc5Var.m162486j();
                        continue;
                    case 48:
                        summarizedPrivilegePrice.num = nc5Var.m162486j();
                        continue;
                    case 58:
                        summarizedPrivilegePrice.f21251id = (SummarizedPrivilegesId) nc5Var.m162488l(SummarizedPrivilegesId.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        summarizedPrivilegePrice.promotionPrivilegePrices = (List) nc5Var.m162488l(PromotionPrivilegePrices.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 72:
                        summarizedPrivilegePrice.originalPrice = nc5Var.m162486j();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        summarizedPrivilegePrice.business = nc5Var.m162495s();
                        continue;
                    case 90:
                        summarizedPrivilegePrice.diamondSign = nc5Var.m162495s();
                        continue;
                    default:
                        if (summarizedPrivilegePrice.f21251id == null && numValueOf != null) {
                            summarizedPrivilegePrice.f21251id = (SummarizedPrivilegesId) SummarizedPrivilegesId.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (summarizedPrivilegePrice.f21251id == null) {
                            summarizedPrivilegePrice.f21251id = (SummarizedPrivilegesId) SummarizedPrivilegesId.JSON_ADAPTER.defaultEnum();
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
            SummarizedPrivilegesId summarizedPrivilegesId = summarizedPrivilegePrice.f21251id;
            if (summarizedPrivilegesId != null) {
                codedOutputByteBufferNano.m17305G(1, summarizedPrivilegesId.ordinal());
            }
            String str = summarizedPrivilegePrice.type;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            codedOutputByteBufferNano.m17305G(3, summarizedPrivilegePrice.unitPrice);
            String str2 = summarizedPrivilegePrice.coinSign;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(4, str2);
            }
            codedOutputByteBufferNano.m17305G(5, summarizedPrivilegePrice.price);
            codedOutputByteBufferNano.m17305G(6, summarizedPrivilegePrice.num);
            SummarizedPrivilegesId summarizedPrivilegesId2 = summarizedPrivilegePrice.f21251id;
            if (summarizedPrivilegesId2 != null) {
                codedOutputByteBufferNano.m17309K(7, summarizedPrivilegesId2, SummarizedPrivilegesId.PROTOBUF_ADAPTER);
            }
            List<PromotionPrivilegePrices> list = summarizedPrivilegePrice.promotionPrivilegePrices;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(8, list, PromotionPrivilegePrices.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17305G(9, summarizedPrivilegePrice.originalPrice);
            String str3 = summarizedPrivilegePrice.business;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(10, str3);
            }
            String str4 = summarizedPrivilegePrice.diamondSign;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(11, str4);
            }
        }
    };
    public static JsonAdapter<SummarizedPrivilegePrice> JSON_ADAPTER = new ObjectJsonAdapter<SummarizedPrivilegePrice>() { // from class: com.p1.mobile.putong.core.data.SummarizedPrivilegePrice.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SummarizedPrivilegePrice.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                    summarizedPrivilegePrice.f21251id = SummarizedPrivilegesId.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SummarizedPrivilegePrice summarizedPrivilegePrice, JsonGenerator jsonGenerator) throws IOException {
            if (summarizedPrivilegePrice.f21251id != null) {
                jsonGenerator.writeFieldName("id");
                SummarizedPrivilegesId.JSON_ADAPTER.serialize(summarizedPrivilegePrice.f21251id, jsonGenerator, true);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SummarizedPrivilegePrice) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public SummarizedPrivilegePrice mo225055clone() {
        SummarizedPrivilegePrice summarizedPrivilegePrice = new SummarizedPrivilegePrice();
        summarizedPrivilegePrice.f21251id = this.f21251id;
        summarizedPrivilegePrice.type = this.type;
        summarizedPrivilegePrice.unitPrice = this.unitPrice;
        summarizedPrivilegePrice.coinSign = this.coinSign;
        summarizedPrivilegePrice.price = this.price;
        summarizedPrivilegePrice.num = this.num;
        summarizedPrivilegePrice.originalPrice = this.originalPrice;
        List<PromotionPrivilegePrices> list = this.promotionPrivilegePrices;
        if (list != null) {
            summarizedPrivilegePrice.promotionPrivilegePrices = ValueObject.util_map(list, new qcj() { // from class: l.o3h0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((PromotionPrivilegePrices) obj).mo225055clone();
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
        return ValueObject.util_equals(this.f21251id, summarizedPrivilegePrice.f21251id) && ValueObject.util_equals(this.type, summarizedPrivilegePrice.type) && this.unitPrice == summarizedPrivilegePrice.unitPrice && ValueObject.util_equals(this.coinSign, summarizedPrivilegePrice.coinSign) && this.price == summarizedPrivilegePrice.price && this.num == summarizedPrivilegePrice.num && this.originalPrice == summarizedPrivilegePrice.originalPrice && ValueObject.util_equals(this.promotionPrivilegePrices, summarizedPrivilegePrice.promotionPrivilegePrices) && ValueObject.util_equals(this.business, summarizedPrivilegePrice.business) && ValueObject.util_equals(this.diamondSign, summarizedPrivilegePrice.diamondSign);
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
        SummarizedPrivilegesId summarizedPrivilegesId = this.f21251id;
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
        if (this.f21251id == null) {
            this.f21251id = (SummarizedPrivilegesId) SummarizedPrivilegesId.JSON_ADAPTER.defaultEnum();
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
