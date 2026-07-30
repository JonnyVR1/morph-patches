package com.p046p1.mobile.putong.live.base.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveUpgradeGiftStatusItem;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveUpgradeGiftResLevel extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUpgradeGiftResLevel> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUpgradeGiftResLevel>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUpgradeGiftResLevel.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUpgradeGiftResLevel.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUpgradeGiftResLevel newInstance() {
            return new BLiveUpgradeGiftResLevel();
        }

        public boolean parseField(BLiveUpgradeGiftResLevel bLiveUpgradeGiftResLevel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "resources":
                    bLiveUpgradeGiftResLevel.resources = BLiveUpgradeGiftResourceInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    bLiveUpgradeGiftResLevel.f44468id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    bLiveUpgradeGiftResLevel.name = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUpgradeGiftResLevel bLiveUpgradeGiftResLevel, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveUpgradeGiftResLevel.f44468id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveUpgradeGiftResLevel.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            if (bLiveUpgradeGiftResLevel.resources != null) {
                jsonGenerator.writeFieldName("resources");
                BLiveUpgradeGiftResourceInfo.JSON_ADAPTER.serialize(bLiveUpgradeGiftResLevel.resources, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUpgradeGiftResLevel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveupgradegiftreslevel";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44468id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveUpgradeGiftResourceInfo resources;

    private String getStatusUrl(final String str, boolean z) {
        BLiveUpgradeGiftResourceInfo bLiveUpgradeGiftResourceInfo = this.resources;
        BLiveUpgradeGiftStatusItem bLiveUpgradeGiftStatusItem = (BLiveUpgradeGiftStatusItem) vwb.m200346r(z ? bLiveUpgradeGiftResourceInfo.buttonPics : bLiveUpgradeGiftResourceInfo.cardBgUrls, new w9j() { // from class: l.k72
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveUpgradeGiftStatusItem) obj).status, str));
            }
        });
        return bLiveUpgradeGiftStatusItem != null ? bLiveUpgradeGiftStatusItem.url : "";
    }

    public static BLiveUpgradeGiftResLevel new_() {
        BLiveUpgradeGiftResLevel bLiveUpgradeGiftResLevel = new BLiveUpgradeGiftResLevel();
        bLiveUpgradeGiftResLevel.nullCheck();
        return bLiveUpgradeGiftResLevel;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUpgradeGiftResLevel mo223809clone() {
        BLiveUpgradeGiftResLevel bLiveUpgradeGiftResLevel = new BLiveUpgradeGiftResLevel();
        bLiveUpgradeGiftResLevel.f44468id = this.f44468id;
        bLiveUpgradeGiftResLevel.name = this.name;
        BLiveUpgradeGiftResourceInfo bLiveUpgradeGiftResourceInfo = this.resources;
        if (bLiveUpgradeGiftResourceInfo != null) {
            bLiveUpgradeGiftResLevel.resources = bLiveUpgradeGiftResourceInfo.mo223809clone();
        }
        return bLiveUpgradeGiftResLevel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUpgradeGiftResLevel)) {
            return false;
        }
        BLiveUpgradeGiftResLevel bLiveUpgradeGiftResLevel = (BLiveUpgradeGiftResLevel) obj;
        return ValueObject.util_equals(this.f44468id, bLiveUpgradeGiftResLevel.f44468id) && ValueObject.util_equals(this.name, bLiveUpgradeGiftResLevel.name) && ValueObject.util_equals(this.resources, bLiveUpgradeGiftResLevel.resources);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public String getStatusBgCardUrl(String str) {
        return getStatusUrl(str, false);
    }

    public String getStatusBtnUrl(String str) {
        return getStatusUrl(str, true);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f44468id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        BLiveUpgradeGiftResourceInfo bLiveUpgradeGiftResourceInfo = this.resources;
        int iHashCode3 = iHashCode2 + (bLiveUpgradeGiftResourceInfo != null ? bLiveUpgradeGiftResourceInfo.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44468id == null) {
            this.f44468id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.resources == null) {
            this.resources = BLiveUpgradeGiftResourceInfo.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
