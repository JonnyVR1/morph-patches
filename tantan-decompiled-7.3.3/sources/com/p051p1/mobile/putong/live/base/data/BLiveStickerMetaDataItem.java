package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.LocationInvisibleField;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveStickerMetaDataItem;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveStickerMetaDataItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveStickerMetaDataItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveStickerMetaDataItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveStickerMetaDataItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveStickerMetaDataItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveStickerMetaDataItem newInstance() {
            return new BLiveStickerMetaDataItem();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveStickerMetaDataItem bLiveStickerMetaDataItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1964681502:
                    if (str.equals("clickable")) {
                        b = 0;
                    }
                    break;
                case -1578719899:
                    if (str.equals("adminUserName")) {
                        b = 1;
                    }
                    break;
                case -1549073782:
                    if (str.equals("defaultPosition")) {
                        b = 2;
                    }
                    break;
                case -1339319560:
                    if (str.equals("defaultContent")) {
                        b = 3;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 4;
                    }
                    break;
                case -569781720:
                    if (str.equals(LocationInvisibleField.updatedTime)) {
                        b = 5;
                    }
                    break;
                case -559170783:
                    if (str.equals("maxWordCount")) {
                        b = 6;
                    }
                    break;
                case -489909803:
                    if (str.equals("createdTime")) {
                        b = 7;
                    }
                    break;
                case -389704538:
                    if (str.equals("contentArea")) {
                        b = 8;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 9;
                    }
                    break;
                case 116079:
                    if (str.equals("url")) {
                        b = 10;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = 11;
                    }
                    break;
                case 3492908:
                    if (str.equals(BLivePkCategory.rank)) {
                        b = 12;
                    }
                    break;
                case 27382036:
                    if (str.equals("giftCfg")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 50511102:
                    if (str.equals("category")) {
                        b = 14;
                    }
                    break;
                case 94842723:
                    if (str.equals("color")) {
                        b = 15;
                    }
                    break;
                case 351608024:
                    if (str.equals(WBConstants.AUTH_PARAMS_VERSION)) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 365601008:
                    if (str.equals("fontSize")) {
                        b = 17;
                    }
                    break;
                case 1173902155:
                    if (str.equals("animationUrl")) {
                        b = 18;
                    }
                    break;
                case 1901919544:
                    if (str.equals("stretchRange")) {
                        b = 19;
                    }
                    break;
                case 1912285522:
                    if (str.equals("boldText")) {
                        b = 20;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveStickerMetaDataItem.clickable = jsonParser.getValueAsBoolean();
                    return true;
                case 1:
                    bLiveStickerMetaDataItem.adminUserName = jsonParser.getValueAsString();
                    return true;
                case 2:
                    bLiveStickerMetaDataItem.defaultPosition = BLivePosition.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    bLiveStickerMetaDataItem.defaultContent = jsonParser.getValueAsString();
                    return true;
                case 4:
                    bLiveStickerMetaDataItem.status = jsonParser.getValueAsString();
                    return true;
                case 5:
                    bLiveStickerMetaDataItem.updatedTime = jsonParser.getValueAsLong();
                    return true;
                case 6:
                    bLiveStickerMetaDataItem.maxWordCount = jsonParser.getValueAsInt();
                    return true;
                case 7:
                    bLiveStickerMetaDataItem.createdTime = jsonParser.getValueAsLong();
                    return true;
                case 8:
                    bLiveStickerMetaDataItem.contentArea = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    bLiveStickerMetaDataItem.f45290id = jsonParser.getValueAsString();
                    return false;
                case 10:
                    bLiveStickerMetaDataItem.url = jsonParser.getValueAsString();
                    return true;
                case 11:
                    bLiveStickerMetaDataItem.name = jsonParser.getValueAsString();
                    return true;
                case 12:
                    bLiveStickerMetaDataItem.rank = jsonParser.getValueAsInt();
                    return true;
                case 13:
                    bLiveStickerMetaDataItem.giftCfg = BLiveGiftCfg.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 14:
                    bLiveStickerMetaDataItem.category = jsonParser.getValueAsString();
                    return true;
                case 15:
                    bLiveStickerMetaDataItem.color = jsonParser.getValueAsString();
                    return true;
                case 16:
                    bLiveStickerMetaDataItem.version = jsonParser.getValueAsLong();
                    return true;
                case 17:
                    bLiveStickerMetaDataItem.fontSize = jsonParser.getValueAsInt();
                    return true;
                case 18:
                    bLiveStickerMetaDataItem.animationUrl = jsonParser.getValueAsString();
                    return true;
                case 19:
                    bLiveStickerMetaDataItem.stretchRange = BLiveStretchRange.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 20:
                    bLiveStickerMetaDataItem.boldText = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveStickerMetaDataItem bLiveStickerMetaDataItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveStickerMetaDataItem.f45290id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveStickerMetaDataItem.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = bLiveStickerMetaDataItem.category;
            if (str3 != null) {
                jsonGenerator.writeStringField("category", str3);
            }
            String str4 = bLiveStickerMetaDataItem.url;
            if (str4 != null) {
                jsonGenerator.writeStringField("url", str4);
            }
            String str5 = bLiveStickerMetaDataItem.animationUrl;
            if (str5 != null) {
                jsonGenerator.writeStringField("animationUrl", str5);
            }
            jsonGenerator.writeNumberField("maxWordCount", bLiveStickerMetaDataItem.maxWordCount);
            String str6 = bLiveStickerMetaDataItem.defaultContent;
            if (str6 != null) {
                jsonGenerator.writeStringField("defaultContent", str6);
            }
            jsonGenerator.writeNumberField(BLivePkCategory.rank, bLiveStickerMetaDataItem.rank);
            jsonGenerator.writeBooleanField("clickable", bLiveStickerMetaDataItem.clickable);
            if (bLiveStickerMetaDataItem.defaultPosition != null) {
                jsonGenerator.writeFieldName("defaultPosition");
                BLivePosition.JSON_ADAPTER.serialize(bLiveStickerMetaDataItem.defaultPosition, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField(WBConstants.AUTH_PARAMS_VERSION, bLiveStickerMetaDataItem.version);
            jsonGenerator.writeNumberField("createdTime", bLiveStickerMetaDataItem.createdTime);
            jsonGenerator.writeNumberField(LocationInvisibleField.updatedTime, bLiveStickerMetaDataItem.updatedTime);
            String str7 = bLiveStickerMetaDataItem.status;
            if (str7 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str7);
            }
            String str8 = bLiveStickerMetaDataItem.adminUserName;
            if (str8 != null) {
                jsonGenerator.writeStringField("adminUserName", str8);
            }
            jsonGenerator.writeNumberField("fontSize", bLiveStickerMetaDataItem.fontSize);
            String str9 = bLiveStickerMetaDataItem.color;
            if (str9 != null) {
                jsonGenerator.writeStringField("color", str9);
            }
            jsonGenerator.writeBooleanField("boldText", bLiveStickerMetaDataItem.boldText);
            if (bLiveStickerMetaDataItem.giftCfg != null) {
                jsonGenerator.writeFieldName("giftCfg");
                BLiveGiftCfg.JSON_ADAPTER.serialize(bLiveStickerMetaDataItem.giftCfg, jsonGenerator, true);
            }
            if (bLiveStickerMetaDataItem.stretchRange != null) {
                jsonGenerator.writeFieldName("stretchRange");
                BLiveStretchRange.JSON_ADAPTER.serialize(bLiveStickerMetaDataItem.stretchRange, jsonGenerator, true);
            }
            if (bLiveStickerMetaDataItem.contentArea != null) {
                jsonGenerator.writeFieldName("contentArea");
                JsonAdapter.serializeArray(bLiveStickerMetaDataItem.contentArea, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveStickerMetaDataItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivestickermetadataitem";

    @NonNull
    @ProtobufIndex(index = 15)
    public String adminUserName;

    @NonNull
    @ProtobufIndex(index = 5)
    public String animationUrl;

    @ProtobufIndex(index = 18)
    public boolean boldText;

    @NonNull
    @ProtobufIndex(index = 3)
    public String category;

    @ProtobufIndex(index = 9)
    public boolean clickable;

    @NonNull
    @ProtobufIndex(index = 17)
    public String color;

    @NonNull
    @ProtobufIndex(index = 21)
    public List<Integer> contentArea;

    @ProtobufIndex(index = 12)
    public long createdTime;

    @NonNull
    @ProtobufIndex(index = 7)
    public String defaultContent;

    @NonNull
    @ProtobufIndex(index = 10)
    public BLivePosition defaultPosition;

    @ProtobufIndex(index = 16)
    public int fontSize;

    @NonNull
    @ProtobufIndex(index = 19)
    public BLiveGiftCfg giftCfg;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45290id;
    public boolean isSelected = false;

    @ProtobufIndex(index = 6)
    public int maxWordCount;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @ProtobufIndex(index = 8)
    public int rank;

    @NonNull
    @ProtobufIndex(index = 14)
    public String status;

    @NonNull
    @ProtobufIndex(index = 20)
    public BLiveStretchRange stretchRange;

    @ProtobufIndex(index = 13)
    public long updatedTime;

    @NonNull
    @ProtobufIndex(index = 4)
    public String url;

    @ProtobufIndex(index = 11)
    public long version;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m69426a(Integer num) {
        return num;
    }

    public static BLiveStickerMetaDataItem new_() {
        BLiveStickerMetaDataItem bLiveStickerMetaDataItem = new BLiveStickerMetaDataItem();
        bLiveStickerMetaDataItem.nullCheck();
        return bLiveStickerMetaDataItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveStickerMetaDataItem mo225055clone() {
        BLiveStickerMetaDataItem bLiveStickerMetaDataItem = new BLiveStickerMetaDataItem();
        bLiveStickerMetaDataItem.f45290id = this.f45290id;
        bLiveStickerMetaDataItem.name = this.name;
        bLiveStickerMetaDataItem.category = this.category;
        bLiveStickerMetaDataItem.url = this.url;
        bLiveStickerMetaDataItem.animationUrl = this.animationUrl;
        bLiveStickerMetaDataItem.maxWordCount = this.maxWordCount;
        bLiveStickerMetaDataItem.defaultContent = this.defaultContent;
        bLiveStickerMetaDataItem.rank = this.rank;
        bLiveStickerMetaDataItem.clickable = this.clickable;
        BLivePosition bLivePosition = this.defaultPosition;
        if (bLivePosition != null) {
            bLiveStickerMetaDataItem.defaultPosition = bLivePosition.mo225055clone();
        }
        bLiveStickerMetaDataItem.version = this.version;
        bLiveStickerMetaDataItem.createdTime = this.createdTime;
        bLiveStickerMetaDataItem.updatedTime = this.updatedTime;
        bLiveStickerMetaDataItem.status = this.status;
        bLiveStickerMetaDataItem.adminUserName = this.adminUserName;
        bLiveStickerMetaDataItem.fontSize = this.fontSize;
        bLiveStickerMetaDataItem.color = this.color;
        bLiveStickerMetaDataItem.boldText = this.boldText;
        BLiveGiftCfg bLiveGiftCfg = this.giftCfg;
        if (bLiveGiftCfg != null) {
            bLiveStickerMetaDataItem.giftCfg = bLiveGiftCfg.mo225055clone();
        }
        BLiveStretchRange bLiveStretchRange = this.stretchRange;
        if (bLiveStretchRange != null) {
            bLiveStickerMetaDataItem.stretchRange = bLiveStretchRange.mo225055clone();
        }
        List<Integer> list = this.contentArea;
        if (list != null) {
            bLiveStickerMetaDataItem.contentArea = ValueObject.util_map(list, new qcj() { // from class: l.k62
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveStickerMetaDataItem.m69426a((Integer) obj);
                }
            });
        }
        return bLiveStickerMetaDataItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveStickerMetaDataItem)) {
            return false;
        }
        BLiveStickerMetaDataItem bLiveStickerMetaDataItem = (BLiveStickerMetaDataItem) obj;
        return ValueObject.util_equals(this.f45290id, bLiveStickerMetaDataItem.f45290id) && ValueObject.util_equals(this.name, bLiveStickerMetaDataItem.name) && ValueObject.util_equals(this.category, bLiveStickerMetaDataItem.category) && ValueObject.util_equals(this.url, bLiveStickerMetaDataItem.url) && ValueObject.util_equals(this.animationUrl, bLiveStickerMetaDataItem.animationUrl) && this.maxWordCount == bLiveStickerMetaDataItem.maxWordCount && ValueObject.util_equals(this.defaultContent, bLiveStickerMetaDataItem.defaultContent) && this.rank == bLiveStickerMetaDataItem.rank && this.clickable == bLiveStickerMetaDataItem.clickable && ValueObject.util_equals(this.defaultPosition, bLiveStickerMetaDataItem.defaultPosition) && this.version == bLiveStickerMetaDataItem.version && this.createdTime == bLiveStickerMetaDataItem.createdTime && this.updatedTime == bLiveStickerMetaDataItem.updatedTime && ValueObject.util_equals(this.status, bLiveStickerMetaDataItem.status) && ValueObject.util_equals(this.adminUserName, bLiveStickerMetaDataItem.adminUserName) && this.fontSize == bLiveStickerMetaDataItem.fontSize && ValueObject.util_equals(this.color, bLiveStickerMetaDataItem.color) && this.boldText == bLiveStickerMetaDataItem.boldText && ValueObject.util_equals(this.giftCfg, bLiveStickerMetaDataItem.giftCfg) && ValueObject.util_equals(this.stretchRange, bLiveStickerMetaDataItem.stretchRange) && ValueObject.util_equals(this.contentArea, bLiveStickerMetaDataItem.contentArea);
    }

    public BLiveAddStickerResult fillResult(BLiveAddStickerResult bLiveAddStickerResult) {
        bLiveAddStickerResult.category = this.category;
        bLiveAddStickerResult.url = this.url;
        bLiveAddStickerResult.animationUrl = this.animationUrl;
        bLiveAddStickerResult.maxCount = this.maxWordCount;
        bLiveAddStickerResult.fontSize = this.fontSize;
        bLiveAddStickerResult.color = this.color;
        bLiveAddStickerResult.boldText = this.boldText;
        bLiveAddStickerResult.templateId = this.f45290id;
        bLiveAddStickerResult.stretchRange = this.stretchRange;
        bLiveAddStickerResult.contentArea = this.contentArea;
        return bLiveAddStickerResult;
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
        String str = this.f45290id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.category;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.url;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.animationUrl;
        int iHashCode5 = (((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41) + this.maxWordCount) * 41;
        String str6 = this.defaultContent;
        int iHashCode6 = (((((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41) + this.rank) * 41) + (this.clickable ? 1231 : 1237)) * 41;
        BLivePosition bLivePosition = this.defaultPosition;
        int iHashCode7 = bLivePosition != null ? bLivePosition.hashCode() : 0;
        long j = this.version;
        int i3 = (((iHashCode6 + iHashCode7) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.createdTime;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.updatedTime;
        int i5 = (i4 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        String str7 = this.status;
        int iHashCode8 = (i5 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.adminUserName;
        int iHashCode9 = (((iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 41) + this.fontSize) * 41;
        String str9 = this.color;
        int iHashCode10 = (((iHashCode9 + (str9 != null ? str9.hashCode() : 0)) * 41) + (this.boldText ? 1231 : 1237)) * 41;
        BLiveGiftCfg bLiveGiftCfg = this.giftCfg;
        int iHashCode11 = (iHashCode10 + (bLiveGiftCfg != null ? bLiveGiftCfg.hashCode() : 0)) * 41;
        BLiveStretchRange bLiveStretchRange = this.stretchRange;
        int iHashCode12 = (iHashCode11 + (bLiveStretchRange != null ? bLiveStretchRange.hashCode() : 0)) * 41;
        List<Integer> list = this.contentArea;
        int iHashCode13 = iHashCode12 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode13;
        return iHashCode13;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45290id == null) {
            this.f45290id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.category == null) {
            this.category = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.animationUrl == null) {
            this.animationUrl = "";
        }
        if (this.defaultContent == null) {
            this.defaultContent = "";
        }
        if (this.defaultPosition == null) {
            this.defaultPosition = BLivePosition.new_();
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.adminUserName == null) {
            this.adminUserName = "";
        }
        if (this.color == null) {
            this.color = "";
        }
        if (this.giftCfg == null) {
            this.giftCfg = BLiveGiftCfg.new_();
        }
        if (this.stretchRange == null) {
            this.stretchRange = BLiveStretchRange.new_();
        }
        if (this.contentArea == null) {
            this.contentArea = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
