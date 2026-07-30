package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
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
public class AffiliateProducts extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "affiliateproducts";

    @NonNull
    @ProtobufIndex(index = 1)
    public String alipay;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String googleplay;

    @NonNull
    @ProtobufIndex(index = 4)
    public String huawei;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String wechat;
    public static ProtobufAdapter<AffiliateProducts> PROTOBUF_ADAPTER = new MessageNanoAdapter<AffiliateProducts>() { // from class: com.p1.mobile.putong.core.data.AffiliateProducts.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AffiliateProducts affiliateProducts) {
            String str = affiliateProducts.alipay;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = affiliateProducts.wechat;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = affiliateProducts.googleplay;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = affiliateProducts.huawei;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) affiliateProducts).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AffiliateProducts m11549parse(nb5 nb5Var) throws IOException {
            AffiliateProducts affiliateProducts = new AffiliateProducts();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (affiliateProducts.alipay == null) {
                        affiliateProducts.alipay = "";
                    }
                    if (affiliateProducts.wechat == null) {
                        affiliateProducts.wechat = "";
                    }
                    if (affiliateProducts.googleplay == null) {
                        affiliateProducts.googleplay = "";
                    }
                    if (affiliateProducts.huawei != null) {
                        break;
                    }
                    affiliateProducts.huawei = "";
                    break;
                }
                if (iU == 10) {
                    affiliateProducts.alipay = nb5Var.s();
                } else if (iU == 18) {
                    affiliateProducts.wechat = nb5Var.s();
                } else if (iU == 26) {
                    affiliateProducts.googleplay = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (affiliateProducts.alipay == null) {
                            affiliateProducts.alipay = "";
                        }
                        if (affiliateProducts.wechat == null) {
                            affiliateProducts.wechat = "";
                        }
                        if (affiliateProducts.googleplay == null) {
                            affiliateProducts.googleplay = "";
                        }
                        if (affiliateProducts.huawei != null) {
                            break;
                        }
                        affiliateProducts.huawei = "";
                        return affiliateProducts;
                    }
                    affiliateProducts.huawei = nb5Var.s();
                }
            }
            return affiliateProducts;
        }

        public void serialize(AffiliateProducts affiliateProducts, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = affiliateProducts.alipay;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = affiliateProducts.wechat;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = affiliateProducts.googleplay;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = affiliateProducts.huawei;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<AffiliateProducts> JSON_ADAPTER = new ObjectJsonAdapter<AffiliateProducts>() { // from class: com.p1.mobile.putong.core.data.AffiliateProducts.2
        public Class getDataClass() {
            return AffiliateProducts.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AffiliateProducts m11550newInstance() {
            return new AffiliateProducts();
        }

        public boolean parseField(AffiliateProducts affiliateProducts, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "googleplay":
                    affiliateProducts.googleplay = jsonParser.getValueAsString();
                    return true;
                case "alipay":
                    affiliateProducts.alipay = jsonParser.getValueAsString();
                    return true;
                case "huawei":
                    affiliateProducts.huawei = jsonParser.getValueAsString();
                    return true;
                case "wechat":
                    affiliateProducts.wechat = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AffiliateProducts affiliateProducts, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "googleplay":
                case "alipay":
                case "huawei":
                case "wechat":
                    return true;
                default:
                    return super.parseFieldCheck(affiliateProducts, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(AffiliateProducts affiliateProducts, JsonGenerator jsonGenerator) throws IOException {
            String str = affiliateProducts.alipay;
            if (str != null) {
                jsonGenerator.writeStringField(PaymentPlatform.alipay, str);
            }
            String str2 = affiliateProducts.wechat;
            if (str2 != null) {
                jsonGenerator.writeStringField(PaymentPlatform.wechat, str2);
            }
            String str3 = affiliateProducts.googleplay;
            if (str3 != null) {
                jsonGenerator.writeStringField("googleplay", str3);
            }
            String str4 = affiliateProducts.huawei;
            if (str4 != null) {
                jsonGenerator.writeStringField("huawei", str4);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AffiliateProducts) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AffiliateProducts) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AffiliateProducts new_() {
        AffiliateProducts affiliateProducts = new AffiliateProducts();
        affiliateProducts.nullCheck();
        return affiliateProducts;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AffiliateProducts m11548clone() {
        AffiliateProducts affiliateProducts = new AffiliateProducts();
        affiliateProducts.alipay = this.alipay;
        affiliateProducts.wechat = this.wechat;
        affiliateProducts.googleplay = this.googleplay;
        affiliateProducts.huawei = this.huawei;
        return affiliateProducts;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AffiliateProducts)) {
            return false;
        }
        AffiliateProducts affiliateProducts = (AffiliateProducts) obj;
        return ValueObject.util_equals(this.alipay, affiliateProducts.alipay) && ValueObject.util_equals(this.wechat, affiliateProducts.wechat) && ValueObject.util_equals(this.googleplay, affiliateProducts.googleplay) && ValueObject.util_equals(this.huawei, affiliateProducts.huawei);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public String getProductId() {
        return IntlCountryCodeController.k() ? this.huawei : this.googleplay;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.alipay;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.wechat;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.googleplay;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.huawei;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.alipay == null) {
            this.alipay = "";
        }
        if (this.wechat == null) {
            this.wechat = "";
        }
        if (this.googleplay == null) {
            this.googleplay = "";
        }
        if (this.huawei == null) {
            this.huawei = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
