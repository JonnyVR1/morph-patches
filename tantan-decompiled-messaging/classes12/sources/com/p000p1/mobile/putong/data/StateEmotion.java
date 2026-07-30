package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Emotion;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(StateEmotion stateEmotion) {
            String str = stateEmotion.categoryName;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<Emotion> list = stateEmotion.emotions;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, Emotion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) stateEmotion).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public StateEmotion m19022parse(nb5 nb5Var) throws IOException {
            StateEmotion stateEmotion = new StateEmotion();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (stateEmotion.categoryName == null) {
                        stateEmotion.categoryName = "";
                    }
                    if (stateEmotion.emotions != null) {
                        break;
                    }
                    stateEmotion.emotions = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    stateEmotion.categoryName = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (stateEmotion.categoryName == null) {
                            stateEmotion.categoryName = "";
                        }
                        if (stateEmotion.emotions != null) {
                            break;
                        }
                        stateEmotion.emotions = new ArrayList();
                        return stateEmotion;
                    }
                    stateEmotion.emotions = (List) nb5Var.l(Emotion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return stateEmotion;
        }

        public void serialize(StateEmotion stateEmotion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = stateEmotion.categoryName;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<Emotion> list = stateEmotion.emotions;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, Emotion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<StateEmotion> JSON_ADAPTER = new ObjectJsonAdapter<StateEmotion>() { // from class: com.p1.mobile.putong.data.StateEmotion.2
        public Class getDataClass() {
            return StateEmotion.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public StateEmotion mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StateEmotion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((StateEmotion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static StateEmotion new_() {
        StateEmotion stateEmotion = new StateEmotion();
        stateEmotion.nullCheck();
        return stateEmotion;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public StateEmotion m19021clone() {
        StateEmotion stateEmotion = new StateEmotion();
        stateEmotion.categoryName = this.categoryName;
        List<Emotion> list = this.emotions;
        if (list != null) {
            stateEmotion.emotions = ValueObject.util_map(list, new w9j() { // from class: l.fvf0
                public final Object call(Object obj) {
                    return ((Emotion) obj).m18018clone();
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

    public String getClassParseName() {
        return "stateemotion";
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.categoryName;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<Emotion> list = this.emotions;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.categoryName == null) {
            this.categoryName = "";
        }
        if (this.emotions == null) {
            this.emotions = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
