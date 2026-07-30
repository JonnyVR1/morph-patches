package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftSetProcesses;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveGiftSetInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftSetInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftSetInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftSetInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftSetInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftSetInfo newInstance() {
            return new BLiveGiftSetInfo();
        }

        public boolean parseField(BLiveGiftSetInfo bLiveGiftSetInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "resourcePicUrl":
                    bLiveGiftSetInfo.resourcePicUrl = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveGiftSetInfo.f45228id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    bLiveGiftSetInfo.name = jsonParser.getValueAsString();
                    return true;
                case "setProcesses":
                    bLiveGiftSetInfo.setProcesses = JsonAdapter.parseArray(jsonParser, BLiveGiftSetProcesses.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "displayAttribute":
                    bLiveGiftSetInfo.displayAttribute = BLiveGiftSetDisplayAttribute.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "tickerLeft":
                    bLiveGiftSetInfo.tickerLeft = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftSetInfo bLiveGiftSetInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveGiftSetInfo.f45228id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveGiftSetInfo.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            jsonGenerator.writeNumberField("tickerLeft", bLiveGiftSetInfo.tickerLeft);
            String str3 = bLiveGiftSetInfo.resourcePicUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("resourcePicUrl", str3);
            }
            if (bLiveGiftSetInfo.setProcesses != null) {
                jsonGenerator.writeFieldName("setProcesses");
                JsonAdapter.serializeArray(bLiveGiftSetInfo.setProcesses, jsonGenerator, BLiveGiftSetProcesses.JSON_ADAPTER);
            }
            if (bLiveGiftSetInfo.displayAttribute != null) {
                jsonGenerator.writeFieldName("displayAttribute");
                BLiveGiftSetDisplayAttribute.JSON_ADAPTER.serialize(bLiveGiftSetInfo.displayAttribute, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftSetInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftsetinfo";

    @Nullable
    @ProtobufIndex(index = 6)
    public BLiveGiftSetDisplayAttribute displayAttribute;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45228id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 4)
    public String resourcePicUrl;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<BLiveGiftSetProcesses> setProcesses;

    @ProtobufIndex(index = 3)
    public int tickerLeft;

    public static BLiveGiftSetInfo new_() {
        BLiveGiftSetInfo bLiveGiftSetInfo = new BLiveGiftSetInfo();
        bLiveGiftSetInfo.nullCheck();
        return bLiveGiftSetInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftSetInfo mo225055clone() {
        BLiveGiftSetInfo bLiveGiftSetInfo = new BLiveGiftSetInfo();
        bLiveGiftSetInfo.f45228id = this.f45228id;
        bLiveGiftSetInfo.name = this.name;
        bLiveGiftSetInfo.tickerLeft = this.tickerLeft;
        bLiveGiftSetInfo.resourcePicUrl = this.resourcePicUrl;
        List<BLiveGiftSetProcesses> list = this.setProcesses;
        if (list != null) {
            bLiveGiftSetInfo.setProcesses = ValueObject.util_map(list, new qcj() { // from class: l.b12
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveGiftSetProcesses) obj).mo225055clone();
                }
            });
        }
        BLiveGiftSetDisplayAttribute bLiveGiftSetDisplayAttribute = this.displayAttribute;
        if (bLiveGiftSetDisplayAttribute != null) {
            bLiveGiftSetInfo.displayAttribute = bLiveGiftSetDisplayAttribute.mo225055clone();
        }
        return bLiveGiftSetInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftSetInfo)) {
            return false;
        }
        BLiveGiftSetInfo bLiveGiftSetInfo = (BLiveGiftSetInfo) obj;
        return ValueObject.util_equals(this.f45228id, bLiveGiftSetInfo.f45228id) && ValueObject.util_equals(this.name, bLiveGiftSetInfo.name) && this.tickerLeft == bLiveGiftSetInfo.tickerLeft && ValueObject.util_equals(this.resourcePicUrl, bLiveGiftSetInfo.resourcePicUrl) && ValueObject.util_equals(this.setProcesses, bLiveGiftSetInfo.setProcesses) && ValueObject.util_equals(this.displayAttribute, bLiveGiftSetInfo.displayAttribute);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public boolean hasSuitSend() {
        for (int i = 0; i < this.setProcesses.size(); i++) {
            if (this.setProcesses.get(i).accumulatedNum > 0) {
                return true;
            }
        }
        return false;
    }

    public boolean hasSuitSendFinished() {
        for (int i = 0; i < this.setProcesses.size(); i++) {
            BLiveGiftSetProcesses bLiveGiftSetProcesses = this.setProcesses.get(i);
            if (bLiveGiftSetProcesses.entranceNum != bLiveGiftSetProcesses.accumulatedNum) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f45228id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.tickerLeft) * 41;
        String str3 = this.resourcePicUrl;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<BLiveGiftSetProcesses> list = this.setProcesses;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 41;
        BLiveGiftSetDisplayAttribute bLiveGiftSetDisplayAttribute = this.displayAttribute;
        int iHashCode5 = iHashCode4 + (bLiveGiftSetDisplayAttribute != null ? bLiveGiftSetDisplayAttribute.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45228id == null) {
            this.f45228id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.resourcePicUrl == null) {
            this.resourcePicUrl = "";
        }
        if (this.setProcesses == null) {
            this.setProcesses = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
