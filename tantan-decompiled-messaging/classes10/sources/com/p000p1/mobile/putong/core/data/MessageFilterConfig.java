package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.LabelParams;
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
public class MessageFilterConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagefilterconfig";

    @ProtobufIndex(index = 6)
    public int convUnreadLimit;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<LabelParams> filterTabList;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean messageFilterEnabled;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean officAccCollectionEnabled;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MessageFilterConfig messageFilterConfig) {
            List<LabelParams> list = messageFilterConfig.filterTabList;
            int iL = (list != null ? CodedOutputByteBufferNano.l(1, list, LabelParams.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.b(2, messageFilterConfig.messageFilterEnabled) + CodedOutputByteBufferNano.b(3, messageFilterConfig.officAccCollectionEnabled) + CodedOutputByteBufferNano.b(4, messageFilterConfig.weakenedTipsEnabled) + CodedOutputByteBufferNano.h(5, messageFilterConfig.redDotLimit) + CodedOutputByteBufferNano.h(6, messageFilterConfig.convUnreadLimit) + CodedOutputByteBufferNano.h(7, messageFilterConfig.shownDayLimit) + CodedOutputByteBufferNano.b(8, messageFilterConfig.showRecommendBanner) + CodedOutputByteBufferNano.b(9, messageFilterConfig.showRecommendBannerHasNewMatch);
            ((MessageNano) messageFilterConfig).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MessageFilterConfig m14205parse(nb5 nb5Var) throws IOException {
            MessageFilterConfig messageFilterConfig = new MessageFilterConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (messageFilterConfig.filterTabList != null) {
                        break;
                    }
                    messageFilterConfig.filterTabList = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    messageFilterConfig.filterTabList = (List) nb5Var.l(LabelParams.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 16) {
                    messageFilterConfig.messageFilterEnabled = nb5Var.g();
                } else if (iU == 24) {
                    messageFilterConfig.officAccCollectionEnabled = nb5Var.g();
                } else if (iU == 32) {
                    messageFilterConfig.weakenedTipsEnabled = nb5Var.g();
                } else if (iU == 40) {
                    messageFilterConfig.redDotLimit = nb5Var.j();
                } else if (iU == 48) {
                    messageFilterConfig.convUnreadLimit = nb5Var.j();
                } else if (iU == 56) {
                    messageFilterConfig.shownDayLimit = nb5Var.j();
                } else if (iU == 64) {
                    messageFilterConfig.showRecommendBanner = nb5Var.g();
                } else {
                    if (iU != 72) {
                        if (messageFilterConfig.filterTabList != null) {
                            break;
                        }
                        messageFilterConfig.filterTabList = new ArrayList();
                        return messageFilterConfig;
                    }
                    messageFilterConfig.showRecommendBannerHasNewMatch = nb5Var.g();
                }
            }
            return messageFilterConfig;
        }

        public void serialize(MessageFilterConfig messageFilterConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<LabelParams> list = messageFilterConfig.filterTabList;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, LabelParams.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.A(2, messageFilterConfig.messageFilterEnabled);
            codedOutputByteBufferNano.A(3, messageFilterConfig.officAccCollectionEnabled);
            codedOutputByteBufferNano.A(4, messageFilterConfig.weakenedTipsEnabled);
            codedOutputByteBufferNano.G(5, messageFilterConfig.redDotLimit);
            codedOutputByteBufferNano.G(6, messageFilterConfig.convUnreadLimit);
            codedOutputByteBufferNano.G(7, messageFilterConfig.shownDayLimit);
            codedOutputByteBufferNano.A(8, messageFilterConfig.showRecommendBanner);
            codedOutputByteBufferNano.A(9, messageFilterConfig.showRecommendBannerHasNewMatch);
        }
    };
    public static JsonAdapter<MessageFilterConfig> JSON_ADAPTER = new ObjectJsonAdapter<MessageFilterConfig>() { // from class: com.p1.mobile.putong.core.data.MessageFilterConfig.2
        public Class getDataClass() {
            return MessageFilterConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MessageFilterConfig m14206newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageFilterConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageFilterConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MessageFilterConfig new_() {
        MessageFilterConfig messageFilterConfig = new MessageFilterConfig();
        messageFilterConfig.nullCheck();
        return messageFilterConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MessageFilterConfig m14204clone() {
        MessageFilterConfig messageFilterConfig = new MessageFilterConfig();
        List<LabelParams> list = this.filterTabList;
        if (list != null) {
            messageFilterConfig.filterTabList = ValueObject.util_map(list, new w9j() { // from class: l.g4z
                public final Object call(Object obj) {
                    return ((LabelParams) obj).m13804clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<LabelParams> list = this.filterTabList;
        int iHashCode = ((((((((((((((((i2 + (list != null ? list.hashCode() : 0)) * 41) + (this.messageFilterEnabled ? 1231 : 1237)) * 41) + (this.officAccCollectionEnabled ? 1231 : 1237)) * 41) + (this.weakenedTipsEnabled ? 1231 : 1237)) * 41) + this.redDotLimit) * 41) + this.convUnreadLimit) * 41) + this.shownDayLimit) * 41) + (this.showRecommendBanner ? 1231 : 1237)) * 41) + (this.showRecommendBannerHasNewMatch ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.filterTabList == null) {
            this.filterTabList = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
