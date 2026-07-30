package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.data.BannerFrequencyType;
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
public class BLiveCallVideoCancelSetting extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveCallVideoCancelSetting> JSON_ADAPTER = new ObjectJsonAdapter<BLiveCallVideoCancelSetting>() { // from class: com.p1.mobile.putong.live.base.data.BLiveCallVideoCancelSetting.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveCallVideoCancelSetting.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveCallVideoCancelSetting newInstance() {
            return new BLiveCallVideoCancelSetting();
        }

        public boolean parseField(BLiveCallVideoCancelSetting bLiveCallVideoCancelSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("title")) {
                bLiveCallVideoCancelSetting.title = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(BannerFrequencyType.interval)) {
                return false;
            }
            bLiveCallVideoCancelSetting.interval = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveCallVideoCancelSetting bLiveCallVideoCancelSetting, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(BannerFrequencyType.interval, bLiveCallVideoCancelSetting.interval);
            String str = bLiveCallVideoCancelSetting.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveCallVideoCancelSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivecallvideocancelsetting";

    @ProtobufIndex(index = 1)
    public int interval;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;

    public static BLiveCallVideoCancelSetting new_() {
        BLiveCallVideoCancelSetting bLiveCallVideoCancelSetting = new BLiveCallVideoCancelSetting();
        bLiveCallVideoCancelSetting.nullCheck();
        return bLiveCallVideoCancelSetting;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveCallVideoCancelSetting mo225055clone() {
        BLiveCallVideoCancelSetting bLiveCallVideoCancelSetting = new BLiveCallVideoCancelSetting();
        bLiveCallVideoCancelSetting.interval = this.interval;
        bLiveCallVideoCancelSetting.title = this.title;
        return bLiveCallVideoCancelSetting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveCallVideoCancelSetting)) {
            return false;
        }
        BLiveCallVideoCancelSetting bLiveCallVideoCancelSetting = (BLiveCallVideoCancelSetting) obj;
        return this.interval == bLiveCallVideoCancelSetting.interval && ValueObject.util_equals(this.title, bLiveCallVideoCancelSetting.title);
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
        int i2 = ((i * 41) + this.interval) * 41;
        String str = this.title;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
