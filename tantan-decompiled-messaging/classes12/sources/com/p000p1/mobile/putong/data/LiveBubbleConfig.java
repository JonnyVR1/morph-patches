package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.LiveBubbleConfig;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p006ss.bytertc.audio.device.router.AudioRouteDeviceManager;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class LiveBubbleConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livebubbleconfig";

    @ProtobufIndex(index = 8)
    public int bubbleDisappear;

    @NonNull
    @ProtobufIndex(index = 6)
    public String bubbleEndColor;

    @ProtobufIndex(index = 9)
    public int bubbleEveryDayShowMaxCount;

    @ProtobufIndex(index = 7)
    public int bubbleShowAfterWatch;

    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP)
    public int bubbleShowDisappearDays;

    @ProtobufIndex(index = 15)
    public int bubbleShowNotMatchedTimes;

    @NonNull
    @ProtobufIndex(index = 5)
    public String bubbleStartColor;

    @NonNull
    @ProtobufIndex(index = 4)
    public String bubbleTextColor;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> bubbleTextList;

    @ProtobufIndex(index = 13)
    public long bubbleTimeInterval;

    @ProtobufIndex(index = 10)
    public int bubbleUserShowMaxCount;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f231id;

    @ProtobufIndex(index = 12)
    public boolean needCheckHasEnterLive;

    @ProtobufIndex(index = 11)
    public boolean needCheckHasEnterSquare;

    @NonNull
    @ProtobufIndex(index = 14)
    public String subType;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<LiveBubbleConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveBubbleConfig>() { // from class: com.p1.mobile.putong.data.LiveBubbleConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveBubbleConfig liveBubbleConfig) {
            String str = liveBubbleConfig.f231id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = liveBubbleConfig.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            List<String> list = liveBubbleConfig.bubbleTextList;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = liveBubbleConfig.bubbleTextColor;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(4, str3);
            }
            String str4 = liveBubbleConfig.bubbleStartColor;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(5, str4);
            }
            String str5 = liveBubbleConfig.bubbleEndColor;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(6, str5);
            }
            int iH = iO + CodedOutputByteBufferNano.h(7, liveBubbleConfig.bubbleShowAfterWatch) + CodedOutputByteBufferNano.h(8, liveBubbleConfig.bubbleDisappear) + CodedOutputByteBufferNano.h(9, liveBubbleConfig.bubbleEveryDayShowMaxCount) + CodedOutputByteBufferNano.h(10, liveBubbleConfig.bubbleUserShowMaxCount) + CodedOutputByteBufferNano.b(11, liveBubbleConfig.needCheckHasEnterSquare) + CodedOutputByteBufferNano.b(12, liveBubbleConfig.needCheckHasEnterLive) + CodedOutputByteBufferNano.j(13, liveBubbleConfig.bubbleTimeInterval);
            String str6 = liveBubbleConfig.subType;
            if (str6 != null) {
                iH += CodedOutputByteBufferNano.o(14, str6);
            }
            int iH2 = iH + CodedOutputByteBufferNano.h(15, liveBubbleConfig.bubbleShowNotMatchedTimes) + CodedOutputByteBufferNano.h(16, liveBubbleConfig.bubbleShowDisappearDays);
            ((MessageNano) liveBubbleConfig).cachedSize = iH2;
            return iH2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveBubbleConfig m18334parse(nb5 nb5Var) throws IOException {
            LiveBubbleConfig liveBubbleConfig = new LiveBubbleConfig();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (liveBubbleConfig.f231id == null) {
                            liveBubbleConfig.f231id = "";
                        }
                        if (liveBubbleConfig.type == null) {
                            liveBubbleConfig.type = "";
                        }
                        if (liveBubbleConfig.bubbleTextList == null) {
                            liveBubbleConfig.bubbleTextList = new ArrayList();
                        }
                        if (liveBubbleConfig.bubbleTextColor == null) {
                            liveBubbleConfig.bubbleTextColor = "";
                        }
                        if (liveBubbleConfig.bubbleStartColor == null) {
                            liveBubbleConfig.bubbleStartColor = "";
                        }
                        if (liveBubbleConfig.bubbleEndColor == null) {
                            liveBubbleConfig.bubbleEndColor = "";
                        }
                        if (liveBubbleConfig.subType == null) {
                            liveBubbleConfig.subType = "";
                        }
                        break;
                    case 10:
                        liveBubbleConfig.f231id = nb5Var.s();
                        continue;
                    case 18:
                        liveBubbleConfig.type = nb5Var.s();
                        continue;
                    case 26:
                        liveBubbleConfig.bubbleTextList = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 34:
                        liveBubbleConfig.bubbleTextColor = nb5Var.s();
                        continue;
                    case 42:
                        liveBubbleConfig.bubbleStartColor = nb5Var.s();
                        continue;
                    case 50:
                        liveBubbleConfig.bubbleEndColor = nb5Var.s();
                        continue;
                    case 56:
                        liveBubbleConfig.bubbleShowAfterWatch = nb5Var.j();
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_SCO /* 64 */:
                        liveBubbleConfig.bubbleDisappear = nb5Var.j();
                        continue;
                    case 72:
                        liveBubbleConfig.bubbleEveryDayShowMaxCount = nb5Var.j();
                        continue;
                    case 80:
                        liveBubbleConfig.bubbleUserShowMaxCount = nb5Var.j();
                        continue;
                    case 88:
                        liveBubbleConfig.needCheckHasEnterSquare = nb5Var.g();
                        continue;
                    case 96:
                        liveBubbleConfig.needCheckHasEnterLive = nb5Var.g();
                        continue;
                    case 104:
                        liveBubbleConfig.bubbleTimeInterval = nb5Var.k();
                        continue;
                    case 114:
                        liveBubbleConfig.subType = nb5Var.s();
                        continue;
                    case 120:
                        liveBubbleConfig.bubbleShowNotMatchedTimes = nb5Var.j();
                        continue;
                    case 128:
                        liveBubbleConfig.bubbleShowDisappearDays = nb5Var.j();
                        continue;
                    default:
                        if (liveBubbleConfig.f231id == null) {
                            liveBubbleConfig.f231id = "";
                        }
                        if (liveBubbleConfig.type == null) {
                            liveBubbleConfig.type = "";
                        }
                        if (liveBubbleConfig.bubbleTextList == null) {
                            liveBubbleConfig.bubbleTextList = new ArrayList();
                        }
                        if (liveBubbleConfig.bubbleTextColor == null) {
                            liveBubbleConfig.bubbleTextColor = "";
                        }
                        if (liveBubbleConfig.bubbleStartColor == null) {
                            liveBubbleConfig.bubbleStartColor = "";
                        }
                        if (liveBubbleConfig.bubbleEndColor == null) {
                            liveBubbleConfig.bubbleEndColor = "";
                        }
                        if (liveBubbleConfig.subType == null) {
                            liveBubbleConfig.subType = "";
                            return liveBubbleConfig;
                        }
                        break;
                }
            }
            return liveBubbleConfig;
        }

        public void serialize(LiveBubbleConfig liveBubbleConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveBubbleConfig.f231id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = liveBubbleConfig.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            List<String> list = liveBubbleConfig.bubbleTextList;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = liveBubbleConfig.bubbleTextColor;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            String str4 = liveBubbleConfig.bubbleStartColor;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
            String str5 = liveBubbleConfig.bubbleEndColor;
            if (str5 != null) {
                codedOutputByteBufferNano.R(6, str5);
            }
            codedOutputByteBufferNano.G(7, liveBubbleConfig.bubbleShowAfterWatch);
            codedOutputByteBufferNano.G(8, liveBubbleConfig.bubbleDisappear);
            codedOutputByteBufferNano.G(9, liveBubbleConfig.bubbleEveryDayShowMaxCount);
            codedOutputByteBufferNano.G(10, liveBubbleConfig.bubbleUserShowMaxCount);
            codedOutputByteBufferNano.A(11, liveBubbleConfig.needCheckHasEnterSquare);
            codedOutputByteBufferNano.A(12, liveBubbleConfig.needCheckHasEnterLive);
            codedOutputByteBufferNano.I(13, liveBubbleConfig.bubbleTimeInterval);
            String str6 = liveBubbleConfig.subType;
            if (str6 != null) {
                codedOutputByteBufferNano.R(14, str6);
            }
            codedOutputByteBufferNano.G(15, liveBubbleConfig.bubbleShowNotMatchedTimes);
            codedOutputByteBufferNano.G(16, liveBubbleConfig.bubbleShowDisappearDays);
        }
    };
    public static JsonAdapter<LiveBubbleConfig> JSON_ADAPTER = new ObjectJsonAdapter<LiveBubbleConfig>() { // from class: com.p1.mobile.putong.data.LiveBubbleConfig.2
        public Class getDataClass() {
            return LiveBubbleConfig.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LiveBubbleConfig mo17830newInstance() {
            return new LiveBubbleConfig();
        }

        public boolean parseField(LiveBubbleConfig liveBubbleConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "bubbleTimeInterval":
                    liveBubbleConfig.bubbleTimeInterval = jsonParser.getValueAsLong();
                    return true;
                case "needCheckHasEnterLive":
                    liveBubbleConfig.needCheckHasEnterLive = jsonParser.getValueAsBoolean();
                    return true;
                case "subType":
                    liveBubbleConfig.subType = jsonParser.getValueAsString();
                    return true;
                case "bubbleShowNotMatchedTimes":
                    liveBubbleConfig.bubbleShowNotMatchedTimes = jsonParser.getValueAsInt();
                    return true;
                case "bubbleTextList":
                    liveBubbleConfig.bubbleTextList = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "bubbleShowAfterWatch":
                    liveBubbleConfig.bubbleShowAfterWatch = jsonParser.getValueAsInt();
                    return true;
                case "bubbleUserShowMaxCount":
                    liveBubbleConfig.bubbleUserShowMaxCount = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    liveBubbleConfig.f231id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    liveBubbleConfig.type = jsonParser.getValueAsString();
                    return true;
                case "bubbleEveryDayShowMaxCount":
                    liveBubbleConfig.bubbleEveryDayShowMaxCount = jsonParser.getValueAsInt();
                    return true;
                case "bubbleShowDisappearDays":
                    liveBubbleConfig.bubbleShowDisappearDays = jsonParser.getValueAsInt();
                    return true;
                case "bubbleStartColor":
                    liveBubbleConfig.bubbleStartColor = jsonParser.getValueAsString();
                    return true;
                case "bubbleTextColor":
                    liveBubbleConfig.bubbleTextColor = jsonParser.getValueAsString();
                    return true;
                case "bubbleEndColor":
                    liveBubbleConfig.bubbleEndColor = jsonParser.getValueAsString();
                    return true;
                case "needCheckHasEnterSquare":
                    liveBubbleConfig.needCheckHasEnterSquare = jsonParser.getValueAsBoolean();
                    return true;
                case "bubbleDisappear":
                    liveBubbleConfig.bubbleDisappear = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveBubbleConfig liveBubbleConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "bubbleTimeInterval":
                case "needCheckHasEnterLive":
                case "subType":
                case "bubbleShowNotMatchedTimes":
                case "bubbleTextList":
                case "bubbleShowAfterWatch":
                case "bubbleUserShowMaxCount":
                    return true;
                case "id":
                    return false;
                case "type":
                case "bubbleEveryDayShowMaxCount":
                case "bubbleShowDisappearDays":
                case "bubbleStartColor":
                case "bubbleTextColor":
                case "bubbleEndColor":
                case "needCheckHasEnterSquare":
                case "bubbleDisappear":
                    return true;
                default:
                    return super.parseFieldCheck(liveBubbleConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveBubbleConfig liveBubbleConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = liveBubbleConfig.f231id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = liveBubbleConfig.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            if (liveBubbleConfig.bubbleTextList != null) {
                jsonGenerator.writeFieldName("bubbleTextList");
                JsonAdapter.serializeArray(liveBubbleConfig.bubbleTextList, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str3 = liveBubbleConfig.bubbleTextColor;
            if (str3 != null) {
                jsonGenerator.writeStringField("bubbleTextColor", str3);
            }
            String str4 = liveBubbleConfig.bubbleStartColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("bubbleStartColor", str4);
            }
            String str5 = liveBubbleConfig.bubbleEndColor;
            if (str5 != null) {
                jsonGenerator.writeStringField("bubbleEndColor", str5);
            }
            jsonGenerator.writeNumberField("bubbleShowAfterWatch", liveBubbleConfig.bubbleShowAfterWatch);
            jsonGenerator.writeNumberField("bubbleDisappear", liveBubbleConfig.bubbleDisappear);
            jsonGenerator.writeNumberField("bubbleEveryDayShowMaxCount", liveBubbleConfig.bubbleEveryDayShowMaxCount);
            jsonGenerator.writeNumberField("bubbleUserShowMaxCount", liveBubbleConfig.bubbleUserShowMaxCount);
            jsonGenerator.writeBooleanField("needCheckHasEnterSquare", liveBubbleConfig.needCheckHasEnterSquare);
            jsonGenerator.writeBooleanField("needCheckHasEnterLive", liveBubbleConfig.needCheckHasEnterLive);
            jsonGenerator.writeNumberField("bubbleTimeInterval", liveBubbleConfig.bubbleTimeInterval);
            String str6 = liveBubbleConfig.subType;
            if (str6 != null) {
                jsonGenerator.writeStringField("subType", str6);
            }
            jsonGenerator.writeNumberField("bubbleShowNotMatchedTimes", liveBubbleConfig.bubbleShowNotMatchedTimes);
            jsonGenerator.writeNumberField("bubbleShowDisappearDays", liveBubbleConfig.bubbleShowDisappearDays);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveBubbleConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveBubbleConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m749a(String str) {
        return str;
    }

    public static LiveBubbleConfig new_() {
        LiveBubbleConfig liveBubbleConfig = new LiveBubbleConfig();
        liveBubbleConfig.nullCheck();
        return liveBubbleConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveBubbleConfig m18333clone() {
        LiveBubbleConfig liveBubbleConfig = new LiveBubbleConfig();
        liveBubbleConfig.f231id = this.f231id;
        liveBubbleConfig.type = this.type;
        List<String> list = this.bubbleTextList;
        if (list != null) {
            liveBubbleConfig.bubbleTextList = ValueObject.util_map(list, new w9j() { // from class: l.czr
                public final Object call(Object obj) {
                    return LiveBubbleConfig.m749a((String) obj);
                }
            });
        }
        liveBubbleConfig.bubbleTextColor = this.bubbleTextColor;
        liveBubbleConfig.bubbleStartColor = this.bubbleStartColor;
        liveBubbleConfig.bubbleEndColor = this.bubbleEndColor;
        liveBubbleConfig.bubbleShowAfterWatch = this.bubbleShowAfterWatch;
        liveBubbleConfig.bubbleDisappear = this.bubbleDisappear;
        liveBubbleConfig.bubbleEveryDayShowMaxCount = this.bubbleEveryDayShowMaxCount;
        liveBubbleConfig.bubbleUserShowMaxCount = this.bubbleUserShowMaxCount;
        liveBubbleConfig.needCheckHasEnterSquare = this.needCheckHasEnterSquare;
        liveBubbleConfig.needCheckHasEnterLive = this.needCheckHasEnterLive;
        liveBubbleConfig.bubbleTimeInterval = this.bubbleTimeInterval;
        liveBubbleConfig.subType = this.subType;
        liveBubbleConfig.bubbleShowNotMatchedTimes = this.bubbleShowNotMatchedTimes;
        liveBubbleConfig.bubbleShowDisappearDays = this.bubbleShowDisappearDays;
        return liveBubbleConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveBubbleConfig)) {
            return false;
        }
        LiveBubbleConfig liveBubbleConfig = (LiveBubbleConfig) obj;
        return ValueObject.util_equals(this.f231id, liveBubbleConfig.f231id) && ValueObject.util_equals(this.type, liveBubbleConfig.type) && ValueObject.util_equals(this.bubbleTextList, liveBubbleConfig.bubbleTextList) && ValueObject.util_equals(this.bubbleTextColor, liveBubbleConfig.bubbleTextColor) && ValueObject.util_equals(this.bubbleStartColor, liveBubbleConfig.bubbleStartColor) && ValueObject.util_equals(this.bubbleEndColor, liveBubbleConfig.bubbleEndColor) && this.bubbleShowAfterWatch == liveBubbleConfig.bubbleShowAfterWatch && this.bubbleDisappear == liveBubbleConfig.bubbleDisappear && this.bubbleEveryDayShowMaxCount == liveBubbleConfig.bubbleEveryDayShowMaxCount && this.bubbleUserShowMaxCount == liveBubbleConfig.bubbleUserShowMaxCount && this.needCheckHasEnterSquare == liveBubbleConfig.needCheckHasEnterSquare && this.needCheckHasEnterLive == liveBubbleConfig.needCheckHasEnterLive && this.bubbleTimeInterval == liveBubbleConfig.bubbleTimeInterval && ValueObject.util_equals(this.subType, liveBubbleConfig.subType) && this.bubbleShowNotMatchedTimes == liveBubbleConfig.bubbleShowNotMatchedTimes && this.bubbleShowDisappearDays == liveBubbleConfig.bubbleShowDisappearDays;
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
        String str = this.f231id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.bubbleTextList;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.bubbleTextColor;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.bubbleStartColor;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.bubbleEndColor;
        int iHashCode6 = (((((((((((((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41) + this.bubbleShowAfterWatch) * 41) + this.bubbleDisappear) * 41) + this.bubbleEveryDayShowMaxCount) * 41) + this.bubbleUserShowMaxCount) * 41) + (this.needCheckHasEnterSquare ? 1231 : 1237)) * 41) + (this.needCheckHasEnterLive ? 1231 : 1237)) * 41;
        long j = this.bubbleTimeInterval;
        int i3 = (iHashCode6 + ((int) (j ^ (j >>> 32)))) * 41;
        String str6 = this.subType;
        int iHashCode7 = ((((i3 + (str6 != null ? str6.hashCode() : 0)) * 41) + this.bubbleShowNotMatchedTimes) * 41) + this.bubbleShowDisappearDays;
        ((ValueObject) this).hashCode = iHashCode7;
        return iHashCode7;
    }

    public void nullCheck() {
        if (this.f231id == null) {
            this.f231id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.bubbleTextList == null) {
            this.bubbleTextList = new ArrayList();
        }
        if (this.bubbleTextColor == null) {
            this.bubbleTextColor = "";
        }
        if (this.bubbleStartColor == null) {
            this.bubbleStartColor = "";
        }
        if (this.bubbleEndColor == null) {
            this.bubbleEndColor = "";
        }
        if (this.subType == null) {
            this.subType = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
