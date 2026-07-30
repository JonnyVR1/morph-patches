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
public class BLiveChatLimitation extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveChatLimitation> JSON_ADAPTER = new ObjectJsonAdapter<BLiveChatLimitation>() { // from class: com.p1.mobile.putong.live.base.data.BLiveChatLimitation.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveChatLimitation.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveChatLimitation newInstance() {
            return new BLiveChatLimitation();
        }

        public boolean parseField(BLiveChatLimitation bLiveChatLimitation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "floodsMinSendIntervalSeconds":
                    bLiveChatLimitation.floodsMinSendIntervalSeconds = jsonParser.getValueAsLong();
                    return true;
                case "minSendIntervalMillSeconds":
                    bLiveChatLimitation.minSendIntervalMillSeconds = jsonParser.getValueAsLong();
                    return true;
                case "limitTips":
                    bLiveChatLimitation.limitTips = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveChatLimitation bLiveChatLimitation, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("minSendIntervalMillSeconds", bLiveChatLimitation.minSendIntervalMillSeconds);
            jsonGenerator.writeNumberField("floodsMinSendIntervalSeconds", bLiveChatLimitation.floodsMinSendIntervalSeconds);
            String str = bLiveChatLimitation.limitTips;
            if (str != null) {
                jsonGenerator.writeStringField("limitTips", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveChatLimitation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivechatlimitation";

    @ProtobufIndex(index = 2)
    public long floodsMinSendIntervalSeconds;

    @NonNull
    @ProtobufIndex(index = 3)
    public String limitTips;

    @ProtobufIndex(index = 1)
    public long minSendIntervalMillSeconds;

    public static BLiveChatLimitation new_() {
        BLiveChatLimitation bLiveChatLimitation = new BLiveChatLimitation();
        bLiveChatLimitation.nullCheck();
        return bLiveChatLimitation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveChatLimitation mo225055clone() {
        BLiveChatLimitation bLiveChatLimitation = new BLiveChatLimitation();
        bLiveChatLimitation.minSendIntervalMillSeconds = this.minSendIntervalMillSeconds;
        bLiveChatLimitation.floodsMinSendIntervalSeconds = this.floodsMinSendIntervalSeconds;
        bLiveChatLimitation.limitTips = this.limitTips;
        return bLiveChatLimitation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveChatLimitation)) {
            return false;
        }
        BLiveChatLimitation bLiveChatLimitation = (BLiveChatLimitation) obj;
        return this.minSendIntervalMillSeconds == bLiveChatLimitation.minSendIntervalMillSeconds && this.floodsMinSendIntervalSeconds == bLiveChatLimitation.floodsMinSendIntervalSeconds && ValueObject.util_equals(this.limitTips, bLiveChatLimitation.limitTips);
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
        long j = this.minSendIntervalMillSeconds;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.floodsMinSendIntervalSeconds;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str = this.limitTips;
        int iHashCode = i3 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.limitTips == null) {
            this.limitTips = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
