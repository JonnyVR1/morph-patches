package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
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
public class BLiveMultiCallAsset extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMultiCallAsset> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMultiCallAsset>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMultiCallAsset.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMultiCallAsset.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMultiCallAsset newInstance() {
            return new BLiveMultiCallAsset();
        }

        public boolean parseField(BLiveMultiCallAsset bLiveMultiCallAsset, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "multiCallSwitch":
                    bLiveMultiCallAsset.multiCallSwitch = jsonParser.getValueAsBoolean();
                    return true;
                case "canSwitchMaxCallNum":
                    bLiveMultiCallAsset.canSwitchMaxCallNum = jsonParser.getValueAsBoolean();
                    return true;
                case "freeCall":
                    bLiveMultiCallAsset.freeCall = jsonParser.getValueAsBoolean();
                    return true;
                case "id":
                    bLiveMultiCallAsset.f45250id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    bLiveMultiCallAsset.type = jsonParser.getValueAsString();
                    return true;
                case "multiCallOrder":
                    bLiveMultiCallAsset.multiCallOrder = jsonParser.getValueAsString();
                    return true;
                case "maxCallNum":
                    bLiveMultiCallAsset.maxCallNum = jsonParser.getValueAsInt();
                    return true;
                case "rejectInvite":
                    bLiveMultiCallAsset.rejectInvite = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMultiCallAsset bLiveMultiCallAsset, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveMultiCallAsset.f45250id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveMultiCallAsset.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            jsonGenerator.writeBooleanField("freeCall", bLiveMultiCallAsset.freeCall);
            jsonGenerator.writeBooleanField("rejectInvite", bLiveMultiCallAsset.rejectInvite);
            jsonGenerator.writeBooleanField("multiCallSwitch", bLiveMultiCallAsset.multiCallSwitch);
            String str3 = bLiveMultiCallAsset.multiCallOrder;
            if (str3 != null) {
                jsonGenerator.writeStringField("multiCallOrder", str3);
            }
            jsonGenerator.writeBooleanField("canSwitchMaxCallNum", bLiveMultiCallAsset.canSwitchMaxCallNum);
            jsonGenerator.writeNumberField("maxCallNum", bLiveMultiCallAsset.maxCallNum);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMultiCallAsset) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemulticallasset";

    @ProtobufIndex(index = 7)
    public boolean canSwitchMaxCallNum;

    @ProtobufIndex(index = 3)
    public boolean freeCall;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45250id;

    @ProtobufIndex(index = 8)
    public int maxCallNum;

    @NonNull
    @ProtobufIndex(index = 6)
    public String multiCallOrder;

    @ProtobufIndex(index = 5)
    public boolean multiCallSwitch;

    @ProtobufIndex(index = 4)
    public boolean rejectInvite;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    public static BLiveMultiCallAsset new_() {
        BLiveMultiCallAsset bLiveMultiCallAsset = new BLiveMultiCallAsset();
        bLiveMultiCallAsset.nullCheck();
        return bLiveMultiCallAsset;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMultiCallAsset mo225055clone() {
        BLiveMultiCallAsset bLiveMultiCallAsset = new BLiveMultiCallAsset();
        bLiveMultiCallAsset.f45250id = this.f45250id;
        bLiveMultiCallAsset.type = this.type;
        bLiveMultiCallAsset.freeCall = this.freeCall;
        bLiveMultiCallAsset.rejectInvite = this.rejectInvite;
        bLiveMultiCallAsset.multiCallSwitch = this.multiCallSwitch;
        bLiveMultiCallAsset.multiCallOrder = this.multiCallOrder;
        bLiveMultiCallAsset.canSwitchMaxCallNum = this.canSwitchMaxCallNum;
        bLiveMultiCallAsset.maxCallNum = this.maxCallNum;
        return bLiveMultiCallAsset;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMultiCallAsset)) {
            return false;
        }
        BLiveMultiCallAsset bLiveMultiCallAsset = (BLiveMultiCallAsset) obj;
        return ValueObject.util_equals(this.f45250id, bLiveMultiCallAsset.f45250id) && ValueObject.util_equals(this.type, bLiveMultiCallAsset.type) && this.freeCall == bLiveMultiCallAsset.freeCall && this.rejectInvite == bLiveMultiCallAsset.rejectInvite && this.multiCallSwitch == bLiveMultiCallAsset.multiCallSwitch && ValueObject.util_equals(this.multiCallOrder, bLiveMultiCallAsset.multiCallOrder) && this.canSwitchMaxCallNum == bLiveMultiCallAsset.canSwitchMaxCallNum && this.maxCallNum == bLiveMultiCallAsset.maxCallNum;
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
        String str = this.f45250id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.freeCall ? 1231 : 1237)) * 41) + (this.rejectInvite ? 1231 : 1237)) * 41) + (this.multiCallSwitch ? 1231 : 1237)) * 41;
        String str3 = this.multiCallOrder;
        int iHashCode3 = ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.canSwitchMaxCallNum ? 1231 : 1237)) * 41) + this.maxCallNum;
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45250id == null) {
            this.f45250id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.multiCallOrder == null) {
            this.multiCallOrder = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
