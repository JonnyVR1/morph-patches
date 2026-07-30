package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class ChatMMTask extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatmmtask";

    @ProtobufIndex(index = 1)
    public int level;

    @ProtobufIndex(index = 2)
    public int mmCnt;

    @NonNull
    @ProtobufIndex(index = 3)
    public String taskName;
    public static ProtobufAdapter<ChatMMTask> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatMMTask>() { // from class: com.p1.mobile.putong.core.data.ChatMMTask.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChatMMTask chatMMTask) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, chatMMTask.level) + CodedOutputByteBufferNano.m17226h(2, chatMMTask.mmCnt);
            String str = chatMMTask.taskName;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(3, str);
            }
            chatMMTask.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChatMMTask parse(nb5 nb5Var) throws IOException {
            ChatMMTask chatMMTask = new ChatMMTask();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (chatMMTask.taskName != null) {
                        break;
                    }
                    chatMMTask.taskName = "";
                    break;
                }
                if (iM158752u == 8) {
                    chatMMTask.level = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    chatMMTask.mmCnt = nb5Var.m158741j();
                } else {
                    if (iM158752u != 26) {
                        if (chatMMTask.taskName != null) {
                            break;
                        }
                        chatMMTask.taskName = "";
                        return chatMMTask;
                    }
                    chatMMTask.taskName = nb5Var.m158750s();
                }
            }
            return chatMMTask;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChatMMTask chatMMTask, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, chatMMTask.level);
            codedOutputByteBufferNano.m17250G(2, chatMMTask.mmCnt);
            String str = chatMMTask.taskName;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(3, str);
            }
        }
    };
    public static JsonAdapter<ChatMMTask> JSON_ADAPTER = new ObjectJsonAdapter<ChatMMTask>() { // from class: com.p1.mobile.putong.core.data.ChatMMTask.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChatMMTask.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChatMMTask newInstance() {
            return new ChatMMTask();
        }

        public boolean parseField(ChatMMTask chatMMTask, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "taskName":
                    chatMMTask.taskName = jsonParser.getValueAsString();
                    return true;
                case "level":
                    chatMMTask.level = jsonParser.getValueAsInt();
                    return true;
                case "mmCnt":
                    chatMMTask.mmCnt = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ChatMMTask chatMMTask, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "taskName":
                case "level":
                case "mmCnt":
                    return true;
                default:
                    return super.parseFieldCheck(chatMMTask, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChatMMTask chatMMTask, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.LEVEL, chatMMTask.level);
            jsonGenerator.writeNumberField("mmCnt", chatMMTask.mmCnt);
            String str = chatMMTask.taskName;
            if (str != null) {
                jsonGenerator.writeStringField("taskName", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatMMTask) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatMMTask) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatMMTask new_() {
        ChatMMTask chatMMTask = new ChatMMTask();
        chatMMTask.nullCheck();
        return chatMMTask;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChatMMTask mo223809clone() {
        ChatMMTask chatMMTask = new ChatMMTask();
        chatMMTask.level = this.level;
        chatMMTask.mmCnt = this.mmCnt;
        chatMMTask.taskName = this.taskName;
        return chatMMTask;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatMMTask)) {
            return false;
        }
        ChatMMTask chatMMTask = (ChatMMTask) obj;
        return this.level == chatMMTask.level && this.mmCnt == chatMMTask.mmCnt && ValueObject.util_equals(this.taskName, chatMMTask.taskName);
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
        int i2 = ((((i * 41) + this.level) * 41) + this.mmCnt) * 41;
        String str = this.taskName;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.taskName == null) {
            this.taskName = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
