package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
public class BLiveVoiceFanBaseTask extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveVoiceFanBaseTask> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceFanBaseTask>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceFanBaseTask.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceFanBaseTask.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceFanBaseTask newInstance() {
            return new BLiveVoiceFanBaseTask();
        }

        public boolean parseField(BLiveVoiceFanBaseTask bLiveVoiceFanBaseTask, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "finish":
                    bLiveVoiceFanBaseTask.finish = jsonParser.getValueAsBoolean();
                    return true;
                case "schema":
                    bLiveVoiceFanBaseTask.schema = jsonParser.getValueAsString();
                    return true;
                case "taskType":
                    bLiveVoiceFanBaseTask.taskType = jsonParser.getValueAsString();
                    return true;
                case "desc":
                    bLiveVoiceFanBaseTask.desc = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveVoiceFanBaseTask.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceFanBaseTask bLiveVoiceFanBaseTask, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceFanBaseTask.taskType;
            if (str != null) {
                jsonGenerator.writeStringField("taskType", str);
            }
            jsonGenerator.writeBooleanField("finish", bLiveVoiceFanBaseTask.finish);
            String str2 = bLiveVoiceFanBaseTask.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = bLiveVoiceFanBaseTask.desc;
            if (str3 != null) {
                jsonGenerator.writeStringField(SocialConstants.PARAM_APP_DESC, str3);
            }
            String str4 = bLiveVoiceFanBaseTask.schema;
            if (str4 != null) {
                jsonGenerator.writeStringField("schema", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceFanBaseTask) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivevoicefanbasetask";

    @NonNull
    @ProtobufIndex(index = 4)
    public String desc;

    @ProtobufIndex(index = 2)
    public boolean finish;

    @NonNull
    @ProtobufIndex(index = 5)
    public String schema;

    @NonNull
    @ProtobufIndex(index = 1)
    public String taskType;

    @NonNull
    @ProtobufIndex(index = 3)
    public String title;

    public static BLiveVoiceFanBaseTask new_() {
        BLiveVoiceFanBaseTask bLiveVoiceFanBaseTask = new BLiveVoiceFanBaseTask();
        bLiveVoiceFanBaseTask.nullCheck();
        return bLiveVoiceFanBaseTask;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceFanBaseTask mo225055clone() {
        BLiveVoiceFanBaseTask bLiveVoiceFanBaseTask = new BLiveVoiceFanBaseTask();
        bLiveVoiceFanBaseTask.taskType = this.taskType;
        bLiveVoiceFanBaseTask.finish = this.finish;
        bLiveVoiceFanBaseTask.title = this.title;
        bLiveVoiceFanBaseTask.desc = this.desc;
        bLiveVoiceFanBaseTask.schema = this.schema;
        return bLiveVoiceFanBaseTask;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceFanBaseTask)) {
            return false;
        }
        BLiveVoiceFanBaseTask bLiveVoiceFanBaseTask = (BLiveVoiceFanBaseTask) obj;
        return ValueObject.util_equals(this.taskType, bLiveVoiceFanBaseTask.taskType) && this.finish == bLiveVoiceFanBaseTask.finish && ValueObject.util_equals(this.title, bLiveVoiceFanBaseTask.title) && ValueObject.util_equals(this.desc, bLiveVoiceFanBaseTask.desc) && ValueObject.util_equals(this.schema, bLiveVoiceFanBaseTask.schema);
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
        String str = this.taskType;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.finish ? 1231 : 1237)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.desc;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.schema;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.taskType == null) {
            this.taskType = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.desc == null) {
            this.desc = "";
        }
        if (this.schema == null) {
            this.schema = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
