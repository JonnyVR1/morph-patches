package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.Converter;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.RawFeed;
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
public class RawFeed extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "rawfeed";

    @NonNull
    @ProtobufIndex(index = 54)
    public String activityName;

    @ProtobufIndex(index = 53)
    public boolean canGreeting;

    @NonNull
    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_SCO)
    public String city;

    @NonNull
    @ProtobufIndex(index = 69)
    public List<String> duplicateImgs;

    @Nullable
    public MomentFeedsExtra extra;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 51)
    public String f704id;

    @NonNull
    @ProtobufIndex(index = 62)
    public InteractionReason interaction;

    @ProtobufIndex(index = 63)
    public boolean isRoamHighlight;

    @NonNull
    @ProtobufIndex(index = 55)
    public String locationName;

    @NonNull
    @ProtobufIndex(index = 70)
    public MomentExpose momentExpose;

    @NonNull
    @ProtobufIndex(index = 61)
    public String recommendReason;

    @NonNull
    @ProtobufIndex(index = 67)
    public String recommendReasonBackgroundColor;

    @NonNull
    @ProtobufIndex(index = 68)
    public String recommendReasonFontColor;

    @NonNull
    @ProtobufIndex(index = 66)
    public String recommendReasonIcon;
    public double recommendTime;

    @NonNull
    @ProtobufIndex(index = 57)
    public String relationshipIconUrl;

    @NonNull
    @ProtobufIndex(index = 56)
    public String relationshipName;

    @NonNull
    @ProtobufIndex(index = 59)
    public String relationshipType;

    @ProtobufIndex(index = 65)
    public boolean showLikeSplitLine;

    @ProtobufIndex(index = 58)
    public boolean showUnreadSplitLine;

    @NonNull
    @ProtobufIndex(index = 60)
    public List<BubbleInfo> states;

    @NonNull
    @ProtobufIndex(index = 52)
    public String type;
    public static ProtobufAdapter<RawFeed> PROTOBUF_ADAPTER = new MessageNanoAdapter<RawFeed>() { // from class: com.p1.mobile.putong.feed.data.RawFeed.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RawFeed rawFeed) {
            String str = rawFeed.f704id;
            int iO = str != null ? CodedOutputByteBufferNano.o(51, str) : 0;
            String str2 = rawFeed.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(52, str2);
            }
            int iB = iO + CodedOutputByteBufferNano.b(53, rawFeed.canGreeting);
            String str3 = rawFeed.activityName;
            if (str3 != null) {
                iB += CodedOutputByteBufferNano.o(54, str3);
            }
            String str4 = rawFeed.locationName;
            if (str4 != null) {
                iB += CodedOutputByteBufferNano.o(55, str4);
            }
            String str5 = rawFeed.relationshipName;
            if (str5 != null) {
                iB += CodedOutputByteBufferNano.o(56, str5);
            }
            String str6 = rawFeed.relationshipIconUrl;
            if (str6 != null) {
                iB += CodedOutputByteBufferNano.o(57, str6);
            }
            int iB2 = iB + CodedOutputByteBufferNano.b(58, rawFeed.showUnreadSplitLine);
            String str7 = rawFeed.relationshipType;
            if (str7 != null) {
                iB2 += CodedOutputByteBufferNano.o(59, str7);
            }
            List<BubbleInfo> list = rawFeed.states;
            if (list != null) {
                iB2 += CodedOutputByteBufferNano.l(60, list, BubbleInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str8 = rawFeed.recommendReason;
            if (str8 != null) {
                iB2 += CodedOutputByteBufferNano.o(61, str8);
            }
            InteractionReason interactionReason = rawFeed.interaction;
            if (interactionReason != null) {
                iB2 += CodedOutputByteBufferNano.l(62, interactionReason, InteractionReason.PROTOBUF_ADAPTER);
            }
            int iB3 = iB2 + CodedOutputByteBufferNano.b(63, rawFeed.isRoamHighlight);
            String str9 = rawFeed.city;
            if (str9 != null) {
                iB3 += CodedOutputByteBufferNano.o(64, str9);
            }
            int iB4 = iB3 + CodedOutputByteBufferNano.b(65, rawFeed.showLikeSplitLine);
            String str10 = rawFeed.recommendReasonIcon;
            if (str10 != null) {
                iB4 += CodedOutputByteBufferNano.o(66, str10);
            }
            String str11 = rawFeed.recommendReasonBackgroundColor;
            if (str11 != null) {
                iB4 += CodedOutputByteBufferNano.o(67, str11);
            }
            String str12 = rawFeed.recommendReasonFontColor;
            if (str12 != null) {
                iB4 += CodedOutputByteBufferNano.o(68, str12);
            }
            List<String> list2 = rawFeed.duplicateImgs;
            if (list2 != null) {
                iB4 += CodedOutputByteBufferNano.l(69, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            MomentExpose momentExpose = rawFeed.momentExpose;
            if (momentExpose != null) {
                iB4 += CodedOutputByteBufferNano.l(70, momentExpose, MomentExpose.PROTOBUF_ADAPTER);
            }
            ((MessageNano) rawFeed).cachedSize = iB4;
            return iB4;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RawFeed m19744parse(nb5 nb5Var) throws IOException {
            RawFeed rawFeed = new RawFeed();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (rawFeed.f704id == null) {
                            rawFeed.f704id = "";
                        }
                        if (rawFeed.type == null) {
                            rawFeed.type = "";
                        }
                        if (rawFeed.activityName == null) {
                            rawFeed.activityName = "";
                        }
                        if (rawFeed.locationName == null) {
                            rawFeed.locationName = "";
                        }
                        if (rawFeed.relationshipName == null) {
                            rawFeed.relationshipName = "";
                        }
                        if (rawFeed.relationshipIconUrl == null) {
                            rawFeed.relationshipIconUrl = "";
                        }
                        if (rawFeed.relationshipType == null) {
                            rawFeed.relationshipType = "";
                        }
                        if (rawFeed.states == null) {
                            rawFeed.states = new ArrayList();
                        }
                        if (rawFeed.recommendReason == null) {
                            rawFeed.recommendReason = "";
                        }
                        if (rawFeed.interaction == null) {
                            rawFeed.interaction = InteractionReason.new_();
                        }
                        if (rawFeed.city == null) {
                            rawFeed.city = "";
                        }
                        if (rawFeed.recommendReasonIcon == null) {
                            rawFeed.recommendReasonIcon = "";
                        }
                        if (rawFeed.recommendReasonBackgroundColor == null) {
                            rawFeed.recommendReasonBackgroundColor = "";
                        }
                        if (rawFeed.recommendReasonFontColor == null) {
                            rawFeed.recommendReasonFontColor = "";
                        }
                        if (rawFeed.duplicateImgs == null) {
                            rawFeed.duplicateImgs = new ArrayList();
                        }
                        if (rawFeed.momentExpose == null) {
                            rawFeed.momentExpose = MomentExpose.new_();
                        }
                        break;
                    case 410:
                        rawFeed.f704id = nb5Var.s();
                        continue;
                    case 418:
                        rawFeed.type = nb5Var.s();
                        continue;
                    case 424:
                        rawFeed.canGreeting = nb5Var.g();
                        continue;
                    case 434:
                        rawFeed.activityName = nb5Var.s();
                        continue;
                    case 442:
                        rawFeed.locationName = nb5Var.s();
                        continue;
                    case 450:
                        rawFeed.relationshipName = nb5Var.s();
                        continue;
                    case 458:
                        rawFeed.relationshipIconUrl = nb5Var.s();
                        continue;
                    case 464:
                        rawFeed.showUnreadSplitLine = nb5Var.g();
                        continue;
                    case 474:
                        rawFeed.relationshipType = nb5Var.s();
                        continue;
                    case 482:
                        rawFeed.states = (List) nb5Var.l(BubbleInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 490:
                        rawFeed.recommendReason = nb5Var.s();
                        continue;
                    case 498:
                        rawFeed.interaction = (InteractionReason) nb5Var.l(InteractionReason.PROTOBUF_ADAPTER);
                        continue;
                    case 504:
                        rawFeed.isRoamHighlight = nb5Var.g();
                        continue;
                    case 514:
                        rawFeed.city = nb5Var.s();
                        continue;
                    case 520:
                        rawFeed.showLikeSplitLine = nb5Var.g();
                        continue;
                    case 530:
                        rawFeed.recommendReasonIcon = nb5Var.s();
                        continue;
                    case 538:
                        rawFeed.recommendReasonBackgroundColor = nb5Var.s();
                        continue;
                    case 546:
                        rawFeed.recommendReasonFontColor = nb5Var.s();
                        continue;
                    case 554:
                        rawFeed.duplicateImgs = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 562:
                        rawFeed.momentExpose = (MomentExpose) nb5Var.l(MomentExpose.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (rawFeed.f704id == null) {
                            rawFeed.f704id = "";
                        }
                        if (rawFeed.type == null) {
                            rawFeed.type = "";
                        }
                        if (rawFeed.activityName == null) {
                            rawFeed.activityName = "";
                        }
                        if (rawFeed.locationName == null) {
                            rawFeed.locationName = "";
                        }
                        if (rawFeed.relationshipName == null) {
                            rawFeed.relationshipName = "";
                        }
                        if (rawFeed.relationshipIconUrl == null) {
                            rawFeed.relationshipIconUrl = "";
                        }
                        if (rawFeed.relationshipType == null) {
                            rawFeed.relationshipType = "";
                        }
                        if (rawFeed.states == null) {
                            rawFeed.states = new ArrayList();
                        }
                        if (rawFeed.recommendReason == null) {
                            rawFeed.recommendReason = "";
                        }
                        if (rawFeed.interaction == null) {
                            rawFeed.interaction = InteractionReason.new_();
                        }
                        if (rawFeed.city == null) {
                            rawFeed.city = "";
                        }
                        if (rawFeed.recommendReasonIcon == null) {
                            rawFeed.recommendReasonIcon = "";
                        }
                        if (rawFeed.recommendReasonBackgroundColor == null) {
                            rawFeed.recommendReasonBackgroundColor = "";
                        }
                        if (rawFeed.recommendReasonFontColor == null) {
                            rawFeed.recommendReasonFontColor = "";
                        }
                        if (rawFeed.duplicateImgs == null) {
                            rawFeed.duplicateImgs = new ArrayList();
                        }
                        if (rawFeed.momentExpose == null) {
                            rawFeed.momentExpose = MomentExpose.new_();
                            return rawFeed;
                        }
                        break;
                }
            }
            return rawFeed;
        }

        public void serialize(RawFeed rawFeed, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = rawFeed.f704id;
            if (str != null) {
                codedOutputByteBufferNano.R(51, str);
            }
            String str2 = rawFeed.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(52, str2);
            }
            codedOutputByteBufferNano.A(53, rawFeed.canGreeting);
            String str3 = rawFeed.activityName;
            if (str3 != null) {
                codedOutputByteBufferNano.R(54, str3);
            }
            String str4 = rawFeed.locationName;
            if (str4 != null) {
                codedOutputByteBufferNano.R(55, str4);
            }
            String str5 = rawFeed.relationshipName;
            if (str5 != null) {
                codedOutputByteBufferNano.R(56, str5);
            }
            String str6 = rawFeed.relationshipIconUrl;
            if (str6 != null) {
                codedOutputByteBufferNano.R(57, str6);
            }
            codedOutputByteBufferNano.A(58, rawFeed.showUnreadSplitLine);
            String str7 = rawFeed.relationshipType;
            if (str7 != null) {
                codedOutputByteBufferNano.R(59, str7);
            }
            List<BubbleInfo> list = rawFeed.states;
            if (list != null) {
                codedOutputByteBufferNano.K(60, list, BubbleInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str8 = rawFeed.recommendReason;
            if (str8 != null) {
                codedOutputByteBufferNano.R(61, str8);
            }
            InteractionReason interactionReason = rawFeed.interaction;
            if (interactionReason != null) {
                codedOutputByteBufferNano.K(62, interactionReason, InteractionReason.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(63, rawFeed.isRoamHighlight);
            String str9 = rawFeed.city;
            if (str9 != null) {
                codedOutputByteBufferNano.R(64, str9);
            }
            codedOutputByteBufferNano.A(65, rawFeed.showLikeSplitLine);
            String str10 = rawFeed.recommendReasonIcon;
            if (str10 != null) {
                codedOutputByteBufferNano.R(66, str10);
            }
            String str11 = rawFeed.recommendReasonBackgroundColor;
            if (str11 != null) {
                codedOutputByteBufferNano.R(67, str11);
            }
            String str12 = rawFeed.recommendReasonFontColor;
            if (str12 != null) {
                codedOutputByteBufferNano.R(68, str12);
            }
            List<String> list2 = rawFeed.duplicateImgs;
            if (list2 != null) {
                codedOutputByteBufferNano.K(69, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            MomentExpose momentExpose = rawFeed.momentExpose;
            if (momentExpose != null) {
                codedOutputByteBufferNano.K(70, momentExpose, MomentExpose.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<RawFeed> JSON_ADAPTER = new ObjectJsonAdapter<RawFeed>() { // from class: com.p1.mobile.putong.feed.data.RawFeed.2
        public Class getDataClass() {
            return RawFeed.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public RawFeed mo17830newInstance() {
            return new RawFeed();
        }

        public boolean parseField(RawFeed rawFeed, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "showUnreadSplitLine":
                    rawFeed.showUnreadSplitLine = jsonParser.getValueAsBoolean();
                    return true;
                case "relationshipName":
                    rawFeed.relationshipName = jsonParser.getValueAsString();
                    return true;
                case "relationshipType":
                    rawFeed.relationshipType = jsonParser.getValueAsString();
                    return true;
                case "duplicateImgs":
                    rawFeed.duplicateImgs = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "recommendTime":
                    rawFeed.recommendTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "recommendReasonIcon":
                    rawFeed.recommendReasonIcon = jsonParser.getValueAsString();
                    return true;
                case "isRoamHighlight":
                    rawFeed.isRoamHighlight = jsonParser.getValueAsBoolean();
                    return true;
                case "states":
                    rawFeed.states = JsonAdapter.parseArray(jsonParser, BubbleInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "recommendReasonFontColor":
                    rawFeed.recommendReasonFontColor = jsonParser.getValueAsString();
                    return true;
                case "relationshipIconUrl":
                    rawFeed.relationshipIconUrl = jsonParser.getValueAsString();
                    return true;
                case "canGreeting":
                    rawFeed.canGreeting = jsonParser.getValueAsBoolean();
                    return true;
                case "showLikeSplitLine":
                    rawFeed.showLikeSplitLine = jsonParser.getValueAsBoolean();
                    return true;
                case "locationName":
                    rawFeed.locationName = jsonParser.getValueAsString();
                    return true;
                case "id":
                    rawFeed.f704id = jsonParser.getValueAsString();
                    return false;
                case "city":
                    rawFeed.city = jsonParser.getValueAsString();
                    return true;
                case "type":
                    rawFeed.type = jsonParser.getValueAsString();
                    return true;
                case "extra":
                    rawFeed.extra = (MomentFeedsExtra) MomentFeedsExtra.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "recommendReasonBackgroundColor":
                    rawFeed.recommendReasonBackgroundColor = jsonParser.getValueAsString();
                    return true;
                case "activityName":
                    rawFeed.activityName = jsonParser.getValueAsString();
                    return true;
                case "interaction":
                    rawFeed.interaction = (InteractionReason) InteractionReason.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "momentExpose":
                    rawFeed.momentExpose = (MomentExpose) MomentExpose.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "recommendReason":
                    rawFeed.recommendReason = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RawFeed rawFeed, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "showUnreadSplitLine":
                case "relationshipName":
                case "relationshipType":
                case "duplicateImgs":
                case "recommendTime":
                case "recommendReasonIcon":
                case "isRoamHighlight":
                case "states":
                case "recommendReasonFontColor":
                case "relationshipIconUrl":
                case "canGreeting":
                case "showLikeSplitLine":
                case "locationName":
                    return true;
                case "id":
                    return false;
                case "city":
                case "type":
                case "extra":
                case "recommendReasonBackgroundColor":
                case "activityName":
                case "interaction":
                case "momentExpose":
                case "recommendReason":
                    return true;
                default:
                    return super.parseFieldCheck(rawFeed, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RawFeed rawFeed, JsonGenerator jsonGenerator) throws IOException {
            String str = rawFeed.f704id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = rawFeed.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            jsonGenerator.writeBooleanField("canGreeting", rawFeed.canGreeting);
            if (rawFeed.extra != null) {
                jsonGenerator.writeFieldName("extra");
                MomentFeedsExtra.JSON_ADAPTER.serialize(rawFeed.extra, jsonGenerator, true);
            }
            jsonGenerator.writeFieldName("recommendTime");
            Converter.API_TIME.serialize(Double.valueOf(rawFeed.recommendTime), jsonGenerator, true);
            String str3 = rawFeed.activityName;
            if (str3 != null) {
                jsonGenerator.writeStringField("activityName", str3);
            }
            String str4 = rawFeed.locationName;
            if (str4 != null) {
                jsonGenerator.writeStringField("locationName", str4);
            }
            String str5 = rawFeed.relationshipName;
            if (str5 != null) {
                jsonGenerator.writeStringField("relationshipName", str5);
            }
            String str6 = rawFeed.relationshipIconUrl;
            if (str6 != null) {
                jsonGenerator.writeStringField("relationshipIconUrl", str6);
            }
            jsonGenerator.writeBooleanField("showUnreadSplitLine", rawFeed.showUnreadSplitLine);
            String str7 = rawFeed.relationshipType;
            if (str7 != null) {
                jsonGenerator.writeStringField("relationshipType", str7);
            }
            if (rawFeed.states != null) {
                jsonGenerator.writeFieldName("states");
                JsonAdapter.serializeArray(rawFeed.states, jsonGenerator, BubbleInfo.JSON_ADAPTER);
            }
            String str8 = rawFeed.recommendReason;
            if (str8 != null) {
                jsonGenerator.writeStringField("recommendReason", str8);
            }
            if (rawFeed.interaction != null) {
                jsonGenerator.writeFieldName("interaction");
                InteractionReason.JSON_ADAPTER.serialize(rawFeed.interaction, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("isRoamHighlight", rawFeed.isRoamHighlight);
            String str9 = rawFeed.city;
            if (str9 != null) {
                jsonGenerator.writeStringField("city", str9);
            }
            jsonGenerator.writeBooleanField("showLikeSplitLine", rawFeed.showLikeSplitLine);
            String str10 = rawFeed.recommendReasonIcon;
            if (str10 != null) {
                jsonGenerator.writeStringField("recommendReasonIcon", str10);
            }
            String str11 = rawFeed.recommendReasonBackgroundColor;
            if (str11 != null) {
                jsonGenerator.writeStringField("recommendReasonBackgroundColor", str11);
            }
            String str12 = rawFeed.recommendReasonFontColor;
            if (str12 != null) {
                jsonGenerator.writeStringField("recommendReasonFontColor", str12);
            }
            if (rawFeed.duplicateImgs != null) {
                jsonGenerator.writeFieldName("duplicateImgs");
                JsonAdapter.serializeArray(rawFeed.duplicateImgs, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (rawFeed.momentExpose != null) {
                jsonGenerator.writeFieldName("momentExpose");
                MomentExpose.JSON_ADAPTER.serialize(rawFeed.momentExpose, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RawFeed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RawFeed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m1818a(String str) {
        return str;
    }

    public static RawFeed new_() {
        RawFeed rawFeed = new RawFeed();
        rawFeed.nullCheck();
        return rawFeed;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RawFeed m19743clone() {
        RawFeed rawFeed = new RawFeed();
        rawFeed.f704id = this.f704id;
        rawFeed.type = this.type;
        rawFeed.canGreeting = this.canGreeting;
        MomentFeedsExtra momentFeedsExtra = this.extra;
        if (momentFeedsExtra != null) {
            rawFeed.extra = momentFeedsExtra.m19613clone();
        }
        rawFeed.recommendTime = this.recommendTime;
        rawFeed.activityName = this.activityName;
        rawFeed.locationName = this.locationName;
        rawFeed.relationshipName = this.relationshipName;
        rawFeed.relationshipIconUrl = this.relationshipIconUrl;
        rawFeed.showUnreadSplitLine = this.showUnreadSplitLine;
        rawFeed.relationshipType = this.relationshipType;
        List<BubbleInfo> list = this.states;
        if (list != null) {
            rawFeed.states = ValueObject.util_map(list, new w9j() { // from class: l.edc0
                public final Object call(Object obj) {
                    return ((BubbleInfo) obj).m17783clone();
                }
            });
        }
        rawFeed.recommendReason = this.recommendReason;
        InteractionReason interactionReason = this.interaction;
        if (interactionReason != null) {
            rawFeed.interaction = interactionReason.m19538clone();
        }
        rawFeed.isRoamHighlight = this.isRoamHighlight;
        rawFeed.city = this.city;
        rawFeed.showLikeSplitLine = this.showLikeSplitLine;
        rawFeed.recommendReasonIcon = this.recommendReasonIcon;
        rawFeed.recommendReasonBackgroundColor = this.recommendReasonBackgroundColor;
        rawFeed.recommendReasonFontColor = this.recommendReasonFontColor;
        List<String> list2 = this.duplicateImgs;
        if (list2 != null) {
            rawFeed.duplicateImgs = ValueObject.util_map(list2, new w9j() { // from class: l.fdc0
                public final Object call(Object obj) {
                    return RawFeed.m1818a((String) obj);
                }
            });
        }
        MomentExpose momentExpose = this.momentExpose;
        if (momentExpose != null) {
            rawFeed.momentExpose = momentExpose.m19604clone();
        }
        return rawFeed;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RawFeed)) {
            return false;
        }
        RawFeed rawFeed = (RawFeed) obj;
        return ValueObject.util_equals(this.f704id, rawFeed.f704id) && ValueObject.util_equals(this.type, rawFeed.type) && this.canGreeting == rawFeed.canGreeting && ValueObject.util_equals(this.extra, rawFeed.extra) && this.recommendTime == rawFeed.recommendTime && ValueObject.util_equals(this.activityName, rawFeed.activityName) && ValueObject.util_equals(this.locationName, rawFeed.locationName) && ValueObject.util_equals(this.relationshipName, rawFeed.relationshipName) && ValueObject.util_equals(this.relationshipIconUrl, rawFeed.relationshipIconUrl) && this.showUnreadSplitLine == rawFeed.showUnreadSplitLine && ValueObject.util_equals(this.relationshipType, rawFeed.relationshipType) && ValueObject.util_equals(this.states, rawFeed.states) && ValueObject.util_equals(this.recommendReason, rawFeed.recommendReason) && ValueObject.util_equals(this.interaction, rawFeed.interaction) && this.isRoamHighlight == rawFeed.isRoamHighlight && ValueObject.util_equals(this.city, rawFeed.city) && this.showLikeSplitLine == rawFeed.showLikeSplitLine && ValueObject.util_equals(this.recommendReasonIcon, rawFeed.recommendReasonIcon) && ValueObject.util_equals(this.recommendReasonBackgroundColor, rawFeed.recommendReasonBackgroundColor) && ValueObject.util_equals(this.recommendReasonFontColor, rawFeed.recommendReasonFontColor) && ValueObject.util_equals(this.duplicateImgs, rawFeed.duplicateImgs) && ValueObject.util_equals(this.momentExpose, rawFeed.momentExpose);
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
        String str = this.f704id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.canGreeting ? 1231 : 1237)) * 41;
        MomentFeedsExtra momentFeedsExtra = this.extra;
        int iHashCode3 = momentFeedsExtra != null ? momentFeedsExtra.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.recommendTime);
        int i3 = (((iHashCode2 + iHashCode3) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str3 = this.activityName;
        int iHashCode4 = (i3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.locationName;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.relationshipName;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.relationshipIconUrl;
        int iHashCode7 = (((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41) + (this.showUnreadSplitLine ? 1231 : 1237)) * 41;
        String str7 = this.relationshipType;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 41;
        List<BubbleInfo> list = this.states;
        int iHashCode9 = (iHashCode8 + (list != null ? list.hashCode() : 0)) * 41;
        String str8 = this.recommendReason;
        int iHashCode10 = (iHashCode9 + (str8 != null ? str8.hashCode() : 0)) * 41;
        InteractionReason interactionReason = this.interaction;
        int iHashCode11 = (((iHashCode10 + (interactionReason != null ? interactionReason.hashCode() : 0)) * 41) + (this.isRoamHighlight ? 1231 : 1237)) * 41;
        String str9 = this.city;
        int iHashCode12 = (((iHashCode11 + (str9 != null ? str9.hashCode() : 0)) * 41) + (this.showLikeSplitLine ? 1231 : 1237)) * 41;
        String str10 = this.recommendReasonIcon;
        int iHashCode13 = (iHashCode12 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.recommendReasonBackgroundColor;
        int iHashCode14 = (iHashCode13 + (str11 != null ? str11.hashCode() : 0)) * 41;
        String str12 = this.recommendReasonFontColor;
        int iHashCode15 = (iHashCode14 + (str12 != null ? str12.hashCode() : 0)) * 41;
        List<String> list2 = this.duplicateImgs;
        int iHashCode16 = (iHashCode15 + (list2 != null ? list2.hashCode() : 0)) * 41;
        MomentExpose momentExpose = this.momentExpose;
        int iHashCode17 = iHashCode16 + (momentExpose != null ? momentExpose.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode17;
        return iHashCode17;
    }

    public void nullCheck() {
        if (this.f704id == null) {
            this.f704id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.activityName == null) {
            this.activityName = "";
        }
        if (this.locationName == null) {
            this.locationName = "";
        }
        if (this.relationshipName == null) {
            this.relationshipName = "";
        }
        if (this.relationshipIconUrl == null) {
            this.relationshipIconUrl = "";
        }
        if (this.relationshipType == null) {
            this.relationshipType = "";
        }
        if (this.states == null) {
            this.states = new ArrayList();
        }
        if (this.recommendReason == null) {
            this.recommendReason = "";
        }
        if (this.interaction == null) {
            this.interaction = InteractionReason.new_();
        }
        if (this.city == null) {
            this.city = "";
        }
        if (this.recommendReasonIcon == null) {
            this.recommendReasonIcon = "";
        }
        if (this.recommendReasonBackgroundColor == null) {
            this.recommendReasonBackgroundColor = "";
        }
        if (this.recommendReasonFontColor == null) {
            this.recommendReasonFontColor = "";
        }
        if (this.duplicateImgs == null) {
            this.duplicateImgs = new ArrayList();
        }
        if (this.momentExpose == null) {
            this.momentExpose = MomentExpose.new_();
        }
    }

    public RawFeed subtract(RawFeed rawFeed) {
        RawFeed rawFeed2 = new RawFeed();
        if (!ValueObject.util_equals(this.f704id, rawFeed.f704id)) {
            rawFeed2.f704id = this.f704id;
        }
        if (!ValueObject.util_equals(this.type, rawFeed.type)) {
            rawFeed2.type = this.type;
        }
        if (!ValueObject.util_equals(this.extra, rawFeed.extra)) {
            rawFeed2.extra = this.extra;
        }
        if (!ValueObject.util_equals(this.activityName, rawFeed.activityName)) {
            rawFeed2.activityName = this.activityName;
        }
        if (!ValueObject.util_equals(this.locationName, rawFeed.locationName)) {
            rawFeed2.locationName = this.locationName;
        }
        if (!ValueObject.util_equals(this.relationshipName, rawFeed.relationshipName)) {
            rawFeed2.relationshipName = this.relationshipName;
        }
        if (!ValueObject.util_equals(this.relationshipIconUrl, rawFeed.relationshipIconUrl)) {
            rawFeed2.relationshipIconUrl = this.relationshipIconUrl;
        }
        if (!ValueObject.util_equals(this.relationshipType, rawFeed.relationshipType)) {
            rawFeed2.relationshipType = this.relationshipType;
        }
        if (!ValueObject.util_equals(this.states, rawFeed.states)) {
            rawFeed2.states = this.states;
        }
        if (!ValueObject.util_equals(this.recommendReason, rawFeed.recommendReason)) {
            rawFeed2.recommendReason = this.recommendReason;
        }
        if (!ValueObject.util_equals(this.interaction, rawFeed.interaction)) {
            rawFeed2.interaction = this.interaction;
        }
        if (!ValueObject.util_equals(this.city, rawFeed.city)) {
            rawFeed2.city = this.city;
        }
        if (!ValueObject.util_equals(this.recommendReasonIcon, rawFeed.recommendReasonIcon)) {
            rawFeed2.recommendReasonIcon = this.recommendReasonIcon;
        }
        if (!ValueObject.util_equals(this.recommendReasonBackgroundColor, rawFeed.recommendReasonBackgroundColor)) {
            rawFeed2.recommendReasonBackgroundColor = this.recommendReasonBackgroundColor;
        }
        if (!ValueObject.util_equals(this.recommendReasonFontColor, rawFeed.recommendReasonFontColor)) {
            rawFeed2.recommendReasonFontColor = this.recommendReasonFontColor;
        }
        if (!ValueObject.util_equals(this.duplicateImgs, rawFeed.duplicateImgs)) {
            rawFeed2.duplicateImgs = this.duplicateImgs;
        }
        if (!ValueObject.util_equals(this.momentExpose, rawFeed.momentExpose)) {
            rawFeed2.momentExpose = this.momentExpose;
        }
        if (rawFeed2.equals(new RawFeed())) {
            return null;
        }
        return rawFeed2;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
