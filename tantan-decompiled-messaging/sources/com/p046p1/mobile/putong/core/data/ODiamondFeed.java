package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.ODiamondFeed;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveUnreadTypeEnum;
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
public class ODiamondFeed extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "odiamondfeed";

    @NonNull
    @ProtobufIndex(index = 3)
    public ODiamondFeedType feedType;

    @NonNull
    @ProtobufIndex(index = 6)
    public String highLight;

    @Nullable
    @ProtobufIndex(index = 8)
    public ODiamondFeedInstantChat instantChat;

    @Nullable
    @ProtobufIndex(index = 7)
    public ODiamondFeedLatestVisitor latestVisitor;

    @ProtobufIndex(index = 1)
    public boolean redDot;

    @NonNull
    @ProtobufIndex(index = 5)
    public String subText;

    @NonNull
    @ProtobufIndex(index = 4)
    public String text;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> userIds;
    public static ProtobufAdapter<ODiamondFeed> PROTOBUF_ADAPTER = new MessageNanoAdapter<ODiamondFeed>() { // from class: com.p1.mobile.putong.core.data.ODiamondFeed.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ODiamondFeed oDiamondFeed) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, oDiamondFeed.redDot);
            List<String> list = oDiamondFeed.userIds;
            if (list != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ODiamondFeedType oDiamondFeedType = oDiamondFeed.feedType;
            if (oDiamondFeedType != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(3, oDiamondFeedType, ODiamondFeedType.PROTOBUF_ADAPTER);
            }
            String str = oDiamondFeed.text;
            if (str != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(4, str);
            }
            String str2 = oDiamondFeed.subText;
            if (str2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(5, str2);
            }
            String str3 = oDiamondFeed.highLight;
            if (str3 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(6, str3);
            }
            ODiamondFeedLatestVisitor oDiamondFeedLatestVisitor = oDiamondFeed.latestVisitor;
            if (oDiamondFeedLatestVisitor != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(7, oDiamondFeedLatestVisitor, ODiamondFeedLatestVisitor.PROTOBUF_ADAPTER);
            }
            ODiamondFeedInstantChat oDiamondFeedInstantChat = oDiamondFeed.instantChat;
            if (oDiamondFeedInstantChat != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(8, oDiamondFeedInstantChat, ODiamondFeedInstantChat.PROTOBUF_ADAPTER);
            }
            oDiamondFeed.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ODiamondFeed parse(nb5 nb5Var) throws IOException {
            ODiamondFeed oDiamondFeed = new ODiamondFeed();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (oDiamondFeed.userIds == null) {
                        oDiamondFeed.userIds = new ArrayList();
                    }
                    if (oDiamondFeed.feedType == null) {
                        oDiamondFeed.feedType = (ODiamondFeedType) ODiamondFeedType.JSON_ADAPTER.defaultEnum();
                    }
                    if (oDiamondFeed.text == null) {
                        oDiamondFeed.text = "";
                    }
                    if (oDiamondFeed.subText == null) {
                        oDiamondFeed.subText = "";
                    }
                    if (oDiamondFeed.highLight != null) {
                        break;
                    }
                    oDiamondFeed.highLight = "";
                    break;
                }
                if (iM158752u == 8) {
                    oDiamondFeed.redDot = nb5Var.m158738g();
                } else if (iM158752u == 18) {
                    oDiamondFeed.userIds = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 26) {
                    oDiamondFeed.feedType = (ODiamondFeedType) nb5Var.m158743l(ODiamondFeedType.PROTOBUF_ADAPTER);
                } else if (iM158752u == 34) {
                    oDiamondFeed.text = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    oDiamondFeed.subText = nb5Var.m158750s();
                } else if (iM158752u == 50) {
                    oDiamondFeed.highLight = nb5Var.m158750s();
                } else if (iM158752u == 58) {
                    oDiamondFeed.latestVisitor = (ODiamondFeedLatestVisitor) nb5Var.m158743l(ODiamondFeedLatestVisitor.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 66) {
                        if (oDiamondFeed.userIds == null) {
                            oDiamondFeed.userIds = new ArrayList();
                        }
                        if (oDiamondFeed.feedType == null) {
                            oDiamondFeed.feedType = (ODiamondFeedType) ODiamondFeedType.JSON_ADAPTER.defaultEnum();
                        }
                        if (oDiamondFeed.text == null) {
                            oDiamondFeed.text = "";
                        }
                        if (oDiamondFeed.subText == null) {
                            oDiamondFeed.subText = "";
                        }
                        if (oDiamondFeed.highLight != null) {
                            break;
                        }
                        oDiamondFeed.highLight = "";
                        return oDiamondFeed;
                    }
                    oDiamondFeed.instantChat = (ODiamondFeedInstantChat) nb5Var.m158743l(ODiamondFeedInstantChat.PROTOBUF_ADAPTER);
                }
            }
            return oDiamondFeed;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ODiamondFeed oDiamondFeed, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, oDiamondFeed.redDot);
            List<String> list = oDiamondFeed.userIds;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ODiamondFeedType oDiamondFeedType = oDiamondFeed.feedType;
            if (oDiamondFeedType != null) {
                codedOutputByteBufferNano.m17254K(3, oDiamondFeedType, ODiamondFeedType.PROTOBUF_ADAPTER);
            }
            String str = oDiamondFeed.text;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(4, str);
            }
            String str2 = oDiamondFeed.subText;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(5, str2);
            }
            String str3 = oDiamondFeed.highLight;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(6, str3);
            }
            ODiamondFeedLatestVisitor oDiamondFeedLatestVisitor = oDiamondFeed.latestVisitor;
            if (oDiamondFeedLatestVisitor != null) {
                codedOutputByteBufferNano.m17254K(7, oDiamondFeedLatestVisitor, ODiamondFeedLatestVisitor.PROTOBUF_ADAPTER);
            }
            ODiamondFeedInstantChat oDiamondFeedInstantChat = oDiamondFeed.instantChat;
            if (oDiamondFeedInstantChat != null) {
                codedOutputByteBufferNano.m17254K(8, oDiamondFeedInstantChat, ODiamondFeedInstantChat.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ODiamondFeed> JSON_ADAPTER = new ObjectJsonAdapter<ODiamondFeed>() { // from class: com.p1.mobile.putong.core.data.ODiamondFeed.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ODiamondFeed.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ODiamondFeed newInstance() {
            return new ODiamondFeed();
        }

        public boolean parseField(ODiamondFeed oDiamondFeed, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "instantChat":
                    oDiamondFeed.instantChat = ODiamondFeedInstantChat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "latestVisitor":
                    oDiamondFeed.latestVisitor = ODiamondFeedLatestVisitor.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "subText":
                    oDiamondFeed.subText = jsonParser.getValueAsString();
                    return true;
                case "redDot":
                    oDiamondFeed.redDot = jsonParser.getValueAsBoolean();
                    return true;
                case "highLight":
                    oDiamondFeed.highLight = jsonParser.getValueAsString();
                    return true;
                case "feedType":
                    oDiamondFeed.feedType = ODiamondFeedType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "userIds":
                    oDiamondFeed.userIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "text":
                    oDiamondFeed.text = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ODiamondFeed oDiamondFeed, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "instantChat":
                case "latestVisitor":
                case "subText":
                case "redDot":
                case "highLight":
                case "feedType":
                case "userIds":
                case "text":
                    return true;
                default:
                    return super.parseFieldCheck(oDiamondFeed, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ODiamondFeed oDiamondFeed, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(BLiveUnreadTypeEnum.redDot, oDiamondFeed.redDot);
            if (oDiamondFeed.userIds != null) {
                jsonGenerator.writeFieldName("userIds");
                JsonAdapter.serializeArray(oDiamondFeed.userIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (oDiamondFeed.feedType != null) {
                jsonGenerator.writeFieldName("feedType");
                ODiamondFeedType.JSON_ADAPTER.serialize(oDiamondFeed.feedType, jsonGenerator, true);
            }
            String str = oDiamondFeed.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
            String str2 = oDiamondFeed.subText;
            if (str2 != null) {
                jsonGenerator.writeStringField("subText", str2);
            }
            String str3 = oDiamondFeed.highLight;
            if (str3 != null) {
                jsonGenerator.writeStringField("highLight", str3);
            }
            if (oDiamondFeed.latestVisitor != null) {
                jsonGenerator.writeFieldName(ODiamondFeedType.latestVisitor);
                ODiamondFeedLatestVisitor.JSON_ADAPTER.serialize(oDiamondFeed.latestVisitor, jsonGenerator, true);
            }
            if (oDiamondFeed.instantChat != null) {
                jsonGenerator.writeFieldName("instantChat");
                ODiamondFeedInstantChat.JSON_ADAPTER.serialize(oDiamondFeed.instantChat, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ODiamondFeed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ODiamondFeed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35725a(String str) {
        return str;
    }

    public static ODiamondFeed new_() {
        ODiamondFeed oDiamondFeed = new ODiamondFeed();
        oDiamondFeed.nullCheck();
        return oDiamondFeed;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ODiamondFeed mo223809clone() {
        ODiamondFeed oDiamondFeed = new ODiamondFeed();
        oDiamondFeed.redDot = this.redDot;
        List<String> list = this.userIds;
        if (list != null) {
            oDiamondFeed.userIds = ValueObject.util_map(list, new w9j() { // from class: l.xv40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ODiamondFeed.m35725a((String) obj);
                }
            });
        }
        oDiamondFeed.feedType = this.feedType;
        oDiamondFeed.text = this.text;
        oDiamondFeed.subText = this.subText;
        oDiamondFeed.highLight = this.highLight;
        ODiamondFeedLatestVisitor oDiamondFeedLatestVisitor = this.latestVisitor;
        if (oDiamondFeedLatestVisitor != null) {
            oDiamondFeed.latestVisitor = oDiamondFeedLatestVisitor.mo223809clone();
        }
        ODiamondFeedInstantChat oDiamondFeedInstantChat = this.instantChat;
        if (oDiamondFeedInstantChat != null) {
            oDiamondFeed.instantChat = oDiamondFeedInstantChat.mo223809clone();
        }
        return oDiamondFeed;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ODiamondFeed)) {
            return false;
        }
        ODiamondFeed oDiamondFeed = (ODiamondFeed) obj;
        return this.redDot == oDiamondFeed.redDot && ValueObject.util_equals(this.userIds, oDiamondFeed.userIds) && ValueObject.util_equals(this.feedType, oDiamondFeed.feedType) && ValueObject.util_equals(this.text, oDiamondFeed.text) && ValueObject.util_equals(this.subText, oDiamondFeed.subText) && ValueObject.util_equals(this.highLight, oDiamondFeed.highLight) && ValueObject.util_equals(this.latestVisitor, oDiamondFeed.latestVisitor) && ValueObject.util_equals(this.instantChat, oDiamondFeed.instantChat);
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
        int i2 = ((i * 41) + (this.redDot ? 1231 : 1237)) * 41;
        List<String> list = this.userIds;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        ODiamondFeedType oDiamondFeedType = this.feedType;
        int iHashCode2 = (iHashCode + (oDiamondFeedType != null ? oDiamondFeedType.hashCode() : 0)) * 41;
        String str = this.text;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subText;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.highLight;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 41;
        ODiamondFeedLatestVisitor oDiamondFeedLatestVisitor = this.latestVisitor;
        int iHashCode6 = (iHashCode5 + (oDiamondFeedLatestVisitor != null ? oDiamondFeedLatestVisitor.hashCode() : 0)) * 41;
        ODiamondFeedInstantChat oDiamondFeedInstantChat = this.instantChat;
        int iHashCode7 = iHashCode6 + (oDiamondFeedInstantChat != null ? oDiamondFeedInstantChat.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userIds == null) {
            this.userIds = new ArrayList();
        }
        if (this.feedType == null) {
            this.feedType = (ODiamondFeedType) ODiamondFeedType.JSON_ADAPTER.defaultEnum();
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.subText == null) {
            this.subText = "";
        }
        if (this.highLight == null) {
            this.highLight = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
