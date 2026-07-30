package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.MsgDataMMTask;
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
public class MsgDataMMTask extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "msgdatammtask";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int level;

    @ProtobufIndex(index = 1)
    public int mmCnt;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<String> taskNames;
    public static ProtobufAdapter<MsgDataMMTask> PROTOBUF_ADAPTER = new MessageNanoAdapter<MsgDataMMTask>() { // from class: com.p1.mobile.putong.core.data.MsgDataMMTask.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MsgDataMMTask msgDataMMTask) {
            int iH = CodedOutputByteBufferNano.h(1, msgDataMMTask.mmCnt) + CodedOutputByteBufferNano.h(2, msgDataMMTask.level);
            List<String> list = msgDataMMTask.taskNames;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) msgDataMMTask).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MsgDataMMTask m14389parse(nb5 nb5Var) throws IOException {
            MsgDataMMTask msgDataMMTask = new MsgDataMMTask();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (msgDataMMTask.taskNames != null) {
                        break;
                    }
                    msgDataMMTask.taskNames = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    msgDataMMTask.mmCnt = nb5Var.j();
                } else if (iU == 16) {
                    msgDataMMTask.level = nb5Var.j();
                } else {
                    if (iU != 26) {
                        if (msgDataMMTask.taskNames != null) {
                            break;
                        }
                        msgDataMMTask.taskNames = new ArrayList();
                        return msgDataMMTask;
                    }
                    msgDataMMTask.taskNames = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return msgDataMMTask;
        }

        public void serialize(MsgDataMMTask msgDataMMTask, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, msgDataMMTask.mmCnt);
            codedOutputByteBufferNano.G(2, msgDataMMTask.level);
            List<String> list = msgDataMMTask.taskNames;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<MsgDataMMTask> JSON_ADAPTER = new ObjectJsonAdapter<MsgDataMMTask>() { // from class: com.p1.mobile.putong.core.data.MsgDataMMTask.2
        public Class getDataClass() {
            return MsgDataMMTask.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MsgDataMMTask m14390newInstance() {
            return new MsgDataMMTask();
        }

        public boolean parseField(MsgDataMMTask msgDataMMTask, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "level":
                    msgDataMMTask.level = jsonParser.getValueAsInt();
                    return true;
                case "mmCnt":
                    msgDataMMTask.mmCnt = jsonParser.getValueAsInt();
                    return true;
                case "taskNames":
                    msgDataMMTask.taskNames = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MsgDataMMTask msgDataMMTask, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "level":
                case "mmCnt":
                case "taskNames":
                    return true;
                default:
                    return super.parseFieldCheck(msgDataMMTask, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(MsgDataMMTask msgDataMMTask, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("mmCnt", msgDataMMTask.mmCnt);
            jsonGenerator.writeNumberField("level", msgDataMMTask.level);
            if (msgDataMMTask.taskNames != null) {
                jsonGenerator.writeFieldName("taskNames");
                JsonAdapter.serializeArray(msgDataMMTask.taskNames, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MsgDataMMTask) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MsgDataMMTask) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m505a(String str) {
        return str;
    }

    public static MsgDataMMTask new_() {
        MsgDataMMTask msgDataMMTask = new MsgDataMMTask();
        msgDataMMTask.nullCheck();
        return msgDataMMTask;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MsgDataMMTask m14388clone() {
        MsgDataMMTask msgDataMMTask = new MsgDataMMTask();
        msgDataMMTask.mmCnt = this.mmCnt;
        msgDataMMTask.level = this.level;
        List<String> list = this.taskNames;
        if (list != null) {
            msgDataMMTask.taskNames = ValueObject.util_map(list, new w9j() { // from class: l.cz00
                public final Object call(Object obj) {
                    return MsgDataMMTask.m505a((String) obj);
                }
            });
        }
        return msgDataMMTask;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MsgDataMMTask)) {
            return false;
        }
        MsgDataMMTask msgDataMMTask = (MsgDataMMTask) obj;
        return this.mmCnt == msgDataMMTask.mmCnt && this.level == msgDataMMTask.level && ValueObject.util_equals(this.taskNames, msgDataMMTask.taskNames);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.mmCnt) * 41) + this.level) * 41;
        List<String> list = this.taskNames;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.taskNames == null) {
            this.taskNames = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
