package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveMonetizationConfig;
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
public class BLiveMonetizationConfig extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveMonetizationConfig> JSON_ADAPTER = new ObjectJsonAdapter<BLiveMonetizationConfig>() { // from class: com.p1.mobile.putong.live.base.data.BLiveMonetizationConfig.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveMonetizationConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveMonetizationConfig newInstance() {
            return new BLiveMonetizationConfig();
        }

        public boolean parseField(BLiveMonetizationConfig bLiveMonetizationConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "buttonConfigs":
                    bLiveMonetizationConfig.buttonConfigs = JsonAdapter.parseArray(jsonParser, BLiveButtonConfig.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "totalBubbleUserShowMaxCount":
                    bLiveMonetizationConfig.totalBubbleUserShowMaxCount = jsonParser.getValueAsInt();
                    return true;
                case "toolBar":
                    bLiveMonetizationConfig.toolBar = BLiveToolBar.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "totalBubbleEveryDayShowMaxCount":
                    bLiveMonetizationConfig.totalBubbleEveryDayShowMaxCount = jsonParser.getValueAsInt();
                    return true;
                case "audienceBubblePriority":
                    bLiveMonetizationConfig.audienceBubblePriority = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "isPaidUser":
                    bLiveMonetizationConfig.isPaidUser = jsonParser.getValueAsBoolean();
                    return true;
                case "totalBubbleUserShowInRoomCount":
                    bLiveMonetizationConfig.totalBubbleUserShowInRoomCount = jsonParser.getValueAsInt();
                    return true;
                case "anchorBubblePriority":
                    bLiveMonetizationConfig.anchorBubblePriority = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "bubbleConfigs":
                    bLiveMonetizationConfig.bubbleConfigs = JsonAdapter.parseArray(jsonParser, BLiveBubbleConfig.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveMonetizationConfig bLiveMonetizationConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isPaidUser", bLiveMonetizationConfig.isPaidUser);
            if (bLiveMonetizationConfig.bubbleConfigs != null) {
                jsonGenerator.writeFieldName("bubbleConfigs");
                JsonAdapter.serializeArray(bLiveMonetizationConfig.bubbleConfigs, jsonGenerator, BLiveBubbleConfig.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("totalBubbleEveryDayShowMaxCount", bLiveMonetizationConfig.totalBubbleEveryDayShowMaxCount);
            jsonGenerator.writeNumberField("totalBubbleUserShowMaxCount", bLiveMonetizationConfig.totalBubbleUserShowMaxCount);
            if (bLiveMonetizationConfig.buttonConfigs != null) {
                jsonGenerator.writeFieldName("buttonConfigs");
                JsonAdapter.serializeArray(bLiveMonetizationConfig.buttonConfigs, jsonGenerator, BLiveButtonConfig.JSON_ADAPTER);
            }
            if (bLiveMonetizationConfig.toolBar != null) {
                jsonGenerator.writeFieldName("toolBar");
                BLiveToolBar.JSON_ADAPTER.serialize(bLiveMonetizationConfig.toolBar, jsonGenerator, true);
            }
            if (bLiveMonetizationConfig.anchorBubblePriority != null) {
                jsonGenerator.writeFieldName("anchorBubblePriority");
                JsonAdapter.serializeArray(bLiveMonetizationConfig.anchorBubblePriority, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (bLiveMonetizationConfig.audienceBubblePriority != null) {
                jsonGenerator.writeFieldName("audienceBubblePriority");
                JsonAdapter.serializeArray(bLiveMonetizationConfig.audienceBubblePriority, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("totalBubbleUserShowInRoomCount", bLiveMonetizationConfig.totalBubbleUserShowInRoomCount);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveMonetizationConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivemonetizationconfig";

    @NonNull
    @ProtobufIndex(index = 7)
    public List<String> anchorBubblePriority;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<String> audienceBubblePriority;

    @Nullable
    @ProtobufIndex(index = 2)
    public List<BLiveBubbleConfig> bubbleConfigs;

    @Nullable
    @ProtobufIndex(index = 5)
    public List<BLiveButtonConfig> buttonConfigs;

    @ProtobufIndex(index = 1)
    public boolean isPaidUser;

    @Nullable
    @ProtobufIndex(index = 6)
    public BLiveToolBar toolBar;

    @ProtobufIndex(index = 3)
    public int totalBubbleEveryDayShowMaxCount;

    @ProtobufIndex(index = 9)
    public int totalBubbleUserShowInRoomCount;

    @ProtobufIndex(index = 4)
    public int totalBubbleUserShowMaxCount;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m68064a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m68066c(String str) {
        return str;
    }

    public static BLiveMonetizationConfig new_() {
        BLiveMonetizationConfig bLiveMonetizationConfig = new BLiveMonetizationConfig();
        bLiveMonetizationConfig.nullCheck();
        return bLiveMonetizationConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveMonetizationConfig mo223809clone() {
        BLiveMonetizationConfig bLiveMonetizationConfig = new BLiveMonetizationConfig();
        bLiveMonetizationConfig.isPaidUser = this.isPaidUser;
        List<BLiveBubbleConfig> list = this.bubbleConfigs;
        if (list != null) {
            bLiveMonetizationConfig.bubbleConfigs = ValueObject.util_map(list, new w9j() { // from class: l.s22
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveBubbleConfig) obj).mo223809clone();
                }
            });
        }
        bLiveMonetizationConfig.totalBubbleEveryDayShowMaxCount = this.totalBubbleEveryDayShowMaxCount;
        bLiveMonetizationConfig.totalBubbleUserShowMaxCount = this.totalBubbleUserShowMaxCount;
        List<BLiveButtonConfig> list2 = this.buttonConfigs;
        if (list2 != null) {
            bLiveMonetizationConfig.buttonConfigs = ValueObject.util_map(list2, new w9j() { // from class: l.t22
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveButtonConfig) obj).mo223809clone();
                }
            });
        }
        BLiveToolBar bLiveToolBar = this.toolBar;
        if (bLiveToolBar != null) {
            bLiveMonetizationConfig.toolBar = bLiveToolBar.mo223809clone();
        }
        List<String> list3 = this.anchorBubblePriority;
        if (list3 != null) {
            bLiveMonetizationConfig.anchorBubblePriority = ValueObject.util_map(list3, new w9j() { // from class: l.u22
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveMonetizationConfig.m68064a((String) obj);
                }
            });
        }
        List<String> list4 = this.audienceBubblePriority;
        if (list4 != null) {
            bLiveMonetizationConfig.audienceBubblePriority = ValueObject.util_map(list4, new w9j() { // from class: l.v22
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveMonetizationConfig.m68066c((String) obj);
                }
            });
        }
        bLiveMonetizationConfig.totalBubbleUserShowInRoomCount = this.totalBubbleUserShowInRoomCount;
        return bLiveMonetizationConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveMonetizationConfig)) {
            return false;
        }
        BLiveMonetizationConfig bLiveMonetizationConfig = (BLiveMonetizationConfig) obj;
        return this.isPaidUser == bLiveMonetizationConfig.isPaidUser && ValueObject.util_equals(this.bubbleConfigs, bLiveMonetizationConfig.bubbleConfigs) && this.totalBubbleEveryDayShowMaxCount == bLiveMonetizationConfig.totalBubbleEveryDayShowMaxCount && this.totalBubbleUserShowMaxCount == bLiveMonetizationConfig.totalBubbleUserShowMaxCount && ValueObject.util_equals(this.buttonConfigs, bLiveMonetizationConfig.buttonConfigs) && ValueObject.util_equals(this.toolBar, bLiveMonetizationConfig.toolBar) && ValueObject.util_equals(this.anchorBubblePriority, bLiveMonetizationConfig.anchorBubblePriority) && ValueObject.util_equals(this.audienceBubblePriority, bLiveMonetizationConfig.audienceBubblePriority) && this.totalBubbleUserShowInRoomCount == bLiveMonetizationConfig.totalBubbleUserShowInRoomCount;
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
        int i2 = ((i * 41) + (this.isPaidUser ? 1231 : 1237)) * 41;
        List<BLiveBubbleConfig> list = this.bubbleConfigs;
        int iHashCode = (((((i2 + (list != null ? list.hashCode() : 0)) * 41) + this.totalBubbleEveryDayShowMaxCount) * 41) + this.totalBubbleUserShowMaxCount) * 41;
        List<BLiveButtonConfig> list2 = this.buttonConfigs;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        BLiveToolBar bLiveToolBar = this.toolBar;
        int iHashCode3 = (iHashCode2 + (bLiveToolBar != null ? bLiveToolBar.hashCode() : 0)) * 41;
        List<String> list3 = this.anchorBubblePriority;
        int iHashCode4 = (iHashCode3 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<String> list4 = this.audienceBubblePriority;
        int iHashCode5 = ((iHashCode4 + (list4 != null ? list4.hashCode() : 0)) * 41) + this.totalBubbleUserShowInRoomCount;
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.anchorBubblePriority == null) {
            this.anchorBubblePriority = new ArrayList();
        }
        if (this.audienceBubblePriority == null) {
            this.audienceBubblePriority = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
