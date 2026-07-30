package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.Message;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveAdvanceTask extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAdvanceTask> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAdvanceTask>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAdvanceTask.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAdvanceTask.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAdvanceTask newInstance() {
            return new BLiveAdvanceTask();
        }

        public boolean parseField(BLiveAdvanceTask bLiveAdvanceTask, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "scheme":
                    bLiveAdvanceTask.scheme = jsonParser.getValueAsString();
                    return true;
                case "status":
                    bLiveAdvanceTask.status = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bLiveAdvanceTask.f44330id = jsonParser.getValueAsString();
                    return false;
                case "desc":
                    bLiveAdvanceTask.desc = jsonParser.getValueAsString();
                    return true;
                case "done":
                    bLiveAdvanceTask.done = jsonParser.getValueAsBoolean();
                    return true;
                case "rule":
                    bLiveAdvanceTask.rule = BLiveTaskRule.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "type":
                    bLiveAdvanceTask.type = jsonParser.getValueAsString();
                    return true;
                case "unit":
                    bLiveAdvanceTask.unit = jsonParser.getValueAsString();
                    return true;
                case "score":
                    bLiveAdvanceTask.score = jsonParser.getValueAsLong();
                    return true;
                case "title":
                    bLiveAdvanceTask.title = jsonParser.getValueAsString();
                    return true;
                case "btnText":
                    bLiveAdvanceTask.btnText = jsonParser.getValueAsString();
                    return true;
                case "iconUrl":
                    bLiveAdvanceTask.iconUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAdvanceTask bLiveAdvanceTask, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveAdvanceTask.f44330id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveAdvanceTask.iconUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("iconUrl", str2);
            }
            String str3 = bLiveAdvanceTask.title;
            if (str3 != null) {
                jsonGenerator.writeStringField("title", str3);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.SCORE, bLiveAdvanceTask.score);
            String str4 = bLiveAdvanceTask.unit;
            if (str4 != null) {
                jsonGenerator.writeStringField("unit", str4);
            }
            String str5 = bLiveAdvanceTask.btnText;
            if (str5 != null) {
                jsonGenerator.writeStringField("btnText", str5);
            }
            if (bLiveAdvanceTask.rule != null) {
                jsonGenerator.writeFieldName(Message.RULE);
                BLiveTaskRule.JSON_ADAPTER.serialize(bLiveAdvanceTask.rule, jsonGenerator, true);
            }
            String str6 = bLiveAdvanceTask.scheme;
            if (str6 != null) {
                jsonGenerator.writeStringField(BLiveOperationClickAction.scheme, str6);
            }
            jsonGenerator.writeBooleanField("done", bLiveAdvanceTask.done);
            String str7 = bLiveAdvanceTask.type;
            if (str7 != null) {
                jsonGenerator.writeStringField("type", str7);
            }
            String str8 = bLiveAdvanceTask.desc;
            if (str8 != null) {
                jsonGenerator.writeStringField(SocialConstants.PARAM_APP_DESC, str8);
            }
            String str9 = bLiveAdvanceTask.status;
            if (str9 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str9);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAdvanceTask) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveadvancetask";

    @NonNull
    @ProtobufIndex(index = 6)
    public String btnText;

    @NonNull
    @ProtobufIndex(index = 11)
    public String desc;

    @ProtobufIndex(index = 9)
    public boolean done;

    @NonNull
    @ProtobufIndex(index = 2)
    public String iconUrl;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44330id;

    @NonNull
    @ProtobufIndex(index = 7)
    public BLiveTaskRule rule;

    @NonNull
    @ProtobufIndex(index = 8)
    public String scheme;

    @ProtobufIndex(index = 4)
    public long score;

    @NonNull
    @ProtobufIndex(index = 12)
    public String status;

    @NonNull
    @ProtobufIndex(index = 3)
    public String title;

    @Nullable
    @ProtobufIndex(index = 10)
    public String type;

    @NonNull
    @ProtobufIndex(index = 5)
    public String unit;

    public static BLiveAdvanceTask new_() {
        BLiveAdvanceTask bLiveAdvanceTask = new BLiveAdvanceTask();
        bLiveAdvanceTask.nullCheck();
        return bLiveAdvanceTask;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAdvanceTask mo223809clone() {
        BLiveAdvanceTask bLiveAdvanceTask = new BLiveAdvanceTask();
        bLiveAdvanceTask.f44330id = this.f44330id;
        bLiveAdvanceTask.iconUrl = this.iconUrl;
        bLiveAdvanceTask.title = this.title;
        bLiveAdvanceTask.score = this.score;
        bLiveAdvanceTask.unit = this.unit;
        bLiveAdvanceTask.btnText = this.btnText;
        BLiveTaskRule bLiveTaskRule = this.rule;
        if (bLiveTaskRule != null) {
            bLiveAdvanceTask.rule = bLiveTaskRule.mo223809clone();
        }
        bLiveAdvanceTask.scheme = this.scheme;
        bLiveAdvanceTask.done = this.done;
        bLiveAdvanceTask.type = this.type;
        bLiveAdvanceTask.desc = this.desc;
        bLiveAdvanceTask.status = this.status;
        return bLiveAdvanceTask;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAdvanceTask)) {
            return false;
        }
        BLiveAdvanceTask bLiveAdvanceTask = (BLiveAdvanceTask) obj;
        return ValueObject.util_equals(this.f44330id, bLiveAdvanceTask.f44330id) && ValueObject.util_equals(this.iconUrl, bLiveAdvanceTask.iconUrl) && ValueObject.util_equals(this.title, bLiveAdvanceTask.title) && this.score == bLiveAdvanceTask.score && ValueObject.util_equals(this.unit, bLiveAdvanceTask.unit) && ValueObject.util_equals(this.btnText, bLiveAdvanceTask.btnText) && ValueObject.util_equals(this.rule, bLiveAdvanceTask.rule) && ValueObject.util_equals(this.scheme, bLiveAdvanceTask.scheme) && this.done == bLiveAdvanceTask.done && ValueObject.util_equals(this.type, bLiveAdvanceTask.type) && ValueObject.util_equals(this.desc, bLiveAdvanceTask.desc) && ValueObject.util_equals(this.status, bLiveAdvanceTask.status);
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
        String str = this.f44330id;
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
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.desc;
        int iHashCode9 = (iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.status;
        int iHashCode10 = iHashCode9 + (str9 != null ? str9.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44330id == null) {
            this.f44330id = "";
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
        if (this.desc == null) {
            this.desc = "";
        }
        if (this.status == null) {
            this.status = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
