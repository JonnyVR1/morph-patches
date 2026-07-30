package com.p046p1.mobile.putong.live.base.data;

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
public class BLiveEnterRoomConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveEnterRoomConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveEnterRoomConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveEnterRoomConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveEnterRoomConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveEnterRoomConfig newInstance() {
            return new BLiveEnterRoomConfig();
        }

        public boolean parseField(BLiveEnterRoomConfig bLiveEnterRoomConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("cleanDuration")) {
                return false;
            }
            bLiveEnterRoomConfig.cleanDuration = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveEnterRoomConfig bLiveEnterRoomConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("cleanDuration", bLiveEnterRoomConfig.cleanDuration);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveEnterRoomConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveenterroomconfig";

    @ProtobufIndex(index = 1)
    public int cleanDuration;

    public static BLiveEnterRoomConfig new_() {
        BLiveEnterRoomConfig bLiveEnterRoomConfig = new BLiveEnterRoomConfig();
        bLiveEnterRoomConfig.nullCheck();
        return bLiveEnterRoomConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveEnterRoomConfig mo223809clone() {
        BLiveEnterRoomConfig bLiveEnterRoomConfig = new BLiveEnterRoomConfig();
        bLiveEnterRoomConfig.cleanDuration = this.cleanDuration;
        return bLiveEnterRoomConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BLiveEnterRoomConfig) && this.cleanDuration == ((BLiveEnterRoomConfig) obj).cleanDuration;
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
        int i2 = (i * 41) + this.cleanDuration;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
