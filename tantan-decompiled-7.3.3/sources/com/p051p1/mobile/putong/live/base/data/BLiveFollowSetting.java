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
public class BLiveFollowSetting extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveFollowSetting> JSON_ADAPTER = new ObjectJsonAdapter<BLiveFollowSetting>() { // from class: com.p1.mobile.putong.live.base.data.BLiveFollowSetting.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveFollowSetting.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveFollowSetting newInstance() {
            return new BLiveFollowSetting();
        }

        public boolean parseField(BLiveFollowSetting bLiveFollowSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("frequency")) {
                bLiveFollowSetting.frequency = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("text")) {
                return false;
            }
            bLiveFollowSetting.text = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveFollowSetting bLiveFollowSetting, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveFollowSetting.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
            jsonGenerator.writeNumberField("frequency", bLiveFollowSetting.frequency);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveFollowSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivefollowsetting";

    @ProtobufIndex(index = 2)
    public int frequency;

    @NonNull
    @ProtobufIndex(index = 1)
    public String text;

    public static BLiveFollowSetting new_() {
        BLiveFollowSetting bLiveFollowSetting = new BLiveFollowSetting();
        bLiveFollowSetting.nullCheck();
        return bLiveFollowSetting;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveFollowSetting mo225055clone() {
        BLiveFollowSetting bLiveFollowSetting = new BLiveFollowSetting();
        bLiveFollowSetting.text = this.text;
        bLiveFollowSetting.frequency = this.frequency;
        return bLiveFollowSetting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveFollowSetting)) {
            return false;
        }
        BLiveFollowSetting bLiveFollowSetting = (BLiveFollowSetting) obj;
        return ValueObject.util_equals(this.text, bLiveFollowSetting.text) && this.frequency == bLiveFollowSetting.frequency;
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
        String str = this.text;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.frequency;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
