package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.ActionInsertPosition;
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
public class ActionInsertFormat extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "actioninsertformat";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<ActionInsertPosition> insertPosition;
    public static ProtobufAdapter<ActionInsertFormat> PROTOBUF_ADAPTER = new MessageNanoAdapter<ActionInsertFormat>() { // from class: com.p1.mobile.putong.core.data.ActionInsertFormat.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ActionInsertFormat actionInsertFormat) {
            List<ActionInsertPosition> list = actionInsertFormat.insertPosition;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ActionInsertPosition.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) actionInsertFormat).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ActionInsertFormat m11497parse(nb5 nb5Var) throws IOException {
            ActionInsertFormat actionInsertFormat = new ActionInsertFormat();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (actionInsertFormat.insertPosition != null) {
                        break;
                    }
                    actionInsertFormat.insertPosition = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (actionInsertFormat.insertPosition != null) {
                        break;
                    }
                    actionInsertFormat.insertPosition = new ArrayList();
                    return actionInsertFormat;
                }
                actionInsertFormat.insertPosition = (List) nb5Var.l(ActionInsertPosition.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return actionInsertFormat;
        }

        public void serialize(ActionInsertFormat actionInsertFormat, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<ActionInsertPosition> list = actionInsertFormat.insertPosition;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ActionInsertPosition.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ActionInsertFormat> JSON_ADAPTER = new ObjectJsonAdapter<ActionInsertFormat>() { // from class: com.p1.mobile.putong.core.data.ActionInsertFormat.2
        public Class getDataClass() {
            return ActionInsertFormat.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ActionInsertFormat m11498newInstance() {
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

        public void serializeFields(ActionInsertFormat actionInsertFormat, JsonGenerator jsonGenerator) throws IOException {
            if (actionInsertFormat.insertPosition != null) {
                jsonGenerator.writeFieldName("insertPosition");
                JsonAdapter.serializeArray(actionInsertFormat.insertPosition, jsonGenerator, ActionInsertPosition.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ActionInsertFormat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ActionInsertFormat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ActionInsertFormat new_() {
        ActionInsertFormat actionInsertFormat = new ActionInsertFormat();
        actionInsertFormat.nullCheck();
        return actionInsertFormat;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ActionInsertFormat m11496clone() {
        ActionInsertFormat actionInsertFormat = new ActionInsertFormat();
        List<ActionInsertPosition> list = this.insertPosition;
        if (list != null) {
            actionInsertFormat.insertPosition = ValueObject.util_map(list, new w9j() { // from class: l.s30
                public final Object call(Object obj) {
                    return ((ActionInsertPosition) obj).m11500clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<ActionInsertPosition> list = this.insertPosition;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.insertPosition == null) {
            this.insertPosition = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
