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
public class BLiveAnchorSetting extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAnchorSetting> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAnchorSetting>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAnchorSetting.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAnchorSetting.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAnchorSetting newInstance() {
            return new BLiveAnchorSetting();
        }

        public boolean parseField(BLiveAnchorSetting bLiveAnchorSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("unacceptPk")) {
                bLiveAnchorSetting.unacceptPk = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("callSwitch")) {
                return false;
            }
            bLiveAnchorSetting.callSwitch = BLiveCallSwitch.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAnchorSetting bLiveAnchorSetting, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("unacceptPk", bLiveAnchorSetting.unacceptPk);
            if (bLiveAnchorSetting.callSwitch != null) {
                jsonGenerator.writeFieldName("callSwitch");
                BLiveCallSwitch.JSON_ADAPTER.serialize(bLiveAnchorSetting.callSwitch, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAnchorSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveanchorsetting";

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveCallSwitch callSwitch;

    @ProtobufIndex(index = 1)
    public boolean unacceptPk;

    public static BLiveAnchorSetting new_() {
        BLiveAnchorSetting bLiveAnchorSetting = new BLiveAnchorSetting();
        bLiveAnchorSetting.nullCheck();
        return bLiveAnchorSetting;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAnchorSetting mo223809clone() {
        BLiveAnchorSetting bLiveAnchorSetting = new BLiveAnchorSetting();
        bLiveAnchorSetting.unacceptPk = this.unacceptPk;
        BLiveCallSwitch bLiveCallSwitch = this.callSwitch;
        if (bLiveCallSwitch != null) {
            bLiveAnchorSetting.callSwitch = bLiveCallSwitch.mo223809clone();
        }
        return bLiveAnchorSetting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAnchorSetting)) {
            return false;
        }
        BLiveAnchorSetting bLiveAnchorSetting = (BLiveAnchorSetting) obj;
        return this.unacceptPk == bLiveAnchorSetting.unacceptPk && ValueObject.util_equals(this.callSwitch, bLiveAnchorSetting.callSwitch);
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
        int i2 = ((i * 41) + (this.unacceptPk ? 1231 : 1237)) * 41;
        BLiveCallSwitch bLiveCallSwitch = this.callSwitch;
        int iHashCode = i2 + (bLiveCallSwitch != null ? bLiveCallSwitch.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.callSwitch == null) {
            this.callSwitch = BLiveCallSwitch.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
