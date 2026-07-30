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
public class BLiveOperationItemPopUpDrawer extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveOperationItemPopUpDrawer> JSON_ADAPTER = new ObjectJsonAdapter<BLiveOperationItemPopUpDrawer>() { // from class: com.p1.mobile.putong.live.base.data.BLiveOperationItemPopUpDrawer.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveOperationItemPopUpDrawer.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveOperationItemPopUpDrawer newInstance() {
            return new BLiveOperationItemPopUpDrawer();
        }

        public boolean parseField(BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawer, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "fadingSeconds":
                    bLiveOperationItemPopUpDrawer.fadingSeconds = jsonParser.getValueAsInt();
                    return true;
                case "height":
                    bLiveOperationItemPopUpDrawer.height = (float) jsonParser.getValueAsDouble();
                    return true;
                case "jumpScheme":
                    bLiveOperationItemPopUpDrawer.jumpScheme = jsonParser.getValueAsString();
                    return true;
                case "h5Url":
                    bLiveOperationItemPopUpDrawer.h5Url = jsonParser.getValueAsString();
                    return true;
                case "width":
                    bLiveOperationItemPopUpDrawer.width = (float) jsonParser.getValueAsDouble();
                    return true;
                case "closeButtonUrl":
                    bLiveOperationItemPopUpDrawer.closeButtonUrl = jsonParser.getValueAsString();
                    return true;
                case "loading":
                    bLiveOperationItemPopUpDrawer.loading = BLiveOperationTextDrawerConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawer, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveOperationItemPopUpDrawer.jumpScheme;
            if (str != null) {
                jsonGenerator.writeStringField("jumpScheme", str);
            }
            String str2 = bLiveOperationItemPopUpDrawer.h5Url;
            if (str2 != null) {
                jsonGenerator.writeStringField("h5Url", str2);
            }
            jsonGenerator.writeNumberField("fadingSeconds", bLiveOperationItemPopUpDrawer.fadingSeconds);
            String str3 = bLiveOperationItemPopUpDrawer.closeButtonUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("closeButtonUrl", str3);
            }
            jsonGenerator.writeNumberField("height", bLiveOperationItemPopUpDrawer.height);
            jsonGenerator.writeNumberField("width", bLiveOperationItemPopUpDrawer.width);
            if (bLiveOperationItemPopUpDrawer.loading != null) {
                jsonGenerator.writeFieldName("loading");
                BLiveOperationTextDrawerConfig.JSON_ADAPTER.serialize(bLiveOperationItemPopUpDrawer.loading, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveOperationItemPopUpDrawer) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveoperationitempopupdrawer";

    @NonNull
    @ProtobufIndex(index = 4)
    public String closeButtonUrl;

    @ProtobufIndex(index = 3)
    public int fadingSeconds;

    @NonNull
    @ProtobufIndex(index = 2)
    public String h5Url;

    @ProtobufIndex(index = 5)
    public float height;

    @NonNull
    @ProtobufIndex(index = 1)
    public String jumpScheme;

    @Nullable
    @ProtobufIndex(index = 7)
    public BLiveOperationTextDrawerConfig loading;

    @ProtobufIndex(index = 6)
    public float width;

    public static BLiveOperationItemPopUpDrawer new_() {
        BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawer = new BLiveOperationItemPopUpDrawer();
        bLiveOperationItemPopUpDrawer.nullCheck();
        return bLiveOperationItemPopUpDrawer;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveOperationItemPopUpDrawer mo225055clone() {
        BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawer = new BLiveOperationItemPopUpDrawer();
        bLiveOperationItemPopUpDrawer.jumpScheme = this.jumpScheme;
        bLiveOperationItemPopUpDrawer.h5Url = this.h5Url;
        bLiveOperationItemPopUpDrawer.fadingSeconds = this.fadingSeconds;
        bLiveOperationItemPopUpDrawer.closeButtonUrl = this.closeButtonUrl;
        bLiveOperationItemPopUpDrawer.height = this.height;
        bLiveOperationItemPopUpDrawer.width = this.width;
        BLiveOperationTextDrawerConfig bLiveOperationTextDrawerConfig = this.loading;
        if (bLiveOperationTextDrawerConfig != null) {
            bLiveOperationItemPopUpDrawer.loading = bLiveOperationTextDrawerConfig.mo225055clone();
        }
        return bLiveOperationItemPopUpDrawer;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveOperationItemPopUpDrawer)) {
            return false;
        }
        BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawer = (BLiveOperationItemPopUpDrawer) obj;
        return ValueObject.util_equals(this.jumpScheme, bLiveOperationItemPopUpDrawer.jumpScheme) && ValueObject.util_equals(this.h5Url, bLiveOperationItemPopUpDrawer.h5Url) && this.fadingSeconds == bLiveOperationItemPopUpDrawer.fadingSeconds && ValueObject.util_equals(this.closeButtonUrl, bLiveOperationItemPopUpDrawer.closeButtonUrl) && this.height == bLiveOperationItemPopUpDrawer.height && this.width == bLiveOperationItemPopUpDrawer.width && ValueObject.util_equals(this.loading, bLiveOperationItemPopUpDrawer.loading);
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
        String str = this.jumpScheme;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.h5Url;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.fadingSeconds) * 41;
        String str3 = this.closeButtonUrl;
        int iHashCode3 = (((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + Float.floatToIntBits(this.height)) * 41) + Float.floatToIntBits(this.width)) * 41;
        BLiveOperationTextDrawerConfig bLiveOperationTextDrawerConfig = this.loading;
        int iHashCode4 = iHashCode3 + (bLiveOperationTextDrawerConfig != null ? bLiveOperationTextDrawerConfig.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.jumpScheme == null) {
            this.jumpScheme = "";
        }
        if (this.h5Url == null) {
            this.h5Url = "";
        }
        if (this.closeButtonUrl == null) {
            this.closeButtonUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
