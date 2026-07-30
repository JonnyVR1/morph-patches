package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInTask;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveSignInCycleTask extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveSignInCycleTask> JSON_ADAPTER = new ObjectJsonAdapter<BLiveSignInCycleTask>() { // from class: com.p1.mobile.putong.live.base.data.BLiveSignInCycleTask.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveSignInCycleTask.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveSignInCycleTask newInstance() {
            return new BLiveSignInCycleTask();
        }

        public boolean parseField(BLiveSignInCycleTask bLiveSignInCycleTask, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("tasks")) {
                bLiveSignInCycleTask.tasks = JsonAdapter.parseArray(jsonParser, BLiveSignInTask.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("todaySignInStatus")) {
                return false;
            }
            bLiveSignInCycleTask.todaySignInStatus = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveSignInCycleTask bLiveSignInCycleTask, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("todaySignInStatus", bLiveSignInCycleTask.todaySignInStatus);
            if (bLiveSignInCycleTask.tasks != null) {
                jsonGenerator.writeFieldName("tasks");
                JsonAdapter.serializeArray(bLiveSignInCycleTask.tasks, jsonGenerator, BLiveSignInTask.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveSignInCycleTask) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivesignincycletask";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<BLiveSignInTask> tasks;

    @ProtobufIndex(index = 1)
    public boolean todaySignInStatus;

    public static BLiveSignInCycleTask new_() {
        BLiveSignInCycleTask bLiveSignInCycleTask = new BLiveSignInCycleTask();
        bLiveSignInCycleTask.nullCheck();
        return bLiveSignInCycleTask;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveSignInCycleTask mo225055clone() {
        BLiveSignInCycleTask bLiveSignInCycleTask = new BLiveSignInCycleTask();
        bLiveSignInCycleTask.todaySignInStatus = this.todaySignInStatus;
        List<BLiveSignInTask> list = this.tasks;
        if (list != null) {
            bLiveSignInCycleTask.tasks = ValueObject.util_map(list, new qcj() { // from class: l.b62
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveSignInTask) obj).mo225055clone();
                }
            });
        }
        return bLiveSignInCycleTask;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveSignInCycleTask)) {
            return false;
        }
        BLiveSignInCycleTask bLiveSignInCycleTask = (BLiveSignInCycleTask) obj;
        return this.todaySignInStatus == bLiveSignInCycleTask.todaySignInStatus && ValueObject.util_equals(this.tasks, bLiveSignInCycleTask.tasks);
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
        int i2 = ((i * 41) + (this.todaySignInStatus ? 1231 : 1237)) * 41;
        List<BLiveSignInTask> list = this.tasks;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.tasks == null) {
            this.tasks = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
