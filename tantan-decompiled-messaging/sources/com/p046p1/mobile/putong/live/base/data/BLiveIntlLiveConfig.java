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
public class BLiveIntlLiveConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveIntlLiveConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveIntlLiveConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveIntlLiveConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveIntlLiveConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveIntlLiveConfig newInstance() {
            return new BLiveIntlLiveConfig();
        }

        public boolean parseField(BLiveIntlLiveConfig bLiveIntlLiveConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "intlGameOperationControl":
                    bLiveIntlLiveConfig.intlGameOperationControl = BLiveGameOperationControl.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "voiceSquareLeaderboardSchema":
                    bLiveIntlLiveConfig.voiceSquareLeaderboardSchema = jsonParser.getValueAsString();
                    return true;
                case "liveSquareLeaderboardSchema":
                    bLiveIntlLiveConfig.liveSquareLeaderboardSchema = jsonParser.getValueAsString();
                    return true;
                case "voiceRoomLeaderboardSchema":
                    bLiveIntlLiveConfig.voiceRoomLeaderboardSchema = jsonParser.getValueAsString();
                    return true;
                case "liveRoomLeaderboardSchema":
                    bLiveIntlLiveConfig.liveRoomLeaderboardSchema = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveIntlLiveConfig bLiveIntlLiveConfig, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveIntlLiveConfig.intlGameOperationControl != null) {
                jsonGenerator.writeFieldName("intlGameOperationControl");
                BLiveGameOperationControl.JSON_ADAPTER.serialize(bLiveIntlLiveConfig.intlGameOperationControl, jsonGenerator, true);
            }
            String str = bLiveIntlLiveConfig.liveSquareLeaderboardSchema;
            if (str != null) {
                jsonGenerator.writeStringField("liveSquareLeaderboardSchema", str);
            }
            String str2 = bLiveIntlLiveConfig.voiceSquareLeaderboardSchema;
            if (str2 != null) {
                jsonGenerator.writeStringField("voiceSquareLeaderboardSchema", str2);
            }
            String str3 = bLiveIntlLiveConfig.liveRoomLeaderboardSchema;
            if (str3 != null) {
                jsonGenerator.writeStringField("liveRoomLeaderboardSchema", str3);
            }
            String str4 = bLiveIntlLiveConfig.voiceRoomLeaderboardSchema;
            if (str4 != null) {
                jsonGenerator.writeStringField("voiceRoomLeaderboardSchema", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveIntlLiveConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveintlliveconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveGameOperationControl intlGameOperationControl;

    @NonNull
    @ProtobufIndex(index = 4)
    public String liveRoomLeaderboardSchema;

    @NonNull
    @ProtobufIndex(index = 2)
    public String liveSquareLeaderboardSchema;

    @NonNull
    @ProtobufIndex(index = 5)
    public String voiceRoomLeaderboardSchema;

    @NonNull
    @ProtobufIndex(index = 3)
    public String voiceSquareLeaderboardSchema;

    public static BLiveIntlLiveConfig new_() {
        BLiveIntlLiveConfig bLiveIntlLiveConfig = new BLiveIntlLiveConfig();
        bLiveIntlLiveConfig.nullCheck();
        return bLiveIntlLiveConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveIntlLiveConfig mo223809clone() {
        BLiveIntlLiveConfig bLiveIntlLiveConfig = new BLiveIntlLiveConfig();
        BLiveGameOperationControl bLiveGameOperationControl = this.intlGameOperationControl;
        if (bLiveGameOperationControl != null) {
            bLiveIntlLiveConfig.intlGameOperationControl = bLiveGameOperationControl.mo223809clone();
        }
        bLiveIntlLiveConfig.liveSquareLeaderboardSchema = this.liveSquareLeaderboardSchema;
        bLiveIntlLiveConfig.voiceSquareLeaderboardSchema = this.voiceSquareLeaderboardSchema;
        bLiveIntlLiveConfig.liveRoomLeaderboardSchema = this.liveRoomLeaderboardSchema;
        bLiveIntlLiveConfig.voiceRoomLeaderboardSchema = this.voiceRoomLeaderboardSchema;
        return bLiveIntlLiveConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveIntlLiveConfig)) {
            return false;
        }
        BLiveIntlLiveConfig bLiveIntlLiveConfig = (BLiveIntlLiveConfig) obj;
        return ValueObject.util_equals(this.intlGameOperationControl, bLiveIntlLiveConfig.intlGameOperationControl) && ValueObject.util_equals(this.liveSquareLeaderboardSchema, bLiveIntlLiveConfig.liveSquareLeaderboardSchema) && ValueObject.util_equals(this.voiceSquareLeaderboardSchema, bLiveIntlLiveConfig.voiceSquareLeaderboardSchema) && ValueObject.util_equals(this.liveRoomLeaderboardSchema, bLiveIntlLiveConfig.liveRoomLeaderboardSchema) && ValueObject.util_equals(this.voiceRoomLeaderboardSchema, bLiveIntlLiveConfig.voiceRoomLeaderboardSchema);
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
        BLiveGameOperationControl bLiveGameOperationControl = this.intlGameOperationControl;
        int iHashCode = (i2 + (bLiveGameOperationControl != null ? bLiveGameOperationControl.hashCode() : 0)) * 41;
        String str = this.liveSquareLeaderboardSchema;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.voiceSquareLeaderboardSchema;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.liveRoomLeaderboardSchema;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.voiceRoomLeaderboardSchema;
        int iHashCode5 = iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.intlGameOperationControl == null) {
            this.intlGameOperationControl = BLiveGameOperationControl.new_();
        }
        if (this.liveSquareLeaderboardSchema == null) {
            this.liveSquareLeaderboardSchema = "";
        }
        if (this.voiceSquareLeaderboardSchema == null) {
            this.voiceSquareLeaderboardSchema = "";
        }
        if (this.liveRoomLeaderboardSchema == null) {
            this.liveRoomLeaderboardSchema = "";
        }
        if (this.voiceRoomLeaderboardSchema == null) {
            this.voiceRoomLeaderboardSchema = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
