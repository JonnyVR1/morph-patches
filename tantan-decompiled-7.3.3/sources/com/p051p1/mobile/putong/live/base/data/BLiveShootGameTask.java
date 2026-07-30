package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
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
public class BLiveShootGameTask extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveShootGameTask> JSON_ADAPTER = new ObjectJsonAdapter<BLiveShootGameTask>() { // from class: com.p1.mobile.putong.live.base.data.BLiveShootGameTask.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveShootGameTask.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveShootGameTask newInstance() {
            return new BLiveShootGameTask();
        }

        public boolean parseField(BLiveShootGameTask bLiveShootGameTask, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    bLiveShootGameTask.duration = jsonParser.getValueAsInt();
                    return true;
                case "status":
                    bLiveShootGameTask.status = BLiveShootGameStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "stage":
                    bLiveShootGameTask.stage = jsonParser.getValueAsInt();
                    return true;
                case "ballCount":
                    bLiveShootGameTask.ballCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveShootGameTask bLiveShootGameTask, JsonGenerator jsonGenerator) throws IOException {
            if (bLiveShootGameTask.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                BLiveShootGameStatus.JSON_ADAPTER.serialize(bLiveShootGameTask.status, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("stage", bLiveShootGameTask.stage);
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, bLiveShootGameTask.duration);
            jsonGenerator.writeNumberField("ballCount", bLiveShootGameTask.ballCount);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveShootGameTask) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveshootgametask";

    @ProtobufIndex(index = 4)
    public int ballCount;

    @ProtobufIndex(index = 3)
    public int duration;

    @ProtobufIndex(index = 2)
    public int stage;

    @NonNull
    @ProtobufIndex(index = 1)
    public BLiveShootGameStatus status;

    public static BLiveShootGameTask new_() {
        BLiveShootGameTask bLiveShootGameTask = new BLiveShootGameTask();
        bLiveShootGameTask.nullCheck();
        return bLiveShootGameTask;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveShootGameTask mo225055clone() {
        BLiveShootGameTask bLiveShootGameTask = new BLiveShootGameTask();
        bLiveShootGameTask.status = this.status;
        bLiveShootGameTask.stage = this.stage;
        bLiveShootGameTask.duration = this.duration;
        bLiveShootGameTask.ballCount = this.ballCount;
        return bLiveShootGameTask;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveShootGameTask)) {
            return false;
        }
        BLiveShootGameTask bLiveShootGameTask = (BLiveShootGameTask) obj;
        return ValueObject.util_equals(this.status, bLiveShootGameTask.status) && this.stage == bLiveShootGameTask.stage && this.duration == bLiveShootGameTask.duration && this.ballCount == bLiveShootGameTask.ballCount;
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
        BLiveShootGameStatus bLiveShootGameStatus = this.status;
        int iHashCode = ((((((i2 + (bLiveShootGameStatus != null ? bLiveShootGameStatus.hashCode() : 0)) * 41) + this.stage) * 41) + this.duration) * 41) + this.ballCount;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.status == null) {
            this.status = (BLiveShootGameStatus) BLiveShootGameStatus.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
