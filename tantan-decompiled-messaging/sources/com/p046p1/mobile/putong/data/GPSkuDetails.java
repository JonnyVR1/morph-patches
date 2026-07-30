package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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

/* JADX INFO: loaded from: classes12.dex */
public class GPSkuDetails extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gpskudetails";

    @Nullable
    @ProtobufIndex(index = 7)
    public String description;

    @ProtobufIndex(index = 8)
    public long introductoryPriceAmountMicros;

    @NonNull
    @ProtobufIndex(index = 3)
    public String price;

    @ProtobufIndex(index = 4)
    public long priceAmountMicros;

    @NonNull
    @ProtobufIndex(index = 5)
    public String priceCurrencyCode;

    @NonNull
    @ProtobufIndex(index = 1)
    public String productId;

    @Nullable
    @ProtobufIndex(index = 6)
    public String title;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<GPSkuDetails> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPSkuDetails>() { // from class: com.p1.mobile.putong.data.GPSkuDetails.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GPSkuDetails gPSkuDetails) {
            String str = gPSkuDetails.productId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = gPSkuDetails.type;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = gPSkuDetails.price;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            int iM17228j = iM17233o + CodedOutputByteBufferNano.m17228j(4, gPSkuDetails.priceAmountMicros);
            String str4 = gPSkuDetails.priceCurrencyCode;
            if (str4 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(5, str4);
            }
            String str5 = gPSkuDetails.title;
            if (str5 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(6, str5);
            }
            String str6 = gPSkuDetails.description;
            if (str6 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(7, str6);
            }
            int iM17228j2 = iM17228j + CodedOutputByteBufferNano.m17228j(8, gPSkuDetails.introductoryPriceAmountMicros);
            gPSkuDetails.cachedSize = iM17228j2;
            return iM17228j2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GPSkuDetails parse(nb5 nb5Var) throws IOException {
            GPSkuDetails gPSkuDetails = new GPSkuDetails();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (gPSkuDetails.productId == null) {
                        gPSkuDetails.productId = "";
                    }
                    if (gPSkuDetails.type == null) {
                        gPSkuDetails.type = "";
                    }
                    if (gPSkuDetails.price == null) {
                        gPSkuDetails.price = "";
                    }
                    if (gPSkuDetails.priceCurrencyCode != null) {
                        break;
                    }
                    gPSkuDetails.priceCurrencyCode = "";
                    break;
                }
                if (iM158752u == 10) {
                    gPSkuDetails.productId = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    gPSkuDetails.type = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    gPSkuDetails.price = nb5Var.m158750s();
                } else if (iM158752u == 32) {
                    gPSkuDetails.priceAmountMicros = nb5Var.m158742k();
                } else if (iM158752u == 42) {
                    gPSkuDetails.priceCurrencyCode = nb5Var.m158750s();
                } else if (iM158752u == 50) {
                    gPSkuDetails.title = nb5Var.m158750s();
                } else if (iM158752u == 58) {
                    gPSkuDetails.description = nb5Var.m158750s();
                } else {
                    if (iM158752u != 64) {
                        if (gPSkuDetails.productId == null) {
                            gPSkuDetails.productId = "";
                        }
                        if (gPSkuDetails.type == null) {
                            gPSkuDetails.type = "";
                        }
                        if (gPSkuDetails.price == null) {
                            gPSkuDetails.price = "";
                        }
                        if (gPSkuDetails.priceCurrencyCode != null) {
                            break;
                        }
                        gPSkuDetails.priceCurrencyCode = "";
                        return gPSkuDetails;
                    }
                    gPSkuDetails.introductoryPriceAmountMicros = nb5Var.m158742k();
                }
            }
            return gPSkuDetails;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GPSkuDetails gPSkuDetails, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = gPSkuDetails.productId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = gPSkuDetails.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = gPSkuDetails.price;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            codedOutputByteBufferNano.m17252I(4, gPSkuDetails.priceAmountMicros);
            String str4 = gPSkuDetails.priceCurrencyCode;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(5, str4);
            }
            String str5 = gPSkuDetails.title;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(6, str5);
            }
            String str6 = gPSkuDetails.description;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(7, str6);
            }
            codedOutputByteBufferNano.m17252I(8, gPSkuDetails.introductoryPriceAmountMicros);
        }
    };
    public static JsonAdapter<GPSkuDetails> JSON_ADAPTER = new ObjectJsonAdapter<GPSkuDetails>() { // from class: com.p1.mobile.putong.data.GPSkuDetails.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GPSkuDetails.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GPSkuDetails newInstance() {
            return new GPSkuDetails();
        }

        public boolean parseField(GPSkuDetails gPSkuDetails, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    gPSkuDetails.description = jsonParser.getValueAsString();
                    return true;
                case "introductoryPriceAmountMicros":
                    gPSkuDetails.introductoryPriceAmountMicros = jsonParser.getValueAsLong();
                    return true;
                case "productId":
                    gPSkuDetails.productId = jsonParser.getValueAsString();
                    return true;
                case "type":
                    gPSkuDetails.type = jsonParser.getValueAsString();
                    return true;
                case "price":
                    gPSkuDetails.price = jsonParser.getValueAsString();
                    return true;
                case "title":
                    gPSkuDetails.title = jsonParser.getValueAsString();
                    return true;
                case "price_amount_micros":
                    gPSkuDetails.priceAmountMicros = jsonParser.getValueAsLong();
                    return true;
                case "price_currency_code":
                    gPSkuDetails.priceCurrencyCode = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GPSkuDetails gPSkuDetails, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "description":
                case "introductoryPriceAmountMicros":
                case "productId":
                case "type":
                case "price":
                case "title":
                case "price_amount_micros":
                case "price_currency_code":
                    return true;
                default:
                    return super.parseFieldCheck(gPSkuDetails, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GPSkuDetails gPSkuDetails, JsonGenerator jsonGenerator) throws IOException {
            String str = gPSkuDetails.productId;
            if (str != null) {
                jsonGenerator.writeStringField("productId", str);
            }
            String str2 = gPSkuDetails.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = gPSkuDetails.price;
            if (str3 != null) {
                jsonGenerator.writeStringField(FirebaseAnalytics.Param.PRICE, str3);
            }
            jsonGenerator.writeNumberField("price_amount_micros", gPSkuDetails.priceAmountMicros);
            String str4 = gPSkuDetails.priceCurrencyCode;
            if (str4 != null) {
                jsonGenerator.writeStringField("price_currency_code", str4);
            }
            String str5 = gPSkuDetails.title;
            if (str5 != null) {
                jsonGenerator.writeStringField("title", str5);
            }
            String str6 = gPSkuDetails.description;
            if (str6 != null) {
                jsonGenerator.writeStringField("description", str6);
            }
            jsonGenerator.writeNumberField("introductoryPriceAmountMicros", gPSkuDetails.introductoryPriceAmountMicros);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPSkuDetails) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPSkuDetails) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPSkuDetails new_() {
        GPSkuDetails gPSkuDetails = new GPSkuDetails();
        gPSkuDetails.nullCheck();
        return gPSkuDetails;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GPSkuDetails mo223809clone() {
        GPSkuDetails gPSkuDetails = new GPSkuDetails();
        gPSkuDetails.productId = this.productId;
        gPSkuDetails.type = this.type;
        gPSkuDetails.price = this.price;
        gPSkuDetails.priceAmountMicros = this.priceAmountMicros;
        gPSkuDetails.priceCurrencyCode = this.priceCurrencyCode;
        gPSkuDetails.title = this.title;
        gPSkuDetails.description = this.description;
        gPSkuDetails.introductoryPriceAmountMicros = this.introductoryPriceAmountMicros;
        return gPSkuDetails;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GPSkuDetails)) {
            return false;
        }
        GPSkuDetails gPSkuDetails = (GPSkuDetails) obj;
        return ValueObject.util_equals(this.productId, gPSkuDetails.productId) && ValueObject.util_equals(this.type, gPSkuDetails.type) && ValueObject.util_equals(this.price, gPSkuDetails.price) && this.priceAmountMicros == gPSkuDetails.priceAmountMicros && ValueObject.util_equals(this.priceCurrencyCode, gPSkuDetails.priceCurrencyCode) && ValueObject.util_equals(this.title, gPSkuDetails.title) && ValueObject.util_equals(this.description, gPSkuDetails.description) && this.introductoryPriceAmountMicros == gPSkuDetails.introductoryPriceAmountMicros;
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
        String str = this.productId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.price;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        long j = this.priceAmountMicros;
        int i3 = (((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str4 = this.priceCurrencyCode;
        int iHashCode4 = (i3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.title;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.description;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        long j2 = this.introductoryPriceAmountMicros;
        int i4 = iHashCode6 + ((int) (j2 ^ (j2 >>> 32)));
        this.hashCode = i4;
        return i4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.productId == null) {
            this.productId = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.price == null) {
            this.price = "";
        }
        if (this.priceCurrencyCode == null) {
            this.priceCurrencyCode = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
