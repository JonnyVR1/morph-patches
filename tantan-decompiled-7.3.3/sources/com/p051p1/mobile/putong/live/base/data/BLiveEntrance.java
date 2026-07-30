package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class BLiveEntrance extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveEntrance> JSON_ADAPTER = new ObjectJsonAdapter<BLiveEntrance>() { // from class: com.p1.mobile.putong.live.base.data.BLiveEntrance.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveEntrance.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveEntrance newInstance() {
            return new BLiveEntrance();
        }

        public boolean parseField(BLiveEntrance bLiveEntrance, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "hourlySuggestedTitle":
                    bLiveEntrance.hourlySuggestedTitle = jsonParser.getValueAsString();
                    return true;
                case "showDefaultTitle":
                    bLiveEntrance.showDefaultTitle = jsonParser.getValueAsBoolean();
                    return true;
                case "showHourlySuggested":
                    bLiveEntrance.showHourlySuggested = jsonParser.getValueAsBoolean();
                    return true;
                case "source":
                    bLiveEntrance.source = jsonParser.getValueAsString();
                    return true;
                case "defaultTitle":
                    bLiveEntrance.defaultTitle = jsonParser.getValueAsString();
                    return true;
                case "defaultOpen":
                    bLiveEntrance.defaultOpen = BLiveEntranceDefaultOpen.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "on":
                    bLiveEntrance.f45208on = jsonParser.getValueAsBoolean();
                    return true;
                case "showFollow":
                    bLiveEntrance.showFollow = jsonParser.getValueAsBoolean();
                    return true;
                case "followTitle":
                    bLiveEntrance.followTitle = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveEntrance bLiveEntrance, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveEntrance.source;
            if (str != null) {
                jsonGenerator.writeStringField("source", str);
            }
            jsonGenerator.writeBooleanField("on", bLiveEntrance.f45208on);
            if (bLiveEntrance.defaultOpen != null) {
                jsonGenerator.writeFieldName("defaultOpen");
                BLiveEntranceDefaultOpen.JSON_ADAPTER.serialize(bLiveEntrance.defaultOpen, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("showFollow", bLiveEntrance.showFollow);
            jsonGenerator.writeBooleanField("showDefaultTitle", bLiveEntrance.showDefaultTitle);
            String str2 = bLiveEntrance.followTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("followTitle", str2);
            }
            String str3 = bLiveEntrance.defaultTitle;
            if (str3 != null) {
                jsonGenerator.writeStringField("defaultTitle", str3);
            }
            jsonGenerator.writeBooleanField("showHourlySuggested", bLiveEntrance.showHourlySuggested);
            String str4 = bLiveEntrance.hourlySuggestedTitle;
            if (str4 != null) {
                jsonGenerator.writeStringField("hourlySuggestedTitle", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveEntrance) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveentrance";

    @NonNull
    @ProtobufIndex(index = 3)
    public BLiveEntranceDefaultOpen defaultOpen;

    @Nullable
    @ProtobufIndex(index = 7)
    public String defaultTitle;

    @NonNull
    @ProtobufIndex(index = 6)
    public String followTitle;

    @NonNull
    @ProtobufIndex(index = 9)
    public String hourlySuggestedTitle;

    /* JADX INFO: renamed from: on */
    @ProtobufIndex(index = 2)
    public boolean f45208on;

    @ProtobufIndex(index = 5)
    public boolean showDefaultTitle;

    @ProtobufIndex(index = 4)
    public boolean showFollow;

    @ProtobufIndex(index = 8)
    public boolean showHourlySuggested;

    @NonNull
    @ProtobufIndex(index = 1)
    public String source;

    public static BLiveEntrance new_() {
        BLiveEntrance bLiveEntrance = new BLiveEntrance();
        bLiveEntrance.nullCheck();
        return bLiveEntrance;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveEntrance mo225055clone() {
        BLiveEntrance bLiveEntrance = new BLiveEntrance();
        bLiveEntrance.source = this.source;
        bLiveEntrance.f45208on = this.f45208on;
        BLiveEntranceDefaultOpen bLiveEntranceDefaultOpen = this.defaultOpen;
        if (bLiveEntranceDefaultOpen != null) {
            bLiveEntrance.defaultOpen = bLiveEntranceDefaultOpen.mo225055clone();
        }
        bLiveEntrance.showFollow = this.showFollow;
        bLiveEntrance.showDefaultTitle = this.showDefaultTitle;
        bLiveEntrance.followTitle = this.followTitle;
        bLiveEntrance.defaultTitle = this.defaultTitle;
        bLiveEntrance.showHourlySuggested = this.showHourlySuggested;
        bLiveEntrance.hourlySuggestedTitle = this.hourlySuggestedTitle;
        return bLiveEntrance;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveEntrance)) {
            return false;
        }
        BLiveEntrance bLiveEntrance = (BLiveEntrance) obj;
        return ValueObject.util_equals(this.source, bLiveEntrance.source) && this.f45208on == bLiveEntrance.f45208on && ValueObject.util_equals(this.defaultOpen, bLiveEntrance.defaultOpen) && this.showFollow == bLiveEntrance.showFollow && this.showDefaultTitle == bLiveEntrance.showDefaultTitle && ValueObject.util_equals(this.followTitle, bLiveEntrance.followTitle) && ValueObject.util_equals(this.defaultTitle, bLiveEntrance.defaultTitle) && this.showHourlySuggested == bLiveEntrance.showHourlySuggested && ValueObject.util_equals(this.hourlySuggestedTitle, bLiveEntrance.hourlySuggestedTitle);
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
        String str = this.source;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.f45208on ? 1231 : 1237)) * 41;
        BLiveEntranceDefaultOpen bLiveEntranceDefaultOpen = this.defaultOpen;
        int iHashCode2 = (((((iHashCode + (bLiveEntranceDefaultOpen != null ? bLiveEntranceDefaultOpen.hashCode() : 0)) * 41) + (this.showFollow ? 1231 : 1237)) * 41) + (this.showDefaultTitle ? 1231 : 1237)) * 41;
        String str2 = this.followTitle;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.defaultTitle;
        int iHashCode4 = (((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.showHourlySuggested ? 1231 : 1237)) * 41;
        String str4 = this.hourlySuggestedTitle;
        int iHashCode5 = iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.source == null) {
            this.source = "";
        }
        if (this.defaultOpen == null) {
            this.defaultOpen = BLiveEntranceDefaultOpen.new_();
        }
        if (this.followTitle == null) {
            this.followTitle = "";
        }
        if (this.hourlySuggestedTitle == null) {
            this.hourlySuggestedTitle = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
