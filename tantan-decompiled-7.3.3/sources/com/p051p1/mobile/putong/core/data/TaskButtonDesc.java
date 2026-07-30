package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class TaskButtonDesc extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "taskbuttondesc";

    @ProtobufIndex(index = 4)
    public int counter;

    @NonNull
    @ProtobufIndex(index = 1)
    public String text;

    @NonNull
    @ProtobufIndex(index = 3)
    public String type;

    @NonNull
    @ProtobufIndex(index = 2)
    public String url;
    public static ProtobufAdapter<TaskButtonDesc> PROTOBUF_ADAPTER = new MessageNanoAdapter<TaskButtonDesc>() { // from class: com.p1.mobile.putong.core.data.TaskButtonDesc.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TaskButtonDesc taskButtonDesc) {
            String str = taskButtonDesc.text;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = taskButtonDesc.url;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = taskButtonDesc.type;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(4, taskButtonDesc.counter);
            taskButtonDesc.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TaskButtonDesc parse(nc5 nc5Var) throws IOException {
            TaskButtonDesc taskButtonDesc = new TaskButtonDesc();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (taskButtonDesc.text == null) {
                        taskButtonDesc.text = "";
                    }
                    if (taskButtonDesc.url == null) {
                        taskButtonDesc.url = "";
                    }
                    if (taskButtonDesc.type != null) {
                        break;
                    }
                    taskButtonDesc.type = "";
                    break;
                }
                if (iM162497u == 10) {
                    taskButtonDesc.text = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    taskButtonDesc.url = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    taskButtonDesc.type = nc5Var.m162495s();
                } else {
                    if (iM162497u != 32) {
                        if (taskButtonDesc.text == null) {
                            taskButtonDesc.text = "";
                        }
                        if (taskButtonDesc.url == null) {
                            taskButtonDesc.url = "";
                        }
                        if (taskButtonDesc.type != null) {
                            break;
                        }
                        taskButtonDesc.type = "";
                        return taskButtonDesc;
                    }
                    taskButtonDesc.counter = nc5Var.m162486j();
                }
            }
            return taskButtonDesc;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TaskButtonDesc taskButtonDesc, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = taskButtonDesc.text;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = taskButtonDesc.url;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = taskButtonDesc.type;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            codedOutputByteBufferNano.m17305G(4, taskButtonDesc.counter);
        }
    };
    public static JsonAdapter<TaskButtonDesc> JSON_ADAPTER = new ObjectJsonAdapter<TaskButtonDesc>() { // from class: com.p1.mobile.putong.core.data.TaskButtonDesc.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TaskButtonDesc.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TaskButtonDesc newInstance() {
            return new TaskButtonDesc();
        }

        public boolean parseField(TaskButtonDesc taskButtonDesc, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "url":
                    taskButtonDesc.url = jsonParser.getValueAsString();
                    return true;
                case "text":
                    taskButtonDesc.text = jsonParser.getValueAsString();
                    return true;
                case "type":
                    taskButtonDesc.type = jsonParser.getValueAsString();
                    return true;
                case "counter":
                    taskButtonDesc.counter = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TaskButtonDesc taskButtonDesc, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "url":
                case "text":
                case "type":
                case "counter":
                    return true;
                default:
                    return super.parseFieldCheck(taskButtonDesc, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TaskButtonDesc taskButtonDesc, JsonGenerator jsonGenerator) throws IOException {
            String str = taskButtonDesc.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
            String str2 = taskButtonDesc.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
            String str3 = taskButtonDesc.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
            jsonGenerator.writeNumberField(Counter.TYPE, taskButtonDesc.counter);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TaskButtonDesc) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TaskButtonDesc) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TaskButtonDesc new_() {
        TaskButtonDesc taskButtonDesc = new TaskButtonDesc();
        taskButtonDesc.nullCheck();
        return taskButtonDesc;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TaskButtonDesc mo225055clone() {
        TaskButtonDesc taskButtonDesc = new TaskButtonDesc();
        taskButtonDesc.text = this.text;
        taskButtonDesc.url = this.url;
        taskButtonDesc.type = this.type;
        taskButtonDesc.counter = this.counter;
        return taskButtonDesc;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TaskButtonDesc)) {
            return false;
        }
        TaskButtonDesc taskButtonDesc = (TaskButtonDesc) obj;
        return ValueObject.util_equals(this.text, taskButtonDesc.text) && ValueObject.util_equals(this.url, taskButtonDesc.url) && ValueObject.util_equals(this.type, taskButtonDesc.type) && this.counter == taskButtonDesc.counter;
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
        String str = this.text;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode3 = ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.counter;
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
