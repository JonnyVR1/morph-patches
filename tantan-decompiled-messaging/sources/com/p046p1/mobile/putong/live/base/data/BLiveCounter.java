package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveCounter extends ValueObject<BLiveCounter> implements Cloneable, Serializable {
    public static JsonAdapter<BLiveCounter> JSON_ADAPTER = new ObjectJsonAdapter<BLiveCounter>() { // from class: com.p1.mobile.putong.live.base.data.BLiveCounter.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveCounter.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveCounter newInstance() {
            return new BLiveCounter();
        }

        public boolean parseField(BLiveCounter bLiveCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "voiceLiveReddot":
                    bLiveCounter.voiceLiveReddot = jsonParser.getValueAsInt();
                    return true;
                case "activity":
                    bLiveCounter.activity = BLiveActivityCounter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "liveTabUnread":
                    bLiveCounter.liveTabUnread = jsonParser.getValueAsInt();
                    return true;
                case "voiceLiveTextRedDot":
                    bLiveCounter.voiceLiveTextRedDot = JsonAdapter.parseArray(jsonParser, BLiveCommonViewConfig.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "guildLiveRedDot":
                    bLiveCounter.guildLiveRedDot = jsonParser.getValueAsInt();
                    return true;
                case "discoverReddot":
                    bLiveCounter.discoverReddot = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveCounter bLiveCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("discoverReddot", bLiveCounter.discoverReddot);
            if (bLiveCounter.activity != null) {
                jsonGenerator.writeFieldName("activity");
                BLiveActivityCounter.JSON_ADAPTER.serialize(bLiveCounter.activity, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("liveTabUnread", bLiveCounter.liveTabUnread);
            jsonGenerator.writeNumberField("voiceLiveReddot", bLiveCounter.voiceLiveReddot);
            if (bLiveCounter.voiceLiveTextRedDot != null) {
                jsonGenerator.writeFieldName("voiceLiveTextRedDot");
                JsonAdapter.serializeArray(bLiveCounter.voiceLiveTextRedDot, jsonGenerator, BLiveCommonViewConfig.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("guildLiveRedDot", bLiveCounter.guildLiveRedDot);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivecounter";

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveActivityCounter activity;

    @ProtobufIndex(index = 1)
    public int discoverReddot;

    @ProtobufIndex(index = 6)
    public int guildLiveRedDot;

    @ProtobufIndex(index = 3)
    public int liveTabUnread;
    private String requestUrl;

    @ProtobufIndex(index = 4)
    public int voiceLiveReddot;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<BLiveCommonViewConfig> voiceLiveTextRedDot;
    public boolean ignoredByLiveActivitiesModule = false;
    private HashSet<String> parseFieldSet = new HashSet<>();

    public static BLiveCounter new_() {
        BLiveCounter bLiveCounter = new BLiveCounter();
        bLiveCounter.nullCheck();
        return bLiveCounter;
    }

    public void clearTextRed() {
        this.voiceLiveTextRedDot.clear();
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveCounter mo223809clone() {
        BLiveCounter bLiveCounter = new BLiveCounter();
        bLiveCounter.discoverReddot = this.discoverReddot;
        BLiveActivityCounter bLiveActivityCounter = this.activity;
        if (bLiveActivityCounter != null) {
            bLiveCounter.activity = bLiveActivityCounter.mo223809clone();
        }
        bLiveCounter.liveTabUnread = this.liveTabUnread;
        bLiveCounter.voiceLiveReddot = this.voiceLiveReddot;
        List<BLiveCommonViewConfig> list = this.voiceLiveTextRedDot;
        if (list != null) {
            bLiveCounter.voiceLiveTextRedDot = ValueObject.util_map(list, new w9j() { // from class: l.qs1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveCommonViewConfig) obj).mo223809clone();
                }
            });
        }
        bLiveCounter.guildLiveRedDot = this.guildLiveRedDot;
        return bLiveCounter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveCounter)) {
            return false;
        }
        BLiveCounter bLiveCounter = (BLiveCounter) obj;
        return this.discoverReddot == bLiveCounter.discoverReddot && ValueObject.util_equals(this.activity, bLiveCounter.activity) && this.liveTabUnread == bLiveCounter.liveTabUnread && this.voiceLiveReddot == bLiveCounter.voiceLiveReddot && ValueObject.util_equals(this.voiceLiveTextRedDot, bLiveCounter.voiceLiveTextRedDot) && this.guildLiveRedDot == bLiveCounter.guildLiveRedDot;
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
        int i2 = ((i * 41) + this.discoverReddot) * 41;
        BLiveActivityCounter bLiveActivityCounter = this.activity;
        int iHashCode = (((((i2 + (bLiveActivityCounter != null ? bLiveActivityCounter.hashCode() : 0)) * 41) + this.liveTabUnread) * 41) + this.voiceLiveReddot) * 41;
        List<BLiveCommonViewConfig> list = this.voiceLiveTextRedDot;
        int iHashCode2 = ((iHashCode + (list != null ? list.hashCode() : 0)) * 41) + this.guildLiveRedDot;
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    public boolean isHaveNumRed() {
        BLiveActivityCounter bLiveActivityCounter = this.activity;
        return bLiveActivityCounter != null && bLiveActivityCounter.voiceActivityUnread > 0;
    }

    public boolean isHaveTextRed() {
        List<BLiveCommonViewConfig> list = this.voiceLiveTextRedDot;
        return list != null && list.size() > 0;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void mergeData(BLiveCounter bLiveCounter) {
        if (!shouldMergeData() || equals(bLiveCounter)) {
            return;
        }
        if (!isFieldParsed("discoverReddot")) {
            this.discoverReddot = bLiveCounter.discoverReddot;
        }
        if (!isFieldParsed("activity")) {
            this.activity = bLiveCounter.activity;
        }
        if (!isFieldParsed("liveTabUnread")) {
            this.liveTabUnread = bLiveCounter.liveTabUnread;
        }
        if (!isFieldParsed("voiceLiveReddot")) {
            this.voiceLiveReddot = bLiveCounter.voiceLiveReddot;
        }
        if (!isFieldParsed("voiceLiveTextRedDot")) {
            this.voiceLiveTextRedDot = bLiveCounter.voiceLiveTextRedDot;
        }
        if (!isFieldParsed("guildLiveRedDot")) {
            this.guildLiveRedDot = bLiveCounter.guildLiveRedDot;
        }
        this.parseFieldSet.clear();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.activity == null) {
            this.activity = BLiveActivityCounter.new_();
        }
        if (this.voiceLiveTextRedDot == null) {
            this.voiceLiveTextRedDot = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
