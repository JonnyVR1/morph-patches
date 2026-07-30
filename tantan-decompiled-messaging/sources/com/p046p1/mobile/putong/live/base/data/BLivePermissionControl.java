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
public class BLivePermissionControl extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLivePermissionControl> JSON_ADAPTER = new ObjectJsonAdapter<BLivePermissionControl>() { // from class: com.p1.mobile.putong.live.base.data.BLivePermissionControl.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLivePermissionControl.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLivePermissionControl newInstance() {
            return new BLivePermissionControl();
        }

        public boolean parseField(BLivePermissionControl bLivePermissionControl, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "canStartVoiceLive":
                    bLivePermissionControl.canStartVoiceLive = jsonParser.getValueAsBoolean();
                    return true;
                case "canUseMaskMode":
                    bLivePermissionControl.canUseMaskMode = jsonParser.getValueAsBoolean();
                    return true;
                case "canUserStartLive":
                    bLivePermissionControl.canUserStartLive = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLivePermissionControl bLivePermissionControl, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("canUserStartLive", bLivePermissionControl.canUserStartLive);
            jsonGenerator.writeBooleanField("canStartVoiceLive", bLivePermissionControl.canStartVoiceLive);
            jsonGenerator.writeBooleanField("canUseMaskMode", bLivePermissionControl.canUseMaskMode);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLivePermissionControl) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivepermissioncontrol";

    @ProtobufIndex(index = 2)
    public boolean canStartVoiceLive;

    @ProtobufIndex(index = 3)
    public boolean canUseMaskMode;

    @ProtobufIndex(index = 1)
    public boolean canUserStartLive;

    public static BLivePermissionControl new_() {
        BLivePermissionControl bLivePermissionControl = new BLivePermissionControl();
        bLivePermissionControl.nullCheck();
        return bLivePermissionControl;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLivePermissionControl mo223809clone() {
        BLivePermissionControl bLivePermissionControl = new BLivePermissionControl();
        bLivePermissionControl.canUserStartLive = this.canUserStartLive;
        bLivePermissionControl.canStartVoiceLive = this.canStartVoiceLive;
        bLivePermissionControl.canUseMaskMode = this.canUseMaskMode;
        return bLivePermissionControl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLivePermissionControl)) {
            return false;
        }
        BLivePermissionControl bLivePermissionControl = (BLivePermissionControl) obj;
        return this.canUserStartLive == bLivePermissionControl.canUserStartLive && this.canStartVoiceLive == bLivePermissionControl.canStartVoiceLive && this.canUseMaskMode == bLivePermissionControl.canUseMaskMode;
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
        int i2 = (((((i * 41) + (this.canUserStartLive ? 1231 : 1237)) * 41) + (this.canStartVoiceLive ? 1231 : 1237)) * 41) + (this.canUseMaskMode ? 1231 : 1237);
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
