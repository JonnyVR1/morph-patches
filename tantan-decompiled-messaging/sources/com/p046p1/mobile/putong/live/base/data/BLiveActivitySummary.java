package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveActivityCardLive;
import com.p046p1.mobile.putong.live.base.data.BLiveActivitySummary;
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
public class BLiveActivitySummary extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveActivitySummary> JSON_ADAPTER = new ObjectJsonAdapter<BLiveActivitySummary>() { // from class: com.p1.mobile.putong.live.base.data.BLiveActivitySummary.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveActivitySummary.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveActivitySummary newInstance() {
            return new BLiveActivitySummary();
        }

        public boolean parseField(BLiveActivitySummary bLiveActivitySummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "showStartLiveGuide":
                    bLiveActivitySummary.showStartLiveGuide = jsonParser.getValueAsBoolean();
                    return true;
                case "description":
                    bLiveActivitySummary.description = BLiveActivityDesc.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "counters":
                    bLiveActivitySummary.counters = BLiveActivitySummaryCounters.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "cardLives":
                    bLiveActivitySummary.cardLives = JsonAdapter.parseArray(jsonParser, BLiveActivityCardLive.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    bLiveActivitySummary.f44328id = jsonParser.getValueAsInt();
                    return false;
                case "type":
                    bLiveActivitySummary.type = jsonParser.getValueAsString();
                    return true;
                case "icons":
                    bLiveActivitySummary.icons = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "cardEnterLive":
                    bLiveActivitySummary.cardEnterLive = jsonParser.getValueAsBoolean();
                    return true;
                case "ongoingLiveIds":
                    bLiveActivitySummary.ongoingLiveIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveActivitySummary bLiveActivitySummary, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", bLiveActivitySummary.f44328id);
            if (bLiveActivitySummary.description != null) {
                jsonGenerator.writeFieldName("description");
                BLiveActivityDesc.JSON_ADAPTER.serialize(bLiveActivitySummary.description, jsonGenerator, true);
            }
            if (bLiveActivitySummary.counters != null) {
                jsonGenerator.writeFieldName("counters");
                BLiveActivitySummaryCounters.JSON_ADAPTER.serialize(bLiveActivitySummary.counters, jsonGenerator, true);
            }
            if (bLiveActivitySummary.ongoingLiveIds != null) {
                jsonGenerator.writeFieldName("ongoingLiveIds");
                JsonAdapter.serializeArray(bLiveActivitySummary.ongoingLiveIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str = bLiveActivitySummary.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            jsonGenerator.writeBooleanField("showStartLiveGuide", bLiveActivitySummary.showStartLiveGuide);
            if (bLiveActivitySummary.icons != null) {
                jsonGenerator.writeFieldName("icons");
                JsonAdapter.serializeArray(bLiveActivitySummary.icons, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeBooleanField("cardEnterLive", bLiveActivitySummary.cardEnterLive);
            if (bLiveActivitySummary.cardLives != null) {
                jsonGenerator.writeFieldName("cardLives");
                JsonAdapter.serializeArray(bLiveActivitySummary.cardLives, jsonGenerator, BLiveActivityCardLive.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveActivitySummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveactivitysummary";

    @ProtobufIndex(index = 8)
    public boolean cardEnterLive;

    @NonNull
    @ProtobufIndex(index = 9)
    public List<BLiveActivityCardLive> cardLives;

    @Nullable
    @ProtobufIndex(index = 3)
    public BLiveActivitySummaryCounters counters;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveActivityDesc description;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<String> icons;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f44328id;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> ongoingLiveIds;

    @ProtobufIndex(index = 6)
    public boolean showStartLiveGuide;

    @NonNull
    @ProtobufIndex(index = 5)
    public String type;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m67666a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m67667b(String str) {
        return str;
    }

    public static BLiveActivitySummary new_() {
        BLiveActivitySummary bLiveActivitySummary = new BLiveActivitySummary();
        bLiveActivitySummary.nullCheck();
        return bLiveActivitySummary;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveActivitySummary mo223809clone() {
        BLiveActivitySummary bLiveActivitySummary = new BLiveActivitySummary();
        bLiveActivitySummary.f44328id = this.f44328id;
        BLiveActivityDesc bLiveActivityDesc = this.description;
        if (bLiveActivityDesc != null) {
            bLiveActivitySummary.description = bLiveActivityDesc.mo223809clone();
        }
        BLiveActivitySummaryCounters bLiveActivitySummaryCounters = this.counters;
        if (bLiveActivitySummaryCounters != null) {
            bLiveActivitySummary.counters = bLiveActivitySummaryCounters.mo223809clone();
        }
        List<String> list = this.ongoingLiveIds;
        if (list != null) {
            bLiveActivitySummary.ongoingLiveIds = ValueObject.util_map(list, new w9j() { // from class: l.wq1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveActivitySummary.m67667b((String) obj);
                }
            });
        }
        bLiveActivitySummary.type = this.type;
        bLiveActivitySummary.showStartLiveGuide = this.showStartLiveGuide;
        List<String> list2 = this.icons;
        if (list2 != null) {
            bLiveActivitySummary.icons = ValueObject.util_map(list2, new w9j() { // from class: l.xq1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveActivitySummary.m67666a((String) obj);
                }
            });
        }
        bLiveActivitySummary.cardEnterLive = this.cardEnterLive;
        List<BLiveActivityCardLive> list3 = this.cardLives;
        if (list3 != null) {
            bLiveActivitySummary.cardLives = ValueObject.util_map(list3, new w9j() { // from class: l.yq1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveActivityCardLive) obj).mo223809clone();
                }
            });
        }
        return bLiveActivitySummary;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveActivitySummary)) {
            return false;
        }
        BLiveActivitySummary bLiveActivitySummary = (BLiveActivitySummary) obj;
        return this.f44328id == bLiveActivitySummary.f44328id && ValueObject.util_equals(this.description, bLiveActivitySummary.description) && ValueObject.util_equals(this.counters, bLiveActivitySummary.counters) && ValueObject.util_equals(this.ongoingLiveIds, bLiveActivitySummary.ongoingLiveIds) && ValueObject.util_equals(this.type, bLiveActivitySummary.type) && this.showStartLiveGuide == bLiveActivitySummary.showStartLiveGuide && ValueObject.util_equals(this.icons, bLiveActivitySummary.icons) && this.cardEnterLive == bLiveActivitySummary.cardEnterLive && ValueObject.util_equals(this.cardLives, bLiveActivitySummary.cardLives);
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
        int i2 = ((i * 41) + this.f44328id) * 41;
        BLiveActivityDesc bLiveActivityDesc = this.description;
        int iHashCode = (i2 + (bLiveActivityDesc != null ? bLiveActivityDesc.hashCode() : 0)) * 41;
        BLiveActivitySummaryCounters bLiveActivitySummaryCounters = this.counters;
        int iHashCode2 = (iHashCode + (bLiveActivitySummaryCounters != null ? bLiveActivitySummaryCounters.hashCode() : 0)) * 41;
        List<String> list = this.ongoingLiveIds;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.type;
        int iHashCode4 = (((iHashCode3 + (str != null ? str.hashCode() : 0)) * 41) + (this.showStartLiveGuide ? 1231 : 1237)) * 41;
        List<String> list2 = this.icons;
        int iHashCode5 = (((iHashCode4 + (list2 != null ? list2.hashCode() : 0)) * 41) + (this.cardEnterLive ? 1231 : 1237)) * 41;
        List<BLiveActivityCardLive> list3 = this.cardLives;
        int iHashCode6 = iHashCode5 + (list3 != null ? list3.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.description == null) {
            this.description = BLiveActivityDesc.new_();
        }
        if (this.ongoingLiveIds == null) {
            this.ongoingLiveIds = new ArrayList();
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.icons == null) {
            this.icons = new ArrayList();
        }
        if (this.cardLives == null) {
            this.cardLives = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
