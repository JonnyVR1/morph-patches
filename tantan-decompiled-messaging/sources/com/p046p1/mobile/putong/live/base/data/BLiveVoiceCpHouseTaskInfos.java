package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSweetCpTask;
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
public class BLiveVoiceCpHouseTaskInfos extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceCpHouseTaskInfos> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceCpHouseTaskInfos>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceCpHouseTaskInfos.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceCpHouseTaskInfos.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceCpHouseTaskInfos newInstance() {
            return new BLiveVoiceCpHouseTaskInfos();
        }

        public boolean parseField(BLiveVoiceCpHouseTaskInfos bLiveVoiceCpHouseTaskInfos, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "nextHouseId":
                    bLiveVoiceCpHouseTaskInfos.nextHouseId = jsonParser.getValueAsString();
                    return true;
                case "taskList":
                    bLiveVoiceCpHouseTaskInfos.taskList = JsonAdapter.parseArray(jsonParser, BLiveVoiceSweetCpTask.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "voiceCpHouseInfo":
                    bLiveVoiceCpHouseTaskInfos.voiceCpHouseInfo = BLiveVoiceCpHouseInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceCpHouseTaskInfos bLiveVoiceCpHouseTaskInfos, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceCpHouseTaskInfos.nextHouseId;
            if (str != null) {
                jsonGenerator.writeStringField("nextHouseId", str);
            }
            if (bLiveVoiceCpHouseTaskInfos.voiceCpHouseInfo != null) {
                jsonGenerator.writeFieldName("voiceCpHouseInfo");
                BLiveVoiceCpHouseInfo.JSON_ADAPTER.serialize(bLiveVoiceCpHouseTaskInfos.voiceCpHouseInfo, jsonGenerator, true);
            }
            if (bLiveVoiceCpHouseTaskInfos.taskList != null) {
                jsonGenerator.writeFieldName("taskList");
                JsonAdapter.serializeArray(bLiveVoiceCpHouseTaskInfos.taskList, jsonGenerator, BLiveVoiceSweetCpTask.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceCpHouseTaskInfos) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicecphousetaskinfos";

    @NonNull
    @ProtobufIndex(index = 1)
    public String nextHouseId;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLiveVoiceSweetCpTask> taskList;

    @NonNull
    @ProtobufIndex(index = 2)
    public BLiveVoiceCpHouseInfo voiceCpHouseInfo;

    public static BLiveVoiceCpHouseTaskInfos new_() {
        BLiveVoiceCpHouseTaskInfos bLiveVoiceCpHouseTaskInfos = new BLiveVoiceCpHouseTaskInfos();
        bLiveVoiceCpHouseTaskInfos.nullCheck();
        return bLiveVoiceCpHouseTaskInfos;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceCpHouseTaskInfos mo223809clone() {
        BLiveVoiceCpHouseTaskInfos bLiveVoiceCpHouseTaskInfos = new BLiveVoiceCpHouseTaskInfos();
        bLiveVoiceCpHouseTaskInfos.nextHouseId = this.nextHouseId;
        BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo = this.voiceCpHouseInfo;
        if (bLiveVoiceCpHouseInfo != null) {
            bLiveVoiceCpHouseTaskInfos.voiceCpHouseInfo = bLiveVoiceCpHouseInfo.mo223809clone();
        }
        List<BLiveVoiceSweetCpTask> list = this.taskList;
        if (list != null) {
            bLiveVoiceCpHouseTaskInfos.taskList = ValueObject.util_map(list, new w9j() { // from class: l.l82
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveVoiceSweetCpTask) obj).mo223809clone();
                }
            });
        }
        return bLiveVoiceCpHouseTaskInfos;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceCpHouseTaskInfos)) {
            return false;
        }
        BLiveVoiceCpHouseTaskInfos bLiveVoiceCpHouseTaskInfos = (BLiveVoiceCpHouseTaskInfos) obj;
        return ValueObject.util_equals(this.nextHouseId, bLiveVoiceCpHouseTaskInfos.nextHouseId) && ValueObject.util_equals(this.voiceCpHouseInfo, bLiveVoiceCpHouseTaskInfos.voiceCpHouseInfo) && ValueObject.util_equals(this.taskList, bLiveVoiceCpHouseTaskInfos.taskList);
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
        String str = this.nextHouseId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo = this.voiceCpHouseInfo;
        int iHashCode2 = (iHashCode + (bLiveVoiceCpHouseInfo != null ? bLiveVoiceCpHouseInfo.hashCode() : 0)) * 41;
        List<BLiveVoiceSweetCpTask> list = this.taskList;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.nextHouseId == null) {
            this.nextHouseId = "";
        }
        if (this.voiceCpHouseInfo == null) {
            this.voiceCpHouseInfo = BLiveVoiceCpHouseInfo.new_();
        }
        if (this.taskList == null) {
            this.taskList = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
