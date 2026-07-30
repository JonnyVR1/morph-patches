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
public class BLiveVoiceHeartBeat extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceHeartBeat> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceHeartBeat>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceHeartBeat.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceHeartBeat.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceHeartBeat newInstance() {
            return new BLiveVoiceHeartBeat();
        }

        public boolean parseField(BLiveVoiceHeartBeat bLiveVoiceHeartBeat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("roomAnnouncement")) {
                bLiveVoiceHeartBeat.roomAnnouncement = BLiveMultiCallAnnouncement.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("heartbeats")) {
                return false;
            }
            bLiveVoiceHeartBeat.heartbeats = jsonParser.getValueAsLong();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceHeartBeat bLiveVoiceHeartBeat, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("heartbeats", bLiveVoiceHeartBeat.heartbeats);
            if (bLiveVoiceHeartBeat.roomAnnouncement != null) {
                jsonGenerator.writeFieldName("roomAnnouncement");
                BLiveMultiCallAnnouncement.JSON_ADAPTER.serialize(bLiveVoiceHeartBeat.roomAnnouncement, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceHeartBeat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoiceheartbeat";

    @ProtobufIndex(index = 1)
    public long heartbeats;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveMultiCallAnnouncement roomAnnouncement;

    public static BLiveVoiceHeartBeat new_() {
        BLiveVoiceHeartBeat bLiveVoiceHeartBeat = new BLiveVoiceHeartBeat();
        bLiveVoiceHeartBeat.nullCheck();
        return bLiveVoiceHeartBeat;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceHeartBeat mo223809clone() {
        BLiveVoiceHeartBeat bLiveVoiceHeartBeat = new BLiveVoiceHeartBeat();
        bLiveVoiceHeartBeat.heartbeats = this.heartbeats;
        BLiveMultiCallAnnouncement bLiveMultiCallAnnouncement = this.roomAnnouncement;
        if (bLiveMultiCallAnnouncement != null) {
            bLiveVoiceHeartBeat.roomAnnouncement = bLiveMultiCallAnnouncement.mo223809clone();
        }
        return bLiveVoiceHeartBeat;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceHeartBeat)) {
            return false;
        }
        BLiveVoiceHeartBeat bLiveVoiceHeartBeat = (BLiveVoiceHeartBeat) obj;
        return this.heartbeats == bLiveVoiceHeartBeat.heartbeats && ValueObject.util_equals(this.roomAnnouncement, bLiveVoiceHeartBeat.roomAnnouncement);
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
        long j = this.heartbeats;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        BLiveMultiCallAnnouncement bLiveMultiCallAnnouncement = this.roomAnnouncement;
        int iHashCode = i2 + (bLiveMultiCallAnnouncement != null ? bLiveMultiCallAnnouncement.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.roomAnnouncement == null) {
            this.roomAnnouncement = BLiveMultiCallAnnouncement.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
