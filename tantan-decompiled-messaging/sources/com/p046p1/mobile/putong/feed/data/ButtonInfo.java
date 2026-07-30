package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class ButtonInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "buttoninfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String content;

    @NonNull
    @ProtobufIndex(index = 2)
    public String deepLink;

    @NonNull
    @ProtobufIndex(index = 3)
    public DialogBtnType type;
    public static ProtobufAdapter<ButtonInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<ButtonInfo>() { // from class: com.p1.mobile.putong.feed.data.ButtonInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ButtonInfo buttonInfo) {
            String str = buttonInfo.content;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = buttonInfo.deepLink;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            DialogBtnType dialogBtnType = buttonInfo.type;
            if (dialogBtnType != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, dialogBtnType, DialogBtnType.PROTOBUF_ADAPTER);
            }
            buttonInfo.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ButtonInfo parse(nb5 nb5Var) throws IOException {
            ButtonInfo buttonInfo = new ButtonInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (buttonInfo.content == null) {
                        buttonInfo.content = "";
                    }
                    if (buttonInfo.deepLink == null) {
                        buttonInfo.deepLink = "";
                    }
                    if (buttonInfo.type != null) {
                        break;
                    }
                    buttonInfo.type = (DialogBtnType) DialogBtnType.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM158752u == 10) {
                    buttonInfo.content = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    buttonInfo.deepLink = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (buttonInfo.content == null) {
                            buttonInfo.content = "";
                        }
                        if (buttonInfo.deepLink == null) {
                            buttonInfo.deepLink = "";
                        }
                        if (buttonInfo.type != null) {
                            break;
                        }
                        buttonInfo.type = (DialogBtnType) DialogBtnType.JSON_ADAPTER.defaultEnum();
                        return buttonInfo;
                    }
                    buttonInfo.type = (DialogBtnType) nb5Var.m158743l(DialogBtnType.PROTOBUF_ADAPTER);
                }
            }
            return buttonInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ButtonInfo buttonInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = buttonInfo.content;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = buttonInfo.deepLink;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            DialogBtnType dialogBtnType = buttonInfo.type;
            if (dialogBtnType != null) {
                codedOutputByteBufferNano.m17254K(3, dialogBtnType, DialogBtnType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ButtonInfo> JSON_ADAPTER = new ObjectJsonAdapter<ButtonInfo>() { // from class: com.p1.mobile.putong.feed.data.ButtonInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ButtonInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ButtonInfo newInstance() {
            return new ButtonInfo();
        }

        public boolean parseField(ButtonInfo buttonInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "type":
                    buttonInfo.type = DialogBtnType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "deepLink":
                    buttonInfo.deepLink = jsonParser.getValueAsString();
                    return true;
                case "content":
                    buttonInfo.content = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ButtonInfo buttonInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "type":
                case "deepLink":
                case "content":
                    return true;
                default:
                    return super.parseFieldCheck(buttonInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ButtonInfo buttonInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = buttonInfo.content;
            if (str != null) {
                jsonGenerator.writeStringField("content", str);
            }
            String str2 = buttonInfo.deepLink;
            if (str2 != null) {
                jsonGenerator.writeStringField("deepLink", str2);
            }
            if (buttonInfo.type != null) {
                jsonGenerator.writeFieldName("type");
                DialogBtnType.JSON_ADAPTER.serialize(buttonInfo.type, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ButtonInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ButtonInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ButtonInfo new_() {
        ButtonInfo buttonInfo = new ButtonInfo();
        buttonInfo.nullCheck();
        return buttonInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ButtonInfo mo223809clone() {
        ButtonInfo buttonInfo = new ButtonInfo();
        buttonInfo.content = this.content;
        buttonInfo.deepLink = this.deepLink;
        buttonInfo.type = this.type;
        return buttonInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ButtonInfo)) {
            return false;
        }
        ButtonInfo buttonInfo = (ButtonInfo) obj;
        return ValueObject.util_equals(this.content, buttonInfo.content) && ValueObject.util_equals(this.deepLink, buttonInfo.deepLink) && ValueObject.util_equals(this.type, buttonInfo.type);
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
        String str = this.content;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.deepLink;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        DialogBtnType dialogBtnType = this.type;
        int iHashCode3 = iHashCode2 + (dialogBtnType != null ? dialogBtnType.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.content == null) {
            this.content = "";
        }
        if (this.deepLink == null) {
            this.deepLink = "";
        }
        if (this.type == null) {
            this.type = (DialogBtnType) DialogBtnType.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
