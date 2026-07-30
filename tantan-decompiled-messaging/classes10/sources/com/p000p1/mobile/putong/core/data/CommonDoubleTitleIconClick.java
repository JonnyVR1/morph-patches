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
public class CommonDoubleTitleIconClick extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "commondoubletitleiconclick";

    @NonNull
    @ProtobufIndex(index = 4)
    public MessageItemButton button;

    @NonNull
    @ProtobufIndex(index = 1)
    public String iconUrl;

    @NonNull
    @ProtobufIndex(index = 6)
    public MessageItemStatistics statistics;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String subtitle;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public MessageItemTarget target;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String title;
    public static ProtobufAdapter<CommonDoubleTitleIconClick> PROTOBUF_ADAPTER = new MessageNanoAdapter<CommonDoubleTitleIconClick>() { // from class: com.p1.mobile.putong.core.data.CommonDoubleTitleIconClick.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CommonDoubleTitleIconClick commonDoubleTitleIconClick) {
            String str = commonDoubleTitleIconClick.iconUrl;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = commonDoubleTitleIconClick.title;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = commonDoubleTitleIconClick.subtitle;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            MessageItemButton messageItemButton = commonDoubleTitleIconClick.button;
            if (messageItemButton != null) {
                iO += CodedOutputByteBufferNano.l(4, messageItemButton, MessageItemButton.PROTOBUF_ADAPTER);
            }
            MessageItemTarget messageItemTarget = commonDoubleTitleIconClick.target;
            if (messageItemTarget != null) {
                iO += CodedOutputByteBufferNano.l(5, messageItemTarget, MessageItemTarget.PROTOBUF_ADAPTER);
            }
            MessageItemStatistics messageItemStatistics = commonDoubleTitleIconClick.statistics;
            if (messageItemStatistics != null) {
                iO += CodedOutputByteBufferNano.l(6, messageItemStatistics, MessageItemStatistics.PROTOBUF_ADAPTER);
            }
            ((MessageNano) commonDoubleTitleIconClick).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CommonDoubleTitleIconClick m12221parse(nb5 nb5Var) throws IOException {
            CommonDoubleTitleIconClick commonDoubleTitleIconClick = new CommonDoubleTitleIconClick();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (commonDoubleTitleIconClick.iconUrl == null) {
                        commonDoubleTitleIconClick.iconUrl = "";
                    }
                    if (commonDoubleTitleIconClick.title == null) {
                        commonDoubleTitleIconClick.title = "";
                    }
                    if (commonDoubleTitleIconClick.subtitle == null) {
                        commonDoubleTitleIconClick.subtitle = "";
                    }
                    if (commonDoubleTitleIconClick.button == null) {
                        commonDoubleTitleIconClick.button = MessageItemButton.new_();
                    }
                    if (commonDoubleTitleIconClick.target == null) {
                        commonDoubleTitleIconClick.target = MessageItemTarget.new_();
                    }
                    if (commonDoubleTitleIconClick.statistics != null) {
                        break;
                    }
                    commonDoubleTitleIconClick.statistics = MessageItemStatistics.new_();
                    break;
                }
                if (iU == 10) {
                    commonDoubleTitleIconClick.iconUrl = nb5Var.s();
                } else if (iU == 18) {
                    commonDoubleTitleIconClick.title = nb5Var.s();
                } else if (iU == 26) {
                    commonDoubleTitleIconClick.subtitle = nb5Var.s();
                } else if (iU == 34) {
                    commonDoubleTitleIconClick.button = (MessageItemButton) nb5Var.l(MessageItemButton.PROTOBUF_ADAPTER);
                } else if (iU == 42) {
                    commonDoubleTitleIconClick.target = (MessageItemTarget) nb5Var.l(MessageItemTarget.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 50) {
                        if (commonDoubleTitleIconClick.iconUrl == null) {
                            commonDoubleTitleIconClick.iconUrl = "";
                        }
                        if (commonDoubleTitleIconClick.title == null) {
                            commonDoubleTitleIconClick.title = "";
                        }
                        if (commonDoubleTitleIconClick.subtitle == null) {
                            commonDoubleTitleIconClick.subtitle = "";
                        }
                        if (commonDoubleTitleIconClick.button == null) {
                            commonDoubleTitleIconClick.button = MessageItemButton.new_();
                        }
                        if (commonDoubleTitleIconClick.target == null) {
                            commonDoubleTitleIconClick.target = MessageItemTarget.new_();
                        }
                        if (commonDoubleTitleIconClick.statistics != null) {
                            break;
                        }
                        commonDoubleTitleIconClick.statistics = MessageItemStatistics.new_();
                        return commonDoubleTitleIconClick;
                    }
                    commonDoubleTitleIconClick.statistics = (MessageItemStatistics) nb5Var.l(MessageItemStatistics.PROTOBUF_ADAPTER);
                }
            }
            return commonDoubleTitleIconClick;
        }

        public void serialize(CommonDoubleTitleIconClick commonDoubleTitleIconClick, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = commonDoubleTitleIconClick.iconUrl;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = commonDoubleTitleIconClick.title;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = commonDoubleTitleIconClick.subtitle;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            MessageItemButton messageItemButton = commonDoubleTitleIconClick.button;
            if (messageItemButton != null) {
                codedOutputByteBufferNano.K(4, messageItemButton, MessageItemButton.PROTOBUF_ADAPTER);
            }
            MessageItemTarget messageItemTarget = commonDoubleTitleIconClick.target;
            if (messageItemTarget != null) {
                codedOutputByteBufferNano.K(5, messageItemTarget, MessageItemTarget.PROTOBUF_ADAPTER);
            }
            MessageItemStatistics messageItemStatistics = commonDoubleTitleIconClick.statistics;
            if (messageItemStatistics != null) {
                codedOutputByteBufferNano.K(6, messageItemStatistics, MessageItemStatistics.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<CommonDoubleTitleIconClick> JSON_ADAPTER = new ObjectJsonAdapter<CommonDoubleTitleIconClick>() { // from class: com.p1.mobile.putong.core.data.CommonDoubleTitleIconClick.2
        public Class getDataClass() {
            return CommonDoubleTitleIconClick.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CommonDoubleTitleIconClick m12222newInstance() {
            return new CommonDoubleTitleIconClick();
        }

        public boolean parseField(CommonDoubleTitleIconClick commonDoubleTitleIconClick, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subtitle":
                    commonDoubleTitleIconClick.subtitle = jsonParser.getValueAsString();
                    return true;
                case "button":
                    commonDoubleTitleIconClick.button = (MessageItemButton) MessageItemButton.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "target":
                    commonDoubleTitleIconClick.target = (MessageItemTarget) MessageItemTarget.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "statistics":
                    commonDoubleTitleIconClick.statistics = (MessageItemStatistics) MessageItemStatistics.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    commonDoubleTitleIconClick.title = jsonParser.getValueAsString();
                    return true;
                case "iconUrl":
                    commonDoubleTitleIconClick.iconUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CommonDoubleTitleIconClick commonDoubleTitleIconClick, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subtitle":
                case "button":
                case "target":
                case "statistics":
                case "title":
                case "iconUrl":
                    return true;
                default:
                    return super.parseFieldCheck(commonDoubleTitleIconClick, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(CommonDoubleTitleIconClick commonDoubleTitleIconClick, JsonGenerator jsonGenerator) throws IOException {
            String str = commonDoubleTitleIconClick.iconUrl;
            if (str != null) {
                jsonGenerator.writeStringField("iconUrl", str);
            }
            String str2 = commonDoubleTitleIconClick.title;
            if (str2 != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str2);
            }
            String str3 = commonDoubleTitleIconClick.subtitle;
            if (str3 != null) {
                jsonGenerator.writeStringField("subtitle", str3);
            }
            if (commonDoubleTitleIconClick.button != null) {
                jsonGenerator.writeFieldName(Button.TYPE);
                MessageItemButton.JSON_ADAPTER.serialize(commonDoubleTitleIconClick.button, jsonGenerator, true);
            }
            if (commonDoubleTitleIconClick.target != null) {
                jsonGenerator.writeFieldName(Target.TYPE);
                MessageItemTarget.JSON_ADAPTER.serialize(commonDoubleTitleIconClick.target, jsonGenerator, true);
            }
            if (commonDoubleTitleIconClick.statistics != null) {
                jsonGenerator.writeFieldName("statistics");
                MessageItemStatistics.JSON_ADAPTER.serialize(commonDoubleTitleIconClick.statistics, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CommonDoubleTitleIconClick) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CommonDoubleTitleIconClick) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CommonDoubleTitleIconClick new_() {
        CommonDoubleTitleIconClick commonDoubleTitleIconClick = new CommonDoubleTitleIconClick();
        commonDoubleTitleIconClick.nullCheck();
        return commonDoubleTitleIconClick;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CommonDoubleTitleIconClick m12220clone() {
        CommonDoubleTitleIconClick commonDoubleTitleIconClick = new CommonDoubleTitleIconClick();
        commonDoubleTitleIconClick.iconUrl = this.iconUrl;
        commonDoubleTitleIconClick.title = this.title;
        commonDoubleTitleIconClick.subtitle = this.subtitle;
        MessageItemButton messageItemButton = this.button;
        if (messageItemButton != null) {
            commonDoubleTitleIconClick.button = messageItemButton.m14216clone();
        }
        MessageItemTarget messageItemTarget = this.target;
        if (messageItemTarget != null) {
            commonDoubleTitleIconClick.target = messageItemTarget.m14224clone();
        }
        MessageItemStatistics messageItemStatistics = this.statistics;
        if (messageItemStatistics != null) {
            commonDoubleTitleIconClick.statistics = messageItemStatistics.m14220clone();
        }
        return commonDoubleTitleIconClick;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommonDoubleTitleIconClick)) {
            return false;
        }
        CommonDoubleTitleIconClick commonDoubleTitleIconClick = (CommonDoubleTitleIconClick) obj;
        return ValueObject.util_equals(this.iconUrl, commonDoubleTitleIconClick.iconUrl) && ValueObject.util_equals(this.title, commonDoubleTitleIconClick.title) && ValueObject.util_equals(this.subtitle, commonDoubleTitleIconClick.subtitle) && ValueObject.util_equals(this.button, commonDoubleTitleIconClick.button) && ValueObject.util_equals(this.target, commonDoubleTitleIconClick.target) && ValueObject.util_equals(this.statistics, commonDoubleTitleIconClick.statistics);
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
        String str = this.iconUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        MessageItemButton messageItemButton = this.button;
        int iHashCode4 = (iHashCode3 + (messageItemButton != null ? messageItemButton.hashCode() : 0)) * 41;
        MessageItemTarget messageItemTarget = this.target;
        int iHashCode5 = (iHashCode4 + (messageItemTarget != null ? messageItemTarget.hashCode() : 0)) * 41;
        MessageItemStatistics messageItemStatistics = this.statistics;
        int iHashCode6 = iHashCode5 + (messageItemStatistics != null ? messageItemStatistics.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

    public void nullCheck() {
        if (this.iconUrl == null) {
            this.iconUrl = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.subtitle == null) {
            this.subtitle = "";
        }
        if (this.button == null) {
            this.button = MessageItemButton.new_();
        }
        if (this.target == null) {
            this.target = MessageItemTarget.new_();
        }
        if (this.statistics == null) {
            this.statistics = MessageItemStatistics.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
