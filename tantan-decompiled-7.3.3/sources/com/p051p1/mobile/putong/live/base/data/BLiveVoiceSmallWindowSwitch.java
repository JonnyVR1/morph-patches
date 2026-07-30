package com.p051p1.mobile.putong.live.base.data;

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
public class BLiveVoiceSmallWindowSwitch extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceSmallWindowSwitch> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceSmallWindowSwitch>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceSmallWindowSwitch.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceSmallWindowSwitch.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceSmallWindowSwitch newInstance() {
            return new BLiveVoiceSmallWindowSwitch();
        }

        public boolean parseField(BLiveVoiceSmallWindowSwitch bLiveVoiceSmallWindowSwitch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("openWhenSlideRight")) {
                bLiveVoiceSmallWindowSwitch.openWhenSlideRight = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("showExit")) {
                return false;
            }
            bLiveVoiceSmallWindowSwitch.showExit = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceSmallWindowSwitch bLiveVoiceSmallWindowSwitch, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("openWhenSlideRight", bLiveVoiceSmallWindowSwitch.openWhenSlideRight);
            jsonGenerator.writeBooleanField("showExit", bLiveVoiceSmallWindowSwitch.showExit);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceSmallWindowSwitch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicesmallwindowswitch";

    @ProtobufIndex(index = 1)
    public boolean openWhenSlideRight;

    @ProtobufIndex(index = 2)
    public boolean showExit;

    public static BLiveVoiceSmallWindowSwitch new_() {
        BLiveVoiceSmallWindowSwitch bLiveVoiceSmallWindowSwitch = new BLiveVoiceSmallWindowSwitch();
        bLiveVoiceSmallWindowSwitch.nullCheck();
        return bLiveVoiceSmallWindowSwitch;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceSmallWindowSwitch mo225055clone() {
        BLiveVoiceSmallWindowSwitch bLiveVoiceSmallWindowSwitch = new BLiveVoiceSmallWindowSwitch();
        bLiveVoiceSmallWindowSwitch.openWhenSlideRight = this.openWhenSlideRight;
        bLiveVoiceSmallWindowSwitch.showExit = this.showExit;
        return bLiveVoiceSmallWindowSwitch;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceSmallWindowSwitch)) {
            return false;
        }
        BLiveVoiceSmallWindowSwitch bLiveVoiceSmallWindowSwitch = (BLiveVoiceSmallWindowSwitch) obj;
        return this.openWhenSlideRight == bLiveVoiceSmallWindowSwitch.openWhenSlideRight && this.showExit == bLiveVoiceSmallWindowSwitch.showExit;
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
        int i2 = (((i * 41) + (this.openWhenSlideRight ? 1231 : 1237)) * 41) + (this.showExit ? 1231 : 1237);
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
