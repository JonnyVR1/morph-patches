package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.feed.data.StateSquareEntrance;
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

/* JADX INFO: loaded from: classes13.dex */
public class StateSquareEntrance extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "statesquareentrance";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> stateIds;
    public static ProtobufAdapter<StateSquareEntrance> PROTOBUF_ADAPTER = new MessageNanoAdapter<StateSquareEntrance>() { // from class: com.p1.mobile.putong.feed.data.StateSquareEntrance.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(StateSquareEntrance stateSquareEntrance) {
            List<String> list = stateSquareEntrance.stateIds;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            stateSquareEntrance.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public StateSquareEntrance parse(nc5 nc5Var) throws IOException {
            StateSquareEntrance stateSquareEntrance = new StateSquareEntrance();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (stateSquareEntrance.stateIds != null) {
                        break;
                    }
                    stateSquareEntrance.stateIds = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (stateSquareEntrance.stateIds != null) {
                        break;
                    }
                    stateSquareEntrance.stateIds = new ArrayList();
                    return stateSquareEntrance;
                }
                stateSquareEntrance.stateIds = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return stateSquareEntrance;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(StateSquareEntrance stateSquareEntrance, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = stateSquareEntrance.stateIds;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<StateSquareEntrance> JSON_ADAPTER = new ObjectJsonAdapter<StateSquareEntrance>() { // from class: com.p1.mobile.putong.feed.data.StateSquareEntrance.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return StateSquareEntrance.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public StateSquareEntrance newInstance() {
            return new StateSquareEntrance();
        }

        public boolean parseField(StateSquareEntrance stateSquareEntrance, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("stateIds")) {
                return false;
            }
            stateSquareEntrance.stateIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(StateSquareEntrance stateSquareEntrance, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("stateIds")) {
                return true;
            }
            return super.parseFieldCheck(stateSquareEntrance, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(StateSquareEntrance stateSquareEntrance, JsonGenerator jsonGenerator) throws IOException {
            if (stateSquareEntrance.stateIds != null) {
                jsonGenerator.writeFieldName("stateIds");
                JsonAdapter.serializeArray(stateSquareEntrance.stateIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StateSquareEntrance) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((StateSquareEntrance) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m62083a(String str) {
        return str;
    }

    public static StateSquareEntrance new_() {
        StateSquareEntrance stateSquareEntrance = new StateSquareEntrance();
        stateSquareEntrance.nullCheck();
        return stateSquareEntrance;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public StateSquareEntrance mo225055clone() {
        StateSquareEntrance stateSquareEntrance = new StateSquareEntrance();
        List<String> list = this.stateIds;
        if (list != null) {
            stateSquareEntrance.stateIds = ValueObject.util_map(list, new qcj() { // from class: l.w3g0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return StateSquareEntrance.m62083a((String) obj);
                }
            });
        }
        return stateSquareEntrance;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StateSquareEntrance) {
            return ValueObject.util_equals(this.stateIds, ((StateSquareEntrance) obj).stateIds);
        }
        return false;
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
        List<String> list = this.stateIds;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.stateIds == null) {
            this.stateIds = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
