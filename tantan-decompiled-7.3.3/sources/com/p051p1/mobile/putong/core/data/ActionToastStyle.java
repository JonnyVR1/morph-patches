package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.ActionToastStyle;
import com.p051p1.mobile.putong.core.data.ActionToastStyleButton;
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
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class ActionToastStyle extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "actiontoaststyle";

    @NonNull
    @ProtobufIndex(index = 9)
    public String business;

    @NonNull
    @ProtobufIndex(index = 11)
    public List<ActionToastStyleButton> buttons;

    @NonNull
    @ProtobufIndex(index = 3)
    public ActionToastStyleIcons icons;

    @NonNull
    @ProtobufIndex(index = 12)
    public String localReportId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String mainImg;

    @NonNull
    @ProtobufIndex(index = 6)
    public String message;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<String> scenes;

    @ProtobufIndex(index = 7)
    public boolean showClose;

    @ProtobufIndex(index = 10)
    public int showTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String styleId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String title;

    @NonNull
    @ProtobufIndex(index = 4)
    public String toastLink;
    public static ProtobufAdapter<ActionToastStyle> PROTOBUF_ADAPTER = new MessageNanoAdapter<ActionToastStyle>() { // from class: com.p1.mobile.putong.core.data.ActionToastStyle.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ActionToastStyle actionToastStyle) {
            String str = actionToastStyle.styleId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = actionToastStyle.mainImg;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            ActionToastStyleIcons actionToastStyleIcons = actionToastStyle.icons;
            if (actionToastStyleIcons != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, actionToastStyleIcons, ActionToastStyleIcons.PROTOBUF_ADAPTER);
            }
            String str3 = actionToastStyle.toastLink;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            String str4 = actionToastStyle.title;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str4);
            }
            String str5 = actionToastStyle.message;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str5);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(7, actionToastStyle.showClose);
            List<String> list = actionToastStyle.scenes;
            if (list != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(8, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str6 = actionToastStyle.business;
            if (str6 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(9, str6);
            }
            int iM17281h = iM17275b + CodedOutputByteBufferNano.m17281h(10, actionToastStyle.showTime);
            List<ActionToastStyleButton> list2 = actionToastStyle.buttons;
            if (list2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(11, list2, ActionToastStyleButton.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str7 = actionToastStyle.localReportId;
            if (str7 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(12, str7);
            }
            actionToastStyle.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ActionToastStyle parse(nc5 nc5Var) throws IOException {
            ActionToastStyle actionToastStyle = new ActionToastStyle();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (actionToastStyle.styleId == null) {
                            actionToastStyle.styleId = "";
                        }
                        if (actionToastStyle.mainImg == null) {
                            actionToastStyle.mainImg = "";
                        }
                        if (actionToastStyle.icons == null) {
                            actionToastStyle.icons = ActionToastStyleIcons.new_();
                        }
                        if (actionToastStyle.toastLink == null) {
                            actionToastStyle.toastLink = "";
                        }
                        if (actionToastStyle.title == null) {
                            actionToastStyle.title = "";
                        }
                        if (actionToastStyle.message == null) {
                            actionToastStyle.message = "";
                        }
                        if (actionToastStyle.buttons == null) {
                            actionToastStyle.buttons = new ArrayList();
                        }
                        if (actionToastStyle.scenes == null) {
                            actionToastStyle.scenes = new ArrayList();
                        }
                        if (actionToastStyle.business == null) {
                            actionToastStyle.business = "";
                        }
                        if (actionToastStyle.localReportId == null) {
                            actionToastStyle.localReportId = "";
                        }
                        break;
                    case 10:
                        actionToastStyle.styleId = nc5Var.m162495s();
                        continue;
                    case 18:
                        actionToastStyle.mainImg = nc5Var.m162495s();
                        continue;
                    case 26:
                        actionToastStyle.icons = (ActionToastStyleIcons) nc5Var.m162488l(ActionToastStyleIcons.PROTOBUF_ADAPTER);
                        continue;
                    case 34:
                        actionToastStyle.toastLink = nc5Var.m162495s();
                        continue;
                    case 42:
                        actionToastStyle.title = nc5Var.m162495s();
                        continue;
                    case 50:
                        actionToastStyle.message = nc5Var.m162495s();
                        continue;
                    case 56:
                        actionToastStyle.showClose = nc5Var.m162483g();
                        continue;
                    case 66:
                        actionToastStyle.scenes = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 74:
                        actionToastStyle.business = nc5Var.m162495s();
                        continue;
                    case 80:
                        actionToastStyle.showTime = nc5Var.m162486j();
                        continue;
                    case 90:
                        actionToastStyle.buttons = (List) nc5Var.m162488l(ActionToastStyleButton.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        actionToastStyle.localReportId = nc5Var.m162495s();
                        continue;
                    default:
                        if (actionToastStyle.styleId == null) {
                            actionToastStyle.styleId = "";
                        }
                        if (actionToastStyle.mainImg == null) {
                            actionToastStyle.mainImg = "";
                        }
                        if (actionToastStyle.icons == null) {
                            actionToastStyle.icons = ActionToastStyleIcons.new_();
                        }
                        if (actionToastStyle.toastLink == null) {
                            actionToastStyle.toastLink = "";
                        }
                        if (actionToastStyle.title == null) {
                            actionToastStyle.title = "";
                        }
                        if (actionToastStyle.message == null) {
                            actionToastStyle.message = "";
                        }
                        if (actionToastStyle.buttons == null) {
                            actionToastStyle.buttons = new ArrayList();
                        }
                        if (actionToastStyle.scenes == null) {
                            actionToastStyle.scenes = new ArrayList();
                        }
                        if (actionToastStyle.business == null) {
                            actionToastStyle.business = "";
                        }
                        if (actionToastStyle.localReportId == null) {
                            actionToastStyle.localReportId = "";
                            return actionToastStyle;
                        }
                        break;
                }
            }
            return actionToastStyle;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ActionToastStyle actionToastStyle, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = actionToastStyle.styleId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = actionToastStyle.mainImg;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            ActionToastStyleIcons actionToastStyleIcons = actionToastStyle.icons;
            if (actionToastStyleIcons != null) {
                codedOutputByteBufferNano.m17309K(3, actionToastStyleIcons, ActionToastStyleIcons.PROTOBUF_ADAPTER);
            }
            String str3 = actionToastStyle.toastLink;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            String str4 = actionToastStyle.title;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(5, str4);
            }
            String str5 = actionToastStyle.message;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(6, str5);
            }
            codedOutputByteBufferNano.m17299A(7, actionToastStyle.showClose);
            List<String> list = actionToastStyle.scenes;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(8, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str6 = actionToastStyle.business;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(9, str6);
            }
            codedOutputByteBufferNano.m17305G(10, actionToastStyle.showTime);
            List<ActionToastStyleButton> list2 = actionToastStyle.buttons;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(11, list2, ActionToastStyleButton.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str7 = actionToastStyle.localReportId;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(12, str7);
            }
        }
    };
    public static JsonAdapter<ActionToastStyle> JSON_ADAPTER = new ObjectJsonAdapter<ActionToastStyle>() { // from class: com.p1.mobile.putong.core.data.ActionToastStyle.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ActionToastStyle.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ActionToastStyle newInstance() {
            return new ActionToastStyle();
        }

        public boolean parseField(ActionToastStyle actionToastStyle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "showClose":
                    actionToastStyle.showClose = jsonParser.getValueAsBoolean();
                    return true;
                case "styleId":
                    actionToastStyle.styleId = jsonParser.getValueAsString();
                    return true;
                case "localReportId":
                    actionToastStyle.localReportId = jsonParser.getValueAsString();
                    return true;
                case "business":
                    actionToastStyle.business = jsonParser.getValueAsString();
                    return true;
                case "scenes":
                    actionToastStyle.scenes = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "showTime":
                    actionToastStyle.showTime = jsonParser.getValueAsInt();
                    return true;
                case "icons":
                    actionToastStyle.icons = ActionToastStyleIcons.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    actionToastStyle.title = jsonParser.getValueAsString();
                    return true;
                case "buttons":
                    actionToastStyle.buttons = JsonAdapter.parseArray(jsonParser, ActionToastStyleButton.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "toastLink":
                    actionToastStyle.toastLink = jsonParser.getValueAsString();
                    return true;
                case "mainImg":
                    actionToastStyle.mainImg = jsonParser.getValueAsString();
                    return true;
                case "message":
                    actionToastStyle.message = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ActionToastStyle actionToastStyle, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "showClose":
                case "styleId":
                case "localReportId":
                case "business":
                case "scenes":
                case "showTime":
                case "icons":
                case "title":
                case "buttons":
                case "toastLink":
                case "mainImg":
                case "message":
                    return true;
                default:
                    return super.parseFieldCheck(actionToastStyle, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ActionToastStyle actionToastStyle, JsonGenerator jsonGenerator) throws IOException {
            String str = actionToastStyle.styleId;
            if (str != null) {
                jsonGenerator.writeStringField("styleId", str);
            }
            String str2 = actionToastStyle.mainImg;
            if (str2 != null) {
                jsonGenerator.writeStringField("mainImg", str2);
            }
            if (actionToastStyle.icons != null) {
                jsonGenerator.writeFieldName("icons");
                ActionToastStyleIcons.JSON_ADAPTER.serialize(actionToastStyle.icons, jsonGenerator, true);
            }
            String str3 = actionToastStyle.toastLink;
            if (str3 != null) {
                jsonGenerator.writeStringField("toastLink", str3);
            }
            String str4 = actionToastStyle.title;
            if (str4 != null) {
                jsonGenerator.writeStringField("title", str4);
            }
            String str5 = actionToastStyle.message;
            if (str5 != null) {
                jsonGenerator.writeStringField("message", str5);
            }
            jsonGenerator.writeBooleanField("showClose", actionToastStyle.showClose);
            if (actionToastStyle.buttons != null) {
                jsonGenerator.writeFieldName(Constants.KEY_BUTTONS);
                JsonAdapter.serializeArray(actionToastStyle.buttons, jsonGenerator, ActionToastStyleButton.JSON_ADAPTER);
            }
            if (actionToastStyle.scenes != null) {
                jsonGenerator.writeFieldName("scenes");
                JsonAdapter.serializeArray(actionToastStyle.scenes, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("showTime", actionToastStyle.showTime);
            String str6 = actionToastStyle.business;
            if (str6 != null) {
                jsonGenerator.writeStringField("business", str6);
            }
            String str7 = actionToastStyle.localReportId;
            if (str7 != null) {
                jsonGenerator.writeStringField("localReportId", str7);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ActionToastStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ActionToastStyle) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36209a(String str) {
        return str;
    }

    public static ActionToastStyle new_() {
        ActionToastStyle actionToastStyle = new ActionToastStyle();
        actionToastStyle.nullCheck();
        return actionToastStyle;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ActionToastStyle mo225055clone() {
        ActionToastStyle actionToastStyle = new ActionToastStyle();
        actionToastStyle.styleId = this.styleId;
        actionToastStyle.mainImg = this.mainImg;
        ActionToastStyleIcons actionToastStyleIcons = this.icons;
        if (actionToastStyleIcons != null) {
            actionToastStyle.icons = actionToastStyleIcons.mo225055clone();
        }
        actionToastStyle.toastLink = this.toastLink;
        actionToastStyle.title = this.title;
        actionToastStyle.message = this.message;
        actionToastStyle.showClose = this.showClose;
        List<ActionToastStyleButton> list = this.buttons;
        if (list != null) {
            actionToastStyle.buttons = ValueObject.util_map(list, new qcj() { // from class: l.z30
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((ActionToastStyleButton) obj).mo225055clone();
                }
            });
        }
        List<String> list2 = this.scenes;
        if (list2 != null) {
            actionToastStyle.scenes = ValueObject.util_map(list2, new qcj() { // from class: l.a40
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ActionToastStyle.m36209a((String) obj);
                }
            });
        }
        actionToastStyle.showTime = this.showTime;
        actionToastStyle.business = this.business;
        actionToastStyle.localReportId = this.localReportId;
        return actionToastStyle;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActionToastStyle)) {
            return false;
        }
        ActionToastStyle actionToastStyle = (ActionToastStyle) obj;
        return ValueObject.util_equals(this.styleId, actionToastStyle.styleId) && ValueObject.util_equals(this.mainImg, actionToastStyle.mainImg) && ValueObject.util_equals(this.icons, actionToastStyle.icons) && ValueObject.util_equals(this.toastLink, actionToastStyle.toastLink) && ValueObject.util_equals(this.title, actionToastStyle.title) && ValueObject.util_equals(this.message, actionToastStyle.message) && this.showClose == actionToastStyle.showClose && ValueObject.util_equals(this.buttons, actionToastStyle.buttons) && ValueObject.util_equals(this.scenes, actionToastStyle.scenes) && this.showTime == actionToastStyle.showTime && ValueObject.util_equals(this.business, actionToastStyle.business) && ValueObject.util_equals(this.localReportId, actionToastStyle.localReportId);
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
        String str = this.styleId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.mainImg;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        ActionToastStyleIcons actionToastStyleIcons = this.icons;
        int iHashCode3 = (iHashCode2 + (actionToastStyleIcons != null ? actionToastStyleIcons.hashCode() : 0)) * 41;
        String str3 = this.toastLink;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.title;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.message;
        int iHashCode6 = (((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41) + (this.showClose ? 1231 : 1237)) * 41;
        List<ActionToastStyleButton> list = this.buttons;
        int iHashCode7 = (iHashCode6 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.scenes;
        int iHashCode8 = (((iHashCode7 + (list2 != null ? list2.hashCode() : 0)) * 41) + this.showTime) * 41;
        String str6 = this.business;
        int iHashCode9 = (iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.localReportId;
        int iHashCode10 = iHashCode9 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.styleId == null) {
            this.styleId = "";
        }
        if (this.mainImg == null) {
            this.mainImg = "";
        }
        if (this.icons == null) {
            this.icons = ActionToastStyleIcons.new_();
        }
        if (this.toastLink == null) {
            this.toastLink = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.message == null) {
            this.message = "";
        }
        if (this.buttons == null) {
            this.buttons = new ArrayList();
        }
        if (this.scenes == null) {
            this.scenes = new ArrayList();
        }
        if (this.business == null) {
            this.business = "";
        }
        if (this.localReportId == null) {
            this.localReportId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
