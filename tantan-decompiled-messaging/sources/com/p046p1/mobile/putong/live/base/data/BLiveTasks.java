package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveTasks;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveTasks extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveTasks> JSON_ADAPTER = new ObjectJsonAdapter<BLiveTasks>() { // from class: com.p1.mobile.putong.live.base.data.BLiveTasks.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveTasks.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveTasks newInstance() {
            return new BLiveTasks();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveTasks bLiveTasks, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1813001725:
                    if (str.equals("preTaskId")) {
                        b = 0;
                    }
                    break;
                case -1549229759:
                    if (str.equals("headLineText")) {
                        b = 1;
                    }
                    break;
                case -1402931637:
                    if (str.equals("completed")) {
                        b = 2;
                    }
                    break;
                case -934326481:
                    if (str.equals("reward")) {
                        b = 3;
                    }
                    break;
                case -880873088:
                    if (str.equals("taskId")) {
                        b = 4;
                    }
                    break;
                case -859610604:
                    if (str.equals("imageUrl")) {
                        b = 5;
                    }
                    break;
                case -731385813:
                    if (str.equals("totalCount")) {
                        b = 6;
                    }
                    break;
                case -368478512:
                    if (str.equals("preTaskIds")) {
                        b = 7;
                    }
                    break;
                case 50511102:
                    if (str.equals("category")) {
                        b = 8;
                    }
                    break;
                case 158993238:
                    if (str.equals("completeCount")) {
                        b = 9;
                    }
                    break;
                case 163334105:
                    if (str.equals("bubbleText")) {
                        b = 10;
                    }
                    break;
                case 663189616:
                    if (str.equals("receivedReward")) {
                        b = 11;
                    }
                    break;
                case 1362115806:
                    if (str.equals("showHeadLineText")) {
                        b = 12;
                    }
                    break;
                case 1428242635:
                    if (str.equals("localTaskId")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1527729788:
                    if (str.equals("showRewardCountInHeadLine")) {
                        b = 14;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveTasks.preTaskId = jsonParser.getValueAsString();
                    return true;
                case 1:
                    bLiveTasks.headLineText = jsonParser.getValueAsString();
                    return true;
                case 2:
                    bLiveTasks.completed = jsonParser.getValueAsBoolean();
                    return true;
                case 3:
                    bLiveTasks.reward = BLiveTotalTaskCompleteReward.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    bLiveTasks.taskId = jsonParser.getValueAsString();
                    return true;
                case 5:
                    bLiveTasks.imageUrl = jsonParser.getValueAsString();
                    return true;
                case 6:
                    bLiveTasks.totalCount = jsonParser.getValueAsLong();
                    return true;
                case 7:
                    bLiveTasks.preTaskIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    bLiveTasks.category = jsonParser.getValueAsString();
                    return true;
                case 9:
                    bLiveTasks.completeCount = jsonParser.getValueAsLong();
                    return true;
                case 10:
                    bLiveTasks.bubbleText = jsonParser.getValueAsString();
                    return true;
                case 11:
                    bLiveTasks.receivedReward = jsonParser.getValueAsBoolean();
                    return true;
                case 12:
                    bLiveTasks.showHeadLineText = jsonParser.getValueAsBoolean();
                    return true;
                case 13:
                    bLiveTasks.localTaskId = jsonParser.getValueAsString();
                    return true;
                case 14:
                    bLiveTasks.showRewardCountInHeadLine = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveTasks bLiveTasks, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveTasks.taskId;
            if (str != null) {
                jsonGenerator.writeStringField("taskId", str);
            }
            String str2 = bLiveTasks.preTaskId;
            if (str2 != null) {
                jsonGenerator.writeStringField("preTaskId", str2);
            }
            if (bLiveTasks.preTaskIds != null) {
                jsonGenerator.writeFieldName("preTaskIds");
                JsonAdapter.serializeArray(bLiveTasks.preTaskIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str3 = bLiveTasks.imageUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("imageUrl", str3);
            }
            String str4 = bLiveTasks.category;
            if (str4 != null) {
                jsonGenerator.writeStringField("category", str4);
            }
            jsonGenerator.writeBooleanField("completed", bLiveTasks.completed);
            jsonGenerator.writeBooleanField("receivedReward", bLiveTasks.receivedReward);
            if (bLiveTasks.reward != null) {
                jsonGenerator.writeFieldName("reward");
                BLiveTotalTaskCompleteReward.JSON_ADAPTER.serialize(bLiveTasks.reward, jsonGenerator, true);
            }
            String str5 = bLiveTasks.headLineText;
            if (str5 != null) {
                jsonGenerator.writeStringField("headLineText", str5);
            }
            jsonGenerator.writeNumberField("totalCount", bLiveTasks.totalCount);
            jsonGenerator.writeNumberField("completeCount", bLiveTasks.completeCount);
            jsonGenerator.writeBooleanField("showHeadLineText", bLiveTasks.showHeadLineText);
            jsonGenerator.writeBooleanField("showRewardCountInHeadLine", bLiveTasks.showRewardCountInHeadLine);
            String str6 = bLiveTasks.bubbleText;
            if (str6 != null) {
                jsonGenerator.writeStringField("bubbleText", str6);
            }
            String str7 = bLiveTasks.localTaskId;
            if (str7 != null) {
                jsonGenerator.writeStringField("localTaskId", str7);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveTasks) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivetasks";

    @NonNull
    @ProtobufIndex(index = 14)
    public String bubbleText;

    @NonNull
    @ProtobufIndex(index = 5)
    public String category;

    @ProtobufIndex(index = 11)
    public long completeCount;

    @ProtobufIndex(index = 6)
    public boolean completed;

    @NonNull
    @ProtobufIndex(index = 9)
    public String headLineText;

    @NonNull
    @ProtobufIndex(index = 4)
    public String imageUrl;

    @NonNull
    @ProtobufIndex(index = 15)
    public String localTaskId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String preTaskId;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> preTaskIds;

    @ProtobufIndex(index = 7)
    public boolean receivedReward;

    @NonNull
    @ProtobufIndex(index = 8)
    public BLiveTotalTaskCompleteReward reward;

    @ProtobufIndex(index = 12)
    public boolean showHeadLineText;

    @ProtobufIndex(index = 13)
    public boolean showRewardCountInHeadLine;

    @NonNull
    @ProtobufIndex(index = 1)
    public String taskId;

    @ProtobufIndex(index = 10)
    public long totalCount;
    public String type;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m68264a(String str) {
        return str;
    }

    public static BLiveTasks new_() {
        BLiveTasks bLiveTasks = new BLiveTasks();
        bLiveTasks.nullCheck();
        return bLiveTasks;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveTasks mo223809clone() {
        BLiveTasks bLiveTasks = new BLiveTasks();
        bLiveTasks.taskId = this.taskId;
        bLiveTasks.preTaskId = this.preTaskId;
        List<String> list = this.preTaskIds;
        if (list != null) {
            bLiveTasks.preTaskIds = ValueObject.util_map(list, new w9j() { // from class: l.s62
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveTasks.m68264a((String) obj);
                }
            });
        }
        bLiveTasks.imageUrl = this.imageUrl;
        bLiveTasks.category = this.category;
        bLiveTasks.completed = this.completed;
        bLiveTasks.receivedReward = this.receivedReward;
        BLiveTotalTaskCompleteReward bLiveTotalTaskCompleteReward = this.reward;
        if (bLiveTotalTaskCompleteReward != null) {
            bLiveTasks.reward = bLiveTotalTaskCompleteReward.mo223809clone();
        }
        bLiveTasks.headLineText = this.headLineText;
        bLiveTasks.totalCount = this.totalCount;
        bLiveTasks.completeCount = this.completeCount;
        bLiveTasks.showHeadLineText = this.showHeadLineText;
        bLiveTasks.showRewardCountInHeadLine = this.showRewardCountInHeadLine;
        bLiveTasks.bubbleText = this.bubbleText;
        bLiveTasks.localTaskId = this.localTaskId;
        return bLiveTasks;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveTasks)) {
            return false;
        }
        BLiveTasks bLiveTasks = (BLiveTasks) obj;
        return ValueObject.util_equals(this.taskId, bLiveTasks.taskId) && ValueObject.util_equals(this.preTaskId, bLiveTasks.preTaskId) && ValueObject.util_equals(this.preTaskIds, bLiveTasks.preTaskIds) && ValueObject.util_equals(this.imageUrl, bLiveTasks.imageUrl) && ValueObject.util_equals(this.category, bLiveTasks.category) && this.completed == bLiveTasks.completed && this.receivedReward == bLiveTasks.receivedReward && ValueObject.util_equals(this.reward, bLiveTasks.reward) && ValueObject.util_equals(this.headLineText, bLiveTasks.headLineText) && this.totalCount == bLiveTasks.totalCount && this.completeCount == bLiveTasks.completeCount && this.showHeadLineText == bLiveTasks.showHeadLineText && this.showRewardCountInHeadLine == bLiveTasks.showRewardCountInHeadLine && ValueObject.util_equals(this.bubbleText, bLiveTasks.bubbleText) && ValueObject.util_equals(this.localTaskId, bLiveTasks.localTaskId);
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
        String str2 = this.preTaskId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.preTaskIds;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.imageUrl;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.category;
        int iHashCode5 = (((((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.completed ? 1231 : 1237)) * 41) + (this.receivedReward ? 1231 : 1237)) * 41;
        BLiveTotalTaskCompleteReward bLiveTotalTaskCompleteReward = this.reward;
        int iHashCode6 = (iHashCode5 + (bLiveTotalTaskCompleteReward != null ? bLiveTotalTaskCompleteReward.hashCode() : 0)) * 41;
        String str5 = this.headLineText;
        int iHashCode7 = str5 != null ? str5.hashCode() : 0;
        long j = this.totalCount;
        int i3 = (((iHashCode6 + iHashCode7) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.completeCount;
        int i4 = (((((i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41) + (this.showHeadLineText ? 1231 : 1237)) * 41) + (this.showRewardCountInHeadLine ? 1231 : 1237)) * 41;
        String str6 = this.bubbleText;
        int iHashCode8 = (i4 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.localTaskId;
        int iHashCode9 = iHashCode8 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.taskId == null) {
            this.taskId = "";
        }
        if (this.preTaskId == null) {
            this.preTaskId = "";
        }
        if (this.preTaskIds == null) {
            this.preTaskIds = new ArrayList();
        }
        if (this.imageUrl == null) {
            this.imageUrl = "";
        }
        if (this.category == null) {
            this.category = "";
        }
        if (this.reward == null) {
            this.reward = BLiveTotalTaskCompleteReward.new_();
        }
        if (this.headLineText == null) {
            this.headLineText = "";
        }
        if (this.bubbleText == null) {
            this.bubbleText = "";
        }
        if (this.localTaskId == null) {
            this.localTaskId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
