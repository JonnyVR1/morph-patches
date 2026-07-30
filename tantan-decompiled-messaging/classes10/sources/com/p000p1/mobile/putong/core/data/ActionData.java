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
public class ActionData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "actiondata";

    @ProtobufIndex(index = 4)
    public long dataTime;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public ActionInsertFormat insertFormat;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public ActionPageFormat pageFormat;

    @NonNull
    @ProtobufIndex(index = 1)
    public ActionToast toast;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public ActionToastStyle toastStyle;

    @NonNull
    @ProtobufIndex(index = 6)
    public String traceId;
    public static ProtobufAdapter<ActionData> PROTOBUF_ADAPTER = new MessageNanoAdapter<ActionData>() { // from class: com.p1.mobile.putong.core.data.ActionData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ActionData actionData) {
            ActionToast actionToast = actionData.toast;
            int iL = actionToast != null ? CodedOutputByteBufferNano.l(1, actionToast, ActionToast.PROTOBUF_ADAPTER) : 0;
            ActionPageFormat actionPageFormat = actionData.pageFormat;
            if (actionPageFormat != null) {
                iL += CodedOutputByteBufferNano.l(2, actionPageFormat, ActionPageFormat.PROTOBUF_ADAPTER);
            }
            ActionInsertFormat actionInsertFormat = actionData.insertFormat;
            if (actionInsertFormat != null) {
                iL += CodedOutputByteBufferNano.l(3, actionInsertFormat, ActionInsertFormat.PROTOBUF_ADAPTER);
            }
            int iJ = iL + CodedOutputByteBufferNano.j(4, actionData.dataTime);
            ActionToastStyle actionToastStyle = actionData.toastStyle;
            if (actionToastStyle != null) {
                iJ += CodedOutputByteBufferNano.l(5, actionToastStyle, ActionToastStyle.PROTOBUF_ADAPTER);
            }
            String str = actionData.traceId;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(6, str);
            }
            ((MessageNano) actionData).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ActionData m11493parse(nb5 nb5Var) throws IOException {
            ActionData actionData = new ActionData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    actionData.toast = (ActionToast) nb5Var.l(ActionToast.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    actionData.pageFormat = (ActionPageFormat) nb5Var.l(ActionPageFormat.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    actionData.insertFormat = (ActionInsertFormat) nb5Var.l(ActionInsertFormat.PROTOBUF_ADAPTER);
                } else if (iU == 32) {
                    actionData.dataTime = nb5Var.k();
                } else if (iU == 42) {
                    actionData.toastStyle = (ActionToastStyle) nb5Var.l(ActionToastStyle.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 50) {
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
                    actionData.traceId = nb5Var.s();
                }
            }
            return actionData;
        }

        public void serialize(ActionData actionData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            ActionToast actionToast = actionData.toast;
            if (actionToast != null) {
                codedOutputByteBufferNano.K(1, actionToast, ActionToast.PROTOBUF_ADAPTER);
            }
            ActionPageFormat actionPageFormat = actionData.pageFormat;
            if (actionPageFormat != null) {
                codedOutputByteBufferNano.K(2, actionPageFormat, ActionPageFormat.PROTOBUF_ADAPTER);
            }
            ActionInsertFormat actionInsertFormat = actionData.insertFormat;
            if (actionInsertFormat != null) {
                codedOutputByteBufferNano.K(3, actionInsertFormat, ActionInsertFormat.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.I(4, actionData.dataTime);
            ActionToastStyle actionToastStyle = actionData.toastStyle;
            if (actionToastStyle != null) {
                codedOutputByteBufferNano.K(5, actionToastStyle, ActionToastStyle.PROTOBUF_ADAPTER);
            }
            String str = actionData.traceId;
            if (str != null) {
                codedOutputByteBufferNano.R(6, str);
            }
        }
    };
    public static JsonAdapter<ActionData> JSON_ADAPTER = new ObjectJsonAdapter<ActionData>() { // from class: com.p1.mobile.putong.core.data.ActionData.2
        public Class getDataClass() {
            return ActionData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ActionData m11494newInstance() {
            return new ActionData();
        }

        public boolean parseField(ActionData actionData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "traceId":
                    actionData.traceId = jsonParser.getValueAsString();
                    return true;
                case "toastStyle":
                    actionData.toastStyle = (ActionToastStyle) ActionToastStyle.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "toast":
                    actionData.toast = (ActionToast) ActionToast.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "insertFormat":
                    actionData.insertFormat = (ActionInsertFormat) ActionInsertFormat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "pageFormat":
                    actionData.pageFormat = (ActionPageFormat) ActionPageFormat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public void serializeFields(ActionData actionData, JsonGenerator jsonGenerator) throws IOException {
            if (actionData.toast != null) {
                jsonGenerator.writeFieldName("toast");
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ActionData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ActionData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ActionData new_() {
        ActionData actionData = new ActionData();
        actionData.nullCheck();
        return actionData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ActionData m11492clone() {
        ActionData actionData = new ActionData();
        ActionToast actionToast = this.toast;
        if (actionToast != null) {
            actionData.toast = actionToast.m11512clone();
        }
        ActionPageFormat actionPageFormat = this.pageFormat;
        if (actionPageFormat != null) {
            actionData.pageFormat = actionPageFormat.m11504clone();
        }
        ActionInsertFormat actionInsertFormat = this.insertFormat;
        if (actionInsertFormat != null) {
            actionData.insertFormat = actionInsertFormat.m11496clone();
        }
        actionData.dataTime = this.dataTime;
        ActionToastStyle actionToastStyle = this.toastStyle;
        if (actionToastStyle != null) {
            actionData.toastStyle = actionToastStyle.m11516clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
