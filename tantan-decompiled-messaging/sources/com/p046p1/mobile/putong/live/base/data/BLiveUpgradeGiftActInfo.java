package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.core.data.LoveLetterGroupState;
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
public class BLiveUpgradeGiftActInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUpgradeGiftActInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUpgradeGiftActInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUpgradeGiftActInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUpgradeGiftActInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUpgradeGiftActInfo newInstance() {
            return new BLiveUpgradeGiftActInfo();
        }

        public boolean parseField(BLiveUpgradeGiftActInfo bLiveUpgradeGiftActInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(LoveLetterGroupState.entrance)) {
                bLiveUpgradeGiftActInfo.entrance = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                return false;
            }
            bLiveUpgradeGiftActInfo.name = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUpgradeGiftActInfo bLiveUpgradeGiftActInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveUpgradeGiftActInfo.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = bLiveUpgradeGiftActInfo.entrance;
            if (str2 != null) {
                jsonGenerator.writeStringField(LoveLetterGroupState.entrance, str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUpgradeGiftActInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveupgradegiftactinfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public String entrance;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    public static BLiveUpgradeGiftActInfo new_() {
        BLiveUpgradeGiftActInfo bLiveUpgradeGiftActInfo = new BLiveUpgradeGiftActInfo();
        bLiveUpgradeGiftActInfo.nullCheck();
        return bLiveUpgradeGiftActInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUpgradeGiftActInfo mo223809clone() {
        BLiveUpgradeGiftActInfo bLiveUpgradeGiftActInfo = new BLiveUpgradeGiftActInfo();
        bLiveUpgradeGiftActInfo.name = this.name;
        bLiveUpgradeGiftActInfo.entrance = this.entrance;
        return bLiveUpgradeGiftActInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveUpgradeGiftActInfo)) {
            return false;
        }
        BLiveUpgradeGiftActInfo bLiveUpgradeGiftActInfo = (BLiveUpgradeGiftActInfo) obj;
        return ValueObject.util_equals(this.name, bLiveUpgradeGiftActInfo.name) && ValueObject.util_equals(this.entrance, bLiveUpgradeGiftActInfo.entrance);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.entrance;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.entrance == null) {
            this.entrance = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
