package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
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
public class BLiveVoiceSweetCpConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceSweetCpConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceSweetCpConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceSweetCpConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceSweetCpConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceSweetCpConfig newInstance() {
            return new BLiveVoiceSweetCpConfig();
        }

        public boolean parseField(BLiveVoiceSweetCpConfig bLiveVoiceSweetCpConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "regulationPageUrl":
                    bLiveVoiceSweetCpConfig.regulationPageUrl = jsonParser.getValueAsString();
                    return true;
                case "isOpen":
                    bLiveVoiceSweetCpConfig.isOpen = jsonParser.getValueAsBoolean();
                    return true;
                case "inviteGiftId":
                    bLiveVoiceSweetCpConfig.inviteGiftId = jsonParser.getValueAsString();
                    return true;
                case "inviteGiftPrice":
                    bLiveVoiceSweetCpConfig.inviteGiftPrice = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceSweetCpConfig bLiveVoiceSweetCpConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isOpen", bLiveVoiceSweetCpConfig.isOpen);
            String str = bLiveVoiceSweetCpConfig.inviteGiftPrice;
            if (str != null) {
                jsonGenerator.writeStringField("inviteGiftPrice", str);
            }
            String str2 = bLiveVoiceSweetCpConfig.regulationPageUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("regulationPageUrl", str2);
            }
            String str3 = bLiveVoiceSweetCpConfig.inviteGiftId;
            if (str3 != null) {
                jsonGenerator.writeStringField("inviteGiftId", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceSweetCpConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicesweetcpconfig";

    @NonNull
    @ProtobufIndex(index = 4)
    public String inviteGiftId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String inviteGiftPrice;

    @ProtobufIndex(index = 1)
    public boolean isOpen;

    @NonNull
    @ProtobufIndex(index = 3)
    public String regulationPageUrl;

    public static BLiveVoiceSweetCpConfig new_() {
        BLiveVoiceSweetCpConfig bLiveVoiceSweetCpConfig = new BLiveVoiceSweetCpConfig();
        bLiveVoiceSweetCpConfig.nullCheck();
        return bLiveVoiceSweetCpConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceSweetCpConfig mo223809clone() {
        BLiveVoiceSweetCpConfig bLiveVoiceSweetCpConfig = new BLiveVoiceSweetCpConfig();
        bLiveVoiceSweetCpConfig.isOpen = this.isOpen;
        bLiveVoiceSweetCpConfig.inviteGiftPrice = this.inviteGiftPrice;
        bLiveVoiceSweetCpConfig.regulationPageUrl = this.regulationPageUrl;
        bLiveVoiceSweetCpConfig.inviteGiftId = this.inviteGiftId;
        return bLiveVoiceSweetCpConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceSweetCpConfig)) {
            return false;
        }
        BLiveVoiceSweetCpConfig bLiveVoiceSweetCpConfig = (BLiveVoiceSweetCpConfig) obj;
        return this.isOpen == bLiveVoiceSweetCpConfig.isOpen && ValueObject.util_equals(this.inviteGiftPrice, bLiveVoiceSweetCpConfig.inviteGiftPrice) && ValueObject.util_equals(this.regulationPageUrl, bLiveVoiceSweetCpConfig.regulationPageUrl) && ValueObject.util_equals(this.inviteGiftId, bLiveVoiceSweetCpConfig.inviteGiftId);
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
        int i2 = ((i * 41) + (this.isOpen ? 1231 : 1237)) * 41;
        String str = this.inviteGiftPrice;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.regulationPageUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.inviteGiftId;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.inviteGiftPrice == null) {
            this.inviteGiftPrice = "";
        }
        if (this.regulationPageUrl == null) {
            this.regulationPageUrl = "";
        }
        if (this.inviteGiftId == null) {
            this.inviteGiftId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
