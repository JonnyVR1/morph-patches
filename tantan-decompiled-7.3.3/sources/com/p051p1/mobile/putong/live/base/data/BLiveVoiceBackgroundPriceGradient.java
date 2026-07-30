package com.p051p1.mobile.putong.live.base.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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
public class BLiveVoiceBackgroundPriceGradient extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceBackgroundPriceGradient> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceBackgroundPriceGradient>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceBackgroundPriceGradient.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceBackgroundPriceGradient.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceBackgroundPriceGradient newInstance() {
            return new BLiveVoiceBackgroundPriceGradient();
        }

        public boolean parseField(BLiveVoiceBackgroundPriceGradient bLiveVoiceBackgroundPriceGradient, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "gradientIndex":
                    bLiveVoiceBackgroundPriceGradient.gradientIndex = jsonParser.getValueAsInt();
                    return true;
                case "expiredDuration":
                    bLiveVoiceBackgroundPriceGradient.expiredDuration = jsonParser.getValueAsInt();
                    return true;
                case "price":
                    bLiveVoiceBackgroundPriceGradient.price = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceBackgroundPriceGradient bLiveVoiceBackgroundPriceGradient, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("gradientIndex", bLiveVoiceBackgroundPriceGradient.gradientIndex);
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.PRICE, bLiveVoiceBackgroundPriceGradient.price);
            jsonGenerator.writeNumberField("expiredDuration", bLiveVoiceBackgroundPriceGradient.expiredDuration);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceBackgroundPriceGradient) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicebackgroundpricegradient";

    @ProtobufIndex(index = 3)
    public int expiredDuration;

    @ProtobufIndex(index = 1)
    public int gradientIndex;

    @ProtobufIndex(index = 2)
    public int price;

    public static BLiveVoiceBackgroundPriceGradient new_() {
        BLiveVoiceBackgroundPriceGradient bLiveVoiceBackgroundPriceGradient = new BLiveVoiceBackgroundPriceGradient();
        bLiveVoiceBackgroundPriceGradient.nullCheck();
        return bLiveVoiceBackgroundPriceGradient;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceBackgroundPriceGradient mo225055clone() {
        BLiveVoiceBackgroundPriceGradient bLiveVoiceBackgroundPriceGradient = new BLiveVoiceBackgroundPriceGradient();
        bLiveVoiceBackgroundPriceGradient.gradientIndex = this.gradientIndex;
        bLiveVoiceBackgroundPriceGradient.price = this.price;
        bLiveVoiceBackgroundPriceGradient.expiredDuration = this.expiredDuration;
        return bLiveVoiceBackgroundPriceGradient;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceBackgroundPriceGradient)) {
            return false;
        }
        BLiveVoiceBackgroundPriceGradient bLiveVoiceBackgroundPriceGradient = (BLiveVoiceBackgroundPriceGradient) obj;
        return this.gradientIndex == bLiveVoiceBackgroundPriceGradient.gradientIndex && this.price == bLiveVoiceBackgroundPriceGradient.price && this.expiredDuration == bLiveVoiceBackgroundPriceGradient.expiredDuration;
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
        int i2 = (((((i * 41) + this.gradientIndex) * 41) + this.price) * 41) + this.expiredDuration;
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
