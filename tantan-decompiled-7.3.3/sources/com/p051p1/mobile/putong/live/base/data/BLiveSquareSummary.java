package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareSummary;
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
public class BLiveSquareSummary extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSquareSummary> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSquareSummary>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSquareSummary.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSquareSummary.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSquareSummary newInstance() {
            return new BLiveSquareSummary();
        }

        public boolean parseField(BLiveSquareSummary bLiveSquareSummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "extTabId":
                    bLiveSquareSummary.extTabId = jsonParser.getValueAsString();
                    return true;
                case "description":
                    bLiveSquareSummary.description = jsonParser.getValueAsString();
                    return true;
                case "defaultTabId":
                    bLiveSquareSummary.defaultTabId = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    bLiveSquareSummary.f45288id = jsonParser.getValueAsString();
                    return false;
                case "role":
                    bLiveSquareSummary.role = jsonParser.getValueAsInt();
                    return true;
                case "type":
                    bLiveSquareSummary.type = jsonParser.getValueAsString();
                    return true;
                case "style":
                    bLiveSquareSummary.style = jsonParser.getValueAsString();
                    return true;
                case "liveIds":
                    bLiveSquareSummary.liveIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "isJumpToActivitySquareSummaries":
                    bLiveSquareSummary.isJumpToActivitySquareSummaries = jsonParser.getValueAsBoolean();
                    return true;
                case "subDescription":
                    bLiveSquareSummary.subDescription = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSquareSummary bLiveSquareSummary, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSquareSummary.f45288id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveSquareSummary.description;
            if (str2 != null) {
                jsonGenerator.writeStringField("description", str2);
            }
            jsonGenerator.writeNumberField("defaultTabId", bLiveSquareSummary.defaultTabId);
            if (bLiveSquareSummary.liveIds != null) {
                jsonGenerator.writeFieldName("liveIds");
                JsonAdapter.serializeArray(bLiveSquareSummary.liveIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str3 = bLiveSquareSummary.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
            String str4 = bLiveSquareSummary.extTabId;
            if (str4 != null) {
                jsonGenerator.writeStringField("extTabId", str4);
            }
            String str5 = bLiveSquareSummary.subDescription;
            if (str5 != null) {
                jsonGenerator.writeStringField("subDescription", str5);
            }
            String str6 = bLiveSquareSummary.style;
            if (str6 != null) {
                jsonGenerator.writeStringField("style", str6);
            }
            jsonGenerator.writeBooleanField("isJumpToActivitySquareSummaries", bLiveSquareSummary.isJumpToActivitySquareSummaries);
            jsonGenerator.writeNumberField("role", bLiveSquareSummary.role);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSquareSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesquaresummary";

    @ProtobufIndex(index = 3)
    public int defaultTabId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String description;

    @Nullable
    @ProtobufIndex(index = 6)
    public String extTabId;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45288id;

    @ProtobufIndex(index = 9)
    public boolean isJumpToActivitySquareSummaries;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> liveIds;

    @ProtobufIndex(index = 10)
    public int role;

    @NonNull
    @ProtobufIndex(index = 8)
    public String style;

    @NonNull
    @ProtobufIndex(index = 7)
    public String subDescription;

    @NonNull
    @ProtobufIndex(index = 5)
    public String type;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m69417a(String str) {
        return str;
    }

    public static BLiveSquareSummary new_() {
        BLiveSquareSummary bLiveSquareSummary = new BLiveSquareSummary();
        bLiveSquareSummary.nullCheck();
        return bLiveSquareSummary;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSquareSummary mo225055clone() {
        BLiveSquareSummary bLiveSquareSummary = new BLiveSquareSummary();
        bLiveSquareSummary.f45288id = this.f45288id;
        bLiveSquareSummary.description = this.description;
        bLiveSquareSummary.defaultTabId = this.defaultTabId;
        List<String> list = this.liveIds;
        if (list != null) {
            bLiveSquareSummary.liveIds = ValueObject.util_map(list, new qcj() { // from class: l.h62
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BLiveSquareSummary.m69417a((String) obj);
                }
            });
        }
        bLiveSquareSummary.type = this.type;
        bLiveSquareSummary.extTabId = this.extTabId;
        bLiveSquareSummary.subDescription = this.subDescription;
        bLiveSquareSummary.style = this.style;
        bLiveSquareSummary.isJumpToActivitySquareSummaries = this.isJumpToActivitySquareSummaries;
        bLiveSquareSummary.role = this.role;
        return bLiveSquareSummary;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSquareSummary)) {
            return false;
        }
        BLiveSquareSummary bLiveSquareSummary = (BLiveSquareSummary) obj;
        return ValueObject.util_equals(this.f45288id, bLiveSquareSummary.f45288id) && ValueObject.util_equals(this.description, bLiveSquareSummary.description) && this.defaultTabId == bLiveSquareSummary.defaultTabId && ValueObject.util_equals(this.liveIds, bLiveSquareSummary.liveIds) && ValueObject.util_equals(this.type, bLiveSquareSummary.type) && ValueObject.util_equals(this.extTabId, bLiveSquareSummary.extTabId) && ValueObject.util_equals(this.subDescription, bLiveSquareSummary.subDescription) && ValueObject.util_equals(this.style, bLiveSquareSummary.style) && this.isJumpToActivitySquareSummaries == bLiveSquareSummary.isJumpToActivitySquareSummaries && this.role == bLiveSquareSummary.role;
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
        String str = this.f45288id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.description;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.defaultTabId) * 41;
        List<String> list = this.liveIds;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.extTabId;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.subDescription;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.style;
        int iHashCode7 = ((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41) + (this.isJumpToActivitySquareSummaries ? 1231 : 1237)) * 41) + this.role;
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45288id == null) {
            this.f45288id = "";
        }
        if (this.description == null) {
            this.description = "";
        }
        if (this.liveIds == null) {
            this.liveIds = new ArrayList();
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.subDescription == null) {
            this.subDescription = "";
        }
        if (this.style == null) {
            this.style = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
