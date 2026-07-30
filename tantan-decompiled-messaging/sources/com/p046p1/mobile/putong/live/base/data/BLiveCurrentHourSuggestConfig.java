package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.core.data.Target;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveCurrentHourSuggestConfig;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveCurrentHourSuggestConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveCurrentHourSuggestConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveCurrentHourSuggestConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveCurrentHourSuggestConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveCurrentHourSuggestConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveCurrentHourSuggestConfig newInstance() {
            return new BLiveCurrentHourSuggestConfig();
        }

        public boolean parseField(BLiveCurrentHourSuggestConfig bLiveCurrentHourSuggestConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enable":
                    bLiveCurrentHourSuggestConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "target":
                    bLiveCurrentHourSuggestConfig.target = jsonParser.getValueAsInt();
                    return true;
                case "nodes":
                    bLiveCurrentHourSuggestConfig.nodes = JsonAdapter.parseArray(jsonParser, JsonAdapter.LONG_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "scrollTexts":
                    bLiveCurrentHourSuggestConfig.scrollTexts = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveCurrentHourSuggestConfig bLiveCurrentHourSuggestConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", bLiveCurrentHourSuggestConfig.enable);
            jsonGenerator.writeNumberField(Target.TYPE, bLiveCurrentHourSuggestConfig.target);
            if (bLiveCurrentHourSuggestConfig.nodes != null) {
                jsonGenerator.writeFieldName("nodes");
                JsonAdapter.serializeArray(bLiveCurrentHourSuggestConfig.nodes, jsonGenerator, JsonAdapter.LONG_BOXED_ADAPTER);
            }
            if (bLiveCurrentHourSuggestConfig.scrollTexts != null) {
                jsonGenerator.writeFieldName("scrollTexts");
                JsonAdapter.serializeArray(bLiveCurrentHourSuggestConfig.scrollTexts, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveCurrentHourSuggestConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivecurrenthoursuggestconfig";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<Long> nodes;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> scrollTexts;

    @ProtobufIndex(index = 2)
    public int target;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m67762a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Long m67763b(Long l2) {
        return l2;
    }

    public static BLiveCurrentHourSuggestConfig new_() {
        BLiveCurrentHourSuggestConfig bLiveCurrentHourSuggestConfig = new BLiveCurrentHourSuggestConfig();
        bLiveCurrentHourSuggestConfig.nullCheck();
        return bLiveCurrentHourSuggestConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveCurrentHourSuggestConfig mo223809clone() {
        BLiveCurrentHourSuggestConfig bLiveCurrentHourSuggestConfig = new BLiveCurrentHourSuggestConfig();
        bLiveCurrentHourSuggestConfig.enable = this.enable;
        bLiveCurrentHourSuggestConfig.target = this.target;
        List<Long> list = this.nodes;
        if (list != null) {
            bLiveCurrentHourSuggestConfig.nodes = ValueObject.util_map(list, new w9j() { // from class: l.ss1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveCurrentHourSuggestConfig.m67763b((Long) obj);
                }
            });
        }
        List<String> list2 = this.scrollTexts;
        if (list2 != null) {
            bLiveCurrentHourSuggestConfig.scrollTexts = ValueObject.util_map(list2, new w9j() { // from class: l.ts1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveCurrentHourSuggestConfig.m67762a((String) obj);
                }
            });
        }
        return bLiveCurrentHourSuggestConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveCurrentHourSuggestConfig)) {
            return false;
        }
        BLiveCurrentHourSuggestConfig bLiveCurrentHourSuggestConfig = (BLiveCurrentHourSuggestConfig) obj;
        return this.enable == bLiveCurrentHourSuggestConfig.enable && this.target == bLiveCurrentHourSuggestConfig.target && ValueObject.util_equals(this.nodes, bLiveCurrentHourSuggestConfig.nodes) && ValueObject.util_equals(this.scrollTexts, bLiveCurrentHourSuggestConfig.scrollTexts);
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
        int i2 = ((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.target) * 41;
        List<Long> list = this.nodes;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.scrollTexts;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.nodes == null) {
            this.nodes = new ArrayList();
        }
        if (this.scrollTexts == null) {
            this.scrollTexts = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
