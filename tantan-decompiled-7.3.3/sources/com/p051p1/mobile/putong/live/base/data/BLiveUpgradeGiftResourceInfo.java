package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveUpgradeGiftStatusItem;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveUpgradeGiftResourceInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUpgradeGiftResourceInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUpgradeGiftResourceInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUpgradeGiftResourceInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUpgradeGiftResourceInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUpgradeGiftResourceInfo newInstance() {
            return new BLiveUpgradeGiftResourceInfo();
        }

        public boolean parseField(BLiveUpgradeGiftResourceInfo bLiveUpgradeGiftResourceInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "namePicUrl":
                    bLiveUpgradeGiftResourceInfo.namePicUrl = jsonParser.getValueAsString();
                    return true;
                case "shadowId":
                    bLiveUpgradeGiftResourceInfo.shadowId = jsonParser.getValueAsString();
                    return true;
                case "meteorId":
                    bLiveUpgradeGiftResourceInfo.meteorId = jsonParser.getValueAsString();
                    return true;
                case "giftPicUrl":
                    bLiveUpgradeGiftResourceInfo.giftPicUrl = jsonParser.getValueAsString();
                    return true;
                case "cardBgUrls":
                    bLiveUpgradeGiftResourceInfo.cardBgUrls = JsonAdapter.parseArray(jsonParser, BLiveUpgradeGiftStatusItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "buttonPics":
                    bLiveUpgradeGiftResourceInfo.buttonPics = JsonAdapter.parseArray(jsonParser, BLiveUpgradeGiftStatusItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "platformPicId":
                    bLiveUpgradeGiftResourceInfo.platformPicId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUpgradeGiftResourceInfo bLiveUpgradeGiftResourceInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveUpgradeGiftResourceInfo.platformPicId;
            if (str != null) {
                jsonGenerator.writeStringField("platformPicId", str);
            }
            String str2 = bLiveUpgradeGiftResourceInfo.shadowId;
            if (str2 != null) {
                jsonGenerator.writeStringField("shadowId", str2);
            }
            String str3 = bLiveUpgradeGiftResourceInfo.meteorId;
            if (str3 != null) {
                jsonGenerator.writeStringField("meteorId", str3);
            }
            String str4 = bLiveUpgradeGiftResourceInfo.giftPicUrl;
            if (str4 != null) {
                jsonGenerator.writeStringField("giftPicUrl", str4);
            }
            String str5 = bLiveUpgradeGiftResourceInfo.namePicUrl;
            if (str5 != null) {
                jsonGenerator.writeStringField("namePicUrl", str5);
            }
            if (bLiveUpgradeGiftResourceInfo.cardBgUrls != null) {
                jsonGenerator.writeFieldName("cardBgUrls");
                JsonAdapter.serializeArray(bLiveUpgradeGiftResourceInfo.cardBgUrls, jsonGenerator, BLiveUpgradeGiftStatusItem.JSON_ADAPTER);
            }
            if (bLiveUpgradeGiftResourceInfo.buttonPics != null) {
                jsonGenerator.writeFieldName("buttonPics");
                JsonAdapter.serializeArray(bLiveUpgradeGiftResourceInfo.buttonPics, jsonGenerator, BLiveUpgradeGiftStatusItem.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUpgradeGiftResourceInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveupgradegiftresourceinfo";

    @NonNull
    @ProtobufIndex(index = 7)
    public List<BLiveUpgradeGiftStatusItem> buttonPics;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<BLiveUpgradeGiftStatusItem> cardBgUrls;

    @NonNull
    @ProtobufIndex(index = 4)
    public String giftPicUrl;

    @NonNull
    @ProtobufIndex(index = 3)
    public String meteorId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String namePicUrl;

    @NonNull
    @ProtobufIndex(index = 1)
    public String platformPicId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String shadowId;

    public static BLiveUpgradeGiftResourceInfo new_() {
        BLiveUpgradeGiftResourceInfo bLiveUpgradeGiftResourceInfo = new BLiveUpgradeGiftResourceInfo();
        bLiveUpgradeGiftResourceInfo.nullCheck();
        return bLiveUpgradeGiftResourceInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUpgradeGiftResourceInfo mo225055clone() {
        BLiveUpgradeGiftResourceInfo bLiveUpgradeGiftResourceInfo = new BLiveUpgradeGiftResourceInfo();
        bLiveUpgradeGiftResourceInfo.platformPicId = this.platformPicId;
        bLiveUpgradeGiftResourceInfo.shadowId = this.shadowId;
        bLiveUpgradeGiftResourceInfo.meteorId = this.meteorId;
        bLiveUpgradeGiftResourceInfo.giftPicUrl = this.giftPicUrl;
        bLiveUpgradeGiftResourceInfo.namePicUrl = this.namePicUrl;
        List<BLiveUpgradeGiftStatusItem> list = this.cardBgUrls;
        if (list != null) {
            bLiveUpgradeGiftResourceInfo.cardBgUrls = ValueObject.util_map(list, new qcj() { // from class: l.s72
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveUpgradeGiftStatusItem) obj).mo225055clone();
                }
            });
        }
        List<BLiveUpgradeGiftStatusItem> list2 = this.buttonPics;
        if (list2 != null) {
            bLiveUpgradeGiftResourceInfo.buttonPics = ValueObject.util_map(list2, new qcj() { // from class: l.t72
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveUpgradeGiftStatusItem) obj).mo225055clone();
                }
            });
        }
        return bLiveUpgradeGiftResourceInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUpgradeGiftResourceInfo)) {
            return false;
        }
        BLiveUpgradeGiftResourceInfo bLiveUpgradeGiftResourceInfo = (BLiveUpgradeGiftResourceInfo) obj;
        return ValueObject.util_equals(this.platformPicId, bLiveUpgradeGiftResourceInfo.platformPicId) && ValueObject.util_equals(this.shadowId, bLiveUpgradeGiftResourceInfo.shadowId) && ValueObject.util_equals(this.meteorId, bLiveUpgradeGiftResourceInfo.meteorId) && ValueObject.util_equals(this.giftPicUrl, bLiveUpgradeGiftResourceInfo.giftPicUrl) && ValueObject.util_equals(this.namePicUrl, bLiveUpgradeGiftResourceInfo.namePicUrl) && ValueObject.util_equals(this.cardBgUrls, bLiveUpgradeGiftResourceInfo.cardBgUrls) && ValueObject.util_equals(this.buttonPics, bLiveUpgradeGiftResourceInfo.buttonPics);
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
        String str = this.platformPicId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.shadowId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.meteorId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.giftPicUrl;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.namePicUrl;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        List<BLiveUpgradeGiftStatusItem> list = this.cardBgUrls;
        int iHashCode6 = (iHashCode5 + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveUpgradeGiftStatusItem> list2 = this.buttonPics;
        int iHashCode7 = iHashCode6 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.platformPicId == null) {
            this.platformPicId = "";
        }
        if (this.shadowId == null) {
            this.shadowId = "";
        }
        if (this.meteorId == null) {
            this.meteorId = "";
        }
        if (this.giftPicUrl == null) {
            this.giftPicUrl = "";
        }
        if (this.namePicUrl == null) {
            this.namePicUrl = "";
        }
        if (this.cardBgUrls == null) {
            this.cardBgUrls = new ArrayList();
        }
        if (this.buttonPics == null) {
            this.buttonPics = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
