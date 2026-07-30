package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Emotion;
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

/* JADX INFO: loaded from: classes12.dex */
public class StateEmotion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "stateemotion";

    @NonNull
    @ProtobufIndex(index = 1)
    public String categoryName;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Emotion> emotions;
    public static ProtobufAdapter<StateEmotion> PROTOBUF_ADAPTER = new MessageNanoAdapter<StateEmotion>() { // from class: com.p1.mobile.putong.data.StateEmotion.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(StateEmotion stateEmotion) {
            String str = stateEmotion.categoryName;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            List<Emotion> list = stateEmotion.emotions;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, list, Emotion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            stateEmotion.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public StateEmotion parse(nc5 nc5Var) throws IOException {
            StateEmotion stateEmotion = new StateEmotion();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (stateEmotion.categoryName == null) {
                        stateEmotion.categoryName = "";
                    }
                    if (stateEmotion.emotions != null) {
                        break;
                    }
                    stateEmotion.emotions = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    stateEmotion.categoryName = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (stateEmotion.categoryName == null) {
                            stateEmotion.categoryName = "";
                        }
                        if (stateEmotion.emotions != null) {
                            break;
                        }
                        stateEmotion.emotions = new ArrayList();
                        return stateEmotion;
                    }
                    stateEmotion.emotions = (List) nc5Var.m162488l(Emotion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return stateEmotion;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(StateEmotion stateEmotion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = stateEmotion.categoryName;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            List<Emotion> list = stateEmotion.emotions;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, Emotion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<StateEmotion> JSON_ADAPTER = new ObjectJsonAdapter<StateEmotion>() { // from class: com.p1.mobile.putong.data.StateEmotion.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return StateEmotion.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public StateEmotion newInstance() {
            return new StateEmotion();
        }

        public boolean parseField(StateEmotion stateEmotion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("categoryName")) {
                stateEmotion.categoryName = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("emotions")) {
                return false;
            }
            stateEmotion.emotions = JsonAdapter.parseArray(jsonParser, Emotion.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(StateEmotion stateEmotion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("categoryName") || str.equals("emotions")) {
                return true;
            }
            return super.parseFieldCheck(stateEmotion, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(StateEmotion stateEmotion, JsonGenerator jsonGenerator) throws IOException {
            String str = stateEmotion.categoryName;
            if (str != null) {
                jsonGenerator.writeStringField("categoryName", str);
            }
            if (stateEmotion.emotions != null) {
                jsonGenerator.writeFieldName("emotions");
                JsonAdapter.serializeArray(stateEmotion.emotions, jsonGenerator, Emotion.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StateEmotion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((StateEmotion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static StateEmotion new_() {
        StateEmotion stateEmotion = new StateEmotion();
        stateEmotion.nullCheck();
        return stateEmotion;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public StateEmotion mo225055clone() {
        StateEmotion stateEmotion = new StateEmotion();
        stateEmotion.categoryName = this.categoryName;
        List<Emotion> list = this.emotions;
        if (list != null) {
            stateEmotion.emotions = ValueObject.util_map(list, new qcj() { // from class: l.o3g0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Emotion) obj).mo225055clone();
                }
            });
        }
        return stateEmotion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StateEmotion)) {
            return false;
        }
        StateEmotion stateEmotion = (StateEmotion) obj;
        return ValueObject.util_equals(this.categoryName, stateEmotion.categoryName) && ValueObject.util_equals(this.emotions, stateEmotion.emotions);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "stateemotion";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.categoryName;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<Emotion> list = this.emotions;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.categoryName == null) {
            this.categoryName = "";
        }
        if (this.emotions == null) {
            this.emotions = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
