package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.messaging.Constants;
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
public class BLiveOperationItemIcon extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveOperationItemIcon> JSON_ADAPTER = new ObjectJsonAdapter<BLiveOperationItemIcon>() { // from class: com.p1.mobile.putong.live.base.data.BLiveOperationItemIcon.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveOperationItemIcon.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveOperationItemIcon newInstance() {
            return new BLiveOperationItemIcon();
        }

        public boolean parseField(BLiveOperationItemIcon bLiveOperationItemIcon, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "iconType":
                    bLiveOperationItemIcon.iconType = BLiveOperationIconType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "mask":
                    bLiveOperationItemIcon.mask = BLiveOperationItemMask.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "label":
                    bLiveOperationItemIcon.label = BLiveOperationItemLabel.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "countdown":
                    bLiveOperationItemIcon.countdown = BLiveOperationItemCountDown.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "iconUrl":
                    bLiveOperationItemIcon.iconUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveOperationItemIcon bLiveOperationItemIcon, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveOperationItemIcon.iconUrl;
            if (str != null) {
                jsonGenerator.writeStringField("iconUrl", str);
            }
            if (bLiveOperationItemIcon.iconType != null) {
                jsonGenerator.writeFieldName("iconType");
                BLiveOperationIconType.JSON_ADAPTER.serialize(bLiveOperationItemIcon.iconType, jsonGenerator, true);
            }
            if (bLiveOperationItemIcon.countdown != null) {
                jsonGenerator.writeFieldName("countdown");
                BLiveOperationItemCountDown.JSON_ADAPTER.serialize(bLiveOperationItemIcon.countdown, jsonGenerator, true);
            }
            if (bLiveOperationItemIcon.mask != null) {
                jsonGenerator.writeFieldName("mask");
                BLiveOperationItemMask.JSON_ADAPTER.serialize(bLiveOperationItemIcon.mask, jsonGenerator, true);
            }
            if (bLiveOperationItemIcon.label != null) {
                jsonGenerator.writeFieldName(Constants.ScionAnalytics.PARAM_LABEL);
                BLiveOperationItemLabel.JSON_ADAPTER.serialize(bLiveOperationItemIcon.label, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveOperationItemIcon) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveoperationitemicon";

    @Nullable
    @ProtobufIndex(index = 3)
    public BLiveOperationItemCountDown countdown;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveOperationIconType iconType;

    @NonNull
    @ProtobufIndex(index = 1)
    public String iconUrl;

    @Nullable
    @ProtobufIndex(index = 5)
    public BLiveOperationItemLabel label;

    @Nullable
    @ProtobufIndex(index = 4)
    public BLiveOperationItemMask mask;

    public static BLiveOperationItemIcon new_() {
        BLiveOperationItemIcon bLiveOperationItemIcon = new BLiveOperationItemIcon();
        bLiveOperationItemIcon.nullCheck();
        return bLiveOperationItemIcon;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveOperationItemIcon mo225055clone() {
        BLiveOperationItemIcon bLiveOperationItemIcon = new BLiveOperationItemIcon();
        bLiveOperationItemIcon.iconUrl = this.iconUrl;
        bLiveOperationItemIcon.iconType = this.iconType;
        BLiveOperationItemCountDown bLiveOperationItemCountDown = this.countdown;
        if (bLiveOperationItemCountDown != null) {
            bLiveOperationItemIcon.countdown = bLiveOperationItemCountDown.mo225055clone();
        }
        BLiveOperationItemMask bLiveOperationItemMask = this.mask;
        if (bLiveOperationItemMask != null) {
            bLiveOperationItemIcon.mask = bLiveOperationItemMask.mo225055clone();
        }
        BLiveOperationItemLabel bLiveOperationItemLabel = this.label;
        if (bLiveOperationItemLabel != null) {
            bLiveOperationItemIcon.label = bLiveOperationItemLabel.mo225055clone();
        }
        return bLiveOperationItemIcon;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveOperationItemIcon)) {
            return false;
        }
        BLiveOperationItemIcon bLiveOperationItemIcon = (BLiveOperationItemIcon) obj;
        return ValueObject.util_equals(this.iconUrl, bLiveOperationItemIcon.iconUrl) && ValueObject.util_equals(this.iconType, bLiveOperationItemIcon.iconType) && ValueObject.util_equals(this.countdown, bLiveOperationItemIcon.countdown) && ValueObject.util_equals(this.mask, bLiveOperationItemIcon.mask) && ValueObject.util_equals(this.label, bLiveOperationItemIcon.label);
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
        String str = this.iconUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveOperationIconType bLiveOperationIconType = this.iconType;
        int iHashCode2 = (iHashCode + (bLiveOperationIconType != null ? bLiveOperationIconType.hashCode() : 0)) * 41;
        BLiveOperationItemCountDown bLiveOperationItemCountDown = this.countdown;
        int iHashCode3 = (iHashCode2 + (bLiveOperationItemCountDown != null ? bLiveOperationItemCountDown.hashCode() : 0)) * 41;
        BLiveOperationItemMask bLiveOperationItemMask = this.mask;
        int iHashCode4 = (iHashCode3 + (bLiveOperationItemMask != null ? bLiveOperationItemMask.hashCode() : 0)) * 41;
        BLiveOperationItemLabel bLiveOperationItemLabel = this.label;
        int iHashCode5 = iHashCode4 + (bLiveOperationItemLabel != null ? bLiveOperationItemLabel.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.iconUrl == null) {
            this.iconUrl = "";
        }
        if (this.iconType == null) {
            this.iconType = (BLiveOperationIconType) BLiveOperationIconType.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
