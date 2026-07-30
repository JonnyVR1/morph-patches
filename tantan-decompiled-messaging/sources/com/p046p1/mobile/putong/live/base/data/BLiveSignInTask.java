package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInReward;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInTask;
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
public class BLiveSignInTask extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSignInTask> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSignInTask>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSignInTask.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSignInTask.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSignInTask newInstance() {
            return new BLiveSignInTask();
        }

        public boolean parseField(BLiveSignInTask bLiveSignInTask, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    bLiveSignInTask.description = jsonParser.getValueAsString();
                    return true;
                case "taskId":
                    bLiveSignInTask.taskId = jsonParser.getValueAsString();
                    return true;
                case "finished":
                    bLiveSignInTask.finished = jsonParser.getValueAsBoolean();
                    return true;
                case "taskType":
                    bLiveSignInTask.taskType = jsonParser.getValueAsString();
                    return true;
                case "rewardId":
                    bLiveSignInTask.rewardId = jsonParser.getValueAsString();
                    return true;
                case "descriptionAdditional":
                    bLiveSignInTask.descriptionAdditional = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    bLiveSignInTask.title = jsonParser.getValueAsString();
                    return true;
                case "rewards":
                    bLiveSignInTask.rewards = JsonAdapter.parseArray(jsonParser, BLiveSignInReward.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSignInTask bLiveSignInTask, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveSignInTask.taskId;
            if (str != null) {
                jsonGenerator.writeStringField("taskId", str);
            }
            String str2 = bLiveSignInTask.rewardId;
            if (str2 != null) {
                jsonGenerator.writeStringField("rewardId", str2);
            }
            String str3 = bLiveSignInTask.title;
            if (str3 != null) {
                jsonGenerator.writeStringField("title", str3);
            }
            String str4 = bLiveSignInTask.description;
            if (str4 != null) {
                jsonGenerator.writeStringField("description", str4);
            }
            String str5 = bLiveSignInTask.taskType;
            if (str5 != null) {
                jsonGenerator.writeStringField("taskType", str5);
            }
            if (bLiveSignInTask.descriptionAdditional != null) {
                jsonGenerator.writeFieldName("descriptionAdditional");
                JsonAdapter.serializeArray(bLiveSignInTask.descriptionAdditional, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            jsonGenerator.writeBooleanField("finished", bLiveSignInTask.finished);
            if (bLiveSignInTask.rewards != null) {
                jsonGenerator.writeFieldName("rewards");
                JsonAdapter.serializeArray(bLiveSignInTask.rewards, jsonGenerator, BLiveSignInReward.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSignInTask) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesignintask";

    @NonNull
    @ProtobufIndex(index = 4)
    public String description;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<Integer> descriptionAdditional;

    @ProtobufIndex(index = 7)
    public boolean finished;

    @NonNull
    @ProtobufIndex(index = 2)
    public String rewardId;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<BLiveSignInReward> rewards;

    @NonNull
    @ProtobufIndex(index = 1)
    public String taskId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String taskType;

    @NonNull
    @ProtobufIndex(index = 3)
    public String title;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Integer m68232b(Integer num) {
        return num;
    }

    public static BLiveSignInTask new_() {
        BLiveSignInTask bLiveSignInTask = new BLiveSignInTask();
        bLiveSignInTask.nullCheck();
        return bLiveSignInTask;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSignInTask mo223809clone() {
        BLiveSignInTask bLiveSignInTask = new BLiveSignInTask();
        bLiveSignInTask.taskId = this.taskId;
        bLiveSignInTask.rewardId = this.rewardId;
        bLiveSignInTask.title = this.title;
        bLiveSignInTask.description = this.description;
        bLiveSignInTask.taskType = this.taskType;
        List<Integer> list = this.descriptionAdditional;
        if (list != null) {
            bLiveSignInTask.descriptionAdditional = ValueObject.util_map(list, new w9j() { // from class: l.x52
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveSignInTask.m68232b((Integer) obj);
                }
            });
        }
        bLiveSignInTask.finished = this.finished;
        List<BLiveSignInReward> list2 = this.rewards;
        if (list2 != null) {
            bLiveSignInTask.rewards = ValueObject.util_map(list2, new w9j() { // from class: l.y52
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveSignInReward) obj).mo223809clone();
                }
            });
        }
        return bLiveSignInTask;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSignInTask)) {
            return false;
        }
        BLiveSignInTask bLiveSignInTask = (BLiveSignInTask) obj;
        return ValueObject.util_equals(this.taskId, bLiveSignInTask.taskId) && ValueObject.util_equals(this.rewardId, bLiveSignInTask.rewardId) && ValueObject.util_equals(this.title, bLiveSignInTask.title) && ValueObject.util_equals(this.description, bLiveSignInTask.description) && ValueObject.util_equals(this.taskType, bLiveSignInTask.taskType) && ValueObject.util_equals(this.descriptionAdditional, bLiveSignInTask.descriptionAdditional) && this.finished == bLiveSignInTask.finished && ValueObject.util_equals(this.rewards, bLiveSignInTask.rewards);
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
        String str = this.taskId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.rewardId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.description;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.taskType;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        List<Integer> list = this.descriptionAdditional;
        int iHashCode6 = (((iHashCode5 + (list != null ? list.hashCode() : 0)) * 41) + (this.finished ? 1231 : 1237)) * 41;
        List<BLiveSignInReward> list2 = this.rewards;
        int iHashCode7 = iHashCode6 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.taskId == null) {
            this.taskId = "";
        }
        if (this.rewardId == null) {
            this.rewardId = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.description == null) {
            this.description = "";
        }
        if (this.taskType == null) {
            this.taskType = "";
        }
        if (this.descriptionAdditional == null) {
            this.descriptionAdditional = new ArrayList();
        }
        if (this.rewards == null) {
            this.rewards = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
