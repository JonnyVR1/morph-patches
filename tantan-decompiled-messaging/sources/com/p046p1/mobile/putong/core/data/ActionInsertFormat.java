package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.ActionInsertPosition;
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
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ActionInsertPosition.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            actionInsertFormat.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ActionInsertFormat parse(nb5 nb5Var) throws IOException {
            ActionInsertFormat actionInsertFormat = new ActionInsertFormat();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (actionInsertFormat.insertPosition != null) {
                        break;
                    }
                    actionInsertFormat.insertPosition = new ArrayList();
                    break;
                }
                if (iM158752u != 10) {
                    if (actionInsertFormat.insertPosition != null) {
                        break;
                    }
                    actionInsertFormat.insertPosition = new ArrayList();
                    return actionInsertFormat;
                }
                actionInsertFormat.insertPosition = (List) nb5Var.m158743l(ActionInsertPosition.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return actionInsertFormat;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ActionInsertFormat actionInsertFormat, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<ActionInsertPosition> list = actionInsertFormat.insertPosition;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ActionInsertPosition.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ActionInsertFormat> JSON_ADAPTER = new ObjectJsonAdapter<ActionInsertFormat>() { // from class: com.p1.mobile.putong.core.data.ActionInsertFormat.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ActionInsertFormat.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ActionInsertFormat actionInsertFormat, JsonGenerator jsonGenerator) throws IOException {
            if (actionInsertFormat.insertPosition != null) {
                jsonGenerator.writeFieldName("insertPosition");
                JsonAdapter.serializeArray(actionInsertFormat.insertPosition, jsonGenerator, ActionInsertPosition.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ActionInsertFormat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public ActionInsertFormat mo223809clone() {
        ActionInsertFormat actionInsertFormat = new ActionInsertFormat();
        List<ActionInsertPosition> list = this.insertPosition;
        if (list != null) {
            actionInsertFormat.insertPosition = ValueObject.util_map(list, new w9j() { // from class: l.s30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ActionInsertPosition) obj).mo223809clone();
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
