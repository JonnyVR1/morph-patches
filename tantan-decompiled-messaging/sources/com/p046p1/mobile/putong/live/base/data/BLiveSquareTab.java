package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareSubTab;
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
public class BLiveSquareTab extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSquareTab> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSquareTab>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSquareTab.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSquareTab.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSquareTab newInstance() {
            return new BLiveSquareTab();
        }

        public boolean parseField(BLiveSquareTab bLiveSquareTab, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTabs":
                    bLiveSquareTab.subTabs = JsonAdapter.parseArray(jsonParser, BLiveSquareSubTab.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "bannerType":
                    bLiveSquareTab.bannerType = jsonParser.getValueAsString();
                    return true;
                case "pageId":
                    bLiveSquareTab.pageId = jsonParser.getValueAsString();
                    return true;
                case "hasBanner":
                    bLiveSquareTab.hasBanner = jsonParser.getValueAsBoolean();
                    return true;
                case "hasRedDot":
                    bLiveSquareTab.hasRedDot = jsonParser.getValueAsBoolean();
                    return true;
                case "hasSearch":
                    bLiveSquareTab.hasSearch = jsonParser.getValueAsBoolean();
                    return true;
                case "id":
                    bLiveSquareTab.f44441id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    bLiveSquareTab.name = jsonParser.getValueAsString();
                    return true;
                case "anchorSuggest":
                    bLiveSquareTab.anchorSuggest = BLiveAnchorSuggest.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    bLiveSquareTab.title = jsonParser.getValueAsString();
                    return true;
                case "showNearby":
                    bLiveSquareTab.showNearby = jsonParser.getValueAsBoolean();
                    return true;
                case "layoutColumn":
                    bLiveSquareTab.layoutColumn = jsonParser.getValueAsInt();
                    return true;
                case "hasActivityExposure":
                    bLiveSquareTab.hasActivityExposure = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSquareTab bLiveSquareTab, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSquareTab.f44441id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveSquareTab.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = bLiveSquareTab.name;
            if (str3 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str3);
            }
            jsonGenerator.writeBooleanField("hasBanner", bLiveSquareTab.hasBanner);
            if (bLiveSquareTab.anchorSuggest != null) {
                jsonGenerator.writeFieldName("anchorSuggest");
                BLiveAnchorSuggest.JSON_ADAPTER.serialize(bLiveSquareTab.anchorSuggest, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("layoutColumn", bLiveSquareTab.layoutColumn);
            String str4 = bLiveSquareTab.bannerType;
            if (str4 != null) {
                jsonGenerator.writeStringField("bannerType", str4);
            }
            jsonGenerator.writeBooleanField("showNearby", bLiveSquareTab.showNearby);
            if (bLiveSquareTab.subTabs != null) {
                jsonGenerator.writeFieldName("subTabs");
                JsonAdapter.serializeArray(bLiveSquareTab.subTabs, jsonGenerator, BLiveSquareSubTab.JSON_ADAPTER);
            }
            String str5 = bLiveSquareTab.pageId;
            if (str5 != null) {
                jsonGenerator.writeStringField("pageId", str5);
            }
            jsonGenerator.writeBooleanField("hasSearch", bLiveSquareTab.hasSearch);
            jsonGenerator.writeBooleanField("hasActivityExposure", bLiveSquareTab.hasActivityExposure);
            jsonGenerator.writeBooleanField("hasRedDot", bLiveSquareTab.hasRedDot);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSquareTab) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesquaretab";

    @Nullable
    @ProtobufIndex(index = 5)
    public BLiveAnchorSuggest anchorSuggest;

    @NonNull
    @ProtobufIndex(index = 7)
    public String bannerType;

    @ProtobufIndex(index = 12)
    public boolean hasActivityExposure;

    @ProtobufIndex(index = 4)
    public boolean hasBanner;

    @ProtobufIndex(index = 13)
    public boolean hasRedDot;

    @ProtobufIndex(index = 11)
    public boolean hasSearch;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44441id;

    @ProtobufIndex(index = 6)
    public int layoutColumn;

    @NonNull
    @ProtobufIndex(index = 3)
    public String name;

    @NonNull
    @ProtobufIndex(index = 10)
    public String pageId;

    @ProtobufIndex(index = 8)
    public boolean showNearby;

    @Nullable
    @ProtobufIndex(index = 9)
    public List<BLiveSquareSubTab> subTabs;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;

    public static BLiveSquareTab new_() {
        BLiveSquareTab bLiveSquareTab = new BLiveSquareTab();
        bLiveSquareTab.nullCheck();
        return bLiveSquareTab;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSquareTab mo223809clone() {
        BLiveSquareTab bLiveSquareTab = new BLiveSquareTab();
        bLiveSquareTab.f44441id = this.f44441id;
        bLiveSquareTab.title = this.title;
        bLiveSquareTab.name = this.name;
        bLiveSquareTab.hasBanner = this.hasBanner;
        BLiveAnchorSuggest bLiveAnchorSuggest = this.anchorSuggest;
        if (bLiveAnchorSuggest != null) {
            bLiveSquareTab.anchorSuggest = bLiveAnchorSuggest.mo223809clone();
        }
        bLiveSquareTab.layoutColumn = this.layoutColumn;
        bLiveSquareTab.bannerType = this.bannerType;
        bLiveSquareTab.showNearby = this.showNearby;
        List<BLiveSquareSubTab> list = this.subTabs;
        if (list != null) {
            bLiveSquareTab.subTabs = ValueObject.util_map(list, new w9j() { // from class: l.b62
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveSquareSubTab) obj).mo223809clone();
                }
            });
        }
        bLiveSquareTab.pageId = this.pageId;
        bLiveSquareTab.hasSearch = this.hasSearch;
        bLiveSquareTab.hasActivityExposure = this.hasActivityExposure;
        bLiveSquareTab.hasRedDot = this.hasRedDot;
        return bLiveSquareTab;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSquareTab)) {
            return false;
        }
        BLiveSquareTab bLiveSquareTab = (BLiveSquareTab) obj;
        return ValueObject.util_equals(this.f44441id, bLiveSquareTab.f44441id) && ValueObject.util_equals(this.title, bLiveSquareTab.title) && ValueObject.util_equals(this.name, bLiveSquareTab.name) && this.hasBanner == bLiveSquareTab.hasBanner && ValueObject.util_equals(this.anchorSuggest, bLiveSquareTab.anchorSuggest) && this.layoutColumn == bLiveSquareTab.layoutColumn && ValueObject.util_equals(this.bannerType, bLiveSquareTab.bannerType) && this.showNearby == bLiveSquareTab.showNearby && ValueObject.util_equals(this.subTabs, bLiveSquareTab.subTabs) && ValueObject.util_equals(this.pageId, bLiveSquareTab.pageId) && this.hasSearch == bLiveSquareTab.hasSearch && this.hasActivityExposure == bLiveSquareTab.hasActivityExposure && this.hasRedDot == bLiveSquareTab.hasRedDot;
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
        String str = this.f44441id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.name;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.hasBanner ? 1231 : 1237)) * 41;
        BLiveAnchorSuggest bLiveAnchorSuggest = this.anchorSuggest;
        int iHashCode4 = (((iHashCode3 + (bLiveAnchorSuggest != null ? bLiveAnchorSuggest.hashCode() : 0)) * 41) + this.layoutColumn) * 41;
        String str4 = this.bannerType;
        int iHashCode5 = (((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.showNearby ? 1231 : 1237)) * 41;
        List<BLiveSquareSubTab> list = this.subTabs;
        int iHashCode6 = (iHashCode5 + (list != null ? list.hashCode() : 0)) * 41;
        String str5 = this.pageId;
        int iHashCode7 = ((((((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 41) + (this.hasSearch ? 1231 : 1237)) * 41) + (this.hasActivityExposure ? 1231 : 1237)) * 41) + (this.hasRedDot ? 1231 : 1237);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44441id == null) {
            this.f44441id = "";
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
