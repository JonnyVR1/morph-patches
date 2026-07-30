package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.RankLevel;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.feed.data.RawFeed;
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
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class RawFeed extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "rawfeed";

    @NonNull
    @ProtobufIndex(index = 54)
    public String activityName;

    @ProtobufIndex(index = 53)
    public boolean canGreeting;

    @NonNull
    @ProtobufIndex(index = 64)
    public String city;

    @NonNull
    @ProtobufIndex(index = 69)
    public List<String> duplicateImgs;

    @Nullable
    public MomentFeedsExtra extra;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 51)
    public String f39243id;

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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RawFeed rawFeed) {
            String str = rawFeed.f39243id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(51, str) : 0;
            String str2 = rawFeed.type;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(52, str2);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(53, rawFeed.canGreeting);
            String str3 = rawFeed.activityName;
            if (str3 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(54, str3);
            }
            String str4 = rawFeed.locationName;
            if (str4 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(55, str4);
            }
            String str5 = rawFeed.relationshipName;
            if (str5 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(56, str5);
            }
            String str6 = rawFeed.relationshipIconUrl;
            if (str6 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(57, str6);
            }
            int iM17220b2 = iM17220b + CodedOutputByteBufferNano.m17220b(58, rawFeed.showUnreadSplitLine);
            String str7 = rawFeed.relationshipType;
            if (str7 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17233o(59, str7);
            }
            List<BubbleInfo> list = rawFeed.states;
            if (list != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(60, list, BubbleInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str8 = rawFeed.recommendReason;
            if (str8 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17233o(61, str8);
            }
            InteractionReason interactionReason = rawFeed.interaction;
            if (interactionReason != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(62, interactionReason, InteractionReason.PROTOBUF_ADAPTER);
            }
            int iM17220b3 = iM17220b2 + CodedOutputByteBufferNano.m17220b(63, rawFeed.isRoamHighlight);
            String str9 = rawFeed.city;
            if (str9 != null) {
                iM17220b3 += CodedOutputByteBufferNano.m17233o(64, str9);
            }
            int iM17220b4 = iM17220b3 + CodedOutputByteBufferNano.m17220b(65, rawFeed.showLikeSplitLine);
            String str10 = rawFeed.recommendReasonIcon;
            if (str10 != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17233o(66, str10);
            }
            String str11 = rawFeed.recommendReasonBackgroundColor;
            if (str11 != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17233o(67, str11);
            }
            String str12 = rawFeed.recommendReasonFontColor;
            if (str12 != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17233o(68, str12);
            }
            List<String> list2 = rawFeed.duplicateImgs;
            if (list2 != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17230l(69, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            MomentExpose momentExpose = rawFeed.momentExpose;
            if (momentExpose != null) {
                iM17220b4 += CodedOutputByteBufferNano.m17230l(70, momentExpose, MomentExpose.PROTOBUF_ADAPTER);
            }
            rawFeed.cachedSize = iM17220b4;
            return iM17220b4;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RawFeed parse(nb5 nb5Var) throws IOException {
            RawFeed rawFeed = new RawFeed();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (rawFeed.f39243id == null) {
                            rawFeed.f39243id = "";
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
                        rawFeed.f39243id = nb5Var.m158750s();
                        continue;
                    case 418:
                        rawFeed.type = nb5Var.m158750s();
                        continue;
                    case HttpStatus.FAILED_DEPENDENCY_424 /* 424 */:
                        rawFeed.canGreeting = nb5Var.m158738g();
                        continue;
                    case 434:
                        rawFeed.activityName = nb5Var.m158750s();
                        continue;
                    case 442:
                        rawFeed.locationName = nb5Var.m158750s();
                        continue;
                    case 450:
                        rawFeed.relationshipName = nb5Var.m158750s();
                        continue;
                    case 458:
                        rawFeed.relationshipIconUrl = nb5Var.m158750s();
                        continue;
                    case 464:
                        rawFeed.showUnreadSplitLine = nb5Var.m158738g();
                        continue;
                    case 474:
                        rawFeed.relationshipType = nb5Var.m158750s();
                        continue;
                    case 482:
                        rawFeed.states = (List) nb5Var.m158743l(BubbleInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 490:
                        rawFeed.recommendReason = nb5Var.m158750s();
                        continue;
                    case 498:
                        rawFeed.interaction = (InteractionReason) nb5Var.m158743l(InteractionReason.PROTOBUF_ADAPTER);
                        continue;
                    case HttpStatus.GATEWAY_TIMEOUT_504 /* 504 */:
                        rawFeed.isRoamHighlight = nb5Var.m158738g();
                        continue;
                    case 514:
                        rawFeed.city = nb5Var.m158750s();
                        continue;
                    case 520:
                        rawFeed.showLikeSplitLine = nb5Var.m158738g();
                        continue;
                    case 530:
                        rawFeed.recommendReasonIcon = nb5Var.m158750s();
                        continue;
                    case 538:
                        rawFeed.recommendReasonBackgroundColor = nb5Var.m158750s();
                        continue;
                    case 546:
                        rawFeed.recommendReasonFontColor = nb5Var.m158750s();
                        continue;
                    case 554:
                        rawFeed.duplicateImgs = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 562:
                        rawFeed.momentExpose = (MomentExpose) nb5Var.m158743l(MomentExpose.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (rawFeed.f39243id == null) {
                            rawFeed.f39243id = "";
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RawFeed rawFeed, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = rawFeed.f39243id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(51, str);
            }
            String str2 = rawFeed.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(52, str2);
            }
            codedOutputByteBufferNano.m17244A(53, rawFeed.canGreeting);
            String str3 = rawFeed.activityName;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(54, str3);
            }
            String str4 = rawFeed.locationName;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(55, str4);
            }
            String str5 = rawFeed.relationshipName;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(56, str5);
            }
            String str6 = rawFeed.relationshipIconUrl;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(57, str6);
            }
            codedOutputByteBufferNano.m17244A(58, rawFeed.showUnreadSplitLine);
            String str7 = rawFeed.relationshipType;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(59, str7);
            }
            List<BubbleInfo> list = rawFeed.states;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(60, list, BubbleInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str8 = rawFeed.recommendReason;
            if (str8 != null) {
                codedOutputByteBufferNano.m17261R(61, str8);
            }
            InteractionReason interactionReason = rawFeed.interaction;
            if (interactionReason != null) {
                codedOutputByteBufferNano.m17254K(62, interactionReason, InteractionReason.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(63, rawFeed.isRoamHighlight);
            String str9 = rawFeed.city;
            if (str9 != null) {
                codedOutputByteBufferNano.m17261R(64, str9);
            }
            codedOutputByteBufferNano.m17244A(65, rawFeed.showLikeSplitLine);
            String str10 = rawFeed.recommendReasonIcon;
            if (str10 != null) {
                codedOutputByteBufferNano.m17261R(66, str10);
            }
            String str11 = rawFeed.recommendReasonBackgroundColor;
            if (str11 != null) {
                codedOutputByteBufferNano.m17261R(67, str11);
            }
            String str12 = rawFeed.recommendReasonFontColor;
            if (str12 != null) {
                codedOutputByteBufferNano.m17261R(68, str12);
            }
            List<String> list2 = rawFeed.duplicateImgs;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(69, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            MomentExpose momentExpose = rawFeed.momentExpose;
            if (momentExpose != null) {
                codedOutputByteBufferNano.m17254K(70, momentExpose, MomentExpose.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<RawFeed> JSON_ADAPTER = new ObjectJsonAdapter<RawFeed>() { // from class: com.p1.mobile.putong.feed.data.RawFeed.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RawFeed.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RawFeed newInstance() {
            return new RawFeed();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(RawFeed rawFeed, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1665571198:
                    if (str.equals("showUnreadSplitLine")) {
                        b = 0;
                    }
                    break;
                case -1603041053:
                    if (str.equals("relationshipName")) {
                        b = 1;
                    }
                    break;
                case -1602839150:
                    if (str.equals("relationshipType")) {
                        b = 2;
                    }
                    break;
                case -1250974533:
                    if (str.equals("duplicateImgs")) {
                        b = 3;
                    }
                    break;
                case -1141958231:
                    if (str.equals("recommendTime")) {
                        b = 4;
                    }
                    break;
                case -998985031:
                    if (str.equals("recommendReasonIcon")) {
                        b = 5;
                    }
                    break;
                case -899448191:
                    if (str.equals("isRoamHighlight")) {
                        b = 6;
                    }
                    break;
                case -892482046:
                    if (str.equals("states")) {
                        b = 7;
                    }
                    break;
                case -648610284:
                    if (str.equals("recommendReasonFontColor")) {
                        b = 8;
                    }
                    break;
                case -537738018:
                    if (str.equals("relationshipIconUrl")) {
                        b = 9;
                    }
                    break;
                case -372927447:
                    if (str.equals("canGreeting")) {
                        b = 10;
                    }
                    break;
                case -156760998:
                    if (str.equals("showLikeSplitLine")) {
                        b = 11;
                    }
                    break;
                case -58479648:
                    if (str.equals("locationName")) {
                        b = 12;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 3053931:
                    if (str.equals(RankLevel.city)) {
                        b = 14;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 15;
                    }
                    break;
                case 96965648:
                    if (str.equals("extra")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 523770005:
                    if (str.equals("recommendReasonBackgroundColor")) {
                        b = 17;
                    }
                    break;
                case 1628619322:
                    if (str.equals("activityName")) {
                        b = 18;
                    }
                    break;
                case 1844104722:
                    if (str.equals("interaction")) {
                        b = 19;
                    }
                    break;
                case 1874067940:
                    if (str.equals("momentExpose")) {
                        b = 20;
                    }
                    break;
                case 2028474912:
                    if (str.equals("recommendReason")) {
                        b = 21;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    rawFeed.showUnreadSplitLine = jsonParser.getValueAsBoolean();
                    return true;
                case 1:
                    rawFeed.relationshipName = jsonParser.getValueAsString();
                    return true;
                case 2:
                    rawFeed.relationshipType = jsonParser.getValueAsString();
                    return true;
                case 3:
                    rawFeed.duplicateImgs = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 4:
                    rawFeed.recommendTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 5:
                    rawFeed.recommendReasonIcon = jsonParser.getValueAsString();
                    return true;
                case 6:
                    rawFeed.isRoamHighlight = jsonParser.getValueAsBoolean();
                    return true;
                case 7:
                    rawFeed.states = JsonAdapter.parseArray(jsonParser, BubbleInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case 8:
                    rawFeed.recommendReasonFontColor = jsonParser.getValueAsString();
                    return true;
                case 9:
                    rawFeed.relationshipIconUrl = jsonParser.getValueAsString();
                    return true;
                case 10:
                    rawFeed.canGreeting = jsonParser.getValueAsBoolean();
                    return true;
                case 11:
                    rawFeed.showLikeSplitLine = jsonParser.getValueAsBoolean();
                    return true;
                case 12:
                    rawFeed.locationName = jsonParser.getValueAsString();
                    return true;
                case 13:
                    rawFeed.f39243id = jsonParser.getValueAsString();
                    return false;
                case 14:
                    rawFeed.city = jsonParser.getValueAsString();
                    return true;
                case 15:
                    rawFeed.type = jsonParser.getValueAsString();
                    return true;
                case 16:
                    rawFeed.extra = MomentFeedsExtra.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 17:
                    rawFeed.recommendReasonBackgroundColor = jsonParser.getValueAsString();
                    return true;
                case 18:
                    rawFeed.activityName = jsonParser.getValueAsString();
                    return true;
                case 19:
                    rawFeed.interaction = InteractionReason.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 20:
                    rawFeed.momentExpose = MomentExpose.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 21:
                    rawFeed.recommendReason = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(RawFeed rawFeed, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1665571198:
                    if (str.equals("showUnreadSplitLine")) {
                        b = 0;
                    }
                    break;
                case -1603041053:
                    if (str.equals("relationshipName")) {
                        b = 1;
                    }
                    break;
                case -1602839150:
                    if (str.equals("relationshipType")) {
                        b = 2;
                    }
                    break;
                case -1250974533:
                    if (str.equals("duplicateImgs")) {
                        b = 3;
                    }
                    break;
                case -1141958231:
                    if (str.equals("recommendTime")) {
                        b = 4;
                    }
                    break;
                case -998985031:
                    if (str.equals("recommendReasonIcon")) {
                        b = 5;
                    }
                    break;
                case -899448191:
                    if (str.equals("isRoamHighlight")) {
                        b = 6;
                    }
                    break;
                case -892482046:
                    if (str.equals("states")) {
                        b = 7;
                    }
                    break;
                case -648610284:
                    if (str.equals("recommendReasonFontColor")) {
                        b = 8;
                    }
                    break;
                case -537738018:
                    if (str.equals("relationshipIconUrl")) {
                        b = 9;
                    }
                    break;
                case -372927447:
                    if (str.equals("canGreeting")) {
                        b = 10;
                    }
                    break;
                case -156760998:
                    if (str.equals("showLikeSplitLine")) {
                        b = 11;
                    }
                    break;
                case -58479648:
                    if (str.equals("locationName")) {
                        b = 12;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 3053931:
                    if (str.equals(RankLevel.city)) {
                        b = 14;
                    }
                    break;
                case 3575610:
                    if (str.equals("type")) {
                        b = 15;
                    }
                    break;
                case 96965648:
                    if (str.equals("extra")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 523770005:
                    if (str.equals("recommendReasonBackgroundColor")) {
                        b = 17;
                    }
                    break;
                case 1628619322:
                    if (str.equals("activityName")) {
                        b = 18;
                    }
                    break;
                case 1844104722:
                    if (str.equals("interaction")) {
                        b = 19;
                    }
                    break;
                case 1874067940:
                    if (str.equals("momentExpose")) {
                        b = 20;
                    }
                    break;
                case 2028474912:
                    if (str.equals("recommendReason")) {
                        b = 21;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    return true;
                case 13:
                    return false;
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                    return true;
                default:
                    return super.parseFieldCheck(rawFeed, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RawFeed rawFeed, JsonGenerator jsonGenerator) throws IOException {
            String str = rawFeed.f39243id;
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
                jsonGenerator.writeStringField(RankLevel.city, str9);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RawFeed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RawFeed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m60892a(String str) {
        return str;
    }

    public static RawFeed new_() {
        RawFeed rawFeed = new RawFeed();
        rawFeed.nullCheck();
        return rawFeed;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RawFeed mo223809clone() {
        RawFeed rawFeed = new RawFeed();
        rawFeed.f39243id = this.f39243id;
        rawFeed.type = this.type;
        rawFeed.canGreeting = this.canGreeting;
        MomentFeedsExtra momentFeedsExtra = this.extra;
        if (momentFeedsExtra != null) {
            rawFeed.extra = momentFeedsExtra.mo223809clone();
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
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BubbleInfo) obj).mo223809clone();
                }
            });
        }
        rawFeed.recommendReason = this.recommendReason;
        InteractionReason interactionReason = this.interaction;
        if (interactionReason != null) {
            rawFeed.interaction = interactionReason.mo223809clone();
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
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return RawFeed.m60892a((String) obj);
                }
            });
        }
        MomentExpose momentExpose = this.momentExpose;
        if (momentExpose != null) {
            rawFeed.momentExpose = momentExpose.mo223809clone();
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
        return ValueObject.util_equals(this.f39243id, rawFeed.f39243id) && ValueObject.util_equals(this.type, rawFeed.type) && this.canGreeting == rawFeed.canGreeting && ValueObject.util_equals(this.extra, rawFeed.extra) && this.recommendTime == rawFeed.recommendTime && ValueObject.util_equals(this.activityName, rawFeed.activityName) && ValueObject.util_equals(this.locationName, rawFeed.locationName) && ValueObject.util_equals(this.relationshipName, rawFeed.relationshipName) && ValueObject.util_equals(this.relationshipIconUrl, rawFeed.relationshipIconUrl) && this.showUnreadSplitLine == rawFeed.showUnreadSplitLine && ValueObject.util_equals(this.relationshipType, rawFeed.relationshipType) && ValueObject.util_equals(this.states, rawFeed.states) && ValueObject.util_equals(this.recommendReason, rawFeed.recommendReason) && ValueObject.util_equals(this.interaction, rawFeed.interaction) && this.isRoamHighlight == rawFeed.isRoamHighlight && ValueObject.util_equals(this.city, rawFeed.city) && this.showLikeSplitLine == rawFeed.showLikeSplitLine && ValueObject.util_equals(this.recommendReasonIcon, rawFeed.recommendReasonIcon) && ValueObject.util_equals(this.recommendReasonBackgroundColor, rawFeed.recommendReasonBackgroundColor) && ValueObject.util_equals(this.recommendReasonFontColor, rawFeed.recommendReasonFontColor) && ValueObject.util_equals(this.duplicateImgs, rawFeed.duplicateImgs) && ValueObject.util_equals(this.momentExpose, rawFeed.momentExpose);
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
        String str = this.f39243id;
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
        this.hashCode = iHashCode17;
        return iHashCode17;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39243id == null) {
            this.f39243id = "";
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
        if (!ValueObject.util_equals(this.f39243id, rawFeed.f39243id)) {
            rawFeed2.f39243id = this.f39243id;
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
