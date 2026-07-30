package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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
public class BLiveUpgradeGiftStatusItem extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUpgradeGiftStatusItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUpgradeGiftStatusItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUpgradeGiftStatusItem.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUpgradeGiftStatusItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUpgradeGiftStatusItem newInstance() {
            return new BLiveUpgradeGiftStatusItem();
        }

        public boolean parseField(BLiveUpgradeGiftStatusItem bLiveUpgradeGiftStatusItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                bLiveUpgradeGiftStatusItem.status = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("url")) {
                return false;
            }
            bLiveUpgradeGiftStatusItem.url = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUpgradeGiftStatusItem bLiveUpgradeGiftStatusItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveUpgradeGiftStatusItem.status;
            if (str != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str);
            }
            String str2 = bLiveUpgradeGiftStatusItem.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUpgradeGiftStatusItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveupgradegiftstatusitem";

    @NonNull
    @ProtobufIndex(index = 1)
    public String status;

    @NonNull
    @ProtobufIndex(index = 2)
    public String url;

    public static BLiveUpgradeGiftStatusItem new_() {
        BLiveUpgradeGiftStatusItem bLiveUpgradeGiftStatusItem = new BLiveUpgradeGiftStatusItem();
        bLiveUpgradeGiftStatusItem.nullCheck();
        return bLiveUpgradeGiftStatusItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUpgradeGiftStatusItem mo223809clone() {
        BLiveUpgradeGiftStatusItem bLiveUpgradeGiftStatusItem = new BLiveUpgradeGiftStatusItem();
        bLiveUpgradeGiftStatusItem.status = this.status;
        bLiveUpgradeGiftStatusItem.url = this.url;
        return bLiveUpgradeGiftStatusItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUpgradeGiftStatusItem)) {
            return false;
        }
        BLiveUpgradeGiftStatusItem bLiveUpgradeGiftStatusItem = (BLiveUpgradeGiftStatusItem) obj;
        return ValueObject.util_equals(this.status, bLiveUpgradeGiftStatusItem.status) && ValueObject.util_equals(this.url, bLiveUpgradeGiftStatusItem.url);
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
        String str = this.status;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.status == null) {
            this.status = "";
        }
        if (this.url == null) {
            this.url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
