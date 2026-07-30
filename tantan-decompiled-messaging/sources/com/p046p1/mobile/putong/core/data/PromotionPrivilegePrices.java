package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class PromotionPrivilegePrices extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "promotionprivilegeprices";

    @NonNull
    @ProtobufIndex(index = 4)
    public String coinSign;

    @NonNull
    @ProtobufIndex(index = 5)
    public String diamondSign;

    @ProtobufIndex(index = 3)
    public int num;

    @NonNull
    @ProtobufIndex(index = 1)
    public String page;

    @ProtobufIndex(index = 2)
    public int price;
    public static ProtobufAdapter<PromotionPrivilegePrices> PROTOBUF_ADAPTER = new MessageNanoAdapter<PromotionPrivilegePrices>() { // from class: com.p1.mobile.putong.core.data.PromotionPrivilegePrices.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PromotionPrivilegePrices promotionPrivilegePrices) {
            String str = promotionPrivilegePrices.page;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, promotionPrivilegePrices.price) + CodedOutputByteBufferNano.m17226h(3, promotionPrivilegePrices.num);
            String str2 = promotionPrivilegePrices.coinSign;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str2);
            }
            String str3 = promotionPrivilegePrices.diamondSign;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str3);
            }
            promotionPrivilegePrices.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PromotionPrivilegePrices parse(nb5 nb5Var) throws IOException {
            PromotionPrivilegePrices promotionPrivilegePrices = new PromotionPrivilegePrices();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (promotionPrivilegePrices.page == null) {
                        promotionPrivilegePrices.page = "";
                    }
                    if (promotionPrivilegePrices.coinSign == null) {
                        promotionPrivilegePrices.coinSign = "";
                    }
                    if (promotionPrivilegePrices.diamondSign != null) {
                        break;
                    }
                    promotionPrivilegePrices.diamondSign = "";
                    break;
                }
                if (iM158752u == 10) {
                    promotionPrivilegePrices.page = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    promotionPrivilegePrices.price = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    promotionPrivilegePrices.num = nb5Var.m158741j();
                } else if (iM158752u == 34) {
                    promotionPrivilegePrices.coinSign = nb5Var.m158750s();
                } else {
                    if (iM158752u != 42) {
                        if (promotionPrivilegePrices.page == null) {
                            promotionPrivilegePrices.page = "";
                        }
                        if (promotionPrivilegePrices.coinSign == null) {
                            promotionPrivilegePrices.coinSign = "";
                        }
                        if (promotionPrivilegePrices.diamondSign != null) {
                            break;
                        }
                        promotionPrivilegePrices.diamondSign = "";
                        return promotionPrivilegePrices;
                    }
                    promotionPrivilegePrices.diamondSign = nb5Var.m158750s();
                }
            }
            return promotionPrivilegePrices;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PromotionPrivilegePrices promotionPrivilegePrices, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = promotionPrivilegePrices.page;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, promotionPrivilegePrices.price);
            codedOutputByteBufferNano.m17250G(3, promotionPrivilegePrices.num);
            String str2 = promotionPrivilegePrices.coinSign;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(4, str2);
            }
            String str3 = promotionPrivilegePrices.diamondSign;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(5, str3);
            }
        }
    };
    public static JsonAdapter<PromotionPrivilegePrices> JSON_ADAPTER = new ObjectJsonAdapter<PromotionPrivilegePrices>() { // from class: com.p1.mobile.putong.core.data.PromotionPrivilegePrices.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PromotionPrivilegePrices.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PromotionPrivilegePrices newInstance() {
            return new PromotionPrivilegePrices();
        }

        public boolean parseField(PromotionPrivilegePrices promotionPrivilegePrices, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "coinSign":
                    promotionPrivilegePrices.coinSign = jsonParser.getValueAsString();
                    return true;
                case "num":
                    promotionPrivilegePrices.num = jsonParser.getValueAsInt();
                    return true;
                case "page":
                    promotionPrivilegePrices.page = jsonParser.getValueAsString();
                    return true;
                case "price":
                    promotionPrivilegePrices.price = jsonParser.getValueAsInt();
                    return true;
                case "diamondSign":
                    promotionPrivilegePrices.diamondSign = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PromotionPrivilegePrices promotionPrivilegePrices, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "coinSign":
                case "num":
                case "page":
                case "price":
                case "diamondSign":
                    return true;
                default:
                    return super.parseFieldCheck(promotionPrivilegePrices, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PromotionPrivilegePrices promotionPrivilegePrices, JsonGenerator jsonGenerator) throws IOException {
            String str = promotionPrivilegePrices.page;
            if (str != null) {
                jsonGenerator.writeStringField(OMSTemplateModeType.page, str);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.PRICE, promotionPrivilegePrices.price);
            jsonGenerator.writeNumberField("num", promotionPrivilegePrices.num);
            String str2 = promotionPrivilegePrices.coinSign;
            if (str2 != null) {
                jsonGenerator.writeStringField("coinSign", str2);
            }
            String str3 = promotionPrivilegePrices.diamondSign;
            if (str3 != null) {
                jsonGenerator.writeStringField("diamondSign", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PromotionPrivilegePrices) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PromotionPrivilegePrices) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PromotionPrivilegePrices new_() {
        PromotionPrivilegePrices promotionPrivilegePrices = new PromotionPrivilegePrices();
        promotionPrivilegePrices.nullCheck();
        return promotionPrivilegePrices;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PromotionPrivilegePrices mo223809clone() {
        PromotionPrivilegePrices promotionPrivilegePrices = new PromotionPrivilegePrices();
        promotionPrivilegePrices.page = this.page;
        promotionPrivilegePrices.price = this.price;
        promotionPrivilegePrices.num = this.num;
        promotionPrivilegePrices.coinSign = this.coinSign;
        promotionPrivilegePrices.diamondSign = this.diamondSign;
        return promotionPrivilegePrices;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PromotionPrivilegePrices)) {
            return false;
        }
        PromotionPrivilegePrices promotionPrivilegePrices = (PromotionPrivilegePrices) obj;
        return ValueObject.util_equals(this.page, promotionPrivilegePrices.page) && this.price == promotionPrivilegePrices.price && this.num == promotionPrivilegePrices.num && ValueObject.util_equals(this.coinSign, promotionPrivilegePrices.coinSign) && ValueObject.util_equals(this.diamondSign, promotionPrivilegePrices.diamondSign);
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
        String str = this.page;
        int iHashCode = (((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.price) * 41) + this.num) * 41;
        String str2 = this.coinSign;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.diamondSign;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.page == null) {
            this.page = "";
        }
        if (this.coinSign == null) {
            this.coinSign = "";
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
