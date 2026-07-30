package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.OMSResourceType;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveTopBarConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveTopBarConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveTopBarConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveTopBarConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveTopBarConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveTopBarConfig newInstance() {
            return new BLiveTopBarConfig();
        }

        public boolean parseField(BLiveTopBarConfig bLiveTopBarConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "personalCenterIcon":
                    bLiveTopBarConfig.personalCenterIcon = jsonParser.getValueAsString();
                    return true;
                case "startLiveConfig":
                    bLiveTopBarConfig.startLiveConfig = BLiveTapBarStartLiveConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "searchBoxConfig":
                    bLiveTopBarConfig.searchBoxConfig = BLiveSearchBoxConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "background":
                    bLiveTopBarConfig.background = BLiveTopBarBackground.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "textColor":
                    bLiveTopBarConfig.textColor = jsonParser.getValueAsString();
                    return true;
                case "subTabConfig":
                    bLiveTopBarConfig.subTabConfig = BLiveSubTabConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "searchIcon":
                    bLiveTopBarConfig.searchIcon = jsonParser.getValueAsString();
                    return true;
                case "slideBarColor":
                    bLiveTopBarConfig.slideBarColor = jsonParser.getValueAsString();
                    return true;
                case "defaultStatusBarColor":
                    bLiveTopBarConfig.defaultStatusBarColor = jsonParser.getValueAsBoolean();
                    return true;
                case "multiCallPartyIcon":
                    bLiveTopBarConfig.multiCallPartyIcon = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveTopBarConfig bLiveTopBarConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveTopBarConfig.personalCenterIcon;
            if (str != null) {
                jsonGenerator.writeStringField("personalCenterIcon", str);
            }
            if (bLiveTopBarConfig.startLiveConfig != null) {
                jsonGenerator.writeFieldName("startLiveConfig");
                BLiveTapBarStartLiveConfig.JSON_ADAPTER.serialize(bLiveTopBarConfig.startLiveConfig, jsonGenerator, true);
            }
            if (bLiveTopBarConfig.background != null) {
                jsonGenerator.writeFieldName(OMSResourceType.background);
                BLiveTopBarBackground.JSON_ADAPTER.serialize(bLiveTopBarConfig.background, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("defaultStatusBarColor", bLiveTopBarConfig.defaultStatusBarColor);
            String str2 = bLiveTopBarConfig.textColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("textColor", str2);
            }
            String str3 = bLiveTopBarConfig.slideBarColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("slideBarColor", str3);
            }
            if (bLiveTopBarConfig.searchBoxConfig != null) {
                jsonGenerator.writeFieldName("searchBoxConfig");
                BLiveSearchBoxConfig.JSON_ADAPTER.serialize(bLiveTopBarConfig.searchBoxConfig, jsonGenerator, true);
            }
            String str4 = bLiveTopBarConfig.multiCallPartyIcon;
            if (str4 != null) {
                jsonGenerator.writeStringField("multiCallPartyIcon", str4);
            }
            String str5 = bLiveTopBarConfig.searchIcon;
            if (str5 != null) {
                jsonGenerator.writeStringField("searchIcon", str5);
            }
            if (bLiveTopBarConfig.subTabConfig != null) {
                jsonGenerator.writeFieldName("subTabConfig");
                BLiveSubTabConfig.JSON_ADAPTER.serialize(bLiveTopBarConfig.subTabConfig, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveTopBarConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivetopbarconfig";

    @Nullable
    @ProtobufIndex(index = 3)
    public BLiveTopBarBackground background;

    @ProtobufIndex(index = 4)
    public boolean defaultStatusBarColor;

    @NonNull
    @ProtobufIndex(index = 8)
    public String multiCallPartyIcon;

    @Nullable
    @ProtobufIndex(index = 1)
    public String personalCenterIcon;

    @Nullable
    @ProtobufIndex(index = 7)
    public BLiveSearchBoxConfig searchBoxConfig;

    @NonNull
    @ProtobufIndex(index = 9)
    public String searchIcon;

    @Nullable
    @ProtobufIndex(index = 6)
    public String slideBarColor;

    @Nullable
    @ProtobufIndex(index = 2)
    public BLiveTapBarStartLiveConfig startLiveConfig;

    @NonNull
    @ProtobufIndex(index = 10)
    public BLiveSubTabConfig subTabConfig;

    @Nullable
    @ProtobufIndex(index = 5)
    public String textColor;

    public static BLiveTopBarConfig new_() {
        BLiveTopBarConfig bLiveTopBarConfig = new BLiveTopBarConfig();
        bLiveTopBarConfig.nullCheck();
        return bLiveTopBarConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveTopBarConfig mo225055clone() {
        BLiveTopBarConfig bLiveTopBarConfig = new BLiveTopBarConfig();
        bLiveTopBarConfig.personalCenterIcon = this.personalCenterIcon;
        BLiveTapBarStartLiveConfig bLiveTapBarStartLiveConfig = this.startLiveConfig;
        if (bLiveTapBarStartLiveConfig != null) {
            bLiveTopBarConfig.startLiveConfig = bLiveTapBarStartLiveConfig.mo225055clone();
        }
        BLiveTopBarBackground bLiveTopBarBackground = this.background;
        if (bLiveTopBarBackground != null) {
            bLiveTopBarConfig.background = bLiveTopBarBackground.mo225055clone();
        }
        bLiveTopBarConfig.defaultStatusBarColor = this.defaultStatusBarColor;
        bLiveTopBarConfig.textColor = this.textColor;
        bLiveTopBarConfig.slideBarColor = this.slideBarColor;
        BLiveSearchBoxConfig bLiveSearchBoxConfig = this.searchBoxConfig;
        if (bLiveSearchBoxConfig != null) {
            bLiveTopBarConfig.searchBoxConfig = bLiveSearchBoxConfig.mo225055clone();
        }
        bLiveTopBarConfig.multiCallPartyIcon = this.multiCallPartyIcon;
        bLiveTopBarConfig.searchIcon = this.searchIcon;
        BLiveSubTabConfig bLiveSubTabConfig = this.subTabConfig;
        if (bLiveSubTabConfig != null) {
            bLiveTopBarConfig.subTabConfig = bLiveSubTabConfig.mo225055clone();
        }
        return bLiveTopBarConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveTopBarConfig)) {
            return false;
        }
        BLiveTopBarConfig bLiveTopBarConfig = (BLiveTopBarConfig) obj;
        return ValueObject.util_equals(this.personalCenterIcon, bLiveTopBarConfig.personalCenterIcon) && ValueObject.util_equals(this.startLiveConfig, bLiveTopBarConfig.startLiveConfig) && ValueObject.util_equals(this.background, bLiveTopBarConfig.background) && this.defaultStatusBarColor == bLiveTopBarConfig.defaultStatusBarColor && ValueObject.util_equals(this.textColor, bLiveTopBarConfig.textColor) && ValueObject.util_equals(this.slideBarColor, bLiveTopBarConfig.slideBarColor) && ValueObject.util_equals(this.searchBoxConfig, bLiveTopBarConfig.searchBoxConfig) && ValueObject.util_equals(this.multiCallPartyIcon, bLiveTopBarConfig.multiCallPartyIcon) && ValueObject.util_equals(this.searchIcon, bLiveTopBarConfig.searchIcon) && ValueObject.util_equals(this.subTabConfig, bLiveTopBarConfig.subTabConfig);
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
        String str = this.personalCenterIcon;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveTapBarStartLiveConfig bLiveTapBarStartLiveConfig = this.startLiveConfig;
        int iHashCode2 = (iHashCode + (bLiveTapBarStartLiveConfig != null ? bLiveTapBarStartLiveConfig.hashCode() : 0)) * 41;
        BLiveTopBarBackground bLiveTopBarBackground = this.background;
        int iHashCode3 = (((iHashCode2 + (bLiveTopBarBackground != null ? bLiveTopBarBackground.hashCode() : 0)) * 41) + (this.defaultStatusBarColor ? 1231 : 1237)) * 41;
        String str2 = this.textColor;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.slideBarColor;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 41;
        BLiveSearchBoxConfig bLiveSearchBoxConfig = this.searchBoxConfig;
        int iHashCode6 = (iHashCode5 + (bLiveSearchBoxConfig != null ? bLiveSearchBoxConfig.hashCode() : 0)) * 41;
        String str4 = this.multiCallPartyIcon;
        int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.searchIcon;
        int iHashCode8 = (iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 41;
        BLiveSubTabConfig bLiveSubTabConfig = this.subTabConfig;
        int iHashCode9 = iHashCode8 + (bLiveSubTabConfig != null ? bLiveSubTabConfig.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.multiCallPartyIcon == null) {
            this.multiCallPartyIcon = "";
        }
        if (this.searchIcon == null) {
            this.searchIcon = "";
        }
        if (this.subTabConfig == null) {
            this.subTabConfig = BLiveSubTabConfig.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
