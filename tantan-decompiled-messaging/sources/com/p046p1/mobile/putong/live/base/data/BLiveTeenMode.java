package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.data.BannerFrequencyType;
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
public class BLiveTeenMode extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveTeenMode> JSON_ADAPTER = new ObjectJsonAdapter<BLiveTeenMode>() { // from class: com.p1.mobile.putong.live.base.data.BLiveTeenMode.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveTeenMode.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveTeenMode newInstance() {
            return new BLiveTeenMode();
        }

        public boolean parseField(BLiveTeenMode bLiveTeenMode, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "guideText":
                    bLiveTeenMode.guideText = jsonParser.getValueAsString();
                    return true;
                case "accumulation":
                    bLiveTeenMode.accumulation = BLiveTeenAccumulation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "on":
                    bLiveTeenMode.f44454on = jsonParser.getValueAsBoolean();
                    return true;
                case "interval":
                    bLiveTeenMode.interval = BLiveTeenInterval.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveTeenMode bLiveTeenMode, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("on", bLiveTeenMode.f44454on);
            String str = bLiveTeenMode.guideText;
            if (str != null) {
                jsonGenerator.writeStringField("guideText", str);
            }
            if (bLiveTeenMode.accumulation != null) {
                jsonGenerator.writeFieldName("accumulation");
                BLiveTeenAccumulation.JSON_ADAPTER.serialize(bLiveTeenMode.accumulation, jsonGenerator, true);
            }
            if (bLiveTeenMode.interval != null) {
                jsonGenerator.writeFieldName(BannerFrequencyType.interval);
                BLiveTeenInterval.JSON_ADAPTER.serialize(bLiveTeenMode.interval, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveTeenMode) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveteenmode";

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveTeenAccumulation accumulation;

    @NonNull
    @ProtobufIndex(index = 2)
    public String guideText;

    @NonNull
    @ProtobufIndex(index = 4)
    public BLiveTeenInterval interval;

    /* JADX INFO: renamed from: on */
    @ProtobufIndex(index = 1)
    public boolean f44454on;

    public static BLiveTeenMode new_() {
        BLiveTeenMode bLiveTeenMode = new BLiveTeenMode();
        bLiveTeenMode.nullCheck();
        return bLiveTeenMode;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveTeenMode mo223809clone() {
        BLiveTeenMode bLiveTeenMode = new BLiveTeenMode();
        bLiveTeenMode.f44454on = this.f44454on;
        bLiveTeenMode.guideText = this.guideText;
        BLiveTeenAccumulation bLiveTeenAccumulation = this.accumulation;
        if (bLiveTeenAccumulation != null) {
            bLiveTeenMode.accumulation = bLiveTeenAccumulation.mo223809clone();
        }
        BLiveTeenInterval bLiveTeenInterval = this.interval;
        if (bLiveTeenInterval != null) {
            bLiveTeenMode.interval = bLiveTeenInterval.mo223809clone();
        }
        return bLiveTeenMode;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveTeenMode)) {
            return false;
        }
        BLiveTeenMode bLiveTeenMode = (BLiveTeenMode) obj;
        return this.f44454on == bLiveTeenMode.f44454on && ValueObject.util_equals(this.guideText, bLiveTeenMode.guideText) && ValueObject.util_equals(this.accumulation, bLiveTeenMode.accumulation) && ValueObject.util_equals(this.interval, bLiveTeenMode.interval);
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
        int i2 = ((i * 41) + (this.f44454on ? 1231 : 1237)) * 41;
        String str = this.guideText;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveTeenAccumulation bLiveTeenAccumulation = this.accumulation;
        int iHashCode2 = (iHashCode + (bLiveTeenAccumulation != null ? bLiveTeenAccumulation.hashCode() : 0)) * 41;
        BLiveTeenInterval bLiveTeenInterval = this.interval;
        int iHashCode3 = iHashCode2 + (bLiveTeenInterval != null ? bLiveTeenInterval.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.guideText == null) {
            this.guideText = "";
        }
        if (this.accumulation == null) {
            this.accumulation = BLiveTeenAccumulation.new_();
        }
        if (this.interval == null) {
            this.interval = BLiveTeenInterval.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
