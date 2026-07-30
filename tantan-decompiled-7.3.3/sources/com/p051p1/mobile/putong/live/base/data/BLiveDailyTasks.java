package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveTasks;
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
import org.spongycastle.math.p135ec.Tnaf;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveDailyTasks extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveDailyTasks> JSON_ADAPTER = new ObjectJsonAdapter<BLiveDailyTasks>() { // from class: com.p1.mobile.putong.live.base.data.BLiveDailyTasks.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveDailyTasks.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveDailyTasks newInstance() {
            return new BLiveDailyTasks();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(BLiveDailyTasks bLiveDailyTasks, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1695485928:
                    if (str.equals("ownCheerGiftCount")) {
                        b = 0;
                    }
                    break;
                case -836030906:
                    if (str.equals("userId")) {
                        b = 1;
                    }
                    break;
                case -696749900:
                    if (str.equals("noticePopup")) {
                        b = 2;
                    }
                    break;
                case -454550673:
                    if (str.equals("turboCouponGiftId")) {
                        b = 3;
                    }
                    break;
                case -410628397:
                    if (str.equals("taskDate")) {
                        b = 4;
                    }
                    break;
                case -266666762:
                    if (str.equals("userName")) {
                        b = 5;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 6;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 7;
                    }
                    break;
                case 34334860:
                    if (str.equals("advancedTasks")) {
                        b = 8;
                    }
                    break;
                case 110132110:
                    if (str.equals("tasks")) {
                        b = 9;
                    }
                    break;
                case 486988575:
                    if (str.equals("campaignStartTime")) {
                        b = 10;
                    }
                    break;
                case 609398097:
                    if (str.equals("cheerGiftImageUrl")) {
                        b = 11;
                    }
                    break;
                case 646586641:
                    if (str.equals("totalTaskCompleteReward")) {
                        b = 12;
                    }
                    break;
                case 719499032:
                    if (str.equals("campaignEndTime")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 975144870:
                    if (str.equals("totalTaskCount")) {
                        b = 14;
                    }
                    break;
                case 1078154500:
                    if (str.equals("userAvatar")) {
                        b = 15;
                    }
                    break;
                case 1263616991:
                    if (str.equals("turboCouponGiftName")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 1450467688:
                    if (str.equals("turboCouponGiftImageUrl")) {
                        b = 17;
                    }
                    break;
                case 1898428300:
                    if (str.equals("receivedTurboCouponCount")) {
                        b = 18;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    bLiveDailyTasks.ownCheerGiftCount = jsonParser.getValueAsLong();
                    return true;
                case 1:
                    bLiveDailyTasks.userId = jsonParser.getValueAsString();
                    return true;
                case 2:
                    bLiveDailyTasks.noticePopup = BLiveNoticePopup.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 3:
                    bLiveDailyTasks.turboCouponGiftId = jsonParser.getValueAsLong();
                    return true;
                case 4:
                    bLiveDailyTasks.taskDate = jsonParser.getValueAsLong();
                    return true;
                case 5:
                    bLiveDailyTasks.userName = jsonParser.getValueAsString();
                    return true;
                case 6:
                    bLiveDailyTasks.f45201id = jsonParser.getValueAsString();
                    return false;
                case 7:
                    bLiveDailyTasks.type = jsonParser.getValueAsString();
                    return true;
                case 8:
                    bLiveDailyTasks.advancedTasks = JsonAdapter.parseArray(jsonParser, BLiveTasks.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 9:
                    bLiveDailyTasks.tasks = JsonAdapter.parseArray(jsonParser, BLiveTasks.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    bLiveDailyTasks.campaignStartTime = jsonParser.getValueAsLong();
                    return true;
                case 11:
                    bLiveDailyTasks.cheerGiftImageUrl = jsonParser.getValueAsString();
                    return true;
                case 12:
                    bLiveDailyTasks.totalTaskCompleteReward = BLiveTotalTaskCompleteReward.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 13:
                    bLiveDailyTasks.campaignEndTime = jsonParser.getValueAsLong();
                    return true;
                case 14:
                    bLiveDailyTasks.totalTaskCount = jsonParser.getValueAsLong();
                    return true;
                case 15:
                    bLiveDailyTasks.userAvatar = jsonParser.getValueAsString();
                    return true;
                case 16:
                    bLiveDailyTasks.turboCouponGiftName = jsonParser.getValueAsString();
                    return true;
                case 17:
                    bLiveDailyTasks.turboCouponGiftImageUrl = jsonParser.getValueAsString();
                    return true;
                case 18:
                    bLiveDailyTasks.receivedTurboCouponCount = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveDailyTasks bLiveDailyTasks, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveDailyTasks.f45201id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveDailyTasks.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            jsonGenerator.writeNumberField("campaignStartTime", bLiveDailyTasks.campaignStartTime);
            jsonGenerator.writeNumberField("campaignEndTime", bLiveDailyTasks.campaignEndTime);
            jsonGenerator.writeNumberField("taskDate", bLiveDailyTasks.taskDate);
            String str3 = bLiveDailyTasks.userId;
            if (str3 != null) {
                jsonGenerator.writeStringField("userId", str3);
            }
            String str4 = bLiveDailyTasks.userName;
            if (str4 != null) {
                jsonGenerator.writeStringField("userName", str4);
            }
            String str5 = bLiveDailyTasks.userAvatar;
            if (str5 != null) {
                jsonGenerator.writeStringField("userAvatar", str5);
            }
            jsonGenerator.writeNumberField("turboCouponGiftId", bLiveDailyTasks.turboCouponGiftId);
            String str6 = bLiveDailyTasks.turboCouponGiftName;
            if (str6 != null) {
                jsonGenerator.writeStringField("turboCouponGiftName", str6);
            }
            String str7 = bLiveDailyTasks.turboCouponGiftImageUrl;
            if (str7 != null) {
                jsonGenerator.writeStringField("turboCouponGiftImageUrl", str7);
            }
            String str8 = bLiveDailyTasks.cheerGiftImageUrl;
            if (str8 != null) {
                jsonGenerator.writeStringField("cheerGiftImageUrl", str8);
            }
            jsonGenerator.writeNumberField("receivedTurboCouponCount", bLiveDailyTasks.receivedTurboCouponCount);
            jsonGenerator.writeNumberField("ownCheerGiftCount", bLiveDailyTasks.ownCheerGiftCount);
            jsonGenerator.writeNumberField("totalTaskCount", bLiveDailyTasks.totalTaskCount);
            if (bLiveDailyTasks.totalTaskCompleteReward != null) {
                jsonGenerator.writeFieldName("totalTaskCompleteReward");
                BLiveTotalTaskCompleteReward.JSON_ADAPTER.serialize(bLiveDailyTasks.totalTaskCompleteReward, jsonGenerator, true);
            }
            if (bLiveDailyTasks.tasks != null) {
                jsonGenerator.writeFieldName("tasks");
                JsonAdapter.serializeArray(bLiveDailyTasks.tasks, jsonGenerator, BLiveTasks.JSON_ADAPTER);
            }
            if (bLiveDailyTasks.advancedTasks != null) {
                jsonGenerator.writeFieldName("advancedTasks");
                JsonAdapter.serializeArray(bLiveDailyTasks.advancedTasks, jsonGenerator, BLiveTasks.JSON_ADAPTER);
            }
            if (bLiveDailyTasks.noticePopup != null) {
                jsonGenerator.writeFieldName("noticePopup");
                BLiveNoticePopup.JSON_ADAPTER.serialize(bLiveDailyTasks.noticePopup, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveDailyTasks) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivedailytasks";

    @NonNull
    @ProtobufIndex(index = 18)
    public List<BLiveTasks> advancedTasks;

    @ProtobufIndex(index = 4)
    public long campaignEndTime;

    @ProtobufIndex(index = 3)
    public long campaignStartTime;

    @NonNull
    @ProtobufIndex(index = 12)
    public String cheerGiftImageUrl;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f45201id;

    @NonNull
    @ProtobufIndex(index = 19)
    public BLiveNoticePopup noticePopup;

    @ProtobufIndex(index = 14)
    public long ownCheerGiftCount;

    @ProtobufIndex(index = 13)
    public long receivedTurboCouponCount;

    @ProtobufIndex(index = 5)
    public long taskDate;

    @NonNull
    @ProtobufIndex(index = 17)
    public List<BLiveTasks> tasks;

    @NonNull
    @ProtobufIndex(index = 16)
    public BLiveTotalTaskCompleteReward totalTaskCompleteReward;

    @ProtobufIndex(index = 15)
    public long totalTaskCount;

    @ProtobufIndex(index = 9)
    public long turboCouponGiftId;

    @NonNull
    @ProtobufIndex(index = 11)
    public String turboCouponGiftImageUrl;

    @NonNull
    @ProtobufIndex(index = 10)
    public String turboCouponGiftName;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    @NonNull
    @ProtobufIndex(index = 8)
    public String userAvatar;

    @NonNull
    @ProtobufIndex(index = 6)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 7)
    public String userName;

    public static BLiveDailyTasks new_() {
        BLiveDailyTasks bLiveDailyTasks = new BLiveDailyTasks();
        bLiveDailyTasks.nullCheck();
        return bLiveDailyTasks;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveDailyTasks mo225055clone() {
        BLiveDailyTasks bLiveDailyTasks = new BLiveDailyTasks();
        bLiveDailyTasks.f45201id = this.f45201id;
        bLiveDailyTasks.type = this.type;
        bLiveDailyTasks.campaignStartTime = this.campaignStartTime;
        bLiveDailyTasks.campaignEndTime = this.campaignEndTime;
        bLiveDailyTasks.taskDate = this.taskDate;
        bLiveDailyTasks.userId = this.userId;
        bLiveDailyTasks.userName = this.userName;
        bLiveDailyTasks.userAvatar = this.userAvatar;
        bLiveDailyTasks.turboCouponGiftId = this.turboCouponGiftId;
        bLiveDailyTasks.turboCouponGiftName = this.turboCouponGiftName;
        bLiveDailyTasks.turboCouponGiftImageUrl = this.turboCouponGiftImageUrl;
        bLiveDailyTasks.cheerGiftImageUrl = this.cheerGiftImageUrl;
        bLiveDailyTasks.receivedTurboCouponCount = this.receivedTurboCouponCount;
        bLiveDailyTasks.ownCheerGiftCount = this.ownCheerGiftCount;
        bLiveDailyTasks.totalTaskCount = this.totalTaskCount;
        BLiveTotalTaskCompleteReward bLiveTotalTaskCompleteReward = this.totalTaskCompleteReward;
        if (bLiveTotalTaskCompleteReward != null) {
            bLiveDailyTasks.totalTaskCompleteReward = bLiveTotalTaskCompleteReward.mo225055clone();
        }
        List<BLiveTasks> list = this.tasks;
        if (list != null) {
            bLiveDailyTasks.tasks = ValueObject.util_map(list, new qcj() { // from class: l.ct1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveTasks) obj).mo225055clone();
                }
            });
        }
        List<BLiveTasks> list2 = this.advancedTasks;
        if (list2 != null) {
            bLiveDailyTasks.advancedTasks = ValueObject.util_map(list2, new qcj() { // from class: l.dt1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveTasks) obj).mo225055clone();
                }
            });
        }
        BLiveNoticePopup bLiveNoticePopup = this.noticePopup;
        if (bLiveNoticePopup != null) {
            bLiveDailyTasks.noticePopup = bLiveNoticePopup.mo225055clone();
        }
        return bLiveDailyTasks;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveDailyTasks)) {
            return false;
        }
        BLiveDailyTasks bLiveDailyTasks = (BLiveDailyTasks) obj;
        return ValueObject.util_equals(this.f45201id, bLiveDailyTasks.f45201id) && ValueObject.util_equals(this.type, bLiveDailyTasks.type) && this.campaignStartTime == bLiveDailyTasks.campaignStartTime && this.campaignEndTime == bLiveDailyTasks.campaignEndTime && this.taskDate == bLiveDailyTasks.taskDate && ValueObject.util_equals(this.userId, bLiveDailyTasks.userId) && ValueObject.util_equals(this.userName, bLiveDailyTasks.userName) && ValueObject.util_equals(this.userAvatar, bLiveDailyTasks.userAvatar) && this.turboCouponGiftId == bLiveDailyTasks.turboCouponGiftId && ValueObject.util_equals(this.turboCouponGiftName, bLiveDailyTasks.turboCouponGiftName) && ValueObject.util_equals(this.turboCouponGiftImageUrl, bLiveDailyTasks.turboCouponGiftImageUrl) && ValueObject.util_equals(this.cheerGiftImageUrl, bLiveDailyTasks.cheerGiftImageUrl) && this.receivedTurboCouponCount == bLiveDailyTasks.receivedTurboCouponCount && this.ownCheerGiftCount == bLiveDailyTasks.ownCheerGiftCount && this.totalTaskCount == bLiveDailyTasks.totalTaskCount && ValueObject.util_equals(this.totalTaskCompleteReward, bLiveDailyTasks.totalTaskCompleteReward) && ValueObject.util_equals(this.tasks, bLiveDailyTasks.tasks) && ValueObject.util_equals(this.advancedTasks, bLiveDailyTasks.advancedTasks) && ValueObject.util_equals(this.noticePopup, bLiveDailyTasks.noticePopup);
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
        String str = this.f45201id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.campaignStartTime;
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.campaignEndTime;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.taskDate;
        int i5 = (i4 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        String str3 = this.userId;
        int iHashCode3 = (i5 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.userName;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.userAvatar;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        long j4 = this.turboCouponGiftId;
        int i6 = (iHashCode5 + ((int) (j4 ^ (j4 >>> 32)))) * 41;
        String str6 = this.turboCouponGiftName;
        int iHashCode6 = (i6 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.turboCouponGiftImageUrl;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.cheerGiftImageUrl;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        long j5 = this.receivedTurboCouponCount;
        int i7 = (iHashCode8 + ((int) (j5 ^ (j5 >>> 32)))) * 41;
        long j6 = this.ownCheerGiftCount;
        int i8 = (i7 + ((int) (j6 ^ (j6 >>> 32)))) * 41;
        long j7 = this.totalTaskCount;
        int i9 = (i8 + ((int) (j7 ^ (j7 >>> 32)))) * 41;
        BLiveTotalTaskCompleteReward bLiveTotalTaskCompleteReward = this.totalTaskCompleteReward;
        int iHashCode9 = (i9 + (bLiveTotalTaskCompleteReward != null ? bLiveTotalTaskCompleteReward.hashCode() : 0)) * 41;
        List<BLiveTasks> list = this.tasks;
        int iHashCode10 = (iHashCode9 + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveTasks> list2 = this.advancedTasks;
        int iHashCode11 = (iHashCode10 + (list2 != null ? list2.hashCode() : 0)) * 41;
        BLiveNoticePopup bLiveNoticePopup = this.noticePopup;
        int iHashCode12 = iHashCode11 + (bLiveNoticePopup != null ? bLiveNoticePopup.hashCode() : 0);
        this.hashCode = iHashCode12;
        return iHashCode12;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f45201id == null) {
            this.f45201id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.userName == null) {
            this.userName = "";
        }
        if (this.userAvatar == null) {
            this.userAvatar = "";
        }
        if (this.turboCouponGiftName == null) {
            this.turboCouponGiftName = "";
        }
        if (this.turboCouponGiftImageUrl == null) {
            this.turboCouponGiftImageUrl = "";
        }
        if (this.cheerGiftImageUrl == null) {
            this.cheerGiftImageUrl = "";
        }
        if (this.totalTaskCompleteReward == null) {
            this.totalTaskCompleteReward = BLiveTotalTaskCompleteReward.new_();
        }
        if (this.tasks == null) {
            this.tasks = new ArrayList();
        }
        if (this.advancedTasks == null) {
            this.advancedTasks = new ArrayList();
        }
        if (this.noticePopup == null) {
            this.noticePopup = BLiveNoticePopup.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
