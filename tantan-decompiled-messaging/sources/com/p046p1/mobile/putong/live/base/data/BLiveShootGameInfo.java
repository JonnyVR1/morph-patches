package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveShootGameRevenue;
import com.p046p1.mobile.putong.live.base.data.BLiveShootGameTask;
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
public class BLiveShootGameInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveShootGameInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveShootGameInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveShootGameInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveShootGameInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveShootGameInfo newInstance() {
            return new BLiveShootGameInfo();
        }

        public boolean parseField(BLiveShootGameInfo bLiveShootGameInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "shootGameTasks":
                    bLiveShootGameInfo.shootGameTasks = JsonAdapter.parseArray(jsonParser, BLiveShootGameTask.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "hasBallToReceive":
                    bLiveShootGameInfo.hasBallToReceive = jsonParser.getValueAsBoolean();
                    return true;
                case "userId":
                    bLiveShootGameInfo.userId = jsonParser.getValueAsString();
                    return true;
                case "isAnchor":
                    bLiveShootGameInfo.isAnchor = jsonParser.getValueAsBoolean();
                    return true;
                case "shootGameRevenues":
                    bLiveShootGameInfo.shootGameRevenues = JsonAdapter.parseArray(jsonParser, BLiveShootGameRevenue.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "anchorDuration":
                    bLiveShootGameInfo.anchorDuration = jsonParser.getValueAsInt();
                    return true;
                case "ballCount":
                    bLiveShootGameInfo.ballCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveShootGameInfo bLiveShootGameInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveShootGameInfo.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField("ballCount", bLiveShootGameInfo.ballCount);
            jsonGenerator.writeBooleanField("isAnchor", bLiveShootGameInfo.isAnchor);
            jsonGenerator.writeNumberField("anchorDuration", bLiveShootGameInfo.anchorDuration);
            jsonGenerator.writeBooleanField("hasBallToReceive", bLiveShootGameInfo.hasBallToReceive);
            if (bLiveShootGameInfo.shootGameTasks != null) {
                jsonGenerator.writeFieldName("shootGameTasks");
                JsonAdapter.serializeArray(bLiveShootGameInfo.shootGameTasks, jsonGenerator, BLiveShootGameTask.JSON_ADAPTER);
            }
            if (bLiveShootGameInfo.shootGameRevenues != null) {
                jsonGenerator.writeFieldName("shootGameRevenues");
                JsonAdapter.serializeArray(bLiveShootGameInfo.shootGameRevenues, jsonGenerator, BLiveShootGameRevenue.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveShootGameInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveshootgameinfo";

    @ProtobufIndex(index = 4)
    public int anchorDuration;

    @ProtobufIndex(index = 2)
    public int ballCount;

    @ProtobufIndex(index = 5)
    public boolean hasBallToReceive;

    @ProtobufIndex(index = 3)
    public boolean isAnchor;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<BLiveShootGameRevenue> shootGameRevenues;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<BLiveShootGameTask> shootGameTasks;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;

    public static BLiveShootGameInfo new_() {
        BLiveShootGameInfo bLiveShootGameInfo = new BLiveShootGameInfo();
        bLiveShootGameInfo.nullCheck();
        return bLiveShootGameInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveShootGameInfo mo223809clone() {
        BLiveShootGameInfo bLiveShootGameInfo = new BLiveShootGameInfo();
        bLiveShootGameInfo.userId = this.userId;
        bLiveShootGameInfo.ballCount = this.ballCount;
        bLiveShootGameInfo.isAnchor = this.isAnchor;
        bLiveShootGameInfo.anchorDuration = this.anchorDuration;
        bLiveShootGameInfo.hasBallToReceive = this.hasBallToReceive;
        List<BLiveShootGameTask> list = this.shootGameTasks;
        if (list != null) {
            bLiveShootGameInfo.shootGameTasks = ValueObject.util_map(list, new w9j() { // from class: l.p52
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveShootGameTask) obj).mo223809clone();
                }
            });
        }
        List<BLiveShootGameRevenue> list2 = this.shootGameRevenues;
        if (list2 != null) {
            bLiveShootGameInfo.shootGameRevenues = ValueObject.util_map(list2, new w9j() { // from class: l.q52
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveShootGameRevenue) obj).mo223809clone();
                }
            });
        }
        return bLiveShootGameInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveShootGameInfo)) {
            return false;
        }
        BLiveShootGameInfo bLiveShootGameInfo = (BLiveShootGameInfo) obj;
        return ValueObject.util_equals(this.userId, bLiveShootGameInfo.userId) && this.ballCount == bLiveShootGameInfo.ballCount && this.isAnchor == bLiveShootGameInfo.isAnchor && this.anchorDuration == bLiveShootGameInfo.anchorDuration && this.hasBallToReceive == bLiveShootGameInfo.hasBallToReceive && ValueObject.util_equals(this.shootGameTasks, bLiveShootGameInfo.shootGameTasks) && ValueObject.util_equals(this.shootGameRevenues, bLiveShootGameInfo.shootGameRevenues);
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
        String str = this.userId;
        int iHashCode = (((((((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.ballCount) * 41) + (this.isAnchor ? 1231 : 1237)) * 41) + this.anchorDuration) * 41) + (this.hasBallToReceive ? 1231 : 1237)) * 41;
        List<BLiveShootGameTask> list = this.shootGameTasks;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveShootGameRevenue> list2 = this.shootGameRevenues;
        int iHashCode3 = iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.shootGameTasks == null) {
            this.shootGameTasks = new ArrayList();
        }
        if (this.shootGameRevenues == null) {
            this.shootGameRevenues = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
