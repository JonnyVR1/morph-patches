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
public class BLiveVoiceCreateRoomNotify extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceCreateRoomNotify> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceCreateRoomNotify>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceCreateRoomNotify.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceCreateRoomNotify.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceCreateRoomNotify newInstance() {
            return new BLiveVoiceCreateRoomNotify();
        }

        public boolean parseField(BLiveVoiceCreateRoomNotify bLiveVoiceCreateRoomNotify, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "show":
                    bLiveVoiceCreateRoomNotify.show = jsonParser.getValueAsBoolean();
                    return true;
                case "notifyContent":
                    bLiveVoiceCreateRoomNotify.notifyContent = jsonParser.getValueAsString();
                    return true;
                case "showEveryTimes":
                    bLiveVoiceCreateRoomNotify.showEveryTimes = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceCreateRoomNotify bLiveVoiceCreateRoomNotify, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceCreateRoomNotify.notifyContent;
            if (str != null) {
                jsonGenerator.writeStringField("notifyContent", str);
            }
            jsonGenerator.writeBooleanField("show", bLiveVoiceCreateRoomNotify.show);
            jsonGenerator.writeBooleanField("showEveryTimes", bLiveVoiceCreateRoomNotify.showEveryTimes);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceCreateRoomNotify) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicecreateroomnotify";

    @NonNull
    @ProtobufIndex(index = 1)
    public String notifyContent;

    @ProtobufIndex(index = 2)
    public boolean show;

    @ProtobufIndex(index = 3)
    public boolean showEveryTimes;

    public static BLiveVoiceCreateRoomNotify new_() {
        BLiveVoiceCreateRoomNotify bLiveVoiceCreateRoomNotify = new BLiveVoiceCreateRoomNotify();
        bLiveVoiceCreateRoomNotify.nullCheck();
        return bLiveVoiceCreateRoomNotify;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceCreateRoomNotify mo223809clone() {
        BLiveVoiceCreateRoomNotify bLiveVoiceCreateRoomNotify = new BLiveVoiceCreateRoomNotify();
        bLiveVoiceCreateRoomNotify.notifyContent = this.notifyContent;
        bLiveVoiceCreateRoomNotify.show = this.show;
        bLiveVoiceCreateRoomNotify.showEveryTimes = this.showEveryTimes;
        return bLiveVoiceCreateRoomNotify;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceCreateRoomNotify)) {
            return false;
        }
        BLiveVoiceCreateRoomNotify bLiveVoiceCreateRoomNotify = (BLiveVoiceCreateRoomNotify) obj;
        return ValueObject.util_equals(this.notifyContent, bLiveVoiceCreateRoomNotify.notifyContent) && this.show == bLiveVoiceCreateRoomNotify.show && this.showEveryTimes == bLiveVoiceCreateRoomNotify.showEveryTimes;
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
        String str = this.notifyContent;
        int iHashCode = ((((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.show ? 1231 : 1237)) * 41) + (this.showEveryTimes ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.notifyContent == null) {
            this.notifyContent = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
