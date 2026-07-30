package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
public class BLiveOperationItemPopUpTextDrawer extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveOperationItemPopUpTextDrawer> JSON_ADAPTER = new ObjectJsonAdapter<BLiveOperationItemPopUpTextDrawer>() { // from class: com.p1.mobile.putong.live.base.data.BLiveOperationItemPopUpTextDrawer.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveOperationItemPopUpTextDrawer.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveOperationItemPopUpTextDrawer newInstance() {
            return new BLiveOperationItemPopUpTextDrawer();
        }

        public boolean parseField(BLiveOperationItemPopUpTextDrawer bLiveOperationItemPopUpTextDrawer, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "actionAfterClick":
                    bLiveOperationItemPopUpTextDrawer.actionAfterClick = BLiveOperationActionAfterClick.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "jumpScheme":
                    bLiveOperationItemPopUpTextDrawer.jumpScheme = jsonParser.getValueAsString();
                    return true;
                case "content":
                    bLiveOperationItemPopUpTextDrawer.content = BLiveOperationItemPopUpTextDrawerContent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "iconUrl":
                    bLiveOperationItemPopUpTextDrawer.iconUrl = jsonParser.getValueAsString();
                    return true;
                case "shading":
                    bLiveOperationItemPopUpTextDrawer.shading = BLiveOperationTextDrawerConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveOperationItemPopUpTextDrawer bLiveOperationItemPopUpTextDrawer, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveOperationItemPopUpTextDrawer.iconUrl;
            if (str != null) {
                jsonGenerator.writeStringField("iconUrl", str);
            }
            if (bLiveOperationItemPopUpTextDrawer.content != null) {
                jsonGenerator.writeFieldName("content");
                BLiveOperationItemPopUpTextDrawerContent.JSON_ADAPTER.serialize(bLiveOperationItemPopUpTextDrawer.content, jsonGenerator, true);
            }
            if (bLiveOperationItemPopUpTextDrawer.shading != null) {
                jsonGenerator.writeFieldName("shading");
                BLiveOperationTextDrawerConfig.JSON_ADAPTER.serialize(bLiveOperationItemPopUpTextDrawer.shading, jsonGenerator, true);
            }
            String str2 = bLiveOperationItemPopUpTextDrawer.jumpScheme;
            if (str2 != null) {
                jsonGenerator.writeStringField("jumpScheme", str2);
            }
            if (bLiveOperationItemPopUpTextDrawer.actionAfterClick != null) {
                jsonGenerator.writeFieldName("actionAfterClick");
                BLiveOperationActionAfterClick.JSON_ADAPTER.serialize(bLiveOperationItemPopUpTextDrawer.actionAfterClick, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveOperationItemPopUpTextDrawer) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveoperationitempopuptextdrawer";

    @NonNull
    @ProtobufIndex(index = 5)
    public BLiveOperationActionAfterClick actionAfterClick;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveOperationItemPopUpTextDrawerContent content;

    @NonNull
    @ProtobufIndex(index = 1)
    public String iconUrl;

    @NonNull
    @ProtobufIndex(index = 4)
    public String jumpScheme;

    @Nullable
    @ProtobufIndex(index = 3)
    public BLiveOperationTextDrawerConfig shading;

    public static BLiveOperationItemPopUpTextDrawer new_() {
        BLiveOperationItemPopUpTextDrawer bLiveOperationItemPopUpTextDrawer = new BLiveOperationItemPopUpTextDrawer();
        bLiveOperationItemPopUpTextDrawer.nullCheck();
        return bLiveOperationItemPopUpTextDrawer;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveOperationItemPopUpTextDrawer mo225055clone() {
        BLiveOperationItemPopUpTextDrawer bLiveOperationItemPopUpTextDrawer = new BLiveOperationItemPopUpTextDrawer();
        bLiveOperationItemPopUpTextDrawer.iconUrl = this.iconUrl;
        BLiveOperationItemPopUpTextDrawerContent bLiveOperationItemPopUpTextDrawerContent = this.content;
        if (bLiveOperationItemPopUpTextDrawerContent != null) {
            bLiveOperationItemPopUpTextDrawer.content = bLiveOperationItemPopUpTextDrawerContent.mo225055clone();
        }
        BLiveOperationTextDrawerConfig bLiveOperationTextDrawerConfig = this.shading;
        if (bLiveOperationTextDrawerConfig != null) {
            bLiveOperationItemPopUpTextDrawer.shading = bLiveOperationTextDrawerConfig.mo225055clone();
        }
        bLiveOperationItemPopUpTextDrawer.jumpScheme = this.jumpScheme;
        bLiveOperationItemPopUpTextDrawer.actionAfterClick = this.actionAfterClick;
        return bLiveOperationItemPopUpTextDrawer;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveOperationItemPopUpTextDrawer)) {
            return false;
        }
        BLiveOperationItemPopUpTextDrawer bLiveOperationItemPopUpTextDrawer = (BLiveOperationItemPopUpTextDrawer) obj;
        return ValueObject.util_equals(this.iconUrl, bLiveOperationItemPopUpTextDrawer.iconUrl) && ValueObject.util_equals(this.content, bLiveOperationItemPopUpTextDrawer.content) && ValueObject.util_equals(this.shading, bLiveOperationItemPopUpTextDrawer.shading) && ValueObject.util_equals(this.jumpScheme, bLiveOperationItemPopUpTextDrawer.jumpScheme) && ValueObject.util_equals(this.actionAfterClick, bLiveOperationItemPopUpTextDrawer.actionAfterClick);
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
        BLiveOperationItemPopUpTextDrawerContent bLiveOperationItemPopUpTextDrawerContent = this.content;
        int iHashCode2 = (iHashCode + (bLiveOperationItemPopUpTextDrawerContent != null ? bLiveOperationItemPopUpTextDrawerContent.hashCode() : 0)) * 41;
        BLiveOperationTextDrawerConfig bLiveOperationTextDrawerConfig = this.shading;
        int iHashCode3 = (iHashCode2 + (bLiveOperationTextDrawerConfig != null ? bLiveOperationTextDrawerConfig.hashCode() : 0)) * 41;
        String str2 = this.jumpScheme;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveOperationActionAfterClick bLiveOperationActionAfterClick = this.actionAfterClick;
        int iHashCode5 = iHashCode4 + (bLiveOperationActionAfterClick != null ? bLiveOperationActionAfterClick.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.iconUrl == null) {
            this.iconUrl = "";
        }
        if (this.content == null) {
            this.content = BLiveOperationItemPopUpTextDrawerContent.new_();
        }
        if (this.jumpScheme == null) {
            this.jumpScheme = "";
        }
        if (this.actionAfterClick == null) {
            this.actionAfterClick = (BLiveOperationActionAfterClick) BLiveOperationActionAfterClick.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
