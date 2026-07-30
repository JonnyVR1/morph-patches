package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftItem;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceMedalWallItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceMedalWallItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceMedalWallItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceMedalWallItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceMedalWallItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceMedalWallItem newInstance() {
            return new BLiveVoiceMedalWallItem();
        }

        public boolean parseField(BLiveVoiceMedalWallItem bLiveVoiceMedalWallItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    bLiveVoiceMedalWallItem.subTitle = jsonParser.getValueAsString();
                    return true;
                case "bgPicUrl":
                    bLiveVoiceMedalWallItem.bgPicUrl = jsonParser.getValueAsString();
                    return true;
                case "textColor":
                    bLiveVoiceMedalWallItem.textColor = jsonParser.getValueAsString();
                    return true;
                case "status":
                    bLiveVoiceMedalWallItem.status = jsonParser.getValueAsString();
                    return true;
                case "cardColor":
                    bLiveVoiceMedalWallItem.cardColor = jsonParser.getValueAsString();
                    return true;
                case "headerUrl":
                    bLiveVoiceMedalWallItem.headerUrl = BLiveVoiceMedalWallItemHeaderUrl.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    bLiveVoiceMedalWallItem.f44506id = jsonParser.getValueAsInt();
                    return false;
                case "gifts":
                    bLiveVoiceMedalWallItem.gifts = JsonAdapter.parseArray(jsonParser, BLiveVoiceGiftItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    bLiveVoiceMedalWallItem.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceMedalWallItem bLiveVoiceMedalWallItem, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", bLiveVoiceMedalWallItem.f44506id);
            String str = bLiveVoiceMedalWallItem.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = bLiveVoiceMedalWallItem.status;
            if (str2 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str2);
            }
            String str3 = bLiveVoiceMedalWallItem.subTitle;
            if (str3 != null) {
                jsonGenerator.writeStringField("subTitle", str3);
            }
            String str4 = bLiveVoiceMedalWallItem.bgPicUrl;
            if (str4 != null) {
                jsonGenerator.writeStringField("bgPicUrl", str4);
            }
            String str5 = bLiveVoiceMedalWallItem.cardColor;
            if (str5 != null) {
                jsonGenerator.writeStringField("cardColor", str5);
            }
            String str6 = bLiveVoiceMedalWallItem.textColor;
            if (str6 != null) {
                jsonGenerator.writeStringField("textColor", str6);
            }
            if (bLiveVoiceMedalWallItem.headerUrl != null) {
                jsonGenerator.writeFieldName("headerUrl");
                BLiveVoiceMedalWallItemHeaderUrl.JSON_ADAPTER.serialize(bLiveVoiceMedalWallItem.headerUrl, jsonGenerator, true);
            }
            if (bLiveVoiceMedalWallItem.gifts != null) {
                jsonGenerator.writeFieldName("gifts");
                JsonAdapter.serializeArray(bLiveVoiceMedalWallItem.gifts, jsonGenerator, BLiveVoiceGiftItem.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceMedalWallItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicemedalwallitem";

    @NonNull
    @ProtobufIndex(index = 5)
    public String bgPicUrl;

    @NonNull
    @ProtobufIndex(index = 6)
    public String cardColor;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<BLiveVoiceGiftItem> gifts;

    @NonNull
    @ProtobufIndex(index = 9)
    public BLiveVoiceMedalWallItemHeaderUrl headerUrl;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f44506id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String status;

    @NonNull
    @ProtobufIndex(index = 4)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 7)
    public String textColor;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;

    public static BLiveVoiceMedalWallItem new_() {
        BLiveVoiceMedalWallItem bLiveVoiceMedalWallItem = new BLiveVoiceMedalWallItem();
        bLiveVoiceMedalWallItem.nullCheck();
        return bLiveVoiceMedalWallItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceMedalWallItem mo223809clone() {
        BLiveVoiceMedalWallItem bLiveVoiceMedalWallItem = new BLiveVoiceMedalWallItem();
        bLiveVoiceMedalWallItem.f44506id = this.f44506id;
        bLiveVoiceMedalWallItem.title = this.title;
        bLiveVoiceMedalWallItem.status = this.status;
        bLiveVoiceMedalWallItem.subTitle = this.subTitle;
        bLiveVoiceMedalWallItem.bgPicUrl = this.bgPicUrl;
        bLiveVoiceMedalWallItem.cardColor = this.cardColor;
        bLiveVoiceMedalWallItem.textColor = this.textColor;
        BLiveVoiceMedalWallItemHeaderUrl bLiveVoiceMedalWallItemHeaderUrl = this.headerUrl;
        if (bLiveVoiceMedalWallItemHeaderUrl != null) {
            bLiveVoiceMedalWallItem.headerUrl = bLiveVoiceMedalWallItemHeaderUrl.mo223809clone();
        }
        List<BLiveVoiceGiftItem> list = this.gifts;
        if (list != null) {
            bLiveVoiceMedalWallItem.gifts = ValueObject.util_map(list, new w9j() { // from class: l.f92
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveVoiceGiftItem) obj).mo223809clone();
                }
            });
        }
        return bLiveVoiceMedalWallItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceMedalWallItem)) {
            return false;
        }
        BLiveVoiceMedalWallItem bLiveVoiceMedalWallItem = (BLiveVoiceMedalWallItem) obj;
        return this.f44506id == bLiveVoiceMedalWallItem.f44506id && ValueObject.util_equals(this.title, bLiveVoiceMedalWallItem.title) && ValueObject.util_equals(this.status, bLiveVoiceMedalWallItem.status) && ValueObject.util_equals(this.subTitle, bLiveVoiceMedalWallItem.subTitle) && ValueObject.util_equals(this.bgPicUrl, bLiveVoiceMedalWallItem.bgPicUrl) && ValueObject.util_equals(this.cardColor, bLiveVoiceMedalWallItem.cardColor) && ValueObject.util_equals(this.textColor, bLiveVoiceMedalWallItem.textColor) && ValueObject.util_equals(this.headerUrl, bLiveVoiceMedalWallItem.headerUrl) && ValueObject.util_equals(this.gifts, bLiveVoiceMedalWallItem.gifts);
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
        int i2 = ((i * 41) + this.f44506id) * 41;
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.status;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.subTitle;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.bgPicUrl;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.cardColor;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.textColor;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        BLiveVoiceMedalWallItemHeaderUrl bLiveVoiceMedalWallItemHeaderUrl = this.headerUrl;
        int iHashCode7 = (iHashCode6 + (bLiveVoiceMedalWallItemHeaderUrl != null ? bLiveVoiceMedalWallItemHeaderUrl.hashCode() : 0)) * 41;
        List<BLiveVoiceGiftItem> list = this.gifts;
        int iHashCode8 = iHashCode7 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.bgPicUrl == null) {
            this.bgPicUrl = "";
        }
        if (this.cardColor == null) {
            this.cardColor = "";
        }
        if (this.textColor == null) {
            this.textColor = "";
        }
        if (this.headerUrl == null) {
            this.headerUrl = BLiveVoiceMedalWallItemHeaderUrl.new_();
        }
        if (this.gifts == null) {
            this.gifts = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
