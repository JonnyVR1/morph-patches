package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveActivity;
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
public class ActivitySuggests extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<ActivitySuggests> JSON_ADAPTER = new ObjectJsonAdapter<ActivitySuggests>() { // from class: com.p1.mobile.putong.live.base.data.ActivitySuggests.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ActivitySuggests.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ActivitySuggests newInstance() {
            return new ActivitySuggests();
        }

        public boolean parseField(ActivitySuggests activitySuggests, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    activitySuggests.f45170id = jsonParser.getValueAsString();
                    return false;
                case "category":
                    activitySuggests.category = jsonParser.getValueAsString();
                    return true;
                case "liveActivities":
                    activitySuggests.liveActivities = JsonAdapter.parseArray(jsonParser, BLiveActivity.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ActivitySuggests activitySuggests, JsonGenerator jsonGenerator) throws IOException {
            String str = activitySuggests.category;
            if (str != null) {
                jsonGenerator.writeStringField("category", str);
            }
            String str2 = activitySuggests.f45170id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
            if (activitySuggests.liveActivities != null) {
                jsonGenerator.writeFieldName("liveActivities");
                JsonAdapter.serializeArray(activitySuggests.liveActivities, jsonGenerator, BLiveActivity.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ActivitySuggests) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "activitysuggests";

    @NonNull
    @ProtobufIndex(index = 1)
    public String category;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 2)
    public String f45170id;

    @Nullable
    @ProtobufIndex(index = 3)
    public List<BLiveActivity> liveActivities;

    public static ActivitySuggests new_() {
        ActivitySuggests activitySuggests = new ActivitySuggests();
        activitySuggests.nullCheck();
        return activitySuggests;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ActivitySuggests mo225055clone() {
        ActivitySuggests activitySuggests = new ActivitySuggests();
        activitySuggests.category = this.category;
        activitySuggests.f45170id = this.f45170id;
        List<BLiveActivity> list = this.liveActivities;
        if (list != null) {
            activitySuggests.liveActivities = ValueObject.util_map(list, new qcj() { // from class: l.e60
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveActivity) obj).mo225055clone();
                }
            });
        }
        return activitySuggests;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivitySuggests)) {
            return false;
        }
        ActivitySuggests activitySuggests = (ActivitySuggests) obj;
        return ValueObject.util_equals(this.category, activitySuggests.category) && ValueObject.util_equals(this.f45170id, activitySuggests.f45170id) && ValueObject.util_equals(this.liveActivities, activitySuggests.liveActivities);
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
        String str = this.category;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.f45170id;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<BLiveActivity> list = this.liveActivities;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.category == null) {
            this.category = "";
        }
        if (this.f45170id == null) {
            this.f45170id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
