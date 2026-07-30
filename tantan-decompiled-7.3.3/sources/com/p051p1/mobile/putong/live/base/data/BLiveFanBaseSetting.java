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
public class BLiveFanBaseSetting extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFanBaseSetting> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFanBaseSetting>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFanBaseSetting.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFanBaseSetting.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFanBaseSetting newInstance() {
            return new BLiveFanBaseSetting();
        }

        public boolean parseField(BLiveFanBaseSetting bLiveFanBaseSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "fanbaseRuleUrl":
                    bLiveFanBaseSetting.fanbaseRuleUrl = jsonParser.getValueAsString();
                    return true;
                case "hiddenRedPacket":
                    bLiveFanBaseSetting.hiddenRedPacket = jsonParser.getValueAsBoolean();
                    return true;
                case "on":
                    bLiveFanBaseSetting.f45214on = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFanBaseSetting bLiveFanBaseSetting, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("on", bLiveFanBaseSetting.f45214on);
            String str = bLiveFanBaseSetting.fanbaseRuleUrl;
            if (str != null) {
                jsonGenerator.writeStringField("fanbaseRuleUrl", str);
            }
            jsonGenerator.writeBooleanField("hiddenRedPacket", bLiveFanBaseSetting.hiddenRedPacket);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFanBaseSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefanbasesetting";

    @NonNull
    @ProtobufIndex(index = 2)
    public String fanbaseRuleUrl;

    @ProtobufIndex(index = 3)
    public boolean hiddenRedPacket;

    /* JADX INFO: renamed from: on */
    @ProtobufIndex(index = 1)
    public boolean f45214on;

    public static BLiveFanBaseSetting new_() {
        BLiveFanBaseSetting bLiveFanBaseSetting = new BLiveFanBaseSetting();
        bLiveFanBaseSetting.nullCheck();
        return bLiveFanBaseSetting;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFanBaseSetting mo225055clone() {
        BLiveFanBaseSetting bLiveFanBaseSetting = new BLiveFanBaseSetting();
        bLiveFanBaseSetting.f45214on = this.f45214on;
        bLiveFanBaseSetting.fanbaseRuleUrl = this.fanbaseRuleUrl;
        bLiveFanBaseSetting.hiddenRedPacket = this.hiddenRedPacket;
        return bLiveFanBaseSetting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFanBaseSetting)) {
            return false;
        }
        BLiveFanBaseSetting bLiveFanBaseSetting = (BLiveFanBaseSetting) obj;
        return this.f45214on == bLiveFanBaseSetting.f45214on && ValueObject.util_equals(this.fanbaseRuleUrl, bLiveFanBaseSetting.fanbaseRuleUrl) && this.hiddenRedPacket == bLiveFanBaseSetting.hiddenRedPacket;
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
        int i2 = ((i * 41) + (this.f45214on ? 1231 : 1237)) * 41;
        String str = this.fanbaseRuleUrl;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.hiddenRedPacket ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.fanbaseRuleUrl == null) {
            this.fanbaseRuleUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
