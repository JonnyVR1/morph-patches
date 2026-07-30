package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.ActionInsertPosition;
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
public class ActionInsertFormat extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "actioninsertformat";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<ActionInsertPosition> insertPosition;
    public static ProtobufAdapter<ActionInsertFormat> PROTOBUF_ADAPTER = new MessageNanoAdapter<ActionInsertFormat>() { // from class: com.p1.mobile.putong.core.data.ActionInsertFormat.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ActionInsertFormat actionInsertFormat) {
            List<ActionInsertPosition> list = actionInsertFormat.insertPosition;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ActionInsertPosition.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            actionInsertFormat.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ActionInsertFormat parse(nc5 nc5Var) throws IOException {
            ActionInsertFormat actionInsertFormat = new ActionInsertFormat();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (actionInsertFormat.insertPosition != null) {
                        break;
                    }
                    actionInsertFormat.insertPosition = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (actionInsertFormat.insertPosition != null) {
                        break;
                    }
                    actionInsertFormat.insertPosition = new ArrayList();
                    return actionInsertFormat;
                }
                actionInsertFormat.insertPosition = (List) nc5Var.m162488l(ActionInsertPosition.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return actionInsertFormat;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ActionInsertFormat actionInsertFormat, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<ActionInsertPosition> list = actionInsertFormat.insertPosition;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ActionInsertPosition.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ActionInsertFormat> JSON_ADAPTER = new ObjectJsonAdapter<ActionInsertFormat>() { // from class: com.p1.mobile.putong.core.data.ActionInsertFormat.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ActionInsertFormat.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ActionInsertFormat newInstance() {
            return new ActionInsertFormat();
        }

        public boolean parseField(ActionInsertFormat actionInsertFormat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("insertPosition")) {
                return false;
            }
            actionInsertFormat.insertPosition = JsonAdapter.parseArray(jsonParser, ActionInsertPosition.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ActionInsertFormat actionInsertFormat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("insertPosition")) {
                return true;
            }
            return super.parseFieldCheck(actionInsertFormat, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ActionInsertFormat actionInsertFormat, JsonGenerator jsonGenerator) throws IOException {
            if (actionInsertFormat.insertPosition != null) {
                jsonGenerator.writeFieldName("insertPosition");
                JsonAdapter.serializeArray(actionInsertFormat.insertPosition, jsonGenerator, ActionInsertPosition.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ActionInsertFormat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ActionInsertFormat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ActionInsertFormat new_() {
        ActionInsertFormat actionInsertFormat = new ActionInsertFormat();
        actionInsertFormat.nullCheck();
        return actionInsertFormat;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ActionInsertFormat mo225055clone() {
        ActionInsertFormat actionInsertFormat = new ActionInsertFormat();
        List<ActionInsertPosition> list = this.insertPosition;
        if (list != null) {
            actionInsertFormat.insertPosition = ValueObject.util_map(list, new qcj() { // from class: l.m30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((ActionInsertPosition) obj).mo225055clone();
                }
            });
        }
        return actionInsertFormat;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ActionInsertFormat) {
            return ValueObject.util_equals(this.insertPosition, ((ActionInsertFormat) obj).insertPosition);
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
        List<ActionInsertPosition> list = this.insertPosition;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.insertPosition == null) {
            this.insertPosition = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
