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
public class ActionToastStyleIcons extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "actiontoaststyleicons";

    @NonNull
    @ProtobufIndex(index = 1)
    public String miniIcon;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String titleIcon;
    public static ProtobufAdapter<ActionToastStyleIcons> PROTOBUF_ADAPTER = new MessageNanoAdapter<ActionToastStyleIcons>() { // from class: com.p1.mobile.putong.core.data.ActionToastStyleIcons.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ActionToastStyleIcons actionToastStyleIcons) {
            String str = actionToastStyleIcons.miniIcon;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = actionToastStyleIcons.titleIcon;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) actionToastStyleIcons).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ActionToastStyleIcons m11525parse(nb5 nb5Var) throws IOException {
            ActionToastStyleIcons actionToastStyleIcons = new ActionToastStyleIcons();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (actionToastStyleIcons.miniIcon == null) {
                        actionToastStyleIcons.miniIcon = "";
                    }
                    if (actionToastStyleIcons.titleIcon != null) {
                        break;
                    }
                    actionToastStyleIcons.titleIcon = "";
                    break;
                }
                if (iU == 10) {
                    actionToastStyleIcons.miniIcon = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (actionToastStyleIcons.miniIcon == null) {
                            actionToastStyleIcons.miniIcon = "";
                        }
                        if (actionToastStyleIcons.titleIcon != null) {
                            break;
                        }
                        actionToastStyleIcons.titleIcon = "";
                        return actionToastStyleIcons;
                    }
                    actionToastStyleIcons.titleIcon = nb5Var.s();
                }
            }
            return actionToastStyleIcons;
        }

        public void serialize(ActionToastStyleIcons actionToastStyleIcons, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = actionToastStyleIcons.miniIcon;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = actionToastStyleIcons.titleIcon;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<ActionToastStyleIcons> JSON_ADAPTER = new ObjectJsonAdapter<ActionToastStyleIcons>() { // from class: com.p1.mobile.putong.core.data.ActionToastStyleIcons.2
        public Class getDataClass() {
            return ActionToastStyleIcons.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ActionToastStyleIcons m11526newInstance() {
            return new ActionToastStyleIcons();
        }

        public boolean parseField(ActionToastStyleIcons actionToastStyleIcons, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("titleIcon")) {
                actionToastStyleIcons.titleIcon = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("miniIcon")) {
                return false;
            }
            actionToastStyleIcons.miniIcon = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(ActionToastStyleIcons actionToastStyleIcons, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("titleIcon") || str.equals("miniIcon")) {
                return true;
            }
            return super.parseFieldCheck(actionToastStyleIcons, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ActionToastStyleIcons actionToastStyleIcons, JsonGenerator jsonGenerator) throws IOException {
            String str = actionToastStyleIcons.miniIcon;
            if (str != null) {
                jsonGenerator.writeStringField("miniIcon", str);
            }
            String str2 = actionToastStyleIcons.titleIcon;
            if (str2 != null) {
                jsonGenerator.writeStringField("titleIcon", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ActionToastStyleIcons) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ActionToastStyleIcons) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ActionToastStyleIcons new_() {
        ActionToastStyleIcons actionToastStyleIcons = new ActionToastStyleIcons();
        actionToastStyleIcons.nullCheck();
        return actionToastStyleIcons;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ActionToastStyleIcons m11524clone() {
        ActionToastStyleIcons actionToastStyleIcons = new ActionToastStyleIcons();
        actionToastStyleIcons.miniIcon = this.miniIcon;
        actionToastStyleIcons.titleIcon = this.titleIcon;
        return actionToastStyleIcons;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActionToastStyleIcons)) {
            return false;
        }
        ActionToastStyleIcons actionToastStyleIcons = (ActionToastStyleIcons) obj;
        return ValueObject.util_equals(this.miniIcon, actionToastStyleIcons.miniIcon) && ValueObject.util_equals(this.titleIcon, actionToastStyleIcons.titleIcon);
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
        String str = this.miniIcon;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.titleIcon;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.miniIcon == null) {
            this.miniIcon = "";
        }
        if (this.titleIcon == null) {
            this.titleIcon = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
