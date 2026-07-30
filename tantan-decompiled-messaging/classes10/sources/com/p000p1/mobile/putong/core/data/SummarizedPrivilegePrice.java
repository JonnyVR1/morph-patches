package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.PromotionPrivilegePrices;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class SummarizedPrivilegePrice extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "summarizedprivilegeprice";

    @NonNull
    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
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
    public SummarizedPrivilegesId f171id;

    @ProtobufIndex(index = 6)
    public int num;

    @ProtobufIndex(index = 9)
    public int originalPrice;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int price;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<PromotionPrivilegePrices> promotionPrivilegePrices;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int unitPrice;
    public static ProtobufAdapter<SummarizedPrivilegePrice> PROTOBUF_ADAPTER = new MessageNanoAdapter<SummarizedPrivilegePrice>() { // from class: com.p1.mobile.putong.core.data.SummarizedPrivilegePrice.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SummarizedPrivilegePrice summarizedPrivilegePrice) {
            SummarizedPrivilegesId summarizedPrivilegesId = summarizedPrivilegePrice.f171id;
            int iH = summarizedPrivilegesId != null ? CodedOutputByteBufferNano.h(1, summarizedPrivilegesId.ordinal()) : 0;
            String str = summarizedPrivilegePrice.type;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            int iH2 = iH + CodedOutputByteBufferNano.h(3, summarizedPrivilegePrice.unitPrice);
            String str2 = summarizedPrivilegePrice.coinSign;
            if (str2 != null) {
                iH2 += CodedOutputByteBufferNano.o(4, str2);
            }
            int iH3 = iH2 + CodedOutputByteBufferNano.h(5, summarizedPrivilegePrice.price) + CodedOutputByteBufferNano.h(6, summarizedPrivilegePrice.num);
            SummarizedPrivilegesId summarizedPrivilegesId2 = summarizedPrivilegePrice.f171id;
            if (summarizedPrivilegesId2 != null) {
                iH3 += CodedOutputByteBufferNano.l(7, summarizedPrivilegesId2, SummarizedPrivilegesId.PROTOBUF_ADAPTER);
            }
            List<PromotionPrivilegePrices> list = summarizedPrivilegePrice.promotionPrivilegePrices;
            if (list != null) {
                iH3 += CodedOutputByteBufferNano.l(8, list, PromotionPrivilegePrices.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iH4 = iH3 + CodedOutputByteBufferNano.h(9, summarizedPrivilegePrice.originalPrice);
            String str3 = summarizedPrivilegePrice.business;
            if (str3 != null) {
                iH4 += CodedOutputByteBufferNano.o(10, str3);
            }
            String str4 = summarizedPrivilegePrice.diamondSign;
            if (str4 != null) {
                iH4 += CodedOutputByteBufferNano.o(11, str4);
            }
            ((MessageNano) summarizedPrivilegePrice).cachedSize = iH4;
            return iH4;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SummarizedPrivilegePrice m15816parse(nb5 nb5Var) throws IOException {
            SummarizedPrivilegePrice summarizedPrivilegePrice = new SummarizedPrivilegePrice();
            Integer numValueOf = null;
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (summarizedPrivilegePrice.f171id == null && numValueOf != null) {
                            summarizedPrivilegePrice.f171id = (SummarizedPrivilegesId) SummarizedPrivilegesId.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (summarizedPrivilegePrice.f171id == null) {
                            summarizedPrivilegePrice.f171id = (SummarizedPrivilegesId) SummarizedPrivilegesId.JSON_ADAPTER.defaultEnum();
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
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case 18:
                        summarizedPrivilegePrice.type = nb5Var.s();
                        continue;
                    case 24:
                        summarizedPrivilegePrice.unitPrice = nb5Var.j();
                        continue;
                    case 34:
                        summarizedPrivilegePrice.coinSign = nb5Var.s();
                        continue;
                    case 40:
                        summarizedPrivilegePrice.price = nb5Var.j();
                        continue;
                    case 48:
                        summarizedPrivilegePrice.num = nb5Var.j();
                        continue;
                    case 58:
                        summarizedPrivilegePrice.f171id = (SummarizedPrivilegesId) nb5Var.l(SummarizedPrivilegesId.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        summarizedPrivilegePrice.promotionPrivilegePrices = (List) nb5Var.l(PromotionPrivilegePrices.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 72:
                        summarizedPrivilegePrice.originalPrice = nb5Var.j();
                        continue;
                    case 82:
                        summarizedPrivilegePrice.business = nb5Var.s();
                        continue;
                    case Conversation.LEVEL_TOP_PLATINUM /* 90 */:
                        summarizedPrivilegePrice.diamondSign = nb5Var.s();
                        continue;
                    default:
                        if (summarizedPrivilegePrice.f171id == null && numValueOf != null) {
                            summarizedPrivilegePrice.f171id = (SummarizedPrivilegesId) SummarizedPrivilegesId.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (summarizedPrivilegePrice.f171id == null) {
                            summarizedPrivilegePrice.f171id = (SummarizedPrivilegesId) SummarizedPrivilegesId.JSON_ADAPTER.defaultEnum();
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

        public void serialize(SummarizedPrivilegePrice summarizedPrivilegePrice, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SummarizedPrivilegesId summarizedPrivilegesId = summarizedPrivilegePrice.f171id;
            if (summarizedPrivilegesId != null) {
                codedOutputByteBufferNano.G(1, summarizedPrivilegesId.ordinal());
            }
            String str = summarizedPrivilegePrice.type;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            codedOutputByteBufferNano.G(3, summarizedPrivilegePrice.unitPrice);
            String str2 = summarizedPrivilegePrice.coinSign;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
            codedOutputByteBufferNano.G(5, summarizedPrivilegePrice.price);
            codedOutputByteBufferNano.G(6, summarizedPrivilegePrice.num);
            SummarizedPrivilegesId summarizedPrivilegesId2 = summarizedPrivilegePrice.f171id;
            if (summarizedPrivilegesId2 != null) {
                codedOutputByteBufferNano.K(7, summarizedPrivilegesId2, SummarizedPrivilegesId.PROTOBUF_ADAPTER);
            }
            List<PromotionPrivilegePrices> list = summarizedPrivilegePrice.promotionPrivilegePrices;
            if (list != null) {
                codedOutputByteBufferNano.K(8, list, PromotionPrivilegePrices.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(9, summarizedPrivilegePrice.originalPrice);
            String str3 = summarizedPrivilegePrice.business;
            if (str3 != null) {
                codedOutputByteBufferNano.R(10, str3);
            }
            String str4 = summarizedPrivilegePrice.diamondSign;
            if (str4 != null) {
                codedOutputByteBufferNano.R(11, str4);
            }
        }
    };
    public static JsonAdapter<SummarizedPrivilegePrice> JSON_ADAPTER = new ObjectJsonAdapter<SummarizedPrivilegePrice>() { // from class: com.p1.mobile.putong.core.data.SummarizedPrivilegePrice.2
        public Class getDataClass() {
            return SummarizedPrivilegePrice.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SummarizedPrivilegePrice m15817newInstance() {
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
                    summarizedPrivilegePrice.f171id = (SummarizedPrivilegesId) SummarizedPrivilegesId.JSON_ADAPTER.parse(jsonParser, str2);
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

        public void serializeFields(SummarizedPrivilegePrice summarizedPrivilegePrice, JsonGenerator jsonGenerator) throws IOException {
            if (summarizedPrivilegePrice.f171id != null) {
                jsonGenerator.writeFieldName("id");
                SummarizedPrivilegesId.JSON_ADAPTER.serialize(summarizedPrivilegePrice.f171id, jsonGenerator, true);
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
            jsonGenerator.writeNumberField("price", summarizedPrivilegePrice.price);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SummarizedPrivilegePrice) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SummarizedPrivilegePrice) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SummarizedPrivilegePrice new_() {
        SummarizedPrivilegePrice summarizedPrivilegePrice = new SummarizedPrivilegePrice();
        summarizedPrivilegePrice.nullCheck();
        return summarizedPrivilegePrice;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SummarizedPrivilegePrice m15815clone() {
        SummarizedPrivilegePrice summarizedPrivilegePrice = new SummarizedPrivilegePrice();
        summarizedPrivilegePrice.f171id = this.f171id;
        summarizedPrivilegePrice.type = this.type;
        summarizedPrivilegePrice.unitPrice = this.unitPrice;
        summarizedPrivilegePrice.coinSign = this.coinSign;
        summarizedPrivilegePrice.price = this.price;
        summarizedPrivilegePrice.num = this.num;
        summarizedPrivilegePrice.originalPrice = this.originalPrice;
        List<PromotionPrivilegePrices> list = this.promotionPrivilegePrices;
        if (list != null) {
            summarizedPrivilegePrice.promotionPrivilegePrices = ValueObject.util_map(list, new w9j() { // from class: l.gvg0
                public final Object call(Object obj) {
                    return ((PromotionPrivilegePrices) obj).m15058clone();
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
        return ValueObject.util_equals(this.f171id, summarizedPrivilegePrice.f171id) && ValueObject.util_equals(this.type, summarizedPrivilegePrice.type) && this.unitPrice == summarizedPrivilegePrice.unitPrice && ValueObject.util_equals(this.coinSign, summarizedPrivilegePrice.coinSign) && this.price == summarizedPrivilegePrice.price && this.num == summarizedPrivilegePrice.num && this.originalPrice == summarizedPrivilegePrice.originalPrice && ValueObject.util_equals(this.promotionPrivilegePrices, summarizedPrivilegePrice.promotionPrivilegePrices) && ValueObject.util_equals(this.business, summarizedPrivilegePrice.business) && ValueObject.util_equals(this.diamondSign, summarizedPrivilegePrice.diamondSign);
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
        SummarizedPrivilegesId summarizedPrivilegesId = this.f171id;
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
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

    public void nullCheck() {
        if (this.f171id == null) {
            this.f171id = (SummarizedPrivilegesId) SummarizedPrivilegesId.JSON_ADAPTER.defaultEnum();
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
