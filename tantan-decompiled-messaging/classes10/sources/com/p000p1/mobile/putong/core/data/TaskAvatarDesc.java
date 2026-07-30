package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.TaskAvatarDesc;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class TaskAvatarDesc extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "taskavatardesc";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> avatars;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String text;
    public static ProtobufAdapter<TaskAvatarDesc> PROTOBUF_ADAPTER = new MessageNanoAdapter<TaskAvatarDesc>() { // from class: com.p1.mobile.putong.core.data.TaskAvatarDesc.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TaskAvatarDesc taskAvatarDesc) {
            List<String> list = taskAvatarDesc.avatars;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = taskAvatarDesc.text;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) taskAvatarDesc).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TaskAvatarDesc m15954parse(nb5 nb5Var) throws IOException {
            TaskAvatarDesc taskAvatarDesc = new TaskAvatarDesc();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (taskAvatarDesc.avatars == null) {
                        taskAvatarDesc.avatars = new ArrayList();
                    }
                    if (taskAvatarDesc.text != null) {
                        break;
                    }
                    taskAvatarDesc.text = "";
                    break;
                }
                if (iU == 10) {
                    taskAvatarDesc.avatars = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (taskAvatarDesc.avatars == null) {
                            taskAvatarDesc.avatars = new ArrayList();
                        }
                        if (taskAvatarDesc.text != null) {
                            break;
                        }
                        taskAvatarDesc.text = "";
                        return taskAvatarDesc;
                    }
                    taskAvatarDesc.text = nb5Var.s();
                }
            }
            return taskAvatarDesc;
        }

        public void serialize(TaskAvatarDesc taskAvatarDesc, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = taskAvatarDesc.avatars;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = taskAvatarDesc.text;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<TaskAvatarDesc> JSON_ADAPTER = new ObjectJsonAdapter<TaskAvatarDesc>() { // from class: com.p1.mobile.putong.core.data.TaskAvatarDesc.2
        public Class getDataClass() {
            return TaskAvatarDesc.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TaskAvatarDesc m15955newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TaskAvatarDesc) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TaskAvatarDesc) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m673a(String str) {
        return str;
    }

    public static TaskAvatarDesc new_() {
        TaskAvatarDesc taskAvatarDesc = new TaskAvatarDesc();
        taskAvatarDesc.nullCheck();
        return taskAvatarDesc;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TaskAvatarDesc m15953clone() {
        TaskAvatarDesc taskAvatarDesc = new TaskAvatarDesc();
        List<String> list = this.avatars;
        if (list != null) {
            taskAvatarDesc.avatars = ValueObject.util_map(list, new w9j() { // from class: l.lei0
                public final Object call(Object obj) {
                    return TaskAvatarDesc.m673a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<String> list = this.avatars;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.text;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.avatars == null) {
            this.avatars = new ArrayList();
        }
        if (this.text == null) {
            this.text = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
