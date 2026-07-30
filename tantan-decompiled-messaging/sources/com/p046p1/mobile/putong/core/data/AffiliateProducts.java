package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class AffiliateProducts extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "affiliateproducts";

    @NonNull
    @ProtobufIndex(index = 1)
    public String alipay;

    @NonNull
    @ProtobufIndex(index = 3)
    public String googleplay;

    @NonNull
    @ProtobufIndex(index = 4)
    public String huawei;

    @NonNull
    @ProtobufIndex(index = 2)
    public String wechat;
    public static ProtobufAdapter<AffiliateProducts> PROTOBUF_ADAPTER = new MessageNanoAdapter<AffiliateProducts>() { // from class: com.p1.mobile.putong.core.data.AffiliateProducts.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AffiliateProducts affiliateProducts) {
            String str = affiliateProducts.alipay;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = affiliateProducts.wechat;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = affiliateProducts.googleplay;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = affiliateProducts.huawei;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            affiliateProducts.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AffiliateProducts parse(nb5 nb5Var) throws IOException {
            AffiliateProducts affiliateProducts = new AffiliateProducts();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    affiliateProducts.alipay = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    affiliateProducts.wechat = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    affiliateProducts.googleplay = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
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
                    affiliateProducts.huawei = nb5Var.m158750s();
                }
            }
            return affiliateProducts;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AffiliateProducts affiliateProducts, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = affiliateProducts.alipay;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = affiliateProducts.wechat;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = affiliateProducts.googleplay;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = affiliateProducts.huawei;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
        }
    };
    public static JsonAdapter<AffiliateProducts> JSON_ADAPTER = new ObjectJsonAdapter<AffiliateProducts>() { // from class: com.p1.mobile.putong.core.data.AffiliateProducts.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AffiliateProducts.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AffiliateProducts newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AffiliateProducts affiliateProducts, JsonGenerator jsonGenerator) throws IOException {
            String str = affiliateProducts.alipay;
            if (str != null) {
                jsonGenerator.writeStringField("alipay", str);
            }
            String str2 = affiliateProducts.wechat;
            if (str2 != null) {
                jsonGenerator.writeStringField("wechat", str2);
            }
            String str3 = affiliateProducts.googleplay;
            if (str3 != null) {
                jsonGenerator.writeStringField("googleplay", str3);
            }
            String str4 = affiliateProducts.huawei;
            if (str4 != null) {
                jsonGenerator.writeStringField(HardwareEarMonitorUtils.MANUFACTURER_HUAWEI, str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AffiliateProducts) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AffiliateProducts) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AffiliateProducts new_() {
        AffiliateProducts affiliateProducts = new AffiliateProducts();
        affiliateProducts.nullCheck();
        return affiliateProducts;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AffiliateProducts mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public String getProductId() {
        return IntlCountryCodeController.m28115k() ? this.huawei : this.googleplay;
    }

    public int hashCode() {
        int i = this.hashCode;
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
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
