package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceBannerTab;
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
public class BLiveVoiceFeedBanners extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceFeedBanners> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceFeedBanners>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceFeedBanners.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceFeedBanners.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceFeedBanners newInstance() {
            return new BLiveVoiceFeedBanners();
        }

        public boolean parseField(BLiveVoiceFeedBanners bLiveVoiceFeedBanners, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    bLiveVoiceFeedBanners.duration = jsonParser.getValueAsInt();
                    return true;
                case "cardIndex":
                    bLiveVoiceFeedBanners.cardIndex = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    bLiveVoiceFeedBanners.f44495id = jsonParser.getValueAsString();
                    return false;
                case "tabs":
                    bLiveVoiceFeedBanners.tabs = JsonAdapter.parseArray(jsonParser, BLiveVoiceBannerTab.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "type":
                    bLiveVoiceFeedBanners.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceFeedBanners bLiveVoiceFeedBanners, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceFeedBanners.f44495id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (bLiveVoiceFeedBanners.tabs != null) {
                jsonGenerator.writeFieldName("tabs");
                JsonAdapter.serializeArray(bLiveVoiceFeedBanners.tabs, jsonGenerator, BLiveVoiceBannerTab.JSON_ADAPTER);
            }
            String str2 = bLiveVoiceFeedBanners.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            jsonGenerator.writeNumberField("cardIndex", bLiveVoiceFeedBanners.cardIndex);
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, bLiveVoiceFeedBanners.duration);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceFeedBanners) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicefeedbanners";

    @ProtobufIndex(index = 4)
    public int cardIndex;

    @ProtobufIndex(index = 5)
    public int duration;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44495id;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveVoiceBannerTab> tabs;

    @NonNull
    @ProtobufIndex(index = 3)
    public String type;

    public static BLiveVoiceFeedBanners new_() {
        BLiveVoiceFeedBanners bLiveVoiceFeedBanners = new BLiveVoiceFeedBanners();
        bLiveVoiceFeedBanners.nullCheck();
        return bLiveVoiceFeedBanners;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceFeedBanners mo223809clone() {
        BLiveVoiceFeedBanners bLiveVoiceFeedBanners = new BLiveVoiceFeedBanners();
        bLiveVoiceFeedBanners.f44495id = this.f44495id;
        List<BLiveVoiceBannerTab> list = this.tabs;
        if (list != null) {
            bLiveVoiceFeedBanners.tabs = ValueObject.util_map(list, new w9j() { // from class: l.r82
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveVoiceBannerTab) obj).mo223809clone();
                }
            });
        }
        bLiveVoiceFeedBanners.type = this.type;
        bLiveVoiceFeedBanners.cardIndex = this.cardIndex;
        bLiveVoiceFeedBanners.duration = this.duration;
        return bLiveVoiceFeedBanners;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceFeedBanners)) {
            return false;
        }
        BLiveVoiceFeedBanners bLiveVoiceFeedBanners = (BLiveVoiceFeedBanners) obj;
        return ValueObject.util_equals(this.f44495id, bLiveVoiceFeedBanners.f44495id) && ValueObject.util_equals(this.tabs, bLiveVoiceFeedBanners.tabs) && ValueObject.util_equals(this.type, bLiveVoiceFeedBanners.type) && this.cardIndex == bLiveVoiceFeedBanners.cardIndex && this.duration == bLiveVoiceFeedBanners.duration;
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
        int i2 = i * 41;
        String str = this.f44495id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<BLiveVoiceBannerTab> list = this.tabs;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode3 = ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41) + this.cardIndex) * 41) + this.duration;
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44495id == null) {
            this.f44495id = "";
        }
        if (this.tabs == null) {
            this.tabs = new ArrayList();
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
