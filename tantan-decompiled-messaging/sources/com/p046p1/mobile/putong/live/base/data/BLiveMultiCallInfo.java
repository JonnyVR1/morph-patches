package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.Converter;
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
public class BLiveMultiCallInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMultiCallInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMultiCallInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMultiCallInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMultiCallInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMultiCallInfo newInstance() {
            return new BLiveMultiCallInfo();
        }

        public boolean parseField(BLiveMultiCallInfo bLiveMultiCallInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "onGoing":
                    bLiveMultiCallInfo.onGoing = jsonParser.getValueAsBoolean();
                    return true;
                case "quitTime":
                    bLiveMultiCallInfo.quitTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "jumpLiveId":
                    bLiveMultiCallInfo.jumpLiveId = jsonParser.getValueAsString();
                    return true;
                case "jumpRoomId":
                    bLiveMultiCallInfo.jumpRoomId = jsonParser.getValueAsString();
                    return true;
                case "ownerRoomId":
                    bLiveMultiCallInfo.ownerRoomId = jsonParser.getValueAsString();
                    return true;
                case "role":
                    bLiveMultiCallInfo.role = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMultiCallInfo bLiveMultiCallInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("onGoing", bLiveMultiCallInfo.onGoing);
            String str = bLiveMultiCallInfo.ownerRoomId;
            if (str != null) {
                jsonGenerator.writeStringField("ownerRoomId", str);
            }
            String str2 = bLiveMultiCallInfo.role;
            if (str2 != null) {
                jsonGenerator.writeStringField("role", str2);
            }
            jsonGenerator.writeFieldName("quitTime");
            Converter.API_TIME.serialize(Double.valueOf(bLiveMultiCallInfo.quitTime), jsonGenerator, true);
            String str3 = bLiveMultiCallInfo.jumpLiveId;
            if (str3 != null) {
                jsonGenerator.writeStringField("jumpLiveId", str3);
            }
            String str4 = bLiveMultiCallInfo.jumpRoomId;
            if (str4 != null) {
                jsonGenerator.writeStringField("jumpRoomId", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMultiCallInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemulticallinfo";

    @NonNull
    @ProtobufIndex(index = 5)
    public String jumpLiveId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String jumpRoomId;

    @ProtobufIndex(index = 1)
    public boolean onGoing;

    @NonNull
    @ProtobufIndex(index = 2)
    public String ownerRoomId;

    @ProtobufIndex(index = 4)
    public double quitTime;

    @NonNull
    @ProtobufIndex(index = 3)
    public String role;

    public static BLiveMultiCallInfo new_() {
        BLiveMultiCallInfo bLiveMultiCallInfo = new BLiveMultiCallInfo();
        bLiveMultiCallInfo.nullCheck();
        return bLiveMultiCallInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMultiCallInfo mo223809clone() {
        BLiveMultiCallInfo bLiveMultiCallInfo = new BLiveMultiCallInfo();
        bLiveMultiCallInfo.onGoing = this.onGoing;
        bLiveMultiCallInfo.ownerRoomId = this.ownerRoomId;
        bLiveMultiCallInfo.role = this.role;
        bLiveMultiCallInfo.quitTime = this.quitTime;
        bLiveMultiCallInfo.jumpLiveId = this.jumpLiveId;
        bLiveMultiCallInfo.jumpRoomId = this.jumpRoomId;
        return bLiveMultiCallInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMultiCallInfo)) {
            return false;
        }
        BLiveMultiCallInfo bLiveMultiCallInfo = (BLiveMultiCallInfo) obj;
        return this.onGoing == bLiveMultiCallInfo.onGoing && ValueObject.util_equals(this.ownerRoomId, bLiveMultiCallInfo.ownerRoomId) && ValueObject.util_equals(this.role, bLiveMultiCallInfo.role) && this.quitTime == bLiveMultiCallInfo.quitTime && ValueObject.util_equals(this.jumpLiveId, bLiveMultiCallInfo.jumpLiveId) && ValueObject.util_equals(this.jumpRoomId, bLiveMultiCallInfo.jumpRoomId);
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
        int i2 = ((i * 41) + (this.onGoing ? 1231 : 1237)) * 41;
        String str = this.ownerRoomId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.role;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.quitTime);
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str3 = this.jumpLiveId;
        int iHashCode3 = (i3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.jumpRoomId;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.ownerRoomId == null) {
            this.ownerRoomId = "";
        }
        if (this.role == null) {
            this.role = "";
        }
        if (this.jumpLiveId == null) {
            this.jumpLiveId = "";
        }
        if (this.jumpRoomId == null) {
            this.jumpRoomId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
