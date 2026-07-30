package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.AvatarFrameConfig;
import com.p000p1.mobile.putong.data.Device;
import com.p000p1.mobile.putong.data.Link;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.RecommendMessage;
import com.p000p1.mobile.putong.data.ReflectResponse;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.UserPictureTags;
import com.p000p1.mobile.putong.data.VerificationToken;
import com.p000p1.mobile.putong.data.VisitorStatistics;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p006ss.bytertc.audio.device.router.AudioRouteDeviceManager;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class CommonData extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "commondata";

    @NonNull
    @ProtobufIndex(index = 17)
    public AdConfiguration adConfiguration;

    @NonNull
    @ProtobufIndex(index = 18)
    public AdRewardResult adReward;

    @NonNull
    @ProtobufIndex(index = 15)
    public List<AvatarFrameConfig> avatarFrameConfiguration;

    @NonNull
    @ProtobufIndex(index = 11)
    public SliderData captcha;

    @Nullable
    @ProtobufIndex(index = 4)
    public Connector connector;

    @NonNull
    @ProtobufIndex(index = 7)
    public Detect detect;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<Device> devices;

    @NonNull
    @ProtobufIndex(index = 27)
    public String email;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<Link> links;

    @NonNull
    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP)
    public LiveRightCDN liveRightCDN;

    @Nullable
    @ProtobufIndex(index = 2)
    public List<Media> media;

    @NonNull
    @ProtobufIndex(index = 26)
    public Mobile mobile;

    @ProtobufIndex(index = 21)
    public boolean newGuide;

    @NonNull
    @ProtobufIndex(index = 19)
    public List<UserPictureTags> pictureTags;

    @ProtobufIndex(index = 22)
    public boolean popUps;

    @NonNull
    @ProtobufIndex(index = 9)
    public List<ReflectResponse> raySequences;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<RecommendMessage> recommendMessage;

    @ProtobufIndex(index = 23)
    public boolean showDialog;

    @ProtobufIndex(index = 25)
    public boolean showEntrance;

    @NonNull
    @ProtobufIndex(index = 10)
    public String stage;

    @NonNull
    @ProtobufIndex(index = 28)
    public ThirdParty thirdparty;

    @NonNull
    @ProtobufIndex(index = 30)
    public ThirdPartyEmail thirdpartyEmail;

    @NonNull
    @ProtobufIndex(index = 29)
    public Token token;

    @NonNull
    @ProtobufIndex(index = 24)
    public String type;

    @Nullable
    @ProtobufIndex(index = 20)
    public UserActivityInfo userActivityInfo;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<User> users;

    @Nullable
    @ProtobufIndex(index = 5)
    public List<VerificationToken> verificationTokens;

    @NonNull
    @ProtobufIndex(index = 14)
    public VisitorCounter visitorCounter;

    @NonNull
    @ProtobufIndex(index = 12)
    public VisitorInfo visitorInfo;

    @NonNull
    @ProtobufIndex(index = 13)
    public List<VisitorStatistics> visitorStatistics;
    public static ProtobufAdapter<CommonData> PROTOBUF_ADAPTER = new MessageNanoAdapter<CommonData>() { // from class: com.p1.mobile.putong.data.CommonData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CommonData commonData) {
            List<User> list = commonData.users;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, User.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<Media> list2 = commonData.media;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Device> list3 = commonData.devices;
            if (list3 != null) {
                iL += CodedOutputByteBufferNano.l(3, list3, Device.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Connector connector = commonData.connector;
            if (connector != null) {
                iL += CodedOutputByteBufferNano.l(4, connector, Connector.PROTOBUF_ADAPTER);
            }
            List<VerificationToken> list4 = commonData.verificationTokens;
            if (list4 != null) {
                iL += CodedOutputByteBufferNano.l(5, list4, VerificationToken.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Link> list5 = commonData.links;
            if (list5 != null) {
                iL += CodedOutputByteBufferNano.l(6, list5, Link.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Detect detect = commonData.detect;
            if (detect != null) {
                iL += CodedOutputByteBufferNano.l(7, detect, Detect.PROTOBUF_ADAPTER);
            }
            List<RecommendMessage> list6 = commonData.recommendMessage;
            if (list6 != null) {
                iL += CodedOutputByteBufferNano.l(8, list6, RecommendMessage.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ReflectResponse> list7 = commonData.raySequences;
            if (list7 != null) {
                iL += CodedOutputByteBufferNano.l(9, list7, ReflectResponse.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = commonData.stage;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(10, str);
            }
            SliderData sliderData = commonData.captcha;
            if (sliderData != null) {
                iL += CodedOutputByteBufferNano.l(11, sliderData, SliderData.PROTOBUF_ADAPTER);
            }
            VisitorInfo visitorInfo = commonData.visitorInfo;
            if (visitorInfo != null) {
                iL += CodedOutputByteBufferNano.l(12, visitorInfo, VisitorInfo.PROTOBUF_ADAPTER);
            }
            List<VisitorStatistics> list8 = commonData.visitorStatistics;
            if (list8 != null) {
                iL += CodedOutputByteBufferNano.l(13, list8, VisitorStatistics.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            VisitorCounter visitorCounter = commonData.visitorCounter;
            if (visitorCounter != null) {
                iL += CodedOutputByteBufferNano.l(14, visitorCounter, VisitorCounter.PROTOBUF_ADAPTER);
            }
            List<AvatarFrameConfig> list9 = commonData.avatarFrameConfiguration;
            if (list9 != null) {
                iL += CodedOutputByteBufferNano.l(15, list9, AvatarFrameConfig.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LiveRightCDN liveRightCDN = commonData.liveRightCDN;
            if (liveRightCDN != null) {
                iL += CodedOutputByteBufferNano.l(16, liveRightCDN, LiveRightCDN.PROTOBUF_ADAPTER);
            }
            AdConfiguration adConfiguration = commonData.adConfiguration;
            if (adConfiguration != null) {
                iL += CodedOutputByteBufferNano.l(17, adConfiguration, AdConfiguration.PROTOBUF_ADAPTER);
            }
            AdRewardResult adRewardResult = commonData.adReward;
            if (adRewardResult != null) {
                iL += CodedOutputByteBufferNano.l(18, adRewardResult, AdRewardResult.PROTOBUF_ADAPTER);
            }
            List<UserPictureTags> list10 = commonData.pictureTags;
            if (list10 != null) {
                iL += CodedOutputByteBufferNano.l(19, list10, UserPictureTags.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            UserActivityInfo userActivityInfo = commonData.userActivityInfo;
            if (userActivityInfo != null) {
                iL += CodedOutputByteBufferNano.l(20, userActivityInfo, UserActivityInfo.PROTOBUF_ADAPTER);
            }
            int iB = iL + CodedOutputByteBufferNano.b(21, commonData.newGuide) + CodedOutputByteBufferNano.b(22, commonData.popUps) + CodedOutputByteBufferNano.b(23, commonData.showDialog);
            String str2 = commonData.type;
            if (str2 != null) {
                iB += CodedOutputByteBufferNano.o(24, str2);
            }
            int iB2 = iB + CodedOutputByteBufferNano.b(25, commonData.showEntrance);
            Mobile mobile = commonData.mobile;
            if (mobile != null) {
                iB2 += CodedOutputByteBufferNano.l(26, mobile, Mobile.PROTOBUF_ADAPTER);
            }
            String str3 = commonData.email;
            if (str3 != null) {
                iB2 += CodedOutputByteBufferNano.o(27, str3);
            }
            ThirdParty thirdParty = commonData.thirdparty;
            if (thirdParty != null) {
                iB2 += CodedOutputByteBufferNano.l(28, thirdParty, ThirdParty.PROTOBUF_ADAPTER);
            }
            Token token = commonData.token;
            if (token != null) {
                iB2 += CodedOutputByteBufferNano.l(29, token, Token.PROTOBUF_ADAPTER);
            }
            ThirdPartyEmail thirdPartyEmail = commonData.thirdpartyEmail;
            if (thirdPartyEmail != null) {
                iB2 += CodedOutputByteBufferNano.l(30, thirdPartyEmail, ThirdPartyEmail.PROTOBUF_ADAPTER);
            }
            ((MessageNano) commonData).cachedSize = iB2;
            return iB2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CommonData m17829parse(nb5 nb5Var) throws IOException {
            CommonData commonData = new CommonData();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (commonData.users == null) {
                            commonData.users = new ArrayList();
                        }
                        if (commonData.devices == null) {
                            commonData.devices = new ArrayList();
                        }
                        if (commonData.links == null) {
                            commonData.links = new ArrayList();
                        }
                        if (commonData.detect == null) {
                            commonData.detect = Detect.new_();
                        }
                        if (commonData.recommendMessage == null) {
                            commonData.recommendMessage = new ArrayList();
                        }
                        if (commonData.raySequences == null) {
                            commonData.raySequences = new ArrayList();
                        }
                        if (commonData.stage == null) {
                            commonData.stage = "";
                        }
                        if (commonData.captcha == null) {
                            commonData.captcha = SliderData.new_();
                        }
                        if (commonData.visitorInfo == null) {
                            commonData.visitorInfo = VisitorInfo.new_();
                        }
                        if (commonData.visitorStatistics == null) {
                            commonData.visitorStatistics = new ArrayList();
                        }
                        if (commonData.visitorCounter == null) {
                            commonData.visitorCounter = VisitorCounter.new_();
                        }
                        if (commonData.avatarFrameConfiguration == null) {
                            commonData.avatarFrameConfiguration = new ArrayList();
                        }
                        if (commonData.liveRightCDN == null) {
                            commonData.liveRightCDN = LiveRightCDN.new_();
                        }
                        if (commonData.adConfiguration == null) {
                            commonData.adConfiguration = AdConfiguration.new_();
                        }
                        if (commonData.adReward == null) {
                            commonData.adReward = AdRewardResult.new_();
                        }
                        if (commonData.pictureTags == null) {
                            commonData.pictureTags = new ArrayList();
                        }
                        if (commonData.type == null) {
                            commonData.type = "";
                        }
                        if (commonData.mobile == null) {
                            commonData.mobile = Mobile.new_();
                        }
                        if (commonData.email == null) {
                            commonData.email = "";
                        }
                        if (commonData.thirdparty == null) {
                            commonData.thirdparty = ThirdParty.new_();
                        }
                        if (commonData.token == null) {
                            commonData.token = Token.new_();
                        }
                        if (commonData.thirdpartyEmail == null) {
                            commonData.thirdpartyEmail = ThirdPartyEmail.new_();
                        }
                        break;
                    case 10:
                        commonData.users = (List) nb5Var.l(User.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 18:
                        commonData.media = (List) nb5Var.l(Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 26:
                        commonData.devices = (List) nb5Var.l(Device.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 34:
                        commonData.connector = (Connector) nb5Var.l(Connector.PROTOBUF_ADAPTER);
                        continue;
                    case 42:
                        commonData.verificationTokens = (List) nb5Var.l(VerificationToken.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 50:
                        commonData.links = (List) nb5Var.l(Link.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 58:
                        commonData.detect = (Detect) nb5Var.l(Detect.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        commonData.recommendMessage = (List) nb5Var.l(RecommendMessage.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 74:
                        commonData.raySequences = (List) nb5Var.l(ReflectResponse.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 82:
                        commonData.stage = nb5Var.s();
                        continue;
                    case 90:
                        commonData.captcha = (SliderData) nb5Var.l(SliderData.PROTOBUF_ADAPTER);
                        continue;
                    case 98:
                        commonData.visitorInfo = (VisitorInfo) nb5Var.l(VisitorInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 106:
                        commonData.visitorStatistics = (List) nb5Var.l(VisitorStatistics.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 114:
                        commonData.visitorCounter = (VisitorCounter) nb5Var.l(VisitorCounter.PROTOBUF_ADAPTER);
                        continue;
                    case 122:
                        commonData.avatarFrameConfiguration = (List) nb5Var.l(AvatarFrameConfig.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 130:
                        commonData.liveRightCDN = (LiveRightCDN) nb5Var.l(LiveRightCDN.PROTOBUF_ADAPTER);
                        continue;
                    case 138:
                        commonData.adConfiguration = (AdConfiguration) nb5Var.l(AdConfiguration.PROTOBUF_ADAPTER);
                        continue;
                    case 146:
                        commonData.adReward = (AdRewardResult) nb5Var.l(AdRewardResult.PROTOBUF_ADAPTER);
                        continue;
                    case 154:
                        commonData.pictureTags = (List) nb5Var.l(UserPictureTags.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 162:
                        commonData.userActivityInfo = (UserActivityInfo) nb5Var.l(UserActivityInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 168:
                        commonData.newGuide = nb5Var.g();
                        continue;
                    case 176:
                        commonData.popUps = nb5Var.g();
                        continue;
                    case 184:
                        commonData.showDialog = nb5Var.g();
                        continue;
                    case 194:
                        commonData.type = nb5Var.s();
                        continue;
                    case GivenGiftBrief.ADVANCED_GIFT_LEVEL /* 200 */:
                        commonData.showEntrance = nb5Var.g();
                        continue;
                    case 210:
                        commonData.mobile = (Mobile) nb5Var.l(Mobile.PROTOBUF_ADAPTER);
                        continue;
                    case 218:
                        commonData.email = nb5Var.s();
                        continue;
                    case 226:
                        commonData.thirdparty = (ThirdParty) nb5Var.l(ThirdParty.PROTOBUF_ADAPTER);
                        continue;
                    case 234:
                        commonData.token = (Token) nb5Var.l(Token.PROTOBUF_ADAPTER);
                        continue;
                    case 242:
                        commonData.thirdpartyEmail = (ThirdPartyEmail) nb5Var.l(ThirdPartyEmail.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (commonData.users == null) {
                            commonData.users = new ArrayList();
                        }
                        if (commonData.devices == null) {
                            commonData.devices = new ArrayList();
                        }
                        if (commonData.links == null) {
                            commonData.links = new ArrayList();
                        }
                        if (commonData.detect == null) {
                            commonData.detect = Detect.new_();
                        }
                        if (commonData.recommendMessage == null) {
                            commonData.recommendMessage = new ArrayList();
                        }
                        if (commonData.raySequences == null) {
                            commonData.raySequences = new ArrayList();
                        }
                        if (commonData.stage == null) {
                            commonData.stage = "";
                        }
                        if (commonData.captcha == null) {
                            commonData.captcha = SliderData.new_();
                        }
                        if (commonData.visitorInfo == null) {
                            commonData.visitorInfo = VisitorInfo.new_();
                        }
                        if (commonData.visitorStatistics == null) {
                            commonData.visitorStatistics = new ArrayList();
                        }
                        if (commonData.visitorCounter == null) {
                            commonData.visitorCounter = VisitorCounter.new_();
                        }
                        if (commonData.avatarFrameConfiguration == null) {
                            commonData.avatarFrameConfiguration = new ArrayList();
                        }
                        if (commonData.liveRightCDN == null) {
                            commonData.liveRightCDN = LiveRightCDN.new_();
                        }
                        if (commonData.adConfiguration == null) {
                            commonData.adConfiguration = AdConfiguration.new_();
                        }
                        if (commonData.adReward == null) {
                            commonData.adReward = AdRewardResult.new_();
                        }
                        if (commonData.pictureTags == null) {
                            commonData.pictureTags = new ArrayList();
                        }
                        if (commonData.type == null) {
                            commonData.type = "";
                        }
                        if (commonData.mobile == null) {
                            commonData.mobile = Mobile.new_();
                        }
                        if (commonData.email == null) {
                            commonData.email = "";
                        }
                        if (commonData.thirdparty == null) {
                            commonData.thirdparty = ThirdParty.new_();
                        }
                        if (commonData.token == null) {
                            commonData.token = Token.new_();
                        }
                        if (commonData.thirdpartyEmail == null) {
                            commonData.thirdpartyEmail = ThirdPartyEmail.new_();
                            return commonData;
                        }
                        break;
                }
            }
            return commonData;
        }

        public void serialize(CommonData commonData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<User> list = commonData.users;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, User.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Media> list2 = commonData.media;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Device> list3 = commonData.devices;
            if (list3 != null) {
                codedOutputByteBufferNano.K(3, list3, Device.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Connector connector = commonData.connector;
            if (connector != null) {
                codedOutputByteBufferNano.K(4, connector, Connector.PROTOBUF_ADAPTER);
            }
            List<VerificationToken> list4 = commonData.verificationTokens;
            if (list4 != null) {
                codedOutputByteBufferNano.K(5, list4, VerificationToken.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Link> list5 = commonData.links;
            if (list5 != null) {
                codedOutputByteBufferNano.K(6, list5, Link.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Detect detect = commonData.detect;
            if (detect != null) {
                codedOutputByteBufferNano.K(7, detect, Detect.PROTOBUF_ADAPTER);
            }
            List<RecommendMessage> list6 = commonData.recommendMessage;
            if (list6 != null) {
                codedOutputByteBufferNano.K(8, list6, RecommendMessage.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<ReflectResponse> list7 = commonData.raySequences;
            if (list7 != null) {
                codedOutputByteBufferNano.K(9, list7, ReflectResponse.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = commonData.stage;
            if (str != null) {
                codedOutputByteBufferNano.R(10, str);
            }
            SliderData sliderData = commonData.captcha;
            if (sliderData != null) {
                codedOutputByteBufferNano.K(11, sliderData, SliderData.PROTOBUF_ADAPTER);
            }
            VisitorInfo visitorInfo = commonData.visitorInfo;
            if (visitorInfo != null) {
                codedOutputByteBufferNano.K(12, visitorInfo, VisitorInfo.PROTOBUF_ADAPTER);
            }
            List<VisitorStatistics> list8 = commonData.visitorStatistics;
            if (list8 != null) {
                codedOutputByteBufferNano.K(13, list8, VisitorStatistics.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            VisitorCounter visitorCounter = commonData.visitorCounter;
            if (visitorCounter != null) {
                codedOutputByteBufferNano.K(14, visitorCounter, VisitorCounter.PROTOBUF_ADAPTER);
            }
            List<AvatarFrameConfig> list9 = commonData.avatarFrameConfiguration;
            if (list9 != null) {
                codedOutputByteBufferNano.K(15, list9, AvatarFrameConfig.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            LiveRightCDN liveRightCDN = commonData.liveRightCDN;
            if (liveRightCDN != null) {
                codedOutputByteBufferNano.K(16, liveRightCDN, LiveRightCDN.PROTOBUF_ADAPTER);
            }
            AdConfiguration adConfiguration = commonData.adConfiguration;
            if (adConfiguration != null) {
                codedOutputByteBufferNano.K(17, adConfiguration, AdConfiguration.PROTOBUF_ADAPTER);
            }
            AdRewardResult adRewardResult = commonData.adReward;
            if (adRewardResult != null) {
                codedOutputByteBufferNano.K(18, adRewardResult, AdRewardResult.PROTOBUF_ADAPTER);
            }
            List<UserPictureTags> list10 = commonData.pictureTags;
            if (list10 != null) {
                codedOutputByteBufferNano.K(19, list10, UserPictureTags.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            UserActivityInfo userActivityInfo = commonData.userActivityInfo;
            if (userActivityInfo != null) {
                codedOutputByteBufferNano.K(20, userActivityInfo, UserActivityInfo.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(21, commonData.newGuide);
            codedOutputByteBufferNano.A(22, commonData.popUps);
            codedOutputByteBufferNano.A(23, commonData.showDialog);
            String str2 = commonData.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(24, str2);
            }
            codedOutputByteBufferNano.A(25, commonData.showEntrance);
            Mobile mobile = commonData.mobile;
            if (mobile != null) {
                codedOutputByteBufferNano.K(26, mobile, Mobile.PROTOBUF_ADAPTER);
            }
            String str3 = commonData.email;
            if (str3 != null) {
                codedOutputByteBufferNano.R(27, str3);
            }
            ThirdParty thirdParty = commonData.thirdparty;
            if (thirdParty != null) {
                codedOutputByteBufferNano.K(28, thirdParty, ThirdParty.PROTOBUF_ADAPTER);
            }
            Token token = commonData.token;
            if (token != null) {
                codedOutputByteBufferNano.K(29, token, Token.PROTOBUF_ADAPTER);
            }
            ThirdPartyEmail thirdPartyEmail = commonData.thirdpartyEmail;
            if (thirdPartyEmail != null) {
                codedOutputByteBufferNano.K(30, thirdPartyEmail, ThirdPartyEmail.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<CommonData> JSON_ADAPTER = new ObjectJsonAdapter<CommonData>() { // from class: com.p1.mobile.putong.data.CommonData.2
        public Class getDataClass() {
            return CommonData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CommonData mo17830newInstance() {
            return new CommonData();
        }

        public boolean parseField(CommonData commonData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "raySequences":
                    commonData.raySequences = JsonAdapter.parseArray(jsonParser, ReflectResponse.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "adReward":
                    commonData.adReward = (AdRewardResult) AdRewardResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "recommendMessage":
                    commonData.recommendMessage = JsonAdapter.parseArray(jsonParser, RecommendMessage.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "detect":
                    commonData.detect = (Detect) Detect.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "pictureTags":
                    commonData.pictureTags = JsonAdapter.parseArray(jsonParser, UserPictureTags.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "mobile":
                    commonData.mobile = (Mobile) Mobile.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "popUps":
                    commonData.popUps = jsonParser.getValueAsBoolean();
                    return true;
                case "visitorInfo":
                    commonData.visitorInfo = (VisitorInfo) VisitorInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "thirdparty":
                    commonData.thirdparty = (ThirdParty) ThirdParty.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "verificationTokens":
                    commonData.verificationTokens = JsonAdapter.parseArray(jsonParser, VerificationToken.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "visitorStatistics":
                    commonData.visitorStatistics = JsonAdapter.parseArray(jsonParser, VisitorStatistics.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "avatarFrameConfiguration":
                    commonData.avatarFrameConfiguration = JsonAdapter.parseArray(jsonParser, AvatarFrameConfig.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "connector":
                    commonData.connector = (Connector) Connector.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "adConfiguration":
                    commonData.adConfiguration = (AdConfiguration) AdConfiguration.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "thirdpartyEmail":
                    commonData.thirdpartyEmail = (ThirdPartyEmail) ThirdPartyEmail.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "type":
                    commonData.type = jsonParser.getValueAsString();
                    return true;
                case "email":
                    commonData.email = jsonParser.getValueAsString();
                    return true;
                case "links":
                    commonData.links = JsonAdapter.parseArray(jsonParser, Link.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "media":
                    commonData.media = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_MEDIA, str2, arrayList, dataChecker);
                    return true;
                case "stage":
                    commonData.stage = jsonParser.getValueAsString();
                    return true;
                case "token":
                    commonData.token = (Token) Token.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "users":
                    commonData.users = JsonAdapter.parseArray(jsonParser, User.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "showDialog":
                    commonData.showDialog = jsonParser.getValueAsBoolean();
                    return true;
                case "liveRightCDN":
                    commonData.liveRightCDN = (LiveRightCDN) LiveRightCDN.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "captcha":
                    commonData.captcha = (SliderData) SliderData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "userActivityInfo":
                    commonData.userActivityInfo = (UserActivityInfo) UserActivityInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "visitorCounter":
                    commonData.visitorCounter = (VisitorCounter) VisitorCounter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "showEntrance":
                    commonData.showEntrance = jsonParser.getValueAsBoolean();
                    return true;
                case "newGuide":
                    commonData.newGuide = jsonParser.getValueAsBoolean();
                    return true;
                case "devices":
                    commonData.devices = JsonAdapter.parseArray(jsonParser, Device.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CommonData commonData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "raySequences":
                case "adReward":
                case "recommendMessage":
                case "detect":
                case "pictureTags":
                case "mobile":
                case "popUps":
                case "visitorInfo":
                case "thirdparty":
                case "verificationTokens":
                case "visitorStatistics":
                case "avatarFrameConfiguration":
                case "connector":
                case "adConfiguration":
                case "thirdpartyEmail":
                case "type":
                case "email":
                case "links":
                case "media":
                case "stage":
                case "token":
                case "users":
                case "showDialog":
                case "liveRightCDN":
                case "captcha":
                case "userActivityInfo":
                case "visitorCounter":
                case "showEntrance":
                case "newGuide":
                case "devices":
                    return true;
                default:
                    return super.parseFieldCheck(commonData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CommonData commonData, JsonGenerator jsonGenerator) throws IOException {
            if (commonData.users != null) {
                jsonGenerator.writeFieldName("users");
                JsonAdapter.serializeArray(commonData.users, jsonGenerator, User.JSON_ADAPTER);
            }
            if (commonData.media != null) {
                jsonGenerator.writeFieldName(Media.TYPE);
                JsonAdapter.serializeArray(commonData.media, jsonGenerator, Converter.RAW_PICTURE_TO_MEDIA);
            }
            if (commonData.devices != null) {
                jsonGenerator.writeFieldName("devices");
                JsonAdapter.serializeArray(commonData.devices, jsonGenerator, Device.JSON_ADAPTER);
            }
            if (commonData.connector != null) {
                jsonGenerator.writeFieldName(Connector.TYPE);
                Connector.JSON_ADAPTER.serialize(commonData.connector, jsonGenerator, true);
            }
            if (commonData.verificationTokens != null) {
                jsonGenerator.writeFieldName("verificationTokens");
                JsonAdapter.serializeArray(commonData.verificationTokens, jsonGenerator, VerificationToken.JSON_ADAPTER);
            }
            if (commonData.links != null) {
                jsonGenerator.writeFieldName(Links.TYPE);
                JsonAdapter.serializeArray(commonData.links, jsonGenerator, Link.JSON_ADAPTER);
            }
            if (commonData.detect != null) {
                jsonGenerator.writeFieldName(Detect.TYPE);
                Detect.JSON_ADAPTER.serialize(commonData.detect, jsonGenerator, true);
            }
            if (commonData.recommendMessage != null) {
                jsonGenerator.writeFieldName("recommendMessage");
                JsonAdapter.serializeArray(commonData.recommendMessage, jsonGenerator, RecommendMessage.JSON_ADAPTER);
            }
            if (commonData.raySequences != null) {
                jsonGenerator.writeFieldName("raySequences");
                JsonAdapter.serializeArray(commonData.raySequences, jsonGenerator, ReflectResponse.JSON_ADAPTER);
            }
            String str = commonData.stage;
            if (str != null) {
                jsonGenerator.writeStringField("stage", str);
            }
            if (commonData.captcha != null) {
                jsonGenerator.writeFieldName(Captcha.TYPE);
                SliderData.JSON_ADAPTER.serialize(commonData.captcha, jsonGenerator, true);
            }
            if (commonData.visitorInfo != null) {
                jsonGenerator.writeFieldName("visitorInfo");
                VisitorInfo.JSON_ADAPTER.serialize(commonData.visitorInfo, jsonGenerator, true);
            }
            if (commonData.visitorStatistics != null) {
                jsonGenerator.writeFieldName("visitorStatistics");
                JsonAdapter.serializeArray(commonData.visitorStatistics, jsonGenerator, VisitorStatistics.JSON_ADAPTER);
            }
            if (commonData.visitorCounter != null) {
                jsonGenerator.writeFieldName("visitorCounter");
                VisitorCounter.JSON_ADAPTER.serialize(commonData.visitorCounter, jsonGenerator, true);
            }
            if (commonData.avatarFrameConfiguration != null) {
                jsonGenerator.writeFieldName("avatarFrameConfiguration");
                JsonAdapter.serializeArray(commonData.avatarFrameConfiguration, jsonGenerator, AvatarFrameConfig.JSON_ADAPTER);
            }
            if (commonData.liveRightCDN != null) {
                jsonGenerator.writeFieldName("liveRightCDN");
                LiveRightCDN.JSON_ADAPTER.serialize(commonData.liveRightCDN, jsonGenerator, true);
            }
            if (commonData.adConfiguration != null) {
                jsonGenerator.writeFieldName("adConfiguration");
                AdConfiguration.JSON_ADAPTER.serialize(commonData.adConfiguration, jsonGenerator, true);
            }
            if (commonData.adReward != null) {
                jsonGenerator.writeFieldName("adReward");
                AdRewardResult.JSON_ADAPTER.serialize(commonData.adReward, jsonGenerator, true);
            }
            if (commonData.pictureTags != null) {
                jsonGenerator.writeFieldName("pictureTags");
                JsonAdapter.serializeArray(commonData.pictureTags, jsonGenerator, UserPictureTags.JSON_ADAPTER);
            }
            if (commonData.userActivityInfo != null) {
                jsonGenerator.writeFieldName("userActivityInfo");
                UserActivityInfo.JSON_ADAPTER.serialize(commonData.userActivityInfo, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("newGuide", commonData.newGuide);
            jsonGenerator.writeBooleanField("popUps", commonData.popUps);
            jsonGenerator.writeBooleanField("showDialog", commonData.showDialog);
            String str2 = commonData.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            jsonGenerator.writeBooleanField("showEntrance", commonData.showEntrance);
            if (commonData.mobile != null) {
                jsonGenerator.writeFieldName(Mobile.TYPE);
                Mobile.JSON_ADAPTER.serialize(commonData.mobile, jsonGenerator, true);
            }
            String str3 = commonData.email;
            if (str3 != null) {
                jsonGenerator.writeStringField(SignInGrantType.email, str3);
            }
            if (commonData.thirdparty != null) {
                jsonGenerator.writeFieldName(ThirdParty.TYPE);
                ThirdParty.JSON_ADAPTER.serialize(commonData.thirdparty, jsonGenerator, true);
            }
            if (commonData.token != null) {
                jsonGenerator.writeFieldName(Token.TYPE);
                Token.JSON_ADAPTER.serialize(commonData.token, jsonGenerator, true);
            }
            if (commonData.thirdpartyEmail != null) {
                jsonGenerator.writeFieldName("thirdpartyEmail");
                ThirdPartyEmail.JSON_ADAPTER.serialize(commonData.thirdpartyEmail, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CommonData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CommonData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CommonData new_() {
        CommonData commonData = new CommonData();
        commonData.nullCheck();
        return commonData;
    }

    public void addAll(BaseData baseData) {
        super.addAll(baseData);
        if (baseData instanceof CommonData) {
            CommonData commonData = (CommonData) baseData;
            this.users.addAll(commonData.users);
            this.devices.addAll(commonData.devices);
            if (NullChecker.a(commonData.media)) {
                if (this.media == null) {
                    this.media = new ArrayList();
                }
                this.media.addAll(commonData.media);
            }
            this.links.addAll(commonData.links);
        }
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CommonData m17828clone() {
        CommonData commonData = new CommonData();
        List<User> list = this.users;
        if (list != null) {
            commonData.users = ValueObject.util_map(list, new w9j() { // from class: l.ji5
                public final Object call(Object obj) {
                    return ((User) obj).m19150clone();
                }
            });
        }
        List<Media> list2 = this.media;
        if (list2 != null) {
            commonData.media = ValueObject.util_map(list2, new w9j() { // from class: l.ki5
                public final Object call(Object obj) {
                    return ((Media) obj).mo17714clone();
                }
            });
        }
        List<Device> list3 = this.devices;
        if (list3 != null) {
            commonData.devices = ValueObject.util_map(list3, new w9j() { // from class: l.li5
                public final Object call(Object obj) {
                    return ((Device) obj).m17967clone();
                }
            });
        }
        Connector connector = this.connector;
        if (connector != null) {
            commonData.connector = connector.m17841clone();
        }
        List<VerificationToken> list4 = this.verificationTokens;
        if (list4 != null) {
            commonData.verificationTokens = ValueObject.util_map(list4, new w9j() { // from class: l.mi5
                public final Object call(Object obj) {
                    return ((VerificationToken) obj).m19282clone();
                }
            });
        }
        List<Link> list5 = this.links;
        if (list5 != null) {
            commonData.links = ValueObject.util_map(list5, new w9j() { // from class: l.ni5
                public final Object call(Object obj) {
                    return ((Link) obj).m18294clone();
                }
            });
        }
        Detect detect = this.detect;
        if (detect != null) {
            commonData.detect = detect.m17955clone();
        }
        List<RecommendMessage> list6 = this.recommendMessage;
        if (list6 != null) {
            commonData.recommendMessage = ValueObject.util_map(list6, new w9j() { // from class: l.oi5
                public final Object call(Object obj) {
                    return ((RecommendMessage) obj).m18874clone();
                }
            });
        }
        List<ReflectResponse> list7 = this.raySequences;
        if (list7 != null) {
            commonData.raySequences = ValueObject.util_map(list7, new w9j() { // from class: l.pi5
                public final Object call(Object obj) {
                    return ((ReflectResponse) obj).m18883clone();
                }
            });
        }
        commonData.stage = this.stage;
        SliderData sliderData = this.captcha;
        if (sliderData != null) {
            commonData.captcha = sliderData.m18985clone();
        }
        VisitorInfo visitorInfo = this.visitorInfo;
        if (visitorInfo != null) {
            commonData.visitorInfo = visitorInfo.m19334clone();
        }
        List<VisitorStatistics> list8 = this.visitorStatistics;
        if (list8 != null) {
            commonData.visitorStatistics = ValueObject.util_map(list8, new w9j() { // from class: l.qi5
                public final Object call(Object obj) {
                    return ((VisitorStatistics) obj).m19337clone();
                }
            });
        }
        VisitorCounter visitorCounter = this.visitorCounter;
        if (visitorCounter != null) {
            commonData.visitorCounter = visitorCounter.m19331clone();
        }
        List<AvatarFrameConfig> list9 = this.avatarFrameConfiguration;
        if (list9 != null) {
            commonData.avatarFrameConfiguration = ValueObject.util_map(list9, new w9j() { // from class: l.ri5
                public final Object call(Object obj) {
                    return ((AvatarFrameConfig) obj).m17732clone();
                }
            });
        }
        LiveRightCDN liveRightCDN = this.liveRightCDN;
        if (liveRightCDN != null) {
            commonData.liveRightCDN = liveRightCDN.m18372clone();
        }
        AdConfiguration adConfiguration = this.adConfiguration;
        if (adConfiguration != null) {
            commonData.adConfiguration = adConfiguration.m17628clone();
        }
        AdRewardResult adRewardResult = this.adReward;
        if (adRewardResult != null) {
            commonData.adReward = adRewardResult.m17640clone();
        }
        List<UserPictureTags> list10 = this.pictureTags;
        if (list10 != null) {
            commonData.pictureTags = ValueObject.util_map(list10, new w9j() { // from class: l.si5
                public final Object call(Object obj) {
                    return ((UserPictureTags) obj).m19201clone();
                }
            });
        }
        UserActivityInfo userActivityInfo = this.userActivityInfo;
        if (userActivityInfo != null) {
            commonData.userActivityInfo = userActivityInfo.m19156clone();
        }
        commonData.newGuide = this.newGuide;
        commonData.popUps = this.popUps;
        commonData.showDialog = this.showDialog;
        commonData.type = this.type;
        commonData.showEntrance = this.showEntrance;
        Mobile mobile = this.mobile;
        if (mobile != null) {
            commonData.mobile = mobile.m18473clone();
        }
        commonData.email = this.email;
        ThirdParty thirdParty = this.thirdparty;
        if (thirdParty != null) {
            commonData.thirdparty = thirdParty.m19096clone();
        }
        Token token = this.token;
        if (token != null) {
            commonData.token = token.m19105clone();
        }
        ThirdPartyEmail thirdPartyEmail = this.thirdpartyEmail;
        if (thirdPartyEmail != null) {
            commonData.thirdpartyEmail = thirdPartyEmail.m19099clone();
        }
        return commonData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommonData)) {
            return false;
        }
        CommonData commonData = (CommonData) obj;
        return this == obj && ValueObject.util_equals(this.users, commonData.users) && ValueObject.util_equals(this.media, commonData.media) && ValueObject.util_equals(this.devices, commonData.devices) && ValueObject.util_equals(this.connector, commonData.connector) && ValueObject.util_equals(this.verificationTokens, commonData.verificationTokens) && ValueObject.util_equals(this.links, commonData.links) && ValueObject.util_equals(this.detect, commonData.detect) && ValueObject.util_equals(this.recommendMessage, commonData.recommendMessage) && ValueObject.util_equals(this.raySequences, commonData.raySequences) && ValueObject.util_equals(this.stage, commonData.stage) && ValueObject.util_equals(this.captcha, commonData.captcha) && ValueObject.util_equals(this.visitorInfo, commonData.visitorInfo) && ValueObject.util_equals(this.visitorStatistics, commonData.visitorStatistics) && ValueObject.util_equals(this.visitorCounter, commonData.visitorCounter) && ValueObject.util_equals(this.avatarFrameConfiguration, commonData.avatarFrameConfiguration) && ValueObject.util_equals(this.liveRightCDN, commonData.liveRightCDN) && ValueObject.util_equals(this.adConfiguration, commonData.adConfiguration) && ValueObject.util_equals(this.adReward, commonData.adReward) && ValueObject.util_equals(this.pictureTags, commonData.pictureTags) && ValueObject.util_equals(this.userActivityInfo, commonData.userActivityInfo) && this.newGuide == commonData.newGuide && this.popUps == commonData.popUps && this.showDialog == commonData.showDialog && ValueObject.util_equals(this.type, commonData.type) && this.showEntrance == commonData.showEntrance && ValueObject.util_equals(this.mobile, commonData.mobile) && ValueObject.util_equals(this.email, commonData.email) && ValueObject.util_equals(this.thirdparty, commonData.thirdparty) && ValueObject.util_equals(this.token, commonData.token) && ValueObject.util_equals(this.thirdpartyEmail, commonData.thirdpartyEmail);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        List<User> list = this.users;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<Media> list2 = this.media;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<Device> list3 = this.devices;
        int iHashCode4 = (iHashCode3 + (list3 != null ? list3.hashCode() : 0)) * 41;
        Connector connector = this.connector;
        int iHashCode5 = (iHashCode4 + (connector != null ? connector.hashCode() : 0)) * 41;
        List<VerificationToken> list4 = this.verificationTokens;
        int iHashCode6 = (iHashCode5 + (list4 != null ? list4.hashCode() : 0)) * 41;
        List<Link> list5 = this.links;
        int iHashCode7 = (iHashCode6 + (list5 != null ? list5.hashCode() : 0)) * 41;
        Detect detect = this.detect;
        int iHashCode8 = (iHashCode7 + (detect != null ? detect.hashCode() : 0)) * 41;
        List<RecommendMessage> list6 = this.recommendMessage;
        int iHashCode9 = (iHashCode8 + (list6 != null ? list6.hashCode() : 0)) * 41;
        List<ReflectResponse> list7 = this.raySequences;
        int iHashCode10 = (iHashCode9 + (list7 != null ? list7.hashCode() : 0)) * 41;
        String str = this.stage;
        int iHashCode11 = (iHashCode10 + (str != null ? str.hashCode() : 0)) * 41;
        SliderData sliderData = this.captcha;
        int iHashCode12 = (iHashCode11 + (sliderData != null ? sliderData.hashCode() : 0)) * 41;
        VisitorInfo visitorInfo = this.visitorInfo;
        int iHashCode13 = (iHashCode12 + (visitorInfo != null ? visitorInfo.hashCode() : 0)) * 41;
        List<VisitorStatistics> list8 = this.visitorStatistics;
        int iHashCode14 = (iHashCode13 + (list8 != null ? list8.hashCode() : 0)) * 41;
        VisitorCounter visitorCounter = this.visitorCounter;
        int iHashCode15 = (iHashCode14 + (visitorCounter != null ? visitorCounter.hashCode() : 0)) * 41;
        List<AvatarFrameConfig> list9 = this.avatarFrameConfiguration;
        int iHashCode16 = (iHashCode15 + (list9 != null ? list9.hashCode() : 0)) * 41;
        LiveRightCDN liveRightCDN = this.liveRightCDN;
        int iHashCode17 = (iHashCode16 + (liveRightCDN != null ? liveRightCDN.hashCode() : 0)) * 41;
        AdConfiguration adConfiguration = this.adConfiguration;
        int iHashCode18 = (iHashCode17 + (adConfiguration != null ? adConfiguration.hashCode() : 0)) * 41;
        AdRewardResult adRewardResult = this.adReward;
        int iHashCode19 = (iHashCode18 + (adRewardResult != null ? adRewardResult.hashCode() : 0)) * 41;
        List<UserPictureTags> list10 = this.pictureTags;
        int iHashCode20 = (iHashCode19 + (list10 != null ? list10.hashCode() : 0)) * 41;
        UserActivityInfo userActivityInfo = this.userActivityInfo;
        int iHashCode21 = (((((((iHashCode20 + (userActivityInfo != null ? userActivityInfo.hashCode() : 0)) * 41) + (this.newGuide ? 1231 : 1237)) * 41) + (this.popUps ? 1231 : 1237)) * 41) + (this.showDialog ? 1231 : 1237)) * 41;
        String str2 = this.type;
        int iHashCode22 = (((iHashCode21 + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.showEntrance ? 1231 : 1237)) * 41;
        Mobile mobile = this.mobile;
        int iHashCode23 = (iHashCode22 + (mobile != null ? mobile.hashCode() : 0)) * 41;
        String str3 = this.email;
        int iHashCode24 = (iHashCode23 + (str3 != null ? str3.hashCode() : 0)) * 41;
        ThirdParty thirdParty = this.thirdparty;
        int iHashCode25 = (iHashCode24 + (thirdParty != null ? thirdParty.hashCode() : 0)) * 41;
        Token token = this.token;
        int iHashCode26 = (iHashCode25 + (token != null ? token.hashCode() : 0)) * 41;
        ThirdPartyEmail thirdPartyEmail = this.thirdpartyEmail;
        int iHashCode27 = iHashCode26 + (thirdPartyEmail != null ? thirdPartyEmail.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode27;
        return iHashCode27;
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.users == null) {
            this.users = new ArrayList();
        }
        if (this.devices == null) {
            this.devices = new ArrayList();
        }
        if (this.links == null) {
            this.links = new ArrayList();
        }
        if (this.detect == null) {
            this.detect = Detect.new_();
        }
        if (this.recommendMessage == null) {
            this.recommendMessage = new ArrayList();
        }
        if (this.raySequences == null) {
            this.raySequences = new ArrayList();
        }
        if (this.stage == null) {
            this.stage = "";
        }
        if (this.captcha == null) {
            this.captcha = SliderData.new_();
        }
        if (this.visitorInfo == null) {
            this.visitorInfo = VisitorInfo.new_();
        }
        if (this.visitorStatistics == null) {
            this.visitorStatistics = new ArrayList();
        }
        if (this.visitorCounter == null) {
            this.visitorCounter = VisitorCounter.new_();
        }
        if (this.avatarFrameConfiguration == null) {
            this.avatarFrameConfiguration = new ArrayList();
        }
        if (this.liveRightCDN == null) {
            this.liveRightCDN = LiveRightCDN.new_();
        }
        if (this.adConfiguration == null) {
            this.adConfiguration = AdConfiguration.new_();
        }
        if (this.adReward == null) {
            this.adReward = AdRewardResult.new_();
        }
        if (this.pictureTags == null) {
            this.pictureTags = new ArrayList();
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.mobile == null) {
            this.mobile = Mobile.new_();
        }
        if (this.email == null) {
            this.email = "";
        }
        if (this.thirdparty == null) {
            this.thirdparty = ThirdParty.new_();
        }
        if (this.token == null) {
            this.token = Token.new_();
        }
        if (this.thirdpartyEmail == null) {
            this.thirdpartyEmail = ThirdPartyEmail.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
