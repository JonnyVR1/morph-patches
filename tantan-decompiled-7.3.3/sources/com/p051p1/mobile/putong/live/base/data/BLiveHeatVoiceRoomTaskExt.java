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
public class BLiveHeatVoiceRoomTaskExt extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveHeatVoiceRoomTaskExt> JSON_ADAPTER = new ObjectJsonAdapter<BLiveHeatVoiceRoomTaskExt>() { // from class: com.p1.mobile.putong.live.base.data.BLiveHeatVoiceRoomTaskExt.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveHeatVoiceRoomTaskExt.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveHeatVoiceRoomTaskExt newInstance() {
            return new BLiveHeatVoiceRoomTaskExt();
        }

        public boolean parseField(BLiveHeatVoiceRoomTaskExt bLiveHeatVoiceRoomTaskExt, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("grabStarRedPacketSchema")) {
                bLiveHeatVoiceRoomTaskExt.grabStarRedPacketSchema = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("redPacketState")) {
                return false;
            }
            bLiveHeatVoiceRoomTaskExt.redPacketState = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveHeatVoiceRoomTaskExt bLiveHeatVoiceRoomTaskExt, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveHeatVoiceRoomTaskExt.redPacketState;
            if (str != null) {
                jsonGenerator.writeStringField("redPacketState", str);
            }
            String str2 = bLiveHeatVoiceRoomTaskExt.grabStarRedPacketSchema;
            if (str2 != null) {
                jsonGenerator.writeStringField("grabStarRedPacketSchema", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveHeatVoiceRoomTaskExt) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveheatvoiceroomtaskext";

    @NonNull
    @ProtobufIndex(index = 2)
    public String grabStarRedPacketSchema;

    @NonNull
    @ProtobufIndex(index = 1)
    public String redPacketState;

    public static BLiveHeatVoiceRoomTaskExt new_() {
        BLiveHeatVoiceRoomTaskExt bLiveHeatVoiceRoomTaskExt = new BLiveHeatVoiceRoomTaskExt();
        bLiveHeatVoiceRoomTaskExt.nullCheck();
        return bLiveHeatVoiceRoomTaskExt;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveHeatVoiceRoomTaskExt mo225055clone() {
        BLiveHeatVoiceRoomTaskExt bLiveHeatVoiceRoomTaskExt = new BLiveHeatVoiceRoomTaskExt();
        bLiveHeatVoiceRoomTaskExt.redPacketState = this.redPacketState;
        bLiveHeatVoiceRoomTaskExt.grabStarRedPacketSchema = this.grabStarRedPacketSchema;
        return bLiveHeatVoiceRoomTaskExt;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveHeatVoiceRoomTaskExt)) {
            return false;
        }
        BLiveHeatVoiceRoomTaskExt bLiveHeatVoiceRoomTaskExt = (BLiveHeatVoiceRoomTaskExt) obj;
        return ValueObject.util_equals(this.redPacketState, bLiveHeatVoiceRoomTaskExt.redPacketState) && ValueObject.util_equals(this.grabStarRedPacketSchema, bLiveHeatVoiceRoomTaskExt.grabStarRedPacketSchema);
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
        String str = this.redPacketState;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.grabStarRedPacketSchema;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.redPacketState == null) {
            this.redPacketState = "";
        }
        if (this.grabStarRedPacketSchema == null) {
            this.grabStarRedPacketSchema = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
