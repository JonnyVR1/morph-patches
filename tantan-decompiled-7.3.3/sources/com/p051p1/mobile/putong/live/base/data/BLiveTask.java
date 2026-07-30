package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.Message;
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
public class BLiveTask extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveTask> JSON_ADAPTER = new ObjectJsonAdapter<BLiveTask>() { // from class: com.p1.mobile.putong.live.base.data.BLiveTask.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveTask.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveTask newInstance() {
            return new BLiveTask();
        }

        public boolean parseField(BLiveTask bLiveTask, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "scheme":
                    bLiveTask.scheme = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveTask.f45301id = jsonParser.getValueAsString();
                    return false;
                case "done":
                    bLiveTask.done = jsonParser.getValueAsBoolean();
                    return true;
                case "rule":
                    bLiveTask.rule = BLiveTaskRule.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "type":
                    bLiveTask.type = jsonParser.getValueAsString();
                    return true;
                case "unit":
                    bLiveTask.unit = jsonParser.getValueAsString();
                    return true;
                case "score":
                    bLiveTask.score = jsonParser.getValueAsLong();
                    return true;
                case "title":
                    bLiveTask.title = jsonParser.getValueAsString();
                    return true;
                case "btnText":
                    bLiveTask.btnText = jsonParser.getValueAsString();
                    return true;
                case "iconUrl":
                    bLiveTask.iconUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveTask bLiveTask, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveTask.f45301id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveTask.iconUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("iconUrl", str2);
            }
            String str3 = bLiveTask.title;
            if (str3 != null) {
                jsonGenerator.writeStringField("title", str3);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.SCORE, bLiveTask.score);
            String str4 = bLiveTask.unit;
            if (str4 != null) {
                jsonGenerator.writeStringField("unit", str4);
            }
            String str5 = bLiveTask.btnText;
            if (str5 != null) {
                jsonGenerator.writeStringField("btnText", str5);
            }
            if (bLiveTask.rule != null) {
                jsonGenerator.writeFieldName(Message.RULE);
                BLiveTaskRule.JSON_ADAPTER.serialize(bLiveTask.rule, jsonGenerator, true);
            }
            String str6 = bLiveTask.scheme;
            if (str6 != null) {
                jsonGenerator.writeStringField(BLiveOperationClickAction.scheme, str6);
            }
            jsonGenerator.writeBooleanField("done", bLiveTask.done);
            String str7 = bLiveTask.type;
            if (str7 != null) {
                jsonGenerator.writeStringField("type", str7);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveTask) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivetask";

    @NonNull
    @ProtobufIndex(index = 6)
    public String btnText;

    @ProtobufIndex(index = 9)
    public boolean done;

    @NonNull
    @ProtobufIndex(index = 2)
    public String iconUrl;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45301id;

    @NonNull
    @ProtobufIndex(index = 7)
    public BLiveTaskRule rule;

    @NonNull
    @ProtobufIndex(index = 8)
    public String scheme;

    @ProtobufIndex(index = 4)
    public long score;

    @NonNull
    @ProtobufIndex(index = 3)
    public String title;

    @Nullable
    @ProtobufIndex(index = 10)
    public String type;

    @NonNull
    @ProtobufIndex(index = 5)
    public String unit;

    public static BLiveTask new_() {
        BLiveTask bLiveTask = new BLiveTask();
        bLiveTask.nullCheck();
        return bLiveTask;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveTask mo225055clone() {
        BLiveTask bLiveTask = new BLiveTask();
        bLiveTask.f45301id = this.f45301id;
        bLiveTask.iconUrl = this.iconUrl;
        bLiveTask.title = this.title;
        bLiveTask.score = this.score;
        bLiveTask.unit = this.unit;
        bLiveTask.btnText = this.btnText;
        BLiveTaskRule bLiveTaskRule = this.rule;
        if (bLiveTaskRule != null) {
            bLiveTask.rule = bLiveTaskRule.mo225055clone();
        }
        bLiveTask.scheme = this.scheme;
        bLiveTask.done = this.done;
        bLiveTask.type = this.type;
        return bLiveTask;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveTask)) {
            return false;
        }
        BLiveTask bLiveTask = (BLiveTask) obj;
        return ValueObject.util_equals(this.f45301id, bLiveTask.f45301id) && ValueObject.util_equals(this.iconUrl, bLiveTask.iconUrl) && ValueObject.util_equals(this.title, bLiveTask.title) && this.score == bLiveTask.score && ValueObject.util_equals(this.unit, bLiveTask.unit) && ValueObject.util_equals(this.btnText, bLiveTask.btnText) && ValueObject.util_equals(this.rule, bLiveTask.rule) && ValueObject.util_equals(this.scheme, bLiveTask.scheme) && this.done == bLiveTask.done && ValueObject.util_equals(this.type, bLiveTask.type);
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
        String str = this.f45301id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.iconUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.title;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        long j = this.score;
        int i3 = (((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str4 = this.unit;
        int iHashCode4 = (i3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.btnText;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        BLiveTaskRule bLiveTaskRule = this.rule;
        int iHashCode6 = (iHashCode5 + (bLiveTaskRule != null ? bLiveTaskRule.hashCode() : 0)) * 41;
        String str6 = this.scheme;
        int iHashCode7 = (((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41) + (this.done ? 1231 : 1237)) * 41;
        String str7 = this.type;
        int iHashCode8 = iHashCode7 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45301id == null) {
            this.f45301id = "";
        }
        if (this.iconUrl == null) {
            this.iconUrl = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.unit == null) {
            this.unit = "";
        }
        if (this.btnText == null) {
            this.btnText = "";
        }
        if (this.rule == null) {
            this.rule = BLiveTaskRule.new_();
        }
        if (this.scheme == null) {
            this.scheme = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
