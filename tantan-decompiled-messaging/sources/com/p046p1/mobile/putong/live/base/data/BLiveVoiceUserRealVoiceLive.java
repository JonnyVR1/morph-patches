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
public class BLiveVoiceUserRealVoiceLive extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceUserRealVoiceLive> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceUserRealVoiceLive>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceUserRealVoiceLive.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceUserRealVoiceLive.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceUserRealVoiceLive newInstance() {
            return new BLiveVoiceUserRealVoiceLive();
        }

        public boolean parseField(BLiveVoiceUserRealVoiceLive bLiveVoiceUserRealVoiceLive, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "anchorId":
                    bLiveVoiceUserRealVoiceLive.anchorId = jsonParser.getValueAsString();
                    return true;
                case "roomId":
                    bLiveVoiceUserRealVoiceLive.roomId = jsonParser.getValueAsString();
                    return true;
                case "isOnCall":
                    bLiveVoiceUserRealVoiceLive.isOnCall = jsonParser.getValueAsBoolean();
                    return true;
                case "voiceLiveId":
                    bLiveVoiceUserRealVoiceLive.voiceLiveId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceUserRealVoiceLive bLiveVoiceUserRealVoiceLive, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceUserRealVoiceLive.roomId;
            if (str != null) {
                jsonGenerator.writeStringField("roomId", str);
            }
            String str2 = bLiveVoiceUserRealVoiceLive.voiceLiveId;
            if (str2 != null) {
                jsonGenerator.writeStringField("voiceLiveId", str2);
            }
            String str3 = bLiveVoiceUserRealVoiceLive.anchorId;
            if (str3 != null) {
                jsonGenerator.writeStringField("anchorId", str3);
            }
            jsonGenerator.writeBooleanField("isOnCall", bLiveVoiceUserRealVoiceLive.isOnCall);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceUserRealVoiceLive) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceuserrealvoicelive";

    @NonNull
    @ProtobufIndex(index = 2)
    public String anchorId;

    @ProtobufIndex(index = 3)
    public boolean isOnCall;

    @NonNull
    @ProtobufIndex(index = 1)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String voiceLiveId;

    public static BLiveVoiceUserRealVoiceLive new_() {
        BLiveVoiceUserRealVoiceLive bLiveVoiceUserRealVoiceLive = new BLiveVoiceUserRealVoiceLive();
        bLiveVoiceUserRealVoiceLive.nullCheck();
        return bLiveVoiceUserRealVoiceLive;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceUserRealVoiceLive mo223809clone() {
        BLiveVoiceUserRealVoiceLive bLiveVoiceUserRealVoiceLive = new BLiveVoiceUserRealVoiceLive();
        bLiveVoiceUserRealVoiceLive.roomId = this.roomId;
        bLiveVoiceUserRealVoiceLive.voiceLiveId = this.voiceLiveId;
        bLiveVoiceUserRealVoiceLive.anchorId = this.anchorId;
        bLiveVoiceUserRealVoiceLive.isOnCall = this.isOnCall;
        return bLiveVoiceUserRealVoiceLive;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceUserRealVoiceLive)) {
            return false;
        }
        BLiveVoiceUserRealVoiceLive bLiveVoiceUserRealVoiceLive = (BLiveVoiceUserRealVoiceLive) obj;
        return ValueObject.util_equals(this.roomId, bLiveVoiceUserRealVoiceLive.roomId) && ValueObject.util_equals(this.voiceLiveId, bLiveVoiceUserRealVoiceLive.voiceLiveId) && ValueObject.util_equals(this.anchorId, bLiveVoiceUserRealVoiceLive.anchorId) && this.isOnCall == bLiveVoiceUserRealVoiceLive.isOnCall;
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
        String str = this.roomId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.voiceLiveId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.anchorId;
        int iHashCode3 = ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.isOnCall ? 1231 : 1237);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.voiceLiveId == null) {
            this.voiceLiveId = "";
        }
        if (this.anchorId == null) {
            this.anchorId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
