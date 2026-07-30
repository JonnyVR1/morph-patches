package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.LabelParams;
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
public class MessageFilterConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagefilterconfig";

    @ProtobufIndex(index = 6)
    public int convUnreadLimit;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<LabelParams> filterTabList;

    @ProtobufIndex(index = 2)
    public boolean messageFilterEnabled;

    @ProtobufIndex(index = 3)
    public boolean officAccCollectionEnabled;

    @ProtobufIndex(index = 5)
    public int redDotLimit;

    @ProtobufIndex(index = 8)
    public boolean showRecommendBanner;

    @ProtobufIndex(index = 9)
    public boolean showRecommendBannerHasNewMatch;

    @ProtobufIndex(index = 7)
    public int shownDayLimit;

    @ProtobufIndex(index = 4)
    public boolean weakenedTipsEnabled;
    public static ProtobufAdapter<MessageFilterConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageFilterConfig>() { // from class: com.p1.mobile.putong.core.data.MessageFilterConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageFilterConfig messageFilterConfig) {
            List<LabelParams> list = messageFilterConfig.filterTabList;
            int iM17230l = (list != null ? CodedOutputByteBufferNano.m17230l(1, list, LabelParams.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.m17220b(2, messageFilterConfig.messageFilterEnabled) + CodedOutputByteBufferNano.m17220b(3, messageFilterConfig.officAccCollectionEnabled) + CodedOutputByteBufferNano.m17220b(4, messageFilterConfig.weakenedTipsEnabled) + CodedOutputByteBufferNano.m17226h(5, messageFilterConfig.redDotLimit) + CodedOutputByteBufferNano.m17226h(6, messageFilterConfig.convUnreadLimit) + CodedOutputByteBufferNano.m17226h(7, messageFilterConfig.shownDayLimit) + CodedOutputByteBufferNano.m17220b(8, messageFilterConfig.showRecommendBanner) + CodedOutputByteBufferNano.m17220b(9, messageFilterConfig.showRecommendBannerHasNewMatch);
            messageFilterConfig.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageFilterConfig parse(nb5 nb5Var) throws IOException {
            MessageFilterConfig messageFilterConfig = new MessageFilterConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (messageFilterConfig.filterTabList != null) {
                        break;
                    }
                    messageFilterConfig.filterTabList = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    messageFilterConfig.filterTabList = (List) nb5Var.m158743l(LabelParams.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 16) {
                    messageFilterConfig.messageFilterEnabled = nb5Var.m158738g();
                } else if (iM158752u == 24) {
                    messageFilterConfig.officAccCollectionEnabled = nb5Var.m158738g();
                } else if (iM158752u == 32) {
                    messageFilterConfig.weakenedTipsEnabled = nb5Var.m158738g();
                } else if (iM158752u == 40) {
                    messageFilterConfig.redDotLimit = nb5Var.m158741j();
                } else if (iM158752u == 48) {
                    messageFilterConfig.convUnreadLimit = nb5Var.m158741j();
                } else if (iM158752u == 56) {
                    messageFilterConfig.shownDayLimit = nb5Var.m158741j();
                } else if (iM158752u == 64) {
                    messageFilterConfig.showRecommendBanner = nb5Var.m158738g();
                } else {
                    if (iM158752u != 72) {
                        if (messageFilterConfig.filterTabList != null) {
                            break;
                        }
                        messageFilterConfig.filterTabList = new ArrayList();
                        return messageFilterConfig;
                    }
                    messageFilterConfig.showRecommendBannerHasNewMatch = nb5Var.m158738g();
                }
            }
            return messageFilterConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageFilterConfig messageFilterConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<LabelParams> list = messageFilterConfig.filterTabList;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, LabelParams.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17244A(2, messageFilterConfig.messageFilterEnabled);
            codedOutputByteBufferNano.m17244A(3, messageFilterConfig.officAccCollectionEnabled);
            codedOutputByteBufferNano.m17244A(4, messageFilterConfig.weakenedTipsEnabled);
            codedOutputByteBufferNano.m17250G(5, messageFilterConfig.redDotLimit);
            codedOutputByteBufferNano.m17250G(6, messageFilterConfig.convUnreadLimit);
            codedOutputByteBufferNano.m17250G(7, messageFilterConfig.shownDayLimit);
            codedOutputByteBufferNano.m17244A(8, messageFilterConfig.showRecommendBanner);
            codedOutputByteBufferNano.m17244A(9, messageFilterConfig.showRecommendBannerHasNewMatch);
        }
    };
    public static JsonAdapter<MessageFilterConfig> JSON_ADAPTER = new ObjectJsonAdapter<MessageFilterConfig>() { // from class: com.p1.mobile.putong.core.data.MessageFilterConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageFilterConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageFilterConfig newInstance() {
            return new MessageFilterConfig();
        }

        public boolean parseField(MessageFilterConfig messageFilterConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "showRecommendBannerHasNewMatch":
                    messageFilterConfig.showRecommendBannerHasNewMatch = jsonParser.getValueAsBoolean();
                    return true;
                case "shownDayLimit":
                    messageFilterConfig.shownDayLimit = jsonParser.getValueAsInt();
                    return true;
                case "messageFilterEnabled":
                    messageFilterConfig.messageFilterEnabled = jsonParser.getValueAsBoolean();
                    return true;
                case "convUnreadLimit":
                    messageFilterConfig.convUnreadLimit = jsonParser.getValueAsInt();
                    return true;
                case "redDotLimit":
                    messageFilterConfig.redDotLimit = jsonParser.getValueAsInt();
                    return true;
                case "weakenedTipsEnabled":
                    messageFilterConfig.weakenedTipsEnabled = jsonParser.getValueAsBoolean();
                    return true;
                case "showRecommendBanner":
                    messageFilterConfig.showRecommendBanner = jsonParser.getValueAsBoolean();
                    return true;
                case "filterTabList":
                    messageFilterConfig.filterTabList = JsonAdapter.parseArray(jsonParser, LabelParams.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "officAccCollectionEnabled":
                    messageFilterConfig.officAccCollectionEnabled = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MessageFilterConfig messageFilterConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "showRecommendBannerHasNewMatch":
                case "shownDayLimit":
                case "messageFilterEnabled":
                case "convUnreadLimit":
                case "redDotLimit":
                case "weakenedTipsEnabled":
                case "showRecommendBanner":
                case "filterTabList":
                case "officAccCollectionEnabled":
                    return true;
                default:
                    return super.parseFieldCheck(messageFilterConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MessageFilterConfig messageFilterConfig, JsonGenerator jsonGenerator) throws IOException {
            if (messageFilterConfig.filterTabList != null) {
                jsonGenerator.writeFieldName("filterTabList");
                JsonAdapter.serializeArray(messageFilterConfig.filterTabList, jsonGenerator, LabelParams.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("messageFilterEnabled", messageFilterConfig.messageFilterEnabled);
            jsonGenerator.writeBooleanField("officAccCollectionEnabled", messageFilterConfig.officAccCollectionEnabled);
            jsonGenerator.writeBooleanField("weakenedTipsEnabled", messageFilterConfig.weakenedTipsEnabled);
            jsonGenerator.writeNumberField("redDotLimit", messageFilterConfig.redDotLimit);
            jsonGenerator.writeNumberField("convUnreadLimit", messageFilterConfig.convUnreadLimit);
            jsonGenerator.writeNumberField("shownDayLimit", messageFilterConfig.shownDayLimit);
            jsonGenerator.writeBooleanField("showRecommendBanner", messageFilterConfig.showRecommendBanner);
            jsonGenerator.writeBooleanField("showRecommendBannerHasNewMatch", messageFilterConfig.showRecommendBannerHasNewMatch);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageFilterConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageFilterConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageFilterConfig new_() {
        MessageFilterConfig messageFilterConfig = new MessageFilterConfig();
        messageFilterConfig.nullCheck();
        return messageFilterConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageFilterConfig mo223809clone() {
        MessageFilterConfig messageFilterConfig = new MessageFilterConfig();
        List<LabelParams> list = this.filterTabList;
        if (list != null) {
            messageFilterConfig.filterTabList = ValueObject.util_map(list, new w9j() { // from class: l.g4z
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((LabelParams) obj).mo223809clone();
                }
            });
        }
        messageFilterConfig.messageFilterEnabled = this.messageFilterEnabled;
        messageFilterConfig.officAccCollectionEnabled = this.officAccCollectionEnabled;
        messageFilterConfig.weakenedTipsEnabled = this.weakenedTipsEnabled;
        messageFilterConfig.redDotLimit = this.redDotLimit;
        messageFilterConfig.convUnreadLimit = this.convUnreadLimit;
        messageFilterConfig.shownDayLimit = this.shownDayLimit;
        messageFilterConfig.showRecommendBanner = this.showRecommendBanner;
        messageFilterConfig.showRecommendBannerHasNewMatch = this.showRecommendBannerHasNewMatch;
        return messageFilterConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageFilterConfig)) {
            return false;
        }
        MessageFilterConfig messageFilterConfig = (MessageFilterConfig) obj;
        return ValueObject.util_equals(this.filterTabList, messageFilterConfig.filterTabList) && this.messageFilterEnabled == messageFilterConfig.messageFilterEnabled && this.officAccCollectionEnabled == messageFilterConfig.officAccCollectionEnabled && this.weakenedTipsEnabled == messageFilterConfig.weakenedTipsEnabled && this.redDotLimit == messageFilterConfig.redDotLimit && this.convUnreadLimit == messageFilterConfig.convUnreadLimit && this.shownDayLimit == messageFilterConfig.shownDayLimit && this.showRecommendBanner == messageFilterConfig.showRecommendBanner && this.showRecommendBannerHasNewMatch == messageFilterConfig.showRecommendBannerHasNewMatch;
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
        List<LabelParams> list = this.filterTabList;
        int iHashCode = ((((((((((((((((i2 + (list != null ? list.hashCode() : 0)) * 41) + (this.messageFilterEnabled ? 1231 : 1237)) * 41) + (this.officAccCollectionEnabled ? 1231 : 1237)) * 41) + (this.weakenedTipsEnabled ? 1231 : 1237)) * 41) + this.redDotLimit) * 41) + this.convUnreadLimit) * 41) + this.shownDayLimit) * 41) + (this.showRecommendBanner ? 1231 : 1237)) * 41) + (this.showRecommendBannerHasNewMatch ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.filterTabList == null) {
            this.filterTabList = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
