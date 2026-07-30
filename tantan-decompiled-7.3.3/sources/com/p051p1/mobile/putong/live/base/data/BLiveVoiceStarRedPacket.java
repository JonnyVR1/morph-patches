package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.StudentVerRejectedReason;
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
public class BLiveVoiceStarRedPacket extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceStarRedPacket> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceStarRedPacket>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceStarRedPacket.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceStarRedPacket.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceStarRedPacket newInstance() {
            return new BLiveVoiceStarRedPacket();
        }

        public boolean parseField(BLiveVoiceStarRedPacket bLiveVoiceStarRedPacket, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startTime":
                    bLiveVoiceStarRedPacket.startTime = jsonParser.getValueAsString();
                    return true;
                case "roomId":
                    bLiveVoiceStarRedPacket.roomId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveVoiceStarRedPacket.f45359id = jsonParser.getValueAsBoolean();
                    return false;
                case "state":
                    bLiveVoiceStarRedPacket.state = jsonParser.getValueAsString();
                    return true;
                case "token":
                    bLiveVoiceStarRedPacket.token = jsonParser.getValueAsString();
                    return true;
                case "currentTime":
                    bLiveVoiceStarRedPacket.currentTime = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceStarRedPacket bLiveVoiceStarRedPacket, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("id", bLiveVoiceStarRedPacket.f45359id);
            String str = bLiveVoiceStarRedPacket.roomId;
            if (str != null) {
                jsonGenerator.writeStringField("roomId", str);
            }
            String str2 = bLiveVoiceStarRedPacket.token;
            if (str2 != null) {
                jsonGenerator.writeStringField("token", str2);
            }
            String str3 = bLiveVoiceStarRedPacket.currentTime;
            if (str3 != null) {
                jsonGenerator.writeStringField("currentTime", str3);
            }
            String str4 = bLiveVoiceStarRedPacket.startTime;
            if (str4 != null) {
                jsonGenerator.writeStringField(StudentVerRejectedReason.startTime, str4);
            }
            String str5 = bLiveVoiceStarRedPacket.state;
            if (str5 != null) {
                jsonGenerator.writeStringField("state", str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceStarRedPacket) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicestarredpacket";

    @NonNull
    @ProtobufIndex(index = 4)
    public String currentTime;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public boolean f45359id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String startTime;

    @NonNull
    @ProtobufIndex(index = 6)
    public String state;

    @NonNull
    @ProtobufIndex(index = 3)
    public String token;

    public static BLiveVoiceStarRedPacket new_() {
        BLiveVoiceStarRedPacket bLiveVoiceStarRedPacket = new BLiveVoiceStarRedPacket();
        bLiveVoiceStarRedPacket.nullCheck();
        return bLiveVoiceStarRedPacket;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceStarRedPacket mo225055clone() {
        BLiveVoiceStarRedPacket bLiveVoiceStarRedPacket = new BLiveVoiceStarRedPacket();
        bLiveVoiceStarRedPacket.f45359id = this.f45359id;
        bLiveVoiceStarRedPacket.roomId = this.roomId;
        bLiveVoiceStarRedPacket.token = this.token;
        bLiveVoiceStarRedPacket.currentTime = this.currentTime;
        bLiveVoiceStarRedPacket.startTime = this.startTime;
        bLiveVoiceStarRedPacket.state = this.state;
        return bLiveVoiceStarRedPacket;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceStarRedPacket)) {
            return false;
        }
        BLiveVoiceStarRedPacket bLiveVoiceStarRedPacket = (BLiveVoiceStarRedPacket) obj;
        return this.f45359id == bLiveVoiceStarRedPacket.f45359id && ValueObject.util_equals(this.roomId, bLiveVoiceStarRedPacket.roomId) && ValueObject.util_equals(this.token, bLiveVoiceStarRedPacket.token) && ValueObject.util_equals(this.currentTime, bLiveVoiceStarRedPacket.currentTime) && ValueObject.util_equals(this.startTime, bLiveVoiceStarRedPacket.startTime) && ValueObject.util_equals(this.state, bLiveVoiceStarRedPacket.state);
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
        int i2 = ((i * 41) + (this.f45359id ? 1231 : 1237)) * 41;
        String str = this.roomId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.token;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.currentTime;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.startTime;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.state;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.token == null) {
            this.token = "";
        }
        if (this.currentTime == null) {
            this.currentTime = "";
        }
        if (this.startTime == null) {
            this.startTime = "";
        }
        if (this.state == null) {
            this.state = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
