package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveSquareSubTab extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSquareSubTab> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSquareSubTab>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSquareSubTab.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSquareSubTab.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSquareSubTab newInstance() {
            return new BLiveSquareSubTab();
        }

        public boolean parseField(BLiveSquareSubTab bLiveSquareSubTab, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bannerType":
                    bLiveSquareSubTab.bannerType = jsonParser.getValueAsString();
                    return true;
                case "pageId":
                    bLiveSquareSubTab.pageId = jsonParser.getValueAsString();
                    return true;
                case "hasBanner":
                    bLiveSquareSubTab.hasBanner = jsonParser.getValueAsBoolean();
                    return true;
                case "id":
                    bLiveSquareSubTab.f44439id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    bLiveSquareSubTab.name = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveSquareSubTab.title = jsonParser.getValueAsString();
                    return true;
                case "showNearby":
                    bLiveSquareSubTab.showNearby = jsonParser.getValueAsBoolean();
                    return true;
                case "layoutColumn":
                    bLiveSquareSubTab.layoutColumn = jsonParser.getValueAsInt();
                    return true;
                case "hasActivityExposure":
                    bLiveSquareSubTab.hasActivityExposure = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSquareSubTab bLiveSquareSubTab, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSquareSubTab.f44439id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveSquareSubTab.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = bLiveSquareSubTab.name;
            if (str3 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str3);
            }
            jsonGenerator.writeBooleanField("hasBanner", bLiveSquareSubTab.hasBanner);
            jsonGenerator.writeNumberField("layoutColumn", bLiveSquareSubTab.layoutColumn);
            String str4 = bLiveSquareSubTab.bannerType;
            if (str4 != null) {
                jsonGenerator.writeStringField("bannerType", str4);
            }
            jsonGenerator.writeBooleanField("showNearby", bLiveSquareSubTab.showNearby);
            jsonGenerator.writeBooleanField("hasActivityExposure", bLiveSquareSubTab.hasActivityExposure);
            String str5 = bLiveSquareSubTab.pageId;
            if (str5 != null) {
                jsonGenerator.writeStringField("pageId", str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSquareSubTab) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesquaresubtab";

    @NonNull
    @ProtobufIndex(index = 6)
    public String bannerType;

    @ProtobufIndex(index = 8)
    public boolean hasActivityExposure;

    @ProtobufIndex(index = 4)
    public boolean hasBanner;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44439id;

    @ProtobufIndex(index = 5)
    public int layoutColumn;

    @NonNull
    @ProtobufIndex(index = 3)
    public String name;

    @NonNull
    @ProtobufIndex(index = 9)
    public String pageId;

    @ProtobufIndex(index = 7)
    public boolean showNearby;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;

    public static BLiveSquareSubTab new_() {
        BLiveSquareSubTab bLiveSquareSubTab = new BLiveSquareSubTab();
        bLiveSquareSubTab.nullCheck();
        return bLiveSquareSubTab;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSquareSubTab mo223809clone() {
        BLiveSquareSubTab bLiveSquareSubTab = new BLiveSquareSubTab();
        bLiveSquareSubTab.f44439id = this.f44439id;
        bLiveSquareSubTab.title = this.title;
        bLiveSquareSubTab.name = this.name;
        bLiveSquareSubTab.hasBanner = this.hasBanner;
        bLiveSquareSubTab.layoutColumn = this.layoutColumn;
        bLiveSquareSubTab.bannerType = this.bannerType;
        bLiveSquareSubTab.showNearby = this.showNearby;
        bLiveSquareSubTab.hasActivityExposure = this.hasActivityExposure;
        bLiveSquareSubTab.pageId = this.pageId;
        return bLiveSquareSubTab;
    }

    public BLiveSquareTab convertToSquareTab() {
        BLiveSquareTab bLiveSquareTabNew_ = BLiveSquareTab.new_();
        bLiveSquareTabNew_.f44441id = this.f44439id;
        bLiveSquareTabNew_.title = this.title;
        bLiveSquareTabNew_.name = this.name;
        bLiveSquareTabNew_.hasBanner = this.hasBanner;
        bLiveSquareTabNew_.layoutColumn = this.layoutColumn;
        bLiveSquareTabNew_.bannerType = this.bannerType;
        bLiveSquareTabNew_.showNearby = this.showNearby;
        bLiveSquareTabNew_.hasActivityExposure = this.hasActivityExposure;
        bLiveSquareTabNew_.pageId = this.pageId;
        return bLiveSquareTabNew_;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSquareSubTab)) {
            return false;
        }
        BLiveSquareSubTab bLiveSquareSubTab = (BLiveSquareSubTab) obj;
        return ValueObject.util_equals(this.f44439id, bLiveSquareSubTab.f44439id) && ValueObject.util_equals(this.title, bLiveSquareSubTab.title) && ValueObject.util_equals(this.name, bLiveSquareSubTab.name) && this.hasBanner == bLiveSquareSubTab.hasBanner && this.layoutColumn == bLiveSquareSubTab.layoutColumn && ValueObject.util_equals(this.bannerType, bLiveSquareSubTab.bannerType) && this.showNearby == bLiveSquareSubTab.showNearby && this.hasActivityExposure == bLiveSquareSubTab.hasActivityExposure && ValueObject.util_equals(this.pageId, bLiveSquareSubTab.pageId);
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
        String str = this.f44439id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.name;
        int iHashCode3 = (((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.hasBanner ? 1231 : 1237)) * 41) + this.layoutColumn) * 41;
        String str4 = this.bannerType;
        int iHashCode4 = (((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.showNearby ? 1231 : 1237)) * 41) + (this.hasActivityExposure ? 1231 : 1237)) * 41;
        String str5 = this.pageId;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44439id == null) {
            this.f44439id = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.bannerType == null) {
            this.bannerType = "";
        }
        if (this.pageId == null) {
            this.pageId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
