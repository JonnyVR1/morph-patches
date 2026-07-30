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
public class BLiveProfileConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveProfileConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveProfileConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveProfileConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveProfileConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveProfileConfig newInstance() {
            return new BLiveProfileConfig();
        }

        public boolean parseField(BLiveProfileConfig bLiveProfileConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("settingButton")) {
                bLiveProfileConfig.settingButton = BLiveSettingButton.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("userRoomText")) {
                return false;
            }
            bLiveProfileConfig.userRoomText = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveProfileConfig bLiveProfileConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveProfileConfig.userRoomText;
            if (str != null) {
                jsonGenerator.writeStringField("userRoomText", str);
            }
            if (bLiveProfileConfig.settingButton != null) {
                jsonGenerator.writeFieldName("settingButton");
                BLiveSettingButton.JSON_ADAPTER.serialize(bLiveProfileConfig.settingButton, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveProfileConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveprofileconfig";

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveSettingButton settingButton;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userRoomText;

    public static BLiveProfileConfig new_() {
        BLiveProfileConfig bLiveProfileConfig = new BLiveProfileConfig();
        bLiveProfileConfig.nullCheck();
        return bLiveProfileConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveProfileConfig mo225055clone() {
        BLiveProfileConfig bLiveProfileConfig = new BLiveProfileConfig();
        bLiveProfileConfig.userRoomText = this.userRoomText;
        BLiveSettingButton bLiveSettingButton = this.settingButton;
        if (bLiveSettingButton != null) {
            bLiveProfileConfig.settingButton = bLiveSettingButton.mo225055clone();
        }
        return bLiveProfileConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveProfileConfig)) {
            return false;
        }
        BLiveProfileConfig bLiveProfileConfig = (BLiveProfileConfig) obj;
        return ValueObject.util_equals(this.userRoomText, bLiveProfileConfig.userRoomText) && ValueObject.util_equals(this.settingButton, bLiveProfileConfig.settingButton);
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
        String str = this.userRoomText;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveSettingButton bLiveSettingButton = this.settingButton;
        int iHashCode2 = iHashCode + (bLiveSettingButton != null ? bLiveSettingButton.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userRoomText == null) {
            this.userRoomText = "";
        }
        if (this.settingButton == null) {
            this.settingButton = BLiveSettingButton.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
