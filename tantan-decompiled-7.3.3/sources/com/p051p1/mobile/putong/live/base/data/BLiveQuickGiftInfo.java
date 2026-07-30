package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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
public class BLiveQuickGiftInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveQuickGiftInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveQuickGiftInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveQuickGiftInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveQuickGiftInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveQuickGiftInfo newInstance() {
            return new BLiveQuickGiftInfo();
        }

        public boolean parseField(BLiveQuickGiftInfo bLiveQuickGiftInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "giftId":
                    bLiveQuickGiftInfo.giftId = jsonParser.getValueAsInt();
                    return true;
                case "url":
                    bLiveQuickGiftInfo.url = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveQuickGiftInfo.name = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveQuickGiftInfo bLiveQuickGiftInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("giftId", bLiveQuickGiftInfo.giftId);
            String str = bLiveQuickGiftInfo.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = bLiveQuickGiftInfo.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveQuickGiftInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivequickgiftinfo";

    @ProtobufIndex(index = 1)
    public int giftId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 3)
    public String url;

    public static BLiveQuickGiftInfo new_() {
        BLiveQuickGiftInfo bLiveQuickGiftInfo = new BLiveQuickGiftInfo();
        bLiveQuickGiftInfo.nullCheck();
        return bLiveQuickGiftInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveQuickGiftInfo mo225055clone() {
        BLiveQuickGiftInfo bLiveQuickGiftInfo = new BLiveQuickGiftInfo();
        bLiveQuickGiftInfo.giftId = this.giftId;
        bLiveQuickGiftInfo.name = this.name;
        bLiveQuickGiftInfo.url = this.url;
        return bLiveQuickGiftInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveQuickGiftInfo)) {
            return false;
        }
        BLiveQuickGiftInfo bLiveQuickGiftInfo = (BLiveQuickGiftInfo) obj;
        return this.giftId == bLiveQuickGiftInfo.giftId && ValueObject.util_equals(this.name, bLiveQuickGiftInfo.name) && ValueObject.util_equals(this.url, bLiveQuickGiftInfo.url);
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
        int i2 = ((i * 41) + this.giftId) * 41;
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
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
