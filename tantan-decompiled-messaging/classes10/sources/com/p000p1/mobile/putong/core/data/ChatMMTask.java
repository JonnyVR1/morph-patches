package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ChatMMTask extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "chatmmtask";

    @ProtobufIndex(index = 1)
    public int level;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int mmCnt;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String taskName;
    public static ProtobufAdapter<ChatMMTask> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChatMMTask>() { // from class: com.p1.mobile.putong.core.data.ChatMMTask.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChatMMTask chatMMTask) {
            int iH = CodedOutputByteBufferNano.h(1, chatMMTask.level) + CodedOutputByteBufferNano.h(2, chatMMTask.mmCnt);
            String str = chatMMTask.taskName;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(3, str);
            }
            ((MessageNano) chatMMTask).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChatMMTask m12085parse(nb5 nb5Var) throws IOException {
            ChatMMTask chatMMTask = new ChatMMTask();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (chatMMTask.taskName != null) {
                        break;
                    }
                    chatMMTask.taskName = "";
                    break;
                }
                if (iU == 8) {
                    chatMMTask.level = nb5Var.j();
                } else if (iU == 16) {
                    chatMMTask.mmCnt = nb5Var.j();
                } else {
                    if (iU != 26) {
                        if (chatMMTask.taskName != null) {
                            break;
                        }
                        chatMMTask.taskName = "";
                        return chatMMTask;
                    }
                    chatMMTask.taskName = nb5Var.s();
                }
            }
            return chatMMTask;
        }

        public void serialize(ChatMMTask chatMMTask, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, chatMMTask.level);
            codedOutputByteBufferNano.G(2, chatMMTask.mmCnt);
            String str = chatMMTask.taskName;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
        }
    };
    public static JsonAdapter<ChatMMTask> JSON_ADAPTER = new ObjectJsonAdapter<ChatMMTask>() { // from class: com.p1.mobile.putong.core.data.ChatMMTask.2
        public Class getDataClass() {
            return ChatMMTask.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChatMMTask m12086newInstance() {
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

        public void serializeFields(ChatMMTask chatMMTask, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("level", chatMMTask.level);
            jsonGenerator.writeNumberField("mmCnt", chatMMTask.mmCnt);
            String str = chatMMTask.taskName;
            if (str != null) {
                jsonGenerator.writeStringField("taskName", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChatMMTask) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChatMMTask) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChatMMTask new_() {
        ChatMMTask chatMMTask = new ChatMMTask();
        chatMMTask.nullCheck();
        return chatMMTask;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChatMMTask m12084clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.level) * 41) + this.mmCnt) * 41;
        String str = this.taskName;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.taskName == null) {
            this.taskName = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
