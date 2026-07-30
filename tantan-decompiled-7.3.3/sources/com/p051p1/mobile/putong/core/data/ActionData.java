package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class ActionData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "actiondata";

    @ProtobufIndex(index = 4)
    public long dataTime;

    @NonNull
    @ProtobufIndex(index = 3)
    public ActionInsertFormat insertFormat;

    @NonNull
    @ProtobufIndex(index = 2)
    public ActionPageFormat pageFormat;

    @NonNull
    @ProtobufIndex(index = 1)
    public ActionToast toast;

    @NonNull
    @ProtobufIndex(index = 5)
    public ActionToastStyle toastStyle;

    @NonNull
    @ProtobufIndex(index = 6)
    public String traceId;
    public static ProtobufAdapter<ActionData> PROTOBUF_ADAPTER = new MessageNanoAdapter<ActionData>() { // from class: com.p1.mobile.putong.core.data.ActionData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ActionData actionData) {
            ActionToast actionToast = actionData.toast;
            int iM17285l = actionToast != null ? CodedOutputByteBufferNano.m17285l(1, actionToast, ActionToast.PROTOBUF_ADAPTER) : 0;
            ActionPageFormat actionPageFormat = actionData.pageFormat;
            if (actionPageFormat != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, actionPageFormat, ActionPageFormat.PROTOBUF_ADAPTER);
            }
            ActionInsertFormat actionInsertFormat = actionData.insertFormat;
            if (actionInsertFormat != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, actionInsertFormat, ActionInsertFormat.PROTOBUF_ADAPTER);
            }
            int iM17283j = iM17285l + CodedOutputByteBufferNano.m17283j(4, actionData.dataTime);
            ActionToastStyle actionToastStyle = actionData.toastStyle;
            if (actionToastStyle != null) {
                iM17283j += CodedOutputByteBufferNano.m17285l(5, actionToastStyle, ActionToastStyle.PROTOBUF_ADAPTER);
            }
            String str = actionData.traceId;
            if (str != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(6, str);
            }
            actionData.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ActionData parse(nc5 nc5Var) throws IOException {
            ActionData actionData = new ActionData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (actionData.toast == null) {
                        actionData.toast = ActionToast.new_();
                    }
                    if (actionData.pageFormat == null) {
                        actionData.pageFormat = ActionPageFormat.new_();
                    }
                    if (actionData.insertFormat == null) {
                        actionData.insertFormat = ActionInsertFormat.new_();
                    }
                    if (actionData.toastStyle == null) {
                        actionData.toastStyle = ActionToastStyle.new_();
                    }
                    if (actionData.traceId != null) {
                        break;
                    }
                    actionData.traceId = "";
                    break;
                }
                if (iM162497u == 10) {
                    actionData.toast = (ActionToast) nc5Var.m162488l(ActionToast.PROTOBUF_ADAPTER);
                } else if (iM162497u == 18) {
                    actionData.pageFormat = (ActionPageFormat) nc5Var.m162488l(ActionPageFormat.PROTOBUF_ADAPTER);
                } else if (iM162497u == 26) {
                    actionData.insertFormat = (ActionInsertFormat) nc5Var.m162488l(ActionInsertFormat.PROTOBUF_ADAPTER);
                } else if (iM162497u == 32) {
                    actionData.dataTime = nc5Var.m162487k();
                } else if (iM162497u == 42) {
                    actionData.toastStyle = (ActionToastStyle) nc5Var.m162488l(ActionToastStyle.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 50) {
                        if (actionData.toast == null) {
                            actionData.toast = ActionToast.new_();
                        }
                        if (actionData.pageFormat == null) {
                            actionData.pageFormat = ActionPageFormat.new_();
                        }
                        if (actionData.insertFormat == null) {
                            actionData.insertFormat = ActionInsertFormat.new_();
                        }
                        if (actionData.toastStyle == null) {
                            actionData.toastStyle = ActionToastStyle.new_();
                        }
                        if (actionData.traceId != null) {
                            break;
                        }
                        actionData.traceId = "";
                        return actionData;
                    }
                    actionData.traceId = nc5Var.m162495s();
                }
            }
            return actionData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ActionData actionData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ActionToast actionToast = actionData.toast;
            if (actionToast != null) {
                codedOutputByteBufferNano.m17309K(1, actionToast, ActionToast.PROTOBUF_ADAPTER);
            }
            ActionPageFormat actionPageFormat = actionData.pageFormat;
            if (actionPageFormat != null) {
                codedOutputByteBufferNano.m17309K(2, actionPageFormat, ActionPageFormat.PROTOBUF_ADAPTER);
            }
            ActionInsertFormat actionInsertFormat = actionData.insertFormat;
            if (actionInsertFormat != null) {
                codedOutputByteBufferNano.m17309K(3, actionInsertFormat, ActionInsertFormat.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17307I(4, actionData.dataTime);
            ActionToastStyle actionToastStyle = actionData.toastStyle;
            if (actionToastStyle != null) {
                codedOutputByteBufferNano.m17309K(5, actionToastStyle, ActionToastStyle.PROTOBUF_ADAPTER);
            }
            String str = actionData.traceId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(6, str);
            }
        }
    };
    public static JsonAdapter<ActionData> JSON_ADAPTER = new ObjectJsonAdapter<ActionData>() { // from class: com.p1.mobile.putong.core.data.ActionData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ActionData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ActionData newInstance() {
            return new ActionData();
        }

        public boolean parseField(ActionData actionData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "traceId":
                    actionData.traceId = jsonParser.getValueAsString();
                    return true;
                case "toastStyle":
                    actionData.toastStyle = ActionToastStyle.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "toast":
                    actionData.toast = ActionToast.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "insertFormat":
                    actionData.insertFormat = ActionInsertFormat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "pageFormat":
                    actionData.pageFormat = ActionPageFormat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ActionData actionData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "traceId":
                case "toastStyle":
                case "toast":
                case "insertFormat":
                case "pageFormat":
                    return true;
                default:
                    return super.parseFieldCheck(actionData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ActionData actionData, JsonGenerator jsonGenerator) throws IOException {
            if (actionData.toast != null) {
                jsonGenerator.writeFieldName(OMSTemplateModeType.toast);
                ActionToast.JSON_ADAPTER.serialize(actionData.toast, jsonGenerator, true);
            }
            if (actionData.pageFormat != null) {
                jsonGenerator.writeFieldName("pageFormat");
                ActionPageFormat.JSON_ADAPTER.serialize(actionData.pageFormat, jsonGenerator, true);
            }
            if (actionData.insertFormat != null) {
                jsonGenerator.writeFieldName("insertFormat");
                ActionInsertFormat.JSON_ADAPTER.serialize(actionData.insertFormat, jsonGenerator, true);
            }
            if (actionData.toastStyle != null) {
                jsonGenerator.writeFieldName("toastStyle");
                ActionToastStyle.JSON_ADAPTER.serialize(actionData.toastStyle, jsonGenerator, true);
            }
            String str = actionData.traceId;
            if (str != null) {
                jsonGenerator.writeStringField("traceId", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ActionData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ActionData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ActionData new_() {
        ActionData actionData = new ActionData();
        actionData.nullCheck();
        return actionData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ActionData mo225055clone() {
        ActionData actionData = new ActionData();
        ActionToast actionToast = this.toast;
        if (actionToast != null) {
            actionData.toast = actionToast.mo225055clone();
        }
        ActionPageFormat actionPageFormat = this.pageFormat;
        if (actionPageFormat != null) {
            actionData.pageFormat = actionPageFormat.mo225055clone();
        }
        ActionInsertFormat actionInsertFormat = this.insertFormat;
        if (actionInsertFormat != null) {
            actionData.insertFormat = actionInsertFormat.mo225055clone();
        }
        actionData.dataTime = this.dataTime;
        ActionToastStyle actionToastStyle = this.toastStyle;
        if (actionToastStyle != null) {
            actionData.toastStyle = actionToastStyle.mo225055clone();
        }
        actionData.traceId = this.traceId;
        return actionData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActionData)) {
            return false;
        }
        ActionData actionData = (ActionData) obj;
        return ValueObject.util_equals(this.toast, actionData.toast) && ValueObject.util_equals(this.pageFormat, actionData.pageFormat) && ValueObject.util_equals(this.insertFormat, actionData.insertFormat) && this.dataTime == actionData.dataTime && ValueObject.util_equals(this.toastStyle, actionData.toastStyle) && ValueObject.util_equals(this.traceId, actionData.traceId);
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
        ActionToast actionToast = this.toast;
        int iHashCode = (i2 + (actionToast != null ? actionToast.hashCode() : 0)) * 41;
        ActionPageFormat actionPageFormat = this.pageFormat;
        int iHashCode2 = (iHashCode + (actionPageFormat != null ? actionPageFormat.hashCode() : 0)) * 41;
        ActionInsertFormat actionInsertFormat = this.insertFormat;
        int iHashCode3 = actionInsertFormat != null ? actionInsertFormat.hashCode() : 0;
        long j = this.dataTime;
        int i3 = (((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        ActionToastStyle actionToastStyle = this.toastStyle;
        int iHashCode4 = (i3 + (actionToastStyle != null ? actionToastStyle.hashCode() : 0)) * 41;
        String str = this.traceId;
        int iHashCode5 = iHashCode4 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.toast == null) {
            this.toast = ActionToast.new_();
        }
        if (this.pageFormat == null) {
            this.pageFormat = ActionPageFormat.new_();
        }
        if (this.insertFormat == null) {
            this.insertFormat = ActionInsertFormat.new_();
        }
        if (this.toastStyle == null) {
            this.toastStyle = ActionToastStyle.new_();
        }
        if (this.traceId == null) {
            this.traceId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
