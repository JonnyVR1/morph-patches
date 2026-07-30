package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceSweetCpTask extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceSweetCpTask> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceSweetCpTask>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceSweetCpTask.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceSweetCpTask.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceSweetCpTask newInstance() {
            return new BLiveVoiceSweetCpTask();
        }

        public boolean parseField(BLiveVoiceSweetCpTask bLiveVoiceSweetCpTask, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "taskCpStatus":
                    bLiveVoiceSweetCpTask.taskCpStatus = jsonParser.getValueAsInt();
                    return true;
                case "taskIcon":
                    bLiveVoiceSweetCpTask.taskIcon = jsonParser.getValueAsString();
                    return true;
                case "taskName":
                    bLiveVoiceSweetCpTask.taskName = jsonParser.getValueAsString();
                    return true;
                case "taskType":
                    bLiveVoiceSweetCpTask.taskType = jsonParser.getValueAsString();
                    return true;
                case "taskButtonName":
                    bLiveVoiceSweetCpTask.taskButtonName = jsonParser.getValueAsString();
                    return true;
                case "taskAwardDescribe":
                    bLiveVoiceSweetCpTask.taskAwardDescribe = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceSweetCpTask bLiveVoiceSweetCpTask, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceSweetCpTask.taskIcon;
            if (str != null) {
                jsonGenerator.writeStringField("taskIcon", str);
            }
            String str2 = bLiveVoiceSweetCpTask.taskName;
            if (str2 != null) {
                jsonGenerator.writeStringField("taskName", str2);
            }
            String str3 = bLiveVoiceSweetCpTask.taskType;
            if (str3 != null) {
                jsonGenerator.writeStringField("taskType", str3);
            }
            String str4 = bLiveVoiceSweetCpTask.taskAwardDescribe;
            if (str4 != null) {
                jsonGenerator.writeStringField("taskAwardDescribe", str4);
            }
            String str5 = bLiveVoiceSweetCpTask.taskButtonName;
            if (str5 != null) {
                jsonGenerator.writeStringField("taskButtonName", str5);
            }
            jsonGenerator.writeNumberField("taskCpStatus", bLiveVoiceSweetCpTask.taskCpStatus);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceSweetCpTask) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicesweetcptask";

    @NonNull
    @ProtobufIndex(index = 4)
    public String taskAwardDescribe;

    @NonNull
    @ProtobufIndex(index = 5)
    public String taskButtonName;

    @ProtobufIndex(index = 6)
    public int taskCpStatus;

    @NonNull
    @ProtobufIndex(index = 1)
    public String taskIcon;

    @NonNull
    @ProtobufIndex(index = 2)
    public String taskName;

    @NonNull
    @ProtobufIndex(index = 3)
    public String taskType;

    public static BLiveVoiceSweetCpTask new_() {
        BLiveVoiceSweetCpTask bLiveVoiceSweetCpTask = new BLiveVoiceSweetCpTask();
        bLiveVoiceSweetCpTask.nullCheck();
        return bLiveVoiceSweetCpTask;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceSweetCpTask mo223809clone() {
        BLiveVoiceSweetCpTask bLiveVoiceSweetCpTask = new BLiveVoiceSweetCpTask();
        bLiveVoiceSweetCpTask.taskIcon = this.taskIcon;
        bLiveVoiceSweetCpTask.taskName = this.taskName;
        bLiveVoiceSweetCpTask.taskType = this.taskType;
        bLiveVoiceSweetCpTask.taskAwardDescribe = this.taskAwardDescribe;
        bLiveVoiceSweetCpTask.taskButtonName = this.taskButtonName;
        bLiveVoiceSweetCpTask.taskCpStatus = this.taskCpStatus;
        return bLiveVoiceSweetCpTask;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceSweetCpTask)) {
            return false;
        }
        BLiveVoiceSweetCpTask bLiveVoiceSweetCpTask = (BLiveVoiceSweetCpTask) obj;
        return ValueObject.util_equals(this.taskIcon, bLiveVoiceSweetCpTask.taskIcon) && ValueObject.util_equals(this.taskName, bLiveVoiceSweetCpTask.taskName) && ValueObject.util_equals(this.taskType, bLiveVoiceSweetCpTask.taskType) && ValueObject.util_equals(this.taskAwardDescribe, bLiveVoiceSweetCpTask.taskAwardDescribe) && ValueObject.util_equals(this.taskButtonName, bLiveVoiceSweetCpTask.taskButtonName) && this.taskCpStatus == bLiveVoiceSweetCpTask.taskCpStatus;
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
        String str = this.taskIcon;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.taskName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.taskType;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.taskAwardDescribe;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.taskButtonName;
        int iHashCode5 = ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41) + this.taskCpStatus;
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.taskIcon == null) {
            this.taskIcon = "";
        }
        if (this.taskName == null) {
            this.taskName = "";
        }
        if (this.taskType == null) {
            this.taskType = "";
        }
        if (this.taskAwardDescribe == null) {
            this.taskAwardDescribe = "";
        }
        if (this.taskButtonName == null) {
            this.taskButtonName = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
