package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveGiftItemCDN extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftItemCDN> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftItemCDN>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftItemCDN.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftItemCDN.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftItemCDN newInstance() {
            return new BLiveGiftItemCDN();
        }

        public boolean parseField(BLiveGiftItemCDN bLiveGiftItemCDN, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "region":
                    bLiveGiftItemCDN.region = jsonParser.getValueAsString();
                    return true;
                case "version":
                    bLiveGiftItemCDN.version = jsonParser.getValueAsString();
                    return true;
                case "giftItemsCDNUrl":
                    bLiveGiftItemCDN.giftItemsCDNUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftItemCDN bLiveGiftItemCDN, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftItemCDN.giftItemsCDNUrl;
            if (str != null) {
                jsonGenerator.writeStringField("giftItemsCDNUrl", str);
            }
            String str2 = bLiveGiftItemCDN.version;
            if (str2 != null) {
                jsonGenerator.writeStringField(WBConstants.AUTH_PARAMS_VERSION, str2);
            }
            String str3 = bLiveGiftItemCDN.region;
            if (str3 != null) {
                jsonGenerator.writeStringField("region", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftItemCDN) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftitemcdn";

    @NonNull
    @ProtobufIndex(index = 1)
    public String giftItemsCDNUrl;

    @NonNull
    @ProtobufIndex(index = 3)
    public String region;

    @NonNull
    @ProtobufIndex(index = 2)
    public String version;

    public static BLiveGiftItemCDN new_() {
        BLiveGiftItemCDN bLiveGiftItemCDN = new BLiveGiftItemCDN();
        bLiveGiftItemCDN.nullCheck();
        return bLiveGiftItemCDN;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftItemCDN mo225055clone() {
        BLiveGiftItemCDN bLiveGiftItemCDN = new BLiveGiftItemCDN();
        bLiveGiftItemCDN.giftItemsCDNUrl = this.giftItemsCDNUrl;
        bLiveGiftItemCDN.version = this.version;
        bLiveGiftItemCDN.region = this.region;
        return bLiveGiftItemCDN;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftItemCDN)) {
            return false;
        }
        BLiveGiftItemCDN bLiveGiftItemCDN = (BLiveGiftItemCDN) obj;
        return ValueObject.util_equals(this.giftItemsCDNUrl, bLiveGiftItemCDN.giftItemsCDNUrl) && ValueObject.util_equals(this.version, bLiveGiftItemCDN.version) && ValueObject.util_equals(this.region, bLiveGiftItemCDN.region);
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
        String str = this.giftItemsCDNUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.version;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.region;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.giftItemsCDNUrl == null) {
            this.giftItemsCDNUrl = "";
        }
        if (this.version == null) {
            this.version = "";
        }
        if (this.region == null) {
            this.region = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
