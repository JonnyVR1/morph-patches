package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.LabelParams;
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
import p153l.nc5;
import p153l.qcj;

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
            int iM17285l = (list != null ? CodedOutputByteBufferNano.m17285l(1, list, LabelParams.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.m17275b(2, messageFilterConfig.messageFilterEnabled) + CodedOutputByteBufferNano.m17275b(3, messageFilterConfig.officAccCollectionEnabled) + CodedOutputByteBufferNano.m17275b(4, messageFilterConfig.weakenedTipsEnabled) + CodedOutputByteBufferNano.m17281h(5, messageFilterConfig.redDotLimit) + CodedOutputByteBufferNano.m17281h(6, messageFilterConfig.convUnreadLimit) + CodedOutputByteBufferNano.m17281h(7, messageFilterConfig.shownDayLimit) + CodedOutputByteBufferNano.m17275b(8, messageFilterConfig.showRecommendBanner) + CodedOutputByteBufferNano.m17275b(9, messageFilterConfig.showRecommendBannerHasNewMatch);
            messageFilterConfig.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageFilterConfig parse(nc5 nc5Var) throws IOException {
            MessageFilterConfig messageFilterConfig = new MessageFilterConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (messageFilterConfig.filterTabList != null) {
                        break;
                    }
                    messageFilterConfig.filterTabList = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    messageFilterConfig.filterTabList = (List) nc5Var.m162488l(LabelParams.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 16) {
                    messageFilterConfig.messageFilterEnabled = nc5Var.m162483g();
                } else if (iM162497u == 24) {
                    messageFilterConfig.officAccCollectionEnabled = nc5Var.m162483g();
                } else if (iM162497u == 32) {
                    messageFilterConfig.weakenedTipsEnabled = nc5Var.m162483g();
                } else if (iM162497u == 40) {
                    messageFilterConfig.redDotLimit = nc5Var.m162486j();
                } else if (iM162497u == 48) {
                    messageFilterConfig.convUnreadLimit = nc5Var.m162486j();
                } else if (iM162497u == 56) {
                    messageFilterConfig.shownDayLimit = nc5Var.m162486j();
                } else if (iM162497u == 64) {
                    messageFilterConfig.showRecommendBanner = nc5Var.m162483g();
                } else {
                    if (iM162497u != 72) {
                        if (messageFilterConfig.filterTabList != null) {
                            break;
                        }
                        messageFilterConfig.filterTabList = new ArrayList();
                        return messageFilterConfig;
                    }
                    messageFilterConfig.showRecommendBannerHasNewMatch = nc5Var.m162483g();
                }
            }
            return messageFilterConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageFilterConfig messageFilterConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<LabelParams> list = messageFilterConfig.filterTabList;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, LabelParams.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17299A(2, messageFilterConfig.messageFilterEnabled);
            codedOutputByteBufferNano.m17299A(3, messageFilterConfig.officAccCollectionEnabled);
            codedOutputByteBufferNano.m17299A(4, messageFilterConfig.weakenedTipsEnabled);
            codedOutputByteBufferNano.m17305G(5, messageFilterConfig.redDotLimit);
            codedOutputByteBufferNano.m17305G(6, messageFilterConfig.convUnreadLimit);
            codedOutputByteBufferNano.m17305G(7, messageFilterConfig.shownDayLimit);
            codedOutputByteBufferNano.m17299A(8, messageFilterConfig.showRecommendBanner);
            codedOutputByteBufferNano.m17299A(9, messageFilterConfig.showRecommendBannerHasNewMatch);
        }
    };
    public static JsonAdapter<MessageFilterConfig> JSON_ADAPTER = new ObjectJsonAdapter<MessageFilterConfig>() { // from class: com.p1.mobile.putong.core.data.MessageFilterConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageFilterConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageFilterConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public MessageFilterConfig mo225055clone() {
        MessageFilterConfig messageFilterConfig = new MessageFilterConfig();
        List<LabelParams> list = this.filterTabList;
        if (list != null) {
            messageFilterConfig.filterTabList = ValueObject.util_map(list, new qcj() { // from class: l.ddz
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((LabelParams) obj).mo225055clone();
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
