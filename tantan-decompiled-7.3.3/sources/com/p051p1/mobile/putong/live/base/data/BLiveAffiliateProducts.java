package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveAffiliateProducts extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAffiliateProducts> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAffiliateProducts>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAffiliateProducts.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAffiliateProducts.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAffiliateProducts newInstance() {
            return new BLiveAffiliateProducts();
        }

        public boolean parseField(BLiveAffiliateProducts bLiveAffiliateProducts, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "googleplay":
                    bLiveAffiliateProducts.googleplay = jsonParser.getValueAsString();
                    return true;
                case "alipay":
                    bLiveAffiliateProducts.alipay = jsonParser.getValueAsString();
                    return true;
                case "huawei":
                    bLiveAffiliateProducts.huawei = jsonParser.getValueAsString();
                    return true;
                case "wechat":
                    bLiveAffiliateProducts.wechat = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAffiliateProducts bLiveAffiliateProducts, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveAffiliateProducts.alipay;
            if (str != null) {
                jsonGenerator.writeStringField("alipay", str);
            }
            String str2 = bLiveAffiliateProducts.wechat;
            if (str2 != null) {
                jsonGenerator.writeStringField("wechat", str2);
            }
            String str3 = bLiveAffiliateProducts.googleplay;
            if (str3 != null) {
                jsonGenerator.writeStringField("googleplay", str3);
            }
            String str4 = bLiveAffiliateProducts.huawei;
            if (str4 != null) {
                jsonGenerator.writeStringField(HardwareEarMonitorUtils.MANUFACTURER_HUAWEI, str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAffiliateProducts) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveaffiliateproducts";

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

    public static BLiveAffiliateProducts new_() {
        BLiveAffiliateProducts bLiveAffiliateProducts = new BLiveAffiliateProducts();
        bLiveAffiliateProducts.nullCheck();
        return bLiveAffiliateProducts;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAffiliateProducts mo225055clone() {
        BLiveAffiliateProducts bLiveAffiliateProducts = new BLiveAffiliateProducts();
        bLiveAffiliateProducts.alipay = this.alipay;
        bLiveAffiliateProducts.wechat = this.wechat;
        bLiveAffiliateProducts.googleplay = this.googleplay;
        bLiveAffiliateProducts.huawei = this.huawei;
        return bLiveAffiliateProducts;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAffiliateProducts)) {
            return false;
        }
        BLiveAffiliateProducts bLiveAffiliateProducts = (BLiveAffiliateProducts) obj;
        return ValueObject.util_equals(this.alipay, bLiveAffiliateProducts.alipay) && ValueObject.util_equals(this.wechat, bLiveAffiliateProducts.wechat) && ValueObject.util_equals(this.googleplay, bLiveAffiliateProducts.googleplay) && ValueObject.util_equals(this.huawei, bLiveAffiliateProducts.huawei);
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
