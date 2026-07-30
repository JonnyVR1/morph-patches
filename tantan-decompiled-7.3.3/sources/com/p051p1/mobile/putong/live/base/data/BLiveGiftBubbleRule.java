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
public class BLiveGiftBubbleRule extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveGiftBubbleRule> JSON_ADAPTER = new ObjectJsonAdapter<BLiveGiftBubbleRule>() { // from class: com.p1.mobile.putong.live.base.data.BLiveGiftBubbleRule.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveGiftBubbleRule.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveGiftBubbleRule newInstance() {
            return new BLiveGiftBubbleRule();
        }

        public boolean parseField(BLiveGiftBubbleRule bLiveGiftBubbleRule, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("displayInterval")) {
                bLiveGiftBubbleRule.displayInterval = jsonParser.getValueAsLong();
                return true;
            }
            if (!str.equals("displayDuration")) {
                return false;
            }
            bLiveGiftBubbleRule.displayDuration = jsonParser.getValueAsLong();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveGiftBubbleRule bLiveGiftBubbleRule, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("displayInterval", bLiveGiftBubbleRule.displayInterval);
            jsonGenerator.writeNumberField("displayDuration", bLiveGiftBubbleRule.displayDuration);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveGiftBubbleRule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivegiftbubblerule";

    @ProtobufIndex(index = 2)
    public long displayDuration;

    @ProtobufIndex(index = 1)
    public long displayInterval;

    public static BLiveGiftBubbleRule new_() {
        BLiveGiftBubbleRule bLiveGiftBubbleRule = new BLiveGiftBubbleRule();
        bLiveGiftBubbleRule.nullCheck();
        return bLiveGiftBubbleRule;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveGiftBubbleRule mo225055clone() {
        BLiveGiftBubbleRule bLiveGiftBubbleRule = new BLiveGiftBubbleRule();
        bLiveGiftBubbleRule.displayInterval = this.displayInterval;
        bLiveGiftBubbleRule.displayDuration = this.displayDuration;
        return bLiveGiftBubbleRule;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveGiftBubbleRule)) {
            return false;
        }
        BLiveGiftBubbleRule bLiveGiftBubbleRule = (BLiveGiftBubbleRule) obj;
        return this.displayInterval == bLiveGiftBubbleRule.displayInterval && this.displayDuration == bLiveGiftBubbleRule.displayDuration;
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
        long j = this.displayInterval;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.displayDuration;
        int i3 = i2 + ((int) (j2 ^ (j2 >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
