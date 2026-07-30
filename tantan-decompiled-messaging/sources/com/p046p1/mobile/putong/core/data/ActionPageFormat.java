package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.CardPattern;
import com.p046p1.mobile.putong.core.data.UserAction;
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
public class ActionPageFormat extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "actionpageformat";

    @NonNull
    @ProtobufIndex(index = 4)
    public List<UserAction> cardOptions;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<CardPattern> cardPatterns;

    @NonNull
    @ProtobufIndex(index = 3)
    public String pageContext;

    @NonNull
    @ProtobufIndex(index = 2)
    public String pageSubTitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String pageTitle;

    @NonNull
    @ProtobufIndex(index = 6)
    public String showRules;
    public static ProtobufAdapter<ActionPageFormat> PROTOBUF_ADAPTER = new MessageNanoAdapter<ActionPageFormat>() { // from class: com.p1.mobile.putong.core.data.ActionPageFormat.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ActionPageFormat actionPageFormat) {
            String str = actionPageFormat.pageTitle;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = actionPageFormat.pageSubTitle;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = actionPageFormat.pageContext;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            List<UserAction> list = actionPageFormat.cardOptions;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, list, UserAction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<CardPattern> list2 = actionPageFormat.cardPatterns;
            if (list2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(5, list2, CardPattern.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = actionPageFormat.showRules;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str4);
            }
            actionPageFormat.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ActionPageFormat parse(nb5 nb5Var) throws IOException {
            ActionPageFormat actionPageFormat = new ActionPageFormat();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (actionPageFormat.pageTitle == null) {
                        actionPageFormat.pageTitle = "";
                    }
                    if (actionPageFormat.pageSubTitle == null) {
                        actionPageFormat.pageSubTitle = "";
                    }
                    if (actionPageFormat.pageContext == null) {
                        actionPageFormat.pageContext = "";
                    }
                    if (actionPageFormat.cardOptions == null) {
                        actionPageFormat.cardOptions = new ArrayList();
                    }
                    if (actionPageFormat.cardPatterns == null) {
                        actionPageFormat.cardPatterns = new ArrayList();
                    }
                    if (actionPageFormat.showRules != null) {
                        break;
                    }
                    actionPageFormat.showRules = "";
                    break;
                }
                if (iM158752u == 10) {
                    actionPageFormat.pageTitle = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    actionPageFormat.pageSubTitle = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    actionPageFormat.pageContext = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    actionPageFormat.cardOptions = (List) nb5Var.m158743l(UserAction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 42) {
                    actionPageFormat.cardPatterns = (List) nb5Var.m158743l(CardPattern.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 50) {
                        if (actionPageFormat.pageTitle == null) {
                            actionPageFormat.pageTitle = "";
                        }
                        if (actionPageFormat.pageSubTitle == null) {
                            actionPageFormat.pageSubTitle = "";
                        }
                        if (actionPageFormat.pageContext == null) {
                            actionPageFormat.pageContext = "";
                        }
                        if (actionPageFormat.cardOptions == null) {
                            actionPageFormat.cardOptions = new ArrayList();
                        }
                        if (actionPageFormat.cardPatterns == null) {
                            actionPageFormat.cardPatterns = new ArrayList();
                        }
                        if (actionPageFormat.showRules != null) {
                            break;
                        }
                        actionPageFormat.showRules = "";
                        return actionPageFormat;
                    }
                    actionPageFormat.showRules = nb5Var.m158750s();
                }
            }
            return actionPageFormat;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ActionPageFormat actionPageFormat, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = actionPageFormat.pageTitle;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = actionPageFormat.pageSubTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = actionPageFormat.pageContext;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            List<UserAction> list = actionPageFormat.cardOptions;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(4, list, UserAction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<CardPattern> list2 = actionPageFormat.cardPatterns;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(5, list2, CardPattern.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = actionPageFormat.showRules;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(6, str4);
            }
        }
    };
    public static JsonAdapter<ActionPageFormat> JSON_ADAPTER = new ObjectJsonAdapter<ActionPageFormat>() { // from class: com.p1.mobile.putong.core.data.ActionPageFormat.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ActionPageFormat.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ActionPageFormat newInstance() {
            return new ActionPageFormat();
        }

        public boolean parseField(ActionPageFormat actionPageFormat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "showRules":
                    actionPageFormat.showRules = jsonParser.getValueAsString();
                    return true;
                case "cardOptions":
                    actionPageFormat.cardOptions = JsonAdapter.parseArray(jsonParser, UserAction.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "pageContext":
                    actionPageFormat.pageContext = jsonParser.getValueAsString();
                    return true;
                case "pageSubTitle":
                    actionPageFormat.pageSubTitle = jsonParser.getValueAsString();
                    return true;
                case "pageTitle":
                    actionPageFormat.pageTitle = jsonParser.getValueAsString();
                    return true;
                case "cardPatterns":
                    actionPageFormat.cardPatterns = JsonAdapter.parseArray(jsonParser, CardPattern.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ActionPageFormat actionPageFormat, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "showRules":
                case "cardOptions":
                case "pageContext":
                case "pageSubTitle":
                case "pageTitle":
                case "cardPatterns":
                    return true;
                default:
                    return super.parseFieldCheck(actionPageFormat, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ActionPageFormat actionPageFormat, JsonGenerator jsonGenerator) throws IOException {
            String str = actionPageFormat.pageTitle;
            if (str != null) {
                jsonGenerator.writeStringField("pageTitle", str);
            }
            String str2 = actionPageFormat.pageSubTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("pageSubTitle", str2);
            }
            String str3 = actionPageFormat.pageContext;
            if (str3 != null) {
                jsonGenerator.writeStringField("pageContext", str3);
            }
            if (actionPageFormat.cardOptions != null) {
                jsonGenerator.writeFieldName("cardOptions");
                JsonAdapter.serializeArray(actionPageFormat.cardOptions, jsonGenerator, UserAction.JSON_ADAPTER);
            }
            if (actionPageFormat.cardPatterns != null) {
                jsonGenerator.writeFieldName("cardPatterns");
                JsonAdapter.serializeArray(actionPageFormat.cardPatterns, jsonGenerator, CardPattern.JSON_ADAPTER);
            }
            String str4 = actionPageFormat.showRules;
            if (str4 != null) {
                jsonGenerator.writeStringField("showRules", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ActionPageFormat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ActionPageFormat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ActionPageFormat new_() {
        ActionPageFormat actionPageFormat = new ActionPageFormat();
        actionPageFormat.nullCheck();
        return actionPageFormat;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ActionPageFormat mo223809clone() {
        ActionPageFormat actionPageFormat = new ActionPageFormat();
        actionPageFormat.pageTitle = this.pageTitle;
        actionPageFormat.pageSubTitle = this.pageSubTitle;
        actionPageFormat.pageContext = this.pageContext;
        List<UserAction> list = this.cardOptions;
        if (list != null) {
            actionPageFormat.cardOptions = ValueObject.util_map(list, new w9j() { // from class: l.w30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((UserAction) obj).mo223809clone();
                }
            });
        }
        List<CardPattern> list2 = this.cardPatterns;
        if (list2 != null) {
            actionPageFormat.cardPatterns = ValueObject.util_map(list2, new w9j() { // from class: l.x30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((CardPattern) obj).mo223809clone();
                }
            });
        }
        actionPageFormat.showRules = this.showRules;
        return actionPageFormat;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActionPageFormat)) {
            return false;
        }
        ActionPageFormat actionPageFormat = (ActionPageFormat) obj;
        return ValueObject.util_equals(this.pageTitle, actionPageFormat.pageTitle) && ValueObject.util_equals(this.pageSubTitle, actionPageFormat.pageSubTitle) && ValueObject.util_equals(this.pageContext, actionPageFormat.pageContext) && ValueObject.util_equals(this.cardOptions, actionPageFormat.cardOptions) && ValueObject.util_equals(this.cardPatterns, actionPageFormat.cardPatterns) && ValueObject.util_equals(this.showRules, actionPageFormat.showRules);
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
        String str = this.pageTitle;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.pageSubTitle;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.pageContext;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<UserAction> list = this.cardOptions;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 41;
        List<CardPattern> list2 = this.cardPatterns;
        int iHashCode5 = (iHashCode4 + (list2 != null ? list2.hashCode() : 0)) * 41;
        String str4 = this.showRules;
        int iHashCode6 = iHashCode5 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.pageTitle == null) {
            this.pageTitle = "";
        }
        if (this.pageSubTitle == null) {
            this.pageSubTitle = "";
        }
        if (this.pageContext == null) {
            this.pageContext = "";
        }
        if (this.cardOptions == null) {
            this.cardOptions = new ArrayList();
        }
        if (this.cardPatterns == null) {
            this.cardPatterns = new ArrayList();
        }
        if (this.showRules == null) {
            this.showRules = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
