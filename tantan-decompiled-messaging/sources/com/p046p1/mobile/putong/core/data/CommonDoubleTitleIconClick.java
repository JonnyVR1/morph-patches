package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
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
    @ProtobufIndex(index = 3)
    public String subtitle;

    @NonNull
    @ProtobufIndex(index = 5)
    public MessageItemTarget target;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;
    public static ProtobufAdapter<CommonDoubleTitleIconClick> PROTOBUF_ADAPTER = new MessageNanoAdapter<CommonDoubleTitleIconClick>() { // from class: com.p1.mobile.putong.core.data.CommonDoubleTitleIconClick.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CommonDoubleTitleIconClick commonDoubleTitleIconClick) {
            String str = commonDoubleTitleIconClick.iconUrl;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = commonDoubleTitleIconClick.title;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = commonDoubleTitleIconClick.subtitle;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            MessageItemButton messageItemButton = commonDoubleTitleIconClick.button;
            if (messageItemButton != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, messageItemButton, MessageItemButton.PROTOBUF_ADAPTER);
            }
            MessageItemTarget messageItemTarget = commonDoubleTitleIconClick.target;
            if (messageItemTarget != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(5, messageItemTarget, MessageItemTarget.PROTOBUF_ADAPTER);
            }
            MessageItemStatistics messageItemStatistics = commonDoubleTitleIconClick.statistics;
            if (messageItemStatistics != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(6, messageItemStatistics, MessageItemStatistics.PROTOBUF_ADAPTER);
            }
            commonDoubleTitleIconClick.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CommonDoubleTitleIconClick parse(nb5 nb5Var) throws IOException {
            CommonDoubleTitleIconClick commonDoubleTitleIconClick = new CommonDoubleTitleIconClick();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    commonDoubleTitleIconClick.iconUrl = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    commonDoubleTitleIconClick.title = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    commonDoubleTitleIconClick.subtitle = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    commonDoubleTitleIconClick.button = (MessageItemButton) nb5Var.m158743l(MessageItemButton.PROTOBUF_ADAPTER);
                } else if (iM158752u == 42) {
                    commonDoubleTitleIconClick.target = (MessageItemTarget) nb5Var.m158743l(MessageItemTarget.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 50) {
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
                    commonDoubleTitleIconClick.statistics = (MessageItemStatistics) nb5Var.m158743l(MessageItemStatistics.PROTOBUF_ADAPTER);
                }
            }
            return commonDoubleTitleIconClick;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CommonDoubleTitleIconClick commonDoubleTitleIconClick, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = commonDoubleTitleIconClick.iconUrl;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = commonDoubleTitleIconClick.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = commonDoubleTitleIconClick.subtitle;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            MessageItemButton messageItemButton = commonDoubleTitleIconClick.button;
            if (messageItemButton != null) {
                codedOutputByteBufferNano.m17254K(4, messageItemButton, MessageItemButton.PROTOBUF_ADAPTER);
            }
            MessageItemTarget messageItemTarget = commonDoubleTitleIconClick.target;
            if (messageItemTarget != null) {
                codedOutputByteBufferNano.m17254K(5, messageItemTarget, MessageItemTarget.PROTOBUF_ADAPTER);
            }
            MessageItemStatistics messageItemStatistics = commonDoubleTitleIconClick.statistics;
            if (messageItemStatistics != null) {
                codedOutputByteBufferNano.m17254K(6, messageItemStatistics, MessageItemStatistics.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<CommonDoubleTitleIconClick> JSON_ADAPTER = new ObjectJsonAdapter<CommonDoubleTitleIconClick>() { // from class: com.p1.mobile.putong.core.data.CommonDoubleTitleIconClick.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CommonDoubleTitleIconClick.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CommonDoubleTitleIconClick newInstance() {
            return new CommonDoubleTitleIconClick();
        }

        public boolean parseField(CommonDoubleTitleIconClick commonDoubleTitleIconClick, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subtitle":
                    commonDoubleTitleIconClick.subtitle = jsonParser.getValueAsString();
                    return true;
                case "button":
                    commonDoubleTitleIconClick.button = MessageItemButton.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "target":
                    commonDoubleTitleIconClick.target = MessageItemTarget.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "statistics":
                    commonDoubleTitleIconClick.statistics = MessageItemStatistics.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CommonDoubleTitleIconClick commonDoubleTitleIconClick, JsonGenerator jsonGenerator) throws IOException {
            String str = commonDoubleTitleIconClick.iconUrl;
            if (str != null) {
                jsonGenerator.writeStringField("iconUrl", str);
            }
            String str2 = commonDoubleTitleIconClick.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = commonDoubleTitleIconClick.subtitle;
            if (str3 != null) {
                jsonGenerator.writeStringField("subtitle", str3);
            }
            if (commonDoubleTitleIconClick.button != null) {
                jsonGenerator.writeFieldName("button");
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CommonDoubleTitleIconClick) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CommonDoubleTitleIconClick) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CommonDoubleTitleIconClick new_() {
        CommonDoubleTitleIconClick commonDoubleTitleIconClick = new CommonDoubleTitleIconClick();
        commonDoubleTitleIconClick.nullCheck();
        return commonDoubleTitleIconClick;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CommonDoubleTitleIconClick mo223809clone() {
        CommonDoubleTitleIconClick commonDoubleTitleIconClick = new CommonDoubleTitleIconClick();
        commonDoubleTitleIconClick.iconUrl = this.iconUrl;
        commonDoubleTitleIconClick.title = this.title;
        commonDoubleTitleIconClick.subtitle = this.subtitle;
        MessageItemButton messageItemButton = this.button;
        if (messageItemButton != null) {
            commonDoubleTitleIconClick.button = messageItemButton.mo223809clone();
        }
        MessageItemTarget messageItemTarget = this.target;
        if (messageItemTarget != null) {
            commonDoubleTitleIconClick.target = messageItemTarget.mo223809clone();
        }
        MessageItemStatistics messageItemStatistics = this.statistics;
        if (messageItemStatistics != null) {
            commonDoubleTitleIconClick.statistics = messageItemStatistics.mo223809clone();
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
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
