package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.Message;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveAccommpanyTasksAwards;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveAccommpanyTasks extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveAccommpanyTasks> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAccommpanyTasks>() { // from class: com.p1.mobile.putong.live.base.data.BLiveAccommpanyTasks.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAccommpanyTasks.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAccommpanyTasks newInstance() {
            return new BLiveAccommpanyTasks();
        }

        public boolean parseField(BLiveAccommpanyTasks bLiveAccommpanyTasks, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "awards":
                    bLiveAccommpanyTasks.awards = JsonAdapter.parseArray(jsonParser, BLiveAccommpanyTasksAwards.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "scheme":
                    bLiveAccommpanyTasks.scheme = jsonParser.getValueAsString();
                    return true;
                case "status":
                    bLiveAccommpanyTasks.status = jsonParser.getValueAsString();
                    return true;
                case "awardReceived":
                    bLiveAccommpanyTasks.awardReceived = jsonParser.getValueAsBoolean();
                    return true;
                case "id":
                    bLiveAccommpanyTasks.f44326id = jsonParser.getValueAsString();
                    return false;
                case "desc":
                    bLiveAccommpanyTasks.desc = jsonParser.getValueAsString();
                    return true;
                case "rule":
                    bLiveAccommpanyTasks.rule = BLiveAccommpanyTasksRule.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "type":
                    bLiveAccommpanyTasks.type = jsonParser.getValueAsString();
                    return true;
                case "unit":
                    bLiveAccommpanyTasks.unit = jsonParser.getValueAsString();
                    return true;
                case "score":
                    bLiveAccommpanyTasks.score = jsonParser.getValueAsInt();
                    return true;
                case "title":
                    bLiveAccommpanyTasks.title = jsonParser.getValueAsString();
                    return true;
                case "btnText":
                    bLiveAccommpanyTasks.btnText = jsonParser.getValueAsString();
                    return true;
                case "iconUrl":
                    bLiveAccommpanyTasks.iconUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAccommpanyTasks bLiveAccommpanyTasks, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveAccommpanyTasks.f44326id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveAccommpanyTasks.iconUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("iconUrl", str2);
            }
            String str3 = bLiveAccommpanyTasks.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
            String str4 = bLiveAccommpanyTasks.title;
            if (str4 != null) {
                jsonGenerator.writeStringField("title", str4);
            }
            String str5 = bLiveAccommpanyTasks.desc;
            if (str5 != null) {
                jsonGenerator.writeStringField(SocialConstants.PARAM_APP_DESC, str5);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.SCORE, bLiveAccommpanyTasks.score);
            String str6 = bLiveAccommpanyTasks.unit;
            if (str6 != null) {
                jsonGenerator.writeStringField("unit", str6);
            }
            String str7 = bLiveAccommpanyTasks.btnText;
            if (str7 != null) {
                jsonGenerator.writeStringField("btnText", str7);
            }
            if (bLiveAccommpanyTasks.rule != null) {
                jsonGenerator.writeFieldName(Message.RULE);
                BLiveAccommpanyTasksRule.JSON_ADAPTER.serialize(bLiveAccommpanyTasks.rule, jsonGenerator, true);
            }
            String str8 = bLiveAccommpanyTasks.scheme;
            if (str8 != null) {
                jsonGenerator.writeStringField(BLiveOperationClickAction.scheme, str8);
            }
            String str9 = bLiveAccommpanyTasks.status;
            if (str9 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str9);
            }
            jsonGenerator.writeBooleanField("awardReceived", bLiveAccommpanyTasks.awardReceived);
            if (bLiveAccommpanyTasks.awards != null) {
                jsonGenerator.writeFieldName("awards");
                JsonAdapter.serializeArray(bLiveAccommpanyTasks.awards, jsonGenerator, BLiveAccommpanyTasksAwards.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAccommpanyTasks) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveaccommpanytasks";

    @ProtobufIndex(index = 12)
    public boolean awardReceived;

    @NonNull
    @ProtobufIndex(index = 13)
    public List<BLiveAccommpanyTasksAwards> awards;

    @NonNull
    @ProtobufIndex(index = 8)
    public String btnText;

    @NonNull
    @ProtobufIndex(index = 5)
    public String desc;

    @NonNull
    @ProtobufIndex(index = 2)
    public String iconUrl;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44326id;

    @NonNull
    @ProtobufIndex(index = 9)
    public BLiveAccommpanyTasksRule rule;

    @NonNull
    @ProtobufIndex(index = 10)
    public String scheme;

    @ProtobufIndex(index = 6)
    public int score;

    @NonNull
    @ProtobufIndex(index = 11)
    public String status;

    @NonNull
    @ProtobufIndex(index = 4)
    public String title;

    @NonNull
    @ProtobufIndex(index = 3)
    public String type;

    @NonNull
    @ProtobufIndex(index = 7)
    public String unit;

    public static BLiveAccommpanyTasks new_() {
        BLiveAccommpanyTasks bLiveAccommpanyTasks = new BLiveAccommpanyTasks();
        bLiveAccommpanyTasks.nullCheck();
        return bLiveAccommpanyTasks;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAccommpanyTasks mo223809clone() {
        BLiveAccommpanyTasks bLiveAccommpanyTasks = new BLiveAccommpanyTasks();
        bLiveAccommpanyTasks.f44326id = this.f44326id;
        bLiveAccommpanyTasks.iconUrl = this.iconUrl;
        bLiveAccommpanyTasks.type = this.type;
        bLiveAccommpanyTasks.title = this.title;
        bLiveAccommpanyTasks.desc = this.desc;
        bLiveAccommpanyTasks.score = this.score;
        bLiveAccommpanyTasks.unit = this.unit;
        bLiveAccommpanyTasks.btnText = this.btnText;
        BLiveAccommpanyTasksRule bLiveAccommpanyTasksRule = this.rule;
        if (bLiveAccommpanyTasksRule != null) {
            bLiveAccommpanyTasks.rule = bLiveAccommpanyTasksRule.mo223809clone();
        }
        bLiveAccommpanyTasks.scheme = this.scheme;
        bLiveAccommpanyTasks.status = this.status;
        bLiveAccommpanyTasks.awardReceived = this.awardReceived;
        List<BLiveAccommpanyTasksAwards> list = this.awards;
        if (list != null) {
            bLiveAccommpanyTasks.awards = ValueObject.util_map(list, new w9j() { // from class: l.vq1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveAccommpanyTasksAwards) obj).mo223809clone();
                }
            });
        }
        return bLiveAccommpanyTasks;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAccommpanyTasks)) {
            return false;
        }
        BLiveAccommpanyTasks bLiveAccommpanyTasks = (BLiveAccommpanyTasks) obj;
        return ValueObject.util_equals(this.f44326id, bLiveAccommpanyTasks.f44326id) && ValueObject.util_equals(this.iconUrl, bLiveAccommpanyTasks.iconUrl) && ValueObject.util_equals(this.type, bLiveAccommpanyTasks.type) && ValueObject.util_equals(this.title, bLiveAccommpanyTasks.title) && ValueObject.util_equals(this.desc, bLiveAccommpanyTasks.desc) && this.score == bLiveAccommpanyTasks.score && ValueObject.util_equals(this.unit, bLiveAccommpanyTasks.unit) && ValueObject.util_equals(this.btnText, bLiveAccommpanyTasks.btnText) && ValueObject.util_equals(this.rule, bLiveAccommpanyTasks.rule) && ValueObject.util_equals(this.scheme, bLiveAccommpanyTasks.scheme) && ValueObject.util_equals(this.status, bLiveAccommpanyTasks.status) && this.awardReceived == bLiveAccommpanyTasks.awardReceived && ValueObject.util_equals(this.awards, bLiveAccommpanyTasks.awards);
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
        String str = this.f44326id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.iconUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.title;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.desc;
        int iHashCode5 = (((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41) + this.score) * 41;
        String str6 = this.unit;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.btnText;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        BLiveAccommpanyTasksRule bLiveAccommpanyTasksRule = this.rule;
        int iHashCode8 = (iHashCode7 + (bLiveAccommpanyTasksRule != null ? bLiveAccommpanyTasksRule.hashCode() : 0)) * 41;
        String str8 = this.scheme;
        int iHashCode9 = (iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.status;
        int iHashCode10 = (((iHashCode9 + (str9 != null ? str9.hashCode() : 0)) * 41) + (this.awardReceived ? 1231 : 1237)) * 41;
        List<BLiveAccommpanyTasksAwards> list = this.awards;
        int iHashCode11 = iHashCode10 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode11;
        return iHashCode11;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44326id == null) {
            this.f44326id = "";
        }
        if (this.iconUrl == null) {
            this.iconUrl = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.desc == null) {
            this.desc = "";
        }
        if (this.unit == null) {
            this.unit = "";
        }
        if (this.btnText == null) {
            this.btnText = "";
        }
        if (this.rule == null) {
            this.rule = BLiveAccommpanyTasksRule.new_();
        }
        if (this.scheme == null) {
            this.scheme = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.awards == null) {
            this.awards = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
