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
public class BLiveIntlPushSwitch extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveIntlPushSwitch> JSON_ADAPTER = new ObjectJsonAdapter<BLiveIntlPushSwitch>() { // from class: com.p1.mobile.putong.live.base.data.BLiveIntlPushSwitch.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveIntlPushSwitch.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveIntlPushSwitch newInstance() {
            return new BLiveIntlPushSwitch();
        }

        public boolean parseField(BLiveIntlPushSwitch bLiveIntlPushSwitch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("isOpenLiveStatus")) {
                bLiveIntlPushSwitch.isOpenLiveStatus = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("isOpenVoiceLiveStatus")) {
                return false;
            }
            bLiveIntlPushSwitch.isOpenVoiceLiveStatus = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveIntlPushSwitch bLiveIntlPushSwitch, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isOpenLiveStatus", bLiveIntlPushSwitch.isOpenLiveStatus);
            jsonGenerator.writeBooleanField("isOpenVoiceLiveStatus", bLiveIntlPushSwitch.isOpenVoiceLiveStatus);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveIntlPushSwitch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveintlpushswitch";

    @ProtobufIndex(index = 1)
    public boolean isOpenLiveStatus;

    @ProtobufIndex(index = 2)
    public boolean isOpenVoiceLiveStatus;

    public static BLiveIntlPushSwitch new_() {
        BLiveIntlPushSwitch bLiveIntlPushSwitch = new BLiveIntlPushSwitch();
        bLiveIntlPushSwitch.nullCheck();
        return bLiveIntlPushSwitch;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveIntlPushSwitch mo223809clone() {
        BLiveIntlPushSwitch bLiveIntlPushSwitch = new BLiveIntlPushSwitch();
        bLiveIntlPushSwitch.isOpenLiveStatus = this.isOpenLiveStatus;
        bLiveIntlPushSwitch.isOpenVoiceLiveStatus = this.isOpenVoiceLiveStatus;
        return bLiveIntlPushSwitch;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveIntlPushSwitch)) {
            return false;
        }
        BLiveIntlPushSwitch bLiveIntlPushSwitch = (BLiveIntlPushSwitch) obj;
        return this.isOpenLiveStatus == bLiveIntlPushSwitch.isOpenLiveStatus && this.isOpenVoiceLiveStatus == bLiveIntlPushSwitch.isOpenVoiceLiveStatus;
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
        int i2 = (((i * 41) + (this.isOpenLiveStatus ? 1231 : 1237)) * 41) + (this.isOpenVoiceLiveStatus ? 1231 : 1237);
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
