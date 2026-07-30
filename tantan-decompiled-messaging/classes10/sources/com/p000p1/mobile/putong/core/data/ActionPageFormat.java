package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.CardPattern;
import com.p000p1.mobile.putong.core.data.UserAction;
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
public class ActionPageFormat extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "actionpageformat";

    @NonNull
    @ProtobufIndex(index = 4)
    public List<UserAction> cardOptions;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public List<CardPattern> cardPatterns;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String pageContext;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String pageSubTitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String pageTitle;

    @NonNull
    @ProtobufIndex(index = 6)
    public String showRules;
    public static ProtobufAdapter<ActionPageFormat> PROTOBUF_ADAPTER = new MessageNanoAdapter<ActionPageFormat>() { // from class: com.p1.mobile.putong.core.data.ActionPageFormat.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ActionPageFormat actionPageFormat) {
            String str = actionPageFormat.pageTitle;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = actionPageFormat.pageSubTitle;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = actionPageFormat.pageContext;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            List<UserAction> list = actionPageFormat.cardOptions;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(4, list, UserAction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<CardPattern> list2 = actionPageFormat.cardPatterns;
            if (list2 != null) {
                iO += CodedOutputByteBufferNano.l(5, list2, CardPattern.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = actionPageFormat.showRules;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(6, str4);
            }
            ((MessageNano) actionPageFormat).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ActionPageFormat m11505parse(nb5 nb5Var) throws IOException {
            ActionPageFormat actionPageFormat = new ActionPageFormat();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    actionPageFormat.pageTitle = nb5Var.s();
                } else if (iU == 18) {
                    actionPageFormat.pageSubTitle = nb5Var.s();
                } else if (iU == 26) {
                    actionPageFormat.pageContext = nb5Var.s();
                } else if (iU == 34) {
                    actionPageFormat.cardOptions = (List) nb5Var.l(UserAction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 42) {
                    actionPageFormat.cardPatterns = (List) nb5Var.l(CardPattern.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 50) {
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
                    actionPageFormat.showRules = nb5Var.s();
                }
            }
            return actionPageFormat;
        }

        public void serialize(ActionPageFormat actionPageFormat, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = actionPageFormat.pageTitle;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = actionPageFormat.pageSubTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = actionPageFormat.pageContext;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            List<UserAction> list = actionPageFormat.cardOptions;
            if (list != null) {
                codedOutputByteBufferNano.K(4, list, UserAction.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<CardPattern> list2 = actionPageFormat.cardPatterns;
            if (list2 != null) {
                codedOutputByteBufferNano.K(5, list2, CardPattern.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = actionPageFormat.showRules;
            if (str4 != null) {
                codedOutputByteBufferNano.R(6, str4);
            }
        }
    };
    public static JsonAdapter<ActionPageFormat> JSON_ADAPTER = new ObjectJsonAdapter<ActionPageFormat>() { // from class: com.p1.mobile.putong.core.data.ActionPageFormat.2
        public Class getDataClass() {
            return ActionPageFormat.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ActionPageFormat m11506newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ActionPageFormat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ActionPageFormat) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ActionPageFormat new_() {
        ActionPageFormat actionPageFormat = new ActionPageFormat();
        actionPageFormat.nullCheck();
        return actionPageFormat;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ActionPageFormat m11504clone() {
        ActionPageFormat actionPageFormat = new ActionPageFormat();
        actionPageFormat.pageTitle = this.pageTitle;
        actionPageFormat.pageSubTitle = this.pageSubTitle;
        actionPageFormat.pageContext = this.pageContext;
        List<UserAction> list = this.cardOptions;
        if (list != null) {
            actionPageFormat.cardOptions = ValueObject.util_map(list, new w9j() { // from class: l.w30
                public final Object call(Object obj) {
                    return ((UserAction) obj).m16091clone();
                }
            });
        }
        List<CardPattern> list2 = this.cardPatterns;
        if (list2 != null) {
            actionPageFormat.cardPatterns = ValueObject.util_map(list2, new w9j() { // from class: l.x30
                public final Object call(Object obj) {
                    return ((CardPattern) obj).m11898clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
