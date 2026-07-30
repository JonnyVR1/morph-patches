package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonConfig;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveCommonConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveCommonConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveCommonConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveCommonConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveCommonConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveCommonConfig newInstance() {
            return new BLiveCommonConfig();
        }

        public boolean parseField(BLiveCommonConfig bLiveCommonConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "expireTime":
                    bLiveCommonConfig.expireTime = jsonParser.getValueAsInt();
                    return true;
                case "maxLength":
                    bLiveCommonConfig.maxLength = jsonParser.getValueAsInt();
                    return true;
                case "showTagBeforeEnd":
                    bLiveCommonConfig.showTagBeforeEnd = jsonParser.getValueAsInt();
                    return true;
                case "showCountPerDay":
                    bLiveCommonConfig.showCountPerDay = jsonParser.getValueAsInt();
                    return true;
                case "on":
                    bLiveCommonConfig.f45198on = jsonParser.getValueAsBoolean();
                    return true;
                case "index":
                    bLiveCommonConfig.index = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : Integer.valueOf(jsonParser.getValueAsInt());
                    return true;
                case "autoAnswerSeconds":
                    bLiveCommonConfig.autoAnswerSeconds = jsonParser.getValueAsInt();
                    return true;
                case "postConfirmingTextOn":
                    bLiveCommonConfig.postConfirmingTextOn = jsonParser.getValueAsBoolean();
                    return true;
                case "positions":
                    bLiveCommonConfig.positions = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveCommonConfig bLiveCommonConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("on", bLiveCommonConfig.f45198on);
            if (bLiveCommonConfig.positions != null) {
                jsonGenerator.writeFieldName("positions");
                JsonAdapter.serializeArray(bLiveCommonConfig.positions, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            jsonGenerator.writeNumberField("maxLength", bLiveCommonConfig.maxLength);
            jsonGenerator.writeNumberField("showCountPerDay", bLiveCommonConfig.showCountPerDay);
            jsonGenerator.writeBooleanField("postConfirmingTextOn", bLiveCommonConfig.postConfirmingTextOn);
            jsonGenerator.writeNumberField("showTagBeforeEnd", bLiveCommonConfig.showTagBeforeEnd);
            jsonGenerator.writeNumberField("expireTime", bLiveCommonConfig.expireTime);
            Integer num = bLiveCommonConfig.index;
            if (num != null) {
                jsonGenerator.writeNumberField(FirebaseAnalytics.Param.INDEX, num.intValue());
            }
            jsonGenerator.writeNumberField("autoAnswerSeconds", bLiveCommonConfig.autoAnswerSeconds);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveCommonConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivecommonconfig";

    @ProtobufIndex(index = 9)
    public int autoAnswerSeconds;

    @ProtobufIndex(index = 7)
    public int expireTime;

    @NonNull
    @ProtobufIndex(index = 8)
    public Integer index;

    @ProtobufIndex(index = 3)
    public int maxLength;

    /* JADX INFO: renamed from: on */
    @ProtobufIndex(index = 1)
    public boolean f45198on;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Integer> positions;

    @ProtobufIndex(index = 5)
    public boolean postConfirmingTextOn;

    @ProtobufIndex(index = 4)
    public int showCountPerDay;

    @ProtobufIndex(index = 6)
    public int showTagBeforeEnd;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m68936a(Integer num) {
        return num;
    }

    public static BLiveCommonConfig new_() {
        BLiveCommonConfig bLiveCommonConfig = new BLiveCommonConfig();
        bLiveCommonConfig.nullCheck();
        return bLiveCommonConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveCommonConfig mo225055clone() {
        BLiveCommonConfig bLiveCommonConfig = new BLiveCommonConfig();
        bLiveCommonConfig.f45198on = this.f45198on;
        List<Integer> list = this.positions;
        if (list != null) {
            bLiveCommonConfig.positions = ValueObject.util_map(list, new qcj() { // from class: l.ts1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveCommonConfig.m68936a((Integer) obj);
                }
            });
        }
        bLiveCommonConfig.maxLength = this.maxLength;
        bLiveCommonConfig.showCountPerDay = this.showCountPerDay;
        bLiveCommonConfig.postConfirmingTextOn = this.postConfirmingTextOn;
        bLiveCommonConfig.showTagBeforeEnd = this.showTagBeforeEnd;
        bLiveCommonConfig.expireTime = this.expireTime;
        bLiveCommonConfig.index = this.index;
        bLiveCommonConfig.autoAnswerSeconds = this.autoAnswerSeconds;
        return bLiveCommonConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveCommonConfig)) {
            return false;
        }
        BLiveCommonConfig bLiveCommonConfig = (BLiveCommonConfig) obj;
        return this.f45198on == bLiveCommonConfig.f45198on && ValueObject.util_equals(this.positions, bLiveCommonConfig.positions) && this.maxLength == bLiveCommonConfig.maxLength && this.showCountPerDay == bLiveCommonConfig.showCountPerDay && this.postConfirmingTextOn == bLiveCommonConfig.postConfirmingTextOn && this.showTagBeforeEnd == bLiveCommonConfig.showTagBeforeEnd && this.expireTime == bLiveCommonConfig.expireTime && ValueObject.util_equals(this.index, bLiveCommonConfig.index) && this.autoAnswerSeconds == bLiveCommonConfig.autoAnswerSeconds;
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
        int i2 = ((i * 41) + (this.f45198on ? 1231 : 1237)) * 41;
        List<Integer> list = this.positions;
        int iHashCode = (((((((((((i2 + (list != null ? list.hashCode() : 0)) * 41) + this.maxLength) * 41) + this.showCountPerDay) * 41) + (this.postConfirmingTextOn ? 1231 : 1237)) * 41) + this.showTagBeforeEnd) * 41) + this.expireTime) * 41;
        Integer num = this.index;
        int iHashCode2 = ((iHashCode + (num != null ? num.hashCode() : 0)) * 41) + this.autoAnswerSeconds;
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.positions == null) {
            this.positions = new ArrayList();
        }
        if (this.index == null) {
            this.index = 0;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
