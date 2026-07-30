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
public class MyTabTask extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mytabtask";

    @NonNull
    @ProtobufIndex(index = 5)
    public List<TaskAvatarDesc> avatarGroups;

    @NonNull
    @ProtobufIndex(index = 6)
    public TaskButtonDesc button;

    @ProtobufIndex(index = 7)
    public boolean exposed;

    @NonNull
    @ProtobufIndex(index = 8)
    public ExtraInfos extraInfos;

    @NonNull
    @ProtobufIndex(index = 4)
    public String mode;

    @NonNull
    @ProtobufIndex(index = 2)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    @NonNull
    @ProtobufIndex(index = 3)
    public String type;
    public static ProtobufAdapter<MyTabTask> PROTOBUF_ADAPTER = new MessageNanoAdapter<MyTabTask>() { // from class: com.p1.mobile.putong.core.data.MyTabTask.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MyTabTask myTabTask) {
            String str = myTabTask.title;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = myTabTask.subTitle;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = myTabTask.type;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = myTabTask.mode;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            List<TaskAvatarDesc> list = myTabTask.avatarGroups;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(5, list, TaskAvatarDesc.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            TaskButtonDesc taskButtonDesc = myTabTask.button;
            if (taskButtonDesc != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(6, taskButtonDesc, TaskButtonDesc.PROTOBUF_ADAPTER);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(7, myTabTask.exposed);
            ExtraInfos extraInfos = myTabTask.extraInfos;
            if (extraInfos != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(8, extraInfos, ExtraInfos.PROTOBUF_ADAPTER);
            }
            myTabTask.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MyTabTask parse(nb5 nb5Var) throws IOException {
            MyTabTask myTabTask = new MyTabTask();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (myTabTask.title == null) {
                        myTabTask.title = "";
                    }
                    if (myTabTask.subTitle == null) {
                        myTabTask.subTitle = "";
                    }
                    if (myTabTask.type == null) {
                        myTabTask.type = "";
                    }
                    if (myTabTask.mode == null) {
                        myTabTask.mode = "";
                    }
                    if (myTabTask.avatarGroups == null) {
                        myTabTask.avatarGroups = new ArrayList();
                    }
                    if (myTabTask.button == null) {
                        myTabTask.button = TaskButtonDesc.new_();
                    }
                    if (myTabTask.extraInfos != null) {
                        break;
                    }
                    myTabTask.extraInfos = ExtraInfos.new_();
                    break;
                }
                if (iM158752u == 10) {
                    myTabTask.title = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    myTabTask.subTitle = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    myTabTask.type = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    myTabTask.mode = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    myTabTask.avatarGroups = (List) nb5Var.m158743l(TaskAvatarDesc.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 50) {
                    myTabTask.button = (TaskButtonDesc) nb5Var.m158743l(TaskButtonDesc.PROTOBUF_ADAPTER);
                } else if (iM158752u == 56) {
                    myTabTask.exposed = nb5Var.m158738g();
                } else {
                    if (iM158752u != 66) {
                        if (myTabTask.title == null) {
                            myTabTask.title = "";
                        }
                        if (myTabTask.subTitle == null) {
                            myTabTask.subTitle = "";
                        }
                        if (myTabTask.type == null) {
                            myTabTask.type = "";
                        }
                        if (myTabTask.mode == null) {
                            myTabTask.mode = "";
                        }
                        if (myTabTask.avatarGroups == null) {
                            myTabTask.avatarGroups = new ArrayList();
                        }
                        if (myTabTask.button == null) {
                            myTabTask.button = TaskButtonDesc.new_();
                        }
                        if (myTabTask.extraInfos != null) {
                            break;
                        }
                        myTabTask.extraInfos = ExtraInfos.new_();
                        return myTabTask;
                    }
                    myTabTask.extraInfos = (ExtraInfos) nb5Var.m158743l(ExtraInfos.PROTOBUF_ADAPTER);
                }
            }
            return myTabTask;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MyTabTask myTabTask, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = myTabTask.title;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = myTabTask.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = myTabTask.type;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = myTabTask.mode;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            List<TaskAvatarDesc> list = myTabTask.avatarGroups;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(5, list, TaskAvatarDesc.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            TaskButtonDesc taskButtonDesc = myTabTask.button;
            if (taskButtonDesc != null) {
                codedOutputByteBufferNano.m17254K(6, taskButtonDesc, TaskButtonDesc.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(7, myTabTask.exposed);
            ExtraInfos extraInfos = myTabTask.extraInfos;
            if (extraInfos != null) {
                codedOutputByteBufferNano.m17254K(8, extraInfos, ExtraInfos.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MyTabTask> JSON_ADAPTER = new ObjectJsonAdapter<MyTabTask>() { // from class: com.p1.mobile.putong.core.data.MyTabTask.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MyTabTask.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MyTabTask newInstance() {
            return new MyTabTask();
        }

        public boolean parseField(MyTabTask myTabTask, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    myTabTask.subTitle = jsonParser.getValueAsString();
                    return true;
                case "button":
                    myTabTask.button = TaskButtonDesc.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "exposed":
                    myTabTask.exposed = jsonParser.getValueAsBoolean();
                    return true;
                case "avatarGroups":
                    myTabTask.avatarGroups = JsonAdapter.parseArray(jsonParser, TaskAvatarDesc.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "mode":
                    myTabTask.mode = jsonParser.getValueAsString();
                    return true;
                case "type":
                    myTabTask.type = jsonParser.getValueAsString();
                    return true;
                case "title":
                    myTabTask.title = jsonParser.getValueAsString();
                    return true;
                case "extraInfos":
                    myTabTask.extraInfos = ExtraInfos.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MyTabTask myTabTask, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subTitle":
                case "button":
                case "exposed":
                case "avatarGroups":
                case "mode":
                case "type":
                case "title":
                case "extraInfos":
                    return true;
                default:
                    return super.parseFieldCheck(myTabTask, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MyTabTask myTabTask, JsonGenerator jsonGenerator) throws IOException {
            String str = myTabTask.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = myTabTask.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
            String str3 = myTabTask.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
            String str4 = myTabTask.mode;
            if (str4 != null) {
                jsonGenerator.writeStringField("mode", str4);
            }
            if (myTabTask.avatarGroups != null) {
                jsonGenerator.writeFieldName("avatarGroups");
                JsonAdapter.serializeArray(myTabTask.avatarGroups, jsonGenerator, TaskAvatarDesc.JSON_ADAPTER);
            }
            if (myTabTask.button != null) {
                jsonGenerator.writeFieldName("button");
                TaskButtonDesc.JSON_ADAPTER.serialize(myTabTask.button, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("exposed", myTabTask.exposed);
            if (myTabTask.extraInfos != null) {
                jsonGenerator.writeFieldName("extraInfos");
                ExtraInfos.JSON_ADAPTER.serialize(myTabTask.extraInfos, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MyTabTask) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MyTabTask) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MyTabTask new_() {
        MyTabTask myTabTask = new MyTabTask();
        myTabTask.nullCheck();
        return myTabTask;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MyTabTask mo223809clone() {
        MyTabTask myTabTask = new MyTabTask();
        myTabTask.title = this.title;
        myTabTask.subTitle = this.subTitle;
        myTabTask.type = this.type;
        myTabTask.mode = this.mode;
        List<TaskAvatarDesc> list = this.avatarGroups;
        if (list != null) {
            myTabTask.avatarGroups = ValueObject.util_map(list, new w9j() { // from class: l.z020
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((TaskAvatarDesc) obj).mo223809clone();
                }
            });
        }
        TaskButtonDesc taskButtonDesc = this.button;
        if (taskButtonDesc != null) {
            myTabTask.button = taskButtonDesc.mo223809clone();
        }
        myTabTask.exposed = this.exposed;
        ExtraInfos extraInfos = this.extraInfos;
        if (extraInfos != null) {
            myTabTask.extraInfos = extraInfos.mo223809clone();
        }
        return myTabTask;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MyTabTask)) {
            return false;
        }
        MyTabTask myTabTask = (MyTabTask) obj;
        return ValueObject.util_equals(this.title, myTabTask.title) && ValueObject.util_equals(this.subTitle, myTabTask.subTitle) && ValueObject.util_equals(this.type, myTabTask.type) && ValueObject.util_equals(this.mode, myTabTask.mode) && ValueObject.util_equals(this.avatarGroups, myTabTask.avatarGroups) && ValueObject.util_equals(this.button, myTabTask.button) && this.exposed == myTabTask.exposed && ValueObject.util_equals(this.extraInfos, myTabTask.extraInfos);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subTitle;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.mode;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        List<TaskAvatarDesc> list = this.avatarGroups;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 41;
        TaskButtonDesc taskButtonDesc = this.button;
        int iHashCode6 = (((iHashCode5 + (taskButtonDesc != null ? taskButtonDesc.hashCode() : 0)) * 41) + (this.exposed ? 1231 : 1237)) * 41;
        ExtraInfos extraInfos = this.extraInfos;
        int iHashCode7 = iHashCode6 + (extraInfos != null ? extraInfos.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.mode == null) {
            this.mode = "";
        }
        if (this.avatarGroups == null) {
            this.avatarGroups = new ArrayList();
        }
        if (this.button == null) {
            this.button = TaskButtonDesc.new_();
        }
        if (this.extraInfos == null) {
            this.extraInfos = ExtraInfos.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
