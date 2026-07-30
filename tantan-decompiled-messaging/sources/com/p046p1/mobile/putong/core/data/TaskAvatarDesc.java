package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.TaskAvatarDesc;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class TaskAvatarDesc extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "taskavatardesc";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> avatars;

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;
    public static ProtobufAdapter<TaskAvatarDesc> PROTOBUF_ADAPTER = new MessageNanoAdapter<TaskAvatarDesc>() { // from class: com.p1.mobile.putong.core.data.TaskAvatarDesc.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TaskAvatarDesc taskAvatarDesc) {
            List<String> list = taskAvatarDesc.avatars;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = taskAvatarDesc.text;
            if (str != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(2, str);
            }
            taskAvatarDesc.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TaskAvatarDesc parse(nb5 nb5Var) throws IOException {
            TaskAvatarDesc taskAvatarDesc = new TaskAvatarDesc();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (taskAvatarDesc.avatars == null) {
                        taskAvatarDesc.avatars = new ArrayList();
                    }
                    if (taskAvatarDesc.text != null) {
                        break;
                    }
                    taskAvatarDesc.text = "";
                    break;
                }
                if (iM158752u == 10) {
                    taskAvatarDesc.avatars = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        if (taskAvatarDesc.avatars == null) {
                            taskAvatarDesc.avatars = new ArrayList();
                        }
                        if (taskAvatarDesc.text != null) {
                            break;
                        }
                        taskAvatarDesc.text = "";
                        return taskAvatarDesc;
                    }
                    taskAvatarDesc.text = nb5Var.m158750s();
                }
            }
            return taskAvatarDesc;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TaskAvatarDesc taskAvatarDesc, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = taskAvatarDesc.avatars;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = taskAvatarDesc.text;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
        }
    };
    public static JsonAdapter<TaskAvatarDesc> JSON_ADAPTER = new ObjectJsonAdapter<TaskAvatarDesc>() { // from class: com.p1.mobile.putong.core.data.TaskAvatarDesc.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TaskAvatarDesc.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TaskAvatarDesc newInstance() {
            return new TaskAvatarDesc();
        }

        public boolean parseField(TaskAvatarDesc taskAvatarDesc, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("avatars")) {
                taskAvatarDesc.avatars = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("text")) {
                return false;
            }
            taskAvatarDesc.text = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(TaskAvatarDesc taskAvatarDesc, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("avatars") || str.equals("text")) {
                return true;
            }
            return super.parseFieldCheck(taskAvatarDesc, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TaskAvatarDesc taskAvatarDesc, JsonGenerator jsonGenerator) throws IOException {
            if (taskAvatarDesc.avatars != null) {
                jsonGenerator.writeFieldName("avatars");
                JsonAdapter.serializeArray(taskAvatarDesc.avatars, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str = taskAvatarDesc.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TaskAvatarDesc) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TaskAvatarDesc) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35871a(String str) {
        return str;
    }

    public static TaskAvatarDesc new_() {
        TaskAvatarDesc taskAvatarDesc = new TaskAvatarDesc();
        taskAvatarDesc.nullCheck();
        return taskAvatarDesc;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TaskAvatarDesc mo223809clone() {
        TaskAvatarDesc taskAvatarDesc = new TaskAvatarDesc();
        List<String> list = this.avatars;
        if (list != null) {
            taskAvatarDesc.avatars = ValueObject.util_map(list, new w9j() { // from class: l.lei0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return TaskAvatarDesc.m35871a((String) obj);
                }
            });
        }
        taskAvatarDesc.text = this.text;
        return taskAvatarDesc;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TaskAvatarDesc)) {
            return false;
        }
        TaskAvatarDesc taskAvatarDesc = (TaskAvatarDesc) obj;
        return ValueObject.util_equals(this.avatars, taskAvatarDesc.avatars) && ValueObject.util_equals(this.text, taskAvatarDesc.text);
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
        List<String> list = this.avatars;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.text;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.avatars == null) {
            this.avatars = new ArrayList();
        }
        if (this.text == null) {
            this.text = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
