package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
public class ActionToastStyleIcons extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "actiontoaststyleicons";

    @NonNull
    @ProtobufIndex(index = 1)
    public String miniIcon;

    @NonNull
    @ProtobufIndex(index = 2)
    public String titleIcon;
    public static ProtobufAdapter<ActionToastStyleIcons> PROTOBUF_ADAPTER = new MessageNanoAdapter<ActionToastStyleIcons>() { // from class: com.p1.mobile.putong.core.data.ActionToastStyleIcons.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ActionToastStyleIcons actionToastStyleIcons) {
            String str = actionToastStyleIcons.miniIcon;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = actionToastStyleIcons.titleIcon;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            actionToastStyleIcons.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ActionToastStyleIcons parse(nc5 nc5Var) throws IOException {
            ActionToastStyleIcons actionToastStyleIcons = new ActionToastStyleIcons();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (actionToastStyleIcons.miniIcon == null) {
                        actionToastStyleIcons.miniIcon = "";
                    }
                    if (actionToastStyleIcons.titleIcon != null) {
                        break;
                    }
                    actionToastStyleIcons.titleIcon = "";
                    break;
                }
                if (iM162497u == 10) {
                    actionToastStyleIcons.miniIcon = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (actionToastStyleIcons.miniIcon == null) {
                            actionToastStyleIcons.miniIcon = "";
                        }
                        if (actionToastStyleIcons.titleIcon != null) {
                            break;
                        }
                        actionToastStyleIcons.titleIcon = "";
                        return actionToastStyleIcons;
                    }
                    actionToastStyleIcons.titleIcon = nc5Var.m162495s();
                }
            }
            return actionToastStyleIcons;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ActionToastStyleIcons actionToastStyleIcons, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = actionToastStyleIcons.miniIcon;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = actionToastStyleIcons.titleIcon;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<ActionToastStyleIcons> JSON_ADAPTER = new ObjectJsonAdapter<ActionToastStyleIcons>() { // from class: com.p1.mobile.putong.core.data.ActionToastStyleIcons.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ActionToastStyleIcons.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ActionToastStyleIcons newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ActionToastStyleIcons) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ActionToastStyleIcons) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ActionToastStyleIcons new_() {
        ActionToastStyleIcons actionToastStyleIcons = new ActionToastStyleIcons();
        actionToastStyleIcons.nullCheck();
        return actionToastStyleIcons;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ActionToastStyleIcons mo225055clone() {
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
        String str = this.miniIcon;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.titleIcon;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.miniIcon == null) {
            this.miniIcon = "";
        }
        if (this.titleIcon == null) {
            this.titleIcon = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
