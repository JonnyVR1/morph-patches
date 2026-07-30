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
public class BLiveSwipeLiveCardConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSwipeLiveCardConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSwipeLiveCardConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSwipeLiveCardConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSwipeLiveCardConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSwipeLiveCardConfig newInstance() {
            return new BLiveSwipeLiveCardConfig();
        }

        public boolean parseField(BLiveSwipeLiveCardConfig bLiveSwipeLiveCardConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("swipeEnable")) {
                return false;
            }
            bLiveSwipeLiveCardConfig.swipeEnable = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSwipeLiveCardConfig bLiveSwipeLiveCardConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("swipeEnable", bLiveSwipeLiveCardConfig.swipeEnable);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSwipeLiveCardConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveswipelivecardconfig";

    @ProtobufIndex(index = 1)
    public boolean swipeEnable;

    public static BLiveSwipeLiveCardConfig new_() {
        BLiveSwipeLiveCardConfig bLiveSwipeLiveCardConfig = new BLiveSwipeLiveCardConfig();
        bLiveSwipeLiveCardConfig.nullCheck();
        return bLiveSwipeLiveCardConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSwipeLiveCardConfig mo223809clone() {
        BLiveSwipeLiveCardConfig bLiveSwipeLiveCardConfig = new BLiveSwipeLiveCardConfig();
        bLiveSwipeLiveCardConfig.swipeEnable = this.swipeEnable;
        return bLiveSwipeLiveCardConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BLiveSwipeLiveCardConfig) && this.swipeEnable == ((BLiveSwipeLiveCardConfig) obj).swipeEnable;
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
        int i2 = (i * 41) + (this.swipeEnable ? 1231 : 1237);
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
