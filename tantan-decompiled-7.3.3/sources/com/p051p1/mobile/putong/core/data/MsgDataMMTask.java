package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.MsgDataMMTask;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class MsgDataMMTask extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "msgdatammtask";

    @ProtobufIndex(index = 2)
    public int level;

    @ProtobufIndex(index = 1)
    public int mmCnt;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> taskNames;
    public static ProtobufAdapter<MsgDataMMTask> PROTOBUF_ADAPTER = new MessageNanoAdapter<MsgDataMMTask>() { // from class: com.p1.mobile.putong.core.data.MsgDataMMTask.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MsgDataMMTask msgDataMMTask) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, msgDataMMTask.mmCnt) + CodedOutputByteBufferNano.m17281h(2, msgDataMMTask.level);
            List<String> list = msgDataMMTask.taskNames;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            msgDataMMTask.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MsgDataMMTask parse(nc5 nc5Var) throws IOException {
            MsgDataMMTask msgDataMMTask = new MsgDataMMTask();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (msgDataMMTask.taskNames != null) {
                        break;
                    }
                    msgDataMMTask.taskNames = new ArrayList();
                    break;
                }
                if (iM162497u == 8) {
                    msgDataMMTask.mmCnt = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    msgDataMMTask.level = nc5Var.m162486j();
                } else {
                    if (iM162497u != 26) {
                        if (msgDataMMTask.taskNames != null) {
                            break;
                        }
                        msgDataMMTask.taskNames = new ArrayList();
                        return msgDataMMTask;
                    }
                    msgDataMMTask.taskNames = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return msgDataMMTask;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MsgDataMMTask msgDataMMTask, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, msgDataMMTask.mmCnt);
            codedOutputByteBufferNano.m17305G(2, msgDataMMTask.level);
            List<String> list = msgDataMMTask.taskNames;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<MsgDataMMTask> JSON_ADAPTER = new ObjectJsonAdapter<MsgDataMMTask>() { // from class: com.p1.mobile.putong.core.data.MsgDataMMTask.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MsgDataMMTask.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MsgDataMMTask newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MsgDataMMTask msgDataMMTask, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("mmCnt", msgDataMMTask.mmCnt);
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.LEVEL, msgDataMMTask.level);
            if (msgDataMMTask.taskNames != null) {
                jsonGenerator.writeFieldName("taskNames");
                JsonAdapter.serializeArray(msgDataMMTask.taskNames, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MsgDataMMTask) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MsgDataMMTask) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36706a(String str) {
        return str;
    }

    public static MsgDataMMTask new_() {
        MsgDataMMTask msgDataMMTask = new MsgDataMMTask();
        msgDataMMTask.nullCheck();
        return msgDataMMTask;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MsgDataMMTask mo225055clone() {
        MsgDataMMTask msgDataMMTask = new MsgDataMMTask();
        msgDataMMTask.mmCnt = this.mmCnt;
        msgDataMMTask.level = this.level;
        List<String> list = this.taskNames;
        if (list != null) {
            msgDataMMTask.taskNames = ValueObject.util_map(list, new qcj() { // from class: l.m710
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return MsgDataMMTask.m36706a((String) obj);
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.mmCnt) * 41) + this.level) * 41;
        List<String> list = this.taskNames;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.taskNames == null) {
            this.taskNames = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
