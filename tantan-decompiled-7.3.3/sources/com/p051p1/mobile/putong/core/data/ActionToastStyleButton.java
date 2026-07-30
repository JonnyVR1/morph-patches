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
public class ActionToastStyleButton extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "actiontoaststylebutton";

    @NonNull
    @ProtobufIndex(index = 3)
    public String buttonBackground;

    @NonNull
    @ProtobufIndex(index = 4)
    public String buttonLink;

    @NonNull
    @ProtobufIndex(index = 2)
    public String buttonMessage;

    @ProtobufIndex(index = 1)
    public boolean showButton;
    public static ProtobufAdapter<ActionToastStyleButton> PROTOBUF_ADAPTER = new MessageNanoAdapter<ActionToastStyleButton>() { // from class: com.p1.mobile.putong.core.data.ActionToastStyleButton.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ActionToastStyleButton actionToastStyleButton) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, actionToastStyleButton.showButton);
            String str = actionToastStyleButton.buttonMessage;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = actionToastStyleButton.buttonBackground;
            if (str2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            String str3 = actionToastStyleButton.buttonLink;
            if (str3 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            actionToastStyleButton.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ActionToastStyleButton parse(nc5 nc5Var) throws IOException {
            ActionToastStyleButton actionToastStyleButton = new ActionToastStyleButton();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (actionToastStyleButton.buttonMessage == null) {
                        actionToastStyleButton.buttonMessage = "";
                    }
                    if (actionToastStyleButton.buttonBackground == null) {
                        actionToastStyleButton.buttonBackground = "";
                    }
                    if (actionToastStyleButton.buttonLink != null) {
                        break;
                    }
                    actionToastStyleButton.buttonLink = "";
                    break;
                }
                if (iM162497u == 8) {
                    actionToastStyleButton.showButton = nc5Var.m162483g();
                } else if (iM162497u == 18) {
                    actionToastStyleButton.buttonMessage = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    actionToastStyleButton.buttonBackground = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (actionToastStyleButton.buttonMessage == null) {
                            actionToastStyleButton.buttonMessage = "";
                        }
                        if (actionToastStyleButton.buttonBackground == null) {
                            actionToastStyleButton.buttonBackground = "";
                        }
                        if (actionToastStyleButton.buttonLink != null) {
                            break;
                        }
                        actionToastStyleButton.buttonLink = "";
                        return actionToastStyleButton;
                    }
                    actionToastStyleButton.buttonLink = nc5Var.m162495s();
                }
            }
            return actionToastStyleButton;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ActionToastStyleButton actionToastStyleButton, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, actionToastStyleButton.showButton);
            String str = actionToastStyleButton.buttonMessage;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = actionToastStyleButton.buttonBackground;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            String str3 = actionToastStyleButton.buttonLink;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
        }
    };
    public static JsonAdapter<ActionToastStyleButton> JSON_ADAPTER = new ObjectJsonAdapter<ActionToastStyleButton>() { // from class: com.p1.mobile.putong.core.data.ActionToastStyleButton.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ActionToastStyleButton.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ActionToastStyleButton newInstance() {
            return new ActionToastStyleButton();
        }

        public boolean parseField(ActionToastStyleButton actionToastStyleButton, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "buttonMessage":
                    actionToastStyleButton.buttonMessage = jsonParser.getValueAsString();
                    return true;
                case "showButton":
                    actionToastStyleButton.showButton = jsonParser.getValueAsBoolean();
                    return true;
                case "buttonLink":
                    actionToastStyleButton.buttonLink = jsonParser.getValueAsString();
                    return true;
                case "buttonBackground":
                    actionToastStyleButton.buttonBackground = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ActionToastStyleButton actionToastStyleButton, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "buttonMessage":
                case "showButton":
                case "buttonLink":
                case "buttonBackground":
                    return true;
                default:
                    return super.parseFieldCheck(actionToastStyleButton, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ActionToastStyleButton actionToastStyleButton, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("showButton", actionToastStyleButton.showButton);
            String str = actionToastStyleButton.buttonMessage;
            if (str != null) {
                jsonGenerator.writeStringField("buttonMessage", str);
            }
            String str2 = actionToastStyleButton.buttonBackground;
            if (str2 != null) {
                jsonGenerator.writeStringField("buttonBackground", str2);
            }
            String str3 = actionToastStyleButton.buttonLink;
            if (str3 != null) {
                jsonGenerator.writeStringField("buttonLink", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ActionToastStyleButton) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ActionToastStyleButton) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ActionToastStyleButton new_() {
        ActionToastStyleButton actionToastStyleButton = new ActionToastStyleButton();
        actionToastStyleButton.nullCheck();
        return actionToastStyleButton;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ActionToastStyleButton mo225055clone() {
        ActionToastStyleButton actionToastStyleButton = new ActionToastStyleButton();
        actionToastStyleButton.showButton = this.showButton;
        actionToastStyleButton.buttonMessage = this.buttonMessage;
        actionToastStyleButton.buttonBackground = this.buttonBackground;
        actionToastStyleButton.buttonLink = this.buttonLink;
        return actionToastStyleButton;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActionToastStyleButton)) {
            return false;
        }
        ActionToastStyleButton actionToastStyleButton = (ActionToastStyleButton) obj;
        return this.showButton == actionToastStyleButton.showButton && ValueObject.util_equals(this.buttonMessage, actionToastStyleButton.buttonMessage) && ValueObject.util_equals(this.buttonBackground, actionToastStyleButton.buttonBackground) && ValueObject.util_equals(this.buttonLink, actionToastStyleButton.buttonLink);
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
        int i2 = ((i * 41) + (this.showButton ? 1231 : 1237)) * 41;
        String str = this.buttonMessage;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.buttonBackground;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.buttonLink;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.buttonMessage == null) {
            this.buttonMessage = "";
        }
        if (this.buttonBackground == null) {
            this.buttonBackground = "";
        }
        if (this.buttonLink == null) {
            this.buttonLink = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
